package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.skin.ToolBarSkinView;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.teenmode.LiveTeenModeViewModel;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonViewModel;
import com.p046p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import p147v.VFrame;

/* JADX INFO: loaded from: classes13.dex */
public class w0u implements s7m<t0u> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f183939a;

    /* JADX INFO: renamed from: b */
    public VFrame f183940b;

    /* JADX INFO: renamed from: c */
    public View f183941c;

    /* JADX INFO: renamed from: d */
    public NoSaveStateViewPager f183942d;

    /* JADX INFO: renamed from: e */
    public ToolBarSkinView f183943e;

    /* JADX INFO: renamed from: f */
    public AnimEffectPlayer f183944f;

    /* JADX INFO: renamed from: g */
    public VFrame f183945g;

    /* JADX INFO: renamed from: h */
    public View f183946h;

    /* JADX INFO: renamed from: i */
    public TabLayout f183947i;

    /* JADX INFO: renamed from: j */
    public LiveSquareTopButtonViewModel f183948j;

    /* JADX INFO: renamed from: k */
    public View f183949k;

    /* JADX INFO: renamed from: l */
    public LiveTeenModeViewModel f183950l;

    /* JADX INFO: renamed from: m */
    public t0u f183951m;

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return xdl0.m208328E(this.f183940b);
    }

    /* JADX INFO: renamed from: a */
    public View m200898a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return x0u.m206650b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(t0u t0uVar) {
        this.f183951m = t0uVar;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m200898a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m200900r() {
        xdl0.m208362Z(this.f183945g);
        xdl0.m208344M(this.f183946h, false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f183943e.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = xdl0.m208331F0() + getContext().getResources().getDimensionPixelSize(a2c0.f67249b);
        layoutParams.gravity = 48;
        this.f183943e.setLayoutParams(layoutParams);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
