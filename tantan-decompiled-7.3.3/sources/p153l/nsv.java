package p153l;

import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;

/* JADX INFO: loaded from: classes13.dex */
public class nsv<T> {

    /* JADX INFO: renamed from: a */
    public T f143542a;

    /* JADX INFO: renamed from: b */
    public User f143543b;

    /* JADX INFO: renamed from: c */
    public pyl f143544c;

    /* JADX INFO: renamed from: d */
    public BLiveVoiceCall f143545d;

    /* JADX WARN: Multi-variable type inference failed */
    public nsv(T t) {
        this.f143542a = t;
        if (t instanceof User) {
            this.f143543b = (User) t;
        }
    }

    /* JADX INFO: renamed from: f */
    public static <T> nsv<T> m164636f(T t) {
        if (t == null) {
            return null;
        }
        return new nsv<>(t);
    }

    /* JADX INFO: renamed from: a */
    public nsv<T> m164637a(User user) {
        this.f143543b = user;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public nsv<T> m164638b(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall == null) {
            return this;
        }
        this.f143545d = bLiveVoiceCall;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public nsv<T> m164639c(String str, BLiveUserMask bLiveUserMask, boolean z) {
        return m164640d(new l6o0(str, z).m153073f(bLiveUserMask));
    }

    /* JADX INFO: renamed from: d */
    public nsv<T> m164640d(pyl pylVar) {
        if (pylVar == null) {
            return this;
        }
        this.f143544c = pylVar;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public nsv<T> m164641e(BLiveUserMask bLiveUserMask) {
        return m164640d(new e3t(bLiveUserMask));
    }

    /* JADX INFO: renamed from: g */
    public pyl m164642g() {
        return this.f143544c;
    }

    /* JADX INFO: renamed from: h */
    public User m164643h() {
        return this.f143543b;
    }

    /* JADX INFO: renamed from: i */
    public BLiveVoiceCall m164644i() {
        return this.f143545d;
    }
}
