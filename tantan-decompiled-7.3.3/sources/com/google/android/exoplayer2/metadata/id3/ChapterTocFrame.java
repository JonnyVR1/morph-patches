package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p153l.bmk0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new C1922a();

    /* JADX INFO: renamed from: ID */
    public static final String f7965ID = "CTOC";
    public final String[] children;
    public final String elementId;
    public final boolean isOrdered;
    public final boolean isRoot;
    private final Id3Frame[] subFrames;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.ChapterTocFrame$a */
    public class C1922a implements Parcelable.Creator<ChapterTocFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ChapterTocFrame[] newArray(int i) {
            return new ChapterTocFrame[i];
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super(f7965ID);
        this.elementId = (String) bmk0.m105144j(parcel.readString());
        this.isRoot = parcel.readByte() != 0;
        this.isOrdered = parcel.readByte() != 0;
        this.children = (String[]) bmk0.m105144j(parcel.createStringArray());
        int i = parcel.readInt();
        this.subFrames = new Id3Frame[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.subFrames[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ChapterTocFrame.class == obj.getClass()) {
            ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
            if (this.isRoot == chapterTocFrame.isRoot && this.isOrdered == chapterTocFrame.isOrdered && bmk0.m105123c(this.elementId, chapterTocFrame.elementId) && Arrays.equals(this.children, chapterTocFrame.children) && Arrays.equals(this.subFrames, chapterTocFrame.subFrames)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (((527 + (this.isRoot ? 1 : 0)) * 31) + (this.isOrdered ? 1 : 0)) * 31;
        String str = this.elementId;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.elementId);
        parcel.writeByte(this.isRoot ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isOrdered ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.children);
        parcel.writeInt(this.subFrames.length);
        for (Id3Frame id3Frame : this.subFrames) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super(f7965ID);
        this.elementId = str;
        this.isRoot = z;
        this.isOrdered = z2;
        this.children = strArr;
        this.subFrames = id3FrameArr;
    }
}
