package p149l;

import com.p046p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryUnRead;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class fzu implements e30 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LiveVoiceActivitiesEntryUnRead f100000a;

    public /* synthetic */ fzu(LiveVoiceActivitiesEntryUnRead liveVoiceActivitiesEntryUnRead) {
        this.f100000a = liveVoiceActivitiesEntryUnRead;
    }

    @Override // p149l.e30
    public final void call(Object obj) {
        this.f100000a.setViewsVisibility(((Boolean) obj).booleanValue());
    }
}
