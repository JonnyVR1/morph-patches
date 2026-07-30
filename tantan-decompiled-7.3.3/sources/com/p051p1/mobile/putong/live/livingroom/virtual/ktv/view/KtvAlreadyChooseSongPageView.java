package com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.k2r;
import p153l.l2r;
import p153l.yec0;

/* JADX INFO: loaded from: classes5.dex */
public class KtvAlreadyChooseSongPageView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public KtvAlreadyChooseSongPageView f53222d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f53223e;

    /* JADX INFO: renamed from: f */
    public VLinear f53224f;

    /* JADX INFO: renamed from: g */
    public VImage f53225g;

    /* JADX INFO: renamed from: h */
    public VText f53226h;

    public KtvAlreadyChooseSongPageView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: i0 */
    public static KtvAlreadyChooseSongPageView m78216i0(LayoutInflater layoutInflater) {
        return (KtvAlreadyChooseSongPageView) layoutInflater.inflate(yec0.f199143k9, (ViewGroup) null, false);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m78217h0(View view) {
        l2r.m152630a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78217h0(this);
    }

    public void setAdapter(k2r k2rVar) {
        this.f53223e.setAdapter(k2rVar);
        this.f53223e.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    public KtvAlreadyChooseSongPageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KtvAlreadyChooseSongPageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
