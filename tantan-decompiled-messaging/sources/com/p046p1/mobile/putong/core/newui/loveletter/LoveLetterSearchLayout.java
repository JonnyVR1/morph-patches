package com.p046p1.mobile.putong.core.newui.loveletter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.newui.loveletter.LoveLetterSearchLayout;
import p149l.hcw;
import p149l.u4c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class LoveLetterSearchLayout extends FrameLayout {
    public LoveLetterSearchLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m39593a(hcw hcwVar, View view) {
        if (hcwVar != null) {
            hcwVar.mo130520F();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m39594b(final hcw hcwVar) {
        View viewFindViewById = findViewById(u4c0.f174017Rb);
        if (viewFindViewById != null) {
            xdl0.m208329E0(viewFindViewById, new View.OnClickListener() { // from class: l.sbw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoveLetterSearchLayout.m39593a(hcwVar, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public LoveLetterSearchLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LoveLetterSearchLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
