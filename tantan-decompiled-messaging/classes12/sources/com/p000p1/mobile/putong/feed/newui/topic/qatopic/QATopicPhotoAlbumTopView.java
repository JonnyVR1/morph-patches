package com.p000p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
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
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Followship;
import com.p000p1.mobile.putong.data.FollowshipStatus;
import com.p000p1.mobile.putong.data.LikeFrom;
import com.p000p1.mobile.putong.data.MatchScData;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.data.VoteOptions;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.FeedWriterLevelView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedtop.PhotoAlbumTopView;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumTopView;
import com.p000p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.bkb0;
import l.bs5;
import l.d30;
import l.e30;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;
import p007l.ab70;
import p007l.e1c0;
import p007l.f3c0;
import p007l.hx60;
import p007l.kjb0;
import p007l.n8i;
import p007l.nkg;
import p007l.p6j0;
import p007l.red0;
import p007l.swh;
import p007l.v1h;
import p007l.vqg;
import p007l.vs0;
import p007l.ylb0;
import p007l.zi60;
import v.VDraweeView;
import v.VFrame;
import v.VLinear_FillerMeasure;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class QATopicPhotoAlbumTopView extends VFrame {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f4571a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f4572b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f4573c;

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f4574d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4575e;

    /* JADX INFO: renamed from: f */
    public TextView f4576f;

    /* JADX INFO: renamed from: g */
    public VLinear_FillerMeasure f4577g;

    /* JADX INFO: renamed from: h */
    public VText f4578h;

    /* JADX INFO: renamed from: i */
    public ImageView f4579i;

    /* JADX INFO: renamed from: j */
    public ImageView f4580j;

    /* JADX INFO: renamed from: k */
    public FeedWriterLevelView f4581k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f4582l;

    /* JADX INFO: renamed from: m */
    public VText f4583m;

    /* JADX INFO: renamed from: n */
    public VText f4584n;

    /* JADX INFO: renamed from: o */
    public String f4585o;

    /* JADX INFO: renamed from: p */
    public Moment f4586p;

    /* JADX INFO: renamed from: q */
    public String f4587q;

    /* JADX INFO: renamed from: r */
    public boolean f4588r;

    /* JADX INFO: renamed from: s */
    public User f4589s;

    /* JADX INFO: renamed from: t */
    public TopicMoment f4590t;

    /* JADX INFO: renamed from: u */
    public PutongFrag f4591u;

    /* JADX INFO: renamed from: v */
    public hx60 f4592v;

    /* JADX INFO: renamed from: w */
    public bs5 f4593w;

    public QATopicPhotoAlbumTopView(Context context) {
        super(context);
        this.f4585o = "photo_album_feed_";
        this.f4586p = null;
        this.f4587q = "";
        this.f4593w = new bs5();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m7158C(boolean z, Followship followship) {
        if (z) {
            return;
        }
        lsi0.w(R$string.f395M0);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m7160F(Throwable th) {
    }

    private BubbleInfo getBubbleInfo() {
        RawFeed rawFeedM10602c;
        if (NullChecker.a(this.f4586p) && NullChecker.a(this.f4592v) && this.f4592v.m10743p() && (rawFeedM10602c = this.f4592v.f8835b.m10602c(((DbObject) this.f4586p).id)) != null) {
            return (BubbleInfo) vwb.r(rawFeedM10602c.states, new w9j() { // from class: l.mlb0
                public final Object call(Object obj) {
                    return this.f10510a.m7175R((BubbleInfo) obj);
                }
            });
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m7166v(boolean z, Followship followship) {
        if (z) {
            return;
        }
        lsi0.w(R$string.f489b3);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m7167w(Throwable th) {
    }

    /* JADX INFO: renamed from: L */
    public final void m7169L(View view) {
        ylb0.m17166a(this, view);
    }

    /* JADX INFO: renamed from: M */
    public void m7170M() {
        if (xdl0.O0(this.f4581k)) {
            this.f4581k.m5510j();
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m7171N() {
        if (!NullChecker.a(this.f4576f) || vwb.J(this.f4586p.labels) || TextUtils.isEmpty(this.f4586p.labels.get(0).display)) {
            this.f4576f.setVisibility(8);
            return;
        }
        this.f4576f.setVisibility(0);
        this.f4576f.setText(this.f4586p.labels.get(0).display);
        final int iMeasureText = (int) (this.f4576f.getPaint().measureText((String) this.f4576f.getText()) + t100.d(8.0f));
        xdl0.Q0(this.f4576f, new e30() { // from class: l.slb0
            public final void call(Object obj) {
                this.f12979a.m7176S(iMeasureText, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final boolean m7172O(String str) {
        return "qa_latest".equals(str);
    }

    /* JADX INFO: renamed from: P */
    public final boolean m7173P(BubbleInfo bubbleInfo) {
        if (bubbleInfo == null || !bubbleInfo.checkStateTimeIsValid()) {
            return false;
        }
        return (!(act() instanceof TopicAggregationAct) || !NullChecker.a(this.f4576f) || vwb.J(this.f4586p.labels) || TextUtils.isEmpty(this.f4586p.labels.get(0).display)) && !this.f4586p.hasHeadFrame;
    }

    /* JADX INFO: renamed from: Q */
    public final String m7174Q() {
        return this.f4592v.f8835b.m10603d(((DbObject) this.f4586p).id);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ Boolean m7175R(BubbleInfo bubbleInfo) {
        return Boolean.valueOf(TextUtils.equals(((DbObject) this.f4589s).id, bubbleInfo.owner.f264id));
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m7176S(int i, int[] iArr) {
        this.f4576f.setBackground(new red0(Color.parseColor(this.f4586p.labels.get(0).bgColor), t100.d(5.0f), Math.max(iArr[0], i), iArr[1]));
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m7177T(final boolean z) {
        FeedModule.f316d.m16683m7(FeedModule.m1139F().userId(), this.f4589s, false, "p_topic_recommend").subscribe(mkd0.H(new e30() { // from class: l.nlb0
            public final void call(Object obj) {
                QATopicPhotoAlbumTopView.m7158C(z, (Followship) obj);
            }
        }, new e30() { // from class: l.olb0
            public final void call(Object obj) {
                QATopicPhotoAlbumTopView.m7160F((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m7178V(View view) {
        zvf0.u(MatchScData.ModuleId.mid_e_likeButton, "p_topic_recommend", new j760[]{vwb.Y("moments_user_id", ((DbObject) this.f4589s).id)});
        FeedModule.m1140H().kn(act(), this.f4589s, !this.f4588r, (String) null, LikeFrom.get("moment"), NullChecker.a(this.f4586p) ? ((DbObject) this.f4586p).id : null, (e30) null, (e30) null);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m7179W(FollowshipStatus followshipStatus, View view) {
        m7183a0(followshipStatus, false);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m7180X(View view) {
        zi60.m17436w().m17462s(this.f4586p, vqg.m15485K(this.f4587q, false), true, false);
        FeedModule.f315c.m1650f3(act(), this.f4589s, this.f4586p, vqg.m15485K(this.f4587q, false), false);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m7181Y(View view) {
        m7195p0(view);
        m7194o0();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m7182Z(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ulb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f13855a.m7181Y(view2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    public final void m7183a0(FollowshipStatus followshipStatus, final boolean z) {
        if (NullChecker.a(followshipStatus) && (TEnum.equals(followshipStatus, FollowshipStatus.following) || TEnum.equals(followshipStatus, "matched"))) {
            m7190j0(false);
            v1h.m15267v0(act(), getResources().getString(R$string.f644z), new d30() { // from class: l.vlb0
                public final void call() {
                    this.f14227a.m7177T(z);
                }
            });
            return;
        }
        m7190j0(true);
        User user = this.f4589s;
        if (!user.profile.moments.hidePublicMoments || User.isMatched(user)) {
            FeedModule.f316d.m16690n7(FeedModule.m1139F().userId(), this.f4589s, true, "liveMomentNearby", this.f4586p.live.f228id, "p_topic_recommend").subscribe(mkd0.H(new e30() { // from class: l.wlb0
                public final void call(Object obj) {
                    QATopicPhotoAlbumTopView.m7166v(z, (Followship) obj);
                }
            }, new e30() { // from class: l.xlb0
                public final void call(Object obj) {
                    QATopicPhotoAlbumTopView.m7167w((Throwable) obj);
                }
            }));
        } else {
            lsi0.w(R$string.f590q);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Act act() {
        return getContext();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m7184b0() {
        TopicMoment topicMoment;
        List<VoteOptions> list;
        boolean zA = NullChecker.a(this.f4589s);
        VDraweeView vDraweeView = this.f4573c;
        if (zA) {
            vDraweeView.setPadding(0, 0, 0, 0);
            this.f4573c.setBackgroundResource(0);
            m7192l0();
            this.f4580j.setVisibility(8);
            this.f4573c.setVisibility(0);
            vs0.m15567e(this.f4586p, this.f4573c, this.f4589s);
            this.f4578h.setText(vs0.m15563a(this.f4586p, this.f4589s.name));
            this.f4578h.setTextColor(n8i.m12108b(this.f4589s));
            if (!TextUtils.isEmpty(this.f4586p.value)) {
                String str = this.f4589s.name;
                String str2 = str + "：" + this.f4586p.value;
                SpannableString spannableString = new SpannableString(str2);
                spannableString.setSpan(new ForegroundColorSpan(act().getResources().getColor(e1c0.f7137e0)), 0, (str + "：").length(), 33);
                spannableString.setSpan(new ForegroundColorSpan(act().getResources().getColor(e1c0.f7133c0)), (str + "：").length(), str2.length(), 33);
            }
            kjb0.m11473y(act(), this.f4589s, this.f4579i, true, false);
            if (this.f4579i.getVisibility() == 0) {
                ImageView imageView = this.f4579i;
                vqg.m15472D0(imageView, imageView.getDrawable(), this.f4579i.getLayoutParams().height);
            }
            if (nkg.m12252m0() && (topicMoment = this.f4590t) != null && (list = topicMoment.options) != null && list.size() == 2) {
                String strM7174Q = m7174Q();
                if (!TextUtils.isEmpty(strM7174Q)) {
                    int i = 0;
                    while (true) {
                        if (i >= this.f4590t.options.size()) {
                            i = -1;
                            break;
                        } else if (strM7174Q.equals(this.f4590t.options.get(i).f714id)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i == 0) {
                        this.f4580j.setVisibility(0);
                        this.f4580j.setImageResource(f3c0.f7784d4);
                    } else if (i == 1) {
                        this.f4580j.setVisibility(0);
                        this.f4580j.setImageResource(f3c0.f7792e4);
                    }
                }
            }
        } else {
            vDraweeView.setVisibility(4);
            this.f4578h.setText("");
            this.f4580j.setVisibility(8);
        }
        m7186e0();
        m7189h0();
    }

    /* JADX INFO: renamed from: c0 */
    public void m7185c0(hx60 hx60Var, Moment moment, String str, boolean z) {
        this.f4588r = z;
        this.f4587q = str;
        this.f4586p = moment;
        m7171N();
        m7192l0();
        this.f4592v = hx60Var;
        this.f4589s = hx60Var.mo10741m(moment.owner);
        m7184b0();
        if (nkg.m12248k0()) {
            m7188g0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    public void m7186e0() {
        if (vs0.m15566d(this.f4586p)) {
            this.f4582l.setVisibility(8);
            return;
        }
        if (nkg.m12255o()) {
            m7187f0();
            return;
        }
        xdl0.M(this.f4584n, false);
        ab70.C2321a c2321a = ab70.m8476a().m8477b().get(this.f4587q);
        if (nkg.m12213K() && NullChecker.a(c2321a) && c2321a.f5692a && !m7172O(this.f4587q) && !this.f4586p.owner.equals(FeedModule.m1139F().userId()) && !this.f4589s.isTeamAccount()) {
            this.f4582l.setVisibility(0);
            boolean zM14341i = swh.m14341i(this.f4589s);
            LinearLayout linearLayout = this.f4582l;
            if (zM14341i) {
                linearLayout.setVisibility(8);
            } else {
                linearLayout.setBackground(getResources().getDrawable(f3c0.f7864n4));
                this.f4582l.setSelected(false);
                this.f4583m.setTextColor(Color.parseColor("#ffffff"));
                this.f4583m.setText("喜欢");
            }
            xdl0.E0(this.f4582l, new View.OnClickListener() { // from class: l.qlb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f12269a.m7178V(view);
                }
            });
            return;
        }
        final FollowshipStatus followshipStatus = null;
        if (!NullChecker.a(c2321a) || !c2321a.f5692a || m7172O(this.f4587q) || this.f4586p.owner.equals(FeedModule.m1139F().userId()) || (NullChecker.a(this.f4589s.localRelationship) && TEnum.equals(this.f4589s.localRelationship.state, "matched"))) {
            this.f4582l.setVisibility(8);
        } else {
            int i = PhotoAlbumTopView.f3406k;
            int i2 = f3c0.f7864n4;
            this.f4582l.setSelected(false);
            if (NullChecker.a(this.f4589s.localFollowship)) {
                followshipStatus = this.f4589s.localFollowship.state;
                if (TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                    this.f4582l.setVisibility(0);
                    this.f4583m.setText(R$string.f415P2);
                    this.f4583m.setTextColor(Color.parseColor("#bfbfbf"));
                    this.f4582l.setBackground(getResources().getDrawable(f3c0.f7864n4));
                    this.f4582l.setSelected(true);
                } else if (TEnum.equals(followshipStatus, "matched")) {
                    this.f4582l.setVisibility(0);
                    this.f4583m.setText(R$string.f403N2);
                    this.f4583m.setTextColor(Color.parseColor("#bfbfbf"));
                    this.f4582l.setBackground(getResources().getDrawable(f3c0.f7864n4));
                    this.f4582l.setSelected(true);
                } else {
                    m7191k0();
                    this.f4582l.setVisibility(0);
                    this.f4583m.setTextColor(Color.parseColor("#ff3a00"));
                    this.f4583m.setText(i);
                    this.f4582l.setBackgroundDrawable(getResources().getDrawable(i2));
                }
            } else {
                m7191k0();
                this.f4582l.setVisibility(0);
                this.f4583m.setTextColor(Color.parseColor("#ff3a00"));
                this.f4583m.setText(i);
                this.f4582l.setBackgroundDrawable(getResources().getDrawable(i2));
            }
            this.f4583m.getPaint().setFakeBoldText(true);
        }
        this.f4582l.setOnClickListener(new View.OnClickListener() { // from class: l.rlb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12670a.m7179W(followshipStatus, view);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final void m7187f0() {
        xdl0.M(this.f4582l, true);
        xdl0.M(this.f4583m, false);
        xdl0.M(this.f4584n, true);
        boolean zIsMatched = User.isMatched(this.f4589s);
        VText vText = this.f4584n;
        if (zIsMatched) {
            vText.setText("聊天");
        } else {
            vText.setText("打招呼");
        }
        this.f4584n.setTypeface((Typeface) null, 1);
        xdl0.E0(this.f4584n, new View.OnClickListener() { // from class: l.tlb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13329a.m7180X(view);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final void m7188g0() {
        User user = this.f4589s;
        if (user == null || TextUtils.isEmpty(((DbObject) user).id)) {
            return;
        }
        BubbleInfo bubbleInfo = getBubbleInfo();
        boolean zM7173P = m7173P(bubbleInfo);
        xdl0.M(this.f4574d, zM7173P);
        if (zM7173P && NullChecker.a(bubbleInfo.emotion) && !TextUtils.isEmpty(bubbleInfo.emotion.emojiUrl)) {
            bkb0 bkb0Var = qib0.G;
            VDraweeView vDraweeView = this.f4575e;
            String str = bubbleInfo.emotion.emojiUrl;
            int i = t100.m;
            bkb0Var.I0(vDraweeView, str, i, i);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m7189h0() {
        this.f4581k.setVisibility(8);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m7190j0(boolean z) {
        p6j0.m12913c(zi60.m17436w().m17464u(z), "p_topic_recommend", zi60.m17436w().m17465v(this.f4586p, this.f4589s));
    }

    /* JADX INFO: renamed from: k0 */
    public final void m7191k0() {
        p6j0.m12915e(MatchScData.ModuleId.mid_e_follow, "p_topic_recommend", zi60.m17436w().m17465v(this.f4586p, this.f4589s));
    }

    /* JADX INFO: renamed from: l0 */
    public final void m7192l0() {
        vwb.z(vwb.f0(new View[]{this.f4571a, this.f4578h, this.f4573c, this.f4572b}), new e30() { // from class: l.plb0
            public final void call(Object obj) {
                this.f11883a.m7182Z((View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final void m7193m0(String str) {
        if (FeedModule.m1139F().userId().equals(this.f4586p.owner)) {
            act().startActivity(vs0.m15565c(act(), this.f4586p.owner, str));
            return;
        }
        Act act = act();
        Moment moment = this.f4586p;
        vs0.m15571i(act, moment, moment.owner, str);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m7194o0() {
        m7193m0("from_topic_aggregation");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        this.f4593w.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7169L(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m7195p0(View view) {
        if (view instanceof VDraweeView) {
            zi60.m17436w().m17456m(this.f4586p, this.f4587q, false);
        }
    }

    public void setCurrentFrag(PutongFrag putongFrag) {
        this.f4591u = putongFrag;
    }

    public void setTopicMoment(TopicMoment topicMoment) {
        this.f4590t = topicMoment;
    }

    public QATopicPhotoAlbumTopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4585o = "photo_album_feed_";
        this.f4586p = null;
        this.f4587q = "";
        this.f4593w = new bs5();
    }

    public QATopicPhotoAlbumTopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4585o = "photo_album_feed_";
        this.f4586p = null;
        this.f4587q = "";
        this.f4593w = new bs5();
    }
}
