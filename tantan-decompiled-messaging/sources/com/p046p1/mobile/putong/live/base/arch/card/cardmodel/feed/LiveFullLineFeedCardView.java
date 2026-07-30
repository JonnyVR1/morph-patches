package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.feed;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VDraweeView;
import p147v.VText;
import p149l.d5c0;
import p149l.hxs;
import p149l.jss;
import p149l.mep0;
import p149l.t100;
import p149l.wk4;
import p149l.yds;

/* JADX INFO: loaded from: classes13.dex */
public class LiveFullLineFeedCardView extends ConstraintLayout {
    private VDraweeView bottomImage;
    private VText bottomTextView;
    private VText cornerTextView;
    private VDraweeView leftImage;
    private VText midTextView;
    private VText topTextView;

    public LiveFullLineFeedCardView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public int m67456h0(CharSequence charSequence, int i) {
        if (TextUtils.isEmpty(charSequence)) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (i3 <= i) {
                i2 = m67458j0(charSequence.charAt(i3)) ? i2 + 1 : i2 + 2;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: i0 */
    public jss m67457i0(String str, String str2) {
        jss jssVar = new jss();
        if (TextUtils.isEmpty(str)) {
            jssVar.result = "";
            return jssVar;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int iIndexOf = str.indexOf(str2);
        if (iIndexOf >= 0) {
            int length = str2.length() + iIndexOf;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FE7E1D")), iIndexOf, length, 33);
            jssVar.start = iIndexOf;
            jssVar.end = length;
        }
        jssVar.result = spannableStringBuilder;
        return jssVar;
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m67458j0(char c) {
        return c >= 0 && c <= 127;
    }

    /* JADX INFO: renamed from: k0 */
    public void m67459k0(yds ydsVar) {
        hxs.m133406s("context_square", this.leftImage, ydsVar.leftImageUrl);
        hxs.m133406s("context_square", this.bottomImage, ydsVar.bottomImageUrl);
        if (TextUtils.isEmpty(ydsVar.highLightText)) {
            wk4.m203651d(this.topTextView, ydsVar.topText);
            VText vText = this.topTextView;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            vText.setEllipsize(truncateAt);
            wk4.m203651d(this.midTextView, ydsVar.midTextPrefix + ydsVar.midText);
            wk4.m203651d(this.bottomTextView, ydsVar.bottomText);
            this.bottomTextView.setEllipsize(truncateAt);
        } else {
            jss jssVarM67457i0 = m67457i0(ydsVar.topText, ydsVar.highLightText);
            wk4.m203650c(this.topTextView, jssVarM67457i0.result);
            m67460l0(this.topTextView, jssVarM67457i0, 24);
            CharSequence charSequenceAppend = m67457i0(ydsVar.midText, ydsVar.highLightText).result;
            if (!TextUtils.isEmpty(ydsVar.midTextPrefix)) {
                charSequenceAppend = new SpannableStringBuilder().append((CharSequence) ydsVar.midTextPrefix).append(charSequenceAppend);
            }
            wk4.m203650c(this.midTextView, charSequenceAppend);
            jss jssVarM67457i1 = m67457i0(ydsVar.bottomText, ydsVar.highLightText);
            wk4.m203650c(this.bottomTextView, jssVarM67457i1.result);
            m67460l0(this.bottomTextView, jssVarM67457i1, 12);
        }
        wk4.m203651d(this.cornerTextView, ydsVar.cornerText);
    }

    /* JADX INFO: renamed from: l0 */
    public void m67460l0(TextView textView, jss jssVar, int i) {
        int i2 = jssVar.end;
        if (i2 == 0 && jssVar.start == 0) {
            textView.setEllipsize(TextUtils.TruncateAt.END);
        } else if (m67456h0(jssVar.result, i2 - 1) <= i) {
            textView.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            textView.setMarqueeRepeatLimit(-1);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        mep0.m154302d1(this, t100.f167260i);
        this.leftImage = (VDraweeView) findViewById(d5c0.f84456Z);
        this.topTextView = (VText) findViewById(d5c0.f84463b1);
        this.midTextView = (VText) findViewById(d5c0.f84498n0);
        this.bottomImage = (VDraweeView) findViewById(d5c0.f84512t);
        this.bottomTextView = (VText) findViewById(d5c0.f84514u);
        this.cornerTextView = (VText) findViewById(d5c0.f84410C);
    }

    public LiveFullLineFeedCardView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveFullLineFeedCardView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
