package com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.FeedWriterLevelView;
import l.t100;
import l.xdl0;
import p007l.oai;
import p007l.vqg;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedWriterLevelInProfileView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f3185a;

    /* JADX INFO: renamed from: b */
    public ImageView f3186b;

    /* JADX INFO: renamed from: c */
    public TextView f3187c;

    /* JADX INFO: renamed from: d */
    public TextView f3188d;

    /* JADX INFO: renamed from: e */
    public ImageView f3189e;

    /* JADX INFO: renamed from: f */
    public boolean f3190f;

    public FeedWriterLevelInProfileView(@NonNull Context context) {
        super(context);
        m5568b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m5567a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return oai.m12510b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m5568b(Context context) {
        addView(m5567a(LayoutInflater.from(context), this));
        int iY0 = xdl0.y0() - t100.d(32.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iY0, (int) ((iY0 * 64.0f) / 334.0f));
        layoutParams.topMargin = t100.d(16.0f);
        layoutParams.leftMargin = t100.d(16.0f);
        this.f3185a.setLayoutParams(layoutParams);
        setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        vqg.m15486K0(getContext(), FeedWriterLevelView.m5505n(this.f3190f ? "p_album" : "profile"));
    }

    public FeedWriterLevelInProfileView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m5568b(context);
    }

    public FeedWriterLevelInProfileView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5568b(context);
    }

    public FeedWriterLevelInProfileView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m5568b(context);
    }
}
