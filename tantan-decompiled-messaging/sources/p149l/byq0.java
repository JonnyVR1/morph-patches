package p149l;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class byq0 implements tyq0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FrameLayout f77957a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LayoutInflater f77958b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewGroup f77959c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Bundle f77960d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ jsd f77961e;

    public byq0(jsd jsdVar, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f77961e = jsdVar;
        this.f77957a = frameLayout;
        this.f77958b = layoutInflater;
        this.f77959c = viewGroup;
        this.f77960d = bundle;
    }

    @Override // p149l.tyq0
    /* JADX INFO: renamed from: a */
    public final void mo104507a(gcr gcrVar) {
        this.f77957a.removeAllViews();
        this.f77957a.addView(this.f77961e.f119488a.mo14999b(this.f77958b, this.f77959c, this.f77960d));
    }

    @Override // p149l.tyq0
    public final int zaa() {
        return 2;
    }
}
