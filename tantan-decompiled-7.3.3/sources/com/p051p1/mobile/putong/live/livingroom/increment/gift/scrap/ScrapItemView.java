package com.p051p1.mobile.putong.live.livingroom.increment.gift.scrap;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveScrapBrief;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.n9c0;
import p153l.obc0;
import p153l.qa00;
import p153l.qbe0;
import p153l.qce0;

/* JADX INFO: loaded from: classes4.dex */
public class ScrapItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public View f50796d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f50797e;

    /* JADX INFO: renamed from: f */
    public View f50798f;

    /* JADX INFO: renamed from: g */
    public VText f50799g;

    public ScrapItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m75184l0() {
        if (getMeasuredWidth() >= qa00.m175859d(132.0f)) {
            getLayoutParams().width = qa00.m175859d(66.0f);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m75185j0(View view) {
        qce0.m176122a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m75186k0() {
        if (getMeasuredWidth() < qa00.m175859d(132.0f)) {
            getLayoutParams().width = qa00.m175859d(132.0f);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m75187m0(BLiveScrapBrief bLiveScrapBrief) {
        if (bLiveScrapBrief.itemStock.count <= 0) {
            bnl0.m105524M(this.f50798f, false);
            return;
        }
        long j = bLiveScrapBrief.targetItem.cost;
        if (j == 0) {
            j = 1;
        }
        int i = (int) (bLiveScrapBrief.remainCount / j);
        View view = this.f50798f;
        if (i <= 0) {
            bnl0.m105524M(view, false);
        } else {
            bnl0.m105524M(view, true);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m75188n0(String str) {
        izs.m142869t("context_single_room", this.f50797e, qbe0.m176027e(str), qa00.m175859d(46.0f));
    }

    /* JADX INFO: renamed from: o0 */
    public void m75189o0(BLiveScrapBrief bLiveScrapBrief, boolean z) {
        if (bLiveScrapBrief.isRightTabScrap) {
            post(new Runnable() { // from class: l.oce0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f146697a.m75186k0();
                }
            });
            this.f50799g.setTextColor(getResources().getColor(n9c0.f140801W));
        } else {
            post(new Runnable() { // from class: l.pce0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f151572a.m75184l0();
                }
            });
            this.f50799g.setTextColor(getResources().getColor(n9c0.f140771H));
        }
        boolean z2 = bLiveScrapBrief.isRightTabScrap;
        if (z) {
            View view = this.f50796d;
            if (z2) {
                view.setBackgroundResource(obc0.f146296c6);
            } else {
                view.setBackgroundResource(obc0.f146460q2);
            }
        } else {
            View view2 = this.f50796d;
            if (z2) {
                view2.setBackgroundResource(obc0.f146512u6);
            } else {
                view2.setBackgroundResource(obc0.f146428n6);
            }
        }
        m75188n0(bLiveScrapBrief.itemId);
        this.f50799g.setText(qbe0.m176028f(bLiveScrapBrief.itemId));
        m75187m0(bLiveScrapBrief);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75185j0(this);
    }

    public ScrapItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScrapItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
