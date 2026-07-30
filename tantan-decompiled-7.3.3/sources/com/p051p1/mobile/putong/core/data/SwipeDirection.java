package com.p051p1.mobile.putong.core.data;

/* JADX INFO: loaded from: classes10.dex */
public enum SwipeDirection {
    RIGHT(1),
    UP(2),
    LEFT(-1),
    REMOVE(3);

    private int value;

    SwipeDirection(int i) {
        this.value = i;
    }

    public static SwipeDirection fromValue(int i) {
        if (i == -1) {
            return LEFT;
        }
        if (i == 1) {
            return RIGHT;
        }
        if (i != 2) {
            return null;
        }
        return UP;
    }

    public int getValue() {
        return this.value;
    }
}
