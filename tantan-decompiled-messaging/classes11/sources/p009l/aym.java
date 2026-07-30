package p009l;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.C0104a;
import com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.C0105b;
import com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.PushMessage;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class aym<V extends LiveInternalPushBaseView> {

    /* JADX INFO: renamed from: a */
    public final zxm f9776a;

    public aym(zxm zxmVar) {
        this.f9776a = zxmVar;
    }

    /* JADX INFO: renamed from: a */
    public static aym m11770a(PushMessage pushMessage, zxm zxmVar) {
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
        if (zym.m26146b(pushMessage.messageCustom.liveMode)) {
            return new xym(zxmVar);
        }
        if ("live.schema.push.in.app".equals(pushMessage.intent)) {
            return new wym(zxmVar);
        }
        if ("live.audience.signin.push".equals(pushMessage.intent)) {
            return new rym(zxmVar);
        }
        if ("live.voiceLiving.partnerFinder.push".equals(pushMessage.intent)) {
            return new C0104a(zxmVar);
        }
        if ("live.card.push.in.app".equals(pushMessage.intent)) {
            return new C0105b(zxmVar);
        }
        if ("live.schema.boutique.enter".equals(pushMessage.intent) && (str2 = pushMessage.link) != null && str2.contains("enterSuggestVoiceRoom")) {
            return new zys(zxmVar);
        }
        if ("live.schema.push.all".equals(pushMessage.intent) && (str = pushMessage.link) != null && str.contains("enterVoiceRoom")) {
            return new yym(zxmVar);
        }
        return "live.ongoingLive.pinkCard".equals(pushMessage.intent) ? new pym(zxmVar) : new qym(zxmVar);
    }

    /* JADX INFO: renamed from: b */
    public int mo11771b() {
        return 5000;
    }

    /* JADX INFO: renamed from: c */
    public LiveInternalPushBaseView mo1854c(Act act) {
        return (LiveInternalPushBaseView) o7r.m19649a(act).inflate(f6c0.n6, (ViewGroup) null, false);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo1855d() {
        return true;
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo1856e();

    /* JADX INFO: renamed from: f */
    public abstract void mo1857f();

    /* JADX INFO: renamed from: i */
    public abstract void mo1859i(uys uysVar);

    /* JADX INFO: renamed from: j */
    public abstract void mo1860j(V v);

    /* JADX INFO: renamed from: k */
    public abstract boolean mo1861k();

    /* JADX INFO: renamed from: l */
    public abstract void mo1862l();

    /* JADX INFO: renamed from: g */
    public void mo11772g(uys uysVar) {
    }

    /* JADX INFO: renamed from: h */
    public void mo1858h() {
    }
}
