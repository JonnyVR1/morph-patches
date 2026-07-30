package com.p046p1.mobile.putong.feed.newui.status.selectstatus.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p147v.AutoVDraweeView;
import p147v.VDraweeView;
import p147v.VLinear;
import p149l.dyh;
import p149l.eyh;
import p149l.fyh;
import p149l.nkg;
import p149l.qib0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedSelectStatusItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f42993c;

    /* JADX INFO: renamed from: d */
    public AutoVDraweeView f42994d;

    /* JADX INFO: renamed from: e */
    public TextView f42995e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f42996f;

    /* JADX INFO: renamed from: g */
    public TextView f42997g;

    /* JADX INFO: renamed from: h */
    public fyh f42998h;

    public FeedSelectStatusItem(Context context) {
        super(context);
        m65833R(context);
    }

    /* JADX INFO: renamed from: R */
    private void m65833R(Context context) {
        if (nkg.m159840A() || nkg.m159909u0()) {
            addView(m65835Q(LayoutInflater.from(context), this));
        } else {
            addView(m65834P(LayoutInflater.from(context), this));
        }
    }

    /* JADX INFO: renamed from: P */
    public View m65834P(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dyh.m114073b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Q */
    public View m65835Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return eyh.m118766b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S */
    public void m65836S(fyh fyhVar) {
        this.f42998h = fyhVar;
        if (!nkg.m159840A() && !nkg.m159909u0()) {
            qib0.f154691G.m102331L0(this.f42996f, fyhVar.m123768c());
            this.f42997g.setText(fyhVar.m123769d());
        } else {
            this.f42994d.m222887x(fyhVar.m123768c(), 1);
            this.f42995e.setText(fyhVar.m123769d());
            setSelected(false);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m65837T(int i, int i2) {
        if (nkg.m159840A() || nkg.m159909u0()) {
            this.f42993c.setPadding(0, i, 0, i2);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m65838V(boolean z) {
        setSelected(z);
    }

    public FeedSelectStatusItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m65833R(context);
    }

    public FeedSelectStatusItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65833R(context);
    }
}
