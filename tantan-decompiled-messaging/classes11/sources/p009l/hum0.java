package p009l;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatHeatActionData;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.VoiceCallStatus;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.dqy;
import l.e30;
import l.ghd0;
import l.j760;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.pk8;
import l.pxz;
import l.ruy;
import l.vwb;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hum0 {

    /* JADX INFO: renamed from: d */
    public static String[] f14254d = {"android.permission.RECORD_AUDIO"};

    /* JADX INFO: renamed from: e */
    public static String[] f14255e;

    /* JADX INFO: renamed from: a */
    public final qsm0 f14256a;

    /* JADX INFO: renamed from: b */
    public c4g0 f14257b;

    /* JADX INFO: renamed from: c */
    public c4g0 f14258c;

    static {
        f14255e = zqx.m25938k() ? new String[]{"android.permission.RECORD_AUDIO"} : new String[]{"android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE"};
    }

    public hum0(qsm0 qsm0Var) {
        this.f14256a = qsm0Var;
        m15997l();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15986a(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: f */
    public final boolean m15991f(Context context, String str, String str2) {
        if (!nlm0.m18997c() || !CoreModule.P().i().C(100011)) {
            return false;
        }
        if (CoreModule.Q().m9038Zo().m24729b()) {
            lsi0.y("当前正在语聊中，无法语音电话");
            return false;
        }
        if ((context instanceof MessagesAct) && !TextUtils.isEmpty(str2)) {
            dqy dqyVarU0 = ((MessagesAct) context).A0().g0().u0();
            if (NullChecker.a(dqyVarU0) && dqyVarU0.d0()) {
                lsi0.w(R.string.C5);
                return false;
            }
        }
        if (CoreModule.P().i().z(str)) {
            lsi0.w(R.string.F4);
            return false;
        }
        if (ruy.g().e(str)) {
            lsi0.w(R.string.G4);
            return false;
        }
        if (CoreModule.P().b().of()) {
            lsi0.w(R.string.C3);
            return false;
        }
        if (!Network.isConnected(CoreModule.b)) {
            lsi0.w(R.string.B2);
            return false;
        }
        if (ssm0.m22369e()) {
            lsi0.w(R.string.Z6);
            return false;
        }
        User userPa = CoreModule.c.e0.Pa(str);
        if (userPa == null) {
            return false;
        }
        if (userPa.unilateralBlock()) {
            lsi0.h(R.string.p5);
            return false;
        }
        if (context instanceof Act) {
            String[] strArr = f14255e;
            if (!PermissionHelper.m10210b(strArr)) {
                PermissionHelper.m10211c().m10229r(strArr).m10234w(false).m10225n(new e30() { // from class: l.gum0
                    public final void call(Object obj) {
                        hum0.m15986a((PermissionHelper.PermissionDeniedReason) obj);
                    }
                }).m10232u(true).m10220i((Act) context);
                return false;
            }
        }
        if (ghd0.c()) {
            return true;
        }
        ghd0.d();
        lsi0.h(R.string.l7);
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean m15992g(final Context context, final String str, final String str2) {
        if (!m15991f(context, str, str2)) {
            ib1.m16307b().mo16311e(tqm0.f20833h);
            return false;
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        wlm0.m24337h(str, str2, pk8.M().identifier).subscribe(mkd0.H(new e30() { // from class: l.eum0
            public final void call(Object obj) {
                this.f12693a.m15998m(context, str, jElapsedRealtime, str2, (Envelope) obj);
            }
        }, new e30() { // from class: l.fum0
            public final void call(Object obj) {
                this.f13176a.m15999n(context, str, jElapsedRealtime, (Throwable) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void m15998m(Context context, String str, long j, String str2, Envelope envelope) {
        if (envelope.meta.code != 200) {
            m15994i(context, str, j, envelope, null);
            return;
        }
        wpm0 wpm0Var = new wpm0();
        wpm0Var.f22260b = str;
        wpm0Var.f22259a = CoreModule.H().userId();
        wpm0Var.f22262d = pk8.M().identifier;
        wpm0Var.f22271m = str2;
        wpm0Var.f22272n = str;
        wpm0Var.f22273o = true;
        this.f14256a.m21255p(wpm0Var);
        this.f14256a.m21260u(1);
        mqm0.m18566j(str);
    }

    /* JADX INFO: renamed from: i */
    public final void m15994i(Context context, String str, long j, Envelope envelope, Throwable th) {
        ib1.m16307b().mo16311e(tqm0.f20833h);
        if (th != null) {
            boolean z = th instanceof TantanException.Client.TantanForbidden;
            if (z && CoreModule.P().i().L1((TantanException.Client.TantanForbidden) th)) {
                lsi0.w(R.string.j7);
                return;
            } else {
                if (!z) {
                    yij0.m25382D(th);
                    return;
                }
                ChatHeatActionData chatHeatActionData = new ChatHeatActionData(str, ChatHeatActionData.ExclusiveAction.CHECK, false, new j760[0]);
                chatHeatActionData.setThrowable(th);
                CoreModule.c.M1.S.onNext(chatHeatActionData);
                return;
            }
        }
        if (envelope != null) {
            int i = envelope.meta.code;
            if (i == 20001) {
                lsi0.w(R.string.Y6);
                return;
            }
            if (i != 201) {
                if (i == 40301) {
                    lsi0.h(R.string.p5);
                    return;
                } else {
                    lsi0.w(R.string.C2);
                    return;
                }
            }
            Message message = (Message) envelope.getModuleData(CoreData.class).messages.get(0);
            if (context instanceof MessagesAct) {
                ((MessagesAct) context).f.X6(message);
            }
            if (vwb.J(envelope.getModuleData(CoreData.class).messages)) {
                return;
            }
            pxz.g(message, "p_chat_view", "success", str, 1, SystemClock.elapsedRealtime() - j);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m15995j(VoiceCallStatus voiceCallStatus, PushMessageCustom pushMessageCustom) {
        if (TEnum.equals(voiceCallStatus, "calling")) {
            mqm0.m18565h().m18571d("PushInitErrorStatus", pushMessageCustom.toJson());
        }
        if (!TextUtils.equals(pushMessageCustom.callee, this.f14256a.m21245f().f22260b)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f14256a.m21245f().toString());
            sb.append("currentState:");
            sb.append(this.f14256a.m21248i());
            sb.append("messageDetail:");
            sb.append(pushMessageCustom.toJson());
            if (!TEnum.equals(voiceCallStatus, "calling")) {
                mqm0.m18565h().m18571d("RepeatErrorCallPush", sb.toString());
                return;
            } else {
                mqm0.m18565h().m18571d("RepeatCallingPush", sb.toString());
                wlm0.m24336g(pushMessageCustom, "busy", this.f14256a.m21245f().f22271m);
                return;
            }
        }
        mqm0.m18565h().m18571d("CallerStatusExchange", pushMessageCustom.toString());
        String string = voiceCallStatus.toString();
        string.getClass();
        switch (string) {
            case "accepted":
                wpm0 wpm0Var = new wpm0();
                wpm0Var.f22263e = pushMessageCustom.id;
                wpm0Var.f22266h = pushMessageCustom.channelNameV2;
                wpm0Var.f22265g = pushMessageCustom.callerTokenV2;
                wpm0Var.f22264f = pushMessageCustom.calleeTokenV2;
                wpm0Var.f22267i = pushMessageCustom.appId;
                wpm0Var.f22268j = pushMessageCustom.rtcProvider;
                wpm0Var.f22269k = pushMessageCustom.businessType;
                wpm0Var.f22261c = pushMessageCustom.calleeDeviceId;
                wpm0Var.f22274p = pushMessageCustom.mandatory;
                wpm0Var.f22270l = pushMessageCustom.roomId;
                this.f14256a.m21255p(wpm0Var);
                this.f14256a.m21260u(2);
                break;
            case "finished":
            case "rejected":
            case "busy":
                this.f14256a.m21244e(voiceCallStatus.toString());
                break;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m15996k(int i) {
        if (this.f14256a.m21254o()) {
            if (i == 0) {
                CoreModule.c.f0.Fo();
            } else {
                if (i != 1) {
                    return;
                }
                CoreModule.c.f0.Fo();
                m16001p();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m15997l() {
        this.f14257b = this.f14256a.m21259t("callerHelper", new e30() { // from class: l.cum0
            public final void call(Object obj) {
                this.f10779a.m15996k(((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m15999n(Context context, String str, long j, Throwable th) {
        m15994i(context, str, j, null, th);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m16000o(Long l2) {
        if (this.f14256a.m21248i() != 1) {
            mkd0.z(this.f14258c);
            return;
        }
        if (l2.longValue() == 15) {
            lsi0.w(R.string.T6);
        } else if (l2.longValue() >= 40) {
            lsi0.w(R.string.i7);
            this.f14256a.m21243d("notAnswered");
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m16001p() {
        mkd0.z(this.f14258c);
        this.f14258c = c.interval(1L, TimeUnit.SECONDS, Schedulers.io()).onBackpressureLatest().observeOn(jo0.a()).subscribe(new e30() { // from class: l.dum0
            public final void call(Object obj) {
                this.f12008a.m16000o((Long) obj);
            }
        });
    }
}
