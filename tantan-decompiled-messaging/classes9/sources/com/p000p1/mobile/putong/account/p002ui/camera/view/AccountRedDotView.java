package com.p000p1.mobile.putong.account.p002ui.camera.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p006l.C0774go;
import p006l.C0941ko;
import p006l.c9c0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountRedDotView extends VImage {

    /* JADX INFO: renamed from: d */
    public int f897d;

    /* JADX INFO: renamed from: e */
    public int f898e;

    /* JADX INFO: renamed from: f */
    public int f899f;

    /* JADX INFO: renamed from: g */
    public int f900g;

    /* JADX INFO: renamed from: h */
    public int f901h;

    /* JADX INFO: renamed from: i */
    public int f902i;

    public AccountRedDotView(Context context) {
        super(context);
        this.f897d = -1;
        m1015h(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final void m1015h(Context context, AttributeSet attributeSet) {
        this.f898e = getVisibility();
        if (NullChecker.a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c9c0.f9535n);
            this.f897d = typedArrayObtainStyledAttributes.getInt(c9c0.f9540s, -1);
            this.f899f = typedArrayObtainStyledAttributes.getDimensionPixelSize(c9c0.f9539r, -1);
            this.f900g = typedArrayObtainStyledAttributes.getDimensionPixelSize(c9c0.f9538q, -1);
            this.f901h = typedArrayObtainStyledAttributes.getColor(c9c0.f9536o, -1);
            this.f902i = typedArrayObtainStyledAttributes.getColor(c9c0.f9537p, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
        m1021o();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1016i(int i) {
        return i == 4 || i == 8;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1017j(int i) {
        return i == 0;
    }

    /* JADX INFO: renamed from: k */
    public void m1018k() {
        if (this.f897d > 0) {
            C0941ko.m18214d().m18224k(this.f897d);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1019l() {
        if (this.f897d > 0) {
            C0941ko.m18214d().m18227n(Integer.valueOf(this.f897d));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final void m1020m() {
        if (this.f897d > 0) {
            C0941ko.m18214d().m18225l(this, this.f897d);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m1021o() {
        if (this.f899f != -1) {
            setImageDrawable(new C0774go(this.f899f, this.f900g, this.f901h, this.f902i));
        }
    }

    public void setOvalColor(int i) {
        this.f901h = i;
    }

    public void setRedPointType(int i) {
        this.f897d = i;
    }

    public void setRingColor(int i) {
        this.f902i = i;
    }

    public void setRingWidth(int i) {
        this.f900g = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setVisibility(int i) {
        super/*android.view.View*/.setVisibility(i);
        if (m1016i(this.f898e) && m1017j(i)) {
            m1020m();
        } else if (m1017j(this.f898e) && m1016i(i)) {
            m1019l();
        }
        this.f898e = i;
    }

    public void setWidth(int i) {
        this.f899f = i;
    }

    public AccountRedDotView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f897d = -1;
        m1015h(context, attributeSet);
    }

    public AccountRedDotView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f897d = -1;
        m1015h(context, attributeSet);
    }
}
