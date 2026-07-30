package com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegeShowcaseWrapper;
import com.tantanapp.common.utils.NullChecker;
import p151v.VIcon;
import p151v.VMarqueeText;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.qa00;
import p153l.t5m;
import p153l.u3p;
import p153l.x20;

/* JADX INFO: loaded from: classes12.dex */
public class IntlPrivilegeShowcaseWrapper extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f38045a;

    /* JADX INFO: renamed from: b */
    public VMarqueeText f38046b;

    /* JADX INFO: renamed from: c */
    public VIcon f38047c;

    /* JADX INFO: renamed from: d */
    public t5m f38048d;

    public IntlPrivilegeShowcaseWrapper(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m57702a(x20 x20Var, View view) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m57703b(View view) {
        u3p.m194377a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public t5m m57704c() {
        return this.f38048d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57703b(this);
    }

    public void setPromotionListener(final x20 x20Var) {
        bnl0.m105509E0(this.f38045a, new View.OnClickListener() { // from class: l.t3p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlPrivilegeShowcaseWrapper.m57702a(x20Var, view);
            }
        });
    }

    public void setPromotionTheme(boolean z) {
        this.f38045a.setBackgroundResource(z ? dbc0.f86180Gb : dbc0.f86148Fb);
        this.f38046b.setTextColor(getResources().getColor(z ? c9c0.f80385W0 : c9c0.f80394Z0));
        this.f38047c.setImageResource(z ? dbc0.f86116Eb : dbc0.f86084Db);
    }

    public void setPromotionVisible(boolean z) {
        bnl0.m105524M(this.f38045a, z);
        this.f38046b.setText(R$string.f19187dh);
    }

    public void setUpShowcaseComponent(t5m t5mVar) {
        this.f38048d = t5mVar;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, qa00.m175859d(16.0f));
        setClipChildren(false);
        setClipToPadding(false);
        addView(t5mVar.mo126108a(this, false), layoutParams);
    }

    public IntlPrivilegeShowcaseWrapper(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeShowcaseWrapper(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
