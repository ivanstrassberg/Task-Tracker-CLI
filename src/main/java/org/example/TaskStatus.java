package org.example;

public enum TaskStatus {
        todo, done, in_progress;
        @Override
        public String toString(){
            return name().toLowerCase();
        }
    };
