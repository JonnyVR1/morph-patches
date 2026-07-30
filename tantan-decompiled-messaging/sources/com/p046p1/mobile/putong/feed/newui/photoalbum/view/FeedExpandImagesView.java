package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import p147v.VDraweeView;
import p149l.f30;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedExpandImagesView extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final int f42378d = (xdl0.m208412y0() * 4) / 3;

    /* JADX INFO: renamed from: e */
    public static final int f42379e;

    /* JADX INFO: renamed from: f */
    public static final int f42380f;

    /* JADX INFO: renamed from: a */
    public Map<Integer, VDraweeView> f42381a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f42382b;

    /* JADX INFO: renamed from: c */
    public f30<Integer, View> f42383c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.view.FeedExpandImagesView$a */
    public interface InterfaceC11311a {
    }

    static {
        int iM208412y0 = xdl0.m208412y0() - t100.m186890d(32.0f);
        f42379e = iM208412y0;
        f42380f = (iM208412y0 * 3) / 4;
    }

    public FeedExpandImagesView(Context context) {
        super(context);
        this.f42381a = new HashMap();
    }

    private void setHeight(int i) {
        ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams) this.f42382b.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-1, i);
        } else {
            layoutParams.height = i;
        }
        this.f42382b.setLayoutParams(layoutParams);
    }

    public void setFeedExpandImagesStatusListener(InterfaceC11311a interfaceC11311a) {
    }

    public void setImageOnClick(f30<Integer, View> f30Var) {
        this.f42383c = f30Var;
    }

    public FeedExpandImagesView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42381a = new HashMap();
    }

    public FeedExpandImagesView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42381a = new HashMap();
    }
}
