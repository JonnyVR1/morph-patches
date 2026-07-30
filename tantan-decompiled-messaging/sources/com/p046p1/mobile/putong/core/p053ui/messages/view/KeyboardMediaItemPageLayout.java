package com.p046p1.mobile.putong.core.p053ui.messages.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.messages.view.KeyboardMediaItemPageLayout;
import java.util.List;
import java.util.Locale;
import p147v.VText;
import p149l.bs5;
import p149l.e30;
import p149l.hyq;
import p149l.l6c0;
import p149l.mkd0;
import p149l.o7r;
import p149l.xdl0;
import p149l.y4c0;

/* JADX INFO: loaded from: classes4.dex */
public class KeyboardMediaItemPageLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f32361a;

    /* JADX INFO: renamed from: b */
    public int f32362b;

    /* JADX INFO: renamed from: c */
    public int f32363c;

    /* JADX INFO: renamed from: d */
    public int f32364d;

    /* JADX INFO: renamed from: e */
    public bs5 f32365e;

    public KeyboardMediaItemPageLayout(@NonNull Context context) {
        super(context);
        this.f32363c = 3;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m49864c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public final Act m49865d() {
        return (Act) xdl0.m208326D(getContext());
    }

    /* JADX INFO: renamed from: e */
    public void m49866e(List<hyq> list, int i) {
        int i2 = i * this.f32363c * 2;
        int iMin = Math.min(list.size(), (this.f32363c * 2) + i2);
        bs5 bs5Var = this.f32365e;
        if (bs5Var != null) {
            bs5Var.m103657c();
        }
        while (i2 < iMin) {
            final hyq hyqVar = list.get(i2);
            View viewInflate = (i2 / this.f32363c) % 2 == 0 ? o7r.m163037a(getContext()).inflate(l6c0.f126512l3, (ViewGroup) null) : o7r.m163037a(getContext()).inflate(l6c0.f126505k3, (ViewGroup) null);
            MessageMediaItemImage messageMediaItemImage = (MessageMediaItemImage) viewInflate.findViewById(y4c0.f196125f2);
            final VText vText = (VText) viewInflate.findViewById(y4c0.f196020O4);
            xdl0.m208344M(vText, !TextUtils.isEmpty(hyqVar.f110137f));
            vText.setText(hyqVar.f110137f);
            if (hyqVar.f110138g != null) {
                if (this.f32365e == null) {
                    this.f32365e = new bs5();
                }
                this.f32365e.m103655a(m49865d().duringCreated(hyqVar.f110138g).subscribe(mkd0.m154956H(new e30() { // from class: l.iyq
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        xdl0.m208344M(vText, ((Boolean) obj).booleanValue());
                    }
                }, new e30() { // from class: l.jyq
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        KeyboardMediaItemPageLayout.m49864c((Throwable) obj);
                    }
                })));
            }
            VText vText2 = (VText) viewInflate.findViewById(y4c0.f196132g2);
            String language = Locale.getDefault().getLanguage();
            if ("in".equals(language) || "id".equals(language)) {
                vText2.setTextSize(2, 10.0f);
            }
            vText2.getPaint().setFakeBoldText(true);
            messageMediaItemImage.setImageResource(hyqVar.f110134c);
            messageMediaItemImage.m49958l(hyqVar.f110132a, hyqVar.f110136e);
            vText2.setText(hyqVar.f110133b);
            addView(viewInflate);
            xdl0.m208329E0(viewInflate, new View.OnClickListener() { // from class: l.kyq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    hyq hyqVar2 = hyqVar;
                    hyqVar2.f110135d.mo117015a(hyqVar2.m133620a());
                }
            });
            i2++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.m154992z(this.f32365e);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int i6 = this.f32363c;
            int i7 = this.f32361a;
            int i8 = this.f32364d;
            childAt.layout((i5 % i6) * i7, (i5 / i6) * i8, ((i5 % i6) * i7) + i7, ((i5 / i6) * i8) + i8);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i) / this.f32363c;
        this.f32361a = size2;
        int i3 = size / 2;
        this.f32362b = i3;
        this.f32364d = Math.min(size2, i3);
        measureChildren(View.MeasureSpec.makeMeasureSpec(this.f32361a, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f32364d, 1073741824));
    }

    public void setRowSize(int i) {
        this.f32363c = i;
    }

    public KeyboardMediaItemPageLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32363c = 3;
    }

    public KeyboardMediaItemPageLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32363c = 3;
    }
}
