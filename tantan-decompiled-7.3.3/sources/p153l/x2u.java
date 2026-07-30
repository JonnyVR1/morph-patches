package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.skin.ToolBarSkinView;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.teenmode.LiveTeenModeViewModel;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonViewModel;
import com.p051p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import p151v.VFrame;

/* JADX INFO: loaded from: classes9.dex */
public class x2u implements iam<u2u> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f192183a;

    /* JADX INFO: renamed from: b */
    public VFrame f192184b;

    /* JADX INFO: renamed from: c */
    public View f192185c;

    /* JADX INFO: renamed from: d */
    public NoSaveStateViewPager f192186d;

    /* JADX INFO: renamed from: e */
    public ToolBarSkinView f192187e;

    /* JADX INFO: renamed from: f */
    public AnimEffectPlayer f192188f;

    /* JADX INFO: renamed from: g */
    public VFrame f192189g;

    /* JADX INFO: renamed from: h */
    public View f192190h;

    /* JADX INFO: renamed from: i */
    public TabLayout f192191i;

    /* JADX INFO: renamed from: j */
    public LiveSquareTopButtonViewModel f192192j;

    /* JADX INFO: renamed from: k */
    public View f192193k;

    /* JADX INFO: renamed from: l */
    public LiveTeenModeViewModel f192194l;

    /* JADX INFO: renamed from: m */
    public u2u f192195m;

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return bnl0.m105508E(this.f192184b);
    }

    /* JADX INFO: renamed from: a */
    public View m209177a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return y2u.m214105b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(u2u u2uVar) {
        this.f192195m = u2uVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m209177a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m209179r() {
        bnl0.m105542Z(this.f192189g);
        bnl0.m105524M(this.f192190h, false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f192187e.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = bnl0.m105511F0() + getContext().getResources().getDimensionPixelSize(hac0.f108490b);
        layoutParams.gravity = 48;
        this.f192187e.setLayoutParams(layoutParams);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
