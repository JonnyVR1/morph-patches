package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.header.LiveVoiceInternalHeaderView;
import com.p051p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import p151v.VPullDownRefreshLayout;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class k9v implements iam<o8v> {

    /* JADX INFO: renamed from: a */
    public AnimEffectPlayer f124578a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f124579b;

    /* JADX INFO: renamed from: c */
    public VNavigationBar f124580c;

    /* JADX INFO: renamed from: d */
    public VPullDownRefreshLayout f124581d;

    /* JADX INFO: renamed from: e */
    public AppBarLayout f124582e;

    /* JADX INFO: renamed from: f */
    public LiveVoiceInternalHeaderView f124583f;

    /* JADX INFO: renamed from: g */
    public TabLayout f124584g;

    /* JADX INFO: renamed from: h */
    public NoSaveStateViewPager f124585h;

    /* JADX INFO: renamed from: i */
    public o8v f124586i;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m148887e(mvc0 mvc0Var) {
        this.f124586i.m166629P2();
    }

    /* JADX INFO: renamed from: f */
    private void m148888f(Act act) {
        if (act instanceof PutongAct) {
            ((PutongAct) act).setTransparentStatusBar();
            int i = bnl0.f77544e;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.topMargin = bnl0.m105511F0();
            this.f124579b.setLayoutParams(layoutParams);
            this.f124578a.setLayoutParams(new FrameLayout.LayoutParams(bnl0.f77544e, qa00.m175859d(92.0f) + bnl0.m105511F0()));
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public View m148889b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return l9v.m153462b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(o8v o8vVar) {
        this.f124586i = o8vVar;
    }

    /* JADX INFO: renamed from: d */
    public void m148891d(Act act) {
        m148888f(act);
        this.f124578a.m69683j("https://auto.tancdn.com/v1/raw/bd5067f0-fa5a-4faf-bd72-06636f0c4d5610.pdf", -1);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM148889b = m148889b(layoutInflater, viewGroup);
        this.f124586i.m166621D2();
        return viewM148889b;
    }

    /* JADX INFO: renamed from: r */
    public void m148892r() {
        this.f124581d.mo224405O(new jn50() { // from class: l.j9v
            @Override // p153l.jn50
            /* JADX INFO: renamed from: w2 */
            public final void mo59137w2(mvc0 mvc0Var) {
                this.f118908a.m148887e(mvc0Var);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
