package com.p000p1.mobile.putong.core.newui.loveletter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.loveletter.LoveLetterSearchLayout;
import l.u4c0;
import l.xdl0;
import p009l.hcw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LoveLetterSearchLayout extends FrameLayout {
    public LoveLetterSearchLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3664a(hcw hcwVar, View view) {
        if (hcwVar != null) {
            hcwVar.mo15580F();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3665b(final hcw hcwVar) {
        View viewFindViewById = findViewById(u4c0.Rb);
        if (viewFindViewById != null) {
            xdl0.E0(viewFindViewById, new View.OnClickListener() { // from class: l.sbw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoveLetterSearchLayout.m3664a(hcwVar, view);
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
