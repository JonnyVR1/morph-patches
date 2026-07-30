package com.p000p1.mobile.putong.live.livingroom.increment.gift.scrap;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.base.data.BLiveScrapBrief;
import l.hxs;
import l.t100;
import l.xdl0;
import p002l.h1c0;
import p002l.i3c0;
import p002l.m3e0;
import p002l.m4e0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ScrapItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public View f5990d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f5991e;

    /* JADX INFO: renamed from: f */
    public View f5992f;

    /* JADX INFO: renamed from: g */
    public VText f5993g;

    public ScrapItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m7562l0() {
        if (getMeasuredWidth() >= t100.d(132.0f)) {
            getLayoutParams().width = t100.d(66.0f);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m7563j0(View view) {
        m4e0.m17704a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m7564k0() {
        if (getMeasuredWidth() < t100.d(132.0f)) {
            getLayoutParams().width = t100.d(132.0f);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m7565m0(BLiveScrapBrief bLiveScrapBrief) {
        if (bLiveScrapBrief.itemStock.count <= 0) {
            xdl0.M(this.f5992f, false);
            return;
        }
        long j = bLiveScrapBrief.targetItem.cost;
        if (j == 0) {
            j = 1;
        }
        int i = (int) (bLiveScrapBrief.remainCount / j);
        View view = this.f5992f;
        if (i <= 0) {
            xdl0.M(view, false);
        } else {
            xdl0.M(view, true);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m7566n0(String str) {
        hxs.t("context_single_room", this.f5991e, m3e0.m17687e(str), t100.d(46.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public void m7567o0(BLiveScrapBrief bLiveScrapBrief, boolean z) {
        if (bLiveScrapBrief.isRightTabScrap) {
            post(new Runnable() { // from class: l.k4e0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14201a.m7564k0();
                }
            });
            this.f5993g.setTextColor(getResources().getColor(h1c0.f11760W));
        } else {
            post(new Runnable() { // from class: l.l4e0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14671a.m7562l0();
                }
            });
            this.f5993g.setTextColor(getResources().getColor(h1c0.f11730H));
        }
        boolean z2 = bLiveScrapBrief.isRightTabScrap;
        if (z) {
            View view = this.f5990d;
            if (z2) {
                view.setBackgroundResource(i3c0.f12753c6);
            } else {
                view.setBackgroundResource(i3c0.f12917q2);
            }
        } else {
            View view2 = this.f5990d;
            if (z2) {
                view2.setBackgroundResource(i3c0.f12969u6);
            } else {
                view2.setBackgroundResource(i3c0.f12885n6);
            }
        }
        m7566n0(bLiveScrapBrief.itemId);
        this.f5993g.setText(m3e0.m17688f(bLiveScrapBrief.itemId));
        m7565m0(bLiveScrapBrief);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7563j0(this);
    }

    public ScrapItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScrapItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
