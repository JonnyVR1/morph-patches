package com.p046p1.mobile.putong.feed.newui.status.entrance.followheader;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame;
import p149l.f3c0;
import p149l.vqg;
import p149l.vwb;
import p149l.y0i;

/* JADX INFO: loaded from: classes12.dex */
public class FeedStateHeaderItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public FeedVDraweeView f42933a;

    /* JADX INFO: renamed from: b */
    public TextView f42934b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f42935c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f42936d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f42937e;

    public FeedStateHeaderItem(Context context) {
        super(context);
        m65778s(context);
    }

    /* JADX INFO: renamed from: s */
    private void m65778s(Context context) {
        addView(m65779p(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: p */
    public View m65779p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return y0i.m212122b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: u */
    public void m65780u(BubbleInfo bubbleInfo, int i) {
        User userM209447e8 = FeedModule.f38855d.m209447e8(bubbleInfo.owner.f38803id);
        this.f42933a.m65785u(userM209447e8);
        this.f42936d.setVisibility(8);
        if (i == 0 && (bubbleInfo instanceof MineAskPostState)) {
            this.f42935c.setBackgroundResource(f3c0.f94321F0);
            this.f42937e.setVisibility(8);
            this.f42936d.setVisibility(8);
        } else {
            this.f42935c.setBackgroundResource(f3c0.f94329G0);
            vqg.m199506F0(this.f42937e, bubbleInfo.emotion.emojiUrl);
            this.f42937e.setVisibility(0);
            this.f42936d.setVisibility(0);
            if (!NullChecker.m81303a(bubbleInfo) || vwb.m200296J(bubbleInfo.emotion.backgroundColor)) {
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(Color.parseColor(Constants.BLACK));
                this.f42936d.setBackground(shapeDrawable);
            } else {
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                try {
                    shapeDrawable2.getPaint().setColor(Color.parseColor(bubbleInfo.emotion.backgroundColor.get(0)));
                } catch (IllegalArgumentException e) {
                    shapeDrawable2.getPaint().setColor(Color.parseColor("#FFFFFF"));
                    CrashHelper.m81296c(e);
                }
                this.f42936d.setBackground(shapeDrawable2);
            }
        }
        TextView textView = this.f42934b;
        if (i == 0) {
            textView.setText(FeedModule.f38852a.getString(R$string.f39041d2));
        } else {
            textView.setText(userM209447e8.name);
        }
    }

    public FeedStateHeaderItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m65778s(context);
    }

    public FeedStateHeaderItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65778s(context);
    }
}
