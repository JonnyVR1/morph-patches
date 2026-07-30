package com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.tag;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.DanmakuTag;
import p149l.i3c0;
import p149l.n1c;
import p149l.pn40;
import p149l.s7m;
import p149l.t100;
import p149l.t6c0;
import p149l.xdl0;
import p149l.yb2;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class DanmakuTagViewContainer extends LinearLayout implements s7m<n1c<pn40>> {

    /* JADX INFO: renamed from: a */
    public n1c<pn40> f48841a;

    public DanmakuTagViewContainer(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m72578e(View view) {
        this.f48841a.m157345e4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m72579f(View view) {
        this.f48841a.m157344d4();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(n1c<pn40> n1cVar) {
        this.f48841a = n1cVar;
    }

    /* JADX INFO: renamed from: d */
    public void m72581d(float f, boolean z) {
        if (z) {
            xdl0.m208344M(this, false);
        }
        setAlpha(f);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: i */
    public void m72582i() {
        removeAllViews();
        Context context = getContext();
        DanmakuTag danmakuTag = (DanmakuTag) View.inflate(context, t6c0.f168235X, null);
        danmakuTag.setOnClickListener(new View.OnClickListener() { // from class: l.o1c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141421a.m72578e(view);
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, xdl0.m208407w(40.0f));
        int i = t100.f167261j;
        layoutParams.setMarginStart(i);
        danmakuTag.m72519b(i3c0.f110742I8, R$string.f47589ve, -1, yb2.m213876a(-30697, i, false), true);
        addView(danmakuTag, layoutParams);
        DanmakuTag danmakuTag2 = (DanmakuTag) View.inflate(context, t6c0.f168235X, null);
        danmakuTag2.setOnClickListener(new View.OnClickListener() { // from class: l.p1c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146666a.m72579f(view);
            }
        });
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, xdl0.m208407w(40.0f));
        layoutParams2.setMarginStart(t100.f167260i);
        danmakuTag2.m72519b(i3c0.f110730H8, R$string.f46990U2, -419430401, yb2.m213876a(-434562786, i, false), false);
        addView(danmakuTag2, layoutParams2);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m72583j(float f) {
        if (getChildCount() == 0) {
            m72582i();
        }
        setAlpha(f);
        if (getVisibility() != 0) {
            xdl0.m208344M(this, true);
            zvf0.m220402x("e_live_bullet_storm_entrance", this.f48841a.mo77274R2());
        }
    }
}
