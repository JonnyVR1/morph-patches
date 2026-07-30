package com.p046p1.mobile.putong.live.base.apibean;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.data.LocationInvisibleField;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class IntlVoiceLiveActivitiesCellBean extends BaseLiveBean {

    @SerializedName("activities")
    private List<RelationUser> activities;

    @SerializedName(LocationInvisibleField.updatedTime)
    private long updatedTime;

    public static class RelationUser implements Serializable {

        @SerializedName("userAvatar")
        private String userAvatar;

        @SerializedName("userId")
        private String userId;

        @SerializedName("userName")
        private String userName;

        @SerializedName("voiceLiveId")
        private String voiceLiveId;

        @SerializedName("voiceLiveMode")
        private String voiceLiveMode;

        @SerializedName("voiceRoomId")
        private String voiceRoomId;

        public String getLiveMode() {
            return TextUtils.isEmpty(this.voiceLiveMode) ? "" : this.voiceLiveMode;
        }

        public String getUserAvatar() {
            return TextUtils.isEmpty(this.userAvatar) ? "" : this.userAvatar;
        }

        public String getUserId() {
            return TextUtils.isEmpty(this.userId) ? "" : this.userId;
        }

        public String getUserName() {
            return TextUtils.isEmpty(this.userName) ? "" : this.userName;
        }

        public String getVoiceLiveId() {
            return this.voiceLiveId;
        }

        public String getVoiceRoomId() {
            return TextUtils.isEmpty(this.voiceRoomId) ? "" : this.voiceRoomId;
        }

        public void setLiveMode(String str) {
            this.voiceLiveMode = str;
        }

        public void setUserAvatar(String str) {
            this.userAvatar = str;
        }

        public void setUserId(String str) {
            this.userId = str;
        }

        public void setUserName(String str) {
            this.userName = str;
        }

        public void setVoiceLiveId(String str) {
            this.voiceLiveId = str;
        }

        public void setVoiceRoomId(String str) {
            this.voiceRoomId = str;
        }
    }

    public List<RelationUser> getActivities() {
        return this.activities;
    }

    public long getUpdatedTime() {
        return this.updatedTime;
    }

    public void setActivities(List<RelationUser> list) {
        this.activities = list;
    }

    public void setUpdatedTime(long j) {
        this.updatedTime = j;
    }
}
