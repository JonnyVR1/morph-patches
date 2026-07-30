package p153l;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.offline.DownloadService;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.data.OMSResourceType;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.data.SchemeKey;

/* JADX INFO: loaded from: classes9.dex */
public class b6k extends owl {
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m102760r(String str, String str2) {
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: d */
    public void mo102761d(Act act, String str, PushMessageCustom pushMessageCustom) {
        super.mo102761d(act, str, pushMessageCustom);
        if (mwl.m160558h(act)) {
            return;
        }
        boolean zM167337h = odt.m167337h();
        m102763s(this.f139111a);
        if ("live.schema.push.in.app".equals(this.f139111a.intent) || "live.audience.signin.push".equals(this.f139111a.intent) || "live.voiceLiving.partnerFinder.push".equals(this.f139111a.intent) || "live.anchor.living.push".equals(this.f139111a.intent) || "live.card.push.in.app".equals(this.f139111a.intent) || "live.ongoingLive.pinkCard".equals(this.f139111a.intent)) {
            z0n.m218136a().m218138c(this.f139111a);
            return;
        }
        if ("live.schema.push.all".equals(this.f139111a.intent) || "live.schema.boutique.enter".equals(this.f139111a.intent)) {
            PushMessage pushMessage = this.f139111a;
            if (pushMessage.silent) {
                if (!zM167337h || App.m21425e() <= 10000) {
                    z0n.m218136a().m218138c(this.f139111a);
                    return;
                } else {
                    v5k0.m199899k(this.f139111a.link, null);
                    return;
                }
            }
            if (zM167337h && odt.m167336g(pushMessage.link)) {
                z0n.m218136a().m218138c(this.f139111a);
                return;
            }
            if (TextUtils.equals(this.f139111a.messageCustom.category, OMSResourceType.background) && zM167337h) {
                return;
            }
            if (!TextUtils.equals(this.f139111a.messageCustom.category, DownloadService.KEY_FOREGROUND) || zM167337h) {
                if (!TextUtils.isEmpty(this.f139111a.link) && !this.f139111a.link.contains("&from=")) {
                    this.f139111a.link = this.f139111a.link + "&from=from_push";
                }
                if (TextUtils.equals(this.f139111a.messageCustom.liveMode, "virtualAvatar") && !TextUtils.isEmpty(this.f139111a.link) && !this.f139111a.link.contains("&liveMode=")) {
                    this.f139111a.link = this.f139111a.link + "&liveMode=virtualAvatar";
                }
                if (q5k0.m175372I().mo175434f(SchemeKey.get(Uri.parse(this.f139111a.link).getHost()), new abe0.C15681a(tbs.f172988a, Uri.parse(this.f139111a.link).toString()).m96748d(), new z20() { // from class: l.a6k
                    @Override // p153l.z20
                    public final void call(Object obj, Object obj2) {
                        b6k.m102760r((String) obj, (String) obj2);
                    }
                }) == null) {
                    return;
                }
                mbs.m157851f(this.f139111a, cft.m109592b(this.f139111a.link, this.f139112b), null, null, null);
            }
        }
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: k */
    public boolean mo102762k(String str) {
        return "live.schema.push.in.app".equals(str) || "live.audience.signin.push".equals(str) || "live.voiceLiving.partnerFinder.push".equals(str) || "live.anchor.living.push".equals(str) || "live.card.push.in.app".equals(str) || "live.ongoingLive.pinkCard".equals(str) || "live.schema.push.all".equals(str) || "live.schema.boutique.enter".equals(str);
    }

    /* JADX INFO: renamed from: s */
    public final void m102763s(PushMessage pushMessage) {
        if (pushMessage.messageCustom.title != null && TextUtils.isEmpty(pushMessage.title)) {
            pushMessage.title = pushMessage.messageCustom.title;
        }
        if (pushMessage.messageCustom.content != null && (TextUtils.isEmpty(pushMessage.value) || TextUtils.isEmpty(pushMessage.ticker))) {
            String str = pushMessage.messageCustom.content;
            pushMessage.value = str;
            pushMessage.ticker = str;
        }
        if (pushMessage.title != null && TextUtils.isEmpty(pushMessage.messageCustom.title)) {
            pushMessage.messageCustom.title = pushMessage.title;
        }
        if (TextUtils.isEmpty(pushMessage.ticker) || !TextUtils.isEmpty(pushMessage.messageCustom.content)) {
            return;
        }
        pushMessage.messageCustom.content = pushMessage.ticker;
    }
}
