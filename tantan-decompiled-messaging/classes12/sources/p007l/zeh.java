package p007l;

import android.text.Editable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.p000p1.mobile.putong.data.DetectCategoryType;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Followship;
import com.p000p1.mobile.putong.data.FollowshipStatus;
import com.p000p1.mobile.putong.data.LikeFrom;
import com.p000p1.mobile.putong.data.MatchScData;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.CommentInfo;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.p000p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import l.d30;
import l.e30;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.vwb;
import l.xaj0;
import l.zvf0;
import v.VEditText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class zeh {

    /* JADX INFO: renamed from: a */
    public jpg f15706a;

    /* JADX INFO: renamed from: b */
    public User f15707b;

    /* JADX INFO: renamed from: c */
    public boolean f15708c;

    /* JADX INFO: renamed from: d */
    public VEditText f15709d;

    /* JADX INFO: renamed from: e */
    public int f15710e;

    /* JADX INFO: renamed from: f */
    public int f15711f;

    /* JADX INFO: renamed from: g */
    public boolean f15712g;

    /* JADX INFO: renamed from: h */
    public String f15713h;

    /* JADX INFO: renamed from: i */
    public Moment f15714i;

    /* JADX INFO: renamed from: j */
    public Act f15715j;

    /* JADX INFO: renamed from: k */
    public String f15716k;

    /* JADX INFO: renamed from: l */
    public String f15717l;

    /* JADX INFO: renamed from: m */
    public e30<Boolean> f15718m = new e30() { // from class: l.veh
        public final void call(Object obj) {
            this.f14157a.m17357P((Boolean) obj);
        }
    };

    public zeh(Act act, tvh tvhVar) {
        this.f15713h = "p_moment_preview";
        this.f15715j = act;
        if (act instanceof FeedVideoFlowAct) {
            this.f15713h = "p_video_recommend";
        }
        this.f15711f = tvhVar.f13431a;
        this.f15712g = tvhVar.f13434d;
        Moment moment = tvhVar.f13433c;
        this.f15714i = moment;
        if (NullChecker.a(moment)) {
            this.f15716k = ((DbObject) this.f15714i).id;
        }
        this.f15717l = tvhVar.f13435e;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m17323d() {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m17326g(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m17327h(Throwable th) {
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m17338s(Throwable th) {
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m17339t(VEditText vEditText, TextView textView, CharSequence charSequence) {
        Editable text = vEditText.getText();
        textView.setEnabled((text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: renamed from: A */
    public void m17342A(Moment moment) {
        m17343B(moment, false);
    }

    /* JADX INFO: renamed from: B */
    public void m17343B(final Moment moment, boolean z) {
        if (moment == null) {
            return;
        }
        final boolean z2 = moment.haveLiked;
        if (z2 && z) {
            return;
        }
        m17367w().duringCreated(FeedModule.f316d.m16457Fb(moment.owner, ((DbObject) moment).id, !moment.haveLiked, moment.getMomentShowFrom())).subscribe(mkd0.H(new e30() { // from class: l.jeh
            public final void call(Object obj) {
                this.f9328a.m17351J(moment, z2, (Envelope) obj);
            }
        }, new e30() { // from class: l.keh
            public final void call(Object obj) {
                this.f9691a.m17352K(moment, z2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final void m17344C(boolean z, Throwable th) {
        Moment moment = this.f15714i;
        if (moment == null) {
            return;
        }
        p6j0.m12916f("e_comment_send", this.f15713h, p6j0.C2456a.m12922g("moment_id", ((DbObject) moment).id), p6j0.C2456a.m12922g("owner_id", this.f15714i.owner), p6j0.C2456a.m12922g("comment_user_id", FeedModule.m1139F().userId()), p6j0.C2456a.m12922g("comment_state", z ? "success" : "fail"), p6j0.C2456a.m12922g("comment_detail", "comment"), th == null ? null : p6j0.C2456a.m12922g("error", th.toString()));
    }

    /* JADX INFO: renamed from: D */
    public void m17345D(final jpg jpgVar) {
        this.f15706a = jpgVar;
        if (NullChecker.a(this.f15714i)) {
            User userM16628e8 = FeedModule.f316d.m16628e8(this.f15714i.owner);
            this.f15707b = userM16628e8;
            if (NullChecker.a(userM16628e8)) {
                jpgVar.m11317q0(this.f15707b);
            }
        }
        this.f15715j.duringCreated(FeedModule.f316d.f14988l0).subscribe(mkd0.G(new e30() { // from class: l.deh
            public final void call(Object obj) {
                this.f6905a.m17353L(jpgVar, (Map) obj);
            }
        }));
        this.f15715j.duringCreated(FeedModule.f316d.f14947Q0).subscribe(mkd0.H(new e30() { // from class: l.oeh
            public final void call(Object obj) {
                this.f11452a.m17354M(jpgVar, (j760) obj);
            }
        }, new e30() { // from class: l.reh
            public final void call(Object obj) {
                zeh.m17338s((Throwable) obj);
            }
        }));
        this.f15715j.duringCreated(FeedModule.f316d.f14951S0).subscribe(mkd0.H(new e30() { // from class: l.seh
            public final void call(Object obj) {
                this.f12896a.m17355N(jpgVar, (j760) obj);
            }
        }, new e30() { // from class: l.teh
            public final void call(Object obj) {
                zeh.m17326g((Throwable) obj);
            }
        }));
        this.f15715j.duringCreated(FeedModule.f316d.f14996p0).subscribe(mkd0.G(new e30() { // from class: l.ueh
            public final void call(Object obj) {
                this.f13818a.m17356O((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E */
    public final boolean m17346E() {
        Act act = this.f15715j;
        if (act instanceof PhotoAlbumFeedPreviewAct) {
            return ((PhotoAlbumFeedPreviewAct) act).f4066i;
        }
        if (act instanceof FeedVideoFlowAct) {
            return ((FeedVideoFlowAct) act).f4740f;
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean m17347F(final VEditText vEditText, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f15712g) {
                lsi0.h(R$string.f503d3);
                return false;
            }
            this.f15709d.setText("");
            if (!this.f15708c && sti.m14315a()) {
                m17368x(new d30() { // from class: l.geh
                    public final void call() {
                        this.f8436a.m17349H(vEditText);
                    }
                });
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m17348G(VEditText vEditText, View view) {
        if (this.f15712g) {
            lsi0.h(R$string.f503d3);
            return;
        }
        m17364W(vEditText.getText().toString(), vEditText.getText().toString().trim(), new d30() { // from class: l.heh
            public final void call() {
                zeh.m17323d();
            }
        });
        m17367w().hideInput();
        vEditText.setHint(m17367w().getResources().getString(R$string.f340D));
        vEditText.setText(null);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m17349H(VEditText vEditText) {
        vEditText.setInputType(this.f15710e);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m17350I(User user) {
        FeedModule.f316d.m16683m7(qib0.b0.a.userId(), user, false, this.f15713h);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m17351J(Moment moment, boolean z, Envelope envelope) {
        this.f15706a.mo11230i0(FeedModule.f316d.m16753w7(((DbObject) moment).id));
        zi60.m17436w().m17460q(moment, this.f15706a.f9470E, 201, z, this.f15713h);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m17352K(Moment moment, boolean z, Throwable th) {
        t2h.m14427g(th);
        zi60.m17436w().m17461r(moment, this.f15706a.f9470E, th, z, this.f15713h);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m17353L(jpg jpgVar, Map map) {
        if (FeedModule.f316d.f14982i0.containsKey(this.f15716k)) {
            jpgVar.m11316p0(FeedModule.f316d.f14982i0.get(this.f15716k));
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m17354M(jpg jpgVar, j760 j760Var) {
        User user = this.f15707b;
        if (user != null) {
            jpgVar.mo11229g0(FeedModule.f316d.m16628e8(((DbObject) user).id));
        }
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m17355N(jpg jpgVar, j760 j760Var) {
        User user = this.f15707b;
        if (user != null) {
            jpgVar.mo11229g0(FeedModule.f316d.m16628e8(((DbObject) user).id));
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m17356O(Moment moment) {
        if (!TextUtils.equals(((DbObject) moment).id, this.f15716k) || (this.f15715j instanceof FeedVideoFlowAct)) {
            return;
        }
        m17367w().finishWithoutCustomAnimation();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m17357P(Boolean bool) {
        this.f15708c = bool.booleanValue();
        boolean zBooleanValue = bool.booleanValue();
        VEditText vEditText = this.f15709d;
        if (zBooleanValue) {
            vEditText.requestFocus();
        } else {
            vEditText.setHint(m17367w().getString(R$string.f340D));
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m17358Q(d30 d30Var, MomentMessage momentMessage, MomentMessage momentMessage2) {
        if (NullChecker.a(d30Var) && !momentMessage.isChildComment()) {
            d30Var.call();
        }
        lsi0.q(m17367w().getString(R$string.f380J3), m17367w().getResources().getDrawable(f3c0.f7750Z1));
        this.f15706a.m11308h0(FeedModule.f316d.m16753w7(((DbObject) this.f15714i).id).messages.count);
        m17344C(true, null);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m17359R(Throwable th) {
        m17344C(false, th);
        t2h.m14425e(th);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m17360S(String str, final MomentMessage momentMessage, final d30 d30Var) {
        this.f15715j.duringCreated(FeedModule.f316d.m16508N6(str, momentMessage)).subscribe(mkd0.H(new e30() { // from class: l.peh
            public final void call(Object obj) {
                this.f11820a.m17358Q(d30Var, momentMessage, (MomentMessage) obj);
            }
        }, new e30() { // from class: l.qeh
            public final void call(Object obj) {
                this.f12219a.m17359R((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m17361T(MomentMessage momentMessage, d30 d30Var) {
        m17363V(this.f15714i.owner, momentMessage, d30Var);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m17362U(xaj0 xaj0Var) {
        if (NullChecker.a(this.f15706a)) {
            jpg jpgVar = this.f15706a;
            Moment moment = (Moment) xaj0Var.a;
            Object obj = xaj0Var.c;
            jpgVar.mo11232m(moment, (RawFeed) ((j760) obj).b, (Music) ((j760) obj).a);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m17363V(final String str, final MomentMessage momentMessage, final d30 d30Var) {
        vqg.m15531o(this.f15715j, momentMessage.value, DetectCategoryType.get("comment"), "comment", this.f15713h, new d30() { // from class: l.neh
            public final void call() {
                this.f10759a.m17360S(str, momentMessage, d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public final void m17364W(String str, String str2, final d30 d30Var) {
        final MomentMessage momentMessage = new MomentMessage();
        momentMessage.value = str;
        momentMessage.moment = this.f15716k;
        CommentInfo commentInfoNew_ = CommentInfo.new_();
        commentInfoNew_.parentMessageId = "";
        momentMessage.commentInfo = commentInfoNew_;
        if (qib0.Z.K(str2)) {
            v1h.m15189A0(m17367w(), new d30() { // from class: l.meh
                public final void call() {
                    this.f10448a.m17361T(momentMessage, d30Var);
                }
            }, false);
        } else {
            m17363V(this.f15714i.owner, momentMessage, d30Var);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m17365X() {
        p6j0.m12915e(nkg.m12213K() ? MatchScData.ModuleId.mid_e_likeButton : MatchScData.ModuleId.mid_e_follow, this.f15713h, zi60.m17434B(this.f15706a.f9498x, this.f15714i, this.f15707b));
    }

    /* JADX INFO: renamed from: Y */
    public void m17366Y() {
        Moment moment = this.f15714i;
        if (moment == null) {
            return;
        }
        FeedModule.f316d.m16555Tb(moment.owner, ((DbObject) moment).id, false).subscribe(mkd0.H(new e30() { // from class: l.weh
            public final void call(Object obj) {
                this.f14516a.m17362U((xaj0) obj);
            }
        }, new e30() { // from class: l.xeh
            public final void call(Object obj) {
                zeh.m17327h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public Act m17367w() {
        return this.f15715j;
    }

    /* JADX INFO: renamed from: x */
    public final void m17368x(d30 d30Var) {
        v1h.m15219P0(m17367w(), new d30() { // from class: l.leh
            public final void call() {
                lsi0.w(R$string.f374I3);
            }
        }, false, d30Var, w1h.f14363c);
    }

    /* JADX INFO: renamed from: y */
    public void m17369y(final VEditText vEditText, final TextView textView, Moment moment) {
        this.f15714i = moment;
        this.f15709d = vEditText;
        if (sti.m14315a() || this.f15712g) {
            this.f15710e = vEditText.getInputType();
            vEditText.setInputType(0);
        }
        vEditText.setOnTouchListener(new View.OnTouchListener() { // from class: l.yeh
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f15409a.m17347F(vEditText, view, motionEvent);
            }
        });
        if (NullChecker.b(vEditText)) {
            m17367w().duringCreated(vEditText.i(true)).subscribe(mkd0.G(new e30() { // from class: l.eeh
                public final void call(Object obj) {
                    zeh.m17339t(vEditText, textView, (CharSequence) obj);
                }
            }));
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.feh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8078a.m17348G(vEditText, view);
            }
        });
        m17367w().duringCreated(Act.keyboardListenerObservable(m17367w().getWindow().getDecorView())).subscribe(this.f15718m);
    }

    /* JADX INFO: renamed from: z */
    public void m17370z(final User user) {
        if (nkg.m12255o()) {
            if (NullChecker.a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched")) {
                zi60.m17436w().m17462s(this.f15714i, "p_moment_preview", false, false);
                m17367w().startActivity(kjb0.m11451c(m17367w(), ((DbObject) user).id, false, false));
                return;
            } else {
                zi60.m17436w().m17462s(this.f15714i, "p_moment_preview", true, false);
                FeedModule.f315c.m1650f3(this.f15715j, user, this.f15714i, "p_moment_preview", false);
                return;
            }
        }
        if (nkg.m12213K()) {
            zvf0.u(MatchScData.ModuleId.mid_e_likeButton, this.f15713h, new j760[]{vwb.Y("moments_user_id", ((DbObject) user).id), vwb.Y("moment_id", this.f15716k)});
            FeedModule.m1140H().kn(this.f15715j, user, true ^ m17346E(), (String) null, LikeFrom.get("moment"), this.f15716k, (e30) null, (e30) null);
            return;
        }
        Followship followship = user.localFollowship;
        if (NullChecker.a(followship) && (TEnum.equals(followship.state, FollowshipStatus.following) || TEnum.equals(followship.state, "matched"))) {
            p6j0.m12913c("e_cancelfollow", this.f15713h, zi60.m17434B(this.f15706a.f9498x, this.f15714i, user));
            v1h.m15267v0(m17367w(), m17367w().getResources().getString(R$string.f644z), new d30() { // from class: l.ieh
                public final void call() {
                    this.f9001a.m17350I(user);
                }
            });
            return;
        }
        p6j0.m12913c(MatchScData.ModuleId.mid_e_follow, this.f15713h, zi60.m17434B(this.f15706a.f9498x, this.f15714i, user));
        if (!user.profile.moments.hidePublicMoments || User.isMatched(user)) {
            FeedModule.f316d.m16683m7(qib0.b0.a.userId(), user, true, this.f15713h);
        } else {
            lsi0.w(R$string.f590q);
        }
    }
}
