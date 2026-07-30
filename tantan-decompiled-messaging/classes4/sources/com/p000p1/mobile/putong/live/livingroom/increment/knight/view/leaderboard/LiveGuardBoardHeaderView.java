package com.p000p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardInfoView;
import com.p1.mobile.putong.live.base.data.BLiveGuardboardRecord;
import java.util.List;
import l.vwb;
import l.xdl0;
import p002l.mpw;
import p002l.sqs;
import p002l.zqs;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGuardBoardHeaderView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveGuardBoardHeaderView f6505d;

    /* JADX INFO: renamed from: e */
    public LiveGuardInfoView f6506e;

    /* JADX INFO: renamed from: f */
    public LiveGuardBoardAwardGroup f6507f;

    /* JADX INFO: renamed from: g */
    public View f6508g;

    /* JADX INFO: renamed from: h */
    public GuardHeaderItemView f6509h;

    /* JADX INFO: renamed from: i */
    public GuardHeaderItemView f6510i;

    /* JADX INFO: renamed from: j */
    public GuardHeaderItemView f6511j;

    /* JADX INFO: renamed from: k */
    public zqs f6512k;

    public LiveGuardBoardHeaderView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m8256h0(View view) {
        sqs.m22632a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m8257i0(zqs zqsVar, mpw mpwVar, List<BLiveGuardboardRecord> list) {
        this.f6512k = zqsVar;
        this.f6506e.m8240i0(mpwVar);
        xdl0.M(this.f6507f, true);
        m8258j0(list);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m8258j0(List<BLiveGuardboardRecord> list) {
        int i = 0;
        while (i < 3) {
            BLiveGuardboardRecord bLiveGuardboardRecord = (vwb.J(list) || list.size() <= i) ? null : list.get(i);
            if (i == 0) {
                this.f6510i.m8254e(this.f6512k, bLiveGuardboardRecord, 1);
            } else if (i == 1) {
                this.f6509h.m8254e(this.f6512k, bLiveGuardboardRecord, 2);
            } else if (i == 2) {
                this.f6511j.m8254e(this.f6512k, bLiveGuardboardRecord, 3);
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8256h0(this);
    }

    public LiveGuardBoardHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGuardBoardHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
