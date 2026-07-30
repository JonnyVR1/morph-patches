package com.p046p1.mobile.putong.feed.newui.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p147v.VRelative;
import p149l.ceh;

/* JADX INFO: loaded from: classes12.dex */
public class FeedMomentBoostDialogItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public TextView f39934d;

    /* JADX INFO: renamed from: e */
    public TextView f39935e;

    public FeedMomentBoostDialogItemView(Context context) {
        super(context);
        m61863q(context);
    }

    /* JADX INFO: renamed from: q */
    private void m61863q(Context context) {
        addView(m61864p(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: p */
    public View m61864p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ceh.m106318b(this, layoutInflater, viewGroup);
    }

    public FeedMomentBoostDialogItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m61863q(context);
    }

    public FeedMomentBoostDialogItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m61863q(context);
    }
}
