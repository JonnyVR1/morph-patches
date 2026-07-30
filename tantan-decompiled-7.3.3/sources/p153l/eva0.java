package p153l;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopWebViewFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.views.MKWebViewManager;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes4.dex */
public class eva0 implements iam<gva0> {

    /* JADX INFO: renamed from: a */
    public gva0 f95994a;

    /* JADX INFO: renamed from: b */
    public Context f95995b;

    /* JADX INFO: renamed from: c */
    public ProfileLoopWebViewFrag f95996c;

    /* JADX INFO: renamed from: d */
    public MKWebViewManager f95997d;

    public eva0(Context context, ProfileLoopWebViewFrag profileLoopWebViewFrag) {
        this.f95995b = context;
        this.f95996c = profileLoopWebViewFrag;
    }

    /* JADX INFO: renamed from: e */
    private void m122770e(View view) {
        MKWebViewManager mKWebViewManager = (MKWebViewManager) view;
        this.f95997d = mKWebViewManager;
        mKWebViewManager.findViewById(gdc0.f103655N).setBackgroundColor(this.f95995b.getResources().getColor(j9c0.f118878o));
        m122774d().m52692b2().m52731W0(this.f95996c);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f95995b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(gva0 gva0Var) {
        this.f95994a = gva0Var;
    }

    /* JADX INFO: renamed from: c */
    public Bundle m122773c() {
        return this.f95996c.getArguments();
    }

    /* JADX INFO: renamed from: d */
    public ProfileInfoLoopEditAct m122774d() {
        return (ProfileInfoLoopEditAct) this.f95995b;
    }

    /* JADX INFO: renamed from: f */
    public void m122775f(String str) {
        this.f95997d.m54122n(str, "");
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167596v, viewGroup, false);
        m122770e(viewInflate);
        return viewInflate;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: b */
    public void m122772b(User user) {
    }
}
