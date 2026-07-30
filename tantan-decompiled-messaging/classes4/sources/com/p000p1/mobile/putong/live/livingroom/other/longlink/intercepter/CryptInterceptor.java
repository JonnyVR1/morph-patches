package com.p000p1.mobile.putong.live.livingroom.other.longlink.intercepter;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.auth.Auth;
import com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;
import com.p1.mobile.putong.live.base.data.BLiveAuthRecivedData;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import l.he2;
import l.jgw;
import l.li60;
import l.w8u;
import l.ypv;
import okio.ByteString;
import p002l.bxm;
import p002l.j9t;
import p002l.lur;
import p002l.qat;
import p002l.s460;
import p002l.vq4;
import p002l.wkf0;
import p002l.yxv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class CryptInterceptor extends bxm {

    /* JADX INFO: renamed from: b */
    public String f7253b;

    public CryptInterceptor(Context context) {
    }

    @Override // p002l.bxm
    /* JADX INFO: renamed from: a */
    public void mo9115a(vq4 vq4Var) throws Exception {
        s460 s460VarMo18695c = vq4Var.mo18695c();
        wkf0 wkf0VarM22194b = s460VarMo18695c.m22194b();
        if (wkf0VarM22194b.m24687f()) {
            m9119f(s460VarMo18695c, vq4Var.mo18694b().m17157m());
        } else if (wkf0VarM22194b.m24686e()) {
            try {
                this.f7253b = m9121h(s460VarMo18695c, vq4Var.mo18694b().m17157m());
            } catch (Exception e) {
                vq4Var.mo18694b().m17157m().mo26979b(e);
                if (TextUtils.isEmpty(this.f7253b)) {
                    throw e;
                }
                return;
            }
        } else if (wkf0VarM22194b.m24688g()) {
            if (TextUtils.isEmpty(this.f7253b)) {
                return;
            }
            try {
                m9120g(s460VarMo18695c);
            } catch (Exception e2) {
                vq4Var.mo18694b().m17157m().mo26979b(e2);
                return;
            }
        }
        vq4Var.mo18693a(s460VarMo18695c);
    }

    @Override // p002l.bxm
    /* JADX INFO: renamed from: b */
    public void mo9116b(vq4 vq4Var) throws Exception {
        s460 s460VarMo18695c = vq4Var.mo18695c();
        if (vq4Var.call() instanceof lur) {
            String strC = jgw.e().c(ypv.e, he2.b(s460VarMo18695c.m22193a()));
            if (!TextUtils.isEmpty(strC)) {
                s460VarMo18695c.m22196d(strC.getBytes());
            }
        } else if (vq4Var.call() instanceof qat) {
            String strA = jgw.a(this.f7253b, he2.b(s460VarMo18695c.m22193a()), 1);
            if (!TextUtils.isEmpty(strA)) {
                s460VarMo18695c.m22196d(strA.getBytes());
            }
        }
        vq4Var.mo18693a(s460VarMo18695c);
    }

    @Override // p002l.bxm
    /* JADX INFO: renamed from: d */
    public void mo9118d() {
        super.mo9118d();
        this.f7253b = null;
    }

    /* JADX INFO: renamed from: f */
    public final void m9119f(s460 s460Var, yxv yxvVar) throws IOException, Auth.AuthException {
        String strString = ByteString.of(s460Var.m22193a()).string(Charset.forName("utf-8"));
        BLiveAuthRecivedData bLiveAuthRecivedData = (BLiveAuthRecivedData) BLiveAuthRecivedData.JSON_ADAPTER.parse(strString);
        yxvVar.mo26978a(w8u.m("CryptInterceptor checkConnectKey receive data:" + bLiveAuthRecivedData.toJson()));
        boolean zB = jgw.e().b(bLiveAuthRecivedData.pubKey, bLiveAuthRecivedData.sign);
        yxvVar.mo26978a(w8u.m("CryptInterceptor checkConnectKey result:" + zB));
        if (!zB) {
            throw new Auth.AuthException("LiveAuthFactory checkConnectKey Failed");
        }
        s460Var.m22196d(strString.getBytes());
    }

    /* JADX INFO: renamed from: g */
    public final void m9120g(s460 s460Var) throws Exception {
        byte[] bArrM22193a = s460Var.m22193a();
        String strA = jgw.a(this.f7253b, new String(bArrM22193a, StandardCharsets.UTF_8), 2);
        if (!TextUtils.isEmpty(strA)) {
            s460Var.m22196d(he2.a(strA.getBytes()));
            return;
        }
        throw new CryptoFailException("crypt data error: " + Arrays.toString(bArrM22193a));
    }

    /* JADX INFO: renamed from: h */
    public final String m9121h(s460 s460Var, yxv yxvVar) throws Exception {
        byte[] bArrM22193a = s460Var.m22193a();
        jgw jgwVarE = jgw.e();
        Application application = ypv.e;
        Charset charset = StandardCharsets.UTF_8;
        String strD = jgwVarE.d(application, new String(bArrM22193a, charset));
        if (!TextUtils.isEmpty(strD)) {
            byte[] bArrA = he2.a(strD.getBytes());
            liveAuthMessageNew.AuthKey authKeyB = li60.b(liveAuthMessageNew.AuthKey.class, new j9t().m15779a(bArrA).getData());
            s460Var.m22196d(bArrA);
            yxvVar.mo26978a(w8u.m("CryptInterceptor parserRoomKey result:" + authKeyB.getRoomKey()));
            return authKeyB.getRoomKey();
        }
        try {
            String string = ypv.e.getSharedPreferences("ssconfig", 0).getString("uuid", "error");
            yxvVar.mo26978a(w8u.m("CryptInterceptor key=" + string));
            yxvVar.mo26978a(w8u.m("CryptInterceptor cryptData =".concat(new String(bArrM22193a, charset))));
            throw new CryptoFailException("CryptInterceptor parser room key error, key = " + string + ", cryptData = " + new String(bArrM22193a, charset));
        } catch (Exception e) {
            CrashHelper.c(e);
            throw new CryptoFailException("CryptInterceptor parser room key error, bytes:" + Arrays.toString(bArrM22193a), e);
        }
    }

    public static class CryptoFailException extends RuntimeException {
        public CryptoFailException(String str) {
            super(str);
        }

        public CryptoFailException(String str, Throwable th) {
            super(str, th);
        }
    }
}
