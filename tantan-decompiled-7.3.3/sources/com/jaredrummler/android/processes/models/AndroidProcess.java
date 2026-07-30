package com.jaredrummler.android.processes.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class AndroidProcess implements Parcelable {
    public static final Parcelable.Creator<AndroidProcess> CREATOR = new C4144a();
    public final String name;
    public final int pid;

    /* JADX INFO: renamed from: com.jaredrummler.android.processes.models.AndroidProcess$a */
    public static class C4144a implements Parcelable.Creator<AndroidProcess> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AndroidProcess createFromParcel(Parcel parcel) {
            return new AndroidProcess(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AndroidProcess[] newArray(int i) {
            return new AndroidProcess[i];
        }
    }

    public AndroidProcess(Parcel parcel) {
        this.name = parcel.readString();
        this.pid = parcel.readInt();
    }

    /* JADX INFO: renamed from: b */
    public static String m20589b(int i) throws IOException {
        String strTrim;
        try {
            strTrim = ProcFile.readFile(String.format("/proc/%d/cmdline", Integer.valueOf(i))).trim();
        } catch (IOException unused) {
            strTrim = null;
        }
        return TextUtils.isEmpty(strTrim) ? Stat.get(i).getComm() : strTrim;
    }

    /* JADX INFO: renamed from: a */
    public Cgroup m20590a() throws IOException {
        return Cgroup.get(this.pid);
    }

    /* JADX INFO: renamed from: c */
    public Stat m20591c() throws IOException {
        return Stat.get(this.pid);
    }

    /* JADX INFO: renamed from: d */
    public Status m20592d() throws IOException {
        return Status.get(this.pid);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeInt(this.pid);
    }

    public AndroidProcess(int i) throws IOException {
        this.pid = i;
        this.name = m20589b(i);
    }
}
