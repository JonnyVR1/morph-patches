package com.p046p1.mobile.putong.core.p053ui.report;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.R$string;
import p147v.VText;
import p149l.f6c0;
import p149l.s7m;
import p149l.u4c0;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.c */
/* JADX INFO: loaded from: classes9.dex */
public class C8826c implements s7m<C8824a> {

    /* JADX INFO: renamed from: a */
    public final Context f35541a;

    /* JADX INFO: renamed from: b */
    public C8824a f35542b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f35543c;

    /* JADX INFO: renamed from: d */
    public VText f35544d;

    public C8826c(Context context) {
        this.f35541a = context;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f35541a;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C8824a c8824a) {
        this.f35542b = c8824a;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m54658c(ReportCategory reportCategory, View view) {
        this.f35542b.m54655f0(reportCategory);
    }

    /* JADX INFO: renamed from: d */
    public void m54659d(ReportCategory[] reportCategoryArr) {
        for (int i = 0; i < reportCategoryArr.length; i++) {
            xdl0.m208345M0(this.f35543c.getChildAt(i), true);
            final ReportCategory reportCategory = reportCategoryArr[i];
            VText vText = (VText) this.f35543c.getChildAt(i);
            vText.setText(act().string(reportCategory.resId));
            vText.setOnClickListener(new View.OnClickListener() { // from class: com.p1.mobile.putong.core.ui.report.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f35539a.m54658c(reportCategory, view);
                }
            });
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95377Ge, viewGroup, false);
        this.f35543c = (LinearLayout) viewInflate.findViewById(u4c0.f174553xb);
        this.f35544d = (VText) viewInflate.findViewById(u4c0.f174080V8);
        for (int i = 0; i < this.f35543c.getChildCount(); i++) {
            xdl0.m208345M0(this.f35543c.getChildAt(i), false);
        }
        this.f35544d.setText(R$string.f18098Rl);
        return viewInflate;
    }
}
