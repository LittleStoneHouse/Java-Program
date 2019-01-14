package com.servlet.mapper;

import com.servlet.pojo.Rune;

import java.util.List;

public interface RuneMapper {

    List<Rune> getRunes();

    void insertRune(Rune rune);
}