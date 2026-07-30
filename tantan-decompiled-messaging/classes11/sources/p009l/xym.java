package p009l;

import android.net.Uri;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalPushView;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import l.j2e0;
import l.j760;
import l.v930;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class xym extends aym<LiveInternalPushView> {
    public xym(zxm zxmVar) {
        super(zxmVar);
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: f */
    public void mo1857f() {
        if (TextUtils.isEmpty(this.f9776a.f24025k.link)) {
            return;
        }
        zxm zxmVar = this.f9776a;
        if (zxmVar.f24027m != null) {
            String str = zxmVar.f24025k.link;
            if (str != null && !str.contains("source=")) {
                this.f9776a.f24025k.link = this.f9776a.f24025k.link + "&source=start-push";
            }
            String str2 = this.f9776a.f24025k.link;
            if (str2 != null && !str2.contains("liveMode=virtualAvatar")) {
                this.f9776a.f24025k.link = this.f9776a.f24025k.link + "&liveMode=virtualAvatar";
            }
            String str3 = this.f9776a.f24025k.link;
            if (str3 != null && !str3.contains("from=")) {
                this.f9776a.f24025k.link = this.f9776a.f24025k.link + "&from=from_in_app_push";
            }
            zxm zxmVar2 = this.f9776a;
            j2e0.m(zxmVar2.f24027m, Uri.parse(zxmVar2.f24025k.link));
            zvf0.u("e_live_audio_room_enter", "p_live_inner_push", new j760[]{vwb.Y("anchorId", this.f9776a.f24024j.userId), vwb.Y("liveId", this.f9776a.f24024j.liveId), vwb.Y("audio_card_type", "start-push-follow"), vwb.Y("test_group_name", this.f9776a.f24024j.testGroupName)});
        }
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
        zvf0.A("e_live_audio_room_enter", "p_live_inner_push", new j760[]{vwb.Y("anchorId", this.f9776a.f24024j.userId), vwb.Y("liveId", this.f9776a.f24024j.liveId), vwb.Y("audio_card_type", "start-push-follow"), vwb.Y("test_group_name", this.f9776a.f24024j.testGroupName)});
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
