package p153l;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Meta;
import java.io.File;
import java.util.Map;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class ypd {

    /* JADX INFO: renamed from: a */
    public static Gson f201054a = new GsonBuilder().create();

    /* JADX INFO: renamed from: c */
    public static ku10.C18260a m217009c(File file) {
        ku10.C18260a c18260aM151432f = new ku10.C18260a().m151432f(ku10.f128786j);
        if (file != null) {
            c18260aM151432f.m151428b("file", "file", z1d0.create(e7y.m119773d("multipart/form-data"), file));
        }
        return c18260aM151432f;
    }

    /* JADX INFO: renamed from: d */
    public static C22421c<Meta> m217010d(String str, final File file) {
        final x1d0.C21228a c21228aM209043q = uqb0.f180376H.auth().m209043q(str);
        if (msh0.m159790e() != null && msh0.m159790e().getHeader() != null) {
            for (Map.Entry<String, String> entry : msh0.m159790e().getHeader().entrySet()) {
                c21228aM209043q.m209027a(entry.getKey(), entry.getValue());
            }
        }
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.wpd
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return c21228aM209043q.m209038l(ypd.m217009c(file).m151431e()).m209028b();
            }
        }, true).map(new qcj() { // from class: l.xpd
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Envelope) obj).meta;
            }
        });
    }
}
