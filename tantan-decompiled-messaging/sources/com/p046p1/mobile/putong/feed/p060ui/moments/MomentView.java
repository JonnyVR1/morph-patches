package com.p046p1.mobile.putong.feed.p060ui.moments;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Moments;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.PartialIdList;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.livevoiceroom.FeedLiveVoiceRoomView;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentView;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsFeedPreviewAct;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame_Anim;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VText;
import p149l.ap00;
import p149l.b5c0;
import p149l.bt0;
import p149l.csg;
import p149l.d30;
import p149l.e1c0;
import p149l.e30;
import p149l.f3c0;
import p149l.hg00;
import p149l.i0e;
import p149l.i0g0;
import p149l.j760;
import p149l.kjb0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.qib0;
import p149l.rko;
import p149l.t100;
import p149l.t2h;
import p149l.u2h;
import p149l.v1h;
import p149l.vwb;
import p149l.wk00;
import p149l.xck0;
import p149l.xdl0;
import p149l.xia;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class MomentView extends FrameLayout {

    /* JADX INFO: renamed from: T0 */
    public static final int f43765T0;

    /* JADX INFO: renamed from: A */
    public FrameLayout f43766A;

    /* JADX INFO: renamed from: B */
    public VText f43767B;

    /* JADX INFO: renamed from: C */
    public VText f43768C;

    /* JADX INFO: renamed from: D */
    public FrameLayout f43769D;

    /* JADX INFO: renamed from: E */
    public ImageView f43770E;

    /* JADX INFO: renamed from: E0 */
    public LinearLayout f43771E0;

    /* JADX INFO: renamed from: F */
    public View f43772F;

    /* JADX INFO: renamed from: F0 */
    public LinearLayout f43773F0;

    /* JADX INFO: renamed from: G */
    public FrameLayout f43774G;

    /* JADX INFO: renamed from: G0 */
    public View f43775G0;

    /* JADX INFO: renamed from: H */
    public ImageView f43776H;

    /* JADX INFO: renamed from: H0 */
    public View f43777H0;

    /* JADX INFO: renamed from: I */
    public VDraweeView f43778I;

    /* JADX INFO: renamed from: I0 */
    public VFrame_Anim f43779I0;

    /* JADX INFO: renamed from: J */
    public VImage f43780J;

    /* JADX INFO: renamed from: J0 */
    public VFrame_Anim f43781J0;

    /* JADX INFO: renamed from: K */
    public VDraweeView f43782K;

    /* JADX INFO: renamed from: K0 */
    public VProgressBar f43783K0;

    /* JADX INFO: renamed from: L */
    public VImage f43784L;

    /* JADX INFO: renamed from: L0 */
    public ImageView f43785L0;

    /* JADX INFO: renamed from: M */
    public VDraweeView f43786M;

    /* JADX INFO: renamed from: M0 */
    public MomentsFeedRecyclerList f43787M0;

    /* JADX INFO: renamed from: N */
    public VImage f43788N;

    /* JADX INFO: renamed from: N0 */
    public Moment f43789N0;

    /* JADX INFO: renamed from: O */
    public VDraweeView f43790O;

    /* JADX INFO: renamed from: O0 */
    public ArrayList<VDraweeView> f43791O0;

    /* JADX INFO: renamed from: P */
    public VImage f43792P;

    /* JADX INFO: renamed from: P0 */
    public ArrayList<VImage> f43793P0;

    /* JADX INFO: renamed from: Q */
    public VDraweeView f43794Q;

    /* JADX INFO: renamed from: Q0 */
    public User f43795Q0;

    /* JADX INFO: renamed from: R */
    public VImage f43796R;

    /* JADX INFO: renamed from: R0 */
    public hg00 f43797R0;

    /* JADX INFO: renamed from: S */
    public VDraweeView f43798S;

    /* JADX INFO: renamed from: S0 */
    public View.OnClickListener f43799S0;

    /* JADX INFO: renamed from: T */
    public VImage f43800T;

    /* JADX INFO: renamed from: U */
    public FrameLayout f43801U;

    /* JADX INFO: renamed from: V */
    public VText f43802V;

    /* JADX INFO: renamed from: W */
    public View f43803W;

    /* JADX INFO: renamed from: a */
    public LinearLayout f43804a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f43805b;

    /* JADX INFO: renamed from: c */
    public VImage f43806c;

    /* JADX INFO: renamed from: d */
    public VText f43807d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f43808e;

    /* JADX INFO: renamed from: f */
    public VImage f43809f;

    /* JADX INFO: renamed from: g */
    public VText f43810g;

    /* JADX INFO: renamed from: h */
    public VExpandableTextContainer f43811h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f43812i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f43813j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f43814k;

    /* JADX INFO: renamed from: k0 */
    public FrameLayout f43815k0;

    /* JADX INFO: renamed from: l */
    public VImage f43816l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f43817m;

    /* JADX INFO: renamed from: n */
    public ConstraintLayout f43818n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f43819o;

    /* JADX INFO: renamed from: p */
    public VText f43820p;

    /* JADX INFO: renamed from: p0 */
    public VText f43821p0;

    /* JADX INFO: renamed from: q */
    public AnimEffectPlayer f43822q;

    /* JADX INFO: renamed from: r */
    public FeedLiveVoiceRoomView f43823r;

    /* JADX INFO: renamed from: s */
    public VText f43824s;

    /* JADX INFO: renamed from: t */
    public VText f43825t;

    /* JADX INFO: renamed from: u */
    public VText f43826u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f43827v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f43828w;

    /* JADX INFO: renamed from: x */
    public VText f43829x;

    /* JADX INFO: renamed from: y */
    public FrameLayout f43830y;

    /* JADX INFO: renamed from: z */
    public ImageView f43831z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.MomentView$a */
    public class C11404a extends AnimListener {
        public C11404a() {
        }

        @Override // com.tantanapp.media.ttmediaeffect.anim.AnimListener, com.tantanapp.media.ttmediaeffect.anim.IAnimListener
        public void onFinished() {
            super.onFinished();
        }
    }

    static {
        f43765T0 = t100.m186889c().density * 160.0f < 360.0f ? 5 : 6;
    }

    public MomentView(Context context) {
        super(context);
        this.f43789N0 = null;
        this.f43799S0 = new View.OnClickListener() { // from class: l.wi00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186494a.m66762M(view);
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m66722A(Moment moment, ImageView imageView, boolean z, Throwable th) {
        t2h.m186976g(th);
        m66741k0(moment.haveLiked, imageView, z);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m66727F(Envelope envelope) {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m66729a(Moment moment, ImageView imageView, boolean z, Throwable th) {
        t2h.m186976g(th);
        m66741k0(moment.haveLiked, imageView, z);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m66731c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m66732d(View view) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m66733e(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static void m66737h0(final Moment moment, final ImageView imageView, final boolean z) {
        m66741k0(!moment.haveLiked, imageView, z);
        FeedModule.f38854c.m60697R3(moment.owner, moment.f56011id, !moment.haveLiked).subscribe(mkd0.m154956H(new e30() { // from class: l.xi00
            @Override // p149l.e30
            public final void call(Object obj) {
                MomentView.m66751u((Envelope) obj);
            }
        }, new e30() { // from class: l.yi00
            @Override // p149l.e30
            public final void call(Object obj) {
                MomentView.m66722A(moment, imageView, z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public static void m66741k0(boolean z, ImageView imageView, boolean z2) {
        if (z) {
            imageView.setImageResource(f3c0.f94499d2);
            bt0.m103729b(imageView, bt0.m103739l(imageView, bt0.f77162i, 0L, 500L, new AnticipateOvershootInterpolator(2.0f), 1.35f, 1.0f));
        } else {
            imageView.setImageResource(z2 ? f3c0.f94591o6 : f3c0.f94607q6);
            bt0.m103729b(imageView, bt0.m103739l(imageView, bt0.f77162i, 0L, 500L, new AnticipateOvershootInterpolator(2.0f), 1.35f, 1.0f));
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m66751u(Envelope envelope) {
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m66754x(Followship followship) {
    }

    /* JADX INFO: renamed from: H */
    public final void m66757H(View view) {
        wk00.m203641a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public PutongAct m66758I() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void m66767R(FollowshipStatus followshipStatus) {
        boolean zM81303a = NullChecker.m81303a(followshipStatus);
        final String str = OMSDialogPositon.p_nearby;
        if (zM81303a && (TEnum.equals(followshipStatus, FollowshipStatus.following) || TEnum.equals(followshipStatus, "matched"))) {
            v1h.m196628v0(m66758I(), getResources().getString(R$string.f39183z), new d30() { // from class: l.zi00
                @Override // p149l.d30
                public final void call() {
                    this.f203247a.m66760K(str);
                }
            });
            return;
        }
        User user = this.f43795Q0;
        if (user.profile.moments.hidePublicMoments && !User.isMatched(user)) {
            lsi0.m151593w(R$string.f39129q);
            return;
        }
        xia xiaVar = FeedModule.f38855d;
        String strUserId = FeedModule.m60221F().userId();
        User user2 = this.f43795Q0;
        Moment moment = this.f43789N0;
        boolean z = moment.isLive;
        xiaVar.m209509n7(strUserId, user2, true, z ? "liveMomentNearby" : "", z ? moment.live.f38767id : "", OMSDialogPositon.p_nearby).subscribe(mkd0.m154956H(new e30() { // from class: l.aj00
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151593w(R$string.f39028b3);
            }
        }, new e30() { // from class: l.bj00
            @Override // p149l.e30
            public final void call(Object obj) {
                MomentView.m66733e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m66760K(String str) {
        FeedModule.f38855d.m209502m7(FeedModule.m60221F().userId(), this.f43795Q0, false, str).subscribe(mkd0.m154956H(new e30() { // from class: l.tj00
            @Override // p149l.e30
            public final void call(Object obj) {
                MomentView.m66754x((Followship) obj);
            }
        }, new e30() { // from class: l.uj00
            @Override // p149l.e30
            public final void call(Object obj) {
                MomentView.m66731c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m66761L(Moment moment, Act act, View view) {
        if (u2h.m191494c() && moment.isLive) {
            csg.m108507c(m66758I(), "", moment);
        } else {
            act.startActivityWithCustomTransition(MomentsFeedPreviewAct.m66870Y1(act, moment.f56011id, 0, true), new ap00());
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m66762M(View view) {
        csg.m108507c(m66758I(), "", this.f43789N0);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m66763N(View view) {
        if (NullChecker.m81303a(this.f43787M0)) {
            if (qib0.f154713b0.f139231b.shouldLockComment(this.f43789N0.owner)) {
                qib0.f154713b0.f139231b.showProofAgeDlg(m66758I(), "moment_square");
            } else {
                this.f43787M0.m66885N(this.f43789N0);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m66764O(View view) {
        if (NullChecker.m81303a(this.f43787M0)) {
            m66783i0(this.f43789N0, this.f43831z, true);
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m66765P(View view) {
        if (NullChecker.m81303a(this.f43787M0)) {
            m66758I().startActivity(kjb0.m146194e(m66758I(), this.f43789N0.owner, false, false, false, false, null, -1));
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m66766Q(Boolean bool) {
        this.f43787M0.f43903l.m66839U4(bool.booleanValue());
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m66768S(View view) {
        PutongAct putongActM66758I = m66758I();
        Moment moment = this.f43789N0;
        v1h.m196632x0(putongActM66758I, moment.owner, moment, null, new e30() { // from class: l.zj00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203367a.m66766Q((Boolean) obj);
            }
        }, new e30() { // from class: l.ak00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70229a.m66767R((FollowshipStatus) obj);
            }
        }, false, false, true);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ boolean m66769T(View view) {
        i0e.m133793b(m66758I(), this.f43789N0.value);
        return true;
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m66770U(View view) {
        m66758I().startActivityForResult(MomentsInProfileAct.m66912V1(m66758I(), this.f43789N0.owner, "from_MomentsFeedAct"), 22);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m66771V(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.pj00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f149705a.m66770U(view2);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m66772W(hg00 hg00Var, User user) {
        String str = user.f56011id;
        this.f43795Q0 = user;
        qib0.f154691G.m102341Q0(this.f43805b, user.m60124fp().profileSmall());
        this.f43807d.setText(user.name);
        String gPMemo = FeedModule.m60222H().getGPMemo(user.f56011id);
        if (!TextUtils.isEmpty(gPMemo)) {
            this.f43807d.setText(gPMemo);
        }
        if (FeedModule.m60222H().mo30742a().mo165304d() && user.isVIP() && !user.gpHideVip()) {
            this.f43807d.setTextColor(m66758I().color(e1c0.f88793k0));
        } else {
            this.f43807d.setTextColor(m66758I().color(e1c0.f88795l0));
        }
        kjb0.m146214y(m66758I(), user, this.f43809f, true, false);
        this.f43824s.setVisibility(8);
        qib0.f154713b0.f139231b.showUserVerificationLogo(m66758I(), user, this.f43806c);
        if (u2h.m191494c() && hg00Var.f107542a.isLive) {
            xdl0.m208344M(this.f43828w, false);
            xdl0.m208344M(this.f43830y, false);
        } else {
            boolean zEquals = hg00Var.f107542a.owner.equals(FeedModule.m60221F().userId());
            boolean z = user.verifications.anchor.verified;
            xdl0.m208344M(this.f43828w, User.isMatched(user) || (z && !zEquals));
            xdl0.m208344M(this.f43830y, User.isMatched(user) || zEquals || z);
        }
        if (qib0.f154713b0.f139231b.isCurrentMessageBlock(this.f43795Q0.f56011id)) {
            xdl0.m208344M(this.f43828w, false);
        }
        if (vwb.m200296J(user.profile.extensions.interest.emoji)) {
            return;
        }
        xdl0.m208344M(this.f43808e, true);
        qib0.f154691G.m102331L0(this.f43808e, qib0.f154709X.m126254n(user.profile.extensions.interest.emoji.get(0)) + ".png");
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m66773X(Moment moment, View view) {
        m66758I().startActivity(LikesDetailAct.m66640V1(m66758I(), moment.f56011id, moment.owner));
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m66774Y(Moment moment, View view) {
        m66758I().startActivity(MomentDetailAct.m66660V1(m66758I(), moment.f56011id, moment.owner, false, true));
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m66775Z(Moment moment, View view) {
        m66785l0(m66758I(), moment);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m66776a0(Moment moment, hg00 hg00Var, View view) {
        csg.m108509e(m66758I(), "from_intl_moments", moment, hg00Var.f107544c, false, new rko());
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m66777b0(final Moment moment, final hg00 hg00Var, ViewGroup viewGroup) {
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: l.vj00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181650a.m66776a0(moment, hg00Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m66778c0(PartialIdList partialIdList, int i, View view) {
        m66758I().startActivityForResult(MomentsInProfileAct.m66912V1(m66758I(), partialIdList.ids.get(i), "from_MomentsFeedAct"), 22);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m66779d0(PartialIdList partialIdList, int i, View view) {
        m66758I().startActivityForResult(MomentsInProfileAct.m66912V1(m66758I(), partialIdList.ids.get(i), "from_MomentsFeedAct"), 22);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m66780e0(int i, User user) {
        qib0.f154691G.m102341Q0(this.f43791O0.get(i), user.m60124fp().profileSmall());
        qib0.f154713b0.f139231b.showUserVerificationLogo(m66758I(), user, this.f43793P0.get(i));
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m66781f0(Moment moment, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            this.f43787M0.f43896e.mo66911j(moment);
        } else if (1 == i) {
            this.f43787M0.f43896e.mo66907f(moment);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: g0 */
    public void m66782g0(final Act act, FrameLayout frameLayout, final Moment moment) {
        List listM200324f0;
        boolean z;
        float f;
        Picture picture;
        List<Media> list = moment.media;
        Picture picture2 = null;
        if (u2h.m191494c() && moment.isLive) {
            Media media = moment.live.snapshot;
            if (media == null) {
                media = (NullChecker.m81303a(moment.liveRoom) && NullChecker.m81303a(moment.liveRoom.cover)) ? moment.liveRoom.cover.media : null;
            }
            listM200324f0 = vwb.m200324f0(media);
        } else {
            listM200324f0 = moment.media;
        }
        int iM208412y0 = xdl0.m208412y0() - t100.m186890d(125.0f);
        float f2 = 4.0f;
        int iM186890d = (iM208412y0 - (t100.m186890d(4.0f) * 2)) / 3;
        int i = 0;
        while (true) {
            z = true;
            if (i >= frameLayout.getChildCount() - 1) {
                break;
            }
            View childAt = frameLayout.getChildAt(i);
            xdl0.m208344M(childAt, false);
            VDraweeView vDraweeView = (VDraweeView) (childAt instanceof VDraweeView ? childAt : childAt.findViewById(b5c0.f73472D));
            qib0.f154691G.m184725o(vDraweeView);
            vDraweeView.setOnClickListener(null);
            childAt.setOnClickListener(null);
            vDraweeView.setZoomAnimationKey(null);
            i++;
        }
        int size = listM200324f0.size();
        String str = Moments.TYPE;
        if (size == 1) {
            Media media2 = (Media) listM200324f0.get(0);
            if (media2 instanceof Picture) {
                picture2 = (Picture) media2;
            } else if (media2 instanceof Video) {
                picture2 = ((Video) media2).cover;
            }
            if (NullChecker.m81303a(picture2)) {
                Dimension dimension = picture2.size;
                Point pointM208121b = xck0.m208121b(iM208412y0, new Point(dimension.width, dimension.height));
                boolean z2 = media2 instanceof Video;
                View childAt2 = frameLayout.getChildAt(z2 ? frameLayout.getChildCount() - 2 : 0);
                xdl0.m208345M0(childAt2, true);
                childAt2.setLayoutParams(new FrameLayout.LayoutParams(pointM208121b.x, pointM208121b.y));
                childAt2.setOnClickListener(new View.OnClickListener() { // from class: l.qj00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f154827a.m66761L(moment, act, view);
                    }
                });
                if (!(childAt2 instanceof VDraweeView)) {
                    childAt2 = childAt2.findViewById(b5c0.f73472D);
                }
                VDraweeView vDraweeView2 = (VDraweeView) childAt2;
                if (TEnum.equals(picture2.status, "raw") || TextUtils.isEmpty(picture2.url)) {
                    return;
                }
                if (z2) {
                    str = "";
                }
                qib0.f154691G.m102343R0(vDraweeView2, picture2.calculatedWidth(pointM208121b.x), str);
                vDraweeView2.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture2.url));
                return;
            }
            return;
        }
        final int i2 = 0;
        while (i2 < listM200324f0.size()) {
            Media media3 = (Media) listM200324f0.get(i2);
            if (media3 instanceof Picture) {
                picture = (Picture) media3;
            } else {
                if (media3 instanceof Video) {
                    picture = ((Video) media3).cover;
                } else {
                    f = f2;
                }
                i2++;
                f2 = f;
                z = true;
            }
            VDraweeView vDraweeView3 = (VDraweeView) frameLayout.getChildAt(i2);
            xdl0.m208345M0(vDraweeView3, z);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM186890d, iM186890d);
            vDraweeView3.setLayoutParams(layoutParams);
            switch (i2) {
                case 1:
                    f = f2;
                    layoutParams.setMargins(t100.m186890d(f) + iM186890d, 0, 0, 0);
                    break;
                case 2:
                    f = f2;
                    layoutParams.setMargins(t100.m186890d(8.0f) + (iM186890d * 2), 0, 0, 0);
                    break;
                case 3:
                    f = f2;
                    layoutParams.setMargins(0, t100.m186890d(f) + iM186890d, 0, 0);
                    break;
                case 4:
                    f = f2;
                    layoutParams.setMargins(t100.m186890d(f) + iM186890d, t100.m186890d(f) + iM186890d, 0, 0);
                    break;
                case 5:
                    f = f2;
                    layoutParams.setMargins(t100.m186890d(8.0f) + (iM186890d * 2), t100.m186890d(f) + iM186890d, 0, 0);
                    break;
                case 6:
                    f = f2;
                    layoutParams.setMargins(0, t100.m186890d(8.0f) + (iM186890d * 2), 0, 0);
                    break;
                case 7:
                    f = f2;
                    layoutParams.setMargins(t100.m186890d(f) + iM186890d, t100.m186890d(8.0f) + (iM186890d * 2), 0, 0);
                    break;
                case 8:
                    int i3 = iM186890d * 2;
                    f = f2;
                    layoutParams.setMargins(t100.m186890d(8.0f) + i3, t100.m186890d(8.0f) + i3, 0, 0);
                    break;
                default:
                    f = f2;
                    break;
            }
            if (!TEnum.equals(picture.status, "raw") && !TextUtils.isEmpty(picture.url)) {
                qib0.f154691G.m102343R0(vDraweeView3, picture.momentPictureSmall(), media3 instanceof Video ? "" : Moments.TYPE);
                vDraweeView3.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
            }
            vDraweeView3.setOnClickListener(new View.OnClickListener() { // from class: l.rj00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Act act2 = act;
                    act2.startActivityWithCustomTransition(MomentsFeedPreviewAct.m66870Y1(act2, moment.f56011id, i2, true), new ap00());
                }
            });
            i2++;
            f2 = f;
            z = true;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m66783i0(final Moment moment, final ImageView imageView, final boolean z) {
        m66741k0(!moment.haveLiked, imageView, z);
        this.f43787M0.m66891T(moment).subscribe(mkd0.m154956H(new e30() { // from class: l.bk00
            @Override // p149l.e30
            public final void call(Object obj) {
                MomentView.m66727F((Envelope) obj);
            }
        }, new e30() { // from class: l.ck00
            @Override // p149l.e30
            public final void call(Object obj) {
                MomentView.m66729a(moment, imageView, z, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a6  */
    /* JADX INFO: renamed from: j0 */
    public void m66784j0(final hg00 hg00Var, final HashMap<String, Boolean> map, HashMap<String, Integer> map2, MomentsFeedRecyclerList momentsFeedRecyclerList) {
        boolean z;
        boolean z2;
        this.f43797R0 = hg00Var;
        this.f43787M0 = momentsFeedRecyclerList;
        vwb.m200354z(vwb.m200324f0(this.f43805b, this.f43807d), new e30() { // from class: l.cj00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81129a.m66771V((View) obj);
            }
        });
        this.f43787M0.m66887P(hg00Var.f107542a.owner, new e30() { // from class: l.ej00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f91654a.m66772W(hg00Var, (User) obj);
            }
        });
        final Moment moment = hg00Var.f107542a;
        if (NullChecker.m81303a(this.f43789N0) && this.f43789N0.equals(moment) && NullChecker.m81304b(moment) && TEnum.equals(this.f43789N0.status(), moment.status())) {
            return;
        }
        this.f43789N0 = moment;
        m66786m0();
        boolean zIsTeamAccount = User.isTeamAccount(moment.owner);
        FrameLayout frameLayout = this.f43801U;
        if (zIsTeamAccount) {
            frameLayout.setOnClickListener(null);
            this.f43815k0.setOnClickListener(null);
        } else {
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: l.fj00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f97746a.m66773X(moment, view);
                }
            });
            this.f43815k0.setOnClickListener(new View.OnClickListener() { // from class: l.gj00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f102990a.m66774Y(moment, view);
                }
            });
        }
        String string = moment.status().toString();
        string.getClass();
        switch (string) {
            case "failed":
                this.f43779I0.setVisibility(0);
                this.f43781J0.m223026G(this.f43785L0);
                this.f43779I0.setOnClickListener(new View.OnClickListener() { // from class: l.ij00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f113483a.m66775Z(moment, view);
                    }
                });
                break;
            case "normal":
                this.f43779I0.setVisibility(4);
                this.f43779I0.setOnClickListener(null);
                break;
            case "sending":
                this.f43779I0.setVisibility(0);
                this.f43781J0.m223026G(this.f43783K0);
                this.f43779I0.setOnClickListener(new View.OnClickListener() { // from class: l.jj00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MomentView.m66732d(view);
                    }
                });
                break;
        }
        xdl0.m208345M0(this.f43781J0, !TEnum.equals(moment.status(), "normal"));
        this.f43810g.setText(mqi0.m155939N(moment.createdTime));
        String str = moment.value;
        if (moment.isVoiceLive) {
            xdl0.m208344M(this.f43810g, false);
            str = moment.voiceLive.momentText;
        }
        this.f43811h.m79200L(map.get(moment.f56011id) == null ? false : map.get(moment.f56011id).booleanValue()).m79205Q(new VExpandableTextContainer.InterfaceC13090e() { // from class: l.kj00
            @Override // com.p046p1.mobile.putong.newui.view.VExpandableTextContainer.InterfaceC13090e
            /* JADX INFO: renamed from: a */
            public final void mo79216a(boolean z3) {
                map.put(moment.f56011id, Boolean.valueOf(z3));
            }
        }).m79201M(str);
        if (!NullChecker.m81303a(moment.location) || TextUtils.isEmpty(moment.location.name)) {
            this.f43825t.setVisibility(8);
        } else {
            this.f43825t.setVisibility(0);
            this.f43825t.setText(moment.location.name);
        }
        if (u2h.m191494c() && moment.isLive) {
            Cloneable cloneable = moment.live.snapshot;
            if (cloneable == null) {
                cloneable = (NullChecker.m81303a(moment.liveRoom) && NullChecker.m81303a(moment.liveRoom.cover)) ? moment.liveRoom.cover.media : null;
            }
            if (!(cloneable instanceof Picture)) {
                cloneable = null;
            }
            if (cloneable != null) {
                z = true;
            } else {
                z = false;
            }
            z2 = true;
        } else if (moment.isVoiceLive) {
            z = false;
            z2 = false;
        } else {
            List<Media> list = moment.media;
            if (list == null || list.size() == 0) {
                z = false;
            } else {
                z = true;
            }
            z2 = true;
        }
        xdl0.m208344M(this.f43813j, z);
        xdl0.m208344M(this.f43812i, z);
        xdl0.m208344M(this.f43827v, z2);
        if (z) {
            m66782g0(m66758I(), this.f43813j, moment);
        }
        xdl0.m208344M(this.f43823r, false);
        if (moment.isVoiceLive) {
            xdl0.m208344M(this.f43823r, true);
            this.f43823r.m64813n(moment);
            vwb.m200354z(vwb.m200324f0(this.f43823r, this.f43811h), new e30() { // from class: l.lj00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f128274a.m66777b0(moment, hg00Var, (ViewGroup) obj);
                }
            });
            zvf0.m220399u("e_live_audio_room_enter", "p_follow", new j760("anchorId", moment.voiceLive.anchor.f38803id), new j760("liveId", moment.voiceLive.f39250id), new j760("topic_id", moment.voiceLive.voiceRoomInfo.topics.get(0).f38839id), new j760(FirebaseAnalytics.Param.INDEX, Integer.valueOf(hg00Var.f107544c)), new j760("audio_room_type", moment.voiceLive.voiceRoomInfo.maskMode ? "mask_audio" : "normal_audio"));
        }
        if (TEnum.equals(moment.dynamicType, "liked") || TEnum.equals(moment.dynamicType, "superLike")) {
            ViewGroup.LayoutParams layoutParams = this.f43813j.getChildAt(0).getLayoutParams();
            if (layoutParams.width == -1) {
                FrameLayout frameLayout2 = this.f43813j;
                layoutParams = frameLayout2.getChildAt(frameLayout2.getChildCount() - 2).getLayoutParams();
            }
            ViewGroup.LayoutParams layoutParams2 = this.f43817m.getLayoutParams();
            layoutParams2.width = layoutParams.width;
            layoutParams2.height = (int) (((double) layoutParams.width) / 2.4d);
            this.f43817m.setLayoutParams(layoutParams2);
            qib0.f154691G.m102325I0(this.f43817m, TEnum.equals(moment.dynamicType, "liked") ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkFKNlJFSlRKUlNKQTdDTkFRV0RaS0dSVlZDWENVQzE0IiwidyI6NzA1LCJoIjoyOTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NzkwNzI0MjM1NTEzMDgwMzJ9.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IktFRVc3TEFQTUtEWkJPQVIyUDM1NUxOM01LQVlMWTE0IiwidyI6NzA1LCJoIjoyOTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNzI1NzUyODY4NTcyNzY0OTMwfQ.webp", layoutParams2.width, layoutParams2.height);
            xdl0.m208344M(this.f43817m, true);
            xdl0.m208344M(this.f43828w, false);
            xdl0.m208344M(this.f43830y, false);
            xdl0.m208344M(this.f43766A, true);
            this.f43811h.m79201M(TEnum.equals(moment.dynamicType, "liked") ? i0g0.m133883w(m66758I(), moment.f56011id) : i0g0.m133884x(m66758I(), moment.f56011id));
        } else {
            boolean zEquals = moment.owner.equals(FeedModule.m60221F().userId());
            User user = this.f43795Q0;
            boolean z3 = user != null && user.verifications.anchor.verified;
            xdl0.m208344M(this.f43828w, User.isMatched(user) || (z3 && !zEquals));
            xdl0.m208344M(this.f43830y, User.isMatched(this.f43795Q0) || z3 || zEquals);
            if (NullChecker.m81303a(this.f43795Q0) && qib0.f154713b0.f139231b.isCurrentMessageBlock(this.f43795Q0.f56011id)) {
                xdl0.m208344M(this.f43828w, false);
            }
            xdl0.m208344M(this.f43817m, false);
            xdl0.m208344M(this.f43766A, false);
        }
        if (u2h.m191494c() && moment.isLive) {
            xdl0.m208344M(this.f43818n, true);
            xdl0.m208344M(this.f43768C, true);
            xdl0.m208344M(this.f43828w, false);
            xdl0.m208344M(this.f43830y, false);
            xdl0.m208344M(this.f43810g, false);
            xdl0.m208329E0(this.f43768C, this.f43799S0);
            xdl0.m208329E0(this.f43811h, this.f43799S0);
        } else {
            xdl0.m208344M(this.f43818n, false);
            xdl0.m208344M(this.f43768C, false);
            boolean zEquals2 = moment.owner.equals(FeedModule.m60221F().userId());
            User user2 = this.f43795Q0;
            boolean z4 = user2 != null && user2.verifications.anchor.verified;
            xdl0.m208344M(this.f43828w, User.isMatched(user2) || (z4 && !zEquals2));
            xdl0.m208344M(this.f43830y, User.isMatched(this.f43795Q0) || z4 || zEquals2);
            if (NullChecker.m81303a(this.f43795Q0) && qib0.f154713b0.f139231b.isCurrentMessageBlock(this.f43795Q0.f56011id)) {
                xdl0.m208344M(this.f43828w, false);
            }
            this.f43811h.setOnClickListener(null);
        }
        this.f43831z.setImageResource(moment.haveLiked ? f3c0.f94499d2 : f3c0.f94591o6);
        PartialIdList partialIdList = moment.likes;
        int iMax = Math.max(partialIdList.count, partialIdList.ids.size());
        this.f43802V.setText(i0g0.m133867h0(iMax));
        xdl0.m208344M(this.f43772F, iMax != 0);
        FrameLayout frameLayout3 = this.f43801U;
        int i = f43765T0;
        xdl0.m208344M(frameLayout3, iMax > i);
        while (i < this.f43791O0.size()) {
            this.f43791O0.get(i).setVisibility(8);
            this.f43793P0.get(i).setVisibility(8);
            i++;
        }
        if (NullChecker.m81303a(map2.get(moment.f56011id)) && map2.get(moment.f56011id).intValue() == 0 && iMax != 0) {
            this.f43774G.setVisibility(0);
        } else if (NullChecker.m81303a(map2.get(moment.f56011id)) && map2.get(moment.f56011id).intValue() != 0 && iMax == 0) {
            this.f43774G.setVisibility(8);
        } else {
            FrameLayout frameLayout4 = this.f43774G;
            if (iMax != 0) {
                frameLayout4.setVisibility(0);
                this.f43774G.getLayoutParams().height = t100.m186890d(48.0f);
                this.f43774G.requestLayout();
            } else {
                frameLayout4.setVisibility(8);
            }
        }
        map2.put(moment.f56011id, Integer.valueOf(iMax));
        boolean zIsTeamAccount2 = User.isTeamAccount(moment.owner);
        FrameLayout frameLayout5 = this.f43815k0;
        if (zIsTeamAccount2) {
            xdl0.m208344M(frameLayout5, false);
        } else {
            xdl0.m208344M(frameLayout5, hg00Var.f107548g > 100);
        }
        xdl0.m208344M(this.f43803W, hg00Var.f107547f != 0);
        this.f43821p0.setText(m66758I().getString(R$string.f38955P3, Integer.valueOf(hg00Var.f107548g)));
        for (final int i2 = 0; i2 < f43765T0; i2++) {
            final PartialIdList partialIdList2 = moment.likes;
            int size = partialIdList2.ids.size();
            ArrayList<VDraweeView> arrayList = this.f43791O0;
            if (size <= i2) {
                arrayList.get(i2).setOnClickListener(null);
                this.f43793P0.get(i2).setOnClickListener(null);
                xdl0.m208345M0(this.f43791O0.get(i2), false);
                xdl0.m208345M0(this.f43793P0.get(i2), false);
            } else {
                xdl0.m208345M0(arrayList.get(i2), true);
                boolean zIsTeamAccount3 = User.isTeamAccount(moment.owner);
                ArrayList<VDraweeView> arrayList2 = this.f43791O0;
                if (zIsTeamAccount3) {
                    arrayList2.get(i2).setOnClickListener(null);
                    this.f43793P0.get(i2).setOnClickListener(null);
                } else {
                    arrayList2.get(i2).setOnClickListener(new View.OnClickListener() { // from class: l.mj00
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f134087a.m66778c0(partialIdList2, i2, view);
                        }
                    });
                    this.f43793P0.get(i2).setOnClickListener(new View.OnClickListener() { // from class: l.nj00
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f139168a.m66779d0(partialIdList2, i2, view);
                        }
                    });
                }
                this.f43787M0.m66887P(partialIdList2.ids.get(i2), new e30() { // from class: l.dj00
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f86470a.m66780e0(i2, (User) obj);
                    }
                });
            }
        }
        this.f43826u.setVisibility(8);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m66785l0(Act act, final Moment moment) {
        act.dialog().m20536f0(new String[]{act.getString(R$string.f39108n), act.getString(R$string.f39052f)}).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.oj00
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f144211a.m66781f0(moment, dialog, view, i, charSequence);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m66786m0() {
        xdl0.m208344M(this.f43810g, true);
    }

    /* JADX INFO: renamed from: n0 */
    public void m66787n0(boolean z) {
        xdl0.m208344M(this.f43773F0, z);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m66788o0() {
        if (NullChecker.m81303a(this.f43822q)) {
            this.f43822q.loadAnimWithListener("feed_live_room_icon.svga", -1, new C11404a(), true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (u2h.m191494c() && NullChecker.m81303a(this.f43797R0) && this.f43797R0.f107542a.isLive) {
            m66788o0();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66757H(this);
        this.f43828w.setOnClickListener(new View.OnClickListener() { // from class: l.hj00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107992a.m66763N(view);
            }
        });
        this.f43830y.setOnClickListener(new View.OnClickListener() { // from class: l.sj00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164769a.m66764O(view);
            }
        });
        this.f43766A.setOnClickListener(new View.OnClickListener() { // from class: l.wj00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186589a.m66765P(view);
            }
        });
        this.f43770E.setOnClickListener(new View.OnClickListener() { // from class: l.xj00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193168a.m66768S(view);
            }
        });
        this.f43791O0 = vwb.m200324f0(this.f43778I, this.f43782K, this.f43786M, this.f43790O, this.f43794Q, this.f43798S);
        this.f43793P0 = vwb.m200324f0(this.f43780J, this.f43784L, this.f43788N, this.f43792P, this.f43796R, this.f43800T);
        this.f43811h.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.yj00
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f198569a.m66769T(view);
            }
        });
    }

    public MomentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43789N0 = null;
        this.f43799S0 = new View.OnClickListener() { // from class: l.wi00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186494a.m66762M(view);
            }
        };
    }

    public MomentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43789N0 = null;
        this.f43799S0 = new View.OnClickListener() { // from class: l.wi00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186494a.m66762M(view);
            }
        };
    }
}
