package com.p046p1.mobile.putong.live.livingroom.increment.recharge;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.p046p1.mobile.putong.live.base.view.XEGiftView;
import p147v.VText;
import p149l.d30;
import p149l.dqe;
import p149l.fge;
import p149l.ksj0;
import p149l.uvr;
import p149l.xdl0;
import p149l.xdt;

/* JADX INFO: loaded from: classes4.dex */
public class LiveRemindDialog extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FrameLayout f50880d;

    /* JADX INFO: renamed from: e */
    public MomoLayUpSVGAImageView f50881e;

    /* JADX INFO: renamed from: f */
    public XEGiftView f50882f;

    /* JADX INFO: renamed from: g */
    public VText f50883g;

    /* JADX INFO: renamed from: h */
    public VText f50884h;

    public LiveRemindDialog(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m75134i0(View view) {
        xdt.m208428a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m75135j0(String str) {
        xdl0.m208344M(this.f50880d, true);
        if (!uvr.m196087d().m162666E1()) {
            xdl0.m208344M(this.f50881e, true);
            this.f50881e.loadSVGAAnimWithListener(ksj0.m147082i(str, 3000), 1, null, true);
        } else {
            xdl0.m208344M(this.f50882f, true);
            fge.m121214r(this.f50882f, new dqe(str));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m75136k0(String str, String str2, final d30 d30Var) {
        this.f50883g.setText(str);
        xdl0.m208329E0(this.f50884h, new View.OnClickListener() { // from class: l.wdt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        m75135j0(str2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75134i0(this);
    }

    public LiveRemindDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveRemindDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
