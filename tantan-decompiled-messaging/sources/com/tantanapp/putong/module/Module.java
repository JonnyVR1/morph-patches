package com.tantanapp.putong.module;

import android.content.Context;
import com.tantanapp.android.injecter.facade.template.IProvider;
import p133rx.C22306c;
import p149l.roj0;

/* JADX INFO: loaded from: classes13.dex */
public interface Module extends IProvider {
    /* JADX INFO: renamed from: Ai */
    default void mo29911Ai() {
    }

    /* JADX INFO: renamed from: Ec */
    default void mo28134Ec() {
    }

    /* JADX INFO: renamed from: Jh */
    C22306c<roj0> mo28135Jh();

    /* JADX INFO: renamed from: Ma */
    default void mo28136Ma() {
    }

    /* JADX INFO: renamed from: Qh */
    void mo28137Qh();

    /* JADX INFO: renamed from: Wn */
    default void mo29912Wn() {
    }

    /* JADX INFO: renamed from: ft */
    C22306c<roj0> mo28138ft();

    Context getContext();

    /* JADX INFO: renamed from: ms */
    void mo28139ms();

    default void onLowMemory() {
    }

    default void onTrimMemory(int i) {
    }

    /* JADX INFO: renamed from: tr */
    void mo28140tr(boolean z);

    /* JADX INFO: renamed from: zf */
    default void mo29940zf() {
    }
}
