package com.demo;

import com.models.DataDao;
import com.models.DataModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController

@RequestMapping("/test")

@Api(value="SpringBootWithSwaggerPOC", description="crud operations demo")
public class Controller {
    @RequestMapping(value="/hello", method= RequestMethod.GET)

    @ApiOperation(value = "View a list of available products",response = DataModel.class)

    @ApiResponses(value = {

            @ApiResponse(code = 200, message = "Successfully retrieved list"),

            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),

            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),

            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")

    }

    )
    public ArrayList<DataModel> sayHello() {
        //final String value = String.format(template, name.orElse(defaultName));
        DataModel say=new DataModel();

        ArrayList<DataModel> s=new ArrayList<DataModel>();
//        d.setId1("104");
//        d.setN1("ila");
        s= DataDao.addData(s);
        return s;

        // return new DataModel(counter.incrementAndGet()*2, value);
    }

    @RequestMapping(value="/hello", method= RequestMethod.PUT)
    public ArrayList<DataModel> addData(@RequestBody DataModel say4) {

        ArrayList<DataModel> s=new ArrayList<>();
        s=DataDao.addData(s);
        s=DataDao.postData(say4,s);
//        String edited = StudentsDao.edit(student);
//        response.setMessage(edited);
        return s;
    }

    @RequestMapping(value="/hello", method= RequestMethod.POST)
    public ArrayList<DataModel> addDataPut(@RequestBody DataModel say5) {

        ArrayList<DataModel> s=new ArrayList<DataModel>();
        s=DataDao.addData(s);
        s=DataDao.putData(say5,s);

//        String edited = StudentsDao.edit(student);
//        response.setMessage(edited);
        return s;
    }

    @RequestMapping(value="/hello/{id}", method= RequestMethod.DELETE)
    public ArrayList<DataModel> deleteRow(@PathVariable("id") Integer id) {
        ArrayList<DataModel> s=new ArrayList<DataModel>();
        s=DataDao.addData(s);
        s=DataDao.deleteData(id,s);

        return s;
    }

    @RequestMapping(value="/hello", method= RequestMethod.PATCH)
    public ArrayList<DataModel> addDataPatch(@RequestBody DataModel say5) {
        ArrayList<DataModel> s=new ArrayList<DataModel>();
        s=DataDao.addData(s);
        s=DataDao.patchData(say5,s);




//        String edited = StudentsDao.edit(student);
//        response.setMessage(edited);
        return s;
    }




}