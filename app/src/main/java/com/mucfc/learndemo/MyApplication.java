package com.mucfc.learndemo;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import neu.greendao.DaoMaster;
import neu.greendao.DaoSession;

/**
 * Created by neuyuandaima on 2015/11/20.
 */
public class MyApplication extends Application{
    private static SQLiteDatabase db;
    private DaoMaster daoMaster;
    private DaoSession daoSession;
    private static MyApplication application;
    @Override
    public void onCreate() {
        super.onCreate();
        DaoMaster.DevOpenHelper helper=new DaoMaster.DevOpenHelper(this,"notes-db",null);
        db=helper.getWritableDatabase();
        daoMaster=new DaoMaster(db);
        daoSession=daoMaster.newSession();
        application=this;
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
    public static MyApplication getInstance(){
        return application;
    }
    public SQLiteDatabase getSQLiteDatebase(){
        return db;
    }
}
