package com.p046p1.mobile.putong.core.p053ui.superlikeopt;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantan.library.svga.SVGAnimationView;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p149l.hwg0;
import p149l.iwg0;
import p149l.n3c0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class SuperLikeComboAnimExpView extends CardView implements iwg0 {

    /* JADX INFO: renamed from: u */
    public static List<Integer> f36386u;

    /* JADX INFO: renamed from: a */
    public SVGAnimationView f36387a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f36388b;

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f36389c;

    /* JADX INFO: renamed from: d */
    public VLinear f36390d;

    /* JADX INFO: renamed from: e */
    public VImage f36391e;

    /* JADX INFO: renamed from: f */
    public VImage f36392f;

    /* JADX INFO: renamed from: g */
    public VImage f36393g;

    /* JADX INFO: renamed from: h */
    public VImage f36394h;

    /* JADX INFO: renamed from: i */
    public VImage f36395i;

    /* JADX INFO: renamed from: j */
    public int f36396j;

    /* JADX INFO: renamed from: k */
    public VImage[] f36397k;

    /* JADX INFO: renamed from: l */
    public Runnable f36398l;

    /* JADX INFO: renamed from: m */
    public long f36399m;

    /* JADX INFO: renamed from: n */
    public long f36400n;

    /* JADX INFO: renamed from: o */
    public long f36401o;

    /* JADX INFO: renamed from: p */
    public long f36402p;

    /* JADX INFO: renamed from: q */
    public long f36403q;

    /* JADX INFO: renamed from: r */
    public int f36404r;

    /* JADX INFO: renamed from: s */
    public int f36405s;

    /* JADX INFO: renamed from: t */
    public int f36406t;

    static {
        ArrayList arrayList = new ArrayList();
        f36386u = arrayList;
        arrayList.add(Integer.valueOf(n3c0.f136985w));
        f36386u.add(Integer.valueOf(n3c0.f136986x));
        f36386u.add(Integer.valueOf(n3c0.f136987y));
        f36386u.add(Integer.valueOf(n3c0.f136988z));
        f36386u.add(Integer.valueOf(n3c0.f136936A));
        f36386u.add(Integer.valueOf(n3c0.f136937B));
        f36386u.add(Integer.valueOf(n3c0.f136938C));
        f36386u.add(Integer.valueOf(n3c0.f136939D));
        f36386u.add(Integer.valueOf(n3c0.f136940E));
        f36386u.add(Integer.valueOf(n3c0.f136941F));
        f36386u.add(Integer.valueOf(n3c0.f136942G));
    }

    public SuperLikeComboAnimExpView(@NonNull Context context) {
        super(context);
        this.f36396j = 1;
        this.f36398l = null;
        this.f36399m = 350L;
        this.f36400n = 400L;
        this.f36401o = 400L;
        this.f36402p = 200L;
        this.f36403q = 100L;
        this.f36404r = 3;
        this.f36405s = 6;
        this.f36406t = t100.m186890d(850.0f);
    }

    @Override // p149l.iwg0
    /* JADX INFO: renamed from: a */
    public void mo55762a(boolean z) {
        xdl0.m208345M0(this.f36387a, z);
    }

    /* JADX INFO: renamed from: b */
    public final void m55763b(View view) {
        hwg0.m133244a(this, view);
    }

    @Override // p149l.iwg0
    public View getRenderView() {
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55763b(this);
        this.f36397k = new VImage[]{this.f36394h, this.f36393g, this.f36392f, this.f36391e, this.f36395i};
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.f36406t;
        if (size > i3) {
            size = i3;
        }
        int size2 = View.MeasureSpec.getSize(i);
        int iM186890d = (size - t100.m186890d(CoreModule.m29932K().mo30705Lo())) - t100.m186890d(4.0f);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iM186890d, 1073741824));
        setMeasuredDimension(size2, iM186890d);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            removeCallbacks(this.f36398l);
        }
    }

    public SuperLikeComboAnimExpView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36396j = 1;
        this.f36398l = null;
        this.f36399m = 350L;
        this.f36400n = 400L;
        this.f36401o = 400L;
        this.f36402p = 200L;
        this.f36403q = 100L;
        this.f36404r = 3;
        this.f36405s = 6;
        this.f36406t = t100.m186890d(850.0f);
    }

    public SuperLikeComboAnimExpView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36396j = 1;
        this.f36398l = null;
        this.f36399m = 350L;
        this.f36400n = 400L;
        this.f36401o = 400L;
        this.f36402p = 200L;
        this.f36403q = 100L;
        this.f36404r = 3;
        this.f36405s = 6;
        this.f36406t = t100.m186890d(850.0f);
    }
}
