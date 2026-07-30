package p002l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class q44 {

    /* JADX INFO: renamed from: a */
    public final String f17800a;

    /* JADX INFO: renamed from: b */
    public String f17801b;

    /* JADX INFO: renamed from: c */
    public String f17802c;

    /* JADX INFO: renamed from: d */
    public int f17803d;

    /* JADX INFO: renamed from: e */
    public String f17804e;

    /* JADX INFO: renamed from: f */
    public String f17805f;

    /* JADX INFO: renamed from: g */
    public String f17806g;

    public q44(String str, String str2, int i) {
        this.f17800a = str;
        this.f17801b = str2;
        this.f17803d = i;
    }

    /* JADX INFO: renamed from: a */
    public static q44 m21019a() {
        return new q44("", "", 0);
    }

    /* JADX INFO: renamed from: b */
    public static q44 m21020b(String str, String str2, int i) {
        return new q44(str, str2, i);
    }

    public String toString() {
        return "CallParam{callId='" + this.f17800a + "', leaderBoardKey='" + this.f17801b + "', state='" + this.f17802c + "', position=" + this.f17803d + ", role='" + this.f17804e + "', roomId='" + this.f17805f + "', liveId='" + this.f17806g + "'}";
    }
}
