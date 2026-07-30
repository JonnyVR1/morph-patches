package com.p000p1.mobile.putong.feed.newui.status.entrance.followheader;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.vwb;
import p007l.f3c0;
import p007l.vqg;
import p007l.y0i;
import v.VDraweeView;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedStateHeaderItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public FeedVDraweeView f4394a;

    /* JADX INFO: renamed from: b */
    public TextView f4395b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f4396c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f4397d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4398e;

    public FeedStateHeaderItem(Context context) {
        super(context);
        m6924s(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    private void m6924s(Context context) {
        addView(m6925p(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: p */
    public View m6925p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return y0i.m16885b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: u */
    public void m6926u(BubbleInfo bubbleInfo, int i) {
        User userM16628e8 = FeedModule.f316d.m16628e8(bubbleInfo.owner.f264id);
        this.f4394a.m6931u(userM16628e8);
        this.f4397d.setVisibility(8);
        if (i == 0 && (bubbleInfo instanceof MineAskPostState)) {
            this.f4396c.setBackgroundResource(f3c0.f7604F0);
            this.f4398e.setVisibility(8);
            this.f4397d.setVisibility(8);
        } else {
            this.f4396c.setBackgroundResource(f3c0.f7612G0);
            vqg.m15476F0(this.f4398e, bubbleInfo.emotion.emojiUrl);
            this.f4398e.setVisibility(0);
            this.f4397d.setVisibility(0);
            if (!NullChecker.a(bubbleInfo) || vwb.J(bubbleInfo.emotion.backgroundColor)) {
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(Color.parseColor("#000000"));
                this.f4397d.setBackground(shapeDrawable);
            } else {
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                try {
                    shapeDrawable2.getPaint().setColor(Color.parseColor(bubbleInfo.emotion.backgroundColor.get(0)));
                } catch (IllegalArgumentException e) {
                    shapeDrawable2.getPaint().setColor(Color.parseColor("#FFFFFF"));
                    CrashHelper.c(e);
                }
                this.f4397d.setBackground(shapeDrawable2);
            }
        }
        TextView textView = this.f4395b;
        if (i == 0) {
            textView.setText(FeedModule.f313a.getString(R$string.f502d2));
        } else {
            textView.setText(userM16628e8.name);
        }
    }

    public FeedStateHeaderItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6924s(context);
    }

    public FeedStateHeaderItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6924s(context);
    }
}
