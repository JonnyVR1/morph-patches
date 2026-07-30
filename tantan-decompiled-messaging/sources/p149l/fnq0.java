package p149l;

import com.apm.lite.CrashType;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class fnq0 {

    /* JADX INFO: renamed from: a */
    private static ConcurrentLinkedQueue<fnq0> f98442a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: l.fnq0$a */
    public static /* synthetic */ class C16888a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f98443a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f98443a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f98443a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f98443a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: l.fnq0$b */
    public static class C16889b {

        /* JADX INFO: renamed from: a */
        private JSONObject f98444a;

        /* JADX INFO: renamed from: b */
        private JSONObject f98445b;

        /* JADX INFO: renamed from: c */
        private CrashType f98446c;

        public C16889b(JSONObject jSONObject, CrashType crashType) {
            this.f98446c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f98444a = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.f98444a = jSONObject;
            }
            this.f98445b = jSONObject.optJSONObject("header");
        }

        /* JADX INFO: renamed from: a */
        public String m122343a() {
            return this.f98444a.optString("crash_thread_name", null);
        }

        /* JADX INFO: renamed from: b */
        public long m122344b() {
            return this.f98444a.optLong("app_start_time", -1L);
        }

        /* JADX INFO: renamed from: c */
        public String m122345c() {
            int i = C16888a.f98443a[this.f98446c.ordinal()];
            if (i == 1) {
                return this.f98444a.optString("data", null);
            }
            if (i == 2) {
                return this.f98444a.optString("stack", null);
            }
            if (i != 3) {
                return null;
            }
            return this.f98444a.optString("data", null);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m122341b(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<fnq0> concurrentLinkedQueue = f98442a;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        C16889b c16889b = new C16889b(jSONObject, crashType);
        while (!f98442a.isEmpty()) {
            fnq0 fnq0VarPoll = f98442a.poll();
            if (fnq0VarPoll != null) {
                fnq0VarPoll.m122342a(crashType, c16889b);
            }
        }
        f98442a = null;
    }

    /* JADX INFO: renamed from: a */
    public abstract void m122342a(CrashType crashType, C16889b c16889b);
}
