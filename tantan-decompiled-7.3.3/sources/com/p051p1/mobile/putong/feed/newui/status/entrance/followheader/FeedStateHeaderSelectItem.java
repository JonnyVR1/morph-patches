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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p153l.fsb0;
import p153l.jyb;
import p153l.lbc0;
import p153l.o2i;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedStateHeaderSelectItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public View f43786d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f43787e;

    /* JADX INFO: renamed from: f */
    public TextView f43788f;

    public FeedStateHeaderSelectItem(Context context) {
        super(context);
        m66964j0(context);
    }

    /* JADX INFO: renamed from: j0 */
    private void m66964j0(Context context) {
        addView(m66965h0(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: h0 */
    public View m66965h0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return o2i.m165722b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i0 */
    public final int m66966i0(float f, int i) {
        return (Math.min(255, Math.max(0, (int) (f * 255.0f))) << 24) + (16777215 & i);
    }

    /* JADX INFO: renamed from: k0 */
    public void m66967k0(BubbleInfo bubbleInfo) {
        this.f43786d.setBackgroundResource(lbc0.f130847G0);
        if (!NullChecker.m82486a(bubbleInfo) || jyb.m147479J(bubbleInfo.emotion.backgroundColor)) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(m66966i0(0.3f, Color.parseColor(Constants.BLACK)));
            this.f43786d.setBackground(shapeDrawable);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
            try {
                shapeDrawable2.getPaint().setColor(m66966i0(0.3f, Color.parseColor(bubbleInfo.emotion.backgroundColor.get(0))));
            } catch (IllegalArgumentException e) {
                shapeDrawable2.getPaint().setColor(m66966i0(0.3f, Color.parseColor("#FFFFFF")));
                CrashHelper.m82479c(e);
            }
            this.f43786d.setBackground(shapeDrawable2);
        }
        if (NullChecker.m82486a(bubbleInfo)) {
            fsb0 fsb0Var = uqb0.f180374G;
            VDraweeView vDraweeView = this.f43787e;
            String str = bubbleInfo.emotion.emojiUrl;
            int i = qa00.f156337x;
            fsb0Var.m127109I0(vDraweeView, str, i, i);
            this.f43787e.setVisibility(0);
            this.f43788f.setText(bubbleInfo.emotion.text);
        }
    }

    public FeedStateHeaderSelectItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m66964j0(context);
    }

    public FeedStateHeaderSelectItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66964j0(context);
    }
}
