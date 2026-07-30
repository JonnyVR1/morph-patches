package com.p000p1.mobile.putong.core.p001ui.intlrenew;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tantanapp.common.utils.NullChecker;
import l.b9p;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class IntlRenewContractView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f13a;

    /* JADX INFO: renamed from: b */
    public TextView f14b;

    /* JADX INFO: renamed from: c */
    public TextView f15c;

    /* JADX INFO: renamed from: d */
    public TextView f16d;

    /* JADX INFO: renamed from: e */
    public TextView f17e;

    public IntlRenewContractView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m15c(View view) {
        b9p.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public IntlRenewContractView m16d(final Runnable runnable) {
        if (NullChecker.a(runnable)) {
            xdl0.E0(this.f17e, new View.OnClickListener() { // from class: l.a9p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable.run();
                }
            });
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public IntlRenewContractView m17e(final Runnable runnable) {
        if (NullChecker.a(runnable)) {
            xdl0.E0(this.f16d, new View.OnClickListener() { // from class: l.z8p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable.run();
                }
            });
        }
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m15c(this);
    }

    public IntlRenewContractView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlRenewContractView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
