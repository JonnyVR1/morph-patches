package com.p000p1.mobile.putong.feed.newui.photoalbum.livevoiceroom;

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
import com.p000p1.mobile.putong.data.LiveUserMask;
import com.p000p1.mobile.putong.data.Owner;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.VoiceRoomInfo;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.OnVoiceCall;
import com.p000p1.mobile.putong.feed.data.VoiceLive;
import com.p000p1.mobile.putong.feed.newui.photoalbum.livevoiceroom.FeedLiveVoiceRoomView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.nvc0;
import l.qib0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.ym2;
import p007l.f3c0;
import p007l.k3x;
import p007l.pbh;
import p007l.rbh;
import p007l.zzb0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedLiveVoiceRoomView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f3511a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f3512b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f3513c;

    /* JADX INFO: renamed from: d */
    public ImageView f3514d;

    /* JADX INFO: renamed from: e */
    public TextView f3515e;

    /* JADX INFO: renamed from: f */
    public TextView f3516f;

    /* JADX INFO: renamed from: g */
    public VText f3517g;

    /* JADX INFO: renamed from: h */
    public VText f3518h;

    /* JADX INFO: renamed from: i */
    public VText f3519i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f3520j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f3521k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f3522l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f3523m;

    /* JADX INFO: renamed from: n */
    public VoiceLive f3524n;

    /* JADX INFO: renamed from: o */
    public AdapterViewFlipper f3525o;

    /* JADX INFO: renamed from: p */
    public pbh f3526p;

    public FeedLiveVoiceRoomView(Context context) {
        super(context);
        m5907k(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m5897a(User user, List list, User user2) {
        boolean zEquals = TEnum.equals(user2.gender, user.gender);
        boolean z = !zEquals;
        if (!zEquals) {
            list.add(user2);
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: b */
    public View m5898b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rbh.m13893b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public final void m5899c(List<User> list, final List<User> list2) {
        Owner owner = this.f3524n.anchor;
        final User userMe_ = FeedModule.m1140H().me_();
        if (NullChecker.a(owner)) {
            vwb.d0(list, new w9j() { // from class: l.qbh
                public final Object call(Object obj) {
                    return FeedLiveVoiceRoomView.m5897a(userMe_, list2, (User) obj);
                }
            });
        }
        list2.addAll(list);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5900d() {
        List<String> list;
        VoiceLive voiceLive = this.f3524n;
        return (voiceLive == null || (list = voiceLive.messages) == null || list.size() <= 3) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public final void m5901e(boolean z) {
        this.f3523m.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: f */
    public final List<User> m5902f(List<OnVoiceCall> list) {
        ArrayList arrayList = new ArrayList();
        for (OnVoiceCall onVoiceCall : list) {
            if (NullChecker.a(onVoiceCall)) {
                User userM5905i = m5905i(onVoiceCall.user.f705id);
                if (NullChecker.a(userM5905i)) {
                    arrayList.add(userM5905i);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final List<User> m5903g(List<User> list) {
        ArrayList arrayList = new ArrayList();
        m5899c(list, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public final String m5904h(VoiceRoomInfo voiceRoomInfo) {
        return voiceRoomInfo.topics.size() > 0 ? voiceRoomInfo.topics.get(0).name : "";
    }

    /* JADX INFO: renamed from: i */
    public final User m5905i(String str) {
        return FeedModule.f316d.m16628e8(str);
    }

    /* JADX INFO: renamed from: j */
    public final String m5906j(User user) {
        return (NullChecker.a(user) && NullChecker.a(user.location) && NullChecker.a(user.location.region)) ? user.location.region.city : "";
    }

    /* JADX INFO: renamed from: k */
    public final void m5907k(Context context) {
        addView(m5898b(LayoutInflater.from(context), this));
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#c175ff"), Color.parseColor("#00000000")}).setGradientType(0);
        new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{Color.parseColor("#c175ff"), Color.parseColor("#00000000")}).setGradientType(0);
    }

    /* JADX INFO: renamed from: l */
    public final void m5908l(Context context) {
        this.f3523m.removeAllViews();
        this.f3525o = new AdapterViewFlipper(context, null, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        this.f3525o.setLayoutParams(layoutParams);
        m5914r(this.f3525o);
        this.f3525o.setInAnimation(context, zzb0.f15970a);
        this.f3525o.setOutAnimation(context, zzb0.f15971b);
        this.f3525o.setAnimateFirstView(true);
        this.f3525o.setFlipInterval(1800);
        m5919w();
        this.f3523m.addView(this.f3525o);
    }

    /* JADX INFO: renamed from: m */
    public final List<OnVoiceCall> m5909m(List<OnVoiceCall> list) {
        ArrayList arrayList = new ArrayList();
        Owner owner = this.f3524n.anchor;
        if (NullChecker.a(owner)) {
            for (OnVoiceCall onVoiceCall : list) {
                if (NullChecker.a(onVoiceCall) && NullChecker.a(onVoiceCall.user.f705id) && !onVoiceCall.user.f705id.equals(owner.f264id)) {
                    arrayList.add(onVoiceCall);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public void m5910n(Moment moment) {
        m5917u();
        this.f3524n = moment.voiceLive;
        m5908l(getContext());
        this.f3511a.setBackgroundResource(f3c0.f7957z1);
        m5901e(true);
        m5913q(true);
        m5912p(true);
        m5915s(true);
        m5911o();
    }

    /* JADX INFO: renamed from: o */
    public final void m5911o() {
        List<User> listM5903g = m5903g(m5902f(m5909m(this.f3524n.callInfo.onVoiceCalls)));
        for (int i = 0; i < listM5903g.size(); i++) {
            User user = listM5903g.get(i);
            if (i == 0) {
                m5918v(user, this.f3520j);
            } else if (i == 1) {
                m5918v(user, this.f3521k);
            } else if (i == 2) {
                m5918v(user, this.f3522l);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m5919w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m5920x();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            m5919w();
        } else {
            m5920x();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m5912p(boolean z) {
        VText vText = this.f3519i;
        if (z) {
            vText.setTextColor(Color.parseColor("#bfffffff"));
            this.f3518h.setTextColor(-1);
        } else {
            vText.setTextColor(Color.parseColor("#bfbfbf"));
            this.f3518h.setTextColor(-16777216);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m5913q(boolean z) {
        if (z) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(t100.d(8.5f));
            gradientDrawable.setColor(Color.parseColor("#33ffffff"));
            this.f3517g.setBackground(gradientDrawable);
            this.f3517g.setTextColor(-1);
            return;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(t100.d(8.5f));
        gradientDrawable2.setColor(Color.parseColor("#0b000000"));
        this.f3517g.setBackground(gradientDrawable2);
        this.f3517g.setTextColor(-16777216);
    }

    /* JADX INFO: renamed from: r */
    public final void m5914r(AdapterViewFlipper adapterViewFlipper) {
        pbh pbhVar = new pbh(getContext(), 3);
        this.f3526p = pbhVar;
        pbhVar.m13023e(this.f3524n.messages);
        adapterViewFlipper.setAdapter(this.f3526p);
        if (vwb.J(this.f3524n.messages)) {
            adapterViewFlipper.setVisibility(8);
        } else {
            adapterViewFlipper.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m5915s(boolean z) {
        if (NullChecker.a(this.f3524n.voiceRoomInfo)) {
            User userM5905i = m5905i(this.f3524n.anchor.f264id);
            boolean zIsEmpty = TextUtils.isEmpty(m5906j(userM5905i));
            VText vText = this.f3519i;
            if (zIsEmpty) {
                vText.setText(String.format(getContext().getString(R$string.f564m1), Integer.valueOf((int) this.f3524n.voiceRoomInfo.memberCount)));
            } else {
                vText.setText(String.format("%s • %s", m5906j(userM5905i), String.format(getContext().getString(R$string.f564m1), Integer.valueOf((int) this.f3524n.voiceRoomInfo.memberCount))));
            }
            this.f3517g.setText(String.format("%s", m5904h(this.f3524n.voiceRoomInfo)));
            this.f3518h.setText(this.f3524n.voiceRoomInfo.title);
            if (!TextUtils.isEmpty(this.f3524n.extension.specialShowName) && z) {
                xdl0.M(this.f3514d, false);
                xdl0.M(this.f3516f, false);
                xdl0.M(this.f3512b, true);
                xdl0.M(this.f3515e, true);
                xdl0.M0(this.f3517g, false);
                this.f3515e.setText(this.f3524n.extension.specialShowName);
                this.f3511a.setBackground(null);
                qib0.G.O0(this.f3512b, this.f3524n.extension.specialShowBackgroundUrl, false, true, (nvc0) null, (ym2) null);
                return;
            }
            xdl0.M0(this.f3517g, true);
            xdl0.M(this.f3515e, false);
            xdl0.M(this.f3512b, false);
            ConstraintLayout constraintLayout = this.f3511a;
            if (z) {
                constraintLayout.setBackgroundResource(f3c0.f7957z1);
            } else {
                constraintLayout.setBackgroundResource(f3c0.f7656L5);
            }
            if (!NullChecker.a(this.f3524n.voiceLiveGame) || TextUtils.isEmpty(this.f3524n.voiceLiveGame.categoryName)) {
                xdl0.M(this.f3516f, false);
                xdl0.M(this.f3514d, this.f3524n.voiceRoomInfo.maskMode);
            } else {
                xdl0.M(this.f3516f, true);
                xdl0.M(this.f3514d, false);
                this.f3516f.setText(this.f3524n.voiceLiveGame.categoryName);
            }
            xdl0.V(this.f3517g, (xdl0.O0(this.f3514d) || xdl0.O0(this.f3515e) || xdl0.O0(this.f3516f)) ? t100.d(4.0f) : t100.d(10.0f));
        }
    }

    /* JADX INFO: renamed from: t */
    public void m5916t(Moment moment) {
        m5917u();
        this.f3524n = moment.voiceLive;
        this.f3523m.removeAllViews();
        this.f3511a.setBackgroundResource(f3c0.f7656L5);
        m5901e(false);
        m5913q(false);
        m5912p(false);
        m5915s(false);
        m5911o();
    }

    /* JADX INFO: renamed from: u */
    public final void m5917u() {
        xdl0.M0(this.f3522l, false);
        xdl0.M0(this.f3521k, false);
        xdl0.M0(this.f3520j, false);
    }

    /* JADX INFO: renamed from: v */
    public final void m5918v(User user, VDraweeView vDraweeView) {
        if (NullChecker.a(this.f3524n.voiceRoomInfo)) {
            xdl0.M0(vDraweeView, true);
            vDraweeView.setBackground(null);
            LiveUserMask liveUserMask = this.f3524n.masksMap.get(((DbObject) user).id);
            if (!this.f3524n.voiceRoomInfo.maskMode) {
                qib0.G.Q0(vDraweeView, user.m1042fp().profileSmall());
            } else if (!NullChecker.a(liveUserMask)) {
                xdl0.M0(vDraweeView, false);
            } else {
                k3x.m11388a(vDraweeView, liveUserMask, false);
                qib0.G.O0(vDraweeView, liveUserMask.avatar, true, false, (nvc0) null, (ym2) null);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m5919w() {
        if (m5900d() && NullChecker.a(this.f3525o)) {
            this.f3525o.startFlipping();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m5920x() {
        if (m5900d() && NullChecker.a(this.f3525o)) {
            this.f3525o.stopFlipping();
        }
        if (NullChecker.a(this.f3526p)) {
            this.f3526p.m13025g();
        }
    }

    public FeedLiveVoiceRoomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5907k(context);
    }

    public FeedLiveVoiceRoomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5907k(context);
    }
}
