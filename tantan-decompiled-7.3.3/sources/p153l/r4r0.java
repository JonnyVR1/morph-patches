package p153l;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class r4r0 {

    /* JADX INFO: renamed from: a */
    private final int f161236a;

    /* JADX INFO: renamed from: b */
    private String f161237b;

    /* JADX INFO: renamed from: c */
    private JSONObject f161238c;

    /* JADX INFO: renamed from: d */
    private byte[] f161239d;

    public r4r0(int i, Throwable th) {
        this.f161236a = i;
        if (th != null) {
            this.f161237b = th.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m179816a() {
        return this.f161236a != 207;
    }

    /* JADX INFO: renamed from: b */
    public byte[] m179817b() {
        return this.f161239d;
    }

    public r4r0(int i, String str) {
        this.f161236a = i;
        this.f161237b = str;
    }

    public r4r0(int i) {
        this.f161236a = i;
    }

    public r4r0(int i, JSONObject jSONObject) {
        this.f161236a = i;
        this.f161238c = jSONObject;
    }

    public r4r0(int i, byte[] bArr) {
        this.f161236a = i;
        this.f161239d = bArr;
    }
}
