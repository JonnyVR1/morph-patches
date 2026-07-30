package p149l;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopWebViewFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.views.MKWebViewManager;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes4.dex */
public class ana0 implements s7m<cna0> {

    /* JADX INFO: renamed from: a */
    public cna0 f70721a;

    /* JADX INFO: renamed from: b */
    public Context f70722b;

    /* JADX INFO: renamed from: c */
    public ProfileLoopWebViewFrag f70723c;

    /* JADX INFO: renamed from: d */
    public MKWebViewManager f70724d;

    public ana0(Context context, ProfileLoopWebViewFrag profileLoopWebViewFrag) {
        this.f70722b = context;
        this.f70723c = profileLoopWebViewFrag;
    }

    /* JADX INFO: renamed from: e */
    private void m97739e(View view) {
        MKWebViewManager mKWebViewManager = (MKWebViewManager) view;
        this.f70724d = mKWebViewManager;
        mKWebViewManager.findViewById(a5c0.f67660N).setBackgroundColor(this.f70722b.getResources().getColor(c1c0.f78258o));
        m97743d().m51509a2().m51548W0(this.f70723c);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f70722b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(cna0 cna0Var) {
        this.f70721a = cna0Var;
    }

    /* JADX INFO: renamed from: c */
    public Bundle m97742c() {
        return this.f70723c.getArguments();
    }

    /* JADX INFO: renamed from: d */
    public ProfileInfoLoopEditAct m97743d() {
        return (ProfileInfoLoopEditAct) this.f70722b;
    }

    /* JADX INFO: renamed from: f */
    public void m97744f(String str) {
        this.f70724d.m52939n(str, "");
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137382v, viewGroup, false);
        m97739e(viewInflate);
        return viewInflate;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: b */
    public void m97741b(User user) {
    }
}
