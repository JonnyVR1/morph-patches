package com.p046p1.mobile.putong.live.external.internal.live.square.fragments.videochat.dialog;

import android.animation.Animator;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Square;
import com.p046p1.mobile.putong.live.base.data.BLiveRandomMatchCouponDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveRandomMatchCouponNotice;
import java.util.ArrayList;
import java.util.Objects;
import p149l.bt0;
import p149l.dnk0;
import p149l.e30;
import p149l.ffw;
import p149l.g1c0;
import p149l.i9t;
import p149l.iuu;
import p149l.j760;
import p149l.kvc0;
import p149l.mmf0;
import p149l.vwb;
import p149l.xdl0;
import p149l.xvu;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVideoChatRandomDialog extends FrameLayout {
    public View _background;
    public TextView _confirm;
    public TextView _desc1;
    public TextView _desc2;
    public TextView _desc3;
    public TextView _text;
    public ArrayList<TextView> descList;
    private i9t dialog;

    public LiveVideoChatRandomDialog(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m69145g(View view) {
        xvu.m211307a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m69147i(View view) {
        this.dialog.dismiss();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m69148j(Act act, BLiveRandomMatchCouponDetail bLiveRandomMatchCouponDetail, View view) {
        i9t i9tVar = this.dialog;
        if (i9tVar != null) {
            i9tVar.dismiss();
        }
        dnk0.m112647f(act, bLiveRandomMatchCouponDetail.remainCoupons, Square.TYPE);
        zvf0.m220399u("e_live_video_quickchat_random_pop", "p_live_video_quickchat", j760.m140076a("pop_type", bLiveRandomMatchCouponDetail.remainCoupons == 0 ? "exchangeAndcall" : "call"));
    }

    /* JADX INFO: renamed from: k */
    public void m69149k(final Act act) {
        act.duringCreated(iuu.m138455P()).subscribe(ffw.m121194e(new e30() { // from class: l.rvu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161272a.m69146h(act, (BLiveRandomMatchCouponDetail) obj);
            }
        }, new e30() { // from class: l.svu
            @Override // p149l.e30
            public final void call(Object obj) {
                Objects.toString((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void m69146h(final Act act, final BLiveRandomMatchCouponDetail bLiveRandomMatchCouponDetail) {
        this.dialog = new i9t(act, this);
        this._background.setAlpha(0.0f);
        xdl0.m208329E0(this._background, new View.OnClickListener() { // from class: l.tvu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172341a.m69147i(view);
            }
        });
        xdl0.m208344M(this._background, true);
        final Animator animatorM103743p = bt0.m103743p(this._background, "alpha", 100L, 200L, new LinearInterpolator(), 0.0f, 1.0f);
        vwb.m200354z(this.descList, new e30() { // from class: l.uvu
            @Override // p149l.e30
            public final void call(Object obj) {
                xdl0.m208344M((TextView) obj, false);
            }
        });
        int iM147352a = kvc0.m147352a(g1c0.f100154i);
        for (int i = 0; i < Math.min(bLiveRandomMatchCouponDetail.notices.size(), 3); i++) {
            BLiveRandomMatchCouponNotice bLiveRandomMatchCouponNotice = bLiveRandomMatchCouponDetail.notices.get(i);
            String[] strArrSplit = bLiveRandomMatchCouponNotice.template.split("%s");
            mmf0.C18503a c18503aM155395c = null;
            for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                if (i2 == 0) {
                    c18503aM155395c = mmf0.m155392a(getContext(), strArrSplit[i2]).m155395c(iM147352a);
                } else {
                    c18503aM155395c.m155393a(strArrSplit[i2]).m155395c(iM147352a);
                }
                if (i2 < bLiveRandomMatchCouponNotice.fields.size()) {
                    c18503aM155395c.m155393a(bLiveRandomMatchCouponNotice.fields.get(i2)).m155395c(kvc0.m147352a(g1c0.f100160o));
                }
            }
            if (c18503aM155395c != null) {
                this.descList.get(i).setText(c18503aM155395c.m155394b());
                xdl0.m208344M(this.descList.get(i), true);
            }
        }
        int i3 = bLiveRandomMatchCouponDetail.remainCoupons;
        TextView textView = this._confirm;
        if (i3 == 0) {
            textView.setText("兑换次数并发起");
        } else {
            textView.setText("立即发起");
        }
        this._text.setText("随机匹配剩余次数：" + bLiveRandomMatchCouponDetail.remainCoupons);
        this.dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.vvu
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                animatorM103743p.start();
            }
        });
        this.dialog.show();
        xdl0.m208329E0(this._confirm, new View.OnClickListener() { // from class: l.wvu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188285a.m69148j(act, bLiveRandomMatchCouponDetail, view);
            }
        });
        zvf0.m220368A("e_live_video_quickchat_random_pop", "p_live_video_quickchat", j760.m140076a("pop_type", bLiveRandomMatchCouponDetail.remainCoupons == 0 ? "exchangeAndcall" : "call"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69145g(this);
        this.descList = vwb.m200324f0(this._desc1, this._desc2, this._desc3);
    }

    public LiveVideoChatRandomDialog(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVideoChatRandomDialog(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
