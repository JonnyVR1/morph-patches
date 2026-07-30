package p153l;

import android.text.Editable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.CommentInfo;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.p051p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import p151v.VEditText;

/* JADX INFO: loaded from: classes13.dex */
public class ogh {

    /* JADX INFO: renamed from: a */
    public yqg f147257a;

    /* JADX INFO: renamed from: b */
    public User f147258b;

    /* JADX INFO: renamed from: c */
    public boolean f147259c;

    /* JADX INFO: renamed from: d */
    public VEditText f147260d;

    /* JADX INFO: renamed from: e */
    public int f147261e;

    /* JADX INFO: renamed from: f */
    public int f147262f;

    /* JADX INFO: renamed from: g */
    public boolean f147263g;

    /* JADX INFO: renamed from: h */
    public String f147264h;

    /* JADX INFO: renamed from: i */
    public Moment f147265i;

    /* JADX INFO: renamed from: j */
    public Act f147266j;

    /* JADX INFO: renamed from: k */
    public String f147267k;

    /* JADX INFO: renamed from: l */
    public String f147268l;

    /* JADX INFO: renamed from: m */
    public y20<Boolean> f147269m = new y20() { // from class: l.kgh
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f126611a.m167637P((Boolean) obj);
        }
    };

    public ogh(Act act, ixh ixhVar) {
        this.f147264h = "p_moment_preview";
        this.f147266j = act;
        if (act instanceof FeedVideoFlowAct) {
            this.f147264h = "p_video_recommend";
        }
        this.f147262f = ixhVar.f117408a;
        this.f147263g = ixhVar.f117411d;
        Moment moment = ixhVar.f117410c;
        this.f147265i = moment;
        if (NullChecker.m82486a(moment)) {
            this.f147267k = this.f147265i.f56859id;
        }
        this.f147268l = ixhVar.f117412e;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m167603d() {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m167606g(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m167607h(Throwable th) {
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m167618s(Throwable th) {
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m167619t(VEditText vEditText, TextView textView, CharSequence charSequence) {
        Editable text = vEditText.getText();
        textView.setEnabled((text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: renamed from: A */
    public void m167622A(Moment moment) {
        m167623B(moment, false);
    }

    /* JADX INFO: renamed from: B */
    public void m167623B(final Moment moment, boolean z) {
        if (moment == null) {
            return;
        }
        final boolean z2 = moment.haveLiked;
        if (z2 && z) {
            return;
        }
        m167647w().duringCreated(FeedModule.f39703d.m145517Fb(moment.owner, moment.f56859id, !moment.haveLiked, moment.getMomentShowFrom())).subscribe(psd0.m173597H(new y20() { // from class: l.yfh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f199519a.m167631J(moment, z2, (Envelope) obj);
            }
        }, new y20() { // from class: l.zfh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204135a.m167632K(moment, z2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final void m167624C(boolean z, Throwable th) {
        Moment moment = this.f147265i;
        if (moment == null) {
            return;
        }
        tfj0.m190943f("e_comment_send", this.f147264h, tfj0.C20302a.m190949g("moment_id", moment.f56859id), tfj0.C20302a.m190949g("owner_id", this.f147265i.owner), tfj0.C20302a.m190949g("comment_user_id", FeedModule.m61405F().userId()), tfj0.C20302a.m190949g("comment_state", z ? "success" : "fail"), tfj0.C20302a.m190949g("comment_detail", "comment"), th == null ? null : tfj0.C20302a.m190949g("error", th.toString()));
    }

    /* JADX INFO: renamed from: D */
    public void m167625D(final yqg yqgVar) {
        this.f147257a = yqgVar;
        if (NullChecker.m82486a(this.f147265i)) {
            User userM145688e8 = FeedModule.f39703d.m145688e8(this.f147265i.owner);
            this.f147258b = userM145688e8;
            if (NullChecker.m82486a(userM145688e8)) {
                yqgVar.m217126q0(this.f147258b);
            }
        }
        this.f147266j.duringCreated(FeedModule.f39703d.f121363l0).subscribe(psd0.m173596G(new y20() { // from class: l.sfh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167699a.m167633L(yqgVar, (Map) obj);
            }
        }));
        this.f147266j.duringCreated(FeedModule.f39703d.f121322Q0).subscribe(psd0.m173597H(new y20() { // from class: l.dgh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88301a.m167634M(yqgVar, (pf60) obj);
            }
        }, new y20() { // from class: l.ggh
            @Override // p153l.y20
            public final void call(Object obj) {
                ogh.m167618s((Throwable) obj);
            }
        }));
        this.f147266j.duringCreated(FeedModule.f39703d.f121326S0).subscribe(psd0.m173597H(new y20() { // from class: l.hgh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f109407a.m167635N(yqgVar, (pf60) obj);
            }
        }, new y20() { // from class: l.igh
            @Override // p153l.y20
            public final void call(Object obj) {
                ogh.m167606g((Throwable) obj);
            }
        }));
        this.f147266j.duringCreated(FeedModule.f39703d.f121371p0).subscribe(psd0.m173596G(new y20() { // from class: l.jgh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120729a.m167636O((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E */
    public final boolean m167626E() {
        Act act = this.f147266j;
        if (act instanceof PhotoAlbumFeedPreviewAct) {
            return ((PhotoAlbumFeedPreviewAct) act).f43453i;
        }
        if (act instanceof FeedVideoFlowAct) {
            return ((FeedVideoFlowAct) act).f44127f;
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean m167627F(final VEditText vEditText, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f147263g) {
                o1j0.m165634h(R$string.f39890d3);
                return false;
            }
            this.f147260d.setText("");
            if (!this.f147259c && owi.m169565a()) {
                m167648x(new x20() { // from class: l.vfh
                    @Override // p153l.x20
                    public final void call() {
                        this.f183925a.m167629H(vEditText);
                    }
                });
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m167628G(VEditText vEditText, View view) {
        if (this.f147263g) {
            o1j0.m165634h(R$string.f39890d3);
            return;
        }
        m167644W(vEditText.getText().toString(), vEditText.getText().toString().trim(), new x20() { // from class: l.wfh
            @Override // p153l.x20
            public final void call() {
                ogh.m167603d();
            }
        });
        m167647w().hideInput();
        vEditText.setHint(m167647w().getResources().getString(R$string.f39727D));
        vEditText.setText((CharSequence) null);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m167629H(VEditText vEditText) {
        vEditText.setInputType(this.f147261e);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m167630I(User user) {
        FeedModule.f39703d.m145743m7(uqb0.f180396b0.f170324a.userId(), user, false, this.f147264h);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m167631J(Moment moment, boolean z, Envelope envelope) {
        this.f147257a.mo134158i0(FeedModule.f39703d.m145813w7(moment.f56859id));
        er60.m122104w().m122128q(moment, this.f147257a.f201182E, 201, z, this.f147264h);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m167632K(Moment moment, boolean z, Throwable th) {
        i4h.m138538g(th);
        er60.m122104w().m122129r(moment, this.f147257a.f201182E, th, z, this.f147264h);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m167633L(yqg yqgVar, Map map) {
        if (FeedModule.f39703d.f121357i0.containsKey(this.f147267k)) {
            yqgVar.m217125p0(FeedModule.f39703d.f121357i0.get(this.f147267k));
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m167634M(yqg yqgVar, pf60 pf60Var) {
        User user = this.f147258b;
        if (user != null) {
            yqgVar.mo144265g0(FeedModule.f39703d.m145688e8(user.f56859id));
        }
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m167635N(yqg yqgVar, pf60 pf60Var) {
        User user = this.f147258b;
        if (user != null) {
            yqgVar.mo144265g0(FeedModule.f39703d.m145688e8(user.f56859id));
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m167636O(Moment moment) {
        if (!TextUtils.equals(moment.f56859id, this.f147267k) || (this.f147266j instanceof FeedVideoFlowAct)) {
            return;
        }
        m167647w().finishWithoutCustomAnimation();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m167637P(Boolean bool) {
        this.f147259c = bool.booleanValue();
        boolean zBooleanValue = bool.booleanValue();
        VEditText vEditText = this.f147260d;
        if (zBooleanValue) {
            vEditText.requestFocus();
        } else {
            vEditText.setHint(m167647w().getString(R$string.f39727D));
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m167638Q(x20 x20Var, MomentMessage momentMessage, MomentMessage momentMessage2) {
        if (NullChecker.m82486a(x20Var) && !momentMessage.isChildComment()) {
            x20Var.call();
        }
        o1j0.m165643q(m167647w().getString(R$string.f39767J3), m167647w().getResources().getDrawable(lbc0.f130985Z1));
        this.f147257a.m217123h0(FeedModule.f39703d.m145813w7(this.f147265i.f56859id).messages.count);
        m167624C(true, null);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m167639R(Throwable th) {
        m167624C(false, th);
        i4h.m138536e(th);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m167640S(String str, final MomentMessage momentMessage, final x20 x20Var) {
        this.f147266j.duringCreated(FeedModule.f39703d.m145568N6(str, momentMessage)).subscribe(psd0.m173597H(new y20() { // from class: l.egh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93934a.m167638Q(x20Var, momentMessage, (MomentMessage) obj);
            }
        }, new y20() { // from class: l.fgh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98935a.m167639R((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m167641T(MomentMessage momentMessage, x20 x20Var) {
        m167643V(this.f147265i.owner, momentMessage, x20Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m167642U(bkj0 bkj0Var) {
        if (NullChecker.m82486a(this.f147257a)) {
            yqg yqgVar = this.f147257a;
            Moment moment = (Moment) bkj0Var.f77081a;
            C c = bkj0Var.f77083c;
            yqgVar.mo107419m(moment, (RawFeed) ((pf60) c).f152157b, (Music) ((pf60) c).f152156a);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m167643V(final String str, final MomentMessage momentMessage, final x20 x20Var) {
        ksg.m151220o(this.f147266j, momentMessage.value, DetectCategoryType.get("comment"), "comment", this.f147264h, new x20() { // from class: l.cgh
            @Override // p153l.x20
            public final void call() {
                this.f81676a.m167640S(str, momentMessage, x20Var);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public final void m167644W(String str, String str2, final x20 x20Var) {
        final MomentMessage momentMessage = new MomentMessage();
        momentMessage.value = str;
        momentMessage.moment = this.f147267k;
        CommentInfo commentInfoNew_ = CommentInfo.new_();
        commentInfoNew_.parentMessageId = "";
        momentMessage.commentInfo = commentInfoNew_;
        if (uqb0.f180394Z.m95954K(str2)) {
            k3h.m148027A0(m167647w(), new x20() { // from class: l.bgh
                @Override // p153l.x20
                public final void call() {
                    this.f76640a.m167641T(momentMessage, x20Var);
                }
            }, false);
        } else {
            m167643V(this.f147265i.owner, momentMessage, x20Var);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m167645X() {
        tfj0.m190942e(cmg.m111183K() ? MatchScData.ModuleId.mid_e_likeButton : MatchScData.ModuleId.mid_e_follow, this.f147264h, er60.m122102B(this.f147257a.f201210x, this.f147265i, this.f147258b));
    }

    /* JADX INFO: renamed from: Y */
    public void m167646Y() {
        Moment moment = this.f147265i;
        if (moment == null) {
            return;
        }
        FeedModule.f39703d.m145615Tb(moment.owner, moment.f56859id, false).subscribe(psd0.m173597H(new y20() { // from class: l.lgh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131963a.m167642U((bkj0) obj);
            }
        }, new y20() { // from class: l.mgh
            @Override // p153l.y20
            public final void call(Object obj) {
                ogh.m167607h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public Act m167647w() {
        return this.f147266j;
    }

    /* JADX INFO: renamed from: x */
    public final void m167648x(x20 x20Var) {
        k3h.m148057P0(m167647w(), new x20() { // from class: l.agh
            @Override // p153l.x20
            public final void call() {
                o1j0.m165649w(R$string.f39761I3);
            }
        }, false, x20Var, l3h.f129877c);
    }

    /* JADX INFO: renamed from: y */
    public void m167649y(final VEditText vEditText, final TextView textView, Moment moment) {
        this.f147265i = moment;
        this.f147260d = vEditText;
        if (owi.m169565a() || this.f147263g) {
            this.f147261e = vEditText.getInputType();
            vEditText.setInputType(0);
        }
        vEditText.setOnTouchListener(new View.OnTouchListener() { // from class: l.ngh
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f141816a.m167627F(vEditText, view, motionEvent);
            }
        });
        if (NullChecker.m82487b(vEditText)) {
            m167647w().duringCreated(vEditText.mo29617i(true)).subscribe(psd0.m173596G(new y20() { // from class: l.tfh
                @Override // p153l.y20
                public final void call(Object obj) {
                    ogh.m167619t(vEditText, textView, (CharSequence) obj);
                }
            }));
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.ufh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178765a.m167628G(vEditText, view);
            }
        });
        m167647w().duringCreated(Act.keyboardListenerObservable(m167647w().getWindow().getDecorView())).subscribe(this.f147269m);
    }

    /* JADX INFO: renamed from: z */
    public void m167650z(final User user) {
        if (cmg.m111225o()) {
            if (NullChecker.m82486a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched")) {
                er60.m122104w().m122130s(this.f147265i, "p_moment_preview", false, false);
                m167647w().startActivity(orb0.m168886c(m167647w(), user.f56859id, false, false));
                return;
            } else {
                er60.m122104w().m122130s(this.f147265i, "p_moment_preview", true, false);
                FeedModule.f39702c.m61908f3(this.f147266j, user, this.f147265i, "p_moment_preview", false);
                return;
            }
        }
        if (cmg.m111183K()) {
            i4g0.m138523u(MatchScData.ModuleId.mid_e_likeButton, this.f147264h, jyb.m147494Y("moments_user_id", user.f56859id), jyb.m147494Y("moment_id", this.f147267k));
            FeedModule.m61406H().mo31791kn(this.f147266j, user, true ^ m167626E(), null, LikeFrom.get("moment"), this.f147267k, null, null);
            return;
        }
        Followship followship = user.localFollowship;
        if (NullChecker.m82486a(followship) && (TEnum.equals(followship.state, FollowshipStatus.following) || TEnum.equals(followship.state, "matched"))) {
            tfj0.m190940c("e_cancelfollow", this.f147264h, er60.m122102B(this.f147257a.f201210x, this.f147265i, user));
            k3h.m148105v0(m167647w(), m167647w().getResources().getString(R$string.f40031z), new x20() { // from class: l.xfh
                @Override // p153l.x20
                public final void call() {
                    this.f194034a.m167630I(user);
                }
            });
            return;
        }
        tfj0.m190940c(MatchScData.ModuleId.mid_e_follow, this.f147264h, er60.m122102B(this.f147257a.f201210x, this.f147265i, user));
        if (!user.profile.moments.hidePublicMoments || User.isMatched(user)) {
            FeedModule.f39703d.m145743m7(uqb0.f180396b0.f170324a.userId(), user, true, this.f147264h);
        } else {
            o1j0.m165649w(R$string.f39977q);
        }
    }
}
