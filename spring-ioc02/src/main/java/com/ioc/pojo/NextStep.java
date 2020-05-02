package com.ioc.pojo;

public class NextStep {
    private String word;

    @Override
    public String toString() {
        return "NextStep{" +
                "word='" + word + '\'' +
                '}';
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
