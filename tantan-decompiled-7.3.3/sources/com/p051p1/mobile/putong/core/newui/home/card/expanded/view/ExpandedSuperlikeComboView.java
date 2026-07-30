package com.p051p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p153l.mof;
import p153l.q4h0;
import p153l.tbc0;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedSuperlikeComboView extends FrameLayout implements q4h0 {

    /* JADX INFO: renamed from: j */
    public static List<Integer> f23372j;

    /* JADX INFO: renamed from: a */
    public VImage f23373a;

    /* JADX INFO: renamed from: b */
    public VImage f23374b;

    /* JADX INFO: renamed from: c */
    public VLinear f23375c;

    /* JADX INFO: renamed from: d */
    public VImage f23376d;

    /* JADX INFO: renamed from: e */
    public VImage f23377e;

    /* JADX INFO: renamed from: f */
    public VImage f23378f;

    /* JADX INFO: renamed from: g */
    public VImage f23379g;

    /* JADX INFO: renamed from: h */
    public VImage f23380h;

    /* JADX INFO: renamed from: i */
    public VImage[] f23381i;

    static {
        ArrayList arrayList = new ArrayList();
        f23372j = arrayList;
        arrayList.add(Integer.valueOf(tbc0.f172900w));
        f23372j.add(Integer.valueOf(tbc0.f172901x));
        f23372j.add(Integer.valueOf(tbc0.f172902y));
        f23372j.add(Integer.valueOf(tbc0.f172903z));
        f23372j.add(Integer.valueOf(tbc0.f172851A));
        f23372j.add(Integer.valueOf(tbc0.f172852B));
        f23372j.add(Integer.valueOf(tbc0.f172853C));
        f23372j.add(Integer.valueOf(tbc0.f172854D));
        f23372j.add(Integer.valueOf(tbc0.f172855E));
        f23372j.add(Integer.valueOf(tbc0.f172856F));
        f23372j.add(Integer.valueOf(tbc0.f172857G));
    }

    public ExpandedSuperlikeComboView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m39348b(View view) {
        mof.m159262a(this, view);
    }

    @Override // p153l.q4h0
    public View getRenderView() {
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39348b(this);
        this.f23381i = new VImage[]{this.f23379g, this.f23378f, this.f23377e, this.f23376d, this.f23380h};
    }

    public ExpandedSuperlikeComboView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandedSuperlikeComboView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
