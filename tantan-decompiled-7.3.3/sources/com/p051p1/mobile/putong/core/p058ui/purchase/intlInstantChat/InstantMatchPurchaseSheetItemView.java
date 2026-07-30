package com.p051p1.mobile.putong.core.p058ui.purchase.intlInstantChat;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.InstantMatchGiveCountInfo;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import java.util.Iterator;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.jbc0;
import p153l.jyb;
import p153l.lyh0;
import p153l.txm;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class InstantMatchPurchaseSheetItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VRelative f35473a;

    /* JADX INFO: renamed from: b */
    public VText f35474b;

    /* JADX INFO: renamed from: c */
    public VText f35475c;

    /* JADX INFO: renamed from: d */
    public VImage f35476d;

    /* JADX INFO: renamed from: e */
    public VImage f35477e;

    public InstantMatchPurchaseSheetItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m54895b(View view) {
        txm.m193515a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m54896c(final C8928d c8928d, int i, final y20<C8928d> y20Var, int i2, int i3) {
        String str;
        C8928d.a aVarM54705d = c8928d.m54705d();
        this.f35473a.setBackgroundResource(c8928d.m54713l() ? jbc0.f119389R9 : jbc0.f119376Q9);
        bnl0.m105525M0(this.f35476d, i == i2);
        bnl0.m105525M0(this.f35477e, i == i3);
        this.f35474b.setTypeface(lyh0.m156283c(3), 0);
        String strValueOf = String.valueOf(aVarM54705d.m54788w());
        if (!jyb.m147479J(CoreModule.f18264c.f20337P1.f92200S)) {
            Iterator<InstantMatchGiveCountInfo> it = CoreModule.f18264c.f20337P1.f92200S.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = "";
                    break;
                }
                InstantMatchGiveCountInfo next = it.next();
                if (TextUtils.equals(next.skuTypeVal, String.valueOf(aVarM54705d.m54788w()))) {
                    str = next.giveCount;
                    break;
                }
            }
        } else {
            str = "";
            break;
        }
        if (TextUtils.isEmpty(str) || Integer.valueOf(str).intValue() <= 0) {
            bnl0.m105524M(this.f35475c, false);
        } else {
            bnl0.m105515H0(this.f35475c, String.format(getContext().getString(R$string.f28021H5), str));
            bnl0.m105524M(this.f35475c, true);
        }
        this.f35474b.setText(BaseSei.f14624X + strValueOf);
        setOnClickListener(new View.OnClickListener() { // from class: l.sxm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(c8928d);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54895b(this);
    }

    public InstantMatchPurchaseSheetItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InstantMatchPurchaseSheetItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public InstantMatchPurchaseSheetItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
