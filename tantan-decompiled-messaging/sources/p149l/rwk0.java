package p149l;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.pushbubble.SimplePushBubble;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.InvitationInfo;
import com.p046p1.mobile.putong.core.newui.home.justreal.JustRealSuccessLayout;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantanapp.common.utils.NullChecker;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
public class rwk0 {

    /* JADX INFO: renamed from: a */
    public static boolean f161351a = true;

    /* JADX INFO: renamed from: c */
    public static c4g0 f161353c;

    /* JADX INFO: renamed from: d */
    public static c4g0 f161354d;

    /* JADX INFO: renamed from: e */
    public static c4g0 f161355e;

    /* JADX INFO: renamed from: b */
    public static C22393b<Integer> f161352b = C22393b.m221521b();

    /* JADX INFO: renamed from: f */
    public static StudentVerificationStatus f161356f = StudentVerificationStatus.get("unknown_");

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m181418a(Act act, SimplePushBubble simplePushBubble, View view) {
        if (CoreModule.f17545c.f19639e0.m169520na().isFemale()) {
            j2e0.m139446m(act, Uri.parse("tantan://myMeet"));
        } else {
            j2e0.m139446m(act, Uri.parse("tantanapp://seeLikes?preferredShowPurchase=true&preferredShowDetail=true"));
        }
        simplePushBubble.m21135I();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m181419b(Act act) {
        if (act instanceof NewMainAct) {
            nd2.m158964j().m158975n(6000L);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m181421d(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m181422e(SVGADynamicEntity sVGADynamicEntity, String str, Bitmap bitmap) {
        if (NullChecker.m81303a(bitmap)) {
            sVGADynamicEntity.setDynamicImage(bitmap, str);
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m181423f(String str) {
        if (TextUtils.equals(str, "fakeBatch")) {
            return "avatar_compare";
        }
        if (TextUtils.equals(str, "fromPicVerificationDlg")) {
            return "alive";
        }
        return TextUtils.equals(str, "fromNameVerificationDlg") ? "id_info" : "";
    }

    /* JADX INFO: renamed from: g */
    public static String m181424g(String str) {
        if (TextUtils.equals(str, "fakeBatch")) {
            return "fake_appeal";
        }
        return (TextUtils.equals(str, "fromPicVerificationDlg") || TextUtils.equals(str, "fromNameVerificationDlg")) ? "security_force_verification" : "";
    }

    /* JADX INFO: renamed from: h */
    public static String m181425h(int i) {
        if (i == 1) {
            return "avatar_verification";
        }
        if (i == 2) {
            return "id_verification";
        }
        return i == 3 ? "country_verification" : User.ID_TEAM_ACCOUNT;
    }

    /* JADX INFO: renamed from: i */
    public static String m181426i(String str, int i) {
        if (TextUtils.equals(str, "fromNameVerificationDlg")) {
            return "id_ability";
        }
        if (TextUtils.equals(str, "appeal")) {
            return "appeal_verification";
        }
        return (TextUtils.equals(str, "fakeBatch") || TextUtils.equals(str, "fromPicVerificationDlg")) ? "avatar_ability" : m181425h(i);
    }

    /* JADX INFO: renamed from: j */
    public static void m181427j() {
        mkd0.m154992z(f161353c);
        mkd0.m154992z(f161354d);
        mkd0.m154992z(f161355e);
        f161356f = StudentVerificationStatus.get("unknown_");
    }

    /* JADX INFO: renamed from: k */
    public static void m181428k(final SVGADynamicEntity sVGADynamicEntity, String str, final String str2) {
        qib0.f154691G.m102316E(str).filter(new deq()).map(new eeq()).subscribe(mkd0.m154956H(new e30() { // from class: l.pwk0
            @Override // p149l.e30
            public final void call(Object obj) {
                rwk0.m181422e(sVGADynamicEntity, str2, (Bitmap) obj);
            }
        }, new e30() { // from class: l.qwk0
            @Override // p149l.e30
            public final void call(Object obj) {
                rwk0.m181421d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public static void m181429l(Activity activity, boolean z, InvitationInfo invitationInfo) {
        boolean z2;
        View view;
        if (activity instanceof Act) {
            final Act act = (Act) activity;
            CoreModule.f17545c.f19704z2.m30249l3();
            if (z && NullChecker.m81303a(invitationInfo) && !vwb.m200296J(invitationInfo.inviterAvatars)) {
                JustRealSuccessLayout justRealSuccessLayout = (JustRealSuccessLayout) LayoutInflater.from(act).inflate(f6c0.f95774f6, (ViewGroup) null);
                justRealSuccessLayout.m38720c(invitationInfo.inviterAvatars, invitationInfo.invitationCount);
                z2 = false;
                view = justRealSuccessLayout;
            } else {
                User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
                SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
                m181428k(sVGADynamicEntity, userM169520na.m60124fp().profileSmall().formatted(), "Frame_1942189003");
                View viewInflate = LayoutInflater.from(act).inflate(f6c0.f95503Oc, (ViewGroup) null);
                SVGAnimationView sVGAnimationView = (SVGAnimationView) viewInflate.findViewById(u4c0.f174233ed);
                SVGALoader.with(act).from(!TextUtils.isEmpty(RemoteConfig.m79298x().m79302F("verify_success_bubble_svga")) ? RemoteConfig.m79298x().m79302F("verify_success_bubble_svga") : "https://auto.tancdn.com/v1/raw/67af95b5-ccd5-4c33-8555-cbdf23025e9014.svga").repeatCount(1).dynamic(sVGADynamicEntity).into(sVGAnimationView);
                sVGAnimationView.startAnimation();
                z2 = true;
                view = viewInflate;
            }
            SimplePushBubble.C4372a c4372aM21173w = new SimplePushBubble.C4372a(act, view).m21171u("VERIFIED_SUCCESS").m21172v("VERIFIED_SUCCESS").m21176z(CorePopLevel.VERIFIED_SUCCESS).m21163A(5).m21173w(5000);
            if (z2) {
                c4372aM21173w.m21165C(0).m21166D(null).m21174x(null).m21167E(true);
            } else {
                c4372aM21173w.m21164B(2).m21175y(new RelativeLayout.LayoutParams(-2, t100.m186890d(60.0f)));
            }
            final SimplePushBubble simplePushBubbleM21169s = c4372aM21173w.m21169s();
            simplePushBubbleM21169s.m120965s(new d30() { // from class: l.mwk0
                @Override // p149l.d30
                public final void call() {
                    rwk0.m181419b(act);
                }
            });
            simplePushBubbleM21169s.m120963q(new d30() { // from class: l.nwk0
                @Override // p149l.d30
                public final void call() {
                    nd2.m158964j().m158979r();
                }
            });
            hdb0.m130575c().m130582i(simplePushBubbleM21169s);
            if (z2) {
                return;
            }
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.owk0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    rwk0.m181418a(act, simplePushBubbleM21169s, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m181430m(Act act, int i, String str) {
        CoreModule.f17545c.f19639e0.m169527p9();
        return false;
    }
}
