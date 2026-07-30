package com.p046p1.mobile.putong.core.p053ui.svip.guide;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.member.R$string;
import com.tencent.connect.common.Constants;
import p147v.VText;
import p147v.text.CustomTypefaceSpan;
import p149l.z5h0;

/* JADX INFO: loaded from: classes9.dex */
public class SvipIntlHeaderView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f36505a;

    /* JADX INFO: renamed from: b */
    public VText f36506b;

    public SvipIntlHeaderView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55845a(View view) {
        z5h0.m217336a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55845a(this);
        String string = getResources().getString(R$string.f20676q0, Constants.VIA_REPORT_TYPE_MAKE_FRIEND);
        int iIndexOf = string.indexOf(Constants.VIA_REPORT_TYPE_MAKE_FRIEND);
        int i = iIndexOf + 2;
        if (iIndexOf == -1 || i > string.length()) {
            this.f36506b.setText(string);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD, Color.parseColor("#eaa554")), iIndexOf, i, 34);
        this.f36506b.setText(spannableStringBuilder);
    }

    public SvipIntlHeaderView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SvipIntlHeaderView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
