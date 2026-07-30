package com.p046p1.mobile.putong.feed.newui.group.interactive;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.data.Interactive;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p149l.qib0;
import p149l.u8h;

/* JADX INFO: loaded from: classes12.dex */
public class FeedInteractiveItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VLinear f40127a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f40128b;

    /* JADX INFO: renamed from: c */
    public TextView f40129c;

    public FeedInteractiveItemView(Context context) {
        super(context);
        m62050s(context);
    }

    /* JADX INFO: renamed from: s */
    private void m62050s(Context context) {
        addView(m62051p(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: p */
    public View m62051p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return u8h.m192204b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: u */
    public void m62052u(Interactive interactive) {
        if (interactive == null) {
            return;
        }
        this.f40129c.setText(interactive.title);
        qib0.f154691G.m102337O0(this.f40128b, interactive.icon, true, false, null, null);
    }

    public FeedInteractiveItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m62050s(context);
    }

    public FeedInteractiveItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m62050s(context);
    }
}
