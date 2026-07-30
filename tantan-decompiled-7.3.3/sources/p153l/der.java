package p153l;

import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.CardPhotoFrame;
import com.p051p1.mobile.putong.core.newui.home.views.CardPictureViewOpt;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListFragExpandedImpl;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundLinearLayout;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class der extends f6l {

    /* JADX INFO: renamed from: o */
    public static final int f88065o = kec0.f125497L0;

    /* JADX INFO: renamed from: f */
    public CardPhotoFrame f88066f;

    /* JADX INFO: renamed from: g */
    public CardPictureViewOpt f88067g;

    /* JADX INFO: renamed from: h */
    public VImage f88068h;

    /* JADX INFO: renamed from: i */
    public RoundLinearLayout f88069i;

    /* JADX INFO: renamed from: j */
    public VImage f88070j;

    /* JADX INFO: renamed from: k */
    public VText f88071k;

    /* JADX INFO: renamed from: l */
    public User f88072l;

    /* JADX INFO: renamed from: m */
    public CoreSuggested.UserInfo f88073m;

    /* JADX INFO: renamed from: n */
    public int f88074n;

    /* JADX INFO: renamed from: l.der$a */
    public class ViewOnTouchListenerC16511a implements View.OnTouchListener {
        public ViewOnTouchListenerC16511a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (der.this.f97411e.mo38933l() == null) {
                return true;
            }
            der.this.f97411e.mo38933l().m177128p(der.this.f88067g);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public static /* synthetic */ Integer m115459G(pf60 pf60Var) {
        return (Integer) pf60Var.f152156a;
    }

    /* JADX INFO: renamed from: O */
    private boolean m115460O() {
        User user = this.f88072l;
        if (user == null || user.isMe() || this.f88072l.isTeamAccount() || br5.m106045p(this.f88072l)) {
            return false;
        }
        if (ExpandedCardStyleHelper.m39093o().m39106s()) {
            return true;
        }
        CoreSuggested.UserInfo userInfo = this.f88073m;
        return userInfo != null && userInfo.renderFrom == CardInfoRenderFrom.PROFILE;
    }

    @Override // p153l.f6l
    /* JADX INFO: renamed from: B */
    public void mo39153B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        this.f88072l = user;
        this.f88073m = userInfo;
        this.f88074n = i3;
        m115467N(i3);
        m115462I();
        this.f88067g.setOnTouchListener(new ViewOnTouchListenerC16511a());
    }

    /* JADX INFO: renamed from: H */
    public final void m115461H(View view) {
        eer.m120560a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final void m115462I() {
        if (this.f88068h == null) {
            return;
        }
        boolean zM115460O = m115460O();
        bnl0.m105524M(this.f88068h, zM115460O);
        if (zM115460O) {
            CoreSuggested.UserInfo userInfo = this.f88073m;
            final boolean z = userInfo != null && userInfo.renderFrom == CardInfoRenderFrom.PROFILE;
            if (userInfo != null) {
                String strM131227a = gp5.m131227a("profile_life_photo_compliment_btn");
                if (!TextUtils.isEmpty(strM131227a)) {
                    gp5.m131232f(m124281A(this.f88073m), strM131227a);
                }
            }
            bnl0.m105509E0(this.f88068h, new View.OnClickListener() { // from class: l.zdr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f203935a.m115464K(z, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Unit m115463J(boolean z, User user) {
        fp5.m126527i().invoke(user);
        if (z && (m124283w() instanceof ProfileAct)) {
            PutongFrag putongFragM51931D2 = ((ProfileAct) m124283w()).m51931D2();
            if (putongFragM51931D2 instanceof ProfileListFragExpandedImpl) {
                ((ProfileListFragExpandedImpl) putongFragM51931D2).m53596V4().m129190n1(SwipeDirection.REMOVE.getValue());
            } else {
                m124283w().lambda$debugItems$19();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m115464K(final boolean z, View view) {
        if (this.f88072l == null || np5.m164215b(m124283w(), this.f88073m, this.f88072l, "profile_life_photo_compliment_btn")) {
            return;
        }
        fp5.m126532n(m124283w(), this.f88072l, "profile_life_photo_compliment_btn", Integer.valueOf(this.f88074n), null, new Function1() { // from class: l.cer
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f81412a.m115463J(z, (User) obj);
            }
        }, this.f88073m.liveRoomInfo);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m115465L(Media media, Integer num) {
        if (num.intValue() >= 100) {
            bnl0.m105524M(this.f88069i, false);
        }
        this.f88067g.m40100F(media, num.intValue());
    }

    /* JADX INFO: renamed from: M */
    public final void m115466M(Media media) {
        if (!TEnum.equals(media.status, "raw")) {
            nwb.m164976n(media);
        } else if (media instanceof Video) {
            uqb0.f180374G.m127160x0(media.url);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m115467N(int i) {
        int i2;
        User user = this.f88072l;
        if (user == null || user.pictures == null) {
            return;
        }
        bnl0.m105524M(this.f88069i, false);
        if (d79.m114675e0()) {
            this.f88071k.setGravity(1);
            VText vText = this.f88071k;
            int i3 = qa00.f156321h;
            vText.setPadding(i3, 0, i3, 0);
            this.f88071k.setText(m124283w().getString(R$string.f19672t9));
            this.f88070j.setBackgroundResource(dbc0.f86274J9);
        }
        if (this.f88072l.pictures.size() > i) {
            final Media media = this.f88072l.media(i);
            if ("live_profile_voice_mask_mode".equals(this.f88073m.from)) {
                this.f88067g.m40100F(media, 0);
            } else if (vmf.m201736f(this.f88072l)) {
                p6w p6wVar = p6w.INSTANCE;
                if (p6wVar.m171055C(this.f88072l.f56859id)) {
                    this.f88067g.m40100F(media, 0);
                } else {
                    m116950k(m124283w(), p6wVar.m171058F(this.f88072l.f56859id)).map(new qcj() { // from class: l.aer
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return der.m115459G((pf60) obj);
                        }
                    }).subscribe(psd0.m173596G(new y20() { // from class: l.ber
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f76409a.m115465L(media, (Integer) obj);
                        }
                    }));
                }
                if (!"from_voice_buzz".equals(this.f88073m.from)) {
                    bnl0.m105524M(this.f88069i, true);
                }
            } else {
                this.f88067g.m40099E(media);
            }
            if (Build.VERSION.SDK_INT < 33 || this.f88072l.pictures.size() <= (i2 = i + 1)) {
                return;
            }
            m115466M(this.f88072l.media(i2));
        }
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: g */
    public void mo39156g(View view) {
        super.mo39156g(view);
        m115461H(view);
        this.f88067g.setStyle(CardPictureViewOpt.LayoutStyle.LIFE_PHOTO);
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: q */
    public void mo39157q(boolean z) {
        CardPictureViewOpt cardPictureViewOpt;
        if (z || (cardPictureViewOpt = this.f88067g) == null) {
            return;
        }
        cardPictureViewOpt.m40097C();
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: s */
    public void mo115468s() {
        super.mo115468s();
        CardPictureViewOpt cardPictureViewOpt = this.f88067g;
        if (cardPictureViewOpt != null) {
            cardPictureViewOpt.mo37118b(true);
        }
    }
}
