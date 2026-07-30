package com.p051p1.mobile.putong.core.newui.newmeet.feed;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0223a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4904s;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.businessdata.meet.AbsMeetListData;
import com.p051p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.IMeetListData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedSeeItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedVideoItemData;
import com.p051p1.mobile.putong.core.data.LikedUser;
import com.p051p1.mobile.putong.core.data.LiveType;
import com.p051p1.mobile.putong.core.data.MeetRelation;
import com.p051p1.mobile.putong.core.data.MyMeetFeedItem;
import com.p051p1.mobile.putong.core.data.MyMeetLiveItem;
import com.p051p1.mobile.putong.core.data.OverHeatingStatus;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.MeetFeedBaseItemView;
import com.p051p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFragPresenter;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Region;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame_Shadow;
import p151v.VImage;
import p151v.VLinear_FillerMeasure;
import p151v.VText;
import p151v.text.CustomTypefaceSpan;
import p153l.bnl0;
import p153l.c17;
import p153l.cey;
import p153l.czl;
import p153l.dby;
import p153l.gbc0;
import p153l.gta;
import p153l.i4g0;
import p153l.jyb;
import p153l.q8g0;
import p153l.q9y;
import p153l.qa00;
import p153l.qcj;
import p153l.uqb0;
import p153l.vnb;
import p153l.y20;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class MeetFeedBaseItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f26907d;

    /* JADX INFO: renamed from: e */
    public HeaderFrameWrapper f26908e;

    /* JADX INFO: renamed from: f */
    public VLinear_FillerMeasure f26909f;

    /* JADX INFO: renamed from: g */
    public VText f26910g;

    /* JADX INFO: renamed from: h */
    public Space f26911h;

    /* JADX INFO: renamed from: i */
    public VImage f26912i;

    /* JADX INFO: renamed from: j */
    public Space f26913j;

    /* JADX INFO: renamed from: k */
    public ODiamondTagLabel f26914k;

    /* JADX INFO: renamed from: l */
    public VText f26915l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f26916m;

    /* JADX INFO: renamed from: n */
    public VFrame_Shadow f26917n;

    /* JADX INFO: renamed from: o */
    public ImageView f26918o;

    /* JADX INFO: renamed from: p */
    public ImageView f26919p;

    /* JADX INFO: renamed from: q */
    public VFrame_Shadow f26920q;

    /* JADX INFO: renamed from: r */
    public TextView f26921r;

    /* JADX INFO: renamed from: s */
    public FrameLayout f26922s;

    /* JADX INFO: renamed from: t */
    public TextView f26923t;

    /* JADX INFO: renamed from: u */
    public View f26924u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f26925v;

    /* JADX INFO: renamed from: w */
    public CoreExpandableTextContainer f26926w;

    /* JADX INFO: renamed from: x */
    public czl f26927x;

    /* JADX INFO: renamed from: y */
    public IMeetListData f26928y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f26929z;

    public MeetFeedBaseItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m43810i0(MeetFeedItemData meetFeedItemData, User user, boolean z) {
        meetFeedItemData.isAllShow = z;
        if (z) {
            i4g0.m138523u("e_meet_card_unfold", "p_meet", jyb.m147494Y("other_user_id", user.f56859id));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m43811j0(User user, int[] iArr, StringBuilder sb, final Tag tag) {
        Tag tag2 = (Tag) jyb.m147529r(user.profile.tags, new qcj() { // from class: l.l9y
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Tag) obj).value, tag.value));
            }
        });
        if (tag2 != null) {
            if (iArr[0] > 0) {
                sb.append("，");
                sb.append(tag2.value);
            } else {
                sb.append(tag2.value);
            }
            iArr[0] = iArr[0] + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m43818y0(View view) {
        this.f26929z.performClick();
    }

    /* JADX INFO: renamed from: B0 */
    public void m43819B0(AbsMeetListData absMeetListData, NewMeetFragPresenter newMeetFragPresenter) {
        String strConcat;
        String str;
        String strConcat2;
        this.f26928y = absMeetListData;
        VText vText = this.f26910g;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        MyMeetFeedItem myMeetFeedItem = absMeetListData.item;
        if (myMeetFeedItem.readStatus == 0) {
            newMeetFragPresenter.m44013L0(myMeetFeedItem.f21195id);
        }
        IMeetListData iMeetListData = this.f26928y;
        boolean z = iMeetListData instanceof MeetFeedSeeItemData;
        VText vText2 = this.f26910g;
        if (z) {
            vText2.setText("喜欢我的人");
            bnl0.m105524M(this.f26907d, false);
            CoreLikers.C4870a c4870aM31485v5 = CoreModule.f18264c.f20429u0.m31485v5();
            if (!NullChecker.m82486a(c4870aM31485v5) || jyb.m147479J(c4870aM31485v5.f20014d)) {
                uqb0.f180374G.m127138Y0(this.f26929z, gbc0.f103128I0);
            } else {
                Picture.ImageUri imageUriM43825r0 = m43825r0(c4870aM31485v5.f20014d.get(0));
                boolean zMo36014Fs = CoreModule.m30933P().m143410g().mo36014Fs();
                VDraweeView vDraweeView = this.f26929z;
                if (zMo36014Fs) {
                    vnb.m201962v1(vDraweeView, imageUriM43825r0, gbc0.f103128I0);
                } else {
                    vnb.m201963w1(vDraweeView, imageUriM43825r0, gbc0.f103128I0);
                }
            }
            IMeetListData iMeetListData2 = this.f26928y;
            int i = ((MeetFeedSeeItemData) iMeetListData2).item.lowPopSeeCount;
            VText vText3 = this.f26915l;
            if (i == 0) {
                vText3.setText(String.format("%s位用户喜欢了你", Integer.valueOf(((MeetFeedSeeItemData) iMeetListData2).item.seeCount)));
            } else {
                vText3.setText("收到的新喜欢:" + ((MeetFeedSeeItemData) this.f26928y).item.lowPopSeeCount);
            }
            bnl0.m105524M(this.f26923t, false);
            bnl0.m105524M(this.f26917n, false);
            bnl0.m105524M(this.f26919p, false);
            bnl0.m105524M(this.f26920q, true);
            bnl0.m105524M(this.f26926w, false);
            bnl0.m105524M(this.f26913j, true);
            bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.h9y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f108443a.m43818y0(view);
                }
            });
        } else {
            vText2.setText(((AbsMeetUserItemData) iMeetListData).user.name);
            m43823H0((AbsMeetUserItemData) this.f26928y);
            MyMeetLiveItem myMeetLiveItemM35727q4 = CoreModule.f18264c.f20406m1.m35727q4(((AbsMeetUserItemData) this.f26928y).user.f56859id);
            if (NullChecker.m82486a(myMeetLiveItemM35727q4) && myMeetLiveItemM35727q4.anonymous && !jyb.m147479J(((AbsMeetUserItemData) this.f26928y).user.profile.extensions.live.voiceImgUrl)) {
                this.f26908e.m80875B0(((AbsMeetUserItemData) this.f26928y).user.profile.extensions.live.voiceImgUrl.get(0));
            } else if (((AbsMeetUserItemData) this.f26928y).isSeePortraitUser() && CoreModule.m30933P().m143405a().mo34492e2()) {
                HeaderFrameWrapper headerFrameWrapper = this.f26908e;
                IMeetListData iMeetListData3 = this.f26928y;
                headerFrameWrapper.m80894w0(((AbsMeetUserItemData) iMeetListData3).user, ((AbsMeetUserItemData) iMeetListData3).user.m61308fp().profileSmall().formatted());
            } else if (((AbsMeetUserItemData) this.f26928y).isLowSeeSingleUser() && CoreModule.m30933P().m143405a().mo34492e2()) {
                this.f26908e.m80880i0(((AbsMeetUserItemData) this.f26928y).user.m61308fp().profileSmall().formatted(), 2, 8);
            } else {
                this.f26908e.m80891t0(((AbsMeetUserItemData) this.f26928y).user);
                uqb0.f180374G.m127125Q0(this.f26929z, ((AbsMeetUserItemData) this.f26928y).user.m61308fp().profileSmall());
            }
            uqb0.f180396b0.f170325b.showUserVerificationLogo(getContext(), ((AbsMeetUserItemData) this.f26928y).user, this.f26912i);
            bnl0.m105524M(this.f26911h, bnl0.m105529O0(this.f26912i));
            if (CoreModule.f18273l.m143410g().mo36059e() && ((AbsMeetUserItemData) this.f26928y).user.isSupremePartner() && !((AbsMeetUserItemData) this.f26928y).user.isHideIconFromSVipWithMe()) {
                this.f26914k.m80349n0();
                bnl0.m105524M(this.f26913j, true);
                bnl0.m105524M(this.f26914k, true);
            } else if (((AbsMeetUserItemData) this.f26928y).user.isODiamond() && !((AbsMeetUserItemData) this.f26928y).user.isHideIconFromSVipWithMe()) {
                this.f26914k.m80351p0();
                bnl0.m105524M(this.f26913j, true);
                bnl0.m105524M(this.f26914k, true);
            } else if (CoreModule.f18273l.m143410g().mo36051b8() && ((AbsMeetUserItemData) this.f26928y).user.isPlatinum() && !((AbsMeetUserItemData) this.f26928y).user.isHideIconFromSVipWithMe()) {
                this.f26914k.m80348m0();
                bnl0.m105524M(this.f26913j, true);
                bnl0.m105524M(this.f26914k, true);
            } else {
                bnl0.m105524M(this.f26913j, false);
                bnl0.m105524M(this.f26914k, false);
            }
            m43821E0(newMeetFragPresenter);
            TextView textView = this.f26923t;
            int i2 = qa00.f156323j;
            bnl0.m105537U(textView, i2);
            IMeetListData iMeetListData4 = this.f26928y;
            if (iMeetListData4 instanceof MeetFeedItemData) {
                final MeetFeedItemData meetFeedItemData = (MeetFeedItemData) iMeetListData4;
                final User user = meetFeedItemData.user;
                boolean zM147481L = jyb.m147481L(meetFeedItemData.moment.value);
                CoreExpandableTextContainer coreExpandableTextContainer = this.f26926w;
                if (zM147481L) {
                    bnl0.m105524M(coreExpandableTextContainer, false);
                } else {
                    bnl0.m105524M(coreExpandableTextContainer, true);
                    if (this.f26926w.getTextView() != null) {
                        this.f26926w.getTextView().setBreakStrategy(0);
                    }
                    int length = user.name.length();
                    String str2 = user.name;
                    if (length > 10) {
                        strConcat2 = str2.substring(0, 10).concat("...: ");
                    } else {
                        strConcat2 = str2 + ": ";
                    }
                    this.f26926w.m43794H(meetFeedItemData.isAllShow).m43796J(new CoreExpandableTextContainer.InterfaceC8351d() { // from class: l.i9y
                        @Override // com.p051p1.mobile.putong.core.newui.newmeet.feed.CoreExpandableTextContainer.InterfaceC8351d
                        /* JADX INFO: renamed from: a */
                        public final void mo43808a(boolean z2) {
                            MeetFeedBaseItemView.m43810i0(meetFeedItemData, user, z2);
                        }
                    }).m43795I(strConcat2 + meetFeedItemData.moment.value, strConcat2, new CustomTypefaceSpan("sans-serif", typeface, RoundedDrawable.DEFAULT_BORDER_COLOR, 0));
                }
                m43822G0();
            } else if ((iMeetListData4 instanceof MeetFeedUserItemData) && (((MeetFeedUserItemData) iMeetListData4).isSeeUser() || ((MeetFeedUserItemData) this.f26928y).isPicksUser() || ((MeetFeedUserItemData) this.f26928y).isLikedUser() || ((MeetFeedUserItemData) this.f26928y).isSeePortraitUser() || ((MeetFeedUserItemData) this.f26928y).isMomentBeLikeUser() || ((MeetFeedUserItemData) this.f26928y).isMomentLikeUser())) {
                if (((MeetFeedUserItemData) this.f26928y).isMomentBeLikeUser() || ((MeetFeedUserItemData) this.f26928y).isMomentLikeUser()) {
                    bnl0.m105537U(this.f26923t, i2);
                } else if (((MeetFeedUserItemData) this.f26928y).isSeePortraitUser() || !((MeetFeedUserItemData) this.f26928y).isSeePortraitUser()) {
                    bnl0.m105537U(this.f26923t, qa00.f156288A);
                }
                bnl0.m105524M(this.f26926w, true);
                if (this.f26926w.getTextView() != null) {
                    this.f26926w.getTextView().setBreakStrategy(0);
                }
                final User user2 = ((MeetFeedUserItemData) this.f26928y).user;
                int length2 = user2.name.length();
                String str3 = user2.name;
                if (length2 > 10) {
                    strConcat = str3.substring(0, 10).concat("...: ");
                } else {
                    strConcat = str3 + ": ";
                }
                StringBuilder sb = new StringBuilder();
                if (TextUtils.equals(((MeetFeedUserItemData) this.f26928y).item.momentMediaType, C4904s.INSTANCE.m35738a())) {
                    sb.append(((MeetFeedUserItemData) this.f26928y).moment.value);
                } else if (TextUtils.isEmpty(user2.description)) {
                    if (!user2.isHideLocationFromSVip()) {
                        int i3 = user2.location.distance;
                        Region region = CoreModule.f18264c.f20381e0.m116600p9().location.region;
                        if (TextUtils.isEmpty(user2.location.region.district) || !TextUtils.equals(region.city, user2.location.region.city)) {
                            boolean zIsEmpty = TextUtils.isEmpty(user2.location.region.city);
                            Location location = user2.location;
                            if (zIsEmpty) {
                                str = !TextUtils.isEmpty(location.region.country) ? user2.location.region.country : null;
                            } else {
                                str = location.region.city;
                            }
                        } else {
                            str = user2.location.region.district;
                        }
                        if (i3 < 100) {
                            i3 = 100;
                        }
                        String strM107525r0 = c17.m107525r0(i3);
                        if (i3 <= 10000 || TextUtils.isEmpty(str)) {
                            sb.append(strM107525r0);
                        } else {
                            sb.append(str);
                        }
                    }
                    if (!user2.isHideAgeFromSVip()) {
                        sb.append("，");
                        sb.append(user2.age);
                        sb.append("岁");
                    }
                    if (TextUtils.isEmpty(sb.toString())) {
                        sb.append(q8g0.m175804j0(user2.profile.zodiac));
                    } else {
                        sb.append("，");
                        sb.append(q8g0.m175804j0(user2.profile.zodiac));
                    }
                    if (!jyb.m147479J(user2.profile.tags)) {
                        final User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("，喜欢");
                        final int[] iArr = {0};
                        jyb.m147537z(user2.profile.tags, new y20() { // from class: l.j9y
                            @Override // p153l.y20
                            public final void call(Object obj) {
                                MeetFeedBaseItemView.m43811j0(userM116600p9, iArr, sb2, (Tag) obj);
                            }
                        });
                        if (iArr[0] > 0) {
                            sb.append((CharSequence) sb2);
                        }
                    }
                } else {
                    sb.append(user2.description);
                }
                this.f26926w.m43794H(((MeetFeedUserItemData) this.f26928y).isAllShow).m43796J(new CoreExpandableTextContainer.InterfaceC8351d() { // from class: l.k9y
                    @Override // com.p051p1.mobile.putong.core.newui.newmeet.feed.CoreExpandableTextContainer.InterfaceC8351d
                    /* JADX INFO: renamed from: a */
                    public final void mo43808a(boolean z2) {
                        this.f124599a.m43831z0(user2, z2);
                    }
                }).m43795I(strConcat + ((Object) sb), strConcat, new CustomTypefaceSpan("sans-serif", typeface, RoundedDrawable.DEFAULT_BORDER_COLOR, 0));
            } else {
                bnl0.m105524M(this.f26926w, false);
                bnl0.m105537U(this.f26923t, qa00.f156288A);
            }
            m43820D0((AbsMeetUserItemData) this.f26928y, newMeetFragPresenter);
            bnl0.m105524M(this.f26925v, false);
        }
        m43826s0(newMeetFragPresenter);
        this.f26927x.mo103244a(absMeetListData, newMeetFragPresenter.act());
        IMeetListData iMeetListData5 = this.f26928y;
        if (iMeetListData5 instanceof MeetFeedItemData) {
            i4g0.m138492A("e_moment", newMeetFragPresenter.act().pageId(), jyb.m147494Y("moment_id", ((MeetFeedItemData) this.f26928y).moment.f56856id), jyb.m147494Y("moment_type", iMeetListData5 instanceof MeetFeedVideoItemData ? "video" : ReminderAction.photo), jyb.m147494Y("owner_id", ((MeetFeedItemData) this.f26928y).user.f56859id));
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m43820D0(AbsMeetUserItemData absMeetUserItemData, NewMeetFragPresenter newMeetFragPresenter) {
        this.f26923t.setTextColor(Color.parseColor("#fe7e1d"));
        this.f26923t.setBackgroundResource(gbc0.f103072A0);
        String str = absMeetUserItemData.user.isFemale() ? "她" : "他";
        bnl0.m105524M(this.f26924u, false);
        if (absMeetUserItemData.isPicksUser() && (absMeetUserItemData instanceof MeetFeedUserItemData)) {
            bnl0.m105563k(this.f26923t, newMeetFragPresenter.act().drawable(gbc0.f103448z0));
            if (absMeetUserItemData.item.relation.status == RelationshipStatus.get("liked") || absMeetUserItemData.item.relation.status == RelationshipStatus.get("superliked")) {
                bnl0.m105524M(this.f26924u, true);
                this.f26923t.setText("已喜欢");
            } else {
                this.f26923t.setText(String.format("喜欢%s", str));
            }
            this.f26923t.setTextColor(Color.parseColor("#ff4a97"));
        } else if (absMeetUserItemData.isSeeUser() || absMeetUserItemData.isSeePortraitUser() || absMeetUserItemData.isMomentBeLikeUser()) {
            boolean zMo61451Co = CoreModule.m30932N().mo61451Co();
            TextView textView = this.f26923t;
            if (zMo61451Co) {
                bnl0.m105563k(textView, newMeetFragPresenter.act().drawable(gbc0.f103427w0));
                this.f26923t.setText(R$string.f21326H);
            } else {
                bnl0.m105563k(textView, newMeetFragPresenter.act().drawable(gbc0.f103086C0));
                this.f26923t.setText(String.format("回应%s", str));
            }
        } else {
            OverHeatingStatus overHeatingStatus = absMeetUserItemData.item.overheating;
            if (overHeatingStatus.isHot || overHeatingStatus.isStop) {
                bnl0.m105563k(this.f26923t, newMeetFragPresenter.act().drawable(gbc0.f103079B0));
                boolean zMo61451Co2 = CoreModule.m30932N().mo61451Co();
                TextView textView2 = this.f26923t;
                if (zMo61451Co2) {
                    textView2.setText(R$string.f21326H);
                } else {
                    textView2.setText(String.format("回应%s", str));
                }
            } else {
                boolean zMo61451Co3 = CoreModule.m30932N().mo61451Co();
                TextView textView3 = this.f26923t;
                if (zMo61451Co3) {
                    bnl0.m105563k(textView3, newMeetFragPresenter.act().drawable(gbc0.f103427w0));
                    this.f26923t.setText(R$string.f21326H);
                } else {
                    bnl0.m105563k(textView3, newMeetFragPresenter.act().drawable(gbc0.f103086C0));
                    this.f26923t.setText(String.format("回应%s", str));
                }
            }
        }
        if (CoreModule.f18276o.m132214d().mo34703I5() && TextUtils.equals(this.f26923t.getText(), newMeetFragPresenter.act().getString(R$string.f21326H))) {
            this.f26923t.setText("抢先告白");
            this.f26923t.setTextColor(Color.parseColor("#FF55EE"));
            bnl0.m105563k(this.f26923t, newMeetFragPresenter.act().drawable(gbc0.f103434x0));
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m43821E0(NewMeetFragPresenter newMeetFragPresenter) {
        AbsMeetUserItemData absMeetUserItemData = (AbsMeetUserItemData) this.f26928y;
        String str = absMeetUserItemData.user.isFemale() ? "她" : "他";
        bnl0.m105558h0(this.f26918o, qa00.m175859d(10.0f));
        if (absMeetUserItemData.isMomentLikeUser()) {
            this.f26915l.setText("我赞过".concat(str));
            bnl0.m105563k(this.f26915l, newMeetFragPresenter.act().drawable(gbc0.f103121H0));
            bnl0.m105524M(this.f26917n, true);
            this.f26918o.setImageResource(gbc0.f103448z0);
            return;
        }
        if (absMeetUserItemData.isMomentBeLikeUser()) {
            this.f26915l.setText(str.concat("赞过我"));
            bnl0.m105563k(this.f26915l, newMeetFragPresenter.act().drawable(gbc0.f103121H0));
            bnl0.m105524M(this.f26917n, true);
            this.f26918o.setImageResource(gbc0.f103448z0);
            return;
        }
        if (absMeetUserItemData.item.relation.status == RelationshipStatus.get("liked")) {
            this.f26915l.setText("我喜欢了".concat(str));
            bnl0.m105563k(this.f26915l, newMeetFragPresenter.act().drawable(gbc0.f103100E0));
            bnl0.m105524M(this.f26917n, true);
            this.f26918o.setImageResource(gbc0.f103184Q0);
            return;
        }
        if (absMeetUserItemData.item.relation.status == RelationshipStatus.get("superliked")) {
            this.f26915l.setText("我超级喜欢了".concat(str));
            bnl0.m105563k(this.f26915l, newMeetFragPresenter.act().drawable(gbc0.f103114G0));
            bnl0.m105524M(this.f26917n, !CoreModule.m30932N().mo61451Co());
            this.f26918o.setImageResource(gbc0.f103441y0);
            return;
        }
        if (absMeetUserItemData.item.relation.status == RelationshipStatus.get("lettered")) {
            this.f26915l.setText("已抢先表白");
            bnl0.m105563k(this.f26915l, newMeetFragPresenter.act().drawable(gbc0.f103114G0));
            bnl0.m105524M(this.f26917n, false);
            return;
        }
        if (absMeetUserItemData.isSeeUser()) {
            this.f26915l.setText(String.format("%s喜欢了我", str));
            bnl0.m105563k(this.f26915l, newMeetFragPresenter.act().drawable(gbc0.f103100E0));
            bnl0.m105524M(this.f26917n, true);
            this.f26918o.setImageResource(gbc0.f103184Q0);
            return;
        }
        if (absMeetUserItemData.isSeePortraitUser()) {
            this.f26915l.setText("即刻聊天");
            bnl0.m105563k(this.f26915l, newMeetFragPresenter.act().drawable(gbc0.f103177P0));
            bnl0.m105524M(this.f26917n, true);
            this.f26918o.setImageResource(gbc0.f103184Q0);
            return;
        }
        this.f26915l.setText(gta.m132210e().m132214d().mo34719Lc() ? "精选" : "每日心动");
        bnl0.m105563k(this.f26915l, newMeetFragPresenter.act().drawable(gbc0.f103107F0));
        bnl0.m105524M(this.f26917n, true);
        this.f26918o.setImageResource(gbc0.f103184Q0);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m43822G0() {
        if (((MeetFeedItemData) this.f26928y).moment.media.size() != 1) {
            C0223a c0223a = new C0223a();
            c0223a.m1149c(this);
            c0223a.m1162q(this.f26922s.getId(), "1:1");
            c0223a.m1147a(this);
            return;
        }
        String strM109472e = cey.m109472e(((MeetFeedItemData) this.f26928y).moment.media.get(0));
        C0223a c0223a2 = new C0223a();
        c0223a2.m1149c(this);
        c0223a2.m1162q(this.f26922s.getId(), strM109472e);
        c0223a2.m1147a(this);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m43823H0(AbsMeetUserItemData absMeetUserItemData) {
        MyMeetLiveItem myMeetLiveItemM35727q4 = CoreModule.f18264c.f20406m1.m35727q4(absMeetUserItemData.user.f56859id);
        if (!NullChecker.m82486a(myMeetLiveItemM35727q4)) {
            bnl0.m105524M(this.f26907d, false);
            return;
        }
        if (myMeetLiveItemM35727q4.liveType == LiveType.get("live")) {
            i4g0.m138492A("e_live_room_enter", "p_meet", jyb.m147494Y("meet_realtime_relationship", dby.m115174b(absMeetUserItemData, myMeetLiveItemM35727q4, absMeetUserItemData.user)), jyb.m147494Y("module", "meet_feed"), jyb.m147494Y("other_user_id", absMeetUserItemData.user.f56859id), jyb.m147494Y("live_enter_source", "realtime_meet"));
            bnl0.m105524M(this.f26907d, true);
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/72743c67-2110-42bd-974e-377e97d0970910.pdf").into(this.f26907d);
        } else if (myMeetLiveItemM35727q4.liveType == LiveType.get(LiveType.liveVoice)) {
            i4g0.m138492A("e_live_audio_room_enter", "p_meet", jyb.m147494Y("meet_realtime_relationship", dby.m115174b(absMeetUserItemData, myMeetLiveItemM35727q4, absMeetUserItemData.user)), jyb.m147494Y("audio_card_type", "meet_feed"));
            bnl0.m105524M(this.f26907d, true);
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/e7598d54-54de-4388-84e1-793927cb7db410.pdf").into(this.f26907d);
        }
    }

    public czl getContentView() {
        return this.f26927x;
    }

    public float getFeedVisiblePercentInWindow() {
        Rect rect = new Rect();
        this.f26922s.getGlobalVisibleRect(rect);
        int i = rect.bottom;
        if (i > 0) {
            return (i - rect.top) / this.f26922s.getHeight();
        }
        return 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26927x.release();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43824q0(this);
        this.f26929z = this.f26908e.get_pic();
        this.f26908e.setPicFailed(gbc0.f103325j);
        this.f26908e.setPicPlace(gbc0.f103325j);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m43824q0(View view) {
        q9y.m175851a(this, view);
    }

    /* JADX INFO: renamed from: r0 */
    public final Picture.ImageUri m43825r0(User user) {
        if (user != null) {
            return user.m61308fp().profileSmall();
        }
        return null;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m43826s0(final NewMeetFragPresenter newMeetFragPresenter) {
        bnl0.m105509E0(this.f26929z, new View.OnClickListener() { // from class: l.m9y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135447a.m43827t0(newMeetFragPresenter, view);
            }
        });
        if (this.f26928y instanceof AbsMeetUserItemData) {
            bnl0.m105509E0(this.f26919p, new View.OnClickListener() { // from class: l.n9y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f140963a.m43828u0(newMeetFragPresenter, view);
                }
            });
            bnl0.m105509E0(this.f26917n, new View.OnClickListener() { // from class: l.o9y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f145648a.m43829v0(newMeetFragPresenter, view);
                }
            });
            bnl0.m105509E0(this.f26923t, new View.OnClickListener() { // from class: l.p9y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f151191a.m43830w0(newMeetFragPresenter, view);
                }
            });
        }
    }

    public void setMainContentItemView(czl czlVar) {
        this.f26927x = czlVar;
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m43827t0(NewMeetFragPresenter newMeetFragPresenter, View view) {
        IMeetListData iMeetListData = this.f26928y;
        if (iMeetListData instanceof MeetFeedSeeItemData) {
            i4g0.m138523u("e_meet_see_total", "p_meet", jyb.m147494Y("meet_see", "low_pop_level"));
            if (!NullChecker.m82486a(CoreModule.f18264c.m32487o3()) || CoreModule.f18264c.m32487o3().likersLimit.remaining <= 0) {
                CoreModule.m30933P().m143405a().mo34537l1(newMeetFragPresenter.act(), "p_meet_view,e_see_banner,click");
                return;
            } else {
                newMeetFragPresenter.act().startActivityForResult(LikersAct.m57727Y1(newMeetFragPresenter.act(), "from_meet"), 18);
                return;
            }
        }
        if (iMeetListData instanceof AbsMeetUserItemData) {
            AbsMeetUserItemData absMeetUserItemData = (AbsMeetUserItemData) iMeetListData;
            i4g0.m138523u("e_meet_card_avatar", "p_meet", jyb.m147494Y("other_user_id", absMeetUserItemData.user.f56859id));
            MyMeetLiveItem myMeetLiveItemM35727q4 = CoreModule.f18264c.f20406m1.m35727q4(absMeetUserItemData.user.f56859id);
            if (NullChecker.m82486a(myMeetLiveItemM35727q4)) {
                if (myMeetLiveItemM35727q4.liveType == LiveType.get("live")) {
                    i4g0.m138523u("e_live_room_enter", "p_meet", jyb.m147494Y("meet_realtime_relationship", dby.m115174b(absMeetUserItemData, myMeetLiveItemM35727q4, absMeetUserItemData.user)), jyb.m147494Y("module", "meet_feed"), jyb.m147494Y("other_user_id", absMeetUserItemData.user.f56859id), jyb.m147494Y("live_enter_source", "realtime_meet"));
                    newMeetFragPresenter.m44035n1(absMeetUserItemData.user.f56859id, myMeetLiveItemM35727q4.roomId);
                    return;
                } else {
                    if (myMeetLiveItemM35727q4.liveType == LiveType.get(LiveType.liveVoice)) {
                        i4g0.m138523u("e_live_audio_room_enter", "p_meet", jyb.m147494Y("meet_realtime_relationship", dby.m115174b(absMeetUserItemData, myMeetLiveItemM35727q4, absMeetUserItemData.user)), jyb.m147494Y("audio_card_type", "meet_feed"));
                        newMeetFragPresenter.m44036o1(absMeetUserItemData.user.f56859id, myMeetLiveItemM35727q4.roomId);
                        return;
                    }
                    return;
                }
            }
            if (absMeetUserItemData.isLikedUser()) {
                LikedUser likedUserNew_ = LikedUser.new_();
                likedUserNew_.f21174id = absMeetUserItemData.user.f56859id;
                MeetRelation meetRelation = absMeetUserItemData.item.relation;
                likedUserNew_.status = meetRelation.status;
                likedUserNew_.otherStatus = meetRelation.otherStatus;
                newMeetFragPresenter.act().startActivityForResult(CoreModule.m30933P().m143405a().mo34402Rj(newMeetFragPresenter.act(), absMeetUserItemData.user.f56859id, likedUserNew_), 16);
                return;
            }
            if (!absMeetUserItemData.isSeeUser() && !absMeetUserItemData.isSeePortraitUser() && !absMeetUserItemData.isMomentBeLikeUser() && !absMeetUserItemData.isMomentLikeUser()) {
                newMeetFragPresenter.act().startActivityForResult(CoreModule.m30933P().m143405a().mo34553mt(newMeetFragPresenter.act(), absMeetUserItemData.user.f56859id), 16);
            } else if (absMeetUserItemData.isLowSeeSingleUser() && CoreModule.m30933P().m143405a().mo34492e2()) {
                CoreModule.m30933P().m143405a().mo34537l1(newMeetFragPresenter.act(), "");
            } else {
                newMeetFragPresenter.act().startActivityForResult(CoreModule.m30933P().m143405a().mo34415Sq(newMeetFragPresenter.act(), absMeetUserItemData.user.f56859id), 16);
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m43828u0(NewMeetFragPresenter newMeetFragPresenter, View view) {
        newMeetFragPresenter.m44029h1((AbsMeetUserItemData) this.f26928y, false);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m43829v0(NewMeetFragPresenter newMeetFragPresenter, View view) {
        AbsMeetUserItemData absMeetUserItemData = (AbsMeetUserItemData) this.f26928y;
        boolean z = true;
        String str = "I_like_say_hi";
        if (absMeetUserItemData.item.relation.status == RelationshipStatus.get("liked")) {
            newMeetFragPresenter.m44027f1(absMeetUserItemData, true, true, false);
        } else if (absMeetUserItemData.item.relation.status == RelationshipStatus.get("superliked")) {
            newMeetFragPresenter.m44027f1(absMeetUserItemData, true, true, true);
        } else if (absMeetUserItemData.isSeeUser() || absMeetUserItemData.isSeePortraitUser()) {
            newMeetFragPresenter.m44027f1(absMeetUserItemData, true, true, false);
            str = "high_level_pop_see_say_hi";
        } else if (absMeetUserItemData.isPicksUser()) {
            newMeetFragPresenter.m44027f1(absMeetUserItemData, true, true, false);
            str = "picks_say_hi";
        } else {
            if (absMeetUserItemData.isMomentBeLikeUser() || absMeetUserItemData.isMomentLikeUser()) {
                newMeetFragPresenter.m44027f1(absMeetUserItemData, true, false, false);
            }
            z = false;
        }
        User user = absMeetUserItemData.user;
        if (z) {
            i4g0.m138523u("e_meet_card_superlike", "p_meet", jyb.m147494Y("other_user_id", user.f56859id), jyb.m147494Y("meet_say_hi_relationship", str));
        } else {
            i4g0.m138523u("e_meet_card_superlike", "p_meet", jyb.m147494Y("other_user_id", user.f56859id));
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m43830w0(NewMeetFragPresenter newMeetFragPresenter, View view) {
        if (((AbsMeetUserItemData) this.f26928y).isSeeUser() || ((AbsMeetUserItemData) this.f26928y).isSeePortraitUser() || ((AbsMeetUserItemData) this.f26928y).isMomentBeLikeUser() || ((AbsMeetUserItemData) this.f26928y).isMomentLikeUser()) {
            i4g0.m138523u("e_meet_card_sayhi", "p_meet", jyb.m147494Y("meet_say_hi_relationship", "high_level_pop_see_say_hi"), jyb.m147494Y("other_user_id", ((AbsMeetUserItemData) this.f26928y).user.f56859id));
            newMeetFragPresenter.m44027f1((AbsMeetUserItemData) this.f26928y, true, false, false);
            return;
        }
        IMeetListData iMeetListData = this.f26928y;
        if ((iMeetListData instanceof MeetFeedUserItemData) && ((MeetFeedUserItemData) iMeetListData).isPicksUser()) {
            i4g0.m138523u("e_meet_card_sayhi", "p_meet", jyb.m147494Y("meet_say_hi_relationship", "picks_say_hi"), jyb.m147494Y("other_user_id", ((AbsMeetUserItemData) this.f26928y).user.f56859id));
            if (bnl0.m105529O0(this.f26924u)) {
                return;
            }
            newMeetFragPresenter.m44027f1((AbsMeetUserItemData) this.f26928y, true, false, false);
            return;
        }
        IMeetListData iMeetListData2 = this.f26928y;
        if ((iMeetListData2 instanceof MeetFeedUserItemData) && ((MeetFeedUserItemData) iMeetListData2).isLikedUser()) {
            newMeetFragPresenter.m44030i1((MeetFeedUserItemData) this.f26928y, null, null);
            return;
        }
        IMeetListData iMeetListData3 = this.f26928y;
        if (iMeetListData3 instanceof MeetFeedItemData) {
            if (((MeetFeedItemData) iMeetListData3).isPicksUser()) {
                i4g0.m138523u("e_meet_card_sayhi", "p_meet", jyb.m147494Y("meet_say_hi_relationship", "picks_say_hi"), jyb.m147494Y("other_user_id", ((AbsMeetUserItemData) this.f26928y).user.f56859id));
            } else {
                i4g0.m138523u("e_meet_card_sayhi", "p_meet", jyb.m147494Y("meet_say_hi_relationship", "i_like_say_hi"), jyb.m147494Y("other_user_id", ((AbsMeetUserItemData) this.f26928y).user.f56859id));
            }
            MeetFeedItemData meetFeedItemData = (MeetFeedItemData) this.f26928y;
            newMeetFragPresenter.m44030i1(meetFeedItemData, meetFeedItemData.moment.f56856id, meetFeedItemData.originalMoment);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m43831z0(User user, boolean z) {
        ((MeetFeedUserItemData) this.f26928y).isAllShow = z;
        if (z) {
            i4g0.m138523u("e_meet_card_unfold", "p_meet", jyb.m147494Y("other_user_id", user.f56859id));
        }
    }

    public MeetFeedBaseItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MeetFeedBaseItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
