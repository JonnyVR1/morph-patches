package p149l;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.C7940a;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.C7941b;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.SchemeKey;

/* JADX INFO: loaded from: classes11.dex */
public abstract class aym<V extends LiveInternalPushBaseView> {

    /* JADX INFO: renamed from: a */
    public final zxm f72298a;

    public aym(zxm zxmVar) {
        this.f72298a = zxmVar;
    }

    /* JADX INFO: renamed from: a */
    public static aym m99570a(PushMessage pushMessage, zxm zxmVar) {
        String str;
        String str2;
        if (TextUtils.equals(pushMessage.messageCustom.extra, "popExperimentStyle2")) {
            return new cym(zxmVar);
        }
        if (TextUtils.equals(pushMessage.messageCustom.extra, "popExperimentStyle1")) {
            return new bym(zxmVar);
        }
        if (TextUtils.equals(pushMessage.messageCustom.extra, "popExperimentStyle3")) {
            return new dym(zxmVar);
        }
        if (TextUtils.equals(pushMessage.messageCustom.extra, "popExperimentStyle4")) {
            return new eym(zxmVar);
        }
        if (zym.m220933b(pushMessage.messageCustom.liveMode)) {
            return new xym(zxmVar);
        }
        if ("live.schema.push.in.app".equals(pushMessage.intent)) {
            return new wym(zxmVar);
        }
        if ("live.audience.signin.push".equals(pushMessage.intent)) {
            return new rym(zxmVar);
        }
        if ("live.voiceLiving.partnerFinder.push".equals(pushMessage.intent)) {
            return new C7940a(zxmVar);
        }
        if ("live.card.push.in.app".equals(pushMessage.intent)) {
            return new C7941b(zxmVar);
        }
        if ("live.schema.boutique.enter".equals(pushMessage.intent) && (str2 = pushMessage.link) != null && str2.contains(SchemeKey.enterSuggestVoiceRoom)) {
            return new zys(zxmVar);
        }
        if ("live.schema.push.all".equals(pushMessage.intent) && (str = pushMessage.link) != null && str.contains(SchemeKey.enterVoiceRoom)) {
            return new yym(zxmVar);
        }
        return "live.ongoingLive.pinkCard".equals(pushMessage.intent) ? new pym(zxmVar) : new qym(zxmVar);
    }

    /* JADX INFO: renamed from: b */
    public int mo99571b() {
        return 5000;
    }

    /* JADX INFO: renamed from: c */
    public LiveInternalPushBaseView mo37883c(Act act) {
        return (LiveInternalPushBaseView) o7r.m163037a(act).inflate(f6c0.f95909n6, (ViewGroup) null, false);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo37884d() {
        return true;
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo37885e();

    /* JADX INFO: renamed from: f */
    public abstract void mo37886f();

    /* JADX INFO: renamed from: i */
    public abstract void mo37888i(uys uysVar);

    /* JADX INFO: renamed from: j */
    public abstract void mo37889j(V v2);

    /* JADX INFO: renamed from: k */
    public abstract boolean mo37890k();

    /* JADX INFO: renamed from: l */
    public abstract void mo37891l();

    /* JADX INFO: renamed from: g */
    public void mo99572g(uys uysVar) {
    }

    /* JADX INFO: renamed from: h */
    public void mo37887h() {
    }
}
