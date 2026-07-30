package com.p000p1.mobile.putong.feed.newui.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p007l.ceh;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedMomentBoostDialogItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public TextView f1395d;

    /* JADX INFO: renamed from: e */
    public TextView f1396e;

    public FeedMomentBoostDialogItemView(Context context) {
        super(context);
        m2830q(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    private void m2830q(Context context) {
        addView(m2831p(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: p */
    public View m2831p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ceh.m9127b(this, layoutInflater, viewGroup);
    }

    public FeedMomentBoostDialogItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2830q(context);
    }

    public FeedMomentBoostDialogItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2830q(context);
    }
}
