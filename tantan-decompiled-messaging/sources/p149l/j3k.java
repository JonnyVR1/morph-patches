package p149l;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.offline.DownloadService;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.data.OMSResourceType;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.SchemeKey;

/* JADX INFO: loaded from: classes13.dex */
public class j3k extends aul {
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m139576r(String str, String str2) {
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: d */
    public void mo100100d(Act act, String str, PushMessageCustom pushMessageCustom) {
        super.mo100100d(act, str, pushMessageCustom);
        if (ytl.m216064h(act)) {
            return;
        }
        boolean zM158838h = nbt.m158838h();
        m139577s(this.f199994a);
        if ("live.schema.push.in.app".equals(this.f199994a.intent) || "live.audience.signin.push".equals(this.f199994a.intent) || "live.voiceLiving.partnerFinder.push".equals(this.f199994a.intent) || "live.anchor.living.push".equals(this.f199994a.intent) || "live.card.push.in.app".equals(this.f199994a.intent) || "live.ongoingLive.pinkCard".equals(this.f199994a.intent)) {
            zym.m220932a().m220934c(this.f199994a);
            return;
        }
        if ("live.schema.push.all".equals(this.f199994a.intent) || "live.schema.boutique.enter".equals(this.f199994a.intent)) {
            PushMessage pushMessage = this.f199994a;
            if (pushMessage.silent) {
                if (!zM158838h || App.m20426e() <= 10000) {
                    zym.m220932a().m220934c(this.f199994a);
                    return;
                } else {
                    rwj0.m181412k(this.f199994a.link, null);
                    return;
                }
            }
            if (zM158838h && nbt.m158837g(pushMessage.link)) {
                zym.m220932a().m220934c(this.f199994a);
                return;
            }
            if (TextUtils.equals(this.f199994a.messageCustom.category, OMSResourceType.background) && zM158838h) {
                return;
            }
            if (!TextUtils.equals(this.f199994a.messageCustom.category, DownloadService.KEY_FOREGROUND) || zM158838h) {
                if (!TextUtils.isEmpty(this.f199994a.link) && !this.f199994a.link.contains("&from=")) {
                    this.f199994a.link = this.f199994a.link + "&from=from_push";
                }
                if (TextUtils.equals(this.f199994a.messageCustom.liveMode, "virtualAvatar") && !TextUtils.isEmpty(this.f199994a.link) && !this.f199994a.link.contains("&liveMode=")) {
                    this.f199994a.link = this.f199994a.link + "&liveMode=virtualAvatar";
                }
                if (mwj0.m156660I().mo156718f(SchemeKey.get(Uri.parse(this.f199994a.link).getHost()), new w2e0.C20787a(s9s.f163227a, Uri.parse(this.f199994a.link).toString()).m201103d(), new f30() { // from class: l.i3k
                    @Override // p149l.f30
                    public final void call(Object obj, Object obj2) {
                        j3k.m139576r((String) obj, (String) obj2);
                    }
                }) == null) {
                    return;
                }
                l9s.m149074f(this.f199994a, bdt.m101233b(this.f199994a.link, this.f199995b), null, null, null);
            }
        }
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: k */
    public boolean mo100101k(String str) {
        return "live.schema.push.in.app".equals(str) || "live.audience.signin.push".equals(str) || "live.voiceLiving.partnerFinder.push".equals(str) || "live.anchor.living.push".equals(str) || "live.card.push.in.app".equals(str) || "live.ongoingLive.pinkCard".equals(str) || "live.schema.push.all".equals(str) || "live.schema.boutique.enter".equals(str);
    }

    /* JADX INFO: renamed from: s */
    public final void m139577s(PushMessage pushMessage) {
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
