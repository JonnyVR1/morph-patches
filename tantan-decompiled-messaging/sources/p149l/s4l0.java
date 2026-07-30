package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class s4l0 {
    /* JADX INFO: renamed from: a */
    public static h3x m182303a(Context context, File file) {
        return m182304b(file);
    }

    /* JADX INFO: renamed from: b */
    public static h3x m182304b(File file) {
        int iM166387a;
        float[] fArr;
        if (!file.exists()) {
            return null;
        }
        String str = file.getPath() + "/params.txt";
        if (!new File(str).exists()) {
            str = file.getPath() + "/params.json";
        }
        String strM194909c = upq.m194907b().m194909c(str);
        if (!TextUtils.isEmpty(strM194909c)) {
            try {
                h3x h3xVar = (h3x) upq.m194907b().m194908a(strM194909c, h3x.class);
                if (h3xVar.m129186h() == null) {
                    h3xVar.m129192n(new ArrayList());
                }
                if (!TextUtils.isEmpty(h3xVar.m129185g())) {
                    h3xVar.m129190l(file.getPath() + "/" + h3xVar.m129185g());
                }
                h3xVar.m129189k(file.getPath());
                if (h3xVar.m129183e() != null) {
                    for (g3w g3wVar : h3xVar.m129183e()) {
                        g3wVar.m124286d(file.getPath() + "/" + g3wVar.m124283a() + "/lookup.png");
                        mwf0 mwf0Var = new mwf0();
                        mwf0Var.m156630j("FACE_LOOK_UP_TYPE");
                        mwf0Var.m156631k(g3wVar.m124285c());
                        mwf0Var.m156628h(g3wVar);
                        mwf0Var.m156626f(g3wVar.m124284b());
                        h3xVar.m129186h().add(0, mwf0Var);
                    }
                }
                if (h3xVar.m129184f() != null) {
                    for (a3x a3xVar : h3xVar.m129184f()) {
                        a3x a3xVar2 = (a3x) upq.m194907b().m194908a(upq.m194907b().m194909c(file.getPath() + "/" + a3xVar.m94757a() + "/metadata.json"), a3x.class);
                        if (a3xVar2 != null && (fArr = a3xVar2.landmarks) != null) {
                            a3xVar.landmarks = fArr;
                            a3xVar.m94763g(file.getPath() + "/" + a3xVar.m94757a() + "/texture.png");
                            mwf0 mwf0Var2 = new mwf0();
                            mwf0Var2.m156630j("FACE_MASK_TYPE");
                            mwf0Var2.m156631k(a3xVar.m94761e());
                            mwf0Var2.m156626f(a3xVar.m94758b());
                            mwf0Var2.m156629i(a3xVar);
                            h3xVar.m129186h().add(0, mwf0Var2);
                        }
                    }
                }
                if (h3xVar.m129180b() != null) {
                    for (a3x a3xVar3 : h3xVar.m129180b()) {
                        file.getPath();
                        a3xVar3.m94757a();
                        mwf0 mwf0Var3 = new mwf0();
                        mwf0Var3.m156631k(a3xVar3.m94761e());
                        mwf0Var3.m156626f(a3xVar3.m94758b());
                        mwf0Var3.m156629i(a3xVar3);
                        h3xVar.m129186h().add(0, mwf0Var3);
                        h3xVar.m129188j(a3xVar3.m94759c());
                        h3xVar.m129187i(a3xVar3.m94760d());
                        h3xVar.m129193o(a3xVar3.m94762f());
                    }
                }
                for (mwf0 mwf0Var4 : h3xVar.m129186h()) {
                    mwf0Var4.m156625e(h3xVar.m129182d());
                    mwf0Var4.m156627g(file.getPath());
                    if (mwf0Var4.m156621a() != null && (iM166387a = mwf0Var4.m156621a().m166387a()) != 0) {
                        h3xVar.m129191m(iM166387a);
                    }
                }
                if (h3xVar.m129181c() != null) {
                    Iterator<tpe> it = h3xVar.m129181c().iterator();
                    while (it.hasNext()) {
                        it.next().m189991a(file.getPath());
                    }
                }
                return h3xVar;
            } catch (Throwable th) {
                MDLog.printErrStackTrace("VideoFaceUtils", th);
            }
        }
        return null;
    }
}
