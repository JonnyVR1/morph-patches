package com.p046p1.mobile.putong.feed.newui.topic.topiclist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import p147v.VDraweeView;
import p147v.VText;
import p149l.i0j0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class TopicOfficialItemView extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final float f43231c = t100.m186890d(12.0f);

    /* JADX INFO: renamed from: a */
    public VText f43232a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f43233b;

    public TopicOfficialItemView(@NonNull Context context) {
        super(context);
        m66130a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m66130a(Context context) {
        addView(i0j0.m133888b(this, LayoutInflater.from(context), this));
        int iM208412y0 = (int) (((double) (xdl0.m208412y0() - (t100.m186890d(12.0f) * 2))) / 2.45d);
        ViewGroup.LayoutParams layoutParams = this.f43233b.getLayoutParams();
        layoutParams.height = iM208412y0;
        this.f43233b.setLayoutParams(layoutParams);
        RoundingParams roundingParams = new RoundingParams();
        float f = f43231c;
        roundingParams.m8264r(f, f, f, f);
        this.f43233b.getHierarchy().m112053H(roundingParams);
        this.f43233b.setElevation(15.0f);
    }

    public TopicOfficialItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m66130a(context);
    }

    public TopicOfficialItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66130a(context);
    }
}
