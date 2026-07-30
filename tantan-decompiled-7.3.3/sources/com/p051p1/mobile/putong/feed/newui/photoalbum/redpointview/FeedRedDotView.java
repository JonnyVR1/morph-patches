package com.p051p1.mobile.putong.feed.newui.photoalbum.redpointview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p153l.byh;
import p153l.p3h;
import p153l.shc0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedRedDotView extends VImage {

    /* JADX INFO: renamed from: d */
    public int f43178d;

    /* JADX INFO: renamed from: e */
    public int f43179e;

    /* JADX INFO: renamed from: f */
    public int f43180f;

    /* JADX INFO: renamed from: g */
    public int f43181g;

    /* JADX INFO: renamed from: h */
    public int f43182h;

    /* JADX INFO: renamed from: i */
    public int f43183i;

    /* JADX INFO: renamed from: j */
    public String f43184j;

    public FeedRedDotView(Context context) {
        super(context);
        this.f43178d = -1;
        m66234h(context, null);
    }

    /* JADX INFO: renamed from: h */
    private void m66234h(Context context, AttributeSet attributeSet) {
        this.f43179e = getVisibility();
        if (NullChecker.m82486a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, shc0.f168622I);
            this.f43178d = typedArrayObtainStyledAttributes.getInt(shc0.f168627N, -1);
            this.f43180f = typedArrayObtainStyledAttributes.getDimensionPixelSize(shc0.f168626M, -1);
            this.f43181g = typedArrayObtainStyledAttributes.getDimensionPixelSize(shc0.f168625L, -1);
            this.f43182h = typedArrayObtainStyledAttributes.getColor(shc0.f168623J, -1);
            this.f43183i = typedArrayObtainStyledAttributes.getColor(shc0.f168624K, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
        m66240o();
    }

    /* JADX INFO: renamed from: i */
    private boolean m66235i(int i) {
        return i == 4 || i == 8;
    }

    /* JADX INFO: renamed from: j */
    private boolean m66236j(int i) {
        return i == 0;
    }

    /* JADX INFO: renamed from: l */
    private void m66237l() {
        if (this.f43178d > 0) {
            byh.m106997d().m107015s(Integer.valueOf(this.f43178d));
        }
    }

    /* JADX INFO: renamed from: m */
    private void m66238m() {
        if (this.f43178d > 0) {
            byh.m106997d().m107011o(this, this.f43178d, this.f43184j);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m66239k() {
        if (this.f43178d > 0) {
            byh.m106997d().m107009m(this.f43178d, this.f43184j);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m66240o() {
        if (this.f43180f != -1) {
            setImageDrawable(new p3h(this.f43180f, this.f43181g, this.f43182h, this.f43183i));
        }
    }

    public void setOvalColor(int i) {
        this.f43182h = i;
    }

    public void setPageId(String str) {
        this.f43184j = str;
    }

    public void setRedPointType(int i) {
        this.f43178d = i;
    }

    public void setRingColor(int i) {
        this.f43183i = i;
    }

    public void setRingWidth(int i) {
        this.f43181g = i;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (m66235i(this.f43179e) && m66236j(i)) {
            m66238m();
        } else if (m66236j(this.f43179e) && m66235i(i)) {
            m66237l();
        }
        this.f43179e = i;
    }

    public void setWidth(int i) {
        this.f43180f = i;
    }

    public FeedRedDotView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43178d = -1;
        m66234h(context, attributeSet);
    }

    public FeedRedDotView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43178d = -1;
        m66234h(context, attributeSet);
    }
}
