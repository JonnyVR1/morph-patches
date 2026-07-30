package com.p000p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p000p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectMediaView;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import l.qib0;
import l.t100;
import l.u4c0;
import l.xdl0;
import v.VDraweeView;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IVPostImagesSelectMediaView extends VFrame {

    /* JADX INFO: renamed from: c */
    public static int f2923c = 32;

    /* JADX INFO: renamed from: d */
    public static int f2924d = 2;

    /* JADX INFO: renamed from: e */
    public static int f2925e;

    /* JADX INFO: renamed from: f */
    public static int f2926f;

    /* JADX INFO: renamed from: a */
    public VDraweeView f2927a;

    /* JADX INFO: renamed from: b */
    public ImageView f2928b;

    static {
        int iY0 = xdl0.y0() - t100.d(f2923c);
        f2925e = iY0;
        f2926f = (iY0 - (t100.d(f2924d) * 3)) / 3;
    }

    public IVPostImagesSelectMediaView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m3327p(IVPostImagesSelectAct.InterfaceC0236d interfaceC0236d, Media media, View view) {
        if (NullChecker.a(interfaceC0236d)) {
            interfaceC0236d.mo3311b(media);
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m3328s(IVPostImagesSelectAct.InterfaceC0236d interfaceC0236d, Media media, View view) {
        if (NullChecker.a(interfaceC0236d)) {
            interfaceC0236d.mo3310a(media);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.f2927a = findViewById(u4c0.L5);
        this.f2928b = (ImageView) findViewById(u4c0.l2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f2927a.getLayoutParams();
        layoutParams.height = f2926f - t100.d(6.0f);
        layoutParams.width = f2926f - t100.d(6.0f);
        this.f2927a.setLayoutParams(layoutParams);
    }

    public void setImageDeleteVisible(boolean z) {
        xdl0.M(this.f2928b, z);
    }

    /* JADX INFO: renamed from: u */
    public void m3329u(final Media media, final IVPostImagesSelectAct.InterfaceC0236d interfaceC0236d) {
        xdl0.E0(this.f2928b, new View.OnClickListener() { // from class: l.c6m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IVPostImagesSelectMediaView.m3328s(interfaceC0236d, media, view);
            }
        });
        qib0.G.o(this.f2927a);
        qib0.G.m0(this.f2927a, media.url);
        xdl0.E0(this.f2927a, new View.OnClickListener() { // from class: l.d6m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IVPostImagesSelectMediaView.m3327p(interfaceC0236d, media, view);
            }
        });
    }

    public IVPostImagesSelectMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IVPostImagesSelectMediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
