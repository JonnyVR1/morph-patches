package com.p000p1.mobile.putong.core.p004ui.purchase.showcase;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.purchase.d;
import java.util.List;
import l.b1c0;
import l.d3c0;
import l.eqh0;
import l.t100;
import l.vwb;
import l.xc40;
import l.xdl0;
import p006l.ura;
import v.VText;
import v.VText_AutoFit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class NewUiGPPurchaseSectionView extends AnimBorderSectionView {

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f5004b;

    /* JADX INFO: renamed from: c */
    public VText f5005c;

    /* JADX INFO: renamed from: d */
    public VText f5006d;

    /* JADX INFO: renamed from: e */
    public VText_AutoFit f5007e;

    /* JADX INFO: renamed from: f */
    public View f5008f;

    /* JADX INFO: renamed from: g */
    public VText_AutoFit f5009g;

    /* JADX INFO: renamed from: h */
    public VText f5010h;

    public NewUiGPPurchaseSectionView(@NonNull Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.purchase.showcase.AbsPurchaseSectionView
    /* JADX INFO: renamed from: a */
    public void mo7659a(boolean z, boolean z2, d.a aVar) {
        int color;
        int i;
        int i2;
        int i3;
        int i4;
        int color2;
        int color3;
        int color4;
        int color5;
        this.f5007e.p();
        this.f5009g.p();
        int i5 = 0;
        xdl0.M(this.f5010h, false);
        if (z) {
            if (aVar.w() != 1) {
                xdl0.M(this.f5010h, true);
            }
            if (!TextUtils.isEmpty(aVar.r()) && aVar.w() == 1 && CoreModule.f1534c.f3643j0.m2532Q4()) {
                xdl0.M(this.f5010h, true);
            }
            String string = aVar.f().toString();
            string.getClass();
            switch (string) {
                case "tttVip":
                    color2 = Color.parseColor("#cc000000");
                    color3 = Color.parseColor("#dfb43a");
                    color5 = color2;
                    color4 = color5;
                    break;
                case "tttUltraPremium":
                    if (!TextUtils.equals(this.f4971a, "form_sub")) {
                        int color6 = Color.parseColor("#432053");
                        color3 = Color.parseColor("#F9E7FF");
                        color4 = Color.parseColor("#F9E7FF");
                        color2 = color6;
                        color5 = Color.parseColor("#F9E7FF");
                        break;
                    } else {
                        color2 = Color.parseColor("#F9E7FF");
                        color3 = Color.parseColor("#3D2747");
                        color4 = Color.parseColor("#3D2747");
                        color5 = Color.parseColor("#3D2747");
                        break;
                    }
                    break;
                case "tttSeeWhoLikedMe":
                    if (!m7691d() || !TextUtils.equals(this.f4971a, "form_sub")) {
                        color2 = Color.parseColor("#cc000000");
                        color3 = Color.parseColor("#ff932b");
                        color5 = color2;
                        color4 = color5;
                        break;
                    } else {
                        color2 = Color.parseColor("#CCFFFFFF");
                        color3 = Color.parseColor("#FF932B");
                        color4 = Color.parseColor("#CC000000");
                        color5 = Color.parseColor("#CC000000");
                        break;
                    }
                    break;
                default:
                    if (!m7691d() || !TextUtils.equals(this.f4971a, "form_sub")) {
                        color2 = Color.parseColor("#cc000000");
                        int color7 = Color.parseColor("#edd7a3");
                        int color8 = Color.parseColor("#edd7a3");
                        color5 = Color.parseColor("#69edd7a3");
                        color4 = color8;
                        color3 = color7;
                        break;
                    } else {
                        color2 = Color.parseColor("#FF000000");
                        color3 = Color.parseColor("#DFB43A");
                        color4 = Color.parseColor("#FF000000");
                        color5 = Color.parseColor("#FF000000");
                        break;
                    }
                    break;
            }
            xdl0.X(this.f5005c, t100.d(15.0f));
            this.f5005c.setTextSize(32.0f);
            this.f5005c.setTextColor(color4);
            if (m7691d() && TextUtils.equals(this.f4971a, "form_sub")) {
                VText vText = this.f5005c;
                vText.setTypeface(vText.getTypeface(), 0);
            } else {
                VText vText2 = this.f5005c;
                vText2.setTypeface(vText2.getTypeface(), 1);
            }
            this.f5006d.setTextColor(color5);
            this.f5007e.setTextColor(color3);
            this.f5009g.setTextColor(color2);
            this.f5009g.setGravity(17);
            this.f5010h.setTextColor(color2);
        } else {
            if (m7691d() && TextUtils.equals(this.f4971a, "form_sub") && "tttSvipGoogleplay".equals(aVar.f().toString())) {
                color = Color.parseColor("#66000000");
            } else {
                color = "tttSvipGoogleplay".equals(aVar.f().toString()) ? Color.parseColor("#69edd7a3") : getResources().getColor(b1c0.q);
            }
            if ("tttUltraPremium".equals(aVar.f().toString())) {
                color = TextUtils.equals(this.f4971a, "form_sub") ? Color.parseColor("#663D2747") : Color.parseColor("#66F9E7FF");
            }
            xdl0.X(this.f5005c, t100.d(17.0f));
            this.f5005c.setTextSize(30.0f);
            VText vText3 = this.f5005c;
            vText3.setTypeface(vText3.getTypeface(), 0);
            this.f5005c.setTextColor(color);
            this.f5006d.setTextColor(color);
            this.f5007e.setTextColor(color);
            this.f5009g.setTextColor(color);
            this.f5009g.setGravity(1);
        }
        String string2 = aVar.f().toString();
        string2.getClass();
        switch (string2) {
            case "tttVip":
                i = d3c0.g2;
                i2 = d3c0.O1;
                i3 = d3c0.X1;
                int i6 = i;
                i5 = i2;
                i4 = i6;
                break;
            case "tttUltraPremium":
                if (TextUtils.equals(this.f4971a, "form_sub")) {
                    i = d3c0.f2;
                    i2 = d3c0.N1;
                    i3 = d3c0.W1;
                } else {
                    i = d3c0.e2;
                    i2 = d3c0.M1;
                    i3 = d3c0.V1;
                }
                int i7 = i;
                i5 = i2;
                i4 = i7;
                break;
            case "tttSvipGoogleplay":
                if (m7691d() && TextUtils.equals(this.f4971a, "form_sub")) {
                    i = d3c0.d2;
                    i2 = d3c0.L1;
                    i3 = d3c0.T1;
                } else {
                    i = d3c0.c2;
                    i2 = d3c0.K1;
                    i3 = d3c0.S1;
                }
                int i8 = i;
                i5 = i2;
                i4 = i8;
                break;
            case "tttSeeWhoLikedMe":
                if (m7691d() && TextUtils.equals(this.f4971a, "form_sub")) {
                    i = d3c0.b2;
                    i2 = d3c0.J1;
                    i3 = d3c0.R1;
                } else {
                    i = d3c0.a2;
                    i2 = d3c0.I1;
                    i3 = d3c0.Q1;
                }
                int i9 = i;
                i5 = i2;
                i4 = i9;
                break;
            default:
                i4 = 0;
                i3 = 0;
                break;
        }
        this.f5004b.setBackgroundResource(i5);
        this.f5010h.setBackgroundResource(i4);
        this.f5010h.setText(aVar.r());
        this.f5005c.setText(String.valueOf(aVar.w()));
        this.f5006d.setText(aVar.x());
        this.f5007e.setText(aVar.z());
        this.f5009g.setText(aVar.g());
        this.f5008f.setBackgroundResource(i3);
        if (m7691d() && TextUtils.equals(this.f4971a, "form_sub")) {
            VText_AutoFit vText_AutoFit = this.f5009g;
            if (z) {
                xdl0.X(vText_AutoFit, t100.h);
            } else {
                xdl0.X(vText_AutoFit, t100.d(11.0f));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7690c(View view) {
        xc40.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7691d() {
        return ura.m25555e().m25559d().m5847qq();
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.purchase.showcase.AnimBorderSectionView
    public List<View> getAnimBackgroundList() {
        return vwb.f0(new View[]{this.f5004b, this.f5010h, this.f5008f});
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7690c(this);
        this.f5009g.setTypeface(eqh0.c(3));
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.purchase.showcase.AbsPurchaseSectionView
    public void setFrom(String str) {
        VText vText;
        super.setFrom(str);
        if (m7691d() && TextUtils.equals(str, "form_sub") && (vText = this.f5005c) != null) {
            this.f5006d.setTypeface(vText.getTypeface(), 0);
            this.f5007e.setTypeface(this.f5005c.getTypeface(), 0);
            this.f5006d.setTextSize(13.0f);
            this.f5007e.setTextSize(13.0f);
            xdl0.C0(this.f5008f, t100.d(39.0f));
            xdl0.C0(this.f5009g, t100.d(39.0f));
            xdl0.X(this.f5005c, t100.d(19.0f));
            xdl0.X(this.f5006d, t100.d(3.0f));
            requestLayout();
        }
    }

    public NewUiGPPurchaseSectionView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
