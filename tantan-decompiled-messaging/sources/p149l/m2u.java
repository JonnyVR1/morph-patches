package p149l;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveSchema;
import com.p046p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p046p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p046p1.mobile.putong.live.external.module.api.LiveVerificationApi;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class m2u {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m152705b(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (coreService.code == 41063) {
                lsi0.m151580j(coreService.metaMessage);
                return;
            }
        }
        lsi0.m151578h(R$string.f44167g);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m152706c(z3g0 z3g0Var, Act act, Boolean bool) {
        if (bool.booleanValue()) {
            z3g0Var.onNext(Boolean.TRUE);
            z3g0Var.onCompleted();
        } else {
            z3g0Var.onNext(Boolean.FALSE);
            z3g0Var.onCompleted();
            m152716m(act);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m152707d(String str, String str2) {
        if ("scheme_message_no_handler_found".equals(str2)) {
            lsi0.m151578h(R$string.f44112H0);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m152710g(Bundle bundle, int i, Act act) {
        m152711h(bundle, i, act);
    }

    /* JADX INFO: renamed from: h */
    public static void m152711h(Bundle bundle, int i, Act act) {
        byte[] byteArray = bundle.getByteArray("extra_live");
        if (byteArray == null || bundle.getBoolean("voice-push-big-anchor", false)) {
            return;
        }
        BLiveAbsData bLiveAbsData = (BLiveAbsData) q5c.m172997c(byteArray);
        String string = bundle.getString("live_source", "default");
        String string2 = bundle.getString("live_push_voice_focus_user_id", "");
        String string3 = bundle.getString("extra_live_category", "");
        String string4 = bundle.getString("extra_live_test_group_name", "");
        if (1 != i || bLiveAbsData == null) {
            return;
        }
        if (pgi0.m168730l().m168751x() && pgi0.m168730l().m168738j()) {
            return;
        }
        i4t i4tVar = s9s.f163232f;
        AudienceStartData.C11430a c11430aM67604O = AudienceStartData.getBuilder().m67593D(bLiveAbsData).m67604O(string);
        if (TextUtils.isEmpty(string2)) {
            string2 = bLiveAbsData.anchor.f44419id;
        }
        act.startActivity(i4tVar.m134373f(act, c11430aM67604O.m67616z(string2).m67611u()));
        String str = "p_live_push";
        if (!bLiveAbsData.isVoiceLive()) {
            adu.m96007c(h7d0.m129655x().m129663b(bLiveAbsData).m129668g(bLiveAbsData.anchor.f44419id).m129680s(string3).m129683v(string4).m129684w("push").m129662a(), "p_live_push");
            return;
        }
        String string5 = bundle.getString("live_push_voice", "default");
        String strSubstring = "NA";
        if ("default".equals(string5)) {
            string5 = "NA";
        }
        if (TextUtils.isEmpty(string) || !string.startsWith("start-push-follow-in")) {
            if (!TextUtils.isEmpty(string) && string.startsWith("start-push-follow-out")) {
            }
            if (!TextUtils.isEmpty(string) && string.startsWith("start-push-follow-in") && string.length() > 20) {
                strSubstring = string.substring(21);
            }
            if (!TextUtils.isEmpty(string) && string.startsWith("start-push-follow-out") && string.length() > 21) {
                strSubstring = string.substring(22);
            }
            zvf0.m220399u("e_live_audio_room_enter", str, new j760("anchorId", bLiveAbsData.anchor.f44419id), new j760("liveId", bLiveAbsData.f44323id), new j760("audio_card_type", string5), new j760("test_group_name", string4), new j760("intl_live_push_source", strSubstring));
        }
        str = "p_live_inner_push";
        string5 = "start-push-follow";
        if (!TextUtils.isEmpty(string)) {
            strSubstring = string.substring(21);
        }
        if (!TextUtils.isEmpty(string)) {
            strSubstring = string.substring(22);
        }
        zvf0.m220399u("e_live_audio_room_enter", str, new j760("anchorId", bLiveAbsData.anchor.f44419id), new j760("liveId", bLiveAbsData.f44323id), new j760("audio_card_type", string5), new j760("test_group_name", string4), new j760("intl_live_push_source", strSubstring));
    }

    /* JADX INFO: renamed from: i */
    public static void m152712i(Act act, BLiveSchema bLiveSchema) {
        if (!TextUtils.isEmpty(bLiveSchema.tip)) {
            lsi0.m151595y(bLiveSchema.tip);
        }
        if (act.isFinishing() || TextUtils.isEmpty(bLiveSchema.schema)) {
            return;
        }
        j2e0.m139447n(act, Uri.parse(bLiveSchema.schema), new f30() { // from class: l.j2u
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                m2u.m152707d((String) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static boolean m152713j(Bundle bundle, final Act act) {
        final String string = bundle.getString("live_dynamic_schema", null);
        if (TextUtils.isEmpty(string) || act == null || act.isFinishing()) {
            return false;
        }
        act.duringCreated(new v9j() { // from class: l.g2u
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return LiveSquareApi.getLiveSchema(string);
            }
        }, false).subscribe(ffw.m121194e(new e30() { // from class: l.h2u
            @Override // p149l.e30
            public final void call(Object obj) {
                m2u.m152712i(act, (BLiveSchema) obj);
            }
        }, new e30() { // from class: l.i2u
            @Override // p149l.e30
            public final void call(Object obj) {
                m2u.m152705b((Throwable) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static void m152714k(Act act, String str) {
        s9s.f163232f.m134368a(act, AnchorStartData.getBuilder().m67563n(str).m67560k());
    }

    /* JADX INFO: renamed from: l */
    public static void m152715l(Act act, String str) {
        m152714k(act, str);
    }

    /* JADX INFO: renamed from: m */
    public static void m152716m(Act act) {
        String str = lor.m150803h() ? ddv.f85652b : ddv.f85651a;
        if (!lor.m150802g()) {
            str = str + "?createAnchorInterfaceType=" + s9s.f163228b.m195633G5();
        }
        act.startActivity(LiveWebViewAct.m68884d2(act, str, LiveWebViewAct.f44847l));
    }

    /* JADX INFO: renamed from: n */
    public static C22306c<Boolean> m152717n(final Act act) {
        return C22306c.create(new C22306c.a() { // from class: l.k2u
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveVerificationApi.requestLiveVerification(new e30() { // from class: l.l2u
                    @Override // p149l.e30
                    public final void call(Object obj2) {
                        m2u.m152706c(z3g0Var, act, (Boolean) obj2);
                    }
                });
            }
        });
    }
}
