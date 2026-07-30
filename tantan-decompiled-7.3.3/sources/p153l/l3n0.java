package p153l;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatHeatActionData;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.VoiceCallStatus;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes11.dex */
public class l3n0 {

    /* JADX INFO: renamed from: d */
    public static String[] f129894d = {"android.permission.RECORD_AUDIO"};

    /* JADX INFO: renamed from: e */
    public static String[] f129895e;

    /* JADX INFO: renamed from: a */
    public final u1n0 f129896a;

    /* JADX INFO: renamed from: b */
    public kcg0 f129897b;

    /* JADX INFO: renamed from: c */
    public kcg0 f129898c;

    static {
        f129895e = wzx.m208784k() ? new String[]{"android.permission.RECORD_AUDIO"} : new String[]{"android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE"};
    }

    public l3n0(u1n0 u1n0Var) {
        this.f129896a = u1n0Var;
        m152725l();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m152714a(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: f */
    public final boolean m152719f(Context context, String str, String str2) {
        if (!rum0.m183208c() || !CoreModule.m30933P().m143412i().mo180302C(100011)) {
            return false;
        }
        if (CoreModule.m30934Q().mo68436Zo().mo136898b()) {
            o1j0.m165651y("当前正在语聊中，无法语音电话");
            return false;
        }
        if ((context instanceof MessagesAct) && !TextUtils.isEmpty(str2)) {
            azy azyVarM114043u0 = ((MessagesAct) context).mo50138B0().m143374g0().m114043u0();
            if (NullChecker.m82486a(azyVarM114043u0) && azyVarM114043u0.m101199d0()) {
                o1j0.m165649w(R$string.f21472C5);
                return false;
            }
        }
        if (CoreModule.m30933P().m143412i().mo180570z(str)) {
            o1j0.m165649w(R$string.f21495F4);
            return false;
        }
        if (o3z.m165898g().m165901e(str)) {
            o1j0.m165649w(R$string.f21503G4);
            return false;
        }
        if (CoreModule.m30933P().m143406b().mo36125of()) {
            o1j0.m165649w(R$string.f21470C3);
            return false;
        }
        if (!Network.isConnected(CoreModule.f18263b)) {
            o1j0.m165649w(R$string.f21461B2);
            return false;
        }
        if (w1n0.m204458e()) {
            o1j0.m165649w(R$string.f21657Z6);
            return false;
        }
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
        if (userM116503Pa == null) {
            return false;
        }
        if (userM116503Pa.unilateralBlock()) {
            o1j0.m165634h(R$string.f21799p5);
            return false;
        }
        if (context instanceof Act) {
            String[] strArr = f129895e;
            if (!PermissionHelper.m81064b(strArr)) {
                PermissionHelper.m81065c().m81083r(strArr).m81088w(false).m81079n(new y20() { // from class: l.k3n0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        l3n0.m152714a((PermissionHelper.PermissionDeniedReason) obj);
                    }
                }).m81086u(true).m81074i((Act) context);
                return false;
            }
        }
        if (jpd0.m146488c()) {
            return true;
        }
        jpd0.m146489d();
        o1j0.m165634h(R$string.f21765l7);
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean m152720g(final Context context, final String str, final String str2) {
        if (!m152719f(context, str, str2)) {
            pb1.m171472b().mo171476e(xzm0.f196892h);
            return false;
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        avm0.m100475h(str, str2, tl8.m191616M().identifier).subscribe(psd0.m173597H(new y20() { // from class: l.i3n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112766a.m152726m(context, str, jElapsedRealtime, str2, (Envelope) obj);
            }
        }, new y20() { // from class: l.j3n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118198a.m152727n(context, str, jElapsedRealtime, (Throwable) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void m152726m(Context context, String str, long j, String str2, Envelope envelope) {
        if (envelope.meta.code != 200) {
            m152722i(context, str, j, envelope, null);
            return;
        }
        azm0 azm0Var = new azm0();
        azm0Var.f74154b = str;
        azm0Var.f74153a = CoreModule.m30929H().userId();
        azm0Var.f74156d = tl8.m191616M().identifier;
        azm0Var.f74165m = str2;
        azm0Var.f74166n = str;
        azm0Var.f74167o = true;
        this.f129896a.m194040p(azm0Var);
        this.f129896a.m194045u(1);
        qzm0.m178813j(str);
    }

    /* JADX INFO: renamed from: i */
    public final void m152722i(Context context, String str, long j, Envelope envelope, Throwable th) {
        pb1.m171472b().mo171476e(xzm0.f196892h);
        if (th != null) {
            boolean z = th instanceof TantanException.Client.TantanForbidden;
            if (z && CoreModule.m30933P().m143412i().mo180353L1((TantanException.Client.TantanForbidden) th)) {
                o1j0.m165649w(R$string.f21747j7);
                return;
            } else {
                if (!z) {
                    bsj0.m106246D(th);
                    return;
                }
                ChatHeatActionData chatHeatActionData = new ChatHeatActionData(str, ChatHeatActionData.ExclusiveAction.CHECK, false, new pf60[0]);
                chatHeatActionData.setThrowable(th);
                CoreModule.f18264c.f20328M1.f82694S.m137019l(chatHeatActionData);
                return;
            }
        }
        if (envelope != null) {
            int i = envelope.meta.code;
            if (i == 20001) {
                o1j0.m165649w(R$string.f21649Y6);
                return;
            }
            if (i != 201) {
                if (i == 40301) {
                    o1j0.m165634h(R$string.f21799p5);
                    return;
                } else {
                    o1j0.m165649w(R$string.f21469C2);
                    return;
                }
            }
            Message message = ((CoreData) envelope.getModuleData(CoreData.class)).messages.get(0);
            if (context instanceof MessagesAct) {
                ((MessagesAct) context).f32488f.m110938X6(message);
            }
            if (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).messages)) {
                return;
            }
            m600.m157134g(message, OMSDialogPositon.p_chat_view, "success", str, 1, SystemClock.elapsedRealtime() - j);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m152723j(VoiceCallStatus voiceCallStatus, PushMessageCustom pushMessageCustom) {
        if (TEnum.equals(voiceCallStatus, VoiceCallStatus.calling)) {
            qzm0.m178812h().m178818d("PushInitErrorStatus", pushMessageCustom.toJson());
        }
        if (!TextUtils.equals(pushMessageCustom.callee, this.f129896a.m194030f().f74154b)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f129896a.m194030f().toString());
            sb.append("currentState:");
            sb.append(this.f129896a.m194033i());
            sb.append("messageDetail:");
            sb.append(pushMessageCustom.toJson());
            if (!TEnum.equals(voiceCallStatus, VoiceCallStatus.calling)) {
                qzm0.m178812h().m178818d("RepeatErrorCallPush", sb.toString());
                return;
            } else {
                qzm0.m178812h().m178818d("RepeatCallingPush", sb.toString());
                avm0.m100474g(pushMessageCustom, VoiceCallStatus.busy, this.f129896a.m194030f().f74165m);
                return;
            }
        }
        qzm0.m178812h().m178818d("CallerStatusExchange", pushMessageCustom.toString());
        String string = voiceCallStatus.toString();
        string.getClass();
        switch (string) {
            case "accepted":
                azm0 azm0Var = new azm0();
                azm0Var.f74157e = pushMessageCustom.f39653id;
                azm0Var.f74160h = pushMessageCustom.channelNameV2;
                azm0Var.f74159g = pushMessageCustom.callerTokenV2;
                azm0Var.f74158f = pushMessageCustom.calleeTokenV2;
                azm0Var.f74161i = pushMessageCustom.appId;
                azm0Var.f74162j = pushMessageCustom.rtcProvider;
                azm0Var.f74163k = pushMessageCustom.businessType;
                azm0Var.f74155c = pushMessageCustom.calleeDeviceId;
                azm0Var.f74168p = pushMessageCustom.mandatory;
                azm0Var.f74164l = pushMessageCustom.roomId;
                this.f129896a.m194040p(azm0Var);
                this.f129896a.m194045u(2);
                break;
            case "finished":
            case "rejected":
            case "busy":
                this.f129896a.m194029e(voiceCallStatus.toString());
                break;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m152724k(int i) {
        if (this.f129896a.m194039o()) {
            if (i == 0) {
                CoreModule.f18264c.f20384f0.m33653Fo();
            } else {
                if (i != 1) {
                    return;
                }
                CoreModule.f18264c.f20384f0.m33653Fo();
                m152729p();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m152725l() {
        this.f129897b = this.f129896a.m194044t("callerHelper", new y20() { // from class: l.g3n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102011a.m152724k(((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m152727n(Context context, String str, long j, Throwable th) {
        m152722i(context, str, j, null, th);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m152728o(Long l2) {
        if (this.f129896a.m194033i() != 1) {
            psd0.m173633z(this.f129898c);
            return;
        }
        if (l2.longValue() == 15) {
            o1j0.m165649w(R$string.f21609T6);
        } else if (l2.longValue() >= 40) {
            o1j0.m165649w(R$string.f21738i7);
            this.f129896a.m194028d(VoiceCallStatus.notAnswered);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m152729p() {
        psd0.m173633z(this.f129898c);
        this.f129898c = C22421c.interval(1L, TimeUnit.SECONDS, Schedulers.m222739io()).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(new y20() { // from class: l.h3n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107671a.m152728o((Long) obj);
            }
        });
    }
}
