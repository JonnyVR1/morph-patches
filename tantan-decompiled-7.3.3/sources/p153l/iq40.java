package p153l;

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
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.data.ProfileLikeType;
import com.p051p1.mobile.putong.core.data.RealPicturesBanner;
import com.p051p1.mobile.putong.core.data.UserHomeMode;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.CoreTaskCenterAct;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.account.JailedDialogLikeAct;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationCenterAct;
import com.p051p1.mobile.putong.core.p058ui.vip.VipAct;
import com.p051p1.mobile.putong.core.util.CertificationUtil;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.NavigationCardIntent;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.ArrayList;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VOnlineIndicator;
import p151v.VText;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class iq40 extends xek0<ip40> {

    /* JADX INFO: renamed from: A */
    public LinearLayout f116331A;

    /* JADX INFO: renamed from: B */
    public VText f116332B;

    /* JADX INFO: renamed from: C */
    public Space f116333C;

    /* JADX INFO: renamed from: D */
    public VOnlineIndicator f116334D;

    /* JADX INFO: renamed from: E */
    public VText f116335E;

    /* JADX INFO: renamed from: F */
    public View f116336F;

    /* JADX INFO: renamed from: G */
    public LinearLayout f116337G;

    /* JADX INFO: renamed from: H */
    public VText f116338H;

    /* JADX INFO: renamed from: I */
    public VText f116339I;

    /* JADX INFO: renamed from: J */
    public View f116340J;

    /* JADX INFO: renamed from: K */
    public LinearLayout f116341K;

    /* JADX INFO: renamed from: L */
    public VText f116342L;

    /* JADX INFO: renamed from: M */
    public VOnlineIndicator f116343M;

    /* JADX INFO: renamed from: N */
    public VText f116344N;

    /* JADX INFO: renamed from: O */
    public VLinear f116345O;

    /* JADX INFO: renamed from: P */
    public View f116346P;

    /* JADX INFO: renamed from: Q */
    public VText_Medium f116347Q;

    /* JADX INFO: renamed from: R */
    public ip40 f116348R;

    /* JADX INFO: renamed from: S */
    public final Context f116349S;

    /* JADX INFO: renamed from: T */
    public final ArrayList<String> f116350T = jyb.m147482M("default");

    /* JADX INFO: renamed from: U */
    public y6k0 f116351U;

    /* JADX INFO: renamed from: V */
    @Nullable
    public User f116352V;

    /* JADX INFO: renamed from: W */
    public String f116353W;

    /* JADX INFO: renamed from: X */
    public String f116354X;

    /* JADX INFO: renamed from: Y */
    public Animator f116355Y;

    /* JADX INFO: renamed from: a */
    public VFrame f116356a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f116357b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f116358c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f116359d;

    /* JADX INFO: renamed from: e */
    public VText_Medium f116360e;

    /* JADX INFO: renamed from: f */
    public TextView f116361f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f116362g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f116363h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f116364i;

    /* JADX INFO: renamed from: j */
    public VText f116365j;

    /* JADX INFO: renamed from: k */
    public VOnlineIndicator f116366k;

    /* JADX INFO: renamed from: l */
    public VText f116367l;

    /* JADX INFO: renamed from: m */
    public View f116368m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f116369n;

    /* JADX INFO: renamed from: o */
    public RelativeLayout f116370o;

    /* JADX INFO: renamed from: p */
    public VText f116371p;

    /* JADX INFO: renamed from: q */
    public VText f116372q;

    /* JADX INFO: renamed from: r */
    public VText f116373r;

    /* JADX INFO: renamed from: s */
    public LinearLayout f116374s;

    /* JADX INFO: renamed from: t */
    public VText f116375t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f116376u;

    /* JADX INFO: renamed from: v */
    public VText f116377v;

    /* JADX INFO: renamed from: w */
    public VText f116378w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f116379x;

    /* JADX INFO: renamed from: y */
    public ConstraintLayout f116380y;

    /* JADX INFO: renamed from: z */
    public VText f116381z;

    public iq40(Context context) {
        this.f116349S = context;
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m141561A(View view) {
    }

    /* JADX INFO: renamed from: K */
    public static String m141565K(long j) {
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
    public static String m141566L(long j) {
        if (j <= 9999) {
            return j + "";
        }
        if (j >= 9999999) {
            return "999w+";
        }
        return a9g0.m96568c(j / 10000.0f) + "w";
    }

    /* JADX INFO: renamed from: P */
    private void m141567P() {
        bnl0.m105509E0(this.f116357b, new View.OnClickListener() { // from class: l.lp40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133006a.m141623Y(view);
            }
        });
        if (gra.m131731p2()) {
            this.f116351U.mo149548k(new View.OnClickListener() { // from class: l.mp40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f137871a.m141608M(view);
                }
            });
        }
        this.f116351U.mo149545h(new View.OnClickListener() { // from class: l.np40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143070a.m141624Z(view);
            }
        });
        bnl0.m105509E0(this.f116364i, new View.OnClickListener() { // from class: l.op40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148414a.m141625a0(view);
            }
        });
        bnl0.m105509E0(this.f116369n, new View.OnClickListener() { // from class: l.pp40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153482a.m141618T(view);
            }
        });
        bnl0.m105509E0(this.f116376u, new View.OnClickListener() { // from class: l.qp40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158820a.m141619U(view);
            }
        });
        bnl0.m105509E0(this.f116379x, new View.OnClickListener() { // from class: l.rp40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164308a.m141620V(view);
            }
        });
        this.f116351U.mo149547j(new View.OnClickListener() { // from class: l.sp40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170013a.m141621W(view);
            }
        }, new View.OnClickListener() { // from class: l.tp40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f175554a.m141622X(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m141570b0(View view) {
        this.f116348R.m141444j1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m141572c0(View view) {
        i4g0.m138520r("e_my_moment", OMSDialogPositon.p_navigation_view);
        getAct().startActivity(CoreModule.m30932N().argsToPhotoAlbumFeedAct(getAct(), CoreModule.m30929H().userId(), "p_my_moment", -1, null, 0));
    }

    /* JADX INFO: renamed from: r */
    private void m141584r() {
        this.f116351U.mo149556t().setTypeface(Typeface.DEFAULT_BOLD);
        bnl0.m105509E0(this.f116351U.mo149541d(), new View.OnClickListener() { // from class: l.jp40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122073a.m141570b0(view);
            }
        });
        bnl0.m105524M(this.f116364i, false);
        bnl0.m105524M(this.f116368m, false);
        LinearLayout linearLayout = this.f116363h;
        int i = qa00.f156323j;
        bnl0.m105538V(linearLayout, -i);
        bnl0.m105539W(this.f116363h, -i);
        if (m141617S() || !gra.m131731p2()) {
            VFrame vFrame = this.f116356a;
            int i2 = qa00.f156321h;
            bnl0.m105550d0(vFrame, i2);
            bnl0.m105552e0(this.f116356a, i2);
            bnl0.m105540X(this.f116363h, qa00.f156319f);
            this.f116338H.setText("动态");
        }
        if (m141617S() && !gra.m131731p2() && !spl0.m187360L()) {
            bnl0.m105524M(this.f116336F, true);
            bnl0.m105524M(this.f116337G, true);
            bnl0.m105509E0(this.f116337G, new View.OnClickListener() { // from class: l.up40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f180216a.m141572c0(view);
                }
            });
        }
        if (e7d0.m119697f()) {
            bnl0.m105524M(this.f116363h, false);
        } else if (m141617S() && !gra.m131731p2()) {
            if (gra.m131778z()) {
                this.f116365j.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
                this.f116371p.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
                this.f116372q.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
                this.f116377v.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
                this.f116381z.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
                this.f116338H.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
                this.f116365j.setTextSize(20.0f);
                this.f116371p.setTextSize(20.0f);
                this.f116372q.setTextSize(20.0f);
                this.f116377v.setTextSize(20.0f);
                this.f116381z.setTextSize(20.0f);
                this.f116338H.setTextSize(20.0f);
            }
            VText vText = this.f116367l;
            int i3 = qa00.f156320g;
            bnl0.m105540X(vText, i3);
            bnl0.m105540X(this.f116374s, i3);
            bnl0.m105540X(this.f116378w, i3);
            bnl0.m105540X(this.f116332B, i3);
            bnl0.m105540X(this.f116339I, i3);
            bnl0.m105540X(this.f116344N, i3);
            this.f116339I.setText("动态");
        }
        if (spl0.m187360L()) {
            m141605J0(0);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m141590y(View view) {
    }

    /* JADX INFO: renamed from: A0 */
    public final void m141592A0(User user) {
        this.f116351U.mo149553p(user);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m141593B0(User user) {
        this.f116351U.mo149546i(user);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f116349S;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m141594D0(User user) {
        if (!aw90.m100562F().m100608S() || !gra.m131649Y1() || gra.m131731p2() || m141617S()) {
            bnl0.m105524M(this.f116359d, false);
            return;
        }
        int iM100602L = aw90.m100562F().m100602L(user);
        LinearLayout linearLayout = this.f116359d;
        if (iM100602L < 50) {
            bnl0.m105524M(linearLayout, true);
            this.f116360e.setText("当前曝光较少");
            this.f116361f.setText("完善资料，优先推荐给更多合适的人");
            this.f116362g.setText("去完善");
            i4g0.m138526x("e_ideal_exposure_complete_profile", this.f116348R.f116254b.mo194978v());
        } else {
            bnl0.m105524M(linearLayout, false);
        }
        bnl0.m105509E0(this.f116359d, new View.OnClickListener() { // from class: l.hq40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iq40.m141561A(view);
            }
        });
        bnl0.m105509E0(this.f116362g, new View.OnClickListener() { // from class: l.kp40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127828a.m141632j0(view);
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public void m141596E0(User user) {
        ODiamondTagLabel oDiamondTagLabelMo149544g = this.f116351U.mo149544g();
        VImage vImageMo149541d = this.f116351U.mo149541d();
        bnl0.m105524M(oDiamondTagLabelMo149544g, false);
        bnl0.m105524M(vImageMo149541d, false);
        if (t450.m189175j()) {
            bnl0.m105524M(oDiamondTagLabelMo149544g, true);
            oDiamondTagLabelMo149544g.m80350o0();
            bnl0.m105509E0(oDiamondTagLabelMo149544g, new View.OnClickListener() { // from class: l.gq40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f105649a.m141633k0(view);
                }
            });
        } else {
            bnl0.m105524M(vImageMo149541d, true);
            CoreModule.m30933P().m143408e().mo35985j7(getAct(), user, vImageMo149541d, true, true);
            ViewGroup.LayoutParams layoutParams = vImageMo149541d.getLayoutParams();
            layoutParams.width = -2;
            vImageMo149541d.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: F */
    public View m141597F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jq40.m146554b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ip40 ip40Var) {
        this.f116348R = ip40Var;
    }

    /* JADX INFO: renamed from: G0 */
    public void m141599G0(ovb0<User, CoreLikers.C4870a, Integer, Integer> ovb0Var) {
        Long l2 = ovb0Var.f149248a.profile.receivedLikes;
        long jLongValue = l2 == null ? 0L : l2.longValue();
        if (jLongValue > CoreModule.f18264c.f20381e0.f89257j3) {
            sfj0.m185601h("e_my_tab_see_red_dot", this.f116348R.f116254b.mo194978v(), new sfj0.C20032a[0]);
        }
        dkb dkbVar = CoreModule.f18264c.f20381e0;
        dkbVar.f89257j3 = Math.max(dkbVar.f89257j3, jLongValue);
        this.f116371p.setText(m141566L(CoreModule.f18264c.f20381e0.f89257j3));
        m141640r0(aw90.m100562F().m100598G(CoreModule.f18264c.f20381e0.f89257j3));
    }

    /* JADX INFO: renamed from: H */
    public void m141600H() {
        y6k0 y6k0Var = this.f116351U;
        if (y6k0Var instanceof kfk0) {
            ((kfk0) y6k0Var).m149524J();
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m141601H0() {
        String str;
        ArrayList<String> arrayList = this.f116350T;
        String str2 = arrayList.get(arrayList.size() - 1);
        str2.getClass();
        if (str2.equals("appeal")) {
            sfj0.m185601h("e_my_profile_navigation_appeal_guide", this.f116348R.f116254b.mo194978v(), sfj0.C20032a.m185615h("ban_user_appeal_state", yc2.m215118e().m215120b()));
        } else if (str2.equals("picture_fake")) {
            sfj0.m185601h("e_picture_fake_button", this.f116348R.f116254b.mo194978v(), new sfj0.C20032a[0]);
        }
        if (gra.m131731p2()) {
            if (aw90.m100566U(this.f116352V)) {
                str = "complete_card_info";
            } else {
                String str3 = "default";
                if ((!gra.m131676e2() || !TextUtils.equals(CoreModule.f18264c.f20381e0.f89178Z3.get(), UserHomeMode.marryMode)) && NullChecker.m82486a(CoreModule.f18264c.f20381e0.f89261j7.m222761e()) && !TextUtils.isEmpty(CoreModule.f18264c.f20381e0.f89261j7.m222761e().type)) {
                    String str4 = CoreModule.f18264c.f20381e0.f89261j7.m222761e().type;
                    if (TextUtils.equals(str4, "boost")) {
                        str3 = "upload_photo_award";
                    } else if (TextUtils.equals(str4, "selection")) {
                        str3 = "task_selected";
                    } else if (TextUtils.equals(str4, ProfileLikeType.mbti)) {
                        str3 = "task_mbti";
                    } else if (TextUtils.equals(str4, "game")) {
                        str3 = "task_game";
                    }
                    CoreModule.f18264c.f20381e0.m116577ja(str4, "exposure", "avatar");
                }
                str = str3;
            }
            sfj0.m185601h("e_e_self_icon", OMSDialogPositon.p_navigation_view, sfj0.C20032a.m185615h("edit_button_status", str));
        }
    }

    /* JADX INFO: renamed from: I */
    public void m141602I() {
        if (NullChecker.m82486a(this.f116355Y)) {
            this.f116355Y.cancel();
            this.f116355Y = null;
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m141603I0(int i) {
        this.f116351U.mo149552o(i);
        if (m141617S() && !gra.m131731p2()) {
            bnl0.m105509E0(this.f116337G, new View.OnClickListener() { // from class: l.yp40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f201041a.m141634l0(view);
                }
            });
        }
        this.f116338H.setText(m141565K(i));
    }

    /* JADX INFO: renamed from: J */
    public VImage m141604J() {
        return this.f116351U.mo149558v();
    }

    /* JADX INFO: renamed from: J0 */
    public void m141605J0(int i) {
        if (spl0.m187360L()) {
            bnl0.m105524M(this.f116341K, true);
            bnl0.m105524M(this.f116340J, true);
            if (joa.m146386f4() && i > 0 && CoreModule.f18264c.f20407m2.m123965q3()) {
                bnl0.m105524M(this.f116343M, true);
            } else {
                bnl0.m105524M(this.f116343M, false);
            }
            VText vText = this.f116342L;
            if (i > 99) {
                vText.setText("99+");
            } else {
                vText.setText(i + "");
            }
            bnl0.m105509E0(this.f116341K, new View.OnClickListener() { // from class: l.vp40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f185212a.m141635m0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m141606K0() {
        if (gra.m131781z2() || gra.m131540A2()) {
            if ((gra.m131781z2() && e7d0.m119697f()) || m141617S() || gra.m131731p2()) {
                return;
            }
            final User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            final RealPicturesBanner realPicturesBannerM158740o3 = CoreModule.f18264c.f20422r2.m158740o3();
            if (realPicturesBannerM158740o3 == null || userM116600p9.isBanned() || userM116600p9.isProfileJailed() || userM116600p9.isFakeUser() || jyb.m147507f0(Channel.fake, "used").contains(realPicturesBannerM158740o3.status) || TextUtils.isEmpty(realPicturesBannerM158740o3.text.title)) {
                m141594D0(CoreModule.f18264c.f20381e0.m116600p9().riskAuditUser(CoreModule.f18264c.f20381e0.m116503Pa("fake_risk_audit_default_" + CoreModule.m30929H().userId())));
                return;
            }
            bnl0.m105524M(this.f116359d, true);
            if (gra.m131540A2() && e7d0.m119697f()) {
                bnl0.m105540X(this.f116359d, 0);
                bnl0.m105537U(this.f116359d, qa00.m175859d(8.0f));
            }
            this.f116360e.setText(realPicturesBannerM158740o3.text.title);
            this.f116361f.setText(realPicturesBannerM158740o3.text.subTitle);
            this.f116362g.setText(realPicturesBannerM158740o3.text.button);
            bnl0.m105509E0(this.f116362g, new View.OnClickListener() { // from class: l.wp40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f190254a.m141637o0(realPicturesBannerM158740o3, userM116600p9, view);
                }
            });
            bnl0.m105509E0(this.f116359d, new View.OnClickListener() { // from class: l.xp40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    iq40.m141590y(view);
                }
            });
            i4g0.m138492A("e_upload_photo_award", this.f116348R.f116254b.mo194978v(), jyb.m147494Y("upload_photo_award_status", m141638p0(realPicturesBannerM158740o3.status)));
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m141607L0(User user) {
        if (NullChecker.m82486a(user)) {
            this.f116365j.setText(m141566L(user.profile.moments.counters.receiveMomentLikes));
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m141608M(View view) {
        String str;
        String str2;
        if (!aw90.m100566U(this.f116352V) || (gra.m131676e2() && TextUtils.equals(CoreModule.f18264c.f20381e0.f89178Z3.get(), UserHomeMode.marryMode))) {
            boolean zM141431S0 = this.f116348R.m141431S0();
            ip40 ip40Var = this.f116348R;
            if (zM141431S0) {
                ip40Var.m141443i1(view);
                String str3 = CoreModule.f18264c.f20381e0.f89261j7.m222761e().type;
                if (TextUtils.equals(str3, "boost")) {
                    str2 = "upload_photo_award";
                } else if (TextUtils.equals(str3, "selection")) {
                    str2 = "task_selected";
                } else if (TextUtils.equals(str3, ProfileLikeType.mbti)) {
                    str2 = "task_mbti";
                } else {
                    str2 = TextUtils.equals(str3, "game") ? "task_game" : "default";
                }
                CoreModule.f18264c.f20381e0.m116577ja(str3, "click", "avatar");
                str = str2;
            } else {
                ip40Var.m141427O0();
                str = "default";
            }
        } else {
            this.f116348R.m141443i1(view);
            str = "complete_card_info";
        }
        sfj0.m185596c("e_e_self_icon", this.f116348R.f116254b.mo194978v(), sfj0.C20032a.m185615h("edit_button_status", str));
    }

    /* JADX INFO: renamed from: M0 */
    public void m141609M0(User user) {
        this.f116351U.mo149554q(user);
    }

    /* JADX INFO: renamed from: N */
    public void m141610N() {
        if (TextUtils.isEmpty(this.f116354X)) {
            return;
        }
        C4499d.m21895l().m21899k(this.f116354X);
        this.f116354X = null;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m141611N0(User user) {
        y6k0 y6k0Var = this.f116351U;
        if (y6k0Var instanceof kfk0) {
            y6k0Var.mo149550m(user);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m141612O() {
        bnl0.m105524M(this.f116334D, false);
        bnl0.m105524M(this.f116335E, false);
    }

    /* JADX INFO: renamed from: O0 */
    public void m141613O0() {
        y6k0 y6k0Var = this.f116351U;
        if (y6k0Var != null) {
            y6k0Var.mo177915s();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m141614P0(User user) {
        if (user == null) {
            return;
        }
        this.f116352V = user;
        User userRiskAuditUser = user.riskAuditUser(CoreModule.f18264c.f20381e0.m116503Pa("fake_risk_audit_default_" + user.f56859id));
        this.f116351U.mo149556t().setText(userRiskAuditUser.name);
        m141596E0(userRiskAuditUser);
        m141648z0(userRiskAuditUser);
        m141647y0(userRiskAuditUser);
        m141567P();
        m141593B0(userRiskAuditUser);
        m141609M0(userRiskAuditUser);
        m141592A0(userRiskAuditUser);
        m141594D0(userRiskAuditUser);
        m141606K0();
        m141611N0(userRiskAuditUser);
    }

    /* JADX INFO: renamed from: Q */
    public final void m141615Q(String str, bkj0<String, String, String> bkj0Var) {
        this.f116351U.mo149542e(str, bkj0Var);
    }

    /* JADX INFO: renamed from: R */
    public final void m141616R() {
        this.f116351U.mo149551n(new View.OnClickListener() { // from class: l.bq40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77854a.m141626d0(view);
            }
        });
        sfj0.m185605l("e_set_my_state", this.f116348R.f116254b.mo194978v(), pf60.m172085a("source_page", this.f116348R.f116254b.mo194978v()));
    }

    /* JADX INFO: renamed from: S */
    public boolean m141617S() {
        if (NullChecker.m82486a(this.f116348R)) {
            return this.f116348R.m141430R0();
        }
        return false;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m141618T(View view) {
        this.f116348R.m141441g1();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m141619U(View view) {
        this.f116348R.m141446l1();
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m141620V(View view) {
        this.f116348R.m141445k1();
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m141621W(View view) {
        this.f116348R.m141429Q0();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m141622X(View view) {
        this.f116348R.m141428P0();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m141623Y(View view) {
        y6k0 y6k0Var = this.f116351U;
        if (y6k0Var == null || !y6k0Var.mo149555r()) {
            this.f116348R.m141443i1(view);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m141624Z(View view) {
        if (gra.m131731p2()) {
            m141608M(view);
        } else {
            sfj0.m185596c("e_navigation_profile_edit_button", this.f116348R.f116254b.mo194978v(), new sfj0.C20032a[0]);
            this.f116348R.m141427O0();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m141625a0(View view) {
        sfj0.m185596c("e_content_likes", this.f116348R.f116254b.mo194978v(), new sfj0.C20032a[0]);
        CoreModule.m30932N().mo61570qo(getAct());
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m141626d0(View view) {
        sfj0.m185598e("e_set_my_state", this.f116348R.f116254b.mo194978v(), pf60.m172085a("source_page", this.f116348R.f116254b.mo194978v()));
        CoreModule.m30932N().mo61545j9(getAct(), OMSDialogPositon.p_navigation_view);
        m141610N();
    }

    @Override // p153l.iam
    public void destroy() {
        m141602I();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m141627e0(String str, bkj0 bkj0Var) {
        A a;
        if (bkj0Var == null || (a = bkj0Var.f77081a) == 0) {
            this.f116353W = "";
            m141616R();
            if (CoreModule.m30932N().mo61549ko()) {
                this.f116351U.mo149539b(true);
                return;
            }
            return;
        }
        this.f116353W = (String) a;
        m141615Q(str, bkj0Var);
        if (CoreModule.m30932N().mo61549ko()) {
            this.f116351U.mo149539b(false);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m141628f0(View view) {
        tr90.m192410A(getAct(), "me_like_max");
        i4g0.m138523u("e_me_verify_guide", OMSDialogPositon.p_navigation_view, pf60.m172085a("slot_source", CoreModule.f18264c.f20405m0.m31999F6() ? "me_like_max" : "me_like"));
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m141629g0(int[] iArr) {
        bnl0.m105525M0(this.f116346P, true);
        int[] iArr2 = new int[2];
        this.f116369n.getLocationOnScreen(iArr2);
        bnl0.m105538V(this.f116346P, (((iArr2[0] + iArr[0]) - qa00.f156290C) / 2) - this.f116356a.getPaddingLeft());
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m141630h0(User user, View view) {
        if (user.isIdAndPicBothVerified() || user.isPicVerificationVerified() || user.isStudentVerified() || !NullChecker.m82486a(getAct())) {
            return;
        }
        getAct().startActivity(VerificationCenterAct.m57174Y1(getAct(), false));
        i4g0.m138520r("e_mine_verification_bubble", "p_new_navigation");
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m141631i0(View view) {
        if (NullChecker.m82486a(getAct())) {
            getAct().startActivity(VerificationCenterAct.m57174Y1(getAct(), false));
            i4g0.m138520r("e_mine_verification_bubble", "p_new_navigation");
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM141597F = m141597F(layoutInflater, viewGroup);
        if (gra.m131731p2()) {
            this.f116351U = new kfk0(getAct());
        } else if (e7d0.m119697f()) {
            this.f116351U = new w33(getAct());
        } else if (m141617S()) {
            this.f116351U = new kfk0(getAct());
        } else {
            this.f116351U = new qtd(getAct());
        }
        View viewInflateView = this.f116351U.inflateView(layoutInflater, this.f116358c);
        this.f116358c.addView(viewInflateView);
        if (gra.m131731p2() && e7d0.m119697f()) {
            int i = qa00.f156321h;
            bnl0.m105550d0(viewInflateView, i);
            bnl0.m105552e0(viewInflateView, i);
            bnl0.m105540X(viewInflateView, qa00.m175859d(17.0f));
            bnl0.m105537U(viewInflateView, qa00.m175859d(18.0f));
        }
        m141584r();
        return viewM141597F;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m141632j0(View view) {
        i4g0.m138520r("e_ideal_exposure_complete_profile", this.f116348R.f116254b.mo194978v());
        xwa.m213304D(getAct(), Uri.parse("tantan://profile/edit?mode=dating&from=from_ideal_type_mine_tab_guide"));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m141633k0(View view) {
        this.f116348R.act().startActivity(VipAct.m57420c2(getAct(), oql0.m168817a("diamond")));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m141634l0(View view) {
        i4g0.m138520r("e_my_moment", OMSDialogPositon.p_navigation_view);
        getAct().startActivity(CoreModule.m30932N().mo61523bb(getAct(), CoreModule.m30929H().userId(), "from_profile", -1, "", 2, "pageid", false));
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m141635m0(View view) {
        this.f116348R.m141442h1(view);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m141636n0() {
        f5g.m124130h(getAct());
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m141637o0(RealPicturesBanner realPicturesBanner, User user, View view) {
        i4g0.m138523u("e_upload_photo_award", this.f116348R.f116254b.mo194978v(), jyb.m147494Y("upload_photo_award_status", m141638p0(realPicturesBanner.status)));
        if (user.isBanned()) {
            JailedDialogLikeAct.m45369p2(true);
        } else if (user.isFakeUser()) {
            qtk.m178003V0(getAct(), true, user.m61308fp(), getAct().string(R$string.f19221el), new Runnable() { // from class: l.zp40
                @Override // java.lang.Runnable
                public final void run() {
                    this.f205421a.m141636n0();
                }
            });
        } else {
            this.f116348R.act().startActivity(CoreTaskCenterAct.m44481Z1(getAct()));
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final String m141638p0(String str) {
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
    public void m141639q0() {
        this.f116351U.mo149540c();
        final String str = CoreModule.m30930K().me_().f56859id;
        getAct().duringCreated(CoreModule.m30932N().mo61504Tg()).subscribe(psd0.m173596G(new y20() { // from class: l.aq40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72785a.m141627e0(str, (bkj0) obj);
            }
        }));
        if (!CoreModule.m30932N().mo61525cd() || CoreModule.m30932N().mo61549ko()) {
            return;
        }
        this.f116351U.mo149539b(false);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m141640r0(long j) {
        if (j <= 0 || !spl0.m187359K()) {
            bnl0.m105525M0(this.f116373r, false);
        } else {
            this.f116373r.setText(String.valueOf(Math.min(j, 999L)));
            bnl0.m105525M0(this.f116373r, true);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m141641s0() {
        y6k0 y6k0Var = this.f116351U;
        if (y6k0Var != null) {
            y6k0Var.mo149543f();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m141642t0() {
        if (CoreModule.f18264c.f20420r0.f20756U.get().booleanValue()) {
            return;
        }
        VText vText = new VText(getAct());
        int i = bnl0.f77544e;
        vText.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        vText.setText(CoreModule.m30932N().mo61525cd() ? "分享无压力，24小时后自动消失" : "支持仅对好友24小时内可见");
        int i2 = qa00.f156326m;
        vText.setPadding(i2, qa00.m175859d(10.0f), i2, qa00.m175859d(10.0f));
        vText.setTextColor(-1);
        vText.getPaint().setFakeBoldText(true);
        this.f116354X = C4499d.m21895l().m21907t(new C4496a(getAct()).m21876s(vText).m21863e(true).m21869k(getAct().getResources().getColor(c9c0.f80342I)).m21854J(14.0f).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m21882y(true).m21874q(C4496a.f16402Q).m21881x(-qa00.f156318e), this.f116351U.mo149538a());
        CoreModule.f18264c.f20420r0.f20756U.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: u0 */
    public void m141643u0() {
        if (!aw90.m100562F().m100607R() || CoreModule.f18264c.f20405m0.m32128m6() < 0) {
            bnl0.m105524M(this.f116345O, false);
            return;
        }
        bnl0.m105524M(this.f116345O, true);
        bnl0.m105525M0(this.f116346P, false);
        boolean zM31999F6 = CoreModule.f18264c.f20405m0.m31999F6();
        VText_Medium vText_Medium = this.f116347Q;
        if (zM31999F6) {
            vText_Medium.setText("今天收获" + gra.m131700j1() + "/" + gra.m131700j1() + "个喜欢，已隐藏卡片暂停曝光");
        } else {
            vText_Medium.setText("今日收获" + CoreModule.f18264c.f20405m0.m32128m6() + "个喜欢，未认证每日可获" + gra.m131700j1() + "个喜欢");
        }
        i4g0.m138492A("e_me_verify_guide", OMSDialogPositon.p_navigation_view, pf60.m172085a("slot_source", CoreModule.f18264c.f20405m0.m31999F6() ? "me_like_max" : "me_like"));
        bnl0.m105509E0(this.f116345O, new View.OnClickListener() { // from class: l.cq40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83069a.m141628f0(view);
            }
        });
        bnl0.m105533Q0(this.f116369n, new y20() { // from class: l.dq40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90173a.m141629g0((int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public void m141644v0() {
        if (this.f116351U instanceof kfk0) {
            CoreModule.f18264c.f20381e0.f89356w6.put(Boolean.FALSE);
            CoreModule.f18264c.f20381e0.f89363x6.put(0L);
            kfk0 kfk0Var = (kfk0) this.f116351U;
            kfk0Var.m149536W(!bnl0.m105529O0(kfk0Var.f126413c));
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m141645w0() {
        this.f116351U.mo149557u();
    }

    /* JADX INFO: renamed from: x0 */
    public void m141646x0() {
        if (TextUtils.isEmpty(this.f116353W)) {
            return;
        }
        i4g0.m138492A("e_my_state", this.f116348R.f116254b.mo194978v(), jyb.m147494Y("state_id", this.f116353W));
    }

    /* JADX INFO: renamed from: y0 */
    public final void m141647y0(User user) {
        this.f116351U.mo149549l(user);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m141648z0(final User user) {
        VImage vImageM141604J = m141604J();
        if (nrb0.m164466b()) {
            int iM59332h = CertificationUtil.m59332h(user);
            if (iM59332h != -1) {
                bnl0.m105524M(vImageM141604J, true);
                vImageM141604J.setImageResource(iM59332h);
            } else {
                bnl0.m105524M(vImageM141604J, false);
            }
            bnl0.m105509E0(vImageM141604J, new View.OnClickListener() { // from class: l.eq40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f95300a.m141630h0(user, view);
                }
            });
            return;
        }
        if (user.isPicVerificationVerified()) {
            bnl0.m105524M(vImageM141604J, true);
            vImageM141604J.setImageResource(dbc0.f86103Du);
        } else if (user.isStudentVerified()) {
            bnl0.m105524M(vImageM141604J, true);
            vImageM141604J.setImageResource(dbc0.f86261Is);
        } else {
            vImageM141604J.setImageResource(dbc0.f86419Nq);
            bnl0.m105524M(vImageM141604J, true);
            bnl0.m105509E0(vImageM141604J, new View.OnClickListener() { // from class: l.fq40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f100245a.m141631i0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: D1 */
    public void m141595D1() {
    }
}
