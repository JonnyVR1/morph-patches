package com.p046p1.mobile.putong.core.p053ui.intlrenew;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tantanapp.common.utils.NullChecker;
import p149l.b9p;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class IntlRenewContractView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f29904a;

    /* JADX INFO: renamed from: b */
    public TextView f29905b;

    /* JADX INFO: renamed from: c */
    public TextView f29906c;

    /* JADX INFO: renamed from: d */
    public TextView f29907d;

    /* JADX INFO: renamed from: e */
    public TextView f29908e;

    public IntlRenewContractView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m46351c(View view) {
        b9p.m100817a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public IntlRenewContractView m46352d(final Runnable runnable) {
        if (NullChecker.m81303a(runnable)) {
            xdl0.m208329E0(this.f29908e, new View.OnClickListener() { // from class: l.a9p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable.run();
                }
            });
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public IntlRenewContractView m46353e(final Runnable runnable) {
        if (NullChecker.m81303a(runnable)) {
            xdl0.m208329E0(this.f29907d, new View.OnClickListener() { // from class: l.z8p
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
        m46351c(this);
    }

    public IntlRenewContractView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlRenewContractView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
