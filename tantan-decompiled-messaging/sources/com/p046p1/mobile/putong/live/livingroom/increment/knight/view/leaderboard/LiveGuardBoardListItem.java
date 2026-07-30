package com.p046p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveGuardboardRecord;
import com.p046p1.mobile.putong.live.base.view.LiveTagView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;
import p147v.VText;
import p149l.hxs;
import p149l.t100;
import p149l.uqs;
import p149l.w8u;
import p149l.x8u;
import p149l.xdl0;
import p149l.zqs;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardBoardListItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f50471d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f50472e;

    /* JADX INFO: renamed from: f */
    public LiveTagView f50473f;

    /* JADX INFO: renamed from: g */
    public TextView f50474g;

    /* JADX INFO: renamed from: h */
    public TextView f50475h;

    public LiveGuardBoardListItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m74666i0(View view) {
        uqs.m195008a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m74667j0(final zqs zqsVar, final BLiveGuardboardRecord bLiveGuardboardRecord) {
        xdl0.m208344M(this.f50473f, TEnum.equals(bLiveGuardboardRecord.liveStates, "onlive"));
        boolean zEquals = TEnum.equals(bLiveGuardboardRecord.liveStates, "onlive");
        TextView textView = this.f50474g;
        if (zEquals) {
            xdl0.m208358V(textView, t100.m186890d(36.0f));
        } else {
            xdl0.m208358V(textView, t100.m186890d(16.0f));
        }
        this.f50471d.setText(String.valueOf(bLiveGuardboardRecord.rank));
        hxs.m133408u("context_livingAct", this.f50472e, bLiveGuardboardRecord.userImage, t100.m186890d(36.0f), t100.m186890d(36.0f));
        this.f50474g.setText(bLiveGuardboardRecord.userName);
        this.f50475h.setText(w8u.m202218u(R$string.f46782K5, x8u.m207433c(Double.parseDouble(bLiveGuardboardRecord.amount))));
        setOnClickListener(new View.OnClickListener() { // from class: l.tqs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zqsVar.m219885G(bLiveGuardboardRecord);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74666i0(this);
    }

    public LiveGuardBoardListItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGuardBoardListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
