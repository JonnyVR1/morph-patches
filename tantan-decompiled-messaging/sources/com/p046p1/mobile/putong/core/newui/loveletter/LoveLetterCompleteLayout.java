package com.p046p1.mobile.putong.core.newui.loveletter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.LoveLetterMessageState;
import com.p046p1.mobile.putong.data.User;
import p149l.rbw;
import p149l.u4c0;

/* JADX INFO: loaded from: classes11.dex */
public class LoveLetterCompleteLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LoveLetterMainLayout f24378a;

    /* JADX INFO: renamed from: b */
    public TextView f24379b;

    public LoveLetterCompleteLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public void m39553b(final rbw rbwVar, final String str, final User user, LoveLetterMessageState loveLetterMessageState) {
        this.f24378a.m39592b(user, loveLetterMessageState);
        this.f24379b.setOnClickListener(new View.OnClickListener() { // from class: l.jaw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rbwVar.m178719u0(str, user);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f24378a = (LoveLetterMainLayout) findViewById(u4c0.f173945N7);
        TextView textView = (TextView) findViewById(u4c0.f174132Yc);
        this.f24379b = textView;
        textView.setSelected(true);
    }

    public LoveLetterCompleteLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LoveLetterCompleteLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
