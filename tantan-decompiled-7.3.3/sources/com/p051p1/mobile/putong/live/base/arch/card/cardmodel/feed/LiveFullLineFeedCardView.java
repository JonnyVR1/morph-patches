package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.feed;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VDraweeView;
import p151v.VText;
import p153l.izs;
import p153l.jdc0;
import p153l.kus;
import p153l.qa00;
import p153l.qnp0;
import p153l.vl4;
import p153l.zfs;

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
    public int m68639h0(CharSequence charSequence, int i) {
        if (TextUtils.isEmpty(charSequence)) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (i3 <= i) {
                i2 = m68641j0(charSequence.charAt(i3)) ? i2 + 1 : i2 + 2;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: i0 */
    public kus m68640i0(String str, String str2) {
        kus kusVar = new kus();
        if (TextUtils.isEmpty(str)) {
            kusVar.result = "";
            return kusVar;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int iIndexOf = str.indexOf(str2);
        if (iIndexOf >= 0) {
            int length = str2.length() + iIndexOf;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FE7E1D")), iIndexOf, length, 33);
            kusVar.start = iIndexOf;
            kusVar.end = length;
        }
        kusVar.result = spannableStringBuilder;
        return kusVar;
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m68641j0(char c) {
        return c >= 0 && c <= 127;
    }

    /* JADX INFO: renamed from: k0 */
    public void m68642k0(zfs zfsVar) {
        izs.m142868s("context_square", this.leftImage, zfsVar.leftImageUrl);
        izs.m142868s("context_square", this.bottomImage, zfsVar.bottomImageUrl);
        if (TextUtils.isEmpty(zfsVar.highLightText)) {
            vl4.m201592d(this.topTextView, zfsVar.topText);
            VText vText = this.topTextView;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            vText.setEllipsize(truncateAt);
            vl4.m201592d(this.midTextView, zfsVar.midTextPrefix + zfsVar.midText);
            vl4.m201592d(this.bottomTextView, zfsVar.bottomText);
            this.bottomTextView.setEllipsize(truncateAt);
        } else {
            kus kusVarM68640i0 = m68640i0(zfsVar.topText, zfsVar.highLightText);
            vl4.m201591c(this.topTextView, kusVarM68640i0.result);
            m68643l0(this.topTextView, kusVarM68640i0, 24);
            CharSequence charSequenceAppend = m68640i0(zfsVar.midText, zfsVar.highLightText).result;
            if (!TextUtils.isEmpty(zfsVar.midTextPrefix)) {
                charSequenceAppend = new SpannableStringBuilder().append((CharSequence) zfsVar.midTextPrefix).append(charSequenceAppend);
            }
            vl4.m201591c(this.midTextView, charSequenceAppend);
            kus kusVarM68640i1 = m68640i0(zfsVar.bottomText, zfsVar.highLightText);
            vl4.m201591c(this.bottomTextView, kusVarM68640i1.result);
            m68643l0(this.bottomTextView, kusVarM68640i1, 12);
        }
        vl4.m201592d(this.cornerTextView, zfsVar.cornerText);
    }

    /* JADX INFO: renamed from: l0 */
    public void m68643l0(TextView textView, kus kusVar, int i) {
        int i2 = kusVar.end;
        if (i2 == 0 && kusVar.start == 0) {
            textView.setEllipsize(TextUtils.TruncateAt.END);
        } else if (m68639h0(kusVar.result, i2 - 1) <= i) {
            textView.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            textView.setMarqueeRepeatLimit(-1);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        qnp0.m177261d1(this, qa00.f156322i);
        this.leftImage = (VDraweeView) findViewById(jdc0.f120174Z);
        this.topTextView = (VText) findViewById(jdc0.f120181b1);
        this.midTextView = (VText) findViewById(jdc0.f120216n0);
        this.bottomImage = (VDraweeView) findViewById(jdc0.f120230t);
        this.bottomTextView = (VText) findViewById(jdc0.f120232u);
        this.cornerTextView = (VText) findViewById(jdc0.f120128C);
    }

    public LiveFullLineFeedCardView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveFullLineFeedCardView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
