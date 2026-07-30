package com.p000p1.mobile.putong.core.p004ui.svip.guide;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.member.R;
import l.z5h0;
import v.VText;
import v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SvipIntlHeaderView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f6286a;

    /* JADX INFO: renamed from: b */
    public VText f6287b;

    public SvipIntlHeaderView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m9243a(View view) {
        z5h0.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9243a(this);
        String string = getResources().getString(R.string.q0, "14");
        int iIndexOf = string.indexOf("14");
        int i = iIndexOf + 2;
        if (iIndexOf == -1 || i > string.length()) {
            this.f6287b.setText(string);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD, Color.parseColor("#eaa554")), iIndexOf, i, 34);
        this.f6287b.setText(spannableStringBuilder);
    }

    public SvipIntlHeaderView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SvipIntlHeaderView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
