package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom;

/* JADX INFO: loaded from: classes13.dex */
public class mr2 {

    /* JADX INFO: renamed from: a */
    public User f138291a;

    /* JADX INFO: renamed from: b */
    public BLiveAbsRoom f138292b;

    /* JADX INFO: renamed from: c */
    public BLiveAbsData f138293c;

    /* JADX INFO: renamed from: d */
    public Followship f138294d;

    public mr2(User user, BLiveAbsRoom bLiveAbsRoom, BLiveAbsData bLiveAbsData, Followship followship) {
        this.f138291a = user;
        this.f138292b = bLiveAbsRoom;
        this.f138293c = bLiveAbsData;
        this.f138294d = followship;
    }

    public boolean equals(Object obj) {
        BLiveAbsRoom bLiveAbsRoom;
        mr2 mr2Var = (mr2) obj;
        BLiveAbsRoom bLiveAbsRoom2 = mr2Var.f138292b;
        if (bLiveAbsRoom2 == null || mr2Var.f138293c == null || (bLiveAbsRoom = this.f138292b) == null || this.f138293c == null) {
            return this == obj;
        }
        return TextUtils.equals(bLiveAbsRoom.f45172id, bLiveAbsRoom2.f45172id) && TextUtils.equals(this.f138293c.f45171id, mr2Var.f138293c.f45171id);
    }

    public String toString() {
        return "BaseRoomInfo{user=" + this.f138291a + ", room=" + this.f138292b + ", live=" + this.f138293c + ", followship=" + this.f138294d + '}';
    }
}
