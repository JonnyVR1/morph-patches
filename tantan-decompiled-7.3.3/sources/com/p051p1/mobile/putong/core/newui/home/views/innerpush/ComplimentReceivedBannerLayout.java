package com.p051p1.mobile.putong.core.newui.home.views.innerpush;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.api.CoreInnerPush;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.bs5;
import p153l.sum;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class ComplimentReceivedBannerLayout extends FrameLayout implements sum {

    /* JADX INFO: renamed from: a */
    public VDraweeView f24809a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f24810b;

    /* JADX INFO: renamed from: c */
    public VText f24811c;

    /* JADX INFO: renamed from: d */
    public VText f24812d;

    public ComplimentReceivedBannerLayout(@NonNull Context context) {
        super(context);
    }

    @Override // p153l.sum
    /* JADX INFO: renamed from: a */
    public void mo40232a(Act act, CoreInnerPush.C4867a c4867a, TabName tabName, Frag frag) {
        if (TextUtils.isEmpty(c4867a.f19918c)) {
            int i = c4867a.f19919d;
            VDraweeView vDraweeView = this.f24809a;
            if (i > 0) {
                bnl0.m105524M(vDraweeView, true);
                this.f24809a.setImageResource(c4867a.f19919d);
            } else {
                bnl0.m105524M(vDraweeView, false);
            }
        } else {
            bnl0.m105524M(this.f24809a, true);
            if (c4867a.f19920e) {
                uqb0.f180374G.m127120O(this.f24809a, c4867a.f19918c, 2, 10);
            } else {
                uqb0.f180374G.m127115L0(this.f24809a, c4867a.f19918c);
            }
        }
        if (!TextUtils.isEmpty(c4867a.f19916a)) {
            bnl0.m105524M(this.f24811c, true);
            this.f24811c.setText(c4867a.f19916a);
            this.f24811c.getPaint().setFakeBoldText(true);
        }
        if (TextUtils.isEmpty(c4867a.f19917b)) {
            return;
        }
        bnl0.m105524M(this.f24812d, true);
        this.f24812d.setText(c4867a.f19917b);
    }

    /* JADX INFO: renamed from: b */
    public final void m40233b(View view) {
        bs5.m106217a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40233b(this);
    }

    public ComplimentReceivedBannerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ComplimentReceivedBannerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
