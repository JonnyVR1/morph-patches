package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p149l.d860;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new C1916a();
    public final List<C1918c> events;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$a */
    public class C1916a implements Parcelable.Creator<SpliceScheduleCommand> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SpliceScheduleCommand[] newArray(int i) {
            return new SpliceScheduleCommand[i];
        }
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(C1918c.m10614d(parcel));
        }
        this.events = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static SpliceScheduleCommand m10604a(d860 d860Var) {
        int iM110279H = d860Var.m110279H();
        ArrayList arrayList = new ArrayList(iM110279H);
        for (int i = 0; i < iM110279H; i++) {
            arrayList.add(C1918c.m10615e(d860Var));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = this.events.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.events.get(i2).m10616f(parcel);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$b */
    public static final class C1917b {

        /* JADX INFO: renamed from: a */
        public final int f7938a;

        /* JADX INFO: renamed from: b */
        public final long f7939b;

        public C1917b(int i, long j) {
            this.f7938a = i;
            this.f7939b = j;
        }

        /* JADX INFO: renamed from: c */
        public static C1917b m10609c(Parcel parcel) {
            return new C1917b(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: renamed from: d */
        public final void m10610d(Parcel parcel) {
            parcel.writeInt(this.f7938a);
            parcel.writeLong(this.f7939b);
        }

        public /* synthetic */ C1917b(int i, long j, C1916a c1916a) {
            this(i, j);
        }
    }

    public SpliceScheduleCommand(List<C1918c> list) {
        this.events = Collections.unmodifiableList(list);
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, C1916a c1916a) {
        this(parcel);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$c */
    public static final class C1918c {

        /* JADX INFO: renamed from: a */
        public final long f7940a;

        /* JADX INFO: renamed from: b */
        public final boolean f7941b;

        /* JADX INFO: renamed from: c */
        public final boolean f7942c;

        /* JADX INFO: renamed from: d */
        public final boolean f7943d;

        /* JADX INFO: renamed from: e */
        public final long f7944e;

        /* JADX INFO: renamed from: f */
        public final List<C1917b> f7945f;

        /* JADX INFO: renamed from: g */
        public final boolean f7946g;

        /* JADX INFO: renamed from: h */
        public final long f7947h;

        /* JADX INFO: renamed from: i */
        public final int f7948i;

        /* JADX INFO: renamed from: j */
        public final int f7949j;

        /* JADX INFO: renamed from: k */
        public final int f7950k;

        public C1918c(Parcel parcel) {
            this.f7940a = parcel.readLong();
            this.f7941b = parcel.readByte() == 1;
            this.f7942c = parcel.readByte() == 1;
            this.f7943d = parcel.readByte() == 1;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(C1917b.m10609c(parcel));
            }
            this.f7945f = Collections.unmodifiableList(arrayList);
            this.f7944e = parcel.readLong();
            this.f7946g = parcel.readByte() == 1;
            this.f7947h = parcel.readLong();
            this.f7948i = parcel.readInt();
            this.f7949j = parcel.readInt();
            this.f7950k = parcel.readInt();
        }

        /* JADX INFO: renamed from: d */
        public static C1918c m10614d(Parcel parcel) {
            return new C1918c(parcel);
        }

        /* JADX INFO: renamed from: e */
        public static C1918c m10615e(d860 d860Var) {
            ArrayList arrayList;
            boolean z;
            boolean z2;
            long j;
            boolean z3;
            long j2;
            int i;
            int i2;
            int iM110279H;
            boolean z4;
            long jM110281J;
            long jM110281J2 = d860Var.m110281J();
            boolean z5 = true;
            if ((d860Var.m110279H() & 128) == 0) {
                z5 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z5) {
                arrayList = arrayList2;
                z = false;
                z2 = false;
                j = -9223372036854775807L;
                z3 = false;
                j2 = -9223372036854775807L;
                i = 0;
                i2 = 0;
                iM110279H = 0;
            } else {
                int iM110279H2 = d860Var.m110279H();
                boolean z6 = (iM110279H2 & 128) != 0;
                boolean z7 = (iM110279H2 & 64) != 0 ? z5 : false;
                boolean z8 = (iM110279H2 & 32) != 0 ? z5 : false;
                long jM110281J3 = z7 ? d860Var.m110281J() : -9223372036854775807L;
                if (!z7) {
                    int iM110279H3 = d860Var.m110279H();
                    ArrayList arrayList3 = new ArrayList(iM110279H3);
                    int i3 = 0;
                    while (i3 < iM110279H3) {
                        arrayList3.add(new C1917b(d860Var.m110279H(), d860Var.m110281J(), null));
                        i3++;
                        iM110279H3 = iM110279H3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long jM110279H = d860Var.m110279H();
                    boolean z9 = (128 & jM110279H) != 0;
                    jM110281J = ((((jM110279H & 1) << 32) | d860Var.m110281J()) * 1000) / 90;
                    z4 = z9;
                } else {
                    z4 = false;
                    jM110281J = -9223372036854775807L;
                }
                int iM110285N = d860Var.m110285N();
                int iM110279H4 = d860Var.m110279H();
                boolean z10 = z6;
                z3 = z4;
                z = z10;
                iM110279H = d860Var.m110279H();
                long j3 = jM110281J3;
                i = iM110285N;
                i2 = iM110279H4;
                long j4 = jM110281J;
                arrayList = arrayList2;
                z2 = z7;
                j = j3;
                j2 = j4;
            }
            return new C1918c(jM110281J2, z5, z, z2, arrayList, j, z3, j2, i, i2, iM110279H);
        }

        /* JADX INFO: renamed from: f */
        public final void m10616f(Parcel parcel) {
            parcel.writeLong(this.f7940a);
            parcel.writeByte(this.f7941b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f7942c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f7943d ? (byte) 1 : (byte) 0);
            int size = this.f7945f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.f7945f.get(i).m10610d(parcel);
            }
            parcel.writeLong(this.f7944e);
            parcel.writeByte(this.f7946g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f7947h);
            parcel.writeInt(this.f7948i);
            parcel.writeInt(this.f7949j);
            parcel.writeInt(this.f7950k);
        }

        public C1918c(long j, boolean z, boolean z2, boolean z3, List<C1917b> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f7940a = j;
            this.f7941b = z;
            this.f7942c = z2;
            this.f7943d = z3;
            this.f7945f = Collections.unmodifiableList(list);
            this.f7944e = j2;
            this.f7946g = z4;
            this.f7947h = j3;
            this.f7948i = i;
            this.f7949j = i2;
            this.f7950k = i3;
        }
    }
}
