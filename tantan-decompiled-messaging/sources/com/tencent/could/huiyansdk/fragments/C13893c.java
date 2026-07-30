package com.tencent.could.huiyansdk.fragments;

import com.tencent.could.huiyansdk.C13869R;
import com.tencent.could.huiyansdk.callback.InterfaceC13884c;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.fragments.c */
/* JADX INFO: loaded from: classes2.dex */
public class C13893c implements InterfaceC13884c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AuthingFragment f57395a;

    public C13893c(AuthingFragment authingFragment) {
        this.f57395a = authingFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m82291b(int i) {
        this.f57395a.f57371e.setText(i + this.f57395a.getResString(C13869R.string.txy_count_down_txt));
    }

    /* JADX INFO: renamed from: a */
    public void m82292a(final int i) {
        this.f57395a.runOnUiThread(new Runnable() { // from class: l.smq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f165368a.m82291b(i);
            }
        });
    }
}
