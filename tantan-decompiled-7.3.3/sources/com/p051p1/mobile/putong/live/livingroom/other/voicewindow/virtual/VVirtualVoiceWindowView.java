package com.p051p1.mobile.putong.live.livingroom.other.voicewindow.virtual;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import org.jetbrains.annotations.NotNull;
import p153l.bnl0;
import p153l.f0l0;
import p153l.l6o0;
import p153l.obc0;
import p153l.oo2;
import p153l.pcj;
import p153l.rwn0;
import p153l.uam;
import p153l.y20;
import p153l.ym50;

/* JADX INFO: loaded from: classes5.dex */
public class VVirtualVoiceWindowView extends FrameLayout implements uam {

    /* JADX INFO: renamed from: a */
    public VirtualWaveView f52160a;

    /* JADX INFO: renamed from: b */
    public CommonAnimMaskAvatarView f52161b;

    /* JADX INFO: renamed from: c */
    public Context f52162c;

    /* JADX INFO: renamed from: d */
    public View.OnClickListener f52163d;

    /* JADX INFO: renamed from: e */
    public boolean f52164e;

    /* JADX INFO: renamed from: f */
    public pcj<Boolean> f52165f;

    public VVirtualVoiceWindowView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: g */
    private void m76805g() {
        this.f52160a.m76846y();
        bnl0.m105524M(this.f52160a, false);
    }

    @Override // p153l.uam
    /* JADX INFO: renamed from: a */
    public void mo76788a() {
        m76805g();
        this.f52164e = false;
    }

    @Override // p153l.uam
    /* JADX INFO: renamed from: b */
    public void mo76789b(View.OnClickListener onClickListener) {
        this.f52163d = onClickListener;
    }

    @Override // p153l.uam
    /* JADX INFO: renamed from: c */
    public void mo76790c() {
        bnl0.m105524M(this.f52160a, true);
        this.f52160a.m76846y();
        this.f52160a.m76845x();
        this.f52164e = true;
    }

    @Override // p153l.uam
    /* JADX INFO: renamed from: d */
    public void mo76791d(oo2 oo2Var, String str) {
        if (!(oo2Var instanceof rwn0)) {
            this.f52161b.setImageResID(obc0.f146082J8);
            return;
        }
        rwn0 rwn0Var = (rwn0) oo2Var;
        BLiveUserMask bLiveUserMaskM168529k0 = rwn0Var.m168529k0();
        if (bLiveUserMaskM168529k0 != null) {
            this.f52161b.setMaskAvatarData(new CommonAnimMaskAvatarView.C12880a().m73297d("context_common").m73296c(bLiveUserMaskM168529k0.avatar).m73295b(bLiveUserMaskM168529k0.avatarResourceType).m73294a());
            return;
        }
        BLiveUserMask bLiveUserMask = l6o0.m153068c(rwn0Var.m183411P2().m136874m(oo2Var.m168532l0().f56859id)).f130275b;
        CommonAnimMaskAvatarView commonAnimMaskAvatarView = this.f52161b;
        if (bLiveUserMask == null) {
            commonAnimMaskAvatarView.setImageResID(obc0.f146082J8);
        } else {
            commonAnimMaskAvatarView.setMaskAvatarData(new CommonAnimMaskAvatarView.C12880a().m73297d("context_common").m73296c(bLiveUserMask.avatar).m73295b(bLiveUserMask.avatarResourceType).m73294a());
        }
    }

    @Override // p153l.uam
    /* JADX INFO: renamed from: e */
    public boolean mo76792e() {
        return this.f52164e;
    }

    /* JADX INFO: renamed from: f */
    public final void m76806f(View view) {
        f0l0.m123488a(this, view);
    }

    @NotNull
    public View getOriginView() {
        return this;
    }

    @NonNull
    public WindowManager.LayoutParams getWindowParams() {
        return null;
    }

    @Override // p153l.uam
    public void init() {
        this.f52162c = getContext();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m76805g();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76806f(this);
    }

    @Override // p153l.uam
    public void setShowExitAreaFunc(pcj<Boolean> pcjVar) {
        this.f52165f = pcjVar;
    }

    public VVirtualVoiceWindowView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VVirtualVoiceWindowView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setOnTouchListenerNative(@NonNull ym50 ym50Var) {
    }

    public void setUpdateWindowAction(y20<WindowManager.LayoutParams> y20Var) {
    }
}
