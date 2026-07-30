package com.p046p1.mobile.putong.core.newui.newmeet.feed.seecard;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import p147v.VImage;
import p147v.VText;
import p149l.b3c0;
import p149l.g6y;
import p149l.zz6;

/* JADX INFO: loaded from: classes11.dex */
public class MeetSeeDefaultCardItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f26282a;

    /* JADX INFO: renamed from: b */
    public VText f26283b;

    /* JADX INFO: renamed from: c */
    public View f26284c;

    /* JADX INFO: renamed from: d */
    public VImage f26285d;

    public MeetSeeDefaultCardItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m42944a(View view) {
        g6y.m124668a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m42945b(int i) {
        if (CoreModule.m29935P().m94651a().mo33489e2()) {
            boolean zM221004u0 = zz6.m221004u0();
            VImage vImage = this.f26285d;
            if (zM221004u0) {
                vImage.setImageResource(b3c0.f72905M0);
            } else {
                vImage.setImageResource(b3c0.f72898L0);
            }
        } else {
            boolean zM221004u1 = zz6.m221004u0();
            VImage vImage2 = this.f26285d;
            if (zM221004u1) {
                vImage2.setImageResource(b3c0.f72919O0);
            } else {
                vImage2.setImageResource(b3c0.f72912N0);
            }
        }
        this.f26282a.setTypeface(Typeface.DEFAULT_BOLD);
        if (CoreModule.m29935P().m94651a().mo33489e2()) {
            this.f26282a.setText(String.format("%s人喜欢了我", i > 99 ? "99+" : Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42944a(this);
    }

    public MeetSeeDefaultCardItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MeetSeeDefaultCardItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
