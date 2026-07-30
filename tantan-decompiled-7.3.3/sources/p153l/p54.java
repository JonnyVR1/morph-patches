package p153l;

/* JADX INFO: loaded from: classes4.dex */
public class p54 {

    /* JADX INFO: renamed from: a */
    public final String f150592a;

    /* JADX INFO: renamed from: b */
    public String f150593b;

    /* JADX INFO: renamed from: c */
    public String f150594c;

    /* JADX INFO: renamed from: d */
    public int f150595d;

    /* JADX INFO: renamed from: e */
    public String f150596e;

    /* JADX INFO: renamed from: f */
    public String f150597f;

    /* JADX INFO: renamed from: g */
    public String f150598g;

    public p54(String str, String str2, int i) {
        this.f150592a = str;
        this.f150593b = str2;
        this.f150595d = i;
    }

    /* JADX INFO: renamed from: a */
    public static p54 m170591a() {
        return new p54("", "", 0);
    }

    /* JADX INFO: renamed from: b */
    public static p54 m170592b(String str, String str2, int i) {
        return new p54(str, str2, i);
    }

    public String toString() {
        return "CallParam{callId='" + this.f150592a + "', leaderBoardKey='" + this.f150593b + "', state='" + this.f150594c + "', position=" + this.f150595d + ", role='" + this.f150596e + "', roomId='" + this.f150597f + "', liveId='" + this.f150598g + "'}";
    }
}
