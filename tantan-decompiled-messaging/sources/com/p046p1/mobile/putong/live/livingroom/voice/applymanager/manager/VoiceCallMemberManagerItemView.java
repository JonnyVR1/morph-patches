package com.p046p1.mobile.putong.live.livingroom.voice.applymanager.manager;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p046p1.mobile.putong.live.livingroom.voice.applymanager.manager.VoiceCallMemberManagerItemView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.agv;
import p149l.alk0;
import p149l.e16;
import p149l.e30;
import p149l.fce;
import p149l.gm0;
import p149l.h1c0;
import p149l.i3c0;
import p149l.mqv;
import p149l.ney;
import p149l.sxj;
import p149l.t100;
import p149l.w8u;
import p149l.w9j;
import p149l.wtn0;
import p149l.x4s;
import p149l.xdl0;
import p149l.xqm0;
import p149l.ypv;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceCallMemberManagerItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceCallMemberManagerItemView f52849a;

    /* JADX INFO: renamed from: b */
    public CommonMaskAvatarView f52850b;

    /* JADX INFO: renamed from: c */
    public VText f52851c;

    /* JADX INFO: renamed from: d */
    public VImage f52852d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f52853e;

    /* JADX INFO: renamed from: f */
    public VText f52854f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f52855g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f52856h;

    /* JADX INFO: renamed from: i */
    public VImage f52857i;

    /* JADX INFO: renamed from: j */
    public VText f52858j;

    /* JADX INFO: renamed from: k */
    public TextView f52859k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f52860l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f52861m;

    /* JADX INFO: renamed from: n */
    public CommonMedalView f52862n;

    /* JADX INFO: renamed from: o */
    public CommonMedalView f52863o;

    /* JADX INFO: renamed from: p */
    public CommonMedalView f52864p;

    /* JADX INFO: renamed from: q */
    public CommonMedalView f52865q;

    /* JADX INFO: renamed from: r */
    public VText f52866r;

    /* JADX INFO: renamed from: s */
    public wtn0 f52867s;

    public VoiceCallMemberManagerItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m77691b(mqv mqvVar, BLiveVoiceCall bLiveVoiceCall, e30 e30Var, View view) {
        if (!"invited".equals(((BLiveMember) mqvVar.f135304a).inviteStatus) || alk0.m97309h(bLiveVoiceCall)) {
            e30Var.call(mqvVar);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m77693d(View view) {
        xqm0.m210584a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m77694e(BLiveVoiceCall bLiveVoiceCall) {
        if (!NullChecker.m81303a(bLiveVoiceCall)) {
            return false;
        }
        String str = bLiveVoiceCall.user;
        String str2 = bLiveVoiceCall.anchor;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return false;
        }
        return str2.equals(str);
    }

    /* JADX INFO: renamed from: f */
    public final void m77695f(String str, int i) {
        xdl0.m208344M(this.f52856h, true);
        this.f52857i.setBackgroundResource(TextUtils.equals(str, "male") ? i3c0.f110888V5 : i3c0.f110866T5);
        this.f52856h.setBackground(fce.m120425b(TextUtils.equals(str, "male") ? -10587906 : -509799, t100.m186890d(5.0f)));
        this.f52858j.setTypeface(Typeface.DEFAULT_BOLD);
        this.f52858j.setText(String.valueOf(i));
    }

    /* JADX INFO: renamed from: g */
    public final void m77696g(@NonNull User user, @Nullable gm0 gm0Var) {
        xdl0.m208344M(this.f52862n, true);
        xdl0.m208344M(this.f52863o, true);
        xdl0.m208344M(this.f52864p, true);
        if (this.f52867s == null) {
            wtn0 wtn0Var = new wtn0(false);
            this.f52867s = wtn0Var;
            wtn0Var.m205575v(gm0Var);
            this.f52867s.m205573t((Act) xdl0.m208328E(this));
        }
        this.f52867s.m205562i();
        this.f52867s.m205561h(getContext(), this.f52862n, this.f52863o, this.f52864p, this.f52865q);
        this.f52867s.m205572s(user);
    }

    /* JADX INFO: renamed from: h */
    public void m77697h(final e30<String> e30Var, final e30<mqv<BLiveMember>> e30Var2, final mqv<BLiveMember> mqvVar, gm0 gm0Var, String str) {
        final User userM156005h = mqvVar.m156005h();
        final BLiveVoiceCall bLiveVoiceCallM156006i = mqvVar.m156006i();
        if (userM156005h == null) {
            return;
        }
        boolean zM207012b = x4s.m207012b(str);
        if (zM207012b) {
            this.f52854f.setTextColor(Color.parseColor("#ccffffff"));
        }
        agv.m96344b(this.f52850b, t100.f167229D, mqvVar, new w9j() { // from class: l.uqm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return userM156005h.m60124fp().profileSmall().formatted();
            }
        });
        this.f52854f.setText(userM156005h.name);
        m77695f(userM156005h.gender.toString(), userM156005h.age.intValue());
        xdl0.m208344M(this.f52858j, (userM156005h.isHideAgeFromSVip() || zM207012b) ? false : true);
        xdl0.m208344M(this.f52866r, false);
        m77700k(mqvVar, zM207012b);
        m77698i(mqvVar, bLiveVoiceCallM156006i, zM207012b);
        m77699j(mqvVar.f135304a.liveUserLevel);
        xdl0.m208344M(this.f52861m, false);
        m77696g(userM156005h, gm0Var);
        xdl0.m208344M(this.f52859k, false);
        if (BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(str) && NullChecker.m81303a(bLiveVoiceCallM156006i) && bLiveVoiceCallM156006i.position == BLiveVoice.VOICE_NINE_MIC_BOSS_POSITION) {
            this.f52854f.setTextColor(getResources().getColor(h1c0.f105327P0));
            xdl0.m208344M(this.f52851c, false);
            xdl0.m208344M(this.f52852d, true);
        } else {
            this.f52854f.setTextColor(getResources().getColor(h1c0.f105362e1));
            xdl0.m208344M(this.f52852d, false);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.vqm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(userM156005h.f56011id);
            }
        });
        xdl0.m208329E0(this.f52866r, new View.OnClickListener() { // from class: l.wqm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceCallMemberManagerItemView.m77691b(mqvVar, bLiveVoiceCallM156006i, e30Var2, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m77698i(mqv<BLiveMember> mqvVar, BLiveVoiceCall bLiveVoiceCall, boolean z) {
        String strM199309D0 = ypv.f199493a.m199309D0();
        if (bLiveVoiceCall != null) {
            String str = bLiveVoiceCall.user;
            String str2 = bLiveVoiceCall.anchor;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && str.equals(str2)) {
                xdl0.m208344M(this.f52866r, false);
                return;
            } else if (mqvVar.f135304a.isManager && !TextUtils.isEmpty(str2) && !str2.equals(strM199309D0)) {
                xdl0.m208344M(this.f52866r, false);
                return;
            }
        }
        if (!TextUtils.isEmpty(strM199309D0) && strM199309D0.equals(mqvVar.f135304a.reference)) {
            xdl0.m208344M(this.f52866r, false);
            return;
        }
        if (alk0.m97309h(bLiveVoiceCall)) {
            this.f52866r.setBackgroundResource(i3c0.f110872U0);
            this.f52866r.setTextColor(Color.parseColor(z ? "#CCffffff" : "#ffffff"));
            this.f52866r.setText(w8u.m202217t(R$string.f46795Ki));
        } else {
            boolean zEquals = "invited".equals(mqvVar.f135304a.inviteStatus);
            VText vText = this.f52866r;
            if (zEquals) {
                vText.setBackgroundResource(i3c0.f110872U0);
                this.f52866r.setTextColor(e16.m114375c(getContext(), h1c0.f105377j1));
                this.f52866r.setText(w8u.m202217t(R$string.f46706Gh));
            } else {
                vText.setBackgroundResource(i3c0.f111238z0);
                this.f52866r.setTextColor(Color.parseColor(z ? "#CCffffff" : "#ffffff"));
                this.f52866r.setText(w8u.m202217t(R$string.f46684Fh));
            }
        }
        xdl0.m208344M(this.f52866r, true);
    }

    /* JADX INFO: renamed from: j */
    public final void m77699j(BLiveUserLevel bLiveUserLevel) {
        if (bLiveUserLevel == null || TextUtils.isEmpty(bLiveUserLevel.backendUrl)) {
            xdl0.m208344M(this.f52860l, false);
        } else {
            xdl0.m208344M(this.f52860l, true);
            sxj.m186442c(bLiveUserLevel.backendUrl, this.f52860l, ney.m159134a(bLiveUserLevel.grade) ? sxj.f166798b : sxj.f166797a);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m77700k(mqv<BLiveMember> mqvVar, boolean z) {
        this.f52851c.setTextColor(Color.parseColor(z ? "#CCffffff" : "#ffffff"));
        if (m77694e(mqvVar.m156006i())) {
            this.f52851c.setBackgroundResource(i3c0.f111154s0);
            VText vText = this.f52851c;
            if (z) {
                vText.setText(w8u.m202217t(R$string.f47612wf));
            } else {
                vText.setText(w8u.m202217t(R$string.f47568uf));
            }
            xdl0.m208344M(this.f52851c, true);
            return;
        }
        boolean z2 = mqvVar.f135304a.isManager;
        VText vText2 = this.f52851c;
        if (!z2) {
            xdl0.m208344M(vText2, false);
            return;
        }
        vText2.setBackgroundResource(i3c0.f110649B);
        this.f52851c.setText(w8u.m202217t(R$string.f47362l7));
        xdl0.m208344M(this.f52851c, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77693d(this);
    }

    public VoiceCallMemberManagerItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceCallMemberManagerItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
