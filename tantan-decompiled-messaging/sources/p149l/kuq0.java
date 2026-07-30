package p149l;

import android.content.Context;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class kuq0 {

    /* JADX INFO: renamed from: l.kuq0$a */
    public static class C18084a implements xol {
        @Override // p149l.xol
        /* JADX INFO: renamed from: a */
        public String mo147292a() {
            tx00 tx00Var = (tx00) woq0.m204854a();
            return tx00Var != null ? tx00Var.m190924e().m190928b() : "";
        }

        @Override // p149l.xol
        /* JADX INFO: renamed from: b */
        public List<String> mo147293b() {
            return null;
        }

        @Override // p149l.xol
        /* JADX INFO: renamed from: c */
        public Map<String, Integer> mo147294c() {
            return null;
        }

        @Override // p149l.xol
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo147295d() {
            return new HashMap();
        }

        @Override // p149l.xol
        public long getUserId() {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static uoq0 m147291a(Context context) {
        return new uoq0(context, new C18084a());
    }
}
