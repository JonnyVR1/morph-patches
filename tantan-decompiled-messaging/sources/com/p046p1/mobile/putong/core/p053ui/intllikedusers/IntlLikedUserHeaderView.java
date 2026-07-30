package com.p046p1.mobile.putong.core.p053ui.intllikedusers;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.member.R$string;
import p147v.VText_NoTopPadding;
import p149l.oqn;
import p149l.ura;
import p149l.xdl0;
import p149l.xma;

/* JADX INFO: loaded from: classes11.dex */
public class IntlLikedUserHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText_NoTopPadding f29840a;

    public IntlLikedUserHeaderView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m46239a(View view) {
        oqn.m165462a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m46240b() {
        xdl0.m208344M(this.f29840a, true);
        this.f29840a.setText(ura.m195053e().m195057d().mo33747Rk() ? R$string.f20564A0 : R$string.f20679r0);
        this.f29840a.setTextColor(Color.parseColor(xma.m210098y4() ? "#F9E7FF" : "#FFDEA2"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46239a(this);
    }

    public IntlLikedUserHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLikedUserHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
