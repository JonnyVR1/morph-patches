package com.p046p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveGuardboardRecord;
import com.p046p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardInfoView;
import java.util.List;
import p149l.mpw;
import p149l.sqs;
import p149l.vwb;
import p149l.xdl0;
import p149l.zqs;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardBoardHeaderView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveGuardBoardHeaderView f50463d;

    /* JADX INFO: renamed from: e */
    public LiveGuardInfoView f50464e;

    /* JADX INFO: renamed from: f */
    public LiveGuardBoardAwardGroup f50465f;

    /* JADX INFO: renamed from: g */
    public View f50466g;

    /* JADX INFO: renamed from: h */
    public GuardHeaderItemView f50467h;

    /* JADX INFO: renamed from: i */
    public GuardHeaderItemView f50468i;

    /* JADX INFO: renamed from: j */
    public GuardHeaderItemView f50469j;

    /* JADX INFO: renamed from: k */
    public zqs f50470k;

    public LiveGuardBoardHeaderView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m74662h0(View view) {
        sqs.m185611a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m74663i0(zqs zqsVar, mpw mpwVar, List<BLiveGuardboardRecord> list) {
        this.f50470k = zqsVar;
        this.f50464e.m74647i0(mpwVar);
        xdl0.m208344M(this.f50465f, true);
        m74664j0(list);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m74664j0(List<BLiveGuardboardRecord> list) {
        int i = 0;
        while (i < 3) {
            BLiveGuardboardRecord bLiveGuardboardRecord = (vwb.m200296J(list) || list.size() <= i) ? null : list.get(i);
            if (i == 0) {
                this.f50468i.m74660e(this.f50470k, bLiveGuardboardRecord, 1);
            } else if (i == 1) {
                this.f50467h.m74660e(this.f50470k, bLiveGuardboardRecord, 2);
            } else if (i == 2) {
                this.f50469j.m74660e(this.f50470k, bLiveGuardboardRecord, 3);
            }
            i++;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74662h0(this);
    }

    public LiveGuardBoardHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGuardBoardHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
