package p149l;

import android.net.Uri;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalPushView;
import com.p046p1.mobile.putong.newui.main.base.TabName;

/* JADX INFO: loaded from: classes11.dex */
public class xym extends aym<LiveInternalPushView> {
    public xym(zxm zxmVar) {
        super(zxmVar);
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: f */
    public void mo37886f() {
        if (TextUtils.isEmpty(this.f72298a.f205467k.link)) {
            return;
        }
        zxm zxmVar = this.f72298a;
        if (zxmVar.f205469m != null) {
            String str = zxmVar.f205467k.link;
            if (str != null && !str.contains("source=")) {
                this.f72298a.f205467k.link = this.f72298a.f205467k.link + "&source=start-push";
            }
            String str2 = this.f72298a.f205467k.link;
            if (str2 != null && !str2.contains("liveMode=virtualAvatar")) {
                this.f72298a.f205467k.link = this.f72298a.f205467k.link + "&liveMode=virtualAvatar";
            }
            String str3 = this.f72298a.f205467k.link;
            if (str3 != null && !str3.contains("from=")) {
                this.f72298a.f205467k.link = this.f72298a.f205467k.link + "&from=from_in_app_push";
            }
            zxm zxmVar2 = this.f72298a;
            j2e0.m139446m(zxmVar2.f205469m, Uri.parse(zxmVar2.f205467k.link));
            zvf0.m220399u("e_live_audio_room_enter", "p_live_inner_push", vwb.m200311Y("anchorId", this.f72298a.f205466j.userId), vwb.m200311Y("liveId", this.f72298a.f205466j.liveId), vwb.m200311Y("audio_card_type", "start-push-follow"), vwb.m200311Y("test_group_name", this.f72298a.f205466j.testGroupName));
        }
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: i */
    public void mo37888i(uys uysVar) {
        if (uysVar.isShowing()) {
            uysVar.dismiss();
        }
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: k */
    public boolean mo37890k() {
        return TabName.Live != v930.m197534h();
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: l */
    public void mo37891l() {
        zvf0.m220368A("e_live_audio_room_enter", "p_live_inner_push", vwb.m200311Y("anchorId", this.f72298a.f205466j.userId), vwb.m200311Y("liveId", this.f72298a.f205466j.liveId), vwb.m200311Y("audio_card_type", "start-push-follow"), vwb.m200311Y("test_group_name", this.f72298a.f205466j.testGroupName));
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo37889j(LiveInternalPushView liveInternalPushView) {
        zxm zxmVar = this.f72298a;
        liveInternalPushView.mo37831b(zxmVar.f205467k, zxmVar.f205465i.getAct());
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: e */
    public void mo37885e() {
    }
}
