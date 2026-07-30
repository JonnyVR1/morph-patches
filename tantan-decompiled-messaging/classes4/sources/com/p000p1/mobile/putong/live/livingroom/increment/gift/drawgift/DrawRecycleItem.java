package com.p000p1.mobile.putong.live.livingroom.increment.gift.drawgift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import l.d30;
import l.hce;
import l.hxs;
import l.t0g0;
import l.xdl0;
import l.ydt;
import l.ypv;
import p002l.fbe;
import p002l.i3c0;
import p002l.mae;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class DrawRecycleItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public DrawRecycleItem f5637a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f5638b;

    /* JADX INFO: renamed from: c */
    public VLinear f5639c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f5640d;

    /* JADX INFO: renamed from: e */
    public VText f5641e;

    /* JADX INFO: renamed from: f */
    public VText f5642f;

    /* JADX INFO: renamed from: g */
    public VLinear f5643g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f5644h;

    /* JADX INFO: renamed from: i */
    public VText f5645i;

    /* JADX INFO: renamed from: j */
    public VText f5646j;

    /* JADX INFO: renamed from: k */
    public TextView f5647k;

    /* JADX INFO: renamed from: l */
    public d30 f5648l;

    /* JADX INFO: renamed from: m */
    public d30 f5649m;

    public DrawRecycleItem(Context context) {
        super(context);
        this.f5648l = null;
        this.f5649m = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m7092c(View view) {
        fbe.m13047a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m7093d(View view) {
        d30 d30Var = this.f5648l;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m7094e(View view) {
        d30 d30Var = this.f5649m;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m7095f(mae maeVar) {
        BLiveGiftItem bLiveGiftItem = maeVar.f15294a;
        boolean z = maeVar.f15295b;
        VLinear vLinear = this.f5639c;
        if (z) {
            xdl0.M(vLinear, false);
            xdl0.M(this.f5643g, true);
            hxs.s("context_livingAct", this.f5638b, ydt.s);
            int i = maeVar.f15297d;
            int iG4 = ypv.k().g4();
            TextView textView = this.f5647k;
            if (i >= iG4) {
                textView.setEnabled(true);
                this.f5647k.setTextColor(-1);
                this.f5647k.setBackgroundResource(i3c0.f12423A0);
            } else {
                textView.setEnabled(false);
                this.f5647k.setTextColor(-2130706433);
                this.f5647k.setBackgroundResource(i3c0.f12679W0);
            }
            hxs.s("context_livingAct", this.f5644h, bLiveGiftItem.url);
            this.f5645i.setText(bLiveGiftItem.getLocalName());
            this.f5646j.setText(String.format("%s探探币", t0g0.d(bLiveGiftItem.getPrice())));
            this.f5647k.setOnClickListener(new View.OnClickListener() { // from class: l.dbe
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9155a.m7093d(view);
                }
            });
        } else {
            xdl0.M(vLinear, true);
            xdl0.M(this.f5643g, false);
            this.f5638b.setController((hce) null);
            this.f5638b.setBackgroundResource(i3c0.f12736b1);
            hxs.s("context_livingAct", this.f5640d, bLiveGiftItem.url);
            this.f5641e.setText(bLiveGiftItem.getLocalName());
            this.f5642f.setText(String.format("%s探探币", t0g0.d(bLiveGiftItem.getPrice())));
        }
        this.f5637a.setOnClickListener(new View.OnClickListener() { // from class: l.ebe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9659a.m7094e(view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7092c(this);
    }

    public DrawRecycleItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5648l = null;
        this.f5649m = null;
    }

    public DrawRecycleItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5648l = null;
        this.f5649m = null;
    }
}
