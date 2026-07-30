package p153l;

import android.content.Context;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class q3r0 {

    /* JADX INFO: renamed from: l.q3r0$a */
    public static class C19517a implements irl {
        @Override // p153l.irl
        /* JADX INFO: renamed from: a */
        public String mo141835a() {
            d610 d610Var = (d610) cyq0.m113207a();
            return d610Var != null ? d610Var.m114350e().m114354b() : "";
        }

        @Override // p153l.irl
        /* JADX INFO: renamed from: b */
        public List<String> mo141836b() {
            return null;
        }

        @Override // p153l.irl
        /* JADX INFO: renamed from: c */
        public Map<String, Integer> mo141837c() {
            return null;
        }

        @Override // p153l.irl
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo141838d() {
            return new HashMap();
        }

        @Override // p153l.irl
        public long getUserId() {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ayq0 m175160a(Context context) {
        return new ayq0(context, new C19517a());
    }
}
