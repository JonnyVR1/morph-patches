package com.p000p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectIndicatorView;
import com.tantanapp.common.utils.NullChecker;
import l.t100;
import l.u4c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IVPostImagesSelectIndicatorView extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static int f2917c = 32;

    /* JADX INFO: renamed from: d */
    public static int f2918d = 2;

    /* JADX INFO: renamed from: e */
    public static int f2919e;

    /* JADX INFO: renamed from: f */
    public static int f2920f;

    /* JADX INFO: renamed from: a */
    public View f2921a;

    /* JADX INFO: renamed from: b */
    public ImageView f2922b;

    static {
        int iY0 = xdl0.y0() - t100.d(f2917c);
        f2919e = iY0;
        f2920f = (iY0 - (t100.d(f2918d) * 3)) / 3;
    }

    public IVPostImagesSelectIndicatorView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3325a(IVPostImagesSelectAct.InterfaceC0235c interfaceC0235c, View view) {
        if (NullChecker.a(interfaceC0235c)) {
            interfaceC0235c.mo3309a();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3326b(final IVPostImagesSelectAct.InterfaceC0235c interfaceC0235c) {
        this.f2921a.setOnClickListener(new View.OnClickListener() { // from class: l.b6m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IVPostImagesSelectIndicatorView.m3325a(interfaceC0235c, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2921a = findViewById(u4c0.s);
        ImageView imageView = (ImageView) findViewById(u4c0.qa);
        this.f2922b = imageView;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = f2920f - t100.d(6.0f);
        layoutParams.height = f2920f - t100.d(6.0f);
        this.f2922b.setLayoutParams(layoutParams);
    }

    public IVPostImagesSelectIndicatorView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IVPostImagesSelectIndicatorView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
