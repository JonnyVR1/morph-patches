package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
final /* synthetic */ class FirebaseInstanceId$$Lambda$5 implements Executor {
    static final Executor $instance = new FirebaseInstanceId$$Lambda$5();

    private FirebaseInstanceId$$Lambda$5() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
