package com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderboardRecord;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderboardUser;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.ncs;
import p153l.seg;
import p153l.yau;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFansClubBigWigsUserItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f49931a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f49932b;

    /* JADX INFO: renamed from: c */
    public VText f49933c;

    /* JADX INFO: renamed from: d */
    public View f49934d;

    /* JADX INFO: renamed from: e */
    public VText f49935e;

    public LiveFansClubBigWigsUserItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m74090a(View view) {
        ncs.m162594a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final String m74091b(double d) {
        if (seg.m185534b()) {
            return yau.m214937e(d);
        }
        return seg.m185535c() ? yau.m214936d(d) : yau.m214939g(d);
    }

    /* JADX INFO: renamed from: c */
    public void m74092c(BLiveLeaderboardRecord bLiveLeaderboardRecord, BLiveLeaderboardUser bLiveLeaderboardUser, String str) {
        this.f49931a.setTypeface(Typeface.DEFAULT_BOLD);
        m74093d(bLiveLeaderboardRecord.rank);
        this.f49935e.setText(String.format(str, m74091b(Double.parseDouble(bLiveLeaderboardRecord.amount))));
        if (bLiveLeaderboardUser != null) {
            this.f49933c.setText(bLiveLeaderboardUser.name);
            bnl0.m105525M0(this.f49932b, !TextUtils.isEmpty(bLiveLeaderboardUser.imageUrl));
            izs.m142868s("context_single_room", this.f49932b, bLiveLeaderboardUser.imageUrl);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m74093d(int i) {
        if (i == 1) {
            this.f49931a.setTextColor(-800506);
        } else if (i != 2) {
            VText vText = this.f49931a;
            if (i != 3) {
                vText.setTextColor(637534208);
            } else {
                vText.setTextColor(-91051);
            }
        } else {
            this.f49931a.setTextColor(-5130241);
        }
        this.f49931a.setText(String.valueOf(i));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74090a(this);
    }

    public LiveFansClubBigWigsUserItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveFansClubBigWigsUserItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
