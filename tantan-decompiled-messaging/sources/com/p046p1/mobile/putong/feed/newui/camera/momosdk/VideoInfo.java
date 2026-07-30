package com.p046p1.mobile.putong.feed.newui.camera.momosdk;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.IntRange;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class VideoInfo implements Parcelable {
    public static final Parcelable.Creator<VideoInfo> CREATOR = new C11163a();
    public String activityId;
    public long advancedMaxDuration;
    public String alertToast;
    public boolean autoMusic;
    public int beautyLevel;
    public int bigEyeAndThinLevel;
    public boolean blockBusiness;
    public boolean canChangeTopic;
    public int checkedTopicIndex;
    public String chooseMediaTips;
    public int choseDelayTime;
    public long defaultMaxDuration;
    public Bundle extraBundle;
    public String filterKeyId;
    public int flashMode;
    public int fromState;
    public boolean gifEnable;
    public String gotoActivityName;
    public boolean hasMusic;
    public boolean hasOriginalSound;
    public String initFaceClassId;
    public String initTopicId;
    public boolean isFragment;
    public boolean isFromDigimonRecorder;
    public boolean isFromSameFilm;
    public boolean isNineToSixteen;
    public boolean isSameMusic;
    public int longLegsLevel;
    public long lowerVideoCompressDuration;
    public long maxDuration;
    public int mediaType;
    public long minDuration;
    public MusicContent musicContent;
    public boolean needWaterMask;

    @Deprecated
    public String onlineMusics;
    public boolean onlyAlbum;
    public boolean onlyImage;
    public boolean onlyVideo;
    public boolean originalCovers;
    public int originalMode;
    public List<Photo> preSelectedMedias;
    public String recordFrom;
    public boolean saveToGallery;
    public String selectFaceId;
    public String sendText;
    public int shootMode;
    public boolean showMonster;
    public boolean showTopic;
    public int slimmingLevel;

    @IntRange(from = 0, to = 4)
    public int speedIndex;
    public long upperVideoCompressBitRate;
    public long upperVideoCompressDuration;
    public long upperVideoCompressSize;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.momosdk.VideoInfo$a */
    public class C11163a implements Parcelable.Creator<VideoInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VideoInfo createFromParcel(Parcel parcel) {
            return new VideoInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public VideoInfo[] newArray(int i) {
            return new VideoInfo[i];
        }
    }

    public VideoInfo(Parcel parcel) {
        this.fromState = -1;
        this.showTopic = true;
        this.canChangeTopic = true;
        this.onlyImage = false;
        this.onlyAlbum = false;
        this.onlyVideo = false;
        this.alertToast = null;
        this.needWaterMask = true;
        this.speedIndex = 2;
        this.saveToGallery = true;
        this.upperVideoCompressSize = 7340032L;
        this.lowerVideoCompressDuration = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
        this.upperVideoCompressDuration = Constants.ONE_MIN_IN_MILLIS;
        this.upperVideoCompressBitRate = 5242880L;
        this.blockBusiness = true;
        this.fromState = parcel.readInt();
        this.filterKeyId = parcel.readString();
        this.selectFaceId = parcel.readString();
        this.initFaceClassId = parcel.readString();
        this.isFragment = parcel.readByte() != 0;
        this.choseDelayTime = parcel.readInt();
        this.maxDuration = parcel.readLong();
        this.defaultMaxDuration = parcel.readLong();
        this.advancedMaxDuration = parcel.readLong();
        this.minDuration = parcel.readLong();
        this.checkedTopicIndex = parcel.readInt();
        this.initTopicId = parcel.readString();
        this.recordFrom = parcel.readString();
        this.autoMusic = parcel.readByte() != 0;
        this.showTopic = parcel.readByte() != 0;
        this.canChangeTopic = parcel.readByte() != 0;
        this.onlyImage = parcel.readByte() != 0;
        this.onlyVideo = parcel.readByte() != 0;
        this.onlyAlbum = parcel.readByte() != 0;
        this.alertToast = parcel.readString();
        this.needWaterMask = parcel.readByte() != 0;
        this.sendText = parcel.readString();
        this.shootMode = parcel.readInt();
        this.beautyLevel = parcel.readInt();
        this.bigEyeAndThinLevel = parcel.readInt();
        this.slimmingLevel = parcel.readInt();
        this.longLegsLevel = parcel.readInt();
        this.flashMode = parcel.readInt();
        this.gotoActivityName = parcel.readString();
        this.extraBundle = parcel.readBundle();
        this.mediaType = parcel.readInt();
        this.gifEnable = parcel.readByte() != 0;
        this.originalMode = parcel.readInt();
        this.preSelectedMedias = parcel.createTypedArrayList(Photo.CREATOR);
        this.chooseMediaTips = parcel.readString();
        this.activityId = parcel.readString();
        this.showMonster = parcel.readByte() != 0;
        this.musicContent = (MusicContent) parcel.readParcelable(MusicContent.class.getClassLoader());
        this.isNineToSixteen = parcel.readByte() != 0;
        this.originalCovers = parcel.readByte() != 0;
        this.saveToGallery = parcel.readByte() != 0;
        this.upperVideoCompressSize = parcel.readLong();
        this.lowerVideoCompressDuration = parcel.readLong();
        this.upperVideoCompressBitRate = parcel.readLong();
        this.upperVideoCompressDuration = parcel.readLong();
        this.isFromDigimonRecorder = parcel.readByte() != 0;
        this.isFromSameFilm = parcel.readByte() != 0;
        this.speedIndex = parcel.readInt();
        this.blockBusiness = parcel.readByte() != 0;
        this.hasOriginalSound = parcel.readByte() != 0;
        this.isSameMusic = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.fromState);
        parcel.writeString(this.filterKeyId);
        parcel.writeString(this.selectFaceId);
        parcel.writeString(this.initFaceClassId);
        parcel.writeByte(this.isFragment ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.choseDelayTime);
        parcel.writeLong(this.maxDuration);
        parcel.writeLong(this.defaultMaxDuration);
        parcel.writeLong(this.advancedMaxDuration);
        parcel.writeLong(this.minDuration);
        parcel.writeInt(this.checkedTopicIndex);
        parcel.writeString(this.initTopicId);
        parcel.writeString(this.recordFrom);
        parcel.writeByte(this.autoMusic ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.showTopic ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.canChangeTopic ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.onlyImage ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.onlyVideo ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.onlyAlbum ? (byte) 1 : (byte) 0);
        parcel.writeString(this.alertToast);
        parcel.writeByte(this.needWaterMask ? (byte) 1 : (byte) 0);
        parcel.writeString(this.sendText);
        parcel.writeInt(this.shootMode);
        parcel.writeInt(this.beautyLevel);
        parcel.writeInt(this.bigEyeAndThinLevel);
        parcel.writeInt(this.slimmingLevel);
        parcel.writeInt(this.longLegsLevel);
        parcel.writeInt(this.flashMode);
        parcel.writeString(this.gotoActivityName);
        parcel.writeBundle(this.extraBundle);
        parcel.writeInt(this.mediaType);
        parcel.writeByte(this.gifEnable ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.originalMode);
        parcel.writeTypedList(this.preSelectedMedias);
        parcel.writeString(this.chooseMediaTips);
        parcel.writeString(this.activityId);
        parcel.writeByte(this.showMonster ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.musicContent, 0);
        parcel.writeByte(this.isNineToSixteen ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.originalCovers ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.saveToGallery ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.upperVideoCompressSize);
        parcel.writeLong(this.lowerVideoCompressDuration);
        parcel.writeLong(this.upperVideoCompressBitRate);
        parcel.writeLong(this.upperVideoCompressDuration);
        parcel.writeByte(this.isFromDigimonRecorder ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isFromSameFilm ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.speedIndex);
        parcel.writeByte(this.blockBusiness ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.hasOriginalSound ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isSameMusic ? (byte) 1 : (byte) 0);
    }

    public VideoInfo() {
        this.fromState = -1;
        this.showTopic = true;
        this.canChangeTopic = true;
        this.onlyImage = false;
        this.onlyAlbum = false;
        this.onlyVideo = false;
        this.alertToast = null;
        this.needWaterMask = true;
        this.speedIndex = 2;
        this.saveToGallery = true;
        this.upperVideoCompressSize = 7340032L;
        this.lowerVideoCompressDuration = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
        this.upperVideoCompressDuration = Constants.ONE_MIN_IN_MILLIS;
        this.upperVideoCompressBitRate = 5242880L;
        this.blockBusiness = true;
    }
}
