package com.p046p1.mobile.putong.core.p053ui.purchase.intlInstantChat;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.InstantMatchGiveCountInfo;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import java.util.Iterator;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;
import p149l.d3c0;
import p149l.e30;
import p149l.eqh0;
import p149l.svm;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class InstantMatchPurchaseSheetItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VRelative f34625a;

    /* JADX INFO: renamed from: b */
    public VText f34626b;

    /* JADX INFO: renamed from: c */
    public VText f34627c;

    /* JADX INFO: renamed from: d */
    public VImage f34628d;

    /* JADX INFO: renamed from: e */
    public VImage f34629e;

    public InstantMatchPurchaseSheetItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m53712b(View view) {
        svm.m186098a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m53713c(final C8765d c8765d, int i, final e30<C8765d> e30Var, int i2, int i3) {
        String str;
        C8765d.a aVarM53522d = c8765d.m53522d();
        this.f34625a.setBackgroundResource(c8765d.m53530l() ? d3c0.f83734R9 : d3c0.f83721Q9);
        xdl0.m208345M0(this.f34628d, i == i2);
        xdl0.m208345M0(this.f34629e, i == i3);
        this.f34626b.setTypeface(eqh0.m117752c(3), 0);
        String strValueOf = String.valueOf(aVarM53522d.m53605w());
        if (!vwb.m200296J(CoreModule.f17545c.f19595P1.f179757S)) {
            Iterator<InstantMatchGiveCountInfo> it = CoreModule.f17545c.f19595P1.f179757S.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = "";
                    break;
                }
                InstantMatchGiveCountInfo next = it.next();
                if (TextUtils.equals(next.skuTypeVal, String.valueOf(aVarM53522d.m53605w()))) {
                    str = next.giveCount;
                    break;
                }
            }
        } else {
            str = "";
            break;
        }
        if (TextUtils.isEmpty(str) || Integer.valueOf(str).intValue() <= 0) {
            xdl0.m208344M(this.f34627c, false);
        } else {
            xdl0.m208335H0(this.f34627c, String.format(getContext().getString(R$string.f27173H5), str));
            xdl0.m208344M(this.f34627c, true);
        }
        this.f34626b.setText(BaseSei.f13930X + strValueOf);
        setOnClickListener(new View.OnClickListener() { // from class: l.rvm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(c8765d);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m53712b(this);
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
