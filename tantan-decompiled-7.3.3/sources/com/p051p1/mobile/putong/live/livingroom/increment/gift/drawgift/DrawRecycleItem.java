package com.p051p1.mobile.putong.live.livingroom.increment.gift.drawgift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.a9g0;
import p153l.bnl0;
import p153l.izs;
import p153l.jce;
import p153l.obc0;
import p153l.qbe;
import p153l.x20;
import p153l.zft;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class DrawRecycleItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public DrawRecycleItem f50443a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f50444b;

    /* JADX INFO: renamed from: c */
    public VLinear f50445c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f50446d;

    /* JADX INFO: renamed from: e */
    public VText f50447e;

    /* JADX INFO: renamed from: f */
    public VText f50448f;

    /* JADX INFO: renamed from: g */
    public VLinear f50449g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f50450h;

    /* JADX INFO: renamed from: i */
    public VText f50451i;

    /* JADX INFO: renamed from: j */
    public VText f50452j;

    /* JADX INFO: renamed from: k */
    public TextView f50453k;

    /* JADX INFO: renamed from: l */
    public x20 f50454l;

    /* JADX INFO: renamed from: m */
    public x20 f50455m;

    public DrawRecycleItem(Context context) {
        super(context);
        this.f50454l = null;
        this.f50455m = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m74731c(View view) {
        jce.m144355a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m74732d(View view) {
        x20 x20Var = this.f50454l;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m74733e(View view) {
        x20 x20Var = this.f50455m;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m74734f(qbe qbeVar) {
        BLiveGiftItem bLiveGiftItem = qbeVar.f156468a;
        boolean z = qbeVar.f156469b;
        VLinear vLinear = this.f50445c;
        if (z) {
            bnl0.m105524M(vLinear, false);
            bnl0.m105524M(this.f50449g, true);
            izs.m142868s("context_livingAct", this.f50444b, zft.f204224s);
            int i = qbeVar.f156471d;
            int iM203626g4 = zrv.m221193k().m203626g4();
            TextView textView = this.f50453k;
            if (i >= iM203626g4) {
                textView.setEnabled(true);
                this.f50453k.setTextColor(-1);
                this.f50453k.setBackgroundResource(obc0.f145966A0);
            } else {
                textView.setEnabled(false);
                this.f50453k.setTextColor(-2130706433);
                this.f50453k.setBackgroundResource(obc0.f146222W0);
            }
            izs.m142868s("context_livingAct", this.f50450h, bLiveGiftItem.url);
            this.f50451i.setText(bLiveGiftItem.getLocalName());
            this.f50452j.setText(String.format("%s探探币", a9g0.m96569d(bLiveGiftItem.getPrice())));
            this.f50453k.setOnClickListener(new View.OnClickListener() { // from class: l.hce
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f108689a.m74732d(view);
                }
            });
        } else {
            bnl0.m105524M(vLinear, true);
            bnl0.m105524M(this.f50449g, false);
            this.f50444b.setController(null);
            this.f50444b.setBackgroundResource(obc0.f146279b1);
            izs.m142868s("context_livingAct", this.f50446d, bLiveGiftItem.url);
            this.f50447e.setText(bLiveGiftItem.getLocalName());
            this.f50448f.setText(String.format("%s探探币", a9g0.m96569d(bLiveGiftItem.getPrice())));
        }
        this.f50443a.setOnClickListener(new View.OnClickListener() { // from class: l.ice
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114402a.m74733e(view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74731c(this);
    }

    public DrawRecycleItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50454l = null;
        this.f50455m = null;
    }

    public DrawRecycleItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50454l = null;
        this.f50455m = null;
    }
}
