package com.p051p1.mobile.putong.core.p058ui.purchase.showcase;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import java.util.List;
import p151v.VText;
import p151v.VText_AutoFit;
import p153l.bnl0;
import p153l.gta;
import p153l.h9c0;
import p153l.jbc0;
import p153l.jyb;
import p153l.ll40;
import p153l.lyh0;
import p153l.qa00;

/* JADX INFO: loaded from: classes12.dex */
public class NewUiGPPurchaseSectionView extends AnimBorderSectionView {

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f36071b;

    /* JADX INFO: renamed from: c */
    public VText f36072c;

    /* JADX INFO: renamed from: d */
    public VText f36073d;

    /* JADX INFO: renamed from: e */
    public VText_AutoFit f36074e;

    /* JADX INFO: renamed from: f */
    public View f36075f;

    /* JADX INFO: renamed from: g */
    public VText_AutoFit f36076g;

    /* JADX INFO: renamed from: h */
    public VText f36077h;

    public NewUiGPPurchaseSectionView(@NonNull Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.purchase.showcase.AbsPurchaseSectionView
    /* JADX INFO: renamed from: a */
    public void mo55507a(boolean z, boolean z2, C8928d.a aVar) {
        int color;
        int i;
        int i2;
        int i3;
        int i4;
        int color2;
        int color3;
        int color4;
        int color5;
        this.f36074e.m224514p();
        this.f36076g.m224514p();
        int i5 = 0;
        bnl0.m105524M(this.f36077h, false);
        if (z) {
            if (aVar.m54788w() != 1) {
                bnl0.m105524M(this.f36077h, true);
            }
            if (!TextUtils.isEmpty(aVar.m54783r()) && aVar.m54788w() == 1 && CoreModule.f18264c.f20396j0.m31607Q4()) {
                bnl0.m105524M(this.f36077h, true);
            }
            String string = aVar.m54762f().toString();
            string.getClass();
            switch (string) {
                case "tttVip":
                    color2 = Color.parseColor("#cc000000");
                    color3 = Color.parseColor("#dfb43a");
                    color5 = color2;
                    color4 = color5;
                    break;
                case "tttUltraPremium":
                    if (!TextUtils.equals(this.f36038a, "form_sub")) {
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
                    if (!m55539d() || !TextUtils.equals(this.f36038a, "form_sub")) {
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
                    if (!m55539d() || !TextUtils.equals(this.f36038a, "form_sub")) {
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
            bnl0.m105540X(this.f36072c, qa00.m175859d(15.0f));
            this.f36072c.setTextSize(32.0f);
            this.f36072c.setTextColor(color4);
            if (m55539d() && TextUtils.equals(this.f36038a, "form_sub")) {
                VText vText = this.f36072c;
                vText.setTypeface(vText.getTypeface(), 0);
            } else {
                VText vText2 = this.f36072c;
                vText2.setTypeface(vText2.getTypeface(), 1);
            }
            this.f36073d.setTextColor(color5);
            this.f36074e.setTextColor(color3);
            this.f36076g.setTextColor(color2);
            this.f36076g.setGravity(17);
            this.f36077h.setTextColor(color2);
        } else {
            if (m55539d() && TextUtils.equals(this.f36038a, "form_sub") && ProductCategory.tttSvipGoogleplay.equals(aVar.m54762f().toString())) {
                color = Color.parseColor("#66000000");
            } else {
                color = ProductCategory.tttSvipGoogleplay.equals(aVar.m54762f().toString()) ? Color.parseColor("#69edd7a3") : getResources().getColor(h9c0.f108389q);
            }
            if (ProductCategory.tttUltraPremium.equals(aVar.m54762f().toString())) {
                color = TextUtils.equals(this.f36038a, "form_sub") ? Color.parseColor("#663D2747") : Color.parseColor("#66F9E7FF");
            }
            bnl0.m105540X(this.f36072c, qa00.m175859d(17.0f));
            this.f36072c.setTextSize(30.0f);
            VText vText3 = this.f36072c;
            vText3.setTypeface(vText3.getTypeface(), 0);
            this.f36072c.setTextColor(color);
            this.f36073d.setTextColor(color);
            this.f36074e.setTextColor(color);
            this.f36076g.setTextColor(color);
            this.f36076g.setGravity(1);
        }
        String string2 = aVar.m54762f().toString();
        string2.getClass();
        switch (string2) {
            case "tttVip":
                i = jbc0.f119583g2;
                i2 = jbc0.f119340O1;
                i3 = jbc0.f119459X1;
                int i6 = i;
                i5 = i2;
                i4 = i6;
                break;
            case "tttUltraPremium":
                if (TextUtils.equals(this.f36038a, "form_sub")) {
                    i = jbc0.f119569f2;
                    i2 = jbc0.f119326N1;
                    i3 = jbc0.f119446W1;
                } else {
                    i = jbc0.f119555e2;
                    i2 = jbc0.f119312M1;
                    i3 = jbc0.f119433V1;
                }
                int i7 = i;
                i5 = i2;
                i4 = i7;
                break;
            case "tttSvipGoogleplay":
                if (m55539d() && TextUtils.equals(this.f36038a, "form_sub")) {
                    i = jbc0.f119541d2;
                    i2 = jbc0.f119298L1;
                    i3 = jbc0.f119407T1;
                } else {
                    i = jbc0.f119527c2;
                    i2 = jbc0.f119284K1;
                    i3 = jbc0.f119394S1;
                }
                int i8 = i;
                i5 = i2;
                i4 = i8;
                break;
            case "tttSeeWhoLikedMe":
                if (m55539d() && TextUtils.equals(this.f36038a, "form_sub")) {
                    i = jbc0.f119513b2;
                    i2 = jbc0.f119270J1;
                    i3 = jbc0.f119381R1;
                } else {
                    i = jbc0.f119499a2;
                    i2 = jbc0.f119256I1;
                    i3 = jbc0.f119368Q1;
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
        this.f36071b.setBackgroundResource(i5);
        this.f36077h.setBackgroundResource(i4);
        this.f36077h.setText(aVar.m54783r());
        this.f36072c.setText(String.valueOf(aVar.m54788w()));
        this.f36073d.setText(aVar.m54789x());
        this.f36074e.setText(aVar.m54791z());
        this.f36076g.setText(aVar.m54764g());
        this.f36075f.setBackgroundResource(i3);
        if (m55539d() && TextUtils.equals(this.f36038a, "form_sub")) {
            VText_AutoFit vText_AutoFit = this.f36076g;
            if (z) {
                bnl0.m105540X(vText_AutoFit, qa00.f156321h);
            } else {
                bnl0.m105540X(vText_AutoFit, qa00.m175859d(11.0f));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m55538c(View view) {
        ll40.m154700a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m55539d() {
        return gta.m132210e().m132214d().mo34913qq();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.purchase.showcase.AnimBorderSectionView
    public List<View> getAnimBackgroundList() {
        return jyb.m147507f0(this.f36071b, this.f36077h, this.f36075f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55538c(this);
        this.f36076g.setTypeface(lyh0.m156283c(3));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.purchase.showcase.AbsPurchaseSectionView
    public void setFrom(String str) {
        VText vText;
        super.setFrom(str);
        if (m55539d() && TextUtils.equals(str, "form_sub") && (vText = this.f36072c) != null) {
            this.f36073d.setTypeface(vText.getTypeface(), 0);
            this.f36074e.setTypeface(this.f36072c.getTypeface(), 0);
            this.f36073d.setTextSize(13.0f);
            this.f36074e.setTextSize(13.0f);
            bnl0.m105505C0(this.f36075f, qa00.m175859d(39.0f));
            bnl0.m105505C0(this.f36076g, qa00.m175859d(39.0f));
            bnl0.m105540X(this.f36072c, qa00.m175859d(19.0f));
            bnl0.m105540X(this.f36073d, qa00.m175859d(3.0f));
            requestLayout();
        }
    }

    public NewUiGPPurchaseSectionView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
