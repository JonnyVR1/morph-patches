package p149l;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class lvq0 {

    /* JADX INFO: renamed from: a */
    private final int f130185a;

    /* JADX INFO: renamed from: b */
    private String f130186b;

    /* JADX INFO: renamed from: c */
    private JSONObject f130187c;

    /* JADX INFO: renamed from: d */
    private byte[] f130188d;

    public lvq0(int i, Throwable th) {
        this.f130185a = i;
        if (th != null) {
            this.f130186b = th.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m151903a() {
        return this.f130185a != 207;
    }

    /* JADX INFO: renamed from: b */
    public byte[] m151904b() {
        return this.f130188d;
    }

    public lvq0(int i, String str) {
        this.f130185a = i;
        this.f130186b = str;
    }

    public lvq0(int i) {
        this.f130185a = i;
    }

    public lvq0(int i, JSONObject jSONObject) {
        this.f130185a = i;
        this.f130187c = jSONObject;
    }

    public lvq0(int i, byte[] bArr) {
        this.f130185a = i;
        this.f130188d = bArr;
    }
}
