package com.p051p1.mobile.putong.core.newui.newmeet.feed.seecard;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import p151v.VImage;
import p151v.VText;
import p153l.c17;
import p153l.dfy;
import p153l.gbc0;

/* JADX INFO: loaded from: classes11.dex */
public class MeetSeeDefaultCardItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f27024a;

    /* JADX INFO: renamed from: b */
    public VText f27025b;

    /* JADX INFO: renamed from: c */
    public View f27026c;

    /* JADX INFO: renamed from: d */
    public VImage f27027d;

    public MeetSeeDefaultCardItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m43955a(View view) {
        dfy.m115565a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m43956b(int i) {
        if (CoreModule.m30933P().m143405a().mo34492e2()) {
            boolean zM107528u0 = c17.m107528u0();
            VImage vImage = this.f27027d;
            if (zM107528u0) {
                vImage.setImageResource(gbc0.f103156M0);
            } else {
                vImage.setImageResource(gbc0.f103149L0);
            }
        } else {
            boolean zM107528u1 = c17.m107528u0();
            VImage vImage2 = this.f27027d;
            if (zM107528u1) {
                vImage2.setImageResource(gbc0.f103170O0);
            } else {
                vImage2.setImageResource(gbc0.f103163N0);
            }
        }
        this.f27024a.setTypeface(Typeface.DEFAULT_BOLD);
        if (CoreModule.m30933P().m143405a().mo34492e2()) {
            this.f27024a.setText(String.format("%s人喜欢了我", i > 99 ? "99+" : Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43955a(this);
    }

    public MeetSeeDefaultCardItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MeetSeeDefaultCardItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
