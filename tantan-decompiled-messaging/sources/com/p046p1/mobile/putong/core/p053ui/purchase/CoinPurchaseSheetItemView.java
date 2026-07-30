package com.p046p1.mobile.putong.core.p053ui.purchase;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegePrice;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;
import p149l.b1c0;
import p149l.d3c0;
import p149l.e30;
import p149l.i0g0;
import p149l.id5;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class CoinPurchaseSheetItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f34349a;

    /* JADX INFO: renamed from: b */
    public VText f34350b;

    /* JADX INFO: renamed from: c */
    public VText f34351c;

    /* JADX INFO: renamed from: d */
    public VText f34352d;

    /* JADX INFO: renamed from: e */
    public VText f34353e;

    public CoinPurchaseSheetItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m53097b(View view) {
        id5.m135425a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final Act m53098c() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: d */
    public void m53099d(final C8765d c8765d, int i, final e30<C8765d> e30Var) {
        C8765d.a aVarM53520b = c8765d.m53531m() ? c8765d.m53520b() : c8765d.m53522d();
        boolean zMo30835xf = CoreModule.m29932K().mo30835xf();
        VText vText = this.f34352d;
        if (zMo30835xf) {
            xdl0.m208325C0(vText, t100.m186890d(18.0f));
            this.f34352d.setAutoSizeTextTypeWithDefaults(1);
            this.f34352d.setAutoSizeTextTypeUniformWithConfiguration(9, 14, 1, 2);
        } else {
            xdl0.m208325C0(vText, -2);
            this.f34352d.setSingleLine();
        }
        boolean zM53530l = c8765d.m53530l();
        LinearLayout linearLayout = this.f34349a;
        if (zM53530l) {
            linearLayout.setBackgroundResource(d3c0.f83581G9);
        } else {
            linearLayout.setBackgroundResource(d3c0.f83567F9);
        }
        if (NullChecker.m81303a(aVarM53520b.m53607y())) {
            m53100e(aVarM53520b.m53607y(), c8765d.m53530l());
        } else {
            if (i == 2 && c8765d.m53530l()) {
                this.f34353e.setText(R$string.f27506k9);
                this.f34353e.setBackgroundDrawable(m53098c().drawable(d3c0.f83595H9));
                xdl0.m208345M0(this.f34353e, true);
            } else {
                xdl0.m208345M0(this.f34353e, false);
            }
            this.f34350b.setText(String.valueOf(aVarM53520b.m53605w()));
            this.f34351c.setText(aVarM53520b.m53606x());
            this.f34352d.setText(aVarM53520b.m53608z());
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.hd5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(c8765d);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m53100e(SummarizedPrivilegePrice summarizedPrivilegePrice, boolean z) {
        this.f34350b.setText(String.format("x%s", Integer.valueOf(summarizedPrivilegePrice.num)));
        this.f34351c.setText(String.format("%s探探币", Integer.valueOf(summarizedPrivilegePrice.price)));
        int i = summarizedPrivilegePrice.originalPrice;
        if (i <= 0) {
            i = 1;
        }
        double d = ((double) ((summarizedPrivilegePrice.price * 1.0f) / i)) * 10.0d;
        this.f34352d.setText(d >= 10.0d ? "7天有效" : String.format("7天有效 %s折", i0g0.m133839F(d, 1)));
        VText vText = this.f34352d;
        if (z) {
            vText.setTextColor(getResources().getColor(b1c0.f72559l));
        } else {
            vText.setTextColor(getResources().getColor(b1c0.f72541c));
        }
        VText vText2 = this.f34350b;
        int i2 = t100.f167266o;
        xdl0.m208360X(vText2, i2);
        VText vText3 = this.f34351c;
        int i3 = t100.f167259h;
        xdl0.m208360X(vText3, i3);
        xdl0.m208360X(this.f34352d, i3);
        xdl0.m208357U(this.f34352d, i2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m53097b(this);
    }

    public CoinPurchaseSheetItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoinPurchaseSheetItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
