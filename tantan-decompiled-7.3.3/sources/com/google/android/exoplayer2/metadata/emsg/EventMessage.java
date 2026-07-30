package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p153l.bmk0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class EventMessage implements Metadata.Entry {

    @VisibleForTesting
    public static final String ID3_SCHEME_ID_AOM = "https://aomedia.org/emsg/ID3";
    private static final String ID3_SCHEME_ID_APPLE = "https://developer.apple.com/streaming/emsg-id3";

    @VisibleForTesting
    public static final String SCTE35_SCHEME_ID = "urn:scte:scte35:2014:bin";
    public final long durationMs;
    private int hashCode;

    /* JADX INFO: renamed from: id */
    public final long f7962id;
    public final byte[] messageData;
    public final String schemeIdUri;
    public final String value;
    private static final C1894k ID3_FORMAT = new C1894k.b().m10400g0("application/id3").m10374G();
    private static final C1894k SCTE35_FORMAT = new C1894k.b().m10400g0("application/x-scte35").m10374G();
    public static final Parcelable.Creator<EventMessage> CREATOR = new C1914a();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.emsg.EventMessage$a */
    public class C1914a implements Parcelable.Creator<EventMessage> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EventMessage[] newArray(int i) {
            return new EventMessage[i];
        }
    }

    public EventMessage(Parcel parcel) {
        this.schemeIdUri = (String) bmk0.m105144j(parcel.readString());
        this.value = (String) bmk0.m105144j(parcel.readString());
        this.durationMs = parcel.readLong();
        this.f7962id = parcel.readLong();
        this.messageData = (byte[]) bmk0.m105144j(parcel.createByteArray());
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @Nullable
    /* JADX INFO: renamed from: N */
    public C1894k mo10588N() {
        String str = this.schemeIdUri;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return SCTE35_FORMAT;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return ID3_FORMAT;
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && EventMessage.class == obj.getClass()) {
            EventMessage eventMessage = (EventMessage) obj;
            if (this.durationMs == eventMessage.durationMs && this.f7962id == eventMessage.f7962id && bmk0.m105123c(this.schemeIdUri, eventMessage.schemeIdUri) && bmk0.m105123c(this.value, eventMessage.value) && Arrays.equals(this.messageData, eventMessage.messageData)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            String str = this.schemeIdUri;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.value;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.durationMs;
            int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f7962id;
            this.hashCode = ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.messageData);
        }
        return this.hashCode;
    }

    public String toString() {
        return "EMSG: scheme=" + this.schemeIdUri + ", id=" + this.f7962id + ", durationMs=" + this.durationMs + ", value=" + this.value;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @Nullable
    /* JADX INFO: renamed from: v */
    public byte[] mo10590v() {
        if (mo10588N() != null) {
            return this.messageData;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.schemeIdUri);
        parcel.writeString(this.value);
        parcel.writeLong(this.durationMs);
        parcel.writeLong(this.f7962id);
        parcel.writeByteArray(this.messageData);
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.schemeIdUri = str;
        this.value = str2;
        this.durationMs = j;
        this.f7962id = j2;
        this.messageData = bArr;
    }
}
