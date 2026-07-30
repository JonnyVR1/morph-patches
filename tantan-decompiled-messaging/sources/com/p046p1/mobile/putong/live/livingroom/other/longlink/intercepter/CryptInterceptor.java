package com.p046p1.mobile.putong.live.livingroom.other.longlink.intercepter;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;
import com.p046p1.mobile.putong.live.base.data.BLiveAuthRecivedData;
import com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.auth.Auth;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import okio.ByteString;
import p149l.bxm;
import p149l.he2;
import p149l.j9t;
import p149l.jgw;
import p149l.li60;
import p149l.lur;
import p149l.qat;
import p149l.s460;
import p149l.vq4;
import p149l.w8u;
import p149l.wkf0;
import p149l.ypv;
import p149l.yxv;

/* JADX INFO: loaded from: classes4.dex */
public class CryptInterceptor extends bxm {

    /* JADX INFO: renamed from: b */
    public String f51211b;

    public CryptInterceptor(Context context) {
    }

    @Override // p149l.bxm
    /* JADX INFO: renamed from: a */
    public void mo75480a(vq4 vq4Var) throws Exception {
        s460 s460VarMo159107c = vq4Var.mo159107c();
        wkf0 wkf0VarM182209b = s460VarMo159107c.m182209b();
        if (wkf0VarM182209b.m203666f()) {
            m75484f(s460VarMo159107c, vq4Var.mo159106b().m149499m());
        } else if (wkf0VarM182209b.m203665e()) {
            try {
                this.f51211b = m75486h(s460VarMo159107c, vq4Var.mo159106b().m149499m());
            } catch (Exception e) {
                vq4Var.mo159106b().m149499m().mo216486b(e);
                if (TextUtils.isEmpty(this.f51211b)) {
                    throw e;
                }
                return;
            }
        } else if (wkf0VarM182209b.m203667g()) {
            if (TextUtils.isEmpty(this.f51211b)) {
                return;
            }
            try {
                m75485g(s460VarMo159107c);
            } catch (Exception e2) {
                vq4Var.mo159106b().m149499m().mo216486b(e2);
                return;
            }
        }
        vq4Var.mo159105a(s460VarMo159107c);
    }

    @Override // p149l.bxm
    /* JADX INFO: renamed from: b */
    public void mo75481b(vq4 vq4Var) throws Exception {
        s460 s460VarMo159107c = vq4Var.mo159107c();
        if (vq4Var.call() instanceof lur) {
            String strM141355c = jgw.m141351e().m141355c(ypv.f199497e, he2.m130617b(s460VarMo159107c.m182208a()));
            if (!TextUtils.isEmpty(strM141355c)) {
                s460VarMo159107c.m182211d(strM141355c.getBytes());
            }
        } else if (vq4Var.call() instanceof qat) {
            String strM141350a = jgw.m141350a(this.f51211b, he2.m130617b(s460VarMo159107c.m182208a()), 1);
            if (!TextUtils.isEmpty(strM141350a)) {
                s460VarMo159107c.m182211d(strM141350a.getBytes());
            }
        }
        vq4Var.mo159105a(s460VarMo159107c);
    }

    @Override // p149l.bxm
    /* JADX INFO: renamed from: d */
    public void mo75483d() {
        super.mo75483d();
        this.f51211b = null;
    }

    /* JADX INFO: renamed from: f */
    public final void m75484f(s460 s460Var, yxv yxvVar) throws IOException, Auth.AuthException {
        String strString = ByteString.m221050of(s460Var.m182208a()).string(Charset.forName("utf-8"));
        BLiveAuthRecivedData bLiveAuthRecivedData = BLiveAuthRecivedData.JSON_ADAPTER.parse(strString);
        yxvVar.mo216485a(w8u.m202210m("CryptInterceptor checkConnectKey receive data:" + bLiveAuthRecivedData.toJson()));
        boolean zM141354b = jgw.m141351e().m141354b(bLiveAuthRecivedData.pubKey, bLiveAuthRecivedData.sign);
        yxvVar.mo216485a(w8u.m202210m("CryptInterceptor checkConnectKey result:" + zM141354b));
        if (!zM141354b) {
            throw new Auth.AuthException("LiveAuthFactory checkConnectKey Failed");
        }
        s460Var.m182211d(strString.getBytes());
    }

    /* JADX INFO: renamed from: g */
    public final void m75485g(s460 s460Var) throws Exception {
        byte[] bArrM182208a = s460Var.m182208a();
        String strM141350a = jgw.m141350a(this.f51211b, new String(bArrM182208a, StandardCharsets.UTF_8), 2);
        if (!TextUtils.isEmpty(strM141350a)) {
            s460Var.m182211d(he2.m130616a(strM141350a.getBytes()));
            return;
        }
        throw new CryptoFailException("crypt data error: " + Arrays.toString(bArrM182208a));
    }

    /* JADX INFO: renamed from: h */
    public final String m75486h(s460 s460Var, yxv yxvVar) throws Exception {
        byte[] bArrM182208a = s460Var.m182208a();
        jgw jgwVarM141351e = jgw.m141351e();
        Application application = ypv.f199497e;
        Charset charset = StandardCharsets.UTF_8;
        String strM141356d = jgwVarM141351e.m141356d(application, new String(bArrM182208a, charset));
        if (!TextUtils.isEmpty(strM141356d)) {
            byte[] bArrM130616a = he2.m130616a(strM141356d.getBytes());
            liveAuthMessageNew.AuthKey authKey = (liveAuthMessageNew.AuthKey) li60.m149879b(liveAuthMessageNew.AuthKey.class, new j9t().m140586a(bArrM130616a).getData());
            s460Var.m182211d(bArrM130616a);
            yxvVar.mo216485a(w8u.m202210m("CryptInterceptor parserRoomKey result:" + authKey.getRoomKey()));
            return authKey.getRoomKey();
        }
        try {
            String string = ypv.f199497e.getSharedPreferences("ssconfig", 0).getString("uuid", "error");
            yxvVar.mo216485a(w8u.m202210m("CryptInterceptor key=" + string));
            yxvVar.mo216485a(w8u.m202210m("CryptInterceptor cryptData =".concat(new String(bArrM182208a, charset))));
            throw new CryptoFailException("CryptInterceptor parser room key error, key = " + string + ", cryptData = " + new String(bArrM182208a, charset));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            throw new CryptoFailException("CryptInterceptor parser room key error, bytes:" + Arrays.toString(bArrM182208a), e);
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
