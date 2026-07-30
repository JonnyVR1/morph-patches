package p149l;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Meta;
import java.io.File;
import java.util.Map;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class tod {

    /* JADX INFO: renamed from: a */
    public static Gson f171347a = new GsonBuilder().create();

    /* JADX INFO: renamed from: c */
    public static cm10.C16191a m189873c(File file) {
        cm10.C16191a c16191aM107600f = new cm10.C16191a().m107600f(cm10.f81492j);
        if (file != null) {
            c16191aM107600f.m107596b("file", "file", utc0.create(hyx.m133628d("multipart/form-data"), file));
        }
        return c16191aM107600f;
    }

    /* JADX INFO: renamed from: d */
    public static C22306c<Meta> m189874d(String str, final File file) {
        final stc0.C20027a c20027aM185898q = qib0.f154693H.auth().m185898q(str);
        if (fkh0.m121859e() != null && fkh0.m121859e().getHeader() != null) {
            for (Map.Entry<String, String> entry : fkh0.m121859e().getHeader().entrySet()) {
                c20027aM185898q.m185882a(entry.getKey(), entry.getValue());
            }
        }
        return new la20((v9j<stc0>) new v9j() { // from class: l.rod
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return c20027aM185898q.m185893l(tod.m189873c(file).m107599e()).m185883b();
            }
        }, true).map(new w9j() { // from class: l.sod
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Envelope) obj).meta;
            }
        });
    }
}
