package p153l;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class h7r0 implements z7r0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FrameLayout f108150a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LayoutInflater f108151b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewGroup f108152c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Bundle f108153d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ xtd f108154e;

    public h7r0(xtd xtdVar, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f108154e = xtdVar;
        this.f108150a = frameLayout;
        this.f108151b = layoutInflater;
        this.f108152c = viewGroup;
        this.f108153d = bundle;
    }

    @Override // p153l.z7r0
    /* JADX INFO: renamed from: a */
    public final void mo108324a(her herVar) {
        this.f108150a.removeAllViews();
        this.f108150a.addView(this.f108154e.f196199a.mo15053b(this.f108151b, this.f108152c, this.f108153d));
    }

    @Override // p153l.z7r0
    public final int zaa() {
        return 2;
    }
}
