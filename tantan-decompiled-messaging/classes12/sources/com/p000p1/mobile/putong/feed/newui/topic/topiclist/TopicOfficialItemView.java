package com.p000p1.mobile.putong.feed.newui.topic.topiclist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import l.t100;
import l.xdl0;
import p007l.i0j0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TopicOfficialItemView extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final float f4692c = t100.d(12.0f);

    /* JADX INFO: renamed from: a */
    public VText f4693a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f4694b;

    public TopicOfficialItemView(@NonNull Context context) {
        super(context);
        m7282a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7282a(Context context) {
        addView(i0j0.m10756b(this, LayoutInflater.from(context), this));
        int iY0 = (int) (((double) (xdl0.y0() - (t100.d(12.0f) * 2))) / 2.45d);
        ViewGroup.LayoutParams layoutParams = this.f4694b.getLayoutParams();
        layoutParams.height = iY0;
        this.f4694b.setLayoutParams(layoutParams);
        RoundingParams roundingParams = new RoundingParams();
        float f = f4692c;
        roundingParams.r(f, f, f, f);
        this.f4694b.getHierarchy().H(roundingParams);
        this.f4694b.setElevation(15.0f);
    }

    public TopicOfficialItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m7282a(context);
    }

    public TopicOfficialItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7282a(context);
    }
}
