package p149l;

import fi.iki.elonen.NanoHTTPD;
import immomo.com.mklibrary.server.LocalServerHandler;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class y95 implements td80 {

    /* JADX INFO: renamed from: l.y95$a */
    public class RunnableC21337a implements Runnable {
        public RunnableC21337a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LocalServerHandler.m87203j();
        }
    }

    @Override // p149l.w0m
    /* JADX INFO: renamed from: a */
    public boolean mo97152a(Map<String, String> map, String str, String str2) {
        return "/close".equals(map.get("url"));
    }

    @Override // p149l.w0m
    /* JADX INFO: renamed from: b */
    public NanoHTTPD.Response mo97153b(Map<String, String> map, String str, String str2) {
        pv00.m171494b(new RunnableC21337a());
        return NanoHTTPD.m86936r("close!");
    }
}
