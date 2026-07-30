package com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.j0r;
import p149l.k0r;
import p149l.t6c0;

/* JADX INFO: loaded from: classes5.dex */
public class KtvAlreadyChooseSongPageView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public KtvAlreadyChooseSongPageView f52374d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f52375e;

    /* JADX INFO: renamed from: f */
    public VLinear f52376f;

    /* JADX INFO: renamed from: g */
    public VImage f52377g;

    /* JADX INFO: renamed from: h */
    public VText f52378h;

    public KtvAlreadyChooseSongPageView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: i0 */
    public static KtvAlreadyChooseSongPageView m77033i0(LayoutInflater layoutInflater) {
        return (KtvAlreadyChooseSongPageView) layoutInflater.inflate(t6c0.f168411k9, (ViewGroup) null, false);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m77034h0(View view) {
        k0r.m144124a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77034h0(this);
    }

    public void setAdapter(j0r j0rVar) {
        this.f52375e.setAdapter(j0rVar);
        this.f52375e.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    public KtvAlreadyChooseSongPageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KtvAlreadyChooseSongPageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
