package com.p051p1.mobile.putong.live.livingroom.voice.membermanager.online;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.data.LiveUserLevel;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.p051p1.mobile.putong.live.livingroom.voice.membermanager.online.MemberOnLineItemView;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.guk0;
import p153l.hiv;
import p153l.htd0;
import p153l.i0k;
import p153l.i9o0;
import p153l.j26;
import p153l.jky;
import p153l.l6o0;
import p153l.n3d0;
import p153l.n9c0;
import p153l.nsv;
import p153l.obc0;
import p153l.qa00;
import p153l.und0;
import p153l.xau;
import p153l.y20;
import p153l.y6s;
import p153l.zrv;

/* JADX INFO: loaded from: classes10.dex */
public class MemberOnLineItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MemberOnLineItemView f54547d;

    /* JADX INFO: renamed from: e */
    public CommonAnimMaskAvatarView f54548e;

    /* JADX INFO: renamed from: f */
    public LiveGradientTextView f54549f;

    /* JADX INFO: renamed from: g */
    public View f54550g;

    /* JADX INFO: renamed from: h */
    public VText f54551h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f54552i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f54553j;

    /* JADX INFO: renamed from: k */
    public VText f54554k;

    public MemberOnLineItemView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m79806h0(nsv nsvVar, BLiveVoiceCall bLiveVoiceCall, y20 y20Var, View view) {
        if (!"invited".equals(((BLiveMember) nsvVar.f143542a).inviteStatus) || guk0.m132329h(bLiveVoiceCall)) {
            y20Var.call(nsvVar);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m79808j0(View view) {
        jky.m145935a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m79809k0(String str) {
        String strM139142n = i9o0.m139142n(str);
        boolean zIsEmpty = TextUtils.isEmpty(strM139142n);
        VText vText = this.f54551h;
        if (zIsEmpty) {
            bnl0.m105524M(vText, false);
            return;
        }
        bnl0.m105524M(vText, true);
        this.f54551h.setText(strM139142n);
        this.f54551h.setBackgroundResource(i9o0.m139141m(str));
    }

    /* JADX INFO: renamed from: l0 */
    public void m79810l0(Boolean bool, String str, final y20<String> y20Var, final y20<nsv<BLiveMember>> y20Var2, final nsv<BLiveMember> nsvVar, String str2) {
        final User userM164643h = nsvVar.m164643h();
        final BLiveVoiceCall bLiveVoiceCallM164644i = nsvVar.m164644i();
        if (userM164643h == null) {
            return;
        }
        und0.m196834b(this.f54549f, userM164643h.name, Color.parseColor("#ccffffff"), nsvVar.f143542a.userNameGradientColors);
        this.f54550g.setBackground(n3d0.m161278b(TextUtils.equals(userM164643h.gender.toString(), "male") ? obc0.f146046G8 : obc0.f146022E8));
        this.f54548e.setMaskAvatarData(new CommonAnimMaskAvatarView.C12880a().m73298e(qa00.f156338y).m73299f(l6o0.m153068c(nsvVar).f130275b).m73294a());
        BLiveMember bLiveMember = nsvVar.f143542a;
        if (bLiveMember == null) {
            return;
        }
        m79809k0(bLiveMember.identity);
        m79811m0(bool, str, nsvVar, bLiveVoiceCallM164644i);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.hky
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(userM164643h.f56859id);
            }
        });
        bnl0.m105509E0(this.f54554k, new View.OnClickListener() { // from class: l.iky
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MemberOnLineItemView.m79806h0(nsvVar, bLiveVoiceCallM164644i, y20Var2, view);
            }
        });
        LiveUserLevel liveUserLevel = userM164643h.hierarchy;
        if (liveUserLevel == null || liveUserLevel.grade <= 0) {
            bnl0.m105524M(this.f54552i, false);
        } else {
            BLiveUserLevel bLiveUserLevelM135170v = ((hiv) zrv.m221194l(htd0.f111521c)).m135170v(userM164643h.hierarchy.grade);
            VDraweeView vDraweeView = this.f54552i;
            if (bLiveUserLevelM135170v != null) {
                bnl0.m105524M(vDraweeView, true);
                i0k.m137976c(bLiveUserLevelM135170v.backendUrl, this.f54552i, i0k.f112378a);
            } else {
                bnl0.m105524M(vDraweeView, false);
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        VDraweeView vDraweeView2 = this.f54553j;
        if (zIsEmpty) {
            bnl0.m105524M(vDraweeView2, false);
        } else {
            bnl0.m105524M(vDraweeView2, true);
            i0k.m137976c(str2, this.f54553j, i0k.f112378a);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m79811m0(Boolean bool, String str, nsv<BLiveMember> nsvVar, BLiveVoiceCall bLiveVoiceCall) {
        String strM207631D0 = zrv.f205799a.m207631D0();
        if (bLiveVoiceCall != null) {
            String str2 = bLiveVoiceCall.user;
            String str3 = bLiveVoiceCall.anchor;
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && str2.equals(str3)) {
                bnl0.m105524M(this.f54554k, false);
                return;
            } else if (nsvVar.f143542a.isManager && !TextUtils.isEmpty(str3) && !str3.equals(strM207631D0)) {
                bnl0.m105524M(this.f54554k, false);
                return;
            }
        }
        if (!TextUtils.isEmpty(strM207631D0) && strM207631D0.equals(nsvVar.f143542a.reference)) {
            bnl0.m105524M(this.f54554k, false);
            return;
        }
        if (guk0.m132329h(bLiveVoiceCall)) {
            this.f54554k.setBackgroundResource(obc0.f146200U0);
            this.f54554k.setTextColor(Color.parseColor("#CCffffff"));
            this.f54554k.setText(xau.m209910t(R$string.f47643Ki));
        } else {
            boolean zEquals = "invited".equals(nsvVar.f143542a.inviteStatus);
            VText vText = this.f54554k;
            if (zEquals) {
                vText.setBackgroundResource(obc0.f146200U0);
                this.f54554k.setTextColor(j26.m143190c(getContext(), n9c0.f140838j1));
                this.f54554k.setText(xau.m209910t(R$string.f47554Gh));
            } else {
                vText.setBackgroundResource(obc0.f146434o0);
                this.f54554k.setTextColor(n3d0.m161277a(n9c0.f140823e1));
                this.f54554k.setText(y6s.m214495c(str) ? "邀为嘉宾" : "邀请上麦");
            }
        }
        bnl0.m105524M(this.f54554k, bool.booleanValue());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79808j0(this);
    }

    public MemberOnLineItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MemberOnLineItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
