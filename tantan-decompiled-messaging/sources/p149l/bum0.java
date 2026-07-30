package p149l;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.VoiceCall;
import com.p046p1.mobile.putong.core.data.VoiceCallStatus;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.notifications.NotificationCheckerCommon;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class bum0 {

    /* JADX INFO: renamed from: a */
    public final qsm0 f77357a;

    /* JADX INFO: renamed from: b */
    public Object f77358b;

    /* JADX INFO: renamed from: c */
    public c4g0 f77359c;

    public bum0(qsm0 qsm0Var) {
        this.f77357a = qsm0Var;
        m103963i();
    }

    /* JADX INFO: renamed from: e */
    public boolean m103959e() {
        if (!m103960f()) {
            ib1.m135233b().mo135237e(tqm0.f171604h);
            return false;
        }
        this.f77357a.m176323q("accepted");
        this.f77357a.m176327u(2);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m103960f() {
        if (!CoreModule.m29935P().m94658i().mo158210C(100011)) {
            return false;
        }
        if (CoreModule.m29936Q().mo67253Zo().mo111891b()) {
            lsi0.m151595y("当前正在语聊中，无法语音电话");
            return false;
        }
        if (!Network.isConnected(CoreModule.f17544b)) {
            lsi0.m151593w(R$string.f20719B2);
            return false;
        }
        if (CoreModule.m29935P().m94652b().mo35122of()) {
            lsi0.m151593w(R$string.f20728C3);
            return false;
        }
        if (ghd0.m126179c()) {
            return true;
        }
        ghd0.m126180d();
        lsi0.m151578h(R$string.f21023l7);
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void m103961g(VoiceCallStatus voiceCallStatus, PushMessageCustom pushMessageCustom) {
        if (this.f77357a.m176320n()) {
            if (TEnum.equals(voiceCallStatus, VoiceCallStatus.calling) && ssm0.m185761e()) {
                mqm0.m155965h().m155971d("calleeSystemCalling", pushMessageCustom.toJson());
                wlm0.m203840g(pushMessageCustom, VoiceCallStatus.busy, this.f77357a.m176312f().f187556m);
            } else {
                Objects.toString(voiceCallStatus);
                m103967m(pushMessageCustom, voiceCallStatus);
                return;
            }
        }
        if (!TextUtils.equals(pushMessageCustom.caller, this.f77357a.m176312f().f187544a)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f77357a.m176312f().toString());
            sb.append("currentState:");
            sb.append(this.f77357a.m176315i());
            sb.append("messageDetail:");
            sb.append(pushMessageCustom.toJson());
            if (!TEnum.equals(voiceCallStatus, VoiceCallStatus.calling)) {
                mqm0.m155965h().m155971d("RepeatErrorCallPush", sb.toString());
                return;
            } else {
                mqm0.m155965h().m155971d("RepeatCallingPush", sb.toString());
                wlm0.m203840g(pushMessageCustom, VoiceCallStatus.busy, this.f77357a.m176312f().f187556m);
                return;
            }
        }
        mqm0.m155965h().m155971d("CalleeStatusExchange", pushMessageCustom.toString());
        Objects.toString(voiceCallStatus);
        String string = voiceCallStatus.toString();
        string.getClass();
        switch (string) {
            case "accepted":
                if (!TextUtils.equals(pushMessageCustom.calleeDeviceId, pk8.m169980M().identifier)) {
                    this.f77357a.m176324r();
                    break;
                }
                break;
            case "finished":
            case "rejected":
            case "canceled":
            case "notAnswered":
                this.f77357a.m176311e(voiceCallStatus.toString());
                break;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m103962h(int i) {
        if (this.f77357a.m176321o()) {
            return;
        }
        if (i == 1) {
            m103968n();
        } else {
            if (i != 3) {
                return;
            }
            this.f77357a.m176325s(500);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m103963i() {
        this.f77358b = this.f77357a.m176326t("calleeHelper", new e30() { // from class: l.xtm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194419a.m103962h(((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m103964j(Envelope envelope) {
        if (envelope.meta.code != 200 || vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).voiceCall)) {
            this.f77357a.m176324r();
            return;
        }
        VoiceCall voiceCall = ((CoreData) envelope.getModuleData(CoreData.class)).voiceCall.get(0);
        if (voiceCall == null || !TEnum.equals(voiceCall.status, VoiceCallStatus.calling)) {
            this.f77357a.m176324r();
        } else {
            this.f77357a.m176327u(1);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m103965k(Throwable th) {
        this.f77357a.m176324r();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m103966l(boolean z, Long l2) {
        if (this.f77357a.m176315i() != 1) {
            mkd0.m154992z(this.f77359c);
            return;
        }
        if (z && (NotificationCheckerCommon.m79220a() == NotificationCheckerCommon.State.opened || ssm0.m185760d())) {
            this.f77357a.m176325s(500);
        }
        if (l2.longValue() >= 45) {
            this.f77357a.m176310d("canceled");
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m103967m(PushMessageCustom pushMessageCustom, VoiceCallStatus voiceCallStatus) {
        if (!TEnum.equals(voiceCallStatus, VoiceCallStatus.calling)) {
            mqm0.m155965h().m155971d("PushInitErrorStatus", pushMessageCustom.toJson());
            return;
        }
        if (pushMessageCustom.createdTime > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && (mqi0.m155944o() - pushMessageCustom.createdTime) / 1000.0d > 45.0d) {
            mqm0.m155965h().m155971d("PushInitTimeoutCall", pushMessageCustom.toJson());
            return;
        }
        mqm0.m155965h().m155971d("processIdleStateSuccess", pushMessageCustom.toJson());
        wpm0 wpm0Var = new wpm0(pushMessageCustom);
        wpm0Var.f187546c = pk8.m169980M().identifier;
        wpm0Var.f187556m = pushMessageCustom.scene;
        wpm0Var.f187559p = pushMessageCustom.mandatory;
        this.f77357a.m176322p(wpm0Var);
        this.f77357a.m176318l();
        String str = this.f77357a.m176312f().f187551h;
        CoreModule.f17545c.f19601R0.m112449n3(this.f77357a.m176318l(), this.f77357a.m176312f().f187551h).subscribe(mkd0.m154956H(new e30() { // from class: l.ztm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204741a.m103964j((Envelope) obj);
            }
        }, new e30() { // from class: l.aum0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71844a.m103965k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final void m103968n() {
        mkd0.m154992z(this.f77359c);
        final boolean zM176309c = this.f77357a.m176309c();
        this.f77359c = C22306c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().compose(mkd0.m154951C()).subscribe((e30<? super R>) new e30() { // from class: l.ytm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199997a.m103966l(zM176309c, (Long) obj);
            }
        });
    }
}
