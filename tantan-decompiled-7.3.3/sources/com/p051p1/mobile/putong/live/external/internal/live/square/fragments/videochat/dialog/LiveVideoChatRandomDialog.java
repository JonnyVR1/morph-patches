package com.p051p1.mobile.putong.live.external.internal.live.square.fragments.videochat.dialog;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Square;
import com.p051p1.mobile.putong.live.base.data.BLiveRandomMatchCouponDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveRandomMatchCouponNotice;
import java.util.ArrayList;
import java.util.Objects;
import p153l.bnl0;
import p153l.dhw;
import p153l.gt0;
import p153l.i4g0;
import p153l.jbt;
import p153l.jwk0;
import p153l.jwu;
import p153l.jyb;
import p153l.m9c0;
import p153l.n3d0;
import p153l.pf60;
import p153l.vuf0;
import p153l.y20;
import p153l.yxu;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVideoChatRandomDialog extends FrameLayout {
    public View _background;
    public TextView _confirm;
    public TextView _desc1;
    public TextView _desc2;
    public TextView _desc3;
    public TextView _text;
    public ArrayList<TextView> descList;
    private jbt dialog;

    public LiveVideoChatRandomDialog(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m70328g(View view) {
        yxu.m217739a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m70330i(View view) {
        this.dialog.dismiss();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m70331j(Act act, BLiveRandomMatchCouponDetail bLiveRandomMatchCouponDetail, View view) {
        jbt jbtVar = this.dialog;
        if (jbtVar != null) {
            jbtVar.dismiss();
        }
        jwk0.m147172f(act, bLiveRandomMatchCouponDetail.remainCoupons, Square.TYPE);
        i4g0.m138523u("e_live_video_quickchat_random_pop", "p_live_video_quickchat", pf60.m172085a("pop_type", bLiveRandomMatchCouponDetail.remainCoupons == 0 ? "exchangeAndcall" : "call"));
    }

    /* JADX INFO: renamed from: k */
    public void m70332k(final Act act) {
        act.duringCreated(jwu.m147241P()).subscribe(dhw.m115826e(new y20() { // from class: l.sxu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171194a.m70329h(act, (BLiveRandomMatchCouponDetail) obj);
            }
        }, new y20() { // from class: l.txu
            @Override // p153l.y20
            public final void call(Object obj) {
                Objects.toString((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void m70329h(final Act act, final BLiveRandomMatchCouponDetail bLiveRandomMatchCouponDetail) {
        this.dialog = new jbt(act, this);
        this._background.setAlpha(0.0f);
        bnl0.m105509E0(this._background, new View.OnClickListener() { // from class: l.uxu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181505a.m70330i(view);
            }
        });
        bnl0.m105524M(this._background, true);
        final Animator animatorM132170p = gt0.m132170p(this._background, "alpha", 100L, 200L, new LinearInterpolator(), 0.0f, 1.0f);
        jyb.m147537z(this.descList, new y20() { // from class: l.vxu
            @Override // p153l.y20
            public final void call(Object obj) {
                bnl0.m105524M((TextView) obj, false);
            }
        });
        int iM161277a = n3d0.m161277a(m9c0.f135384i);
        for (int i = 0; i < Math.min(bLiveRandomMatchCouponDetail.notices.size(), 3); i++) {
            BLiveRandomMatchCouponNotice bLiveRandomMatchCouponNotice = bLiveRandomMatchCouponDetail.notices.get(i);
            String[] strArrSplit = bLiveRandomMatchCouponNotice.template.split("%s");
            vuf0.C20935a c20935aM202791c = null;
            for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                if (i2 == 0) {
                    c20935aM202791c = vuf0.m202788a(getContext(), strArrSplit[i2]).m202791c(iM161277a);
                } else {
                    c20935aM202791c.m202789a(strArrSplit[i2]).m202791c(iM161277a);
                }
                if (i2 < bLiveRandomMatchCouponNotice.fields.size()) {
                    c20935aM202791c.m202789a(bLiveRandomMatchCouponNotice.fields.get(i2)).m202791c(n3d0.m161277a(m9c0.f135390o));
                }
            }
            if (c20935aM202791c != null) {
                this.descList.get(i).setText(c20935aM202791c.m202790b());
                bnl0.m105524M(this.descList.get(i), true);
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
        this.dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.wxu
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                animatorM132170p.start();
            }
        });
        this.dialog.show();
        bnl0.m105509E0(this._confirm, new View.OnClickListener() { // from class: l.xxu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196682a.m70331j(act, bLiveRandomMatchCouponDetail, view);
            }
        });
        i4g0.m138492A("e_live_video_quickchat_random_pop", "p_live_video_quickchat", pf60.m172085a("pop_type", bLiveRandomMatchCouponDetail.remainCoupons == 0 ? "exchangeAndcall" : "call"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70328g(this);
        this.descList = jyb.m147507f0(this._desc1, this._desc2, this._desc3);
    }

    public LiveVideoChatRandomDialog(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVideoChatRandomDialog(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
