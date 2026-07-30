package p149l;

import Sudchar.Sudcase;
import Sudchar.Sudfor;
import Sudchar.Sudnew;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.types.BytesRange;

/* JADX INFO: loaded from: classes.dex */
public final class fjg0 implements ofg0 {
    @Override // p149l.ofg0
    /* JADX INFO: renamed from: b */
    public final ncg0 mo97896b(b8g0 b8g0Var) throws IOException {
        tfg0 tfg0Var = b8g0Var.f74113c;
        ujg0 ujg0VarM100771a = b8g0Var.m100771a();
        slg0 slg0Var = b8g0Var.f74112b;
        Map map = slg0Var.f165193e;
        if (map != null) {
            qlg0.m175480c(map, ujg0VarM100771a);
        }
        if (map == null || !map.containsKey("User-Agent")) {
            ((jmg0) ujg0VarM100771a).f118633b.m185882a("User-Agent", "OkDownload/1.0.7");
        }
        int i = b8g0Var.f74111a;
        sbg0 sbg0Var = (sbg0) tfg0Var.f169981g.get(i);
        if (sbg0Var == null) {
            rhg0.m179353a(vdg0.m197997a(i, "No block-info found on "));
            return null;
        }
        jmg0 jmg0Var = (jmg0) ujg0VarM100771a;
        jmg0Var.f118633b.m185882a("Range", (BytesRange.PREFIX + (sbg0Var.f163536c.get() + sbg0Var.f163534a) + "-") + ((sbg0Var.f163534a + sbg0Var.f163535b) - 1));
        sbg0Var.f163536c.get();
        sbg0Var.f163536c.get();
        String str = tfg0Var.f169977c;
        if (!qlg0.m175481d(str)) {
            jmg0Var.f118633b.m185882a("If-Match", str);
        }
        if (b8g0Var.f74114d.m98119c()) {
            throw Sudfor.f210105Suddo;
        }
        gqg0 gqg0Var = bog0.m102944a().f76516b.f182721a;
        stc0 stc0Var = jmg0Var.f118634c;
        gqg0Var.m127590e(slg0Var, i, stc0Var != null ? stc0Var.m185875e().m166560l() : jmg0Var.f118633b.m185883b().m185875e().m166560l());
        ncg0 ncg0VarM100773c = b8g0Var.m100773c();
        if (b8g0Var.f74114d.m98119c()) {
            throw Sudfor.f210105Suddo;
        }
        jmg0 jmg0Var2 = (jmg0) ncg0VarM100773c;
        exc0 exc0Var = jmg0Var2.f118635d;
        Map<String, List<String>> mapM166560l = exc0Var == null ? null : exc0Var.m118595F().m166560l();
        if (mapM166560l == null) {
            mapM166560l = new HashMap<>();
        }
        gqg0 gqg0Var2 = bog0.m102944a().f76516b.f182721a;
        exc0 exc0Var2 = jmg0Var2.f118635d;
        if (exc0Var2 == null) {
            rhg0.m179353a("Please invoke execute first!");
            return null;
        }
        gqg0Var2.m127586a(slg0Var, i, exc0Var2.m118609q(), mapM166560l);
        feg0 feg0Var = bog0.m102944a().f76521g;
        sbg0 sbg0Var2 = (sbg0) tfg0Var.f169981g.get(i);
        exc0 exc0Var3 = jmg0Var2.f118635d;
        if (exc0Var3 == null) {
            rhg0.m179353a("Please invoke execute first!");
            return null;
        }
        int iM118609q = exc0Var3.m118609q();
        String strM142182a = jmg0Var2.m142182a("Etag");
        feg0 feg0Var2 = bog0.m102944a().f76521g;
        int iM121038a = feg0.m121038a(iM118609q, sbg0Var2.f163536c.get() != 0, tfg0Var, strM142182a);
        if (iM121038a != 0) {
            throw new Sudnew(iM121038a);
        }
        feg0 feg0Var3 = bog0.m102944a().f76521g;
        boolean z = sbg0Var2.f163536c.get() != 0;
        if ((iM118609q != 206 && iM118609q != 200) || (iM118609q == 200 && z)) {
            throw new Sudcase(iM118609q, sbg0Var2.f163536c.get());
        }
        String strM142182a2 = jmg0Var2.m142182a("Content-Length");
        long j = -1;
        if (strM142182a2 == null || strM142182a2.length() == 0) {
            String strM142182a3 = jmg0Var2.m142182a("Content-Range");
            if (strM142182a3 != null && strM142182a3.length() != 0) {
                try {
                    Matcher matcher = Pattern.compile("bytes (\\d+)-(\\d+)/\\d+").matcher(strM142182a3);
                    if (matcher.find()) {
                        j = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                    }
                } catch (Exception e) {
                    e.toString();
                }
            }
        } else {
            try {
                j = Long.parseLong(strM142182a2);
            } catch (NumberFormatException unused) {
            }
        }
        b8g0Var.f74119i = j;
        return jmg0Var2;
    }
}
