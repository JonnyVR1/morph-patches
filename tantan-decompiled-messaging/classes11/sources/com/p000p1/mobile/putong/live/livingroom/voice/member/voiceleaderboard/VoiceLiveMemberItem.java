package com.p000p1.mobile.putong.live.livingroom.voice.member.voiceleaderboard;

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
import com.p000p1.mobile.putong.live.livingroom.voice.member.voiceleaderboard.VoiceLiveMemberItem;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.tantanapp.common.data.DbObject;
import l.agv;
import l.e30;
import l.fce;
import l.gm0;
import l.i3c0;
import l.kun0;
import l.mqv;
import l.ney;
import l.rfd0;
import l.rsm0;
import l.sxj;
import l.t100;
import l.w1t;
import l.w8u;
import l.w9j;
import l.xdl0;
import p009l.bgv;
import p009l.fld0;
import p009l.hcc0;
import p009l.x8u;
import p009l.ypv;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceLiveMemberItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceLiveMemberItem f7280a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f7281b;

    /* JADX INFO: renamed from: c */
    public VText f7282c;

    /* JADX INFO: renamed from: d */
    public CommonMaskAvatarView f7283d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f7284e;

    /* JADX INFO: renamed from: f */
    public LiveGradientTextView f7285f;

    /* JADX INFO: renamed from: g */
    public VLinear f7286g;

    /* JADX INFO: renamed from: h */
    public VLinear f7287h;

    /* JADX INFO: renamed from: i */
    public VImage f7288i;

    /* JADX INFO: renamed from: j */
    public VText f7289j;

    /* JADX INFO: renamed from: k */
    public TextView f7290k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f7291l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f7292m;

    /* JADX INFO: renamed from: n */
    public CommonMedalView f7293n;

    /* JADX INFO: renamed from: o */
    public CommonMedalView f7294o;

    /* JADX INFO: renamed from: p */
    public CommonMedalView f7295p;

    /* JADX INFO: renamed from: q */
    public CommonMedalView f7296q;

    /* JADX INFO: renamed from: r */
    public VImage f7297r;

    /* JADX INFO: renamed from: s */
    public VText f7298s;

    /* JADX INFO: renamed from: t */
    public w1t f7299t;

    public VoiceLiveMemberItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8826a(e30 e30Var, User user, boolean z, View view) {
        e30Var.call(((DbObject) user).id);
        if (z) {
            rsm0.o();
        } else {
            rsm0.p();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8828c(View view) {
        kun0.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m8829d(int i) {
        hcc0.m15533e(getContext(), this.f7281b, this.f7282c, i);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: e */
    public final void m8830e(double d) {
        xdl0.M(this.f7298s, true);
        this.f7298s.setTextColor(Color.parseColor("#ff8817"));
        boolean zB = w8u.B();
        VText vText = this.f7298s;
        if (!zB) {
            vText.setText(x8u.m24745c(d));
            xdl0.k(this.f7298s, getResources().getDrawable(((bgv) ypv.m25491l(fld0.f13080f)).m12018n() ? i3c0.k3 : i3c0.n));
            this.f7298s.setCompoundDrawablePadding(t100.c);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(x8u.m24745c(d));
            sb.append(ypv.f23200e.getString(((bgv) ypv.m25491l(fld0.f13080f)).m12018n() ? R.string.Td : R.string.W5));
            vText.setText(sb.toString());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m8831f(String str, int i, User user) {
        xdl0.M(this.f7287h, true);
        this.f7288i.setBackgroundResource(TextUtils.equals(str, "male") ? i3c0.V5 : i3c0.T5);
        this.f7287h.setBackground(fce.b(TextUtils.equals(str, "male") ? -10587906 : -509799, t100.d(5.0f)));
        this.f7289j.setTypeface(Typeface.DEFAULT_BOLD);
        this.f7289j.setText(String.valueOf(i));
        xdl0.M(this.f7289j, !user.isHideAgeFromSVip());
    }

    /* JADX INFO: renamed from: g */
    public final void m8832g(@NonNull User user, @Nullable gm0 gm0Var) {
        xdl0.M(this.f7293n, true);
        xdl0.M(this.f7294o, true);
        xdl0.M(this.f7295p, true);
        if (this.f7299t == null) {
            w1t w1tVar = new w1t(false);
            this.f7299t = w1tVar;
            w1tVar.E(gm0Var);
            this.f7299t.C(xdl0.E(this));
        }
        this.f7299t.l();
        this.f7299t.k(getContext(), new CommonMedalView[]{this.f7293n, this.f7294o, this.f7295p, this.f7296q});
        this.f7299t.y(user);
    }

    /* JADX INFO: renamed from: h */
    public final void m8833h(BLiveUserLevel bLiveUserLevel) {
        if (bLiveUserLevel == null || TextUtils.isEmpty(bLiveUserLevel.backendUrl)) {
            xdl0.M(this.f7291l, false);
        } else {
            xdl0.M(this.f7291l, true);
            sxj.c(bLiveUserLevel.backendUrl, this.f7291l, ney.a(bLiveUserLevel.grade) ? sxj.b : sxj.a);
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: i */
    public void m8834i(final e30<String> e30Var, mqv<BLiveLeaderBoards> mqvVar, gm0 gm0Var, final boolean z) {
        xdl0.M(this.f7292m, false);
        xdl0.M(this.f7281b, true);
        xdl0.M(this.f7282c, true);
        xdl0.V(this.f7283d, t100.d(43.0f));
        xdl0.V(this.f7284e, t100.d(103.0f));
        m8829d(((BLiveLeaderBoards) mqvVar.a).rank);
        final User user = ((BLiveLeaderBoards) mqvVar.a).user;
        if (user == null) {
            return;
        }
        agv.b(this.f7283d, t100.A, mqvVar, new w9j() { // from class: l.iun0
            public final Object call(Object obj) {
                return user.fp().profileSmall().formatted();
            }
        });
        rfd0.b(this.f7285f, user.name, Color.parseColor("#e6ffffff"), ((BLiveLeaderBoards) mqvVar.a).userNameGradientColors);
        m8831f(user.gender.toString(), user.age.intValue(), user);
        m8832g(user, gm0Var);
        m8830e(((BLiveLeaderBoards) mqvVar.a).amount);
        setOnClickListener(new View.OnClickListener() { // from class: l.jun0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceLiveMemberItem.m8826a(e30Var, user, z, view);
            }
        });
        Object obj = mqvVar.a;
        if (((BLiveLeaderBoards) obj).liveUserLevel == null || ((BLiveLeaderBoards) obj).liveUserLevel.grade <= 0) {
            xdl0.M(this.f7291l, false);
        } else {
            m8833h(((BLiveLeaderBoards) obj).liveUserLevel);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8828c(this);
    }

    public VoiceLiveMemberItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceLiveMemberItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
