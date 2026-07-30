package com.p000p1.mobile.putong.live.livingroom.increment.recharge;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.immomo.svgaplayer.SVGAAnimListenerAdapter;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.p1.mobile.putong.live.base.view.XEGiftView;
import l.d30;
import l.uvr;
import l.xdl0;
import p002l.dqe;
import p002l.fge;
import p002l.ksj0;
import p002l.xdt;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveRemindDialog extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FrameLayout f6922d;

    /* JADX INFO: renamed from: e */
    public MomoLayUpSVGAImageView f6923e;

    /* JADX INFO: renamed from: f */
    public XEGiftView f6924f;

    /* JADX INFO: renamed from: g */
    public VText f6925g;

    /* JADX INFO: renamed from: h */
    public VText f6926h;

    public LiveRemindDialog(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m8750i0(View view) {
        xdt.m25897a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m8751j0(String str) {
        xdl0.M(this.f6922d, true);
        if (!uvr.d().E1()) {
            xdl0.M(this.f6923e, true);
            this.f6923e.loadSVGAAnimWithListener(ksj0.m16782i(str, 3000), 1, (SVGAAnimListenerAdapter) null, true);
        } else {
            xdl0.M(this.f6924f, true);
            fge.m13166r(this.f6924f, new dqe(str));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m8752k0(String str, String str2, final d30 d30Var) {
        this.f6925g.setText(str);
        xdl0.E0(this.f6926h, new View.OnClickListener() { // from class: l.wdt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        m8751j0(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8750i0(this);
    }

    public LiveRemindDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveRemindDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
