package p153l;

import android.net.Uri;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalPushView;
import com.p051p1.mobile.putong.newui.main.base.TabName;

/* JADX INFO: loaded from: classes11.dex */
public class x0n extends a0n<LiveInternalPushView> {
    public x0n(zzm zzmVar) {
        super(zzmVar);
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: f */
    public void mo38889f() {
        if (TextUtils.isEmpty(this.f67729a.f206719k.link)) {
            return;
        }
        zzm zzmVar = this.f67729a;
        if (zzmVar.f206721m != null) {
            String str = zzmVar.f206719k.link;
            if (str != null && !str.contains("source=")) {
                this.f67729a.f206719k.link = this.f67729a.f206719k.link + "&source=start-push";
            }
            String str2 = this.f67729a.f206719k.link;
            if (str2 != null && !str2.contains("liveMode=virtualAvatar")) {
                this.f67729a.f206719k.link = this.f67729a.f206719k.link + "&liveMode=virtualAvatar";
            }
            String str3 = this.f67729a.f206719k.link;
            if (str3 != null && !str3.contains("from=")) {
                this.f67729a.f206719k.link = this.f67729a.f206719k.link + "&from=from_in_app_push";
            }
            zzm zzmVar2 = this.f67729a;
            nae0.m162083m(zzmVar2.f206721m, Uri.parse(zzmVar2.f206719k.link));
            i4g0.m138523u("e_live_audio_room_enter", "p_live_inner_push", jyb.m147494Y("anchorId", this.f67729a.f206718j.userId), jyb.m147494Y("liveId", this.f67729a.f206718j.liveId), jyb.m147494Y("audio_card_type", "start-push-follow"), jyb.m147494Y("test_group_name", this.f67729a.f206718j.testGroupName));
        }
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
        i4g0.m138492A("e_live_audio_room_enter", "p_live_inner_push", jyb.m147494Y("anchorId", this.f67729a.f206718j.userId), jyb.m147494Y("liveId", this.f67729a.f206718j.liveId), jyb.m147494Y("audio_card_type", "start-push-follow"), jyb.m147494Y("test_group_name", this.f67729a.f206718j.testGroupName));
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
