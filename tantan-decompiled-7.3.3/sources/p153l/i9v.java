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
public class i9v implements iam<h8v> {

    /* JADX INFO: renamed from: a */
    public AnimEffectPlayer f113509a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f113510b;

    /* JADX INFO: renamed from: c */
    public VNavigationBar f113511c;

    /* JADX INFO: renamed from: d */
    public VPullDownRefreshLayout f113512d;

    /* JADX INFO: renamed from: e */
    public AppBarLayout f113513e;

    /* JADX INFO: renamed from: f */
    public LiveVoiceInternalHeaderView f113514f;

    /* JADX INFO: renamed from: g */
    public TabLayout f113515g;

    /* JADX INFO: renamed from: h */
    public NoSaveStateViewPager f113516h;

    /* JADX INFO: renamed from: i */
    public h8v f113517i;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m139149e(mvc0 mvc0Var) {
        this.f113517i.m133984X2();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        FrameLayout frameLayout = this.f113510b;
        return frameLayout != null ? frameLayout.getContext() : this.f113517i.m133972K2().m164819a();
    }

    /* JADX INFO: renamed from: b */
    public View m139150b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m9v.m157598b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(h8v h8vVar) {
        this.f113517i = h8vVar;
    }

    /* JADX INFO: renamed from: d */
    public void m139152d(Act act) {
        this.f113509a.m69683j("https://auto.tancdn.com/v1/raw/bd5067f0-fa5a-4faf-bd72-06636f0c4d5610.pdf", -1);
        m139153f(act);
    }

    /* JADX INFO: renamed from: f */
    public final void m139153f(Act act) {
        if (act instanceof PutongAct) {
            ((PutongAct) act).setTransparentStatusBar();
            int i = bnl0.f77544e;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.topMargin = bnl0.m105511F0();
            this.f113510b.setLayoutParams(layoutParams);
            this.f113509a.setLayoutParams(new FrameLayout.LayoutParams(bnl0.f77544e, qa00.m175859d(92.0f) + bnl0.m105511F0()));
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM139150b = m139150b(layoutInflater, viewGroup);
        this.f113517i.m133974M2();
        return viewM139150b;
    }

    /* JADX INFO: renamed from: r */
    public void m139154r() {
        this.f113512d.mo224405O(new jn50() { // from class: l.h9v
            @Override // p153l.jn50
            /* JADX INFO: renamed from: w2 */
            public final void mo59137w2(mvc0 mvc0Var) {
                this.f108436a.m139149e(mvc0Var);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
