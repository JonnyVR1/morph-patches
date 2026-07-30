package com.p000p1.mobile.putong.feed.newui.status.selectstatus.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.qib0;
import p007l.dyh;
import p007l.eyh;
import p007l.fyh;
import p007l.nkg;
import v.AutoVDraweeView;
import v.VDraweeView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedSelectStatusItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f4454c;

    /* JADX INFO: renamed from: d */
    public AutoVDraweeView f4455d;

    /* JADX INFO: renamed from: e */
    public TextView f4456e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f4457f;

    /* JADX INFO: renamed from: g */
    public TextView f4458g;

    /* JADX INFO: renamed from: h */
    public fyh f4459h;

    public FeedSelectStatusItem(Context context) {
        super(context);
        m6980R(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    private void m6980R(Context context) {
        if (nkg.m12199A() || nkg.m12268u0()) {
            addView(m6982Q(LayoutInflater.from(context), this));
        } else {
            addView(m6981P(LayoutInflater.from(context), this));
        }
    }

    /* JADX INFO: renamed from: P */
    public View m6981P(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dyh.m9588b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Q */
    public View m6982Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return eyh.m9965b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public void m6983S(fyh fyhVar) {
        this.f4459h = fyhVar;
        if (!nkg.m12199A() && !nkg.m12268u0()) {
            qib0.G.L0(this.f4457f, fyhVar.m10329c());
            this.f4458g.setText(fyhVar.m10330d());
        } else {
            this.f4455d.x(fyhVar.m10329c(), 1);
            this.f4456e.setText(fyhVar.m10330d());
            setSelected(false);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m6984T(int i, int i2) {
        if (nkg.m12199A() || nkg.m12268u0()) {
            this.f4454c.setPadding(0, i, 0, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V */
    public void m6985V(boolean z) {
        setSelected(z);
    }

    public FeedSelectStatusItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6980R(context);
    }

    public FeedSelectStatusItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6980R(context);
    }
}
