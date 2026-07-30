package com.p000p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import l.gnf;
import l.iwg0;
import l.n3c0;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ExpandedSuperlikeComboView extends FrameLayout implements iwg0 {

    /* JADX INFO: renamed from: j */
    public static List<Integer> f1408j;

    /* JADX INFO: renamed from: a */
    public VImage f1409a;

    /* JADX INFO: renamed from: b */
    public VImage f1410b;

    /* JADX INFO: renamed from: c */
    public VLinear f1411c;

    /* JADX INFO: renamed from: d */
    public VImage f1412d;

    /* JADX INFO: renamed from: e */
    public VImage f1413e;

    /* JADX INFO: renamed from: f */
    public VImage f1414f;

    /* JADX INFO: renamed from: g */
    public VImage f1415g;

    /* JADX INFO: renamed from: h */
    public VImage f1416h;

    /* JADX INFO: renamed from: i */
    public VImage[] f1417i;

    static {
        ArrayList arrayList = new ArrayList();
        f1408j = arrayList;
        arrayList.add(Integer.valueOf(n3c0.w));
        f1408j.add(Integer.valueOf(n3c0.x));
        f1408j.add(Integer.valueOf(n3c0.y));
        f1408j.add(Integer.valueOf(n3c0.z));
        f1408j.add(Integer.valueOf(n3c0.A));
        f1408j.add(Integer.valueOf(n3c0.B));
        f1408j.add(Integer.valueOf(n3c0.C));
        f1408j.add(Integer.valueOf(n3c0.D));
        f1408j.add(Integer.valueOf(n3c0.E));
        f1408j.add(Integer.valueOf(n3c0.F));
        f1408j.add(Integer.valueOf(n3c0.G));
    }

    public ExpandedSuperlikeComboView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m2323b(View view) {
        gnf.a(this, view);
    }

    public View getRenderView() {
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2323b(this);
        this.f1417i = new VImage[]{this.f1415g, this.f1414f, this.f1413e, this.f1412d, this.f1416h};
    }

    public ExpandedSuperlikeComboView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandedSuperlikeComboView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
