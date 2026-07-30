package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom;

/* JADX INFO: loaded from: classes13.dex */
public class wq2 {

    /* JADX INFO: renamed from: a */
    public User f187608a;

    /* JADX INFO: renamed from: b */
    public BLiveAbsRoom f187609b;

    /* JADX INFO: renamed from: c */
    public BLiveAbsData f187610c;

    /* JADX INFO: renamed from: d */
    public Followship f187611d;

    public wq2(User user, BLiveAbsRoom bLiveAbsRoom, BLiveAbsData bLiveAbsData, Followship followship) {
        this.f187608a = user;
        this.f187609b = bLiveAbsRoom;
        this.f187610c = bLiveAbsData;
        this.f187611d = followship;
    }

    public boolean equals(Object obj) {
        BLiveAbsRoom bLiveAbsRoom;
        wq2 wq2Var = (wq2) obj;
        BLiveAbsRoom bLiveAbsRoom2 = wq2Var.f187609b;
        if (bLiveAbsRoom2 == null || wq2Var.f187610c == null || (bLiveAbsRoom = this.f187609b) == null || this.f187610c == null) {
            return this == obj;
        }
        return TextUtils.equals(bLiveAbsRoom.f44324id, bLiveAbsRoom2.f44324id) && TextUtils.equals(this.f187610c.f44323id, wq2Var.f187610c.f44323id);
    }

    public String toString() {
        return "BaseRoomInfo{user=" + this.f187608a + ", room=" + this.f187609b + ", live=" + this.f187610c + ", followship=" + this.f187611d + '}';
    }
}
