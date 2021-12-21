package com.techbank.cqrs.core.commands;

//It's very important to make this a functional interface, so that it has only one function,
//        so it's job is to do only one job
@FunctionalInterface
public interface CommandHandlerMethod<T extends BaseCommand> {
    void handle(T command);
}
