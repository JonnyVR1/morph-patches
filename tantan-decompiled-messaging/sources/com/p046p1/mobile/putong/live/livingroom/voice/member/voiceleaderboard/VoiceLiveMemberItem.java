package com.p046p1.mobile.putong.live.livingroom.voice.member.voiceleaderboard;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p046p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.p046p1.mobile.putong.live.livingroom.voice.member.voiceleaderboard.VoiceLiveMemberItem;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.agv;
import p149l.bgv;
import p149l.e30;
import p149l.fce;
import p149l.fld0;
import p149l.gm0;
import p149l.hcc0;
import p149l.i3c0;
import p149l.kun0;
import p149l.mqv;
import p149l.ney;
import p149l.rfd0;
import p149l.rsm0;
import p149l.sxj;
import p149l.t100;
import p149l.w1t;
import p149l.w8u;
import p149l.w9j;
import p149l.x8u;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceLiveMemberItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceLiveMemberItem f53674a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f53675b;

    /* JADX INFO: renamed from: c */
    public VText f53676c;

    /* JADX INFO: renamed from: d */
    public CommonMaskAvatarView f53677d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f53678e;

    /* JADX INFO: renamed from: f */
    public LiveGradientTextView f53679f;

    /* JADX INFO: renamed from: g */
    public VLinear f53680g;

    /* JADX INFO: renamed from: h */
    public VLinear f53681h;

    /* JADX INFO: renamed from: i */
    public VImage f53682i;

    /* JADX INFO: renamed from: j */
    public VText f53683j;

    /* JADX INFO: renamed from: k */
    public TextView f53684k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f53685l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f53686m;

    /* JADX INFO: renamed from: n */
    public CommonMedalView f53687n;

    /* JADX INFO: renamed from: o */
    public CommonMedalView f53688o;

    /* JADX INFO: renamed from: p */
    public CommonMedalView f53689p;

    /* JADX INFO: renamed from: q */
    public CommonMedalView f53690q;

    /* JADX INFO: renamed from: r */
    public VImage f53691r;

    /* JADX INFO: renamed from: s */
    public VText f53692s;

    /* JADX INFO: renamed from: t */
    public w1t f53693t;

    public VoiceLiveMemberItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m78610a(e30 e30Var, User user, boolean z, View view) {
        e30Var.call(user.f56011id);
        if (z) {
            rsm0.m180707o();
        } else {
            rsm0.m180708p();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m78612c(View view) {
        kun0.m147288a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m78613d(int i) {
        hcc0.m130420e(getContext(), this.f53675b, this.f53676c, i);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: e */
    public final void m78614e(double d) {
        xdl0.m208344M(this.f53692s, true);
        this.f53692s.setTextColor(Color.parseColor("#ff8817"));
        boolean zM202204B = w8u.m202204B();
        VText vText = this.f53692s;
        if (!zM202204B) {
            vText.setText(x8u.m207433c(d));
            xdl0.m208383k(this.f53692s, getResources().getDrawable(((bgv) ypv.m215673l(fld0.f98151f)).m101734n() ? i3c0.f111061k3 : i3c0.f111093n));
            this.f53692s.setCompoundDrawablePadding(t100.f167254c);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(x8u.m207433c(d));
            sb.append(ypv.f199497e.getString(((bgv) ypv.m215673l(fld0.f98151f)).m101734n() ? R$string.f46980Td : R$string.f47035W5));
            vText.setText(sb.toString());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m78615f(String str, int i, User user) {
        xdl0.m208344M(this.f53681h, true);
        this.f53682i.setBackgroundResource(TextUtils.equals(str, "male") ? i3c0.f110888V5 : i3c0.f110866T5);
        this.f53681h.setBackground(fce.m120425b(TextUtils.equals(str, "male") ? -10587906 : -509799, t100.m186890d(5.0f)));
        this.f53683j.setTypeface(Typeface.DEFAULT_BOLD);
        this.f53683j.setText(String.valueOf(i));
        xdl0.m208344M(this.f53683j, !user.isHideAgeFromSVip());
    }

    /* JADX INFO: renamed from: g */
    public final void m78616g(@NonNull User user, @Nullable gm0 gm0Var) {
        xdl0.m208344M(this.f53687n, true);
        xdl0.m208344M(this.f53688o, true);
        xdl0.m208344M(this.f53689p, true);
        if (this.f53693t == null) {
            w1t w1tVar = new w1t(false);
            this.f53693t = w1tVar;
            w1tVar.m200965E(gm0Var);
            this.f53693t.m200963C((Act) xdl0.m208328E(this));
        }
        this.f53693t.m200967l();
        this.f53693t.m200966k(getContext(), this.f53687n, this.f53688o, this.f53689p, this.f53690q);
        this.f53693t.m200979y(user);
    }

    /* JADX INFO: renamed from: h */
    public final void m78617h(BLiveUserLevel bLiveUserLevel) {
        if (bLiveUserLevel == null || TextUtils.isEmpty(bLiveUserLevel.backendUrl)) {
            xdl0.m208344M(this.f53685l, false);
        } else {
            xdl0.m208344M(this.f53685l, true);
            sxj.m186442c(bLiveUserLevel.backendUrl, this.f53685l, ney.m159134a(bLiveUserLevel.grade) ? sxj.f166798b : sxj.f166797a);
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: i */
    public void m78618i(final e30<String> e30Var, mqv<BLiveLeaderBoards> mqvVar, gm0 gm0Var, final boolean z) {
        xdl0.m208344M(this.f53686m, false);
        xdl0.m208344M(this.f53675b, true);
        xdl0.m208344M(this.f53676c, true);
        xdl0.m208358V(this.f53677d, t100.m186890d(43.0f));
        xdl0.m208358V(this.f53678e, t100.m186890d(103.0f));
        m78613d(mqvVar.f135304a.rank);
        final User user = mqvVar.f135304a.user;
        if (user == null) {
            return;
        }
        agv.m96344b(this.f53677d, t100.f167226A, mqvVar, new w9j() { // from class: l.iun0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return user.m60124fp().profileSmall().formatted();
            }
        });
        rfd0.m179126b(this.f53679f, user.name, Color.parseColor("#e6ffffff"), mqvVar.f135304a.userNameGradientColors);
        m78615f(user.gender.toString(), user.age.intValue(), user);
        m78616g(user, gm0Var);
        m78614e(mqvVar.f135304a.amount);
        setOnClickListener(new View.OnClickListener() { // from class: l.jun0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceLiveMemberItem.m78610a(e30Var, user, z, view);
            }
        });
        BLiveLeaderBoards bLiveLeaderBoards = mqvVar.f135304a;
        if (bLiveLeaderBoards.liveUserLevel == null || bLiveLeaderBoards.liveUserLevel.grade <= 0) {
            xdl0.m208344M(this.f53685l, false);
        } else {
            m78617h(bLiveLeaderBoards.liveUserLevel);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78612c(this);
    }

    public VoiceLiveMemberItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceLiveMemberItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
