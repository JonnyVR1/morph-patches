package p149l;

import android.text.Editable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.CommentInfo;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.p046p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import p147v.VEditText;

/* JADX INFO: loaded from: classes12.dex */
public class zeh {

    /* JADX INFO: renamed from: a */
    public jpg f202815a;

    /* JADX INFO: renamed from: b */
    public User f202816b;

    /* JADX INFO: renamed from: c */
    public boolean f202817c;

    /* JADX INFO: renamed from: d */
    public VEditText f202818d;

    /* JADX INFO: renamed from: e */
    public int f202819e;

    /* JADX INFO: renamed from: f */
    public int f202820f;

    /* JADX INFO: renamed from: g */
    public boolean f202821g;

    /* JADX INFO: renamed from: h */
    public String f202822h;

    /* JADX INFO: renamed from: i */
    public Moment f202823i;

    /* JADX INFO: renamed from: j */
    public Act f202824j;

    /* JADX INFO: renamed from: k */
    public String f202825k;

    /* JADX INFO: renamed from: l */
    public String f202826l;

    /* JADX INFO: renamed from: m */
    public e30<Boolean> f202827m = new e30() { // from class: l.veh
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f181196a.m218320P((Boolean) obj);
        }
    };

    public zeh(Act act, tvh tvhVar) {
        this.f202822h = "p_moment_preview";
        this.f202824j = act;
        if (act instanceof FeedVideoFlowAct) {
            this.f202822h = "p_video_recommend";
        }
        this.f202820f = tvhVar.f172286a;
        this.f202821g = tvhVar.f172289d;
        Moment moment = tvhVar.f172288c;
        this.f202823i = moment;
        if (NullChecker.m81303a(moment)) {
            this.f202825k = this.f202823i.f56011id;
        }
        this.f202826l = tvhVar.f172290e;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m218286d() {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m218289g(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m218290h(Throwable th) {
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m218301s(Throwable th) {
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m218302t(VEditText vEditText, TextView textView, CharSequence charSequence) {
        Editable text = vEditText.getText();
        textView.setEnabled((text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: renamed from: A */
    public void m218305A(Moment moment) {
        m218306B(moment, false);
    }

    /* JADX INFO: renamed from: B */
    public void m218306B(final Moment moment, boolean z) {
        if (moment == null) {
            return;
        }
        final boolean z2 = moment.haveLiked;
        if (z2 && z) {
            return;
        }
        m218330w().duringCreated(FeedModule.f38855d.m209276Fb(moment.owner, moment.f56011id, !moment.haveLiked, moment.getMomentShowFrom())).subscribe(mkd0.m154956H(new e30() { // from class: l.jeh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117573a.m218314J(moment, z2, (Envelope) obj);
            }
        }, new e30() { // from class: l.keh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122711a.m218315K(moment, z2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final void m218307C(boolean z, Throwable th) {
        Moment moment = this.f202823i;
        if (moment == null) {
            return;
        }
        p6j0.m167672f("e_comment_send", this.f202822h, p6j0.C19147a.m167678g("moment_id", moment.f56011id), p6j0.C19147a.m167678g("owner_id", this.f202823i.owner), p6j0.C19147a.m167678g("comment_user_id", FeedModule.m60221F().userId()), p6j0.C19147a.m167678g("comment_state", z ? "success" : "fail"), p6j0.C19147a.m167678g("comment_detail", "comment"), th == null ? null : p6j0.C19147a.m167678g("error", th.toString()));
    }

    /* JADX INFO: renamed from: D */
    public void m218308D(final jpg jpgVar) {
        this.f202815a = jpgVar;
        if (NullChecker.m81303a(this.f202823i)) {
            User userM209447e8 = FeedModule.f38855d.m209447e8(this.f202823i.owner);
            this.f202816b = userM209447e8;
            if (NullChecker.m81303a(userM209447e8)) {
                jpgVar.m142733q0(this.f202816b);
            }
        }
        this.f202824j.duringCreated(FeedModule.f38855d.f193053l0).subscribe(mkd0.m154955G(new e30() { // from class: l.deh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85798a.m218316L(jpgVar, (Map) obj);
            }
        }));
        this.f202824j.duringCreated(FeedModule.f38855d.f193012Q0).subscribe(mkd0.m154956H(new e30() { // from class: l.oeh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143313a.m218317M(jpgVar, (j760) obj);
            }
        }, new e30() { // from class: l.reh
            @Override // p149l.e30
            public final void call(Object obj) {
                zeh.m218301s((Throwable) obj);
            }
        }));
        this.f202824j.duringCreated(FeedModule.f38855d.f193016S0).subscribe(mkd0.m154956H(new e30() { // from class: l.seh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164004a.m218318N(jpgVar, (j760) obj);
            }
        }, new e30() { // from class: l.teh
            @Override // p149l.e30
            public final void call(Object obj) {
                zeh.m218289g((Throwable) obj);
            }
        }));
        this.f202824j.duringCreated(FeedModule.f38855d.f193061p0).subscribe(mkd0.m154955G(new e30() { // from class: l.ueh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176042a.m218319O((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E */
    public final boolean m218309E() {
        Act act = this.f202824j;
        if (act instanceof PhotoAlbumFeedPreviewAct) {
            return ((PhotoAlbumFeedPreviewAct) act).f42605i;
        }
        if (act instanceof FeedVideoFlowAct) {
            return ((FeedVideoFlowAct) act).f43279f;
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean m218310F(final VEditText vEditText, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f202821g) {
                lsi0.m151578h(R$string.f39042d3);
                return false;
            }
            this.f202818d.setText("");
            if (!this.f202817c && sti.m185955a()) {
                m218331x(new d30() { // from class: l.geh
                    @Override // p149l.d30
                    public final void call() {
                        this.f102251a.m218312H(vEditText);
                    }
                });
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m218311G(VEditText vEditText, View view) {
        if (this.f202821g) {
            lsi0.m151578h(R$string.f39042d3);
            return;
        }
        m218327W(vEditText.getText().toString(), vEditText.getText().toString().trim(), new d30() { // from class: l.heh
            @Override // p149l.d30
            public final void call() {
                zeh.m218286d();
            }
        });
        m218330w().hideInput();
        vEditText.setHint(m218330w().getResources().getString(R$string.f38879D));
        vEditText.setText((CharSequence) null);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m218312H(VEditText vEditText) {
        vEditText.setInputType(this.f202819e);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m218313I(User user) {
        FeedModule.f38855d.m209502m7(qib0.f154713b0.f139230a.userId(), user, false, this.f202822h);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m218314J(Moment moment, boolean z, Envelope envelope) {
        this.f202815a.mo142212i0(FeedModule.f38855d.m209572w7(moment.f56011id));
        zi60.m218961w().m218985q(moment, this.f202815a.f119155E, 201, z, this.f202822h);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m218315K(Moment moment, boolean z, Throwable th) {
        t2h.m186976g(th);
        zi60.m218961w().m218986r(moment, this.f202815a.f119155E, th, z, this.f202822h);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m218316L(jpg jpgVar, Map map) {
        if (FeedModule.f38855d.f193047i0.containsKey(this.f202825k)) {
            jpgVar.m142732p0(FeedModule.f38855d.f193047i0.get(this.f202825k));
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m218317M(jpg jpgVar, j760 j760Var) {
        User user = this.f202816b;
        if (user != null) {
            jpgVar.mo142211g0(FeedModule.f38855d.m209447e8(user.f56011id));
        }
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m218318N(jpg jpgVar, j760 j760Var) {
        User user = this.f202816b;
        if (user != null) {
            jpgVar.mo142211g0(FeedModule.f38855d.m209447e8(user.f56011id));
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m218319O(Moment moment) {
        if (!TextUtils.equals(moment.f56011id, this.f202825k) || (this.f202824j instanceof FeedVideoFlowAct)) {
            return;
        }
        m218330w().finishWithoutCustomAnimation();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m218320P(Boolean bool) {
        this.f202817c = bool.booleanValue();
        boolean zBooleanValue = bool.booleanValue();
        VEditText vEditText = this.f202818d;
        if (zBooleanValue) {
            vEditText.requestFocus();
        } else {
            vEditText.setHint(m218330w().getString(R$string.f38879D));
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m218321Q(d30 d30Var, MomentMessage momentMessage, MomentMessage momentMessage2) {
        if (NullChecker.m81303a(d30Var) && !momentMessage.isChildComment()) {
            d30Var.call();
        }
        lsi0.m151587q(m218330w().getString(R$string.f38919J3), m218330w().getResources().getDrawable(f3c0.f94467Z1));
        this.f202815a.m142724h0(FeedModule.f38855d.m209572w7(this.f202823i.f56011id).messages.count);
        m218307C(true, null);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m218322R(Throwable th) {
        m218307C(false, th);
        t2h.m186974e(th);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m218323S(String str, final MomentMessage momentMessage, final d30 d30Var) {
        this.f202824j.duringCreated(FeedModule.f38855d.m209327N6(str, momentMessage)).subscribe(mkd0.m154956H(new e30() { // from class: l.peh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148436a.m218321Q(d30Var, momentMessage, (MomentMessage) obj);
            }
        }, new e30() { // from class: l.qeh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154034a.m218322R((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m218324T(MomentMessage momentMessage, d30 d30Var) {
        m218326V(this.f202823i.owner, momentMessage, d30Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m218325U(xaj0 xaj0Var) {
        if (NullChecker.m81303a(this.f202815a)) {
            jpg jpgVar = this.f202815a;
            Moment moment = (Moment) xaj0Var.f191751a;
            C c = xaj0Var.f191753c;
            jpgVar.mo142214m(moment, (RawFeed) ((j760) c).f116565b, (Music) ((j760) c).f116564a);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m218326V(final String str, final MomentMessage momentMessage, final d30 d30Var) {
        vqg.m199561o(this.f202824j, momentMessage.value, DetectCategoryType.get("comment"), "comment", this.f202822h, new d30() { // from class: l.neh
            @Override // p149l.d30
            public final void call() {
                this.f138611a.m218323S(str, momentMessage, d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public final void m218327W(String str, String str2, final d30 d30Var) {
        final MomentMessage momentMessage = new MomentMessage();
        momentMessage.value = str;
        momentMessage.moment = this.f202825k;
        CommentInfo commentInfoNew_ = CommentInfo.new_();
        commentInfoNew_.parentMessageId = "";
        momentMessage.commentInfo = commentInfoNew_;
        if (qib0.f154711Z.m119125K(str2)) {
            v1h.m196550A0(m218330w(), new d30() { // from class: l.meh
                @Override // p149l.d30
                public final void call() {
                    this.f133417a.m218324T(momentMessage, d30Var);
                }
            }, false);
        } else {
            m218326V(this.f202823i.owner, momentMessage, d30Var);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m218328X() {
        p6j0.m167671e(nkg.m159854K() ? MatchScData.ModuleId.mid_e_likeButton : MatchScData.ModuleId.mid_e_follow, this.f202822h, zi60.m218959B(this.f202815a.f119183x, this.f202823i, this.f202816b));
    }

    /* JADX INFO: renamed from: Y */
    public void m218329Y() {
        Moment moment = this.f202823i;
        if (moment == null) {
            return;
        }
        FeedModule.f38855d.m209374Tb(moment.owner, moment.f56011id, false).subscribe(mkd0.m154956H(new e30() { // from class: l.weh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185940a.m218325U((xaj0) obj);
            }
        }, new e30() { // from class: l.xeh
            @Override // p149l.e30
            public final void call(Object obj) {
                zeh.m218290h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public Act m218330w() {
        return this.f202824j;
    }

    /* JADX INFO: renamed from: x */
    public final void m218331x(d30 d30Var) {
        v1h.m196580P0(m218330w(), new d30() { // from class: l.leh
            @Override // p149l.d30
            public final void call() {
                lsi0.m151593w(R$string.f38913I3);
            }
        }, false, d30Var, w1h.f184005c);
    }

    /* JADX INFO: renamed from: y */
    public void m218332y(final VEditText vEditText, final TextView textView, Moment moment) {
        this.f202823i = moment;
        this.f202818d = vEditText;
        if (sti.m185955a() || this.f202821g) {
            this.f202819e = vEditText.getInputType();
            vEditText.setInputType(0);
        }
        vEditText.setOnTouchListener(new View.OnTouchListener() { // from class: l.yeh
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f197688a.m218310F(vEditText, view, motionEvent);
            }
        });
        if (NullChecker.m81304b(vEditText)) {
            m218330w().duringCreated(vEditText.mo28618i(true)).subscribe(mkd0.m154955G(new e30() { // from class: l.eeh
                @Override // p149l.e30
                public final void call(Object obj) {
                    zeh.m218302t(vEditText, textView, (CharSequence) obj);
                }
            }));
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.feh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97132a.m218311G(vEditText, view);
            }
        });
        m218330w().duringCreated(Act.keyboardListenerObservable(m218330w().getWindow().getDecorView())).subscribe(this.f202827m);
    }

    /* JADX INFO: renamed from: z */
    public void m218333z(final User user) {
        if (nkg.m159896o()) {
            if (NullChecker.m81303a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched")) {
                zi60.m218961w().m218987s(this.f202823i, "p_moment_preview", false, false);
                m218330w().startActivity(kjb0.m146192c(m218330w(), user.f56011id, false, false));
                return;
            } else {
                zi60.m218961w().m218987s(this.f202823i, "p_moment_preview", true, false);
                FeedModule.f38854c.m60724f3(this.f202824j, user, this.f202823i, "p_moment_preview", false);
                return;
            }
        }
        if (nkg.m159854K()) {
            zvf0.m220399u(MatchScData.ModuleId.mid_e_likeButton, this.f202822h, vwb.m200311Y("moments_user_id", user.f56011id), vwb.m200311Y("moment_id", this.f202825k));
            FeedModule.m60222H().mo30788kn(this.f202824j, user, true ^ m218309E(), null, LikeFrom.get("moment"), this.f202825k, null, null);
            return;
        }
        Followship followship = user.localFollowship;
        if (NullChecker.m81303a(followship) && (TEnum.equals(followship.state, FollowshipStatus.following) || TEnum.equals(followship.state, "matched"))) {
            p6j0.m167669c("e_cancelfollow", this.f202822h, zi60.m218959B(this.f202815a.f119183x, this.f202823i, user));
            v1h.m196628v0(m218330w(), m218330w().getResources().getString(R$string.f39183z), new d30() { // from class: l.ieh
                @Override // p149l.d30
                public final void call() {
                    this.f112776a.m218313I(user);
                }
            });
            return;
        }
        p6j0.m167669c(MatchScData.ModuleId.mid_e_follow, this.f202822h, zi60.m218959B(this.f202815a.f119183x, this.f202823i, user));
        if (!user.profile.moments.hidePublicMoments || User.isMatched(user)) {
            FeedModule.f38855d.m209502m7(qib0.f154713b0.f139230a.userId(), user, true, this.f202822h);
        } else {
            lsi0.m151593w(R$string.f39129q);
        }
    }
}
