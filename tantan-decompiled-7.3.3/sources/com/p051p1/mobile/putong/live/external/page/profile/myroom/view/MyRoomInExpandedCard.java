package com.p051p1.mobile.putong.live.external.page.profile.myroom.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveRoomInProfile;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomInProfile;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.data.ValueObject;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.bkj0;
import p153l.bnl0;
import p153l.fn2;
import p153l.gfj0;
import p153l.iqn0;
import p153l.izs;
import p153l.jyb;
import p153l.mbs;
import p153l.o1j0;
import p153l.pb1;
import p153l.pf60;
import p153l.qa00;
import p153l.qim;
import p153l.qnp0;
import p153l.so0;
import p153l.tbs;
import p153l.v320;
import p153l.wo0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class MyRoomInExpandedCard extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f46790a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f46791b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f46792c;

    /* JADX INFO: renamed from: d */
    public View f46793d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f46794e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f46795f;

    /* JADX INFO: renamed from: g */
    public TextView f46796g;

    /* JADX INFO: renamed from: h */
    public TextView f46797h;

    /* JADX INFO: renamed from: i */
    public TextView f46798i;

    /* JADX INFO: renamed from: j */
    public y20<BLiveRoomInProfile> f46799j;

    /* JADX INFO: renamed from: k */
    public y20<BLiveVoiceRoomInProfile> f46800k;

    /* JADX INFO: renamed from: l */
    public String f46801l;

    /* JADX INFO: renamed from: m */
    public ObjectAnimator f46802m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInExpandedCard$a */
    public class C12733a implements y20<BLiveRoomInProfile> {
        public C12733a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(BLiveRoomInProfile bLiveRoomInProfile) {
            MyRoomInExpandedCard.this.m71704j(bLiveRoomInProfile);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInExpandedCard$b */
    public class C12734b implements y20<BLiveVoiceRoomInProfile> {
        public C12734b() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile) {
            MyRoomInExpandedCard.this.m71705k(bLiveVoiceRoomInProfile);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInExpandedCard$c */
    public class C12735c extends wo0 {
        public C12735c() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: d */
        public void mo71712d(@NonNull so0 so0Var) {
            super.mo71712d(so0Var);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInExpandedCard$d */
    public class C12736d extends fn2 {
        public C12736d() {
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
        }
    }

    public MyRoomInExpandedCard(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m71699e(View view) {
        v320.m199182a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final Act m71700f() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: g */
    public final void m71701g() {
        this.f46792c.clearAnimation();
        ObjectAnimator objectAnimator = this.f46802m;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m71702h(BLiveRoomInProfile bLiveRoomInProfile, View view) {
        y20<BLiveRoomInProfile> y20Var = this.f46799j;
        if (y20Var != null) {
            y20Var.call(bLiveRoomInProfile);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m71703i(BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile, View view) {
        y20<BLiveVoiceRoomInProfile> y20Var = this.f46800k;
        if (y20Var != null) {
            y20Var.call(bLiveVoiceRoomInProfile);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m71704j(BLiveRoomInProfile bLiveRoomInProfile) {
        if (mbs.m157821G().mo68436Zo().mo136897a()) {
            o1j0.m165649w(R$string.f45710B0);
            return;
        }
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
        if (audioBusinessTypeMo171474c == AudioBusinessType.VIDEO_CHAT) {
            o1j0.m165651y(audioBusinessTypeMo171474c.getBusinessMsg());
            return;
        }
        gfj0.m130077e(false, bLiveRoomInProfile.anchorId, bLiveRoomInProfile.liveId, bLiveRoomInProfile.status, bLiveRoomInProfile.multiCallInfo.role, "");
        if (TextUtils.equals(this.f46801l, mbs.m157870o0())) {
            tbs.f172993f.m143699a(m71700f(), AnchorStartData.getBuilder().m68745m(false).m68746n("my_room_in_profile").m68743k());
        } else {
            m71700f().startActivity(tbs.f172993f.m143704f(m71700f(), AudienceStartData.getBuilder().m68777E(bLiveRoomInProfile.liveId).m68799z(this.f46801l).m68787O("my_room_in_profile").m68794u()));
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m71705k(BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile) {
        if (mbs.m157821G().mo68436Zo().mo136897a()) {
            o1j0.m165649w(R$string.f45710B0);
            return;
        }
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
        if (audioBusinessTypeMo171474c == AudioBusinessType.VIDEO_CHAT) {
            o1j0.m165651y(audioBusinessTypeMo171474c.getBusinessMsg());
            return;
        }
        gfj0.m130080h(false, bLiveVoiceRoomInProfile.anchorId, bLiveVoiceRoomInProfile.voiceLiveId, false, bLiveVoiceRoomInProfile.topicId, true);
        if (TextUtils.equals(this.f46801l, mbs.m157870o0()) && bLiveVoiceRoomInProfile.needBuild) {
            iqn0.m141677e(m71700f(), AnchorStartData.getBuilder().m68746n("my_room_in_profile").m68743k());
        } else if (!bLiveVoiceRoomInProfile.isPersonal || TextUtils.equals(this.f46801l, mbs.m157870o0())) {
            m71700f().startActivity(tbs.f172993f.m143704f(m71700f(), AudienceStartData.getBuilder().m68777E(bLiveVoiceRoomInProfile.voiceLiveId).m68787O("my_room_in_profile").m68798y("").m68789Q(true).m68799z(this.f46801l).m68794u()));
        } else {
            o1j0.m165651y("私人房暂不对外开放~");
        }
    }

    /* JADX INFO: renamed from: l */
    public void m71706l(bkj0<ValueObject, ValueObject, Boolean> bkj0Var, String str) {
        this.f46801l = str;
        ValueObject valueObject = bkj0Var.f77081a;
        BLiveRoomInProfile bLiveRoomInProfile = valueObject instanceof BLiveRoomInProfile ? (BLiveRoomInProfile) valueObject : null;
        ValueObject valueObject2 = bkj0Var.f77082b;
        m71708n(pf60.m172085a(bLiveRoomInProfile, valueObject2 instanceof BLiveVoiceRoomInProfile ? (BLiveVoiceRoomInProfile) valueObject2 : null), this.f46799j, this.f46800k, null);
    }

    /* JADX INFO: renamed from: m */
    public void m71707m(final BLiveRoomInProfile bLiveRoomInProfile) {
        bnl0.m105524M(this.f46791b, true);
        bnl0.m105524M(this.f46793d, false);
        bnl0.m105524M(this.f46792c, false);
        izs.m142872w("context_square", this.f46791b, bLiveRoomInProfile.background, new C12736d());
        izs.m142868s("context_square", this.f46795f, bLiveRoomInProfile.anchorAvatar);
        this.f46796g.setText(bLiveRoomInProfile.title);
        this.f46797h.setText(bLiveRoomInProfile.subTitle);
        bnl0.m105509E0(getRootView(), new View.OnClickListener() { // from class: l.t320
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171888a.m71702h(bLiveRoomInProfile, view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m71708n(pf60<BLiveRoomInProfile, BLiveVoiceRoomInProfile> pf60Var, y20<BLiveRoomInProfile> y20Var, y20<BLiveVoiceRoomInProfile> y20Var2, String str) {
        if (pf60Var.f152156a == null && pf60Var.f152157b == null) {
            getRootView().setVisibility(8);
            return;
        }
        qnp0.m177261d1(this.f46790a, qa00.f156326m);
        getRootView().setVisibility(0);
        BLiveRoomInProfile bLiveRoomInProfile = pf60Var.f152156a;
        if (bLiveRoomInProfile != null) {
            m71707m(bLiveRoomInProfile);
        }
        BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile = pf60Var.f152157b;
        if (bLiveVoiceRoomInProfile != null) {
            m71709o(bLiveVoiceRoomInProfile);
        }
        this.f46799j = y20Var;
        this.f46800k = y20Var2;
    }

    /* JADX INFO: renamed from: o */
    public final void m71709o(final BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile) {
        bnl0.m105524M(this.f46791b, false);
        bnl0.m105524M(this.f46793d, false);
        bnl0.m105524M(this.f46792c, true);
        this.f46796g.setText(bLiveVoiceRoomInProfile.title);
        this.f46797h.setText(bLiveVoiceRoomInProfile.subTitle);
        this.f46798i.setText(bLiveVoiceRoomInProfile.membersText);
        this.f46792c.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f46792c.mo69680g(bLiveVoiceRoomInProfile.background, -1, new C12735c(), true);
        if (!jyb.m147479J(bLiveVoiceRoomInProfile.userAvatars)) {
            izs.m142870u("context_square", this.f46795f, bLiveVoiceRoomInProfile.userAvatars.get(0), qa00.m175859d(48.0f), qa00.m175859d(48.0f));
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.u320
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177279a.m71703i(bLiveVoiceRoomInProfile, view);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m71701g();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71699e(this);
        this.f46799j = new C12733a();
        this.f46800k = new C12734b();
    }

    public MyRoomInExpandedCard(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyRoomInExpandedCard(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
