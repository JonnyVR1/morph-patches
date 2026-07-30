package com.p051p1.mobile.putong.feed.p065ui.moments;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Moments;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.PartialIdList;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.livevoiceroom.FeedLiveVoiceRoomView;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentView;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsFeedPreviewAct;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame_Anim;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VText;
import p153l.bnl0;
import p153l.dmk0;
import p153l.ft00;
import p153l.gt0;
import p153l.hdc0;
import p153l.i4g0;
import p153l.i4h;
import p153l.j4h;
import p153l.jka;
import p153l.jx00;
import p153l.jyb;
import p153l.k3h;
import p153l.k9c0;
import p153l.lbc0;
import p153l.o1j0;
import p153l.orb0;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qo00;
import p153l.rmo;
import p153l.rtg;
import p153l.uqb0;
import p153l.w1e;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class MomentView extends FrameLayout {

    /* JADX INFO: renamed from: T0 */
    public static final int f44613T0;

    /* JADX INFO: renamed from: A */
    public FrameLayout f44614A;

    /* JADX INFO: renamed from: B */
    public VText f44615B;

    /* JADX INFO: renamed from: C */
    public VText f44616C;

    /* JADX INFO: renamed from: D */
    public FrameLayout f44617D;

    /* JADX INFO: renamed from: E */
    public ImageView f44618E;

    /* JADX INFO: renamed from: E0 */
    public LinearLayout f44619E0;

    /* JADX INFO: renamed from: F */
    public View f44620F;

    /* JADX INFO: renamed from: F0 */
    public LinearLayout f44621F0;

    /* JADX INFO: renamed from: G */
    public FrameLayout f44622G;

    /* JADX INFO: renamed from: G0 */
    public View f44623G0;

    /* JADX INFO: renamed from: H */
    public ImageView f44624H;

    /* JADX INFO: renamed from: H0 */
    public View f44625H0;

    /* JADX INFO: renamed from: I */
    public VDraweeView f44626I;

    /* JADX INFO: renamed from: I0 */
    public VFrame_Anim f44627I0;

    /* JADX INFO: renamed from: J */
    public VImage f44628J;

    /* JADX INFO: renamed from: J0 */
    public VFrame_Anim f44629J0;

    /* JADX INFO: renamed from: K */
    public VDraweeView f44630K;

    /* JADX INFO: renamed from: K0 */
    public VProgressBar f44631K0;

    /* JADX INFO: renamed from: L */
    public VImage f44632L;

    /* JADX INFO: renamed from: L0 */
    public ImageView f44633L0;

    /* JADX INFO: renamed from: M */
    public VDraweeView f44634M;

    /* JADX INFO: renamed from: M0 */
    public MomentsFeedRecyclerList f44635M0;

    /* JADX INFO: renamed from: N */
    public VImage f44636N;

    /* JADX INFO: renamed from: N0 */
    public Moment f44637N0;

    /* JADX INFO: renamed from: O */
    public VDraweeView f44638O;

    /* JADX INFO: renamed from: O0 */
    public ArrayList<VDraweeView> f44639O0;

    /* JADX INFO: renamed from: P */
    public VImage f44640P;

    /* JADX INFO: renamed from: P0 */
    public ArrayList<VImage> f44641P0;

    /* JADX INFO: renamed from: Q */
    public VDraweeView f44642Q;

    /* JADX INFO: renamed from: Q0 */
    public User f44643Q0;

    /* JADX INFO: renamed from: R */
    public VImage f44644R;

    /* JADX INFO: renamed from: R0 */
    public qo00 f44645R0;

    /* JADX INFO: renamed from: S */
    public VDraweeView f44646S;

    /* JADX INFO: renamed from: S0 */
    public View.OnClickListener f44647S0;

    /* JADX INFO: renamed from: T */
    public VImage f44648T;

    /* JADX INFO: renamed from: U */
    public FrameLayout f44649U;

    /* JADX INFO: renamed from: V */
    public VText f44650V;

    /* JADX INFO: renamed from: W */
    public View f44651W;

    /* JADX INFO: renamed from: a */
    public LinearLayout f44652a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f44653b;

    /* JADX INFO: renamed from: c */
    public VImage f44654c;

    /* JADX INFO: renamed from: d */
    public VText f44655d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f44656e;

    /* JADX INFO: renamed from: f */
    public VImage f44657f;

    /* JADX INFO: renamed from: g */
    public VText f44658g;

    /* JADX INFO: renamed from: h */
    public VExpandableTextContainer f44659h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f44660i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f44661j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f44662k;

    /* JADX INFO: renamed from: k0 */
    public FrameLayout f44663k0;

    /* JADX INFO: renamed from: l */
    public VImage f44664l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f44665m;

    /* JADX INFO: renamed from: n */
    public ConstraintLayout f44666n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f44667o;

    /* JADX INFO: renamed from: p */
    public VText f44668p;

    /* JADX INFO: renamed from: p0 */
    public VText f44669p0;

    /* JADX INFO: renamed from: q */
    public AnimEffectPlayer f44670q;

    /* JADX INFO: renamed from: r */
    public FeedLiveVoiceRoomView f44671r;

    /* JADX INFO: renamed from: s */
    public VText f44672s;

    /* JADX INFO: renamed from: t */
    public VText f44673t;

    /* JADX INFO: renamed from: u */
    public VText f44674u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f44675v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f44676w;

    /* JADX INFO: renamed from: x */
    public VText f44677x;

    /* JADX INFO: renamed from: y */
    public FrameLayout f44678y;

    /* JADX INFO: renamed from: z */
    public ImageView f44679z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.MomentView$a */
    public class C11567a extends AnimListener {
        public C11567a() {
        }

        @Override // com.tantanapp.media.ttmediaeffect.anim.AnimListener, com.tantanapp.media.ttmediaeffect.anim.IAnimListener
        public void onFinished() {
            super.onFinished();
        }
    }

    static {
        f44613T0 = qa00.m175858c().density * 160.0f < 360.0f ? 5 : 6;
    }

    public MomentView(Context context) {
        super(context);
        this.f44637N0 = null;
        this.f44647S0 = new View.OnClickListener() { // from class: l.fr00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100360a.m67945M(view);
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m67905A(Moment moment, ImageView imageView, boolean z, Throwable th) {
        i4h.m138538g(th);
        m67924k0(moment.haveLiked, imageView, z);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m67910F(Envelope envelope) {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m67912a(Moment moment, ImageView imageView, boolean z, Throwable th) {
        i4h.m138538g(th);
        m67924k0(moment.haveLiked, imageView, z);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m67914c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m67915d(View view) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m67916e(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static void m67920h0(final Moment moment, final ImageView imageView, final boolean z) {
        m67924k0(!moment.haveLiked, imageView, z);
        FeedModule.f39702c.m61881R3(moment.owner, moment.f56859id, !moment.haveLiked).subscribe(psd0.m173597H(new y20() { // from class: l.gr00
            @Override // p153l.y20
            public final void call(Object obj) {
                MomentView.m67934u((Envelope) obj);
            }
        }, new y20() { // from class: l.hr00
            @Override // p153l.y20
            public final void call(Object obj) {
                MomentView.m67905A(moment, imageView, z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public static void m67924k0(boolean z, ImageView imageView, boolean z2) {
        if (z) {
            imageView.setImageResource(lbc0.f131017d2);
            gt0.m132156b(imageView, gt0.m132166l(imageView, gt0.f106354i, 0L, 500L, new AnticipateOvershootInterpolator(2.0f), 1.35f, 1.0f));
        } else {
            imageView.setImageResource(z2 ? lbc0.f131109o6 : lbc0.f131125q6);
            gt0.m132156b(imageView, gt0.m132166l(imageView, gt0.f106354i, 0L, 500L, new AnticipateOvershootInterpolator(2.0f), 1.35f, 1.0f));
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m67934u(Envelope envelope) {
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m67937x(Followship followship) {
    }

    /* JADX INFO: renamed from: H */
    public final void m67940H(View view) {
        ft00.m127281a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public PutongAct m67941I() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void m67950R(FollowshipStatus followshipStatus) {
        boolean zM82486a = NullChecker.m82486a(followshipStatus);
        final String str = OMSDialogPositon.p_nearby;
        if (zM82486a && (TEnum.equals(followshipStatus, FollowshipStatus.following) || TEnum.equals(followshipStatus, "matched"))) {
            k3h.m148105v0(m67941I(), getResources().getString(R$string.f40031z), new x20() { // from class: l.ir00
                @Override // p153l.x20
                public final void call() {
                    this.f116485a.m67943K(str);
                }
            });
            return;
        }
        User user = this.f44643Q0;
        if (user.profile.moments.hidePublicMoments && !User.isMatched(user)) {
            o1j0.m165649w(R$string.f39977q);
            return;
        }
        jka jkaVar = FeedModule.f39703d;
        String strUserId = FeedModule.m61405F().userId();
        User user2 = this.f44643Q0;
        Moment moment = this.f44637N0;
        boolean z = moment.isLive;
        jkaVar.m145750n7(strUserId, user2, true, z ? "liveMomentNearby" : "", z ? moment.live.f39615id : "", OMSDialogPositon.p_nearby).subscribe(psd0.m173597H(new y20() { // from class: l.jr00
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165649w(R$string.f39876b3);
            }
        }, new y20() { // from class: l.kr00
            @Override // p153l.y20
            public final void call(Object obj) {
                MomentView.m67916e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m67943K(String str) {
        FeedModule.f39703d.m145743m7(FeedModule.m61405F().userId(), this.f44643Q0, false, str).subscribe(psd0.m173597H(new y20() { // from class: l.cs00
            @Override // p153l.y20
            public final void call(Object obj) {
                MomentView.m67937x((Followship) obj);
            }
        }, new y20() { // from class: l.ds00
            @Override // p153l.y20
            public final void call(Object obj) {
                MomentView.m67914c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m67944L(Moment moment, Act act, View view) {
        if (j4h.m143419c() && moment.isLive) {
            rtg.m183117c(m67941I(), "", moment);
        } else {
            act.startActivityWithCustomTransition(MomentsFeedPreviewAct.m68053Z1(act, moment.f56859id, 0, true), new jx00());
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m67945M(View view) {
        rtg.m183117c(m67941I(), "", this.f44637N0);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m67946N(View view) {
        if (NullChecker.m82486a(this.f44635M0)) {
            if (uqb0.f180396b0.f170325b.shouldLockComment(this.f44637N0.owner)) {
                uqb0.f180396b0.f170325b.showProofAgeDlg(m67941I(), "moment_square");
            } else {
                this.f44635M0.m68068N(this.f44637N0);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m67947O(View view) {
        if (NullChecker.m82486a(this.f44635M0)) {
            m67966i0(this.f44637N0, this.f44679z, true);
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m67948P(View view) {
        if (NullChecker.m82486a(this.f44635M0)) {
            m67941I().startActivity(orb0.m168888e(m67941I(), this.f44637N0.owner, false, false, false, false, null, -1));
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m67949Q(Boolean bool) {
        this.f44635M0.f44751l.m68022U4(bool.booleanValue());
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m67951S(View view) {
        PutongAct putongActM67941I = m67941I();
        Moment moment = this.f44637N0;
        k3h.m148109x0(putongActM67941I, moment.owner, moment, null, new y20() { // from class: l.is00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116617a.m67949Q((Boolean) obj);
            }
        }, new y20() { // from class: l.js00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122419a.m67950R((FollowshipStatus) obj);
            }
        }, false, false, true);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ boolean m67952T(View view) {
        w1e.m204398b(m67941I(), this.f44637N0.value);
        return true;
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m67953U(View view) {
        m67941I().startActivityForResult(MomentsInProfileAct.m68095X1(m67941I(), this.f44637N0.owner, "from_MomentsFeedAct"), 22);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m67954V(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.yr00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f201267a.m67953U(view2);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m67955W(qo00 qo00Var, User user) {
        String str = user.f56859id;
        this.f44643Q0 = user;
        uqb0.f180374G.m127125Q0(this.f44653b, user.m61308fp().profileSmall());
        this.f44655d.setText(user.name);
        String gPMemo = FeedModule.m61406H().getGPMemo(user.f56859id);
        if (!TextUtils.isEmpty(gPMemo)) {
            this.f44655d.setText(gPMemo);
        }
        if (FeedModule.m61406H().mo31745a().mo192247d() && user.isVIP() && !user.gpHideVip()) {
            this.f44655d.setTextColor(m67941I().color(k9c0.f124516k0));
        } else {
            this.f44655d.setTextColor(m67941I().color(k9c0.f124518l0));
        }
        orb0.m168908y(m67941I(), user, this.f44657f, true, false);
        this.f44672s.setVisibility(8);
        uqb0.f180396b0.f170325b.showUserVerificationLogo(m67941I(), user, this.f44654c);
        if (j4h.m143419c() && qo00Var.f158680a.isLive) {
            bnl0.m105524M(this.f44676w, false);
            bnl0.m105524M(this.f44678y, false);
        } else {
            boolean zEquals = qo00Var.f158680a.owner.equals(FeedModule.m61405F().userId());
            boolean z = user.verifications.anchor.verified;
            bnl0.m105524M(this.f44676w, User.isMatched(user) || (z && !zEquals));
            bnl0.m105524M(this.f44678y, User.isMatched(user) || zEquals || z);
        }
        if (uqb0.f180396b0.f170325b.isCurrentMessageBlock(this.f44643Q0.f56859id)) {
            bnl0.m105524M(this.f44676w, false);
        }
        if (jyb.m147479J(user.profile.extensions.interest.emoji)) {
            return;
        }
        bnl0.m105524M(this.f44656e, true);
        uqb0.f180374G.m127115L0(this.f44656e, uqb0.f180392X.m135325n(user.profile.extensions.interest.emoji.get(0)) + ".png");
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m67956X(Moment moment, View view) {
        m67941I().startActivity(LikesDetailAct.m67823X1(m67941I(), moment.f56859id, moment.owner));
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m67957Y(Moment moment, View view) {
        m67941I().startActivity(MomentDetailAct.m67843X1(m67941I(), moment.f56859id, moment.owner, false, true));
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m67958Z(Moment moment, View view) {
        m67968l0(m67941I(), moment);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m67959a0(Moment moment, qo00 qo00Var, View view) {
        rtg.m183119e(m67941I(), "from_intl_moments", moment, qo00Var.f158682c, false, new rmo());
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m67960b0(final Moment moment, final qo00 qo00Var, ViewGroup viewGroup) {
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: l.es00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f95552a.m67959a0(moment, qo00Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m67961c0(PartialIdList partialIdList, int i, View view) {
        m67941I().startActivityForResult(MomentsInProfileAct.m68095X1(m67941I(), partialIdList.ids.get(i), "from_MomentsFeedAct"), 22);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m67962d0(PartialIdList partialIdList, int i, View view) {
        m67941I().startActivityForResult(MomentsInProfileAct.m68095X1(m67941I(), partialIdList.ids.get(i), "from_MomentsFeedAct"), 22);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m67963e0(int i, User user) {
        uqb0.f180374G.m127125Q0(this.f44639O0.get(i), user.m61308fp().profileSmall());
        uqb0.f180396b0.f170325b.showUserVerificationLogo(m67941I(), user, this.f44641P0.get(i));
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m67964f0(Moment moment, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            this.f44635M0.f44744e.mo68094j(moment);
        } else if (1 == i) {
            this.f44635M0.f44744e.mo68090f(moment);
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
    public void m67965g0(final Act act, FrameLayout frameLayout, final Moment moment) {
        List listM147507f0;
        boolean z;
        float f;
        Picture picture;
        List<Media> list = moment.media;
        Picture picture2 = null;
        if (j4h.m143419c() && moment.isLive) {
            Media media = moment.live.snapshot;
            if (media == null) {
                media = (NullChecker.m82486a(moment.liveRoom) && NullChecker.m82486a(moment.liveRoom.cover)) ? moment.liveRoom.cover.media : null;
            }
            listM147507f0 = jyb.m147507f0(media);
        } else {
            listM147507f0 = moment.media;
        }
        int iM105592y0 = bnl0.m105592y0() - qa00.m175859d(125.0f);
        float f2 = 4.0f;
        int iM175859d = (iM105592y0 - (qa00.m175859d(4.0f) * 2)) / 3;
        int i = 0;
        while (true) {
            z = true;
            if (i >= frameLayout.getChildCount() - 1) {
                break;
            }
            View childAt = frameLayout.getChildAt(i);
            bnl0.m105524M(childAt, false);
            VDraweeView vDraweeView = (VDraweeView) (childAt instanceof VDraweeView ? childAt : childAt.findViewById(hdc0.f108825D));
            uqb0.f180374G.m98798o(vDraweeView);
            vDraweeView.setOnClickListener(null);
            childAt.setOnClickListener(null);
            vDraweeView.setZoomAnimationKey(null);
            i++;
        }
        int size = listM147507f0.size();
        String str = Moments.TYPE;
        if (size == 1) {
            Media media2 = (Media) listM147507f0.get(0);
            if (media2 instanceof Picture) {
                picture2 = (Picture) media2;
            } else if (media2 instanceof Video) {
                picture2 = ((Video) media2).cover;
            }
            if (NullChecker.m82486a(picture2)) {
                Dimension dimension = picture2.size;
                Point pointM116963b = dmk0.m116963b(iM105592y0, new Point(dimension.width, dimension.height));
                boolean z2 = media2 instanceof Video;
                View childAt2 = frameLayout.getChildAt(z2 ? frameLayout.getChildCount() - 2 : 0);
                bnl0.m105525M0(childAt2, true);
                childAt2.setLayoutParams(new FrameLayout.LayoutParams(pointM116963b.x, pointM116963b.y));
                childAt2.setOnClickListener(new View.OnClickListener() { // from class: l.zr00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f205722a.m67944L(moment, act, view);
                    }
                });
                if (!(childAt2 instanceof VDraweeView)) {
                    childAt2 = childAt2.findViewById(hdc0.f108825D);
                }
                VDraweeView vDraweeView2 = (VDraweeView) childAt2;
                if (TEnum.equals(picture2.status, "raw") || TextUtils.isEmpty(picture2.url)) {
                    return;
                }
                if (z2) {
                    str = "";
                }
                uqb0.f180374G.m127127R0(vDraweeView2, picture2.calculatedWidth(pointM116963b.x), str);
                vDraweeView2.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture2.url));
                return;
            }
            return;
        }
        final int i2 = 0;
        while (i2 < listM147507f0.size()) {
            Media media3 = (Media) listM147507f0.get(i2);
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
            bnl0.m105525M0(vDraweeView3, z);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM175859d, iM175859d);
            vDraweeView3.setLayoutParams(layoutParams);
            switch (i2) {
                case 1:
                    f = f2;
                    layoutParams.setMargins(qa00.m175859d(f) + iM175859d, 0, 0, 0);
                    break;
                case 2:
                    f = f2;
                    layoutParams.setMargins(qa00.m175859d(8.0f) + (iM175859d * 2), 0, 0, 0);
                    break;
                case 3:
                    f = f2;
                    layoutParams.setMargins(0, qa00.m175859d(f) + iM175859d, 0, 0);
                    break;
                case 4:
                    f = f2;
                    layoutParams.setMargins(qa00.m175859d(f) + iM175859d, qa00.m175859d(f) + iM175859d, 0, 0);
                    break;
                case 5:
                    f = f2;
                    layoutParams.setMargins(qa00.m175859d(8.0f) + (iM175859d * 2), qa00.m175859d(f) + iM175859d, 0, 0);
                    break;
                case 6:
                    f = f2;
                    layoutParams.setMargins(0, qa00.m175859d(8.0f) + (iM175859d * 2), 0, 0);
                    break;
                case 7:
                    f = f2;
                    layoutParams.setMargins(qa00.m175859d(f) + iM175859d, qa00.m175859d(8.0f) + (iM175859d * 2), 0, 0);
                    break;
                case 8:
                    int i3 = iM175859d * 2;
                    f = f2;
                    layoutParams.setMargins(qa00.m175859d(8.0f) + i3, qa00.m175859d(8.0f) + i3, 0, 0);
                    break;
                default:
                    f = f2;
                    break;
            }
            if (!TEnum.equals(picture.status, "raw") && !TextUtils.isEmpty(picture.url)) {
                uqb0.f180374G.m127127R0(vDraweeView3, picture.momentPictureSmall(), media3 instanceof Video ? "" : Moments.TYPE);
                vDraweeView3.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
            }
            vDraweeView3.setOnClickListener(new View.OnClickListener() { // from class: l.as00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Act act2 = act;
                    act2.startActivityWithCustomTransition(MomentsFeedPreviewAct.m68053Z1(act2, moment.f56859id, i2, true), new jx00());
                }
            });
            i2++;
            f2 = f;
            z = true;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m67966i0(final Moment moment, final ImageView imageView, final boolean z) {
        m67924k0(!moment.haveLiked, imageView, z);
        this.f44635M0.m68074T(moment).subscribe(psd0.m173597H(new y20() { // from class: l.ks00
            @Override // p153l.y20
            public final void call(Object obj) {
                MomentView.m67910F((Envelope) obj);
            }
        }, new y20() { // from class: l.ls00
            @Override // p153l.y20
            public final void call(Object obj) {
                MomentView.m67912a(moment, imageView, z, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a6  */
    /* JADX INFO: renamed from: j0 */
    public void m67967j0(final qo00 qo00Var, final HashMap<String, Boolean> map, HashMap<String, Integer> map2, MomentsFeedRecyclerList momentsFeedRecyclerList) {
        boolean z;
        boolean z2;
        this.f44645R0 = qo00Var;
        this.f44635M0 = momentsFeedRecyclerList;
        jyb.m147537z(jyb.m147507f0(this.f44653b, this.f44655d), new y20() { // from class: l.lr00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133256a.m67954V((View) obj);
            }
        });
        this.f44635M0.m68070P(qo00Var.f158680a.owner, new y20() { // from class: l.nr00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143358a.m67955W(qo00Var, (User) obj);
            }
        });
        final Moment moment = qo00Var.f158680a;
        if (NullChecker.m82486a(this.f44637N0) && this.f44637N0.equals(moment) && NullChecker.m82487b(moment) && TEnum.equals(this.f44637N0.status(), moment.status())) {
            return;
        }
        this.f44637N0 = moment;
        m67969m0();
        boolean zIsTeamAccount = User.isTeamAccount(moment.owner);
        FrameLayout frameLayout = this.f44649U;
        if (zIsTeamAccount) {
            frameLayout.setOnClickListener(null);
            this.f44663k0.setOnClickListener(null);
        } else {
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: l.or00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f148667a.m67956X(moment, view);
                }
            });
            this.f44663k0.setOnClickListener(new View.OnClickListener() { // from class: l.pr00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f153717a.m67957Y(moment, view);
                }
            });
        }
        String string = moment.status().toString();
        string.getClass();
        switch (string) {
            case "failed":
                this.f44627I0.setVisibility(0);
                this.f44629J0.m224272G(this.f44633L0);
                this.f44627I0.setOnClickListener(new View.OnClickListener() { // from class: l.rr00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f164534a.m67958Z(moment, view);
                    }
                });
                break;
            case "normal":
                this.f44627I0.setVisibility(4);
                this.f44627I0.setOnClickListener(null);
                break;
            case "sending":
                this.f44627I0.setVisibility(0);
                this.f44629J0.m224272G(this.f44631K0);
                this.f44627I0.setOnClickListener(new View.OnClickListener() { // from class: l.sr00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MomentView.m67915d(view);
                    }
                });
                break;
        }
        bnl0.m105525M0(this.f44629J0, !TEnum.equals(moment.status(), "normal"));
        this.f44658g.setText(pzi0.m174449N(moment.createdTime));
        String str = moment.value;
        if (moment.isVoiceLive) {
            bnl0.m105524M(this.f44658g, false);
            str = moment.voiceLive.momentText;
        }
        this.f44659h.m80383L(map.get(moment.f56859id) == null ? false : map.get(moment.f56859id).booleanValue()).m80388Q(new VExpandableTextContainer.InterfaceC13253e() { // from class: l.tr00
            @Override // com.p051p1.mobile.putong.newui.view.VExpandableTextContainer.InterfaceC13253e
            /* JADX INFO: renamed from: a */
            public final void mo80399a(boolean z3) {
                map.put(moment.f56859id, Boolean.valueOf(z3));
            }
        }).m80384M(str);
        if (!NullChecker.m82486a(moment.location) || TextUtils.isEmpty(moment.location.name)) {
            this.f44673t.setVisibility(8);
        } else {
            this.f44673t.setVisibility(0);
            this.f44673t.setText(moment.location.name);
        }
        if (j4h.m143419c() && moment.isLive) {
            Cloneable cloneable = moment.live.snapshot;
            if (cloneable == null) {
                cloneable = (NullChecker.m82486a(moment.liveRoom) && NullChecker.m82486a(moment.liveRoom.cover)) ? moment.liveRoom.cover.media : null;
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
        bnl0.m105524M(this.f44661j, z);
        bnl0.m105524M(this.f44660i, z);
        bnl0.m105524M(this.f44675v, z2);
        if (z) {
            m67965g0(m67941I(), this.f44661j, moment);
        }
        bnl0.m105524M(this.f44671r, false);
        if (moment.isVoiceLive) {
            bnl0.m105524M(this.f44671r, true);
            this.f44671r.m65996n(moment);
            jyb.m147537z(jyb.m147507f0(this.f44671r, this.f44659h), new y20() { // from class: l.ur00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f180553a.m67960b0(moment, qo00Var, (ViewGroup) obj);
                }
            });
            i4g0.m138523u("e_live_audio_room_enter", "p_follow", new pf60("anchorId", moment.voiceLive.anchor.f39651id), new pf60("liveId", moment.voiceLive.f40098id), new pf60("topic_id", moment.voiceLive.voiceRoomInfo.topics.get(0).f39687id), new pf60(FirebaseAnalytics.Param.INDEX, Integer.valueOf(qo00Var.f158682c)), new pf60("audio_room_type", moment.voiceLive.voiceRoomInfo.maskMode ? "mask_audio" : "normal_audio"));
        }
        if (TEnum.equals(moment.dynamicType, "liked") || TEnum.equals(moment.dynamicType, "superLike")) {
            ViewGroup.LayoutParams layoutParams = this.f44661j.getChildAt(0).getLayoutParams();
            if (layoutParams.width == -1) {
                FrameLayout frameLayout2 = this.f44661j;
                layoutParams = frameLayout2.getChildAt(frameLayout2.getChildCount() - 2).getLayoutParams();
            }
            ViewGroup.LayoutParams layoutParams2 = this.f44665m.getLayoutParams();
            layoutParams2.width = layoutParams.width;
            layoutParams2.height = (int) (((double) layoutParams.width) / 2.4d);
            this.f44665m.setLayoutParams(layoutParams2);
            uqb0.f180374G.m127109I0(this.f44665m, TEnum.equals(moment.dynamicType, "liked") ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkFKNlJFSlRKUlNKQTdDTkFRV0RaS0dSVlZDWENVQzE0IiwidyI6NzA1LCJoIjoyOTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NzkwNzI0MjM1NTEzMDgwMzJ9.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IktFRVc3TEFQTUtEWkJPQVIyUDM1NUxOM01LQVlMWTE0IiwidyI6NzA1LCJoIjoyOTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNzI1NzUyODY4NTcyNzY0OTMwfQ.webp", layoutParams2.width, layoutParams2.height);
            bnl0.m105524M(this.f44665m, true);
            bnl0.m105524M(this.f44676w, false);
            bnl0.m105524M(this.f44678y, false);
            bnl0.m105524M(this.f44614A, true);
            this.f44659h.m80384M(TEnum.equals(moment.dynamicType, "liked") ? q8g0.m175818w(m67941I(), moment.f56859id) : q8g0.m175819x(m67941I(), moment.f56859id));
        } else {
            boolean zEquals = moment.owner.equals(FeedModule.m61405F().userId());
            User user = this.f44643Q0;
            boolean z3 = user != null && user.verifications.anchor.verified;
            bnl0.m105524M(this.f44676w, User.isMatched(user) || (z3 && !zEquals));
            bnl0.m105524M(this.f44678y, User.isMatched(this.f44643Q0) || z3 || zEquals);
            if (NullChecker.m82486a(this.f44643Q0) && uqb0.f180396b0.f170325b.isCurrentMessageBlock(this.f44643Q0.f56859id)) {
                bnl0.m105524M(this.f44676w, false);
            }
            bnl0.m105524M(this.f44665m, false);
            bnl0.m105524M(this.f44614A, false);
        }
        if (j4h.m143419c() && moment.isLive) {
            bnl0.m105524M(this.f44666n, true);
            bnl0.m105524M(this.f44616C, true);
            bnl0.m105524M(this.f44676w, false);
            bnl0.m105524M(this.f44678y, false);
            bnl0.m105524M(this.f44658g, false);
            bnl0.m105509E0(this.f44616C, this.f44647S0);
            bnl0.m105509E0(this.f44659h, this.f44647S0);
        } else {
            bnl0.m105524M(this.f44666n, false);
            bnl0.m105524M(this.f44616C, false);
            boolean zEquals2 = moment.owner.equals(FeedModule.m61405F().userId());
            User user2 = this.f44643Q0;
            boolean z4 = user2 != null && user2.verifications.anchor.verified;
            bnl0.m105524M(this.f44676w, User.isMatched(user2) || (z4 && !zEquals2));
            bnl0.m105524M(this.f44678y, User.isMatched(this.f44643Q0) || z4 || zEquals2);
            if (NullChecker.m82486a(this.f44643Q0) && uqb0.f180396b0.f170325b.isCurrentMessageBlock(this.f44643Q0.f56859id)) {
                bnl0.m105524M(this.f44676w, false);
            }
            this.f44659h.setOnClickListener(null);
        }
        this.f44679z.setImageResource(moment.haveLiked ? lbc0.f131017d2 : lbc0.f131109o6);
        PartialIdList partialIdList = moment.likes;
        int iMax = Math.max(partialIdList.count, partialIdList.ids.size());
        this.f44650V.setText(q8g0.m175802h0(iMax));
        bnl0.m105524M(this.f44620F, iMax != 0);
        FrameLayout frameLayout3 = this.f44649U;
        int i = f44613T0;
        bnl0.m105524M(frameLayout3, iMax > i);
        while (i < this.f44639O0.size()) {
            this.f44639O0.get(i).setVisibility(8);
            this.f44641P0.get(i).setVisibility(8);
            i++;
        }
        if (NullChecker.m82486a(map2.get(moment.f56859id)) && map2.get(moment.f56859id).intValue() == 0 && iMax != 0) {
            this.f44622G.setVisibility(0);
        } else if (NullChecker.m82486a(map2.get(moment.f56859id)) && map2.get(moment.f56859id).intValue() != 0 && iMax == 0) {
            this.f44622G.setVisibility(8);
        } else {
            FrameLayout frameLayout4 = this.f44622G;
            if (iMax != 0) {
                frameLayout4.setVisibility(0);
                this.f44622G.getLayoutParams().height = qa00.m175859d(48.0f);
                this.f44622G.requestLayout();
            } else {
                frameLayout4.setVisibility(8);
            }
        }
        map2.put(moment.f56859id, Integer.valueOf(iMax));
        boolean zIsTeamAccount2 = User.isTeamAccount(moment.owner);
        FrameLayout frameLayout5 = this.f44663k0;
        if (zIsTeamAccount2) {
            bnl0.m105524M(frameLayout5, false);
        } else {
            bnl0.m105524M(frameLayout5, qo00Var.f158686g > 100);
        }
        bnl0.m105524M(this.f44651W, qo00Var.f158685f != 0);
        this.f44669p0.setText(m67941I().getString(R$string.f39803P3, Integer.valueOf(qo00Var.f158686g)));
        for (final int i2 = 0; i2 < f44613T0; i2++) {
            final PartialIdList partialIdList2 = moment.likes;
            int size = partialIdList2.ids.size();
            ArrayList<VDraweeView> arrayList = this.f44639O0;
            if (size <= i2) {
                arrayList.get(i2).setOnClickListener(null);
                this.f44641P0.get(i2).setOnClickListener(null);
                bnl0.m105525M0(this.f44639O0.get(i2), false);
                bnl0.m105525M0(this.f44641P0.get(i2), false);
            } else {
                bnl0.m105525M0(arrayList.get(i2), true);
                boolean zIsTeamAccount3 = User.isTeamAccount(moment.owner);
                ArrayList<VDraweeView> arrayList2 = this.f44639O0;
                if (zIsTeamAccount3) {
                    arrayList2.get(i2).setOnClickListener(null);
                    this.f44641P0.get(i2).setOnClickListener(null);
                } else {
                    arrayList2.get(i2).setOnClickListener(new View.OnClickListener() { // from class: l.vr00
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f185419a.m67961c0(partialIdList2, i2, view);
                        }
                    });
                    this.f44641P0.get(i2).setOnClickListener(new View.OnClickListener() { // from class: l.wr00
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f190458a.m67962d0(partialIdList2, i2, view);
                        }
                    });
                }
                this.f44635M0.m68070P(partialIdList2.ids.get(i2), new y20() { // from class: l.mr00
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f138286a.m67963e0(i2, (User) obj);
                    }
                });
            }
        }
        this.f44674u.setVisibility(8);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m67968l0(Act act, final Moment moment) {
        act.dialog().m21535f0(new String[]{act.getString(R$string.f39956n), act.getString(R$string.f39900f)}).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.xr00
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f195871a.m67964f0(moment, dialog, view, i, charSequence);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m67969m0() {
        bnl0.m105524M(this.f44658g, true);
    }

    /* JADX INFO: renamed from: n0 */
    public void m67970n0(boolean z) {
        bnl0.m105524M(this.f44621F0, z);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m67971o0() {
        if (NullChecker.m82486a(this.f44670q)) {
            this.f44670q.loadAnimWithListener("feed_live_room_icon.svga", -1, new C11567a(), true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (j4h.m143419c() && NullChecker.m82486a(this.f44645R0) && this.f44645R0.f158680a.isLive) {
            m67971o0();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67940H(this);
        this.f44676w.setOnClickListener(new View.OnClickListener() { // from class: l.qr00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159060a.m67946N(view);
            }
        });
        this.f44678y.setOnClickListener(new View.OnClickListener() { // from class: l.bs00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78080a.m67947O(view);
            }
        });
        this.f44614A.setOnClickListener(new View.OnClickListener() { // from class: l.fs00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100511a.m67948P(view);
            }
        });
        this.f44618E.setOnClickListener(new View.OnClickListener() { // from class: l.gs00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106217a.m67951S(view);
            }
        });
        this.f44639O0 = jyb.m147507f0(this.f44626I, this.f44630K, this.f44634M, this.f44638O, this.f44642Q, this.f44646S);
        this.f44641P0 = jyb.m147507f0(this.f44628J, this.f44632L, this.f44636N, this.f44640P, this.f44644R, this.f44648T);
        this.f44659h.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.hs00
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f111399a.m67952T(view);
            }
        });
    }

    public MomentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44637N0 = null;
        this.f44647S0 = new View.OnClickListener() { // from class: l.fr00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100360a.m67945M(view);
            }
        };
    }

    public MomentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44637N0 = null;
        this.f44647S0 = new View.OnClickListener() { // from class: l.fr00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100360a.m67945M(view);
            }
        };
    }
}
