package com.p046p1.mobile.putong.account.p050ui.camera.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p149l.C17131go;
import p149l.C18050ko;
import p149l.c9c0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountRedDotView extends VImage {

    /* JADX INFO: renamed from: d */
    public int f16908d;

    /* JADX INFO: renamed from: e */
    public int f16909e;

    /* JADX INFO: renamed from: f */
    public int f16910f;

    /* JADX INFO: renamed from: g */
    public int f16911g;

    /* JADX INFO: renamed from: h */
    public int f16912h;

    /* JADX INFO: renamed from: i */
    public int f16913i;

    public AccountRedDotView(Context context) {
        super(context);
        this.f16908d = -1;
        m29109h(context, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m29109h(Context context, AttributeSet attributeSet) {
        this.f16909e = getVisibility();
        if (NullChecker.m81303a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c9c0.f79912n);
            this.f16908d = typedArrayObtainStyledAttributes.getInt(c9c0.f79917s, -1);
            this.f16910f = typedArrayObtainStyledAttributes.getDimensionPixelSize(c9c0.f79916r, -1);
            this.f16911g = typedArrayObtainStyledAttributes.getDimensionPixelSize(c9c0.f79915q, -1);
            this.f16912h = typedArrayObtainStyledAttributes.getColor(c9c0.f79913o, -1);
            this.f16913i = typedArrayObtainStyledAttributes.getColor(c9c0.f79914p, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
        m29115o();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m29110i(int i) {
        return i == 4 || i == 8;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m29111j(int i) {
        return i == 0;
    }

    /* JADX INFO: renamed from: k */
    public void m29112k() {
        if (this.f16908d > 0) {
            C18050ko.m146640d().m146650k(this.f16908d);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m29113l() {
        if (this.f16908d > 0) {
            C18050ko.m146640d().m146653n(Integer.valueOf(this.f16908d));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m29114m() {
        if (this.f16908d > 0) {
            C18050ko.m146640d().m146651l(this, this.f16908d);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m29115o() {
        if (this.f16910f != -1) {
            setImageDrawable(new C17131go(this.f16910f, this.f16911g, this.f16912h, this.f16913i));
        }
    }

    public void setOvalColor(int i) {
        this.f16912h = i;
    }

    public void setRedPointType(int i) {
        this.f16908d = i;
    }

    public void setRingColor(int i) {
        this.f16913i = i;
    }

    public void setRingWidth(int i) {
        this.f16911g = i;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (m29110i(this.f16909e) && m29111j(i)) {
            m29114m();
        } else if (m29111j(this.f16909e) && m29110i(i)) {
            m29113l();
        }
        this.f16909e = i;
    }

    public void setWidth(int i) {
        this.f16910f = i;
    }

    public AccountRedDotView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16908d = -1;
        m29109h(context, attributeSet);
    }

    public AccountRedDotView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16908d = -1;
        m29109h(context, attributeSet);
    }
}
