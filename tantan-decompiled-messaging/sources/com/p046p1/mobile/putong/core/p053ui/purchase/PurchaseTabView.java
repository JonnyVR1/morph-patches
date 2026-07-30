package com.p046p1.mobile.putong.core.p053ui.purchase;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.pay.R$string;
import java.util.Locale;
import p147v.VIcon;
import p147v.VText;
import p149l.b1c0;
import p149l.d3c0;
import p149l.eqh0;
import p149l.fy80;
import p149l.gab0;
import p149l.hvc0;
import p149l.sab0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class PurchaseTabView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public View f34367a;

    /* JADX INFO: renamed from: b */
    public VText f34368b;

    /* JADX INFO: renamed from: c */
    public VText f34369c;

    /* JADX INFO: renamed from: d */
    public VIcon f34370d;

    /* JADX INFO: renamed from: e */
    public PurchaseType f34371e;

    public PurchaseTabView(@NonNull Context context) {
        super(context);
    }

    private String getSVipDesc() {
        return getContext().getString(R$string.f27278R0, Integer.valueOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeData(null).size()));
    }

    private String getSVipTitle() {
        return getContext().getString(R$string.f27551o6);
    }

    private String getVipDesc() {
        return String.format(getContext().getString(R$string.f27278R0), String.valueOf(fy80.m123730z().size()));
    }

    private String getVipTitle() {
        return getContext().getString(R$string.f27361Y6);
    }

    private void setDeselectViews(boolean z) {
        if (sab0.m182899q(this.f34371e)) {
            if (z) {
                this.f34370d.setImageResource(d3c0.f83820Y4);
                this.f34370d.setAlpha(1.0f);
                this.f34368b.setAlpha(0.5f);
            }
            VText vText = this.f34368b;
            if (z) {
                xdl0.m208383k(vText, getResources().getDrawable(d3c0.f84062pa));
            } else {
                xdl0.m208383k(vText, getResources().getDrawable(d3c0.f84090ra));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m53116a(View view) {
        gab0.m124937a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m53117b(PurchaseType purchaseType) {
        this.f34371e = purchaseType;
        if (sab0.m182905w(purchaseType)) {
            this.f34368b.setText(getVipTitle());
            this.f34369c.setText(getVipDesc());
            this.f34370d.setVisibility(8);
        } else if (sab0.m182899q(purchaseType)) {
            this.f34368b.setText(getSVipTitle());
            boolean zMo33442Xi = CoreModule.m29935P().m94651a().mo33442Xi();
            VText vText = this.f34369c;
            if (zMo33442Xi) {
                vText.setText(String.format(getContext().getResources().getString(R$string.f27278R0), Integer.valueOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP(null).size())));
                this.f34370d.setVisibility(8);
            } else {
                vText.setText(getSVipDesc());
                boolean zEquals = "zh".equals(Locale.getDefault().getLanguage());
                VIcon vIcon = this.f34370d;
                if (zEquals) {
                    vIcon.setImageResource(d3c0.f84034na);
                } else {
                    vIcon.setImageResource(d3c0.f84020ma);
                }
                this.f34370d.setVisibility(0);
            }
        } else if (sab0.m182891i(purchaseType)) {
            this.f34368b.setText("黑金会员");
            xdl0.m208383k(this.f34368b, getResources().getDrawable(d3c0.f83833Z4));
            this.f34369c.setText("尊享全平台权益");
            this.f34370d.setVisibility(8);
        } else if (sab0.m182895m(purchaseType)) {
            PurchaseType purchaseType2 = PurchaseType.TYPE_PICKS_MEMBERSHIP;
            VText vText2 = this.f34368b;
            if (purchaseType == purchaseType2) {
                vText2.setText("每日心动");
                this.f34369c.setText("开启每日心动特权");
            } else {
                vText2.setText("SVIP+每日心动");
                boolean zMo158371f = CoreModule.m29935P().m94651a().mo158371f();
                VText vText3 = this.f34369c;
                if (zMo158371f) {
                    vText3.setText(String.format("%s项特权", Integer.valueOf(fy80.m123704C())));
                } else {
                    vText3.setText("含22种道具");
                }
            }
            this.f34370d.setVisibility(4);
        }
        m53119d(false, false);
    }

    /* JADX INFO: renamed from: c */
    public void m53118c(boolean z) {
        if (sab0.m182905w(this.f34371e)) {
            this.f34368b.setTextColor(hvc0.m133154a(z ? b1c0.f72549g : b1c0.f72575t));
            this.f34369c.setTextColor(hvc0.m133154a(z ? b1c0.f72551h : b1c0.f72565o));
        }
        xdl0.m208344M(this.f34370d, false);
    }

    /* JADX INFO: renamed from: d */
    public void m53119d(boolean z, boolean z2) {
        m53118c(z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m53116a(this);
        this.f34368b.setTypeface(eqh0.m117752c(3), 0);
        if (!"zh".equals(Locale.getDefault().getLanguage())) {
            this.f34368b.setTextSize(15.0f);
        }
        this.f34369c.setTypeface(eqh0.m117752c(2), 0);
    }

    public PurchaseTabView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PurchaseTabView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
