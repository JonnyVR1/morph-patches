package com.p051p1.mobile.putong.core.p058ui.onlinematch;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Answer;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.pzi0;

/* JADX INFO: loaded from: classes4.dex */
public class OnlineMatchPushUser implements Serializable {
    private static final String TAG = "OnlineMatchPushUser";
    public String action;
    public String age;
    public String avatarUrl;
    public long birthday;
    public String biz;
    public String broadcastId;
    public String city;
    public long createTime;
    public int distance;
    public String fitReason;
    public String friendPurpose;
    public boolean fromUser;
    public String gender;
    public String gid;
    public boolean isAudioBroadcast;
    public boolean isBell;
    public boolean isGreet;
    public boolean isMaleQuickChatRing;
    public boolean isSpeedMatch;
    public boolean isSquareDataWrapper;
    public boolean isUserInSquare;
    public int matchPercent;
    public String matchTopic;
    public String name;
    public boolean oneside;
    public String poolID;
    public String queryToken;
    public String radioType;
    public String ruleKey;
    public String secretKey;
    public String stage;
    public String tracker;
    public User user;
    public String userId;
    public ArrayList<Tag> userTagList;
    public String zodiacFitPercent;
    public int timeRemaining = -1;
    public long historyBroadcastTime = -1;
    public long showTime = -1;
    public RelationshipStatus rsStateReceiverToSender = RelationshipStatus.get("unknown_");

    public boolean isFemale() {
        return "female".equals(this.gender);
    }

    public void transDataFromPush(PushMessage pushMessage) {
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        this.action = pushMessageCustom.action;
        this.avatarUrl = pushMessageCustom.url;
        this.gender = pushMessageCustom.gender;
        this.age = pushMessageCustom.age;
        this.name = pushMessageCustom.name;
        this.userId = pushMessage.content.f39652id;
        this.queryToken = pushMessageCustom.queryToken;
        this.poolID = pushMessageCustom.poolID;
        this.birthday = pushMessageCustom.birthday;
        this.broadcastId = pushMessageCustom.broadcastID;
        this.gid = pushMessageCustom.gid;
        this.ruleKey = pushMessageCustom.ruleKey;
        this.userTagList = new ArrayList<>();
        if (!TextUtils.isEmpty(pushMessageCustom.tag1)) {
            this.userTagList.add(new Tag("", pushMessageCustom.tag1));
        }
        if (!TextUtils.isEmpty(pushMessageCustom.tag2)) {
            this.userTagList.add(new Tag("", pushMessageCustom.tag2));
        }
        if (!TextUtils.isEmpty(pushMessageCustom.tag3)) {
            this.userTagList.add(new Tag("", pushMessageCustom.tag3));
        }
        String str = pushMessage.intent;
        this.isGreet = pushMessageCustom.isGreet;
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str) {
                case "quickchat.speed-push":
                    this.isSpeedMatch = true;
                    break;
                case "quickchat.bell":
                    this.isBell = true;
                    break;
                case "voicechat.broadcast":
                    this.isAudioBroadcast = true;
                    break;
                case "quickchat.oneside":
                    String str2 = pushMessageCustom.stage;
                    this.stage = str2;
                    this.isGreet = TextUtils.equals(str2, Answer.TYPE);
                    this.biz = pushMessageCustom.biz;
                    this.oneside = true;
                    break;
            }
        }
        this.tracker = pushMessageCustom.tracker;
        this.matchTopic = pushMessageCustom.matchTopic;
        this.createTime = pzi0.m174454o();
        this.radioType = pushMessageCustom.radioType;
        this.rsStateReceiverToSender = pushMessageCustom.rsStateReceiverToSender;
        this.isMaleQuickChatRing = TextUtils.equals(pushMessageCustom.bellType, "male");
        this.fitReason = pushMessageCustom.fitReason;
        this.zodiacFitPercent = pushMessageCustom.zodiacFitPercent;
        this.friendPurpose = pushMessageCustom.friendPurpose;
    }

    public void transDataFromUser(User user) {
        this.action = "";
        this.avatarUrl = user.m61308fp().profileMiddle().formatted();
        this.gender = user.gender.name();
        this.age = user.age.toString();
        this.name = user.name;
        this.userId = user.f56859id;
        this.userTagList = new ArrayList<>();
        this.createTime = pzi0.m174454o();
        this.radioType = "";
        this.user = user;
        this.distance = user.location.distance;
    }
}
