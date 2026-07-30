package com.p000p1.mobile.putong.feed.newui.group.interactive;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.data.Interactive;
import l.nvc0;
import l.qib0;
import l.ym2;
import p007l.u8h;
import v.VDraweeView;
import v.VFrame;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedInteractiveItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VLinear f1588a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f1589b;

    /* JADX INFO: renamed from: c */
    public TextView f1590c;

    public FeedInteractiveItemView(Context context) {
        super(context);
        m3031s(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    private void m3031s(Context context) {
        addView(m3032p(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: p */
    public View m3032p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return u8h.m14788b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: u */
    public void m3033u(Interactive interactive) {
        if (interactive == null) {
            return;
        }
        this.f1590c.setText(interactive.title);
        qib0.G.O0(this.f1589b, interactive.icon, true, false, (nvc0) null, (ym2) null);
    }

    public FeedInteractiveItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3031s(context);
    }

    public FeedInteractiveItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3031s(context);
    }
}
