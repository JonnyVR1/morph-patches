package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.data.Followship;
import com.p000p1.mobile.putong.data.FollowshipStatus;
import com.p000p1.mobile.putong.data.MatchScData;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.RecommendUsers;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendUserItemView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.d30;
import l.e30;
import l.i0g0;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import p007l.e1c0;
import p007l.f3c0;
import p007l.k1j0;
import p007l.o1j0;
import p007l.p6j0;
import p007l.v1h;
import v.VButton;
import v.VDraweeView;
import v.VFrame;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TopicRecommendUserItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f4032a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f4033b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f4034c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f4035d;

    /* JADX INFO: renamed from: e */
    public VFrame f4036e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f4037f;

    /* JADX INFO: renamed from: g */
    public VLinear f4038g;

    /* JADX INFO: renamed from: h */
    public TextView f4039h;

    /* JADX INFO: renamed from: i */
    public TextView f4040i;

    /* JADX INFO: renamed from: j */
    public VText f4041j;

    /* JADX INFO: renamed from: k */
    public VText f4042k;

    /* JADX INFO: renamed from: l */
    public VButton f4043l;

    /* JADX INFO: renamed from: m */
    public final int f4044m;

    /* JADX INFO: renamed from: n */
    public final int f4045n;

    /* JADX INFO: renamed from: o */
    public String f4046o;

    /* JADX INFO: renamed from: p */
    public User f4047p;

    /* JADX INFO: renamed from: q */
    public Act f4048q;

    public TopicRecommendUserItemView(Context context) {
        super(context);
        this.f4044m = t100.d(164.0f);
        this.f4045n = t100.d(12.0f);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m6373b(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m6377f(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m6378g(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public final void m6379h(View view) {
        o1j0.m12425a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final void m6380i(boolean z, User user) {
        p6j0.m12913c(z ? MatchScData.ModuleId.mid_e_follow : "e_cancelfollow", this.f4046o, j760.a("owner_id", ((DbObject) user).id), j760.a("source_module_id", "e_user_suggest_card"), j760.a("receiver_user_id", ((DbObject) user).id));
    }

    /* JADX INFO: renamed from: j */
    public final Picture m6381j(Media media) {
        return media instanceof Picture ? (Picture) media : ((Video) media).cover;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m6382k(j760 j760Var) {
        if (NullChecker.a(this.f4047p) && NullChecker.a(j760Var.a) && ((DbObject) this.f4047p).id.equals(((DbObject) ((User) j760Var.a)).id)) {
            m6388q((User) j760Var.a);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m6383l(User user) {
        FeedModule.f316d.m16683m7(FeedModule.m1139F().userId(), user, false, "p_activity").subscribe(mkd0.H(new k1j0(this), new e30() { // from class: l.n1j0
            public final void call(Object obj) {
                TopicRecommendUserItemView.m6378g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m6384m(final User user, View view) {
        if (!NullChecker.a(user.localFollowship)) {
            m6380i(true, user);
            FeedModule.f316d.m16683m7(FeedModule.m1139F().userId(), user, true, this.f4046o).subscribe(mkd0.H(new k1j0(this), new e30() { // from class: l.m1j0
                public final void call(Object obj) {
                    TopicRecommendUserItemView.m6377f((Throwable) obj);
                }
            }));
            return;
        }
        FollowshipStatus followshipStatus = user.localFollowship.state;
        if (TEnum.equals(followshipStatus, "matched") || TEnum.equals(followshipStatus, FollowshipStatus.following)) {
            m6380i(false, user);
            v1h.m15267v0(getContext(), getResources().getString(R$string.f644z), new d30() { // from class: l.j1j0
                public final void call() {
                    this.f9184a.m6383l(user);
                }
            });
            return;
        }
        m6380i(true, user);
        if (user.profile.moments.hidePublicMoments) {
            lsi0.w(R$string.f590q);
        } else {
            FeedModule.f316d.m16683m7(FeedModule.m1139F().userId(), user, true, this.f4046o).subscribe(mkd0.H(new k1j0(this), new e30() { // from class: l.l1j0
                public final void call(Object obj) {
                    TopicRecommendUserItemView.m6373b((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m6385n(Picture picture, VDraweeView vDraweeView, int i) {
        if (picture == null || TEnum.equals(picture.status, MediaLocalStatus.raw) || TextUtils.isEmpty(picture.url)) {
            return;
        }
        qib0.G.Q0(vDraweeView, picture.calculatedWidth(i));
        vDraweeView.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
    }

    /* JADX INFO: renamed from: o */
    public void m6386o(Act act, RecommendUsers recommendUsers, List<Moment> list, String str) {
        this.f4048q = act;
        this.f4046o = str;
        User userM16628e8 = FeedModule.f316d.m16628e8(recommendUsers.userId);
        this.f4047p = userM16628e8;
        if (userM16628e8 == null) {
            return;
        }
        m6389r(list);
        qib0.G.Q0(this.f4037f, this.f4047p.m1042fp().profileSmall());
        this.f4039h.setText(this.f4047p.name);
        xdl0.M(this.f4040i, !FeedModule.m1140H().hideAge(this.f4047p));
        this.f4040i.setText(String.valueOf(this.f4047p.age));
        this.f4041j.setText(i0g0.u(recommendUsers.followerCounter) + "人关注");
        this.f4042k.setText(recommendUsers.recommendation);
        m6388q(this.f4047p);
        act.duringCreated(FeedModule.f316d.f14947Q0).subscribe(mkd0.G(new e30() { // from class: l.h1j0
            public final void call(Object obj) {
                this.f8558a.m6382k((j760) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6379h(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m6387p(Followship followship) {
        if (!TEnum.equals(followship.state, "matched") && !TEnum.equals(followship.state, FollowshipStatus.following)) {
            this.f4043l.setBackground(getResources().getDrawable(f3c0.f7880p4));
            this.f4043l.setSelected(false);
            this.f4043l.setText(R$string.f427R2);
            this.f4043l.setTextColor(-1);
            return;
        }
        this.f4043l.setBackground(getResources().getDrawable(f3c0.f7880p4));
        this.f4043l.setSelected(true);
        this.f4043l.setTextColor(-1);
        boolean zEquals = TEnum.equals(followship.state, "matched");
        VButton vButton = this.f4043l;
        if (zEquals) {
            vButton.setText(R$string.f403N2);
            this.f4043l.setTextColor(getResources().getColor(e1c0.f7107F));
        } else {
            vButton.setText(R$string.f415P2);
            this.f4043l.setTextColor(getResources().getColor(e1c0.f7107F));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m6388q(final User user) {
        if (NullChecker.a(user.localFollowship)) {
            m6387p(user.localFollowship);
        } else {
            this.f4043l.setBackground(getResources().getDrawable(f3c0.f7880p4));
            this.f4043l.setSelected(false);
            this.f4043l.setText(R$string.f427R2);
            this.f4043l.setTextColor(-1);
        }
        this.f4043l.setOnClickListener(new View.OnClickListener() { // from class: l.i1j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8868a.m6384m(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m6389r(List<Moment> list) {
        if (vwb.J(list)) {
            m6390s();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Moment> it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().media);
        }
        int size = arrayList.size();
        if (size == 0) {
            m6390s();
        } else if (size == 1) {
            m6391t(arrayList);
        } else if (size == 2) {
            m6393v(arrayList);
        } else if (size == 3) {
            m6392u(arrayList);
        }
        if (arrayList.size() > 3) {
            m6392u(arrayList);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m6390s() {
        xdl0.M(this.f4034c, false);
        xdl0.M(this.f4035d, false);
        VDraweeView vDraweeView = this.f4033b;
        int i = this.f4045n;
        m6394w(vDraweeView, i, i, 0, 0);
        qib0.G.Q0(this.f4033b, this.f4047p.m1042fp().profileSmall());
    }

    /* JADX INFO: renamed from: t */
    public final void m6391t(List<Media> list) {
        xdl0.M(this.f4034c, false);
        xdl0.M(this.f4035d, false);
        m6385n(m6381j(list.get(0)), this.f4033b, this.f4044m);
        VDraweeView vDraweeView = this.f4033b;
        int i = this.f4045n;
        m6394w(vDraweeView, i, i, 0, 0);
    }

    /* JADX INFO: renamed from: u */
    public final void m6392u(List<Media> list) {
        xdl0.M(this.f4034c, true);
        xdl0.M(this.f4035d, true);
        m6394w(this.f4033b, this.f4045n, 0, 0, 0);
        m6394w(this.f4034c, 0, 0, 0, 0);
        m6394w(this.f4035d, 0, this.f4045n, 0, 0);
        Media media = list.get(0);
        Media media2 = list.get(1);
        Media media3 = list.get(2);
        Picture pictureM6381j = m6381j(media);
        Picture pictureM6381j2 = m6381j(media2);
        Picture pictureM6381j3 = m6381j(media3);
        m6385n(pictureM6381j, this.f4033b, this.f4044m / 3);
        m6385n(pictureM6381j2, this.f4034c, this.f4044m / 3);
        m6385n(pictureM6381j3, this.f4035d, this.f4044m / 3);
    }

    /* JADX INFO: renamed from: v */
    public final void m6393v(List<Media> list) {
        xdl0.M(this.f4034c, true);
        xdl0.M(this.f4035d, false);
        m6394w(this.f4033b, this.f4045n, 0, 0, 0);
        m6394w(this.f4034c, 0, this.f4045n, 0, 0);
        Media media = list.get(0);
        Media media2 = list.get(1);
        Picture pictureM6381j = m6381j(media);
        Picture pictureM6381j2 = m6381j(media2);
        m6385n(pictureM6381j, this.f4033b, this.f4044m / 2);
        m6385n(pictureM6381j2, this.f4034c, this.f4044m / 2);
    }

    /* JADX INFO: renamed from: w */
    public final void m6394w(VDraweeView vDraweeView, int i, int i2, int i3, int i4) {
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.r(i, i2, i4, i3);
        vDraweeView.getHierarchy().H(roundingParams);
    }

    public TopicRecommendUserItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4044m = t100.d(164.0f);
        this.f4045n = t100.d(12.0f);
    }

    public TopicRecommendUserItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4044m = t100.d(164.0f);
        this.f4045n = t100.d(12.0f);
    }
}
