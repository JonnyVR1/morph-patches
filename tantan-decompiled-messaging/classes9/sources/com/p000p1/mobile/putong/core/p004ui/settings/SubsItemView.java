package com.p000p1.mobile.putong.core.p004ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import l.s3g0;
import l.xaj0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SubsItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f5648a;

    /* JADX INFO: renamed from: b */
    public VText f5649b;

    /* JADX INFO: renamed from: c */
    public VText f5650c;

    public SubsItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8410a(View view) {
        s3g0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m8411b() {
        String language = Locale.getDefault().getLanguage();
        if ("ja".equals(language) || "ko".equals(language) || "in".equals(language) || "id".equals(language)) {
            this.f5648a.setTextSize(14.0f);
            this.f5649b.setTextSize(10.0f);
            this.f5650c.setTextSize(10.0f);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m8412c(xaj0<String, String, String> xaj0Var) {
        if (NullChecker.b(xaj0Var)) {
            this.f5648a.setText((CharSequence) xaj0Var.a);
            this.f5649b.setText((CharSequence) xaj0Var.b);
            this.f5650c.setText((CharSequence) xaj0Var.c);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8410a(this);
        m8411b();
    }

    public SubsItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SubsItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
