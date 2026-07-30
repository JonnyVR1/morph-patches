package p153l;

import com.p051p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryUnRead;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g1v implements y20 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LiveVoiceActivitiesEntryUnRead f101782a;

    public /* synthetic */ g1v(LiveVoiceActivitiesEntryUnRead liveVoiceActivitiesEntryUnRead) {
        this.f101782a = liveVoiceActivitiesEntryUnRead;
    }

    @Override // p153l.y20
    public final void call(Object obj) {
        this.f101782a.setViewsVisibility(((Boolean) obj).booleanValue());
    }
}
