package com.bootcamp.events.jdbc;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import javax.sql.DataSource;


/**
 * Created by nidhi on 28/3/17.
 */
public class PersonDaoImpl implements PersonDao {

  private DataSource dataSource;

  private SimpleJdbcInsert jdbcTemplate;
  // private NamedParameterJdbcTemplate jdbcTemplate;

  public void setDataSource(DataSource dataSource) {
    this.dataSource = dataSource;
    jdbcTemplate = new SimpleJdbcInsert(dataSource).withTableName("Persons");
    //jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
  }


  @Override
  public void insert(Person p) {
   /* String sql = "INSERT INTO Persons " +
        "(Pid, Name, Surname) VALUES (:pid, :firstName, :surName)";

    Map source=new HashMap();
    source.put("pid",p.getPid());
    source.put("firstName",p.getFirstName());
    source.put("surName",p.getSurName());

    MapSqlParameterSource source=new MapSqlParameterSource();
    source.addValue("pid",p.getPid())
        .addValue("firstName",p.getFirstName())
        .addValue("surName",p.getSurName());
        */
   
    jdbcTemplate.execute(new BeanPropertySqlParameterSource(p));
    //jdbcTemplate.update(sql,new BeanPropertySqlParameterSource(p));
    //jdbcTemplate.queryForList("select * from Persons");


  }

  @Override
  public Person getAllPersons() {
    return null;
  }
}
