package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.RecommendUsers;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendUserItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;
import p149l.d30;
import p149l.e1c0;
import p149l.e30;
import p149l.f3c0;
import p149l.i0g0;
import p149l.j760;
import p149l.k1j0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.o1j0;
import p149l.p6j0;
import p149l.qib0;
import p149l.t100;
import p149l.v1h;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class TopicRecommendUserItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f42571a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f42572b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f42573c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f42574d;

    /* JADX INFO: renamed from: e */
    public VFrame f42575e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f42576f;

    /* JADX INFO: renamed from: g */
    public VLinear f42577g;

    /* JADX INFO: renamed from: h */
    public TextView f42578h;

    /* JADX INFO: renamed from: i */
    public TextView f42579i;

    /* JADX INFO: renamed from: j */
    public VText f42580j;

    /* JADX INFO: renamed from: k */
    public VText f42581k;

    /* JADX INFO: renamed from: l */
    public VButton f42582l;

    /* JADX INFO: renamed from: m */
    public final int f42583m;

    /* JADX INFO: renamed from: n */
    public final int f42584n;

    /* JADX INFO: renamed from: o */
    public String f42585o;

    /* JADX INFO: renamed from: p */
    public User f42586p;

    /* JADX INFO: renamed from: q */
    public Act f42587q;

    public TopicRecommendUserItemView(Context context) {
        super(context);
        this.f42583m = t100.m186890d(164.0f);
        this.f42584n = t100.m186890d(12.0f);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m65272b(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m65276f(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m65277g(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public final void m65278h(View view) {
        o1j0.m162255a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final void m65279i(boolean z, User user) {
        p6j0.m167669c(z ? MatchScData.ModuleId.mid_e_follow : "e_cancelfollow", this.f42585o, j760.m140076a("owner_id", user.f56011id), j760.m140076a("source_module_id", "e_user_suggest_card"), j760.m140076a("receiver_user_id", user.f56011id));
    }

    /* JADX INFO: renamed from: j */
    public final Picture m65280j(Media media) {
        return media instanceof Picture ? (Picture) media : ((Video) media).cover;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m65281k(j760 j760Var) {
        if (NullChecker.m81303a(this.f42586p) && NullChecker.m81303a(j760Var.f116564a) && this.f42586p.f56011id.equals(((User) j760Var.f116564a).f56011id)) {
            m65287q((User) j760Var.f116564a);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m65282l(User user) {
        FeedModule.f38855d.m209502m7(FeedModule.m60221F().userId(), user, false, "p_activity").subscribe(mkd0.m154956H(new k1j0(this), new e30() { // from class: l.n1j0
            @Override // p149l.e30
            public final void call(Object obj) {
                TopicRecommendUserItemView.m65277g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m65283m(final User user, View view) {
        if (!NullChecker.m81303a(user.localFollowship)) {
            m65279i(true, user);
            FeedModule.f38855d.m209502m7(FeedModule.m60221F().userId(), user, true, this.f42585o).subscribe(mkd0.m154956H(new k1j0(this), new e30() { // from class: l.m1j0
                @Override // p149l.e30
                public final void call(Object obj) {
                    TopicRecommendUserItemView.m65276f((Throwable) obj);
                }
            }));
            return;
        }
        FollowshipStatus followshipStatus = user.localFollowship.state;
        if (TEnum.equals(followshipStatus, "matched") || TEnum.equals(followshipStatus, FollowshipStatus.following)) {
            m65279i(false, user);
            v1h.m196628v0((Act) getContext(), getResources().getString(R$string.f39183z), new d30() { // from class: l.j1j0
                @Override // p149l.d30
                public final void call() {
                    this.f115817a.m65282l(user);
                }
            });
            return;
        }
        m65279i(true, user);
        if (user.profile.moments.hidePublicMoments) {
            lsi0.m151593w(R$string.f39129q);
        } else {
            FeedModule.f38855d.m209502m7(FeedModule.m60221F().userId(), user, true, this.f42585o).subscribe(mkd0.m154956H(new k1j0(this), new e30() { // from class: l.l1j0
                @Override // p149l.e30
                public final void call(Object obj) {
                    TopicRecommendUserItemView.m65272b((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m65284n(Picture picture, VDraweeView vDraweeView, int i) {
        if (picture == null || TEnum.equals(picture.status, "raw") || TextUtils.isEmpty(picture.url)) {
            return;
        }
        qib0.f154691G.m102341Q0(vDraweeView, picture.calculatedWidth(i));
        vDraweeView.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
    }

    /* JADX INFO: renamed from: o */
    public void m65285o(Act act, RecommendUsers recommendUsers, List<Moment> list, String str) {
        this.f42587q = act;
        this.f42585o = str;
        User userM209447e8 = FeedModule.f38855d.m209447e8(recommendUsers.userId);
        this.f42586p = userM209447e8;
        if (userM209447e8 == null) {
            return;
        }
        m65288r(list);
        qib0.f154691G.m102341Q0(this.f42576f, this.f42586p.m60124fp().profileSmall());
        this.f42578h.setText(this.f42586p.name);
        xdl0.m208344M(this.f42579i, !FeedModule.m60222H().hideAge(this.f42586p));
        this.f42579i.setText(String.valueOf(this.f42586p.age));
        this.f42580j.setText(i0g0.m133881u(recommendUsers.followerCounter) + "人关注");
        this.f42581k.setText(recommendUsers.recommendation);
        m65287q(this.f42586p);
        act.duringCreated(FeedModule.f38855d.f193012Q0).subscribe(mkd0.m154955G(new e30() { // from class: l.h1j0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105434a.m65281k((j760) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65278h(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m65286p(Followship followship) {
        if (!TEnum.equals(followship.state, "matched") && !TEnum.equals(followship.state, FollowshipStatus.following)) {
            this.f42582l.setBackground(getResources().getDrawable(f3c0.f94597p4));
            this.f42582l.setSelected(false);
            this.f42582l.setText(R$string.f38966R2);
            this.f42582l.setTextColor(-1);
            return;
        }
        this.f42582l.setBackground(getResources().getDrawable(f3c0.f94597p4));
        this.f42582l.setSelected(true);
        this.f42582l.setTextColor(-1);
        boolean zEquals = TEnum.equals(followship.state, "matched");
        VButton vButton = this.f42582l;
        if (zEquals) {
            vButton.setText(R$string.f38942N2);
            this.f42582l.setTextColor(getResources().getColor(e1c0.f88751F));
        } else {
            vButton.setText(R$string.f38954P2);
            this.f42582l.setTextColor(getResources().getColor(e1c0.f88751F));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m65287q(final User user) {
        if (NullChecker.m81303a(user.localFollowship)) {
            m65286p(user.localFollowship);
        } else {
            this.f42582l.setBackground(getResources().getDrawable(f3c0.f94597p4));
            this.f42582l.setSelected(false);
            this.f42582l.setText(R$string.f38966R2);
            this.f42582l.setTextColor(-1);
        }
        this.f42582l.setOnClickListener(new View.OnClickListener() { // from class: l.i1j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110462a.m65283m(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m65288r(List<Moment> list) {
        if (vwb.m200296J(list)) {
            m65289s();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Moment> it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().media);
        }
        int size = arrayList.size();
        if (size == 0) {
            m65289s();
        } else if (size == 1) {
            m65290t(arrayList);
        } else if (size == 2) {
            m65292v(arrayList);
        } else if (size == 3) {
            m65291u(arrayList);
        }
        if (arrayList.size() > 3) {
            m65291u(arrayList);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m65289s() {
        xdl0.m208344M(this.f42573c, false);
        xdl0.m208344M(this.f42574d, false);
        VDraweeView vDraweeView = this.f42572b;
        int i = this.f42584n;
        m65293w(vDraweeView, i, i, 0, 0);
        qib0.f154691G.m102341Q0(this.f42572b, this.f42586p.m60124fp().profileSmall());
    }

    /* JADX INFO: renamed from: t */
    public final void m65290t(List<Media> list) {
        xdl0.m208344M(this.f42573c, false);
        xdl0.m208344M(this.f42574d, false);
        m65284n(m65280j(list.get(0)), this.f42572b, this.f42583m);
        VDraweeView vDraweeView = this.f42572b;
        int i = this.f42584n;
        m65293w(vDraweeView, i, i, 0, 0);
    }

    /* JADX INFO: renamed from: u */
    public final void m65291u(List<Media> list) {
        xdl0.m208344M(this.f42573c, true);
        xdl0.m208344M(this.f42574d, true);
        m65293w(this.f42572b, this.f42584n, 0, 0, 0);
        m65293w(this.f42573c, 0, 0, 0, 0);
        m65293w(this.f42574d, 0, this.f42584n, 0, 0);
        Media media = list.get(0);
        Media media2 = list.get(1);
        Media media3 = list.get(2);
        Picture pictureM65280j = m65280j(media);
        Picture pictureM65280j2 = m65280j(media2);
        Picture pictureM65280j3 = m65280j(media3);
        m65284n(pictureM65280j, this.f42572b, this.f42583m / 3);
        m65284n(pictureM65280j2, this.f42573c, this.f42583m / 3);
        m65284n(pictureM65280j3, this.f42574d, this.f42583m / 3);
    }

    /* JADX INFO: renamed from: v */
    public final void m65292v(List<Media> list) {
        xdl0.m208344M(this.f42573c, true);
        xdl0.m208344M(this.f42574d, false);
        m65293w(this.f42572b, this.f42584n, 0, 0, 0);
        m65293w(this.f42573c, 0, this.f42584n, 0, 0);
        Media media = list.get(0);
        Media media2 = list.get(1);
        Picture pictureM65280j = m65280j(media);
        Picture pictureM65280j2 = m65280j(media2);
        m65284n(pictureM65280j, this.f42572b, this.f42583m / 2);
        m65284n(pictureM65280j2, this.f42573c, this.f42583m / 2);
    }

    /* JADX INFO: renamed from: w */
    public final void m65293w(VDraweeView vDraweeView, int i, int i2, int i3, int i4) {
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8264r(i, i2, i4, i3);
        vDraweeView.getHierarchy().m112053H(roundingParams);
    }

    public TopicRecommendUserItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42583m = t100.m186890d(164.0f);
        this.f42584n = t100.m186890d(12.0f);
    }

    public TopicRecommendUserItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42583m = t100.m186890d(164.0f);
        this.f42584n = t100.m186890d(12.0f);
    }
}
