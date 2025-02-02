package org.example.spring_boot_jr.mapper;

public interface MapperHelper<S, D> {

    S toDto(D d);

    D toDao(S s);

}
