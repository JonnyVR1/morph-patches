package com.p046p1.mobile.putong.core.p053ui.purchase.showcase;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import java.util.List;
import p147v.VText;
import p147v.VText_AutoFit;
import p147v.text.CustomTypefaceSpan;
import p149l.b1c0;
import p149l.d3c0;
import p149l.eqh0;
import p149l.t100;
import p149l.tc40;
import p149l.vwb;

/* JADX INFO: loaded from: classes9.dex */
public class NewUIPurchaseSectionViewAutoPay extends AnimBorderSectionView {

    /* JADX INFO: renamed from: b */
    public LinearLayout f35202b;

    /* JADX INFO: renamed from: c */
    public VText f35203c;

    /* JADX INFO: renamed from: d */
    public VText_AutoFit f35204d;

    /* JADX INFO: renamed from: e */
    public VText_AutoFit f35205e;

    /* JADX INFO: renamed from: f */
    public SpannableStringBuilder f35206f;

    /* JADX INFO: renamed from: g */
    public SpannableStringBuilder f35207g;

    public NewUIPurchaseSectionViewAutoPay(@NonNull Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.purchase.showcase.AbsPurchaseSectionView
    /* JADX INFO: renamed from: a */
    public void mo54324a(boolean z, boolean z2, C8765d.a aVar) {
        int iM54337f = m54337f(aVar.m53579f().toString(), z);
        VText vText = this.f35203c;
        if (z) {
            vText.setScaleX(1.0714f);
            this.f35203c.setScaleY(1.0714f);
            this.f35204d.setTextColor(iM54337f);
            this.f35204d.setScaleX(1.0714f);
            this.f35204d.setScaleY(1.0714f);
            this.f35205e.setTextColor(iM54337f);
            this.f35205e.setScaleX(1.0625f);
            this.f35205e.setScaleY(1.0625f);
            this.f35204d.setTypeface(eqh0.m117752c(2), 0);
            this.f35205e.setTypeface(eqh0.m117752c(3), 1);
        } else {
            vText.setScaleX(1.0f);
            this.f35203c.setScaleY(1.0f);
            this.f35204d.setTextColor(getResources().getColor(b1c0.f72529S));
            this.f35204d.setScaleX(1.0f);
            this.f35204d.setScaleY(1.0f);
            this.f35204d.setTypeface(eqh0.m117752c(2));
            this.f35205e.setTextColor(iM54337f);
            this.f35205e.setScaleX(1.0f);
            this.f35205e.setScaleY(1.0f);
            this.f35205e.setTypeface(eqh0.m117752c(2));
        }
        this.f35202b.setBackgroundResource(m54338g(aVar, z));
        this.f35203c.setText(m54336e(z, String.valueOf(aVar.m53605w()), aVar.m53606x(), iM54337f));
        this.f35204d.setText(aVar.m53608z());
        this.f35205e.setText(aVar.m53581g());
    }

    /* JADX INFO: renamed from: c */
    public final void m54334c(View view) {
        tc40.m187978a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final SpannableStringBuilder m54335d(boolean z, String str, String str2, int i) {
        if (!z) {
            i = getResources().getColor(b1c0.f72567p);
        }
        Typeface typefaceM117752c = z ? eqh0.m117752c(3) : eqh0.m117752c(2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + str2);
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", typefaceM117752c, i, t100.f167270s);
        customTypefaceSpan.m223785b(0);
        spannableStringBuilder.setSpan(customTypefaceSpan, 0, str.length(), 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", eqh0.m117752c(2), i, t100.m186890d(13.0f)), str.length(), str.length() + str2.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: e */
    public final SpannableStringBuilder m54336e(boolean z, String str, String str2, int i) {
        if (z) {
            SpannableStringBuilder spannableStringBuilder = this.f35206f;
            if (spannableStringBuilder != null) {
                if (!spannableStringBuilder.toString().equals(str + str2)) {
                    this.f35206f = m54335d(z, str, str2, i);
                }
            } else {
                this.f35206f = m54335d(z, str, str2, i);
            }
            return this.f35206f;
        }
        SpannableStringBuilder spannableStringBuilder2 = this.f35207g;
        if (spannableStringBuilder2 != null) {
            if (!spannableStringBuilder2.toString().equals(str + str2)) {
                this.f35207g = m54335d(z, str, str2, i);
            }
        } else {
            this.f35207g = m54335d(z, str, str2, i);
        }
        return this.f35207g;
    }

    @ColorInt
    /* JADX INFO: renamed from: f */
    public int m54337f(String str, boolean z) {
        str.getClass();
        switch (str) {
            case "superLikeMembership":
            case "tttVip":
            case "unlimitedSwipes":
            case "roaming":
            case "undoMembership":
                return getResources().getColor(b1c0.f72532V);
            case "svipPicksMembership":
            case "svip":
            case "picksMembership":
                return getResources().getColor(b1c0.f72531U);
            default:
                return getResources().getColor(b1c0.f72514D);
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: g */
    public int m54338g(C8765d.a aVar, boolean z) {
        String string = aVar.m53579f().toString();
        string.getClass();
        switch (string) {
            case "superLikeMembership":
            case "tttVip":
            case "unlimitedSwipes":
            case "roaming":
            case "undoMembership":
                if (z && aVar.m53552H()) {
                    return d3c0.f83767U3;
                }
                return aVar.m53552H() ? d3c0.f83701P3 : d3c0.f83645L3;
            case "svipPicksMembership":
            case "svip":
            case "picksMembership":
                if (z && aVar.m53552H()) {
                    return d3c0.f83741S3;
                }
                return aVar.m53552H() ? d3c0.f83701P3 : d3c0.f83617J3;
            default:
                return 0;
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.purchase.showcase.AnimBorderSectionView
    public List<View> getAnimBackgroundList() {
        return vwb.m200324f0(this.f35202b);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54334c(this);
    }

    public NewUIPurchaseSectionViewAutoPay(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
