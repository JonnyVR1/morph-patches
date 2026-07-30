package com.p000p1.mobile.putong.core.newui.loveletter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.data.LoveLetterMessageState;
import com.p1.mobile.putong.data.User;
import l.u4c0;
import p009l.rbw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LoveLetterCompleteLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LoveLetterMainLayout f3156a;

    /* JADX INFO: renamed from: b */
    public TextView f3157b;

    public LoveLetterCompleteLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public void m3624b(final rbw rbwVar, final String str, final User user, LoveLetterMessageState loveLetterMessageState) {
        this.f3156a.m3663b(user, loveLetterMessageState);
        this.f3157b.setOnClickListener(new View.OnClickListener() { // from class: l.jaw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rbwVar.m21489u0(str, user);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f3156a = (LoveLetterMainLayout) findViewById(u4c0.N7);
        TextView textView = (TextView) findViewById(u4c0.Yc);
        this.f3157b = textView;
        textView.setSelected(true);
    }

    public LoveLetterCompleteLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LoveLetterCompleteLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
