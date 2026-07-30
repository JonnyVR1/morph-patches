package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p153l.h0j0;
import p153l.ig60;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new C1936a();
    public final boolean autoReturn;
    public final int availNum;
    public final int availsExpected;
    public final long breakDurationUs;
    public final List<C1937b> componentSpliceList;
    public final boolean outOfNetworkIndicator;
    public final boolean programSpliceFlag;
    public final long programSplicePlaybackPositionUs;
    public final long programSplicePts;
    public final boolean spliceEventCancelIndicator;
    public final long spliceEventId;
    public final boolean spliceImmediateFlag;
    public final int uniqueProgramId;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$a */
    public class C1936a implements Parcelable.Creator<SpliceInsertCommand> {
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
            arrayList.add(C1937b.m10654a(parcel));
        }
        this.componentSpliceList = Collections.unmodifiableList(arrayList);
        this.autoReturn = parcel.readByte() == 1;
        this.breakDurationUs = parcel.readLong();
        this.uniqueProgramId = parcel.readInt();
        this.availNum = parcel.readInt();
        this.availsExpected = parcel.readInt();
    }

    /* JADX INFO: renamed from: a */
    public static SpliceInsertCommand m10651a(ig60 ig60Var, long j, h0j0 h0j0Var) {
        List list;
        long j2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int iM139795H;
        int iM139795H2;
        boolean z5;
        long jM139797J = ig60Var.m139797J();
        boolean z6 = (ig60Var.m139795H() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long jM139797J2 = -9223372036854775807L;
        if (z6) {
            list = list2;
            j2 = -9223372036854775807L;
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            i = 0;
            iM139795H = 0;
            iM139795H2 = 0;
        } else {
            int iM139795H3 = ig60Var.m139795H();
            boolean z7 = (iM139795H3 & 128) != 0;
            boolean z8 = (iM139795H3 & 64) != 0;
            boolean z9 = (iM139795H3 & 32) != 0;
            boolean z10 = (iM139795H3 & 16) != 0;
            long jM10672b = (!z8 || z10) ? -9223372036854775807L : TimeSignalCommand.m10672b(ig60Var, j);
            if (!z8) {
                int iM139795H4 = ig60Var.m139795H();
                ArrayList arrayList = new ArrayList(iM139795H4);
                int i2 = 0;
                while (i2 < iM139795H4) {
                    int iM139795H5 = ig60Var.m139795H();
                    long jM10672b2 = !z10 ? TimeSignalCommand.m10672b(ig60Var, j) : -9223372036854775807L;
                    arrayList.add(new C1937b(iM139795H5, jM10672b2, h0j0Var.m133174b(jM10672b2), null));
                    i2++;
                    iM139795H4 = iM139795H4;
                }
                list2 = arrayList;
            }
            if (z9) {
                long jM139795H = ig60Var.m139795H();
                boolean z11 = (128 & jM139795H) != 0;
                jM139797J2 = ((((jM139795H & 1) << 32) | ig60Var.m139797J()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
            }
            int iM139801N = ig60Var.m139801N();
            long j3 = jM10672b;
            j2 = jM139797J2;
            jM139797J2 = j3;
            iM139795H = ig60Var.m139795H();
            iM139795H2 = ig60Var.m139795H();
            i = iM139801N;
            z4 = z5;
            z = z7;
            z2 = z8;
            list = list2;
            z3 = z10;
        }
        return new SpliceInsertCommand(jM139797J, z6, z, z2, z3, jM139797J2, h0j0Var.m133174b(jM139797J2), list, z4, j2, i, iM139795H, iM139795H2);
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
            this.componentSpliceList.get(i2).m10655b(parcel);
        }
        parcel.writeByte(this.autoReturn ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.breakDurationUs);
        parcel.writeInt(this.uniqueProgramId);
        parcel.writeInt(this.availNum);
        parcel.writeInt(this.availsExpected);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$b */
    public static final class C1937b {

        /* JADX INFO: renamed from: a */
        public final int f7972a;

        /* JADX INFO: renamed from: b */
        public final long f7973b;

        /* JADX INFO: renamed from: c */
        public final long f7974c;

        public C1937b(int i, long j, long j2) {
            this.f7972a = i;
            this.f7973b = j;
            this.f7974c = j2;
        }

        /* JADX INFO: renamed from: a */
        public static C1937b m10654a(Parcel parcel) {
            return new C1937b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        /* JADX INFO: renamed from: b */
        public void m10655b(Parcel parcel) {
            parcel.writeInt(this.f7972a);
            parcel.writeLong(this.f7973b);
            parcel.writeLong(this.f7974c);
        }

        public /* synthetic */ C1937b(int i, long j, long j2, C1936a c1936a) {
            this(i, j, j2);
        }
    }

    public SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C1937b> list, boolean z5, long j4, int i, int i2, int i3) {
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

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, C1936a c1936a) {
        this(parcel);
    }
}
