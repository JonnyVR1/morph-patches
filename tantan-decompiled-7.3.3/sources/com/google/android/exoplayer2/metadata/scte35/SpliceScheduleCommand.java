package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p153l.ig60;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new C1939a();
    public final List<C1941c> events;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$a */
    public class C1939a implements Parcelable.Creator<SpliceScheduleCommand> {
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
            arrayList.add(C1941c.m10668d(parcel));
        }
        this.events = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static SpliceScheduleCommand m10658a(ig60 ig60Var) {
        int iM139795H = ig60Var.m139795H();
        ArrayList arrayList = new ArrayList(iM139795H);
        for (int i = 0; i < iM139795H; i++) {
            arrayList.add(C1941c.m10669e(ig60Var));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = this.events.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.events.get(i2).m10670f(parcel);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$b */
    public static final class C1940b {

        /* JADX INFO: renamed from: a */
        public final int f7975a;

        /* JADX INFO: renamed from: b */
        public final long f7976b;

        public C1940b(int i, long j) {
            this.f7975a = i;
            this.f7976b = j;
        }

        /* JADX INFO: renamed from: c */
        public static C1940b m10663c(Parcel parcel) {
            return new C1940b(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: renamed from: d */
        public final void m10664d(Parcel parcel) {
            parcel.writeInt(this.f7975a);
            parcel.writeLong(this.f7976b);
        }

        public /* synthetic */ C1940b(int i, long j, C1939a c1939a) {
            this(i, j);
        }
    }

    public SpliceScheduleCommand(List<C1941c> list) {
        this.events = Collections.unmodifiableList(list);
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, C1939a c1939a) {
        this(parcel);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$c */
    public static final class C1941c {

        /* JADX INFO: renamed from: a */
        public final long f7977a;

        /* JADX INFO: renamed from: b */
        public final boolean f7978b;

        /* JADX INFO: renamed from: c */
        public final boolean f7979c;

        /* JADX INFO: renamed from: d */
        public final boolean f7980d;

        /* JADX INFO: renamed from: e */
        public final long f7981e;

        /* JADX INFO: renamed from: f */
        public final List<C1940b> f7982f;

        /* JADX INFO: renamed from: g */
        public final boolean f7983g;

        /* JADX INFO: renamed from: h */
        public final long f7984h;

        /* JADX INFO: renamed from: i */
        public final int f7985i;

        /* JADX INFO: renamed from: j */
        public final int f7986j;

        /* JADX INFO: renamed from: k */
        public final int f7987k;

        public C1941c(Parcel parcel) {
            this.f7977a = parcel.readLong();
            this.f7978b = parcel.readByte() == 1;
            this.f7979c = parcel.readByte() == 1;
            this.f7980d = parcel.readByte() == 1;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(C1940b.m10663c(parcel));
            }
            this.f7982f = Collections.unmodifiableList(arrayList);
            this.f7981e = parcel.readLong();
            this.f7983g = parcel.readByte() == 1;
            this.f7984h = parcel.readLong();
            this.f7985i = parcel.readInt();
            this.f7986j = parcel.readInt();
            this.f7987k = parcel.readInt();
        }

        /* JADX INFO: renamed from: d */
        public static C1941c m10668d(Parcel parcel) {
            return new C1941c(parcel);
        }

        /* JADX INFO: renamed from: e */
        public static C1941c m10669e(ig60 ig60Var) {
            ArrayList arrayList;
            boolean z;
            boolean z2;
            long j;
            boolean z3;
            long j2;
            int i;
            int i2;
            int iM139795H;
            boolean z4;
            long jM139797J;
            long jM139797J2 = ig60Var.m139797J();
            boolean z5 = true;
            if ((ig60Var.m139795H() & 128) == 0) {
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
                iM139795H = 0;
            } else {
                int iM139795H2 = ig60Var.m139795H();
                boolean z6 = (iM139795H2 & 128) != 0;
                boolean z7 = (iM139795H2 & 64) != 0 ? z5 : false;
                boolean z8 = (iM139795H2 & 32) != 0 ? z5 : false;
                long jM139797J3 = z7 ? ig60Var.m139797J() : -9223372036854775807L;
                if (!z7) {
                    int iM139795H3 = ig60Var.m139795H();
                    ArrayList arrayList3 = new ArrayList(iM139795H3);
                    int i3 = 0;
                    while (i3 < iM139795H3) {
                        arrayList3.add(new C1940b(ig60Var.m139795H(), ig60Var.m139797J(), null));
                        i3++;
                        iM139795H3 = iM139795H3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long jM139795H = ig60Var.m139795H();
                    boolean z9 = (128 & jM139795H) != 0;
                    jM139797J = ((((jM139795H & 1) << 32) | ig60Var.m139797J()) * 1000) / 90;
                    z4 = z9;
                } else {
                    z4 = false;
                    jM139797J = -9223372036854775807L;
                }
                int iM139801N = ig60Var.m139801N();
                int iM139795H4 = ig60Var.m139795H();
                boolean z10 = z6;
                z3 = z4;
                z = z10;
                iM139795H = ig60Var.m139795H();
                long j3 = jM139797J3;
                i = iM139801N;
                i2 = iM139795H4;
                long j4 = jM139797J;
                arrayList = arrayList2;
                z2 = z7;
                j = j3;
                j2 = j4;
            }
            return new C1941c(jM139797J2, z5, z, z2, arrayList, j, z3, j2, i, i2, iM139795H);
        }

        /* JADX INFO: renamed from: f */
        public final void m10670f(Parcel parcel) {
            parcel.writeLong(this.f7977a);
            parcel.writeByte(this.f7978b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f7979c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f7980d ? (byte) 1 : (byte) 0);
            int size = this.f7982f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.f7982f.get(i).m10664d(parcel);
            }
            parcel.writeLong(this.f7981e);
            parcel.writeByte(this.f7983g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f7984h);
            parcel.writeInt(this.f7985i);
            parcel.writeInt(this.f7986j);
            parcel.writeInt(this.f7987k);
        }

        public C1941c(long j, boolean z, boolean z2, boolean z3, List<C1940b> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f7977a = j;
            this.f7978b = z;
            this.f7979c = z2;
            this.f7980d = z3;
            this.f7982f = Collections.unmodifiableList(list);
            this.f7981e = j2;
            this.f7983g = z4;
            this.f7984h = j3;
            this.f7985i = i;
            this.f7986j = i2;
            this.f7987k = i3;
        }
    }
}
