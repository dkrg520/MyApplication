package com.zdjy.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "User")
public class User {
    @DatabaseField(generatedId = true)
    private String id;
    @DatabaseField(columnName = "userName")
    private String userName;
    @DatabaseField(columnName = "password")
    private String password;
    @DatabaseField(columnName = "nickname")
    private String nickname;
    @DatabaseField(columnName = "sex")
    private String sex;
    @DatabaseField(columnName = "summary")
    private String summary;
    /*个人详细信息*/
    @DatabaseField(columnName = "gold")
    private String gold;
    @DatabaseField(columnName = "level")
    private String level;

}
