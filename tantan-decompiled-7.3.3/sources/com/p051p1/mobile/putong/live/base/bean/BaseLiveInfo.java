package com.p051p1.mobile.putong.live.base.bean;

import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p153l.jyb;
import p153l.qcj;
import p153l.upq;

/* JADX INFO: loaded from: classes13.dex */
public class BaseLiveInfo implements Serializable {
    protected List<BLiveAbsData> lives = new ArrayList();
    protected HashMap<String, BLiveAbsRoom> roomHashMap = new HashMap<>();
    protected HashMap<String, User> userHashMap = new HashMap<>();
    private Map<String, Followship> mFollowshipMap = new HashMap();

    public BaseLiveInfo(List<? extends BLiveAbsData> list, List<? extends BLiveAbsRoom> list2, List<User> list3) {
        if (!jyb.m147479J(list)) {
            this.lives.addAll(list);
        }
        if (!jyb.m147479J(list2)) {
            for (BLiveAbsRoom bLiveAbsRoom : list2) {
                this.roomHashMap.put(bLiveAbsRoom.f45172id, bLiveAbsRoom);
            }
        }
        if (jyb.m147479J(list3)) {
            return;
        }
        for (User user : list3) {
            this.userHashMap.put(user.f56859id, user);
        }
    }

    public BaseLiveInfo copy() {
        BaseLiveInfo baseLiveInfo = new BaseLiveInfo();
        baseLiveInfo.lives.addAll(getLives());
        baseLiveInfo.userHashMap.putAll(this.userHashMap);
        baseLiveInfo.roomHashMap.putAll(this.roomHashMap);
        return baseLiveInfo;
    }

    public List<BLiveAbsData> getLives() {
        return this.lives;
    }

    public HashMap<String, User> getUserHashMap() {
        return this.userHashMap;
    }

    public boolean isFollowOther(String str) {
        Map<String, Followship> map = this.mFollowshipMap;
        Followship followship = (map == null || !map.containsKey(str)) ? null : this.mFollowshipMap.get(str);
        if (followship != null) {
            return TEnum.equals(followship.state, "matched") || TEnum.equals(followship.state, FollowshipStatus.following);
        }
        return false;
    }

    @Nullable
    public BLiveAbsData queryLiveById(final String str) {
        return (BLiveAbsData) jyb.m147529r(this.lives, new qcj() { // from class: l.ro2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((BLiveAbsData) obj).f45171id));
            }
        });
    }

    @Nullable
    public BLiveAbsRoom queryRoomById(String str) {
        if (this.roomHashMap.containsKey(str)) {
            return this.roomHashMap.get(str);
        }
        return null;
    }

    @Nullable
    public User queryUserById(String str) {
        if (this.userHashMap.containsKey(str)) {
            return this.userHashMap.get(str);
        }
        return null;
    }

    public void setFollowShips(List<Followship> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        for (Followship followship : list) {
            this.mFollowshipMap.put(followship.otherUser, followship);
        }
    }

    public String toString() {
        return super.toString() + "liveids: " + upq.m197175h(Constants.SEPARATOR_COMMA).m197179d(jyb.m147486Q(this.lives, new qcj() { // from class: l.so2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveAbsData) obj).f45171id;
            }
        }));
    }

    public BaseLiveInfo() {
    }
}
