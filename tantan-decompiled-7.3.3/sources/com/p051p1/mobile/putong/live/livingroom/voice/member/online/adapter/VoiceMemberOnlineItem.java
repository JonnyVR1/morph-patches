package com.p051p1.mobile.putong.live.livingroom.voice.member.online.adapter;

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
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p051p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.a3o0;
import p153l.biv;
import p153l.bnl0;
import p153l.cm0;
import p153l.e3t;
import p153l.i0k;
import p153l.jde;
import p153l.kny;
import p153l.nsv;
import p153l.obc0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qcj;
import p153l.s8o0;
import p153l.und0;
import p153l.y20;
import p153l.y6s;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceMemberOnlineItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceMemberOnlineItem f54502a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f54503b;

    /* JADX INFO: renamed from: c */
    public VText f54504c;

    /* JADX INFO: renamed from: d */
    public CommonMaskAvatarView f54505d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f54506e;

    /* JADX INFO: renamed from: f */
    public LiveGradientTextView f54507f;

    /* JADX INFO: renamed from: g */
    public VLinear f54508g;

    /* JADX INFO: renamed from: h */
    public VLinear f54509h;

    /* JADX INFO: renamed from: i */
    public VImage f54510i;

    /* JADX INFO: renamed from: j */
    public VText f54511j;

    /* JADX INFO: renamed from: k */
    public TextView f54512k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f54513l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f54514m;

    /* JADX INFO: renamed from: n */
    public CommonMedalView f54515n;

    /* JADX INFO: renamed from: o */
    public CommonMedalView f54516o;

    /* JADX INFO: renamed from: p */
    public CommonMedalView f54517p;

    /* JADX INFO: renamed from: q */
    public CommonMedalView f54518q;

    /* JADX INFO: renamed from: r */
    public VImage f54519r;

    /* JADX INFO: renamed from: s */
    public VText f54520s;

    /* JADX INFO: renamed from: t */
    public a3o0 f54521t;

    public VoiceMemberOnlineItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m79786c(View view) {
        s8o0.m185103a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m79787d() {
        bnl0.m105524M(this.f54509h, false);
        bnl0.m105524M(this.f54520s, false);
        bnl0.m105524M(this.f54513l, false);
        bnl0.m105524M(this.f54514m, false);
        bnl0.m105524M(this.f54515n, false);
        bnl0.m105524M(this.f54516o, false);
        bnl0.m105524M(this.f54517p, false);
        bnl0.m105524M(this.f54518q, false);
        bnl0.m105524M(this.f54512k, false);
    }

    /* JADX INFO: renamed from: e */
    public final void m79788e(String str, int i) {
        bnl0.m105524M(this.f54509h, true);
        this.f54510i.setBackgroundResource(TextUtils.equals(str, "male") ? obc0.f146216V5 : obc0.f146194T5);
        this.f54509h.setBackground(jde.m144406b(TextUtils.equals(str, "male") ? -10587906 : -509799, qa00.m175859d(5.0f)));
        this.f54511j.setTypeface(Typeface.DEFAULT_BOLD);
        this.f54511j.setText(String.valueOf(i));
    }

    /* JADX INFO: renamed from: f */
    public final void m79789f(@NonNull User user, @Nullable cm0 cm0Var) {
        bnl0.m105524M(this.f54515n, true);
        bnl0.m105524M(this.f54516o, true);
        bnl0.m105524M(this.f54517p, true);
        if (this.f54521t == null) {
            a3o0 a3o0Var = new a3o0(false);
            this.f54521t = a3o0Var;
            a3o0Var.m95862v(cm0Var);
            this.f54521t.m95860t((Act) bnl0.m105508E(this));
        }
        this.f54521t.m95849i();
        this.f54521t.m95848h(getContext(), this.f54515n, this.f54516o, this.f54517p, this.f54518q);
        this.f54521t.m95859s(user);
    }

    /* JADX INFO: renamed from: g */
    public void m79790g(final y20<String> y20Var, nsv<BLiveMember> nsvVar, cm0 cm0Var, boolean z, String str) {
        final User userM164643h = nsvVar.m164643h();
        if (userM164643h == null) {
            return;
        }
        biv.m104517b(this.f54505d, qa00.f156291D, nsvVar, new qcj() { // from class: l.q8o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return userM164643h.m61308fp().profileSmall().formatted();
            }
        });
        e3t e3tVarM119319a = e3t.m119319a(nsvVar);
        boolean zM119322d = e3tVarM119319a.m119322d();
        LiveGradientTextView liveGradientTextView = this.f54507f;
        if (zM119322d) {
            und0.m196834b(liveGradientTextView, e3tVarM119319a.f91997a.name, Color.parseColor("#e6ffffff"), e3tVarM119319a.f91997a.userNameGradientColors);
            m79787d();
            bnl0.m105524M(this.f54519r, true);
        } else {
            und0.m196834b(liveGradientTextView, userM164643h.name, Color.parseColor("#e6ffffff"), nsvVar.f143542a.userNameGradientColors);
            bnl0.m105524M(this.f54519r, false);
            m79788e(userM164643h.gender.toString(), userM164643h.age.intValue());
            bnl0.m105524M(this.f54511j, (userM164643h.isHideAgeFromSVip() || y6s.m214494b(str)) ? false : true);
            m79791h(userM164643h, z, str);
            BLiveMember bLiveMember = nsvVar.f143542a;
            if (bLiveMember.liveUserLevel == null || bLiveMember.liveUserLevel.grade <= 0) {
                bnl0.m105524M(this.f54513l, false);
            } else {
                m79792i(bLiveMember.liveUserLevel);
            }
            bnl0.m105524M(this.f54514m, false);
            m79789f(userM164643h, cm0Var);
            bnl0.m105524M(this.f54512k, false);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.r8o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(userM164643h.f56859id);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m79791h(User user, boolean z, String str) {
        String str2;
        boolean zM214494b = y6s.m214494b(str);
        VText vText = this.f54520s;
        if (zM214494b) {
            bnl0.m105524M(vText, false);
            return;
        }
        bnl0.m105524M(vText, true);
        String strM175811p = q8g0.m175811p(user.location.distance, true);
        if (z && !TextUtils.isEmpty(user.location.region.country)) {
            boolean zIsEmpty = TextUtils.isEmpty(user.location.region.city);
            Location location = user.location;
            if (zIsEmpty) {
                str2 = location.region.country;
            } else {
                str2 = location.region.city + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + strM175811p;
            }
            strM175811p = str2;
        }
        this.f54520s.setText(strM175811p);
        bnl0.m105524M(this.f54520s, !user.isHideLocationFromSVip());
    }

    /* JADX INFO: renamed from: i */
    public final void m79792i(BLiveUserLevel bLiveUserLevel) {
        if (bLiveUserLevel == null || TextUtils.isEmpty(bLiveUserLevel.backendUrl)) {
            bnl0.m105524M(this.f54513l, false);
        } else {
            bnl0.m105524M(this.f54513l, true);
            i0k.m137976c(bLiveUserLevel.backendUrl, this.f54513l, kny.m150553a(bLiveUserLevel.grade) ? i0k.f112379b : i0k.f112378a);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79786c(this);
    }

    public VoiceMemberOnlineItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceMemberOnlineItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
