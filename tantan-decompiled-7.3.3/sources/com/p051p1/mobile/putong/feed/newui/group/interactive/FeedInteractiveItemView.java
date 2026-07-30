package com.p051p1.mobile.putong.feed.newui.group.interactive;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.data.Interactive;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p153l.jah;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedInteractiveItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VLinear f40975a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f40976b;

    /* JADX INFO: renamed from: c */
    public TextView f40977c;

    public FeedInteractiveItemView(Context context) {
        super(context);
        m63233s(context);
    }

    /* JADX INFO: renamed from: s */
    private void m63233s(Context context) {
        addView(m63234p(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: p */
    public View m63234p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jah.m144024b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: u */
    public void m63235u(Interactive interactive) {
        if (interactive == null) {
            return;
        }
        this.f40977c.setText(interactive.title);
        uqb0.f180374G.m127121O0(this.f40976b, interactive.icon, true, false, null, null);
    }

    public FeedInteractiveItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m63233s(context);
    }

    public FeedInteractiveItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m63233s(context);
    }
}
