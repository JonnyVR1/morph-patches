package com.p000p1.mobile.putong.live.livingroom.common.usercard.bean;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import l.d30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class UserCardData {
    private int from;
    private String fromIdentity;
    private final String giftSource;
    private final boolean isAnchor;
    private final d30 jumpToOtherRoomClick;
    private final String liveId;
    private final long messageId;

    @Nullable
    private final BLiveMultiCall multiCall;
    private final String roomId;
    private String scene;
    private final boolean showShadow;
    private String source;

    /* JADX INFO: renamed from: to */
    private String f5436to;
    private final String trackFrom;
    private final String userId;

    public static class Builder {
        private int from;
        String fromIdentity;
        private String giftSource;
        private boolean isAnchor;
        private d30 jumpToOtherRoomClick;
        private String liveId;
        private long messageId;

        @Nullable
        private BLiveMultiCall multiCall;
        private String roomId;
        String scene;
        private boolean showShadow;
        String source;

        /* JADX INFO: renamed from: to */
        String f5437to;
        private String trackFrom;
        private String userId;

        public Builder(int i) {
            this.from = i;
        }

        public UserCardData build() {
            if (TextUtils.isEmpty(this.userId) || "0".equals(this.userId)) {
                CrashHelper.c(new Exception("UserCardData userId is null"));
            }
            return new UserCardData(this);
        }

        public Builder giftSource(String str) {
            this.giftSource = str;
            return this;
        }

        public Builder jumpToOtherRoom(String str, String str2, d30 d30Var) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                this.roomId = str2;
                this.liveId = str;
                this.jumpToOtherRoomClick = d30Var;
            }
            return this;
        }

        public Builder messageId(long j) {
            this.messageId = j;
            return this;
        }

        public Builder setFromIdentity(String str) {
            this.fromIdentity = str;
            return this;
        }

        public Builder setMultiCall(@Nullable BLiveMultiCall bLiveMultiCall) {
            this.multiCall = bLiveMultiCall;
            return this;
        }

        public Builder setScene(String str) {
            this.scene = str;
            return this;
        }

        public Builder setSource(String str) {
            this.source = str;
            return this;
        }

        public Builder setTo(String str) {
            this.f5437to = str;
            return this;
        }

        public Builder showShadow() {
            this.showShadow = true;
            return this;
        }

        public Builder trackFrom(String str) {
            this.trackFrom = str;
            return this;
        }

        public Builder userId(String str) {
            this.userId = str;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OpenUserCardDialogFrom {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OpenUserCardDialogIdentity {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OpenUserCardDialogScene {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OpenUserCardDialogSource {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OpenUserCardDialogTo {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OpenUserCardDialogTrackFrom {
    }

    public UserCardData(Builder builder) {
        this.source = builder.source;
        this.fromIdentity = builder.fromIdentity;
        this.f5436to = builder.f5437to;
        this.scene = builder.scene;
        this.userId = builder.userId;
        this.isAnchor = builder.isAnchor;
        this.showShadow = builder.showShadow;
        this.jumpToOtherRoomClick = builder.jumpToOtherRoomClick;
        this.roomId = builder.roomId;
        this.liveId = builder.liveId;
        this.trackFrom = builder.trackFrom;
        this.messageId = builder.messageId;
        this.giftSource = builder.giftSource;
        this.from = builder.from;
        this.multiCall = builder.multiCall;
    }

    public static Builder builder(int i) {
        return new Builder(i);
    }

    public int getFrom() {
        return this.from;
    }

    public String getFromIdentity() {
        return this.fromIdentity;
    }

    public String getLiveId() {
        return this.liveId;
    }

    public long getMessageId() {
        return this.messageId;
    }

    @Nullable
    public BLiveMultiCall getMultiCall() {
        return this.multiCall;
    }

    public String getScene() {
        return this.scene;
    }

    public String getSource() {
        return this.source;
    }

    public String getTo() {
        return this.f5436to;
    }

    public boolean isFromJs() {
        return TextUtils.equals(this.source, "js");
    }

    public boolean isShowShadow() {
        return this.showShadow;
    }

    public d30 jumpOtherRoomCallBack() {
        return this.jumpToOtherRoomClick;
    }

    public void setTo(String str) {
        this.f5436to = str;
    }

    public String userId() {
        return this.userId;
    }
}
