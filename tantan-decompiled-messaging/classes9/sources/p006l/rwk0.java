package p006l;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.pushbubble.SimplePushBubble;
import com.p1.mobile.putong.core.data.InvitationInfo;
import com.p1.mobile.putong.core.newui.home.justreal.JustRealSuccessLayout;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantanapp.common.utils.NullChecker;
import l.c4g0;
import l.d30;
import l.deq;
import l.e30;
import l.eeq;
import l.hdb0;
import l.mkd0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class rwk0 {

    /* JADX INFO: renamed from: a */
    public static boolean f20826a = true;

    /* JADX INFO: renamed from: c */
    public static c4g0 f20828c;

    /* JADX INFO: renamed from: d */
    public static c4g0 f20829d;

    /* JADX INFO: renamed from: e */
    public static c4g0 f20830e;

    /* JADX INFO: renamed from: b */
    public static b<Integer> f20827b = b.b();

    /* JADX INFO: renamed from: f */
    public static StudentVerificationStatus f20831f = StudentVerificationStatus.get("unknown_");

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m23342a(Act act, SimplePushBubble simplePushBubble, View view) {
        if (CoreModule.f1534c.f3628e0.m21483na().isFemale()) {
            j2e0.m17248m(act, Uri.parse("tantan://myMeet"));
        } else {
            j2e0.m17248m(act, Uri.parse("tantanapp://seeLikes?preferredShowPurchase=true&preferredShowDetail=true"));
        }
        simplePushBubble.I();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m23343b(Act act) {
        if (act instanceof NewMainAct) {
            nd2.m20050j().m20061n(6000L);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m23345d(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m23346e(SVGADynamicEntity sVGADynamicEntity, String str, Bitmap bitmap) {
        if (NullChecker.a(bitmap)) {
            sVGADynamicEntity.setDynamicImage(bitmap, str);
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m23347f(String str) {
        if (TextUtils.equals(str, "fakeBatch")) {
            return "avatar_compare";
        }
        if (TextUtils.equals(str, "fromPicVerificationDlg")) {
            return "alive";
        }
        return TextUtils.equals(str, "fromNameVerificationDlg") ? "id_info" : "";
    }

    /* JADX INFO: renamed from: g */
    public static String m23348g(String str) {
        if (TextUtils.equals(str, "fakeBatch")) {
            return "fake_appeal";
        }
        return (TextUtils.equals(str, "fromPicVerificationDlg") || TextUtils.equals(str, "fromNameVerificationDlg")) ? "security_force_verification" : "";
    }

    /* JADX INFO: renamed from: h */
    public static String m23349h(int i) {
        if (i == 1) {
            return "avatar_verification";
        }
        if (i == 2) {
            return "id_verification";
        }
        return i == 3 ? "country_verification" : "-1";
    }

    /* JADX INFO: renamed from: i */
    public static String m23350i(String str, int i) {
        if (TextUtils.equals(str, "fromNameVerificationDlg")) {
            return "id_ability";
        }
        if (TextUtils.equals(str, "appeal")) {
            return "appeal_verification";
        }
        return (TextUtils.equals(str, "fakeBatch") || TextUtils.equals(str, "fromPicVerificationDlg")) ? "avatar_ability" : m23349h(i);
    }

    /* JADX INFO: renamed from: j */
    public static void m23351j() {
        mkd0.z(f20828c);
        mkd0.z(f20829d);
        mkd0.z(f20830e);
        f20831f = StudentVerificationStatus.get("unknown_");
    }

    /* JADX INFO: renamed from: k */
    public static void m23352k(final SVGADynamicEntity sVGADynamicEntity, String str, final String str2) {
        qib0.f19782G.m12729E(str).filter(new deq()).map(new eeq()).subscribe(mkd0.H(new e30() { // from class: l.pwk0
            public final void call(Object obj) {
                rwk0.m23346e(sVGADynamicEntity, str2, (Bitmap) obj);
            }
        }, new e30() { // from class: l.qwk0
            public final void call(Object obj) {
                rwk0.m23345d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public static void m23353l(Activity activity, boolean z, InvitationInfo invitationInfo) {
        JustRealSuccessLayout justRealSuccessLayoutInflate;
        boolean z2;
        if (activity instanceof Act) {
            final Act act = (Act) activity;
            CoreModule.f1534c.f3693z2.m2177l3();
            if (z && NullChecker.a(invitationInfo) && !vwb.J(invitationInfo.inviterAvatars)) {
                justRealSuccessLayoutInflate = LayoutInflater.from(act).inflate(f6c0.f12188f6, (ViewGroup) null);
                justRealSuccessLayoutInflate.c(invitationInfo.inviterAvatars, invitationInfo.invitationCount);
                z2 = false;
            } else {
                User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
                SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
                m23352k(sVGADynamicEntity, userM21483na.fp().profileSmall().formatted(), "Frame_1942189003");
                justRealSuccessLayoutInflate = LayoutInflater.from(act).inflate(f6c0.f11917Oc, (ViewGroup) null);
                SVGAnimationView sVGAnimationViewFindViewById = justRealSuccessLayoutInflate.findViewById(u4c0.f22981ed);
                SVGALoader.with(act).from(!TextUtils.isEmpty(RemoteConfig.x().F("verify_success_bubble_svga")) ? RemoteConfig.x().F("verify_success_bubble_svga") : "https://auto.tancdn.com/v1/raw/67af95b5-ccd5-4c33-8555-cbdf23025e9014.svga").repeatCount(1).dynamic(sVGADynamicEntity).into(sVGAnimationViewFindViewById);
                sVGAnimationViewFindViewById.startAnimation();
                z2 = true;
            }
            SimplePushBubble.a aVarW = new SimplePushBubble.a(act, justRealSuccessLayoutInflate).u("VERIFIED_SUCCESS").v("VERIFIED_SUCCESS").z(CorePopLevel.VERIFIED_SUCCESS).A(5).w(5000);
            if (z2) {
                aVarW.C(0).D((w9j) null).x((w9j) null).E(true);
            } else {
                aVarW.B(2).y(new RelativeLayout.LayoutParams(-2, t100.d(60.0f)));
            }
            final SimplePushBubble simplePushBubbleS = aVarW.s();
            simplePushBubbleS.s(new d30() { // from class: l.mwk0
                public final void call() {
                    rwk0.m23343b(act);
                }
            });
            simplePushBubbleS.q(new d30() { // from class: l.nwk0
                public final void call() {
                    nd2.m20050j().m20065r();
                }
            });
            hdb0.c().i(simplePushBubbleS);
            if (z2) {
                return;
            }
            xdl0.E0(justRealSuccessLayoutInflate, new View.OnClickListener() { // from class: l.owk0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    rwk0.m23342a(act, simplePushBubbleS, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m23354m(Act act, int i, String str) {
        CoreModule.f1534c.f3628e0.m21490p9();
        return false;
    }
}
