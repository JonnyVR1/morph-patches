package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.qa00;
import p153l.z20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedExpandImagesView extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final int f43226d = (bnl0.m105592y0() * 4) / 3;

    /* JADX INFO: renamed from: e */
    public static final int f43227e;

    /* JADX INFO: renamed from: f */
    public static final int f43228f;

    /* JADX INFO: renamed from: a */
    public Map<Integer, VDraweeView> f43229a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f43230b;

    /* JADX INFO: renamed from: c */
    public z20<Integer, View> f43231c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.view.FeedExpandImagesView$a */
    public interface InterfaceC11474a {
    }

    static {
        int iM105592y0 = bnl0.m105592y0() - qa00.m175859d(32.0f);
        f43227e = iM105592y0;
        f43228f = (iM105592y0 * 3) / 4;
    }

    public FeedExpandImagesView(Context context) {
        super(context);
        this.f43229a = new HashMap();
    }

    private void setHeight(int i) {
        ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams) this.f43230b.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-1, i);
        } else {
            layoutParams.height = i;
        }
        this.f43230b.setLayoutParams(layoutParams);
    }

    public void setFeedExpandImagesStatusListener(InterfaceC11474a interfaceC11474a) {
    }

    public void setImageOnClick(z20<Integer, View> z20Var) {
        this.f43231c = z20Var;
    }

    public FeedExpandImagesView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43229a = new HashMap();
    }

    public FeedExpandImagesView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43229a = new HashMap();
    }
}
