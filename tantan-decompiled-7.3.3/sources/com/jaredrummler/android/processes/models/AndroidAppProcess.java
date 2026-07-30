package com.jaredrummler.android.processes.models;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.io.IOException;
import p153l.co0;

/* JADX INFO: loaded from: classes7.dex */
public class AndroidAppProcess extends AndroidProcess {
    private static final String ANDROID_PROCESS_NAME_REGEX = "^([\\p{L}]{1}[\\p{L}\\p{N}_]*[\\.:])*[\\p{L}][\\p{L}\\p{N}_]*$";
    public final boolean foreground;
    public final int uid;
    private static final boolean SYS_SUPPORTS_SCHEDGROUPS = new File("/dev/cpuctl/tasks").exists();
    public static final Parcelable.Creator<AndroidAppProcess> CREATOR = new C4143a();

    public static final class NotAndroidAppProcessException extends Exception {
        public NotAndroidAppProcessException(int i) {
            super(String.format("The process %d does not belong to any application", Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: com.jaredrummler.android.processes.models.AndroidAppProcess$a */
    public static class C4143a implements Parcelable.Creator<AndroidAppProcess> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AndroidAppProcess createFromParcel(Parcel parcel) {
            return new AndroidAppProcess(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AndroidAppProcess[] newArray(int i) {
            return new AndroidAppProcess[i];
        }
    }

    public AndroidAppProcess(int i) throws IOException, NotAndroidAppProcessException {
        boolean z;
        int uid;
        super(i);
        String str = this.name;
        if (str == null || !str.matches(ANDROID_PROCESS_NAME_REGEX) || !new File("/data/data", m20586f()).exists()) {
            throw new NotAndroidAppProcessException(i);
        }
        if (SYS_SUPPORTS_SCHEDGROUPS) {
            Cgroup cgroupM20590a = m20590a();
            ControlGroup group = cgroupM20590a.getGroup("cpuacct");
            ControlGroup group2 = cgroupM20590a.getGroup("cpu");
            if (group2 == null || group == null || !group.group.contains("pid_")) {
                throw new NotAndroidAppProcessException(i);
            }
            z = !group2.group.contains("bg_non_interactive");
            try {
                uid = Integer.parseInt(group.group.split("/")[1].replace("uid_", ""));
            } catch (Exception unused) {
                uid = m20592d().getUid();
            }
            co0.m111561b("name=%s, pid=%d, uid=%d, foreground=%b, cpuacct=%s, cpu=%s", this.name, Integer.valueOf(i), Integer.valueOf(uid), Boolean.valueOf(z), group.toString(), group2.toString());
        } else {
            Stat statM20591c = m20591c();
            Status statusM20592d = m20592d();
            boolean z2 = statM20591c.policy() == 0;
            int uid2 = statusM20592d.getUid();
            co0.m111561b("name=%s, pid=%d, uid=%d foreground=%b", this.name, Integer.valueOf(i), Integer.valueOf(uid2), Boolean.valueOf(z2));
            z = z2;
            uid = uid2;
        }
        this.foreground = z;
        this.uid = uid;
    }

    /* JADX INFO: renamed from: e */
    public PackageInfo m20585e(Context context, int i) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(m20586f(), i);
    }

    /* JADX INFO: renamed from: f */
    public String m20586f() {
        return this.name.split(":")[0];
    }

    @Override // com.jaredrummler.android.processes.models.AndroidProcess, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.foreground ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.uid);
    }

    public AndroidAppProcess(Parcel parcel) {
        super(parcel);
        this.foreground = parcel.readByte() != 0;
        this.uid = parcel.readInt();
    }
}
