package com.p051p1.mobile.putong.feed.newui.status.selectstatus.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p151v.AutoVDraweeView;
import p151v.VDraweeView;
import p151v.VLinear;
import p153l.cmg;
import p153l.szh;
import p153l.tzh;
import p153l.uqb0;
import p153l.uzh;

/* JADX INFO: loaded from: classes13.dex */
public class FeedSelectStatusItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f43841c;

    /* JADX INFO: renamed from: d */
    public AutoVDraweeView f43842d;

    /* JADX INFO: renamed from: e */
    public TextView f43843e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f43844f;

    /* JADX INFO: renamed from: g */
    public TextView f43845g;

    /* JADX INFO: renamed from: h */
    public uzh f43846h;

    public FeedSelectStatusItem(Context context) {
        super(context);
        m67016R(context);
    }

    /* JADX INFO: renamed from: R */
    private void m67016R(Context context) {
        if (cmg.m111169A() || cmg.m111238u0()) {
            addView(m67018Q(LayoutInflater.from(context), this));
        } else {
            addView(m67017P(LayoutInflater.from(context), this));
        }
    }

    /* JADX INFO: renamed from: P */
    public View m67017P(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return szh.m188647b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Q */
    public View m67018Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tzh.m193662b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S */
    public void m67019S(uzh uzhVar) {
        this.f43846h = uzhVar;
        if (!cmg.m111169A() && !cmg.m111238u0()) {
            uqb0.f180374G.m127115L0(this.f43844f, uzhVar.m198835c());
            this.f43845g.setText(uzhVar.m198836d());
        } else {
            this.f43842d.m224133x(uzhVar.m198835c(), 1);
            this.f43843e.setText(uzhVar.m198836d());
            setSelected(false);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m67020T(int i, int i2) {
        if (cmg.m111169A() || cmg.m111238u0()) {
            this.f43841c.setPadding(0, i, 0, i2);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m67021V(boolean z) {
        setSelected(z);
    }

    public FeedSelectStatusItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m67016R(context);
    }

    public FeedSelectStatusItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67016R(context);
    }
}
