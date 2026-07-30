package p153l;

import Sudchar.Sudcase;
import Sudchar.Sudfor;
import Sudchar.Sudnew;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.jetty.http.HttpHeaders;
import org.fourthline.cling.model.types.BytesRange;

/* JADX INFO: loaded from: classes.dex */
public final class nrg0 implements wng0 {
    @Override // p153l.wng0
    /* JADX INFO: renamed from: b */
    public final vkg0 mo110337b(jgg0 jgg0Var) throws IOException {
        bog0 bog0Var = jgg0Var.f120715c;
        csg0 csg0VarM144773a = jgg0Var.m144773a();
        aug0 aug0Var = jgg0Var.f120714b;
        Map map = aug0Var.f73496e;
        if (map != null) {
            ytg0.m217311c(map, csg0VarM144773a);
        }
        if (map == null || !map.containsKey("User-Agent")) {
            ((rug0) csg0VarM144773a).f164919b.m209027a("User-Agent", "OkDownload/1.0.7");
        }
        int i = jgg0Var.f120713a;
        akg0 akg0Var = (akg0) bog0Var.f77680g.get(i);
        if (akg0Var == null) {
            zpg0.m220844a(dmg0.m116959a(i, "No block-info found on "));
            return null;
        }
        rug0 rug0Var = (rug0) csg0VarM144773a;
        rug0Var.f164919b.m209027a("Range", (BytesRange.PREFIX + (akg0Var.f72005c.get() + akg0Var.f72003a) + "-") + ((akg0Var.f72003a + akg0Var.f72004b) - 1));
        akg0Var.f72005c.get();
        akg0Var.f72005c.get();
        String str = bog0Var.f77676c;
        if (!ytg0.m217312d(str)) {
            rug0Var.f164919b.m209027a("If-Match", str);
        }
        if (jgg0Var.f120716d.m142520c()) {
            throw Sudfor.f211027Suddo;
        }
        oyg0 oyg0Var = jwg0.m147162a().f122920b.f84561a;
        x1d0 x1d0Var = rug0Var.f164920c;
        oyg0Var.m169862e(aug0Var, i, x1d0Var != null ? x1d0Var.m209020e().m118879l() : rug0Var.f164919b.m209028b().m209020e().m118879l());
        vkg0 vkg0VarM144775c = jgg0Var.m144775c();
        if (jgg0Var.f120716d.m142520c()) {
            throw Sudfor.f211027Suddo;
        }
        rug0 rug0Var2 = (rug0) vkg0VarM144775c;
        i5d0 i5d0Var = rug0Var2.f164921d;
        Map<String, List<String>> mapM118879l = i5d0Var == null ? null : i5d0Var.m138659F().m118879l();
        if (mapM118879l == null) {
            mapM118879l = new HashMap<>();
        }
        oyg0 oyg0Var2 = jwg0.m147162a().f122920b.f84561a;
        i5d0 i5d0Var2 = rug0Var2.f164921d;
        if (i5d0Var2 == null) {
            zpg0.m220844a("Please invoke execute first!");
            return null;
        }
        oyg0Var2.m169858a(aug0Var, i, i5d0Var2.m138673q(), mapM118879l);
        nmg0 nmg0Var = jwg0.m147162a().f122925g;
        akg0 akg0Var2 = (akg0) bog0Var.f77680g.get(i);
        i5d0 i5d0Var3 = rug0Var2.f164921d;
        if (i5d0Var3 == null) {
            zpg0.m220844a("Please invoke execute first!");
            return null;
        }
        int iM138673q = i5d0Var3.m138673q();
        String strM183191a = rug0Var2.m183191a("Etag");
        nmg0 nmg0Var2 = jwg0.m147162a().f122925g;
        int iM163816a = nmg0.m163816a(iM138673q, akg0Var2.f72005c.get() != 0, bog0Var, strM183191a);
        if (iM163816a != 0) {
            throw new Sudnew(iM163816a);
        }
        nmg0 nmg0Var3 = jwg0.m147162a().f122925g;
        boolean z = akg0Var2.f72005c.get() != 0;
        if ((iM138673q != 206 && iM138673q != 200) || (iM138673q == 200 && z)) {
            throw new Sudcase(iM138673q, akg0Var2.f72005c.get());
        }
        String strM183191a2 = rug0Var2.m183191a("Content-Length");
        long j = -1;
        if (strM183191a2 == null || strM183191a2.length() == 0) {
            String strM183191a3 = rug0Var2.m183191a(HttpHeaders.CONTENT_RANGE);
            if (strM183191a3 != null && strM183191a3.length() != 0) {
                try {
                    Matcher matcher = Pattern.compile("bytes (\\d+)-(\\d+)/\\d+").matcher(strM183191a3);
                    if (matcher.find()) {
                        j = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                    }
                } catch (Exception e) {
                    e.toString();
                }
            }
        } else {
            try {
                j = Long.parseLong(strM183191a2);
            } catch (NumberFormatException unused) {
            }
        }
        jgg0Var.f120721i = j;
        return rug0Var2;
    }
}
