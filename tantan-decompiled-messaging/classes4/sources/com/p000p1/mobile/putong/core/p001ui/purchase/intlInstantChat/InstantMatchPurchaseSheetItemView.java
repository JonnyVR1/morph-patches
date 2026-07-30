package com.p000p1.mobile.putong.core.p001ui.purchase.intlInstantChat;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.InstantMatchGiveCountInfo;
import com.p1.mobile.putong.core.pay.R;
import java.util.Iterator;
import l.d3c0;
import l.e30;
import l.eqh0;
import l.svm;
import l.vwb;
import l.xdl0;
import v.VImage;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class InstantMatchPurchaseSheetItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VRelative f2447a;

    /* JADX INFO: renamed from: b */
    public VText f2448b;

    /* JADX INFO: renamed from: c */
    public VText f2449c;

    /* JADX INFO: renamed from: d */
    public VImage f2450d;

    /* JADX INFO: renamed from: e */
    public VImage f2451e;

    public InstantMatchPurchaseSheetItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m4278b(View view) {
        svm.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m4279c(final C0190d c0190d, int i, final e30<C0190d> e30Var, int i2, int i3) {
        String str;
        C0190d.a aVarM4088d = c0190d.m4088d();
        this.f2447a.setBackgroundResource(c0190d.m4096l() ? d3c0.R9 : d3c0.Q9);
        xdl0.M0(this.f2450d, i == i2);
        xdl0.M0(this.f2451e, i == i3);
        this.f2448b.setTypeface(eqh0.c(3), 0);
        String strValueOf = String.valueOf(aVarM4088d.m4171w());
        if (!vwb.J(CoreModule.c.P1.S)) {
            Iterator it = CoreModule.c.P1.S.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = "";
                    break;
                }
                InstantMatchGiveCountInfo instantMatchGiveCountInfo = (InstantMatchGiveCountInfo) it.next();
                if (TextUtils.equals(instantMatchGiveCountInfo.skuTypeVal, String.valueOf(aVarM4088d.m4171w()))) {
                    str = instantMatchGiveCountInfo.giveCount;
                    break;
                }
            }
        } else {
            str = "";
            break;
        }
        if (TextUtils.isEmpty(str) || Integer.valueOf(str).intValue() <= 0) {
            xdl0.M(this.f2449c, false);
        } else {
            xdl0.H0(this.f2449c, String.format(getContext().getString(R.string.H5), str));
            xdl0.M(this.f2449c, true);
        }
        this.f2448b.setText("x" + strValueOf);
        setOnClickListener(new View.OnClickListener() { // from class: l.rvm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(c0190d);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4278b(this);
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
