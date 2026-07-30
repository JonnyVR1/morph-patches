package com.jaredrummler.android.processes.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class ProcFile extends File implements Parcelable {
    public static final Parcelable.Creator<ProcFile> CREATOR = new C3996a();
    public final String content;

    /* JADX INFO: renamed from: com.jaredrummler.android.processes.models.ProcFile$a */
    public static class C3996a implements Parcelable.Creator<ProcFile> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ProcFile createFromParcel(Parcel parcel) {
            return new ProcFile(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ProcFile[] newArray(int i) {
            return new ProcFile[i];
        }
    }

    public ProcFile(Parcel parcel) {
        super(parcel.readString());
        this.content = parcel.readString();
    }

    public static String readFile(String str) throws Throwable {
        BufferedReader bufferedReader = null;
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
            try {
                String str2 = "";
                for (String line = bufferedReader2.readLine(); line != null; line = bufferedReader2.readLine()) {
                    sb.append(str2);
                    sb.append(line);
                    str2 = SignParameters.NEW_LINE;
                }
                String string = sb.toString();
                try {
                    bufferedReader2.close();
                } catch (IOException unused) {
                }
                return string;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.io.File
    public long length() {
        return this.content.length();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getAbsolutePath());
        parcel.writeString(this.content);
    }

    public ProcFile(String str) throws IOException {
        super(str);
        this.content = readFile(str);
    }
}
