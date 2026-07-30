package p153l;

import android.net.Uri;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.poplevel.C4522a;
import com.p051p1.mobile.android.p053ui.poplevel.PopAction;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalPushView;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.data.StreamCdnInfo;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes11.dex */
public class q0n extends a0n<LiveInternalPushView> {

    /* JADX INFO: renamed from: b */
    public final PushMessageCustom f155071b;

    public q0n(zzm zzmVar) {
        super(zzmVar);
        this.f155071b = zzmVar.f206718j;
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: c */
    public LiveInternalPushBaseView mo38886c(Act act) {
        LiveInternalPushView liveInternalPushView = (LiveInternalPushView) super.mo38886c(act);
        liveInternalPushView.setHandler(this);
        return liveInternalPushView;
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: e */
    public void mo38888e() {
        a1n.m95518a(this.f155071b, "auto", this.f67729a.m222273K());
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: f */
    public void mo38889f() {
        if (!TextUtils.isEmpty(this.f67729a.f206719k.link)) {
            zzm zzmVar = this.f67729a;
            if (zzmVar.f206721m != null) {
                if (!zzmVar.f206719k.link.contains("source=")) {
                    this.f67729a.f206719k.link = this.f67729a.f206719k.link + "&source=start-push";
                }
                if (!this.f67729a.f206719k.link.contains("from=")) {
                    this.f67729a.f206719k.link = this.f67729a.f206719k.link + "&from=from_in_app_push";
                }
                zzm zzmVar2 = this.f67729a;
                nae0.m162083m(zzmVar2.f206721m, Uri.parse(zzmVar2.f206719k.link));
                a1n.m95519b(this.f155071b, this.f67729a.m222273K());
                return;
            }
        }
        Live liveNew_ = Live.new_();
        PushMessageCustom pushMessageCustom = this.f155071b;
        String str = pushMessageCustom.liveId;
        String str2 = pushMessageCustom.pullStreamUrl;
        String str3 = pushMessageCustom.roomId;
        String str4 = pushMessageCustom.provider;
        String str5 = pushMessageCustom.businessType;
        String str6 = pushMessageCustom.callback;
        liveNew_.f39615id = str;
        liveNew_.room.f39651id = str3;
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
            CrashHelper.m82479c(e);
        }
        liveNew_.callback = str6;
        CoreModule.m30934Q().startAudienceLive(this.f67729a.f206717i.getAct(), mo174730m(liveNew_));
        a1n.m95519b(this.f155071b, this.f67729a.m222273K());
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: h */
    public void mo38890h() {
        CoreModule.m30934Q().mo68474wc(this.f155071b.liveId);
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: i */
    public void mo38891i(v0t v0tVar) {
        if (v0tVar.isShowing()) {
            a1n.m95518a(this.f155071b, "up", this.f67729a.m222273K());
            v0tVar.dismiss();
        }
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: k */
    public boolean mo38893k() {
        return CoreModule.m30934Q().mo68432Yk(ji30.m144964h().name());
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: l */
    public void mo38894l() {
        a1n.m95520c(this.f155071b, this.f67729a.m222273K());
    }

    /* JADX INFO: renamed from: m */
    public IntentParams mo174730m(Live live) {
        return new IntentParams.C13217a().m79958c(live).m79964i(this.f155071b.source).m79957b(this.f155071b.category).m79956a();
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo38892j(LiveInternalPushView liveInternalPushView) {
        zzm zzmVar = this.f67729a;
        liveInternalPushView.m38875j(zzmVar.f206719k, zzmVar.f206717i.getAct());
    }

    /* JADX INFO: renamed from: o */
    public void m174732o() {
        i4g0.m138520r("e_live_inner_push_close", this.f67729a.m222273K());
        C4522a.m22099p().m22118o(CorePopLevel.LIVE_PUSH.getOnlyName(), PopAction.USER_CLOSE);
    }
}
