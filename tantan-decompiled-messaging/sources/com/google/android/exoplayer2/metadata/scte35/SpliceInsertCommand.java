package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p149l.d860;
import p149l.eri0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new C1913a();
    public final boolean autoReturn;
    public final int availNum;
    public final int availsExpected;
    public final long breakDurationUs;
    public final List<C1914b> componentSpliceList;
    public final boolean outOfNetworkIndicator;
    public final boolean programSpliceFlag;
    public final long programSplicePlaybackPositionUs;
    public final long programSplicePts;
    public final boolean spliceEventCancelIndicator;
    public final long spliceEventId;
    public final boolean spliceImmediateFlag;
    public final int uniqueProgramId;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$a */
    public class C1913a implements Parcelable.Creator<SpliceInsertCommand> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SpliceInsertCommand[] newArray(int i) {
            return new SpliceInsertCommand[i];
        }
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.spliceEventId = parcel.readLong();
        this.spliceEventCancelIndicator = parcel.readByte() == 1;
        this.outOfNetworkIndicator = parcel.readByte() == 1;
        this.programSpliceFlag = parcel.readByte() == 1;
        this.spliceImmediateFlag = parcel.readByte() == 1;
        this.programSplicePts = parcel.readLong();
        this.programSplicePlaybackPositionUs = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(C1914b.m10600a(parcel));
        }
        this.componentSpliceList = Collections.unmodifiableList(arrayList);
        this.autoReturn = parcel.readByte() == 1;
        this.breakDurationUs = parcel.readLong();
        this.uniqueProgramId = parcel.readInt();
        this.availNum = parcel.readInt();
        this.availsExpected = parcel.readInt();
    }

    /* JADX INFO: renamed from: a */
    public static SpliceInsertCommand m10597a(d860 d860Var, long j, eri0 eri0Var) {
        List list;
        long j2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int iM110279H;
        int iM110279H2;
        boolean z5;
        long jM110281J = d860Var.m110281J();
        boolean z6 = (d860Var.m110279H() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long jM110281J2 = -9223372036854775807L;
        if (z6) {
            list = list2;
            j2 = -9223372036854775807L;
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            i = 0;
            iM110279H = 0;
            iM110279H2 = 0;
        } else {
            int iM110279H3 = d860Var.m110279H();
            boolean z7 = (iM110279H3 & 128) != 0;
            boolean z8 = (iM110279H3 & 64) != 0;
            boolean z9 = (iM110279H3 & 32) != 0;
            boolean z10 = (iM110279H3 & 16) != 0;
            long jM10618b = (!z8 || z10) ? -9223372036854775807L : TimeSignalCommand.m10618b(d860Var, j);
            if (!z8) {
                int iM110279H4 = d860Var.m110279H();
                ArrayList arrayList = new ArrayList(iM110279H4);
                int i2 = 0;
                while (i2 < iM110279H4) {
                    int iM110279H5 = d860Var.m110279H();
                    long jM10618b2 = !z10 ? TimeSignalCommand.m10618b(d860Var, j) : -9223372036854775807L;
                    arrayList.add(new C1914b(iM110279H5, jM10618b2, eri0Var.m117837b(jM10618b2), null));
                    i2++;
                    iM110279H4 = iM110279H4;
                }
                list2 = arrayList;
            }
            if (z9) {
                long jM110279H = d860Var.m110279H();
                boolean z11 = (128 & jM110279H) != 0;
                jM110281J2 = ((((jM110279H & 1) << 32) | d860Var.m110281J()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
            }
            int iM110285N = d860Var.m110285N();
            long j3 = jM10618b;
            j2 = jM110281J2;
            jM110281J2 = j3;
            iM110279H = d860Var.m110279H();
            iM110279H2 = d860Var.m110279H();
            i = iM110285N;
            z4 = z5;
            z = z7;
            z2 = z8;
            list = list2;
            z3 = z10;
        }
        return new SpliceInsertCommand(jM110281J, z6, z, z2, z3, jM110281J2, eri0Var.m117837b(jM110281J2), list, z4, j2, i, iM110279H, iM110279H2);
    }

    @Override // com.google.android.exoplayer2.metadata.scte35.SpliceCommand
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.programSplicePts + ", programSplicePlaybackPositionUs= " + this.programSplicePlaybackPositionUs + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.spliceEventId);
        parcel.writeByte(this.spliceEventCancelIndicator ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.outOfNetworkIndicator ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.programSpliceFlag ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.spliceImmediateFlag ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.programSplicePts);
        parcel.writeLong(this.programSplicePlaybackPositionUs);
        int size = this.componentSpliceList.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.componentSpliceList.get(i2).m10601b(parcel);
        }
        parcel.writeByte(this.autoReturn ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.breakDurationUs);
        parcel.writeInt(this.uniqueProgramId);
        parcel.writeInt(this.availNum);
        parcel.writeInt(this.availsExpected);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$b */
    public static final class C1914b {

        /* JADX INFO: renamed from: a */
        public final int f7935a;

        /* JADX INFO: renamed from: b */
        public final long f7936b;

        /* JADX INFO: renamed from: c */
        public final long f7937c;

        public C1914b(int i, long j, long j2) {
            this.f7935a = i;
            this.f7936b = j;
            this.f7937c = j2;
        }

        /* JADX INFO: renamed from: a */
        public static C1914b m10600a(Parcel parcel) {
            return new C1914b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        /* JADX INFO: renamed from: b */
        public void m10601b(Parcel parcel) {
            parcel.writeInt(this.f7935a);
            parcel.writeLong(this.f7936b);
            parcel.writeLong(this.f7937c);
        }

        public /* synthetic */ C1914b(int i, long j, long j2, C1913a c1913a) {
            this(i, j, j2);
        }
    }

    public SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C1914b> list, boolean z5, long j4, int i, int i2, int i3) {
        this.spliceEventId = j;
        this.spliceEventCancelIndicator = z;
        this.outOfNetworkIndicator = z2;
        this.programSpliceFlag = z3;
        this.spliceImmediateFlag = z4;
        this.programSplicePts = j2;
        this.programSplicePlaybackPositionUs = j3;
        this.componentSpliceList = Collections.unmodifiableList(list);
        this.autoReturn = z5;
        this.breakDurationUs = j4;
        this.uniqueProgramId = i;
        this.availNum = i2;
        this.availsExpected = i3;
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, C1913a c1913a) {
        this(parcel);
    }
}
