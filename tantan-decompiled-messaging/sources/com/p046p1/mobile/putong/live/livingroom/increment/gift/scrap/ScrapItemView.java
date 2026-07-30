package com.p046p1.mobile.putong.live.livingroom.increment.gift.scrap;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveScrapBrief;
import p147v.VDraweeView;
import p147v.VText;
import p149l.h1c0;
import p149l.hxs;
import p149l.i3c0;
import p149l.m3e0;
import p149l.m4e0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class ScrapItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public View f49948d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f49949e;

    /* JADX INFO: renamed from: f */
    public View f49950f;

    /* JADX INFO: renamed from: g */
    public VText f49951g;

    public ScrapItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m74001l0() {
        if (getMeasuredWidth() >= t100.m186890d(132.0f)) {
            getLayoutParams().width = t100.m186890d(66.0f);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m74002j0(View view) {
        m4e0.m153017a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m74003k0() {
        if (getMeasuredWidth() < t100.m186890d(132.0f)) {
            getLayoutParams().width = t100.m186890d(132.0f);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m74004m0(BLiveScrapBrief bLiveScrapBrief) {
        if (bLiveScrapBrief.itemStock.count <= 0) {
            xdl0.m208344M(this.f49950f, false);
            return;
        }
        long j = bLiveScrapBrief.targetItem.cost;
        if (j == 0) {
            j = 1;
        }
        int i = (int) (bLiveScrapBrief.remainCount / j);
        View view = this.f49950f;
        if (i <= 0) {
            xdl0.m208344M(view, false);
        } else {
            xdl0.m208344M(view, true);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m74005n0(String str) {
        hxs.m133407t("context_single_room", this.f49949e, m3e0.m152843e(str), t100.m186890d(46.0f));
    }

    /* JADX INFO: renamed from: o0 */
    public void m74006o0(BLiveScrapBrief bLiveScrapBrief, boolean z) {
        if (bLiveScrapBrief.isRightTabScrap) {
            post(new Runnable() { // from class: l.k4e0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f121086a.m74003k0();
                }
            });
            this.f49951g.setTextColor(getResources().getColor(h1c0.f105340W));
        } else {
            post(new Runnable() { // from class: l.l4e0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f126029a.m74001l0();
                }
            });
            this.f49951g.setTextColor(getResources().getColor(h1c0.f105310H));
        }
        boolean z2 = bLiveScrapBrief.isRightTabScrap;
        if (z) {
            View view = this.f49948d;
            if (z2) {
                view.setBackgroundResource(i3c0.f110968c6);
            } else {
                view.setBackgroundResource(i3c0.f111132q2);
            }
        } else {
            View view2 = this.f49948d;
            if (z2) {
                view2.setBackgroundResource(i3c0.f111184u6);
            } else {
                view2.setBackgroundResource(i3c0.f111100n6);
            }
        }
        m74005n0(bLiveScrapBrief.itemId);
        this.f49951g.setText(m3e0.m152844f(bLiveScrapBrief.itemId));
        m74004m0(bLiveScrapBrief);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74002j0(this);
    }

    public ScrapItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScrapItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
