package p153l;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.VoiceCall;
import com.p051p1.mobile.putong.core.data.VoiceCallStatus;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.notifications.NotificationCheckerCommon;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class f3n0 {

    /* JADX INFO: renamed from: a */
    public final u1n0 f96999a;

    /* JADX INFO: renamed from: b */
    public Object f97000b;

    /* JADX INFO: renamed from: c */
    public kcg0 f97001c;

    public f3n0(u1n0 u1n0Var) {
        this.f96999a = u1n0Var;
        m123759i();
    }

    /* JADX INFO: renamed from: e */
    public boolean m123755e() {
        if (!m123756f()) {
            pb1.m171472b().mo171476e(xzm0.f196892h);
            return false;
        }
        this.f96999a.m194041q("accepted");
        this.f96999a.m194045u(2);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m123756f() {
        if (!CoreModule.m30933P().m143412i().mo180302C(100011)) {
            return false;
        }
        if (CoreModule.m30934Q().mo68436Zo().mo136898b()) {
            o1j0.m165651y("当前正在语聊中，无法语音电话");
            return false;
        }
        if (!Network.isConnected(CoreModule.f18263b)) {
            o1j0.m165649w(R$string.f21461B2);
            return false;
        }
        if (CoreModule.m30933P().m143406b().mo36125of()) {
            o1j0.m165649w(R$string.f21470C3);
            return false;
        }
        if (jpd0.m146488c()) {
            return true;
        }
        jpd0.m146489d();
        o1j0.m165634h(R$string.f21765l7);
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void m123757g(VoiceCallStatus voiceCallStatus, PushMessageCustom pushMessageCustom) {
        if (this.f96999a.m194038n()) {
            if (TEnum.equals(voiceCallStatus, VoiceCallStatus.calling) && w1n0.m204458e()) {
                qzm0.m178812h().m178818d("calleeSystemCalling", pushMessageCustom.toJson());
                avm0.m100474g(pushMessageCustom, VoiceCallStatus.busy, this.f96999a.m194030f().f74165m);
            } else {
                Objects.toString(voiceCallStatus);
                m123763m(pushMessageCustom, voiceCallStatus);
                return;
            }
        }
        if (!TextUtils.equals(pushMessageCustom.caller, this.f96999a.m194030f().f74153a)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f96999a.m194030f().toString());
            sb.append("currentState:");
            sb.append(this.f96999a.m194033i());
            sb.append("messageDetail:");
            sb.append(pushMessageCustom.toJson());
            if (!TEnum.equals(voiceCallStatus, VoiceCallStatus.calling)) {
                qzm0.m178812h().m178818d("RepeatErrorCallPush", sb.toString());
                return;
            } else {
                qzm0.m178812h().m178818d("RepeatCallingPush", sb.toString());
                avm0.m100474g(pushMessageCustom, VoiceCallStatus.busy, this.f96999a.m194030f().f74165m);
                return;
            }
        }
        qzm0.m178812h().m178818d("CalleeStatusExchange", pushMessageCustom.toString());
        Objects.toString(voiceCallStatus);
        String string = voiceCallStatus.toString();
        string.getClass();
        switch (string) {
            case "accepted":
                if (!TextUtils.equals(pushMessageCustom.calleeDeviceId, tl8.m191616M().identifier)) {
                    this.f96999a.m194042r();
                    break;
                }
                break;
            case "finished":
            case "rejected":
            case "canceled":
            case "notAnswered":
                this.f96999a.m194029e(voiceCallStatus.toString());
                break;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m123758h(int i) {
        if (this.f96999a.m194039o()) {
            return;
        }
        if (i == 1) {
            m123764n();
        } else {
            if (i != 3) {
                return;
            }
            this.f96999a.m194043s(500);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m123759i() {
        this.f97000b = this.f96999a.m194044t("calleeHelper", new y20() { // from class: l.b3n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74798a.m123758h(((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m123760j(Envelope envelope) {
        if (envelope.meta.code != 200 || jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).voiceCall)) {
            this.f96999a.m194042r();
            return;
        }
        VoiceCall voiceCall = ((CoreData) envelope.getModuleData(CoreData.class)).voiceCall.get(0);
        if (voiceCall == null || !TEnum.equals(voiceCall.status, VoiceCallStatus.calling)) {
            this.f96999a.m194042r();
        } else {
            this.f96999a.m194045u(1);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m123761k(Throwable th) {
        this.f96999a.m194042r();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m123762l(boolean z, Long l2) {
        if (this.f96999a.m194033i() != 1) {
            psd0.m173633z(this.f97001c);
            return;
        }
        if (z && (NotificationCheckerCommon.m80403a() == NotificationCheckerCommon.State.opened || w1n0.m204457d())) {
            this.f96999a.m194043s(500);
        }
        if (l2.longValue() >= 45) {
            this.f96999a.m194028d("canceled");
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m123763m(PushMessageCustom pushMessageCustom, VoiceCallStatus voiceCallStatus) {
        if (!TEnum.equals(voiceCallStatus, VoiceCallStatus.calling)) {
            qzm0.m178812h().m178818d("PushInitErrorStatus", pushMessageCustom.toJson());
            return;
        }
        if (pushMessageCustom.createdTime > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && (pzi0.m174454o() - pushMessageCustom.createdTime) / 1000.0d > 45.0d) {
            qzm0.m178812h().m178818d("PushInitTimeoutCall", pushMessageCustom.toJson());
            return;
        }
        qzm0.m178812h().m178818d("processIdleStateSuccess", pushMessageCustom.toJson());
        azm0 azm0Var = new azm0(pushMessageCustom);
        azm0Var.f74155c = tl8.m191616M().identifier;
        azm0Var.f74165m = pushMessageCustom.scene;
        azm0Var.f74168p = pushMessageCustom.mandatory;
        this.f96999a.m194040p(azm0Var);
        this.f96999a.m194036l();
        String str = this.f96999a.m194030f().f74160h;
        CoreModule.f18264c.f20343R0.m182163n3(this.f96999a.m194036l(), this.f96999a.m194030f().f74160h).subscribe(psd0.m173597H(new y20() { // from class: l.d3n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84927a.m123760j((Envelope) obj);
            }
        }, new y20() { // from class: l.e3n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91982a.m123761k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final void m123764n() {
        psd0.m173633z(this.f97001c);
        final boolean zM194027c = this.f96999a.m194027c();
        this.f97001c = C22421c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().compose(psd0.m173592C()).subscribe((y20<? super R>) new y20() { // from class: l.c3n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79632a.m123762l(zM194027c, (Long) obj);
            }
        });
    }
}
