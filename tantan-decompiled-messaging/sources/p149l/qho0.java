package p149l;

import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;

/* JADX INFO: loaded from: classes11.dex */
public class qho0 {

    /* JADX INFO: renamed from: a */
    public BLiveVoice f154501a;

    /* JADX INFO: renamed from: b */
    public User f154502b;

    /* JADX INFO: renamed from: c */
    public BLiveVoiceRoom f154503c;

    /* JADX INFO: renamed from: a */
    public void m174577a(User user) {
        this.f154502b = user;
    }

    /* JADX INFO: renamed from: b */
    public void m174578b(BLiveVoice bLiveVoice) {
        if (bLiveVoice == BLiveVoice.EMPTY) {
            return;
        }
        this.f154501a = bLiveVoice;
    }

    /* JADX INFO: renamed from: c */
    public void m174579c(BLiveVoiceRoom bLiveVoiceRoom) {
        if (bLiveVoiceRoom == BLiveVoiceRoom.EMPTY_ROOM) {
            return;
        }
        this.f154503c = bLiveVoiceRoom;
    }
}
