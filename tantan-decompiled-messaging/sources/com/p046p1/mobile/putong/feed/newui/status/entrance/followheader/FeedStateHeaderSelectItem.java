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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p149l.bkb0;
import p149l.f3c0;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.z0i;

/* JADX INFO: loaded from: classes12.dex */
public class FeedStateHeaderSelectItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public View f42938d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f42939e;

    /* JADX INFO: renamed from: f */
    public TextView f42940f;

    public FeedStateHeaderSelectItem(Context context) {
        super(context);
        m65781j0(context);
    }

    /* JADX INFO: renamed from: j0 */
    private void m65781j0(Context context) {
        addView(m65782h0(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: h0 */
    public View m65782h0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return z0i.m216750b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i0 */
    public final int m65783i0(float f, int i) {
        return (Math.min(255, Math.max(0, (int) (f * 255.0f))) << 24) + (16777215 & i);
    }

    /* JADX INFO: renamed from: k0 */
    public void m65784k0(BubbleInfo bubbleInfo) {
        this.f42938d.setBackgroundResource(f3c0.f94329G0);
        if (!NullChecker.m81303a(bubbleInfo) || vwb.m200296J(bubbleInfo.emotion.backgroundColor)) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(m65783i0(0.3f, Color.parseColor(Constants.BLACK)));
            this.f42938d.setBackground(shapeDrawable);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
            try {
                shapeDrawable2.getPaint().setColor(m65783i0(0.3f, Color.parseColor(bubbleInfo.emotion.backgroundColor.get(0))));
            } catch (IllegalArgumentException e) {
                shapeDrawable2.getPaint().setColor(m65783i0(0.3f, Color.parseColor("#FFFFFF")));
                CrashHelper.m81296c(e);
            }
            this.f42938d.setBackground(shapeDrawable2);
        }
        if (NullChecker.m81303a(bubbleInfo)) {
            bkb0 bkb0Var = qib0.f154691G;
            VDraweeView vDraweeView = this.f42939e;
            String str = bubbleInfo.emotion.emojiUrl;
            int i = t100.f167275x;
            bkb0Var.m102325I0(vDraweeView, str, i, i);
            this.f42939e.setVisibility(0);
            this.f42940f.setText(bubbleInfo.emotion.text);
        }
    }

    public FeedStateHeaderSelectItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m65781j0(context);
    }

    public FeedStateHeaderSelectItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65781j0(context);
    }
}
