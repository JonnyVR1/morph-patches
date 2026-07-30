package com.p051p1.mobile.putong.core.newui.loveletter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.newui.loveletter.LoveLetterSearchLayout;
import p153l.adc0;
import p153l.bnl0;
import p153l.few;

/* JADX INFO: loaded from: classes11.dex */
public class LoveLetterSearchLayout extends FrameLayout {
    public LoveLetterSearchLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m40596a(few fewVar, View view) {
        if (fewVar != null) {
            fewVar.mo125335F();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m40597b(final few fewVar) {
        View viewFindViewById = findViewById(adc0.f70139Tb);
        if (viewFindViewById != null) {
            bnl0.m105509E0(viewFindViewById, new View.OnClickListener() { // from class: l.qdw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoveLetterSearchLayout.m40596a(fewVar, view);
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
