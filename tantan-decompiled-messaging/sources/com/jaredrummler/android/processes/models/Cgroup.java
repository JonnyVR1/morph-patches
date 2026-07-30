package com.jaredrummler.android.processes.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class Cgroup extends ProcFile {
    public static final Parcelable.Creator<Cgroup> CREATOR = new C3994a();
    public final ArrayList<ControlGroup> groups;

    /* JADX INFO: renamed from: com.jaredrummler.android.processes.models.Cgroup$a */
    public static class C3994a implements Parcelable.Creator<Cgroup> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cgroup createFromParcel(Parcel parcel) {
            return new Cgroup(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Cgroup[] newArray(int i) {
            return new Cgroup[i];
        }
    }

    private Cgroup(String str) throws IOException {
        super(str);
        String[] strArrSplit = this.content.split(SignParameters.NEW_LINE);
        this.groups = new ArrayList<>();
        for (String str2 : strArrSplit) {
            try {
                this.groups.add(new ControlGroup(str2));
            } catch (Exception unused) {
            }
        }
    }

    public static Cgroup get(int i) throws IOException {
        return new Cgroup(String.format("/proc/%d/cgroup", Integer.valueOf(i)));
    }

    public ControlGroup getGroup(String str) {
        for (ControlGroup controlGroup : this.groups) {
            for (String str2 : controlGroup.subsystems.split(Constants.SEPARATOR_COMMA)) {
                if (str2.equals(str)) {
                    return controlGroup;
                }
            }
        }
        return null;
    }

    @Override // com.jaredrummler.android.processes.models.ProcFile, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.groups);
    }

    public /* synthetic */ Cgroup(Parcel parcel, C3994a c3994a) {
        this(parcel);
    }

    private Cgroup(Parcel parcel) {
        super(parcel);
        this.groups = parcel.createTypedArrayList(ControlGroup.CREATOR);
    }
}
