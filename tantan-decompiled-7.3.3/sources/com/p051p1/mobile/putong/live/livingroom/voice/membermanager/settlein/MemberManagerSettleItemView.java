package com.p051p1.mobile.putong.live.livingroom.voice.membermanager.settlein;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSettle;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.voice.membermanager.settlein.MemberManagerSettleItemView;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.djy;
import p153l.dky;
import p153l.fc2;
import p153l.hiv;
import p153l.hny;
import p153l.htd0;
import p153l.i0k;
import p153l.i9o0;
import p153l.l6o0;
import p153l.n3d0;
import p153l.n9c0;
import p153l.nsv;
import p153l.obc0;
import p153l.qa00;
import p153l.x20;
import p153l.y20;
import p153l.zrv;

/* JADX INFO: loaded from: classes10.dex */
public class MemberManagerSettleItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MemberManagerSettleItemView f54586d;

    /* JADX INFO: renamed from: e */
    public CommonAnimMaskAvatarView f54587e;

    /* JADX INFO: renamed from: f */
    public VText f54588f;

    /* JADX INFO: renamed from: g */
    public View f54589g;

    /* JADX INFO: renamed from: h */
    public VText f54590h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f54591i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f54592j;

    /* JADX INFO: renamed from: k */
    public VText f54593k;

    /* JADX INFO: renamed from: l */
    public VText f54594l;

    /* JADX INFO: renamed from: m */
    public VText f54595m;

    public MemberManagerSettleItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m79848l0(BLiveVoiceSettle bLiveVoiceSettle, y20 y20Var, View view) {
        if (bLiveVoiceSettle.isSelected) {
            return;
        }
        y20Var.call(bLiveVoiceSettle);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79853q0(this);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m79853q0(View view) {
        dky.m116691a(this, view);
    }

    /* JADX INFO: renamed from: r0 */
    public void m79854r0(boolean z, boolean z2) {
        if (z) {
            bnl0.m105524M(this.f54590h, true);
            this.f54590h.setText("群主");
            this.f54590h.setBackground(fc2.m124979i(n3d0.m161277a(n9c0.f140855p0), 4));
            return;
        }
        VText vText = this.f54590h;
        if (!z2) {
            bnl0.m105524M(vText, false);
            return;
        }
        bnl0.m105524M(vText, true);
        this.f54590h.setText("管理");
        this.f54590h.setBackground(fc2.m124979i(n3d0.m161277a(n9c0.f140882z), 4));
    }

    /* JADX INFO: renamed from: s0 */
    public void m79855s0(nsv<User> nsvVar, final BLiveVoiceCall bLiveVoiceCall, final x20 x20Var, final x20 x20Var2, final y20<String> y20Var, String str) {
        bnl0.m105524M(this.f54594l, true);
        bnl0.m105524M(this.f54593k, true);
        bnl0.m105524M(this.f54595m, false);
        bnl0.m105524M(this.f54590h, false);
        this.f54587e.setMaskAvatarData(new CommonAnimMaskAvatarView.C12880a().m73299f(l6o0.m153068c(nsvVar).f130275b).m73294a());
        this.f54588f.setText(nsvVar.f143542a.name);
        bnl0.m105509E0(this.f54594l, new View.OnClickListener() { // from class: l.aky
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
        bnl0.m105509E0(this.f54593k, new View.OnClickListener() { // from class: l.bky
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var2.call();
            }
        });
        bnl0.m105509E0(this.f54586d, new View.OnClickListener() { // from class: l.cky
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(bLiveVoiceCall.user);
            }
        });
        this.f54589g.setBackground(n3d0.m161278b(TEnum.equals(nsvVar.f143542a.gender, "female") ? obc0.f146576za : obc0.f145988Ba));
        User user = nsvVar.f143542a;
        if (user == null || user.hierarchy == null || user.hierarchy.grade <= 0) {
            bnl0.m105524M(this.f54591i, false);
        } else {
            BLiveUserLevel bLiveUserLevelM135170v = ((hiv) zrv.m221194l(htd0.f111521c)).m135170v(nsvVar.f143542a.hierarchy.grade);
            VDraweeView vDraweeView = this.f54591i;
            if (bLiveUserLevelM135170v != null) {
                bnl0.m105524M(vDraweeView, true);
                i0k.m137976c(bLiveUserLevelM135170v.backendUrl, this.f54591i, i0k.f112378a);
            } else {
                bnl0.m105524M(vDraweeView, false);
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView2 = this.f54592j;
        if (zIsEmpty) {
            bnl0.m105524M(vDraweeView2, false);
        } else {
            bnl0.m105524M(vDraweeView2, true);
            i0k.m137976c(str, this.f54592j, i0k.f112378a);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m79856t0(final BLiveVoiceSettle bLiveVoiceSettle, final y20<BLiveVoiceSettle> y20Var, final y20<BLiveVoiceSettle> y20Var2, final y20<BLiveVoiceSettle> y20Var3) {
        bnl0.m105524M(this.f54594l, true);
        bnl0.m105524M(this.f54593k, true);
        bnl0.m105524M(this.f54595m, bLiveVoiceSettle.isSelected);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.xjy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(bLiveVoiceSettle);
            }
        });
        bnl0.m105509E0(this.f54594l, new View.OnClickListener() { // from class: l.yjy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var2.call(bLiveVoiceSettle);
            }
        });
        bnl0.m105509E0(this.f54593k, new View.OnClickListener() { // from class: l.zjy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var3.call(bLiveVoiceSettle);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final void m79857u0(final BLiveVoiceSettle bLiveVoiceSettle, djy djyVar, final y20<BLiveVoiceSettle> y20Var, final y20<BLiveVoiceSettle> y20Var2) {
        if (djyVar instanceof hny) {
            this.f54595m.setVisibility((!bLiveVoiceSettle.canRecall || !(i9o0.m139137h(djyVar) || i9o0.m139136g(djyVar)) || ((hny) djyVar).m136285d4()) ? 4 : 0);
        }
        bnl0.m105524M(this.f54594l, false);
        bnl0.m105524M(this.f54593k, false);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.vjy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(bLiveVoiceSettle);
            }
        });
        this.f54595m.setSelected(bLiveVoiceSettle.isSelected);
        this.f54595m.setText(bLiveVoiceSettle.isSelected ? "已召唤" : "召唤");
        bnl0.m105509E0(this.f54595m, new View.OnClickListener() { // from class: l.wjy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MemberManagerSettleItemView.m79848l0(bLiveVoiceSettle, y20Var2, view);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public void m79858v0(final BLiveVoiceSettle bLiveVoiceSettle, djy djyVar, int i, final y20<BLiveVoiceSettle> y20Var, y20<BLiveVoiceSettle> y20Var2, y20<BLiveVoiceSettle> y20Var3) {
        this.f54588f.setText(bLiveVoiceSettle.userName);
        this.f54589g.setBackground(n3d0.m161278b(TextUtils.equals(bLiveVoiceSettle.userGender, "male") ? obc0.f145988Ba : obc0.f146576za));
        this.f54587e.setMaskAvatarData(new CommonAnimMaskAvatarView.C12880a().m73298e(qa00.f156291D).m73296c(bLiveVoiceSettle.userAvatar).m73295b(bLiveVoiceSettle.userAvatarResourceType).m73294a());
        m79854r0(bLiveVoiceSettle.isRoomOwner, bLiveVoiceSettle.isManager);
        bnl0.m105509E0(this.f54586d, new View.OnClickListener() { // from class: l.ujy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(bLiveVoiceSettle);
            }
        });
        if (i == 1) {
            m79857u0(bLiveVoiceSettle, djyVar, y20Var, y20Var2);
        } else if (i == 2) {
            m79856t0(bLiveVoiceSettle, y20Var, y20Var2, y20Var3);
        }
        BLiveUserLevel bLiveUserLevelM135170v = ((hiv) zrv.m221194l(htd0.f111521c)).m135170v(bLiveVoiceSettle.userGrade);
        VDraweeView vDraweeView = this.f54591i;
        if (bLiveUserLevelM135170v != null) {
            bnl0.m105524M(vDraweeView, true);
            i0k.m137976c(bLiveUserLevelM135170v.backendUrl, this.f54591i, i0k.f112378a);
        } else {
            bnl0.m105524M(vDraweeView, false);
        }
        boolean zIsEmpty = TextUtils.isEmpty(bLiveVoiceSettle.starlightGradeImage);
        VDraweeView vDraweeView2 = this.f54592j;
        if (zIsEmpty) {
            bnl0.m105524M(vDraweeView2, false);
        } else {
            bnl0.m105524M(vDraweeView2, true);
            i0k.m137976c(bLiveVoiceSettle.starlightGradeImage, this.f54592j, i0k.f112378a);
        }
    }

    public MemberManagerSettleItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MemberManagerSettleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
