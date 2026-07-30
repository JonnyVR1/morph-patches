package com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.FeedWriterLevelView;
import p149l.oai;
import p149l.t100;
import p149l.vqg;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedWriterLevelInProfileView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f41724a;

    /* JADX INFO: renamed from: b */
    public ImageView f41725b;

    /* JADX INFO: renamed from: c */
    public TextView f41726c;

    /* JADX INFO: renamed from: d */
    public TextView f41727d;

    /* JADX INFO: renamed from: e */
    public ImageView f41728e;

    /* JADX INFO: renamed from: f */
    public boolean f41729f;

    public FeedWriterLevelInProfileView(@NonNull Context context) {
        super(context);
        m64481b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m64480a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return oai.m163300b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m64481b(Context context) {
        addView(m64480a(LayoutInflater.from(context), this));
        int iM208412y0 = xdl0.m208412y0() - t100.m186890d(32.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM208412y0, (int) ((iM208412y0 * 64.0f) / 334.0f));
        layoutParams.topMargin = t100.m186890d(16.0f);
        layoutParams.leftMargin = t100.m186890d(16.0f);
        this.f41724a.setLayoutParams(layoutParams);
        setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        vqg.m199516K0((Act) getContext(), FeedWriterLevelView.m64421n(this.f41729f ? "p_album" : "profile"));
    }

    public FeedWriterLevelInProfileView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m64481b(context);
    }

    public FeedWriterLevelInProfileView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m64481b(context);
    }

    public FeedWriterLevelInProfileView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m64481b(context);
    }
}
