package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.RecommendUsers;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendUserItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.jyb;
import p153l.k3h;
import p153l.k9c0;
import p153l.lbc0;
import p153l.o1j0;
import p153l.oaj0;
import p153l.pf60;
import p153l.psd0;
import p153l.q8g0;
import p153l.qa00;
import p153l.saj0;
import p153l.tfj0;
import p153l.uqb0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class TopicRecommendUserItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f43419a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f43420b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f43421c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f43422d;

    /* JADX INFO: renamed from: e */
    public VFrame f43423e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f43424f;

    /* JADX INFO: renamed from: g */
    public VLinear f43425g;

    /* JADX INFO: renamed from: h */
    public TextView f43426h;

    /* JADX INFO: renamed from: i */
    public TextView f43427i;

    /* JADX INFO: renamed from: j */
    public VText f43428j;

    /* JADX INFO: renamed from: k */
    public VText f43429k;

    /* JADX INFO: renamed from: l */
    public VButton f43430l;

    /* JADX INFO: renamed from: m */
    public final int f43431m;

    /* JADX INFO: renamed from: n */
    public final int f43432n;

    /* JADX INFO: renamed from: o */
    public String f43433o;

    /* JADX INFO: renamed from: p */
    public User f43434p;

    /* JADX INFO: renamed from: q */
    public Act f43435q;

    public TopicRecommendUserItemView(Context context) {
        super(context);
        this.f43431m = qa00.m175859d(164.0f);
        this.f43432n = qa00.m175859d(12.0f);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m66455b(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m66459f(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m66460g(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public final void m66461h(View view) {
        saj0.m185270a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final void m66462i(boolean z, User user) {
        tfj0.m190940c(z ? MatchScData.ModuleId.mid_e_follow : "e_cancelfollow", this.f43433o, pf60.m172085a("owner_id", user.f56859id), pf60.m172085a("source_module_id", "e_user_suggest_card"), pf60.m172085a("receiver_user_id", user.f56859id));
    }

    /* JADX INFO: renamed from: j */
    public final Picture m66463j(Media media) {
        return media instanceof Picture ? (Picture) media : ((Video) media).cover;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m66464k(pf60 pf60Var) {
        if (NullChecker.m82486a(this.f43434p) && NullChecker.m82486a(pf60Var.f152156a) && this.f43434p.f56859id.equals(((User) pf60Var.f152156a).f56859id)) {
            m66470q((User) pf60Var.f152156a);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m66465l(User user) {
        FeedModule.f39703d.m145743m7(FeedModule.m61405F().userId(), user, false, "p_activity").subscribe(psd0.m173597H(new oaj0(this), new y20() { // from class: l.raj0
            @Override // p153l.y20
            public final void call(Object obj) {
                TopicRecommendUserItemView.m66460g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m66466m(final User user, View view) {
        if (!NullChecker.m82486a(user.localFollowship)) {
            m66462i(true, user);
            FeedModule.f39703d.m145743m7(FeedModule.m61405F().userId(), user, true, this.f43433o).subscribe(psd0.m173597H(new oaj0(this), new y20() { // from class: l.qaj0
                @Override // p153l.y20
                public final void call(Object obj) {
                    TopicRecommendUserItemView.m66459f((Throwable) obj);
                }
            }));
            return;
        }
        FollowshipStatus followshipStatus = user.localFollowship.state;
        if (TEnum.equals(followshipStatus, "matched") || TEnum.equals(followshipStatus, FollowshipStatus.following)) {
            m66462i(false, user);
            k3h.m148105v0((Act) getContext(), getResources().getString(R$string.f40031z), new x20() { // from class: l.naj0
                @Override // p153l.x20
                public final void call() {
                    this.f141022a.m66465l(user);
                }
            });
            return;
        }
        m66462i(true, user);
        if (user.profile.moments.hidePublicMoments) {
            o1j0.m165649w(R$string.f39977q);
        } else {
            FeedModule.f39703d.m145743m7(FeedModule.m61405F().userId(), user, true, this.f43433o).subscribe(psd0.m173597H(new oaj0(this), new y20() { // from class: l.paj0
                @Override // p153l.y20
                public final void call(Object obj) {
                    TopicRecommendUserItemView.m66455b((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m66467n(Picture picture, VDraweeView vDraweeView, int i) {
        if (picture == null || TEnum.equals(picture.status, "raw") || TextUtils.isEmpty(picture.url)) {
            return;
        }
        uqb0.f180374G.m127125Q0(vDraweeView, picture.calculatedWidth(i));
        vDraweeView.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
    }

    /* JADX INFO: renamed from: o */
    public void m66468o(Act act, RecommendUsers recommendUsers, List<Moment> list, String str) {
        this.f43435q = act;
        this.f43433o = str;
        User userM145688e8 = FeedModule.f39703d.m145688e8(recommendUsers.userId);
        this.f43434p = userM145688e8;
        if (userM145688e8 == null) {
            return;
        }
        m66471r(list);
        uqb0.f180374G.m127125Q0(this.f43424f, this.f43434p.m61308fp().profileSmall());
        this.f43426h.setText(this.f43434p.name);
        bnl0.m105524M(this.f43427i, !FeedModule.m61406H().hideAge(this.f43434p));
        this.f43427i.setText(String.valueOf(this.f43434p.age));
        this.f43428j.setText(q8g0.m175816u(recommendUsers.followerCounter) + "人关注");
        this.f43429k.setText(recommendUsers.recommendation);
        m66470q(this.f43434p);
        act.duringCreated(FeedModule.f39703d.f121322Q0).subscribe(psd0.m173596G(new y20() { // from class: l.laj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130705a.m66464k((pf60) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66461h(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m66469p(Followship followship) {
        if (!TEnum.equals(followship.state, "matched") && !TEnum.equals(followship.state, FollowshipStatus.following)) {
            this.f43430l.setBackground(getResources().getDrawable(lbc0.f131115p4));
            this.f43430l.setSelected(false);
            this.f43430l.setText(R$string.f39814R2);
            this.f43430l.setTextColor(-1);
            return;
        }
        this.f43430l.setBackground(getResources().getDrawable(lbc0.f131115p4));
        this.f43430l.setSelected(true);
        this.f43430l.setTextColor(-1);
        boolean zEquals = TEnum.equals(followship.state, "matched");
        VButton vButton = this.f43430l;
        if (zEquals) {
            vButton.setText(R$string.f39790N2);
            this.f43430l.setTextColor(getResources().getColor(k9c0.f124474F));
        } else {
            vButton.setText(R$string.f39802P2);
            this.f43430l.setTextColor(getResources().getColor(k9c0.f124474F));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m66470q(final User user) {
        if (NullChecker.m82486a(user.localFollowship)) {
            m66469p(user.localFollowship);
        } else {
            this.f43430l.setBackground(getResources().getDrawable(lbc0.f131115p4));
            this.f43430l.setSelected(false);
            this.f43430l.setText(R$string.f39814R2);
            this.f43430l.setTextColor(-1);
        }
        this.f43430l.setOnClickListener(new View.OnClickListener() { // from class: l.maj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135555a.m66466m(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m66471r(List<Moment> list) {
        if (jyb.m147479J(list)) {
            m66472s();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Moment> it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().media);
        }
        int size = arrayList.size();
        if (size == 0) {
            m66472s();
        } else if (size == 1) {
            m66473t(arrayList);
        } else if (size == 2) {
            m66475v(arrayList);
        } else if (size == 3) {
            m66474u(arrayList);
        }
        if (arrayList.size() > 3) {
            m66474u(arrayList);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m66472s() {
        bnl0.m105524M(this.f43421c, false);
        bnl0.m105524M(this.f43422d, false);
        VDraweeView vDraweeView = this.f43420b;
        int i = this.f43432n;
        m66476w(vDraweeView, i, i, 0, 0);
        uqb0.f180374G.m127125Q0(this.f43420b, this.f43434p.m61308fp().profileSmall());
    }

    /* JADX INFO: renamed from: t */
    public final void m66473t(List<Media> list) {
        bnl0.m105524M(this.f43421c, false);
        bnl0.m105524M(this.f43422d, false);
        m66467n(m66463j(list.get(0)), this.f43420b, this.f43431m);
        VDraweeView vDraweeView = this.f43420b;
        int i = this.f43432n;
        m66476w(vDraweeView, i, i, 0, 0);
    }

    /* JADX INFO: renamed from: u */
    public final void m66474u(List<Media> list) {
        bnl0.m105524M(this.f43421c, true);
        bnl0.m105524M(this.f43422d, true);
        m66476w(this.f43420b, this.f43432n, 0, 0, 0);
        m66476w(this.f43421c, 0, 0, 0, 0);
        m66476w(this.f43422d, 0, this.f43432n, 0, 0);
        Media media = list.get(0);
        Media media2 = list.get(1);
        Media media3 = list.get(2);
        Picture pictureM66463j = m66463j(media);
        Picture pictureM66463j2 = m66463j(media2);
        Picture pictureM66463j3 = m66463j(media3);
        m66467n(pictureM66463j, this.f43420b, this.f43431m / 3);
        m66467n(pictureM66463j2, this.f43421c, this.f43431m / 3);
        m66467n(pictureM66463j3, this.f43422d, this.f43431m / 3);
    }

    /* JADX INFO: renamed from: v */
    public final void m66475v(List<Media> list) {
        bnl0.m105524M(this.f43421c, true);
        bnl0.m105524M(this.f43422d, false);
        m66476w(this.f43420b, this.f43432n, 0, 0, 0);
        m66476w(this.f43421c, 0, this.f43432n, 0, 0);
        Media media = list.get(0);
        Media media2 = list.get(1);
        Picture pictureM66463j = m66463j(media);
        Picture pictureM66463j2 = m66463j(media2);
        m66467n(pictureM66463j, this.f43420b, this.f43431m / 2);
        m66467n(pictureM66463j2, this.f43421c, this.f43431m / 2);
    }

    /* JADX INFO: renamed from: w */
    public final void m66476w(VDraweeView vDraweeView, int i, int i2, int i3, int i4) {
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8318r(i, i2, i4, i3);
        vDraweeView.getHierarchy().m207045H(roundingParams);
    }

    public TopicRecommendUserItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43431m = qa00.m175859d(164.0f);
        this.f43432n = qa00.m175859d(12.0f);
    }

    public TopicRecommendUserItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43431m = qa00.m175859d(164.0f);
        this.f43432n = qa00.m175859d(12.0f);
    }
}
