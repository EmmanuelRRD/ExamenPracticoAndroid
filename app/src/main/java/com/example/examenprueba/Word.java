package com.example.examenprueba;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")//Representacion de una tabla
public class Word {

    @PrimaryKey//Claves primarias
    @NonNull//nunca nulo
    @ColumnInfo(name = "word")//nombre de la columna
    private String mWord;

    /* ---Para autogenerar claves----
    @PrimaryKey(autoGenerate = true)
    private int id;
     */
    public Word(@NonNull String word) {this.mWord = word;}

    public String getWord(){return this.mWord;}

    @NonNull
    public String getmWord() {
        return mWord;
    }

    public void setmWord(@NonNull String mWord) {
        this.mWord = mWord;
    }
}