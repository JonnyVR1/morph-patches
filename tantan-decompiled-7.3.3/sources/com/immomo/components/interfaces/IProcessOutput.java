package com.immomo.components.interfaces;

import p153l.ftl;

/* JADX INFO: loaded from: classes7.dex */
public interface IProcessOutput {

    public enum ProcessType {
        PROCESS_PREVIEW_TYPE(1),
        PROCESS_IMAGE_TYPE(2),
        PROCESS_VIDEO_TYPE(3);

        private final int processType;

        ProcessType(int i) {
            this.processType = i;
        }

        public int getProcessType() {
            return this.processType;
        }
    }

    /* JADX INFO: renamed from: a */
    int m19367a();

    /* JADX INFO: renamed from: b */
    ftl m19368b(int i);

    /* JADX INFO: renamed from: c */
    long m19369c();

    int getHeight();

    int getWidth();
}
