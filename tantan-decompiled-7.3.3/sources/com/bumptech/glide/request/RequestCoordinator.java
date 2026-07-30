package com.bumptech.glide.request;

import p153l.y1d0;

/* JADX INFO: loaded from: classes.dex */
public interface RequestCoordinator {

    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean isComplete;

        RequestState(boolean z) {
            this.isComplete = z;
        }

        public boolean isComplete() {
            return this.isComplete;
        }
    }

    /* JADX INFO: renamed from: b */
    boolean mo5668b();

    /* JADX INFO: renamed from: c */
    boolean mo5669c(y1d0 y1d0Var);

    /* JADX INFO: renamed from: d */
    void mo5670d(y1d0 y1d0Var);

    /* JADX INFO: renamed from: f */
    void mo5671f(y1d0 y1d0Var);

    RequestCoordinator getRoot();

    /* JADX INFO: renamed from: h */
    boolean mo5672h(y1d0 y1d0Var);

    /* JADX INFO: renamed from: i */
    boolean mo5673i(y1d0 y1d0Var);
}
