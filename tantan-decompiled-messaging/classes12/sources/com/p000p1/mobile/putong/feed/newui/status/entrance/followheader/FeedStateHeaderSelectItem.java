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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.bkb0;
import l.qib0;
import l.t100;
import l.vwb;
import p007l.f3c0;
import p007l.z0i;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedStateHeaderSelectItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public View f4399d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4400e;

    /* JADX INFO: renamed from: f */
    public TextView f4401f;

    public FeedStateHeaderSelectItem(Context context) {
        super(context);
        m6927j0(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    private void m6927j0(Context context) {
        addView(m6928h0(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: h0 */
    public View m6928h0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return z0i.m17205b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i0 */
    public final int m6929i0(float f, int i) {
        return (Math.min(255, Math.max(0, (int) (f * 255.0f))) << 24) + (16777215 & i);
    }

    /* JADX INFO: renamed from: k0 */
    public void m6930k0(BubbleInfo bubbleInfo) {
        this.f4399d.setBackgroundResource(f3c0.f7612G0);
        if (!NullChecker.a(bubbleInfo) || vwb.J(bubbleInfo.emotion.backgroundColor)) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(m6929i0(0.3f, Color.parseColor("#000000")));
            this.f4399d.setBackground(shapeDrawable);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
            try {
                shapeDrawable2.getPaint().setColor(m6929i0(0.3f, Color.parseColor(bubbleInfo.emotion.backgroundColor.get(0))));
            } catch (IllegalArgumentException e) {
                shapeDrawable2.getPaint().setColor(m6929i0(0.3f, Color.parseColor("#FFFFFF")));
                CrashHelper.c(e);
            }
            this.f4399d.setBackground(shapeDrawable2);
        }
        if (NullChecker.a(bubbleInfo)) {
            bkb0 bkb0Var = qib0.G;
            VDraweeView vDraweeView = this.f4400e;
            String str = bubbleInfo.emotion.emojiUrl;
            int i = t100.x;
            bkb0Var.I0(vDraweeView, str, i, i);
            this.f4400e.setVisibility(0);
            this.f4401f.setText(bubbleInfo.emotion.text);
        }
    }

    public FeedStateHeaderSelectItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6927j0(context);
    }

    public FeedStateHeaderSelectItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6927j0(context);
    }
}
