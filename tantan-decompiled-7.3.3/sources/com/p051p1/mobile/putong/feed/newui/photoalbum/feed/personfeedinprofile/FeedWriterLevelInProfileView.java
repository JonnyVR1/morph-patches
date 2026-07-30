package com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.FeedWriterLevelView;
import p153l.bnl0;
import p153l.dci;
import p153l.ksg;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class FeedWriterLevelInProfileView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f42572a;

    /* JADX INFO: renamed from: b */
    public ImageView f42573b;

    /* JADX INFO: renamed from: c */
    public TextView f42574c;

    /* JADX INFO: renamed from: d */
    public TextView f42575d;

    /* JADX INFO: renamed from: e */
    public ImageView f42576e;

    /* JADX INFO: renamed from: f */
    public boolean f42577f;

    public FeedWriterLevelInProfileView(@NonNull Context context) {
        super(context);
        m65664b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m65663a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dci.m115275b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m65664b(Context context) {
        addView(m65663a(LayoutInflater.from(context), this));
        int iM105592y0 = bnl0.m105592y0() - qa00.m175859d(32.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM105592y0, (int) ((iM105592y0 * 64.0f) / 334.0f));
        layoutParams.topMargin = qa00.m175859d(16.0f);
        layoutParams.leftMargin = qa00.m175859d(16.0f);
        this.f42572a.setLayoutParams(layoutParams);
        setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ksg.m151175K0((Act) getContext(), FeedWriterLevelView.m65604n(this.f42577f ? "p_album" : "profile"));
    }

    public FeedWriterLevelInProfileView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m65664b(context);
    }

    public FeedWriterLevelInProfileView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65664b(context);
    }

    public FeedWriterLevelInProfileView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m65664b(context);
    }
}
