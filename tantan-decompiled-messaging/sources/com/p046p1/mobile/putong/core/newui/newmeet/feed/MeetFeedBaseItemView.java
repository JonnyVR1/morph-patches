package com.p046p1.mobile.putong.core.newui.newmeet.feed;

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
import androidx.constraintlayout.widget.C0222a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4753s;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.businessdata.meet.AbsMeetListData;
import com.p046p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.IMeetListData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedSeeItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedVideoItemData;
import com.p046p1.mobile.putong.core.data.LikedUser;
import com.p046p1.mobile.putong.core.data.LiveType;
import com.p046p1.mobile.putong.core.data.MeetRelation;
import com.p046p1.mobile.putong.core.data.MyMeetFeedItem;
import com.p046p1.mobile.putong.core.data.MyMeetLiveItem;
import com.p046p1.mobile.putong.core.data.OverHeatingStatus;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.MeetFeedBaseItemView;
import com.p046p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFragPresenter;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Region;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame_Shadow;
import p147v.VImage;
import p147v.VLinear_FillerMeasure;
import p147v.VText;
import p147v.text.CustomTypefaceSpan;
import p149l.b3c0;
import p149l.e30;
import p149l.f5y;
import p149l.g2y;
import p149l.hmb;
import p149l.i0g0;
import p149l.kwl;
import p149l.qib0;
import p149l.t0y;
import p149l.t100;
import p149l.ura;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.zvf0;
import p149l.zz6;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class MeetFeedBaseItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f26165d;

    /* JADX INFO: renamed from: e */
    public HeaderFrameWrapper f26166e;

    /* JADX INFO: renamed from: f */
    public VLinear_FillerMeasure f26167f;

    /* JADX INFO: renamed from: g */
    public VText f26168g;

    /* JADX INFO: renamed from: h */
    public Space f26169h;

    /* JADX INFO: renamed from: i */
    public VImage f26170i;

    /* JADX INFO: renamed from: j */
    public Space f26171j;

    /* JADX INFO: renamed from: k */
    public ODiamondTagLabel f26172k;

    /* JADX INFO: renamed from: l */
    public VText f26173l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f26174m;

    /* JADX INFO: renamed from: n */
    public VFrame_Shadow f26175n;

    /* JADX INFO: renamed from: o */
    public ImageView f26176o;

    /* JADX INFO: renamed from: p */
    public ImageView f26177p;

    /* JADX INFO: renamed from: q */
    public VFrame_Shadow f26178q;

    /* JADX INFO: renamed from: r */
    public TextView f26179r;

    /* JADX INFO: renamed from: s */
    public FrameLayout f26180s;

    /* JADX INFO: renamed from: t */
    public TextView f26181t;

    /* JADX INFO: renamed from: u */
    public View f26182u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f26183v;

    /* JADX INFO: renamed from: w */
    public CoreExpandableTextContainer f26184w;

    /* JADX INFO: renamed from: x */
    public kwl f26185x;

    /* JADX INFO: renamed from: y */
    public IMeetListData f26186y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f26187z;

    public MeetFeedBaseItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m42799i0(MeetFeedItemData meetFeedItemData, User user, boolean z) {
        meetFeedItemData.isAllShow = z;
        if (z) {
            zvf0.m220399u("e_meet_card_unfold", "p_meet", vwb.m200311Y("other_user_id", user.f56011id));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m42800j0(User user, int[] iArr, StringBuilder sb, final Tag tag) {
        Tag tag2 = (Tag) vwb.m200346r(user.profile.tags, new w9j() { // from class: l.o0y
            @Override // p149l.w9j
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
    public /* synthetic */ void m42807y0(View view) {
        this.f26187z.performClick();
    }

    /* JADX INFO: renamed from: B0 */
    public void m42808B0(AbsMeetListData absMeetListData, NewMeetFragPresenter newMeetFragPresenter) {
        String strConcat;
        String str;
        String strConcat2;
        this.f26186y = absMeetListData;
        VText vText = this.f26168g;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        MyMeetFeedItem myMeetFeedItem = absMeetListData.item;
        if (myMeetFeedItem.readStatus == 0) {
            newMeetFragPresenter.m43002L0(myMeetFeedItem.f20453id);
        }
        IMeetListData iMeetListData = this.f26186y;
        boolean z = iMeetListData instanceof MeetFeedSeeItemData;
        VText vText2 = this.f26168g;
        if (z) {
            vText2.setText("喜欢我的人");
            xdl0.m208344M(this.f26165d, false);
            CoreLikers.C4719a c4719aM30477t5 = CoreModule.f17545c.f19687u0.m30477t5();
            if (!NullChecker.m81303a(c4719aM30477t5) || vwb.m200296J(c4719aM30477t5.f19272d)) {
                qib0.f154691G.m102354Y0(this.f26187z, b3c0.f72877I0);
            } else {
                Picture.ImageUri imageUriM42814r0 = m42814r0(c4719aM30477t5.f19272d.get(0));
                boolean zMo35011Fs = CoreModule.m29935P().m94656g().mo35011Fs();
                VDraweeView vDraweeView = this.f26187z;
                if (zMo35011Fs) {
                    hmb.m131717v1(vDraweeView, imageUriM42814r0, b3c0.f72877I0);
                } else {
                    hmb.m131718w1(vDraweeView, imageUriM42814r0, b3c0.f72877I0);
                }
            }
            IMeetListData iMeetListData2 = this.f26186y;
            int i = ((MeetFeedSeeItemData) iMeetListData2).item.lowPopSeeCount;
            VText vText3 = this.f26173l;
            if (i == 0) {
                vText3.setText(String.format("%s位用户喜欢了你", Integer.valueOf(((MeetFeedSeeItemData) iMeetListData2).item.seeCount)));
            } else {
                vText3.setText("收到的新喜欢:" + ((MeetFeedSeeItemData) this.f26186y).item.lowPopSeeCount);
            }
            xdl0.m208344M(this.f26181t, false);
            xdl0.m208344M(this.f26175n, false);
            xdl0.m208344M(this.f26177p, false);
            xdl0.m208344M(this.f26178q, true);
            xdl0.m208344M(this.f26184w, false);
            xdl0.m208344M(this.f26171j, true);
            xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.k0y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f120523a.m42807y0(view);
                }
            });
        } else {
            vText2.setText(((AbsMeetUserItemData) iMeetListData).user.name);
            m42812H0((AbsMeetUserItemData) this.f26186y);
            MyMeetLiveItem myMeetLiveItemM34724q4 = CoreModule.f17545c.f19664m1.m34724q4(((AbsMeetUserItemData) this.f26186y).user.f56011id);
            if (NullChecker.m81303a(myMeetLiveItemM34724q4) && myMeetLiveItemM34724q4.anonymous && !vwb.m200296J(((AbsMeetUserItemData) this.f26186y).user.profile.extensions.live.voiceImgUrl)) {
                this.f26166e.m79692B0(((AbsMeetUserItemData) this.f26186y).user.profile.extensions.live.voiceImgUrl.get(0));
            } else if (((AbsMeetUserItemData) this.f26186y).isSeePortraitUser() && CoreModule.m29935P().m94651a().mo33489e2()) {
                HeaderFrameWrapper headerFrameWrapper = this.f26166e;
                IMeetListData iMeetListData3 = this.f26186y;
                headerFrameWrapper.m79711w0(((AbsMeetUserItemData) iMeetListData3).user, ((AbsMeetUserItemData) iMeetListData3).user.m60124fp().profileSmall().formatted());
            } else if (((AbsMeetUserItemData) this.f26186y).isLowSeeSingleUser() && CoreModule.m29935P().m94651a().mo33489e2()) {
                this.f26166e.m79697i0(((AbsMeetUserItemData) this.f26186y).user.m60124fp().profileSmall().formatted(), 2, 8);
            } else {
                this.f26166e.m79708t0(((AbsMeetUserItemData) this.f26186y).user);
                qib0.f154691G.m102341Q0(this.f26187z, ((AbsMeetUserItemData) this.f26186y).user.m60124fp().profileSmall());
            }
            qib0.f154713b0.f139231b.showUserVerificationLogo(getContext(), ((AbsMeetUserItemData) this.f26186y).user, this.f26170i);
            xdl0.m208344M(this.f26169h, xdl0.m208349O0(this.f26170i));
            if (CoreModule.f17554l.m94656g().mo35056e() && ((AbsMeetUserItemData) this.f26186y).user.isSupremePartner() && !((AbsMeetUserItemData) this.f26186y).user.isHideIconFromSVipWithMe()) {
                this.f26172k.m79166n0();
                xdl0.m208344M(this.f26171j, true);
                xdl0.m208344M(this.f26172k, true);
            } else if (((AbsMeetUserItemData) this.f26186y).user.isODiamond() && !((AbsMeetUserItemData) this.f26186y).user.isHideIconFromSVipWithMe()) {
                this.f26172k.m79168p0();
                xdl0.m208344M(this.f26171j, true);
                xdl0.m208344M(this.f26172k, true);
            } else if (CoreModule.f17554l.m94656g().mo35048b8() && ((AbsMeetUserItemData) this.f26186y).user.isPlatinum() && !((AbsMeetUserItemData) this.f26186y).user.isHideIconFromSVipWithMe()) {
                this.f26172k.m79165m0();
                xdl0.m208344M(this.f26171j, true);
                xdl0.m208344M(this.f26172k, true);
            } else {
                xdl0.m208344M(this.f26171j, false);
                xdl0.m208344M(this.f26172k, false);
            }
            m42810E0(newMeetFragPresenter);
            TextView textView = this.f26181t;
            int i2 = t100.f167261j;
            xdl0.m208357U(textView, i2);
            IMeetListData iMeetListData4 = this.f26186y;
            if (iMeetListData4 instanceof MeetFeedItemData) {
                final MeetFeedItemData meetFeedItemData = (MeetFeedItemData) iMeetListData4;
                final User user = meetFeedItemData.user;
                boolean zM200298L = vwb.m200298L(meetFeedItemData.moment.value);
                CoreExpandableTextContainer coreExpandableTextContainer = this.f26184w;
                if (zM200298L) {
                    xdl0.m208344M(coreExpandableTextContainer, false);
                } else {
                    xdl0.m208344M(coreExpandableTextContainer, true);
                    if (this.f26184w.getTextView() != null) {
                        this.f26184w.getTextView().setBreakStrategy(0);
                    }
                    int length = user.name.length();
                    String str2 = user.name;
                    if (length > 10) {
                        strConcat2 = str2.substring(0, 10).concat("...: ");
                    } else {
                        strConcat2 = str2 + ": ";
                    }
                    this.f26184w.m42783H(meetFeedItemData.isAllShow).m42785J(new CoreExpandableTextContainer.InterfaceC8200d() { // from class: l.l0y
                        @Override // com.p046p1.mobile.putong.core.newui.newmeet.feed.CoreExpandableTextContainer.InterfaceC8200d
                        /* JADX INFO: renamed from: a */
                        public final void mo42797a(boolean z2) {
                            MeetFeedBaseItemView.m42799i0(meetFeedItemData, user, z2);
                        }
                    }).m42784I(strConcat2 + meetFeedItemData.moment.value, strConcat2, new CustomTypefaceSpan("sans-serif", typeface, RoundedDrawable.DEFAULT_BORDER_COLOR, 0));
                }
                m42811G0();
            } else if ((iMeetListData4 instanceof MeetFeedUserItemData) && (((MeetFeedUserItemData) iMeetListData4).isSeeUser() || ((MeetFeedUserItemData) this.f26186y).isPicksUser() || ((MeetFeedUserItemData) this.f26186y).isLikedUser() || ((MeetFeedUserItemData) this.f26186y).isSeePortraitUser() || ((MeetFeedUserItemData) this.f26186y).isMomentBeLikeUser() || ((MeetFeedUserItemData) this.f26186y).isMomentLikeUser())) {
                if (((MeetFeedUserItemData) this.f26186y).isMomentBeLikeUser() || ((MeetFeedUserItemData) this.f26186y).isMomentLikeUser()) {
                    xdl0.m208357U(this.f26181t, i2);
                } else if (((MeetFeedUserItemData) this.f26186y).isSeePortraitUser() || !((MeetFeedUserItemData) this.f26186y).isSeePortraitUser()) {
                    xdl0.m208357U(this.f26181t, t100.f167226A);
                }
                xdl0.m208344M(this.f26184w, true);
                if (this.f26184w.getTextView() != null) {
                    this.f26184w.getTextView().setBreakStrategy(0);
                }
                final User user2 = ((MeetFeedUserItemData) this.f26186y).user;
                int length2 = user2.name.length();
                String str3 = user2.name;
                if (length2 > 10) {
                    strConcat = str3.substring(0, 10).concat("...: ");
                } else {
                    strConcat = str3 + ": ";
                }
                StringBuilder sb = new StringBuilder();
                if (TextUtils.equals(((MeetFeedUserItemData) this.f26186y).item.momentMediaType, C4753s.INSTANCE.m34735a())) {
                    sb.append(((MeetFeedUserItemData) this.f26186y).moment.value);
                } else if (TextUtils.isEmpty(user2.description)) {
                    if (!user2.isHideLocationFromSVip()) {
                        int i3 = user2.location.distance;
                        Region region = CoreModule.f17545c.f19639e0.m169527p9().location.region;
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
                        String strM221001r0 = zz6.m221001r0(i3);
                        if (i3 <= 10000 || TextUtils.isEmpty(str)) {
                            sb.append(strM221001r0);
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
                        sb.append(i0g0.m133869j0(user2.profile.zodiac));
                    } else {
                        sb.append("，");
                        sb.append(i0g0.m133869j0(user2.profile.zodiac));
                    }
                    if (!vwb.m200296J(user2.profile.tags)) {
                        final User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("，喜欢");
                        final int[] iArr = {0};
                        vwb.m200354z(user2.profile.tags, new e30() { // from class: l.m0y
                            @Override // p149l.e30
                            public final void call(Object obj) {
                                MeetFeedBaseItemView.m42800j0(userM169527p9, iArr, sb2, (Tag) obj);
                            }
                        });
                        if (iArr[0] > 0) {
                            sb.append((CharSequence) sb2);
                        }
                    }
                } else {
                    sb.append(user2.description);
                }
                this.f26184w.m42783H(((MeetFeedUserItemData) this.f26186y).isAllShow).m42785J(new CoreExpandableTextContainer.InterfaceC8200d() { // from class: l.n0y
                    @Override // com.p046p1.mobile.putong.core.newui.newmeet.feed.CoreExpandableTextContainer.InterfaceC8200d
                    /* JADX INFO: renamed from: a */
                    public final void mo42797a(boolean z2) {
                        this.f136595a.m42820z0(user2, z2);
                    }
                }).m42784I(strConcat + ((Object) sb), strConcat, new CustomTypefaceSpan("sans-serif", typeface, RoundedDrawable.DEFAULT_BORDER_COLOR, 0));
            } else {
                xdl0.m208344M(this.f26184w, false);
                xdl0.m208357U(this.f26181t, t100.f167226A);
            }
            m42809D0((AbsMeetUserItemData) this.f26186y, newMeetFragPresenter);
            xdl0.m208344M(this.f26183v, false);
        }
        m42815s0(newMeetFragPresenter);
        this.f26185x.mo99891a(absMeetListData, newMeetFragPresenter.act());
        IMeetListData iMeetListData5 = this.f26186y;
        if (iMeetListData5 instanceof MeetFeedItemData) {
            zvf0.m220368A("e_moment", newMeetFragPresenter.act().pageId(), vwb.m200311Y("moment_id", ((MeetFeedItemData) this.f26186y).moment.f56008id), vwb.m200311Y("moment_type", iMeetListData5 instanceof MeetFeedVideoItemData ? "video" : ReminderAction.photo), vwb.m200311Y("owner_id", ((MeetFeedItemData) this.f26186y).user.f56011id));
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m42809D0(AbsMeetUserItemData absMeetUserItemData, NewMeetFragPresenter newMeetFragPresenter) {
        this.f26181t.setTextColor(Color.parseColor("#fe7e1d"));
        this.f26181t.setBackgroundResource(b3c0.f72821A0);
        String str = absMeetUserItemData.user.isFemale() ? "她" : "他";
        xdl0.m208344M(this.f26182u, false);
        if (absMeetUserItemData.isPicksUser() && (absMeetUserItemData instanceof MeetFeedUserItemData)) {
            xdl0.m208383k(this.f26181t, newMeetFragPresenter.act().drawable(b3c0.f73197z0));
            if (absMeetUserItemData.item.relation.status == RelationshipStatus.get("liked") || absMeetUserItemData.item.relation.status == RelationshipStatus.get("superliked")) {
                xdl0.m208344M(this.f26182u, true);
                this.f26181t.setText("已喜欢");
            } else {
                this.f26181t.setText(String.format("喜欢%s", str));
            }
            this.f26181t.setTextColor(Color.parseColor("#ff4a97"));
        } else if (absMeetUserItemData.isSeeUser() || absMeetUserItemData.isSeePortraitUser() || absMeetUserItemData.isMomentBeLikeUser()) {
            boolean zMo60267Co = CoreModule.m29934N().mo60267Co();
            TextView textView = this.f26181t;
            if (zMo60267Co) {
                xdl0.m208383k(textView, newMeetFragPresenter.act().drawable(b3c0.f73176w0));
                this.f26181t.setText(R$string.f20584H);
            } else {
                xdl0.m208383k(textView, newMeetFragPresenter.act().drawable(b3c0.f72835C0));
                this.f26181t.setText(String.format("回应%s", str));
            }
        } else {
            OverHeatingStatus overHeatingStatus = absMeetUserItemData.item.overheating;
            if (overHeatingStatus.isHot || overHeatingStatus.isStop) {
                xdl0.m208383k(this.f26181t, newMeetFragPresenter.act().drawable(b3c0.f72828B0));
                boolean zMo60267Co2 = CoreModule.m29934N().mo60267Co();
                TextView textView2 = this.f26181t;
                if (zMo60267Co2) {
                    textView2.setText(R$string.f20584H);
                } else {
                    textView2.setText(String.format("回应%s", str));
                }
            } else {
                boolean zMo60267Co3 = CoreModule.m29934N().mo60267Co();
                TextView textView3 = this.f26181t;
                if (zMo60267Co3) {
                    xdl0.m208383k(textView3, newMeetFragPresenter.act().drawable(b3c0.f73176w0));
                    this.f26181t.setText(R$string.f20584H);
                } else {
                    xdl0.m208383k(textView3, newMeetFragPresenter.act().drawable(b3c0.f72835C0));
                    this.f26181t.setText(String.format("回应%s", str));
                }
            }
        }
        if (CoreModule.f17557o.m195057d().mo33700I5() && TextUtils.equals(this.f26181t.getText(), newMeetFragPresenter.act().getString(R$string.f20584H))) {
            this.f26181t.setText("抢先告白");
            this.f26181t.setTextColor(Color.parseColor("#FF55EE"));
            xdl0.m208383k(this.f26181t, newMeetFragPresenter.act().drawable(b3c0.f73183x0));
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m42810E0(NewMeetFragPresenter newMeetFragPresenter) {
        AbsMeetUserItemData absMeetUserItemData = (AbsMeetUserItemData) this.f26186y;
        String str = absMeetUserItemData.user.isFemale() ? "她" : "他";
        xdl0.m208378h0(this.f26176o, t100.m186890d(10.0f));
        if (absMeetUserItemData.isMomentLikeUser()) {
            this.f26173l.setText("我赞过".concat(str));
            xdl0.m208383k(this.f26173l, newMeetFragPresenter.act().drawable(b3c0.f72870H0));
            xdl0.m208344M(this.f26175n, true);
            this.f26176o.setImageResource(b3c0.f73197z0);
            return;
        }
        if (absMeetUserItemData.isMomentBeLikeUser()) {
            this.f26173l.setText(str.concat("赞过我"));
            xdl0.m208383k(this.f26173l, newMeetFragPresenter.act().drawable(b3c0.f72870H0));
            xdl0.m208344M(this.f26175n, true);
            this.f26176o.setImageResource(b3c0.f73197z0);
            return;
        }
        if (absMeetUserItemData.item.relation.status == RelationshipStatus.get("liked")) {
            this.f26173l.setText("我喜欢了".concat(str));
            xdl0.m208383k(this.f26173l, newMeetFragPresenter.act().drawable(b3c0.f72849E0));
            xdl0.m208344M(this.f26175n, true);
            this.f26176o.setImageResource(b3c0.f72933Q0);
            return;
        }
        if (absMeetUserItemData.item.relation.status == RelationshipStatus.get("superliked")) {
            this.f26173l.setText("我超级喜欢了".concat(str));
            xdl0.m208383k(this.f26173l, newMeetFragPresenter.act().drawable(b3c0.f72863G0));
            xdl0.m208344M(this.f26175n, !CoreModule.m29934N().mo60267Co());
            this.f26176o.setImageResource(b3c0.f73190y0);
            return;
        }
        if (absMeetUserItemData.item.relation.status == RelationshipStatus.get("lettered")) {
            this.f26173l.setText("已抢先表白");
            xdl0.m208383k(this.f26173l, newMeetFragPresenter.act().drawable(b3c0.f72863G0));
            xdl0.m208344M(this.f26175n, false);
            return;
        }
        if (absMeetUserItemData.isSeeUser()) {
            this.f26173l.setText(String.format("%s喜欢了我", str));
            xdl0.m208383k(this.f26173l, newMeetFragPresenter.act().drawable(b3c0.f72849E0));
            xdl0.m208344M(this.f26175n, true);
            this.f26176o.setImageResource(b3c0.f72933Q0);
            return;
        }
        if (absMeetUserItemData.isSeePortraitUser()) {
            this.f26173l.setText("即刻聊天");
            xdl0.m208383k(this.f26173l, newMeetFragPresenter.act().drawable(b3c0.f72926P0));
            xdl0.m208344M(this.f26175n, true);
            this.f26176o.setImageResource(b3c0.f72933Q0);
            return;
        }
        this.f26173l.setText(ura.m195053e().m195057d().mo33716Lc() ? "精选" : "每日心动");
        xdl0.m208383k(this.f26173l, newMeetFragPresenter.act().drawable(b3c0.f72856F0));
        xdl0.m208344M(this.f26175n, true);
        this.f26176o.setImageResource(b3c0.f72933Q0);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m42811G0() {
        if (((MeetFeedItemData) this.f26186y).moment.media.size() != 1) {
            C0222a c0222a = new C0222a();
            c0222a.m1148c(this);
            c0222a.m1161q(this.f26180s.getId(), "1:1");
            c0222a.m1146a(this);
            return;
        }
        String strM119542e = f5y.m119542e(((MeetFeedItemData) this.f26186y).moment.media.get(0));
        C0222a c0222a2 = new C0222a();
        c0222a2.m1148c(this);
        c0222a2.m1161q(this.f26180s.getId(), strM119542e);
        c0222a2.m1146a(this);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m42812H0(AbsMeetUserItemData absMeetUserItemData) {
        MyMeetLiveItem myMeetLiveItemM34724q4 = CoreModule.f17545c.f19664m1.m34724q4(absMeetUserItemData.user.f56011id);
        if (!NullChecker.m81303a(myMeetLiveItemM34724q4)) {
            xdl0.m208344M(this.f26165d, false);
            return;
        }
        if (myMeetLiveItemM34724q4.liveType == LiveType.get("live")) {
            zvf0.m220368A("e_live_room_enter", "p_meet", vwb.m200311Y("meet_realtime_relationship", g2y.m124192b(absMeetUserItemData, myMeetLiveItemM34724q4, absMeetUserItemData.user)), vwb.m200311Y("module", "meet_feed"), vwb.m200311Y("other_user_id", absMeetUserItemData.user.f56011id), vwb.m200311Y("live_enter_source", "realtime_meet"));
            xdl0.m208344M(this.f26165d, true);
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/72743c67-2110-42bd-974e-377e97d0970910.pdf").into(this.f26165d);
        } else if (myMeetLiveItemM34724q4.liveType == LiveType.get(LiveType.liveVoice)) {
            zvf0.m220368A("e_live_audio_room_enter", "p_meet", vwb.m200311Y("meet_realtime_relationship", g2y.m124192b(absMeetUserItemData, myMeetLiveItemM34724q4, absMeetUserItemData.user)), vwb.m200311Y("audio_card_type", "meet_feed"));
            xdl0.m208344M(this.f26165d, true);
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/e7598d54-54de-4388-84e1-793927cb7db410.pdf").into(this.f26165d);
        }
    }

    public kwl getContentView() {
        return this.f26185x;
    }

    public float getFeedVisiblePercentInWindow() {
        Rect rect = new Rect();
        this.f26180s.getGlobalVisibleRect(rect);
        int i = rect.bottom;
        if (i > 0) {
            return (i - rect.top) / this.f26180s.getHeight();
        }
        return 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26185x.release();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42813q0(this);
        this.f26187z = this.f26166e.get_pic();
        this.f26166e.setPicFailed(b3c0.f73074j);
        this.f26166e.setPicPlace(b3c0.f73074j);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m42813q0(View view) {
        t0y.m186878a(this, view);
    }

    /* JADX INFO: renamed from: r0 */
    public final Picture.ImageUri m42814r0(User user) {
        if (user != null) {
            return user.m60124fp().profileSmall();
        }
        return null;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m42815s0(final NewMeetFragPresenter newMeetFragPresenter) {
        xdl0.m208329E0(this.f26187z, new View.OnClickListener() { // from class: l.p0y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146630a.m42816t0(newMeetFragPresenter, view);
            }
        });
        if (this.f26186y instanceof AbsMeetUserItemData) {
            xdl0.m208329E0(this.f26177p, new View.OnClickListener() { // from class: l.q0y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f152090a.m42817u0(newMeetFragPresenter, view);
                }
            });
            xdl0.m208329E0(this.f26175n, new View.OnClickListener() { // from class: l.r0y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f157209a.m42818v0(newMeetFragPresenter, view);
                }
            });
            xdl0.m208329E0(this.f26181t, new View.OnClickListener() { // from class: l.s0y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f161822a.m42819w0(newMeetFragPresenter, view);
                }
            });
        }
    }

    public void setMainContentItemView(kwl kwlVar) {
        this.f26185x = kwlVar;
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m42816t0(NewMeetFragPresenter newMeetFragPresenter, View view) {
        IMeetListData iMeetListData = this.f26186y;
        if (iMeetListData instanceof MeetFeedSeeItemData) {
            zvf0.m220399u("e_meet_see_total", "p_meet", vwb.m200311Y("meet_see", "low_pop_level"));
            if (!NullChecker.m81303a(CoreModule.f17545c.m31484o3()) || CoreModule.f17545c.m31484o3().likersLimit.remaining <= 0) {
                CoreModule.m29935P().m94651a().mo33534l1(newMeetFragPresenter.act(), "p_meet_view,e_see_banner,click");
                return;
            } else {
                newMeetFragPresenter.act().startActivityForResult(LikersAct.m56544X1(newMeetFragPresenter.act(), "from_meet"), 18);
                return;
            }
        }
        if (iMeetListData instanceof AbsMeetUserItemData) {
            AbsMeetUserItemData absMeetUserItemData = (AbsMeetUserItemData) iMeetListData;
            zvf0.m220399u("e_meet_card_avatar", "p_meet", vwb.m200311Y("other_user_id", absMeetUserItemData.user.f56011id));
            MyMeetLiveItem myMeetLiveItemM34724q4 = CoreModule.f17545c.f19664m1.m34724q4(absMeetUserItemData.user.f56011id);
            if (NullChecker.m81303a(myMeetLiveItemM34724q4)) {
                if (myMeetLiveItemM34724q4.liveType == LiveType.get("live")) {
                    zvf0.m220399u("e_live_room_enter", "p_meet", vwb.m200311Y("meet_realtime_relationship", g2y.m124192b(absMeetUserItemData, myMeetLiveItemM34724q4, absMeetUserItemData.user)), vwb.m200311Y("module", "meet_feed"), vwb.m200311Y("other_user_id", absMeetUserItemData.user.f56011id), vwb.m200311Y("live_enter_source", "realtime_meet"));
                    newMeetFragPresenter.m43024n1(absMeetUserItemData.user.f56011id, myMeetLiveItemM34724q4.roomId);
                    return;
                } else {
                    if (myMeetLiveItemM34724q4.liveType == LiveType.get(LiveType.liveVoice)) {
                        zvf0.m220399u("e_live_audio_room_enter", "p_meet", vwb.m200311Y("meet_realtime_relationship", g2y.m124192b(absMeetUserItemData, myMeetLiveItemM34724q4, absMeetUserItemData.user)), vwb.m200311Y("audio_card_type", "meet_feed"));
                        newMeetFragPresenter.m43025o1(absMeetUserItemData.user.f56011id, myMeetLiveItemM34724q4.roomId);
                        return;
                    }
                    return;
                }
            }
            if (absMeetUserItemData.isLikedUser()) {
                LikedUser likedUserNew_ = LikedUser.new_();
                likedUserNew_.f20432id = absMeetUserItemData.user.f56011id;
                MeetRelation meetRelation = absMeetUserItemData.item.relation;
                likedUserNew_.status = meetRelation.status;
                likedUserNew_.otherStatus = meetRelation.otherStatus;
                newMeetFragPresenter.act().startActivityForResult(CoreModule.m29935P().m94651a().mo33399Rj(newMeetFragPresenter.act(), absMeetUserItemData.user.f56011id, likedUserNew_), 16);
                return;
            }
            if (!absMeetUserItemData.isSeeUser() && !absMeetUserItemData.isSeePortraitUser() && !absMeetUserItemData.isMomentBeLikeUser() && !absMeetUserItemData.isMomentLikeUser()) {
                newMeetFragPresenter.act().startActivityForResult(CoreModule.m29935P().m94651a().mo33550mt(newMeetFragPresenter.act(), absMeetUserItemData.user.f56011id), 16);
            } else if (absMeetUserItemData.isLowSeeSingleUser() && CoreModule.m29935P().m94651a().mo33489e2()) {
                CoreModule.m29935P().m94651a().mo33534l1(newMeetFragPresenter.act(), "");
            } else {
                newMeetFragPresenter.act().startActivityForResult(CoreModule.m29935P().m94651a().mo33412Sq(newMeetFragPresenter.act(), absMeetUserItemData.user.f56011id), 16);
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m42817u0(NewMeetFragPresenter newMeetFragPresenter, View view) {
        newMeetFragPresenter.m43018h1((AbsMeetUserItemData) this.f26186y, false);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m42818v0(NewMeetFragPresenter newMeetFragPresenter, View view) {
        AbsMeetUserItemData absMeetUserItemData = (AbsMeetUserItemData) this.f26186y;
        boolean z = true;
        String str = "I_like_say_hi";
        if (absMeetUserItemData.item.relation.status == RelationshipStatus.get("liked")) {
            newMeetFragPresenter.m43016f1(absMeetUserItemData, true, true, false);
        } else if (absMeetUserItemData.item.relation.status == RelationshipStatus.get("superliked")) {
            newMeetFragPresenter.m43016f1(absMeetUserItemData, true, true, true);
        } else if (absMeetUserItemData.isSeeUser() || absMeetUserItemData.isSeePortraitUser()) {
            newMeetFragPresenter.m43016f1(absMeetUserItemData, true, true, false);
            str = "high_level_pop_see_say_hi";
        } else if (absMeetUserItemData.isPicksUser()) {
            newMeetFragPresenter.m43016f1(absMeetUserItemData, true, true, false);
            str = "picks_say_hi";
        } else {
            if (absMeetUserItemData.isMomentBeLikeUser() || absMeetUserItemData.isMomentLikeUser()) {
                newMeetFragPresenter.m43016f1(absMeetUserItemData, true, false, false);
            }
            z = false;
        }
        User user = absMeetUserItemData.user;
        if (z) {
            zvf0.m220399u("e_meet_card_superlike", "p_meet", vwb.m200311Y("other_user_id", user.f56011id), vwb.m200311Y("meet_say_hi_relationship", str));
        } else {
            zvf0.m220399u("e_meet_card_superlike", "p_meet", vwb.m200311Y("other_user_id", user.f56011id));
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m42819w0(NewMeetFragPresenter newMeetFragPresenter, View view) {
        if (((AbsMeetUserItemData) this.f26186y).isSeeUser() || ((AbsMeetUserItemData) this.f26186y).isSeePortraitUser() || ((AbsMeetUserItemData) this.f26186y).isMomentBeLikeUser() || ((AbsMeetUserItemData) this.f26186y).isMomentLikeUser()) {
            zvf0.m220399u("e_meet_card_sayhi", "p_meet", vwb.m200311Y("meet_say_hi_relationship", "high_level_pop_see_say_hi"), vwb.m200311Y("other_user_id", ((AbsMeetUserItemData) this.f26186y).user.f56011id));
            newMeetFragPresenter.m43016f1((AbsMeetUserItemData) this.f26186y, true, false, false);
            return;
        }
        IMeetListData iMeetListData = this.f26186y;
        if ((iMeetListData instanceof MeetFeedUserItemData) && ((MeetFeedUserItemData) iMeetListData).isPicksUser()) {
            zvf0.m220399u("e_meet_card_sayhi", "p_meet", vwb.m200311Y("meet_say_hi_relationship", "picks_say_hi"), vwb.m200311Y("other_user_id", ((AbsMeetUserItemData) this.f26186y).user.f56011id));
            if (xdl0.m208349O0(this.f26182u)) {
                return;
            }
            newMeetFragPresenter.m43016f1((AbsMeetUserItemData) this.f26186y, true, false, false);
            return;
        }
        IMeetListData iMeetListData2 = this.f26186y;
        if ((iMeetListData2 instanceof MeetFeedUserItemData) && ((MeetFeedUserItemData) iMeetListData2).isLikedUser()) {
            newMeetFragPresenter.m43019i1((MeetFeedUserItemData) this.f26186y, null, null);
            return;
        }
        IMeetListData iMeetListData3 = this.f26186y;
        if (iMeetListData3 instanceof MeetFeedItemData) {
            if (((MeetFeedItemData) iMeetListData3).isPicksUser()) {
                zvf0.m220399u("e_meet_card_sayhi", "p_meet", vwb.m200311Y("meet_say_hi_relationship", "picks_say_hi"), vwb.m200311Y("other_user_id", ((AbsMeetUserItemData) this.f26186y).user.f56011id));
            } else {
                zvf0.m220399u("e_meet_card_sayhi", "p_meet", vwb.m200311Y("meet_say_hi_relationship", "i_like_say_hi"), vwb.m200311Y("other_user_id", ((AbsMeetUserItemData) this.f26186y).user.f56011id));
            }
            MeetFeedItemData meetFeedItemData = (MeetFeedItemData) this.f26186y;
            newMeetFragPresenter.m43019i1(meetFeedItemData, meetFeedItemData.moment.f56008id, meetFeedItemData.originalMoment);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m42820z0(User user, boolean z) {
        ((MeetFeedUserItemData) this.f26186y).isAllShow = z;
        if (z) {
            zvf0.m220399u("e_meet_card_unfold", "p_meet", vwb.m200311Y("other_user_id", user.f56011id));
        }
    }

    public MeetFeedBaseItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MeetFeedBaseItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
