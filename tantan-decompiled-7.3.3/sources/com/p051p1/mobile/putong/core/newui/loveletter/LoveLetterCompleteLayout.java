package com.p051p1.mobile.putong.core.newui.loveletter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.LoveLetterMessageState;
import com.p051p1.mobile.putong.data.User;
import p153l.adc0;
import p153l.pdw;

/* JADX INFO: loaded from: classes11.dex */
public class LoveLetterCompleteLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LoveLetterMainLayout f25120a;

    /* JADX INFO: renamed from: b */
    public TextView f25121b;

    public LoveLetterCompleteLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public void m40556b(final pdw pdwVar, final String str, final User user, LoveLetterMessageState loveLetterMessageState) {
        this.f25120a.m40595b(user, loveLetterMessageState);
        this.f25121b.setOnClickListener(new View.OnClickListener() { // from class: l.hcw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pdwVar.m171909u0(str, user);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f25120a = (LoveLetterMainLayout) findViewById(adc0.f70067P7);
        TextView textView = (TextView) findViewById(adc0.f70256ad);
        this.f25121b = textView;
        textView.setSelected(true);
    }

    public LoveLetterCompleteLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LoveLetterCompleteLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
