package com.p046p1.mobile.putong.live.livingroom.increment.gift.drawgift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.d30;
import p149l.fbe;
import p149l.hxs;
import p149l.i3c0;
import p149l.mae;
import p149l.t0g0;
import p149l.xdl0;
import p149l.ydt;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class DrawRecycleItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public DrawRecycleItem f49595a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f49596b;

    /* JADX INFO: renamed from: c */
    public VLinear f49597c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f49598d;

    /* JADX INFO: renamed from: e */
    public VText f49599e;

    /* JADX INFO: renamed from: f */
    public VText f49600f;

    /* JADX INFO: renamed from: g */
    public VLinear f49601g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f49602h;

    /* JADX INFO: renamed from: i */
    public VText f49603i;

    /* JADX INFO: renamed from: j */
    public VText f49604j;

    /* JADX INFO: renamed from: k */
    public TextView f49605k;

    /* JADX INFO: renamed from: l */
    public d30 f49606l;

    /* JADX INFO: renamed from: m */
    public d30 f49607m;

    public DrawRecycleItem(Context context) {
        super(context);
        this.f49606l = null;
        this.f49607m = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m73548c(View view) {
        fbe.m120351a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m73549d(View view) {
        d30 d30Var = this.f49606l;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m73550e(View view) {
        d30 d30Var = this.f49607m;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m73551f(mae maeVar) {
        BLiveGiftItem bLiveGiftItem = maeVar.f132843a;
        boolean z = maeVar.f132844b;
        VLinear vLinear = this.f49597c;
        if (z) {
            xdl0.m208344M(vLinear, false);
            xdl0.m208344M(this.f49601g, true);
            hxs.m133406s("context_livingAct", this.f49596b, ydt.f197629s);
            int i = maeVar.f132846d;
            int iM195839g4 = ypv.m215672k().m195839g4();
            TextView textView = this.f49605k;
            if (i >= iM195839g4) {
                textView.setEnabled(true);
                this.f49605k.setTextColor(-1);
                this.f49605k.setBackgroundResource(i3c0.f110638A0);
            } else {
                textView.setEnabled(false);
                this.f49605k.setTextColor(-2130706433);
                this.f49605k.setBackgroundResource(i3c0.f110894W0);
            }
            hxs.m133406s("context_livingAct", this.f49602h, bLiveGiftItem.url);
            this.f49603i.setText(bLiveGiftItem.getLocalName());
            this.f49604j.setText(String.format("%s探探币", t0g0.m186863d(bLiveGiftItem.getPrice())));
            this.f49605k.setOnClickListener(new View.OnClickListener() { // from class: l.dbe
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f85310a.m73549d(view);
                }
            });
        } else {
            xdl0.m208344M(vLinear, true);
            xdl0.m208344M(this.f49601g, false);
            this.f49596b.setController(null);
            this.f49596b.setBackgroundResource(i3c0.f110951b1);
            hxs.m133406s("context_livingAct", this.f49598d, bLiveGiftItem.url);
            this.f49599e.setText(bLiveGiftItem.getLocalName());
            this.f49600f.setText(String.format("%s探探币", t0g0.m186863d(bLiveGiftItem.getPrice())));
        }
        this.f49595a.setOnClickListener(new View.OnClickListener() { // from class: l.ebe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90319a.m73550e(view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73548c(this);
    }

    public DrawRecycleItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49606l = null;
        this.f49607m = null;
    }

    public DrawRecycleItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49606l = null;
        this.f49607m = null;
    }
}
