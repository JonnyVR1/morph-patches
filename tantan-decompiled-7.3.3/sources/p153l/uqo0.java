package p153l;

import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;

/* JADX INFO: loaded from: classes10.dex */
public class uqo0 {

    /* JADX INFO: renamed from: a */
    public BLiveVoice f180496a;

    /* JADX INFO: renamed from: b */
    public User f180497b;

    /* JADX INFO: renamed from: c */
    public BLiveVoiceRoom f180498c;

    /* JADX INFO: renamed from: a */
    public void m197373a(User user) {
        this.f180497b = user;
    }

    /* JADX INFO: renamed from: b */
    public void m197374b(BLiveVoice bLiveVoice) {
        if (bLiveVoice == BLiveVoice.EMPTY) {
            return;
        }
        this.f180496a = bLiveVoice;
    }

    /* JADX INFO: renamed from: c */
    public void m197375c(BLiveVoiceRoom bLiveVoiceRoom) {
        if (bLiveVoiceRoom == BLiveVoiceRoom.EMPTY_ROOM) {
            return;
        }
        this.f180498c = bLiveVoiceRoom;
    }
}
