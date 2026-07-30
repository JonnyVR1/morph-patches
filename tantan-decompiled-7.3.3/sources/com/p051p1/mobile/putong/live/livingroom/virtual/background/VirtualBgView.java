package com.p051p1.mobile.putong.live.livingroom.virtual.background;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.bnl0;
import p153l.iam;
import p153l.izs;
import p153l.lxl0;
import p153l.obc0;
import p153l.v2m0;
import p153l.wo0;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualBgView extends ConstraintLayout implements iam<v2m0> {

    /* JADX INFO: renamed from: d */
    public VDraweeView f53028d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f53029e;

    /* JADX INFO: renamed from: f */
    public LiveMediaBgView f53030f;

    /* JADX INFO: renamed from: g */
    public VImage f53031g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.background.VirtualBgView$a */
    public class C13111a extends wo0 {
        public C13111a() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            bnl0.m105525M0(VirtualBgView.this.f53028d, false);
        }
    }

    public VirtualBgView(@NonNull Context context) {
        super(context);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
        m78008m0();
        AnimEffectPlayer animEffectPlayer = this.f53029e;
        if (animEffectPlayer != null) {
            animEffectPlayer.m69688o();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m78003h0(View view) {
        lxl0.m156205a(this, view);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public void m78005j0() {
        setBackgroundResource(obc0.f146122N0);
        this.f53028d.setController(null);
        this.f53029e.m69687n();
        bnl0.m105524M(this.f53028d, false);
        bnl0.m105524M(this.f53029e, false);
        bnl0.m105524M(this.f53031g, true);
        m78008m0();
    }

    /* JADX INFO: renamed from: k0 */
    public void m78006k0() {
        setBackgroundResource(obc0.f146569z3);
        this.f53028d.setController(null);
        this.f53029e.m69687n();
        bnl0.m105524M(this.f53028d, false);
        bnl0.m105524M(this.f53029e, false);
        bnl0.m105524M(this.f53031g, false);
        m78008m0();
    }

    /* JADX INFO: renamed from: l0 */
    public void m78007l0(String str, String str2) {
        setBackgroundResource(0);
        if ("svga".equals(str) || str2.endsWith("svga")) {
            bnl0.m105525M0(this.f53028d, false);
            bnl0.m105525M0(this.f53029e, true);
            m78008m0();
            this.f53029e.mo69685l(str2, -1, new C13111a());
        } else if ("mp4".equals(str) || str2.endsWith("mp4")) {
            bnl0.m105525M0(this.f53028d, false);
            bnl0.m105525M0(this.f53029e, false);
            bnl0.m105525M0(this.f53030f, true);
            this.f53030f.m78000m(str2);
        } else {
            bnl0.m105525M0(this.f53028d, true);
            bnl0.m105525M0(this.f53029e, false);
            m78008m0();
            izs.m142860k("context_livingAct", this.f53028d, str2);
        }
        bnl0.m105524M(this.f53031g, false);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m78008m0() {
        LiveMediaBgView liveMediaBgView = this.f53030f;
        if (liveMediaBgView != null) {
            bnl0.m105525M0(liveMediaBgView, false);
            this.f53030f.m78002o();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78003h0(this);
    }

    public VirtualBgView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualBgView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(v2m0 v2m0Var) {
    }
}
