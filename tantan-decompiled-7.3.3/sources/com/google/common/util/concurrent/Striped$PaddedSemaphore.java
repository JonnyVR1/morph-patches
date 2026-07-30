package com.google.common.util.concurrent;

import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes7.dex */
class Striped$PaddedSemaphore extends Semaphore {
    long unused1;
    long unused2;
    long unused3;

    public Striped$PaddedSemaphore(int i) {
        super(i, false);
    }
}
