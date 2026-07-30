package p153l;

import java.util.HashMap;
import p003E.Sudif;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.ISudListenerReportStatsEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class fug0 {

    /* JADX INFO: renamed from: a */
    public static String f100911a = "";

    /* JADX INFO: renamed from: b */
    public static ISudListenerReportStatsEvent f100912b;

    /* JADX INFO: renamed from: c */
    public static final Sudif f100913c = new Sudif();

    /* JADX INFO: renamed from: d */
    public static final HashMap f100914d = new HashMap();

    /* JADX INFO: renamed from: a */
    public static String m127462a(String str) {
        String str2 = !str.isEmpty() ? (String) f100913c.get(str) : null;
        return (str2 == null || str2.isEmpty()) ? "UNSPECIFIED" : str2;
    }

    /* JADX INFO: renamed from: b */
    public static void m127463b(ukg0 ukg0Var) {
        ThreadUtils.postUITask(new nog0(ukg0Var.toString(), false, ukg0Var.f179392a, ukg0Var.f179396e));
    }
}
