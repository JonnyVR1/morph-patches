package com.p046p1.mobile.putong.live.livingroom.voice.membermanager.online;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.data.LiveUserLevel;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.p046p1.mobile.putong.live.livingroom.voice.membermanager.online.MemberOnLineItemView;
import p147v.VDraweeView;
import p147v.VText;
import p149l.alk0;
import p149l.e0o0;
import p149l.e16;
import p149l.e30;
import p149l.fld0;
import p149l.ggv;
import p149l.h1c0;
import p149l.hxn0;
import p149l.i3c0;
import p149l.kvc0;
import p149l.mby;
import p149l.mqv;
import p149l.rfd0;
import p149l.sxj;
import p149l.t100;
import p149l.w8u;
import p149l.x4s;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes11.dex */
public class MemberOnLineItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MemberOnLineItemView f53699d;

    /* JADX INFO: renamed from: e */
    public CommonAnimMaskAvatarView f53700e;

    /* JADX INFO: renamed from: f */
    public LiveGradientTextView f53701f;

    /* JADX INFO: renamed from: g */
    public View f53702g;

    /* JADX INFO: renamed from: h */
    public VText f53703h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f53704i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f53705j;

    /* JADX INFO: renamed from: k */
    public VText f53706k;

    public MemberOnLineItemView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m78623h0(mqv mqvVar, BLiveVoiceCall bLiveVoiceCall, e30 e30Var, View view) {
        if (!"invited".equals(((BLiveMember) mqvVar.f135304a).inviteStatus) || alk0.m97309h(bLiveVoiceCall)) {
            e30Var.call(mqvVar);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m78625j0(View view) {
        mby.m153977a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m78626k0(String str) {
        String strM114327n = e0o0.m114327n(str);
        boolean zIsEmpty = TextUtils.isEmpty(strM114327n);
        VText vText = this.f53703h;
        if (zIsEmpty) {
            xdl0.m208344M(vText, false);
            return;
        }
        xdl0.m208344M(vText, true);
        this.f53703h.setText(strM114327n);
        this.f53703h.setBackgroundResource(e0o0.m114326m(str));
    }

    /* JADX INFO: renamed from: l0 */
    public void m78627l0(Boolean bool, String str, final e30<String> e30Var, final e30<mqv<BLiveMember>> e30Var2, final mqv<BLiveMember> mqvVar, String str2) {
        final User userM156005h = mqvVar.m156005h();
        final BLiveVoiceCall bLiveVoiceCallM156006i = mqvVar.m156006i();
        if (userM156005h == null) {
            return;
        }
        rfd0.m179126b(this.f53701f, userM156005h.name, Color.parseColor("#ccffffff"), mqvVar.f135304a.userNameGradientColors);
        this.f53702g.setBackground(kvc0.m147353b(TextUtils.equals(userM156005h.gender.toString(), "male") ? i3c0.f110718G8 : i3c0.f110694E8));
        this.f53700e.setMaskAvatarData(new CommonAnimMaskAvatarView.C12717a().m72115e(t100.f167276y).m72116f(hxn0.m133350c(mqvVar).f109896b).m72111a());
        BLiveMember bLiveMember = mqvVar.f135304a;
        if (bLiveMember == null) {
            return;
        }
        m78626k0(bLiveMember.identity);
        m78628m0(bool, str, mqvVar, bLiveVoiceCallM156006i);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.kby
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(userM156005h.f56011id);
            }
        });
        xdl0.m208329E0(this.f53706k, new View.OnClickListener() { // from class: l.lby
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MemberOnLineItemView.m78623h0(mqvVar, bLiveVoiceCallM156006i, e30Var2, view);
            }
        });
        LiveUserLevel liveUserLevel = userM156005h.hierarchy;
        if (liveUserLevel == null || liveUserLevel.grade <= 0) {
            xdl0.m208344M(this.f53704i, false);
        } else {
            BLiveUserLevel bLiveUserLevelM126036v = ((ggv) ypv.m215673l(fld0.f98148c)).m126036v(userM156005h.hierarchy.grade);
            VDraweeView vDraweeView = this.f53704i;
            if (bLiveUserLevelM126036v != null) {
                xdl0.m208344M(vDraweeView, true);
                sxj.m186442c(bLiveUserLevelM126036v.backendUrl, this.f53704i, sxj.f166797a);
            } else {
                xdl0.m208344M(vDraweeView, false);
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        VDraweeView vDraweeView2 = this.f53705j;
        if (zIsEmpty) {
            xdl0.m208344M(vDraweeView2, false);
        } else {
            xdl0.m208344M(vDraweeView2, true);
            sxj.m186442c(str2, this.f53705j, sxj.f166797a);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m78628m0(Boolean bool, String str, mqv<BLiveMember> mqvVar, BLiveVoiceCall bLiveVoiceCall) {
        String strM199309D0 = ypv.f199493a.m199309D0();
        if (bLiveVoiceCall != null) {
            String str2 = bLiveVoiceCall.user;
            String str3 = bLiveVoiceCall.anchor;
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && str2.equals(str3)) {
                xdl0.m208344M(this.f53706k, false);
                return;
            } else if (mqvVar.f135304a.isManager && !TextUtils.isEmpty(str3) && !str3.equals(strM199309D0)) {
                xdl0.m208344M(this.f53706k, false);
                return;
            }
        }
        if (!TextUtils.isEmpty(strM199309D0) && strM199309D0.equals(mqvVar.f135304a.reference)) {
            xdl0.m208344M(this.f53706k, false);
            return;
        }
        if (alk0.m97309h(bLiveVoiceCall)) {
            this.f53706k.setBackgroundResource(i3c0.f110872U0);
            this.f53706k.setTextColor(Color.parseColor("#CCffffff"));
            this.f53706k.setText(w8u.m202217t(R$string.f46795Ki));
        } else {
            boolean zEquals = "invited".equals(mqvVar.f135304a.inviteStatus);
            VText vText = this.f53706k;
            if (zEquals) {
                vText.setBackgroundResource(i3c0.f110872U0);
                this.f53706k.setTextColor(e16.m114375c(getContext(), h1c0.f105377j1));
                this.f53706k.setText(w8u.m202217t(R$string.f46706Gh));
            } else {
                vText.setBackgroundResource(i3c0.f111106o0);
                this.f53706k.setTextColor(kvc0.m147352a(h1c0.f105362e1));
                this.f53706k.setText(x4s.m207013c(str) ? "邀为嘉宾" : "邀请上麦");
            }
        }
        xdl0.m208344M(this.f53706k, bool.booleanValue());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78625j0(this);
    }

    public MemberOnLineItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MemberOnLineItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
