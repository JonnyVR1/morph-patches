package com.p051p1.mobile.putong.newui.camera.momosdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class MusicContent implements Parcelable, Serializable {
    public static final Parcelable.Creator<MusicContent> CREATOR = new C13227a();
    public static final int TYPE_FILE = 3;
    public static final int TYPE_TEMP_FILE = 2;
    public static final int TYPE_URI = 1;
    public static final String UNKNOWN_STRING = "未知";

    @Expose
    public String album;

    @Expose
    public String artist;

    @Expose
    public int endMillTime;

    /* JADX INFO: renamed from: id */
    @Expose
    public String f54827id;
    public boolean isFromSameFilm;

    @Expose
    public int length;

    @Expose
    public String musicType;

    @Expose
    public String name;

    @Expose
    public String path;

    @Expose
    public long size;

    @Expose
    public String source;

    @Expose
    public int startMillTime;

    @Expose
    public int state;

    @Expose
    public int type;

    @Expose
    public long updatetime;

    @Expose
    public String uri;

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.camera.momosdk.MusicContent$a */
    public class C13227a implements Parcelable.Creator<MusicContent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MusicContent createFromParcel(Parcel parcel) {
            return new MusicContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MusicContent[] newArray(int i) {
            return new MusicContent[i];
        }
    }

    public MusicContent(Parcel parcel) {
        this.size = 0L;
        this.type = 0;
        this.startMillTime = 0;
        this.endMillTime = 0;
        this.state = -1;
        this.isFromSameFilm = false;
        this.updatetime = 0L;
        this.f54827id = parcel.readString();
        this.size = parcel.readLong();
        this.type = parcel.readInt();
        this.name = parcel.readString();
        this.uri = parcel.readString();
        this.path = parcel.readString();
        this.length = parcel.readInt();
        this.album = parcel.readString();
        this.artist = parcel.readString();
        this.startMillTime = parcel.readInt();
        this.endMillTime = parcel.readInt();
        this.musicType = parcel.readString();
        this.source = parcel.readString();
        this.isFromSameFilm = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAlbum() {
        return this.album;
    }

    public String getArtist() {
        return this.artist;
    }

    public String getId() {
        return this.f54827id;
    }

    public int getLength() {
        return this.length;
    }

    public String getMusicType() {
        return this.musicType;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public long getSize() {
        return this.size;
    }

    public String getSource() {
        return this.source;
    }

    public int getState() {
        return this.state;
    }

    public long getUpdatetime() {
        return this.updatetime;
    }

    public String getUri() {
        return this.uri;
    }

    public boolean isCroped() {
        return this.length > this.endMillTime - this.startMillTime;
    }

    public boolean isDeepEquals(MusicContent musicContent) {
        String str;
        return musicContent != null && (str = this.path) != null && str.equals(musicContent.path) && this.startMillTime == musicContent.startMillTime && this.endMillTime == musicContent.endMillTime;
    }

    public boolean isFile() {
        return this.type == 3;
    }

    public boolean isMusicEquals(MusicContent musicContent) {
        String str;
        return (musicContent == null || (str = this.path) == null || !str.equals(musicContent.path)) ? false : true;
    }

    public boolean isMusicUriEquals(MusicContent musicContent) {
        String str;
        return (musicContent == null || (str = this.uri) == null || !str.equals(musicContent.uri)) ? false : true;
    }

    public boolean isRemote() {
        return this.type == 1;
    }

    public boolean isTemp() {
        return this.type == 2 && this.path != null;
    }

    public void resetState() {
        this.state = -1;
    }

    public void setAlbum(String str) {
        this.album = str;
    }

    public void setArtist(String str) {
        this.artist = str;
    }

    public void setData(MusicContent musicContent) {
        this.f54827id = musicContent.f54827id;
        this.size = musicContent.size;
        this.type = musicContent.type;
        this.name = musicContent.name;
        this.uri = musicContent.uri;
        this.path = musicContent.path;
        this.length = musicContent.length;
        this.album = musicContent.album;
        this.artist = musicContent.artist;
        this.startMillTime = musicContent.startMillTime;
        this.endMillTime = musicContent.endMillTime;
        this.musicType = musicContent.musicType;
        this.source = musicContent.source;
        this.isFromSameFilm = musicContent.isFromSameFilm;
    }

    public void setId(String str) {
        this.f54827id = str;
    }

    public void setLength(int i) {
        this.length = i;
    }

    public void setMusicType(String str) {
        this.musicType = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setState(int i) {
        this.state = i;
    }

    public void setUpdatetime(long j) {
        this.updatetime = j;
    }

    public void setUri(String str) {
        this.uri = str;
        if (TextUtils.isEmpty(str) || !str.startsWith("http")) {
            return;
        }
        this.type = 1;
    }

    public String toString() {
        return "MusicContent{id='" + this.f54827id + "', size=" + this.size + ", type=" + this.type + ", name='" + this.name + "', uri='" + this.uri + "', path='" + this.path + "', length=" + this.length + ", album='" + this.album + "', artist='" + this.artist + "', startMillTime=" + this.startMillTime + ", endMillTime=" + this.endMillTime + ", musicType=" + this.musicType + ", source=" + this.source + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f54827id);
        parcel.writeLong(this.size);
        parcel.writeInt(this.type);
        parcel.writeString(this.name);
        parcel.writeString(this.uri);
        parcel.writeString(this.path);
        parcel.writeInt(this.length);
        parcel.writeString(this.album);
        parcel.writeString(this.artist);
        parcel.writeInt(this.startMillTime);
        parcel.writeInt(this.endMillTime);
        parcel.writeString(this.musicType);
        parcel.writeString(this.source);
        parcel.writeByte(this.isFromSameFilm ? (byte) 1 : (byte) 0);
    }

    public void setData(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f54827id = jSONObject.optString("music_id", null);
            this.name = jSONObject.optString("title");
            setUri(jSONObject.optString("url"));
            this.musicType = jSONObject.optString("type");
            this.source = jSONObject.optString("source");
        }
    }

    public MusicContent() {
        this.size = 0L;
        this.type = 0;
        this.startMillTime = 0;
        this.endMillTime = 0;
        this.state = -1;
        this.isFromSameFilm = false;
        this.updatetime = 0L;
    }

    public MusicContent(MusicContent musicContent) {
        this.size = 0L;
        this.type = 0;
        this.startMillTime = 0;
        this.endMillTime = 0;
        this.state = -1;
        this.isFromSameFilm = false;
        this.updatetime = 0L;
        setData(musicContent);
    }

    public MusicContent(JSONObject jSONObject) {
        this.size = 0L;
        this.type = 0;
        this.startMillTime = 0;
        this.endMillTime = 0;
        this.state = -1;
        this.isFromSameFilm = false;
        this.updatetime = 0L;
        setData(jSONObject);
    }
}
