package com.tencent.could.huiyansdk.fragments;

import com.tencent.could.huiyansdk.C14032R;
import com.tencent.could.huiyansdk.callback.InterfaceC14047c;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.fragments.c */
/* JADX INFO: loaded from: classes12.dex */
public class C14056c implements InterfaceC14047c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AuthingFragment f58243a;

    public C14056c(AuthingFragment authingFragment) {
        this.f58243a = authingFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m83474b(int i) {
        this.f58243a.f58219e.setText(i + this.f58243a.getResString(C14032R.string.txy_count_down_txt));
    }

    /* JADX INFO: renamed from: a */
    public void m83475a(final int i) {
        this.f58243a.runOnUiThread(new Runnable() { // from class: l.yvq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f201751a.m83474b(i);
            }
        });
    }
}
