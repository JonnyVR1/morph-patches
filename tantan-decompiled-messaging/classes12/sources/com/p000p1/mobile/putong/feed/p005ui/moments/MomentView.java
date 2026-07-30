package com.p000p1.mobile.putong.feed.p005ui.moments;

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
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Followship;
import com.p000p1.mobile.putong.data.FollowshipStatus;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.data.Moments;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.PartialIdList;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.livevoiceroom.FeedLiveVoiceRoomView;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentView;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsFeedPreviewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.bt0;
import l.d30;
import l.e30;
import l.i0e;
import l.i0g0;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.qib0;
import l.t100;
import l.vwb;
import l.xck0;
import l.xdl0;
import l.zvf0;
import p007l.ap00;
import p007l.b5c0;
import p007l.csg;
import p007l.e1c0;
import p007l.f3c0;
import p007l.hg00;
import p007l.kjb0;
import p007l.rko;
import p007l.t2h;
import p007l.u2h;
import p007l.v1h;
import p007l.wk00;
import p007l.xia;
import v.VDraweeView;
import v.VFrame_Anim;
import v.VImage;
import v.VProgressBar;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentView extends FrameLayout {

    /* JADX INFO: renamed from: T0 */
    public static final int f5226T0;

    /* JADX INFO: renamed from: A */
    public FrameLayout f5227A;

    /* JADX INFO: renamed from: B */
    public VText f5228B;

    /* JADX INFO: renamed from: C */
    public VText f5229C;

    /* JADX INFO: renamed from: D */
    public FrameLayout f5230D;

    /* JADX INFO: renamed from: E */
    public ImageView f5231E;

    /* JADX INFO: renamed from: E0 */
    public LinearLayout f5232E0;

    /* JADX INFO: renamed from: F */
    public View f5233F;

    /* JADX INFO: renamed from: F0 */
    public LinearLayout f5234F0;

    /* JADX INFO: renamed from: G */
    public FrameLayout f5235G;

    /* JADX INFO: renamed from: G0 */
    public View f5236G0;

    /* JADX INFO: renamed from: H */
    public ImageView f5237H;

    /* JADX INFO: renamed from: H0 */
    public View f5238H0;

    /* JADX INFO: renamed from: I */
    public VDraweeView f5239I;

    /* JADX INFO: renamed from: I0 */
    public VFrame_Anim f5240I0;

    /* JADX INFO: renamed from: J */
    public VImage f5241J;

    /* JADX INFO: renamed from: J0 */
    public VFrame_Anim f5242J0;

    /* JADX INFO: renamed from: K */
    public VDraweeView f5243K;

    /* JADX INFO: renamed from: K0 */
    public VProgressBar f5244K0;

    /* JADX INFO: renamed from: L */
    public VImage f5245L;

    /* JADX INFO: renamed from: L0 */
    public ImageView f5246L0;

    /* JADX INFO: renamed from: M */
    public VDraweeView f5247M;

    /* JADX INFO: renamed from: M0 */
    public MomentsFeedRecyclerList f5248M0;

    /* JADX INFO: renamed from: N */
    public VImage f5249N;

    /* JADX INFO: renamed from: N0 */
    public Moment f5250N0;

    /* JADX INFO: renamed from: O */
    public VDraweeView f5251O;

    /* JADX INFO: renamed from: O0 */
    public ArrayList<VDraweeView> f5252O0;

    /* JADX INFO: renamed from: P */
    public VImage f5253P;

    /* JADX INFO: renamed from: P0 */
    public ArrayList<VImage> f5254P0;

    /* JADX INFO: renamed from: Q */
    public VDraweeView f5255Q;

    /* JADX INFO: renamed from: Q0 */
    public User f5256Q0;

    /* JADX INFO: renamed from: R */
    public VImage f5257R;

    /* JADX INFO: renamed from: R0 */
    public hg00 f5258R0;

    /* JADX INFO: renamed from: S */
    public VDraweeView f5259S;

    /* JADX INFO: renamed from: S0 */
    public View.OnClickListener f5260S0;

    /* JADX INFO: renamed from: T */
    public VImage f5261T;

    /* JADX INFO: renamed from: U */
    public FrameLayout f5262U;

    /* JADX INFO: renamed from: V */
    public VText f5263V;

    /* JADX INFO: renamed from: W */
    public View f5264W;

    /* JADX INFO: renamed from: a */
    public LinearLayout f5265a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f5266b;

    /* JADX INFO: renamed from: c */
    public VImage f5267c;

    /* JADX INFO: renamed from: d */
    public VText f5268d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f5269e;

    /* JADX INFO: renamed from: f */
    public VImage f5270f;

    /* JADX INFO: renamed from: g */
    public VText f5271g;

    /* JADX INFO: renamed from: h */
    public VExpandableTextContainer f5272h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f5273i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f5274j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f5275k;

    /* JADX INFO: renamed from: k0 */
    public FrameLayout f5276k0;

    /* JADX INFO: renamed from: l */
    public VImage f5277l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f5278m;

    /* JADX INFO: renamed from: n */
    public ConstraintLayout f5279n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f5280o;

    /* JADX INFO: renamed from: p */
    public VText f5281p;

    /* JADX INFO: renamed from: p0 */
    public VText f5282p0;

    /* JADX INFO: renamed from: q */
    public AnimEffectPlayer f5283q;

    /* JADX INFO: renamed from: r */
    public FeedLiveVoiceRoomView f5284r;

    /* JADX INFO: renamed from: s */
    public VText f5285s;

    /* JADX INFO: renamed from: t */
    public VText f5286t;

    /* JADX INFO: renamed from: u */
    public VText f5287u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f5288v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f5289w;

    /* JADX INFO: renamed from: x */
    public VText f5290x;

    /* JADX INFO: renamed from: y */
    public FrameLayout f5291y;

    /* JADX INFO: renamed from: z */
    public ImageView f5292z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.MomentView$a */
    public class C2248a extends AnimListener {
        public C2248a() {
        }

        public void onFinished() {
            super.onFinished();
        }
    }

    static {
        f5226T0 = t100.c().density * 160.0f < 360.0f ? 5 : 6;
    }

    public MomentView(Context context) {
        super(context);
        this.f5250N0 = null;
        this.f5260S0 = new View.OnClickListener() { // from class: l.wi00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14548a.m7953M(view);
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m7913A(Moment moment, ImageView imageView, boolean z, Throwable th) {
        t2h.m14427g(th);
        m7932k0(moment.haveLiked, imageView, z);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m7918F(Envelope envelope) {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m7920a(Moment moment, ImageView imageView, boolean z, Throwable th) {
        t2h.m14427g(th);
        m7932k0(moment.haveLiked, imageView, z);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m7922c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m7923d(View view) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m7924e(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static void m7928h0(final Moment moment, final ImageView imageView, final boolean z) {
        m7932k0(!moment.haveLiked, imageView, z);
        FeedModule.f315c.m1623R3(moment.owner, ((DbObject) moment).id, !moment.haveLiked).subscribe(mkd0.H(new e30() { // from class: l.xi00
            public final void call(Object obj) {
                MomentView.m7942u((Envelope) obj);
            }
        }, new e30() { // from class: l.yi00
            public final void call(Object obj) {
                MomentView.m7913A(moment, imageView, z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public static void m7932k0(boolean z, ImageView imageView, boolean z2) {
        if (z) {
            imageView.setImageResource(f3c0.f7782d2);
            bt0.b(imageView, bt0.l(imageView, bt0.i, 0L, 500L, new AnticipateOvershootInterpolator(2.0f), new float[]{1.35f, 1.0f}));
        } else {
            imageView.setImageResource(z2 ? f3c0.f7874o6 : f3c0.f7890q6);
            bt0.b(imageView, bt0.l(imageView, bt0.i, 0L, 500L, new AnticipateOvershootInterpolator(2.0f), new float[]{1.35f, 1.0f}));
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m7942u(Envelope envelope) {
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m7945x(Followship followship) {
    }

    /* JADX INFO: renamed from: H */
    public final void m7948H(View view) {
        wk00.m15816a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public PutongAct m7949I() {
        return getContext();
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void m7958R(FollowshipStatus followshipStatus) {
        boolean zA = NullChecker.a(followshipStatus);
        final String str = OMSDialogPositon.p_nearby;
        if (zA && (TEnum.equals(followshipStatus, FollowshipStatus.following) || TEnum.equals(followshipStatus, "matched"))) {
            v1h.m15267v0(m7949I(), getResources().getString(R$string.f644z), new d30() { // from class: l.zi00
                public final void call() {
                    this.f15751a.m7951K(str);
                }
            });
            return;
        }
        User user = this.f5256Q0;
        if (user.profile.moments.hidePublicMoments && !User.isMatched(user)) {
            lsi0.w(R$string.f590q);
            return;
        }
        xia xiaVar = FeedModule.f316d;
        String strUserId = FeedModule.m1139F().userId();
        User user2 = this.f5256Q0;
        Moment moment = this.f5250N0;
        boolean z = moment.isLive;
        xiaVar.m16690n7(strUserId, user2, true, z ? "liveMomentNearby" : "", z ? moment.live.f228id : "", OMSDialogPositon.p_nearby).subscribe(mkd0.H(new e30() { // from class: l.aj00
            public final void call(Object obj) {
                lsi0.w(R$string.f489b3);
            }
        }, new e30() { // from class: l.bj00
            public final void call(Object obj) {
                MomentView.m7924e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m7951K(String str) {
        FeedModule.f316d.m16683m7(FeedModule.m1139F().userId(), this.f5256Q0, false, str).subscribe(mkd0.H(new e30() { // from class: l.tj00
            public final void call(Object obj) {
                MomentView.m7945x((Followship) obj);
            }
        }, new e30() { // from class: l.uj00
            public final void call(Object obj) {
                MomentView.m7922c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m7952L(Moment moment, Act act, View view) {
        if (u2h.m14718c() && moment.isLive) {
            csg.m9238c(m7949I(), "", moment);
        } else {
            act.startActivityWithCustomTransition(MomentsFeedPreviewAct.m8064Y1(act, ((DbObject) moment).id, 0, true), new ap00());
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m7953M(View view) {
        csg.m9238c(m7949I(), "", this.f5250N0);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m7954N(View view) {
        if (NullChecker.a(this.f5248M0)) {
            if (qib0.b0.b.shouldLockComment(this.f5250N0.owner)) {
                qib0.b0.b.showProofAgeDlg(m7949I(), "moment_square");
            } else {
                this.f5248M0.m8079N(this.f5250N0);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m7955O(View view) {
        if (NullChecker.a(this.f5248M0)) {
            m7974i0(this.f5250N0, this.f5292z, true);
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m7956P(View view) {
        if (NullChecker.a(this.f5248M0)) {
            m7949I().startActivity(kjb0.m11453e(m7949I(), this.f5250N0.owner, false, false, false, false, null, -1));
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m7957Q(Boolean bool) {
        this.f5248M0.f5364l.m8033U4(bool.booleanValue());
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m7959S(View view) {
        PutongAct putongActM7949I = m7949I();
        Moment moment = this.f5250N0;
        v1h.m15271x0(putongActM7949I, moment.owner, moment, null, new e30() { // from class: l.zj00
            public final void call(Object obj) {
                this.f15788a.m7957Q((Boolean) obj);
            }
        }, new e30() { // from class: l.ak00
            public final void call(Object obj) {
                this.f5763a.m7958R((FollowshipStatus) obj);
            }
        }, false, false, true);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ boolean m7960T(View view) {
        i0e.b(m7949I(), this.f5250N0.value);
        return true;
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m7961U(View view) {
        m7949I().startActivityForResult(MomentsInProfileAct.m8110V1(m7949I(), this.f5250N0.owner, "from_MomentsFeedAct"), 22);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m7962V(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.pj00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f11850a.m7961U(view2);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m7963W(hg00 hg00Var, User user) {
        String str = ((DbObject) user).id;
        this.f5256Q0 = user;
        qib0.G.Q0(this.f5266b, user.m1042fp().profileSmall());
        this.f5268d.setText(user.name);
        String gPMemo = FeedModule.m1140H().getGPMemo(((DbObject) user).id);
        if (!TextUtils.isEmpty(gPMemo)) {
            this.f5268d.setText(gPMemo);
        }
        if (FeedModule.m1140H().a().d() && user.isVIP() && !user.gpHideVip()) {
            this.f5268d.setTextColor(m7949I().color(e1c0.f7149k0));
        } else {
            this.f5268d.setTextColor(m7949I().color(e1c0.f7151l0));
        }
        kjb0.m11473y(m7949I(), user, this.f5270f, true, false);
        this.f5285s.setVisibility(8);
        qib0.b0.b.showUserVerificationLogo(m7949I(), user, this.f5267c);
        if (u2h.m14718c() && hg00Var.f8699a.isLive) {
            xdl0.M(this.f5289w, false);
            xdl0.M(this.f5291y, false);
        } else {
            boolean zEquals = hg00Var.f8699a.owner.equals(FeedModule.m1139F().userId());
            boolean z = user.verifications.anchor.verified;
            xdl0.M(this.f5289w, User.isMatched(user) || (z && !zEquals));
            xdl0.M(this.f5291y, User.isMatched(user) || zEquals || z);
        }
        if (qib0.b0.b.isCurrentMessageBlock(((DbObject) this.f5256Q0).id)) {
            xdl0.M(this.f5289w, false);
        }
        if (vwb.J(user.profile.extensions.interest.emoji)) {
            return;
        }
        xdl0.M(this.f5269e, true);
        qib0.G.L0(this.f5269e, qib0.X.n(user.profile.extensions.interest.emoji.get(0)) + ".png");
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m7964X(Moment moment, View view) {
        m7949I().startActivity(LikesDetailAct.m7831V1(m7949I(), ((DbObject) moment).id, moment.owner));
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m7965Y(Moment moment, View view) {
        m7949I().startActivity(MomentDetailAct.m7851V1(m7949I(), ((DbObject) moment).id, moment.owner, false, true));
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m7966Z(Moment moment, View view) {
        m7976l0(m7949I(), moment);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m7967a0(Moment moment, hg00 hg00Var, View view) {
        csg.m9240e(m7949I(), "from_intl_moments", moment, hg00Var.f8701c, false, new rko());
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m7968b0(final Moment moment, final hg00 hg00Var, ViewGroup viewGroup) {
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: l.vj00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14177a.m7967a0(moment, hg00Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m7969c0(PartialIdList partialIdList, int i, View view) {
        m7949I().startActivityForResult(MomentsInProfileAct.m8110V1(m7949I(), partialIdList.ids.get(i), "from_MomentsFeedAct"), 22);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m7970d0(PartialIdList partialIdList, int i, View view) {
        m7949I().startActivityForResult(MomentsInProfileAct.m8110V1(m7949I(), partialIdList.ids.get(i), "from_MomentsFeedAct"), 22);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m7971e0(int i, User user) {
        qib0.G.Q0(this.f5252O0.get(i), user.m1042fp().profileSmall());
        qib0.b0.b.showUserVerificationLogo(m7949I(), user, this.f5254P0.get(i));
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m7972f0(Moment moment, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            this.f5248M0.f5357e.mo8109j(moment);
        } else if (1 == i) {
            this.f5248M0.f5357e.mo8105f(moment);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m7973g0(final Act act, FrameLayout frameLayout, final Moment moment) {
        List listF0;
        boolean z;
        float f;
        Picture picture;
        List<Media> list = moment.media;
        Picture picture2 = null;
        if (u2h.m14718c() && moment.isLive) {
            Media media = moment.live.snapshot;
            if (media == null) {
                media = (NullChecker.a(moment.liveRoom) && NullChecker.a(moment.liveRoom.cover)) ? moment.liveRoom.cover.media : null;
            }
            listF0 = vwb.f0(new Media[]{media});
        } else {
            listF0 = moment.media;
        }
        int iY0 = xdl0.y0() - t100.d(125.0f);
        float f2 = 4.0f;
        int iD = (iY0 - (t100.d(4.0f) * 2)) / 3;
        int i = 0;
        while (true) {
            z = true;
            if (i >= frameLayout.getChildCount() - 1) {
                break;
            }
            View childAt = frameLayout.getChildAt(i);
            xdl0.M(childAt, false);
            VDraweeView vDraweeView = (VDraweeView) (childAt instanceof VDraweeView ? childAt : childAt.findViewById(b5c0.f5953D));
            qib0.G.o(vDraweeView);
            vDraweeView.setOnClickListener(null);
            childAt.setOnClickListener(null);
            vDraweeView.setZoomAnimationKey((String) null);
            i++;
        }
        int size = listF0.size();
        String str = Moments.TYPE;
        if (size == 1) {
            Media media2 = (Media) listF0.get(0);
            if (media2 instanceof Picture) {
                picture2 = (Picture) media2;
            } else if (media2 instanceof Video) {
                picture2 = ((Video) media2).cover;
            }
            if (NullChecker.a(picture2)) {
                Dimension dimension = picture2.size;
                Point pointB = xck0.b(iY0, new Point(dimension.width, dimension.height));
                boolean z2 = media2 instanceof Video;
                View childAt2 = frameLayout.getChildAt(z2 ? frameLayout.getChildCount() - 2 : 0);
                xdl0.M0(childAt2, true);
                childAt2.setLayoutParams(new FrameLayout.LayoutParams(pointB.x, pointB.y));
                childAt2.setOnClickListener(new View.OnClickListener() { // from class: l.qj00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f12254a.m7952L(moment, act, view);
                    }
                });
                if (!(childAt2 instanceof VDraweeView)) {
                    childAt2 = childAt2.findViewById(b5c0.f5953D);
                }
                VDraweeView vDraweeView2 = (VDraweeView) childAt2;
                if (TEnum.equals(picture2.status, MediaLocalStatus.raw) || TextUtils.isEmpty(picture2.url)) {
                    return;
                }
                if (z2) {
                    str = "";
                }
                qib0.G.R0(vDraweeView2, picture2.calculatedWidth(pointB.x), str);
                vDraweeView2.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture2.url));
                return;
            }
            return;
        }
        final int i2 = 0;
        while (i2 < listF0.size()) {
            Media media3 = (Media) listF0.get(i2);
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
            VDraweeView childAt3 = frameLayout.getChildAt(i2);
            xdl0.M0(childAt3, z);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iD, iD);
            childAt3.setLayoutParams(layoutParams);
            switch (i2) {
                case 1:
                    f = f2;
                    layoutParams.setMargins(t100.d(f) + iD, 0, 0, 0);
                    break;
                case 2:
                    f = f2;
                    layoutParams.setMargins(t100.d(8.0f) + (iD * 2), 0, 0, 0);
                    break;
                case 3:
                    f = f2;
                    layoutParams.setMargins(0, t100.d(f) + iD, 0, 0);
                    break;
                case 4:
                    f = f2;
                    layoutParams.setMargins(t100.d(f) + iD, t100.d(f) + iD, 0, 0);
                    break;
                case 5:
                    f = f2;
                    layoutParams.setMargins(t100.d(8.0f) + (iD * 2), t100.d(f) + iD, 0, 0);
                    break;
                case 6:
                    f = f2;
                    layoutParams.setMargins(0, t100.d(8.0f) + (iD * 2), 0, 0);
                    break;
                case 7:
                    f = f2;
                    layoutParams.setMargins(t100.d(f) + iD, t100.d(8.0f) + (iD * 2), 0, 0);
                    break;
                case 8:
                    int i3 = iD * 2;
                    f = f2;
                    layoutParams.setMargins(t100.d(8.0f) + i3, t100.d(8.0f) + i3, 0, 0);
                    break;
                default:
                    f = f2;
                    break;
            }
            if (!TEnum.equals(picture.status, MediaLocalStatus.raw) && !TextUtils.isEmpty(picture.url)) {
                qib0.G.R0(childAt3, picture.momentPictureSmall(), media3 instanceof Video ? "" : Moments.TYPE);
                childAt3.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
            }
            childAt3.setOnClickListener(new View.OnClickListener() { // from class: l.rj00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Act act2 = act;
                    act2.startActivityWithCustomTransition(MomentsFeedPreviewAct.m8064Y1(act2, ((DbObject) moment).id, i2, true), new ap00());
                }
            });
            i2++;
            f2 = f;
            z = true;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m7974i0(final Moment moment, final ImageView imageView, final boolean z) {
        m7932k0(!moment.haveLiked, imageView, z);
        this.f5248M0.m8085T(moment).subscribe(mkd0.H(new e30() { // from class: l.bk00
            public final void call(Object obj) {
                MomentView.m7918F((Envelope) obj);
            }
        }, new e30() { // from class: l.ck00
            public final void call(Object obj) {
                MomentView.m7920a(moment, imageView, z, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a6  */
    /* JADX INFO: renamed from: j0 */
    public void m7975j0(final hg00 hg00Var, final HashMap<String, Boolean> map, HashMap<String, Integer> map2, MomentsFeedRecyclerList momentsFeedRecyclerList) {
        boolean z;
        boolean z2;
        this.f5258R0 = hg00Var;
        this.f5248M0 = momentsFeedRecyclerList;
        vwb.z(vwb.f0(new View[]{this.f5266b, this.f5268d}), new e30() { // from class: l.cj00
            public final void call(Object obj) {
                this.f6659a.m7962V((View) obj);
            }
        });
        this.f5248M0.m8081P(hg00Var.f8699a.owner, new e30() { // from class: l.ej00
            public final void call(Object obj) {
                this.f7401a.m7963W(hg00Var, (User) obj);
            }
        });
        final Moment moment = hg00Var.f8699a;
        if (NullChecker.a(this.f5250N0) && this.f5250N0.equals(moment) && NullChecker.b(moment) && TEnum.equals(this.f5250N0.status(), moment.status())) {
            return;
        }
        this.f5250N0 = moment;
        m7977m0();
        boolean zIsTeamAccount = User.isTeamAccount(moment.owner);
        FrameLayout frameLayout = this.f5262U;
        if (zIsTeamAccount) {
            frameLayout.setOnClickListener(null);
            this.f5276k0.setOnClickListener(null);
        } else {
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: l.fj00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8111a.m7964X(moment, view);
                }
            });
            this.f5276k0.setOnClickListener(new View.OnClickListener() { // from class: l.gj00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8464a.m7965Y(moment, view);
                }
            });
        }
        String string = moment.status().toString();
        string.getClass();
        switch (string) {
            case "failed":
                this.f5240I0.setVisibility(0);
                this.f5242J0.G(this.f5246L0);
                this.f5240I0.setOnClickListener(new View.OnClickListener() { // from class: l.ij00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f9039a.m7966Z(moment, view);
                    }
                });
                break;
            case "normal":
                this.f5240I0.setVisibility(4);
                this.f5240I0.setOnClickListener((View.OnClickListener) null);
                break;
            case "sending":
                this.f5240I0.setVisibility(0);
                this.f5242J0.G(this.f5244K0);
                this.f5240I0.setOnClickListener(new View.OnClickListener() { // from class: l.jj00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MomentView.m7923d(view);
                    }
                });
                break;
        }
        xdl0.M0(this.f5242J0, !TEnum.equals(moment.status(), "normal"));
        this.f5271g.setText(mqi0.N(moment.createdTime));
        String str = moment.value;
        if (moment.isVoiceLive) {
            xdl0.M(this.f5271g, false);
            str = moment.voiceLive.momentText;
        }
        this.f5272h.L(map.get(((DbObject) moment).id) == null ? false : map.get(((DbObject) moment).id).booleanValue()).Q(new VExpandableTextContainer.e() { // from class: l.kj00
            /* JADX INFO: renamed from: a */
            public final void m11436a(boolean z3) {
                map.put(((DbObject) moment).id, Boolean.valueOf(z3));
            }
        }).M(str);
        if (!NullChecker.a(moment.location) || TextUtils.isEmpty(moment.location.name)) {
            this.f5286t.setVisibility(8);
        } else {
            this.f5286t.setVisibility(0);
            this.f5286t.setText(moment.location.name);
        }
        if (u2h.m14718c() && moment.isLive) {
            Cloneable cloneable = moment.live.snapshot;
            if (cloneable == null) {
                cloneable = (NullChecker.a(moment.liveRoom) && NullChecker.a(moment.liveRoom.cover)) ? moment.liveRoom.cover.media : null;
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
        xdl0.M(this.f5274j, z);
        xdl0.M(this.f5273i, z);
        xdl0.M(this.f5288v, z2);
        if (z) {
            m7973g0(m7949I(), this.f5274j, moment);
        }
        xdl0.M(this.f5284r, false);
        if (moment.isVoiceLive) {
            xdl0.M(this.f5284r, true);
            this.f5284r.m5910n(moment);
            vwb.z(vwb.f0(new ViewGroup[]{this.f5284r, this.f5272h}), new e30() { // from class: l.lj00
                public final void call(Object obj) {
                    this.f10051a.m7968b0(moment, hg00Var, (ViewGroup) obj);
                }
            });
            zvf0.u("e_live_audio_room_enter", "p_follow", new j760[]{new j760("anchorId", moment.voiceLive.anchor.f264id), new j760("liveId", moment.voiceLive.f711id), new j760("topic_id", moment.voiceLive.voiceRoomInfo.topics.get(0).f300id), new j760("index", Integer.valueOf(hg00Var.f8701c)), new j760("audio_room_type", moment.voiceLive.voiceRoomInfo.maskMode ? "mask_audio" : "normal_audio")});
        }
        if (TEnum.equals(moment.dynamicType, "liked") || TEnum.equals(moment.dynamicType, "superLike")) {
            ViewGroup.LayoutParams layoutParams = this.f5274j.getChildAt(0).getLayoutParams();
            if (layoutParams.width == -1) {
                FrameLayout frameLayout2 = this.f5274j;
                layoutParams = frameLayout2.getChildAt(frameLayout2.getChildCount() - 2).getLayoutParams();
            }
            ViewGroup.LayoutParams layoutParams2 = this.f5278m.getLayoutParams();
            layoutParams2.width = layoutParams.width;
            layoutParams2.height = (int) (((double) layoutParams.width) / 2.4d);
            this.f5278m.setLayoutParams(layoutParams2);
            qib0.G.I0(this.f5278m, TEnum.equals(moment.dynamicType, "liked") ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkFKNlJFSlRKUlNKQTdDTkFRV0RaS0dSVlZDWENVQzE0IiwidyI6NzA1LCJoIjoyOTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NzkwNzI0MjM1NTEzMDgwMzJ9.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IktFRVc3TEFQTUtEWkJPQVIyUDM1NUxOM01LQVlMWTE0IiwidyI6NzA1LCJoIjoyOTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNzI1NzUyODY4NTcyNzY0OTMwfQ.webp", layoutParams2.width, layoutParams2.height);
            xdl0.M(this.f5278m, true);
            xdl0.M(this.f5289w, false);
            xdl0.M(this.f5291y, false);
            xdl0.M(this.f5227A, true);
            this.f5272h.M(TEnum.equals(moment.dynamicType, "liked") ? i0g0.w(m7949I(), ((DbObject) moment).id) : i0g0.x(m7949I(), ((DbObject) moment).id));
        } else {
            boolean zEquals = moment.owner.equals(FeedModule.m1139F().userId());
            User user = this.f5256Q0;
            boolean z3 = user != null && user.verifications.anchor.verified;
            xdl0.M(this.f5289w, User.isMatched(user) || (z3 && !zEquals));
            xdl0.M(this.f5291y, User.isMatched(this.f5256Q0) || z3 || zEquals);
            if (NullChecker.a(this.f5256Q0) && qib0.b0.b.isCurrentMessageBlock(((DbObject) this.f5256Q0).id)) {
                xdl0.M(this.f5289w, false);
            }
            xdl0.M(this.f5278m, false);
            xdl0.M(this.f5227A, false);
        }
        if (u2h.m14718c() && moment.isLive) {
            xdl0.M(this.f5279n, true);
            xdl0.M(this.f5229C, true);
            xdl0.M(this.f5289w, false);
            xdl0.M(this.f5291y, false);
            xdl0.M(this.f5271g, false);
            xdl0.E0(this.f5229C, this.f5260S0);
            xdl0.E0(this.f5272h, this.f5260S0);
        } else {
            xdl0.M(this.f5279n, false);
            xdl0.M(this.f5229C, false);
            boolean zEquals2 = moment.owner.equals(FeedModule.m1139F().userId());
            User user2 = this.f5256Q0;
            boolean z4 = user2 != null && user2.verifications.anchor.verified;
            xdl0.M(this.f5289w, User.isMatched(user2) || (z4 && !zEquals2));
            xdl0.M(this.f5291y, User.isMatched(this.f5256Q0) || z4 || zEquals2);
            if (NullChecker.a(this.f5256Q0) && qib0.b0.b.isCurrentMessageBlock(((DbObject) this.f5256Q0).id)) {
                xdl0.M(this.f5289w, false);
            }
            this.f5272h.setOnClickListener(null);
        }
        this.f5292z.setImageResource(moment.haveLiked ? f3c0.f7782d2 : f3c0.f7874o6);
        PartialIdList partialIdList = moment.likes;
        int iMax = Math.max(partialIdList.count, partialIdList.ids.size());
        this.f5263V.setText(i0g0.h0(iMax));
        xdl0.M(this.f5233F, iMax != 0);
        FrameLayout frameLayout3 = this.f5262U;
        int i = f5226T0;
        xdl0.M(frameLayout3, iMax > i);
        while (i < this.f5252O0.size()) {
            this.f5252O0.get(i).setVisibility(8);
            this.f5254P0.get(i).setVisibility(8);
            i++;
        }
        if (NullChecker.a(map2.get(((DbObject) moment).id)) && map2.get(((DbObject) moment).id).intValue() == 0 && iMax != 0) {
            this.f5235G.setVisibility(0);
        } else if (NullChecker.a(map2.get(((DbObject) moment).id)) && map2.get(((DbObject) moment).id).intValue() != 0 && iMax == 0) {
            this.f5235G.setVisibility(8);
        } else {
            FrameLayout frameLayout4 = this.f5235G;
            if (iMax != 0) {
                frameLayout4.setVisibility(0);
                this.f5235G.getLayoutParams().height = t100.d(48.0f);
                this.f5235G.requestLayout();
            } else {
                frameLayout4.setVisibility(8);
            }
        }
        map2.put(((DbObject) moment).id, Integer.valueOf(iMax));
        boolean zIsTeamAccount2 = User.isTeamAccount(moment.owner);
        FrameLayout frameLayout5 = this.f5276k0;
        if (zIsTeamAccount2) {
            xdl0.M(frameLayout5, false);
        } else {
            xdl0.M(frameLayout5, hg00Var.f8705g > 100);
        }
        xdl0.M(this.f5264W, hg00Var.f8704f != 0);
        this.f5282p0.setText(m7949I().getString(R$string.f416P3, Integer.valueOf(hg00Var.f8705g)));
        for (final int i2 = 0; i2 < f5226T0; i2++) {
            final PartialIdList partialIdList2 = moment.likes;
            int size = partialIdList2.ids.size();
            ArrayList<VDraweeView> arrayList = this.f5252O0;
            if (size <= i2) {
                arrayList.get(i2).setOnClickListener(null);
                this.f5254P0.get(i2).setOnClickListener(null);
                xdl0.M0(this.f5252O0.get(i2), false);
                xdl0.M0(this.f5254P0.get(i2), false);
            } else {
                xdl0.M0(arrayList.get(i2), true);
                boolean zIsTeamAccount3 = User.isTeamAccount(moment.owner);
                ArrayList<VDraweeView> arrayList2 = this.f5252O0;
                if (zIsTeamAccount3) {
                    arrayList2.get(i2).setOnClickListener(null);
                    this.f5254P0.get(i2).setOnClickListener(null);
                } else {
                    arrayList2.get(i2).setOnClickListener(new View.OnClickListener() { // from class: l.mj00
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f10476a.m7969c0(partialIdList2, i2, view);
                        }
                    });
                    this.f5254P0.get(i2).setOnClickListener(new View.OnClickListener() { // from class: l.nj00
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f10813a.m7970d0(partialIdList2, i2, view);
                        }
                    });
                }
                this.f5248M0.m8081P(partialIdList2.ids.get(i2), new e30() { // from class: l.dj00
                    public final void call(Object obj) {
                        this.f6962a.m7971e0(i2, (User) obj);
                    }
                });
            }
        }
        this.f5287u.setVisibility(8);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m7976l0(Act act, final Moment moment) {
        act.dialog().f0(new String[]{act.getString(R$string.f569n), act.getString(R$string.f513f)}).g0(new Dialog.g() { // from class: l.oj00
            /* JADX INFO: renamed from: a */
            public final void m12652a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f11489a.m7972f0(moment, dialog, view, i, charSequence);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m7977m0() {
        xdl0.M(this.f5271g, true);
    }

    /* JADX INFO: renamed from: n0 */
    public void m7978n0(boolean z) {
        xdl0.M(this.f5234F0, z);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m7979o0() {
        if (NullChecker.a(this.f5283q)) {
            this.f5283q.loadAnimWithListener("feed_live_room_icon.svga", -1, new C2248a(), true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (u2h.m14718c() && NullChecker.a(this.f5258R0) && this.f5258R0.f8699a.isLive) {
            m7979o0();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7948H(this);
        this.f5289w.setOnClickListener(new View.OnClickListener() { // from class: l.hj00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8747a.m7954N(view);
            }
        });
        this.f5291y.setOnClickListener(new View.OnClickListener() { // from class: l.sj00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12966a.m7955O(view);
            }
        });
        this.f5227A.setOnClickListener(new View.OnClickListener() { // from class: l.wj00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14554a.m7956P(view);
            }
        });
        this.f5231E.setOnClickListener(new View.OnClickListener() { // from class: l.xj00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15019a.m7959S(view);
            }
        });
        this.f5252O0 = vwb.f0(new VDraweeView[]{this.f5239I, this.f5243K, this.f5247M, this.f5251O, this.f5255Q, this.f5259S});
        this.f5254P0 = vwb.f0(new VImage[]{this.f5241J, this.f5245L, this.f5249N, this.f5253P, this.f5257R, this.f5261T});
        this.f5272h.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.yj00
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f15445a.m7960T(view);
            }
        });
    }

    public MomentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5250N0 = null;
        this.f5260S0 = new View.OnClickListener() { // from class: l.wi00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14548a.m7953M(view);
            }
        };
    }

    public MomentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5250N0 = null;
        this.f5260S0 = new View.OnClickListener() { // from class: l.wi00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14548a.m7953M(view);
            }
        };
    }
}
