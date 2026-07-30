package com.p051p1.mobile.putong.core.p058ui.report;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.R$string;
import p151v.VText;
import p153l.adc0;
import p153l.bnl0;
import p153l.iam;
import p153l.kec0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.c */
/* JADX INFO: loaded from: classes12.dex */
public class C8989c implements iam<C8987a> {

    /* JADX INFO: renamed from: a */
    public final Context f36389a;

    /* JADX INFO: renamed from: b */
    public C8987a f36390b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f36391c;

    /* JADX INFO: renamed from: d */
    public VText f36392d;

    public C8989c(Context context) {
        this.f36389a = context;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f36389a;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C8987a c8987a) {
        this.f36390b = c8987a;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m55841c(ReportCategory reportCategory, View view) {
        this.f36390b.m55838f0(reportCategory);
    }

    /* JADX INFO: renamed from: d */
    public void m55842d(ReportCategory[] reportCategoryArr) {
        for (int i = 0; i < reportCategoryArr.length; i++) {
            bnl0.m105525M0(this.f36391c.getChildAt(i), true);
            final ReportCategory reportCategory = reportCategoryArr[i];
            VText vText = (VText) this.f36391c.getChildAt(i);
            vText.setText(act().string(reportCategory.resId));
            vText.setOnClickListener(new View.OnClickListener() { // from class: com.p1.mobile.putong.core.ui.report.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f36387a.m55841c(reportCategory, view);
                }
            });
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125543Ne, viewGroup, false);
        this.f36391c = (LinearLayout) viewInflate.findViewById(adc0.f70678zb);
        this.f36392d = (VText) viewInflate.findViewById(adc0.f70203X8);
        for (int i = 0; i < this.f36391c.getChildCount(); i++) {
            bnl0.m105525M0(this.f36391c.getChildAt(i), false);
        }
        this.f36392d.setText(R$string.f19499nm);
        return viewInflate;
    }
}
