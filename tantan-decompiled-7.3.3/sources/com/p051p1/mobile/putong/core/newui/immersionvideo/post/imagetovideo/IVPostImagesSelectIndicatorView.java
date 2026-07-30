package com.p051p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectIndicatorView;
import com.tantanapp.common.utils.NullChecker;
import p153l.adc0;
import p153l.bnl0;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class IVPostImagesSelectIndicatorView extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static int f24881c = 32;

    /* JADX INFO: renamed from: d */
    public static int f24882d = 2;

    /* JADX INFO: renamed from: e */
    public static int f24883e;

    /* JADX INFO: renamed from: f */
    public static int f24884f;

    /* JADX INFO: renamed from: a */
    public View f24885a;

    /* JADX INFO: renamed from: b */
    public ImageView f24886b;

    static {
        int iM105592y0 = bnl0.m105592y0() - qa00.m175859d(f24881c);
        f24883e = iM105592y0;
        f24884f = (iM105592y0 - (qa00.m175859d(f24882d) * 3)) / 3;
    }

    public IVPostImagesSelectIndicatorView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m40303a(IVPostImagesSelectAct.InterfaceC8222c interfaceC8222c, View view) {
        if (NullChecker.m82486a(interfaceC8222c)) {
            interfaceC8222c.mo40290a();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m40304b(final IVPostImagesSelectAct.InterfaceC8222c interfaceC8222c) {
        this.f24885a.setOnClickListener(new View.OnClickListener() { // from class: l.r8m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IVPostImagesSelectIndicatorView.m40303a(interfaceC8222c, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f24885a = findViewById(adc0.f70547s);
        ImageView imageView = (ImageView) findViewById(adc0.f70558sa);
        this.f24886b = imageView;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = f24884f - qa00.m175859d(6.0f);
        layoutParams.height = f24884f - qa00.m175859d(6.0f);
        this.f24886b.setLayoutParams(layoutParams);
    }

    public IVPostImagesSelectIndicatorView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IVPostImagesSelectIndicatorView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
