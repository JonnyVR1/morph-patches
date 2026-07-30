package p149l;

import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes11.dex */
public class zym {

    /* JADX INFO: renamed from: b */
    public static final zym f205699b = new zym();

    /* JADX INFO: renamed from: a */
    public final C22393b<PushMessage> f205700a = C22393b.m221521b();

    /* JADX INFO: renamed from: a */
    public static zym m220932a() {
        return f205699b;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m220933b(String str) {
        return "virtualAvatar".equals(str) || "commercialRoom".equals(str) || VirtualVoiceMotionType.lovePlanet.equals(str);
    }

    /* JADX INFO: renamed from: c */
    public void m220934c(PushMessage pushMessage) {
        if (pushMessage != null) {
            this.f205700a.onNext(pushMessage);
        }
    }

    /* JADX INFO: renamed from: d */
    public C22306c<PushMessage> m220935d() {
        return this.f205700a.asObservable().observeOn(jo0.m142408a());
    }
}
