package p153l;

import android.net.Uri;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalPushView;
import com.p051p1.mobile.putong.newui.main.base.TabName;

/* JADX INFO: loaded from: classes11.dex */
public class y0n extends a0n<LiveInternalPushView> {
    public y0n(zzm zzmVar) {
        super(zzmVar);
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: f */
    public void mo38889f() {
        zzm zzmVar;
        Act act;
        if (TextUtils.isEmpty(this.f67729a.f206719k.link) || (act = (zzmVar = this.f67729a).f206721m) == null) {
            return;
        }
        nae0.m162083m(act, Uri.parse(zzmVar.f206719k.link));
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: i */
    public void mo38891i(v0t v0tVar) {
        if (v0tVar.isShowing()) {
            v0tVar.dismiss();
        }
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: k */
    public boolean mo38893k() {
        return TabName.Live != ji30.m144964h();
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: l */
    public void mo38894l() {
        i4g0.m138492A("e_live_audio_room_enter", "p_live_push", jyb.m147494Y("anchorId", this.f67729a.f206718j.userId), jyb.m147494Y("liveId", this.f67729a.f206718j.liveId), jyb.m147494Y("audio_card_type", "live.schema.push.all"), jyb.m147494Y("test_group_name", this.f67729a.f206718j.testGroupName), jyb.m147494Y("intl_live_push_source", (TextUtils.isEmpty(this.f67729a.f206718j.source) || !this.f67729a.f206718j.source.startsWith("start-push-follow-in") || this.f67729a.f206718j.source.length() <= 20) ? "NA" : this.f67729a.f206718j.source.substring(21)));
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo38892j(LiveInternalPushView liveInternalPushView) {
        zzm zzmVar = this.f67729a;
        liveInternalPushView.mo38834b(zzmVar.f206719k, zzmVar.f206717i.getAct());
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: e */
    public void mo38888e() {
    }
}
