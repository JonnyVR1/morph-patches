package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.C1945o;
import com.google.common.primitives.Longs;
import java.util.Arrays;
import java.util.List;
import p153l.bmk0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new C1911a();
    private final Entry[] entries;
    public final long presentationTimeUs;

    public interface Entry extends Parcelable {
        @Nullable
        /* JADX INFO: renamed from: N */
        default C1894k mo10588N() {
            return null;
        }

        /* JADX INFO: renamed from: j */
        default void mo10589j(C1945o.b bVar) {
        }

        @Nullable
        /* JADX INFO: renamed from: v */
        default byte[] mo10590v() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.Metadata$a */
    public class C1911a implements Parcelable.Creator<Metadata> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Metadata[] newArray(int i) {
            return new Metadata[i];
        }
    }

    public Metadata(Parcel parcel) {
        this.entries = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.entries;
            if (i >= entryArr.length) {
                this.presentationTimeUs = parcel.readLong();
                return;
            } else {
                entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public Metadata m10583a(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata(this.presentationTimeUs, (Entry[]) bmk0.m105092N0(this.entries, entryArr));
    }

    /* JADX INFO: renamed from: b */
    public Metadata m10584b(@Nullable Metadata metadata) {
        return metadata == null ? this : m10583a(metadata.entries);
    }

    /* JADX INFO: renamed from: c */
    public Metadata m10585c(long j) {
        return this.presentationTimeUs == j ? this : new Metadata(j, this.entries);
    }

    /* JADX INFO: renamed from: d */
    public Entry m10586d(int i) {
        return this.entries[i];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public int m10587e() {
        return this.entries.length;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Metadata.class == obj.getClass()) {
            Metadata metadata = (Metadata) obj;
            if (Arrays.equals(this.entries, metadata.entries) && this.presentationTimeUs == metadata.presentationTimeUs) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.entries) * 31) + Longs.m16529e(this.presentationTimeUs);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.entries));
        if (this.presentationTimeUs == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.presentationTimeUs;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.entries.length);
        for (Entry entry : this.entries) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.presentationTimeUs);
    }

    public Metadata(long j, Entry... entryArr) {
        this.presentationTimeUs = j;
        this.entries = entryArr;
    }

    public Metadata(List<? extends Entry> list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(long j, List<? extends Entry> list) {
        this(j, (Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(Entry... entryArr) {
        this(-9223372036854775807L, entryArr);
    }
}
