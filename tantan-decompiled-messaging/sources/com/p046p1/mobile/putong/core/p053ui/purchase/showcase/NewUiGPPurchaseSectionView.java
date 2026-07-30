package com.p046p1.mobile.putong.core.p053ui.purchase.showcase;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import java.util.List;
import p147v.VText;
import p147v.VText_AutoFit;
import p149l.b1c0;
import p149l.d3c0;
import p149l.eqh0;
import p149l.t100;
import p149l.ura;
import p149l.vwb;
import p149l.xc40;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class NewUiGPPurchaseSectionView extends AnimBorderSectionView {

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f35223b;

    /* JADX INFO: renamed from: c */
    public VText f35224c;

    /* JADX INFO: renamed from: d */
    public VText f35225d;

    /* JADX INFO: renamed from: e */
    public VText_AutoFit f35226e;

    /* JADX INFO: renamed from: f */
    public View f35227f;

    /* JADX INFO: renamed from: g */
    public VText_AutoFit f35228g;

    /* JADX INFO: renamed from: h */
    public VText f35229h;

    public NewUiGPPurchaseSectionView(@NonNull Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.purchase.showcase.AbsPurchaseSectionView
    /* JADX INFO: renamed from: a */
    public void mo54324a(boolean z, boolean z2, C8765d.a aVar) {
        int color;
        int i;
        int i2;
        int i3;
        int i4;
        int color2;
        int color3;
        int color4;
        int color5;
        this.f35226e.m223268p();
        this.f35228g.m223268p();
        int i5 = 0;
        xdl0.m208344M(this.f35229h, false);
        if (z) {
            if (aVar.m53605w() != 1) {
                xdl0.m208344M(this.f35229h, true);
            }
            if (!TextUtils.isEmpty(aVar.m53600r()) && aVar.m53605w() == 1 && CoreModule.f17545c.f19654j0.m30604Q4()) {
                xdl0.m208344M(this.f35229h, true);
            }
            String string = aVar.m53579f().toString();
            string.getClass();
            switch (string) {
                case "tttVip":
                    color2 = Color.parseColor("#cc000000");
                    color3 = Color.parseColor("#dfb43a");
                    color5 = color2;
                    color4 = color5;
                    break;
                case "tttUltraPremium":
                    if (!TextUtils.equals(this.f35190a, "form_sub")) {
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
                    if (!m54356d() || !TextUtils.equals(this.f35190a, "form_sub")) {
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
                    if (!m54356d() || !TextUtils.equals(this.f35190a, "form_sub")) {
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
            xdl0.m208360X(this.f35224c, t100.m186890d(15.0f));
            this.f35224c.setTextSize(32.0f);
            this.f35224c.setTextColor(color4);
            if (m54356d() && TextUtils.equals(this.f35190a, "form_sub")) {
                VText vText = this.f35224c;
                vText.setTypeface(vText.getTypeface(), 0);
            } else {
                VText vText2 = this.f35224c;
                vText2.setTypeface(vText2.getTypeface(), 1);
            }
            this.f35225d.setTextColor(color5);
            this.f35226e.setTextColor(color3);
            this.f35228g.setTextColor(color2);
            this.f35228g.setGravity(17);
            this.f35229h.setTextColor(color2);
        } else {
            if (m54356d() && TextUtils.equals(this.f35190a, "form_sub") && ProductCategory.tttSvipGoogleplay.equals(aVar.m53579f().toString())) {
                color = Color.parseColor("#66000000");
            } else {
                color = ProductCategory.tttSvipGoogleplay.equals(aVar.m53579f().toString()) ? Color.parseColor("#69edd7a3") : getResources().getColor(b1c0.f72569q);
            }
            if (ProductCategory.tttUltraPremium.equals(aVar.m53579f().toString())) {
                color = TextUtils.equals(this.f35190a, "form_sub") ? Color.parseColor("#663D2747") : Color.parseColor("#66F9E7FF");
            }
            xdl0.m208360X(this.f35224c, t100.m186890d(17.0f));
            this.f35224c.setTextSize(30.0f);
            VText vText3 = this.f35224c;
            vText3.setTypeface(vText3.getTypeface(), 0);
            this.f35224c.setTextColor(color);
            this.f35225d.setTextColor(color);
            this.f35226e.setTextColor(color);
            this.f35228g.setTextColor(color);
            this.f35228g.setGravity(1);
        }
        String string2 = aVar.m53579f().toString();
        string2.getClass();
        switch (string2) {
            case "tttVip":
                i = d3c0.f83928g2;
                i2 = d3c0.f83685O1;
                i3 = d3c0.f83804X1;
                int i6 = i;
                i5 = i2;
                i4 = i6;
                break;
            case "tttUltraPremium":
                if (TextUtils.equals(this.f35190a, "form_sub")) {
                    i = d3c0.f83914f2;
                    i2 = d3c0.f83671N1;
                    i3 = d3c0.f83791W1;
                } else {
                    i = d3c0.f83900e2;
                    i2 = d3c0.f83657M1;
                    i3 = d3c0.f83778V1;
                }
                int i7 = i;
                i5 = i2;
                i4 = i7;
                break;
            case "tttSvipGoogleplay":
                if (m54356d() && TextUtils.equals(this.f35190a, "form_sub")) {
                    i = d3c0.f83886d2;
                    i2 = d3c0.f83643L1;
                    i3 = d3c0.f83752T1;
                } else {
                    i = d3c0.f83872c2;
                    i2 = d3c0.f83629K1;
                    i3 = d3c0.f83739S1;
                }
                int i8 = i;
                i5 = i2;
                i4 = i8;
                break;
            case "tttSeeWhoLikedMe":
                if (m54356d() && TextUtils.equals(this.f35190a, "form_sub")) {
                    i = d3c0.f83858b2;
                    i2 = d3c0.f83615J1;
                    i3 = d3c0.f83726R1;
                } else {
                    i = d3c0.f83844a2;
                    i2 = d3c0.f83601I1;
                    i3 = d3c0.f83713Q1;
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
        this.f35223b.setBackgroundResource(i5);
        this.f35229h.setBackgroundResource(i4);
        this.f35229h.setText(aVar.m53600r());
        this.f35224c.setText(String.valueOf(aVar.m53605w()));
        this.f35225d.setText(aVar.m53606x());
        this.f35226e.setText(aVar.m53608z());
        this.f35228g.setText(aVar.m53581g());
        this.f35227f.setBackgroundResource(i3);
        if (m54356d() && TextUtils.equals(this.f35190a, "form_sub")) {
            VText_AutoFit vText_AutoFit = this.f35228g;
            if (z) {
                xdl0.m208360X(vText_AutoFit, t100.f167259h);
            } else {
                xdl0.m208360X(vText_AutoFit, t100.m186890d(11.0f));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m54355c(View view) {
        xc40.m208070a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m54356d() {
        return ura.m195053e().m195057d().mo33910qq();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.purchase.showcase.AnimBorderSectionView
    public List<View> getAnimBackgroundList() {
        return vwb.m200324f0(this.f35223b, this.f35229h, this.f35227f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54355c(this);
        this.f35228g.setTypeface(eqh0.m117752c(3));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.purchase.showcase.AbsPurchaseSectionView
    public void setFrom(String str) {
        VText vText;
        super.setFrom(str);
        if (m54356d() && TextUtils.equals(str, "form_sub") && (vText = this.f35224c) != null) {
            this.f35225d.setTypeface(vText.getTypeface(), 0);
            this.f35226e.setTypeface(this.f35224c.getTypeface(), 0);
            this.f35225d.setTextSize(13.0f);
            this.f35226e.setTextSize(13.0f);
            xdl0.m208325C0(this.f35227f, t100.m186890d(39.0f));
            xdl0.m208325C0(this.f35228g, t100.m186890d(39.0f));
            xdl0.m208360X(this.f35224c, t100.m186890d(19.0f));
            xdl0.m208360X(this.f35225d, t100.m186890d(3.0f));
            requestLayout();
        }
    }

    public NewUiGPPurchaseSectionView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
