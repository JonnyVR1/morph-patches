package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.LiveFansClubLevel;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveBoardGuard;
import com.p051p1.mobile.putong.live.base.data.BLiveUserFamilyCard;
import com.p051p1.mobile.putong.live.base.data.BLiveUserProfileConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.view.LiveUserCardSkinView;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.view.UserCardContributionView;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.view.UserCardMedalAndNameView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveNewGiftWallEntranceView;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardEntranceView;
import com.p051p1.mobile.putong.live.livingroom.view.CardAnchorLevelView;
import com.p051p1.mobile.putong.live.livingroom.view.CardFansClubLevelView;
import com.p051p1.mobile.putong.live.livingroom.view.CardUserLevelView;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.view.UserCardFamilyGroupView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class d8k0<D extends oo2> extends LiveMenuDialogHolder<tak0<D>> {

    /* JADX INFO: renamed from: A */
    public UserCardContributionView f85615A;

    /* JADX INFO: renamed from: B */
    public VText f85616B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f85617C;

    /* JADX INFO: renamed from: D */
    public VText f85618D;

    /* JADX INFO: renamed from: E */
    public VText f85619E;

    /* JADX INFO: renamed from: F */
    public VText f85620F;

    /* JADX INFO: renamed from: G */
    public VText f85621G;

    /* JADX INFO: renamed from: H */
    public VText f85622H;

    /* JADX INFO: renamed from: I */
    public VText f85623I;

    /* JADX INFO: renamed from: J */
    public VText f85624J;

    /* JADX INFO: renamed from: K */
    public View f85625K;

    /* JADX INFO: renamed from: L */
    public VImage f85626L;

    /* JADX INFO: renamed from: M */
    public VText f85627M;

    /* JADX INFO: renamed from: N */
    public VText f85628N;

    /* JADX INFO: renamed from: O */
    public VText f85629O;

    /* JADX INFO: renamed from: P */
    public LiveUserCardSkinView f85630P;

    /* JADX INFO: renamed from: Q */
    public User f85631Q;

    /* JADX INFO: renamed from: R */
    public BLiveUserProfileConfig f85632R;

    /* JADX INFO: renamed from: S */
    public nsv<User> f85633S;

    /* JADX INFO: renamed from: T */
    public vak0 f85634T;

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f85635k;

    /* JADX INFO: renamed from: l */
    public View f85636l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f85637m;

    /* JADX INFO: renamed from: n */
    public CommonMaskAvatarView f85638n;

    /* JADX INFO: renamed from: o */
    public VImage f85639o;

    /* JADX INFO: renamed from: p */
    public CommonMaskAvatarView f85640p;

    /* JADX INFO: renamed from: q */
    public CommonMaskAvatarView f85641q;

    /* JADX INFO: renamed from: r */
    public UserCardMedalAndNameView f85642r;

    /* JADX INFO: renamed from: s */
    public VLinear f85643s;

    /* JADX INFO: renamed from: t */
    public CardUserLevelView f85644t;

    /* JADX INFO: renamed from: u */
    public CardAnchorLevelView f85645u;

    /* JADX INFO: renamed from: v */
    public CardFansClubLevelView f85646v;

    /* JADX INFO: renamed from: w */
    public UserCardFamilyGroupView f85647w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f85648x;

    /* JADX INFO: renamed from: y */
    public LiveGuardEntranceView f85649y;

    /* JADX INFO: renamed from: z */
    public LiveNewGiftWallEntranceView f85650z;

    public d8k0(@NonNull tak0<D> tak0Var) {
        super(yec0.f199335z6, tak0Var.act(), tak0Var, qag0.m175922c(0.3f));
    }

    /* JADX INFO: renamed from: S0 */
    private void m114862S0() {
        this.f85636l.setOnClickListener(new View.OnClickListener() { // from class: l.h7k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108139a.m114903p0(view);
            }
        });
        bnl0.m105509E0(this.f85638n, new View.OnClickListener() { // from class: l.s7k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166698a.m114904q0(view);
            }
        });
        bnl0.m105509E0(this.f85622H, new View.OnClickListener() { // from class: l.v7k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182780a.m114905r0(view);
            }
        });
        bnl0.m105509E0(this.f85618D, new View.OnClickListener() { // from class: l.w7k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187767a.m114906s0(view);
            }
        });
        bnl0.m105509E0(this.f85620F, new View.OnClickListener() { // from class: l.x7k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192731a.m114907t0(view);
            }
        });
        bnl0.m105509E0(this.f85615A, new View.OnClickListener() { // from class: l.y7k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197786a.m114908u0(view);
            }
        });
        bnl0.m105509E0(this.f85649y, new View.OnClickListener() { // from class: l.z7k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203253a.m114909v0(view);
            }
        });
        bnl0.m105509E0(this.f85650z, new View.OnClickListener() { // from class: l.a8k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68930a.m114872w0(view);
            }
        });
        this.f85615A.m74513f((tak0) this.f48605b);
    }

    /* JADX INFO: renamed from: e0 */
    private void m114871e0() {
        if (this.f85635k == null) {
            return;
        }
        this.f85642r.m74520b();
        this.f85631Q = null;
        this.f85632R = null;
        ynp0.m216946w(false, this.f85621G, this.f85637m, this.f85643s, this.f85617C);
        ynp0.m216946w(false, this.f85626L, this.f85644t, this.f85645u, this.f85646v, this.f85647w);
        ynp0.m216946w(false, this.f85615A, this.f85639o, this.f85618D, this.f85620F, this.f85622H);
        ynp0.m216946w(false, this.f85624J, this.f85648x, this.f85616B, this.f85627M);
        this.f85638n.m73302i0();
        this.f85640p.m73302i0();
        this.f85641q.m73302i0();
        this.f85615A.m74512e();
        this.f85630P.m74496n0();
        this.f85647w.m79910i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public /* synthetic */ void m114872w0(View view) {
        ((tak0) this.f48605b).m189901a5(this.f85631Q);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m114873A0(vak0 vak0Var, boolean z, boolean z2, String str, User user) {
        String str2;
        String str3;
        this.f85646v.setVisibility(0);
        x20 x20Var = new x20() { // from class: l.l7k0
            @Override // p153l.x20
            public final void call() {
                this.f130366a.m114893f0();
            }
        };
        if (vak0Var == null || vak0Var.m200536k() == null) {
            str2 = "";
            str3 = str2;
        } else {
            LiveFansClubLevel liveFansClubLevel = user.fanbaseHierarchy;
            String str4 = liveFansClubLevel.shadingFrontUrl;
            str3 = liveFansClubLevel.shadingBackUrl;
            str2 = str4;
        }
        this.f85646v.m77610L(user, str2, str3, z, z2, str, x20Var);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m114874B0(final vak0 vak0Var, final User user) {
        this.f85644t.setVisibility(0);
        if (vak0Var == null || vak0Var.m200535j() == null) {
            this.f85644t.m77630L(user, vak0Var, "", "", new x20() { // from class: l.r7k0
                @Override // p153l.x20
                public final void call() {
                    this.f161621a.m114894g0(user);
                }
            });
        } else {
            this.f85644t.m77630L(user, vak0Var, vak0Var.m200535j().shadingFrontUrl, vak0Var.m200535j().shadingBackUrl, new x20() { // from class: l.t7k0
                @Override // p153l.x20
                public final void call() {
                    this.f172451a.m114895h0(vak0Var, user);
                }
            });
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((tak0) this.f48605b).act();
    }

    /* JADX INFO: renamed from: D0 */
    public final void m114875D0(vak0 vak0Var, boolean z, boolean z2, String str) {
        final d8k0<D> d8k0Var;
        vak0 vak0Var2;
        this.f85634T = vak0Var;
        this.f85631Q = vak0Var == null ? null : vak0Var.f183108c.f143542a;
        this.f85632R = vak0Var == null ? null : vak0Var.m200538m();
        User user = this.f85631Q;
        this.f85633S = vak0Var != null ? vak0Var.f183108c : null;
        VText vText = this.f85629O;
        boolean z3 = false;
        if (user == null) {
            vText.setVisibility(0);
            return;
        }
        vText.setVisibility(8);
        m114882L0();
        if (e3t.m119319a(this.f85633S).m119322d()) {
            m114886P0();
            d8k0Var = this;
        } else {
            if (((tak0) this.f48605b).m189884I4() || user.anchorHierarchy.wealth > 0) {
                this.f85643s.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            if (((tak0) this.f48605b).m189884I4() && !this.f85632R.isHiddenUserHierachy) {
                m114874B0(vak0Var, user);
                arrayList.add(this.f85644t);
            }
            if (user.anchorHierarchy.grade > 0 && !this.f85632R.isHiddenAnchorHierachy) {
                m114912z0(vak0Var, user);
                arrayList.add(this.f85645u);
            }
            if (TextUtils.isEmpty(user.fanbaseHierarchy.title)) {
                d8k0Var = this;
                vak0Var2 = vak0Var;
            } else {
                d8k0Var = this;
                vak0Var2 = vak0Var;
                d8k0Var.m114873A0(vak0Var2, z, z2, str, user);
                arrayList.add(d8k0Var.f85646v);
            }
            final BLiveUserFamilyCard bLiveUserFamilyCardM200533h = vak0Var2.m200533h();
            if (bLiveUserFamilyCardM200533h != null && !TextUtils.isEmpty(bLiveUserFamilyCardM200533h.schema)) {
                d8k0Var.f85647w.m79911j0(bLiveUserFamilyCardM200533h);
                bnl0.m105509E0(d8k0Var.f85647w, new View.OnClickListener() { // from class: l.j7k0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f118693a.m114896i0(bLiveUserFamilyCardM200533h, view);
                    }
                });
                arrayList.add(d8k0Var.f85647w);
            }
            d8k0Var.m114892d0(arrayList);
            d8k0Var.m114879I0();
        }
        d8k0Var.m114878H0();
        d8k0Var.f85630P.m74506y0(d8k0Var.f85633S, d8k0Var.f85636l);
        LiveUserCardSkinView liveUserCardSkinView = d8k0Var.f85630P;
        FrameLayout frameLayout = d8k0Var.f85637m;
        BLiveUserProfileConfig bLiveUserProfileConfig = d8k0Var.f85632R;
        if (bLiveUserProfileConfig != null && bLiveUserProfileConfig.enableNewPrivilege) {
            z3 = true;
        }
        liveUserCardSkinView.m74494D0(frameLayout, z3);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m114876E0() {
        if (e3t.m119319a(this.f85633S).m119322d()) {
            this.f85618D.setText(zrv.f205803e.getString(R$string.f47787Re));
        } else {
            boolean zIsFemale = this.f85631Q.isFemale();
            VText vText = this.f85618D;
            if (zIsFemale) {
                vText.setText(zrv.f205803e.getString(R$string.f47808Se));
            } else {
                vText.setText(zrv.f205803e.getString(R$string.f47766Qe));
            }
        }
        this.f85618D.setVisibility(0);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m114877G0(int i) {
        if (e3t.m119319a(this.f85633S).m119322d()) {
            bnl0.m105524M(this.f85621G, false);
            return;
        }
        ((tak0) this.f48605b).mo159723W3(this.f85631Q, i);
        T t = this.f48605b;
        jlk0.m146092n(t, ((tak0) t).mo159733g4(), ((tak0) this.f48605b).m189881F4(), ((tak0) this.f48605b).mo78457R2());
    }

    /* JADX INFO: renamed from: H0 */
    public void m114878H0() {
        BLiveUserProfileConfig bLiveUserProfileConfig = this.f85632R;
        if (bLiveUserProfileConfig == null) {
            return;
        }
        if (bLiveUserProfileConfig.jumpConfig.size() == 0) {
            this.f85617C.setVisibility(8);
            this.f85625K.setVisibility(0);
            bnl0.m105524M(this.f85624J, false);
            return;
        }
        this.f85625K.setVisibility(8);
        this.f85617C.setVisibility(0);
        bnl0.m105524M(this.f85624J, false);
        bnl0.m105524M(this.f85619E, false);
        bnl0.m105524M(this.f85623I, false);
        int i = 0;
        while (true) {
            if (i >= this.f85632R.jumpConfig.size()) {
                ArrayList arrayList = new ArrayList();
                if (bnl0.m105529O0(this.f85618D)) {
                    arrayList.add(jyb.m147494Y("at", this.f85618D));
                }
                if (bnl0.m105529O0(this.f85620F)) {
                    arrayList.add(jyb.m147494Y("gift", this.f85620F));
                }
                if (bnl0.m105529O0(this.f85621G)) {
                    arrayList.add(jyb.m147494Y("follow", this.f85621G));
                }
                int size = arrayList.size();
                VText vText = this.f85622H;
                if (size == 3) {
                    bnl0.m105524M(vText, false);
                    bnl0.m105524M(this.f85623I, false);
                    return;
                }
                if (bnl0.m105529O0(vText)) {
                    if (arrayList.size() >= 2 && bnl0.m105529O0(this.f85621G) && bnl0.m105529O0(this.f85623I)) {
                        bnl0.m105524M(this.f85622H, false);
                    } else {
                        arrayList.add(jyb.m147494Y("jumpOtherRoom", this.f85622H));
                    }
                }
                if (arrayList.size() == 3) {
                    bnl0.m105524M(this.f85623I, false);
                    return;
                }
                return;
            }
            String str = this.f85632R.jumpConfig.get(i);
            str.getClass();
            switch (str) {
                case "maskSwitch":
                    m114885O0();
                    break;
                case "jumpOtherRoom":
                    m114881K0();
                    break;
                case "follow":
                    m114877G0(this.f85632R.jumpConfig.size());
                    break;
                case "multiCall":
                    m114884N0();
                    break;
                case "at":
                    m114876E0();
                    break;
                case "gift":
                    m114887Q0();
                    break;
                case "fanbaseGroup":
                    m114880J0();
                    break;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m114879I0() {
        BLiveUserProfileConfig bLiveUserProfileConfig = this.f85632R;
        if (bLiveUserProfileConfig == null) {
            return;
        }
        if (!bLiveUserProfileConfig.contributionListShow) {
            this.f85615A.setVisibility(8);
        } else {
            ((tak0) this.f48605b).m189908h5();
            this.f85615A.setVisibility(0);
        }
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.oo2] */
    /* JADX INFO: renamed from: J0 */
    public final void m114880J0() {
        bnl0.m105524M(this.f85623I, true);
        final boolean z = TextUtils.equals(this.f85634T.f183108c.f143542a.f56859id, ((tak0) this.f48605b).m213810E2().m168532l0().f56859id) && TextUtils.equals(zrv.f205799a.m207631D0(), ((tak0) this.f48605b).m213810E2().m168532l0().f56859id);
        if (this.f85632R.hasFanbaseGroup || !z) {
            this.f85623I.setText(R$string.f48470x3);
        } else {
            this.f85623I.setText(R$string.f48294p3);
            rgg.m181443b(true, true);
        }
        bnl0.m105509E0(this.f85623I, new View.OnClickListener() { // from class: l.c8k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80220a.m114897j0(z, view);
            }
        });
    }

    /* JADX INFO: renamed from: K0 */
    public final void m114881K0() {
        boolean zM119322d = e3t.m119319a(this.f85633S).m119322d();
        VText vText = this.f85622H;
        if (zM119322d) {
            bnl0.m105524M(vText, false);
            return;
        }
        bnl0.m105524M(vText, true);
        this.f85622H.setText(xau.m209910t(this.f85631Q.isFemale() ? R$string.f47410A5 : R$string.f47432B5));
        this.f85622H.setVisibility(0);
        ((tak0) this.f48605b).m189912l5();
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [l.oo2] */
    /* JADX INFO: renamed from: L0 */
    public final void m114882L0() {
        biv.m104517b(this.f85638n, qa00.m175859d(100.0f), this.f85633S, new qcj() { // from class: l.o7k0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).m61308fp().profileSmall().formatted();
            }
        });
        if (zrv.m221193k().m203589b7() && NullChecker.m82486a(this.f85631Q) && this.f85631Q.f56859id.equals(((tak0) this.f48605b).m213810E2().m168532l0().f56859id) && NullChecker.m82486a(this.f85634T.m200544s()) && !TextUtils.isEmpty(this.f85634T.m200544s().userImage)) {
            bnl0.m105524M(this.f85640p, true);
            biv.m104522g(this.f85640p, qa00.m175859d(44.0f), this.f85634T.m200544s().userImage, "", this.f85634T.m200544s().avatar);
            bnl0.m105509E0(this.f85640p, new View.OnClickListener() { // from class: l.p7k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f150947a.m114898k0(view);
                }
            });
            this.f85640p.getRealAvatarView().m73314u(0.85f);
        } else {
            bnl0.m105524M(this.f85640p, false);
        }
        bnl0.m105524M(this.f85637m, true);
        boolean zM73304k0 = this.f85638n.m73304k0();
        FrameLayout frameLayout = this.f85637m;
        if (zM73304k0) {
            bnl0.m105537U(frameLayout, qa00.m175859d(2.0f));
            this.f85637m.setBackground(null);
            bnl0.m105524M(this.f85639o, false);
        } else {
            bnl0.m105537U(frameLayout, qa00.m175859d(-6.0f));
            boolean zM119322d = e3t.m119319a(this.f85633S).m119322d();
            FrameLayout frameLayout2 = this.f85637m;
            if (zM119322d) {
                frameLayout2.setBackground(null);
                bnl0.m105524M(this.f85639o, false);
            } else {
                frameLayout2.setBackgroundResource(obc0.f145998C8);
                bnl0.m105524M(this.f85639o, !bnl0.m105529O0(this.f85640p));
                zrv.f205799a.m207693s0(this.f85639o.getContext(), this.f85631Q, this.f85639o);
            }
        }
        final BLiveBoardGuard bLiveBoardGuardM200531f = this.f85634T.m200531f();
        CommonMaskAvatarView commonMaskAvatarView = this.f85641q;
        if (bLiveBoardGuardM200531f == null) {
            bnl0.m105524M(commonMaskAvatarView, false);
            return;
        }
        bnl0.m105524M(commonMaskAvatarView, true);
        biv.m104522g(this.f85641q, qa00.m175859d(48.0f), bLiveBoardGuardM200531f.userAvatar, bLiveBoardGuardM200531f.userAvatarFrame, "");
        bnl0.m105509E0(this.f85641q, new View.OnClickListener() { // from class: l.q7k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155969a.m114899l0(bLiveBoardGuardM200531f, view);
            }
        });
    }

    /* JADX INFO: renamed from: M0 */
    public void m114883M0() {
        this.f85619E.setText(xau.m209910t(R$string.f48453w8));
        VText vText = this.f85619E;
        vText.setTextColor(vText.getResources().getColor(n9c0.f140841k1));
        bnl0.m105591y(this.f85619E, false);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m114884N0() {
        bnl0.m105524M(this.f85619E, true);
        this.f85619E.setText(xau.m209910t(R$string.f47479D8));
        this.f85619E.setTextColor(getContext().getResources().getColor(n9c0.f140823e1));
        bnl0.m105591y(this.f85619E, true);
        bnl0.m105509E0(this.f85619E, new View.OnClickListener() { // from class: l.i7k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113265a.m114900m0(view);
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public final void m114885O0() {
        boolean zM119322d = e3t.m119319a(this.f85633S).m119322d();
        VText vText = this.f85624J;
        if (zM119322d) {
            bnl0.m105524M(vText, false);
        } else {
            bnl0.m105524M(vText, true);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m114886P0() {
        bnl0.m105524M(this.f85616B, true);
        ((tak0) this.f48605b).m189882G4(this.f85631Q.f56859id, new y20() { // from class: l.k7k0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124273a.m114901n0((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m114887Q0() {
        if (e3t.m119319a(this.f85633S).m119322d()) {
            bnl0.m105524M(this.f85620F, false);
        } else {
            xak0.m209860i();
            this.f85620F.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m114888R0(View view, final String str) {
        boolean zM170991P0 = vxr.m203876d().m170991P0();
        bnl0.m105524M(view, zM170991P0);
        if (zM170991P0) {
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.b8k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f75439a.m114902o0(str, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: T0 */
    public void m114889T0(boolean z, vak0 vak0Var, boolean z2, boolean z3, String str) {
        if (vak0Var == null || vak0Var.m200540o() == null) {
            return;
        }
        m114871e0();
        m73015B(z);
        m73017E();
        m114875D0(vak0Var, z2, z3, str);
        m114888R0(this.f85628N, vak0Var.m200540o().f143542a.f56859id);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return ((tak0) this.f48605b).act();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m114890b0(View view) {
        e8k0.m119828a(this, view);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m114892d0(List<View> list) {
        if (list.size() == 3) {
            final int iM105592y0 = (int) ((bnl0.m105592y0() - qa00.m175859d(58.0f)) / 3.0f);
            jyb.m147537z(list, new y20() { // from class: l.m7k0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((View) obj).setLayoutParams(new LinearLayout.LayoutParams(iM105592y0, qa00.m175859d(56.0f)));
                }
            });
            bnl0.m105538V(list.get(1), qa00.m175859d(9.0f));
            bnl0.m105539W(list.get(1), qa00.m175859d(9.0f));
            return;
        }
        jyb.m147537z(list, new y20() { // from class: l.n7k0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((View) obj).setLayoutParams(new LinearLayout.LayoutParams(qa00.m175859d(106.0f), qa00.m175859d(56.0f)));
            }
        });
        if (list.size() > 1) {
            bnl0.m105539W(list.get(0), qa00.m175859d(9.0f));
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m114893f0() {
        ((tak0) this.f48605b).m213811F2().FansClubEvent.showFansClubDialog().mo199273j(Boolean.TRUE);
        mo73021p();
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m114894g0(User user) {
        this.f85644t.m77634S(user);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m114895h0(vak0 vak0Var, User user) {
        BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy = (BLiveUserProfileConfigHierarchy) jyb.m147529r(vak0Var.m200538m().hierarchy, new qcj() { // from class: l.u7k0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveUserProfileConfigHierarchy) obj).type, "user"));
            }
        });
        if (bLiveUserProfileConfigHierarchy == null || !vak0Var.m200538m().enableNewPrivilege || user.f56859id.equals(zrv.f205799a.m207631D0())) {
            this.f85644t.m77634S(user);
        } else {
            ((tak0) this.f48605b).mo138869p3(3800, bLiveUserProfileConfigHierarchy.jumpScheme);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m114896i0(BLiveUserFamilyCard bLiveUserFamilyCard, View view) {
        ((tak0) this.f48605b).mo138869p3(3800, bLiveUserFamilyCard.schema);
        ((tak0) this.f48605b).m189879D4(null);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m114897j0(boolean z, View view) {
        mo73021p();
        BLiveUserProfileConfig bLiveUserProfileConfig = this.f85632R;
        if (z) {
            boolean z2 = bLiveUserProfileConfig.hasFanbaseGroup;
            T t = this.f48605b;
            if (z2) {
                ((tak0) t).m213811F2().FansGroupEvent.showFansGroupPanel().mo199273j(Boolean.TRUE);
                return;
            } else {
                ((tak0) t).m189878C4();
                rgg.m181442a(true, true);
                return;
            }
        }
        if (!bLiveUserProfileConfig.hasFanbaseGroup) {
            o1j0.m165649w(R$string.f48338r3);
            return;
        }
        boolean z3 = bLiveUserProfileConfig.isUserInFanbaseGroup;
        T t2 = this.f48605b;
        if (z3) {
            ((tak0) t2).m213811F2().FansGroupEvent.showFansGroupPanel().mo199273j(Boolean.TRUE);
        } else {
            ((tak0) t2).m213811F2().FansGroupEvent.showApplyDialog().mo199273j(this.f85634T.f183108c.f143542a.f56859id);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m114898k0(View view) {
        ((tak0) this.f48605b).m189910j5();
        mo73021p();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m114899l0(BLiveBoardGuard bLiveBoardGuard, View view) {
        ((tak0) this.f48605b).mo138869p3(3800, bLiveBoardGuard.schema);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        m114890b0(view);
        LiveUserCardSkinView liveUserCardSkinView = (LiveUserCardSkinView) view.findViewById(mdc0.f135999M7);
        this.f85630P = liveUserCardSkinView;
        liveUserCardSkinView.setDialogHost(this);
        m73027z(LiveDialogEnum.USER_CARD);
        m114862S0();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m114900m0(View view) {
        ((tak0) this.f48605b).m189905e5(this.f85631Q, cd10.f81052D);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m114901n0(String str) {
        VText vText = this.f85616B;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        vText.setText(str);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m114902o0(String str, View view) {
        ((tak0) this.f48605b).m189909i5(str);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m114903p0(View view) {
        ((tak0) this.f48605b).mo159725Y3();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m114904q0(View view) {
        if (this.f85631Q == null || e3t.m119319a(this.f85633S).m119322d()) {
            return;
        }
        ((tak0) this.f48605b).m189903c5(getAct(), this.f85633S.f143542a, this.f85631Q.f56859id);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m114905r0(View view) {
        ((tak0) this.f48605b).m189899Y4();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m114906s0(View view) {
        m114911y0();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m114907t0(View view) {
        ((tak0) this.f48605b).m189906f5(this.f85631Q);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m114908u0(View view) {
        ((tak0) this.f48605b).m189900Z4();
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m114909v0(View view) {
        ((tak0) this.f48605b).m189902b5(this.f85631Q);
    }

    /* JADX INFO: renamed from: x0 */
    public void m114910x0(d36 d36Var) {
        this.f85615A.m74517j(d36Var);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m114911y0() {
        if (this.f85631Q == null) {
            return;
        }
        String strConcat = "@" + this.f85631Q.name + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        int length = strConcat.length();
        int i = ix4.f117314E;
        if (length > i) {
            strConcat = strConcat.substring(0, i - 4).concat("... ");
        }
        ((tak0) this.f48605b).m189898X4(strConcat);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m114912z0(vak0 vak0Var, User user) {
        this.f85645u.setVisibility(0);
        if (vak0Var == null || vak0Var.m200530e() == null) {
            this.f85645u.m77593O(user, "", "");
        } else {
            this.f85645u.m77593O(user, vak0Var.m200530e().shadingFrontUrl, vak0Var.m200530e().shadingBackUrl);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(tak0<D> tak0Var) {
    }
}
