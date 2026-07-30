package p009l;

import android.net.Uri;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalPushView;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import l.j2e0;
import l.j760;
import l.v930;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class yym extends aym<LiveInternalPushView> {
    public yym(zxm zxmVar) {
        super(zxmVar);
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: f */
    public void mo1857f() {
        zxm zxmVar;
        Act act;
        if (TextUtils.isEmpty(this.f9776a.f24025k.link) || (act = (zxmVar = this.f9776a).f24027m) == null) {
            return;
        }
        j2e0.m(act, Uri.parse(zxmVar.f24025k.link));
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: i */
    public void mo1859i(uys uysVar) {
        if (uysVar.isShowing()) {
            uysVar.dismiss();
        }
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: k */
    public boolean mo1861k() {
        return TabName.Live != v930.h();
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: l */
    public void mo1862l() {
        zvf0.A("e_live_audio_room_enter", "p_live_push", new j760[]{vwb.Y("anchorId", this.f9776a.f24024j.userId), vwb.Y("liveId", this.f9776a.f24024j.liveId), vwb.Y("audio_card_type", "live.schema.push.all"), vwb.Y("test_group_name", this.f9776a.f24024j.testGroupName), vwb.Y("intl_live_push_source", (TextUtils.isEmpty(this.f9776a.f24024j.source) || !this.f9776a.f24024j.source.startsWith("start-push-follow-in") || this.f9776a.f24024j.source.length() <= 20) ? "NA" : this.f9776a.f24024j.source.substring(21))});
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo1860j(LiveInternalPushView liveInternalPushView) {
        zxm zxmVar = this.f9776a;
        liveInternalPushView.mo1802b(zxmVar.f24025k, zxmVar.f24023i.act());
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: e */
    public void mo1856e() {
    }
}
