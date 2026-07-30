package com.p046p1.mobile.putong.live.livingroom.voice.membermanager.settlein;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSettle;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.voice.membermanager.settlein.MemberManagerSettleItemView;
import p147v.VDraweeView;
import p147v.VText;
import p149l.d30;
import p149l.e0o0;
import p149l.e30;
import p149l.fld0;
import p149l.gay;
import p149l.gby;
import p149l.ggv;
import p149l.h1c0;
import p149l.hxn0;
import p149l.i3c0;
import p149l.key;
import p149l.kvc0;
import p149l.mqv;
import p149l.sxj;
import p149l.t100;
import p149l.xdl0;
import p149l.yb2;
import p149l.ypv;

/* JADX INFO: loaded from: classes11.dex */
public class MemberManagerSettleItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MemberManagerSettleItemView f53738d;

    /* JADX INFO: renamed from: e */
    public CommonAnimMaskAvatarView f53739e;

    /* JADX INFO: renamed from: f */
    public VText f53740f;

    /* JADX INFO: renamed from: g */
    public View f53741g;

    /* JADX INFO: renamed from: h */
    public VText f53742h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f53743i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f53744j;

    /* JADX INFO: renamed from: k */
    public VText f53745k;

    /* JADX INFO: renamed from: l */
    public VText f53746l;

    /* JADX INFO: renamed from: m */
    public VText f53747m;

    public MemberManagerSettleItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m78665l0(BLiveVoiceSettle bLiveVoiceSettle, e30 e30Var, View view) {
        if (bLiveVoiceSettle.isSelected) {
            return;
        }
        e30Var.call(bLiveVoiceSettle);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78670q0(this);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m78670q0(View view) {
        gby.m125348a(this, view);
    }

    /* JADX INFO: renamed from: r0 */
    public void m78671r0(boolean z, boolean z2) {
        if (z) {
            xdl0.m208344M(this.f53742h, true);
            this.f53742h.setText("群主");
            this.f53742h.setBackground(yb2.m213884i(kvc0.m147352a(h1c0.f105394p0), 4));
            return;
        }
        VText vText = this.f53742h;
        if (!z2) {
            xdl0.m208344M(vText, false);
            return;
        }
        xdl0.m208344M(vText, true);
        this.f53742h.setText("管理");
        this.f53742h.setBackground(yb2.m213884i(kvc0.m147352a(h1c0.f105421z), 4));
    }

    /* JADX INFO: renamed from: s0 */
    public void m78672s0(mqv<User> mqvVar, final BLiveVoiceCall bLiveVoiceCall, final d30 d30Var, final d30 d30Var2, final e30<String> e30Var, String str) {
        xdl0.m208344M(this.f53746l, true);
        xdl0.m208344M(this.f53745k, true);
        xdl0.m208344M(this.f53747m, false);
        xdl0.m208344M(this.f53742h, false);
        this.f53739e.setMaskAvatarData(new CommonAnimMaskAvatarView.C12717a().m72116f(hxn0.m133350c(mqvVar).f109896b).m72111a());
        this.f53740f.setText(mqvVar.f135304a.name);
        xdl0.m208329E0(this.f53746l, new View.OnClickListener() { // from class: l.dby
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        xdl0.m208329E0(this.f53745k, new View.OnClickListener() { // from class: l.eby
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var2.call();
            }
        });
        xdl0.m208329E0(this.f53738d, new View.OnClickListener() { // from class: l.fby
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(bLiveVoiceCall.user);
            }
        });
        this.f53741g.setBackground(kvc0.m147353b(TEnum.equals(mqvVar.f135304a.gender, "female") ? i3c0.f111248za : i3c0.f110660Ba));
        User user = mqvVar.f135304a;
        if (user == null || user.hierarchy == null || user.hierarchy.grade <= 0) {
            xdl0.m208344M(this.f53743i, false);
        } else {
            BLiveUserLevel bLiveUserLevelM126036v = ((ggv) ypv.m215673l(fld0.f98148c)).m126036v(mqvVar.f135304a.hierarchy.grade);
            VDraweeView vDraweeView = this.f53743i;
            if (bLiveUserLevelM126036v != null) {
                xdl0.m208344M(vDraweeView, true);
                sxj.m186442c(bLiveUserLevelM126036v.backendUrl, this.f53743i, sxj.f166797a);
            } else {
                xdl0.m208344M(vDraweeView, false);
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView2 = this.f53744j;
        if (zIsEmpty) {
            xdl0.m208344M(vDraweeView2, false);
        } else {
            xdl0.m208344M(vDraweeView2, true);
            sxj.m186442c(str, this.f53744j, sxj.f166797a);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m78673t0(final BLiveVoiceSettle bLiveVoiceSettle, final e30<BLiveVoiceSettle> e30Var, final e30<BLiveVoiceSettle> e30Var2, final e30<BLiveVoiceSettle> e30Var3) {
        xdl0.m208344M(this.f53746l, true);
        xdl0.m208344M(this.f53745k, true);
        xdl0.m208344M(this.f53747m, bLiveVoiceSettle.isSelected);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.aby
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(bLiveVoiceSettle);
            }
        });
        xdl0.m208329E0(this.f53746l, new View.OnClickListener() { // from class: l.bby
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var2.call(bLiveVoiceSettle);
            }
        });
        xdl0.m208329E0(this.f53745k, new View.OnClickListener() { // from class: l.cby
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var3.call(bLiveVoiceSettle);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final void m78674u0(final BLiveVoiceSettle bLiveVoiceSettle, gay gayVar, final e30<BLiveVoiceSettle> e30Var, final e30<BLiveVoiceSettle> e30Var2) {
        if (gayVar instanceof key) {
            this.f53747m.setVisibility((!bLiveVoiceSettle.canRecall || !(e0o0.m114322h(gayVar) || e0o0.m114321g(gayVar)) || ((key) gayVar).m145818d4()) ? 4 : 0);
        }
        xdl0.m208344M(this.f53746l, false);
        xdl0.m208344M(this.f53745k, false);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.yay
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(bLiveVoiceSettle);
            }
        });
        this.f53747m.setSelected(bLiveVoiceSettle.isSelected);
        this.f53747m.setText(bLiveVoiceSettle.isSelected ? "已召唤" : "召唤");
        xdl0.m208329E0(this.f53747m, new View.OnClickListener() { // from class: l.zay
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MemberManagerSettleItemView.m78665l0(bLiveVoiceSettle, e30Var2, view);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public void m78675v0(final BLiveVoiceSettle bLiveVoiceSettle, gay gayVar, int i, final e30<BLiveVoiceSettle> e30Var, e30<BLiveVoiceSettle> e30Var2, e30<BLiveVoiceSettle> e30Var3) {
        this.f53740f.setText(bLiveVoiceSettle.userName);
        this.f53741g.setBackground(kvc0.m147353b(TextUtils.equals(bLiveVoiceSettle.userGender, "male") ? i3c0.f110660Ba : i3c0.f111248za));
        this.f53739e.setMaskAvatarData(new CommonAnimMaskAvatarView.C12717a().m72115e(t100.f167229D).m72113c(bLiveVoiceSettle.userAvatar).m72112b(bLiveVoiceSettle.userAvatarResourceType).m72111a());
        m78671r0(bLiveVoiceSettle.isRoomOwner, bLiveVoiceSettle.isManager);
        xdl0.m208329E0(this.f53738d, new View.OnClickListener() { // from class: l.xay
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(bLiveVoiceSettle);
            }
        });
        if (i == 1) {
            m78674u0(bLiveVoiceSettle, gayVar, e30Var, e30Var2);
        } else if (i == 2) {
            m78673t0(bLiveVoiceSettle, e30Var, e30Var2, e30Var3);
        }
        BLiveUserLevel bLiveUserLevelM126036v = ((ggv) ypv.m215673l(fld0.f98148c)).m126036v(bLiveVoiceSettle.userGrade);
        VDraweeView vDraweeView = this.f53743i;
        if (bLiveUserLevelM126036v != null) {
            xdl0.m208344M(vDraweeView, true);
            sxj.m186442c(bLiveUserLevelM126036v.backendUrl, this.f53743i, sxj.f166797a);
        } else {
            xdl0.m208344M(vDraweeView, false);
        }
        boolean zIsEmpty = TextUtils.isEmpty(bLiveVoiceSettle.starlightGradeImage);
        VDraweeView vDraweeView2 = this.f53744j;
        if (zIsEmpty) {
            xdl0.m208344M(vDraweeView2, false);
        } else {
            xdl0.m208344M(vDraweeView2, true);
            sxj.m186442c(bLiveVoiceSettle.starlightGradeImage, this.f53744j, sxj.f166797a);
        }
    }

    public MemberManagerSettleItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MemberManagerSettleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
