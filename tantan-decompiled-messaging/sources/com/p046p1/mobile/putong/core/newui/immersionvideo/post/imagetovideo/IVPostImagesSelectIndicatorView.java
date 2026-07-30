package com.p046p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectIndicatorView;
import com.tantanapp.common.utils.NullChecker;
import p149l.t100;
import p149l.u4c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class IVPostImagesSelectIndicatorView extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static int f24139c = 32;

    /* JADX INFO: renamed from: d */
    public static int f24140d = 2;

    /* JADX INFO: renamed from: e */
    public static int f24141e;

    /* JADX INFO: renamed from: f */
    public static int f24142f;

    /* JADX INFO: renamed from: a */
    public View f24143a;

    /* JADX INFO: renamed from: b */
    public ImageView f24144b;

    static {
        int iM208412y0 = xdl0.m208412y0() - t100.m186890d(f24139c);
        f24141e = iM208412y0;
        f24142f = (iM208412y0 - (t100.m186890d(f24140d) * 3)) / 3;
    }

    public IVPostImagesSelectIndicatorView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m39300a(IVPostImagesSelectAct.InterfaceC8071c interfaceC8071c, View view) {
        if (NullChecker.m81303a(interfaceC8071c)) {
            interfaceC8071c.mo39287a();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m39301b(final IVPostImagesSelectAct.InterfaceC8071c interfaceC8071c) {
        this.f24143a.setOnClickListener(new View.OnClickListener() { // from class: l.b6m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IVPostImagesSelectIndicatorView.m39300a(interfaceC8071c, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f24143a = findViewById(u4c0.f174456s);
        ImageView imageView = (ImageView) findViewById(u4c0.f174433qa);
        this.f24144b = imageView;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = f24142f - t100.m186890d(6.0f);
        layoutParams.height = f24142f - t100.m186890d(6.0f);
        this.f24144b.setLayoutParams(layoutParams);
    }

    public IVPostImagesSelectIndicatorView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IVPostImagesSelectIndicatorView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
