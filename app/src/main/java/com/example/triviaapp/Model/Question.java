package com.example.triviaapp.Model;

public class Question {

    String answer;
    boolean answertrue;

    public Question(String answer, boolean answertrue) {
        this.answer = answer;
        this.answertrue = answertrue;
    }

    public Question() {
    }


    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isAnswertrue() {
        return answertrue;
    }

    public void setAnswertrue(boolean answertrue) {
        this.answertrue = answertrue;
    }


    @Override
    public String toString() {
        return "Question{" +
                "answer='" + answer + '\'' +
                ", answertrue=" + answertrue +
                '}';
    }
}
