package com.tantanapp.putong.module;

import android.content.Context;
import com.tantanapp.android.injecter.facade.template.IProvider;
import p137rx.C22421c;
import p153l.uxj0;

/* JADX INFO: loaded from: classes12.dex */
public interface Module extends IProvider {
    /* JADX INFO: renamed from: Ai */
    default void mo30909Ai() {
    }

    /* JADX INFO: renamed from: Ec */
    default void mo29133Ec() {
    }

    /* JADX INFO: renamed from: Jh */
    C22421c<uxj0> mo29134Jh();

    /* JADX INFO: renamed from: Ma */
    default void mo29135Ma() {
    }

    /* JADX INFO: renamed from: Qh */
    void mo29136Qh();

    /* JADX INFO: renamed from: Wn */
    default void mo30910Wn() {
    }

    /* JADX INFO: renamed from: ft */
    C22421c<uxj0> mo29137ft();

    Context getContext();

    /* JADX INFO: renamed from: ms */
    void mo29138ms();

    default void onLowMemory() {
    }

    default void onTrimMemory(int i) {
    }

    /* JADX INFO: renamed from: tr */
    void mo29139tr(boolean z);

    /* JADX INFO: renamed from: zf */
    default void mo30938zf() {
    }
}
