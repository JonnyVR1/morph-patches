package com.p051p1.mobile.putong.core.p058ui.svip.guide;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.member.R$string;
import com.tencent.connect.common.Constants;
import p151v.VText;
import p151v.text.CustomTypefaceSpan;
import p153l.heh0;

/* JADX INFO: loaded from: classes12.dex */
public class SvipIntlHeaderView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f37353a;

    /* JADX INFO: renamed from: b */
    public VText f37354b;

    public SvipIntlHeaderView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m57028a(View view) {
        heh0.m134630a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57028a(this);
        String string = getResources().getString(R$string.f21418q0, Constants.VIA_REPORT_TYPE_MAKE_FRIEND);
        int iIndexOf = string.indexOf(Constants.VIA_REPORT_TYPE_MAKE_FRIEND);
        int i = iIndexOf + 2;
        if (iIndexOf == -1 || i > string.length()) {
            this.f37354b.setText(string);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD, Color.parseColor("#eaa554")), iIndexOf, i, 34);
        this.f37354b.setText(spannableStringBuilder);
    }

    public SvipIntlHeaderView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SvipIntlHeaderView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
