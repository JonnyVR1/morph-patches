package com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item.IntlPrivilegeShowcaseWrapper;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.t100;
import l.u1p;
import l.xdl0;
import p006l.c3m;
import p006l.w0c0;
import p006l.x2c0;
import v.VIcon;
import v.VMarqueeText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlPrivilegeShowcaseWrapper extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f6978a;

    /* JADX INFO: renamed from: b */
    public VMarqueeText f6979b;

    /* JADX INFO: renamed from: c */
    public VIcon f6980c;

    /* JADX INFO: renamed from: d */
    public c3m f6981d;

    public IntlPrivilegeShowcaseWrapper(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9960a(d30 d30Var, View view) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9961b(View view) {
        u1p.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public c3m m9962c() {
        return this.f6981d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9961b(this);
    }

    public void setPromotionListener(final d30 d30Var) {
        xdl0.E0(this.f6978a, new View.OnClickListener() { // from class: l.t1p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlPrivilegeShowcaseWrapper.m9960a(d30Var, view);
            }
        });
    }

    public void setPromotionTheme(boolean z) {
        this.f6978a.setBackgroundResource(z ? x2c0.f25861Fb : x2c0.f25829Eb);
        this.f6979b.setTextColor(getResources().getColor(z ? w0c0.f24653V0 : w0c0.f24662Y0));
        this.f6980c.setImageResource(z ? x2c0.f25797Db : x2c0.f25765Cb);
    }

    public void setPromotionVisible(boolean z) {
        xdl0.M(this.f6978a, z);
        this.f6979b.setText(R$string.f1842Jg);
    }

    public void setUpShowcaseComponent(c3m c3mVar) {
        this.f6981d = c3mVar;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, t100.d(16.0f));
        setClipChildren(false);
        setClipToPadding(false);
        addView(c3mVar.mo13098a(this, false), layoutParams);
    }

    public IntlPrivilegeShowcaseWrapper(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeShowcaseWrapper(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
