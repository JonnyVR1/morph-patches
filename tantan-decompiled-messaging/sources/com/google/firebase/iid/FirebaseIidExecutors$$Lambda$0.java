package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
final /* synthetic */ class FirebaseIidExecutors$$Lambda$0 implements Executor {
    static final Executor $instance = new FirebaseIidExecutors$$Lambda$0();

    private FirebaseIidExecutors$$Lambda$0() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
