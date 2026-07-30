package p009l;

import android.net.Uri;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalPushView;
import com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p000p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.poplevel.PopAction;
import com.p1.mobile.android.ui.poplevel.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.data.Live;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.p1.mobile.putong.data.StreamCdnInfo;
import com.tantanapp.common.utils.CrashHelper;
import l.j2e0;
import l.v930;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qym extends aym<LiveInternalPushView> {

    /* JADX INFO: renamed from: b */
    public final PushMessageCustom f19582b;

    public qym(zxm zxmVar) {
        super(zxmVar);
        this.f19582b = zxmVar.f24024j;
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: c */
    public LiveInternalPushBaseView mo1854c(Act act) {
        LiveInternalPushView liveInternalPushView = (LiveInternalPushView) super.mo1854c(act);
        liveInternalPushView.setHandler(this);
        return liveInternalPushView;
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: e */
    public void mo1856e() {
        azm.m11788a(this.f19582b, "auto", this.f9776a.m26112K());
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: f */
    public void mo1857f() {
        if (!TextUtils.isEmpty(this.f9776a.f24025k.link)) {
            zxm zxmVar = this.f9776a;
            if (zxmVar.f24027m != null) {
                if (!zxmVar.f24025k.link.contains("source=")) {
                    this.f9776a.f24025k.link = this.f9776a.f24025k.link + "&source=start-push";
                }
                if (!this.f9776a.f24025k.link.contains("from=")) {
                    this.f9776a.f24025k.link = this.f9776a.f24025k.link + "&from=from_in_app_push";
                }
                zxm zxmVar2 = this.f9776a;
                j2e0.m(zxmVar2.f24027m, Uri.parse(zxmVar2.f24025k.link));
                azm.m11789b(this.f19582b, this.f9776a.m26112K());
                return;
            }
        }
        Live liveNew_ = Live.new_();
        PushMessageCustom pushMessageCustom = this.f19582b;
        String str = pushMessageCustom.liveId;
        String str2 = pushMessageCustom.pullStreamUrl;
        String str3 = pushMessageCustom.roomId;
        String str4 = pushMessageCustom.provider;
        String str5 = pushMessageCustom.businessType;
        String str6 = pushMessageCustom.callback;
        liveNew_.id = str;
        liveNew_.room.id = str3;
        liveNew_.streamUrl.pullFlv = str2;
        try {
            int i = 0;
            liveNew_.streamCdnInfo.provider = TextUtils.isEmpty(str4) ? 0 : Integer.parseInt(str4);
            StreamCdnInfo streamCdnInfo = liveNew_.streamCdnInfo;
            if (!TextUtils.isEmpty(str4)) {
                i = Integer.parseInt(str5);
            }
            streamCdnInfo.businessType = i;
        } catch (NumberFormatException e) {
            CrashHelper.c(e);
        }
        liveNew_.callback = str6;
        CoreModule.Q().startAudienceLive(this.f9776a.f24023i.act(), mo21346m(liveNew_));
        azm.m11789b(this.f19582b, this.f9776a.m26112K());
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: h */
    public void mo1858h() {
        CoreModule.Q().m9076wc(this.f19582b.liveId);
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: i */
    public void mo1859i(uys uysVar) {
        if (uysVar.isShowing()) {
            azm.m11788a(this.f19582b, "up", this.f9776a.m26112K());
            uysVar.dismiss();
        }
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: k */
    public boolean mo1861k() {
        return CoreModule.Q().m9034Yk(v930.h().name());
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: l */
    public void mo1862l() {
        azm.m11790c(this.f19582b, this.f9776a.m26112K());
    }

    /* JADX INFO: renamed from: m */
    public IntentParams mo21346m(Live live) {
        return new IntentParams.C0456a().m8991c(live).m8997i(this.f19582b.source).m8990b(this.f19582b.category).m8989a();
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1860j(LiveInternalPushView liveInternalPushView) {
        zxm zxmVar = this.f9776a;
        liveInternalPushView.m1843j(zxmVar.f24025k, zxmVar.f24023i.act());
    }

    /* JADX INFO: renamed from: o */
    public void m21348o() {
        zvf0.r("e_live_inner_push_close", this.f9776a.m26112K());
        a.p().o(CorePopLevel.LIVE_PUSH.getOnlyName(), PopAction.USER_CLOSE);
    }
}
