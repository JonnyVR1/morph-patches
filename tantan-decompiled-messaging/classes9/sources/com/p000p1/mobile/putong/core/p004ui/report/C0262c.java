package com.p000p1.mobile.putong.core.p004ui.report;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.R$string;
import l.s7m;
import l.xdl0;
import p006l.f6c0;
import p006l.u4c0;
import v.VText;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0262c implements s7m<C0260a> {

    /* JADX INFO: renamed from: a */
    public final Context f5322a;

    /* JADX INFO: renamed from: b */
    public C0260a f5323b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f5324c;

    /* JADX INFO: renamed from: d */
    public VText f5325d;

    public C0262c(Context context) {
        this.f5322a = context;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8007C0() {
        return this.f5322a;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m8011i1(C0260a c0260a) {
        this.f5323b = c0260a;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m8009c(ReportCategory reportCategory, View view) {
        this.f5323b.m8005f0(reportCategory);
    }

    /* JADX INFO: renamed from: d */
    public void m8010d(ReportCategory[] reportCategoryArr) {
        for (int i = 0; i < reportCategoryArr.length; i++) {
            xdl0.M0(this.f5324c.getChildAt(i), true);
            final ReportCategory reportCategory = reportCategoryArr[i];
            VText childAt = this.f5324c.getChildAt(i);
            childAt.setText(act().string(reportCategory.resId));
            childAt.setOnClickListener(new View.OnClickListener() { // from class: com.p1.mobile.putong.core.ui.report.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f5320a.m8009c(reportCategory, view);
                }
            });
        }
    }

    public void destroy() {
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f11791Ge, viewGroup, false);
        this.f5324c = (LinearLayout) viewInflate.findViewById(u4c0.f23301xb);
        this.f5325d = viewInflate.findViewById(u4c0.f22828V8);
        for (int i = 0; i < this.f5324c.getChildCount(); i++) {
            xdl0.M0(this.f5324c.getChildAt(i), false);
        }
        this.f5325d.setText(R$string.f2087Rl);
        return viewInflate;
    }
}
