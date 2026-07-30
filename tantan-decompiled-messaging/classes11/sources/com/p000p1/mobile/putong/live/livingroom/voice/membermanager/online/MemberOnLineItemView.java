package com.p000p1.mobile.putong.live.livingroom.voice.membermanager.online;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.voice.membermanager.online.MemberOnLineItemView;
import com.p1.mobile.putong.data.LiveUserLevel;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveMember;
import com.p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.tantanapp.common.data.DbObject;
import l.alk0;
import l.e16;
import l.e30;
import l.h1c0;
import l.hxn0;
import l.i3c0;
import l.kvc0;
import l.mby;
import l.mqv;
import l.rfd0;
import l.sxj;
import l.t100;
import l.w8u;
import l.x4s;
import l.xdl0;
import p009l.e0o0;
import p009l.fld0;
import p009l.ggv;
import p009l.ypv;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MemberOnLineItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MemberOnLineItemView f7305d;

    /* JADX INFO: renamed from: e */
    public CommonAnimMaskAvatarView f7306e;

    /* JADX INFO: renamed from: f */
    public LiveGradientTextView f7307f;

    /* JADX INFO: renamed from: g */
    public View f7308g;

    /* JADX INFO: renamed from: h */
    public VText f7309h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f7310i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f7311j;

    /* JADX INFO: renamed from: k */
    public VText f7312k;

    public MemberOnLineItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m8839h0(mqv mqvVar, BLiveVoiceCall bLiveVoiceCall, e30 e30Var, View view) {
        if (!"invited".equals(((BLiveMember) mqvVar.a).inviteStatus) || alk0.h(bLiveVoiceCall)) {
            e30Var.call(mqvVar);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m8841j0(View view) {
        mby.a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m8842k0(String str) {
        String strM13624n = e0o0.m13624n(str);
        boolean zIsEmpty = TextUtils.isEmpty(strM13624n);
        VText vText = this.f7309h;
        if (zIsEmpty) {
            xdl0.M(vText, false);
            return;
        }
        xdl0.M(vText, true);
        this.f7309h.setText(strM13624n);
        this.f7309h.setBackgroundResource(e0o0.m13623m(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public void m8843l0(Boolean bool, String str, final e30<String> e30Var, final e30<mqv<BLiveMember>> e30Var2, final mqv<BLiveMember> mqvVar, String str2) {
        final User userH = mqvVar.h();
        final BLiveVoiceCall bLiveVoiceCallI = mqvVar.i();
        if (userH == null) {
            return;
        }
        rfd0.b(this.f7307f, userH.name, Color.parseColor("#ccffffff"), ((BLiveMember) mqvVar.a).userNameGradientColors);
        this.f7308g.setBackground(kvc0.b(TextUtils.equals(userH.gender.toString(), "male") ? i3c0.G8 : i3c0.E8));
        this.f7306e.setMaskAvatarData(new CommonAnimMaskAvatarView.a().e(t100.y).f(hxn0.c(mqvVar).b).a());
        Object obj = mqvVar.a;
        if (obj == null) {
            return;
        }
        m8842k0(((BLiveMember) obj).identity);
        m8844m0(bool, str, mqvVar, bLiveVoiceCallI);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.kby
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(((DbObject) userH).id);
            }
        });
        xdl0.E0(this.f7312k, new View.OnClickListener() { // from class: l.lby
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MemberOnLineItemView.m8839h0(mqvVar, bLiveVoiceCallI, e30Var2, view);
            }
        });
        LiveUserLevel liveUserLevel = userH.hierarchy;
        if (liveUserLevel == null || liveUserLevel.grade <= 0) {
            xdl0.M(this.f7310i, false);
        } else {
            BLiveUserLevel bLiveUserLevelM15033v = ((ggv) ypv.m25491l(fld0.f13077c)).m15033v(userH.hierarchy.grade);
            VDraweeView vDraweeView = this.f7310i;
            if (bLiveUserLevelM15033v != null) {
                xdl0.M(vDraweeView, true);
                sxj.c(bLiveUserLevelM15033v.backendUrl, this.f7310i, sxj.a);
            } else {
                xdl0.M(vDraweeView, false);
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        VDraweeView vDraweeView2 = this.f7311j;
        if (zIsEmpty) {
            xdl0.M(vDraweeView2, false);
        } else {
            xdl0.M(vDraweeView2, true);
            sxj.c(str2, this.f7311j, sxj.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public final void m8844m0(Boolean bool, String str, mqv<BLiveMember> mqvVar, BLiveVoiceCall bLiveVoiceCall) {
        String strM23619D0 = ypv.f23196a.m23619D0();
        if (bLiveVoiceCall != null) {
            String str2 = bLiveVoiceCall.user;
            String str3 = bLiveVoiceCall.anchor;
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && str2.equals(str3)) {
                xdl0.M(this.f7312k, false);
                return;
            } else if (((BLiveMember) mqvVar.a).isManager && !TextUtils.isEmpty(str3) && !str3.equals(strM23619D0)) {
                xdl0.M(this.f7312k, false);
                return;
            }
        }
        if (!TextUtils.isEmpty(strM23619D0) && strM23619D0.equals(((BLiveMember) mqvVar.a).reference)) {
            xdl0.M(this.f7312k, false);
            return;
        }
        if (alk0.h(bLiveVoiceCall)) {
            this.f7312k.setBackgroundResource(i3c0.U0);
            this.f7312k.setTextColor(Color.parseColor("#CCffffff"));
            this.f7312k.setText(w8u.t(R.string.Ki));
        } else {
            boolean zEquals = "invited".equals(((BLiveMember) mqvVar.a).inviteStatus);
            VText vText = this.f7312k;
            if (zEquals) {
                vText.setBackgroundResource(i3c0.U0);
                this.f7312k.setTextColor(e16.c(getContext(), h1c0.j1));
                this.f7312k.setText(w8u.t(R.string.Gh));
            } else {
                vText.setBackgroundResource(i3c0.o0);
                this.f7312k.setTextColor(kvc0.a(h1c0.e1));
                this.f7312k.setText(x4s.c(str) ? "邀为嘉宾" : "邀请上麦");
            }
        }
        xdl0.M(this.f7312k, bool.booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8841j0(this);
    }

    public MemberOnLineItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MemberOnLineItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
