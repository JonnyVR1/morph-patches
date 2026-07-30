package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.LiveFansClubLevel;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveBoardGuard;
import com.p046p1.mobile.putong.live.base.data.BLiveUserFamilyCard;
import com.p046p1.mobile.putong.live.base.data.BLiveUserProfileConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.view.LiveUserCardSkinView;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.view.UserCardContributionView;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.view.UserCardMedalAndNameView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveNewGiftWallEntranceView;
import com.p046p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardEntranceView;
import com.p046p1.mobile.putong.live.livingroom.view.CardAnchorLevelView;
import com.p046p1.mobile.putong.live.livingroom.view.CardFansClubLevelView;
import com.p046p1.mobile.putong.live.livingroom.view.CardUserLevelView;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.view.UserCardFamilyGroupView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class xyj0<D extends ho2> extends LiveMenuDialogHolder<n1k0<D>> {

    /* JADX INFO: renamed from: A */
    public UserCardContributionView f195054A;

    /* JADX INFO: renamed from: B */
    public VText f195055B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f195056C;

    /* JADX INFO: renamed from: D */
    public VText f195057D;

    /* JADX INFO: renamed from: E */
    public VText f195058E;

    /* JADX INFO: renamed from: F */
    public VText f195059F;

    /* JADX INFO: renamed from: G */
    public VText f195060G;

    /* JADX INFO: renamed from: H */
    public VText f195061H;

    /* JADX INFO: renamed from: I */
    public VText f195062I;

    /* JADX INFO: renamed from: J */
    public VText f195063J;

    /* JADX INFO: renamed from: K */
    public View f195064K;

    /* JADX INFO: renamed from: L */
    public VImage f195065L;

    /* JADX INFO: renamed from: M */
    public VText f195066M;

    /* JADX INFO: renamed from: N */
    public VText f195067N;

    /* JADX INFO: renamed from: O */
    public VText f195068O;

    /* JADX INFO: renamed from: P */
    public LiveUserCardSkinView f195069P;

    /* JADX INFO: renamed from: Q */
    public User f195070Q;

    /* JADX INFO: renamed from: R */
    public BLiveUserProfileConfig f195071R;

    /* JADX INFO: renamed from: S */
    public mqv<User> f195072S;

    /* JADX INFO: renamed from: T */
    public p1k0 f195073T;

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f195074k;

    /* JADX INFO: renamed from: l */
    public View f195075l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f195076m;

    /* JADX INFO: renamed from: n */
    public CommonMaskAvatarView f195077n;

    /* JADX INFO: renamed from: o */
    public VImage f195078o;

    /* JADX INFO: renamed from: p */
    public CommonMaskAvatarView f195079p;

    /* JADX INFO: renamed from: q */
    public CommonMaskAvatarView f195080q;

    /* JADX INFO: renamed from: r */
    public UserCardMedalAndNameView f195081r;

    /* JADX INFO: renamed from: s */
    public VLinear f195082s;

    /* JADX INFO: renamed from: t */
    public CardUserLevelView f195083t;

    /* JADX INFO: renamed from: u */
    public CardAnchorLevelView f195084u;

    /* JADX INFO: renamed from: v */
    public CardFansClubLevelView f195085v;

    /* JADX INFO: renamed from: w */
    public UserCardFamilyGroupView f195086w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f195087x;

    /* JADX INFO: renamed from: y */
    public LiveGuardEntranceView f195088y;

    /* JADX INFO: renamed from: z */
    public LiveNewGiftWallEntranceView f195089z;

    public xyj0(@NonNull n1k0<D> n1k0Var) {
        super(t6c0.f168603z6, n1k0Var.act(), n1k0Var, j2g0.m139456c(0.3f));
    }

    /* JADX INFO: renamed from: S0 */
    private void m211787S0() {
        this.f195075l.setOnClickListener(new View.OnClickListener() { // from class: l.byj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77940a.m211828p0(view);
            }
        });
        xdl0.m208329E0(this.f195077n, new View.OnClickListener() { // from class: l.myj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136316a.m211829q0(view);
            }
        });
        xdl0.m208329E0(this.f195061H, new View.OnClickListener() { // from class: l.pyj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151859a.m211830r0(view);
            }
        });
        xdl0.m208329E0(this.f195057D, new View.OnClickListener() { // from class: l.qyj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156935a.m211831s0(view);
            }
        });
        xdl0.m208329E0(this.f195059F, new View.OnClickListener() { // from class: l.ryj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161563a.m211832t0(view);
            }
        });
        xdl0.m208329E0(this.f195054A, new View.OnClickListener() { // from class: l.syj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166964a.m211833u0(view);
            }
        });
        xdl0.m208329E0(this.f195088y, new View.OnClickListener() { // from class: l.tyj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172608a.m211834v0(view);
            }
        });
        xdl0.m208329E0(this.f195089z, new View.OnClickListener() { // from class: l.uyj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178871a.m211797w0(view);
            }
        });
        this.f195054A.m73330f((n1k0) this.f47757b);
    }

    /* JADX INFO: renamed from: e0 */
    private void m211796e0() {
        if (this.f195074k == null) {
            return;
        }
        this.f195081r.m73337b();
        this.f195070Q = null;
        this.f195071R = null;
        uep0.m193336w(false, this.f195060G, this.f195076m, this.f195082s, this.f195056C);
        uep0.m193336w(false, this.f195065L, this.f195083t, this.f195084u, this.f195085v, this.f195086w);
        uep0.m193336w(false, this.f195054A, this.f195078o, this.f195057D, this.f195059F, this.f195061H);
        uep0.m193336w(false, this.f195063J, this.f195087x, this.f195055B, this.f195066M);
        this.f195077n.m72119i0();
        this.f195079p.m72119i0();
        this.f195080q.m72119i0();
        this.f195054A.m73329e();
        this.f195069P.m73313n0();
        this.f195086w.m78727i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public /* synthetic */ void m211797w0(View view) {
        ((n1k0) this.f47757b).m157420a5(this.f195070Q);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m211798A0(p1k0 p1k0Var, boolean z, boolean z2, String str, User user) {
        String str2;
        String str3;
        this.f195085v.setVisibility(0);
        d30 d30Var = new d30() { // from class: l.fyj0
            @Override // p149l.d30
            public final void call() {
                this.f99877a.m211818f0();
            }
        };
        if (p1k0Var == null || p1k0Var.m167091k() == null) {
            str2 = "";
            str3 = str2;
        } else {
            LiveFansClubLevel liveFansClubLevel = user.fanbaseHierarchy;
            String str4 = liveFansClubLevel.shadingFrontUrl;
            str3 = liveFansClubLevel.shadingBackUrl;
            str2 = str4;
        }
        this.f195085v.m76427L(user, str2, str3, z, z2, str, d30Var);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m211799B0(final p1k0 p1k0Var, final User user) {
        this.f195083t.setVisibility(0);
        if (p1k0Var == null || p1k0Var.m167090j() == null) {
            this.f195083t.m76447L(user, p1k0Var, "", "", new d30() { // from class: l.lyj0
                @Override // p149l.d30
                public final void call() {
                    this.f130577a.m211819g0(user);
                }
            });
        } else {
            this.f195083t.m76447L(user, p1k0Var, p1k0Var.m167090j().shadingFrontUrl, p1k0Var.m167090j().shadingBackUrl, new d30() { // from class: l.nyj0
                @Override // p149l.d30
                public final void call() {
                    this.f141128a.m211820h0(p1k0Var, user);
                }
            });
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((n1k0) this.f47757b).act();
    }

    /* JADX INFO: renamed from: D0 */
    public final void m211800D0(p1k0 p1k0Var, boolean z, boolean z2, String str) {
        final xyj0<D> xyj0Var;
        p1k0 p1k0Var2;
        this.f195073T = p1k0Var;
        this.f195070Q = p1k0Var == null ? null : p1k0Var.f146688c.f135304a;
        this.f195071R = p1k0Var == null ? null : p1k0Var.m167093m();
        User user = this.f195070Q;
        this.f195072S = p1k0Var != null ? p1k0Var.f146688c : null;
        VText vText = this.f195068O;
        boolean z3 = false;
        if (user == null) {
            vText.setVisibility(0);
            return;
        }
        vText.setVisibility(8);
        m211807L0();
        if (d1t.m109678a(this.f195072S).m109681d()) {
            m211811P0();
            xyj0Var = this;
        } else {
            if (((n1k0) this.f47757b).m157403I4() || user.anchorHierarchy.wealth > 0) {
                this.f195082s.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            if (((n1k0) this.f47757b).m157403I4() && !this.f195071R.isHiddenUserHierachy) {
                m211799B0(p1k0Var, user);
                arrayList.add(this.f195083t);
            }
            if (user.anchorHierarchy.grade > 0 && !this.f195071R.isHiddenAnchorHierachy) {
                m211837z0(p1k0Var, user);
                arrayList.add(this.f195084u);
            }
            if (TextUtils.isEmpty(user.fanbaseHierarchy.title)) {
                xyj0Var = this;
                p1k0Var2 = p1k0Var;
            } else {
                xyj0Var = this;
                p1k0Var2 = p1k0Var;
                xyj0Var.m211798A0(p1k0Var2, z, z2, str, user);
                arrayList.add(xyj0Var.f195085v);
            }
            final BLiveUserFamilyCard bLiveUserFamilyCardM167088h = p1k0Var2.m167088h();
            if (bLiveUserFamilyCardM167088h != null && !TextUtils.isEmpty(bLiveUserFamilyCardM167088h.schema)) {
                xyj0Var.f195086w.m78728j0(bLiveUserFamilyCardM167088h);
                xdl0.m208329E0(xyj0Var.f195086w, new View.OnClickListener() { // from class: l.dyj0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f88400a.m211821i0(bLiveUserFamilyCardM167088h, view);
                    }
                });
                arrayList.add(xyj0Var.f195086w);
            }
            xyj0Var.m211817d0(arrayList);
            xyj0Var.m211804I0();
        }
        xyj0Var.m211803H0();
        xyj0Var.f195069P.m73323y0(xyj0Var.f195072S, xyj0Var.f195075l);
        LiveUserCardSkinView liveUserCardSkinView = xyj0Var.f195069P;
        FrameLayout frameLayout = xyj0Var.f195076m;
        BLiveUserProfileConfig bLiveUserProfileConfig = xyj0Var.f195071R;
        if (bLiveUserProfileConfig != null && bLiveUserProfileConfig.enableNewPrivilege) {
            z3 = true;
        }
        liveUserCardSkinView.m73311D0(frameLayout, z3);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m211801E0() {
        if (d1t.m109678a(this.f195072S).m109681d()) {
            this.f195057D.setText(ypv.f199497e.getString(R$string.f46939Re));
        } else {
            boolean zIsFemale = this.f195070Q.isFemale();
            VText vText = this.f195057D;
            if (zIsFemale) {
                vText.setText(ypv.f199497e.getString(R$string.f46960Se));
            } else {
                vText.setText(ypv.f199497e.getString(R$string.f46918Qe));
            }
        }
        this.f195057D.setVisibility(0);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m211802G0(int i) {
        if (d1t.m109678a(this.f195072S).m109681d()) {
            xdl0.m208344M(this.f195060G, false);
            return;
        }
        ((n1k0) this.f47757b).mo143930W3(this.f195070Q, i);
        T t = this.f47757b;
        dck0.m110729n(t, ((n1k0) t).mo157426g4(), ((n1k0) this.f47757b).m157400F4(), ((n1k0) this.f47757b).mo77274R2());
    }

    /* JADX INFO: renamed from: H0 */
    public void m211803H0() {
        BLiveUserProfileConfig bLiveUserProfileConfig = this.f195071R;
        if (bLiveUserProfileConfig == null) {
            return;
        }
        if (bLiveUserProfileConfig.jumpConfig.size() == 0) {
            this.f195056C.setVisibility(8);
            this.f195064K.setVisibility(0);
            xdl0.m208344M(this.f195063J, false);
            return;
        }
        this.f195064K.setVisibility(8);
        this.f195056C.setVisibility(0);
        xdl0.m208344M(this.f195063J, false);
        xdl0.m208344M(this.f195058E, false);
        xdl0.m208344M(this.f195062I, false);
        int i = 0;
        while (true) {
            if (i >= this.f195071R.jumpConfig.size()) {
                ArrayList arrayList = new ArrayList();
                if (xdl0.m208349O0(this.f195057D)) {
                    arrayList.add(vwb.m200311Y("at", this.f195057D));
                }
                if (xdl0.m208349O0(this.f195059F)) {
                    arrayList.add(vwb.m200311Y("gift", this.f195059F));
                }
                if (xdl0.m208349O0(this.f195060G)) {
                    arrayList.add(vwb.m200311Y("follow", this.f195060G));
                }
                int size = arrayList.size();
                VText vText = this.f195061H;
                if (size == 3) {
                    xdl0.m208344M(vText, false);
                    xdl0.m208344M(this.f195062I, false);
                    return;
                }
                if (xdl0.m208349O0(vText)) {
                    if (arrayList.size() >= 2 && xdl0.m208349O0(this.f195060G) && xdl0.m208349O0(this.f195062I)) {
                        xdl0.m208344M(this.f195061H, false);
                    } else {
                        arrayList.add(vwb.m200311Y("jumpOtherRoom", this.f195061H));
                    }
                }
                if (arrayList.size() == 3) {
                    xdl0.m208344M(this.f195062I, false);
                    return;
                }
                return;
            }
            String str = this.f195071R.jumpConfig.get(i);
            str.getClass();
            switch (str) {
                case "maskSwitch":
                    m211810O0();
                    break;
                case "jumpOtherRoom":
                    m211806K0();
                    break;
                case "follow":
                    m211802G0(this.f195071R.jumpConfig.size());
                    break;
                case "multiCall":
                    m211809N0();
                    break;
                case "at":
                    m211801E0();
                    break;
                case "gift":
                    m211812Q0();
                    break;
                case "fanbaseGroup":
                    m211805J0();
                    break;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m211804I0() {
        BLiveUserProfileConfig bLiveUserProfileConfig = this.f195071R;
        if (bLiveUserProfileConfig == null) {
            return;
        }
        if (!bLiveUserProfileConfig.contributionListShow) {
            this.f195054A.setVisibility(8);
        } else {
            ((n1k0) this.f47757b).m157429h5();
            this.f195054A.setVisibility(0);
        }
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2] */
    /* JADX INFO: renamed from: J0 */
    public final void m211805J0() {
        xdl0.m208344M(this.f195062I, true);
        final boolean z = TextUtils.equals(this.f195073T.f146688c.f135304a.f56011id, ((n1k0) this.f47757b).m206027E2().m132146l0().f56011id) && TextUtils.equals(ypv.f199493a.m199309D0(), ((n1k0) this.f47757b).m206027E2().m132146l0().f56011id);
        if (this.f195071R.hasFanbaseGroup || !z) {
            this.f195062I.setText(R$string.f47622x3);
        } else {
            this.f195062I.setText(R$string.f47446p3);
            dfg.m111462b(true, true);
        }
        xdl0.m208329E0(this.f195062I, new View.OnClickListener() { // from class: l.wyj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188573a.m211822j0(z, view);
            }
        });
    }

    /* JADX INFO: renamed from: K0 */
    public final void m211806K0() {
        boolean zM109681d = d1t.m109678a(this.f195072S).m109681d();
        VText vText = this.f195061H;
        if (zM109681d) {
            xdl0.m208344M(vText, false);
            return;
        }
        xdl0.m208344M(vText, true);
        this.f195061H.setText(w8u.m202217t(this.f195070Q.isFemale() ? R$string.f46562A5 : R$string.f46584B5));
        this.f195061H.setVisibility(0);
        ((n1k0) this.f47757b).m157433l5();
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [l.ho2] */
    /* JADX INFO: renamed from: L0 */
    public final void m211807L0() {
        agv.m96344b(this.f195077n, t100.m186890d(100.0f), this.f195072S, new w9j() { // from class: l.iyj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).m60124fp().profileSmall().formatted();
            }
        });
        if (ypv.m215672k().m195802b7() && NullChecker.m81303a(this.f195070Q) && this.f195070Q.f56011id.equals(((n1k0) this.f47757b).m206027E2().m132146l0().f56011id) && NullChecker.m81303a(this.f195073T.m167099s()) && !TextUtils.isEmpty(this.f195073T.m167099s().userImage)) {
            xdl0.m208344M(this.f195079p, true);
            agv.m96349g(this.f195079p, t100.m186890d(44.0f), this.f195073T.m167099s().userImage, "", this.f195073T.m167099s().avatar);
            xdl0.m208329E0(this.f195079p, new View.OnClickListener() { // from class: l.jyj0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f120311a.m211823k0(view);
                }
            });
            this.f195079p.getRealAvatarView().m72131u(0.85f);
        } else {
            xdl0.m208344M(this.f195079p, false);
        }
        xdl0.m208344M(this.f195076m, true);
        boolean zM72121k0 = this.f195077n.m72121k0();
        FrameLayout frameLayout = this.f195076m;
        if (zM72121k0) {
            xdl0.m208357U(frameLayout, t100.m186890d(2.0f));
            this.f195076m.setBackground(null);
            xdl0.m208344M(this.f195078o, false);
        } else {
            xdl0.m208357U(frameLayout, t100.m186890d(-6.0f));
            boolean zM109681d = d1t.m109678a(this.f195072S).m109681d();
            FrameLayout frameLayout2 = this.f195076m;
            if (zM109681d) {
                frameLayout2.setBackground(null);
                xdl0.m208344M(this.f195078o, false);
            } else {
                frameLayout2.setBackgroundResource(i3c0.f110670C8);
                xdl0.m208344M(this.f195078o, !xdl0.m208349O0(this.f195079p));
                ypv.f199493a.m199371s0(this.f195078o.getContext(), this.f195070Q, this.f195078o);
            }
        }
        final BLiveBoardGuard bLiveBoardGuardM167086f = this.f195073T.m167086f();
        CommonMaskAvatarView commonMaskAvatarView = this.f195080q;
        if (bLiveBoardGuardM167086f == null) {
            xdl0.m208344M(commonMaskAvatarView, false);
            return;
        }
        xdl0.m208344M(commonMaskAvatarView, true);
        agv.m96349g(this.f195080q, t100.m186890d(48.0f), bLiveBoardGuardM167086f.userAvatar, bLiveBoardGuardM167086f.userAvatarFrame, "");
        xdl0.m208329E0(this.f195080q, new View.OnClickListener() { // from class: l.kyj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125312a.m211824l0(bLiveBoardGuardM167086f, view);
            }
        });
    }

    /* JADX INFO: renamed from: M0 */
    public void m211808M0() {
        this.f195058E.setText(w8u.m202217t(R$string.f47605w8));
        VText vText = this.f195058E;
        vText.setTextColor(vText.getResources().getColor(h1c0.f105380k1));
        xdl0.m208411y(this.f195058E, false);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m211809N0() {
        xdl0.m208344M(this.f195058E, true);
        this.f195058E.setText(w8u.m202217t(R$string.f46631D8));
        this.f195058E.setTextColor(getContext().getResources().getColor(h1c0.f105362e1));
        xdl0.m208411y(this.f195058E, true);
        xdl0.m208329E0(this.f195058E, new View.OnClickListener() { // from class: l.cyj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82993a.m211825m0(view);
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public final void m211810O0() {
        boolean zM109681d = d1t.m109678a(this.f195072S).m109681d();
        VText vText = this.f195063J;
        if (zM109681d) {
            xdl0.m208344M(vText, false);
        } else {
            xdl0.m208344M(vText, true);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m211811P0() {
        xdl0.m208344M(this.f195055B, true);
        ((n1k0) this.f47757b).m157401G4(this.f195070Q.f56011id, new e30() { // from class: l.eyj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93757a.m211826n0((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m211812Q0() {
        if (d1t.m109678a(this.f195072S).m109681d()) {
            xdl0.m208344M(this.f195059F, false);
        } else {
            r1k0.m177472i();
            this.f195059F.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m211813R0(View view, final String str) {
        boolean zM162684P0 = uvr.m196087d().m162684P0();
        xdl0.m208344M(view, zM162684P0);
        if (zM162684P0) {
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.vyj0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f183536a.m211827o0(str, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: T0 */
    public void m211814T0(boolean z, p1k0 p1k0Var, boolean z2, boolean z3, String str) {
        if (p1k0Var == null || p1k0Var.m167095o() == null) {
            return;
        }
        m211796e0();
        m71832B(z);
        m71834E();
        m211800D0(p1k0Var, z2, z3, str);
        m211813R0(this.f195067N, p1k0Var.m167095o().f135304a.f56011id);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return ((n1k0) this.f47757b).act();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m211815b0(View view) {
        yyj0.m216540a(this, view);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m211817d0(List<View> list) {
        if (list.size() == 3) {
            final int iM208412y0 = (int) ((xdl0.m208412y0() - t100.m186890d(58.0f)) / 3.0f);
            vwb.m200354z(list, new e30() { // from class: l.gyj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((View) obj).setLayoutParams(new LinearLayout.LayoutParams(iM208412y0, t100.m186890d(56.0f)));
                }
            });
            xdl0.m208358V(list.get(1), t100.m186890d(9.0f));
            xdl0.m208359W(list.get(1), t100.m186890d(9.0f));
            return;
        }
        vwb.m200354z(list, new e30() { // from class: l.hyj0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((View) obj).setLayoutParams(new LinearLayout.LayoutParams(t100.m186890d(106.0f), t100.m186890d(56.0f)));
            }
        });
        if (list.size() > 1) {
            xdl0.m208359W(list.get(0), t100.m186890d(9.0f));
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m211818f0() {
        ((n1k0) this.f47757b).m206028F2().FansClubEvent.showFansClubDialog().mo172463j(Boolean.TRUE);
        mo71838p();
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m211819g0(User user) {
        this.f195083t.m76451S(user);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m211820h0(p1k0 p1k0Var, User user) {
        BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy = (BLiveUserProfileConfigHierarchy) vwb.m200346r(p1k0Var.m167093m().hierarchy, new w9j() { // from class: l.oyj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveUserProfileConfigHierarchy) obj).type, "user"));
            }
        });
        if (bLiveUserProfileConfigHierarchy == null || !p1k0Var.m167093m().enableNewPrivilege || user.f56011id.equals(ypv.f199493a.m199309D0())) {
            this.f195083t.m76451S(user);
        } else {
            ((n1k0) this.f47757b).mo129310p3(3800, bLiveUserProfileConfigHierarchy.jumpScheme);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m211821i0(BLiveUserFamilyCard bLiveUserFamilyCard, View view) {
        ((n1k0) this.f47757b).mo129310p3(3800, bLiveUserFamilyCard.schema);
        ((n1k0) this.f47757b).m157398D4(null);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m211822j0(boolean z, View view) {
        mo71838p();
        BLiveUserProfileConfig bLiveUserProfileConfig = this.f195071R;
        if (z) {
            boolean z2 = bLiveUserProfileConfig.hasFanbaseGroup;
            T t = this.f47757b;
            if (z2) {
                ((n1k0) t).m206028F2().FansGroupEvent.showFansGroupPanel().mo172463j(Boolean.TRUE);
                return;
            } else {
                ((n1k0) t).m157397C4();
                dfg.m111461a(true, true);
                return;
            }
        }
        if (!bLiveUserProfileConfig.hasFanbaseGroup) {
            lsi0.m151593w(R$string.f47490r3);
            return;
        }
        boolean z3 = bLiveUserProfileConfig.isUserInFanbaseGroup;
        T t2 = this.f47757b;
        if (z3) {
            ((n1k0) t2).m206028F2().FansGroupEvent.showFansGroupPanel().mo172463j(Boolean.TRUE);
        } else {
            ((n1k0) t2).m206028F2().FansGroupEvent.showApplyDialog().mo172463j(this.f195073T.f146688c.f135304a.f56011id);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m211823k0(View view) {
        ((n1k0) this.f47757b).m157431j5();
        mo71838p();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m211824l0(BLiveBoardGuard bLiveBoardGuard, View view) {
        ((n1k0) this.f47757b).mo129310p3(3800, bLiveBoardGuard.schema);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        m211815b0(view);
        LiveUserCardSkinView liveUserCardSkinView = (LiveUserCardSkinView) view.findViewById(g5c0.f100754M7);
        this.f195069P = liveUserCardSkinView;
        liveUserCardSkinView.setDialogHost(this);
        m71844z(LiveDialogEnum.USER_CARD);
        m211787S0();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m211825m0(View view) {
        ((n1k0) this.f47757b).m157424e5(this.f195070Q, s410.f162214D);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m211826n0(String str) {
        VText vText = this.f195055B;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        vText.setText(str);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m211827o0(String str, View view) {
        ((n1k0) this.f47757b).m157430i5(str);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m211828p0(View view) {
        ((n1k0) this.f47757b).mo162152Y3();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m211829q0(View view) {
        if (this.f195070Q == null || d1t.m109678a(this.f195072S).m109681d()) {
            return;
        }
        ((n1k0) this.f47757b).m157422c5(getAct(), this.f195072S.f135304a, this.f195070Q.f56011id);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m211830r0(View view) {
        ((n1k0) this.f47757b).m157418Y4();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m211831s0(View view) {
        m211836y0();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m211832t0(View view) {
        ((n1k0) this.f47757b).m157425f5(this.f195070Q);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m211833u0(View view) {
        ((n1k0) this.f47757b).m157419Z4();
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m211834v0(View view) {
        ((n1k0) this.f47757b).m157421b5(this.f195070Q);
    }

    /* JADX INFO: renamed from: x0 */
    public void m211835x0(y16 y16Var) {
        this.f195054A.m73334j(y16Var);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m211836y0() {
        if (this.f195070Q == null) {
            return;
        }
        String strConcat = "@" + this.f195070Q.name + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        int length = strConcat.length();
        int i = jw4.f120018E;
        if (length > i) {
            strConcat = strConcat.substring(0, i - 4).concat("... ");
        }
        ((n1k0) this.f47757b).m157417X4(strConcat);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m211837z0(p1k0 p1k0Var, User user) {
        this.f195084u.setVisibility(0);
        if (p1k0Var == null || p1k0Var.m167085e() == null) {
            this.f195084u.m76410O(user, "", "");
        } else {
            this.f195084u.m76410O(user, p1k0Var.m167085e().shadingFrontUrl, p1k0Var.m167085e().shadingBackUrl);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(n1k0<D> n1k0Var) {
    }
}
