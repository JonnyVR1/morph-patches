package com.p000p1.mobile.putong.core.p004ui.superlikeopt;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.tantan.library.svga.SVGAnimationView;
import java.util.ArrayList;
import java.util.List;
import l.hwg0;
import l.n3c0;
import l.t100;
import l.xdl0;
import p006l.iwg0;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SuperLikeComboAnimExpView extends CardView implements iwg0 {

    /* JADX INFO: renamed from: u */
    public static List<Integer> f6167u;

    /* JADX INFO: renamed from: a */
    public SVGAnimationView f6168a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f6169b;

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f6170c;

    /* JADX INFO: renamed from: d */
    public VLinear f6171d;

    /* JADX INFO: renamed from: e */
    public VImage f6172e;

    /* JADX INFO: renamed from: f */
    public VImage f6173f;

    /* JADX INFO: renamed from: g */
    public VImage f6174g;

    /* JADX INFO: renamed from: h */
    public VImage f6175h;

    /* JADX INFO: renamed from: i */
    public VImage f6176i;

    /* JADX INFO: renamed from: j */
    public int f6177j;

    /* JADX INFO: renamed from: k */
    public VImage[] f6178k;

    /* JADX INFO: renamed from: l */
    public Runnable f6179l;

    /* JADX INFO: renamed from: m */
    public long f6180m;

    /* JADX INFO: renamed from: n */
    public long f6181n;

    /* JADX INFO: renamed from: o */
    public long f6182o;

    /* JADX INFO: renamed from: p */
    public long f6183p;

    /* JADX INFO: renamed from: q */
    public long f6184q;

    /* JADX INFO: renamed from: r */
    public int f6185r;

    /* JADX INFO: renamed from: s */
    public int f6186s;

    /* JADX INFO: renamed from: t */
    public int f6187t;

    static {
        ArrayList arrayList = new ArrayList();
        f6167u = arrayList;
        arrayList.add(Integer.valueOf(n3c0.w));
        f6167u.add(Integer.valueOf(n3c0.x));
        f6167u.add(Integer.valueOf(n3c0.y));
        f6167u.add(Integer.valueOf(n3c0.z));
        f6167u.add(Integer.valueOf(n3c0.A));
        f6167u.add(Integer.valueOf(n3c0.B));
        f6167u.add(Integer.valueOf(n3c0.C));
        f6167u.add(Integer.valueOf(n3c0.D));
        f6167u.add(Integer.valueOf(n3c0.E));
        f6167u.add(Integer.valueOf(n3c0.F));
        f6167u.add(Integer.valueOf(n3c0.G));
    }

    public SuperLikeComboAnimExpView(@NonNull Context context) {
        super(context);
        this.f6177j = 1;
        this.f6179l = null;
        this.f6180m = 350L;
        this.f6181n = 400L;
        this.f6182o = 400L;
        this.f6183p = 200L;
        this.f6184q = 100L;
        this.f6185r = 3;
        this.f6186s = 6;
        this.f6187t = t100.d(850.0f);
    }

    @Override // p006l.iwg0
    /* JADX INFO: renamed from: a */
    public void mo9160a(boolean z) {
        xdl0.M0(this.f6168a, z);
    }

    /* JADX INFO: renamed from: b */
    public final void m9161b(View view) {
        hwg0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p006l.iwg0
    public View getRenderView() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m9161b(this);
        this.f6178k = new VImage[]{this.f6175h, this.f6174g, this.f6173f, this.f6172e, this.f6176i};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.f6187t;
        if (size > i3) {
            size = i3;
        }
        int size2 = View.MeasureSpec.getSize(i);
        int iD = (size - t100.d(CoreModule.m1851K().Lo())) - t100.d(4.0f);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iD, 1073741824));
        setMeasuredDimension(size2, iD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setVisibility(int i) {
        super/*android.view.View*/.setVisibility(i);
        if (i != 0) {
            removeCallbacks(this.f6179l);
        }
    }

    public SuperLikeComboAnimExpView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6177j = 1;
        this.f6179l = null;
        this.f6180m = 350L;
        this.f6181n = 400L;
        this.f6182o = 400L;
        this.f6183p = 200L;
        this.f6184q = 100L;
        this.f6185r = 3;
        this.f6186s = 6;
        this.f6187t = t100.d(850.0f);
    }

    public SuperLikeComboAnimExpView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6177j = 1;
        this.f6179l = null;
        this.f6180m = 350L;
        this.f6181n = 400L;
        this.f6182o = 400L;
        this.f6183p = 200L;
        this.f6184q = 100L;
        this.f6185r = 3;
        this.f6186s = 6;
        this.f6187t = t100.d(850.0f);
    }
}
