package p153l;

import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes10.dex */
public class z0n {

    /* JADX INFO: renamed from: b */
    public static final z0n f202358b = new z0n();

    /* JADX INFO: renamed from: a */
    public final C22508b<PushMessage> f202359a = C22508b.m222767b();

    /* JADX INFO: renamed from: a */
    public static z0n m218136a() {
        return f202358b;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m218137b(String str) {
        return "virtualAvatar".equals(str) || "commercialRoom".equals(str) || VirtualVoiceMotionType.lovePlanet.equals(str);
    }

    /* JADX INFO: renamed from: c */
    public void m218138c(PushMessage pushMessage) {
        if (pushMessage != null) {
            this.f202359a.onNext(pushMessage);
        }
    }

    /* JADX INFO: renamed from: d */
    public C22421c<PushMessage> m218139d() {
        return this.f202359a.asObservable().observeOn(fo0.m126432a());
    }
}
