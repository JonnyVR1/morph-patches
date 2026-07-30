package com.p051p1.mobile.putong.feed.p065ui.moments;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.LocalStatus;
import com.p051p1.mobile.putong.data.PartialIdList;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentViewLarge;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import p151v.VDraweeView;
import p151v.VFrame_Anim;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VText;
import p153l.bnl0;
import p153l.et00;
import p153l.gt0;
import p153l.i4h;
import p153l.jyb;
import p153l.k3h;
import p153l.lbc0;
import p153l.orb0;
import p153l.psd0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qo00;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class MomentViewLarge extends FrameLayout {

    /* JADX INFO: renamed from: W */
    public static final int f44681W;

    /* JADX INFO: renamed from: A */
    public VDraweeView f44682A;

    /* JADX INFO: renamed from: B */
    public VImage f44683B;

    /* JADX INFO: renamed from: C */
    public VDraweeView f44684C;

    /* JADX INFO: renamed from: D */
    public VImage f44685D;

    /* JADX INFO: renamed from: E */
    public FrameLayout f44686E;

    /* JADX INFO: renamed from: F */
    public VText f44687F;

    /* JADX INFO: renamed from: G */
    public View f44688G;

    /* JADX INFO: renamed from: H */
    public FrameLayout f44689H;

    /* JADX INFO: renamed from: I */
    public VText f44690I;

    /* JADX INFO: renamed from: J */
    public LinearLayout f44691J;

    /* JADX INFO: renamed from: K */
    public LinearLayout f44692K;

    /* JADX INFO: renamed from: L */
    public View f44693L;

    /* JADX INFO: renamed from: M */
    public View f44694M;

    /* JADX INFO: renamed from: N */
    public VFrame_Anim f44695N;

    /* JADX INFO: renamed from: O */
    public VFrame_Anim f44696O;

    /* JADX INFO: renamed from: P */
    public VProgressBar f44697P;

    /* JADX INFO: renamed from: Q */
    public ImageView f44698Q;

    /* JADX INFO: renamed from: R */
    public MomentsFeedRecyclerList f44699R;

    /* JADX INFO: renamed from: S */
    public Moment f44700S;

    /* JADX INFO: renamed from: T */
    public ArrayList<VDraweeView> f44701T;

    /* JADX INFO: renamed from: U */
    public ArrayList<VImage> f44702U;

    /* JADX INFO: renamed from: V */
    public User f44703V;

    /* JADX INFO: renamed from: a */
    public LinearLayout f44704a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f44705b;

    /* JADX INFO: renamed from: c */
    public VImage f44706c;

    /* JADX INFO: renamed from: d */
    public MomentHeaderLargeView f44707d;

    /* JADX INFO: renamed from: e */
    public VText f44708e;

    /* JADX INFO: renamed from: f */
    public VText f44709f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f44710g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f44711h;

    /* JADX INFO: renamed from: i */
    public VText f44712i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f44713j;

    /* JADX INFO: renamed from: k */
    public ImageView f44714k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f44715l;

    /* JADX INFO: renamed from: m */
    public VText f44716m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f44717n;

    /* JADX INFO: renamed from: o */
    public ImageView f44718o;

    /* JADX INFO: renamed from: p */
    public View f44719p;

    /* JADX INFO: renamed from: q */
    public FrameLayout f44720q;

    /* JADX INFO: renamed from: r */
    public ImageView f44721r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f44722s;

    /* JADX INFO: renamed from: t */
    public VImage f44723t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f44724u;

    /* JADX INFO: renamed from: v */
    public VImage f44725v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f44726w;

    /* JADX INFO: renamed from: x */
    public VImage f44727x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f44728y;

    /* JADX INFO: renamed from: z */
    public VImage f44729z;

    static {
        f44681W = qa00.m175858c().density * 160.0f < 360.0f ? 5 : 6;
    }

    public MomentViewLarge(Context context) {
        super(context);
        this.f44700S = null;
    }

    /* JADX INFO: renamed from: L */
    public static void m67972L(boolean z, ImageView imageView, boolean z2) {
        if (z) {
            imageView.setImageResource(lbc0.f131017d2);
            gt0.m132156b(imageView, gt0.m132166l(imageView, gt0.f106354i, 0L, 500L, new AnticipateOvershootInterpolator(2.0f), 1.35f, 1.0f));
        } else {
            imageView.setImageResource(z2 ? lbc0.f131109o6 : lbc0.f131125q6);
            gt0.m132156b(imageView, gt0.m132166l(imageView, gt0.f106354i, 0L, 500L, new AnticipateOvershootInterpolator(2.0f), 1.35f, 1.0f));
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m67974b(View view) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m67978f(Envelope envelope) {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m67985m(Moment moment, ImageView imageView, boolean z, Throwable th) {
        i4h.m138538g(th);
        m67972L(moment.haveLiked, imageView, z);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m67991A(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.us00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f180723a.m68011z(view2);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m67992B(qo00 qo00Var, User user) {
        this.f44703V = user;
        uqb0.f180374G.m127125Q0(this.f44705b, user.m61308fp().profileSmall());
        this.f44707d.m67904v0(user);
        this.f44708e.setVisibility(8);
        uqb0.f180396b0.f170325b.showUserVerificationLogo(m68005t(), user, this.f44706c);
        boolean zEquals = qo00Var.f158680a.owner.equals(FeedModule.m61405F().userId());
        boolean z = user.verifications.anchor.verified;
        boolean z2 = true;
        bnl0.m105524M(this.f44711h, User.isMatched(user) || (z && !zEquals));
        FrameLayout frameLayout = this.f44713j;
        if (!User.isMatched(user) && !zEquals && !z) {
            z2 = false;
        }
        bnl0.m105524M(frameLayout, z2);
        if (uqb0.f180396b0.f170325b.isCurrentMessageBlock(this.f44703V.f56859id)) {
            bnl0.m105524M(this.f44711h, false);
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m67993C(Moment moment, View view) {
        m68005t().startActivity(LikesDetailAct.m67823X1(m68005t(), moment.f56859id, moment.owner));
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m67994D(Moment moment, View view) {
        m68005t().startActivity(MomentDetailAct.m67843X1(m68005t(), moment.f56859id, moment.owner, false, true));
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m67995E(Moment moment, View view) {
        m68002M(m68005t(), moment);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m67996F(PartialIdList partialIdList, int i, View view) {
        m68005t().startActivityForResult(MomentsInProfileAct.m68095X1(m68005t(), partialIdList.ids.get(i), "from_MomentsFeedAct"), 22);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m67997G(PartialIdList partialIdList, int i, View view) {
        m68005t().startActivityForResult(MomentsInProfileAct.m68095X1(m68005t(), partialIdList.ids.get(i), "from_MomentsFeedAct"), 22);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m67998H(int i, User user) {
        uqb0.f180374G.m127125Q0(this.f44701T.get(i), user.m61308fp().profileSmall());
        uqb0.f180396b0.f170325b.showUserVerificationLogo(m68005t(), user, this.f44702U.get(i));
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m67999I(Moment moment, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            this.f44699R.f44744e.mo68094j(moment);
        } else if (1 == i) {
            this.f44699R.f44744e.mo68090f(moment);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m68000J(final Moment moment, final ImageView imageView, final boolean z) {
        m67972L(!moment.haveLiked, imageView, z);
        this.f44699R.m68074T(moment).subscribe(psd0.m173597H(new y20() { // from class: l.ys00
            @Override // p153l.y20
            public final void call(Object obj) {
                MomentViewLarge.m67978f((Envelope) obj);
            }
        }, new y20() { // from class: l.zs00
            @Override // p153l.y20
            public final void call(Object obj) {
                MomentViewLarge.m67985m(moment, imageView, z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m68001K(final qo00 qo00Var, HashMap map, HashMap<String, Integer> map2, MomentsFeedRecyclerList momentsFeedRecyclerList) {
        this.f44699R = momentsFeedRecyclerList;
        byte b = 2;
        jyb.m147537z(jyb.m147507f0(this.f44705b, this.f44707d.f44604e), new y20() { // from class: l.bt00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78320a.m67991A((View) obj);
            }
        });
        this.f44699R.m68070P(qo00Var.f158680a.owner, new y20() { // from class: l.ct00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83653a.m67992B(qo00Var, (User) obj);
            }
        });
        final Moment moment = qo00Var.f158680a;
        if (NullChecker.m82486a(this.f44700S) && this.f44700S.equals(moment) && NullChecker.m82487b(moment) && TEnum.equals(this.f44700S.status(), moment.status())) {
            return;
        }
        this.f44700S = moment;
        boolean zIsTeamAccount = User.isTeamAccount(moment.owner);
        FrameLayout frameLayout = this.f44686E;
        if (zIsTeamAccount) {
            frameLayout.setOnClickListener(null);
            this.f44689H.setOnClickListener(null);
        } else {
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: l.dt00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f90533a.m67993C(moment, view);
                }
            });
            this.f44689H.setOnClickListener(new View.OnClickListener() { // from class: l.ns00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f143452a.m67994D(moment, view);
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
                this.f44695N.setVisibility(0);
                this.f44696O.m224272G(this.f44698Q);
                this.f44695N.setOnClickListener(new View.OnClickListener() { // from class: l.os00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f148779a.m67995E(moment, view);
                    }
                });
                break;
            case 1:
                this.f44695N.setVisibility(4);
                this.f44695N.setOnClickListener(null);
                break;
            case 2:
                this.f44695N.setVisibility(0);
                this.f44696O.m224272G(this.f44697P);
                this.f44695N.setOnClickListener(new View.OnClickListener() { // from class: l.ps00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MomentViewLarge.m67974b(view);
                    }
                });
                break;
        }
        bnl0.m105525M0(this.f44696O, !TEnum.equals(moment.status(), "normal"));
        this.f44707d.m67903u0(moment);
        if (!NullChecker.m82486a(moment.location) || TextUtils.isEmpty(moment.location.name)) {
            this.f44709f.setVisibility(8);
        } else {
            this.f44709f.setVisibility(0);
            this.f44709f.setText(moment.location.name);
        }
        boolean zEquals = qo00Var.f158680a.owner.equals(FeedModule.m61405F().userId());
        User user = this.f44703V;
        boolean z = user != null && user.verifications.anchor.verified;
        bnl0.m105524M(this.f44711h, User.isMatched(user) || (z && !zEquals));
        bnl0.m105524M(this.f44713j, User.isMatched(this.f44703V) || z || zEquals);
        if (NullChecker.m82486a(this.f44703V) && uqb0.f180396b0.f170325b.isCurrentMessageBlock(this.f44703V.f56859id)) {
            bnl0.m105524M(this.f44711h, false);
        }
        this.f44714k.setImageResource(moment.haveLiked ? lbc0.f131017d2 : lbc0.f131109o6);
        PartialIdList partialIdList = moment.likes;
        int iMax = Math.max(partialIdList.count, partialIdList.ids.size());
        this.f44687F.setText(q8g0.m175802h0(iMax));
        bnl0.m105524M(this.f44719p, iMax != 0);
        FrameLayout frameLayout2 = this.f44686E;
        int i = f44681W;
        bnl0.m105524M(frameLayout2, iMax > i);
        while (i < this.f44701T.size()) {
            this.f44701T.get(i).setVisibility(8);
            this.f44702U.get(i).setVisibility(8);
            i++;
        }
        if (NullChecker.m82486a(map2.get(moment.f56859id)) && map2.get(moment.f56859id).intValue() == 0 && iMax != 0) {
            this.f44720q.setVisibility(0);
        } else if (NullChecker.m82486a(map2.get(moment.f56859id)) && map2.get(moment.f56859id).intValue() != 0 && iMax == 0) {
            this.f44720q.setVisibility(8);
        } else {
            FrameLayout frameLayout3 = this.f44720q;
            if (iMax != 0) {
                frameLayout3.setVisibility(0);
                this.f44720q.getLayoutParams().height = qa00.m175859d(48.0f);
                this.f44720q.requestLayout();
            } else {
                frameLayout3.setVisibility(8);
            }
        }
        map2.put(moment.f56859id, Integer.valueOf(iMax));
        boolean zIsTeamAccount2 = User.isTeamAccount(moment.owner);
        FrameLayout frameLayout4 = this.f44689H;
        if (zIsTeamAccount2) {
            bnl0.m105524M(frameLayout4, false);
        } else {
            bnl0.m105524M(frameLayout4, qo00Var.f158686g > 100);
        }
        bnl0.m105524M(this.f44688G, qo00Var.f158685f != 0);
        this.f44690I.setText(m68005t().getString(R$string.f39803P3, Integer.valueOf(qo00Var.f158686g)));
        for (final int i2 = 0; i2 < f44681W; i2++) {
            final PartialIdList partialIdList2 = moment.likes;
            int size = partialIdList2.ids.size();
            ArrayList<VDraweeView> arrayList = this.f44701T;
            if (size <= i2) {
                arrayList.get(i2).setOnClickListener(null);
                this.f44702U.get(i2).setOnClickListener(null);
                bnl0.m105525M0(this.f44701T.get(i2), false);
                bnl0.m105525M0(this.f44702U.get(i2), false);
            } else {
                bnl0.m105525M0(arrayList.get(i2), true);
                boolean zIsTeamAccount3 = User.isTeamAccount(moment.owner);
                ArrayList<VDraweeView> arrayList2 = this.f44701T;
                if (zIsTeamAccount3) {
                    arrayList2.get(i2).setOnClickListener(null);
                    this.f44702U.get(i2).setOnClickListener(null);
                } else {
                    arrayList2.get(i2).setOnClickListener(new View.OnClickListener() { // from class: l.qs00
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f159228a.m67996F(partialIdList2, i2, view);
                        }
                    });
                    this.f44702U.get(i2).setOnClickListener(new View.OnClickListener() { // from class: l.rs00
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f164622a.m67997G(partialIdList2, i2, view);
                        }
                    });
                }
                this.f44699R.m68070P(partialIdList2.ids.get(i2), new y20() { // from class: l.ss00
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f170425a.m67998H(i2, (User) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m68002M(Act act, final Moment moment) {
        act.dialog().m21535f0(new String[]{act.getString(R$string.f39956n), act.getString(R$string.f39900f)}).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.ts00
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f175955a.m67999I(moment, dialog, view, i, charSequence);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: N */
    public void m68003N(boolean z) {
        bnl0.m105524M(this.f44692K, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m68004s(this);
        this.f44711h.setOnClickListener(new View.OnClickListener() { // from class: l.ms00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138435a.m68006u(view);
            }
        });
        this.f44713j.setOnClickListener(new View.OnClickListener() { // from class: l.vs00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185549a.m68007v(view);
            }
        });
        this.f44715l.setOnClickListener(new View.OnClickListener() { // from class: l.ws00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190589a.m68008w(view);
            }
        });
        this.f44718o.setOnClickListener(new View.OnClickListener() { // from class: l.xs00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196053a.m68010y(view);
            }
        });
        this.f44701T = jyb.m147507f0(this.f44722s, this.f44724u, this.f44726w, this.f44728y, this.f44682A, this.f44684C);
        this.f44702U = jyb.m147507f0(this.f44723t, this.f44725v, this.f44727x, this.f44729z, this.f44683B, this.f44685D);
        this.f44707d.m67901s0();
    }

    /* JADX INFO: renamed from: s */
    public final void m68004s(View view) {
        et00.m122408a(this, view);
    }

    /* JADX INFO: renamed from: t */
    public final PutongAct m68005t() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m68006u(View view) {
        if (NullChecker.m82486a(this.f44699R)) {
            if (uqb0.f180396b0.f170325b.shouldLockComment(this.f44700S.owner)) {
                uqb0.f180396b0.f170325b.showProofAgeDlg(m68005t(), "moment_square");
            } else {
                this.f44699R.m68068N(this.f44700S);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m68007v(View view) {
        if (NullChecker.m82486a(this.f44699R)) {
            m68000J(this.f44700S, this.f44714k, true);
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m68008w(View view) {
        if (NullChecker.m82486a(this.f44699R)) {
            m68005t().startActivity(orb0.m168888e(m68005t(), this.f44700S.owner, false, false, false, false, null, -1));
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m68009x(Boolean bool) {
        this.f44699R.f44751l.m68022U4(bool.booleanValue());
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m68010y(View view) {
        PutongAct putongActM68005t = m68005t();
        Moment moment = this.f44700S;
        k3h.m148109x0(putongActM68005t, moment.owner, moment, null, new y20() { // from class: l.at00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73200a.m68009x((Boolean) obj);
            }
        }, null, false, false, true);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m68011z(View view) {
        m68005t().startActivityForResult(MomentsInProfileAct.m68095X1(m68005t(), this.f44700S.owner, "from_MomentsFeedAct"), 22);
    }

    public MomentViewLarge(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44700S = null;
    }

    public MomentViewLarge(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44700S = null;
    }
}
