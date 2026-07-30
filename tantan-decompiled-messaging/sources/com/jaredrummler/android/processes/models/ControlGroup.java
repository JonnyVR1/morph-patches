package com.jaredrummler.android.processes.models;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class ControlGroup implements Parcelable {
    public static final Parcelable.Creator<ControlGroup> CREATOR = new C3995a();
    public final String group;

    /* JADX INFO: renamed from: id */
    public final int f14218id;
    public final String subsystems;

    /* JADX INFO: renamed from: com.jaredrummler.android.processes.models.ControlGroup$a */
    public static class C3995a implements Parcelable.Creator<ControlGroup> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ControlGroup createFromParcel(Parcel parcel) {
            return new ControlGroup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ControlGroup[] newArray(int i) {
            return new ControlGroup[i];
        }
    }

    public ControlGroup(String str) throws IndexOutOfBoundsException, NumberFormatException {
        String[] strArrSplit = str.split(":");
        this.f14218id = Integer.parseInt(strArrSplit[0]);
        this.subsystems = strArrSplit[1];
        this.group = strArrSplit[2];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format("%d:%s:%s", Integer.valueOf(this.f14218id), this.subsystems, this.group);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14218id);
        parcel.writeString(this.subsystems);
        parcel.writeString(this.group);
    }

    public ControlGroup(Parcel parcel) {
        this.f14218id = parcel.readInt();
        this.subsystems = parcel.readString();
        this.group = parcel.readString();
    }
}
