package com.p051p1.mobile.putong.feed.newui.status.entrance.followheader;

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
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.jyb;
import p153l.ksg;
import p153l.lbc0;
import p153l.n2i;

/* JADX INFO: loaded from: classes13.dex */
public class FeedStateHeaderItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public FeedVDraweeView f43781a;

    /* JADX INFO: renamed from: b */
    public TextView f43782b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f43783c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f43784d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f43785e;

    public FeedStateHeaderItem(Context context) {
        super(context);
        m66961s(context);
    }

    /* JADX INFO: renamed from: s */
    private void m66961s(Context context) {
        addView(m66962p(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: p */
    public View m66962p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return n2i.m161233b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: u */
    public void m66963u(BubbleInfo bubbleInfo, int i) {
        User userM145688e8 = FeedModule.f39703d.m145688e8(bubbleInfo.owner.f39651id);
        this.f43781a.m66968u(userM145688e8);
        this.f43784d.setVisibility(8);
        if (i == 0 && (bubbleInfo instanceof MineAskPostState)) {
            this.f43783c.setBackgroundResource(lbc0.f130839F0);
            this.f43785e.setVisibility(8);
            this.f43784d.setVisibility(8);
        } else {
            this.f43783c.setBackgroundResource(lbc0.f130847G0);
            ksg.m151165F0(this.f43785e, bubbleInfo.emotion.emojiUrl);
            this.f43785e.setVisibility(0);
            this.f43784d.setVisibility(0);
            if (!NullChecker.m82486a(bubbleInfo) || jyb.m147479J(bubbleInfo.emotion.backgroundColor)) {
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(Color.parseColor(Constants.BLACK));
                this.f43784d.setBackground(shapeDrawable);
            } else {
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                try {
                    shapeDrawable2.getPaint().setColor(Color.parseColor(bubbleInfo.emotion.backgroundColor.get(0)));
                } catch (IllegalArgumentException e) {
                    shapeDrawable2.getPaint().setColor(Color.parseColor("#FFFFFF"));
                    CrashHelper.m82479c(e);
                }
                this.f43784d.setBackground(shapeDrawable2);
            }
        }
        TextView textView = this.f43782b;
        if (i == 0) {
            textView.setText(FeedModule.f39700a.getString(R$string.f39889d2));
        } else {
            textView.setText(userM145688e8.name);
        }
    }

    public FeedStateHeaderItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m66961s(context);
    }

    public FeedStateHeaderItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66961s(context);
    }
}
