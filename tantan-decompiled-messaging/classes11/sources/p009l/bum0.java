package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.VoiceCall;
import com.p1.mobile.putong.core.data.VoiceCallStatus;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.e30;
import l.ghd0;
import l.lsi0;
import l.mkd0;
import l.pk8;
import l.vwb;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bum0 {

    /* JADX INFO: renamed from: a */
    public final qsm0 f10317a;

    /* JADX INFO: renamed from: b */
    public Object f10318b;

    /* JADX INFO: renamed from: c */
    public c4g0 f10319c;

    public bum0(qsm0 qsm0Var) {
        this.f10317a = qsm0Var;
        m12262i();
    }

    /* JADX INFO: renamed from: e */
    public boolean m12258e() {
        if (!m12259f()) {
            ib1.m16307b().mo16311e(tqm0.f20833h);
            return false;
        }
        this.f10317a.m21256q("accepted");
        this.f10317a.m21260u(2);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m12259f() {
        if (!CoreModule.P().i().C(100011)) {
            return false;
        }
        if (CoreModule.Q().m9038Zo().m24729b()) {
            lsi0.y("当前正在语聊中，无法语音电话");
            return false;
        }
        if (!Network.isConnected(CoreModule.b)) {
            lsi0.w(R.string.B2);
            return false;
        }
        if (CoreModule.P().b().of()) {
            lsi0.w(R.string.C3);
            return false;
        }
        if (ghd0.c()) {
            return true;
        }
        ghd0.d();
        lsi0.h(R.string.l7);
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void m12260g(VoiceCallStatus voiceCallStatus, PushMessageCustom pushMessageCustom) {
        if (this.f10317a.m21253n()) {
            if (TEnum.equals(voiceCallStatus, "calling") && ssm0.m22369e()) {
                mqm0.m18565h().m18571d("calleeSystemCalling", pushMessageCustom.toJson());
                wlm0.m24336g(pushMessageCustom, "busy", this.f10317a.m21245f().f22271m);
            } else {
                Objects.toString(voiceCallStatus);
                m12266m(pushMessageCustom, voiceCallStatus);
                return;
            }
        }
        if (!TextUtils.equals(pushMessageCustom.caller, this.f10317a.m21245f().f22259a)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f10317a.m21245f().toString());
            sb.append("currentState:");
            sb.append(this.f10317a.m21248i());
            sb.append("messageDetail:");
            sb.append(pushMessageCustom.toJson());
            if (!TEnum.equals(voiceCallStatus, "calling")) {
                mqm0.m18565h().m18571d("RepeatErrorCallPush", sb.toString());
                return;
            } else {
                mqm0.m18565h().m18571d("RepeatCallingPush", sb.toString());
                wlm0.m24336g(pushMessageCustom, "busy", this.f10317a.m21245f().f22271m);
                return;
            }
        }
        mqm0.m18565h().m18571d("CalleeStatusExchange", pushMessageCustom.toString());
        Objects.toString(voiceCallStatus);
        String string = voiceCallStatus.toString();
        string.getClass();
        switch (string) {
            case "accepted":
                if (!TextUtils.equals(pushMessageCustom.calleeDeviceId, pk8.M().identifier)) {
                    this.f10317a.m21257r();
                    break;
                }
                break;
            case "finished":
            case "rejected":
            case "canceled":
            case "notAnswered":
                this.f10317a.m21244e(voiceCallStatus.toString());
                break;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m12261h(int i) {
        if (this.f10317a.m21254o()) {
            return;
        }
        if (i == 1) {
            m12267n();
        } else {
            if (i != 3) {
                return;
            }
            this.f10317a.m21258s(500);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m12262i() {
        this.f10318b = this.f10317a.m21259t("calleeHelper", new e30() { // from class: l.xtm0
            public final void call(Object obj) {
                this.f22724a.m12261h(((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m12263j(Envelope envelope) {
        if (envelope.meta.code != 200 || vwb.J(envelope.getModuleData(CoreData.class).voiceCall)) {
            this.f10317a.m21257r();
            return;
        }
        VoiceCall voiceCall = (VoiceCall) envelope.getModuleData(CoreData.class).voiceCall.get(0);
        if (voiceCall == null || !TEnum.equals(voiceCall.status, "calling")) {
            this.f10317a.m21257r();
        } else {
            this.f10317a.m21260u(1);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m12264k(Throwable th) {
        this.f10317a.m21257r();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m12265l(boolean z, Long l2) {
        if (this.f10317a.m21248i() != 1) {
            mkd0.z(this.f10319c);
            return;
        }
        if (z && (NotificationCheckerCommon.m9539a() == NotificationCheckerCommon.State.opened || ssm0.m22368d())) {
            this.f10317a.m21258s(500);
        }
        if (l2.longValue() >= 45) {
            this.f10317a.m21243d("canceled");
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m12266m(PushMessageCustom pushMessageCustom, VoiceCallStatus voiceCallStatus) {
        if (!TEnum.equals(voiceCallStatus, "calling")) {
            mqm0.m18565h().m18571d("PushInitErrorStatus", pushMessageCustom.toJson());
            return;
        }
        if (pushMessageCustom.createdTime > 0.0d && (mqi0.m18550o() - pushMessageCustom.createdTime) / 1000.0d > 45.0d) {
            mqm0.m18565h().m18571d("PushInitTimeoutCall", pushMessageCustom.toJson());
            return;
        }
        mqm0.m18565h().m18571d("processIdleStateSuccess", pushMessageCustom.toJson());
        wpm0 wpm0Var = new wpm0(pushMessageCustom);
        wpm0Var.f22261c = pk8.M().identifier;
        wpm0Var.f22271m = pushMessageCustom.scene;
        wpm0Var.f22274p = pushMessageCustom.mandatory;
        this.f10317a.m21255p(wpm0Var);
        this.f10317a.m21251l();
        String str = this.f10317a.m21245f().f22266h;
        CoreModule.c.R0.n3(this.f10317a.m21251l(), this.f10317a.m21245f().f22266h).subscribe(mkd0.H(new e30() { // from class: l.ztm0
            public final void call(Object obj) {
                this.f23902a.m12263j((Envelope) obj);
            }
        }, new e30() { // from class: l.aum0
            public final void call(Object obj) {
                this.f9700a.m12264k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final void m12267n() {
        mkd0.z(this.f10319c);
        final boolean zM21242c = this.f10317a.m21242c();
        this.f10319c = c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().compose(mkd0.C()).subscribe(new e30() { // from class: l.ytm0
            public final void call(Object obj) {
                this.f23228a.m12265l(zM21242c, (Long) obj);
            }
        });
    }
}
