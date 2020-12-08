package io.github.sola97.sesearch.generator;

import org.jooq.codegen.DefaultGeneratorStrategy;
import org.jooq.meta.Definition;

public class JPrefixGeneratorStrategy extends DefaultGeneratorStrategy {
    @Override
    public String getJavaClassName(final Definition definition, final Mode mode) {
        if (mode != Mode.DAO && mode != Mode.RECORD)
            if (mode == Mode.POJO) {
                return super.getJavaClassName(definition, mode) + "PO";
            } else {
                return super.getJavaClassName(definition, mode) + "T";
            }
        else {
            return super.getJavaClassName(definition, mode);
        }
    }
}