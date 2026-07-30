package com.p000p1.mobile.putong.core.p002ui.intllikedusers;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.member.R;
import l.oqn;
import l.ura;
import l.xdl0;
import l.xma;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlLikedUserHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText_NoTopPadding f6791a;

    public IntlLikedUserHeaderView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8325a(View view) {
        oqn.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m8326b() {
        xdl0.M(this.f6791a, true);
        this.f6791a.setText(ura.e().d().Rk() ? R.string.A0 : R.string.r0);
        this.f6791a.setTextColor(Color.parseColor(xma.y4() ? "#F9E7FF" : "#FFDEA2"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8325a(this);
    }

    public IntlLikedUserHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLikedUserHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
