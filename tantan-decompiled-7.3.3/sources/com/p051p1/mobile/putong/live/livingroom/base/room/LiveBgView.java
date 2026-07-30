package com.p051p1.mobile.putong.live.livingroom.base.room;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.iam;
import p153l.izs;
import p153l.obc0;
import p153l.ts10;
import p153l.uqb0;
import p153l.wft;
import p153l.yyr;
import p153l.zyr;

/* JADX INFO: loaded from: classes4.dex */
public class LiveBgView extends FrameLayout implements iam<yyr> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f48731a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f48732b;

    /* JADX INFO: renamed from: c */
    public yyr f48733c;

    /* JADX INFO: renamed from: d */
    public boolean f48734d;

    /* JADX INFO: renamed from: e */
    public View f48735e;

    /* JADX INFO: renamed from: f */
    public boolean f48736f;

    /* JADX INFO: renamed from: g */
    public int f48737g;

    public LiveBgView(@NonNull Context context) {
        super(context);
        this.f48737g = -1;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m73164a(View view) {
        zyr.m222150a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(yyr yyrVar) {
        this.f48733c = yyrVar;
    }

    /* JADX INFO: renamed from: c */
    public void m73166c(boolean z, int i) {
        if (this.f48731a == null) {
            return;
        }
        m73168e(i == 0);
        if (!z) {
            if (this.f48736f) {
                return;
            }
            this.f48736f = true;
            boolean zM206159b = wft.m206159b(2);
            VDraweeView vDraweeView = this.f48731a;
            if (zM206159b) {
                izs.m142873x(vDraweeView, obc0.f146017E3);
                return;
            } else {
                izs.m142873x(vDraweeView, obc0.f146317e3);
                return;
            }
        }
        this.f48736f = false;
        if (this.f48737g == i) {
            return;
        }
        this.f48737g = i;
        if (i == 1) {
            izs.m142873x(this.f48731a, obc0.f146042G4);
        } else {
            boolean z2 = this.f48734d;
            VDraweeView vDraweeView2 = this.f48731a;
            if (z2) {
                izs.m142873x(vDraweeView2, obc0.f146017E3);
            } else {
                izs.m142873x(vDraweeView2, obc0.f146075J1);
            }
        }
        if (((Boolean) this.f48733c.m138856F3(new ts10(800))).booleanValue()) {
            izs.m142873x(this.f48731a, obc0.f146042G4);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m73167d(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            uqb0.f180374G.m98798o(this.f48731a);
            m73170i();
        } else if (!TextUtils.isEmpty(str)) {
            izs.m142868s("context_single_room", this.f48731a, str);
            m73170i();
        } else {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            m73169f(str2);
        }
    }

    @Override // p153l.iam
    public void destroy() {
        m73166c(false, -1);
        this.f48737g = -1;
    }

    /* JADX INFO: renamed from: e */
    public void m73168e(boolean z) {
        View view = this.f48735e;
        if (view == null) {
            return;
        }
        bnl0.m105524M(view, z);
    }

    /* JADX INFO: renamed from: f */
    public void m73169f(String str) {
        AnimEffectPlayer animEffectPlayer = this.f48732b;
        if (animEffectPlayer != null) {
            bnl0.m105524M(animEffectPlayer, true);
            this.f48732b.m69683j(str, -1);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m73170i() {
        AnimEffectPlayer animEffectPlayer = this.f48732b;
        if (animEffectPlayer != null) {
            bnl0.m105524M(animEffectPlayer, false);
            this.f48732b.m69688o();
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m73170i();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73164a(this);
        m73166c(false, -1);
        bnl0.m105524M(this.f48732b, false);
    }

    public void setOfficialShowMode(boolean z) {
        this.f48734d = z;
    }

    public void setPlayerMaskView(View view) {
        this.f48735e = view;
    }

    public LiveBgView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48737g = -1;
    }

    public LiveBgView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48737g = -1;
    }
}
