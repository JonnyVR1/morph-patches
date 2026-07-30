package com.p051p1.mobile.putong.feed.newui.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p151v.VRelative;
import p153l.rfh;

/* JADX INFO: loaded from: classes13.dex */
public class FeedMomentBoostDialogItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public TextView f40782d;

    /* JADX INFO: renamed from: e */
    public TextView f40783e;

    public FeedMomentBoostDialogItemView(Context context) {
        super(context);
        m63046q(context);
    }

    /* JADX INFO: renamed from: q */
    private void m63046q(Context context) {
        addView(m63047p(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: p */
    public View m63047p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rfh.m181208b(this, layoutInflater, viewGroup);
    }

    public FeedMomentBoostDialogItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m63046q(context);
    }

    public FeedMomentBoostDialogItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m63046q(context);
    }
}
