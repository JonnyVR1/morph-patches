package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.teenmode.LiveTeenModeViewModel;
import com.p046p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import p147v.VFrame;
import p147v.VLinear;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class y4u implements s7m<p2u> {

    /* JADX INFO: renamed from: a */
    public VFrame f196342a;

    /* JADX INFO: renamed from: b */
    public NoSaveStateViewPager f196343b;

    /* JADX INFO: renamed from: c */
    public View f196344c;

    /* JADX INFO: renamed from: d */
    public VLinear f196345d;

    /* JADX INFO: renamed from: e */
    public View f196346e;

    /* JADX INFO: renamed from: f */
    public VNavigationBar f196347f;

    /* JADX INFO: renamed from: g */
    public TabLayout f196348g;

    /* JADX INFO: renamed from: h */
    public LiveTeenModeViewModel f196349h;

    /* JADX INFO: renamed from: i */
    public p2u f196350i;

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return xdl0.m208328E(this.f196342a);
    }

    /* JADX INFO: renamed from: a */
    public View m212944a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return z4u.m217128b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(p2u p2uVar) {
        this.f196350i = p2uVar;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m212944a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m212946r() {
        ((PutongAct) this.f196350i.act()).setTransparentStatusBar();
        PutongAct.setLightStatusBar(this.f196350i.act().getWindow(), 0);
        xdl0.m208362Z(this.f196345d);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
