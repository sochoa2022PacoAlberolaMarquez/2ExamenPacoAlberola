package com.example.examenandroid

import android.app.Application
import android.content.Context

object Repository {
    private lateinit var modelTareas: ModelTempTareas
    //el context suele ser necesario para recuperar datos
    private lateinit var application: Application
    //inicio del objeto singleton
    operator fun invoke(context: Context){
        this.application= context.applicationContext as Application
        //iniciamos el modelo
        ModelTempTareas(application)
        modelTareas=ModelTempTareas
    }

    fun addTarea(tarea: Tarea)= modelTareas.addTarea(tarea)
    suspend fun delTarea(tarea: Tarea)= modelTareas.delTarea(tarea)
    fun getAllTareas()=modelTareas.getAllTareas()
    fun getTareasFiltroSinPagar (soloSinPagar:Boolean) = modelTareas.getTareasFavoritas(soloSinPagar)
    }