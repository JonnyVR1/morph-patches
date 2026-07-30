package com.p046p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectMediaView;
import com.p046p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame;
import p149l.qib0;
import p149l.t100;
import p149l.u4c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class IVPostImagesSelectMediaView extends VFrame {

    /* JADX INFO: renamed from: c */
    public static int f24145c = 32;

    /* JADX INFO: renamed from: d */
    public static int f24146d = 2;

    /* JADX INFO: renamed from: e */
    public static int f24147e;

    /* JADX INFO: renamed from: f */
    public static int f24148f;

    /* JADX INFO: renamed from: a */
    public VDraweeView f24149a;

    /* JADX INFO: renamed from: b */
    public ImageView f24150b;

    static {
        int iM208412y0 = xdl0.m208412y0() - t100.m186890d(f24145c);
        f24147e = iM208412y0;
        f24148f = (iM208412y0 - (t100.m186890d(f24146d) * 3)) / 3;
    }

    public IVPostImagesSelectMediaView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m39302p(IVPostImagesSelectAct.InterfaceC8072d interfaceC8072d, Media media, View view) {
        if (NullChecker.m81303a(interfaceC8072d)) {
            interfaceC8072d.mo39289b(media);
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m39303s(IVPostImagesSelectAct.InterfaceC8072d interfaceC8072d, Media media, View view) {
        if (NullChecker.m81303a(interfaceC8072d)) {
            interfaceC8072d.mo39288a(media);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f24149a = (VDraweeView) findViewById(u4c0.f173909L5);
        this.f24150b = (ImageView) findViewById(u4c0.f174340l2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24149a.getLayoutParams();
        layoutParams.height = f24148f - t100.m186890d(6.0f);
        layoutParams.width = f24148f - t100.m186890d(6.0f);
        this.f24149a.setLayoutParams(layoutParams);
    }

    public void setImageDeleteVisible(boolean z) {
        xdl0.m208344M(this.f24150b, z);
    }

    /* JADX INFO: renamed from: u */
    public void m39304u(final Media media, final IVPostImagesSelectAct.InterfaceC8072d interfaceC8072d) {
        xdl0.m208329E0(this.f24150b, new View.OnClickListener() { // from class: l.c6m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IVPostImagesSelectMediaView.m39303s(interfaceC8072d, media, view);
            }
        });
        qib0.f154691G.m184725o(this.f24149a);
        qib0.f154691G.m102367m0(this.f24149a, media.url);
        xdl0.m208329E0(this.f24149a, new View.OnClickListener() { // from class: l.d6m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IVPostImagesSelectMediaView.m39302p(interfaceC8072d, media, view);
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
