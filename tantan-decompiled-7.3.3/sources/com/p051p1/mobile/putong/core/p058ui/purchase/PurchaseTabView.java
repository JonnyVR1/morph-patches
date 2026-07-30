package com.p051p1.mobile.putong.core.p058ui.purchase;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.pay.R$string;
import java.util.Locale;
import p151v.VIcon;
import p151v.VText;
import p153l.bnl0;
import p153l.h9c0;
import p153l.j690;
import p153l.jbc0;
import p153l.k3d0;
import p153l.kib0;
import p153l.lyh0;
import p153l.wib0;

/* JADX INFO: loaded from: classes4.dex */
public class PurchaseTabView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public View f35215a;

    /* JADX INFO: renamed from: b */
    public VText f35216b;

    /* JADX INFO: renamed from: c */
    public VText f35217c;

    /* JADX INFO: renamed from: d */
    public VIcon f35218d;

    /* JADX INFO: renamed from: e */
    public PurchaseType f35219e;

    public PurchaseTabView(@NonNull Context context) {
        super(context);
    }

    private String getSVipDesc() {
        return getContext().getString(R$string.f28126R0, Integer.valueOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeData(null).size()));
    }

    private String getSVipTitle() {
        return getContext().getString(R$string.f28399o6);
    }

    private String getVipDesc() {
        return String.format(getContext().getString(R$string.f28126R0), String.valueOf(j690.m143634z().size()));
    }

    private String getVipTitle() {
        return getContext().getString(R$string.f28209Y6);
    }

    private void setDeselectViews(boolean z) {
        if (wib0.m206573q(this.f35219e)) {
            if (z) {
                this.f35218d.setImageResource(jbc0.f119475Y4);
                this.f35218d.setAlpha(1.0f);
                this.f35216b.setAlpha(0.5f);
            }
            VText vText = this.f35216b;
            if (z) {
                bnl0.m105563k(vText, getResources().getDrawable(jbc0.f119717pa));
            } else {
                bnl0.m105563k(vText, getResources().getDrawable(jbc0.f119745ra));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m54299a(View view) {
        kib0.m149867a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m54300b(PurchaseType purchaseType) {
        this.f35219e = purchaseType;
        if (wib0.m206579w(purchaseType)) {
            this.f35216b.setText(getVipTitle());
            this.f35217c.setText(getVipDesc());
            this.f35218d.setVisibility(8);
        } else if (wib0.m206573q(purchaseType)) {
            this.f35216b.setText(getSVipTitle());
            boolean zMo34445Xi = CoreModule.m30933P().m143405a().mo34445Xi();
            VText vText = this.f35217c;
            if (zMo34445Xi) {
                vText.setText(String.format(getContext().getResources().getString(R$string.f28126R0), Integer.valueOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP(null).size())));
                this.f35218d.setVisibility(8);
            } else {
                vText.setText(getSVipDesc());
                boolean zEquals = "zh".equals(Locale.getDefault().getLanguage());
                VIcon vIcon = this.f35218d;
                if (zEquals) {
                    vIcon.setImageResource(jbc0.f119689na);
                } else {
                    vIcon.setImageResource(jbc0.f119675ma);
                }
                this.f35218d.setVisibility(0);
            }
        } else if (wib0.m206565i(purchaseType)) {
            this.f35216b.setText("黑金会员");
            bnl0.m105563k(this.f35216b, getResources().getDrawable(jbc0.f119488Z4));
            this.f35217c.setText("尊享全平台权益");
            this.f35218d.setVisibility(8);
        } else if (wib0.m206569m(purchaseType)) {
            PurchaseType purchaseType2 = PurchaseType.TYPE_PICKS_MEMBERSHIP;
            VText vText2 = this.f35216b;
            if (purchaseType == purchaseType2) {
                vText2.setText("每日心动");
                this.f35217c.setText("开启每日心动特权");
            } else {
                vText2.setText("SVIP+每日心动");
                boolean zMo180463f = CoreModule.m30933P().m143405a().mo180463f();
                VText vText3 = this.f35217c;
                if (zMo180463f) {
                    vText3.setText(String.format("%s项特权", Integer.valueOf(j690.m143608C())));
                } else {
                    vText3.setText("含22种道具");
                }
            }
            this.f35218d.setVisibility(4);
        }
        m54302d(false, false);
    }

    /* JADX INFO: renamed from: c */
    public void m54301c(boolean z) {
        if (wib0.m206579w(this.f35219e)) {
            this.f35216b.setTextColor(k3d0.m148005a(z ? h9c0.f108369g : h9c0.f108395t));
            this.f35217c.setTextColor(k3d0.m148005a(z ? h9c0.f108371h : h9c0.f108385o));
        }
        bnl0.m105524M(this.f35218d, false);
    }

    /* JADX INFO: renamed from: d */
    public void m54302d(boolean z, boolean z2) {
        m54301c(z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54299a(this);
        this.f35216b.setTypeface(lyh0.m156283c(3), 0);
        if (!"zh".equals(Locale.getDefault().getLanguage())) {
            this.f35216b.setTextSize(15.0f);
        }
        this.f35217c.setTypeface(lyh0.m156283c(2), 0);
    }

    public PurchaseTabView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PurchaseTabView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
