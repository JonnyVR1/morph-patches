package com.p000p1.mobile.putong.core.newui.newmeet.feed;

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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import androidx.legacy.widget.Space;
import com.p000p1.mobile.putong.core.newui.newmeet.feed.MeetFeedBaseItemView;
import com.p000p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFragPresenter;
import com.p000p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p000p1.mobile.putong.p004ui.headframe.HeaderFrameWrapper;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.core.api.s;
import com.p1.mobile.putong.core.businessdata.meet.AbsMeetListData;
import com.p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData;
import com.p1.mobile.putong.core.businessdata.meet.IMeetListData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedSeeItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedVideoItemData;
import com.p1.mobile.putong.core.data.LikedUser;
import com.p1.mobile.putong.core.data.LiveType;
import com.p1.mobile.putong.core.data.MeetRelation;
import com.p1.mobile.putong.core.data.MyMeetFeedItem;
import com.p1.mobile.putong.core.data.MyMeetLiveItem;
import com.p1.mobile.putong.core.data.OverHeatingStatus;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.core.ui.vip.likers.LikersAct;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Region;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.b3c0;
import l.e30;
import l.hmb;
import l.j760;
import l.qib0;
import l.t0y;
import l.t100;
import l.ura;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;
import l.zz6;
import p009l.f5y;
import p009l.g2y;
import p009l.i0g0;
import p009l.kwl;
import v.VDraweeView;
import v.VFrame_Shadow;
import v.VImage;
import v.VLinear_FillerMeasure;
import v.VText;
import v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MeetFeedBaseItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f4943d;

    /* JADX INFO: renamed from: e */
    public HeaderFrameWrapper f4944e;

    /* JADX INFO: renamed from: f */
    public VLinear_FillerMeasure f4945f;

    /* JADX INFO: renamed from: g */
    public VText f4946g;

    /* JADX INFO: renamed from: h */
    public Space f4947h;

    /* JADX INFO: renamed from: i */
    public VImage f4948i;

    /* JADX INFO: renamed from: j */
    public Space f4949j;

    /* JADX INFO: renamed from: k */
    public ODiamondTagLabel f4950k;

    /* JADX INFO: renamed from: l */
    public VText f4951l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f4952m;

    /* JADX INFO: renamed from: n */
    public VFrame_Shadow f4953n;

    /* JADX INFO: renamed from: o */
    public ImageView f4954o;

    /* JADX INFO: renamed from: p */
    public ImageView f4955p;

    /* JADX INFO: renamed from: q */
    public VFrame_Shadow f4956q;

    /* JADX INFO: renamed from: r */
    public TextView f4957r;

    /* JADX INFO: renamed from: s */
    public FrameLayout f4958s;

    /* JADX INFO: renamed from: t */
    public TextView f4959t;

    /* JADX INFO: renamed from: u */
    public View f4960u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f4961v;

    /* JADX INFO: renamed from: w */
    public CoreExpandableTextContainer f4962w;

    /* JADX INFO: renamed from: x */
    public kwl f4963x;

    /* JADX INFO: renamed from: y */
    public IMeetListData f4964y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f4965z;

    public MeetFeedBaseItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m6973i0(MeetFeedItemData meetFeedItemData, User user, boolean z) {
        meetFeedItemData.isAllShow = z;
        if (z) {
            zvf0.u("e_meet_card_unfold", "p_meet", new j760[]{vwb.Y("other_user_id", ((DbObject) user).id)});
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m6974j0(User user, int[] iArr, StringBuilder sb, final Tag tag) {
        Tag tag2 = (Tag) vwb.r(user.profile.tags, new w9j() { // from class: l.o0y
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
    public /* synthetic */ void m6981y0(View view) {
        this.f4965z.performClick();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B0 */
    public void m6982B0(AbsMeetListData absMeetListData, NewMeetFragPresenter newMeetFragPresenter) {
        String strConcat;
        String str;
        String strConcat2;
        this.f4964y = absMeetListData;
        VText vText = this.f4946g;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        MyMeetFeedItem myMeetFeedItem = absMeetListData.item;
        if (myMeetFeedItem.readStatus == 0) {
            newMeetFragPresenter.m7200L0(myMeetFeedItem.id);
        }
        AbsMeetUserItemData absMeetUserItemData = this.f4964y;
        boolean z = absMeetUserItemData instanceof MeetFeedSeeItemData;
        VText vText2 = this.f4946g;
        if (z) {
            vText2.setText("喜欢我的人");
            xdl0.M(this.f4943d, false);
            CoreLikers.a aVarT5 = CoreModule.c.u0.t5();
            if (!NullChecker.a(aVarT5) || vwb.J(aVarT5.d)) {
                qib0.G.Y0(this.f4965z, b3c0.I0);
            } else {
                Picture.ImageUri imageUriM6988r0 = m6988r0((User) aVarT5.d.get(0));
                boolean zFs = CoreModule.P().g().Fs();
                VDraweeView vDraweeView = this.f4965z;
                if (zFs) {
                    hmb.v1(vDraweeView, imageUriM6988r0, b3c0.I0);
                } else {
                    hmb.w1(vDraweeView, imageUriM6988r0, b3c0.I0);
                }
            }
            MeetFeedSeeItemData meetFeedSeeItemData = this.f4964y;
            int i = ((AbsMeetListData) meetFeedSeeItemData).item.lowPopSeeCount;
            VText vText3 = this.f4951l;
            if (i == 0) {
                vText3.setText(String.format("%s位用户喜欢了你", Integer.valueOf(((AbsMeetListData) meetFeedSeeItemData).item.seeCount)));
            } else {
                vText3.setText("收到的新喜欢:" + ((AbsMeetListData) this.f4964y).item.lowPopSeeCount);
            }
            xdl0.M(this.f4959t, false);
            xdl0.M(this.f4953n, false);
            xdl0.M(this.f4955p, false);
            xdl0.M(this.f4956q, true);
            xdl0.M(this.f4962w, false);
            xdl0.M(this.f4949j, true);
            xdl0.E0(this, new View.OnClickListener() { // from class: l.k0y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15382a.m6981y0(view);
                }
            });
        } else {
            vText2.setText(absMeetUserItemData.user.name);
            m6986H0(this.f4964y);
            MyMeetLiveItem myMeetLiveItemQ4 = CoreModule.c.m1.q4(((DbObject) this.f4964y.user).id);
            if (NullChecker.a(myMeetLiveItemQ4) && myMeetLiveItemQ4.anonymous && !vwb.J(this.f4964y.user.profile.extensions.live.voiceImgUrl)) {
                this.f4944e.m10013B0((String) this.f4964y.user.profile.extensions.live.voiceImgUrl.get(0));
            } else if (this.f4964y.isSeePortraitUser() && CoreModule.P().a().e2()) {
                HeaderFrameWrapper headerFrameWrapper = this.f4944e;
                AbsMeetUserItemData absMeetUserItemData2 = this.f4964y;
                headerFrameWrapper.m10032w0(absMeetUserItemData2.user, absMeetUserItemData2.user.fp().profileSmall().formatted());
            } else if (this.f4964y.isLowSeeSingleUser() && CoreModule.P().a().e2()) {
                this.f4944e.m10018i0(this.f4964y.user.fp().profileSmall().formatted(), 2, 8);
            } else {
                this.f4944e.m10029t0(this.f4964y.user);
                qib0.G.Q0(this.f4965z, this.f4964y.user.fp().profileSmall());
            }
            qib0.b0.b.showUserVerificationLogo(getContext(), this.f4964y.user, this.f4948i);
            xdl0.M(this.f4947h, xdl0.O0(this.f4948i));
            if (CoreModule.l.g().e() && this.f4964y.user.isSupremePartner() && !this.f4964y.user.isHideIconFromSVipWithMe()) {
                this.f4950k.m9485n0();
                xdl0.M(this.f4949j, true);
                xdl0.M(this.f4950k, true);
            } else if (this.f4964y.user.isODiamond() && !this.f4964y.user.isHideIconFromSVipWithMe()) {
                this.f4950k.m9487p0();
                xdl0.M(this.f4949j, true);
                xdl0.M(this.f4950k, true);
            } else if (CoreModule.l.g().b8() && this.f4964y.user.isPlatinum() && !this.f4964y.user.isHideIconFromSVipWithMe()) {
                this.f4950k.m9484m0();
                xdl0.M(this.f4949j, true);
                xdl0.M(this.f4950k, true);
            } else {
                xdl0.M(this.f4949j, false);
                xdl0.M(this.f4950k, false);
            }
            m6984E0(newMeetFragPresenter);
            TextView textView = this.f4959t;
            int i2 = t100.j;
            xdl0.U(textView, i2);
            MeetFeedItemData meetFeedItemData = this.f4964y;
            if (meetFeedItemData instanceof MeetFeedItemData) {
                final MeetFeedItemData meetFeedItemData2 = meetFeedItemData;
                final User user = ((AbsMeetUserItemData) meetFeedItemData2).user;
                boolean zL = vwb.L(meetFeedItemData2.moment.value);
                CoreExpandableTextContainer coreExpandableTextContainer = this.f4962w;
                if (zL) {
                    xdl0.M(coreExpandableTextContainer, false);
                } else {
                    xdl0.M(coreExpandableTextContainer, true);
                    if (this.f4962w.getTextView() != null) {
                        this.f4962w.getTextView().setBreakStrategy(0);
                    }
                    int length = user.name.length();
                    String str2 = user.name;
                    if (length > 10) {
                        strConcat2 = str2.substring(0, 10).concat("...: ");
                    } else {
                        strConcat2 = str2 + ": ";
                    }
                    this.f4962w.m6957H(meetFeedItemData2.isAllShow).m6959J(new CoreExpandableTextContainer.InterfaceC0364d() { // from class: l.l0y
                        @Override // com.p000p1.mobile.putong.core.newui.newmeet.feed.CoreExpandableTextContainer.InterfaceC0364d
                        /* JADX INFO: renamed from: a */
                        public final void mo6971a(boolean z2) {
                            MeetFeedBaseItemView.m6973i0(meetFeedItemData2, user, z2);
                        }
                    }).m6958I(strConcat2 + meetFeedItemData2.moment.value, strConcat2, new CustomTypefaceSpan("sans-serif", typeface, -16777216, 0));
                }
                m6985G0();
            } else if ((meetFeedItemData instanceof MeetFeedUserItemData) && (((MeetFeedUserItemData) meetFeedItemData).isSeeUser() || this.f4964y.isPicksUser() || this.f4964y.isLikedUser() || this.f4964y.isSeePortraitUser() || this.f4964y.isMomentBeLikeUser() || this.f4964y.isMomentLikeUser())) {
                if (this.f4964y.isMomentBeLikeUser() || this.f4964y.isMomentLikeUser()) {
                    xdl0.U(this.f4959t, i2);
                } else if (this.f4964y.isSeePortraitUser() || !this.f4964y.isSeePortraitUser()) {
                    xdl0.U(this.f4959t, t100.A);
                }
                xdl0.M(this.f4962w, true);
                if (this.f4962w.getTextView() != null) {
                    this.f4962w.getTextView().setBreakStrategy(0);
                }
                final User user2 = ((AbsMeetUserItemData) this.f4964y).user;
                int length2 = user2.name.length();
                String str3 = user2.name;
                if (length2 > 10) {
                    strConcat = str3.substring(0, 10).concat("...: ");
                } else {
                    strConcat = str3 + ": ";
                }
                StringBuilder sb = new StringBuilder();
                if (TextUtils.equals(((AbsMeetListData) this.f4964y).item.momentMediaType, s.Companion.a())) {
                    sb.append(this.f4964y.moment.value);
                } else if (TextUtils.isEmpty(user2.description)) {
                    if (!user2.isHideLocationFromSVip()) {
                        int i3 = user2.location.distance;
                        Region region = CoreModule.c.e0.p9().location.region;
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
                        String strR0 = zz6.r0(i3);
                        if (i3 <= 10000 || TextUtils.isEmpty(str)) {
                            sb.append(strR0);
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
                        sb.append(i0g0.m16137j0(user2.profile.zodiac));
                    } else {
                        sb.append("，");
                        sb.append(i0g0.m16137j0(user2.profile.zodiac));
                    }
                    if (!vwb.J(user2.profile.tags)) {
                        final User userP9 = CoreModule.c.e0.p9();
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("，喜欢");
                        final int[] iArr = {0};
                        vwb.z(user2.profile.tags, new e30() { // from class: l.m0y
                            public final void call(Object obj) {
                                MeetFeedBaseItemView.m6974j0(userP9, iArr, sb2, (Tag) obj);
                            }
                        });
                        if (iArr[0] > 0) {
                            sb.append((CharSequence) sb2);
                        }
                    }
                } else {
                    sb.append(user2.description);
                }
                this.f4962w.m6957H(this.f4964y.isAllShow).m6959J(new CoreExpandableTextContainer.InterfaceC0364d() { // from class: l.n0y
                    @Override // com.p000p1.mobile.putong.core.newui.newmeet.feed.CoreExpandableTextContainer.InterfaceC0364d
                    /* JADX INFO: renamed from: a */
                    public final void mo6971a(boolean z2) {
                        this.f17177a.m6994z0(user2, z2);
                    }
                }).m6958I(strConcat + ((Object) sb), strConcat, new CustomTypefaceSpan("sans-serif", typeface, -16777216, 0));
            } else {
                xdl0.M(this.f4962w, false);
                xdl0.U(this.f4959t, t100.A);
            }
            m6983D0(this.f4964y, newMeetFragPresenter);
            xdl0.M(this.f4961v, false);
        }
        m6989s0(newMeetFragPresenter);
        this.f4963x.mo11817a(absMeetListData, newMeetFragPresenter.act());
        IMeetListData iMeetListData = this.f4964y;
        if (iMeetListData instanceof MeetFeedItemData) {
            zvf0.A("e_moment", newMeetFragPresenter.act().pageId(), new j760[]{vwb.Y("moment_id", ((CopyObject) this.f4964y.moment).id), vwb.Y("moment_type", iMeetListData instanceof MeetFeedVideoItemData ? "video" : "photo"), vwb.Y("owner_id", ((DbObject) ((AbsMeetUserItemData) this.f4964y).user).id)});
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m6983D0(AbsMeetUserItemData absMeetUserItemData, NewMeetFragPresenter newMeetFragPresenter) {
        this.f4959t.setTextColor(Color.parseColor("#fe7e1d"));
        this.f4959t.setBackgroundResource(b3c0.A0);
        String str = absMeetUserItemData.user.isFemale() ? "她" : "他";
        xdl0.M(this.f4960u, false);
        if (absMeetUserItemData.isPicksUser() && (absMeetUserItemData instanceof MeetFeedUserItemData)) {
            xdl0.k(this.f4959t, newMeetFragPresenter.act().drawable(b3c0.z0));
            if (((AbsMeetListData) absMeetUserItemData).item.relation.status == RelationshipStatus.get("liked") || ((AbsMeetListData) absMeetUserItemData).item.relation.status == RelationshipStatus.get("superliked")) {
                xdl0.M(this.f4960u, true);
                this.f4959t.setText("已喜欢");
            } else {
                this.f4959t.setText(String.format("喜欢%s", str));
            }
            this.f4959t.setTextColor(Color.parseColor("#ff4a97"));
        } else if (absMeetUserItemData.isSeeUser() || absMeetUserItemData.isSeePortraitUser() || absMeetUserItemData.isMomentBeLikeUser()) {
            boolean zCo = CoreModule.N().Co();
            TextView textView = this.f4959t;
            if (zCo) {
                xdl0.k(textView, newMeetFragPresenter.act().drawable(b3c0.w0));
                this.f4959t.setText(R.string.H);
            } else {
                xdl0.k(textView, newMeetFragPresenter.act().drawable(b3c0.C0));
                this.f4959t.setText(String.format("回应%s", str));
            }
        } else {
            OverHeatingStatus overHeatingStatus = ((AbsMeetListData) absMeetUserItemData).item.overheating;
            if (overHeatingStatus.isHot || overHeatingStatus.isStop) {
                xdl0.k(this.f4959t, newMeetFragPresenter.act().drawable(b3c0.B0));
                boolean zCo2 = CoreModule.N().Co();
                TextView textView2 = this.f4959t;
                if (zCo2) {
                    textView2.setText(R.string.H);
                } else {
                    textView2.setText(String.format("回应%s", str));
                }
            } else {
                boolean zCo3 = CoreModule.N().Co();
                TextView textView3 = this.f4959t;
                if (zCo3) {
                    xdl0.k(textView3, newMeetFragPresenter.act().drawable(b3c0.w0));
                    this.f4959t.setText(R.string.H);
                } else {
                    xdl0.k(textView3, newMeetFragPresenter.act().drawable(b3c0.C0));
                    this.f4959t.setText(String.format("回应%s", str));
                }
            }
        }
        if (CoreModule.o.d().I5() && TextUtils.equals(this.f4959t.getText(), newMeetFragPresenter.act().getString(R.string.H))) {
            this.f4959t.setText("抢先告白");
            this.f4959t.setTextColor(Color.parseColor("#FF55EE"));
            xdl0.k(this.f4959t, newMeetFragPresenter.act().drawable(b3c0.x0));
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m6984E0(NewMeetFragPresenter newMeetFragPresenter) {
        AbsMeetUserItemData absMeetUserItemData = this.f4964y;
        String str = absMeetUserItemData.user.isFemale() ? "她" : "他";
        xdl0.h0(this.f4954o, t100.d(10.0f));
        if (absMeetUserItemData.isMomentLikeUser()) {
            this.f4951l.setText("我赞过".concat(str));
            xdl0.k(this.f4951l, newMeetFragPresenter.act().drawable(b3c0.H0));
            xdl0.M(this.f4953n, true);
            this.f4954o.setImageResource(b3c0.z0);
            return;
        }
        if (absMeetUserItemData.isMomentBeLikeUser()) {
            this.f4951l.setText(str.concat("赞过我"));
            xdl0.k(this.f4951l, newMeetFragPresenter.act().drawable(b3c0.H0));
            xdl0.M(this.f4953n, true);
            this.f4954o.setImageResource(b3c0.z0);
            return;
        }
        if (((AbsMeetListData) absMeetUserItemData).item.relation.status == RelationshipStatus.get("liked")) {
            this.f4951l.setText("我喜欢了".concat(str));
            xdl0.k(this.f4951l, newMeetFragPresenter.act().drawable(b3c0.E0));
            xdl0.M(this.f4953n, true);
            this.f4954o.setImageResource(b3c0.Q0);
            return;
        }
        if (((AbsMeetListData) absMeetUserItemData).item.relation.status == RelationshipStatus.get("superliked")) {
            this.f4951l.setText("我超级喜欢了".concat(str));
            xdl0.k(this.f4951l, newMeetFragPresenter.act().drawable(b3c0.G0));
            xdl0.M(this.f4953n, !CoreModule.N().Co());
            this.f4954o.setImageResource(b3c0.y0);
            return;
        }
        if (((AbsMeetListData) absMeetUserItemData).item.relation.status == RelationshipStatus.get("lettered")) {
            this.f4951l.setText("已抢先表白");
            xdl0.k(this.f4951l, newMeetFragPresenter.act().drawable(b3c0.G0));
            xdl0.M(this.f4953n, false);
            return;
        }
        if (absMeetUserItemData.isSeeUser()) {
            this.f4951l.setText(String.format("%s喜欢了我", str));
            xdl0.k(this.f4951l, newMeetFragPresenter.act().drawable(b3c0.E0));
            xdl0.M(this.f4953n, true);
            this.f4954o.setImageResource(b3c0.Q0);
            return;
        }
        if (absMeetUserItemData.isSeePortraitUser()) {
            this.f4951l.setText("即刻聊天");
            xdl0.k(this.f4951l, newMeetFragPresenter.act().drawable(b3c0.P0));
            xdl0.M(this.f4953n, true);
            this.f4954o.setImageResource(b3c0.Q0);
            return;
        }
        this.f4951l.setText(ura.e().d().Lc() ? "精选" : "每日心动");
        xdl0.k(this.f4951l, newMeetFragPresenter.act().drawable(b3c0.F0));
        xdl0.M(this.f4953n, true);
        this.f4954o.setImageResource(b3c0.Q0);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m6985G0() {
        if (this.f4964y.moment.media.size() != 1) {
            a aVar = new a();
            aVar.c(this);
            aVar.q(this.f4958s.getId(), "1:1");
            aVar.a(this);
            return;
        }
        String strM14273e = f5y.m14273e((Media) this.f4964y.moment.media.get(0));
        a aVar2 = new a();
        aVar2.c(this);
        aVar2.q(this.f4958s.getId(), strM14273e);
        aVar2.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H0 */
    public final void m6986H0(AbsMeetUserItemData absMeetUserItemData) {
        MyMeetLiveItem myMeetLiveItemQ4 = CoreModule.c.m1.q4(((DbObject) absMeetUserItemData.user).id);
        if (!NullChecker.a(myMeetLiveItemQ4)) {
            xdl0.M(this.f4943d, false);
            return;
        }
        if (myMeetLiveItemQ4.liveType == LiveType.get("live")) {
            zvf0.A("e_live_room_enter", "p_meet", new j760[]{vwb.Y("meet_realtime_relationship", g2y.m14765b(absMeetUserItemData, myMeetLiveItemQ4, absMeetUserItemData.user)), vwb.Y("module", "meet_feed"), vwb.Y("other_user_id", ((DbObject) absMeetUserItemData.user).id), vwb.Y("live_enter_source", "realtime_meet")});
            xdl0.M(this.f4943d, true);
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/72743c67-2110-42bd-974e-377e97d0970910.pdf").into(this.f4943d);
        } else if (myMeetLiveItemQ4.liveType == LiveType.get("liveVoice")) {
            zvf0.A("e_live_audio_room_enter", "p_meet", new j760[]{vwb.Y("meet_realtime_relationship", g2y.m14765b(absMeetUserItemData, myMeetLiveItemQ4, absMeetUserItemData.user)), vwb.Y("audio_card_type", "meet_feed")});
            xdl0.M(this.f4943d, true);
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/e7598d54-54de-4388-84e1-793927cb7db410.pdf").into(this.f4943d);
        }
    }

    public kwl getContentView() {
        return this.f4963x;
    }

    public float getFeedVisiblePercentInWindow() {
        Rect rect = new Rect();
        this.f4958s.getGlobalVisibleRect(rect);
        int i = rect.bottom;
        if (i > 0) {
            return (i - rect.top) / this.f4958s.getHeight();
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        this.f4963x.release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6987q0(this);
        this.f4965z = this.f4944e.get_pic();
        this.f4944e.setPicFailed(b3c0.j);
        this.f4944e.setPicPlace(b3c0.j);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m6987q0(View view) {
        t0y.a(this, view);
    }

    /* JADX INFO: renamed from: r0 */
    public final Picture.ImageUri m6988r0(User user) {
        if (user != null) {
            return user.fp().profileSmall();
        }
        return null;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m6989s0(final NewMeetFragPresenter newMeetFragPresenter) {
        xdl0.E0(this.f4965z, new View.OnClickListener() { // from class: l.p0y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18309a.m6990t0(newMeetFragPresenter, view);
            }
        });
        if (this.f4964y instanceof AbsMeetUserItemData) {
            xdl0.E0(this.f4955p, new View.OnClickListener() { // from class: l.q0y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18987a.m6991u0(newMeetFragPresenter, view);
                }
            });
            xdl0.E0(this.f4953n, new View.OnClickListener() { // from class: l.r0y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f19604a.m6992v0(newMeetFragPresenter, view);
                }
            });
            xdl0.E0(this.f4959t, new View.OnClickListener() { // from class: l.s0y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20067a.m6993w0(newMeetFragPresenter, view);
                }
            });
        }
    }

    public void setMainContentItemView(kwl kwlVar) {
        this.f4963x = kwlVar;
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m6990t0(NewMeetFragPresenter newMeetFragPresenter, View view) {
        AbsMeetUserItemData absMeetUserItemData = this.f4964y;
        if (absMeetUserItemData instanceof MeetFeedSeeItemData) {
            zvf0.u("e_meet_see_total", "p_meet", new j760[]{vwb.Y("meet_see", "low_pop_level")});
            if (!NullChecker.a(CoreModule.c.o3()) || CoreModule.c.o3().likersLimit.remaining <= 0) {
                CoreModule.P().a().l1(newMeetFragPresenter.act(), "p_meet_view,e_see_banner,click");
                return;
            } else {
                newMeetFragPresenter.act().startActivityForResult(LikersAct.X1(newMeetFragPresenter.act(), "from_meet"), 18);
                return;
            }
        }
        if (absMeetUserItemData instanceof AbsMeetUserItemData) {
            AbsMeetUserItemData absMeetUserItemData2 = absMeetUserItemData;
            zvf0.u("e_meet_card_avatar", "p_meet", new j760[]{vwb.Y("other_user_id", ((DbObject) absMeetUserItemData2.user).id)});
            MyMeetLiveItem myMeetLiveItemQ4 = CoreModule.c.m1.q4(((DbObject) absMeetUserItemData2.user).id);
            if (NullChecker.a(myMeetLiveItemQ4)) {
                if (myMeetLiveItemQ4.liveType == LiveType.get("live")) {
                    zvf0.u("e_live_room_enter", "p_meet", new j760[]{vwb.Y("meet_realtime_relationship", g2y.m14765b(absMeetUserItemData2, myMeetLiveItemQ4, absMeetUserItemData2.user)), vwb.Y("module", "meet_feed"), vwb.Y("other_user_id", ((DbObject) absMeetUserItemData2.user).id), vwb.Y("live_enter_source", "realtime_meet")});
                    newMeetFragPresenter.m7224n1(((DbObject) absMeetUserItemData2.user).id, myMeetLiveItemQ4.roomId);
                    return;
                } else {
                    if (myMeetLiveItemQ4.liveType == LiveType.get("liveVoice")) {
                        zvf0.u("e_live_audio_room_enter", "p_meet", new j760[]{vwb.Y("meet_realtime_relationship", g2y.m14765b(absMeetUserItemData2, myMeetLiveItemQ4, absMeetUserItemData2.user)), vwb.Y("audio_card_type", "meet_feed")});
                        newMeetFragPresenter.m7225o1(((DbObject) absMeetUserItemData2.user).id, myMeetLiveItemQ4.roomId);
                        return;
                    }
                    return;
                }
            }
            if (absMeetUserItemData2.isLikedUser()) {
                LikedUser likedUserNew_ = LikedUser.new_();
                likedUserNew_.id = ((DbObject) absMeetUserItemData2.user).id;
                MeetRelation meetRelation = ((AbsMeetListData) absMeetUserItemData2).item.relation;
                likedUserNew_.status = meetRelation.status;
                likedUserNew_.otherStatus = meetRelation.otherStatus;
                newMeetFragPresenter.act().startActivityForResult(CoreModule.P().a().Rj(newMeetFragPresenter.act(), ((DbObject) absMeetUserItemData2.user).id, likedUserNew_), 16);
                return;
            }
            if (!absMeetUserItemData2.isSeeUser() && !absMeetUserItemData2.isSeePortraitUser() && !absMeetUserItemData2.isMomentBeLikeUser() && !absMeetUserItemData2.isMomentLikeUser()) {
                newMeetFragPresenter.act().startActivityForResult(CoreModule.P().a().mt(newMeetFragPresenter.act(), ((DbObject) absMeetUserItemData2.user).id), 16);
            } else if (absMeetUserItemData2.isLowSeeSingleUser() && CoreModule.P().a().e2()) {
                CoreModule.P().a().l1(newMeetFragPresenter.act(), "");
            } else {
                newMeetFragPresenter.act().startActivityForResult(CoreModule.P().a().Sq(newMeetFragPresenter.act(), ((DbObject) absMeetUserItemData2.user).id), 16);
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m6991u0(NewMeetFragPresenter newMeetFragPresenter, View view) {
        newMeetFragPresenter.m7218h1((AbsMeetUserItemData) this.f4964y, false);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m6992v0(NewMeetFragPresenter newMeetFragPresenter, View view) {
        AbsMeetUserItemData absMeetUserItemData = (AbsMeetUserItemData) this.f4964y;
        boolean z = true;
        String str = "I_like_say_hi";
        if (((AbsMeetListData) absMeetUserItemData).item.relation.status == RelationshipStatus.get("liked")) {
            newMeetFragPresenter.m7216f1(absMeetUserItemData, true, true, false);
        } else if (((AbsMeetListData) absMeetUserItemData).item.relation.status == RelationshipStatus.get("superliked")) {
            newMeetFragPresenter.m7216f1(absMeetUserItemData, true, true, true);
        } else if (absMeetUserItemData.isSeeUser() || absMeetUserItemData.isSeePortraitUser()) {
            newMeetFragPresenter.m7216f1(absMeetUserItemData, true, true, false);
            str = "high_level_pop_see_say_hi";
        } else if (absMeetUserItemData.isPicksUser()) {
            newMeetFragPresenter.m7216f1(absMeetUserItemData, true, true, false);
            str = "picks_say_hi";
        } else {
            if (absMeetUserItemData.isMomentBeLikeUser() || absMeetUserItemData.isMomentLikeUser()) {
                newMeetFragPresenter.m7216f1(absMeetUserItemData, true, false, false);
            }
            z = false;
        }
        User user = absMeetUserItemData.user;
        if (z) {
            zvf0.u("e_meet_card_superlike", "p_meet", new j760[]{vwb.Y("other_user_id", ((DbObject) user).id), vwb.Y("meet_say_hi_relationship", str)});
        } else {
            zvf0.u("e_meet_card_superlike", "p_meet", new j760[]{vwb.Y("other_user_id", ((DbObject) user).id)});
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m6993w0(NewMeetFragPresenter newMeetFragPresenter, View view) {
        if (this.f4964y.isSeeUser() || this.f4964y.isSeePortraitUser() || this.f4964y.isMomentBeLikeUser() || this.f4964y.isMomentLikeUser()) {
            zvf0.u("e_meet_card_sayhi", "p_meet", new j760[]{vwb.Y("meet_say_hi_relationship", "high_level_pop_see_say_hi"), vwb.Y("other_user_id", ((DbObject) this.f4964y.user).id)});
            newMeetFragPresenter.m7216f1((AbsMeetUserItemData) this.f4964y, true, false, false);
            return;
        }
        MeetFeedUserItemData meetFeedUserItemData = this.f4964y;
        if ((meetFeedUserItemData instanceof MeetFeedUserItemData) && meetFeedUserItemData.isPicksUser()) {
            zvf0.u("e_meet_card_sayhi", "p_meet", new j760[]{vwb.Y("meet_say_hi_relationship", "picks_say_hi"), vwb.Y("other_user_id", ((DbObject) this.f4964y.user).id)});
            if (xdl0.O0(this.f4960u)) {
                return;
            }
            newMeetFragPresenter.m7216f1((AbsMeetUserItemData) this.f4964y, true, false, false);
            return;
        }
        MeetFeedUserItemData meetFeedUserItemData2 = this.f4964y;
        if ((meetFeedUserItemData2 instanceof MeetFeedUserItemData) && meetFeedUserItemData2.isLikedUser()) {
            newMeetFragPresenter.m7219i1(this.f4964y, null, null);
            return;
        }
        MeetFeedItemData meetFeedItemData = this.f4964y;
        if (meetFeedItemData instanceof MeetFeedItemData) {
            if (meetFeedItemData.isPicksUser()) {
                zvf0.u("e_meet_card_sayhi", "p_meet", new j760[]{vwb.Y("meet_say_hi_relationship", "picks_say_hi"), vwb.Y("other_user_id", ((DbObject) this.f4964y.user).id)});
            } else {
                zvf0.u("e_meet_card_sayhi", "p_meet", new j760[]{vwb.Y("meet_say_hi_relationship", "i_like_say_hi"), vwb.Y("other_user_id", ((DbObject) this.f4964y.user).id)});
            }
            MeetFeedItemData meetFeedItemData2 = this.f4964y;
            newMeetFragPresenter.m7219i1(meetFeedItemData2, ((CopyObject) meetFeedItemData2.moment).id, meetFeedItemData2.originalMoment);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m6994z0(User user, boolean z) {
        this.f4964y.isAllShow = z;
        if (z) {
            zvf0.u("e_meet_card_unfold", "p_meet", new j760[]{vwb.Y("other_user_id", ((DbObject) user).id)});
        }
    }

    public MeetFeedBaseItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MeetFeedBaseItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
