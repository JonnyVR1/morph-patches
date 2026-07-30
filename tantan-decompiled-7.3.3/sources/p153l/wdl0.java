package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class wdl0 {
    /* JADX INFO: renamed from: a */
    public static g6x m205969a(Context context, File file) {
        return m205970b(file);
    }

    /* JADX INFO: renamed from: b */
    public static g6x m205970b(File file) {
        int iM214235a;
        float[] fArr;
        if (!file.exists()) {
            return null;
        }
        String str = file.getPath() + "/params.txt";
        if (!new File(str).exists()) {
            str = file.getPath() + "/params.json";
        }
        String strM202516c = vrq.m202514b().m202516c(str);
        if (!TextUtils.isEmpty(strM202516c)) {
            try {
                g6x g6xVar = (g6x) vrq.m202514b().m202515a(strM202516c, g6x.class);
                if (g6xVar.m129292h() == null) {
                    g6xVar.m129298n(new ArrayList());
                }
                if (!TextUtils.isEmpty(g6xVar.m129291g())) {
                    g6xVar.m129296l(file.getPath() + "/" + g6xVar.m129291g());
                }
                g6xVar.m129295k(file.getPath());
                if (g6xVar.m129289e() != null) {
                    for (e5w e5wVar : g6xVar.m129289e()) {
                        e5wVar.m119556d(file.getPath() + "/" + e5wVar.m119553a() + "/lookup.png");
                        w4g0 w4g0Var = new w4g0();
                        w4g0Var.m204893j("FACE_LOOK_UP_TYPE");
                        w4g0Var.m204894k(e5wVar.m119555c());
                        w4g0Var.m204891h(e5wVar);
                        w4g0Var.m204889f(e5wVar.m119554b());
                        g6xVar.m129292h().add(0, w4g0Var);
                    }
                }
                if (g6xVar.m129290f() != null) {
                    for (z5x z5xVar : g6xVar.m129290f()) {
                        z5x z5xVar2 = (z5x) vrq.m202514b().m202515a(vrq.m202514b().m202516c(file.getPath() + "/" + z5xVar.m218746a() + "/metadata.json"), z5x.class);
                        if (z5xVar2 != null && (fArr = z5xVar2.landmarks) != null) {
                            z5xVar.landmarks = fArr;
                            z5xVar.m218752g(file.getPath() + "/" + z5xVar.m218746a() + "/texture.png");
                            w4g0 w4g0Var2 = new w4g0();
                            w4g0Var2.m204893j("FACE_MASK_TYPE");
                            w4g0Var2.m204894k(z5xVar.m218750e());
                            w4g0Var2.m204889f(z5xVar.m218747b());
                            w4g0Var2.m204892i(z5xVar);
                            g6xVar.m129292h().add(0, w4g0Var2);
                        }
                    }
                }
                if (g6xVar.m129286b() != null) {
                    for (z5x z5xVar3 : g6xVar.m129286b()) {
                        file.getPath();
                        z5xVar3.m218746a();
                        w4g0 w4g0Var3 = new w4g0();
                        w4g0Var3.m204894k(z5xVar3.m218750e());
                        w4g0Var3.m204889f(z5xVar3.m218747b());
                        w4g0Var3.m204892i(z5xVar3);
                        g6xVar.m129292h().add(0, w4g0Var3);
                        g6xVar.m129294j(z5xVar3.m218748c());
                        g6xVar.m129293i(z5xVar3.m218749d());
                        g6xVar.m129299o(z5xVar3.m218751f());
                    }
                }
                for (w4g0 w4g0Var4 : g6xVar.m129292h()) {
                    w4g0Var4.m204888e(g6xVar.m129288d());
                    w4g0Var4.m204890g(file.getPath());
                    if (w4g0Var4.m204884a() != null && (iM214235a = w4g0Var4.m204884a().m214235a()) != 0) {
                        g6xVar.m129297m(iM214235a);
                    }
                }
                if (g6xVar.m129287c() != null) {
                    Iterator<xqe> it = g6xVar.m129287c().iterator();
                    while (it.hasNext()) {
                        it.next().m212729a(file.getPath());
                    }
                }
                return g6xVar;
            } catch (Throwable th) {
                MDLog.printErrStackTrace("VideoFaceUtils", th);
            }
        }
        return null;
    }
}
