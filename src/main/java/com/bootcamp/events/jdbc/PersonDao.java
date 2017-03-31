package com.bootcamp.events.jdbc;

/**
 * Created by nidhi on 28/3/17.
 */
public interface PersonDao {

  void insert(Person p);
  Person getAllPersons();

}
