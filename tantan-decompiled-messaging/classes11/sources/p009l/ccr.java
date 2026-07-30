package p009l;

import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.view.CardPhotoFrame;
import com.p000p1.mobile.putong.core.newui.home.views.CardPictureViewOpt;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragExpandedImpl;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundLinearLayout;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l.bo5;
import l.co5;
import l.d30;
import l.dcr;
import l.e30;
import l.f6c0;
import l.j760;
import l.jo5;
import l.mkd0;
import l.qib0;
import l.r4w;
import l.t100;
import l.u59;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.xp5;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ccr extends p3l {

    /* JADX INFO: renamed from: o */
    public static final int f10530o = f6c0.L0;

    /* JADX INFO: renamed from: f */
    public CardPhotoFrame f10531f;

    /* JADX INFO: renamed from: g */
    public CardPictureViewOpt f10532g;

    /* JADX INFO: renamed from: h */
    public VImage f10533h;

    /* JADX INFO: renamed from: i */
    public RoundLinearLayout f10534i;

    /* JADX INFO: renamed from: j */
    public VImage f10535j;

    /* JADX INFO: renamed from: k */
    public VText f10536k;

    /* JADX INFO: renamed from: l */
    public User f10537l;

    /* JADX INFO: renamed from: m */
    public CoreSuggested.UserInfo f10538m;

    /* JADX INFO: renamed from: n */
    public int f10539n;

    /* JADX INFO: renamed from: l.ccr$a */
    public class ViewOnTouchListenerC0805a implements View.OnTouchListener {
        public ViewOnTouchListenerC0805a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (ccr.this.f18373e.mo1904l() == null) {
                return true;
            }
            ccr.this.f18373e.mo1904l().m18417p(ccr.this.f10532g);
            return true;
        }
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ Integer m12501G(j760 j760Var) {
        return (Integer) j760Var.a;
    }

    /* JADX INFO: renamed from: O */
    private boolean m12502O() {
        User user = this.f10537l;
        if (user == null || user.isMe() || this.f10537l.isTeamAccount() || xp5.p(this.f10537l)) {
            return false;
        }
        if (ExpandedCardStyleHelper.m2064o().m2077s()) {
            return true;
        }
        CoreSuggested.UserInfo userInfo = this.f10538m;
        return userInfo != null && userInfo.renderFrom == CardInfoRenderFrom.PROFILE;
    }

    @Override // p009l.p3l
    /* JADX INFO: renamed from: B */
    public void mo2124B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        this.f10537l = user;
        this.f10538m = userInfo;
        this.f10539n = i3;
        m12509N(i3);
        m12504I();
        this.f10532g.setOnTouchListener(new ViewOnTouchListenerC0805a());
    }

    /* JADX INFO: renamed from: H */
    public final void m12503H(View view) {
        dcr.a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final void m12504I() {
        if (this.f10533h == null) {
            return;
        }
        boolean zM12502O = m12502O();
        xdl0.M(this.f10533h, zM12502O);
        if (zM12502O) {
            CoreSuggested.UserInfo userInfo = this.f10538m;
            final boolean z = userInfo != null && userInfo.renderFrom == CardInfoRenderFrom.PROFILE;
            if (userInfo != null) {
                String strA = co5.a("profile_life_photo_compliment_btn");
                if (!TextUtils.isEmpty(strA)) {
                    co5.f(m20096A(this.f10538m), strA);
                }
            }
            xdl0.E0(this.f10533h, new View.OnClickListener() { // from class: l.ybr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22990a.m12506K(z, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Unit m12505J(boolean z, User user) {
        bo5.i().invoke(user);
        if (z && (m20098w() instanceof ProfileAct)) {
            ProfileListFragExpandedImpl profileListFragExpandedImplC2 = m20098w().C2();
            if (profileListFragExpandedImplC2 instanceof ProfileListFragExpandedImpl) {
                profileListFragExpandedImplC2.V4().n1(SwipeDirection.REMOVE.getValue());
            } else {
                m20098w().finish();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m12506K(final boolean z, View view) {
        if (this.f10537l == null || jo5.b(m20098w(), this.f10538m, this.f10537l, "profile_life_photo_compliment_btn")) {
            return;
        }
        bo5.n(m20098w(), this.f10537l, "profile_life_photo_compliment_btn", Integer.valueOf(this.f10539n), (d30) null, new Function1() { // from class: l.bcr
            public final Object invoke(Object obj) {
                return this.f10015a.m12505J(z, (User) obj);
            }
        }, this.f10538m.liveRoomInfo);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m12507L(Media media, Integer num) {
        if (num.intValue() >= 100) {
            xdl0.M(this.f10534i, false);
        }
        this.f10532g.m3104F(media, num.intValue());
    }

    /* JADX INFO: renamed from: M */
    public final void m12508M(Media media) {
        if (!TEnum.equals(media.status, "raw")) {
            zub.m25974n(media);
        } else if (media instanceof Video) {
            qib0.G.x0(media.url);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m12509N(int i) {
        int i2;
        User user = this.f10537l;
        if (user == null || user.pictures == null) {
            return;
        }
        xdl0.M(this.f10534i, false);
        if (u59.d0()) {
            this.f10536k.setGravity(1);
            VText vText = this.f10536k;
            int i3 = t100.h;
            vText.setPadding(i3, 0, i3, 0);
            this.f10536k.setText(m20098w().getString(R.string.n9));
            this.f10535j.setBackgroundResource(x2c0.I9);
        }
        if (this.f10537l.pictures.size() > i) {
            final Media media = this.f10537l.media(i);
            if ("live_profile_voice_mask_mode".equals(this.f10538m.from)) {
                this.f10532g.m3104F(media, 0);
            } else if (plf.m20503f(this.f10537l)) {
                r4w r4wVar = r4w.INSTANCE;
                if (r4wVar.C(((DbObject) this.f10537l).id)) {
                    this.f10532g.m3104F(media, 0);
                } else {
                    m24919k(m20098w(), r4wVar.F(((DbObject) this.f10537l).id)).map(new w9j() { // from class: l.zbr
                        public final Object call(Object obj) {
                            return ccr.m12501G((j760) obj);
                        }
                    }).subscribe(mkd0.G(new e30() { // from class: l.acr
                        public final void call(Object obj) {
                            this.f9404a.m12507L(media, (Integer) obj);
                        }
                    }));
                }
                if (!"from_voice_buzz".equals(this.f10538m.from)) {
                    xdl0.M(this.f10534i, true);
                }
            } else {
                this.f10532g.m3103E(media);
            }
            if (Build.VERSION.SDK_INT < 33 || this.f10537l.pictures.size() <= (i2 = i + 1)) {
                return;
            }
            m12508M(this.f10537l.media(i2));
        }
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: g */
    public void mo2127g(View view) {
        super.mo2127g(view);
        m12503H(view);
        this.f10532g.setStyle(CardPictureViewOpt.LayoutStyle.LIFE_PHOTO);
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: q */
    public void mo2128q(boolean z) {
        CardPictureViewOpt cardPictureViewOpt;
        if (z || (cardPictureViewOpt = this.f10532g) == null) {
            return;
        }
        cardPictureViewOpt.m3101C();
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: s */
    public void mo12510s() {
        super.mo12510s();
        CardPictureViewOpt cardPictureViewOpt = this.f10532g;
        if (cardPictureViewOpt != null) {
            cardPictureViewOpt.m3108b(true);
        }
    }
}
