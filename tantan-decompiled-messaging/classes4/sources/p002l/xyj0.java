package p002l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.view.LiveUserCardSkinView;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.view.UserCardContributionView;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.view.UserCardMedalAndNameView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveNewGiftWallEntranceView;
import com.p000p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardEntranceView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.LiveFansClubLevel;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveBoardGuard;
import com.p1.mobile.putong.live.base.data.BLiveUserFamilyCard;
import com.p1.mobile.putong.live.base.data.BLiveUserProfileConfig;
import com.p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy;
import com.p1.mobile.putong.live.livingroom.view.CardAnchorLevelView;
import com.p1.mobile.putong.live.livingroom.view.CardFansClubLevelView;
import com.p1.mobile.putong.live.livingroom.view.CardUserLevelView;
import com.p1.mobile.putong.live.livingroom.voice.usercard.view.UserCardFamilyGroupView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.agv;
import l.d1t;
import l.d30;
import l.dfg;
import l.e30;
import l.lsi0;
import l.mqv;
import l.s410;
import l.t100;
import l.uep0;
import l.uvr;
import l.vwb;
import l.w8u;
import l.w9j;
import l.xdl0;
import l.ypv;
import p002l.ho2;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xyj0<D extends ho2> extends LiveMenuDialogHolder<n1k0<D>> {

    /* JADX INFO: renamed from: A */
    public UserCardContributionView f22508A;

    /* JADX INFO: renamed from: B */
    public VText f22509B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f22510C;

    /* JADX INFO: renamed from: D */
    public VText f22511D;

    /* JADX INFO: renamed from: E */
    public VText f22512E;

    /* JADX INFO: renamed from: F */
    public VText f22513F;

    /* JADX INFO: renamed from: G */
    public VText f22514G;

    /* JADX INFO: renamed from: H */
    public VText f22515H;

    /* JADX INFO: renamed from: I */
    public VText f22516I;

    /* JADX INFO: renamed from: J */
    public VText f22517J;

    /* JADX INFO: renamed from: K */
    public View f22518K;

    /* JADX INFO: renamed from: L */
    public VImage f22519L;

    /* JADX INFO: renamed from: M */
    public VText f22520M;

    /* JADX INFO: renamed from: N */
    public VText f22521N;

    /* JADX INFO: renamed from: O */
    public VText f22522O;

    /* JADX INFO: renamed from: P */
    public LiveUserCardSkinView f22523P;

    /* JADX INFO: renamed from: Q */
    public User f22524Q;

    /* JADX INFO: renamed from: R */
    public BLiveUserProfileConfig f22525R;

    /* JADX INFO: renamed from: S */
    public mqv<User> f22526S;

    /* JADX INFO: renamed from: T */
    public p1k0 f22527T;

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f22528k;

    /* JADX INFO: renamed from: l */
    public View f22529l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f22530m;

    /* JADX INFO: renamed from: n */
    public CommonMaskAvatarView f22531n;

    /* JADX INFO: renamed from: o */
    public VImage f22532o;

    /* JADX INFO: renamed from: p */
    public CommonMaskAvatarView f22533p;

    /* JADX INFO: renamed from: q */
    public CommonMaskAvatarView f22534q;

    /* JADX INFO: renamed from: r */
    public UserCardMedalAndNameView f22535r;

    /* JADX INFO: renamed from: s */
    public VLinear f22536s;

    /* JADX INFO: renamed from: t */
    public CardUserLevelView f22537t;

    /* JADX INFO: renamed from: u */
    public CardAnchorLevelView f22538u;

    /* JADX INFO: renamed from: v */
    public CardFansClubLevelView f22539v;

    /* JADX INFO: renamed from: w */
    public UserCardFamilyGroupView f22540w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f22541x;

    /* JADX INFO: renamed from: y */
    public LiveGuardEntranceView f22542y;

    /* JADX INFO: renamed from: z */
    public LiveNewGiftWallEntranceView f22543z;

    public xyj0(@NonNull n1k0<D> n1k0Var) {
        super(t6c0.f20099z6, n1k0Var.act(), n1k0Var, j2g0.m15577c(0.3f));
    }

    /* JADX INFO: renamed from: S0 */
    private void m26198S0() {
        this.f22529l.setOnClickListener(new View.OnClickListener() { // from class: l.byj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8424a.m26239p0(view);
            }
        });
        xdl0.E0(this.f22531n, new View.OnClickListener() { // from class: l.myj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15744a.m26240q0(view);
            }
        });
        xdl0.E0(this.f22515H, new View.OnClickListener() { // from class: l.pyj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17722a.m26241r0(view);
            }
        });
        xdl0.E0(this.f22511D, new View.OnClickListener() { // from class: l.qyj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18274a.m26242s0(view);
            }
        });
        xdl0.E0(this.f22513F, new View.OnClickListener() { // from class: l.ryj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18723a.m26243t0(view);
            }
        });
        xdl0.E0(this.f22508A, new View.OnClickListener() { // from class: l.syj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19337a.m26244u0(view);
            }
        });
        xdl0.E0(this.f22542y, new View.OnClickListener() { // from class: l.tyj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20425a.m26245v0(view);
            }
        });
        xdl0.E0(this.f22543z, new View.OnClickListener() { // from class: l.uyj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20880a.m26208w0(view);
            }
        });
        this.f22508A.m6866f((n1k0) this.f3799b);
    }

    /* JADX INFO: renamed from: e0 */
    private void m26207e0() {
        if (this.f22528k == null) {
            return;
        }
        this.f22535r.m6873b();
        this.f22524Q = null;
        this.f22525R = null;
        uep0.w(false, new View[]{this.f22514G, this.f22530m, this.f22536s, this.f22510C});
        uep0.w(false, new View[]{this.f22519L, this.f22537t, this.f22538u, this.f22539v, this.f22540w});
        uep0.w(false, new View[]{this.f22508A, this.f22532o, this.f22511D, this.f22513F, this.f22515H});
        uep0.w(false, new View[]{this.f22517J, this.f22541x, this.f22509B, this.f22520M});
        this.f22531n.m5592i0();
        this.f22533p.m5592i0();
        this.f22534q.m5592i0();
        this.f22508A.m6865e();
        this.f22523P.m6849n0();
        this.f22540w.i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public /* synthetic */ void m26208w0(View view) {
        ((n1k0) this.f3799b).m18408a5(this.f22524Q);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m26209A0(p1k0 p1k0Var, boolean z, boolean z2, String str, User user) {
        String str2;
        String str3;
        this.f22539v.setVisibility(0);
        d30 d30Var = new d30() { // from class: l.fyj0
            public final void call() {
                this.f10686a.m26229f0();
            }
        };
        if (p1k0Var == null || p1k0Var.m19971k() == null) {
            str2 = "";
            str3 = str2;
        } else {
            LiveFansClubLevel liveFansClubLevel = user.fanbaseHierarchy;
            String str4 = liveFansClubLevel.shadingFrontUrl;
            str3 = liveFansClubLevel.shadingBackUrl;
            str2 = str4;
        }
        this.f22539v.L(user, str2, str3, z, z2, str, d30Var);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m26210B0(final p1k0 p1k0Var, final User user) {
        this.f22537t.setVisibility(0);
        if (p1k0Var == null || p1k0Var.m19970j() == null) {
            this.f22537t.L(user, p1k0Var, "", "", new d30() { // from class: l.lyj0
                public final void call() {
                    this.f15174a.m26230g0(user);
                }
            });
        } else {
            this.f22537t.L(user, p1k0Var, p1k0Var.m19970j().shadingFrontUrl, p1k0Var.m19970j().shadingBackUrl, new d30() { // from class: l.nyj0
                public final void call() {
                    this.f16309a.m26231h0(p1k0Var, user);
                }
            });
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: C0 */
    public Context mo5210C0() {
        return ((n1k0) this.f3799b).act();
    }

    /* JADX INFO: renamed from: D0 */
    public final void m26211D0(p1k0 p1k0Var, boolean z, boolean z2, String str) {
        final xyj0<D> xyj0Var;
        p1k0 p1k0Var2;
        this.f22527T = p1k0Var;
        this.f22524Q = p1k0Var == null ? null : (User) p1k0Var.f16959c.a;
        this.f22525R = p1k0Var == null ? null : p1k0Var.m19973m();
        User user = this.f22524Q;
        this.f22526S = p1k0Var != null ? p1k0Var.f16959c : null;
        VText vText = this.f22522O;
        boolean z3 = false;
        if (user == null) {
            vText.setVisibility(0);
            return;
        }
        vText.setVisibility(8);
        m26218L0();
        if (d1t.a(this.f22526S).d()) {
            m26222P0();
            xyj0Var = this;
        } else {
            if (((n1k0) this.f3799b).m18391I4() || user.anchorHierarchy.wealth > 0) {
                this.f22536s.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            if (((n1k0) this.f3799b).m18391I4() && !this.f22525R.isHiddenUserHierachy) {
                m26210B0(p1k0Var, user);
                arrayList.add(this.f22537t);
            }
            if (user.anchorHierarchy.grade > 0 && !this.f22525R.isHiddenAnchorHierachy) {
                m26248z0(p1k0Var, user);
                arrayList.add(this.f22538u);
            }
            if (TextUtils.isEmpty(user.fanbaseHierarchy.title)) {
                xyj0Var = this;
                p1k0Var2 = p1k0Var;
            } else {
                xyj0Var = this;
                p1k0Var2 = p1k0Var;
                xyj0Var.m26209A0(p1k0Var2, z, z2, str, user);
                arrayList.add(xyj0Var.f22539v);
            }
            final BLiveUserFamilyCard bLiveUserFamilyCardM19968h = p1k0Var2.m19968h();
            if (bLiveUserFamilyCardM19968h != null && !TextUtils.isEmpty(bLiveUserFamilyCardM19968h.schema)) {
                xyj0Var.f22540w.j0(bLiveUserFamilyCardM19968h);
                xdl0.E0(xyj0Var.f22540w, new View.OnClickListener() { // from class: l.dyj0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f9486a.m26232i0(bLiveUserFamilyCardM19968h, view);
                    }
                });
                arrayList.add(xyj0Var.f22540w);
            }
            xyj0Var.m26228d0(arrayList);
            xyj0Var.m26215I0();
        }
        xyj0Var.m26214H0();
        xyj0Var.f22523P.m6859y0(xyj0Var.f22526S, xyj0Var.f22529l);
        LiveUserCardSkinView liveUserCardSkinView = xyj0Var.f22523P;
        FrameLayout frameLayout = xyj0Var.f22530m;
        BLiveUserProfileConfig bLiveUserProfileConfig = xyj0Var.f22525R;
        if (bLiveUserProfileConfig != null && bLiveUserProfileConfig.enableNewPrivilege) {
            z3 = true;
        }
        liveUserCardSkinView.m6847D0(frameLayout, z3);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m26212E0() {
        if (d1t.a(this.f22526S).d()) {
            this.f22511D.setText(ypv.e.getString(R$string.f2981Re));
        } else {
            boolean zIsFemale = this.f22524Q.isFemale();
            VText vText = this.f22511D;
            if (zIsFemale) {
                vText.setText(ypv.e.getString(R$string.f3002Se));
            } else {
                vText.setText(ypv.e.getString(R$string.f2960Qe));
            }
        }
        this.f22511D.setVisibility(0);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m26213G0(int i) {
        if (d1t.a(this.f22526S).d()) {
            xdl0.M(this.f22514G, false);
            return;
        }
        ((n1k0) this.f3799b).mo16455W3(this.f22524Q, i);
        T t = this.f3799b;
        dck0.m11746n(t, ((n1k0) t).mo18414g4(), ((n1k0) this.f3799b).m18388F4(), ((n1k0) this.f3799b).mo21430R2());
    }

    /* JADX INFO: renamed from: H0 */
    public void m26214H0() {
        BLiveUserProfileConfig bLiveUserProfileConfig = this.f22525R;
        if (bLiveUserProfileConfig == null) {
            return;
        }
        if (bLiveUserProfileConfig.jumpConfig.size() == 0) {
            this.f22510C.setVisibility(8);
            this.f22518K.setVisibility(0);
            xdl0.M(this.f22517J, false);
            return;
        }
        this.f22518K.setVisibility(8);
        this.f22510C.setVisibility(0);
        xdl0.M(this.f22517J, false);
        xdl0.M(this.f22512E, false);
        xdl0.M(this.f22516I, false);
        int i = 0;
        while (true) {
            if (i >= this.f22525R.jumpConfig.size()) {
                ArrayList arrayList = new ArrayList();
                if (xdl0.O0(this.f22511D)) {
                    arrayList.add(vwb.Y("at", this.f22511D));
                }
                if (xdl0.O0(this.f22513F)) {
                    arrayList.add(vwb.Y("gift", this.f22513F));
                }
                if (xdl0.O0(this.f22514G)) {
                    arrayList.add(vwb.Y("follow", this.f22514G));
                }
                int size = arrayList.size();
                VText vText = this.f22515H;
                if (size == 3) {
                    xdl0.M(vText, false);
                    xdl0.M(this.f22516I, false);
                    return;
                }
                if (xdl0.O0(vText)) {
                    if (arrayList.size() >= 2 && xdl0.O0(this.f22514G) && xdl0.O0(this.f22516I)) {
                        xdl0.M(this.f22515H, false);
                    } else {
                        arrayList.add(vwb.Y("jumpOtherRoom", this.f22515H));
                    }
                }
                if (arrayList.size() == 3) {
                    xdl0.M(this.f22516I, false);
                    return;
                }
                return;
            }
            String str = (String) this.f22525R.jumpConfig.get(i);
            str.getClass();
            switch (str) {
                case "maskSwitch":
                    m26221O0();
                    break;
                case "jumpOtherRoom":
                    m26217K0();
                    break;
                case "follow":
                    m26213G0(this.f22525R.jumpConfig.size());
                    break;
                case "multiCall":
                    m26220N0();
                    break;
                case "at":
                    m26212E0();
                    break;
                case "gift":
                    m26223Q0();
                    break;
                case "fanbaseGroup":
                    m26216J0();
                    break;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m26215I0() {
        BLiveUserProfileConfig bLiveUserProfileConfig = this.f22525R;
        if (bLiveUserProfileConfig == null) {
            return;
        }
        if (!bLiveUserProfileConfig.contributionListShow) {
            this.f22508A.setVisibility(8);
        } else {
            ((n1k0) this.f3799b).m18417h5();
            this.f22508A.setVisibility(0);
        }
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2] */
    /* JADX INFO: renamed from: J0 */
    public final void m26216J0() {
        xdl0.M(this.f22516I, true);
        final boolean z = TextUtils.equals(((DbObject) ((User) this.f22527T.f16959c.a)).id, ((DbObject) ((n1k0) this.f3799b).m25547E2().m14582l0()).id) && TextUtils.equals(ypv.a.D0(), ((DbObject) ((n1k0) this.f3799b).m25547E2().m14582l0()).id);
        if (this.f22525R.hasFanbaseGroup || !z) {
            this.f22516I.setText(R$string.f3664x3);
        } else {
            this.f22516I.setText(R$string.f3488p3);
            dfg.b(true, true);
        }
        xdl0.E0(this.f22516I, new View.OnClickListener() { // from class: l.wyj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22042a.m26233j0(z, view);
            }
        });
    }

    /* JADX INFO: renamed from: K0 */
    public final void m26217K0() {
        boolean zD = d1t.a(this.f22526S).d();
        VText vText = this.f22515H;
        if (zD) {
            xdl0.M(vText, false);
            return;
        }
        xdl0.M(vText, true);
        this.f22515H.setText(w8u.t(this.f22524Q.isFemale() ? R$string.f2604A5 : R$string.f2626B5));
        this.f22515H.setVisibility(0);
        ((n1k0) this.f3799b).m18421l5();
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [l.ho2] */
    /* JADX INFO: renamed from: L0 */
    public final void m26218L0() {
        agv.b(this.f22531n, t100.d(100.0f), this.f22526S, new w9j() { // from class: l.iyj0
            public final Object call(Object obj) {
                return ((User) obj).fp().profileSmall().formatted();
            }
        });
        if (ypv.k().b7() && NullChecker.a(this.f22524Q) && ((DbObject) this.f22524Q).id.equals(((DbObject) ((n1k0) this.f3799b).m25547E2().m14582l0()).id) && NullChecker.a(this.f22527T.m19979s()) && !TextUtils.isEmpty(this.f22527T.m19979s().userImage)) {
            xdl0.M(this.f22533p, true);
            agv.g(this.f22533p, t100.d(44.0f), this.f22527T.m19979s().userImage, "", this.f22527T.m19979s().avatar);
            xdl0.E0(this.f22533p, new View.OnClickListener() { // from class: l.jyj0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14135a.m26234k0(view);
                }
            });
            this.f22533p.getRealAvatarView().m5604u(0.85f);
        } else {
            xdl0.M(this.f22533p, false);
        }
        xdl0.M(this.f22530m, true);
        boolean zM5594k0 = this.f22531n.m5594k0();
        FrameLayout frameLayout = this.f22530m;
        if (zM5594k0) {
            xdl0.U(frameLayout, t100.d(2.0f));
            this.f22530m.setBackground(null);
            xdl0.M(this.f22532o, false);
        } else {
            xdl0.U(frameLayout, t100.d(-6.0f));
            boolean zD = d1t.a(this.f22526S).d();
            FrameLayout frameLayout2 = this.f22530m;
            if (zD) {
                frameLayout2.setBackground(null);
                xdl0.M(this.f22532o, false);
            } else {
                frameLayout2.setBackgroundResource(i3c0.f12455C8);
                xdl0.M(this.f22532o, !xdl0.O0(this.f22533p));
                ypv.a.s0(this.f22532o.getContext(), this.f22524Q, this.f22532o);
            }
        }
        final BLiveBoardGuard bLiveBoardGuardM19966f = this.f22527T.m19966f();
        ConstraintLayout constraintLayout = this.f22534q;
        if (bLiveBoardGuardM19966f == null) {
            xdl0.M(constraintLayout, false);
            return;
        }
        xdl0.M(constraintLayout, true);
        agv.g(this.f22534q, t100.d(48.0f), bLiveBoardGuardM19966f.userAvatar, bLiveBoardGuardM19966f.userAvatarFrame, "");
        xdl0.E0(this.f22534q, new View.OnClickListener() { // from class: l.kyj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14585a.m26235l0(bLiveBoardGuardM19966f, view);
            }
        });
    }

    /* JADX INFO: renamed from: M0 */
    public void m26219M0() {
        this.f22512E.setText(w8u.t(R$string.f3647w8));
        VText vText = this.f22512E;
        vText.setTextColor(vText.getResources().getColor(h1c0.f11800k1));
        xdl0.y(this.f22512E, false);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m26220N0() {
        xdl0.M(this.f22512E, true);
        this.f22512E.setText(w8u.t(R$string.f2673D8));
        this.f22512E.setTextColor(mo5210C0().getResources().getColor(h1c0.f11782e1));
        xdl0.y(this.f22512E, true);
        xdl0.E0(this.f22512E, new View.OnClickListener() { // from class: l.cyj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8985a.m26236m0(view);
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public final void m26221O0() {
        boolean zD = d1t.a(this.f22526S).d();
        VText vText = this.f22517J;
        if (zD) {
            xdl0.M(vText, false);
        } else {
            xdl0.M(vText, true);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m26222P0() {
        xdl0.M(this.f22509B, true);
        ((n1k0) this.f3799b).m18389G4(((DbObject) this.f22524Q).id, new e30() { // from class: l.eyj0
            public final void call(Object obj) {
                this.f10050a.m26237n0((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m26223Q0() {
        if (d1t.a(this.f22526S).d()) {
            xdl0.M(this.f22513F, false);
        } else {
            r1k0.m21727i();
            this.f22513F.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m26224R0(View view, final String str) {
        boolean zP0 = uvr.d().P0();
        xdl0.M(view, zP0);
        if (zP0) {
            xdl0.E0(view, new View.OnClickListener() { // from class: l.vyj0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f21382a.m26238o0(str, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: T0 */
    public void m26225T0(boolean z, p1k0 p1k0Var, boolean z2, boolean z3, String str) {
        if (p1k0Var == null || p1k0Var.m19975o() == null) {
            return;
        }
        m26207e0();
        m5208B(z);
        m5211E();
        m26211D0(p1k0Var, z2, z3, str);
        m26224R0(this.f22521N, ((DbObject) ((User) p1k0Var.m19975o().a)).id);
    }

    public Act act() {
        return ((n1k0) this.f3799b).act();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m26226b0(View view) {
        yyj0.m26980a(this, view);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m26228d0(List<View> list) {
        if (list.size() == 3) {
            final int iY0 = (int) ((xdl0.y0() - t100.d(58.0f)) / 3.0f);
            vwb.z(list, new e30() { // from class: l.gyj0
                public final void call(Object obj) {
                    ((View) obj).setLayoutParams(new LinearLayout.LayoutParams(iY0, t100.d(56.0f)));
                }
            });
            xdl0.V(list.get(1), t100.d(9.0f));
            xdl0.W(list.get(1), t100.d(9.0f));
            return;
        }
        vwb.z(list, new e30() { // from class: l.hyj0
            public final void call(Object obj) {
                ((View) obj).setLayoutParams(new LinearLayout.LayoutParams(t100.d(106.0f), t100.d(56.0f)));
            }
        });
        if (list.size() > 1) {
            xdl0.W(list.get(0), t100.d(9.0f));
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m26229f0() {
        ((n1k0) this.f3799b).m25548F2().FansClubEvent.showFansClubDialog().j(Boolean.TRUE);
        mo5216p();
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m26230g0(User user) {
        this.f22537t.S(user);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m26231h0(p1k0 p1k0Var, User user) {
        BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy = (BLiveUserProfileConfigHierarchy) vwb.r(p1k0Var.m19973m().hierarchy, new w9j() { // from class: l.oyj0
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveUserProfileConfigHierarchy) obj).type, "user"));
            }
        });
        if (bLiveUserProfileConfigHierarchy == null || !p1k0Var.m19973m().enableNewPrivilege || ((DbObject) user).id.equals(ypv.a.D0())) {
            this.f22537t.S(user);
        } else {
            ((n1k0) this.f3799b).mo14197p3(3800, bLiveUserProfileConfigHierarchy.jumpScheme);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m26232i0(BLiveUserFamilyCard bLiveUserFamilyCard, View view) {
        ((n1k0) this.f3799b).mo14197p3(3800, bLiveUserFamilyCard.schema);
        ((n1k0) this.f3799b).m18386D4(null);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m26233j0(boolean z, View view) {
        mo5216p();
        BLiveUserProfileConfig bLiveUserProfileConfig = this.f22525R;
        if (z) {
            boolean z2 = bLiveUserProfileConfig.hasFanbaseGroup;
            T t = this.f3799b;
            if (z2) {
                ((n1k0) t).m25548F2().FansGroupEvent.showFansGroupPanel().j(Boolean.TRUE);
                return;
            } else {
                ((n1k0) t).m18385C4();
                dfg.a(true, true);
                return;
            }
        }
        if (!bLiveUserProfileConfig.hasFanbaseGroup) {
            lsi0.w(R$string.f3532r3);
            return;
        }
        boolean z3 = bLiveUserProfileConfig.isUserInFanbaseGroup;
        T t2 = this.f3799b;
        if (z3) {
            ((n1k0) t2).m25548F2().FansGroupEvent.showFansGroupPanel().j(Boolean.TRUE);
        } else {
            ((n1k0) t2).m25548F2().FansGroupEvent.showApplyDialog().j(((DbObject) ((User) this.f22527T.f16959c.a)).id);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m26234k0(View view) {
        ((n1k0) this.f3799b).m18419j5();
        mo5216p();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m26235l0(BLiveBoardGuard bLiveBoardGuard, View view) {
        ((n1k0) this.f3799b).mo14197p3(3800, bLiveBoardGuard.schema);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(View view) {
        m26226b0(view);
        LiveUserCardSkinView liveUserCardSkinView = (LiveUserCardSkinView) view.findViewById(g5c0.f10904M7);
        this.f22523P = liveUserCardSkinView;
        liveUserCardSkinView.setDialogHost(this);
        m5222z(LiveDialogEnum.USER_CARD);
        m26198S0();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m26236m0(View view) {
        ((n1k0) this.f3799b).m18412e5(this.f22524Q, s410.D);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m26237n0(String str) {
        VText vText = this.f22509B;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        vText.setText(str);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m26238o0(String str, View view) {
        ((n1k0) this.f3799b).m18418i5(str);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m26239p0(View view) {
        ((n1k0) this.f3799b).mo19187Y3();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m26240q0(View view) {
        if (this.f22524Q == null || d1t.a(this.f22526S).d()) {
            return;
        }
        ((n1k0) this.f3799b).m18410c5(act(), (User) this.f22526S.a, ((DbObject) this.f22524Q).id);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m26241r0(View view) {
        ((n1k0) this.f3799b).m18406Y4();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m26242s0(View view) {
        m26247y0();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m26243t0(View view) {
        ((n1k0) this.f3799b).m18413f5(this.f22524Q);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m26244u0(View view) {
        ((n1k0) this.f3799b).m18407Z4();
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m26245v0(View view) {
        ((n1k0) this.f3799b).m18409b5(this.f22524Q);
    }

    /* JADX INFO: renamed from: x0 */
    public void m26246x0(y16 y16Var) {
        this.f22508A.m6870j(y16Var);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m26247y0() {
        if (this.f22524Q == null) {
            return;
        }
        String strConcat = "@" + this.f22524Q.name + " ";
        int length = strConcat.length();
        int i = jw4.f14064E;
        if (length > i) {
            strConcat = strConcat.substring(0, i - 4).concat("... ");
        }
        ((n1k0) this.f3799b).m18405X4(strConcat);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m26248z0(p1k0 p1k0Var, User user) {
        this.f22538u.setVisibility(0);
        if (p1k0Var == null || p1k0Var.m19965e() == null) {
            this.f22538u.O(user, "", "");
        } else {
            this.f22538u.O(user, p1k0Var.m19965e().shadingFrontUrl, p1k0Var.m19965e().shadingBackUrl);
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void mo5212i1(n1k0<D> n1k0Var) {
    }
}
