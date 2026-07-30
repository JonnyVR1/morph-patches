package com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderboardRecord;
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderboardUser;
import p147v.VDraweeView;
import p147v.VText;
import p149l.edg;
import p149l.hxs;
import p149l.mas;
import p149l.x8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFansClubBigWigsUserItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f49083a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f49084b;

    /* JADX INFO: renamed from: c */
    public VText f49085c;

    /* JADX INFO: renamed from: d */
    public View f49086d;

    /* JADX INFO: renamed from: e */
    public VText f49087e;

    public LiveFansClubBigWigsUserItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m72907a(View view) {
        mas.m153831a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final String m72908b(double d) {
        if (edg.m115797b()) {
            return x8u.m207435e(d);
        }
        return edg.m115798c() ? x8u.m207434d(d) : x8u.m207437g(d);
    }

    /* JADX INFO: renamed from: c */
    public void m72909c(BLiveLeaderboardRecord bLiveLeaderboardRecord, BLiveLeaderboardUser bLiveLeaderboardUser, String str) {
        this.f49083a.setTypeface(Typeface.DEFAULT_BOLD);
        m72910d(bLiveLeaderboardRecord.rank);
        this.f49087e.setText(String.format(str, m72908b(Double.parseDouble(bLiveLeaderboardRecord.amount))));
        if (bLiveLeaderboardUser != null) {
            this.f49085c.setText(bLiveLeaderboardUser.name);
            xdl0.m208345M0(this.f49084b, !TextUtils.isEmpty(bLiveLeaderboardUser.imageUrl));
            hxs.m133406s("context_single_room", this.f49084b, bLiveLeaderboardUser.imageUrl);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m72910d(int i) {
        if (i == 1) {
            this.f49083a.setTextColor(-800506);
        } else if (i != 2) {
            VText vText = this.f49083a;
            if (i != 3) {
                vText.setTextColor(637534208);
            } else {
                vText.setTextColor(-91051);
            }
        } else {
            this.f49083a.setTextColor(-5130241);
        }
        this.f49083a.setText(String.valueOf(i));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72907a(this);
    }

    public LiveFansClubBigWigsUserItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveFansClubBigWigsUserItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
