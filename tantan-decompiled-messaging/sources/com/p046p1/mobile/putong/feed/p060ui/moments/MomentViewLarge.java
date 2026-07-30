package com.p046p1.mobile.putong.feed.p060ui.moments;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.LocalStatus;
import com.p046p1.mobile.putong.data.PartialIdList;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentViewLarge;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import p147v.VDraweeView;
import p147v.VFrame_Anim;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VText;
import p149l.bt0;
import p149l.e30;
import p149l.f3c0;
import p149l.hg00;
import p149l.i0g0;
import p149l.kjb0;
import p149l.mkd0;
import p149l.qib0;
import p149l.t100;
import p149l.t2h;
import p149l.v1h;
import p149l.vk00;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class MomentViewLarge extends FrameLayout {

    /* JADX INFO: renamed from: W */
    public static final int f43833W;

    /* JADX INFO: renamed from: A */
    public VDraweeView f43834A;

    /* JADX INFO: renamed from: B */
    public VImage f43835B;

    /* JADX INFO: renamed from: C */
    public VDraweeView f43836C;

    /* JADX INFO: renamed from: D */
    public VImage f43837D;

    /* JADX INFO: renamed from: E */
    public FrameLayout f43838E;

    /* JADX INFO: renamed from: F */
    public VText f43839F;

    /* JADX INFO: renamed from: G */
    public View f43840G;

    /* JADX INFO: renamed from: H */
    public FrameLayout f43841H;

    /* JADX INFO: renamed from: I */
    public VText f43842I;

    /* JADX INFO: renamed from: J */
    public LinearLayout f43843J;

    /* JADX INFO: renamed from: K */
    public LinearLayout f43844K;

    /* JADX INFO: renamed from: L */
    public View f43845L;

    /* JADX INFO: renamed from: M */
    public View f43846M;

    /* JADX INFO: renamed from: N */
    public VFrame_Anim f43847N;

    /* JADX INFO: renamed from: O */
    public VFrame_Anim f43848O;

    /* JADX INFO: renamed from: P */
    public VProgressBar f43849P;

    /* JADX INFO: renamed from: Q */
    public ImageView f43850Q;

    /* JADX INFO: renamed from: R */
    public MomentsFeedRecyclerList f43851R;

    /* JADX INFO: renamed from: S */
    public Moment f43852S;

    /* JADX INFO: renamed from: T */
    public ArrayList<VDraweeView> f43853T;

    /* JADX INFO: renamed from: U */
    public ArrayList<VImage> f43854U;

    /* JADX INFO: renamed from: V */
    public User f43855V;

    /* JADX INFO: renamed from: a */
    public LinearLayout f43856a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f43857b;

    /* JADX INFO: renamed from: c */
    public VImage f43858c;

    /* JADX INFO: renamed from: d */
    public MomentHeaderLargeView f43859d;

    /* JADX INFO: renamed from: e */
    public VText f43860e;

    /* JADX INFO: renamed from: f */
    public VText f43861f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f43862g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f43863h;

    /* JADX INFO: renamed from: i */
    public VText f43864i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f43865j;

    /* JADX INFO: renamed from: k */
    public ImageView f43866k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f43867l;

    /* JADX INFO: renamed from: m */
    public VText f43868m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f43869n;

    /* JADX INFO: renamed from: o */
    public ImageView f43870o;

    /* JADX INFO: renamed from: p */
    public View f43871p;

    /* JADX INFO: renamed from: q */
    public FrameLayout f43872q;

    /* JADX INFO: renamed from: r */
    public ImageView f43873r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f43874s;

    /* JADX INFO: renamed from: t */
    public VImage f43875t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f43876u;

    /* JADX INFO: renamed from: v */
    public VImage f43877v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f43878w;

    /* JADX INFO: renamed from: x */
    public VImage f43879x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f43880y;

    /* JADX INFO: renamed from: z */
    public VImage f43881z;

    static {
        f43833W = t100.m186889c().density * 160.0f < 360.0f ? 5 : 6;
    }

    public MomentViewLarge(Context context) {
        super(context);
        this.f43852S = null;
    }

    /* JADX INFO: renamed from: L */
    public static void m66789L(boolean z, ImageView imageView, boolean z2) {
        if (z) {
            imageView.setImageResource(f3c0.f94499d2);
            bt0.m103729b(imageView, bt0.m103739l(imageView, bt0.f77162i, 0L, 500L, new AnticipateOvershootInterpolator(2.0f), 1.35f, 1.0f));
        } else {
            imageView.setImageResource(z2 ? f3c0.f94591o6 : f3c0.f94607q6);
            bt0.m103729b(imageView, bt0.m103739l(imageView, bt0.f77162i, 0L, 500L, new AnticipateOvershootInterpolator(2.0f), 1.35f, 1.0f));
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m66791b(View view) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m66795f(Envelope envelope) {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m66802m(Moment moment, ImageView imageView, boolean z, Throwable th) {
        t2h.m186976g(th);
        m66789L(moment.haveLiked, imageView, z);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m66808A(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.lk00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f128441a.m66828z(view2);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m66809B(hg00 hg00Var, User user) {
        this.f43855V = user;
        qib0.f154691G.m102341Q0(this.f43857b, user.m60124fp().profileSmall());
        this.f43859d.m66721v0(user);
        this.f43860e.setVisibility(8);
        qib0.f154713b0.f139231b.showUserVerificationLogo(m66822t(), user, this.f43858c);
        boolean zEquals = hg00Var.f107542a.owner.equals(FeedModule.m60221F().userId());
        boolean z = user.verifications.anchor.verified;
        boolean z2 = true;
        xdl0.m208344M(this.f43863h, User.isMatched(user) || (z && !zEquals));
        FrameLayout frameLayout = this.f43865j;
        if (!User.isMatched(user) && !zEquals && !z) {
            z2 = false;
        }
        xdl0.m208344M(frameLayout, z2);
        if (qib0.f154713b0.f139231b.isCurrentMessageBlock(this.f43855V.f56011id)) {
            xdl0.m208344M(this.f43863h, false);
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m66810C(Moment moment, View view) {
        m66822t().startActivity(LikesDetailAct.m66640V1(m66822t(), moment.f56011id, moment.owner));
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m66811D(Moment moment, View view) {
        m66822t().startActivity(MomentDetailAct.m66660V1(m66822t(), moment.f56011id, moment.owner, false, true));
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m66812E(Moment moment, View view) {
        m66819M(m66822t(), moment);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m66813F(PartialIdList partialIdList, int i, View view) {
        m66822t().startActivityForResult(MomentsInProfileAct.m66912V1(m66822t(), partialIdList.ids.get(i), "from_MomentsFeedAct"), 22);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m66814G(PartialIdList partialIdList, int i, View view) {
        m66822t().startActivityForResult(MomentsInProfileAct.m66912V1(m66822t(), partialIdList.ids.get(i), "from_MomentsFeedAct"), 22);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m66815H(int i, User user) {
        qib0.f154691G.m102341Q0(this.f43853T.get(i), user.m60124fp().profileSmall());
        qib0.f154713b0.f139231b.showUserVerificationLogo(m66822t(), user, this.f43854U.get(i));
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m66816I(Moment moment, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            this.f43851R.f43896e.mo66911j(moment);
        } else if (1 == i) {
            this.f43851R.f43896e.mo66907f(moment);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m66817J(final Moment moment, final ImageView imageView, final boolean z) {
        m66789L(!moment.haveLiked, imageView, z);
        this.f43851R.m66891T(moment).subscribe(mkd0.m154956H(new e30() { // from class: l.pk00
            @Override // p149l.e30
            public final void call(Object obj) {
                MomentViewLarge.m66795f((Envelope) obj);
            }
        }, new e30() { // from class: l.qk00
            @Override // p149l.e30
            public final void call(Object obj) {
                MomentViewLarge.m66802m(moment, imageView, z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m66818K(final hg00 hg00Var, HashMap map, HashMap<String, Integer> map2, MomentsFeedRecyclerList momentsFeedRecyclerList) {
        this.f43851R = momentsFeedRecyclerList;
        byte b = 2;
        vwb.m200354z(vwb.m200324f0(this.f43857b, this.f43859d.f43756e), new e30() { // from class: l.sk00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164929a.m66808A((View) obj);
            }
        });
        this.f43851R.m66887P(hg00Var.f107542a.owner, new e30() { // from class: l.tk00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170812a.m66809B(hg00Var, (User) obj);
            }
        });
        final Moment moment = hg00Var.f107542a;
        if (NullChecker.m81303a(this.f43852S) && this.f43852S.equals(moment) && NullChecker.m81304b(moment) && TEnum.equals(this.f43852S.status(), moment.status())) {
            return;
        }
        this.f43852S = moment;
        boolean zIsTeamAccount = User.isTeamAccount(moment.owner);
        FrameLayout frameLayout = this.f43838E;
        if (zIsTeamAccount) {
            frameLayout.setOnClickListener(null);
            this.f43841H.setOnClickListener(null);
        } else {
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: l.uk00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f176896a.m66810C(moment, view);
                }
            });
            this.f43841H.setOnClickListener(new View.OnClickListener() { // from class: l.ek00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f91923a.m66811D(moment, view);
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
                this.f43847N.setVisibility(0);
                this.f43848O.m223026G(this.f43850Q);
                this.f43847N.setOnClickListener(new View.OnClickListener() { // from class: l.fk00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f98020a.m66812E(moment, view);
                    }
                });
                break;
            case 1:
                this.f43847N.setVisibility(4);
                this.f43847N.setOnClickListener(null);
                break;
            case 2:
                this.f43847N.setVisibility(0);
                this.f43848O.m223026G(this.f43849P);
                this.f43847N.setOnClickListener(new View.OnClickListener() { // from class: l.gk00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MomentViewLarge.m66791b(view);
                    }
                });
                break;
        }
        xdl0.m208345M0(this.f43848O, !TEnum.equals(moment.status(), "normal"));
        this.f43859d.m66720u0(moment);
        if (!NullChecker.m81303a(moment.location) || TextUtils.isEmpty(moment.location.name)) {
            this.f43861f.setVisibility(8);
        } else {
            this.f43861f.setVisibility(0);
            this.f43861f.setText(moment.location.name);
        }
        boolean zEquals = hg00Var.f107542a.owner.equals(FeedModule.m60221F().userId());
        User user = this.f43855V;
        boolean z = user != null && user.verifications.anchor.verified;
        xdl0.m208344M(this.f43863h, User.isMatched(user) || (z && !zEquals));
        xdl0.m208344M(this.f43865j, User.isMatched(this.f43855V) || z || zEquals);
        if (NullChecker.m81303a(this.f43855V) && qib0.f154713b0.f139231b.isCurrentMessageBlock(this.f43855V.f56011id)) {
            xdl0.m208344M(this.f43863h, false);
        }
        this.f43866k.setImageResource(moment.haveLiked ? f3c0.f94499d2 : f3c0.f94591o6);
        PartialIdList partialIdList = moment.likes;
        int iMax = Math.max(partialIdList.count, partialIdList.ids.size());
        this.f43839F.setText(i0g0.m133867h0(iMax));
        xdl0.m208344M(this.f43871p, iMax != 0);
        FrameLayout frameLayout2 = this.f43838E;
        int i = f43833W;
        xdl0.m208344M(frameLayout2, iMax > i);
        while (i < this.f43853T.size()) {
            this.f43853T.get(i).setVisibility(8);
            this.f43854U.get(i).setVisibility(8);
            i++;
        }
        if (NullChecker.m81303a(map2.get(moment.f56011id)) && map2.get(moment.f56011id).intValue() == 0 && iMax != 0) {
            this.f43872q.setVisibility(0);
        } else if (NullChecker.m81303a(map2.get(moment.f56011id)) && map2.get(moment.f56011id).intValue() != 0 && iMax == 0) {
            this.f43872q.setVisibility(8);
        } else {
            FrameLayout frameLayout3 = this.f43872q;
            if (iMax != 0) {
                frameLayout3.setVisibility(0);
                this.f43872q.getLayoutParams().height = t100.m186890d(48.0f);
                this.f43872q.requestLayout();
            } else {
                frameLayout3.setVisibility(8);
            }
        }
        map2.put(moment.f56011id, Integer.valueOf(iMax));
        boolean zIsTeamAccount2 = User.isTeamAccount(moment.owner);
        FrameLayout frameLayout4 = this.f43841H;
        if (zIsTeamAccount2) {
            xdl0.m208344M(frameLayout4, false);
        } else {
            xdl0.m208344M(frameLayout4, hg00Var.f107548g > 100);
        }
        xdl0.m208344M(this.f43840G, hg00Var.f107547f != 0);
        this.f43842I.setText(m66822t().getString(R$string.f38955P3, Integer.valueOf(hg00Var.f107548g)));
        for (final int i2 = 0; i2 < f43833W; i2++) {
            final PartialIdList partialIdList2 = moment.likes;
            int size = partialIdList2.ids.size();
            ArrayList<VDraweeView> arrayList = this.f43853T;
            if (size <= i2) {
                arrayList.get(i2).setOnClickListener(null);
                this.f43854U.get(i2).setOnClickListener(null);
                xdl0.m208345M0(this.f43853T.get(i2), false);
                xdl0.m208345M0(this.f43854U.get(i2), false);
            } else {
                xdl0.m208345M0(arrayList.get(i2), true);
                boolean zIsTeamAccount3 = User.isTeamAccount(moment.owner);
                ArrayList<VDraweeView> arrayList2 = this.f43853T;
                if (zIsTeamAccount3) {
                    arrayList2.get(i2).setOnClickListener(null);
                    this.f43854U.get(i2).setOnClickListener(null);
                } else {
                    arrayList2.get(i2).setOnClickListener(new View.OnClickListener() { // from class: l.hk00
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f108140a.m66813F(partialIdList2, i2, view);
                        }
                    });
                    this.f43854U.get(i2).setOnClickListener(new View.OnClickListener() { // from class: l.ik00
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f113621a.m66814G(partialIdList2, i2, view);
                        }
                    });
                }
                this.f43851R.m66887P(partialIdList2.ids.get(i2), new e30() { // from class: l.jk00
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f118329a.m66815H(i2, (User) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m66819M(Act act, final Moment moment) {
        act.dialog().m20536f0(new String[]{act.getString(R$string.f39108n), act.getString(R$string.f39052f)}).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.kk00
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f123521a.m66816I(moment, dialog, view, i, charSequence);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: N */
    public void m66820N(boolean z) {
        xdl0.m208344M(this.f43844K, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66821s(this);
        this.f43863h.setOnClickListener(new View.OnClickListener() { // from class: l.dk00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86586a.m66823u(view);
            }
        });
        this.f43865j.setOnClickListener(new View.OnClickListener() { // from class: l.mk00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134274a.m66824v(view);
            }
        });
        this.f43867l.setOnClickListener(new View.OnClickListener() { // from class: l.nk00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139369a.m66825w(view);
            }
        });
        this.f43870o.setOnClickListener(new View.OnClickListener() { // from class: l.ok00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f144391a.m66827y(view);
            }
        });
        this.f43853T = vwb.m200324f0(this.f43874s, this.f43876u, this.f43878w, this.f43880y, this.f43834A, this.f43836C);
        this.f43854U = vwb.m200324f0(this.f43875t, this.f43877v, this.f43879x, this.f43881z, this.f43835B, this.f43837D);
        this.f43859d.m66718s0();
    }

    /* JADX INFO: renamed from: s */
    public final void m66821s(View view) {
        vk00.m198707a(this, view);
    }

    /* JADX INFO: renamed from: t */
    public final PutongAct m66822t() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m66823u(View view) {
        if (NullChecker.m81303a(this.f43851R)) {
            if (qib0.f154713b0.f139231b.shouldLockComment(this.f43852S.owner)) {
                qib0.f154713b0.f139231b.showProofAgeDlg(m66822t(), "moment_square");
            } else {
                this.f43851R.m66885N(this.f43852S);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m66824v(View view) {
        if (NullChecker.m81303a(this.f43851R)) {
            m66817J(this.f43852S, this.f43866k, true);
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m66825w(View view) {
        if (NullChecker.m81303a(this.f43851R)) {
            m66822t().startActivity(kjb0.m146194e(m66822t(), this.f43852S.owner, false, false, false, false, null, -1));
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m66826x(Boolean bool) {
        this.f43851R.f43903l.m66839U4(bool.booleanValue());
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m66827y(View view) {
        PutongAct putongActM66822t = m66822t();
        Moment moment = this.f43852S;
        v1h.m196632x0(putongActM66822t, moment.owner, moment, null, new e30() { // from class: l.rk00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159769a.m66826x((Boolean) obj);
            }
        }, null, false, false, true);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m66828z(View view) {
        m66822t().startActivityForResult(MomentsInProfileAct.m66912V1(m66822t(), this.f43852S.owner, "from_MomentsFeedAct"), 22);
    }

    public MomentViewLarge(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43852S = null;
    }

    public MomentViewLarge(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43852S = null;
    }
}
