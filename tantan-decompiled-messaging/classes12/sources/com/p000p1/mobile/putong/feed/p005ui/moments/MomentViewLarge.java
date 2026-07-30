package com.p000p1.mobile.putong.feed.p005ui.moments;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.LocalStatus;
import com.p000p1.mobile.putong.data.PartialIdList;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentViewLarge;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import l.bt0;
import l.e30;
import l.i0g0;
import l.mkd0;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import p007l.f3c0;
import p007l.hg00;
import p007l.kjb0;
import p007l.t2h;
import p007l.v1h;
import p007l.vk00;
import v.VDraweeView;
import v.VFrame_Anim;
import v.VImage;
import v.VProgressBar;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentViewLarge extends FrameLayout {

    /* JADX INFO: renamed from: W */
    public static final int f5294W;

    /* JADX INFO: renamed from: A */
    public VDraweeView f5295A;

    /* JADX INFO: renamed from: B */
    public VImage f5296B;

    /* JADX INFO: renamed from: C */
    public VDraweeView f5297C;

    /* JADX INFO: renamed from: D */
    public VImage f5298D;

    /* JADX INFO: renamed from: E */
    public FrameLayout f5299E;

    /* JADX INFO: renamed from: F */
    public VText f5300F;

    /* JADX INFO: renamed from: G */
    public View f5301G;

    /* JADX INFO: renamed from: H */
    public FrameLayout f5302H;

    /* JADX INFO: renamed from: I */
    public VText f5303I;

    /* JADX INFO: renamed from: J */
    public LinearLayout f5304J;

    /* JADX INFO: renamed from: K */
    public LinearLayout f5305K;

    /* JADX INFO: renamed from: L */
    public View f5306L;

    /* JADX INFO: renamed from: M */
    public View f5307M;

    /* JADX INFO: renamed from: N */
    public VFrame_Anim f5308N;

    /* JADX INFO: renamed from: O */
    public VFrame_Anim f5309O;

    /* JADX INFO: renamed from: P */
    public VProgressBar f5310P;

    /* JADX INFO: renamed from: Q */
    public ImageView f5311Q;

    /* JADX INFO: renamed from: R */
    public MomentsFeedRecyclerList f5312R;

    /* JADX INFO: renamed from: S */
    public Moment f5313S;

    /* JADX INFO: renamed from: T */
    public ArrayList<VDraweeView> f5314T;

    /* JADX INFO: renamed from: U */
    public ArrayList<VImage> f5315U;

    /* JADX INFO: renamed from: V */
    public User f5316V;

    /* JADX INFO: renamed from: a */
    public LinearLayout f5317a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f5318b;

    /* JADX INFO: renamed from: c */
    public VImage f5319c;

    /* JADX INFO: renamed from: d */
    public MomentHeaderLargeView f5320d;

    /* JADX INFO: renamed from: e */
    public VText f5321e;

    /* JADX INFO: renamed from: f */
    public VText f5322f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f5323g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f5324h;

    /* JADX INFO: renamed from: i */
    public VText f5325i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f5326j;

    /* JADX INFO: renamed from: k */
    public ImageView f5327k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f5328l;

    /* JADX INFO: renamed from: m */
    public VText f5329m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f5330n;

    /* JADX INFO: renamed from: o */
    public ImageView f5331o;

    /* JADX INFO: renamed from: p */
    public View f5332p;

    /* JADX INFO: renamed from: q */
    public FrameLayout f5333q;

    /* JADX INFO: renamed from: r */
    public ImageView f5334r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f5335s;

    /* JADX INFO: renamed from: t */
    public VImage f5336t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f5337u;

    /* JADX INFO: renamed from: v */
    public VImage f5338v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f5339w;

    /* JADX INFO: renamed from: x */
    public VImage f5340x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f5341y;

    /* JADX INFO: renamed from: z */
    public VImage f5342z;

    static {
        f5294W = t100.c().density * 160.0f < 360.0f ? 5 : 6;
    }

    public MomentViewLarge(Context context) {
        super(context);
        this.f5313S = null;
    }

    /* JADX INFO: renamed from: L */
    public static void m7980L(boolean z, ImageView imageView, boolean z2) {
        if (z) {
            imageView.setImageResource(f3c0.f7782d2);
            bt0.b(imageView, bt0.l(imageView, bt0.i, 0L, 500L, new AnticipateOvershootInterpolator(2.0f), new float[]{1.35f, 1.0f}));
        } else {
            imageView.setImageResource(z2 ? f3c0.f7874o6 : f3c0.f7890q6);
            bt0.b(imageView, bt0.l(imageView, bt0.i, 0L, 500L, new AnticipateOvershootInterpolator(2.0f), new float[]{1.35f, 1.0f}));
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m7982b(View view) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m7986f(Envelope envelope) {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m7993m(Moment moment, ImageView imageView, boolean z, Throwable th) {
        t2h.m14427g(th);
        m7980L(moment.haveLiked, imageView, z);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m7999A(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.lk00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f10057a.m8019z(view2);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m8000B(hg00 hg00Var, User user) {
        this.f5316V = user;
        qib0.G.Q0(this.f5318b, user.m1042fp().profileSmall());
        this.f5320d.m7912v0(user);
        this.f5321e.setVisibility(8);
        qib0.b0.b.showUserVerificationLogo(m8013t(), user, this.f5319c);
        boolean zEquals = hg00Var.f8699a.owner.equals(FeedModule.m1139F().userId());
        boolean z = user.verifications.anchor.verified;
        boolean z2 = true;
        xdl0.M(this.f5324h, User.isMatched(user) || (z && !zEquals));
        FrameLayout frameLayout = this.f5326j;
        if (!User.isMatched(user) && !zEquals && !z) {
            z2 = false;
        }
        xdl0.M(frameLayout, z2);
        if (qib0.b0.b.isCurrentMessageBlock(((DbObject) this.f5316V).id)) {
            xdl0.M(this.f5324h, false);
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m8001C(Moment moment, View view) {
        m8013t().startActivity(LikesDetailAct.m7831V1(m8013t(), ((DbObject) moment).id, moment.owner));
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m8002D(Moment moment, View view) {
        m8013t().startActivity(MomentDetailAct.m7851V1(m8013t(), ((DbObject) moment).id, moment.owner, false, true));
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m8003E(Moment moment, View view) {
        m8010M(m8013t(), moment);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m8004F(PartialIdList partialIdList, int i, View view) {
        m8013t().startActivityForResult(MomentsInProfileAct.m8110V1(m8013t(), partialIdList.ids.get(i), "from_MomentsFeedAct"), 22);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m8005G(PartialIdList partialIdList, int i, View view) {
        m8013t().startActivityForResult(MomentsInProfileAct.m8110V1(m8013t(), partialIdList.ids.get(i), "from_MomentsFeedAct"), 22);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m8006H(int i, User user) {
        qib0.G.Q0(this.f5314T.get(i), user.m1042fp().profileSmall());
        qib0.b0.b.showUserVerificationLogo(m8013t(), user, this.f5315U.get(i));
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m8007I(Moment moment, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            this.f5312R.f5357e.mo8109j(moment);
        } else if (1 == i) {
            this.f5312R.f5357e.mo8105f(moment);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m8008J(final Moment moment, final ImageView imageView, final boolean z) {
        m7980L(!moment.haveLiked, imageView, z);
        this.f5312R.m8085T(moment).subscribe(mkd0.H(new e30() { // from class: l.pk00
            public final void call(Object obj) {
                MomentViewLarge.m7986f((Envelope) obj);
            }
        }, new e30() { // from class: l.qk00
            public final void call(Object obj) {
                MomentViewLarge.m7993m(moment, imageView, z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m8009K(final hg00 hg00Var, HashMap map, HashMap<String, Integer> map2, MomentsFeedRecyclerList momentsFeedRecyclerList) {
        this.f5312R = momentsFeedRecyclerList;
        byte b = 2;
        vwb.z(vwb.f0(new View[]{this.f5318b, this.f5320d.f5217e}), new e30() { // from class: l.sk00
            public final void call(Object obj) {
                this.f12972a.m7999A((View) obj);
            }
        });
        this.f5312R.m8081P(hg00Var.f8699a.owner, new e30() { // from class: l.tk00
            public final void call(Object obj) {
                this.f13321a.m8000B(hg00Var, (User) obj);
            }
        });
        final Moment moment = hg00Var.f8699a;
        if (NullChecker.a(this.f5313S) && this.f5313S.equals(moment) && NullChecker.b(moment) && TEnum.equals(this.f5313S.status(), moment.status())) {
            return;
        }
        this.f5313S = moment;
        boolean zIsTeamAccount = User.isTeamAccount(moment.owner);
        FrameLayout frameLayout = this.f5299E;
        if (zIsTeamAccount) {
            frameLayout.setOnClickListener(null);
            this.f5302H.setOnClickListener(null);
        } else {
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: l.uk00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13844a.m8001C(moment, view);
                }
            });
            this.f5302H.setOnClickListener(new View.OnClickListener() { // from class: l.ek00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7405a.m8002D(moment, view);
                }
            });
        }
        String string = moment.status().toString();
        string.getClass();
        switch (string.hashCode()) {
            case -1281977283:
                b = string.equals("failed") ? (byte) 0 : (byte) -1;
                break;
            case -1039745817:
                b = string.equals("normal") ? (byte) 1 : (byte) -1;
                break;
            case 1979923290:
                if (!string.equals(LocalStatus.sending)) {
                    b = -1;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                this.f5308N.setVisibility(0);
                this.f5309O.G(this.f5311Q);
                this.f5308N.setOnClickListener(new View.OnClickListener() { // from class: l.fk00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f8119a.m8003E(moment, view);
                    }
                });
                break;
            case 1:
                this.f5308N.setVisibility(4);
                this.f5308N.setOnClickListener((View.OnClickListener) null);
                break;
            case 2:
                this.f5308N.setVisibility(0);
                this.f5309O.G(this.f5310P);
                this.f5308N.setOnClickListener(new View.OnClickListener() { // from class: l.gk00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MomentViewLarge.m7982b(view);
                    }
                });
                break;
        }
        xdl0.M0(this.f5309O, !TEnum.equals(moment.status(), "normal"));
        this.f5320d.m7911u0(moment);
        if (!NullChecker.a(moment.location) || TextUtils.isEmpty(moment.location.name)) {
            this.f5322f.setVisibility(8);
        } else {
            this.f5322f.setVisibility(0);
            this.f5322f.setText(moment.location.name);
        }
        boolean zEquals = hg00Var.f8699a.owner.equals(FeedModule.m1139F().userId());
        User user = this.f5316V;
        boolean z = user != null && user.verifications.anchor.verified;
        xdl0.M(this.f5324h, User.isMatched(user) || (z && !zEquals));
        xdl0.M(this.f5326j, User.isMatched(this.f5316V) || z || zEquals);
        if (NullChecker.a(this.f5316V) && qib0.b0.b.isCurrentMessageBlock(((DbObject) this.f5316V).id)) {
            xdl0.M(this.f5324h, false);
        }
        this.f5327k.setImageResource(moment.haveLiked ? f3c0.f7782d2 : f3c0.f7874o6);
        PartialIdList partialIdList = moment.likes;
        int iMax = Math.max(partialIdList.count, partialIdList.ids.size());
        this.f5300F.setText(i0g0.h0(iMax));
        xdl0.M(this.f5332p, iMax != 0);
        FrameLayout frameLayout2 = this.f5299E;
        int i = f5294W;
        xdl0.M(frameLayout2, iMax > i);
        while (i < this.f5314T.size()) {
            this.f5314T.get(i).setVisibility(8);
            this.f5315U.get(i).setVisibility(8);
            i++;
        }
        if (NullChecker.a(map2.get(((DbObject) moment).id)) && map2.get(((DbObject) moment).id).intValue() == 0 && iMax != 0) {
            this.f5333q.setVisibility(0);
        } else if (NullChecker.a(map2.get(((DbObject) moment).id)) && map2.get(((DbObject) moment).id).intValue() != 0 && iMax == 0) {
            this.f5333q.setVisibility(8);
        } else {
            FrameLayout frameLayout3 = this.f5333q;
            if (iMax != 0) {
                frameLayout3.setVisibility(0);
                this.f5333q.getLayoutParams().height = t100.d(48.0f);
                this.f5333q.requestLayout();
            } else {
                frameLayout3.setVisibility(8);
            }
        }
        map2.put(((DbObject) moment).id, Integer.valueOf(iMax));
        boolean zIsTeamAccount2 = User.isTeamAccount(moment.owner);
        FrameLayout frameLayout4 = this.f5302H;
        if (zIsTeamAccount2) {
            xdl0.M(frameLayout4, false);
        } else {
            xdl0.M(frameLayout4, hg00Var.f8705g > 100);
        }
        xdl0.M(this.f5301G, hg00Var.f8704f != 0);
        this.f5303I.setText(m8013t().getString(R$string.f416P3, Integer.valueOf(hg00Var.f8705g)));
        for (final int i2 = 0; i2 < f5294W; i2++) {
            final PartialIdList partialIdList2 = moment.likes;
            int size = partialIdList2.ids.size();
            ArrayList<VDraweeView> arrayList = this.f5314T;
            if (size <= i2) {
                arrayList.get(i2).setOnClickListener(null);
                this.f5315U.get(i2).setOnClickListener(null);
                xdl0.M0(this.f5314T.get(i2), false);
                xdl0.M0(this.f5315U.get(i2), false);
            } else {
                xdl0.M0(arrayList.get(i2), true);
                boolean zIsTeamAccount3 = User.isTeamAccount(moment.owner);
                ArrayList<VDraweeView> arrayList2 = this.f5314T;
                if (zIsTeamAccount3) {
                    arrayList2.get(i2).setOnClickListener(null);
                    this.f5315U.get(i2).setOnClickListener(null);
                } else {
                    arrayList2.get(i2).setOnClickListener(new View.OnClickListener() { // from class: l.hk00
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f8756a.m8004F(partialIdList2, i2, view);
                        }
                    });
                    this.f5315U.get(i2).setOnClickListener(new View.OnClickListener() { // from class: l.ik00
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f9046a.m8005G(partialIdList2, i2, view);
                        }
                    });
                }
                this.f5312R.m8081P(partialIdList2.ids.get(i2), new e30() { // from class: l.jk00
                    public final void call(Object obj) {
                        this.f9379a.m8006H(i2, (User) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m8010M(Act act, final Moment moment) {
        act.dialog().f0(new String[]{act.getString(R$string.f569n), act.getString(R$string.f513f)}).g0(new Dialog.g() { // from class: l.kk00
            /* JADX INFO: renamed from: a */
            public final void m11491a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f9739a.m8007I(moment, dialog, view, i, charSequence);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: N */
    public void m8011N(boolean z) {
        xdl0.M(this.f5305K, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8012s(this);
        this.f5324h.setOnClickListener(new View.OnClickListener() { // from class: l.dk00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6968a.m8014u(view);
            }
        });
        this.f5326j.setOnClickListener(new View.OnClickListener() { // from class: l.mk00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10482a.m8015v(view);
            }
        });
        this.f5328l.setOnClickListener(new View.OnClickListener() { // from class: l.nk00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10818a.m8016w(view);
            }
        });
        this.f5331o.setOnClickListener(new View.OnClickListener() { // from class: l.ok00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11493a.m8018y(view);
            }
        });
        this.f5314T = vwb.f0(new VDraweeView[]{this.f5335s, this.f5337u, this.f5339w, this.f5341y, this.f5295A, this.f5297C});
        this.f5315U = vwb.f0(new VImage[]{this.f5336t, this.f5338v, this.f5340x, this.f5342z, this.f5296B, this.f5298D});
        this.f5320d.m7909s0();
    }

    /* JADX INFO: renamed from: s */
    public final void m8012s(View view) {
        vk00.m15429a(this, view);
    }

    /* JADX INFO: renamed from: t */
    public final PutongAct m8013t() {
        return getContext();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m8014u(View view) {
        if (NullChecker.a(this.f5312R)) {
            if (qib0.b0.b.shouldLockComment(this.f5313S.owner)) {
                qib0.b0.b.showProofAgeDlg(m8013t(), "moment_square");
            } else {
                this.f5312R.m8079N(this.f5313S);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m8015v(View view) {
        if (NullChecker.a(this.f5312R)) {
            m8008J(this.f5313S, this.f5327k, true);
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m8016w(View view) {
        if (NullChecker.a(this.f5312R)) {
            m8013t().startActivity(kjb0.m11453e(m8013t(), this.f5313S.owner, false, false, false, false, null, -1));
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m8017x(Boolean bool) {
        this.f5312R.f5364l.m8033U4(bool.booleanValue());
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m8018y(View view) {
        PutongAct putongActM8013t = m8013t();
        Moment moment = this.f5313S;
        v1h.m15271x0(putongActM8013t, moment.owner, moment, null, new e30() { // from class: l.rk00
            public final void call(Object obj) {
                this.f12661a.m8017x((Boolean) obj);
            }
        }, null, false, false, true);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m8019z(View view) {
        m8013t().startActivityForResult(MomentsInProfileAct.m8110V1(m8013t(), this.f5313S.owner, "from_MomentsFeedAct"), 22);
    }

    public MomentViewLarge(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5313S = null;
    }

    public MomentViewLarge(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5313S = null;
    }
}
