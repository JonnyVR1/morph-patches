package com.p000p1.mobile.putong.core.p001ui.messages.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.view.KeyboardMediaItemPageLayout;
import com.p1.mobile.android.app.Act;
import java.util.List;
import java.util.Locale;
import l.bs5;
import l.e30;
import l.hyq;
import l.l6c0;
import l.mkd0;
import l.o7r;
import l.xdl0;
import l.y4c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class KeyboardMediaItemPageLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f183a;

    /* JADX INFO: renamed from: b */
    public int f184b;

    /* JADX INFO: renamed from: c */
    public int f185c;

    /* JADX INFO: renamed from: d */
    public int f186d;

    /* JADX INFO: renamed from: e */
    public bs5 f187e;

    public KeyboardMediaItemPageLayout(@NonNull Context context) {
        super(context);
        this.f185c = 3;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m286c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public final Act m287d() {
        return xdl0.D(getContext());
    }

    /* JADX INFO: renamed from: e */
    public void m288e(List<hyq> list, int i) {
        int i2 = i * this.f185c * 2;
        int iMin = Math.min(list.size(), (this.f185c * 2) + i2);
        bs5 bs5Var = this.f187e;
        if (bs5Var != null) {
            bs5Var.c();
        }
        while (i2 < iMin) {
            final hyq hyqVar = list.get(i2);
            View viewInflate = (i2 / this.f185c) % 2 == 0 ? o7r.a(getContext()).inflate(l6c0.l3, (ViewGroup) null) : o7r.a(getContext()).inflate(l6c0.k3, (ViewGroup) null);
            MessageMediaItemImage messageMediaItemImage = (MessageMediaItemImage) viewInflate.findViewById(y4c0.f2);
            final VText vTextFindViewById = viewInflate.findViewById(y4c0.O4);
            xdl0.M(vTextFindViewById, !TextUtils.isEmpty(hyqVar.f));
            vTextFindViewById.setText(hyqVar.f);
            if (hyqVar.g != null) {
                if (this.f187e == null) {
                    this.f187e = new bs5();
                }
                this.f187e.a(m287d().duringCreated(hyqVar.g).subscribe(mkd0.H(new e30() { // from class: l.iyq
                    public final void call(Object obj) {
                        xdl0.M(vTextFindViewById, ((Boolean) obj).booleanValue());
                    }
                }, new e30() { // from class: l.jyq
                    public final void call(Object obj) {
                        KeyboardMediaItemPageLayout.m286c((Throwable) obj);
                    }
                })));
            }
            VText vTextFindViewById2 = viewInflate.findViewById(y4c0.g2);
            String language = Locale.getDefault().getLanguage();
            if ("in".equals(language) || "id".equals(language)) {
                vTextFindViewById2.setTextSize(2, 10.0f);
            }
            vTextFindViewById2.getPaint().setFakeBoldText(true);
            messageMediaItemImage.setImageResource(hyqVar.c);
            messageMediaItemImage.m380l(hyqVar.a, hyqVar.e);
            vTextFindViewById2.setText(hyqVar.b);
            addView(viewInflate);
            xdl0.E0(viewInflate, new View.OnClickListener() { // from class: l.kyq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    hyq hyqVar2 = hyqVar;
                    hyqVar2.d.a(hyqVar2.a());
                }
            });
            i2++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.z(this.f187e);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int i6 = this.f185c;
            int i7 = this.f183a;
            int i8 = this.f186d;
            childAt.layout((i5 % i6) * i7, (i5 / i6) * i8, ((i5 % i6) * i7) + i7, ((i5 / i6) * i8) + i8);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i) / this.f185c;
        this.f183a = size2;
        int i3 = size / 2;
        this.f184b = i3;
        this.f186d = Math.min(size2, i3);
        measureChildren(View.MeasureSpec.makeMeasureSpec(this.f183a, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f186d, 1073741824));
    }

    public void setRowSize(int i) {
        this.f185c = i;
    }

    public KeyboardMediaItemPageLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f185c = 3;
    }

    public KeyboardMediaItemPageLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f185c = 3;
    }
}
