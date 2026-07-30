package p009l;

import com.p1.mobile.putong.data.PushMessage;
import l.jo0;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zym {

    /* JADX INFO: renamed from: b */
    public static final zym f24051b = new zym();

    /* JADX INFO: renamed from: a */
    public final b<PushMessage> f24052a = b.b();

    /* JADX INFO: renamed from: a */
    public static zym m26145a() {
        return f24051b;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m26146b(String str) {
        return "virtualAvatar".equals(str) || "commercialRoom".equals(str) || "lovePlanet".equals(str);
    }

    /* JADX INFO: renamed from: c */
    public void m26147c(PushMessage pushMessage) {
        if (pushMessage != null) {
            this.f24052a.onNext(pushMessage);
        }
    }

    /* JADX INFO: renamed from: d */
    public c<PushMessage> m26148d() {
        return this.f24052a.asObservable().observeOn(jo0.a());
    }
}
