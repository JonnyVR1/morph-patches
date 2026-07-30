package com.p046p1.mobile.putong.feed.newui.photoalbum.redpointview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p149l.a2h;
import p149l.m9c0;
import p149l.mwh;

/* JADX INFO: loaded from: classes12.dex */
public class FeedRedDotView extends VImage {

    /* JADX INFO: renamed from: d */
    public int f42330d;

    /* JADX INFO: renamed from: e */
    public int f42331e;

    /* JADX INFO: renamed from: f */
    public int f42332f;

    /* JADX INFO: renamed from: g */
    public int f42333g;

    /* JADX INFO: renamed from: h */
    public int f42334h;

    /* JADX INFO: renamed from: i */
    public int f42335i;

    /* JADX INFO: renamed from: j */
    public String f42336j;

    public FeedRedDotView(Context context) {
        super(context);
        this.f42330d = -1;
        m65051h(context, null);
    }

    /* JADX INFO: renamed from: h */
    private void m65051h(Context context, AttributeSet attributeSet) {
        this.f42331e = getVisibility();
        if (NullChecker.m81303a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f132700I);
            this.f42330d = typedArrayObtainStyledAttributes.getInt(m9c0.f132705N, -1);
            this.f42332f = typedArrayObtainStyledAttributes.getDimensionPixelSize(m9c0.f132704M, -1);
            this.f42333g = typedArrayObtainStyledAttributes.getDimensionPixelSize(m9c0.f132703L, -1);
            this.f42334h = typedArrayObtainStyledAttributes.getColor(m9c0.f132701J, -1);
            this.f42335i = typedArrayObtainStyledAttributes.getColor(m9c0.f132702K, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
        m65057o();
    }

    /* JADX INFO: renamed from: i */
    private boolean m65052i(int i) {
        return i == 4 || i == 8;
    }

    /* JADX INFO: renamed from: j */
    private boolean m65053j(int i) {
        return i == 0;
    }

    /* JADX INFO: renamed from: l */
    private void m65054l() {
        if (this.f42330d > 0) {
            mwh.m156632d().m156650s(Integer.valueOf(this.f42330d));
        }
    }

    /* JADX INFO: renamed from: m */
    private void m65055m() {
        if (this.f42330d > 0) {
            mwh.m156632d().m156646o(this, this.f42330d, this.f42336j);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m65056k() {
        if (this.f42330d > 0) {
            mwh.m156632d().m156644m(this.f42330d, this.f42336j);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m65057o() {
        if (this.f42332f != -1) {
            setImageDrawable(new a2h(this.f42332f, this.f42333g, this.f42334h, this.f42335i));
        }
    }

    public void setOvalColor(int i) {
        this.f42334h = i;
    }

    public void setPageId(String str) {
        this.f42336j = str;
    }

    public void setRedPointType(int i) {
        this.f42330d = i;
    }

    public void setRingColor(int i) {
        this.f42335i = i;
    }

    public void setRingWidth(int i) {
        this.f42333g = i;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (m65052i(this.f42331e) && m65053j(i)) {
            m65055m();
        } else if (m65053j(this.f42331e) && m65052i(i)) {
            m65054l();
        }
        this.f42331e = i;
    }

    public void setWidth(int i) {
        this.f42332f = i;
    }

    public FeedRedDotView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42330d = -1;
        m65051h(context, attributeSet);
    }

    public FeedRedDotView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42330d = -1;
        m65051h(context, attributeSet);
    }
}
