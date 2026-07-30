package p149l;

/* JADX INFO: loaded from: classes13.dex */
public class poi0 {

    /* JADX INFO: renamed from: a */
    public long f150514a;

    /* JADX INFO: renamed from: b */
    public String f150515b;

    /* JADX INFO: renamed from: c */
    public String f150516c;

    /* JADX INFO: renamed from: d */
    public String f150517d;

    /* JADX INFO: renamed from: e */
    public String f150518e;

    /* JADX INFO: renamed from: f */
    public StackTraceElement[] f150519f;

    /* JADX INFO: renamed from: g */
    public int f150520g;

    /* JADX INFO: renamed from: h */
    public Thread.State f150521h;

    public poi0(long j, String str, StackTraceElement[] stackTraceElementArr, String str2) {
        this.f150514a = j;
        this.f150515b = str;
        this.f150519f = stackTraceElementArr;
        if (stackTraceElementArr != null) {
            this.f150516c = tek0.m188523b(stackTraceElementArr);
        } else {
            this.f150516c = "Untrack";
        }
        this.f150517d = str2;
    }

    public String toString() {
        return "ThreadInfo{tid=" + this.f150514a + ", name='" + this.f150515b + "', stackTrace=\n" + this.f150516c + ", ownedPoolName='" + this.f150517d + "', state=" + this.f150521h + '}';
    }
}
