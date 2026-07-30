package com.p046p1.mobile.putong.core.newui.home.views.innerpush;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.api.CoreInnerPush;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import p147v.VDraweeView;
import p147v.VText;
import p149l.qib0;
import p149l.qsm;
import p149l.xdl0;
import p149l.xq5;

/* JADX INFO: loaded from: classes11.dex */
public class ComplimentReceivedBannerLayout extends FrameLayout implements qsm {

    /* JADX INFO: renamed from: a */
    public VDraweeView f24067a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f24068b;

    /* JADX INFO: renamed from: c */
    public VText f24069c;

    /* JADX INFO: renamed from: d */
    public VText f24070d;

    public ComplimentReceivedBannerLayout(@NonNull Context context) {
        super(context);
    }

    @Override // p149l.qsm
    /* JADX INFO: renamed from: a */
    public void mo39229a(Act act, CoreInnerPush.C4716a c4716a, TabName tabName, Frag frag) {
        if (TextUtils.isEmpty(c4716a.f19177c)) {
            int i = c4716a.f19178d;
            VDraweeView vDraweeView = this.f24067a;
            if (i > 0) {
                xdl0.m208344M(vDraweeView, true);
                this.f24067a.setImageResource(c4716a.f19178d);
            } else {
                xdl0.m208344M(vDraweeView, false);
            }
        } else {
            xdl0.m208344M(this.f24067a, true);
            if (c4716a.f19179e) {
                qib0.f154691G.m102336O(this.f24067a, c4716a.f19177c, 2, 10);
            } else {
                qib0.f154691G.m102331L0(this.f24067a, c4716a.f19177c);
            }
        }
        if (!TextUtils.isEmpty(c4716a.f19175a)) {
            xdl0.m208344M(this.f24069c, true);
            this.f24069c.setText(c4716a.f19175a);
            this.f24069c.getPaint().setFakeBoldText(true);
        }
        if (TextUtils.isEmpty(c4716a.f19176b)) {
            return;
        }
        xdl0.m208344M(this.f24070d, true);
        this.f24070d.setText(c4716a.f19176b);
    }

    /* JADX INFO: renamed from: b */
    public final void m39230b(View view) {
        xq5.m210557a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39230b(this);
    }

    public ComplimentReceivedBannerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ComplimentReceivedBannerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
