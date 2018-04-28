
package com.educationit.java.standard.integrator.service;
import  java.sql.*;

@DataSourceDefinition(name = "java:app/env/Servlet_DataSource",
        minPoolSize = 0,
        initialPoolSize = 0,
        className = "org.apache.derby.jdbc.ClientXADataSource",
        user = "sitios_rootedu",
        password = "7891235",
        databaseName = "sitios_educacionit",
        properties = {"connectionAttributes=;create=true"}
)

public class Svr {

    public  Svr{


    }
}
