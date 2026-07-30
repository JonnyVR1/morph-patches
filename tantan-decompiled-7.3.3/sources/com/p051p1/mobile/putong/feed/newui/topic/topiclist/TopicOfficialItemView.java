package com.p051p1.mobile.putong.feed.newui.topic.topiclist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.m9j0;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class TopicOfficialItemView extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final float f44079c = qa00.m175859d(12.0f);

    /* JADX INFO: renamed from: a */
    public VText f44080a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f44081b;

    public TopicOfficialItemView(@NonNull Context context) {
        super(context);
        m67313a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m67313a(Context context) {
        addView(m9j0.m157576b(this, LayoutInflater.from(context), this));
        int iM105592y0 = (int) (((double) (bnl0.m105592y0() - (qa00.m175859d(12.0f) * 2))) / 2.45d);
        ViewGroup.LayoutParams layoutParams = this.f44081b.getLayoutParams();
        layoutParams.height = iM105592y0;
        this.f44081b.setLayoutParams(layoutParams);
        RoundingParams roundingParams = new RoundingParams();
        float f = f44079c;
        roundingParams.m8318r(f, f, f, f);
        this.f44081b.getHierarchy().m207045H(roundingParams);
        this.f44081b.setElevation(15.0f);
    }

    public TopicOfficialItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m67313a(context);
    }

    public TopicOfficialItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67313a(context);
    }
}
