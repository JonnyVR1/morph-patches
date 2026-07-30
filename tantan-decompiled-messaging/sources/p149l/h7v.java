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
public class h7v implements s7m<g6v> {

    /* JADX INFO: renamed from: a */
    public AnimEffectPlayer f106340a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f106341b;

    /* JADX INFO: renamed from: c */
    public VNavigationBar f106342c;

    /* JADX INFO: renamed from: d */
    public VPullDownRefreshLayout f106343d;

    /* JADX INFO: renamed from: e */
    public AppBarLayout f106344e;

    /* JADX INFO: renamed from: f */
    public LiveVoiceInternalHeaderView f106345f;

    /* JADX INFO: renamed from: g */
    public TabLayout f106346g;

    /* JADX INFO: renamed from: h */
    public NoSaveStateViewPager f106347h;

    /* JADX INFO: renamed from: i */
    public g6v f106348i;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m129799e(hnc0 hnc0Var) {
        this.f106348i.m124659X2();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        FrameLayout frameLayout = this.f106341b;
        return frameLayout != null ? frameLayout.getContext() : this.f106348i.m124647K2().m156171a();
    }

    /* JADX INFO: renamed from: b */
    public View m129800b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return l7v.m148826b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(g6v g6vVar) {
        this.f106348i = g6vVar;
    }

    /* JADX INFO: renamed from: d */
    public void m129802d(Act act) {
        this.f106340a.m68500j("https://auto.tancdn.com/v1/raw/bd5067f0-fa5a-4faf-bd72-06636f0c4d5610.pdf", -1);
        m129803f(act);
    }

    /* JADX INFO: renamed from: f */
    public final void m129803f(Act act) {
        if (act instanceof PutongAct) {
            ((PutongAct) act).setTransparentStatusBar();
            int i = xdl0.f192403e;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.topMargin = xdl0.m208331F0();
            this.f106341b.setLayoutParams(layoutParams);
            this.f106340a.setLayoutParams(new FrameLayout.LayoutParams(xdl0.f192403e, t100.m186890d(92.0f) + xdl0.m208331F0()));
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM129800b = m129800b(layoutInflater, viewGroup);
        this.f106348i.m124649M2();
        return viewM129800b;
    }

    /* JADX INFO: renamed from: r */
    public void m129804r() {
        this.f106343d.mo223159O(new df50() { // from class: l.g7v
            @Override // p149l.df50
            /* JADX INFO: renamed from: w2 */
            public final void mo57954w2(hnc0 hnc0Var) {
                this.f101446a.m129799e(hnc0Var);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
