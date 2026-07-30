package com.p000p1.mobile.putong.feed.newui.photoalbum.redpointview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p007l.a2h;
import p007l.m9c0;
import p007l.mwh;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedRedDotView extends VImage {

    /* JADX INFO: renamed from: d */
    public int f3791d;

    /* JADX INFO: renamed from: e */
    public int f3792e;

    /* JADX INFO: renamed from: f */
    public int f3793f;

    /* JADX INFO: renamed from: g */
    public int f3794g;

    /* JADX INFO: renamed from: h */
    public int f3795h;

    /* JADX INFO: renamed from: i */
    public int f3796i;

    /* JADX INFO: renamed from: j */
    public String f3797j;

    public FeedRedDotView(Context context) {
        super(context);
        this.f3791d = -1;
        m6152h(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    private void m6152h(Context context, AttributeSet attributeSet) {
        this.f3792e = getVisibility();
        if (NullChecker.a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f10291I);
            this.f3791d = typedArrayObtainStyledAttributes.getInt(m9c0.f10296N, -1);
            this.f3793f = typedArrayObtainStyledAttributes.getDimensionPixelSize(m9c0.f10295M, -1);
            this.f3794g = typedArrayObtainStyledAttributes.getDimensionPixelSize(m9c0.f10294L, -1);
            this.f3795h = typedArrayObtainStyledAttributes.getColor(m9c0.f10292J, -1);
            this.f3796i = typedArrayObtainStyledAttributes.getColor(m9c0.f10293K, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
        m6158o();
    }

    /* JADX INFO: renamed from: i */
    private boolean m6153i(int i) {
        return i == 4 || i == 8;
    }

    /* JADX INFO: renamed from: j */
    private boolean m6154j(int i) {
        return i == 0;
    }

    /* JADX INFO: renamed from: l */
    private void m6155l() {
        if (this.f3791d > 0) {
            mwh.m12038d().m12056s(Integer.valueOf(this.f3791d));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    private void m6156m() {
        if (this.f3791d > 0) {
            mwh.m12038d().m12052o(this, this.f3791d, this.f3797j);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m6157k() {
        if (this.f3791d > 0) {
            mwh.m12038d().m12050m(this.f3791d, this.f3797j);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m6158o() {
        if (this.f3793f != -1) {
            setImageDrawable(new a2h(this.f3793f, this.f3794g, this.f3795h, this.f3796i));
        }
    }

    public void setOvalColor(int i) {
        this.f3795h = i;
    }

    public void setPageId(String str) {
        this.f3797j = str;
    }

    public void setRedPointType(int i) {
        this.f3791d = i;
    }

    public void setRingColor(int i) {
        this.f3796i = i;
    }

    public void setRingWidth(int i) {
        this.f3794g = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setVisibility(int i) {
        super/*android.view.View*/.setVisibility(i);
        if (m6153i(this.f3792e) && m6154j(i)) {
            m6156m();
        } else if (m6154j(this.f3792e) && m6153i(i)) {
            m6155l();
        }
        this.f3792e = i;
    }

    public void setWidth(int i) {
        this.f3793f = i;
    }

    public FeedRedDotView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3791d = -1;
        m6152h(context, attributeSet);
    }

    public FeedRedDotView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3791d = -1;
        m6152h(context, attributeSet);
    }
}
