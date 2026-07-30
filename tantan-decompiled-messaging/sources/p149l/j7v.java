package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.header.LiveVoiceInternalHeaderView;
import com.p046p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import p147v.VPullDownRefreshLayout;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class j7v implements s7m<n6v> {

    /* JADX INFO: renamed from: a */
    public AnimEffectPlayer f116645a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f116646b;

    /* JADX INFO: renamed from: c */
    public VNavigationBar f116647c;

    /* JADX INFO: renamed from: d */
    public VPullDownRefreshLayout f116648d;

    /* JADX INFO: renamed from: e */
    public AppBarLayout f116649e;

    /* JADX INFO: renamed from: f */
    public LiveVoiceInternalHeaderView f116650f;

    /* JADX INFO: renamed from: g */
    public TabLayout f116651g;

    /* JADX INFO: renamed from: h */
    public NoSaveStateViewPager f116652h;

    /* JADX INFO: renamed from: i */
    public n6v f116653i;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m140114e(hnc0 hnc0Var) {
        this.f116653i.m158091P2();
    }

    /* JADX INFO: renamed from: f */
    private void m140115f(Act act) {
        if (act instanceof PutongAct) {
            ((PutongAct) act).setTransparentStatusBar();
            int i = xdl0.f192403e;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.topMargin = xdl0.m208331F0();
            this.f116646b.setLayoutParams(layoutParams);
            this.f116645a.setLayoutParams(new FrameLayout.LayoutParams(xdl0.f192403e, t100.m186890d(92.0f) + xdl0.m208331F0()));
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public View m140116b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return k7v.m144703b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(n6v n6vVar) {
        this.f116653i = n6vVar;
    }

    /* JADX INFO: renamed from: d */
    public void m140118d(Act act) {
        m140115f(act);
        this.f116645a.m68500j("https://auto.tancdn.com/v1/raw/bd5067f0-fa5a-4faf-bd72-06636f0c4d5610.pdf", -1);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM140116b = m140116b(layoutInflater, viewGroup);
        this.f116653i.m158083D2();
        return viewM140116b;
    }

    /* JADX INFO: renamed from: r */
    public void m140119r() {
        this.f116648d.mo223159O(new df50() { // from class: l.i7v
            @Override // p149l.df50
            /* JADX INFO: renamed from: w2 */
            public final void mo57954w2(hnc0 hnc0Var) {
                this.f111948a.m140114e(hnc0Var);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
