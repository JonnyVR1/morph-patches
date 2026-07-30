package p153l;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.C8091a;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.C8092b;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.SchemeKey;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a0n<V extends LiveInternalPushBaseView> {

    /* JADX INFO: renamed from: a */
    public final zzm f67729a;

    public a0n(zzm zzmVar) {
        this.f67729a = zzmVar;
    }

    /* JADX INFO: renamed from: a */
    public static a0n m95406a(PushMessage pushMessage, zzm zzmVar) {
        String str;
        String str2;
        if (TextUtils.equals(pushMessage.messageCustom.extra, "popExperimentStyle2")) {
            return new c0n(zzmVar);
        }
        if (TextUtils.equals(pushMessage.messageCustom.extra, "popExperimentStyle1")) {
            return new b0n(zzmVar);
        }
        if (TextUtils.equals(pushMessage.messageCustom.extra, "popExperimentStyle3")) {
            return new d0n(zzmVar);
        }
        if (TextUtils.equals(pushMessage.messageCustom.extra, "popExperimentStyle4")) {
            return new e0n(zzmVar);
        }
        if (z0n.m218137b(pushMessage.messageCustom.liveMode)) {
            return new x0n(zzmVar);
        }
        if ("live.schema.push.in.app".equals(pushMessage.intent)) {
            return new w0n(zzmVar);
        }
        if ("live.audience.signin.push".equals(pushMessage.intent)) {
            return new r0n(zzmVar);
        }
        if ("live.voiceLiving.partnerFinder.push".equals(pushMessage.intent)) {
            return new C8091a(zzmVar);
        }
        if ("live.card.push.in.app".equals(pushMessage.intent)) {
            return new C8092b(zzmVar);
        }
        if ("live.schema.boutique.enter".equals(pushMessage.intent) && (str2 = pushMessage.link) != null && str2.contains(SchemeKey.enterSuggestVoiceRoom)) {
            return new a1t(zzmVar);
        }
        if ("live.schema.push.all".equals(pushMessage.intent) && (str = pushMessage.link) != null && str.contains(SchemeKey.enterVoiceRoom)) {
            return new y0n(zzmVar);
        }
        return "live.ongoingLive.pinkCard".equals(pushMessage.intent) ? new p0n(zzmVar) : new q0n(zzmVar);
    }

    /* JADX INFO: renamed from: b */
    public int mo95407b() {
        return 5000;
    }

    /* JADX INFO: renamed from: c */
    public LiveInternalPushBaseView mo38886c(Act act) {
        return (LiveInternalPushBaseView) p9r.m171370a(act).inflate(kec0.f125980o6, (ViewGroup) null, false);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo38887d() {
        return true;
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo38888e();

    /* JADX INFO: renamed from: f */
    public abstract void mo38889f();

    /* JADX INFO: renamed from: i */
    public abstract void mo38891i(v0t v0tVar);

    /* JADX INFO: renamed from: j */
    public abstract void mo38892j(V v2);

    /* JADX INFO: renamed from: k */
    public abstract boolean mo38893k();

    /* JADX INFO: renamed from: l */
    public abstract void mo38894l();

    /* JADX INFO: renamed from: h */
    public void mo38890h() {
    }

    /* JADX INFO: renamed from: g */
    public void mo95408g(v0t v0tVar) {
    }
}
