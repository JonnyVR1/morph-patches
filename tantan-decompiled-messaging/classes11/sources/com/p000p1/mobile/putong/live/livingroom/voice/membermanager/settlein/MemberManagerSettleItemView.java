package com.p000p1.mobile.putong.live.livingroom.voice.membermanager.settlein;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.voice.membermanager.settlein.MemberManagerSettleItemView;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSettle;
import com.p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import l.d30;
import l.e30;
import l.gby;
import l.h1c0;
import l.hxn0;
import l.i3c0;
import l.kvc0;
import l.mqv;
import l.sxj;
import l.t100;
import l.xdl0;
import l.yb2;
import p009l.e0o0;
import p009l.fld0;
import p009l.gay;
import p009l.ggv;
import p009l.key;
import p009l.ypv;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MemberManagerSettleItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MemberManagerSettleItemView f7344d;

    /* JADX INFO: renamed from: e */
    public CommonAnimMaskAvatarView f7345e;

    /* JADX INFO: renamed from: f */
    public VText f7346f;

    /* JADX INFO: renamed from: g */
    public View f7347g;

    /* JADX INFO: renamed from: h */
    public VText f7348h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f7349i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f7350j;

    /* JADX INFO: renamed from: k */
    public VText f7351k;

    /* JADX INFO: renamed from: l */
    public VText f7352l;

    /* JADX INFO: renamed from: m */
    public VText f7353m;

    public MemberManagerSettleItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m8881l0(BLiveVoiceSettle bLiveVoiceSettle, e30 e30Var, View view) {
        if (bLiveVoiceSettle.isSelected) {
            return;
        }
        e30Var.call(bLiveVoiceSettle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8886q0(this);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m8886q0(View view) {
        gby.a(this, view);
    }

    /* JADX INFO: renamed from: r0 */
    public void m8887r0(boolean z, boolean z2) {
        if (z) {
            xdl0.M(this.f7348h, true);
            this.f7348h.setText("群主");
            this.f7348h.setBackground(yb2.i(kvc0.a(h1c0.p0), 4));
            return;
        }
        VText vText = this.f7348h;
        if (!z2) {
            xdl0.M(vText, false);
            return;
        }
        xdl0.M(vText, true);
        this.f7348h.setText("管理");
        this.f7348h.setBackground(yb2.i(kvc0.a(h1c0.z), 4));
    }

    /* JADX INFO: renamed from: s0 */
    public void m8888s0(mqv<User> mqvVar, final BLiveVoiceCall bLiveVoiceCall, final d30 d30Var, final d30 d30Var2, final e30<String> e30Var, String str) {
        xdl0.M(this.f7352l, true);
        xdl0.M(this.f7351k, true);
        xdl0.M(this.f7353m, false);
        xdl0.M(this.f7348h, false);
        this.f7345e.setMaskAvatarData(new CommonAnimMaskAvatarView.a().f(hxn0.c(mqvVar).b).a());
        this.f7346f.setText(((User) mqvVar.a).name);
        xdl0.E0(this.f7352l, new View.OnClickListener() { // from class: l.dby
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        xdl0.E0(this.f7351k, new View.OnClickListener() { // from class: l.eby
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var2.call();
            }
        });
        xdl0.E0(this.f7344d, new View.OnClickListener() { // from class: l.fby
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(bLiveVoiceCall.user);
            }
        });
        this.f7347g.setBackground(kvc0.b(TEnum.equals(((User) mqvVar.a).gender, "female") ? i3c0.za : i3c0.Ba));
        Object obj = mqvVar.a;
        if (obj == null || ((User) obj).hierarchy == null || ((User) obj).hierarchy.grade <= 0) {
            xdl0.M(this.f7349i, false);
        } else {
            BLiveUserLevel bLiveUserLevelM15033v = ((ggv) ypv.m25491l(fld0.f13077c)).m15033v(((User) mqvVar.a).hierarchy.grade);
            VDraweeView vDraweeView = this.f7349i;
            if (bLiveUserLevelM15033v != null) {
                xdl0.M(vDraweeView, true);
                sxj.c(bLiveUserLevelM15033v.backendUrl, this.f7349i, sxj.a);
            } else {
                xdl0.M(vDraweeView, false);
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView2 = this.f7350j;
        if (zIsEmpty) {
            xdl0.M(vDraweeView2, false);
        } else {
            xdl0.M(vDraweeView2, true);
            sxj.c(str, this.f7350j, sxj.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t0 */
    public final void m8889t0(final BLiveVoiceSettle bLiveVoiceSettle, final e30<BLiveVoiceSettle> e30Var, final e30<BLiveVoiceSettle> e30Var2, final e30<BLiveVoiceSettle> e30Var3) {
        xdl0.M(this.f7352l, true);
        xdl0.M(this.f7351k, true);
        xdl0.M(this.f7353m, bLiveVoiceSettle.isSelected);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.aby
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(bLiveVoiceSettle);
            }
        });
        xdl0.E0(this.f7352l, new View.OnClickListener() { // from class: l.bby
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var2.call(bLiveVoiceSettle);
            }
        });
        xdl0.E0(this.f7351k, new View.OnClickListener() { // from class: l.cby
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var3.call(bLiveVoiceSettle);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public final void m8890u0(final BLiveVoiceSettle bLiveVoiceSettle, gay gayVar, final e30<BLiveVoiceSettle> e30Var, final e30<BLiveVoiceSettle> e30Var2) {
        if (gayVar instanceof key) {
            this.f7353m.setVisibility((!bLiveVoiceSettle.canRecall || !(e0o0.m13619h(gayVar) || e0o0.m13618g(gayVar)) || ((key) gayVar).m17456d4()) ? 4 : 0);
        }
        xdl0.M(this.f7352l, false);
        xdl0.M(this.f7351k, false);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.yay
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(bLiveVoiceSettle);
            }
        });
        this.f7353m.setSelected(bLiveVoiceSettle.isSelected);
        this.f7353m.setText(bLiveVoiceSettle.isSelected ? "已召唤" : "召唤");
        xdl0.E0(this.f7353m, new View.OnClickListener() { // from class: l.zay
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MemberManagerSettleItemView.m8881l0(bLiveVoiceSettle, e30Var2, view);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public void m8891v0(final BLiveVoiceSettle bLiveVoiceSettle, gay gayVar, int i, final e30<BLiveVoiceSettle> e30Var, e30<BLiveVoiceSettle> e30Var2, e30<BLiveVoiceSettle> e30Var3) {
        this.f7346f.setText(bLiveVoiceSettle.userName);
        this.f7347g.setBackground(kvc0.b(TextUtils.equals(bLiveVoiceSettle.userGender, "male") ? i3c0.Ba : i3c0.za));
        this.f7345e.setMaskAvatarData(new CommonAnimMaskAvatarView.a().e(t100.D).c(bLiveVoiceSettle.userAvatar).b(bLiveVoiceSettle.userAvatarResourceType).a());
        m8887r0(bLiveVoiceSettle.isRoomOwner, bLiveVoiceSettle.isManager);
        xdl0.E0(this.f7344d, new View.OnClickListener() { // from class: l.xay
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(bLiveVoiceSettle);
            }
        });
        if (i == 1) {
            m8890u0(bLiveVoiceSettle, gayVar, e30Var, e30Var2);
        } else if (i == 2) {
            m8889t0(bLiveVoiceSettle, e30Var, e30Var2, e30Var3);
        }
        BLiveUserLevel bLiveUserLevelM15033v = ((ggv) ypv.m25491l(fld0.f13077c)).m15033v(bLiveVoiceSettle.userGrade);
        VDraweeView vDraweeView = this.f7349i;
        if (bLiveUserLevelM15033v != null) {
            xdl0.M(vDraweeView, true);
            sxj.c(bLiveUserLevelM15033v.backendUrl, this.f7349i, sxj.a);
        } else {
            xdl0.M(vDraweeView, false);
        }
        boolean zIsEmpty = TextUtils.isEmpty(bLiveVoiceSettle.starlightGradeImage);
        VDraweeView vDraweeView2 = this.f7350j;
        if (zIsEmpty) {
            xdl0.M(vDraweeView2, false);
        } else {
            xdl0.M(vDraweeView2, true);
            sxj.c(bLiveVoiceSettle.starlightGradeImage, this.f7350j, sxj.a);
        }
    }

    public MemberManagerSettleItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MemberManagerSettleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
