package com.p046p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p149l.gnf;
import p149l.iwg0;
import p149l.n3c0;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedSuperlikeComboView extends FrameLayout implements iwg0 {

    /* JADX INFO: renamed from: j */
    public static List<Integer> f22630j;

    /* JADX INFO: renamed from: a */
    public VImage f22631a;

    /* JADX INFO: renamed from: b */
    public VImage f22632b;

    /* JADX INFO: renamed from: c */
    public VLinear f22633c;

    /* JADX INFO: renamed from: d */
    public VImage f22634d;

    /* JADX INFO: renamed from: e */
    public VImage f22635e;

    /* JADX INFO: renamed from: f */
    public VImage f22636f;

    /* JADX INFO: renamed from: g */
    public VImage f22637g;

    /* JADX INFO: renamed from: h */
    public VImage f22638h;

    /* JADX INFO: renamed from: i */
    public VImage[] f22639i;

    static {
        ArrayList arrayList = new ArrayList();
        f22630j = arrayList;
        arrayList.add(Integer.valueOf(n3c0.f136985w));
        f22630j.add(Integer.valueOf(n3c0.f136986x));
        f22630j.add(Integer.valueOf(n3c0.f136987y));
        f22630j.add(Integer.valueOf(n3c0.f136988z));
        f22630j.add(Integer.valueOf(n3c0.f136936A));
        f22630j.add(Integer.valueOf(n3c0.f136937B));
        f22630j.add(Integer.valueOf(n3c0.f136938C));
        f22630j.add(Integer.valueOf(n3c0.f136939D));
        f22630j.add(Integer.valueOf(n3c0.f136940E));
        f22630j.add(Integer.valueOf(n3c0.f136941F));
        f22630j.add(Integer.valueOf(n3c0.f136942G));
    }

    public ExpandedSuperlikeComboView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m38345b(View view) {
        gnf.m127136a(this, view);
    }

    @Override // p149l.iwg0
    public View getRenderView() {
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38345b(this);
        this.f22639i = new VImage[]{this.f22637g, this.f22636f, this.f22635e, this.f22634d, this.f22638h};
    }

    public ExpandedSuperlikeComboView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandedSuperlikeComboView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
