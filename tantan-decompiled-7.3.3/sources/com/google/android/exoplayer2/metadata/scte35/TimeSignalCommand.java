package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import p153l.h0j0;
import p153l.ig60;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new C1942a();
    public final long playbackPositionUs;
    public final long ptsTime;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand$a */
    public class C1942a implements Parcelable.Creator<TimeSignalCommand> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeSignalCommand[] newArray(int i) {
            return new TimeSignalCommand[i];
        }
    }

    public TimeSignalCommand(long j, long j2) {
        this.ptsTime = j;
        this.playbackPositionUs = j2;
    }

    /* JADX INFO: renamed from: a */
    public static TimeSignalCommand m10671a(ig60 ig60Var, long j, h0j0 h0j0Var) {
        long jM10672b = m10672b(ig60Var, j);
        return new TimeSignalCommand(jM10672b, h0j0Var.m133174b(jM10672b));
    }

    /* JADX INFO: renamed from: b */
    public static long m10672b(ig60 ig60Var, long j) {
        long jM139795H = ig60Var.m139795H();
        if ((128 & jM139795H) != 0) {
            return 8589934591L & ((((jM139795H & 1) << 32) | ig60Var.m139797J()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.metadata.scte35.SpliceCommand
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.ptsTime + ", playbackPositionUs= " + this.playbackPositionUs + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.ptsTime);
        parcel.writeLong(this.playbackPositionUs);
    }

    public /* synthetic */ TimeSignalCommand(long j, long j2, C1942a c1942a) {
        this(j, j2);
    }
}
