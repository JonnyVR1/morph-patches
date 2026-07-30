package p002l;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.ProfileInfoLoopEditAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopWebViewFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.views.MKWebViewManager;
import com.p1.mobile.putong.data.User;
import l.a5c0;
import l.c1c0;
import l.n6c0;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ana0 implements s7m<cna0> {

    /* JADX INFO: renamed from: a */
    public cna0 f7763a;

    /* JADX INFO: renamed from: b */
    public Context f7764b;

    /* JADX INFO: renamed from: c */
    public ProfileLoopWebViewFrag f7765c;

    /* JADX INFO: renamed from: d */
    public MKWebViewManager f7766d;

    public ana0(Context context, ProfileLoopWebViewFrag profileLoopWebViewFrag) {
        this.f7764b = context;
        this.f7765c = profileLoopWebViewFrag;
    }

    /* JADX INFO: renamed from: e */
    private void m9914e(View view) {
        MKWebViewManager mKWebViewManager = (MKWebViewManager) view;
        this.f7766d = mKWebViewManager;
        mKWebViewManager.findViewById(a5c0.N).setBackgroundColor(this.f7764b.getResources().getColor(c1c0.o));
        m9919d().m1991a2().m2030W0(this.f7765c);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m9915C0() {
        return this.f7764b;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m9921i1(cna0 cna0Var) {
        this.f7763a = cna0Var;
    }

    /* JADX INFO: renamed from: c */
    public Bundle m9918c() {
        return this.f7765c.getArguments();
    }

    /* JADX INFO: renamed from: d */
    public ProfileInfoLoopEditAct m9919d() {
        return (ProfileInfoLoopEditAct) this.f7764b;
    }

    /* JADX INFO: renamed from: f */
    public void m9920f(String str) {
        this.f7766d.m3494n(str, "");
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.v, viewGroup, false);
        m9914e(viewInflate);
        return viewInflate;
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: b */
    public void m9917b(User user) {
    }
}
