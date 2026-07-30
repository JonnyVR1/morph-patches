package p149l;

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
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.data.ProfileLikeType;
import com.p046p1.mobile.putong.core.data.RealPicturesBanner;
import com.p046p1.mobile.putong.core.data.UserHomeMode;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.CoreTaskCenterAct;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.account.JailedDialogLikeAct;
import com.p046p1.mobile.putong.core.p053ui.verification.VerificationCenterAct;
import com.p046p1.mobile.putong.core.p053ui.vip.VipAct;
import com.p046p1.mobile.putong.core.util.CertificationUtil;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.NavigationCardIntent;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.ArrayList;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VOnlineIndicator;
import p147v.VText;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class uh40 extends r5k0<ug40> {

    /* JADX INFO: renamed from: A */
    public LinearLayout f176481A;

    /* JADX INFO: renamed from: B */
    public VText f176482B;

    /* JADX INFO: renamed from: C */
    public Space f176483C;

    /* JADX INFO: renamed from: D */
    public VOnlineIndicator f176484D;

    /* JADX INFO: renamed from: E */
    public VText f176485E;

    /* JADX INFO: renamed from: F */
    public View f176486F;

    /* JADX INFO: renamed from: G */
    public LinearLayout f176487G;

    /* JADX INFO: renamed from: H */
    public VText f176488H;

    /* JADX INFO: renamed from: I */
    public VText f176489I;

    /* JADX INFO: renamed from: J */
    public View f176490J;

    /* JADX INFO: renamed from: K */
    public LinearLayout f176491K;

    /* JADX INFO: renamed from: L */
    public VText f176492L;

    /* JADX INFO: renamed from: M */
    public VOnlineIndicator f176493M;

    /* JADX INFO: renamed from: N */
    public VText f176494N;

    /* JADX INFO: renamed from: O */
    public VLinear f176495O;

    /* JADX INFO: renamed from: P */
    public View f176496P;

    /* JADX INFO: renamed from: Q */
    public VText_Medium f176497Q;

    /* JADX INFO: renamed from: R */
    public ug40 f176498R;

    /* JADX INFO: renamed from: S */
    public final Context f176499S;

    /* JADX INFO: renamed from: T */
    public final ArrayList<String> f176500T = vwb.m200299M("default");

    /* JADX INFO: renamed from: U */
    public sxj0 f176501U;

    /* JADX INFO: renamed from: V */
    @Nullable
    public User f176502V;

    /* JADX INFO: renamed from: W */
    public String f176503W;

    /* JADX INFO: renamed from: X */
    public String f176504X;

    /* JADX INFO: renamed from: Y */
    public Animator f176505Y;

    /* JADX INFO: renamed from: a */
    public VFrame f176506a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f176507b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f176508c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f176509d;

    /* JADX INFO: renamed from: e */
    public VText_Medium f176510e;

    /* JADX INFO: renamed from: f */
    public TextView f176511f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f176512g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f176513h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f176514i;

    /* JADX INFO: renamed from: j */
    public VText f176515j;

    /* JADX INFO: renamed from: k */
    public VOnlineIndicator f176516k;

    /* JADX INFO: renamed from: l */
    public VText f176517l;

    /* JADX INFO: renamed from: m */
    public View f176518m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f176519n;

    /* JADX INFO: renamed from: o */
    public RelativeLayout f176520o;

    /* JADX INFO: renamed from: p */
    public VText f176521p;

    /* JADX INFO: renamed from: q */
    public VText f176522q;

    /* JADX INFO: renamed from: r */
    public VText f176523r;

    /* JADX INFO: renamed from: s */
    public LinearLayout f176524s;

    /* JADX INFO: renamed from: t */
    public VText f176525t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f176526u;

    /* JADX INFO: renamed from: v */
    public VText f176527v;

    /* JADX INFO: renamed from: w */
    public VText f176528w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f176529x;

    /* JADX INFO: renamed from: y */
    public ConstraintLayout f176530y;

    /* JADX INFO: renamed from: z */
    public VText f176531z;

    public uh40(Context context) {
        this.f176499S = context;
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m193613A(View view) {
    }

    /* JADX INFO: renamed from: K */
    public static String m193617K(long j) {
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
    public static String m193618L(long j) {
        if (j <= 9999) {
            return j + "";
        }
        if (j >= 9999999) {
            return "999w+";
        }
        return t0g0.m186862c(j / 10000.0f) + "w";
    }

    /* JADX INFO: renamed from: P */
    private void m193619P() {
        xdl0.m208329E0(this.f176507b, new View.OnClickListener() { // from class: l.xg40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192737a.m193675Y(view);
            }
        });
        if (upa.m194800p2()) {
            this.f176501U.mo115097k(new View.OnClickListener() { // from class: l.yg40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f198126a.m193660M(view);
                }
            });
        }
        this.f176501U.mo103684h(new View.OnClickListener() { // from class: l.zg40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203010a.m193676Z(view);
            }
        });
        xdl0.m208329E0(this.f176514i, new View.OnClickListener() { // from class: l.ah40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f69551a.m193677a0(view);
            }
        });
        xdl0.m208329E0(this.f176519n, new View.OnClickListener() { // from class: l.bh40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75555a.m193670T(view);
            }
        });
        xdl0.m208329E0(this.f176526u, new View.OnClickListener() { // from class: l.ch40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80831a.m193671U(view);
            }
        });
        xdl0.m208329E0(this.f176529x, new View.OnClickListener() { // from class: l.dh40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86233a.m193672V(view);
            }
        });
        this.f176501U.mo103686j(new View.OnClickListener() { // from class: l.eh40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91297a.m193673W(view);
            }
        }, new View.OnClickListener() { // from class: l.fh40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97481a.m193674X(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m193622b0(View view) {
        this.f176498R.m193531j1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m193624c0(View view) {
        zvf0.m220396r("e_my_moment", OMSDialogPositon.p_navigation_view);
        getAct().startActivity(CoreModule.m29934N().argsToPhotoAlbumFeedAct(getAct(), CoreModule.m29931H().userId(), "p_my_moment", -1, null, 0));
    }

    /* JADX INFO: renamed from: r */
    private void m193636r() {
        this.f176501U.mo103693t().setTypeface(Typeface.DEFAULT_BOLD);
        xdl0.m208329E0(this.f176501U.mo103681d(), new View.OnClickListener() { // from class: l.vg40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181346a.m193622b0(view);
            }
        });
        xdl0.m208344M(this.f176514i, false);
        xdl0.m208344M(this.f176518m, false);
        LinearLayout linearLayout = this.f176513h;
        int i = t100.f167261j;
        xdl0.m208358V(linearLayout, -i);
        xdl0.m208359W(this.f176513h, -i);
        if (m193669S() || !upa.m194800p2()) {
            VFrame vFrame = this.f176506a;
            int i2 = t100.f167259h;
            xdl0.m208370d0(vFrame, i2);
            xdl0.m208372e0(this.f176506a, i2);
            xdl0.m208360X(this.f176513h, t100.f167257f);
            this.f176488H.setText("动态");
        }
        if (m193669S() && !upa.m194800p2() && !ogl0.m164233L()) {
            xdl0.m208344M(this.f176486F, true);
            xdl0.m208344M(this.f176487G, true);
            xdl0.m208329E0(this.f176487G, new View.OnClickListener() { // from class: l.gh40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f102623a.m193624c0(view);
                }
            });
        }
        if (bzc0.m104566f()) {
            xdl0.m208344M(this.f176513h, false);
        } else if (m193669S() && !upa.m194800p2()) {
            if (upa.m194847z()) {
                this.f176515j.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
                this.f176521p.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
                this.f176522q.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
                this.f176527v.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
                this.f176531z.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
                this.f176488H.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
                this.f176515j.setTextSize(20.0f);
                this.f176521p.setTextSize(20.0f);
                this.f176522q.setTextSize(20.0f);
                this.f176527v.setTextSize(20.0f);
                this.f176531z.setTextSize(20.0f);
                this.f176488H.setTextSize(20.0f);
            }
            VText vText = this.f176517l;
            int i3 = t100.f167258g;
            xdl0.m208360X(vText, i3);
            xdl0.m208360X(this.f176524s, i3);
            xdl0.m208360X(this.f176528w, i3);
            xdl0.m208360X(this.f176482B, i3);
            xdl0.m208360X(this.f176489I, i3);
            xdl0.m208360X(this.f176494N, i3);
            this.f176489I.setText("动态");
        }
        if (ogl0.m164233L()) {
            m193657J0(0);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m193642y(View view) {
    }

    /* JADX INFO: renamed from: A0 */
    public final void m193644A0(User user) {
        this.f176501U.mo103690p(user);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m193645B0(User user) {
        this.f176501U.mo103685i(user);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f176499S;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m193646D0(User user) {
        if (!wn90.m204602F().m204648S() || !upa.m194718Y1() || upa.m194800p2() || m193669S()) {
            xdl0.m208344M(this.f176509d, false);
            return;
        }
        int iM204642L = wn90.m204602F().m204642L(user);
        LinearLayout linearLayout = this.f176509d;
        if (iM204642L < 50) {
            xdl0.m208344M(linearLayout, true);
            this.f176510e.setText("当前曝光较少");
            this.f176511f.setText("完善资料，优先推荐给更多合适的人");
            this.f176512g.setText("去完善");
            zvf0.m220402x("e_ideal_exposure_complete_profile", this.f176498R.f176354b.mo152480v());
        } else {
            xdl0.m208344M(linearLayout, false);
        }
        xdl0.m208329E0(this.f176509d, new View.OnClickListener() { // from class: l.th40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                uh40.m193613A(view);
            }
        });
        xdl0.m208329E0(this.f176512g, new View.OnClickListener() { // from class: l.wg40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186141a.m193684j0(view);
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public void m193648E0(User user) {
        ODiamondTagLabel oDiamondTagLabelMo103683g = this.f176501U.mo103683g();
        VImage vImageMo103681d = this.f176501U.mo103681d();
        xdl0.m208344M(oDiamondTagLabelMo103683g, false);
        xdl0.m208344M(vImageMo103681d, false);
        if (ew40.m118398j()) {
            xdl0.m208344M(oDiamondTagLabelMo103683g, true);
            oDiamondTagLabelMo103683g.m79167o0();
            xdl0.m208329E0(oDiamondTagLabelMo103683g, new View.OnClickListener() { // from class: l.sh40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f164513a.m193685k0(view);
                }
            });
        } else {
            xdl0.m208344M(vImageMo103681d, true);
            CoreModule.m29935P().m94654e().mo34982j7(getAct(), user, vImageMo103681d, true, true);
            ViewGroup.LayoutParams layoutParams = vImageMo103681d.getLayoutParams();
            layoutParams.width = -2;
            vImageMo103681d.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: F */
    public View m193649F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vh40.m198419b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ug40 ug40Var) {
        this.f176498R = ug40Var;
    }

    /* JADX INFO: renamed from: G0 */
    public void m193651G0(knb0<User, CoreLikers.C4719a, Integer, Integer> knb0Var) {
        Long l2 = knb0Var.f123873a.profile.receivedLikes;
        long jLongValue = l2 == null ? 0L : l2.longValue();
        if (jLongValue > CoreModule.f17545c.f19639e0.f149400j3) {
            o6j0.m162864h("e_my_tab_see_red_dot", this.f176498R.f176354b.mo152480v(), new o6j0.C18854a[0]);
        }
        pib pibVar = CoreModule.f17545c.f19639e0;
        pibVar.f149400j3 = Math.max(pibVar.f149400j3, jLongValue);
        this.f176521p.setText(m193618L(CoreModule.f17545c.f19639e0.f149400j3));
        m193692r0(wn90.m204602F().m204638G(CoreModule.f17545c.f19639e0.f149400j3));
    }

    /* JADX INFO: renamed from: H */
    public void m193652H() {
        sxj0 sxj0Var = this.f176501U;
        if (sxj0Var instanceof e6k0) {
            ((e6k0) sxj0Var).m115082J();
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m193653H0() {
        String str;
        ArrayList<String> arrayList = this.f176500T;
        String str2 = arrayList.get(arrayList.size() - 1);
        str2.getClass();
        if (str2.equals("appeal")) {
            o6j0.m162864h("e_my_profile_navigation_appeal_guide", this.f176498R.f176354b.mo152480v(), o6j0.C18854a.m162878h("ban_user_appeal_state", rc2.m178723e().m178725b()));
        } else if (str2.equals("picture_fake")) {
            o6j0.m162864h("e_picture_fake_button", this.f176498R.f176354b.mo152480v(), new o6j0.C18854a[0]);
        }
        if (upa.m194800p2()) {
            if (wn90.m204606U(this.f176502V)) {
                str = "complete_card_info";
            } else {
                String str3 = "default";
                if ((!upa.m194745e2() || !TextUtils.equals(CoreModule.f17545c.f19639e0.f149321Z3.get(), UserHomeMode.marryMode)) && NullChecker.m81303a(CoreModule.f17545c.f19639e0.f149404j7.m221515e()) && !TextUtils.isEmpty(CoreModule.f17545c.f19639e0.f149404j7.m221515e().type)) {
                    String str4 = CoreModule.f17545c.f19639e0.f149404j7.m221515e().type;
                    if (TextUtils.equals(str4, "boost")) {
                        str3 = "upload_photo_award";
                    } else if (TextUtils.equals(str4, "selection")) {
                        str3 = "task_selected";
                    } else if (TextUtils.equals(str4, ProfileLikeType.mbti)) {
                        str3 = "task_mbti";
                    } else if (TextUtils.equals(str4, "game")) {
                        str3 = "task_game";
                    }
                    CoreModule.f17545c.f19639e0.m169504ja(str4, "exposure", "avatar");
                }
                str = str3;
            }
            o6j0.m162864h("e_e_self_icon", OMSDialogPositon.p_navigation_view, o6j0.C18854a.m162878h("edit_button_status", str));
        }
    }

    /* JADX INFO: renamed from: I */
    public void m193654I() {
        if (NullChecker.m81303a(this.f176505Y)) {
            this.f176505Y.cancel();
            this.f176505Y = null;
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m193655I0(int i) {
        this.f176501U.mo103689o(i);
        if (m193669S() && !upa.m194800p2()) {
            xdl0.m208329E0(this.f176487G, new View.OnClickListener() { // from class: l.kh40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f123116a.m193686l0(view);
                }
            });
        }
        this.f176488H.setText(m193617K(i));
    }

    /* JADX INFO: renamed from: J */
    public VImage m193656J() {
        return this.f176501U.mo103695v();
    }

    /* JADX INFO: renamed from: J0 */
    public void m193657J0(int i) {
        if (ogl0.m164233L()) {
            xdl0.m208344M(this.f176491K, true);
            xdl0.m208344M(this.f176490J, true);
            if (xma.m210071e4() && i > 0 && CoreModule.f17545c.f19665m2.m191474q3()) {
                xdl0.m208344M(this.f176493M, true);
            } else {
                xdl0.m208344M(this.f176493M, false);
            }
            VText vText = this.f176492L;
            if (i > 99) {
                vText.setText("99+");
            } else {
                vText.setText(i + "");
            }
            xdl0.m208329E0(this.f176491K, new View.OnClickListener() { // from class: l.hh40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f107679a.m193687m0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m193658K0() {
        if (upa.m194850z2() || upa.m194609A2()) {
            if ((upa.m194850z2() && bzc0.m104566f()) || m193669S() || upa.m194800p2()) {
                return;
            }
            final User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            final RealPicturesBanner realPicturesBannerM136525o3 = CoreModule.f17545c.f19680r2.m136525o3();
            if (realPicturesBannerM136525o3 == null || userM169527p9.isBanned() || userM169527p9.isProfileJailed() || userM169527p9.isFakeUser() || vwb.m200324f0(Channel.fake, "used").contains(realPicturesBannerM136525o3.status) || TextUtils.isEmpty(realPicturesBannerM136525o3.text.title)) {
                m193646D0(CoreModule.f17545c.f19639e0.m169527p9().riskAuditUser(CoreModule.f17545c.f19639e0.m169430Pa("fake_risk_audit_default_" + CoreModule.m29931H().userId())));
                return;
            }
            xdl0.m208344M(this.f176509d, true);
            if (upa.m194609A2() && bzc0.m104566f()) {
                xdl0.m208360X(this.f176509d, 0);
                xdl0.m208357U(this.f176509d, t100.m186890d(8.0f));
            }
            this.f176510e.setText(realPicturesBannerM136525o3.text.title);
            this.f176511f.setText(realPicturesBannerM136525o3.text.subTitle);
            this.f176512g.setText(realPicturesBannerM136525o3.text.button);
            xdl0.m208329E0(this.f176512g, new View.OnClickListener() { // from class: l.ih40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f113201a.m193689o0(realPicturesBannerM136525o3, userM169527p9, view);
                }
            });
            xdl0.m208329E0(this.f176509d, new View.OnClickListener() { // from class: l.jh40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    uh40.m193642y(view);
                }
            });
            zvf0.m220368A("e_upload_photo_award", this.f176498R.f176354b.mo152480v(), vwb.m200311Y("upload_photo_award_status", m193690p0(realPicturesBannerM136525o3.status)));
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m193659L0(User user) {
        if (NullChecker.m81303a(user)) {
            this.f176515j.setText(m193618L(user.profile.moments.counters.receiveMomentLikes));
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m193660M(View view) {
        String str;
        String str2;
        if (!wn90.m204606U(this.f176502V) || (upa.m194745e2() && TextUtils.equals(CoreModule.f17545c.f19639e0.f149321Z3.get(), UserHomeMode.marryMode))) {
            boolean zM193518S0 = this.f176498R.m193518S0();
            ug40 ug40Var = this.f176498R;
            if (zM193518S0) {
                ug40Var.m193530i1(view);
                String str3 = CoreModule.f17545c.f19639e0.f149404j7.m221515e().type;
                if (TextUtils.equals(str3, "boost")) {
                    str2 = "upload_photo_award";
                } else if (TextUtils.equals(str3, "selection")) {
                    str2 = "task_selected";
                } else if (TextUtils.equals(str3, ProfileLikeType.mbti)) {
                    str2 = "task_mbti";
                } else {
                    str2 = TextUtils.equals(str3, "game") ? "task_game" : "default";
                }
                CoreModule.f17545c.f19639e0.m169504ja(str3, "click", "avatar");
                str = str2;
            } else {
                ug40Var.m193514O0();
                str = "default";
            }
        } else {
            this.f176498R.m193530i1(view);
            str = "complete_card_info";
        }
        o6j0.m162859c("e_e_self_icon", this.f176498R.f176354b.mo152480v(), o6j0.C18854a.m162878h("edit_button_status", str));
    }

    /* JADX INFO: renamed from: M0 */
    public void m193661M0(User user) {
        this.f176501U.mo103691q(user);
    }

    /* JADX INFO: renamed from: N */
    public void m193662N() {
        if (TextUtils.isEmpty(this.f176504X)) {
            return;
        }
        C4348d.m20896l().m20900k(this.f176504X);
        this.f176504X = null;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m193663N0(User user) {
        sxj0 sxj0Var = this.f176501U;
        if (sxj0Var instanceof e6k0) {
            sxj0Var.mo115098m(user);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m193664O() {
        xdl0.m208344M(this.f176484D, false);
        xdl0.m208344M(this.f176485E, false);
    }

    /* JADX INFO: renamed from: O0 */
    public void m193665O0() {
        sxj0 sxj0Var = this.f176501U;
        if (sxj0Var != null) {
            sxj0Var.mo103692s();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m193666P0(User user) {
        if (user == null) {
            return;
        }
        this.f176502V = user;
        User userRiskAuditUser = user.riskAuditUser(CoreModule.f17545c.f19639e0.m169430Pa("fake_risk_audit_default_" + user.f56011id));
        this.f176501U.mo103693t().setText(userRiskAuditUser.name);
        m193648E0(userRiskAuditUser);
        m193700z0(userRiskAuditUser);
        m193699y0(userRiskAuditUser);
        m193619P();
        m193645B0(userRiskAuditUser);
        m193661M0(userRiskAuditUser);
        m193644A0(userRiskAuditUser);
        m193646D0(userRiskAuditUser);
        m193658K0();
        m193663N0(userRiskAuditUser);
    }

    /* JADX INFO: renamed from: Q */
    public final void m193667Q(String str, xaj0<String, String, String> xaj0Var) {
        this.f176501U.mo103682e(str, xaj0Var);
    }

    /* JADX INFO: renamed from: R */
    public final void m193668R() {
        this.f176501U.mo103688n(new View.OnClickListener() { // from class: l.nh40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138946a.m193678d0(view);
            }
        });
        o6j0.m162868l("e_set_my_state", this.f176498R.f176354b.mo152480v(), j760.m140076a("source_page", this.f176498R.f176354b.mo152480v()));
    }

    /* JADX INFO: renamed from: S */
    public boolean m193669S() {
        if (NullChecker.m81303a(this.f176498R)) {
            return this.f176498R.m193517R0();
        }
        return false;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m193670T(View view) {
        this.f176498R.m193528g1();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m193671U(View view) {
        this.f176498R.m193533l1();
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m193672V(View view) {
        this.f176498R.m193532k1();
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m193673W(View view) {
        this.f176498R.m193516Q0();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m193674X(View view) {
        this.f176498R.m193515P0();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m193675Y(View view) {
        sxj0 sxj0Var = this.f176501U;
        if (sxj0Var == null || !sxj0Var.mo115099r()) {
            this.f176498R.m193530i1(view);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m193676Z(View view) {
        if (upa.m194800p2()) {
            m193660M(view);
        } else {
            o6j0.m162859c("e_navigation_profile_edit_button", this.f176498R.f176354b.mo152480v(), new o6j0.C18854a[0]);
            this.f176498R.m193514O0();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m193677a0(View view) {
        o6j0.m162859c("e_content_likes", this.f176498R.f176354b.mo152480v(), new o6j0.C18854a[0]);
        CoreModule.m29934N().mo60386qo(getAct());
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m193678d0(View view) {
        o6j0.m162861e("e_set_my_state", this.f176498R.f176354b.mo152480v(), j760.m140076a("source_page", this.f176498R.f176354b.mo152480v()));
        CoreModule.m29934N().mo60361j9(getAct(), OMSDialogPositon.p_navigation_view);
        m193662N();
    }

    @Override // p149l.s7m
    public void destroy() {
        m193654I();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m193679e0(String str, xaj0 xaj0Var) {
        A a;
        if (xaj0Var == null || (a = xaj0Var.f191751a) == 0) {
            this.f176503W = "";
            m193668R();
            if (CoreModule.m29934N().mo60365ko()) {
                this.f176501U.mo103679b(true);
                return;
            }
            return;
        }
        this.f176503W = (String) a;
        m193667Q(str, xaj0Var);
        if (CoreModule.m29934N().mo60365ko()) {
            this.f176501U.mo103679b(false);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m193680f0(View view) {
        pj90.m169785A(getAct(), "me_like_max");
        zvf0.m220399u("e_me_verify_guide", OMSDialogPositon.p_navigation_view, j760.m140076a("slot_source", CoreModule.f17545c.f19663m0.m30996F6() ? "me_like_max" : "me_like"));
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m193681g0(int[] iArr) {
        xdl0.m208345M0(this.f176496P, true);
        int[] iArr2 = new int[2];
        this.f176519n.getLocationOnScreen(iArr2);
        xdl0.m208358V(this.f176496P, (((iArr2[0] + iArr[0]) - t100.f167228C) / 2) - this.f176506a.getPaddingLeft());
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m193682h0(User user, View view) {
        if (user.isIdAndPicBothVerified() || user.isPicVerificationVerified() || user.isStudentVerified() || !NullChecker.m81303a(getAct())) {
            return;
        }
        getAct().startActivity(VerificationCenterAct.m55991X1(getAct(), false));
        zvf0.m220396r("e_mine_verification_bubble", "p_new_navigation");
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m193683i0(View view) {
        if (NullChecker.m81303a(getAct())) {
            getAct().startActivity(VerificationCenterAct.m55991X1(getAct(), false));
            zvf0.m220396r("e_mine_verification_bubble", "p_new_navigation");
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM193649F = m193649F(layoutInflater, viewGroup);
        if (upa.m194800p2()) {
            this.f176501U = new e6k0(getAct());
        } else if (bzc0.m104566f()) {
            this.f176501U = new g33(getAct());
        } else if (m193669S()) {
            this.f176501U = new e6k0(getAct());
        } else {
            this.f176501U = new bsd(getAct());
        }
        View viewInflateView = this.f176501U.inflateView(layoutInflater, this.f176508c);
        this.f176508c.addView(viewInflateView);
        if (upa.m194800p2() && bzc0.m104566f()) {
            int i = t100.f167259h;
            xdl0.m208370d0(viewInflateView, i);
            xdl0.m208372e0(viewInflateView, i);
            xdl0.m208360X(viewInflateView, t100.m186890d(17.0f));
            xdl0.m208357U(viewInflateView, t100.m186890d(18.0f));
        }
        m193636r();
        return viewM193649F;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m193684j0(View view) {
        zvf0.m220396r("e_ideal_exposure_complete_profile", this.f176498R.f176354b.mo152480v());
        lva.m151843D(getAct(), Uri.parse("tantan://profile/edit?mode=dating&from=from_ideal_type_mine_tab_guide"));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m193685k0(View view) {
        this.f176498R.act().startActivity(VipAct.m56237b2(getAct(), khl0.m145975a("diamond")));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m193686l0(View view) {
        zvf0.m220396r("e_my_moment", OMSDialogPositon.p_navigation_view);
        getAct().startActivity(CoreModule.m29934N().mo60339bb(getAct(), CoreModule.m29931H().userId(), "from_profile", -1, "", 2, "pageid", false));
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m193687m0(View view) {
        this.f176498R.m193529h1(view);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m193688n0() {
        r3g.m177669h(getAct());
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m193689o0(RealPicturesBanner realPicturesBanner, User user, View view) {
        zvf0.m220399u("e_upload_photo_award", this.f176498R.f176354b.mo152480v(), vwb.m200311Y("upload_photo_award_status", m193690p0(realPicturesBanner.status)));
        if (user.isBanned()) {
            JailedDialogLikeAct.m44186o2(true);
        } else if (user.isFakeUser()) {
            ark.m98453V0(getAct(), true, user.m60124fp(), getAct().string(R$string.f17827Ik), new Runnable() { // from class: l.lh40
                @Override // java.lang.Runnable
                public final void run() {
                    this.f128035a.m193688n0();
                }
            });
        } else {
            this.f176498R.act().startActivity(CoreTaskCenterAct.m43295Y1(getAct()));
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final String m193690p0(String str) {
        String str2;
        switch (str.hashCode()) {
            case -995381136:
                return str.equals("passed") ? "start_boost" : "";
            case -682587753:
                return str.equals("pending") ? "review" : "";
            case -608496514:
                return str.equals("rejected") ? "failed" : "";
            case 3135317:
                str2 = Channel.fake;
                break;
            case 3599293:
                str2 = "used";
                break;
            case 90550638:
                str2 = "stock_pending";
                break;
            case 111582340:
                return str.equals("using") ? NavigationCardIntent.boosting : "";
            case 1544803905:
                return str.equals("default") ? "upload" : "";
            default:
                return "";
        }
        str.equals(str2);
        return "";
    }

    /* JADX INFO: renamed from: q0 */
    public void m193691q0() {
        this.f176501U.mo103680c();
        final String str = CoreModule.m29932K().me_().f56011id;
        getAct().duringCreated(CoreModule.m29934N().mo60320Tg()).subscribe(mkd0.m154955G(new e30() { // from class: l.mh40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133778a.m193679e0(str, (xaj0) obj);
            }
        }));
        if (!CoreModule.m29934N().mo60341cd() || CoreModule.m29934N().mo60365ko()) {
            return;
        }
        this.f176501U.mo103679b(false);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m193692r0(long j) {
        if (j <= 0 || !ogl0.m164232K()) {
            xdl0.m208345M0(this.f176523r, false);
        } else {
            this.f176523r.setText(String.valueOf(Math.min(j, 999L)));
            xdl0.m208345M0(this.f176523r, true);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m193693s0() {
        sxj0 sxj0Var = this.f176501U;
        if (sxj0Var != null) {
            sxj0Var.mo115096f();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m193694t0() {
        if (CoreModule.f17545c.f19678r0.f20014U.get().booleanValue()) {
            return;
        }
        VText vText = new VText(getAct());
        int i = xdl0.f192403e;
        vText.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        vText.setText(CoreModule.m29934N().mo60341cd() ? "分享无压力，24小时后自动消失" : "支持仅对好友24小时内可见");
        int i2 = t100.f167264m;
        vText.setPadding(i2, t100.m186890d(10.0f), i2, t100.m186890d(10.0f));
        vText.setTextColor(-1);
        vText.getPaint().setFakeBoldText(true);
        this.f176504X = C4348d.m20896l().m20908t(new C4345a(getAct()).m20877s(vText).m20864e(true).m20870k(getAct().getResources().getColor(w0c0.f183773I)).m20855J(14.0f).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m20883y(true).m20875q(C4345a.f15683Q).m20882x(-t100.f167256e), this.f176501U.mo103678a());
        CoreModule.f17545c.f19678r0.f20014U.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: u0 */
    public void m193695u0() {
        if (!wn90.m204602F().m204647R() || CoreModule.f17545c.f19663m0.m31125m6() < 0) {
            xdl0.m208344M(this.f176495O, false);
            return;
        }
        xdl0.m208344M(this.f176495O, true);
        xdl0.m208345M0(this.f176496P, false);
        boolean zM30996F6 = CoreModule.f17545c.f19663m0.m30996F6();
        VText_Medium vText_Medium = this.f176497Q;
        if (zM30996F6) {
            vText_Medium.setText("今天收获" + upa.m194769j1() + "/" + upa.m194769j1() + "个喜欢，已隐藏卡片暂停曝光");
        } else {
            vText_Medium.setText("今日收获" + CoreModule.f17545c.f19663m0.m31125m6() + "个喜欢，未认证每日可获" + upa.m194769j1() + "个喜欢");
        }
        zvf0.m220368A("e_me_verify_guide", OMSDialogPositon.p_navigation_view, j760.m140076a("slot_source", CoreModule.f17545c.f19663m0.m30996F6() ? "me_like_max" : "me_like"));
        xdl0.m208329E0(this.f176495O, new View.OnClickListener() { // from class: l.oh40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143947a.m193680f0(view);
            }
        });
        xdl0.m208353Q0(this.f176519n, new e30() { // from class: l.ph40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148868a.m193681g0((int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public void m193696v0() {
        if (this.f176501U instanceof e6k0) {
            CoreModule.f17545c.f19639e0.f149499w6.put(Boolean.FALSE);
            CoreModule.f17545c.f19639e0.f149506x6.put(0L);
            e6k0 e6k0Var = (e6k0) this.f176501U;
            e6k0Var.m115094W(!xdl0.m208349O0(e6k0Var.f89597c));
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m193697w0() {
        this.f176501U.mo103694u();
    }

    /* JADX INFO: renamed from: x0 */
    public void m193698x0() {
        if (TextUtils.isEmpty(this.f176503W)) {
            return;
        }
        zvf0.m220368A("e_my_state", this.f176498R.f176354b.mo152480v(), vwb.m200311Y("state_id", this.f176503W));
    }

    /* JADX INFO: renamed from: y0 */
    public final void m193699y0(User user) {
        this.f176501U.mo103687l(user);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m193700z0(final User user) {
        VImage vImageM193656J = m193656J();
        if (jjb0.m141784b()) {
            int iM58149h = CertificationUtil.m58149h(user);
            if (iM58149h != -1) {
                xdl0.m208344M(vImageM193656J, true);
                vImageM193656J.setImageResource(iM58149h);
            } else {
                xdl0.m208344M(vImageM193656J, false);
            }
            xdl0.m208329E0(vImageM193656J, new View.OnClickListener() { // from class: l.qh40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f154426a.m193682h0(user, view);
                }
            });
            return;
        }
        if (user.isPicVerificationVerified()) {
            xdl0.m208344M(vImageM193656J, true);
            vImageM193656J.setImageResource(x2c0.f189654Pt);
        } else if (user.isStudentVerified()) {
            xdl0.m208344M(vImageM193656J, true);
            vImageM193656J.setImageResource(x2c0.f189807Ur);
        } else {
            vImageM193656J.setImageResource(x2c0.f189960Zp);
            xdl0.m208344M(vImageM193656J, true);
            xdl0.m208329E0(vImageM193656J, new View.OnClickListener() { // from class: l.rh40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f159337a.m193683i0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: D1 */
    public void m193647D1() {
    }
}
