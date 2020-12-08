package io.github.sola97.sesearch.action;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseAction {
    @Autowired
    DSLContext dsl;
}
