package com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.tag;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.DanmakuTag;
import l.s7m;
import l.t100;
import l.xdl0;
import l.yb2;
import l.zvf0;
import p002l.i3c0;
import p002l.n1c;
import p002l.pn40;
import p002l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class DanmakuTagViewContainer extends LinearLayout implements s7m<n1c<pn40>> {

    /* JADX INFO: renamed from: a */
    public n1c<pn40> f4883a;

    public DanmakuTagViewContainer(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m6074e(View view) {
        this.f4883a.m18364e4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m6075f(View view) {
        this.f4883a.m18363d4();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m6076C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m6080i1(n1c<pn40> n1cVar) {
        this.f4883a = n1cVar;
    }

    /* JADX INFO: renamed from: d */
    public void m6078d(float f, boolean z) {
        if (z) {
            xdl0.M(this, false);
        }
        setAlpha(f);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: i */
    public void m6079i() {
        removeAllViews();
        Context contextM6076C0 = m6076C0();
        DanmakuTag danmakuTag = (DanmakuTag) View.inflate(contextM6076C0, t6c0.f19731X, null);
        danmakuTag.setOnClickListener(new View.OnClickListener() { // from class: l.o1c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16333a.m6074e(view);
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, xdl0.w(40.0f));
        int i = t100.j;
        layoutParams.setMarginStart(i);
        danmakuTag.m6011b(i3c0.f12527I8, R$string.f3631ve, -1, yb2.a(-30697, i, false), true);
        addView(danmakuTag, layoutParams);
        DanmakuTag danmakuTag2 = (DanmakuTag) View.inflate(contextM6076C0, t6c0.f19731X, null);
        danmakuTag2.setOnClickListener(new View.OnClickListener() { // from class: l.p1c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16956a.m6075f(view);
            }
        });
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, xdl0.w(40.0f));
        layoutParams2.setMarginStart(t100.i);
        danmakuTag2.m6011b(i3c0.f12515H8, R$string.f3032U2, -419430401, yb2.a(-434562786, i, false), false);
        addView(danmakuTag2, layoutParams2);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m6081j(float f) {
        if (getChildCount() == 0) {
            m6079i();
        }
        setAlpha(f);
        if (getVisibility() != 0) {
            xdl0.M(this, true);
            zvf0.x("e_live_bullet_storm_entrance", this.f4883a.mo21430R2());
        }
    }
}
