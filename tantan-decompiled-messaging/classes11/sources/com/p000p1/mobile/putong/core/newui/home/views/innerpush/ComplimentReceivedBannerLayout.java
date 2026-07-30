package com.p000p1.mobile.putong.core.newui.home.views.innerpush;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.api.CoreInnerPush;
import l.qib0;
import l.xdl0;
import l.xq5;
import p009l.qsm;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ComplimentReceivedBannerLayout extends FrameLayout implements qsm {

    /* JADX INFO: renamed from: a */
    public VDraweeView f2845a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f2846b;

    /* JADX INFO: renamed from: c */
    public VText f2847c;

    /* JADX INFO: renamed from: d */
    public VText f2848d;

    public ComplimentReceivedBannerLayout(@NonNull Context context) {
        super(context);
    }

    @Override // p009l.qsm
    /* JADX INFO: renamed from: a */
    public void mo3247a(Act act, CoreInnerPush.a aVar, TabName tabName, Frag frag) {
        if (TextUtils.isEmpty(aVar.c)) {
            int i = aVar.d;
            VDraweeView vDraweeView = this.f2845a;
            if (i > 0) {
                xdl0.M(vDraweeView, true);
                this.f2845a.setImageResource(aVar.d);
            } else {
                xdl0.M(vDraweeView, false);
            }
        } else {
            xdl0.M(this.f2845a, true);
            if (aVar.e) {
                qib0.G.O(this.f2845a, aVar.c, 2, 10);
            } else {
                qib0.G.L0(this.f2845a, aVar.c);
            }
        }
        if (!TextUtils.isEmpty(aVar.a)) {
            xdl0.M(this.f2847c, true);
            this.f2847c.setText(aVar.a);
            this.f2847c.getPaint().setFakeBoldText(true);
        }
        if (TextUtils.isEmpty(aVar.b)) {
            return;
        }
        xdl0.M(this.f2848d, true);
        this.f2848d.setText(aVar.b);
    }

    /* JADX INFO: renamed from: b */
    public final void m3248b(View view) {
        xq5.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3248b(this);
    }

    public ComplimentReceivedBannerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ComplimentReceivedBannerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
