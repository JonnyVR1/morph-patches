package com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;
import p147v.VMarqueeText;
import p149l.hxs;
import p149l.i3c0;
import p149l.t100;
import p149l.x7o;
import p149l.xdl0;
import p149l.y7o;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class IntlLiveStarBoardEntryItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public IntlLiveStarBoardEntryItemView f50747a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f50748b;

    /* JADX INFO: renamed from: c */
    public VMarqueeText f50749c;

    /* JADX INFO: renamed from: d */
    public y7o f50750d;

    public IntlLiveStarBoardEntryItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m74926a(View view) {
        x7o.m207303a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m74927b(y7o y7oVar) {
        this.f50750d = y7oVar;
        xdl0.m208372e0(this.f50747a, 0);
        this.f50749c.setText(y7oVar.f196717b);
        boolean zIsEmpty = TextUtils.isEmpty(y7oVar.f196716a);
        VDraweeView vDraweeView = this.f50748b;
        if (zIsEmpty) {
            vDraweeView.setImageDrawable(getContext().getDrawable(i3c0.f111072l2));
        } else {
            hxs.m133407t("context_livingAct", vDraweeView, y7oVar.f196716a, t100.f167265n);
        }
        this.f50749c.requestFocus();
        if (y7oVar.f196719d) {
            m74930e();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m74928c(y7o y7oVar) {
        this.f50750d = y7oVar;
        this.f50749c.setSingleLine(true);
        this.f50749c.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f50749c.setMarqueeRepeatLimit(-1);
        this.f50749c.setFocusable(true);
        this.f50749c.setFocusableInTouchMode(true);
        this.f50749c.requestFocus();
        this.f50749c.setText(y7oVar.f196717b);
    }

    /* JADX INFO: renamed from: d */
    public void m74929d() {
        this.f50749c.setText(ypv.f199497e.getString(R$string.f47604w7));
        this.f50748b.setImageDrawable(getContext().getDrawable(i3c0.f111072l2));
    }

    /* JADX INFO: renamed from: e */
    public void m74930e() {
        this.f50749c.setTextSize(10.0f);
    }

    public y7o getEntryModel() {
        return this.f50750d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74926a(this);
    }

    public IntlLiveStarBoardEntryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveStarBoardEntryItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
