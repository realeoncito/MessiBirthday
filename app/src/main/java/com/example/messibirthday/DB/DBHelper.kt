package com.example.messibirthday.DB

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context): SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    //Se creara una tabla para los datos generales, una para los premios y otra para los goles.
    private val db = this.writableDatabase

    companion object{

        //Nombre de la base de datos
        private const val DATABASE_NAME = "MessiBirthday.db"
        private const val DATABASE_VERSION = 1

        //Nombre de las tablas
        private const val TABLE_INFO_GENERAL = "InfoGeneral"
        private const val TABLE_PREMIOS = "Premios"
        private const val TABLE_GOLES = "Goles"


        //Campos comunes
        const val COLUMNA_ID = "id"

        //Campos de la tabla InfoGeneral
        const val COLUMNA_NOMBRECOMPLETO= "nombreCompleto"
        const val COLUMNA_CLUB = "clubActual"
        const val COLUMNA_FECHANACIMIENTO = "fechaNacimiento"
        const val COLUMNA_PAIS = "paisOrigen"
        const val COLUMNA_PREMIOS = "cantidadPremios"
        const val COLUMNA_GOLES = "cantidadGoles"


        //Campos de la tabla Premios
        const val COLUMNA_DESCRIPCIONPREMIOS = "descripcionPremio"
        const val COLUMNA_CANTIDADPREMIOS = "cantidadPremios"
        const val COLUMNA_CATEGORIAPREMIOS = "categoriaPremio"

        //Campos de la tabla Goles
        const val COLUMNA_EQUIPO = "equipo"
        const val COLUMNA_CANTIDADGOLES = "cantidadGoles"


        //Query para crear la tabla InfoGeneral
        private const val CREATE_TABLE_INFO_GENERAL = (
                "CREATE TABLE $TABLE_INFO_GENERAL ($COLUMNA_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        "$COLUMNA_NOMBRECOMPLETO TEXT, " +
                        "$COLUMNA_CLUB VARCHAR(20), " +
                        "$COLUMNA_FECHANACIMIENTO DATE, " +
                        "$COLUMNA_PAIS TEXT, " +
                        "$COLUMNA_PREMIOS INTEGER," +
                        "$COLUMNA_GOLES INTEGER )"
                )
        //Query para crear la tabla Premios
        private const val CREATE_TABLE_PREMIOS = (
                    "CREATE TABLE $TABLE_PREMIOS ($COLUMNA_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                            "$COLUMNA_DESCRIPCIONPREMIOS TEXT, " +
                            "$COLUMNA_CANTIDADPREMIOS INTEGER, " +
                            "$COLUMNA_CATEGORIAPREMIOS TEXT)"
                )

        //Query para crear la tabla Goles
        private const val CREATE_TABLE_GOLES = (
                    "CREATE TABLE $TABLE_GOLES ($COLUMNA_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                            "$COLUMNA_EQUIPO TEXT, " +
                            "$COLUMNA_CANTIDADGOLES INTEGER)"
                )
    }




    override fun onCreate(db: SQLiteDatabase?){
        //Creacion de las tablas
        db?.execSQL(CREATE_TABLE_INFO_GENERAL)
        db?.execSQL(CREATE_TABLE_PREMIOS)
        db?.execSQL(CREATE_TABLE_GOLES)

        //Insercion de la data
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        //Borrar las tablas antiguas
        db?.execSQL("DROP TABLE IF EXISTS $TABLE_INFO_GENERAL")
        db?.execSQL("DROP TABLE IF EXISTS $TABLE_PREMIOS")
        db?.execSQL("DROP TABLE IF EXISTS $TABLE_GOLES")

        //Crear las tablas nuevas
        onCreate(db)
    }

    public fun insertInfoGeneral(){
        //Insertar datos generales
        //Solo se hara un registro de la info general
        val values = ContentValues().apply {
            put(COLUMNA_NOMBRECOMPLETO, "Lionel Andres Messi Cuccitini")
            put(COLUMNA_CLUB, "Inter de Miami")
            put(COLUMNA_FECHANACIMIENTO, "1987-06-24")
            put(COLUMNA_PAIS, "Argentina")
            put(COLUMNA_PREMIOS, 57)
            put(COLUMNA_GOLES, 836)
        }

        db.insert(TABLE_INFO_GENERAL, null, values)

    }

    public fun insertPremios(){
        //Insertar datos de los premios
        //Arreglo para los premios

        val premios = listOf(
            ContentValues().apply {
                put(COLUMNA_DESCRIPCIONPREMIOS, "Copa del Rey")
                put(COLUMNA_CANTIDADPREMIOS, 1)
                put(COLUMNA_CATEGORIAPREMIOS, "Individual")
            },
            ContentValues().apply {
                put(COLUMNA_DESCRIPCIONPREMIOS, "Copa del Rey")
                put(COLUMNA_CANTIDADPREMIOS, 1)
                put(COLUMNA_CATEGORIAPREMIOS, "Colectivo")
            },
            ContentValues().apply {
                put(COLUMNA_DESCRIPCIONPREMIOS, "Copa del Rey")
                put(COLUMNA_CANTIDADPREMIOS, 1)
                put(COLUMNA_CATEGORIAPREMIOS, "Copa")
            },
            ContentValues().apply {
                put(COLUMNA_DESCRIPCIONPREMIOS, "Copa del Rey")
                put(COLUMNA_CANTIDADPREMIOS, 1)
                put(COLUMNA_CATEGORIAPREMIOS, "Copa")
            },
            ContentValues().apply {
                put(COLUMNA_DESCRIPCIONPREMIOS, "Copa del Rey")
                put(COLUMNA_CANTIDADPREMIOS, 1)
                put(COLUMNA_CATEGORIAPREMIOS, "Copa")
            },
            ContentValues().apply {
                put(COLUMNA_DESCRIPCIONPREMIOS, "Copa del Rey")
                put(COLUMNA_CANTIDADPREMIOS, 1)
                put(COLUMNA_CATEGORIAPREMIOS, "Copa")
            },
            ContentValues().apply {
                put(COLUMNA_DESCRIPCIONPREMIOS, "Copa del Rey")
                put(COLUMNA_CANTIDADPREMIOS, 1)
                put(COLUMNA_CATEGORIAPREMIOS, "Copa")
            },
            ContentValues().apply {
                put(COLUMNA_DESCRIPCIONPREMIOS, "Copa del Rey")
                put(COLUMNA_CANTIDADPREMIOS, 1)
                put(COLUMNA_CATEGORIAPREMIOS, "Copa")
            },
            ContentValues().apply {
                put(COLUMNA_DESCRIPCIONPREMIOS, "Copa del Rey")
                put(COLUMNA_CANTIDADPREMIOS, 1)
                put(COLUMNA_CATEGORIAPREMIOS, "Copa")
            },
            ContentValues().apply {
                put(COLUMNA_DESCRIPCIONPREMIOS, "Copa del Rey")
                put(COLUMNA_CANTIDADPREMIOS, 1)
                put(COLUMNA_CATEGORIAPREMIOS, "Copa")
            },
            ContentValues().apply {
                put(COLUMNA_DESCRIPCIONPREMIOS, "Copa del Rey")
                put(COLUMNA_CANTIDADPREMIOS, 1)
                put(COLUMNA_CATEGORIAPREMIOS, "Copa")
            },
            ContentValues().apply {
                put(COLUMNA_DESCRIPCIONPREMIOS, "Copa del Rey")
                put(COLUMNA_CANTIDADPREMIOS, 1)
                put(COLUMNA_CATEGORIAPREMIOS, "Copa")
            },
            ContentValues().apply {
                put(COLUMNA_DESCRIPCIONPREMIOS, "Copa del Rey")
                put(COLUMNA_CANTIDADPREMIOS, 1)
                put(COLUMNA_CATEGORIAPREMIOS, "Copa")
            },
            ContentValues().apply {
                put(COLUMNA_DESCRIPCIONPREMIOS, "Copa del Rey")
                put(COLUMNA_CANTIDADPREMIOS, 1)
                put(COLUMNA_CATEGORIAPREMIOS, "Copa")
            },
            ContentValues().apply {
                put(COLUMNA_DESCRIPCIONPREMIOS, "Copa del Rey")
                put(COLUMNA_CANTIDADPREMIOS, 1)
                put(COLUMNA_CATEGORIAPREMIOS, "Copa")
            },
            ContentValues().apply {
                put(COLUMNA_DESCRIPCIONPREMIOS, "Copa del Rey")
                put(COLUMNA_CANTIDADPREMIOS, 1)
                put(COLUMNA_CATEGORIAPREMIOS, "Copa")
            },
            ContentValues().apply {
                put(COLUMNA_DESCRIPCIONPREMIOS, "Copa del Rey")
                put(COLUMNA_CANTIDADPREMIOS, 1)
                put(COLUMNA_CATEGORIAPREMIOS, "Copa")
            },
            ContentValues().apply {
                put(COLUMNA_DESCRIPCIONPREMIOS, "Copa del Rey")
                put(COLUMNA_CANTIDADPREMIOS, 1)
                put(COLUMNA_CATEGORIAPREMIOS, "Copa")
            },
            ContentValues().apply {
                put(COLUMNA_DESCRIPCIONPREMIOS, "Copa del Rey")
                put(COLUMNA_CANTIDADPREMIOS, 1)
                put(COLUMNA_CATEGORIAPREMIOS, "Copa")
            },
            ContentValues().apply {
                put(COLUMNA_DESCRIPCIONPREMIOS, "Copa del Rey")
                put(COLUMNA_CANTIDADPREMIOS, 1)
                put(COLUMNA_CATEGORIAPREMIOS, "Copa")
            },
            ContentValues().apply {
                put(COLUMNA_DESCRIPCIONPREMIOS, "Copa del Rey")
                put(COLUMNA_CANTIDADPREMIOS, 1)
                put(COLUMNA_CATEGORIAPREMIOS, "Copa")
            },
            ContentValues().apply {
                put(COLUMNA_DESCRIPCIONPREMIOS, "Copa del Rey")
                put(COLUMNA_CANTIDADPREMIOS, 1)
                put(COLUMNA_CATEGORIAPREMIOS, "Copa")
            },

        )

        //Recorrer el arreglo y insertar los datos
        for (premio in premios) {
            db.insert(TABLE_PREMIOS, null, premio)
        }

    }

    public fun insertGoles(){
        //Insertar datos de los goles
        //Arreglo para los goles
        val goles = listOf(
            ContentValues().apply {
                put(COLUMNA_EQUIPO, "Boca")
                put(COLUMNA_CANTIDADGOLES, 1)
            },
            ContentValues().apply {
                put(COLUMNA_EQUIPO, "Boca")
                put(COLUMNA_CANTIDADGOLES, 1)
            },
            ContentValues().apply {
                put(COLUMNA_EQUIPO, "Boca")
                put(COLUMNA_CANTIDADGOLES, 1)
            },
            ContentValues().apply {
                put(COLUMNA_EQUIPO, "Boca")
                put(COLUMNA_CANTIDADGOLES, 1)
            },
            ContentValues().apply {
                put(COLUMNA_EQUIPO, "Boca")
                put(COLUMNA_CANTIDADGOLES, 1)
            },
            ContentValues().apply {
                put(COLUMNA_EQUIPO, "Boca")
                put(COLUMNA_CANTIDADGOLES, 1)
            },
            ContentValues().apply {
                put(COLUMNA_EQUIPO, "Boca")
                put(COLUMNA_CANTIDADGOLES, 1)
            },
            ContentValues().apply {
                put(COLUMNA_EQUIPO, "Boca")
                put(COLUMNA_CANTIDADGOLES, 1)
            },
            ContentValues().apply {
                put(COLUMNA_EQUIPO, "Boca")
                put(COLUMNA_CANTIDADGOLES, 1)
            },
            ContentValues().apply {
                put(COLUMNA_EQUIPO, "Boca")
                put(COLUMNA_CANTIDADGOLES, 1)
            },
            ContentValues().apply {
                put(COLUMNA_EQUIPO, "Boca")
                put(COLUMNA_CANTIDADGOLES, 1)
            },
            ContentValues().apply {
                put(COLUMNA_EQUIPO, "Boca")
                put(COLUMNA_CANTIDADGOLES, 1)
            },
            ContentValues().apply {
                put(COLUMNA_EQUIPO, "Boca")
                put(COLUMNA_CANTIDADGOLES, 1)
            },
            ContentValues().apply {
                put(COLUMNA_EQUIPO, "Boca")
                put(COLUMNA_CANTIDADGOLES, 1)
            },

        )

        //Recorrer el arreglo y insertar los datos
        for (gol in goles) {
            db.insert(TABLE_GOLES, null, gol)
        }

    }

}