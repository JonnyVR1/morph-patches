package com.p046p1.mobile.putong.live.external.internal.vchat.view;

import android.content.Context;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatMissedCall;
import java.text.SimpleDateFormat;
import java.util.Date;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.hxs;
import p149l.pmu;
import p149l.t100;
import p149l.vmu;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatMissedCallItem extends ConstraintLayout {

    /* JADX INFO: renamed from: l */
    public static final SimpleDateFormat f45393l = new SimpleDateFormat("yyyy-MM-dd");

    /* JADX INFO: renamed from: m */
    public static final SimpleDateFormat f45394m = new SimpleDateFormat("HH:mm");

    /* JADX INFO: renamed from: d */
    public VLinear f45395d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f45396e;

    /* JADX INFO: renamed from: f */
    public View f45397f;

    /* JADX INFO: renamed from: g */
    public VText f45398g;

    /* JADX INFO: renamed from: h */
    public VLinear f45399h;

    /* JADX INFO: renamed from: i */
    public VText f45400i;

    /* JADX INFO: renamed from: j */
    public View f45401j;

    /* JADX INFO: renamed from: k */
    public VText f45402k;

    public LiveVChatMissedCallItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m69742i0(View view) {
        pmu.m170376a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public String m69743j0(long j) {
        Date date = new Date(j);
        if (DateUtils.isToday(date.getTime())) {
            return f45394m.format(date);
        }
        return m69744k0(date.getTime()) ? "昨天" : f45393l.format(date);
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m69744k0(long j) {
        return DateUtils.isToday(j + 86400000);
    }

    /* JADX INFO: renamed from: l0 */
    public void m69745l0(final vmu vmuVar, final BLiveVideoChatMissedCall bLiveVideoChatMissedCall) {
        xdl0.m208344M(this.f45397f, bLiveVideoChatMissedCall.isOnline);
        xdl0.m208344M(this.f45400i, bLiveVideoChatMissedCall.isNew);
        xdl0.m208344M(this.f45401j, bLiveVideoChatMissedCall.isNew);
        this.f45398g.setText(bLiveVideoChatMissedCall.userName);
        this.f45395d.setSelected(bLiveVideoChatMissedCall.canCallUser);
        hxs.m133407t("context_single_room", this.f45396e, bLiveVideoChatMissedCall.avatar, t100.f167275x);
        xdl0.m208329E0(this.f45395d, new View.OnClickListener() { // from class: l.omu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vmuVar.m198993Y2(bLiveVideoChatMissedCall);
            }
        });
        this.f45402k.setText(m69743j0(bLiveVideoChatMissedCall.calledTime));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69742i0(this);
    }

    public LiveVChatMissedCallItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatMissedCallItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
