package com.p051p1.mobile.putong.account.p055ui.camera.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p153l.C15751ao;
import p153l.C17022fo;
import p153l.ihc0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountRedDotView extends VImage {

    /* JADX INFO: renamed from: d */
    public int f17627d;

    /* JADX INFO: renamed from: e */
    public int f17628e;

    /* JADX INFO: renamed from: f */
    public int f17629f;

    /* JADX INFO: renamed from: g */
    public int f17630g;

    /* JADX INFO: renamed from: h */
    public int f17631h;

    /* JADX INFO: renamed from: i */
    public int f17632i;

    public AccountRedDotView(Context context) {
        super(context);
        this.f17627d = -1;
        m30108h(context, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m30108h(Context context, AttributeSet attributeSet) {
        this.f17628e = getVisibility();
        if (NullChecker.m82486a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ihc0.f114917n);
            this.f17627d = typedArrayObtainStyledAttributes.getInt(ihc0.f114922s, -1);
            this.f17629f = typedArrayObtainStyledAttributes.getDimensionPixelSize(ihc0.f114921r, -1);
            this.f17630g = typedArrayObtainStyledAttributes.getDimensionPixelSize(ihc0.f114920q, -1);
            this.f17631h = typedArrayObtainStyledAttributes.getColor(ihc0.f114918o, -1);
            this.f17632i = typedArrayObtainStyledAttributes.getColor(ihc0.f114919p, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
        m30114o();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m30109i(int i) {
        return i == 4 || i == 8;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m30110j(int i) {
        return i == 0;
    }

    /* JADX INFO: renamed from: k */
    public void m30111k() {
        if (this.f17627d > 0) {
            C17022fo.m126416d().m126426k(this.f17627d);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m30112l() {
        if (this.f17627d > 0) {
            C17022fo.m126416d().m126429n(Integer.valueOf(this.f17627d));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m30113m() {
        if (this.f17627d > 0) {
            C17022fo.m126416d().m126427l(this, this.f17627d);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m30114o() {
        if (this.f17629f != -1) {
            setImageDrawable(new C15751ao(this.f17629f, this.f17630g, this.f17631h, this.f17632i));
        }
    }

    public void setOvalColor(int i) {
        this.f17631h = i;
    }

    public void setRedPointType(int i) {
        this.f17627d = i;
    }

    public void setRingColor(int i) {
        this.f17632i = i;
    }

    public void setRingWidth(int i) {
        this.f17630g = i;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (m30109i(this.f17628e) && m30110j(i)) {
            m30113m();
        } else if (m30110j(this.f17628e) && m30109i(i)) {
            m30112l();
        }
        this.f17628e = i;
    }

    public void setWidth(int i) {
        this.f17629f = i;
    }

    public AccountRedDotView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17627d = -1;
        m30108h(context, attributeSet);
    }

    public AccountRedDotView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17627d = -1;
        m30108h(context, attributeSet);
    }
}
