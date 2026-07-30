package p149l;

import android.net.Uri;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalPushView;
import com.p046p1.mobile.putong.newui.main.base.TabName;

/* JADX INFO: loaded from: classes11.dex */
public class yym extends aym<LiveInternalPushView> {
    public yym(zxm zxmVar) {
        super(zxmVar);
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: f */
    public void mo37886f() {
        zxm zxmVar;
        Act act;
        if (TextUtils.isEmpty(this.f72298a.f205467k.link) || (act = (zxmVar = this.f72298a).f205469m) == null) {
            return;
        }
        j2e0.m139446m(act, Uri.parse(zxmVar.f205467k.link));
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
        zvf0.m220368A("e_live_audio_room_enter", "p_live_push", vwb.m200311Y("anchorId", this.f72298a.f205466j.userId), vwb.m200311Y("liveId", this.f72298a.f205466j.liveId), vwb.m200311Y("audio_card_type", "live.schema.push.all"), vwb.m200311Y("test_group_name", this.f72298a.f205466j.testGroupName), vwb.m200311Y("intl_live_push_source", (TextUtils.isEmpty(this.f72298a.f205466j.source) || !this.f72298a.f205466j.source.startsWith("start-push-follow-in") || this.f72298a.f205466j.source.length() <= 20) ? "NA" : this.f72298a.f205466j.source.substring(21)));
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
