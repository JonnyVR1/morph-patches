package p149l;

import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.CardPhotoFrame;
import com.p046p1.mobile.putong.core.newui.home.views.CardPictureViewOpt;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListFragExpandedImpl;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundLinearLayout;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class ccr extends p3l {

    /* JADX INFO: renamed from: o */
    public static final int f80288o = f6c0.f95443L0;

    /* JADX INFO: renamed from: f */
    public CardPhotoFrame f80289f;

    /* JADX INFO: renamed from: g */
    public CardPictureViewOpt f80290g;

    /* JADX INFO: renamed from: h */
    public VImage f80291h;

    /* JADX INFO: renamed from: i */
    public RoundLinearLayout f80292i;

    /* JADX INFO: renamed from: j */
    public VImage f80293j;

    /* JADX INFO: renamed from: k */
    public VText f80294k;

    /* JADX INFO: renamed from: l */
    public User f80295l;

    /* JADX INFO: renamed from: m */
    public CoreSuggested.UserInfo f80296m;

    /* JADX INFO: renamed from: n */
    public int f80297n;

    /* JADX INFO: renamed from: l.ccr$a */
    public class ViewOnTouchListenerC16107a implements View.OnTouchListener {
        public ViewOnTouchListenerC16107a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (ccr.this.f146992e.mo37930l() == null) {
                return true;
            }
            ccr.this.f146992e.mo37930l().m154080p(ccr.this.f80290g);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public static /* synthetic */ Integer m106140G(j760 j760Var) {
        return (Integer) j760Var.f116564a;
    }

    /* JADX INFO: renamed from: O */
    private boolean m106141O() {
        User user = this.f80295l;
        if (user == null || user.isMe() || this.f80295l.isTeamAccount() || xp5.m210476p(this.f80295l)) {
            return false;
        }
        if (ExpandedCardStyleHelper.m38090o().m38103s()) {
            return true;
        }
        CoreSuggested.UserInfo userInfo = this.f80296m;
        return userInfo != null && userInfo.renderFrom == CardInfoRenderFrom.PROFILE;
    }

    @Override // p149l.p3l
    /* JADX INFO: renamed from: B */
    public void mo38150B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        this.f80295l = user;
        this.f80296m = userInfo;
        this.f80297n = i3;
        m106148N(i3);
        m106143I();
        this.f80290g.setOnTouchListener(new ViewOnTouchListenerC16107a());
    }

    /* JADX INFO: renamed from: H */
    public final void m106142H(View view) {
        dcr.m110872a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final void m106143I() {
        if (this.f80291h == null) {
            return;
        }
        boolean zM106141O = m106141O();
        xdl0.m208344M(this.f80291h, zM106141O);
        if (zM106141O) {
            CoreSuggested.UserInfo userInfo = this.f80296m;
            final boolean z = userInfo != null && userInfo.renderFrom == CardInfoRenderFrom.PROFILE;
            if (userInfo != null) {
                String strM107929a = co5.m107929a("profile_life_photo_compliment_btn");
                if (!TextUtils.isEmpty(strM107929a)) {
                    co5.m107934f(m167250A(this.f80296m), strM107929a);
                }
            }
            xdl0.m208329E0(this.f80291h, new View.OnClickListener() { // from class: l.ybr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f197353a.m106145K(z, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Unit m106144J(boolean z, User user) {
        bo5.m102898i().invoke(user);
        if (z && (m167252w() instanceof ProfileAct)) {
            PutongFrag putongFragM50748C2 = ((ProfileAct) m167252w()).m50748C2();
            if (putongFragM50748C2 instanceof ProfileListFragExpandedImpl) {
                ((ProfileListFragExpandedImpl) putongFragM50748C2).m52413V4().m109227n1(SwipeDirection.REMOVE.getValue());
            } else {
                m167252w().lambda$debugItems$19();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m106145K(final boolean z, View view) {
        if (this.f80295l == null || jo5.m142416b(m167252w(), this.f80296m, this.f80295l, "profile_life_photo_compliment_btn")) {
            return;
        }
        bo5.m102903n(m167252w(), this.f80295l, "profile_life_photo_compliment_btn", Integer.valueOf(this.f80297n), null, new Function1() { // from class: l.bcr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f74959a.m106144J(z, (User) obj);
            }
        }, this.f80296m.liveRoomInfo);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m106146L(Media media, Integer num) {
        if (num.intValue() >= 100) {
            xdl0.m208344M(this.f80292i, false);
        }
        this.f80290g.m39097F(media, num.intValue());
    }

    /* JADX INFO: renamed from: M */
    public final void m106147M(Media media) {
        if (!TEnum.equals(media.status, "raw")) {
            zub.m220215n(media);
        } else if (media instanceof Video) {
            qib0.f154691G.m102377x0(media.url);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m106148N(int i) {
        int i2;
        User user = this.f80295l;
        if (user == null || user.pictures == null) {
            return;
        }
        xdl0.m208344M(this.f80292i, false);
        if (u59.m191823d0()) {
            this.f80294k.setGravity(1);
            VText vText = this.f80294k;
            int i3 = t100.f167259h;
            vText.setPadding(i3, 0, i3, 0);
            this.f80294k.setText(m167252w().getString(R$string.f18756n9));
            this.f80293j.setBackgroundResource(x2c0.f189417I9);
        }
        if (this.f80295l.pictures.size() > i) {
            final Media media = this.f80295l.media(i);
            if ("live_profile_voice_mask_mode".equals(this.f80296m.from)) {
                this.f80290g.m39097F(media, 0);
            } else if (plf.m170174f(this.f80295l)) {
                r4w r4wVar = r4w.INSTANCE;
                if (r4wVar.m177848C(this.f80295l.f56011id)) {
                    this.f80290g.m39097F(media, 0);
                } else {
                    m209781k(m167252w(), r4wVar.m177851F(this.f80295l.f56011id)).map(new w9j() { // from class: l.zbr
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return ccr.m106140G((j760) obj);
                        }
                    }).subscribe(mkd0.m154955G(new e30() { // from class: l.acr
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f68872a.m106146L(media, (Integer) obj);
                        }
                    }));
                }
                if (!"from_voice_buzz".equals(this.f80296m.from)) {
                    xdl0.m208344M(this.f80292i, true);
                }
            } else {
                this.f80290g.m39096E(media);
            }
            if (Build.VERSION.SDK_INT < 33 || this.f80295l.pictures.size() <= (i2 = i + 1)) {
                return;
            }
            m106147M(this.f80295l.media(i2));
        }
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: g */
    public void mo38153g(View view) {
        super.mo38153g(view);
        m106142H(view);
        this.f80290g.setStyle(CardPictureViewOpt.LayoutStyle.LIFE_PHOTO);
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: q */
    public void mo38154q(boolean z) {
        CardPictureViewOpt cardPictureViewOpt;
        if (z || (cardPictureViewOpt = this.f80290g) == null) {
            return;
        }
        cardPictureViewOpt.m39094C();
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: s */
    public void mo106149s() {
        super.mo106149s();
        CardPictureViewOpt cardPictureViewOpt = this.f80290g;
        if (cardPictureViewOpt != null) {
            cardPictureViewOpt.mo36115b(true);
        }
    }
}
