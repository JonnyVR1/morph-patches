package com.p051p1.mobile.putong.core.p058ui.intlrenew;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tantanapp.common.utils.NullChecker;
import p153l.bbp;
import p153l.bnl0;

/* JADX INFO: loaded from: classes3.dex */
public class IntlRenewContractView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f30752a;

    /* JADX INFO: renamed from: b */
    public TextView f30753b;

    /* JADX INFO: renamed from: c */
    public TextView f30754c;

    /* JADX INFO: renamed from: d */
    public TextView f30755d;

    /* JADX INFO: renamed from: e */
    public TextView f30756e;

    public IntlRenewContractView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m47534c(View view) {
        bbp.m103306a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public IntlRenewContractView m47535d(final Runnable runnable) {
        if (NullChecker.m82486a(runnable)) {
            bnl0.m105509E0(this.f30756e, new View.OnClickListener() { // from class: l.abp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable.run();
                }
            });
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public IntlRenewContractView m47536e(final Runnable runnable) {
        if (NullChecker.m82486a(runnable)) {
            bnl0.m105509E0(this.f30755d, new View.OnClickListener() { // from class: l.zap
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
        m47534c(this);
    }

    public IntlRenewContractView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlRenewContractView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
