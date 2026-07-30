package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import p149l.d860;
import p149l.eri0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new C1919a();
    public final long playbackPositionUs;
    public final long ptsTime;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand$a */
    public class C1919a implements Parcelable.Creator<TimeSignalCommand> {
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
    public static TimeSignalCommand m10617a(d860 d860Var, long j, eri0 eri0Var) {
        long jM10618b = m10618b(d860Var, j);
        return new TimeSignalCommand(jM10618b, eri0Var.m117837b(jM10618b));
    }

    /* JADX INFO: renamed from: b */
    public static long m10618b(d860 d860Var, long j) {
        long jM110279H = d860Var.m110279H();
        if ((128 & jM110279H) != 0) {
            return 8589934591L & ((((jM110279H & 1) << 32) | d860Var.m110281J()) + j);
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

    public /* synthetic */ TimeSignalCommand(long j, long j2, C1919a c1919a) {
        this(j, j2);
    }
}
