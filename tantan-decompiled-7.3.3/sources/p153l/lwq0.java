package p153l;

import com.apm.lite.CrashType;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class lwq0 {

    /* JADX INFO: renamed from: a */
    private static ConcurrentLinkedQueue<lwq0> f133848a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: l.lwq0$a */
    public static /* synthetic */ class C18474a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f133849a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f133849a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f133849a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f133849a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: l.lwq0$b */
    public static class C18475b {

        /* JADX INFO: renamed from: a */
        private JSONObject f133850a;

        /* JADX INFO: renamed from: b */
        private JSONObject f133851b;

        /* JADX INFO: renamed from: c */
        private CrashType f133852c;

        public C18475b(JSONObject jSONObject, CrashType crashType) {
            this.f133852c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f133850a = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.f133850a = jSONObject;
            }
            this.f133851b = jSONObject.optJSONObject("header");
        }

        /* JADX INFO: renamed from: a */
        public String m156090a() {
            return this.f133850a.optString("crash_thread_name", null);
        }

        /* JADX INFO: renamed from: b */
        public long m156091b() {
            return this.f133850a.optLong("app_start_time", -1L);
        }

        /* JADX INFO: renamed from: c */
        public String m156092c() {
            int i = C18474a.f133849a[this.f133852c.ordinal()];
            if (i == 1) {
                return this.f133850a.optString("data", null);
            }
            if (i == 2) {
                return this.f133850a.optString("stack", null);
            }
            if (i != 3) {
                return null;
            }
            return this.f133850a.optString("data", null);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m156088b(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<lwq0> concurrentLinkedQueue = f133848a;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        C18475b c18475b = new C18475b(jSONObject, crashType);
        while (!f133848a.isEmpty()) {
            lwq0 lwq0VarPoll = f133848a.poll();
            if (lwq0VarPoll != null) {
                lwq0VarPoll.m156089a(crashType, c18475b);
            }
        }
        f133848a = null;
    }

    /* JADX INFO: renamed from: a */
    public abstract void m156089a(CrashType crashType, C18475b c18475b);
}
