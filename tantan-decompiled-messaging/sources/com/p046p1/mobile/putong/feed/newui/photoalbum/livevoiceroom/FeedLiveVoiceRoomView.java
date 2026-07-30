package com.p046p1.mobile.putong.feed.newui.photoalbum.livevoiceroom;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterViewFlipper;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.data.LiveUserMask;
import com.p046p1.mobile.putong.data.Owner;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.VoiceRoomInfo;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.OnVoiceCall;
import com.p046p1.mobile.putong.feed.data.VoiceLive;
import com.p046p1.mobile.putong.feed.newui.photoalbum.livevoiceroom.FeedLiveVoiceRoomView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;
import p149l.f3c0;
import p149l.k3x;
import p149l.pbh;
import p149l.qib0;
import p149l.rbh;
import p149l.t100;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.zzb0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes12.dex */
public class FeedLiveVoiceRoomView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f42050a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f42051b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f42052c;

    /* JADX INFO: renamed from: d */
    public ImageView f42053d;

    /* JADX INFO: renamed from: e */
    public TextView f42054e;

    /* JADX INFO: renamed from: f */
    public TextView f42055f;

    /* JADX INFO: renamed from: g */
    public VText f42056g;

    /* JADX INFO: renamed from: h */
    public VText f42057h;

    /* JADX INFO: renamed from: i */
    public VText f42058i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f42059j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f42060k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f42061l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f42062m;

    /* JADX INFO: renamed from: n */
    public VoiceLive f42063n;

    /* JADX INFO: renamed from: o */
    public AdapterViewFlipper f42064o;

    /* JADX INFO: renamed from: p */
    public pbh f42065p;

    public FeedLiveVoiceRoomView(Context context) {
        super(context);
        m64810k(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m64800a(User user, List list, User user2) {
        boolean zEquals = TEnum.equals(user2.gender, user.gender);
        boolean z = !zEquals;
        if (!zEquals) {
            list.add(user2);
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: b */
    public View m64801b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rbh.m178601b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public final void m64802c(List<User> list, final List<User> list2) {
        Owner owner = this.f42063n.anchor;
        final User userMe_ = FeedModule.m60222H().me_();
        if (NullChecker.m81303a(owner)) {
            vwb.m200320d0(list, new w9j() { // from class: l.qbh
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return FeedLiveVoiceRoomView.m64800a(userMe_, list2, (User) obj);
                }
            });
        }
        list2.addAll(list);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m64803d() {
        List<String> list;
        VoiceLive voiceLive = this.f42063n;
        return (voiceLive == null || (list = voiceLive.messages) == null || list.size() <= 3) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public final void m64804e(boolean z) {
        this.f42062m.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: f */
    public final List<User> m64805f(List<OnVoiceCall> list) {
        ArrayList arrayList = new ArrayList();
        for (OnVoiceCall onVoiceCall : list) {
            if (NullChecker.m81303a(onVoiceCall)) {
                User userM64808i = m64808i(onVoiceCall.user.f39244id);
                if (NullChecker.m81303a(userM64808i)) {
                    arrayList.add(userM64808i);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final List<User> m64806g(List<User> list) {
        ArrayList arrayList = new ArrayList();
        m64802c(list, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public final String m64807h(VoiceRoomInfo voiceRoomInfo) {
        return voiceRoomInfo.topics.size() > 0 ? voiceRoomInfo.topics.get(0).name : "";
    }

    /* JADX INFO: renamed from: i */
    public final User m64808i(String str) {
        return FeedModule.f38855d.m209447e8(str);
    }

    /* JADX INFO: renamed from: j */
    public final String m64809j(User user) {
        return (NullChecker.m81303a(user) && NullChecker.m81303a(user.location) && NullChecker.m81303a(user.location.region)) ? user.location.region.city : "";
    }

    /* JADX INFO: renamed from: k */
    public final void m64810k(Context context) {
        addView(m64801b(LayoutInflater.from(context), this));
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#c175ff"), Color.parseColor("#00000000")}).setGradientType(0);
        new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{Color.parseColor("#c175ff"), Color.parseColor("#00000000")}).setGradientType(0);
    }

    /* JADX INFO: renamed from: l */
    public final void m64811l(Context context) {
        this.f42062m.removeAllViews();
        this.f42064o = new AdapterViewFlipper(context, null, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        this.f42064o.setLayoutParams(layoutParams);
        m64817r(this.f42064o);
        this.f42064o.setInAnimation(context, zzb0.f205792a);
        this.f42064o.setOutAnimation(context, zzb0.f205793b);
        this.f42064o.setAnimateFirstView(true);
        this.f42064o.setFlipInterval(1800);
        m64822w();
        this.f42062m.addView(this.f42064o);
    }

    /* JADX INFO: renamed from: m */
    public final List<OnVoiceCall> m64812m(List<OnVoiceCall> list) {
        ArrayList arrayList = new ArrayList();
        Owner owner = this.f42063n.anchor;
        if (NullChecker.m81303a(owner)) {
            for (OnVoiceCall onVoiceCall : list) {
                if (NullChecker.m81303a(onVoiceCall) && NullChecker.m81303a(onVoiceCall.user.f39244id) && !onVoiceCall.user.f39244id.equals(owner.f38803id)) {
                    arrayList.add(onVoiceCall);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public void m64813n(Moment moment) {
        m64820u();
        this.f42063n = moment.voiceLive;
        m64811l(getContext());
        this.f42050a.setBackgroundResource(f3c0.f94674z1);
        m64804e(true);
        m64816q(true);
        m64815p(true);
        m64818s(true);
        m64814o();
    }

    /* JADX INFO: renamed from: o */
    public final void m64814o() {
        List<User> listM64806g = m64806g(m64805f(m64812m(this.f42063n.callInfo.onVoiceCalls)));
        for (int i = 0; i < listM64806g.size(); i++) {
            User user = listM64806g.get(i);
            if (i == 0) {
                m64821v(user, this.f42059j);
            } else if (i == 1) {
                m64821v(user, this.f42060k);
            } else if (i == 2) {
                m64821v(user, this.f42061l);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m64822w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m64823x();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            m64822w();
        } else {
            m64823x();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m64815p(boolean z) {
        VText vText = this.f42058i;
        if (z) {
            vText.setTextColor(Color.parseColor("#bfffffff"));
            this.f42057h.setTextColor(-1);
        } else {
            vText.setTextColor(Color.parseColor("#bfbfbf"));
            this.f42057h.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m64816q(boolean z) {
        if (z) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(t100.m186890d(8.5f));
            gradientDrawable.setColor(Color.parseColor("#33ffffff"));
            this.f42056g.setBackground(gradientDrawable);
            this.f42056g.setTextColor(-1);
            return;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(t100.m186890d(8.5f));
        gradientDrawable2.setColor(Color.parseColor("#0b000000"));
        this.f42056g.setBackground(gradientDrawable2);
        this.f42056g.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
    }

    /* JADX INFO: renamed from: r */
    public final void m64817r(AdapterViewFlipper adapterViewFlipper) {
        pbh pbhVar = new pbh(getContext(), 3);
        this.f42065p = pbhVar;
        pbhVar.m168208e(this.f42063n.messages);
        adapterViewFlipper.setAdapter(this.f42065p);
        if (vwb.m200296J(this.f42063n.messages)) {
            adapterViewFlipper.setVisibility(8);
        } else {
            adapterViewFlipper.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m64818s(boolean z) {
        if (NullChecker.m81303a(this.f42063n.voiceRoomInfo)) {
            User userM64808i = m64808i(this.f42063n.anchor.f38803id);
            boolean zIsEmpty = TextUtils.isEmpty(m64809j(userM64808i));
            VText vText = this.f42058i;
            if (zIsEmpty) {
                vText.setText(String.format(getContext().getString(R$string.f39103m1), Integer.valueOf((int) this.f42063n.voiceRoomInfo.memberCount)));
            } else {
                vText.setText(String.format("%s • %s", m64809j(userM64808i), String.format(getContext().getString(R$string.f39103m1), Integer.valueOf((int) this.f42063n.voiceRoomInfo.memberCount))));
            }
            this.f42056g.setText(String.format("%s", m64807h(this.f42063n.voiceRoomInfo)));
            this.f42057h.setText(this.f42063n.voiceRoomInfo.title);
            if (!TextUtils.isEmpty(this.f42063n.extension.specialShowName) && z) {
                xdl0.m208344M(this.f42053d, false);
                xdl0.m208344M(this.f42055f, false);
                xdl0.m208344M(this.f42051b, true);
                xdl0.m208344M(this.f42054e, true);
                xdl0.m208345M0(this.f42056g, false);
                this.f42054e.setText(this.f42063n.extension.specialShowName);
                this.f42050a.setBackground(null);
                qib0.f154691G.m102337O0(this.f42051b, this.f42063n.extension.specialShowBackgroundUrl, false, true, null, null);
                return;
            }
            xdl0.m208345M0(this.f42056g, true);
            xdl0.m208344M(this.f42054e, false);
            xdl0.m208344M(this.f42051b, false);
            ConstraintLayout constraintLayout = this.f42050a;
            if (z) {
                constraintLayout.setBackgroundResource(f3c0.f94674z1);
            } else {
                constraintLayout.setBackgroundResource(f3c0.f94373L5);
            }
            if (!NullChecker.m81303a(this.f42063n.voiceLiveGame) || TextUtils.isEmpty(this.f42063n.voiceLiveGame.categoryName)) {
                xdl0.m208344M(this.f42055f, false);
                xdl0.m208344M(this.f42053d, this.f42063n.voiceRoomInfo.maskMode);
            } else {
                xdl0.m208344M(this.f42055f, true);
                xdl0.m208344M(this.f42053d, false);
                this.f42055f.setText(this.f42063n.voiceLiveGame.categoryName);
            }
            xdl0.m208358V(this.f42056g, (xdl0.m208349O0(this.f42053d) || xdl0.m208349O0(this.f42054e) || xdl0.m208349O0(this.f42055f)) ? t100.m186890d(4.0f) : t100.m186890d(10.0f));
        }
    }

    /* JADX INFO: renamed from: t */
    public void m64819t(Moment moment) {
        m64820u();
        this.f42063n = moment.voiceLive;
        this.f42062m.removeAllViews();
        this.f42050a.setBackgroundResource(f3c0.f94373L5);
        m64804e(false);
        m64816q(false);
        m64815p(false);
        m64818s(false);
        m64814o();
    }

    /* JADX INFO: renamed from: u */
    public final void m64820u() {
        xdl0.m208345M0(this.f42061l, false);
        xdl0.m208345M0(this.f42060k, false);
        xdl0.m208345M0(this.f42059j, false);
    }

    /* JADX INFO: renamed from: v */
    public final void m64821v(User user, VDraweeView vDraweeView) {
        if (NullChecker.m81303a(this.f42063n.voiceRoomInfo)) {
            xdl0.m208345M0(vDraweeView, true);
            vDraweeView.setBackground(null);
            LiveUserMask liveUserMask = this.f42063n.masksMap.get(user.f56011id);
            if (!this.f42063n.voiceRoomInfo.maskMode) {
                qib0.f154691G.m102341Q0(vDraweeView, user.m60124fp().profileSmall());
            } else if (!NullChecker.m81303a(liveUserMask)) {
                xdl0.m208345M0(vDraweeView, false);
            } else {
                k3x.m144444a(vDraweeView, liveUserMask, false);
                qib0.f154691G.m102337O0(vDraweeView, liveUserMask.avatar, true, false, null, null);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m64822w() {
        if (m64803d() && NullChecker.m81303a(this.f42064o)) {
            this.f42064o.startFlipping();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m64823x() {
        if (m64803d() && NullChecker.m81303a(this.f42064o)) {
            this.f42064o.stopFlipping();
        }
        if (NullChecker.m81303a(this.f42065p)) {
            this.f42065p.m168210g();
        }
    }

    public FeedLiveVoiceRoomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m64810k(context);
    }

    public FeedLiveVoiceRoomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m64810k(context);
    }
}
