package com.p000p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tantan.library.svga.SVGAnimationView;
import l.f6c0;
import l.u4c0;
import org.jetbrains.annotations.Nullable;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CoreSvgaView extends VFrame {

    /* JADX INFO: renamed from: a */
    public final SVGAnimationView f5686a;

    /* JADX WARN: Multi-variable type inference failed */
    public CoreSvgaView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, f6c0.d2, this);
        this.f5686a = findViewById(u4c0.td);
    }

    public CoreSvgaView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CoreSvgaView(@Nullable Context context) {
        this(context, null);
    }
}
