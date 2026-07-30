package com.p051p1.mobile.putong.core.p058ui.superlikeopt;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantan.library.svga.SVGAnimationView;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p153l.bnl0;
import p153l.p4h0;
import p153l.q4h0;
import p153l.qa00;
import p153l.tbc0;

/* JADX INFO: loaded from: classes12.dex */
public class SuperLikeComboAnimExpView extends CardView implements q4h0 {

    /* JADX INFO: renamed from: u */
    public static List<Integer> f37234u;

    /* JADX INFO: renamed from: a */
    public SVGAnimationView f37235a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f37236b;

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f37237c;

    /* JADX INFO: renamed from: d */
    public VLinear f37238d;

    /* JADX INFO: renamed from: e */
    public VImage f37239e;

    /* JADX INFO: renamed from: f */
    public VImage f37240f;

    /* JADX INFO: renamed from: g */
    public VImage f37241g;

    /* JADX INFO: renamed from: h */
    public VImage f37242h;

    /* JADX INFO: renamed from: i */
    public VImage f37243i;

    /* JADX INFO: renamed from: j */
    public int f37244j;

    /* JADX INFO: renamed from: k */
    public VImage[] f37245k;

    /* JADX INFO: renamed from: l */
    public Runnable f37246l;

    /* JADX INFO: renamed from: m */
    public long f37247m;

    /* JADX INFO: renamed from: n */
    public long f37248n;

    /* JADX INFO: renamed from: o */
    public long f37249o;

    /* JADX INFO: renamed from: p */
    public long f37250p;

    /* JADX INFO: renamed from: q */
    public long f37251q;

    /* JADX INFO: renamed from: r */
    public int f37252r;

    /* JADX INFO: renamed from: s */
    public int f37253s;

    /* JADX INFO: renamed from: t */
    public int f37254t;

    static {
        ArrayList arrayList = new ArrayList();
        f37234u = arrayList;
        arrayList.add(Integer.valueOf(tbc0.f172900w));
        f37234u.add(Integer.valueOf(tbc0.f172901x));
        f37234u.add(Integer.valueOf(tbc0.f172902y));
        f37234u.add(Integer.valueOf(tbc0.f172903z));
        f37234u.add(Integer.valueOf(tbc0.f172851A));
        f37234u.add(Integer.valueOf(tbc0.f172852B));
        f37234u.add(Integer.valueOf(tbc0.f172853C));
        f37234u.add(Integer.valueOf(tbc0.f172854D));
        f37234u.add(Integer.valueOf(tbc0.f172855E));
        f37234u.add(Integer.valueOf(tbc0.f172856F));
        f37234u.add(Integer.valueOf(tbc0.f172857G));
    }

    public SuperLikeComboAnimExpView(@NonNull Context context) {
        super(context);
        this.f37244j = 1;
        this.f37246l = null;
        this.f37247m = 350L;
        this.f37248n = 400L;
        this.f37249o = 400L;
        this.f37250p = 200L;
        this.f37251q = 100L;
        this.f37252r = 3;
        this.f37253s = 6;
        this.f37254t = qa00.m175859d(850.0f);
    }

    @Override // p153l.q4h0
    /* JADX INFO: renamed from: a */
    public void mo56945a(boolean z) {
        bnl0.m105525M0(this.f37235a, z);
    }

    /* JADX INFO: renamed from: b */
    public final void m56946b(View view) {
        p4h0.m170569a(this, view);
    }

    @Override // p153l.q4h0
    public View getRenderView() {
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56946b(this);
        this.f37245k = new VImage[]{this.f37242h, this.f37241g, this.f37240f, this.f37239e, this.f37243i};
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.f37254t;
        if (size > i3) {
            size = i3;
        }
        int size2 = View.MeasureSpec.getSize(i);
        int iM175859d = (size - qa00.m175859d(CoreModule.m30930K().mo31708Lo())) - qa00.m175859d(4.0f);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iM175859d, 1073741824));
        setMeasuredDimension(size2, iM175859d);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            removeCallbacks(this.f37246l);
        }
    }

    public SuperLikeComboAnimExpView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37244j = 1;
        this.f37246l = null;
        this.f37247m = 350L;
        this.f37248n = 400L;
        this.f37249o = 400L;
        this.f37250p = 200L;
        this.f37251q = 100L;
        this.f37252r = 3;
        this.f37253s = 6;
        this.f37254t = qa00.m175859d(850.0f);
    }

    public SuperLikeComboAnimExpView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37244j = 1;
        this.f37246l = null;
        this.f37247m = 350L;
        this.f37248n = 400L;
        this.f37249o = 400L;
        this.f37250p = 200L;
        this.f37251q = 100L;
        this.f37252r = 3;
        this.f37253s = 6;
        this.f37254t = qa00.m175859d(850.0f);
    }
}
