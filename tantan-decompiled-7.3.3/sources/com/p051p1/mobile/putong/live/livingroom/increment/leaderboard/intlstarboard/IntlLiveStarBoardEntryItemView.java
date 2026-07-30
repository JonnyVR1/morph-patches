package com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;
import p151v.VMarqueeText;
import p153l.bnl0;
import p153l.izs;
import p153l.obc0;
import p153l.qa00;
import p153l.x9o;
import p153l.y9o;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class IntlLiveStarBoardEntryItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public IntlLiveStarBoardEntryItemView f51595a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f51596b;

    /* JADX INFO: renamed from: c */
    public VMarqueeText f51597c;

    /* JADX INFO: renamed from: d */
    public y9o f51598d;

    public IntlLiveStarBoardEntryItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m76109a(View view) {
        x9o.m209806a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m76110b(y9o y9oVar) {
        this.f51598d = y9oVar;
        bnl0.m105552e0(this.f51595a, 0);
        this.f51597c.setText(y9oVar.f198110b);
        boolean zIsEmpty = TextUtils.isEmpty(y9oVar.f198109a);
        VDraweeView vDraweeView = this.f51596b;
        if (zIsEmpty) {
            vDraweeView.setImageDrawable(getContext().getDrawable(obc0.f146400l2));
        } else {
            izs.m142869t("context_livingAct", vDraweeView, y9oVar.f198109a, qa00.f156327n);
        }
        this.f51597c.requestFocus();
        if (y9oVar.f198112d) {
            m76113e();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m76111c(y9o y9oVar) {
        this.f51598d = y9oVar;
        this.f51597c.setSingleLine(true);
        this.f51597c.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f51597c.setMarqueeRepeatLimit(-1);
        this.f51597c.setFocusable(true);
        this.f51597c.setFocusableInTouchMode(true);
        this.f51597c.requestFocus();
        this.f51597c.setText(y9oVar.f198110b);
    }

    /* JADX INFO: renamed from: d */
    public void m76112d() {
        this.f51597c.setText(zrv.f205803e.getString(R$string.f48452w7));
        this.f51596b.setImageDrawable(getContext().getDrawable(obc0.f146400l2));
    }

    /* JADX INFO: renamed from: e */
    public void m76113e() {
        this.f51597c.setTextSize(10.0f);
    }

    public y9o getEntryModel() {
        return this.f51598d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76109a(this);
    }

    public IntlLiveStarBoardEntryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveStarBoardEntryItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
