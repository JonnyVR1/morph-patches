package com.p046p1.mobile.putong.live.livingroom.virtual.background;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.ap0;
import p149l.hol0;
import p149l.hxs;
import p149l.i3c0;
import p149l.rtl0;
import p149l.s7m;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualBgView extends ConstraintLayout implements s7m<rtl0> {

    /* JADX INFO: renamed from: d */
    public VDraweeView f52180d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f52181e;

    /* JADX INFO: renamed from: f */
    public LiveMediaBgView f52182f;

    /* JADX INFO: renamed from: g */
    public VImage f52183g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.background.VirtualBgView$a */
    public class C12948a extends ap0 {
        public C12948a() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            xdl0.m208345M0(VirtualBgView.this.f52180d, false);
        }
    }

    public VirtualBgView(@NonNull Context context) {
        super(context);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
        m76825m0();
        AnimEffectPlayer animEffectPlayer = this.f52181e;
        if (animEffectPlayer != null) {
            animEffectPlayer.m68505o();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m76820h0(View view) {
        hol0.m132223a(this, view);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public void m76822j0() {
        setBackgroundResource(i3c0.f110794N0);
        this.f52180d.setController(null);
        this.f52181e.m68504n();
        xdl0.m208344M(this.f52180d, false);
        xdl0.m208344M(this.f52181e, false);
        xdl0.m208344M(this.f52183g, true);
        m76825m0();
    }

    /* JADX INFO: renamed from: k0 */
    public void m76823k0() {
        setBackgroundResource(i3c0.f111241z3);
        this.f52180d.setController(null);
        this.f52181e.m68504n();
        xdl0.m208344M(this.f52180d, false);
        xdl0.m208344M(this.f52181e, false);
        xdl0.m208344M(this.f52183g, false);
        m76825m0();
    }

    /* JADX INFO: renamed from: l0 */
    public void m76824l0(String str, String str2) {
        setBackgroundResource(0);
        if ("svga".equals(str) || str2.endsWith("svga")) {
            xdl0.m208345M0(this.f52180d, false);
            xdl0.m208345M0(this.f52181e, true);
            m76825m0();
            this.f52181e.mo68502l(str2, -1, new C12948a());
        } else if ("mp4".equals(str) || str2.endsWith("mp4")) {
            xdl0.m208345M0(this.f52180d, false);
            xdl0.m208345M0(this.f52181e, false);
            xdl0.m208345M0(this.f52182f, true);
            this.f52182f.m76817m(str2);
        } else {
            xdl0.m208345M0(this.f52180d, true);
            xdl0.m208345M0(this.f52181e, false);
            m76825m0();
            hxs.m133398k("context_livingAct", this.f52180d, str2);
        }
        xdl0.m208344M(this.f52183g, false);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m76825m0() {
        LiveMediaBgView liveMediaBgView = this.f52182f;
        if (liveMediaBgView != null) {
            xdl0.m208345M0(liveMediaBgView, false);
            this.f52182f.m76819o();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76820h0(this);
    }

    public VirtualBgView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualBgView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(rtl0 rtl0Var) {
    }
}
