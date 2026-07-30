package com.p051p1.mobile.putong.live.livingroom.voice.member.voiceleaderboard;

import android.annotation.SuppressLint;
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
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p051p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.p051p1.mobile.putong.live.livingroom.voice.member.voiceleaderboard.VoiceLiveMemberItem;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.biv;
import p153l.bnl0;
import p153l.civ;
import p153l.cm0;
import p153l.htd0;
import p153l.i0k;
import p153l.jde;
import p153l.kny;
import p153l.nsv;
import p153l.o3o0;
import p153l.obc0;
import p153l.okc0;
import p153l.qa00;
import p153l.qcj;
import p153l.und0;
import p153l.v1n0;
import p153l.x3t;
import p153l.xau;
import p153l.y20;
import p153l.yau;
import p153l.zrv;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceLiveMemberItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceLiveMemberItem f54522a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f54523b;

    /* JADX INFO: renamed from: c */
    public VText f54524c;

    /* JADX INFO: renamed from: d */
    public CommonMaskAvatarView f54525d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f54526e;

    /* JADX INFO: renamed from: f */
    public LiveGradientTextView f54527f;

    /* JADX INFO: renamed from: g */
    public VLinear f54528g;

    /* JADX INFO: renamed from: h */
    public VLinear f54529h;

    /* JADX INFO: renamed from: i */
    public VImage f54530i;

    /* JADX INFO: renamed from: j */
    public VText f54531j;

    /* JADX INFO: renamed from: k */
    public TextView f54532k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f54533l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f54534m;

    /* JADX INFO: renamed from: n */
    public CommonMedalView f54535n;

    /* JADX INFO: renamed from: o */
    public CommonMedalView f54536o;

    /* JADX INFO: renamed from: p */
    public CommonMedalView f54537p;

    /* JADX INFO: renamed from: q */
    public CommonMedalView f54538q;

    /* JADX INFO: renamed from: r */
    public VImage f54539r;

    /* JADX INFO: renamed from: s */
    public VText f54540s;

    /* JADX INFO: renamed from: t */
    public x3t f54541t;

    public VoiceLiveMemberItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m79793a(y20 y20Var, User user, boolean z, View view) {
        y20Var.call(user.f56859id);
        if (z) {
            v1n0.m199037o();
        } else {
            v1n0.m199038p();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m79795c(View view) {
        o3o0.m165880a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m79796d(int i) {
        okc0.m168005e(getContext(), this.f54523b, this.f54524c, i);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: e */
    public final void m79797e(double d) {
        bnl0.m105524M(this.f54540s, true);
        this.f54540s.setTextColor(Color.parseColor("#ff8817"));
        boolean zM209897B = xau.m209897B();
        VText vText = this.f54540s;
        if (!zM209897B) {
            vText.setText(yau.m214935c(d));
            bnl0.m105563k(this.f54540s, getResources().getDrawable(((civ) zrv.m221194l(htd0.f111524f)).m109970n() ? obc0.f146389k3 : obc0.f146421n));
            this.f54540s.setCompoundDrawablePadding(qa00.f156316c);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(yau.m214935c(d));
            sb.append(zrv.f205803e.getString(((civ) zrv.m221194l(htd0.f111524f)).m109970n() ? R$string.f47828Td : R$string.f47883W5));
            vText.setText(sb.toString());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m79798f(String str, int i, User user) {
        bnl0.m105524M(this.f54529h, true);
        this.f54530i.setBackgroundResource(TextUtils.equals(str, "male") ? obc0.f146216V5 : obc0.f146194T5);
        this.f54529h.setBackground(jde.m144406b(TextUtils.equals(str, "male") ? -10587906 : -509799, qa00.m175859d(5.0f)));
        this.f54531j.setTypeface(Typeface.DEFAULT_BOLD);
        this.f54531j.setText(String.valueOf(i));
        bnl0.m105524M(this.f54531j, !user.isHideAgeFromSVip());
    }

    /* JADX INFO: renamed from: g */
    public final void m79799g(@NonNull User user, @Nullable cm0 cm0Var) {
        bnl0.m105524M(this.f54535n, true);
        bnl0.m105524M(this.f54536o, true);
        bnl0.m105524M(this.f54537p, true);
        if (this.f54541t == null) {
            x3t x3tVar = new x3t(false);
            this.f54541t = x3tVar;
            x3tVar.m209277E(cm0Var);
            this.f54541t.m209275C((Act) bnl0.m105508E(this));
        }
        this.f54541t.m209279l();
        this.f54541t.m209278k(getContext(), this.f54535n, this.f54536o, this.f54537p, this.f54538q);
        this.f54541t.m209291y(user);
    }

    /* JADX INFO: renamed from: h */
    public final void m79800h(BLiveUserLevel bLiveUserLevel) {
        if (bLiveUserLevel == null || TextUtils.isEmpty(bLiveUserLevel.backendUrl)) {
            bnl0.m105524M(this.f54533l, false);
        } else {
            bnl0.m105524M(this.f54533l, true);
            i0k.m137976c(bLiveUserLevel.backendUrl, this.f54533l, kny.m150553a(bLiveUserLevel.grade) ? i0k.f112379b : i0k.f112378a);
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: i */
    public void m79801i(final y20<String> y20Var, nsv<BLiveLeaderBoards> nsvVar, cm0 cm0Var, final boolean z) {
        bnl0.m105524M(this.f54534m, false);
        bnl0.m105524M(this.f54523b, true);
        bnl0.m105524M(this.f54524c, true);
        bnl0.m105538V(this.f54525d, qa00.m175859d(43.0f));
        bnl0.m105538V(this.f54526e, qa00.m175859d(103.0f));
        m79796d(nsvVar.f143542a.rank);
        final User user = nsvVar.f143542a.user;
        if (user == null) {
            return;
        }
        biv.m104517b(this.f54525d, qa00.f156288A, nsvVar, new qcj() { // from class: l.m3o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return user.m61308fp().profileSmall().formatted();
            }
        });
        und0.m196834b(this.f54527f, user.name, Color.parseColor("#e6ffffff"), nsvVar.f143542a.userNameGradientColors);
        m79798f(user.gender.toString(), user.age.intValue(), user);
        m79799g(user, cm0Var);
        m79797e(nsvVar.f143542a.amount);
        setOnClickListener(new View.OnClickListener() { // from class: l.n3o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceLiveMemberItem.m79793a(y20Var, user, z, view);
            }
        });
        BLiveLeaderBoards bLiveLeaderBoards = nsvVar.f143542a;
        if (bLiveLeaderBoards.liveUserLevel == null || bLiveLeaderBoards.liveUserLevel.grade <= 0) {
            bnl0.m105524M(this.f54533l, false);
        } else {
            m79800h(bLiveLeaderBoards.liveUserLevel);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79795c(this);
    }

    public VoiceLiveMemberItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceLiveMemberItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
