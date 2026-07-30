package com.p051p1.mobile.putong.core.p058ui.intllikedusers;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.member.R$string;
import p151v.VText_NoTopPadding;
import p153l.bnl0;
import p153l.gta;
import p153l.joa;
import p153l.osn;

/* JADX INFO: loaded from: classes3.dex */
public class IntlLikedUserHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText_NoTopPadding f30688a;

    public IntlLikedUserHeaderView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m47422a(View view) {
        osn.m169058a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m47423b() {
        bnl0.m105524M(this.f30688a, true);
        this.f30688a.setText(gta.m132210e().m132214d().mo34750Rk() ? R$string.f21306A0 : R$string.f21421r0);
        this.f30688a.setTextColor(Color.parseColor(joa.m146413z4() ? "#F9E7FF" : "#FFDEA2"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47422a(this);
    }

    public IntlLikedUserHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLikedUserHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
