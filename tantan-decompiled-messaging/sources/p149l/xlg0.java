package p149l;

import java.util.HashMap;
import p002E.Sudif;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.ISudListenerReportStatsEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class xlg0 {

    /* JADX INFO: renamed from: a */
    public static String f193417a = "";

    /* JADX INFO: renamed from: b */
    public static ISudListenerReportStatsEvent f193418b;

    /* JADX INFO: renamed from: c */
    public static final Sudif f193419c = new Sudif();

    /* JADX INFO: renamed from: d */
    public static final HashMap f193420d = new HashMap();

    /* JADX INFO: renamed from: a */
    public static String m209888a(String str) {
        String str2 = !str.isEmpty() ? (String) f193419c.get(str) : null;
        return (str2 == null || str2.isEmpty()) ? "UNSPECIFIED" : str2;
    }

    /* JADX INFO: renamed from: b */
    public static void m209889b(mcg0 mcg0Var) {
        ThreadUtils.postUITask(new fgg0(mcg0Var.toString(), false, mcg0Var.f133111a, mcg0Var.f133115e));
    }
}
