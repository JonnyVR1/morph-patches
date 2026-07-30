package p009l;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.CoreTaskCenterAct;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.core.data.MyTabTask;
import com.p1.mobile.putong.core.data.RealPicturesBanner;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.core.ui.account.JailedDialogLikeAct;
import com.p1.mobile.putong.core.ui.verification.VerificationCenterAct;
import com.p1.mobile.putong.core.ui.vip.VipAct;
import com.p1.mobile.putong.core.util.CertificationUtil;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.ArrayList;
import l.ark;
import l.bzc0;
import l.e30;
import l.ew40;
import l.j760;
import l.jjb0;
import l.khl0;
import l.knb0;
import l.lva;
import l.mkd0;
import l.o6j0;
import l.ogl0;
import l.pib;
import l.r3g;
import l.t0g0;
import l.t100;
import l.upa;
import l.vh40;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.xaj0;
import l.xdl0;
import l.xma;
import l.zvf0;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VOnlineIndicator;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class uh40 extends r5k0<ug40> {

    /* JADX INFO: renamed from: A */
    public LinearLayout f21142A;

    /* JADX INFO: renamed from: B */
    public VText f21143B;

    /* JADX INFO: renamed from: C */
    public Space f21144C;

    /* JADX INFO: renamed from: D */
    public VOnlineIndicator f21145D;

    /* JADX INFO: renamed from: E */
    public VText f21146E;

    /* JADX INFO: renamed from: F */
    public View f21147F;

    /* JADX INFO: renamed from: G */
    public LinearLayout f21148G;

    /* JADX INFO: renamed from: H */
    public VText f21149H;

    /* JADX INFO: renamed from: I */
    public VText f21150I;

    /* JADX INFO: renamed from: J */
    public View f21151J;

    /* JADX INFO: renamed from: K */
    public LinearLayout f21152K;

    /* JADX INFO: renamed from: L */
    public VText f21153L;

    /* JADX INFO: renamed from: M */
    public VOnlineIndicator f21154M;

    /* JADX INFO: renamed from: N */
    public VText f21155N;

    /* JADX INFO: renamed from: O */
    public VLinear f21156O;

    /* JADX INFO: renamed from: P */
    public View f21157P;

    /* JADX INFO: renamed from: Q */
    public VText_Medium f21158Q;

    /* JADX INFO: renamed from: R */
    public ug40 f21159R;

    /* JADX INFO: renamed from: S */
    public final Context f21160S;

    /* JADX INFO: renamed from: T */
    public final ArrayList<String> f21161T = vwb.M("default");

    /* JADX INFO: renamed from: U */
    public sxj0 f21162U;

    /* JADX INFO: renamed from: V */
    @Nullable
    public User f21163V;

    /* JADX INFO: renamed from: W */
    public String f21164W;

    /* JADX INFO: renamed from: X */
    public String f21165X;

    /* JADX INFO: renamed from: Y */
    public Animator f21166Y;

    /* JADX INFO: renamed from: a */
    public VFrame f21167a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f21168b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f21169c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f21170d;

    /* JADX INFO: renamed from: e */
    public VText_Medium f21171e;

    /* JADX INFO: renamed from: f */
    public TextView f21172f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f21173g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f21174h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f21175i;

    /* JADX INFO: renamed from: j */
    public VText f21176j;

    /* JADX INFO: renamed from: k */
    public VOnlineIndicator f21177k;

    /* JADX INFO: renamed from: l */
    public VText f21178l;

    /* JADX INFO: renamed from: m */
    public View f21179m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f21180n;

    /* JADX INFO: renamed from: o */
    public RelativeLayout f21181o;

    /* JADX INFO: renamed from: p */
    public VText f21182p;

    /* JADX INFO: renamed from: q */
    public VText f21183q;

    /* JADX INFO: renamed from: r */
    public VText f21184r;

    /* JADX INFO: renamed from: s */
    public LinearLayout f21185s;

    /* JADX INFO: renamed from: t */
    public VText f21186t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f21187u;

    /* JADX INFO: renamed from: v */
    public VText f21188v;

    /* JADX INFO: renamed from: w */
    public VText f21189w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f21190x;

    /* JADX INFO: renamed from: y */
    public ConstraintLayout f21191y;

    /* JADX INFO: renamed from: z */
    public VText f21192z;

    public uh40(Context context) {
        this.f21160S = context;
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m22933A(View view) {
    }

    /* JADX INFO: renamed from: K */
    public static String m22937K(long j) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        if (j <= 999) {
            return decimalFormat.format(j);
        }
        if (j <= 9999) {
            return decimalFormat.format(j / 10000.0f) + "w";
        }
        if (j >= 9999999) {
            return "999w+";
        }
        return decimalFormat.format(j / 10000.0f) + "w";
    }

    /* JADX INFO: renamed from: L */
    public static String m22938L(long j) {
        if (j <= 9999) {
            return j + "";
        }
        if (j >= 9999999) {
            return "999w+";
        }
        return t0g0.c(j / 10000.0f) + "w";
    }

    /* JADX INFO: renamed from: P */
    private void m22939P() {
        xdl0.E0(this.f21168b, new View.OnClickListener() { // from class: l.xg40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22595a.m22996Y(view);
            }
        });
        if (upa.p2()) {
            this.f21162U.mo13775k(new View.OnClickListener() { // from class: l.yg40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f23052a.m22981M(view);
                }
            });
        }
        this.f21162U.mo12210h(new View.OnClickListener() { // from class: l.zg40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23647a.m22997Z(view);
            }
        });
        xdl0.E0(this.f21175i, new View.OnClickListener() { // from class: l.ah40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9501a.m22998a0(view);
            }
        });
        xdl0.E0(this.f21180n, new View.OnClickListener() { // from class: l.bh40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10103a.m22991T(view);
            }
        });
        xdl0.E0(this.f21187u, new View.OnClickListener() { // from class: l.ch40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10591a.m22992U(view);
            }
        });
        xdl0.E0(this.f21190x, new View.OnClickListener() { // from class: l.dh40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11842a.m22993V(view);
            }
        });
        this.f21162U.mo12212j(new View.OnClickListener() { // from class: l.eh40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12562a.m22994W(view);
            }
        }, new View.OnClickListener() { // from class: l.fh40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12998a.m22995X(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m22942b0(View view) {
        this.f21159R.m22930j1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m22944c0(View view) {
        zvf0.r("e_my_moment", "p_navigation_view");
        act().startActivity(CoreModule.N().argsToPhotoAlbumFeedAct(act(), CoreModule.H().userId(), "p_my_moment", -1, (String) null, 0));
    }

    /* JADX INFO: renamed from: r */
    private void m22956r() {
        this.f21162U.mo12219t().setTypeface(Typeface.DEFAULT_BOLD);
        xdl0.E0(this.f21162U.mo12207d(), new View.OnClickListener() { // from class: l.vg40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21568a.m22942b0(view);
            }
        });
        xdl0.M(this.f21175i, false);
        xdl0.M(this.f21179m, false);
        LinearLayout linearLayout = this.f21174h;
        int i = t100.j;
        xdl0.V(linearLayout, -i);
        xdl0.W(this.f21174h, -i);
        if (m22990S() || !upa.p2()) {
            VFrame vFrame = this.f21167a;
            int i2 = t100.h;
            xdl0.d0(vFrame, i2);
            xdl0.e0(this.f21167a, i2);
            xdl0.X(this.f21174h, t100.f);
            this.f21149H.setText("动态");
        }
        if (m22990S() && !upa.p2() && !ogl0.L()) {
            xdl0.M(this.f21147F, true);
            xdl0.M(this.f21148G, true);
            xdl0.E0(this.f21148G, new View.OnClickListener() { // from class: l.gh40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13564a.m22944c0(view);
                }
            });
        }
        if (bzc0.f()) {
            xdl0.M(this.f21174h, false);
        } else if (m22990S() && !upa.p2()) {
            if (upa.z()) {
                this.f21176j.setTextColor(-16777216);
                this.f21182p.setTextColor(-16777216);
                this.f21183q.setTextColor(-16777216);
                this.f21188v.setTextColor(-16777216);
                this.f21192z.setTextColor(-16777216);
                this.f21149H.setTextColor(-16777216);
                this.f21176j.setTextSize(20.0f);
                this.f21182p.setTextSize(20.0f);
                this.f21183q.setTextSize(20.0f);
                this.f21188v.setTextSize(20.0f);
                this.f21192z.setTextSize(20.0f);
                this.f21149H.setTextSize(20.0f);
            }
            VText vText = this.f21178l;
            int i3 = t100.g;
            xdl0.X(vText, i3);
            xdl0.X(this.f21185s, i3);
            xdl0.X(this.f21189w, i3);
            xdl0.X(this.f21143B, i3);
            xdl0.X(this.f21150I, i3);
            xdl0.X(this.f21155N, i3);
            this.f21150I.setText("动态");
        }
        if (ogl0.L()) {
            m22978J0(0);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m22962y(View view) {
    }

    /* JADX INFO: renamed from: A0 */
    public final void m22964A0(User user) {
        this.f21162U.mo12216p(user);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m22965B0(User user) {
        this.f21162U.mo12211i(user);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m22966C0() {
        return this.f21160S;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m22967D0(User user) {
        if (!wn90.m24339F().m24385S() || !upa.Y1() || upa.p2() || m22990S()) {
            xdl0.M(this.f21170d, false);
            return;
        }
        int iM24379L = wn90.m24339F().m24379L(user);
        LinearLayout linearLayout = this.f21170d;
        if (iM24379L < 50) {
            xdl0.M(linearLayout, true);
            this.f21171e.setText("当前曝光较少");
            this.f21172f.setText("完善资料，优先推荐给更多合适的人");
            this.f21173g.setText("去完善");
            zvf0.x("e_ideal_exposure_complete_profile", this.f21159R.f21133b.mo18206v());
        } else {
            xdl0.M(linearLayout, false);
        }
        xdl0.E0(this.f21170d, new View.OnClickListener() { // from class: l.th40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                uh40.m22933A(view);
            }
        });
        xdl0.E0(this.f21173g, new View.OnClickListener() { // from class: l.wg40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22096a.m23006j0(view);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, com.p1.mobile.putong.newui.view.ODiamondTagLabel] */
    /* JADX INFO: renamed from: E0 */
    public void m22969E0(User user) {
        ?? Mo12209g = this.f21162U.mo12209g();
        VImage vImageMo12207d = this.f21162U.mo12207d();
        xdl0.M((View) Mo12209g, false);
        xdl0.M(vImageMo12207d, false);
        if (ew40.j()) {
            xdl0.M((View) Mo12209g, true);
            Mo12209g.m9486o0();
            xdl0.E0((View) Mo12209g, new View.OnClickListener() { // from class: l.sh40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20254a.m23007k0(view);
                }
            });
        } else {
            xdl0.M(vImageMo12207d, true);
            CoreModule.P().e().j7(act(), user, vImageMo12207d, true, true);
            ViewGroup.LayoutParams layoutParams = vImageMo12207d.getLayoutParams();
            layoutParams.width = -2;
            vImageMo12207d.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: F */
    public View m22970F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vh40.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m23005i1(ug40 ug40Var) {
        this.f21159R = ug40Var;
    }

    /* JADX INFO: renamed from: G0 */
    public void m22972G0(knb0<User, CoreLikers.a, Integer, Integer> knb0Var) {
        Long l2 = ((User) knb0Var.a).profile.receivedLikes;
        long jLongValue = l2 == null ? 0L : l2.longValue();
        if (jLongValue > CoreModule.c.e0.j3) {
            o6j0.h("e_my_tab_see_red_dot", this.f21159R.f21133b.mo18206v(), new o6j0.a[0]);
        }
        pib pibVar = CoreModule.c.e0;
        pibVar.j3 = Math.max(pibVar.j3, jLongValue);
        this.f21182p.setText(m22938L(CoreModule.c.e0.j3));
        m23014r0(wn90.m24339F().m24375G(CoreModule.c.e0.j3));
    }

    /* JADX INFO: renamed from: H */
    public void m22973H() {
        sxj0 sxj0Var = this.f21162U;
        if (sxj0Var instanceof e6k0) {
            ((e6k0) sxj0Var).m13760J();
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m22974H0() {
        String str;
        ArrayList<String> arrayList = this.f21161T;
        String str2 = arrayList.get(arrayList.size() - 1);
        str2.getClass();
        if (str2.equals("appeal")) {
            o6j0.h("e_my_profile_navigation_appeal_guide", this.f21159R.f21133b.mo18206v(), new o6j0.a[]{o6j0.a.h("ban_user_appeal_state", rc2.m21492e().m21494b())});
        } else if (str2.equals("picture_fake")) {
            o6j0.h("e_picture_fake_button", this.f21159R.f21133b.mo18206v(), new o6j0.a[0]);
        }
        if (upa.p2()) {
            if (wn90.m24343U(this.f21163V)) {
                str = "complete_card_info";
            } else {
                String str3 = "default";
                if ((!upa.e2() || !TextUtils.equals((CharSequence) CoreModule.c.e0.Z3.get(), "marryMode")) && NullChecker.a(CoreModule.c.e0.j7.e()) && !TextUtils.isEmpty(((MyTabTask) CoreModule.c.e0.j7.e()).type)) {
                    String str4 = ((MyTabTask) CoreModule.c.e0.j7.e()).type;
                    if (TextUtils.equals(str4, "boost")) {
                        str3 = "upload_photo_award";
                    } else if (TextUtils.equals(str4, "selection")) {
                        str3 = "task_selected";
                    } else if (TextUtils.equals(str4, "mbti")) {
                        str3 = "task_mbti";
                    } else if (TextUtils.equals(str4, "game")) {
                        str3 = "task_game";
                    }
                    CoreModule.c.e0.ja(str4, "exposure", "avatar");
                }
                str = str3;
            }
            o6j0.h("e_e_self_icon", "p_navigation_view", new o6j0.a[]{o6j0.a.h("edit_button_status", str)});
        }
    }

    /* JADX INFO: renamed from: I */
    public void m22975I() {
        if (NullChecker.a(this.f21166Y)) {
            this.f21166Y.cancel();
            this.f21166Y = null;
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m22976I0(int i) {
        this.f21162U.mo12215o(i);
        if (m22990S() && !upa.p2()) {
            xdl0.E0(this.f21148G, new View.OnClickListener() { // from class: l.kh40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15674a.m23008l0(view);
                }
            });
        }
        this.f21149H.setText(m22937K(i));
    }

    /* JADX INFO: renamed from: J */
    public VImage m22977J() {
        return this.f21162U.mo12221v();
    }

    /* JADX INFO: renamed from: J0 */
    public void m22978J0(int i) {
        if (ogl0.L()) {
            xdl0.M(this.f21152K, true);
            xdl0.M(this.f21151J, true);
            if (xma.e4() && i > 0 && CoreModule.c.m2.q3()) {
                xdl0.M(this.f21154M, true);
            } else {
                xdl0.M(this.f21154M, false);
            }
            VText vText = this.f21153L;
            if (i > 99) {
                vText.setText("99+");
            } else {
                vText.setText(i + "");
            }
            xdl0.E0(this.f21152K, new View.OnClickListener() { // from class: l.hh40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14081a.m23009m0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m22979K0() {
        if (upa.z2() || upa.A2()) {
            if ((upa.z2() && bzc0.f()) || m22990S() || upa.p2()) {
                return;
            }
            final User userP9 = CoreModule.c.e0.p9();
            final RealPicturesBanner realPicturesBannerO3 = CoreModule.c.r2.o3();
            if (realPicturesBannerO3 == null || userP9.isBanned() || userP9.isProfileJailed() || userP9.isFakeUser() || vwb.f0(new String[]{"fake", "used"}).contains(realPicturesBannerO3.status) || TextUtils.isEmpty(realPicturesBannerO3.text.title)) {
                m22967D0(CoreModule.c.e0.p9().riskAuditUser(CoreModule.c.e0.Pa("fake_risk_audit_default_" + CoreModule.H().userId())));
                return;
            }
            xdl0.M(this.f21170d, true);
            if (upa.A2() && bzc0.f()) {
                xdl0.X(this.f21170d, 0);
                xdl0.U(this.f21170d, t100.d(8.0f));
            }
            this.f21171e.setText(realPicturesBannerO3.text.title);
            this.f21172f.setText(realPicturesBannerO3.text.subTitle);
            this.f21173g.setText(realPicturesBannerO3.text.button);
            xdl0.E0(this.f21173g, new View.OnClickListener() { // from class: l.ih40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14628a.m23011o0(realPicturesBannerO3, userP9, view);
                }
            });
            xdl0.E0(this.f21170d, new View.OnClickListener() { // from class: l.jh40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    uh40.m22962y(view);
                }
            });
            zvf0.A("e_upload_photo_award", this.f21159R.f21133b.mo18206v(), new j760[]{vwb.Y("upload_photo_award_status", m23012p0(realPicturesBannerO3.status))});
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m22980L0(User user) {
        if (NullChecker.a(user)) {
            this.f21176j.setText(m22938L(user.profile.moments.counters.receiveMomentLikes));
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m22981M(View view) {
        String str;
        String str2;
        if (!wn90.m24343U(this.f21163V) || (upa.e2() && TextUtils.equals((CharSequence) CoreModule.c.e0.Z3.get(), "marryMode"))) {
            boolean zM22916S0 = this.f21159R.m22916S0();
            ug40 ug40Var = this.f21159R;
            if (zM22916S0) {
                ug40Var.m22929i1(view);
                String str3 = ((MyTabTask) CoreModule.c.e0.j7.e()).type;
                if (TextUtils.equals(str3, "boost")) {
                    str2 = "upload_photo_award";
                } else if (TextUtils.equals(str3, "selection")) {
                    str2 = "task_selected";
                } else if (TextUtils.equals(str3, "mbti")) {
                    str2 = "task_mbti";
                } else {
                    str2 = TextUtils.equals(str3, "game") ? "task_game" : "default";
                }
                CoreModule.c.e0.ja(str3, "click", "avatar");
                str = str2;
            } else {
                ug40Var.m22912O0();
                str = "default";
            }
        } else {
            this.f21159R.m22929i1(view);
            str = "complete_card_info";
        }
        o6j0.c("e_e_self_icon", this.f21159R.f21133b.mo18206v(), new o6j0.a[]{o6j0.a.h("edit_button_status", str)});
    }

    /* JADX INFO: renamed from: M0 */
    public void m22982M0(User user) {
        this.f21162U.mo12217q(user);
    }

    /* JADX INFO: renamed from: N */
    public void m22983N() {
        if (TextUtils.isEmpty(this.f21165X)) {
            return;
        }
        d.l().k(this.f21165X);
        this.f21165X = null;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m22984N0(User user) {
        sxj0 sxj0Var = this.f21162U;
        if (sxj0Var instanceof e6k0) {
            sxj0Var.mo13776m(user);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m22985O() {
        xdl0.M(this.f21145D, false);
        xdl0.M(this.f21146E, false);
    }

    /* JADX INFO: renamed from: O0 */
    public void m22986O0() {
        sxj0 sxj0Var = this.f21162U;
        if (sxj0Var != null) {
            sxj0Var.mo12218s();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m22987P0(User user) {
        if (user == null) {
            return;
        }
        this.f21163V = user;
        User userRiskAuditUser = user.riskAuditUser(CoreModule.c.e0.Pa("fake_risk_audit_default_" + ((DbObject) user).id));
        this.f21162U.mo12219t().setText(userRiskAuditUser.name);
        m22969E0(userRiskAuditUser);
        m23022z0(userRiskAuditUser);
        m23021y0(userRiskAuditUser);
        m22939P();
        m22965B0(userRiskAuditUser);
        m22982M0(userRiskAuditUser);
        m22964A0(userRiskAuditUser);
        m22967D0(userRiskAuditUser);
        m22979K0();
        m22984N0(userRiskAuditUser);
    }

    /* JADX INFO: renamed from: Q */
    public final void m22988Q(String str, xaj0<String, String, String> xaj0Var) {
        this.f21162U.mo12208e(str, xaj0Var);
    }

    /* JADX INFO: renamed from: R */
    public final void m22989R() {
        this.f21162U.mo12214n(new View.OnClickListener() { // from class: l.nh40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17464a.m22999d0(view);
            }
        });
        o6j0.l("e_set_my_state", this.f21159R.f21133b.mo18206v(), new j760[]{j760.a("source_page", this.f21159R.f21133b.mo18206v())});
    }

    /* JADX INFO: renamed from: S */
    public boolean m22990S() {
        if (NullChecker.a(this.f21159R)) {
            return this.f21159R.m22915R0();
        }
        return false;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m22991T(View view) {
        this.f21159R.m22927g1();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m22992U(View view) {
        this.f21159R.m22932l1();
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m22993V(View view) {
        this.f21159R.m22931k1();
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m22994W(View view) {
        this.f21159R.m22914Q0();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m22995X(View view) {
        this.f21159R.m22913P0();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m22996Y(View view) {
        sxj0 sxj0Var = this.f21162U;
        if (sxj0Var == null || !sxj0Var.mo13777r()) {
            this.f21159R.m22929i1(view);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m22997Z(View view) {
        if (upa.p2()) {
            m22981M(view);
        } else {
            o6j0.c("e_navigation_profile_edit_button", this.f21159R.f21133b.mo18206v(), new o6j0.a[0]);
            this.f21159R.m22912O0();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m22998a0(View view) {
        o6j0.c("e_content_likes", this.f21159R.f21133b.mo18206v(), new o6j0.a[0]);
        CoreModule.N().qo(act());
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m22999d0(View view) {
        o6j0.e("e_set_my_state", this.f21159R.f21133b.mo18206v(), new j760[]{j760.a("source_page", this.f21159R.f21133b.mo18206v())});
        CoreModule.N().j9(act(), "p_navigation_view");
        m22983N();
    }

    public void destroy() {
        m22975I();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m23000e0(String str, xaj0 xaj0Var) {
        Object obj;
        if (xaj0Var == null || (obj = xaj0Var.a) == null) {
            this.f21164W = "";
            m22989R();
            if (CoreModule.N().ko()) {
                this.f21162U.mo12205b(true);
                return;
            }
            return;
        }
        this.f21164W = (String) obj;
        m22988Q(str, xaj0Var);
        if (CoreModule.N().ko()) {
            this.f21162U.mo12205b(false);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m23001f0(View view) {
        pj90.m20457A(act(), "me_like_max");
        zvf0.u("e_me_verify_guide", "p_navigation_view", new j760[]{j760.a("slot_source", CoreModule.c.m0.F6() ? "me_like_max" : "me_like")});
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m23002g0(int[] iArr) {
        xdl0.M0(this.f21157P, true);
        int[] iArr2 = new int[2];
        this.f21180n.getLocationOnScreen(iArr2);
        xdl0.V(this.f21157P, (((iArr2[0] + iArr[0]) - t100.C) / 2) - this.f21167a.getPaddingLeft());
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m23003h0(User user, View view) {
        if (user.isIdAndPicBothVerified() || user.isPicVerificationVerified() || user.isStudentVerified() || !NullChecker.a(act())) {
            return;
        }
        act().startActivity(VerificationCenterAct.X1(act(), false));
        zvf0.r("e_mine_verification_bubble", "p_new_navigation");
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m23004i0(View view) {
        if (NullChecker.a(act())) {
            act().startActivity(VerificationCenterAct.X1(act(), false));
            zvf0.r("e_mine_verification_bubble", "p_new_navigation");
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM22970F = m22970F(layoutInflater, viewGroup);
        if (upa.p2()) {
            this.f21162U = new e6k0(act());
        } else if (bzc0.f()) {
            this.f21162U = new g33(act());
        } else if (m22990S()) {
            this.f21162U = new e6k0(act());
        } else {
            this.f21162U = new bsd(act());
        }
        View viewInflateView = this.f21162U.inflateView(layoutInflater, this.f21169c);
        this.f21169c.addView(viewInflateView);
        if (upa.p2() && bzc0.f()) {
            int i = t100.h;
            xdl0.d0(viewInflateView, i);
            xdl0.e0(viewInflateView, i);
            xdl0.X(viewInflateView, t100.d(17.0f));
            xdl0.U(viewInflateView, t100.d(18.0f));
        }
        m22956r();
        return viewM22970F;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m23006j0(View view) {
        zvf0.r("e_ideal_exposure_complete_profile", this.f21159R.f21133b.mo18206v());
        lva.D(act(), Uri.parse("tantan://profile/edit?mode=dating&from=from_ideal_type_mine_tab_guide"));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m23007k0(View view) {
        this.f21159R.act().startActivity(VipAct.b2(act(), khl0.a("diamond")));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m23008l0(View view) {
        zvf0.r("e_my_moment", "p_navigation_view");
        act().startActivity(CoreModule.N().bb(act(), CoreModule.H().userId(), "from_profile", -1, "", 2, "pageid", false));
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m23009m0(View view) {
        this.f21159R.m22928h1(view);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m23010n0() {
        r3g.h(act());
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m23011o0(RealPicturesBanner realPicturesBanner, User user, View view) {
        zvf0.u("e_upload_photo_award", this.f21159R.f21133b.mo18206v(), new j760[]{vwb.Y("upload_photo_award_status", m23012p0(realPicturesBanner.status))});
        if (user.isBanned()) {
            JailedDialogLikeAct.o2(true);
        } else if (user.isFakeUser()) {
            ark.V0(act(), true, user.fp(), act().string(R.string.Ik), new Runnable() { // from class: l.lh40
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16158a.m23010n0();
                }
            });
        } else {
            this.f21159R.act().startActivity(CoreTaskCenterAct.m7518Y1(act()));
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final String m23012p0(String str) {
        String str2;
        switch (str.hashCode()) {
            case -995381136:
                return str.equals("passed") ? "start_boost" : "";
            case -682587753:
                return str.equals("pending") ? "review" : "";
            case -608496514:
                return str.equals("rejected") ? "failed" : "";
            case 3135317:
                str2 = "fake";
                break;
            case 3599293:
                str2 = "used";
                break;
            case 90550638:
                str2 = "stock_pending";
                break;
            case 111582340:
                return str.equals("using") ? "boosting" : "";
            case 1544803905:
                return str.equals("default") ? "upload" : "";
            default:
                return "";
        }
        str.equals(str2);
        return "";
    }

    /* JADX INFO: renamed from: q0 */
    public void m23013q0() {
        this.f21162U.mo12206c();
        final String str = ((DbObject) CoreModule.K().me_()).id;
        act().duringCreated(CoreModule.N().Tg()).subscribe(mkd0.G(new e30() { // from class: l.mh40
            public final void call(Object obj) {
                this.f16918a.m23000e0(str, (xaj0) obj);
            }
        }));
        if (!CoreModule.N().cd() || CoreModule.N().ko()) {
            return;
        }
        this.f21162U.mo12205b(false);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m23014r0(long j) {
        if (j <= 0 || !ogl0.K()) {
            xdl0.M0(this.f21184r, false);
        } else {
            this.f21184r.setText(String.valueOf(Math.min(j, 999L)));
            xdl0.M0(this.f21184r, true);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m23015s0() {
        sxj0 sxj0Var = this.f21162U;
        if (sxj0Var != null) {
            sxj0Var.mo13774f();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m23016t0() {
        if (((Boolean) CoreModule.c.r0.U.get()).booleanValue()) {
            return;
        }
        VText vText = new VText(act());
        int i = xdl0.e;
        vText.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        vText.setText(CoreModule.N().cd() ? "分享无压力，24小时后自动消失" : "支持仅对好友24小时内可见");
        int i2 = t100.m;
        vText.setPadding(i2, t100.d(10.0f), i2, t100.d(10.0f));
        vText.setTextColor(-1);
        vText.getPaint().setFakeBoldText(true);
        this.f21165X = d.l().t(new a(act()).s(vText).e(true).k(new int[]{act().getResources().getColor(w0c0.I)}).J(14.0f).b(5000L).y(true).q(a.Q).x(-t100.e), this.f21162U.mo12204a());
        CoreModule.c.r0.U.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: u0 */
    public void m23017u0() {
        if (!wn90.m24339F().m24384R() || CoreModule.c.m0.m6() < 0) {
            xdl0.M(this.f21156O, false);
            return;
        }
        xdl0.M(this.f21156O, true);
        xdl0.M0(this.f21157P, false);
        boolean zF6 = CoreModule.c.m0.F6();
        VText_Medium vText_Medium = this.f21158Q;
        if (zF6) {
            vText_Medium.setText("今天收获" + upa.j1() + "/" + upa.j1() + "个喜欢，已隐藏卡片暂停曝光");
        } else {
            vText_Medium.setText("今日收获" + CoreModule.c.m0.m6() + "个喜欢，未认证每日可获" + upa.j1() + "个喜欢");
        }
        zvf0.A("e_me_verify_guide", "p_navigation_view", new j760[]{j760.a("slot_source", CoreModule.c.m0.F6() ? "me_like_max" : "me_like")});
        xdl0.E0(this.f21156O, new View.OnClickListener() { // from class: l.oh40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18047a.m23001f0(view);
            }
        });
        xdl0.Q0(this.f21180n, new e30() { // from class: l.ph40
            public final void call(Object obj) {
                this.f18583a.m23002g0((int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public void m23018v0() {
        if (this.f21162U instanceof e6k0) {
            CoreModule.c.e0.w6.put(Boolean.FALSE);
            CoreModule.c.e0.x6.put(0L);
            e6k0 e6k0Var = (e6k0) this.f21162U;
            e6k0Var.m13772W(!xdl0.O0(e6k0Var.f12402c));
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m23019w0() {
        this.f21162U.mo12220u();
    }

    /* JADX INFO: renamed from: x0 */
    public void m23020x0() {
        if (TextUtils.isEmpty(this.f21164W)) {
            return;
        }
        zvf0.A("e_my_state", this.f21159R.f21133b.mo18206v(), new j760[]{vwb.Y("state_id", this.f21164W)});
    }

    /* JADX INFO: renamed from: y0 */
    public final void m23021y0(User user) {
        this.f21162U.mo12213l(user);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m23022z0(final User user) {
        VImage vImageM22977J = m22977J();
        if (jjb0.b()) {
            int iH = CertificationUtil.h(user);
            if (iH != -1) {
                xdl0.M(vImageM22977J, true);
                vImageM22977J.setImageResource(iH);
            } else {
                xdl0.M(vImageM22977J, false);
            }
            xdl0.E0(vImageM22977J, new View.OnClickListener() { // from class: l.qh40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f19251a.m23003h0(user, view);
                }
            });
            return;
        }
        if (user.isPicVerificationVerified()) {
            xdl0.M(vImageM22977J, true);
            vImageM22977J.setImageResource(x2c0.Pt);
        } else if (user.isStudentVerified()) {
            xdl0.M(vImageM22977J, true);
            vImageM22977J.setImageResource(x2c0.Ur);
        } else {
            vImageM22977J.setImageResource(x2c0.Zp);
            xdl0.M(vImageM22977J, true);
            xdl0.E0(vImageM22977J, new View.OnClickListener() { // from class: l.rh40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f19835a.m23004i0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: D1 */
    public void m22968D1() {
    }
}
