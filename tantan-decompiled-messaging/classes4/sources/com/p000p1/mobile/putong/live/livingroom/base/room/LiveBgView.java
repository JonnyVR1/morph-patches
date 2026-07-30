package com.p000p1.mobile.putong.live.livingroom.base.room;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.hxs;
import l.jk10;
import l.qib0;
import l.s7m;
import l.vdt;
import l.xdl0;
import p002l.i3c0;
import p002l.xwr;
import p002l.ywr;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveBgView extends FrameLayout implements s7m<xwr> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f3925a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f3926b;

    /* JADX INFO: renamed from: c */
    public xwr f3927c;

    /* JADX INFO: renamed from: d */
    public boolean f3928d;

    /* JADX INFO: renamed from: e */
    public View f3929e;

    /* JADX INFO: renamed from: f */
    public boolean f3930f;

    /* JADX INFO: renamed from: g */
    public int f3931g;

    public LiveBgView(@NonNull Context context) {
        super(context);
        this.f3931g = -1;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m5370C0() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m5371a(View view) {
        ywr.m26970a(this, view);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m5378i1(xwr xwrVar) {
        this.f3927c = xwrVar;
    }

    /* JADX INFO: renamed from: c */
    public void m5373c(boolean z, int i) {
        if (this.f3925a == null) {
            return;
        }
        m5375e(i == 0);
        if (!z) {
            if (this.f3930f) {
                return;
            }
            this.f3930f = true;
            boolean zB = vdt.b(2);
            VDraweeView vDraweeView = this.f3925a;
            if (zB) {
                hxs.x(vDraweeView, i3c0.f12474E3);
                return;
            } else {
                hxs.x(vDraweeView, i3c0.f12774e3);
                return;
            }
        }
        this.f3930f = false;
        if (this.f3931g == i) {
            return;
        }
        this.f3931g = i;
        if (i == 1) {
            hxs.x(this.f3925a, i3c0.f12499G4);
        } else {
            boolean z2 = this.f3928d;
            VDraweeView vDraweeView2 = this.f3925a;
            if (z2) {
                hxs.x(vDraweeView2, i3c0.f12474E3);
            } else {
                hxs.x(vDraweeView2, i3c0.f12532J1);
            }
        }
        if (((Boolean) this.f3927c.m14184F3(new jk10(800))).booleanValue()) {
            hxs.x(this.f3925a, i3c0.f12499G4);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m5374d(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            qib0.G.o(this.f3925a);
            m5377i();
        } else if (!TextUtils.isEmpty(str)) {
            hxs.s("context_single_room", this.f3925a, str);
            m5377i();
        } else {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            m5376f(str2);
        }
    }

    public void destroy() {
        m5373c(false, -1);
        this.f3931g = -1;
    }

    /* JADX INFO: renamed from: e */
    public void m5375e(boolean z) {
        View view = this.f3929e;
        if (view == null) {
            return;
        }
        xdl0.M(view, z);
    }

    /* JADX INFO: renamed from: f */
    public void m5376f(String str) {
        AnimEffectPlayer animEffectPlayer = this.f3926b;
        if (animEffectPlayer != null) {
            xdl0.M(animEffectPlayer, true);
            this.f3926b.j(str, -1);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m5377i() {
        AnimEffectPlayer animEffectPlayer = this.f3926b;
        if (animEffectPlayer != null) {
            xdl0.M(animEffectPlayer, false);
            this.f3926b.o();
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m5377i();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5371a(this);
        m5373c(false, -1);
        xdl0.M(this.f3926b, false);
    }

    public void setOfficialShowMode(boolean z) {
        this.f3928d = z;
    }

    public void setPlayerMaskView(View view) {
        this.f3929e = view;
    }

    public LiveBgView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3931g = -1;
    }

    public LiveBgView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3931g = -1;
    }
}
