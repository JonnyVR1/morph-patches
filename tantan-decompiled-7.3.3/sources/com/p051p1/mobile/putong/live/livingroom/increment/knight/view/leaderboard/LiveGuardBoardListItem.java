package com.p051p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveGuardboardRecord;
import com.p051p1.mobile.putong.live.base.view.LiveTagView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;
import p151v.VText;
import p153l.ats;
import p153l.bnl0;
import p153l.izs;
import p153l.qa00;
import p153l.vss;
import p153l.xau;
import p153l.yau;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardBoardListItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f51319d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f51320e;

    /* JADX INFO: renamed from: f */
    public LiveTagView f51321f;

    /* JADX INFO: renamed from: g */
    public TextView f51322g;

    /* JADX INFO: renamed from: h */
    public TextView f51323h;

    public LiveGuardBoardListItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m75849i0(View view) {
        vss.m202662a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m75850j0(final ats atsVar, final BLiveGuardboardRecord bLiveGuardboardRecord) {
        bnl0.m105524M(this.f51321f, TEnum.equals(bLiveGuardboardRecord.liveStates, "onlive"));
        boolean zEquals = TEnum.equals(bLiveGuardboardRecord.liveStates, "onlive");
        TextView textView = this.f51322g;
        if (zEquals) {
            bnl0.m105538V(textView, qa00.m175859d(36.0f));
        } else {
            bnl0.m105538V(textView, qa00.m175859d(16.0f));
        }
        this.f51319d.setText(String.valueOf(bLiveGuardboardRecord.rank));
        izs.m142870u("context_livingAct", this.f51320e, bLiveGuardboardRecord.userImage, qa00.m175859d(36.0f), qa00.m175859d(36.0f));
        this.f51322g.setText(bLiveGuardboardRecord.userName);
        this.f51323h.setText(xau.m209911u(R$string.f47630K5, yau.m214935c(Double.parseDouble(bLiveGuardboardRecord.amount))));
        setOnClickListener(new View.OnClickListener() { // from class: l.uss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                atsVar.m100251G(bLiveGuardboardRecord);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75849i0(this);
    }

    public LiveGuardBoardListItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGuardBoardListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
