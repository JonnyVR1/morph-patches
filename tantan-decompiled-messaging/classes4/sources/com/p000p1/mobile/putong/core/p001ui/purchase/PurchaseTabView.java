package com.p000p1.mobile.putong.core.p001ui.purchase;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.Gender;
import java.util.Locale;
import l.b1c0;
import l.d3c0;
import l.eqh0;
import l.fy80;
import l.gab0;
import l.hvc0;
import l.sab0;
import l.xdl0;
import v.VIcon;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class PurchaseTabView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public View f2189a;

    /* JADX INFO: renamed from: b */
    public VText f2190b;

    /* JADX INFO: renamed from: c */
    public VText f2191c;

    /* JADX INFO: renamed from: d */
    public VIcon f2192d;

    /* JADX INFO: renamed from: e */
    public PurchaseType f2193e;

    public PurchaseTabView(@NonNull Context context) {
        super(context);
    }

    private String getSVipDesc() {
        return getContext().getString(R.string.R0, Integer.valueOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeData((Gender) null).size()));
    }

    private String getSVipTitle() {
        return getContext().getString(R.string.o6);
    }

    private String getVipDesc() {
        return String.format(getContext().getString(R.string.R0), String.valueOf(fy80.z().size()));
    }

    private String getVipTitle() {
        return getContext().getString(R.string.Y6);
    }

    private void setDeselectViews(boolean z) {
        if (sab0.q(this.f2193e)) {
            if (z) {
                this.f2192d.setImageResource(d3c0.Y4);
                this.f2192d.setAlpha(1.0f);
                this.f2190b.setAlpha(0.5f);
            }
            VText vText = this.f2190b;
            if (z) {
                xdl0.k(vText, getResources().getDrawable(d3c0.pa));
            } else {
                xdl0.k(vText, getResources().getDrawable(d3c0.ra));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3682a(View view) {
        gab0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m3683b(PurchaseType purchaseType) {
        this.f2193e = purchaseType;
        if (sab0.w(purchaseType)) {
            this.f2190b.setText(getVipTitle());
            this.f2191c.setText(getVipDesc());
            this.f2192d.setVisibility(8);
        } else if (sab0.q(purchaseType)) {
            this.f2190b.setText(getSVipTitle());
            boolean zXi = CoreModule.P().a().Xi();
            VText vText = this.f2191c;
            if (zXi) {
                vText.setText(String.format(getContext().getResources().getString(R.string.R0), Integer.valueOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP((Gender) null).size())));
                this.f2192d.setVisibility(8);
            } else {
                vText.setText(getSVipDesc());
                boolean zEquals = "zh".equals(Locale.getDefault().getLanguage());
                VIcon vIcon = this.f2192d;
                if (zEquals) {
                    vIcon.setImageResource(d3c0.na);
                } else {
                    vIcon.setImageResource(d3c0.ma);
                }
                this.f2192d.setVisibility(0);
            }
        } else if (sab0.i(purchaseType)) {
            this.f2190b.setText("黑金会员");
            xdl0.k(this.f2190b, getResources().getDrawable(d3c0.Z4));
            this.f2191c.setText("尊享全平台权益");
            this.f2192d.setVisibility(8);
        } else if (sab0.m(purchaseType)) {
            PurchaseType purchaseType2 = PurchaseType.TYPE_PICKS_MEMBERSHIP;
            VText vText2 = this.f2190b;
            if (purchaseType == purchaseType2) {
                vText2.setText("每日心动");
                this.f2191c.setText("开启每日心动特权");
            } else {
                vText2.setText("SVIP+每日心动");
                boolean zF = CoreModule.P().a().f();
                VText vText3 = this.f2191c;
                if (zF) {
                    vText3.setText(String.format("%s项特权", Integer.valueOf(fy80.C())));
                } else {
                    vText3.setText("含22种道具");
                }
            }
            this.f2192d.setVisibility(4);
        }
        m3685d(false, false);
    }

    /* JADX INFO: renamed from: c */
    public void m3684c(boolean z) {
        if (sab0.w(this.f2193e)) {
            this.f2190b.setTextColor(hvc0.a(z ? b1c0.g : b1c0.t));
            this.f2191c.setTextColor(hvc0.a(z ? b1c0.h : b1c0.o));
        }
        xdl0.M(this.f2192d, false);
    }

    /* JADX INFO: renamed from: d */
    public void m3685d(boolean z, boolean z2) {
        m3684c(z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3682a(this);
        this.f2190b.setTypeface(eqh0.c(3), 0);
        if (!"zh".equals(Locale.getDefault().getLanguage())) {
            this.f2190b.setTextSize(15.0f);
        }
        this.f2191c.setTypeface(eqh0.c(2), 0);
    }

    public PurchaseTabView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PurchaseTabView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
