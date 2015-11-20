package com.example;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class NeuDaoGenerator {
    public static void main(String[] args) throws Exception {
        Schema schema = new Schema(2, "neu.greendao");
        addNote(schema);
        new DaoGenerator().generateAll(schema, "D:\\workpalce\\MyApplication\\app\\src\\main\\java-greendao");
    }

    /**
     * @param schema
     */
    private static void addNote(Schema schema) {
        Entity note = schema.addEntity("Note");
        note.addIdProperty();
        note.addStringProperty("text").notNull();
        note.addStringProperty("comment");
        note.addDateProperty("date");
    }
}
