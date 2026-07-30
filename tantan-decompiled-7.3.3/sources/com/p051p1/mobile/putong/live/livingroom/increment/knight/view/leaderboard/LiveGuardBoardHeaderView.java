package com.p051p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveGuardboardRecord;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardInfoView;
import java.util.List;
import p153l.ats;
import p153l.bnl0;
import p153l.jyb;
import p153l.lsw;
import p153l.tss;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardBoardHeaderView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveGuardBoardHeaderView f51311d;

    /* JADX INFO: renamed from: e */
    public LiveGuardInfoView f51312e;

    /* JADX INFO: renamed from: f */
    public LiveGuardBoardAwardGroup f51313f;

    /* JADX INFO: renamed from: g */
    public View f51314g;

    /* JADX INFO: renamed from: h */
    public GuardHeaderItemView f51315h;

    /* JADX INFO: renamed from: i */
    public GuardHeaderItemView f51316i;

    /* JADX INFO: renamed from: j */
    public GuardHeaderItemView f51317j;

    /* JADX INFO: renamed from: k */
    public ats f51318k;

    public LiveGuardBoardHeaderView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m75845h0(View view) {
        tss.m192644a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m75846i0(ats atsVar, lsw lswVar, List<BLiveGuardboardRecord> list) {
        this.f51318k = atsVar;
        this.f51312e.m75830i0(lswVar);
        bnl0.m105524M(this.f51313f, true);
        m75847j0(list);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m75847j0(List<BLiveGuardboardRecord> list) {
        int i = 0;
        while (i < 3) {
            BLiveGuardboardRecord bLiveGuardboardRecord = (jyb.m147479J(list) || list.size() <= i) ? null : list.get(i);
            if (i == 0) {
                this.f51316i.m75843e(this.f51318k, bLiveGuardboardRecord, 1);
            } else if (i == 1) {
                this.f51315h.m75843e(this.f51318k, bLiveGuardboardRecord, 2);
            } else if (i == 2) {
                this.f51317j.m75843e(this.f51318k, bLiveGuardboardRecord, 3);
            }
            i++;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75845h0(this);
    }

    public LiveGuardBoardHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGuardBoardHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
