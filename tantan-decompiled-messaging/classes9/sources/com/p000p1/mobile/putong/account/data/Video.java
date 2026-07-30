package com.p000p1.mobile.putong.account.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class Video implements Parcelable {
    public static final Parcelable.Creator<Video> CREATOR = new Parcelable.Creator<Video>() { // from class: com.p1.mobile.putong.account.data.Video.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Video createFromParcel(Parcel parcel) {
            return new Video(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Video[] newArray(int i) {
            return new Video[i];
        }
    };

    @Expose
    public boolean advancedRecordingVideo;

    @Expose
    public int avgBitrate;

    @Expose
    public int cameraFPS;

    @Expose
    public float frameRate;

    @Expose
    public int height;

    /* JADX INFO: renamed from: id */
    @Expose
    private int f335id;

    @Expose
    public boolean isAcrossScreen;

    @Expose
    public boolean isCQ;

    @Expose
    public boolean isChosenFromLocal;

    @Expose
    public boolean isCut;

    @Expose
    public boolean isFrontCamera;

    @Expose
    public long length;

    @Expose
    public String name;

    @Expose
    public long originSize;

    @Expose
    public int osPercent;

    @Expose
    public String path;

    @Expose
    public MusicContent playingMusic;

    @Expose
    public int psPercent;

    @Expose
    public int renderFPS;

    @Expose
    public int resolution;

    @Expose
    public int resolutionGpu;

    @Expose
    public int resolutionStrategy;

    @Expose
    public int rotate;

    @Expose
    public int size;

    @Expose
    public int soundPitchMode;

    @Expose
    public String thumb;

    @Expose
    public String videoId;

    @Expose
    public int width;

    public Video(Parcel parcel) {
        this.isFrontCamera = false;
        this.isChosenFromLocal = false;
        this.osPercent = 0;
        this.psPercent = 0;
        this.isAcrossScreen = false;
        this.advancedRecordingVideo = true;
        this.isCut = false;
        this.soundPitchMode = 0;
        this.originSize = 0L;
        this.isCQ = true;
        this.f335id = parcel.readInt();
        this.videoId = parcel.readString();
        this.rotate = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.size = parcel.readInt();
        this.avgBitrate = parcel.readInt();
        this.length = parcel.readLong();
        this.path = parcel.readString();
        this.name = parcel.readString();
        this.thumb = parcel.readString();
        this.isFrontCamera = parcel.readByte() != 0;
        this.isChosenFromLocal = parcel.readByte() != 0;
        this.playingMusic = parcel.readParcelable(MusicContent.class.getClassLoader());
        this.osPercent = parcel.readInt();
        this.psPercent = parcel.readInt();
        this.frameRate = parcel.readFloat();
        this.isAcrossScreen = parcel.readByte() != 0;
        this.cameraFPS = parcel.readInt();
        this.renderFPS = parcel.readInt();
        this.resolutionStrategy = parcel.readInt();
        this.resolution = parcel.readInt();
        this.resolutionGpu = parcel.readInt();
        this.advancedRecordingVideo = parcel.readByte() != 0;
        this.isCut = parcel.readByte() != 0;
        this.soundPitchMode = parcel.readInt();
        this.originSize = parcel.readLong();
        this.isCQ = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Video) {
            return !TextUtils.isEmpty(this.path) && this.path.equals(((Video) obj).path);
        }
        return false;
    }

    public int getId() {
        return this.f335id;
    }

    public String getImageUrl() {
        return MediaStore.Video.Media.EXTERNAL_CONTENT_URI + "/" + this.f335id;
    }

    public boolean hasMusic() {
        MusicContent musicContent = this.playingMusic;
        return (musicContent == null || TextUtils.isEmpty(musicContent.path)) ? false : true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f335id);
        parcel.writeString(this.videoId);
        parcel.writeInt(this.rotate);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.size);
        parcel.writeInt(this.avgBitrate);
        parcel.writeLong(this.length);
        parcel.writeString(this.path);
        parcel.writeString(this.name);
        parcel.writeString(this.thumb);
        parcel.writeByte(this.isFrontCamera ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isChosenFromLocal ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.playingMusic, i);
        parcel.writeInt(this.osPercent);
        parcel.writeInt(this.psPercent);
        parcel.writeFloat(this.frameRate);
        parcel.writeByte(this.isAcrossScreen ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.cameraFPS);
        parcel.writeInt(this.renderFPS);
        parcel.writeInt(this.resolutionStrategy);
        parcel.writeInt(this.resolution);
        parcel.writeInt(this.resolutionGpu);
        parcel.writeByte(this.advancedRecordingVideo ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isCut ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.soundPitchMode);
        parcel.writeLong(this.originSize);
        parcel.writeByte(this.isCQ ? (byte) 1 : (byte) 0);
    }

    public Video(String str) {
        this.isFrontCamera = false;
        this.isChosenFromLocal = false;
        this.osPercent = 0;
        this.psPercent = 0;
        this.isAcrossScreen = false;
        this.advancedRecordingVideo = true;
        this.isCut = false;
        this.soundPitchMode = 0;
        this.originSize = 0L;
        this.isCQ = true;
        this.f335id = -1;
        this.path = str;
    }

    public Video(int i, String str) {
        this.isFrontCamera = false;
        this.isChosenFromLocal = false;
        this.osPercent = 0;
        this.psPercent = 0;
        this.isAcrossScreen = false;
        this.advancedRecordingVideo = true;
        this.isCut = false;
        this.soundPitchMode = 0;
        this.originSize = 0L;
        this.isCQ = true;
        this.f335id = i;
        this.path = str;
    }

    public Video() {
        this.isFrontCamera = false;
        this.isChosenFromLocal = false;
        this.osPercent = 0;
        this.psPercent = 0;
        this.isAcrossScreen = false;
        this.advancedRecordingVideo = true;
        this.isCut = false;
        this.soundPitchMode = 0;
        this.originSize = 0L;
        this.isCQ = true;
    }
}
