package com.jaredrummler.android.processes.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class Status extends ProcFile {
    public static final Parcelable.Creator<Status> CREATOR = new C4150a();

    /* JADX INFO: renamed from: com.jaredrummler.android.processes.models.Status$a */
    public static class C4150a implements Parcelable.Creator<Status> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Status createFromParcel(Parcel parcel) {
            return new Status(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Status[] newArray(int i) {
            return new Status[i];
        }
    }

    public /* synthetic */ Status(Parcel parcel, C4150a c4150a) {
        this(parcel);
    }

    public static Status get(int i) throws IOException {
        return new Status(String.format("/proc/%d/status", Integer.valueOf(i)));
    }

    public int getGid() {
        try {
            return Integer.parseInt(getValue("Gid").split("\\s+")[0]);
        } catch (Exception unused) {
            return -1;
        }
    }

    public int getUid() {
        try {
            return Integer.parseInt(getValue("Uid").split("\\s+")[0]);
        } catch (Exception unused) {
            return -1;
        }
    }

    public String getValue(String str) {
        for (String str2 : this.content.split(SignParameters.NEW_LINE)) {
            if (str2.startsWith(str + ":")) {
                return str2.split(str + ":")[1].trim();
            }
        }
        return null;
    }

    private Status(String str) throws IOException {
        super(str);
    }

    private Status(Parcel parcel) {
        super(parcel);
    }
}
