package p153l;

/* JADX INFO: loaded from: classes11.dex */
public class rxi0 {

    /* JADX INFO: renamed from: a */
    public long f165337a;

    /* JADX INFO: renamed from: b */
    public String f165338b;

    /* JADX INFO: renamed from: c */
    public String f165339c;

    /* JADX INFO: renamed from: d */
    public String f165340d;

    /* JADX INFO: renamed from: e */
    public String f165341e;

    /* JADX INFO: renamed from: f */
    public StackTraceElement[] f165342f;

    /* JADX INFO: renamed from: g */
    public int f165343g;

    /* JADX INFO: renamed from: h */
    public Thread.State f165344h;

    public rxi0(long j, String str, StackTraceElement[] stackTraceElementArr, String str2) {
        this.f165337a = j;
        this.f165338b = str;
        this.f165342f = stackTraceElementArr;
        if (stackTraceElementArr != null) {
            this.f165339c = znk0.m220602b(stackTraceElementArr);
        } else {
            this.f165339c = "Untrack";
        }
        this.f165340d = str2;
    }

    public String toString() {
        return "ThreadInfo{tid=" + this.f165337a + ", name='" + this.f165338b + "', stackTrace=\n" + this.f165339c + ", ownedPoolName='" + this.f165340d + "', state=" + this.f165344h + '}';
    }
}
