package com.p051p1.mobile.putong.feed.newui.photoalbum.livevoiceroom;

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
import com.p051p1.mobile.putong.data.LiveUserMask;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.VoiceRoomInfo;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.OnVoiceCall;
import com.p051p1.mobile.putong.feed.data.VoiceLive;
import com.p051p1.mobile.putong.feed.newui.photoalbum.livevoiceroom.FeedLiveVoiceRoomView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.e8c0;
import p153l.edh;
import p153l.gdh;
import p153l.j6x;
import p153l.jyb;
import p153l.lbc0;
import p153l.qa00;
import p153l.qcj;
import p153l.uqb0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes13.dex */
public class FeedLiveVoiceRoomView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f42898a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f42899b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f42900c;

    /* JADX INFO: renamed from: d */
    public ImageView f42901d;

    /* JADX INFO: renamed from: e */
    public TextView f42902e;

    /* JADX INFO: renamed from: f */
    public TextView f42903f;

    /* JADX INFO: renamed from: g */
    public VText f42904g;

    /* JADX INFO: renamed from: h */
    public VText f42905h;

    /* JADX INFO: renamed from: i */
    public VText f42906i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f42907j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f42908k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f42909l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f42910m;

    /* JADX INFO: renamed from: n */
    public VoiceLive f42911n;

    /* JADX INFO: renamed from: o */
    public AdapterViewFlipper f42912o;

    /* JADX INFO: renamed from: p */
    public edh f42913p;

    public FeedLiveVoiceRoomView(Context context) {
        super(context);
        m65993k(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m65983a(User user, List list, User user2) {
        boolean zEquals = TEnum.equals(user2.gender, user.gender);
        boolean z = !zEquals;
        if (!zEquals) {
            list.add(user2);
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: b */
    public View m65984b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gdh.m129926b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public final void m65985c(List<User> list, final List<User> list2) {
        Owner owner = this.f42911n.anchor;
        final User userMe_ = FeedModule.m61406H().me_();
        if (NullChecker.m82486a(owner)) {
            jyb.m147503d0(list, new qcj() { // from class: l.fdh
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return FeedLiveVoiceRoomView.m65983a(userMe_, list2, (User) obj);
                }
            });
        }
        list2.addAll(list);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m65986d() {
        List<String> list;
        VoiceLive voiceLive = this.f42911n;
        return (voiceLive == null || (list = voiceLive.messages) == null || list.size() <= 3) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public final void m65987e(boolean z) {
        this.f42910m.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: f */
    public final List<User> m65988f(List<OnVoiceCall> list) {
        ArrayList arrayList = new ArrayList();
        for (OnVoiceCall onVoiceCall : list) {
            if (NullChecker.m82486a(onVoiceCall)) {
                User userM65991i = m65991i(onVoiceCall.user.f40092id);
                if (NullChecker.m82486a(userM65991i)) {
                    arrayList.add(userM65991i);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final List<User> m65989g(List<User> list) {
        ArrayList arrayList = new ArrayList();
        m65985c(list, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public final String m65990h(VoiceRoomInfo voiceRoomInfo) {
        return voiceRoomInfo.topics.size() > 0 ? voiceRoomInfo.topics.get(0).name : "";
    }

    /* JADX INFO: renamed from: i */
    public final User m65991i(String str) {
        return FeedModule.f39703d.m145688e8(str);
    }

    /* JADX INFO: renamed from: j */
    public final String m65992j(User user) {
        return (NullChecker.m82486a(user) && NullChecker.m82486a(user.location) && NullChecker.m82486a(user.location.region)) ? user.location.region.city : "";
    }

    /* JADX INFO: renamed from: k */
    public final void m65993k(Context context) {
        addView(m65984b(LayoutInflater.from(context), this));
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#c175ff"), Color.parseColor("#00000000")}).setGradientType(0);
        new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{Color.parseColor("#c175ff"), Color.parseColor("#00000000")}).setGradientType(0);
    }

    /* JADX INFO: renamed from: l */
    public final void m65994l(Context context) {
        this.f42910m.removeAllViews();
        this.f42912o = new AdapterViewFlipper(context, null, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        this.f42912o.setLayoutParams(layoutParams);
        m66000r(this.f42912o);
        this.f42912o.setInAnimation(context, e8c0.f92535a);
        this.f42912o.setOutAnimation(context, e8c0.f92536b);
        this.f42912o.setAnimateFirstView(true);
        this.f42912o.setFlipInterval(1800);
        m66005w();
        this.f42910m.addView(this.f42912o);
    }

    /* JADX INFO: renamed from: m */
    public final List<OnVoiceCall> m65995m(List<OnVoiceCall> list) {
        ArrayList arrayList = new ArrayList();
        Owner owner = this.f42911n.anchor;
        if (NullChecker.m82486a(owner)) {
            for (OnVoiceCall onVoiceCall : list) {
                if (NullChecker.m82486a(onVoiceCall) && NullChecker.m82486a(onVoiceCall.user.f40092id) && !onVoiceCall.user.f40092id.equals(owner.f39651id)) {
                    arrayList.add(onVoiceCall);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public void m65996n(Moment moment) {
        m66003u();
        this.f42911n = moment.voiceLive;
        m65994l(getContext());
        this.f42898a.setBackgroundResource(lbc0.f131192z1);
        m65987e(true);
        m65999q(true);
        m65998p(true);
        m66001s(true);
        m65997o();
    }

    /* JADX INFO: renamed from: o */
    public final void m65997o() {
        List<User> listM65989g = m65989g(m65988f(m65995m(this.f42911n.callInfo.onVoiceCalls)));
        for (int i = 0; i < listM65989g.size(); i++) {
            User user = listM65989g.get(i);
            if (i == 0) {
                m66004v(user, this.f42907j);
            } else if (i == 1) {
                m66004v(user, this.f42908k);
            } else if (i == 2) {
                m66004v(user, this.f42909l);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m66005w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m66006x();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            m66005w();
        } else {
            m66006x();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m65998p(boolean z) {
        VText vText = this.f42906i;
        if (z) {
            vText.setTextColor(Color.parseColor("#bfffffff"));
            this.f42905h.setTextColor(-1);
        } else {
            vText.setTextColor(Color.parseColor("#bfbfbf"));
            this.f42905h.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m65999q(boolean z) {
        if (z) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(qa00.m175859d(8.5f));
            gradientDrawable.setColor(Color.parseColor("#33ffffff"));
            this.f42904g.setBackground(gradientDrawable);
            this.f42904g.setTextColor(-1);
            return;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(qa00.m175859d(8.5f));
        gradientDrawable2.setColor(Color.parseColor("#0b000000"));
        this.f42904g.setBackground(gradientDrawable2);
        this.f42904g.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
    }

    /* JADX INFO: renamed from: r */
    public final void m66000r(AdapterViewFlipper adapterViewFlipper) {
        edh edhVar = new edh(getContext(), 3);
        this.f42913p = edhVar;
        edhVar.m120456e(this.f42911n.messages);
        adapterViewFlipper.setAdapter(this.f42913p);
        if (jyb.m147479J(this.f42911n.messages)) {
            adapterViewFlipper.setVisibility(8);
        } else {
            adapterViewFlipper.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m66001s(boolean z) {
        if (NullChecker.m82486a(this.f42911n.voiceRoomInfo)) {
            User userM65991i = m65991i(this.f42911n.anchor.f39651id);
            boolean zIsEmpty = TextUtils.isEmpty(m65992j(userM65991i));
            VText vText = this.f42906i;
            if (zIsEmpty) {
                vText.setText(String.format(getContext().getString(R$string.f39951m1), Integer.valueOf((int) this.f42911n.voiceRoomInfo.memberCount)));
            } else {
                vText.setText(String.format("%s • %s", m65992j(userM65991i), String.format(getContext().getString(R$string.f39951m1), Integer.valueOf((int) this.f42911n.voiceRoomInfo.memberCount))));
            }
            this.f42904g.setText(String.format("%s", m65990h(this.f42911n.voiceRoomInfo)));
            this.f42905h.setText(this.f42911n.voiceRoomInfo.title);
            if (!TextUtils.isEmpty(this.f42911n.extension.specialShowName) && z) {
                bnl0.m105524M(this.f42901d, false);
                bnl0.m105524M(this.f42903f, false);
                bnl0.m105524M(this.f42899b, true);
                bnl0.m105524M(this.f42902e, true);
                bnl0.m105525M0(this.f42904g, false);
                this.f42902e.setText(this.f42911n.extension.specialShowName);
                this.f42898a.setBackground(null);
                uqb0.f180374G.m127121O0(this.f42899b, this.f42911n.extension.specialShowBackgroundUrl, false, true, null, null);
                return;
            }
            bnl0.m105525M0(this.f42904g, true);
            bnl0.m105524M(this.f42902e, false);
            bnl0.m105524M(this.f42899b, false);
            ConstraintLayout constraintLayout = this.f42898a;
            if (z) {
                constraintLayout.setBackgroundResource(lbc0.f131192z1);
            } else {
                constraintLayout.setBackgroundResource(lbc0.f130891L5);
            }
            if (!NullChecker.m82486a(this.f42911n.voiceLiveGame) || TextUtils.isEmpty(this.f42911n.voiceLiveGame.categoryName)) {
                bnl0.m105524M(this.f42903f, false);
                bnl0.m105524M(this.f42901d, this.f42911n.voiceRoomInfo.maskMode);
            } else {
                bnl0.m105524M(this.f42903f, true);
                bnl0.m105524M(this.f42901d, false);
                this.f42903f.setText(this.f42911n.voiceLiveGame.categoryName);
            }
            bnl0.m105538V(this.f42904g, (bnl0.m105529O0(this.f42901d) || bnl0.m105529O0(this.f42902e) || bnl0.m105529O0(this.f42903f)) ? qa00.m175859d(4.0f) : qa00.m175859d(10.0f));
        }
    }

    /* JADX INFO: renamed from: t */
    public void m66002t(Moment moment) {
        m66003u();
        this.f42911n = moment.voiceLive;
        this.f42910m.removeAllViews();
        this.f42898a.setBackgroundResource(lbc0.f130891L5);
        m65987e(false);
        m65999q(false);
        m65998p(false);
        m66001s(false);
        m65997o();
    }

    /* JADX INFO: renamed from: u */
    public final void m66003u() {
        bnl0.m105525M0(this.f42909l, false);
        bnl0.m105525M0(this.f42908k, false);
        bnl0.m105525M0(this.f42907j, false);
    }

    /* JADX INFO: renamed from: v */
    public final void m66004v(User user, VDraweeView vDraweeView) {
        if (NullChecker.m82486a(this.f42911n.voiceRoomInfo)) {
            bnl0.m105525M0(vDraweeView, true);
            vDraweeView.setBackground(null);
            LiveUserMask liveUserMask = this.f42911n.masksMap.get(user.f56859id);
            if (!this.f42911n.voiceRoomInfo.maskMode) {
                uqb0.f180374G.m127125Q0(vDraweeView, user.m61308fp().profileSmall());
            } else if (!NullChecker.m82486a(liveUserMask)) {
                bnl0.m105525M0(vDraweeView, false);
            } else {
                j6x.m143724a(vDraweeView, liveUserMask, false);
                uqb0.f180374G.m127121O0(vDraweeView, liveUserMask.avatar, true, false, null, null);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m66005w() {
        if (m65986d() && NullChecker.m82486a(this.f42912o)) {
            this.f42912o.startFlipping();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m66006x() {
        if (m65986d() && NullChecker.m82486a(this.f42912o)) {
            this.f42912o.stopFlipping();
        }
        if (NullChecker.m82486a(this.f42913p)) {
            this.f42913p.m120458g();
        }
    }

    public FeedLiveVoiceRoomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m65993k(context);
    }

    public FeedLiveVoiceRoomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65993k(context);
    }
}
