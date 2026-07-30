package com.p046p1.mobile.putong.core.p053ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p147v.VText;
import p149l.s3g0;
import p149l.xaj0;

/* JADX INFO: loaded from: classes9.dex */
public class SubsItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f35867a;

    /* JADX INFO: renamed from: b */
    public VText f35868b;

    /* JADX INFO: renamed from: c */
    public VText f35869c;

    public SubsItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55043a(View view) {
        s3g0.m182164a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m55044b() {
        String language = Locale.getDefault().getLanguage();
        if ("ja".equals(language) || "ko".equals(language) || "in".equals(language) || "id".equals(language)) {
            this.f35867a.setTextSize(14.0f);
            this.f35868b.setTextSize(10.0f);
            this.f35869c.setTextSize(10.0f);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m55045c(xaj0<String, String, String> xaj0Var) {
        if (NullChecker.m81304b(xaj0Var)) {
            this.f35867a.setText(xaj0Var.f191751a);
            this.f35868b.setText(xaj0Var.f191752b);
            this.f35869c.setText(xaj0Var.f191753c);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55043a(this);
        m55044b();
    }

    public SubsItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SubsItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
