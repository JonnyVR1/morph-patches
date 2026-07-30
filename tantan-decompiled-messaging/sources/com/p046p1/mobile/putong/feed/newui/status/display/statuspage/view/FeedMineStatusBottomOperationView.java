package com.p046p1.mobile.putong.feed.newui.status.display.statuspage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p147v.VFrame;
import p147v.VText;
import p149l.mdh;

/* JADX INFO: loaded from: classes12.dex */
public class FeedMineStatusBottomOperationView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VText f42895a;

    /* JADX INFO: renamed from: b */
    public TextView f42896b;

    /* JADX INFO: renamed from: c */
    public TextView f42897c;

    public FeedMineStatusBottomOperationView(Context context) {
        super(context);
        m65724s(context);
    }

    /* JADX INFO: renamed from: s */
    private void m65724s(Context context) {
        addView(m65725p(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: p */
    public View m65725p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mdh.m154064b(this, layoutInflater, viewGroup);
    }

    public FeedMineStatusBottomOperationView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m65724s(context);
    }

    public FeedMineStatusBottomOperationView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65724s(context);
    }
}
