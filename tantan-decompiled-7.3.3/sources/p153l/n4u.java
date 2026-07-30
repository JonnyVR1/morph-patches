package p153l;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveSchema;
import com.p051p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p051p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p051p1.mobile.putong.live.external.module.api.LiveVerificationApi;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class n4u {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m161590b(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (coreService.code == 41063) {
                o1j0.m165636j(coreService.metaMessage);
                return;
            }
        }
        o1j0.m165634h(R$string.f45015g);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m161591c(gcg0 gcg0Var, Act act, Boolean bool) {
        if (bool.booleanValue()) {
            gcg0Var.onNext(Boolean.TRUE);
            gcg0Var.onCompleted();
        } else {
            gcg0Var.onNext(Boolean.FALSE);
            gcg0Var.onCompleted();
            m161601m(act);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m161592d(String str, String str2) {
        if ("scheme_message_no_handler_found".equals(str2)) {
            o1j0.m165634h(R$string.f44960H0);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m161595g(Bundle bundle, int i, Act act) {
        m161596h(bundle, i, act);
    }

    /* JADX INFO: renamed from: h */
    public static void m161596h(Bundle bundle, int i, Act act) {
        byte[] byteArray = bundle.getByteArray("extra_live");
        if (byteArray == null || bundle.getBoolean("voice-push-big-anchor", false)) {
            return;
        }
        BLiveAbsData bLiveAbsData = (BLiveAbsData) w6c.m205090c(byteArray);
        String string = bundle.getString("live_source", "default");
        String string2 = bundle.getString("live_push_voice_focus_user_id", "");
        String string3 = bundle.getString("extra_live_category", "");
        String string4 = bundle.getString("extra_live_test_group_name", "");
        if (1 != i || bLiveAbsData == null) {
            return;
        }
        if (ppi0.m173207l().m173228x() && ppi0.m173207l().m173215j()) {
            return;
        }
        j6t j6tVar = tbs.f172993f;
        AudienceStartData.C11593a c11593aM68787O = AudienceStartData.getBuilder().m68776D(bLiveAbsData).m68787O(string);
        if (TextUtils.isEmpty(string2)) {
            string2 = bLiveAbsData.anchor.f45267id;
        }
        act.startActivity(j6tVar.m143704f(act, c11593aM68787O.m68799z(string2).m68794u()));
        String str = "p_live_push";
        if (!bLiveAbsData.isVoiceLive()) {
            bfu.m104071c(kfd0.m149385x().m149393b(bLiveAbsData).m149398g(bLiveAbsData.anchor.f45267id).m149410s(string3).m149413v(string4).m149414w("push").m149392a(), "p_live_push");
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
            i4g0.m138523u("e_live_audio_room_enter", str, new pf60("anchorId", bLiveAbsData.anchor.f45267id), new pf60("liveId", bLiveAbsData.f45171id), new pf60("audio_card_type", string5), new pf60("test_group_name", string4), new pf60("intl_live_push_source", strSubstring));
        }
        str = "p_live_inner_push";
        string5 = "start-push-follow";
        if (!TextUtils.isEmpty(string)) {
            strSubstring = string.substring(21);
        }
        if (!TextUtils.isEmpty(string)) {
            strSubstring = string.substring(22);
        }
        i4g0.m138523u("e_live_audio_room_enter", str, new pf60("anchorId", bLiveAbsData.anchor.f45267id), new pf60("liveId", bLiveAbsData.f45171id), new pf60("audio_card_type", string5), new pf60("test_group_name", string4), new pf60("intl_live_push_source", strSubstring));
    }

    /* JADX INFO: renamed from: i */
    public static void m161597i(Act act, BLiveSchema bLiveSchema) {
        if (!TextUtils.isEmpty(bLiveSchema.tip)) {
            o1j0.m165651y(bLiveSchema.tip);
        }
        if (act.isFinishing() || TextUtils.isEmpty(bLiveSchema.schema)) {
            return;
        }
        nae0.m162084n(act, Uri.parse(bLiveSchema.schema), new z20() { // from class: l.k4u
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                n4u.m161592d((String) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static boolean m161598j(Bundle bundle, final Act act) {
        final String string = bundle.getString("live_dynamic_schema", null);
        if (TextUtils.isEmpty(string) || act == null || act.isFinishing()) {
            return false;
        }
        act.duringCreated(new pcj() { // from class: l.h4u
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return LiveSquareApi.getLiveSchema(string);
            }
        }, false).subscribe(dhw.m115826e(new y20() { // from class: l.i4u
            @Override // p153l.y20
            public final void call(Object obj) {
                n4u.m161597i(act, (BLiveSchema) obj);
            }
        }, new y20() { // from class: l.j4u
            @Override // p153l.y20
            public final void call(Object obj) {
                n4u.m161590b((Throwable) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static void m161599k(Act act, String str) {
        tbs.f172993f.m143699a(act, AnchorStartData.getBuilder().m68746n(str).m68743k());
    }

    /* JADX INFO: renamed from: l */
    public static void m161600l(Act act, String str) {
        m161599k(act, str);
    }

    /* JADX INFO: renamed from: m */
    public static void m161601m(Act act) {
        String str = mqr.m159588h() ? efv.f93845b : efv.f93844a;
        if (!mqr.m159587g()) {
            str = str + "?createAnchorInterfaceType=" + tbs.f172989b.m203420G5();
        }
        act.startActivity(LiveWebViewAct.m70067e2(act, str, LiveWebViewAct.f45695l));
    }

    /* JADX INFO: renamed from: n */
    public static C22421c<Boolean> m161602n(final Act act) {
        return C22421c.create(new C22421c.a() { // from class: l.l4u
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveVerificationApi.requestLiveVerification(new y20() { // from class: l.m4u
                    @Override // p153l.y20
                    public final void call(Object obj2) {
                        n4u.m161591c(gcg0Var, act, (Boolean) obj2);
                    }
                });
            }
        });
    }
}
