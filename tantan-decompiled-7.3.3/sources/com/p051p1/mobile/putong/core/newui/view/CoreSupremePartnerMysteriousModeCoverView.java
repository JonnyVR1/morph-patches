package com.p051p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.User;
import p153l.bnl0;
import p153l.dbc0;
import p153l.qa00;
import p153l.z6b;

/* JADX INFO: loaded from: classes11.dex */
public class CoreSupremePartnerMysteriousModeCoverView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CoreSupremePartnerMysteriousModeCoverView f27741a;

    /* JADX INFO: renamed from: b */
    public View f27742b;

    /* JADX INFO: renamed from: c */
    public View f27743c;

    /* JADX INFO: renamed from: d */
    public CoreSupremePartnerMysteriousModeTagView f27744d;

    public CoreSupremePartnerMysteriousModeCoverView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m44884a(View view) {
        z6b.m218775a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m44885b(User user, int i) {
        this.f27744d.m44887b(user);
        if (2 != i) {
            this.f27742b.setBackgroundResource(dbc0.f87393rq);
        } else {
            bnl0.m105540X(this.f27744d, qa00.m175859d(144.0f));
            this.f27742b.setBackgroundResource(dbc0.f87426sq);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44884a(this);
        bnl0.m105524M(this.f27743c, false);
    }

    public CoreSupremePartnerMysteriousModeCoverView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreSupremePartnerMysteriousModeCoverView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
