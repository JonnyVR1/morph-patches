package com.p046p1.mobile.putong.live.livingroom.base.room;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p149l.hxs;
import p149l.i3c0;
import p149l.jk10;
import p149l.qib0;
import p149l.s7m;
import p149l.vdt;
import p149l.xdl0;
import p149l.xwr;
import p149l.ywr;

/* JADX INFO: loaded from: classes4.dex */
public class LiveBgView extends FrameLayout implements s7m<xwr> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f47883a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f47884b;

    /* JADX INFO: renamed from: c */
    public xwr f47885c;

    /* JADX INFO: renamed from: d */
    public boolean f47886d;

    /* JADX INFO: renamed from: e */
    public View f47887e;

    /* JADX INFO: renamed from: f */
    public boolean f47888f;

    /* JADX INFO: renamed from: g */
    public int f47889g;

    public LiveBgView(@NonNull Context context) {
        super(context);
        this.f47889g = -1;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m71981a(View view) {
        ywr.m216411a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(xwr xwrVar) {
        this.f47885c = xwrVar;
    }

    /* JADX INFO: renamed from: c */
    public void m71983c(boolean z, int i) {
        if (this.f47883a == null) {
            return;
        }
        m71985e(i == 0);
        if (!z) {
            if (this.f47888f) {
                return;
            }
            this.f47888f = true;
            boolean zM198092b = vdt.m198092b(2);
            VDraweeView vDraweeView = this.f47883a;
            if (zM198092b) {
                hxs.m133411x(vDraweeView, i3c0.f110689E3);
                return;
            } else {
                hxs.m133411x(vDraweeView, i3c0.f110989e3);
                return;
            }
        }
        this.f47888f = false;
        if (this.f47889g == i) {
            return;
        }
        this.f47889g = i;
        if (i == 1) {
            hxs.m133411x(this.f47883a, i3c0.f110714G4);
        } else {
            boolean z2 = this.f47886d;
            VDraweeView vDraweeView2 = this.f47883a;
            if (z2) {
                hxs.m133411x(vDraweeView2, i3c0.f110689E3);
            } else {
                hxs.m133411x(vDraweeView2, i3c0.f110747J1);
            }
        }
        if (((Boolean) this.f47885c.m129297F3(new jk10(800))).booleanValue()) {
            hxs.m133411x(this.f47883a, i3c0.f110714G4);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m71984d(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            qib0.f154691G.m184725o(this.f47883a);
            m71987i();
        } else if (!TextUtils.isEmpty(str)) {
            hxs.m133406s("context_single_room", this.f47883a, str);
            m71987i();
        } else {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            m71986f(str2);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
        m71983c(false, -1);
        this.f47889g = -1;
    }

    /* JADX INFO: renamed from: e */
    public void m71985e(boolean z) {
        View view = this.f47887e;
        if (view == null) {
            return;
        }
        xdl0.m208344M(view, z);
    }

    /* JADX INFO: renamed from: f */
    public void m71986f(String str) {
        AnimEffectPlayer animEffectPlayer = this.f47884b;
        if (animEffectPlayer != null) {
            xdl0.m208344M(animEffectPlayer, true);
            this.f47884b.m68500j(str, -1);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m71987i() {
        AnimEffectPlayer animEffectPlayer = this.f47884b;
        if (animEffectPlayer != null) {
            xdl0.m208344M(animEffectPlayer, false);
            this.f47884b.m68505o();
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m71987i();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71981a(this);
        m71983c(false, -1);
        xdl0.m208344M(this.f47884b, false);
    }

    public void setOfficialShowMode(boolean z) {
        this.f47886d = z;
    }

    public void setPlayerMaskView(View view) {
        this.f47887e = view;
    }

    public LiveBgView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47889g = -1;
    }

    public LiveBgView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f47889g = -1;
    }
}
