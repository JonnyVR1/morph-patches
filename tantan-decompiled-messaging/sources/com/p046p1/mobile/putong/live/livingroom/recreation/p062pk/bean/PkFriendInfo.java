package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean;

import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p149l.vwb;

/* JADX INFO: loaded from: classes5.dex */
public class PkFriendInfo implements Serializable {
    public List<BLiveAnchor> anchors;
    private boolean hasNextPage;
    public List<BLive> lives;
    public List<User> users;
    private HashMap<String, User> userHashMap = new HashMap<>();
    private HashMap<String, BLive> liveHashMap = new HashMap<>();

    public PkFriendInfo(List<User> list, List<BLive> list2, List<BLiveAnchor> list3) {
        this.users = list == null ? new ArrayList<>() : list;
        this.lives = list2 == null ? new ArrayList<>() : list2;
        this.anchors = list3 == null ? new ArrayList<>() : list3;
        changeUserMap(this.users);
        changeLiveMap(this.lives);
    }

    private void changeLiveMap(List<BLive> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        for (BLive bLive : list) {
            this.liveHashMap.put(bLive.anchor.f44419id, bLive);
        }
    }

    private void changeUserMap(List<User> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        for (User user : list) {
            this.userHashMap.put(user.f56011id, user);
        }
    }

    public void contact(PkFriendInfo pkFriendInfo) {
        this.anchors.addAll(pkFriendInfo.anchors);
        this.lives.addAll(pkFriendInfo.lives);
        this.users.addAll(pkFriendInfo.users);
        changeUserMap(this.users);
        changeLiveMap(this.lives);
        setHasNextPage(pkFriendInfo.isHasNextPage());
    }

    public boolean isHasNextPage() {
        return this.hasNextPage;
    }

    public BLive queryLiveById(String str) {
        if (this.liveHashMap.containsKey(str)) {
            return this.liveHashMap.get(str);
        }
        return null;
    }

    public User queryUserById(String str) {
        if (this.userHashMap.containsKey(str)) {
            return this.userHashMap.get(str);
        }
        return null;
    }

    public PkFriendInfo setHasNextPage(boolean z) {
        this.hasNextPage = z;
        return this;
    }
}
