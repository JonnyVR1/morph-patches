package com.p051p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.data.VoteOptions;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.FeedWriterLevelView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedtop.PhotoAlbumTopView;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumTopView;
import com.p051p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear_FillerMeasure;
import p151v.VText;
import p153l.at0;
import p153l.bnl0;
import p153l.cai;
import p153l.cmg;
import p153l.cub0;
import p153l.er60;
import p153l.fsb0;
import p153l.ft5;
import p153l.gj70;
import p153l.hyh;
import p153l.i4g0;
import p153l.jyb;
import p153l.k3h;
import p153l.k9c0;
import p153l.ksg;
import p153l.lbc0;
import p153l.n570;
import p153l.o1j0;
import p153l.orb0;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.tfj0;
import p153l.tmd0;
import p153l.uqb0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class QATopicPhotoAlbumTopView extends VFrame {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f43958a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f43959b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f43960c;

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f43961d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f43962e;

    /* JADX INFO: renamed from: f */
    public TextView f43963f;

    /* JADX INFO: renamed from: g */
    public VLinear_FillerMeasure f43964g;

    /* JADX INFO: renamed from: h */
    public VText f43965h;

    /* JADX INFO: renamed from: i */
    public ImageView f43966i;

    /* JADX INFO: renamed from: j */
    public ImageView f43967j;

    /* JADX INFO: renamed from: k */
    public FeedWriterLevelView f43968k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f43969l;

    /* JADX INFO: renamed from: m */
    public VText f43970m;

    /* JADX INFO: renamed from: n */
    public VText f43971n;

    /* JADX INFO: renamed from: o */
    public String f43972o;

    /* JADX INFO: renamed from: p */
    public Moment f43973p;

    /* JADX INFO: renamed from: q */
    public String f43974q;

    /* JADX INFO: renamed from: r */
    public boolean f43975r;

    /* JADX INFO: renamed from: s */
    public User f43976s;

    /* JADX INFO: renamed from: t */
    public TopicMoment f43977t;

    /* JADX INFO: renamed from: u */
    public PutongFrag f43978u;

    /* JADX INFO: renamed from: v */
    public n570 f43979v;

    /* JADX INFO: renamed from: w */
    public ft5 f43980w;

    public QATopicPhotoAlbumTopView(Context context) {
        super(context);
        this.f43972o = "photo_album_feed_";
        this.f43973p = null;
        this.f43974q = "";
        this.f43980w = new ft5();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m67189C(boolean z, Followship followship) {
        if (z) {
            return;
        }
        o1j0.m165649w(R$string.f39782M0);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m67191F(Throwable th) {
    }

    private BubbleInfo getBubbleInfo() {
        RawFeed rawFeedM177160c;
        if (NullChecker.m82486a(this.f43973p) && NullChecker.m82486a(this.f43979v) && this.f43979v.m161687p() && (rawFeedM177160c = this.f43979v.f140315b.m177160c(this.f43973p.f56859id)) != null) {
            return (BubbleInfo) jyb.m147529r(rawFeedM177160c.states, new qcj() { // from class: l.qtb0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f159401a.m67206R((BubbleInfo) obj);
                }
            });
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m67197v(boolean z, Followship followship) {
        if (z) {
            return;
        }
        o1j0.m165649w(R$string.f39876b3);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m67198w(Throwable th) {
    }

    /* JADX INFO: renamed from: L */
    public final void m67200L(View view) {
        cub0.m112664a(this, view);
    }

    /* JADX INFO: renamed from: M */
    public void m67201M() {
        if (bnl0.m105529O0(this.f43968k)) {
            this.f43968k.m65609j();
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m67202N() {
        if (!NullChecker.m82486a(this.f43963f) || jyb.m147479J(this.f43973p.labels) || TextUtils.isEmpty(this.f43973p.labels.get(0).display)) {
            this.f43963f.setVisibility(8);
            return;
        }
        this.f43963f.setVisibility(0);
        this.f43963f.setText(this.f43973p.labels.get(0).display);
        final int iMeasureText = (int) (this.f43963f.getPaint().measureText((String) this.f43963f.getText()) + qa00.m175859d(8.0f));
        bnl0.m105533Q0(this.f43963f, new y20() { // from class: l.wtb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190733a.m67207S(iMeasureText, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final boolean m67203O(String str) {
        return "qa_latest".equals(str);
    }

    /* JADX INFO: renamed from: P */
    public final boolean m67204P(BubbleInfo bubbleInfo) {
        if (bubbleInfo == null || !bubbleInfo.checkStateTimeIsValid()) {
            return false;
        }
        return (!(act() instanceof TopicAggregationAct) || !NullChecker.m82486a(this.f43963f) || jyb.m147479J(this.f43973p.labels) || TextUtils.isEmpty(this.f43973p.labels.get(0).display)) && !this.f43973p.hasHeadFrame;
    }

    /* JADX INFO: renamed from: Q */
    public final String m67205Q() {
        return this.f43979v.f140315b.m177161d(this.f43973p.f56859id);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ Boolean m67206R(BubbleInfo bubbleInfo) {
        return Boolean.valueOf(TextUtils.equals(this.f43976s.f56859id, bubbleInfo.owner.f39651id));
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m67207S(int i, int[] iArr) {
        this.f43963f.setBackground(new tmd0(Color.parseColor(this.f43973p.labels.get(0).bgColor), qa00.m175859d(5.0f), Math.max(iArr[0], i), iArr[1]));
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m67208T(final boolean z) {
        FeedModule.f39703d.m145743m7(FeedModule.m61405F().userId(), this.f43976s, false, "p_topic_recommend").subscribe(psd0.m173597H(new y20() { // from class: l.rtb0
            @Override // p153l.y20
            public final void call(Object obj) {
                QATopicPhotoAlbumTopView.m67189C(z, (Followship) obj);
            }
        }, new y20() { // from class: l.stb0
            @Override // p153l.y20
            public final void call(Object obj) {
                QATopicPhotoAlbumTopView.m67191F((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m67209V(View view) {
        i4g0.m138523u(MatchScData.ModuleId.mid_e_likeButton, "p_topic_recommend", jyb.m147494Y("moments_user_id", this.f43976s.f56859id));
        FeedModule.m61406H().mo31791kn(act(), this.f43976s, !this.f43975r, null, LikeFrom.get("moment"), NullChecker.m82486a(this.f43973p) ? this.f43973p.f56859id : null, null, null);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m67210W(FollowshipStatus followshipStatus, View view) {
        m67214a0(followshipStatus, false);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m67211X(View view) {
        er60.m122104w().m122130s(this.f43973p, ksg.m151174K(this.f43974q, false), true, false);
        FeedModule.f39702c.m61908f3(act(), this.f43976s, this.f43973p, ksg.m151174K(this.f43974q, false), false);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m67212Y(View view) {
        m67226p0(view);
        m67225o0();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m67213Z(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ytb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f201500a.m67212Y(view2);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public final void m67214a0(FollowshipStatus followshipStatus, final boolean z) {
        if (NullChecker.m82486a(followshipStatus) && (TEnum.equals(followshipStatus, FollowshipStatus.following) || TEnum.equals(followshipStatus, "matched"))) {
            m67221j0(false);
            k3h.m148105v0(act(), getResources().getString(R$string.f40031z), new x20() { // from class: l.ztb0
                @Override // p153l.x20
                public final void call() {
                    this.f205960a.m67208T(z);
                }
            });
            return;
        }
        m67221j0(true);
        User user = this.f43976s;
        if (!user.profile.moments.hidePublicMoments || User.isMatched(user)) {
            FeedModule.f39703d.m145750n7(FeedModule.m61405F().userId(), this.f43976s, true, "liveMomentNearby", this.f43973p.live.f39615id, "p_topic_recommend").subscribe(psd0.m173597H(new y20() { // from class: l.aub0
                @Override // p153l.y20
                public final void call(Object obj) {
                    QATopicPhotoAlbumTopView.m67197v(z, (Followship) obj);
                }
            }, new y20() { // from class: l.bub0
                @Override // p153l.y20
                public final void call(Object obj) {
                    QATopicPhotoAlbumTopView.m67198w((Throwable) obj);
                }
            }));
        } else {
            o1j0.m165649w(R$string.f39977q);
        }
    }

    public Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m67215b0() {
        TopicMoment topicMoment;
        List<VoteOptions> list;
        boolean zM82486a = NullChecker.m82486a(this.f43976s);
        VDraweeView vDraweeView = this.f43960c;
        if (zM82486a) {
            vDraweeView.setPadding(0, 0, 0, 0);
            this.f43960c.setBackgroundResource(0);
            m67223l0();
            this.f43967j.setVisibility(8);
            this.f43960c.setVisibility(0);
            at0.m100011e(this.f43973p, this.f43960c, this.f43976s);
            this.f43965h.setText(at0.m100007a(this.f43973p, this.f43976s.name));
            this.f43965h.setTextColor(cai.m108494b(this.f43976s));
            if (!TextUtils.isEmpty(this.f43973p.value)) {
                String str = this.f43976s.name;
                String str2 = str + "：" + this.f43973p.value;
                SpannableString spannableString = new SpannableString(str2);
                spannableString.setSpan(new ForegroundColorSpan(act().getResources().getColor(k9c0.f124504e0)), 0, (str + "：").length(), 33);
                spannableString.setSpan(new ForegroundColorSpan(act().getResources().getColor(k9c0.f124500c0)), (str + "：").length(), str2.length(), 33);
            }
            orb0.m168908y(act(), this.f43976s, this.f43966i, true, false);
            if (this.f43966i.getVisibility() == 0) {
                ImageView imageView = this.f43966i;
                ksg.m151161D0(imageView, imageView.getDrawable(), this.f43966i.getLayoutParams().height);
            }
            if (cmg.m111222m0() && (topicMoment = this.f43977t) != null && (list = topicMoment.options) != null && list.size() == 2) {
                String strM67205Q = m67205Q();
                if (!TextUtils.isEmpty(strM67205Q)) {
                    int i = 0;
                    while (true) {
                        if (i >= this.f43977t.options.size()) {
                            i = -1;
                            break;
                        } else if (strM67205Q.equals(this.f43977t.options.get(i).f40101id)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i == 0) {
                        this.f43967j.setVisibility(0);
                        this.f43967j.setImageResource(lbc0.f131019d4);
                    } else if (i == 1) {
                        this.f43967j.setVisibility(0);
                        this.f43967j.setImageResource(lbc0.f131027e4);
                    }
                }
            }
        } else {
            vDraweeView.setVisibility(4);
            this.f43965h.setText("");
            this.f43967j.setVisibility(8);
        }
        m67217e0();
        m67220h0();
    }

    /* JADX INFO: renamed from: c0 */
    public void m67216c0(n570 n570Var, Moment moment, String str, boolean z) {
        this.f43975r = z;
        this.f43974q = str;
        this.f43973p = moment;
        m67202N();
        m67223l0();
        this.f43979v = n570Var;
        this.f43976s = n570Var.mo137270m(moment.owner);
        m67215b0();
        if (cmg.m111218k0()) {
            m67219g0();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m67217e0() {
        if (at0.m100010d(this.f43973p)) {
            this.f43969l.setVisibility(8);
            return;
        }
        if (cmg.m111225o()) {
            m67218f0();
            return;
        }
        bnl0.m105524M(this.f43971n, false);
        gj70.C17230a c17230a = gj70.m130463a().m130464b().get(this.f43974q);
        if (cmg.m111183K() && NullChecker.m82486a(c17230a) && c17230a.f104609a && !m67203O(this.f43974q) && !this.f43973p.owner.equals(FeedModule.m61405F().userId()) && !this.f43976s.isTeamAccount()) {
            this.f43969l.setVisibility(0);
            boolean zM137732i = hyh.m137732i(this.f43976s);
            LinearLayout linearLayout = this.f43969l;
            if (zM137732i) {
                linearLayout.setVisibility(8);
            } else {
                linearLayout.setBackground(getResources().getDrawable(lbc0.f131099n4));
                this.f43969l.setSelected(false);
                this.f43970m.setTextColor(Color.parseColor("#ffffff"));
                this.f43970m.setText("喜欢");
            }
            bnl0.m105509E0(this.f43969l, new View.OnClickListener() { // from class: l.utb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f180905a.m67209V(view);
                }
            });
            return;
        }
        final FollowshipStatus followshipStatus = null;
        if (!NullChecker.m82486a(c17230a) || !c17230a.f104609a || m67203O(this.f43974q) || this.f43973p.owner.equals(FeedModule.m61405F().userId()) || (NullChecker.m82486a(this.f43976s.localRelationship) && TEnum.equals(this.f43976s.localRelationship.state, "matched"))) {
            this.f43969l.setVisibility(8);
        } else {
            int i = PhotoAlbumTopView.f42793k;
            int i2 = lbc0.f131099n4;
            this.f43969l.setSelected(false);
            if (NullChecker.m82486a(this.f43976s.localFollowship)) {
                followshipStatus = this.f43976s.localFollowship.state;
                if (TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                    this.f43969l.setVisibility(0);
                    this.f43970m.setText(R$string.f39802P2);
                    this.f43970m.setTextColor(Color.parseColor("#bfbfbf"));
                    this.f43969l.setBackground(getResources().getDrawable(lbc0.f131099n4));
                    this.f43969l.setSelected(true);
                } else if (TEnum.equals(followshipStatus, "matched")) {
                    this.f43969l.setVisibility(0);
                    this.f43970m.setText(R$string.f39790N2);
                    this.f43970m.setTextColor(Color.parseColor("#bfbfbf"));
                    this.f43969l.setBackground(getResources().getDrawable(lbc0.f131099n4));
                    this.f43969l.setSelected(true);
                } else {
                    m67222k0();
                    this.f43969l.setVisibility(0);
                    this.f43970m.setTextColor(Color.parseColor("#ff3a00"));
                    this.f43970m.setText(i);
                    this.f43969l.setBackgroundDrawable(getResources().getDrawable(i2));
                }
            } else {
                m67222k0();
                this.f43969l.setVisibility(0);
                this.f43970m.setTextColor(Color.parseColor("#ff3a00"));
                this.f43970m.setText(i);
                this.f43969l.setBackgroundDrawable(getResources().getDrawable(i2));
            }
            this.f43970m.getPaint().setFakeBoldText(true);
        }
        this.f43969l.setOnClickListener(new View.OnClickListener() { // from class: l.vtb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185704a.m67210W(followshipStatus, view);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final void m67218f0() {
        bnl0.m105524M(this.f43969l, true);
        bnl0.m105524M(this.f43970m, false);
        bnl0.m105524M(this.f43971n, true);
        boolean zIsMatched = User.isMatched(this.f43976s);
        VText vText = this.f43971n;
        if (zIsMatched) {
            vText.setText("聊天");
        } else {
            vText.setText("打招呼");
        }
        this.f43971n.setTypeface(null, 1);
        bnl0.m105509E0(this.f43971n, new View.OnClickListener() { // from class: l.xtb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196197a.m67211X(view);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final void m67219g0() {
        User user = this.f43976s;
        if (user == null || TextUtils.isEmpty(user.f56859id)) {
            return;
        }
        BubbleInfo bubbleInfo = getBubbleInfo();
        boolean zM67204P = m67204P(bubbleInfo);
        bnl0.m105524M(this.f43961d, zM67204P);
        if (zM67204P && NullChecker.m82486a(bubbleInfo.emotion) && !TextUtils.isEmpty(bubbleInfo.emotion.emojiUrl)) {
            fsb0 fsb0Var = uqb0.f180374G;
            VDraweeView vDraweeView = this.f43962e;
            String str = bubbleInfo.emotion.emojiUrl;
            int i = qa00.f156326m;
            fsb0Var.m127109I0(vDraweeView, str, i, i);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m67220h0() {
        this.f43968k.setVisibility(8);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m67221j0(boolean z) {
        tfj0.m190940c(er60.m122104w().m122132u(z), "p_topic_recommend", er60.m122104w().m122133v(this.f43973p, this.f43976s));
    }

    /* JADX INFO: renamed from: k0 */
    public final void m67222k0() {
        tfj0.m190942e(MatchScData.ModuleId.mid_e_follow, "p_topic_recommend", er60.m122104w().m122133v(this.f43973p, this.f43976s));
    }

    /* JADX INFO: renamed from: l0 */
    public final void m67223l0() {
        jyb.m147537z(jyb.m147507f0(this.f43958a, this.f43965h, this.f43960c, this.f43959b), new y20() { // from class: l.ttb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176067a.m67213Z((View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final void m67224m0(String str) {
        if (FeedModule.m61405F().userId().equals(this.f43973p.owner)) {
            act().startActivity(at0.m100009c(act(), this.f43973p.owner, str));
            return;
        }
        Act act = act();
        Moment moment = this.f43973p;
        at0.m100015i(act, moment, moment.owner, str);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m67225o0() {
        m67224m0("from_topic_aggregation");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43980w.m127299c();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67200L(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m67226p0(View view) {
        if (view instanceof VDraweeView) {
            er60.m122104w().m122124m(this.f43973p, this.f43974q, false);
        }
    }

    public void setCurrentFrag(PutongFrag putongFrag) {
        this.f43978u = putongFrag;
    }

    public void setTopicMoment(TopicMoment topicMoment) {
        this.f43977t = topicMoment;
    }

    public QATopicPhotoAlbumTopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43972o = "photo_album_feed_";
        this.f43973p = null;
        this.f43974q = "";
        this.f43980w = new ft5();
    }

    public QATopicPhotoAlbumTopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43972o = "photo_album_feed_";
        this.f43973p = null;
        this.f43974q = "";
        this.f43980w = new ft5();
    }
}
