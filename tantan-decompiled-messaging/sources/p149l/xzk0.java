package p149l;

import android.text.TextUtils;
import fi.iki.elonen.NanoHTTPD;
import immomo.com.mklibrary.server.LocalServerHandler;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class xzk0 implements jrl {
    @Override // p149l.w0m
    /* JADX INFO: renamed from: a */
    public boolean mo97152a(Map<String, String> map, String str, String str2) {
        return !TextUtils.equals(map.get("sign"), LocalServerHandler.m87196c());
    }

    @Override // p149l.w0m
    /* JADX INFO: renamed from: b */
    public NanoHTTPD.Response mo97153b(Map<String, String> map, String str, String str2) {
        return fqd.m122702i();
    }
}
