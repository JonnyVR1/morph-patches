package com.p000p1.mobile.putong.core.newui.newmeet.feed.seecard;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.CoreModule;
import l.b3c0;
import l.g6y;
import l.zz6;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MeetSeeDefaultCardItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f5060a;

    /* JADX INFO: renamed from: b */
    public VText f5061b;

    /* JADX INFO: renamed from: c */
    public View f5062c;

    /* JADX INFO: renamed from: d */
    public VImage f5063d;

    public MeetSeeDefaultCardItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7139a(View view) {
        g6y.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7140b(int i) {
        if (CoreModule.P().a().e2()) {
            boolean zU0 = zz6.u0();
            VImage vImage = this.f5063d;
            if (zU0) {
                vImage.setImageResource(b3c0.M0);
            } else {
                vImage.setImageResource(b3c0.L0);
            }
        } else {
            boolean zU1 = zz6.u0();
            VImage vImage2 = this.f5063d;
            if (zU1) {
                vImage2.setImageResource(b3c0.O0);
            } else {
                vImage2.setImageResource(b3c0.N0);
            }
        }
        this.f5060a.setTypeface(Typeface.DEFAULT_BOLD);
        if (CoreModule.P().a().e2()) {
            this.f5060a.setText(String.format("%s人喜欢了我", i > 99 ? "99+" : Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7139a(this);
    }

    public MeetSeeDefaultCardItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MeetSeeDefaultCardItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
