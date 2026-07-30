package p009l;

import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import com.p1.mobile.putong.live.base.data.BLiveVoiceRoom;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qho0 {

    /* JADX INFO: renamed from: a */
    public BLiveVoice f19283a;

    /* JADX INFO: renamed from: b */
    public User f19284b;

    /* JADX INFO: renamed from: c */
    public BLiveVoiceRoom f19285c;

    /* JADX INFO: renamed from: a */
    public void m21011a(User user) {
        this.f19284b = user;
    }

    /* JADX INFO: renamed from: b */
    public void m21012b(BLiveVoice bLiveVoice) {
        if (bLiveVoice == BLiveVoice.EMPTY) {
            return;
        }
        this.f19283a = bLiveVoice;
    }

    /* JADX INFO: renamed from: c */
    public void m21013c(BLiveVoiceRoom bLiveVoiceRoom) {
        if (bLiveVoiceRoom == BLiveVoiceRoom.EMPTY_ROOM) {
            return;
        }
        this.f19285c = bLiveVoiceRoom;
    }
}
