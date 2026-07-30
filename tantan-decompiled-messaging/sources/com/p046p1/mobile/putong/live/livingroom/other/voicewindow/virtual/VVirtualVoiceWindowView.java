package com.p046p1.mobile.putong.live.livingroom.other.voicewindow.virtual;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import org.jetbrains.annotations.NotNull;
import p149l.e30;
import p149l.e8m;
import p149l.ho2;
import p149l.hxn0;
import p149l.i3c0;
import p149l.nnn0;
import p149l.re50;
import p149l.v9j;
import p149l.xdl0;
import p149l.zqk0;

/* JADX INFO: loaded from: classes5.dex */
public class VVirtualVoiceWindowView extends FrameLayout implements e8m {

    /* JADX INFO: renamed from: a */
    public VirtualWaveView f51312a;

    /* JADX INFO: renamed from: b */
    public CommonAnimMaskAvatarView f51313b;

    /* JADX INFO: renamed from: c */
    public Context f51314c;

    /* JADX INFO: renamed from: d */
    public View.OnClickListener f51315d;

    /* JADX INFO: renamed from: e */
    public boolean f51316e;

    /* JADX INFO: renamed from: f */
    public v9j<Boolean> f51317f;

    public VVirtualVoiceWindowView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: g */
    private void m75622g() {
        this.f51312a.m75663y();
        xdl0.m208344M(this.f51312a, false);
    }

    @Override // p149l.e8m
    /* JADX INFO: renamed from: a */
    public void mo75605a() {
        m75622g();
        this.f51316e = false;
    }

    @Override // p149l.e8m
    /* JADX INFO: renamed from: b */
    public void mo75606b(View.OnClickListener onClickListener) {
        this.f51315d = onClickListener;
    }

    @Override // p149l.e8m
    /* JADX INFO: renamed from: c */
    public void mo75607c() {
        xdl0.m208344M(this.f51312a, true);
        this.f51312a.m75663y();
        this.f51312a.m75662x();
        this.f51316e = true;
    }

    @Override // p149l.e8m
    /* JADX INFO: renamed from: d */
    public void mo75608d(ho2 ho2Var, String str) {
        if (!(ho2Var instanceof nnn0)) {
            this.f51313b.setImageResID(i3c0.f110754J8);
            return;
        }
        nnn0 nnn0Var = (nnn0) ho2Var;
        BLiveUserMask bLiveUserMaskM132143k0 = nnn0Var.m132143k0();
        if (bLiveUserMaskM132143k0 != null) {
            this.f51313b.setMaskAvatarData(new CommonAnimMaskAvatarView.C12717a().m72114d("context_common").m72113c(bLiveUserMaskM132143k0.avatar).m72112b(bLiveUserMaskM132143k0.avatarResourceType).m72111a());
            return;
        }
        BLiveUserMask bLiveUserMask = hxn0.m133350c(nnn0Var.m160249P2().m102064m(ho2Var.m132146l0().f56011id)).f109896b;
        CommonAnimMaskAvatarView commonAnimMaskAvatarView = this.f51313b;
        if (bLiveUserMask == null) {
            commonAnimMaskAvatarView.setImageResID(i3c0.f110754J8);
        } else {
            commonAnimMaskAvatarView.setMaskAvatarData(new CommonAnimMaskAvatarView.C12717a().m72114d("context_common").m72113c(bLiveUserMask.avatar).m72112b(bLiveUserMask.avatarResourceType).m72111a());
        }
    }

    @Override // p149l.e8m
    /* JADX INFO: renamed from: e */
    public boolean mo75609e() {
        return this.f51316e;
    }

    /* JADX INFO: renamed from: f */
    public final void m75623f(View view) {
        zqk0.m219855a(this, view);
    }

    @NotNull
    public View getOriginView() {
        return this;
    }

    @NonNull
    public WindowManager.LayoutParams getWindowParams() {
        return null;
    }

    @Override // p149l.e8m
    public void init() {
        this.f51314c = getContext();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m75622g();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75623f(this);
    }

    @Override // p149l.e8m
    public void setShowExitAreaFunc(v9j<Boolean> v9jVar) {
        this.f51317f = v9jVar;
    }

    public VVirtualVoiceWindowView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VVirtualVoiceWindowView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setOnTouchListenerNative(@NonNull re50 re50Var) {
    }

    public void setUpdateWindowAction(e30<WindowManager.LayoutParams> e30Var) {
    }
}
