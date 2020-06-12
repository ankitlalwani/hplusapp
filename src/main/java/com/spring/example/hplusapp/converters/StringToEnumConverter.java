package com.spring.example.hplusapp.converters;

import com.spring.example.hplusapp.beans.Gender;
import org.springframework.core.convert.converter.Converter;

public class StringToEnumConverter implements Converter<String, Gender> {

    @Override
    public Gender convert(String s){
        if(s.equals("Male")){
            return Gender.male;
        }else if (s.equals("Female")){
            return Gender.female;
        }else {
            return Gender.other;
        }
    }
}
