package p149l;

import android.net.Uri;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.poplevel.C4371a;
import com.p046p1.mobile.android.p048ui.poplevel.PopAction;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalPushView;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.StreamCdnInfo;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes11.dex */
public class qym extends aym<LiveInternalPushView> {

    /* JADX INFO: renamed from: b */
    public final PushMessageCustom f156938b;

    public qym(zxm zxmVar) {
        super(zxmVar);
        this.f156938b = zxmVar.f205466j;
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: c */
    public LiveInternalPushBaseView mo37883c(Act act) {
        LiveInternalPushView liveInternalPushView = (LiveInternalPushView) super.mo37883c(act);
        liveInternalPushView.setHandler(this);
        return liveInternalPushView;
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: e */
    public void mo37885e() {
        azm.m99715a(this.f156938b, "auto", this.f72298a.m220845K());
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: f */
    public void mo37886f() {
        if (!TextUtils.isEmpty(this.f72298a.f205467k.link)) {
            zxm zxmVar = this.f72298a;
            if (zxmVar.f205469m != null) {
                if (!zxmVar.f205467k.link.contains("source=")) {
                    this.f72298a.f205467k.link = this.f72298a.f205467k.link + "&source=start-push";
                }
                if (!this.f72298a.f205467k.link.contains("from=")) {
                    this.f72298a.f205467k.link = this.f72298a.f205467k.link + "&from=from_in_app_push";
                }
                zxm zxmVar2 = this.f72298a;
                j2e0.m139446m(zxmVar2.f205469m, Uri.parse(zxmVar2.f205467k.link));
                azm.m99716b(this.f156938b, this.f72298a.m220845K());
                return;
            }
        }
        Live liveNew_ = Live.new_();
        PushMessageCustom pushMessageCustom = this.f156938b;
        String str = pushMessageCustom.liveId;
        String str2 = pushMessageCustom.pullStreamUrl;
        String str3 = pushMessageCustom.roomId;
        String str4 = pushMessageCustom.provider;
        String str5 = pushMessageCustom.businessType;
        String str6 = pushMessageCustom.callback;
        liveNew_.f38767id = str;
        liveNew_.room.f38803id = str3;
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
            CrashHelper.m81296c(e);
        }
        liveNew_.callback = str6;
        CoreModule.m29936Q().startAudienceLive(this.f72298a.f205465i.getAct(), mo177043m(liveNew_));
        azm.m99716b(this.f156938b, this.f72298a.m220845K());
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: h */
    public void mo37887h() {
        CoreModule.m29936Q().mo67291wc(this.f156938b.liveId);
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: i */
    public void mo37888i(uys uysVar) {
        if (uysVar.isShowing()) {
            azm.m99715a(this.f156938b, "up", this.f72298a.m220845K());
            uysVar.dismiss();
        }
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: k */
    public boolean mo37890k() {
        return CoreModule.m29936Q().mo67249Yk(v930.m197534h().name());
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: l */
    public void mo37891l() {
        azm.m99717c(this.f156938b, this.f72298a.m220845K());
    }

    /* JADX INFO: renamed from: m */
    public IntentParams mo177043m(Live live) {
        return new IntentParams.C13054a().m78775c(live).m78781i(this.f156938b.source).m78774b(this.f156938b.category).m78773a();
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo37889j(LiveInternalPushView liveInternalPushView) {
        zxm zxmVar = this.f72298a;
        liveInternalPushView.m37872j(zxmVar.f205467k, zxmVar.f205465i.getAct());
    }

    /* JADX INFO: renamed from: o */
    public void m177045o() {
        zvf0.m220396r("e_live_inner_push_close", this.f72298a.m220845K());
        C4371a.m21100p().m21119o(CorePopLevel.LIVE_PUSH.getOnlyName(), PopAction.USER_CLOSE);
    }
}
