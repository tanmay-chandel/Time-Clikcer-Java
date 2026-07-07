package com.timeclickers.model;

public class Player {

    private int points = 0;
    private int clickPower = 1;
    private int passiveIncome = 0;

    private int upgradeCost = 10;
    private int passiveCost = 25;

    // Quiz system
    private int quizReward = 100;
    private int correctAnswers = 0;

    // Main click
    public void click() {
        points += clickPower;
    }

    // Passive income
    public void addPassiveIncome() {
        points += passiveIncome;
    }

    // Quiz reward
    public void rewardQuiz(int reward) {
        points += reward;
        correctAnswers++;
    }

    // Getters
    public int getPoints() {
        return points;
    }

    public int getClickPower() {
        return clickPower;
    }

    public int getPassiveIncome() {
        return passiveIncome;
    }

    public int getUpgradeCost() {
        return upgradeCost;
    }

    public int getPassiveCost() {
        return passiveCost;
    }

    public int getQuizReward() {
        return quizReward;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    // Spend points
    public void spendPoints(int amount) {
        points -= amount;
    }

    // Upgrade click power
    public void upgradeClickPower() {
        clickPower++;
        upgradeCost = (int) (upgradeCost * (1.4 + Math.random() * 0.2));
    }

    // Upgrade passive income
    public void upgradePassiveIncome() {
        passiveIncome++;
        passiveCost = (int) (passiveCost * 1.5);
    }
}