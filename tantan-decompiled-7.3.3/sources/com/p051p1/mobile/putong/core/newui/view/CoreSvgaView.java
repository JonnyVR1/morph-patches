package com.p051p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tantan.library.svga.SVGAnimationView;
import org.jetbrains.annotations.Nullable;
import p151v.VFrame;
import p153l.adc0;
import p153l.kec0;

/* JADX INFO: loaded from: classes11.dex */
public class CoreSvgaView extends VFrame {

    /* JADX INFO: renamed from: a */
    public final SVGAnimationView f27756a;

    public CoreSvgaView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, kec0.f125790d2, this);
        this.f27756a = (SVGAnimationView) findViewById(adc0.f70612vd);
    }

    public CoreSvgaView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CoreSvgaView(@Nullable Context context) {
        this(context, null);
    }
}
