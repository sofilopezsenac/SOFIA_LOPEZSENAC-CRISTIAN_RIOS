package com.backend.integrador.dao;

import java.util.List;

 public interface IDao <T> {
     public T registrar(T t);
     public List<T> listarTodos();
}

