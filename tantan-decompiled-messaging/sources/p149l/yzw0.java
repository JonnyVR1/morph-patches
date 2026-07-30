package p149l;

import com.google.android.gms.internal.ads.C2229q4;
import com.google.android.gms.internal.ads.zzgus;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class yzw0 {

    /* JADX INFO: renamed from: a */
    public static final pxw0 f200916a = pxw0.m171958b(new nxw0() { // from class: l.uzw0
        @Override // p149l.nxw0
        /* JADX INFO: renamed from: a */
        public final Object mo98574a(rnw0 rnw0Var) {
            return new y0x0((tzw0) rnw0Var);
        }
    }, tzw0.class, mzw0.class);

    /* JADX INFO: renamed from: b */
    public static final pxw0 f200917b = pxw0.m171958b(new nxw0() { // from class: l.vzw0
        @Override // p149l.nxw0
        /* JADX INFO: renamed from: a */
        public final Object mo98574a(rnw0 rnw0Var) {
            return n6x0.m158104b((tzw0) rnw0Var);
        }
    }, tzw0.class, eow0.class);

    /* JADX INFO: renamed from: c */
    public static final snw0 f200918c = iww0.m138778c("type.googleapis.com/google.crypto.tink.HmacKey", eow0.class, zzgus.SYMMETRIC, C2229q4.m13203S());

    /* JADX INFO: renamed from: d */
    public static final rww0 f200919d = new rww0() { // from class: l.wzw0
    };

    /* JADX INFO: renamed from: e */
    public static final pww0 f200920e = new pww0() { // from class: l.xzw0
        @Override // p149l.pww0
        /* JADX INFO: renamed from: a */
        public final rnw0 mo108458a(fow0 fow0Var, Integer num) {
            e0x0 e0x0Var = (e0x0) fow0Var;
            rzw0 rzw0Var = new rzw0(null);
            rzw0Var.m181803c(e0x0Var);
            rzw0Var.m181802b(r6x0.m178103c(e0x0Var.m114353c()));
            rzw0Var.m181801a(null);
            return rzw0Var.m181804d();
        }
    };

    /* JADX INFO: renamed from: a */
    public static void m216705a(boolean z) throws GeneralSecurityException {
        q6x0 q6x0Var = d1x0.f83312a;
        d1x0.m109696e(dxw0.m114030d());
        axw0.m99526a().m99530e(f200916a);
        axw0.m99526a().m99530e(f200917b);
        zww0 zww0VarM220732b = zww0.m220732b();
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", v0x0.f179176a);
        a0x0 a0x0Var = new a0x0(null);
        a0x0Var.m94496b(32);
        a0x0Var.m94497c(16);
        c0x0 c0x0Var = c0x0.f78187e;
        a0x0Var.m94498d(c0x0Var);
        b0x0 b0x0Var = b0x0.f72469d;
        a0x0Var.m94495a(b0x0Var);
        map.put("HMAC_SHA256_128BITTAG_RAW", a0x0Var.m94499e());
        a0x0 a0x0Var2 = new a0x0(null);
        a0x0Var2.m94496b(32);
        a0x0Var2.m94497c(32);
        c0x0 c0x0Var2 = c0x0.f78184b;
        a0x0Var2.m94498d(c0x0Var2);
        a0x0Var2.m94495a(b0x0Var);
        map.put("HMAC_SHA256_256BITTAG", a0x0Var2.m94499e());
        a0x0 a0x0Var3 = new a0x0(null);
        a0x0Var3.m94496b(32);
        a0x0Var3.m94497c(32);
        a0x0Var3.m94498d(c0x0Var);
        a0x0Var3.m94495a(b0x0Var);
        map.put("HMAC_SHA256_256BITTAG_RAW", a0x0Var3.m94499e());
        a0x0 a0x0Var4 = new a0x0(null);
        a0x0Var4.m94496b(64);
        a0x0Var4.m94497c(16);
        a0x0Var4.m94498d(c0x0Var2);
        b0x0 b0x0Var2 = b0x0.f72471f;
        a0x0Var4.m94495a(b0x0Var2);
        map.put("HMAC_SHA512_128BITTAG", a0x0Var4.m94499e());
        a0x0 a0x0Var5 = new a0x0(null);
        a0x0Var5.m94496b(64);
        a0x0Var5.m94497c(16);
        a0x0Var5.m94498d(c0x0Var);
        a0x0Var5.m94495a(b0x0Var2);
        map.put("HMAC_SHA512_128BITTAG_RAW", a0x0Var5.m94499e());
        a0x0 a0x0Var6 = new a0x0(null);
        a0x0Var6.m94496b(64);
        a0x0Var6.m94497c(32);
        a0x0Var6.m94498d(c0x0Var2);
        a0x0Var6.m94495a(b0x0Var2);
        map.put("HMAC_SHA512_256BITTAG", a0x0Var6.m94499e());
        a0x0 a0x0Var7 = new a0x0(null);
        a0x0Var7.m94496b(64);
        a0x0Var7.m94497c(32);
        a0x0Var7.m94498d(c0x0Var);
        a0x0Var7.m94495a(b0x0Var2);
        map.put("HMAC_SHA512_256BITTAG_RAW", a0x0Var7.m94499e());
        map.put("HMAC_SHA512_512BITTAG", v0x0.f179179d);
        a0x0 a0x0Var8 = new a0x0(null);
        a0x0Var8.m94496b(64);
        a0x0Var8.m94497c(64);
        a0x0Var8.m94498d(c0x0Var);
        a0x0Var8.m94495a(b0x0Var2);
        map.put("HMAC_SHA512_512BITTAG_RAW", a0x0Var8.m94499e());
        zww0VarM220732b.m220735d(Collections.unmodifiableMap(map));
        qww0.m176927b().m176929c(f200920e, e0x0.class);
        sww0.m186387a().m186388b(f200919d, e0x0.class);
        zvw0.m220487c().m220492f(f200918c, 2, true);
    }
}
