package com.p051p1.mobile.putong.live.livingroom.voice.applymanager.manager;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p051p1.mobile.putong.live.livingroom.voice.applymanager.manager.VoiceCallMemberManagerItemView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.a3o0;
import p153l.b0n0;
import p153l.biv;
import p153l.bnl0;
import p153l.cm0;
import p153l.guk0;
import p153l.i0k;
import p153l.j26;
import p153l.jde;
import p153l.kny;
import p153l.n9c0;
import p153l.nsv;
import p153l.obc0;
import p153l.qa00;
import p153l.qcj;
import p153l.xau;
import p153l.y20;
import p153l.y6s;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceCallMemberManagerItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceCallMemberManagerItemView f53697a;

    /* JADX INFO: renamed from: b */
    public CommonMaskAvatarView f53698b;

    /* JADX INFO: renamed from: c */
    public VText f53699c;

    /* JADX INFO: renamed from: d */
    public VImage f53700d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f53701e;

    /* JADX INFO: renamed from: f */
    public VText f53702f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f53703g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f53704h;

    /* JADX INFO: renamed from: i */
    public VImage f53705i;

    /* JADX INFO: renamed from: j */
    public VText f53706j;

    /* JADX INFO: renamed from: k */
    public TextView f53707k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f53708l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f53709m;

    /* JADX INFO: renamed from: n */
    public CommonMedalView f53710n;

    /* JADX INFO: renamed from: o */
    public CommonMedalView f53711o;

    /* JADX INFO: renamed from: p */
    public CommonMedalView f53712p;

    /* JADX INFO: renamed from: q */
    public CommonMedalView f53713q;

    /* JADX INFO: renamed from: r */
    public VText f53714r;

    /* JADX INFO: renamed from: s */
    public a3o0 f53715s;

    public VoiceCallMemberManagerItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m78874b(nsv nsvVar, BLiveVoiceCall bLiveVoiceCall, y20 y20Var, View view) {
        if (!"invited".equals(((BLiveMember) nsvVar.f143542a).inviteStatus) || guk0.m132329h(bLiveVoiceCall)) {
            y20Var.call(nsvVar);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m78876d(View view) {
        b0n0.m101329a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m78877e(BLiveVoiceCall bLiveVoiceCall) {
        if (!NullChecker.m82486a(bLiveVoiceCall)) {
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
    public final void m78878f(String str, int i) {
        bnl0.m105524M(this.f53704h, true);
        this.f53705i.setBackgroundResource(TextUtils.equals(str, "male") ? obc0.f146216V5 : obc0.f146194T5);
        this.f53704h.setBackground(jde.m144406b(TextUtils.equals(str, "male") ? -10587906 : -509799, qa00.m175859d(5.0f)));
        this.f53706j.setTypeface(Typeface.DEFAULT_BOLD);
        this.f53706j.setText(String.valueOf(i));
    }

    /* JADX INFO: renamed from: g */
    public final void m78879g(@NonNull User user, @Nullable cm0 cm0Var) {
        bnl0.m105524M(this.f53710n, true);
        bnl0.m105524M(this.f53711o, true);
        bnl0.m105524M(this.f53712p, true);
        if (this.f53715s == null) {
            a3o0 a3o0Var = new a3o0(false);
            this.f53715s = a3o0Var;
            a3o0Var.m95862v(cm0Var);
            this.f53715s.m95860t((Act) bnl0.m105508E(this));
        }
        this.f53715s.m95849i();
        this.f53715s.m95848h(getContext(), this.f53710n, this.f53711o, this.f53712p, this.f53713q);
        this.f53715s.m95859s(user);
    }

    /* JADX INFO: renamed from: h */
    public void m78880h(final y20<String> y20Var, final y20<nsv<BLiveMember>> y20Var2, final nsv<BLiveMember> nsvVar, cm0 cm0Var, String str) {
        final User userM164643h = nsvVar.m164643h();
        final BLiveVoiceCall bLiveVoiceCallM164644i = nsvVar.m164644i();
        if (userM164643h == null) {
            return;
        }
        boolean zM214494b = y6s.m214494b(str);
        if (zM214494b) {
            this.f53702f.setTextColor(Color.parseColor("#ccffffff"));
        }
        biv.m104517b(this.f53698b, qa00.f156291D, nsvVar, new qcj() { // from class: l.yzm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return userM164643h.m61308fp().profileSmall().formatted();
            }
        });
        this.f53702f.setText(userM164643h.name);
        m78878f(userM164643h.gender.toString(), userM164643h.age.intValue());
        bnl0.m105524M(this.f53706j, (userM164643h.isHideAgeFromSVip() || zM214494b) ? false : true);
        bnl0.m105524M(this.f53714r, false);
        m78883k(nsvVar, zM214494b);
        m78881i(nsvVar, bLiveVoiceCallM164644i, zM214494b);
        m78882j(nsvVar.f143542a.liveUserLevel);
        bnl0.m105524M(this.f53709m, false);
        m78879g(userM164643h, cm0Var);
        bnl0.m105524M(this.f53707k, false);
        if (BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(str) && NullChecker.m82486a(bLiveVoiceCallM164644i) && bLiveVoiceCallM164644i.position == BLiveVoice.VOICE_NINE_MIC_BOSS_POSITION) {
            this.f53702f.setTextColor(getResources().getColor(n9c0.f140788P0));
            bnl0.m105524M(this.f53699c, false);
            bnl0.m105524M(this.f53700d, true);
        } else {
            this.f53702f.setTextColor(getResources().getColor(n9c0.f140823e1));
            bnl0.m105524M(this.f53700d, false);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.zzm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(userM164643h.f56859id);
            }
        });
        bnl0.m105509E0(this.f53714r, new View.OnClickListener() { // from class: l.a0n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceCallMemberManagerItemView.m78874b(nsvVar, bLiveVoiceCallM164644i, y20Var2, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m78881i(nsv<BLiveMember> nsvVar, BLiveVoiceCall bLiveVoiceCall, boolean z) {
        String strM207631D0 = zrv.f205799a.m207631D0();
        if (bLiveVoiceCall != null) {
            String str = bLiveVoiceCall.user;
            String str2 = bLiveVoiceCall.anchor;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && str.equals(str2)) {
                bnl0.m105524M(this.f53714r, false);
                return;
            } else if (nsvVar.f143542a.isManager && !TextUtils.isEmpty(str2) && !str2.equals(strM207631D0)) {
                bnl0.m105524M(this.f53714r, false);
                return;
            }
        }
        if (!TextUtils.isEmpty(strM207631D0) && strM207631D0.equals(nsvVar.f143542a.reference)) {
            bnl0.m105524M(this.f53714r, false);
            return;
        }
        if (guk0.m132329h(bLiveVoiceCall)) {
            this.f53714r.setBackgroundResource(obc0.f146200U0);
            this.f53714r.setTextColor(Color.parseColor(z ? "#CCffffff" : "#ffffff"));
            this.f53714r.setText(xau.m209910t(R$string.f47643Ki));
        } else {
            boolean zEquals = "invited".equals(nsvVar.f143542a.inviteStatus);
            VText vText = this.f53714r;
            if (zEquals) {
                vText.setBackgroundResource(obc0.f146200U0);
                this.f53714r.setTextColor(j26.m143190c(getContext(), n9c0.f140838j1));
                this.f53714r.setText(xau.m209910t(R$string.f47554Gh));
            } else {
                vText.setBackgroundResource(obc0.f146566z0);
                this.f53714r.setTextColor(Color.parseColor(z ? "#CCffffff" : "#ffffff"));
                this.f53714r.setText(xau.m209910t(R$string.f47532Fh));
            }
        }
        bnl0.m105524M(this.f53714r, true);
    }

    /* JADX INFO: renamed from: j */
    public final void m78882j(BLiveUserLevel bLiveUserLevel) {
        if (bLiveUserLevel == null || TextUtils.isEmpty(bLiveUserLevel.backendUrl)) {
            bnl0.m105524M(this.f53708l, false);
        } else {
            bnl0.m105524M(this.f53708l, true);
            i0k.m137976c(bLiveUserLevel.backendUrl, this.f53708l, kny.m150553a(bLiveUserLevel.grade) ? i0k.f112379b : i0k.f112378a);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m78883k(nsv<BLiveMember> nsvVar, boolean z) {
        this.f53699c.setTextColor(Color.parseColor(z ? "#CCffffff" : "#ffffff"));
        if (m78877e(nsvVar.m164644i())) {
            this.f53699c.setBackgroundResource(obc0.f146482s0);
            VText vText = this.f53699c;
            if (z) {
                vText.setText(xau.m209910t(R$string.f48460wf));
            } else {
                vText.setText(xau.m209910t(R$string.f48416uf));
            }
            bnl0.m105524M(this.f53699c, true);
            return;
        }
        boolean z2 = nsvVar.f143542a.isManager;
        VText vText2 = this.f53699c;
        if (!z2) {
            bnl0.m105524M(vText2, false);
            return;
        }
        vText2.setBackgroundResource(obc0.f145977B);
        this.f53699c.setText(xau.m209910t(R$string.f48210l7));
        bnl0.m105524M(this.f53699c, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78876d(this);
    }

    public VoiceCallMemberManagerItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceCallMemberManagerItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
