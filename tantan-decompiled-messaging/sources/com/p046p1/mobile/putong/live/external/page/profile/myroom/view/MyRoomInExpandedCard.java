package com.p046p1.mobile.putong.live.external.page.profile.myroom.view;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveRoomInProfile;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomInProfile;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.data.ValueObject;
import p147v.VDraweeView;
import p147v.VFrame;
import p149l.ap0;
import p149l.c6j0;
import p149l.e30;
import p149l.ehn0;
import p149l.hxs;
import p149l.ib1;
import p149l.j760;
import p149l.l9s;
import p149l.lsi0;
import p149l.mep0;
import p149l.ngm;
import p149l.nv10;
import p149l.s9s;
import p149l.t100;
import p149l.vwb;
import p149l.wo0;
import p149l.xaj0;
import p149l.xdl0;
import p149l.ym2;

/* JADX INFO: loaded from: classes13.dex */
public class MyRoomInExpandedCard extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f45942a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f45943b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f45944c;

    /* JADX INFO: renamed from: d */
    public View f45945d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f45946e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f45947f;

    /* JADX INFO: renamed from: g */
    public TextView f45948g;

    /* JADX INFO: renamed from: h */
    public TextView f45949h;

    /* JADX INFO: renamed from: i */
    public TextView f45950i;

    /* JADX INFO: renamed from: j */
    public e30<BLiveRoomInProfile> f45951j;

    /* JADX INFO: renamed from: k */
    public e30<BLiveVoiceRoomInProfile> f45952k;

    /* JADX INFO: renamed from: l */
    public String f45953l;

    /* JADX INFO: renamed from: m */
    public ObjectAnimator f45954m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInExpandedCard$a */
    public class C12570a implements e30<BLiveRoomInProfile> {
        public C12570a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(BLiveRoomInProfile bLiveRoomInProfile) {
            MyRoomInExpandedCard.this.m70521j(bLiveRoomInProfile);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInExpandedCard$b */
    public class C12571b implements e30<BLiveVoiceRoomInProfile> {
        public C12571b() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile) {
            MyRoomInExpandedCard.this.m70522k(bLiveVoiceRoomInProfile);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInExpandedCard$c */
    public class C12572c extends ap0 {
        public C12572c() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: d */
        public void mo70529d(@NonNull wo0 wo0Var) {
            super.mo70529d(wo0Var);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInExpandedCard$d */
    public class C12573d extends ym2 {
        public C12573d() {
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
        }
    }

    public MyRoomInExpandedCard(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m70516e(View view) {
        nv10.m161529a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final Act m70517f() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: g */
    public final void m70518g() {
        this.f45944c.clearAnimation();
        ObjectAnimator objectAnimator = this.f45954m;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m70519h(BLiveRoomInProfile bLiveRoomInProfile, View view) {
        e30<BLiveRoomInProfile> e30Var = this.f45951j;
        if (e30Var != null) {
            e30Var.call(bLiveRoomInProfile);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m70520i(BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile, View view) {
        e30<BLiveVoiceRoomInProfile> e30Var = this.f45952k;
        if (e30Var != null) {
            e30Var.call(bLiveVoiceRoomInProfile);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m70521j(BLiveRoomInProfile bLiveRoomInProfile) {
        if (l9s.m149044G().mo67253Zo().mo111890a()) {
            lsi0.m151593w(R$string.f44862B0);
            return;
        }
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
        if (audioBusinessTypeMo135235c == AudioBusinessType.VIDEO_CHAT) {
            lsi0.m151595y(audioBusinessTypeMo135235c.getBusinessMsg());
            return;
        }
        c6j0.m105479e(false, bLiveRoomInProfile.anchorId, bLiveRoomInProfile.liveId, bLiveRoomInProfile.status, bLiveRoomInProfile.multiCallInfo.role, "");
        if (TextUtils.equals(this.f45953l, l9s.m149093o0())) {
            s9s.f163232f.m134368a(m70517f(), AnchorStartData.getBuilder().m67562m(false).m67563n("my_room_in_profile").m67560k());
        } else {
            m70517f().startActivity(s9s.f163232f.m134373f(m70517f(), AudienceStartData.getBuilder().m67594E(bLiveRoomInProfile.liveId).m67616z(this.f45953l).m67604O("my_room_in_profile").m67611u()));
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m70522k(BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile) {
        if (l9s.m149044G().mo67253Zo().mo111890a()) {
            lsi0.m151593w(R$string.f44862B0);
            return;
        }
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
        if (audioBusinessTypeMo135235c == AudioBusinessType.VIDEO_CHAT) {
            lsi0.m151595y(audioBusinessTypeMo135235c.getBusinessMsg());
            return;
        }
        c6j0.m105482h(false, bLiveVoiceRoomInProfile.anchorId, bLiveVoiceRoomInProfile.voiceLiveId, false, bLiveVoiceRoomInProfile.topicId, true);
        if (TextUtils.equals(this.f45953l, l9s.m149093o0()) && bLiveVoiceRoomInProfile.needBuild) {
            ehn0.m116502e(m70517f(), AnchorStartData.getBuilder().m67563n("my_room_in_profile").m67560k());
        } else if (!bLiveVoiceRoomInProfile.isPersonal || TextUtils.equals(this.f45953l, l9s.m149093o0())) {
            m70517f().startActivity(s9s.f163232f.m134373f(m70517f(), AudienceStartData.getBuilder().m67594E(bLiveVoiceRoomInProfile.voiceLiveId).m67604O("my_room_in_profile").m67615y("").m67606Q(true).m67616z(this.f45953l).m67611u()));
        } else {
            lsi0.m151595y("私人房暂不对外开放~");
        }
    }

    /* JADX INFO: renamed from: l */
    public void m70523l(xaj0<ValueObject, ValueObject, Boolean> xaj0Var, String str) {
        this.f45953l = str;
        ValueObject valueObject = xaj0Var.f191751a;
        BLiveRoomInProfile bLiveRoomInProfile = valueObject instanceof BLiveRoomInProfile ? (BLiveRoomInProfile) valueObject : null;
        ValueObject valueObject2 = xaj0Var.f191752b;
        m70525n(j760.m140076a(bLiveRoomInProfile, valueObject2 instanceof BLiveVoiceRoomInProfile ? (BLiveVoiceRoomInProfile) valueObject2 : null), this.f45951j, this.f45952k, null);
    }

    /* JADX INFO: renamed from: m */
    public void m70524m(final BLiveRoomInProfile bLiveRoomInProfile) {
        xdl0.m208344M(this.f45943b, true);
        xdl0.m208344M(this.f45945d, false);
        xdl0.m208344M(this.f45944c, false);
        hxs.m133410w("context_square", this.f45943b, bLiveRoomInProfile.background, new C12573d());
        hxs.m133406s("context_square", this.f45947f, bLiveRoomInProfile.anchorAvatar);
        this.f45948g.setText(bLiveRoomInProfile.title);
        this.f45949h.setText(bLiveRoomInProfile.subTitle);
        xdl0.m208329E0(getRootView(), new View.OnClickListener() { // from class: l.lv10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130113a.m70519h(bLiveRoomInProfile, view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m70525n(j760<BLiveRoomInProfile, BLiveVoiceRoomInProfile> j760Var, e30<BLiveRoomInProfile> e30Var, e30<BLiveVoiceRoomInProfile> e30Var2, String str) {
        if (j760Var.f116564a == null && j760Var.f116565b == null) {
            getRootView().setVisibility(8);
            return;
        }
        mep0.m154302d1(this.f45942a, t100.f167264m);
        getRootView().setVisibility(0);
        BLiveRoomInProfile bLiveRoomInProfile = j760Var.f116564a;
        if (bLiveRoomInProfile != null) {
            m70524m(bLiveRoomInProfile);
        }
        BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile = j760Var.f116565b;
        if (bLiveVoiceRoomInProfile != null) {
            m70526o(bLiveVoiceRoomInProfile);
        }
        this.f45951j = e30Var;
        this.f45952k = e30Var2;
    }

    /* JADX INFO: renamed from: o */
    public final void m70526o(final BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile) {
        xdl0.m208344M(this.f45943b, false);
        xdl0.m208344M(this.f45945d, false);
        xdl0.m208344M(this.f45944c, true);
        this.f45948g.setText(bLiveVoiceRoomInProfile.title);
        this.f45949h.setText(bLiveVoiceRoomInProfile.subTitle);
        this.f45950i.setText(bLiveVoiceRoomInProfile.membersText);
        this.f45944c.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f45944c.mo68497g(bLiveVoiceRoomInProfile.background, -1, new C12572c(), true);
        if (!vwb.m200296J(bLiveVoiceRoomInProfile.userAvatars)) {
            hxs.m133408u("context_square", this.f45947f, bLiveVoiceRoomInProfile.userAvatars.get(0), t100.m186890d(48.0f), t100.m186890d(48.0f));
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.mv10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135861a.m70520i(bLiveVoiceRoomInProfile, view);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m70518g();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70516e(this);
        this.f45951j = new C12570a();
        this.f45952k = new C12571b();
    }

    public MyRoomInExpandedCard(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyRoomInExpandedCard(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
