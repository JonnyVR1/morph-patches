package com.p046p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tantan.library.svga.SVGAnimationView;
import org.jetbrains.annotations.Nullable;
import p147v.VFrame;
import p149l.f6c0;
import p149l.u4c0;

/* JADX INFO: loaded from: classes11.dex */
public class CoreSvgaView extends VFrame {

    /* JADX INFO: renamed from: a */
    public final SVGAnimationView f26908a;

    public CoreSvgaView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, f6c0.f95736d2, this);
        this.f26908a = (SVGAnimationView) findViewById(u4c0.f174487td);
    }

    public CoreSvgaView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CoreSvgaView(@Nullable Context context) {
        this(context, null);
    }
}
