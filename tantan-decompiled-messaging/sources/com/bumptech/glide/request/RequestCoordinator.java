package com.bumptech.glide.request;

import p149l.ttc0;

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

    /* JADX INFO: renamed from: a */
    boolean mo5615a();

    /* JADX INFO: renamed from: b */
    boolean mo5616b(ttc0 ttc0Var);

    /* JADX INFO: renamed from: c */
    void mo5617c(ttc0 ttc0Var);

    /* JADX INFO: renamed from: d */
    void mo5618d(ttc0 ttc0Var);

    /* JADX INFO: renamed from: f */
    boolean mo5619f(ttc0 ttc0Var);

    RequestCoordinator getRoot();

    /* JADX INFO: renamed from: h */
    boolean mo5620h(ttc0 ttc0Var);
}
