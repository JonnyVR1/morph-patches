package p149l;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatHeatActionData;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.VoiceCallStatus;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes11.dex */
public class hum0 {

    /* JADX INFO: renamed from: d */
    public static String[] f109571d = {"android.permission.RECORD_AUDIO"};

    /* JADX INFO: renamed from: e */
    public static String[] f109572e;

    /* JADX INFO: renamed from: a */
    public final qsm0 f109573a;

    /* JADX INFO: renamed from: b */
    public c4g0 f109574b;

    /* JADX INFO: renamed from: c */
    public c4g0 f109575c;

    static {
        f109572e = zqx.m219898k() ? new String[]{"android.permission.RECORD_AUDIO"} : new String[]{"android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE"};
    }

    public hum0(qsm0 qsm0Var) {
        this.f109573a = qsm0Var;
        m133133l();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m133122a(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: f */
    public final boolean m133127f(Context context, String str, String str2) {
        if (!nlm0.m160070c() || !CoreModule.m29935P().m94658i().mo158210C(100011)) {
            return false;
        }
        if (CoreModule.m29936Q().mo67253Zo().mo111891b()) {
            lsi0.m151595y("当前正在语聊中，无法语音电话");
            return false;
        }
        if ((context instanceof MessagesAct) && !TextUtils.isEmpty(str2)) {
            dqy dqyVarM128212u0 = ((MessagesAct) context).mo48954A0().m156457g0().m128212u0();
            if (NullChecker.m81303a(dqyVarM128212u0) && dqyVarM128212u0.m113220d0()) {
                lsi0.m151593w(R$string.f20730C5);
                return false;
            }
        }
        if (CoreModule.m29935P().m94658i().mo158478z(str)) {
            lsi0.m151593w(R$string.f20753F4);
            return false;
        }
        if (ruy.m181215g().m181218e(str)) {
            lsi0.m151593w(R$string.f20761G4);
            return false;
        }
        if (CoreModule.m29935P().m94652b().mo35122of()) {
            lsi0.m151593w(R$string.f20728C3);
            return false;
        }
        if (!Network.isConnected(CoreModule.f17544b)) {
            lsi0.m151593w(R$string.f20719B2);
            return false;
        }
        if (ssm0.m185761e()) {
            lsi0.m151593w(R$string.f20915Z6);
            return false;
        }
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
        if (userM169430Pa == null) {
            return false;
        }
        if (userM169430Pa.unilateralBlock()) {
            lsi0.m151578h(R$string.f21057p5);
            return false;
        }
        if (context instanceof Act) {
            String[] strArr = f109572e;
            if (!PermissionHelper.m79881b(strArr)) {
                PermissionHelper.m79882c().m79900r(strArr).m79905w(false).m79896n(new e30() { // from class: l.gum0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        hum0.m133122a((PermissionHelper.PermissionDeniedReason) obj);
                    }
                }).m79903u(true).m79891i((Act) context);
                return false;
            }
        }
        if (ghd0.m126179c()) {
            return true;
        }
        ghd0.m126180d();
        lsi0.m151578h(R$string.f21023l7);
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean m133128g(final Context context, final String str, final String str2) {
        if (!m133127f(context, str, str2)) {
            ib1.m135233b().mo135237e(tqm0.f171604h);
            return false;
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        wlm0.m203841h(str, str2, pk8.m169980M().identifier).subscribe(mkd0.m154956H(new e30() { // from class: l.eum0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93259a.m133134m(context, str, jElapsedRealtime, str2, (Envelope) obj);
            }
        }, new e30() { // from class: l.fum0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99348a.m133135n(context, str, jElapsedRealtime, (Throwable) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void m133134m(Context context, String str, long j, String str2, Envelope envelope) {
        if (envelope.meta.code != 200) {
            m133130i(context, str, j, envelope, null);
            return;
        }
        wpm0 wpm0Var = new wpm0();
        wpm0Var.f187545b = str;
        wpm0Var.f187544a = CoreModule.m29931H().userId();
        wpm0Var.f187547d = pk8.m169980M().identifier;
        wpm0Var.f187556m = str2;
        wpm0Var.f187557n = str;
        wpm0Var.f187558o = true;
        this.f109573a.m176322p(wpm0Var);
        this.f109573a.m176327u(1);
        mqm0.m155966j(str);
    }

    /* JADX INFO: renamed from: i */
    public final void m133130i(Context context, String str, long j, Envelope envelope, Throwable th) {
        ib1.m135233b().mo135237e(tqm0.f171604h);
        if (th != null) {
            boolean z = th instanceof TantanException.Client.TantanForbidden;
            if (z && CoreModule.m29935P().m94658i().mo158261L1((TantanException.Client.TantanForbidden) th)) {
                lsi0.m151593w(R$string.f21005j7);
                return;
            } else {
                if (!z) {
                    yij0.m214926D(th);
                    return;
                }
                ChatHeatActionData chatHeatActionData = new ChatHeatActionData(str, ChatHeatActionData.ExclusiveAction.CHECK, false, new j760[0]);
                chatHeatActionData.setThrowable(th);
                CoreModule.f17545c.f19586M1.f198866S.m132487l(chatHeatActionData);
                return;
            }
        }
        if (envelope != null) {
            int i = envelope.meta.code;
            if (i == 20001) {
                lsi0.m151593w(R$string.f20907Y6);
                return;
            }
            if (i != 201) {
                if (i == 40301) {
                    lsi0.m151578h(R$string.f21057p5);
                    return;
                } else {
                    lsi0.m151593w(R$string.f20727C2);
                    return;
                }
            }
            Message message = ((CoreData) envelope.getModuleData(CoreData.class)).messages.get(0);
            if (context instanceof MessagesAct) {
                ((MessagesAct) context).f31640f.m120732X6(message);
            }
            if (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).messages)) {
                return;
            }
            pxz.m171970g(message, OMSDialogPositon.p_chat_view, "success", str, 1, SystemClock.elapsedRealtime() - j);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m133131j(VoiceCallStatus voiceCallStatus, PushMessageCustom pushMessageCustom) {
        if (TEnum.equals(voiceCallStatus, VoiceCallStatus.calling)) {
            mqm0.m155965h().m155971d("PushInitErrorStatus", pushMessageCustom.toJson());
        }
        if (!TextUtils.equals(pushMessageCustom.callee, this.f109573a.m176312f().f187545b)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f109573a.m176312f().toString());
            sb.append("currentState:");
            sb.append(this.f109573a.m176315i());
            sb.append("messageDetail:");
            sb.append(pushMessageCustom.toJson());
            if (!TEnum.equals(voiceCallStatus, VoiceCallStatus.calling)) {
                mqm0.m155965h().m155971d("RepeatErrorCallPush", sb.toString());
                return;
            } else {
                mqm0.m155965h().m155971d("RepeatCallingPush", sb.toString());
                wlm0.m203840g(pushMessageCustom, VoiceCallStatus.busy, this.f109573a.m176312f().f187556m);
                return;
            }
        }
        mqm0.m155965h().m155971d("CallerStatusExchange", pushMessageCustom.toString());
        String string = voiceCallStatus.toString();
        string.getClass();
        switch (string) {
            case "accepted":
                wpm0 wpm0Var = new wpm0();
                wpm0Var.f187548e = pushMessageCustom.f38805id;
                wpm0Var.f187551h = pushMessageCustom.channelNameV2;
                wpm0Var.f187550g = pushMessageCustom.callerTokenV2;
                wpm0Var.f187549f = pushMessageCustom.calleeTokenV2;
                wpm0Var.f187552i = pushMessageCustom.appId;
                wpm0Var.f187553j = pushMessageCustom.rtcProvider;
                wpm0Var.f187554k = pushMessageCustom.businessType;
                wpm0Var.f187546c = pushMessageCustom.calleeDeviceId;
                wpm0Var.f187559p = pushMessageCustom.mandatory;
                wpm0Var.f187555l = pushMessageCustom.roomId;
                this.f109573a.m176322p(wpm0Var);
                this.f109573a.m176327u(2);
                break;
            case "finished":
            case "rejected":
            case "busy":
                this.f109573a.m176311e(voiceCallStatus.toString());
                break;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m133132k(int i) {
        if (this.f109573a.m176321o()) {
            if (i == 0) {
                CoreModule.f17545c.f19642f0.m32650Fo();
            } else {
                if (i != 1) {
                    return;
                }
                CoreModule.f17545c.f19642f0.m32650Fo();
                m133137p();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m133133l() {
        this.f109574b = this.f109573a.m176326t("callerHelper", new e30() { // from class: l.cum0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82586a.m133132k(((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m133135n(Context context, String str, long j, Throwable th) {
        m133130i(context, str, j, null, th);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m133136o(Long l2) {
        if (this.f109573a.m176315i() != 1) {
            mkd0.m154992z(this.f109575c);
            return;
        }
        if (l2.longValue() == 15) {
            lsi0.m151593w(R$string.f20867T6);
        } else if (l2.longValue() >= 40) {
            lsi0.m151593w(R$string.f20996i7);
            this.f109573a.m176310d(VoiceCallStatus.notAnswered);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m133137p() {
        mkd0.m154992z(this.f109575c);
        this.f109575c = C22306c.interval(1L, TimeUnit.SECONDS, Schedulers.m221493io()).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(new e30() { // from class: l.dum0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88001a.m133136o((Long) obj);
            }
        });
    }
}
