package p149l;

import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;

/* JADX INFO: loaded from: classes13.dex */
public class mqv<T> {

    /* JADX INFO: renamed from: a */
    public T f135304a;

    /* JADX INFO: renamed from: b */
    public User f135305b;

    /* JADX INFO: renamed from: c */
    public xvl f135306c;

    /* JADX INFO: renamed from: d */
    public BLiveVoiceCall f135307d;

    /* JADX WARN: Multi-variable type inference failed */
    public mqv(T t) {
        this.f135304a = t;
        if (t instanceof User) {
            this.f135305b = (User) t;
        }
    }

    /* JADX INFO: renamed from: f */
    public static <T> mqv<T> m155998f(T t) {
        if (t == null) {
            return null;
        }
        return new mqv<>(t);
    }

    /* JADX INFO: renamed from: a */
    public mqv<T> m155999a(User user) {
        this.f135305b = user;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public mqv<T> m156000b(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall == null) {
            return this;
        }
        this.f135307d = bLiveVoiceCall;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public mqv<T> m156001c(String str, BLiveUserMask bLiveUserMask, boolean z) {
        return m156002d(new hxn0(str, z).m133355f(bLiveUserMask));
    }

    /* JADX INFO: renamed from: d */
    public mqv<T> m156002d(xvl xvlVar) {
        if (xvlVar == null) {
            return this;
        }
        this.f135306c = xvlVar;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public mqv<T> m156003e(BLiveUserMask bLiveUserMask) {
        return m156002d(new d1t(bLiveUserMask));
    }

    /* JADX INFO: renamed from: g */
    public xvl m156004g() {
        return this.f135306c;
    }

    /* JADX INFO: renamed from: h */
    public User m156005h() {
        return this.f135305b;
    }

    /* JADX INFO: renamed from: i */
    public BLiveVoiceCall m156006i() {
        return this.f135307d;
    }
}
