package com.models;

import java.util.ArrayList;

public class DataDao {
    public static ArrayList<DataModel> addData(ArrayList<DataModel> s)
    {
        DataModel say=new DataModel();

        say.setId(1);
        say.setName("aaaa");
        say.setAverage(65.35);
        s.add(say);
        DataModel say2=new DataModel();
        say2.setId(2);
        say2.setName("bbbb");
        say2.setAverage(55.369);
        s.add(say2);
        DataModel say3=new DataModel();
        say3.setId(3);
        say3.setName("cccc");
        say3.setAverage(56.3287);
        s.add(say3);
        return s;
    }

    public static ArrayList<DataModel> postData(DataModel say4,ArrayList<DataModel> s)
    {

        s.add(say4);
        return s;

    }
    public static ArrayList<DataModel> putData(DataModel say5,ArrayList<DataModel> s)
    {
        int flag=0;
        for(DataModel sa:s)
        {
            if(say5.getId()==sa.getId())
            {
                sa.setName(say5.getName());
                sa.setAverage(say5.getAverage());
                flag=1;

            }
        }
        if(flag==0)
            s.add(say5);
        return s;
    }
    public static ArrayList<DataModel> deleteData(int id,ArrayList<DataModel> s)
    {
        int flag=0;
        int len=s.size();
        for(int i=0;i<len;i++)
        {
            if(id==s.get(i).getId())
            {
                s.remove(i);
                flag=1;
                break;
            }
        }

        return s;
    }

    public static ArrayList<DataModel> patchData(DataModel say5,ArrayList<DataModel> s)
    {
        int flag=0;
        for(DataModel sa:s)
        {
            if(say5.getId()==sa.getId())
            {
                flag=1;

                if(say5.getName()!=null)
                    sa.setName(say5.getName());
                if(say5.getAverage()!=null)
                    sa.setAverage(say5.getAverage());


            }
        }
        if(flag==0)
            s.add(say5);
        return s;
    }
}
