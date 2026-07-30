package com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import l.hxs;
import l.t100;
import l.xdl0;
import l.ypv;
import p002l.i3c0;
import p002l.x7o;
import p002l.y7o;
import v.VDraweeView;
import v.VMarqueeText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class IntlLiveStarBoardEntryItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public IntlLiveStarBoardEntryItemView f6789a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f6790b;

    /* JADX INFO: renamed from: c */
    public VMarqueeText f6791c;

    /* JADX INFO: renamed from: d */
    public y7o f6792d;

    public IntlLiveStarBoardEntryItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8528a(View view) {
        x7o.m25745a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m8529b(y7o y7oVar) {
        this.f6792d = y7oVar;
        xdl0.e0(this.f6789a, 0);
        this.f6791c.setText(y7oVar.f22731b);
        boolean zIsEmpty = TextUtils.isEmpty(y7oVar.f22730a);
        VDraweeView vDraweeView = this.f6790b;
        if (zIsEmpty) {
            vDraweeView.setImageDrawable(getContext().getDrawable(i3c0.f12857l2));
        } else {
            hxs.t("context_livingAct", vDraweeView, y7oVar.f22730a, t100.n);
        }
        this.f6791c.requestFocus();
        if (y7oVar.f22733d) {
            m8532e();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m8530c(y7o y7oVar) {
        this.f6792d = y7oVar;
        this.f6791c.setSingleLine(true);
        this.f6791c.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f6791c.setMarqueeRepeatLimit(-1);
        this.f6791c.setFocusable(true);
        this.f6791c.setFocusableInTouchMode(true);
        this.f6791c.requestFocus();
        this.f6791c.setText(y7oVar.f22731b);
    }

    /* JADX INFO: renamed from: d */
    public void m8531d() {
        this.f6791c.setText(ypv.e.getString(R$string.f3646w7));
        this.f6790b.setImageDrawable(getContext().getDrawable(i3c0.f12857l2));
    }

    /* JADX INFO: renamed from: e */
    public void m8532e() {
        this.f6791c.setTextSize(10.0f);
    }

    public y7o getEntryModel() {
        return this.f6792d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8528a(this);
    }

    public IntlLiveStarBoardEntryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveStarBoardEntryItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
