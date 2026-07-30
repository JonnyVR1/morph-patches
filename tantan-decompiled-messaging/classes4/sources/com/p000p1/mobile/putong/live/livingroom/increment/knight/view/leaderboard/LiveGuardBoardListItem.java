package com.p000p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveGuardboardRecord;
import com.p1.mobile.putong.live.base.view.LiveTagView;
import l.hxs;
import l.t100;
import l.w8u;
import l.x8u;
import l.xdl0;
import p002l.uqs;
import p002l.zqs;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGuardBoardListItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f6513d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f6514e;

    /* JADX INFO: renamed from: f */
    public LiveTagView f6515f;

    /* JADX INFO: renamed from: g */
    public TextView f6516g;

    /* JADX INFO: renamed from: h */
    public TextView f6517h;

    public LiveGuardBoardListItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m8260i0(View view) {
        uqs.m23578a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public void m8261j0(final zqs zqsVar, final BLiveGuardboardRecord bLiveGuardboardRecord) {
        xdl0.M(this.f6515f, TEnum.equals(bLiveGuardboardRecord.liveStates, "onlive"));
        boolean zEquals = TEnum.equals(bLiveGuardboardRecord.liveStates, "onlive");
        TextView textView = this.f6516g;
        if (zEquals) {
            xdl0.V(textView, t100.d(36.0f));
        } else {
            xdl0.V(textView, t100.d(16.0f));
        }
        this.f6513d.setText(String.valueOf(bLiveGuardboardRecord.rank));
        hxs.u("context_livingAct", this.f6514e, bLiveGuardboardRecord.userImage, t100.d(36.0f), t100.d(36.0f));
        this.f6516g.setText(bLiveGuardboardRecord.userName);
        this.f6517h.setText(w8u.u(R$string.f2824K5, x8u.c(Double.parseDouble(bLiveGuardboardRecord.amount))));
        setOnClickListener(new View.OnClickListener() { // from class: l.tqs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zqsVar.m27513G(bLiveGuardboardRecord);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8260i0(this);
    }

    public LiveGuardBoardListItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGuardBoardListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
