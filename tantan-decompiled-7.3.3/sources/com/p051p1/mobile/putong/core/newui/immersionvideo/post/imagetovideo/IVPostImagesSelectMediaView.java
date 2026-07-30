package com.p051p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectMediaView;
import com.p051p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.adc0;
import p153l.bnl0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class IVPostImagesSelectMediaView extends VFrame {

    /* JADX INFO: renamed from: c */
    public static int f24887c = 32;

    /* JADX INFO: renamed from: d */
    public static int f24888d = 2;

    /* JADX INFO: renamed from: e */
    public static int f24889e;

    /* JADX INFO: renamed from: f */
    public static int f24890f;

    /* JADX INFO: renamed from: a */
    public VDraweeView f24891a;

    /* JADX INFO: renamed from: b */
    public ImageView f24892b;

    static {
        int iM105592y0 = bnl0.m105592y0() - qa00.m175859d(f24887c);
        f24889e = iM105592y0;
        f24890f = (iM105592y0 - (qa00.m175859d(f24888d) * 3)) / 3;
    }

    public IVPostImagesSelectMediaView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m40305p(IVPostImagesSelectAct.InterfaceC8223d interfaceC8223d, Media media, View view) {
        if (NullChecker.m82486a(interfaceC8223d)) {
            interfaceC8223d.mo40292b(media);
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m40306s(IVPostImagesSelectAct.InterfaceC8223d interfaceC8223d, Media media, View view) {
        if (NullChecker.m82486a(interfaceC8223d)) {
            interfaceC8223d.mo40291a(media);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f24891a = (VDraweeView) findViewById(adc0.f70031N5);
        this.f24892b = (ImageView) findViewById(adc0.f70465n2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24891a.getLayoutParams();
        layoutParams.height = f24890f - qa00.m175859d(6.0f);
        layoutParams.width = f24890f - qa00.m175859d(6.0f);
        this.f24891a.setLayoutParams(layoutParams);
    }

    public void setImageDeleteVisible(boolean z) {
        bnl0.m105524M(this.f24892b, z);
    }

    /* JADX INFO: renamed from: u */
    public void m40307u(final Media media, final IVPostImagesSelectAct.InterfaceC8223d interfaceC8223d) {
        bnl0.m105509E0(this.f24892b, new View.OnClickListener() { // from class: l.s8m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IVPostImagesSelectMediaView.m40306s(interfaceC8223d, media, view);
            }
        });
        uqb0.f180374G.m98798o(this.f24891a);
        uqb0.f180374G.m127150m0(this.f24891a, media.url);
        bnl0.m105509E0(this.f24891a, new View.OnClickListener() { // from class: l.t8m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IVPostImagesSelectMediaView.m40305p(interfaceC8223d, media, view);
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
