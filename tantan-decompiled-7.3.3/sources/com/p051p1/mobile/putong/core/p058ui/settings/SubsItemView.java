package com.p051p1.mobile.putong.core.p058ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p151v.VText;
import p153l.bkj0;
import p153l.zbg0;

/* JADX INFO: loaded from: classes12.dex */
public class SubsItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f36715a;

    /* JADX INFO: renamed from: b */
    public VText f36716b;

    /* JADX INFO: renamed from: c */
    public VText f36717c;

    public SubsItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m56226a(View view) {
        zbg0.m219191a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m56227b() {
        String language = Locale.getDefault().getLanguage();
        if ("ja".equals(language) || "ko".equals(language) || "in".equals(language) || "id".equals(language)) {
            this.f36715a.setTextSize(14.0f);
            this.f36716b.setTextSize(10.0f);
            this.f36717c.setTextSize(10.0f);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m56228c(bkj0<String, String, String> bkj0Var) {
        if (NullChecker.m82487b(bkj0Var)) {
            this.f36715a.setText(bkj0Var.f77081a);
            this.f36716b.setText(bkj0Var.f77082b);
            this.f36717c.setText(bkj0Var.f77083c);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56226a(this);
        m56227b();
    }

    public SubsItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SubsItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
