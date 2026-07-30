package p149l;

/* JADX INFO: loaded from: classes4.dex */
public class q44 {

    /* JADX INFO: renamed from: a */
    public final String f152537a;

    /* JADX INFO: renamed from: b */
    public String f152538b;

    /* JADX INFO: renamed from: c */
    public String f152539c;

    /* JADX INFO: renamed from: d */
    public int f152540d;

    /* JADX INFO: renamed from: e */
    public String f152541e;

    /* JADX INFO: renamed from: f */
    public String f152542f;

    /* JADX INFO: renamed from: g */
    public String f152543g;

    public q44(String str, String str2, int i) {
        this.f152537a = str;
        this.f152538b = str2;
        this.f152540d = i;
    }

    /* JADX INFO: renamed from: a */
    public static q44 m172921a() {
        return new q44("", "", 0);
    }

    /* JADX INFO: renamed from: b */
    public static q44 m172922b(String str, String str2, int i) {
        return new q44(str, str2, i);
    }

    public String toString() {
        return "CallParam{callId='" + this.f152537a + "', leaderBoardKey='" + this.f152538b + "', state='" + this.f152539c + "', position=" + this.f152540d + ", role='" + this.f152541e + "', roomId='" + this.f152542f + "', liveId='" + this.f152543g + "'}";
    }
}
