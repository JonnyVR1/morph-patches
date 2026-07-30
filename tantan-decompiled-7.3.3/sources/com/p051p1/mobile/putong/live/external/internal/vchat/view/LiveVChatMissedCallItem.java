package com.p051p1.mobile.putong.live.external.internal.vchat.view;

import android.content.Context;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatMissedCall;
import java.text.SimpleDateFormat;
import java.util.Date;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.qa00;
import p153l.qou;
import p153l.wou;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatMissedCallItem extends ConstraintLayout {

    /* JADX INFO: renamed from: l */
    public static final SimpleDateFormat f46241l = new SimpleDateFormat("yyyy-MM-dd");

    /* JADX INFO: renamed from: m */
    public static final SimpleDateFormat f46242m = new SimpleDateFormat("HH:mm");

    /* JADX INFO: renamed from: d */
    public VLinear f46243d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f46244e;

    /* JADX INFO: renamed from: f */
    public View f46245f;

    /* JADX INFO: renamed from: g */
    public VText f46246g;

    /* JADX INFO: renamed from: h */
    public VLinear f46247h;

    /* JADX INFO: renamed from: i */
    public VText f46248i;

    /* JADX INFO: renamed from: j */
    public View f46249j;

    /* JADX INFO: renamed from: k */
    public VText f46250k;

    public LiveVChatMissedCallItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m70925i0(View view) {
        qou.m177324a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public String m70926j0(long j) {
        Date date = new Date(j);
        if (DateUtils.isToday(date.getTime())) {
            return f46242m.format(date);
        }
        return m70927k0(date.getTime()) ? "昨天" : f46241l.format(date);
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m70927k0(long j) {
        return DateUtils.isToday(j + 86400000);
    }

    /* JADX INFO: renamed from: l0 */
    public void m70928l0(final wou wouVar, final BLiveVideoChatMissedCall bLiveVideoChatMissedCall) {
        bnl0.m105524M(this.f46245f, bLiveVideoChatMissedCall.isOnline);
        bnl0.m105524M(this.f46248i, bLiveVideoChatMissedCall.isNew);
        bnl0.m105524M(this.f46249j, bLiveVideoChatMissedCall.isNew);
        this.f46246g.setText(bLiveVideoChatMissedCall.userName);
        this.f46243d.setSelected(bLiveVideoChatMissedCall.canCallUser);
        izs.m142869t("context_single_room", this.f46244e, bLiveVideoChatMissedCall.avatar, qa00.f156337x);
        bnl0.m105509E0(this.f46243d, new View.OnClickListener() { // from class: l.pou
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wouVar.m207358Y2(bLiveVideoChatMissedCall);
            }
        });
        this.f46250k.setText(m70926j0(bLiveVideoChatMissedCall.calledTime));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70925i0(this);
    }

    public LiveVChatMissedCallItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatMissedCallItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
