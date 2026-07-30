package com.p051p1.mobile.putong.core.p058ui.messages.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.messages.view.KeyboardMediaItemPageLayout;
import java.util.List;
import java.util.Locale;
import p151v.VText;
import p153l.bnl0;
import p153l.edc0;
import p153l.ft5;
import p153l.h0r;
import p153l.p9r;
import p153l.psd0;
import p153l.qec0;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class KeyboardMediaItemPageLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f33209a;

    /* JADX INFO: renamed from: b */
    public int f33210b;

    /* JADX INFO: renamed from: c */
    public int f33211c;

    /* JADX INFO: renamed from: d */
    public int f33212d;

    /* JADX INFO: renamed from: e */
    public ft5 f33213e;

    public KeyboardMediaItemPageLayout(@NonNull Context context) {
        super(context);
        this.f33211c = 3;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m51047c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public final Act m51048d() {
        return (Act) bnl0.m105506D(getContext());
    }

    /* JADX INFO: renamed from: e */
    public void m51049e(List<h0r> list, int i) {
        int i2 = i * this.f33211c * 2;
        int iMin = Math.min(list.size(), (this.f33211c * 2) + i2);
        ft5 ft5Var = this.f33213e;
        if (ft5Var != null) {
            ft5Var.m127299c();
        }
        while (i2 < iMin) {
            final h0r h0rVar = list.get(i2);
            View viewInflate = (i2 / this.f33211c) % 2 == 0 ? p9r.m171370a(getContext()).inflate(qec0.f157068l3, (ViewGroup) null) : p9r.m171370a(getContext()).inflate(qec0.f157061k3, (ViewGroup) null);
            MessageMediaItemImage messageMediaItemImage = (MessageMediaItemImage) viewInflate.findViewById(edc0.f93360f2);
            final VText vText = (VText) viewInflate.findViewById(edc0.f93255O4);
            bnl0.m105524M(vText, !TextUtils.isEmpty(h0rVar.f107324f));
            vText.setText(h0rVar.f107324f);
            if (h0rVar.f107325g != null) {
                if (this.f33213e == null) {
                    this.f33213e = new ft5();
                }
                this.f33213e.m127297a(m51048d().duringCreated(h0rVar.f107325g).subscribe(psd0.m173597H(new y20() { // from class: l.i0r
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        bnl0.m105524M(vText, ((Boolean) obj).booleanValue());
                    }
                }, new y20() { // from class: l.j0r
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        KeyboardMediaItemPageLayout.m51047c((Throwable) obj);
                    }
                })));
            }
            VText vText2 = (VText) viewInflate.findViewById(edc0.f93367g2);
            String language = Locale.getDefault().getLanguage();
            if ("in".equals(language) || "id".equals(language)) {
                vText2.setTextSize(2, 10.0f);
            }
            vText2.getPaint().setFakeBoldText(true);
            messageMediaItemImage.setImageResource(h0rVar.f107321c);
            messageMediaItemImage.m51141l(h0rVar.f107319a, h0rVar.f107323e);
            vText2.setText(h0rVar.f107320b);
            addView(viewInflate);
            bnl0.m105509E0(viewInflate, new View.OnClickListener() { // from class: l.k0r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h0r h0rVar2 = h0rVar;
                    h0rVar2.f107322d.mo106409a(h0rVar2.m133190a());
                }
            });
            i2++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        psd0.m173633z(this.f33213e);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int i6 = this.f33211c;
            int i7 = this.f33209a;
            int i8 = this.f33212d;
            childAt.layout((i5 % i6) * i7, (i5 / i6) * i8, ((i5 % i6) * i7) + i7, ((i5 / i6) * i8) + i8);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i) / this.f33211c;
        this.f33209a = size2;
        int i3 = size / 2;
        this.f33210b = i3;
        this.f33212d = Math.min(size2, i3);
        measureChildren(View.MeasureSpec.makeMeasureSpec(this.f33209a, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f33212d, 1073741824));
    }

    public void setRowSize(int i) {
        this.f33211c = i;
    }

    public KeyboardMediaItemPageLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33211c = 3;
    }

    public KeyboardMediaItemPageLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33211c = 3;
    }
}
