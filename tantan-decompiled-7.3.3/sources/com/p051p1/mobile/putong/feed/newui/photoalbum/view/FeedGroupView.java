package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Group;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.TopicOperationsGroup;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct;
import com.p051p1.mobile.putong.feed.newui.view.FeedAudioPlayerView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p151v.text.CustomTypefaceSpan;
import p153l.at0;
import p153l.bnl0;
import p153l.cmg;
import p153l.h9i;
import p153l.jyb;
import p153l.ksg;
import p153l.lbc0;
import p153l.n8h;
import p153l.pf60;
import p153l.pzi0;
import p153l.qa00;
import p153l.qtg;
import p153l.tfj0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedGroupView extends VRelative {

    /* JADX INFO: renamed from: A */
    public VImage f43232A;

    /* JADX INFO: renamed from: B */
    public VImage f43233B;

    /* JADX INFO: renamed from: C */
    public String f43234C;

    /* JADX INFO: renamed from: D */
    public boolean f43235D;

    /* JADX INFO: renamed from: E */
    public Group f43236E;

    /* JADX INFO: renamed from: F */
    public Moment f43237F;

    /* JADX INFO: renamed from: d */
    public VRelative f43238d;

    /* JADX INFO: renamed from: e */
    public VRelative f43239e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f43240f;

    /* JADX INFO: renamed from: g */
    public VRelative f43241g;

    /* JADX INFO: renamed from: h */
    public VImage f43242h;

    /* JADX INFO: renamed from: i */
    public VLinear f43243i;

    /* JADX INFO: renamed from: j */
    public VRelative f43244j;

    /* JADX INFO: renamed from: k */
    public TextView f43245k;

    /* JADX INFO: renamed from: l */
    public VLinear f43246l;

    /* JADX INFO: renamed from: m */
    public VFrame f43247m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f43248n;

    /* JADX INFO: renamed from: o */
    public VFrame f43249o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f43250p;

    /* JADX INFO: renamed from: q */
    public VFrame f43251q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f43252r;

    /* JADX INFO: renamed from: s */
    public VText f43253s;

    /* JADX INFO: renamed from: t */
    public VImage f43254t;

    /* JADX INFO: renamed from: u */
    public TextView f43255u;

    /* JADX INFO: renamed from: v */
    public VFrame f43256v;

    /* JADX INFO: renamed from: w */
    public FeedAudioPlayerView f43257w;

    /* JADX INFO: renamed from: x */
    public VFrame f43258x;

    /* JADX INFO: renamed from: y */
    public VFrame f43259y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f43260z;

    public FeedGroupView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m66303I(View view) {
        this.f43237F.setRecommendTime(pzi0.m174454o() - ((long) ((new Random().nextInt(5) + 1) * 1000)));
        m66311z();
        getContext().startActivity(new FeedGroupDetailAct.C11363a((Act) getContext(), this.f43236E.f56859id).m63173d(this.f43237F.f56859id).m63170a());
    }

    private List<pf60<String, String>> getFeedGroupViewTrackingParis() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pf60.m172085a("circle_id", this.f43236E.f56859id));
        arrayList.add(pf60.m172085a("moment_id", this.f43237F.f56859id));
        return arrayList;
    }

    /* JADX INFO: renamed from: B */
    public final void m66305B() {
        bnl0.m105524M(this.f43256v, true);
        if (ksg.m151189X(this.f43237F)) {
            bnl0.m105524M(this.f43257w, true);
            bnl0.m105524M(this.f43258x, false);
            bnl0.m105524M(this.f43259y, false);
            this.f43257w.m67464Z0(this.f43237F, false);
            this.f43257w.m67467e1(this.f43234C, this.f43235D);
        } else if (jyb.m147479J(this.f43237F.media)) {
            bnl0.m105524M(this.f43256v, false);
            bnl0.m105524M(this.f43257w, false);
            bnl0.m105524M(this.f43258x, false);
            bnl0.m105524M(this.f43259y, false);
        } else {
            Media media = this.f43237F.media.get(0);
            if (media instanceof Video) {
                bnl0.m105524M(this.f43257w, false);
                bnl0.m105524M(this.f43258x, false);
                bnl0.m105524M(this.f43259y, true);
                m66309O(media);
            } else if (media instanceof Picture) {
                bnl0.m105524M(this.f43257w, false);
                bnl0.m105524M(this.f43258x, true);
                bnl0.m105524M(this.f43259y, false);
                m66308M(this.f43237F.media);
            }
        }
        bnl0.m105537U(this.f43238d, qa00.m175859d(bnl0.m105529O0(this.f43256v) ? 18.0f : 15.0f));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: H */
    public final void m66306H(List<User> list, int i) {
        String str;
        this.f43245k.setText(this.f43236E.name);
        if (list.size() >= 3) {
            uqb0.f180374G.m127125Q0(this.f43248n, list.get(2).m61308fp().profileSmall());
            uqb0.f180374G.m127125Q0(this.f43250p, list.get(1).m61308fp().profileSmall());
            uqb0.f180374G.m127125Q0(this.f43252r, list.get(0).m61308fp().profileSmall());
        }
        if (TextUtils.equals(this.f43234C, "from_nearby_focus")) {
            if (i > 99) {
                str = "99+";
            } else {
                str = i + "";
            }
            this.f43253s.setText("等人更新了" + str + "条内容");
        } else {
            this.f43253s.setText(this.f43236E.userCounter + "人正在圈子中热聊");
        }
        User userM145688e8 = FeedModule.f39703d.m145688e8(this.f43237F.owner);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@" + at0.m100007a(this.f43237F, h9i.m134070k(userM145688e8 != null ? userM145688e8.name : "", 8)));
        if (!TextUtils.isEmpty(this.f43237F.value)) {
            spannableStringBuilder.append((CharSequence) ": ");
        }
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) this.f43237F.value);
        this.f43255u.setText(spannableStringBuilder);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.m8h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135185a.m66303I(view);
            }
        });
        this.f43257w.setMaxWidth(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        m66305B();
    }

    /* JADX INFO: renamed from: L */
    public void m66307L(String str, boolean z, Moment moment, pf60<TopicOperationsGroup, Group> pf60Var) {
        TopicOperationsGroup topicOperationsGroup;
        Group group;
        boolean z2 = false;
        if (pf60Var == null || moment == null || (topicOperationsGroup = pf60Var.f152156a) == null || (group = pf60Var.f152157b) == null) {
            bnl0.m105524M(this.f43238d, false);
            return;
        }
        this.f43234C = str;
        this.f43235D = z;
        this.f43236E = group;
        this.f43237F = moment;
        TopicOperationsGroup topicOperationsGroup2 = topicOperationsGroup;
        bnl0.m105524M(this.f43238d, true);
        bnl0.m105524M(this.f43241g, cmg.m111187O());
        bnl0.m105524M(this.f43240f, !cmg.m111187O());
        if (!cmg.m111187O()) {
            uqb0.f180374G.m127109I0(this.f43240f, this.f43236E.headIcon, qa00.m175859d(38.0f), qa00.m175859d(40.0f));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = topicOperationsGroup2.userIds.iterator();
        while (it.hasNext()) {
            User userM145688e8 = FeedModule.f39703d.m145688e8(it.next());
            if (NullChecker.m82486a(userM145688e8)) {
                arrayList.add(userM145688e8);
            }
        }
        VLinear vLinear = this.f43246l;
        if (topicOperationsGroup2.unread >= 3 && arrayList.size() >= 3) {
            z2 = true;
        }
        bnl0.m105524M(vLinear, z2);
        m66306H(arrayList, topicOperationsGroup2.unread);
    }

    /* JADX INFO: renamed from: M */
    public final void m66308M(List<Media> list) {
        qtg.m177930f(this.f43237F, list, this.f43258x, "", true, null);
    }

    /* JADX INFO: renamed from: O */
    public final void m66309O(Media media) {
        Picture picture = ((Video) media).cover;
        if (picture == null) {
            return;
        }
        this.f43260z.getHierarchy().m207045H(RoundingParams.m8303c(ksg.m151240y()).m8323w(RoundingParams.RoundingMethod.BITMAP_ONLY));
        bnl0.m105524M(this.f43232A, false);
        this.f43233B.setImageResource(lbc0.f130813B6);
        if (TEnum.equals(picture.status, "raw") || TextUtils.isEmpty(picture.url)) {
            return;
        }
        uqb0.f180374G.m127125Q0(this.f43260z, picture.calculatedWidth(qa00.m175859d(94.0f)));
        this.f43260z.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setPadding(0, 1, 0, 0);
        m66310q(this);
    }

    /* JADX INFO: renamed from: q */
    public final void m66310q(View view) {
        n8h.m161923a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public void m66311z() {
        tfj0.m190940c("e_circle_update", ksg.m151174K(this.f43234C, this.f43235D), (pf60[]) getFeedGroupViewTrackingParis().toArray(new pf60[0]));
    }

    public FeedGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
