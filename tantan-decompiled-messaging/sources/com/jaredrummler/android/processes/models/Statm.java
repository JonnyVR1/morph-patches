package com.jaredrummler.android.processes.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class Statm extends ProcFile {
    public static final Parcelable.Creator<Statm> CREATOR = new C3998a();
    public final String[] fields;

    /* JADX INFO: renamed from: com.jaredrummler.android.processes.models.Statm$a */
    public static class C3998a implements Parcelable.Creator<Statm> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Statm createFromParcel(Parcel parcel) {
            return new Statm(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Statm[] newArray(int i) {
            return new Statm[i];
        }
    }

    private Statm(String str) throws IOException {
        super(str);
        this.fields = this.content.split("\\s+");
    }

    public static Statm get(int i) throws IOException {
        return new Statm(String.format("/proc/%d/statm", Integer.valueOf(i)));
    }

    public long getResidentSetSize() {
        return Long.parseLong(this.fields[1]) * 1024;
    }

    public long getSize() {
        return Long.parseLong(this.fields[0]) * 1024;
    }

    @Override // com.jaredrummler.android.processes.models.ProcFile, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeStringArray(this.fields);
    }

    public /* synthetic */ Statm(Parcel parcel, C3998a c3998a) {
        this(parcel);
    }

    private Statm(Parcel parcel) {
        super(parcel);
        this.fields = parcel.createStringArray();
    }
}
