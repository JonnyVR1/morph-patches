package com.p046p1.mobile.putong.feed.newui.topic.qatopic;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.data.VoteOptions;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.FeedWriterLevelView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedtop.PhotoAlbumTopView;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumTopView;
import com.p046p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear_FillerMeasure;
import p147v.VText;
import p149l.ab70;
import p149l.bkb0;
import p149l.bs5;
import p149l.d30;
import p149l.e1c0;
import p149l.e30;
import p149l.f3c0;
import p149l.hx60;
import p149l.kjb0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.n8i;
import p149l.nkg;
import p149l.p6j0;
import p149l.qib0;
import p149l.red0;
import p149l.swh;
import p149l.t100;
import p149l.v1h;
import p149l.vqg;
import p149l.vs0;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.ylb0;
import p149l.zi60;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class QATopicPhotoAlbumTopView extends VFrame {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f43110a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f43111b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f43112c;

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f43113d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f43114e;

    /* JADX INFO: renamed from: f */
    public TextView f43115f;

    /* JADX INFO: renamed from: g */
    public VLinear_FillerMeasure f43116g;

    /* JADX INFO: renamed from: h */
    public VText f43117h;

    /* JADX INFO: renamed from: i */
    public ImageView f43118i;

    /* JADX INFO: renamed from: j */
    public ImageView f43119j;

    /* JADX INFO: renamed from: k */
    public FeedWriterLevelView f43120k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f43121l;

    /* JADX INFO: renamed from: m */
    public VText f43122m;

    /* JADX INFO: renamed from: n */
    public VText f43123n;

    /* JADX INFO: renamed from: o */
    public String f43124o;

    /* JADX INFO: renamed from: p */
    public Moment f43125p;

    /* JADX INFO: renamed from: q */
    public String f43126q;

    /* JADX INFO: renamed from: r */
    public boolean f43127r;

    /* JADX INFO: renamed from: s */
    public User f43128s;

    /* JADX INFO: renamed from: t */
    public TopicMoment f43129t;

    /* JADX INFO: renamed from: u */
    public PutongFrag f43130u;

    /* JADX INFO: renamed from: v */
    public hx60 f43131v;

    /* JADX INFO: renamed from: w */
    public bs5 f43132w;

    public QATopicPhotoAlbumTopView(Context context) {
        super(context);
        this.f43124o = "photo_album_feed_";
        this.f43125p = null;
        this.f43126q = "";
        this.f43132w = new bs5();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m66006C(boolean z, Followship followship) {
        if (z) {
            return;
        }
        lsi0.m151593w(R$string.f38934M0);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m66008F(Throwable th) {
    }

    private BubbleInfo getBubbleInfo() {
        RawFeed rawFeedM130721c;
        if (NullChecker.m81303a(this.f43125p) && NullChecker.m81303a(this.f43131v) && this.f43131v.m133308p() && (rawFeedM130721c = this.f43131v.f109833b.m130721c(this.f43125p.f56011id)) != null) {
            return (BubbleInfo) vwb.m200346r(rawFeedM130721c.states, new w9j() { // from class: l.mlb0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f134419a.m66023R((BubbleInfo) obj);
                }
            });
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m66014v(boolean z, Followship followship) {
        if (z) {
            return;
        }
        lsi0.m151593w(R$string.f39028b3);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m66015w(Throwable th) {
    }

    /* JADX INFO: renamed from: L */
    public final void m66017L(View view) {
        ylb0.m215260a(this, view);
    }

    /* JADX INFO: renamed from: M */
    public void m66018M() {
        if (xdl0.m208349O0(this.f43120k)) {
            this.f43120k.m64426j();
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m66019N() {
        if (!NullChecker.m81303a(this.f43115f) || vwb.m200296J(this.f43125p.labels) || TextUtils.isEmpty(this.f43125p.labels.get(0).display)) {
            this.f43115f.setVisibility(8);
            return;
        }
        this.f43115f.setVisibility(0);
        this.f43115f.setText(this.f43125p.labels.get(0).display);
        final int iMeasureText = (int) (this.f43115f.getPaint().measureText((String) this.f43115f.getText()) + t100.m186890d(8.0f));
        xdl0.m208353Q0(this.f43115f, new e30() { // from class: l.slb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f165151a.m66024S(iMeasureText, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final boolean m66020O(String str) {
        return "qa_latest".equals(str);
    }

    /* JADX INFO: renamed from: P */
    public final boolean m66021P(BubbleInfo bubbleInfo) {
        if (bubbleInfo == null || !bubbleInfo.checkStateTimeIsValid()) {
            return false;
        }
        return (!(act() instanceof TopicAggregationAct) || !NullChecker.m81303a(this.f43115f) || vwb.m200296J(this.f43125p.labels) || TextUtils.isEmpty(this.f43125p.labels.get(0).display)) && !this.f43125p.hasHeadFrame;
    }

    /* JADX INFO: renamed from: Q */
    public final String m66022Q() {
        return this.f43131v.f109833b.m130722d(this.f43125p.f56011id);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ Boolean m66023R(BubbleInfo bubbleInfo) {
        return Boolean.valueOf(TextUtils.equals(this.f43128s.f56011id, bubbleInfo.owner.f38803id));
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m66024S(int i, int[] iArr) {
        this.f43115f.setBackground(new red0(Color.parseColor(this.f43125p.labels.get(0).bgColor), t100.m186890d(5.0f), Math.max(iArr[0], i), iArr[1]));
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m66025T(final boolean z) {
        FeedModule.f38855d.m209502m7(FeedModule.m60221F().userId(), this.f43128s, false, "p_topic_recommend").subscribe(mkd0.m154956H(new e30() { // from class: l.nlb0
            @Override // p149l.e30
            public final void call(Object obj) {
                QATopicPhotoAlbumTopView.m66006C(z, (Followship) obj);
            }
        }, new e30() { // from class: l.olb0
            @Override // p149l.e30
            public final void call(Object obj) {
                QATopicPhotoAlbumTopView.m66008F((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m66026V(View view) {
        zvf0.m220399u(MatchScData.ModuleId.mid_e_likeButton, "p_topic_recommend", vwb.m200311Y("moments_user_id", this.f43128s.f56011id));
        FeedModule.m60222H().mo30788kn(act(), this.f43128s, !this.f43127r, null, LikeFrom.get("moment"), NullChecker.m81303a(this.f43125p) ? this.f43125p.f56011id : null, null, null);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m66027W(FollowshipStatus followshipStatus, View view) {
        m66031a0(followshipStatus, false);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m66028X(View view) {
        zi60.m218961w().m218987s(this.f43125p, vqg.m199515K(this.f43126q, false), true, false);
        FeedModule.f38854c.m60724f3(act(), this.f43128s, this.f43125p, vqg.m199515K(this.f43126q, false), false);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m66029Y(View view) {
        m66043p0(view);
        m66042o0();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m66030Z(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ulb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f177040a.m66029Y(view2);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public final void m66031a0(FollowshipStatus followshipStatus, final boolean z) {
        if (NullChecker.m81303a(followshipStatus) && (TEnum.equals(followshipStatus, FollowshipStatus.following) || TEnum.equals(followshipStatus, "matched"))) {
            m66038j0(false);
            v1h.m196628v0(act(), getResources().getString(R$string.f39183z), new d30() { // from class: l.vlb0
                @Override // p149l.d30
                public final void call() {
                    this.f181939a.m66025T(z);
                }
            });
            return;
        }
        m66038j0(true);
        User user = this.f43128s;
        if (!user.profile.moments.hidePublicMoments || User.isMatched(user)) {
            FeedModule.f38855d.m209509n7(FeedModule.m60221F().userId(), this.f43128s, true, "liveMomentNearby", this.f43125p.live.f38767id, "p_topic_recommend").subscribe(mkd0.m154956H(new e30() { // from class: l.wlb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    QATopicPhotoAlbumTopView.m66014v(z, (Followship) obj);
                }
            }, new e30() { // from class: l.xlb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    QATopicPhotoAlbumTopView.m66015w((Throwable) obj);
                }
            }));
        } else {
            lsi0.m151593w(R$string.f39129q);
        }
    }

    public Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m66032b0() {
        TopicMoment topicMoment;
        List<VoteOptions> list;
        boolean zM81303a = NullChecker.m81303a(this.f43128s);
        VDraweeView vDraweeView = this.f43112c;
        if (zM81303a) {
            vDraweeView.setPadding(0, 0, 0, 0);
            this.f43112c.setBackgroundResource(0);
            m66040l0();
            this.f43119j.setVisibility(8);
            this.f43112c.setVisibility(0);
            vs0.m199799e(this.f43125p, this.f43112c, this.f43128s);
            this.f43117h.setText(vs0.m199795a(this.f43125p, this.f43128s.name));
            this.f43117h.setTextColor(n8i.m158495b(this.f43128s));
            if (!TextUtils.isEmpty(this.f43125p.value)) {
                String str = this.f43128s.name;
                String str2 = str + "：" + this.f43125p.value;
                SpannableString spannableString = new SpannableString(str2);
                spannableString.setSpan(new ForegroundColorSpan(act().getResources().getColor(e1c0.f88781e0)), 0, (str + "：").length(), 33);
                spannableString.setSpan(new ForegroundColorSpan(act().getResources().getColor(e1c0.f88777c0)), (str + "：").length(), str2.length(), 33);
            }
            kjb0.m146214y(act(), this.f43128s, this.f43118i, true, false);
            if (this.f43118i.getVisibility() == 0) {
                ImageView imageView = this.f43118i;
                vqg.m199502D0(imageView, imageView.getDrawable(), this.f43118i.getLayoutParams().height);
            }
            if (nkg.m159893m0() && (topicMoment = this.f43129t) != null && (list = topicMoment.options) != null && list.size() == 2) {
                String strM66022Q = m66022Q();
                if (!TextUtils.isEmpty(strM66022Q)) {
                    int i = 0;
                    while (true) {
                        if (i >= this.f43129t.options.size()) {
                            i = -1;
                            break;
                        } else if (strM66022Q.equals(this.f43129t.options.get(i).f39253id)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i == 0) {
                        this.f43119j.setVisibility(0);
                        this.f43119j.setImageResource(f3c0.f94501d4);
                    } else if (i == 1) {
                        this.f43119j.setVisibility(0);
                        this.f43119j.setImageResource(f3c0.f94509e4);
                    }
                }
            }
        } else {
            vDraweeView.setVisibility(4);
            this.f43117h.setText("");
            this.f43119j.setVisibility(8);
        }
        m66034e0();
        m66037h0();
    }

    /* JADX INFO: renamed from: c0 */
    public void m66033c0(hx60 hx60Var, Moment moment, String str, boolean z) {
        this.f43127r = z;
        this.f43126q = str;
        this.f43125p = moment;
        m66019N();
        m66040l0();
        this.f43131v = hx60Var;
        this.f43128s = hx60Var.mo133306m(moment.owner);
        m66032b0();
        if (nkg.m159889k0()) {
            m66036g0();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m66034e0() {
        if (vs0.m199798d(this.f43125p)) {
            this.f43121l.setVisibility(8);
            return;
        }
        if (nkg.m159896o()) {
            m66035f0();
            return;
        }
        xdl0.m208344M(this.f43123n, false);
        ab70.C15567a c15567a = ab70.m95586a().m95587b().get(this.f43126q);
        if (nkg.m159854K() && NullChecker.m81303a(c15567a) && c15567a.f68629a && !m66020O(this.f43126q) && !this.f43125p.owner.equals(FeedModule.m60221F().userId()) && !this.f43128s.isTeamAccount()) {
            this.f43121l.setVisibility(0);
            boolean zM186172i = swh.m186172i(this.f43128s);
            LinearLayout linearLayout = this.f43121l;
            if (zM186172i) {
                linearLayout.setVisibility(8);
            } else {
                linearLayout.setBackground(getResources().getDrawable(f3c0.f94581n4));
                this.f43121l.setSelected(false);
                this.f43122m.setTextColor(Color.parseColor("#ffffff"));
                this.f43122m.setText("喜欢");
            }
            xdl0.m208329E0(this.f43121l, new View.OnClickListener() { // from class: l.qlb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f155216a.m66026V(view);
                }
            });
            return;
        }
        final FollowshipStatus followshipStatus = null;
        if (!NullChecker.m81303a(c15567a) || !c15567a.f68629a || m66020O(this.f43126q) || this.f43125p.owner.equals(FeedModule.m60221F().userId()) || (NullChecker.m81303a(this.f43128s.localRelationship) && TEnum.equals(this.f43128s.localRelationship.state, "matched"))) {
            this.f43121l.setVisibility(8);
        } else {
            int i = PhotoAlbumTopView.f41945k;
            int i2 = f3c0.f94581n4;
            this.f43121l.setSelected(false);
            if (NullChecker.m81303a(this.f43128s.localFollowship)) {
                followshipStatus = this.f43128s.localFollowship.state;
                if (TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                    this.f43121l.setVisibility(0);
                    this.f43122m.setText(R$string.f38954P2);
                    this.f43122m.setTextColor(Color.parseColor("#bfbfbf"));
                    this.f43121l.setBackground(getResources().getDrawable(f3c0.f94581n4));
                    this.f43121l.setSelected(true);
                } else if (TEnum.equals(followshipStatus, "matched")) {
                    this.f43121l.setVisibility(0);
                    this.f43122m.setText(R$string.f38942N2);
                    this.f43122m.setTextColor(Color.parseColor("#bfbfbf"));
                    this.f43121l.setBackground(getResources().getDrawable(f3c0.f94581n4));
                    this.f43121l.setSelected(true);
                } else {
                    m66039k0();
                    this.f43121l.setVisibility(0);
                    this.f43122m.setTextColor(Color.parseColor("#ff3a00"));
                    this.f43122m.setText(i);
                    this.f43121l.setBackgroundDrawable(getResources().getDrawable(i2));
                }
            } else {
                m66039k0();
                this.f43121l.setVisibility(0);
                this.f43122m.setTextColor(Color.parseColor("#ff3a00"));
                this.f43122m.setText(i);
                this.f43121l.setBackgroundDrawable(getResources().getDrawable(i2));
            }
            this.f43122m.getPaint().setFakeBoldText(true);
        }
        this.f43121l.setOnClickListener(new View.OnClickListener() { // from class: l.rlb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159954a.m66027W(followshipStatus, view);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final void m66035f0() {
        xdl0.m208344M(this.f43121l, true);
        xdl0.m208344M(this.f43122m, false);
        xdl0.m208344M(this.f43123n, true);
        boolean zIsMatched = User.isMatched(this.f43128s);
        VText vText = this.f43123n;
        if (zIsMatched) {
            vText.setText("聊天");
        } else {
            vText.setText("打招呼");
        }
        this.f43123n.setTypeface(null, 1);
        xdl0.m208329E0(this.f43123n, new View.OnClickListener() { // from class: l.tlb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171014a.m66028X(view);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final void m66036g0() {
        User user = this.f43128s;
        if (user == null || TextUtils.isEmpty(user.f56011id)) {
            return;
        }
        BubbleInfo bubbleInfo = getBubbleInfo();
        boolean zM66021P = m66021P(bubbleInfo);
        xdl0.m208344M(this.f43113d, zM66021P);
        if (zM66021P && NullChecker.m81303a(bubbleInfo.emotion) && !TextUtils.isEmpty(bubbleInfo.emotion.emojiUrl)) {
            bkb0 bkb0Var = qib0.f154691G;
            VDraweeView vDraweeView = this.f43114e;
            String str = bubbleInfo.emotion.emojiUrl;
            int i = t100.f167264m;
            bkb0Var.m102325I0(vDraweeView, str, i, i);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m66037h0() {
        this.f43120k.setVisibility(8);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m66038j0(boolean z) {
        p6j0.m167669c(zi60.m218961w().m218989u(z), "p_topic_recommend", zi60.m218961w().m218990v(this.f43125p, this.f43128s));
    }

    /* JADX INFO: renamed from: k0 */
    public final void m66039k0() {
        p6j0.m167671e(MatchScData.ModuleId.mid_e_follow, "p_topic_recommend", zi60.m218961w().m218990v(this.f43125p, this.f43128s));
    }

    /* JADX INFO: renamed from: l0 */
    public final void m66040l0() {
        vwb.m200354z(vwb.m200324f0(this.f43110a, this.f43117h, this.f43112c, this.f43111b), new e30() { // from class: l.plb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150088a.m66030Z((View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final void m66041m0(String str) {
        if (FeedModule.m60221F().userId().equals(this.f43125p.owner)) {
            act().startActivity(vs0.m199797c(act(), this.f43125p.owner, str));
            return;
        }
        Act act = act();
        Moment moment = this.f43125p;
        vs0.m199803i(act, moment, moment.owner, str);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m66042o0() {
        m66041m0("from_topic_aggregation");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43132w.m103657c();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66017L(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m66043p0(View view) {
        if (view instanceof VDraweeView) {
            zi60.m218961w().m218981m(this.f43125p, this.f43126q, false);
        }
    }

    public void setCurrentFrag(PutongFrag putongFrag) {
        this.f43130u = putongFrag;
    }

    public void setTopicMoment(TopicMoment topicMoment) {
        this.f43129t = topicMoment;
    }

    public QATopicPhotoAlbumTopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43124o = "photo_album_feed_";
        this.f43125p = null;
        this.f43126q = "";
        this.f43132w = new bs5();
    }

    public QATopicPhotoAlbumTopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43124o = "photo_album_feed_";
        this.f43125p = null;
        this.f43126q = "";
        this.f43132w = new bs5();
    }
}
