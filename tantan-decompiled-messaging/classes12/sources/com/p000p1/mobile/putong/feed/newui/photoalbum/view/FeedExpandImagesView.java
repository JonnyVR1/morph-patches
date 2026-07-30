package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import l.f30;
import l.t100;
import l.xdl0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedExpandImagesView extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final int f3839d = (xdl0.y0() * 4) / 3;

    /* JADX INFO: renamed from: e */
    public static final int f3840e;

    /* JADX INFO: renamed from: f */
    public static final int f3841f;

    /* JADX INFO: renamed from: a */
    public Map<Integer, VDraweeView> f3842a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f3843b;

    /* JADX INFO: renamed from: c */
    public f30<Integer, View> f3844c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.view.FeedExpandImagesView$a */
    public interface InterfaceC2155a {
    }

    static {
        int iY0 = xdl0.y0() - t100.d(32.0f);
        f3840e = iY0;
        f3841f = (iY0 * 3) / 4;
    }

    public FeedExpandImagesView(Context context) {
        super(context);
        this.f3842a = new HashMap();
    }

    private void setHeight(int i) {
        ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams) this.f3843b.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-1, i);
        } else {
            layoutParams.height = i;
        }
        this.f3843b.setLayoutParams(layoutParams);
    }

    public void setFeedExpandImagesStatusListener(InterfaceC2155a interfaceC2155a) {
    }

    public void setImageOnClick(f30<Integer, View> f30Var) {
        this.f3844c = f30Var;
    }

    public FeedExpandImagesView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3842a = new HashMap();
    }

    public FeedExpandImagesView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3842a = new HashMap();
    }
}
