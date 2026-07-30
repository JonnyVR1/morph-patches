package p153l;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.pushbubble.SimplePushBubble;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.InvitationInfo;
import com.p051p1.mobile.putong.core.newui.home.justreal.JustRealSuccessLayout;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantanapp.common.utils.NullChecker;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes12.dex */
public class x5l0 {

    /* JADX INFO: renamed from: a */
    public static boolean f192502a = true;

    /* JADX INFO: renamed from: c */
    public static kcg0 f192504c;

    /* JADX INFO: renamed from: d */
    public static kcg0 f192505d;

    /* JADX INFO: renamed from: e */
    public static kcg0 f192506e;

    /* JADX INFO: renamed from: b */
    public static C22508b<Integer> f192503b = C22508b.m222767b();

    /* JADX INFO: renamed from: f */
    public static StudentVerificationStatus f192507f = StudentVerificationStatus.get("unknown_");

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m209388a(Act act, SimplePushBubble simplePushBubble, View view) {
        if (CoreModule.f18264c.f20381e0.m116593na().isFemale()) {
            nae0.m162083m(act, Uri.parse("tantan://myMeet"));
        } else {
            nae0.m162083m(act, Uri.parse("tantanapp://seeLikes?preferredShowPurchase=true&preferredShowDetail=true"));
        }
        simplePushBubble.m22134I();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m209389b(Act act) {
        if (act instanceof NewMainAct) {
            ud2.m195456j().m195467n(6000L);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m209391d(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m209392e(SVGADynamicEntity sVGADynamicEntity, String str, Bitmap bitmap) {
        if (NullChecker.m82486a(bitmap)) {
            sVGADynamicEntity.setDynamicImage(bitmap, str);
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m209393f(String str) {
        if (TextUtils.equals(str, "fakeBatch")) {
            return "avatar_compare";
        }
        if (TextUtils.equals(str, "fromPicVerificationDlg")) {
            return "alive";
        }
        return TextUtils.equals(str, "fromNameVerificationDlg") ? "id_info" : "";
    }

    /* JADX INFO: renamed from: g */
    public static String m209394g(String str) {
        if (TextUtils.equals(str, "fakeBatch")) {
            return "fake_appeal";
        }
        return (TextUtils.equals(str, "fromPicVerificationDlg") || TextUtils.equals(str, "fromNameVerificationDlg")) ? "security_force_verification" : "";
    }

    /* JADX INFO: renamed from: h */
    public static String m209395h(int i) {
        if (i == 1) {
            return "avatar_verification";
        }
        if (i == 2) {
            return "id_verification";
        }
        return i == 3 ? "country_verification" : User.ID_TEAM_ACCOUNT;
    }

    /* JADX INFO: renamed from: i */
    public static String m209396i(String str, int i) {
        if (TextUtils.equals(str, "fromNameVerificationDlg")) {
            return "id_ability";
        }
        if (TextUtils.equals(str, "appeal")) {
            return "appeal_verification";
        }
        return (TextUtils.equals(str, "fakeBatch") || TextUtils.equals(str, "fromPicVerificationDlg")) ? "avatar_ability" : m209395h(i);
    }

    /* JADX INFO: renamed from: j */
    public static void m209397j() {
        psd0.m173633z(f192504c);
        psd0.m173633z(f192505d);
        psd0.m173633z(f192506e);
        f192507f = StudentVerificationStatus.get("unknown_");
    }

    /* JADX INFO: renamed from: k */
    public static void m209398k(final SVGADynamicEntity sVGADynamicEntity, String str, final String str2) {
        uqb0.f180374G.m127100E(str).filter(new dgq()).map(new egq()).subscribe(psd0.m173597H(new y20() { // from class: l.v5l0
            @Override // p153l.y20
            public final void call(Object obj) {
                x5l0.m209392e(sVGADynamicEntity, str2, (Bitmap) obj);
            }
        }, new y20() { // from class: l.w5l0
            @Override // p153l.y20
            public final void call(Object obj) {
                x5l0.m209391d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public static void m209399l(Activity activity, boolean z, InvitationInfo invitationInfo) {
        boolean z2;
        View view;
        if (activity instanceof Act) {
            final Act act = (Act) activity;
            CoreModule.f18264c.f20446z2.m31247l3();
            if (z && NullChecker.m82486a(invitationInfo) && !jyb.m147479J(invitationInfo.inviterAvatars)) {
                JustRealSuccessLayout justRealSuccessLayout = (JustRealSuccessLayout) LayoutInflater.from(act).inflate(kec0.f125845g6, (ViewGroup) null);
                justRealSuccessLayout.m39723c(invitationInfo.inviterAvatars, invitationInfo.invitationCount);
                z2 = false;
                view = justRealSuccessLayout;
            } else {
                User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
                SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
                m209398k(sVGADynamicEntity, userM116593na.m61308fp().profileSmall().formatted(), "Frame_1942189003");
                View viewInflate = LayoutInflater.from(act).inflate(kec0.f125669Vc, (ViewGroup) null);
                SVGAnimationView sVGAnimationView = (SVGAnimationView) viewInflate.findViewById(adc0.f70358gd);
                SVGALoader.with(act).from(!TextUtils.isEmpty(RemoteConfig.m80481x().m80485F("verify_success_bubble_svga")) ? RemoteConfig.m80481x().m80485F("verify_success_bubble_svga") : "https://auto.tancdn.com/v1/raw/67af95b5-ccd5-4c33-8555-cbdf23025e9014.svga").repeatCount(1).dynamic(sVGADynamicEntity).into(sVGAnimationView);
                sVGAnimationView.startAnimation();
                z2 = true;
                view = viewInflate;
            }
            SimplePushBubble.C4523a c4523aM22172w = new SimplePushBubble.C4523a(act, view).m22170u("VERIFIED_SUCCESS").m22171v("VERIFIED_SUCCESS").m22175z(CorePopLevel.VERIFIED_SUCCESS).m22162A(5).m22172w(5000);
            if (z2) {
                c4523aM22172w.m22164C(0).m22165D(null).m22173x(null).m22166E(true);
            } else {
                c4523aM22172w.m22163B(2).m22174y(new RelativeLayout.LayoutParams(-2, qa00.m175859d(60.0f)));
            }
            final SimplePushBubble simplePushBubbleM22168s = c4523aM22172w.m22168s();
            simplePushBubbleM22168s.m146060s(new x20() { // from class: l.s5l0
                @Override // p153l.x20
                public final void call() {
                    x5l0.m209389b(act);
                }
            });
            simplePushBubbleM22168s.m146058q(new x20() { // from class: l.t5l0
                @Override // p153l.x20
                public final void call() {
                    ud2.m195456j().m195471r();
                }
            });
            llb0.m154703c().m154710i(simplePushBubbleM22168s);
            if (z2) {
                return;
            }
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.u5l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    x5l0.m209388a(act, simplePushBubbleM22168s, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m209400m(Act act, int i, String str) {
        CoreModule.f18264c.f20381e0.m116600p9();
        return false;
    }
}
