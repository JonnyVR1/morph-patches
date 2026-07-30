package com.p051p1.mobile.putong.live.livingroom.other.longlink.intercepter;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;
import com.p051p1.mobile.putong.live.base.data.BLiveAuthRecivedData;
import com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.auth.Auth;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import okio.ByteString;
import p153l.bzm;
import p153l.ftf0;
import p153l.hiw;
import p153l.kbt;
import p153l.mwr;
import p153l.pe2;
import p153l.qq60;
import p153l.rct;
import p153l.ur4;
import p153l.vzv;
import p153l.xau;
import p153l.yc60;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class CryptInterceptor extends bzm {

    /* JADX INFO: renamed from: b */
    public String f52059b;

    public CryptInterceptor(Context context) {
    }

    @Override // p153l.bzm
    /* JADX INFO: renamed from: a */
    public void mo76663a(ur4 ur4Var) throws Exception {
        yc60 yc60VarMo196644c = ur4Var.mo196644c();
        ftf0 ftf0VarM215136b = yc60VarMo196644c.m215136b();
        if (ftf0VarM215136b.m127318f()) {
            m76667f(yc60VarMo196644c, ur4Var.mo196643b().m186795m());
        } else if (ftf0VarM215136b.m127317e()) {
            try {
                this.f52059b = m76669h(yc60VarMo196644c, ur4Var.mo196643b().m186795m());
            } catch (Exception e) {
                ur4Var.mo196643b().m186795m().mo204127b(e);
                if (TextUtils.isEmpty(this.f52059b)) {
                    throw e;
                }
                return;
            }
        } else if (ftf0VarM215136b.m127319g()) {
            if (TextUtils.isEmpty(this.f52059b)) {
                return;
            }
            try {
                m76668g(yc60VarMo196644c);
            } catch (Exception e2) {
                ur4Var.mo196643b().m186795m().mo204127b(e2);
                return;
            }
        }
        ur4Var.mo196642a(yc60VarMo196644c);
    }

    @Override // p153l.bzm
    /* JADX INFO: renamed from: b */
    public void mo76664b(ur4 ur4Var) throws Exception {
        yc60 yc60VarMo196644c = ur4Var.mo196644c();
        if (ur4Var.call() instanceof mwr) {
            String strM135180c = hiw.m135176e().m135180c(zrv.f205803e, pe2.m171914b(yc60VarMo196644c.m215135a()));
            if (!TextUtils.isEmpty(strM135180c)) {
                yc60VarMo196644c.m215138d(strM135180c.getBytes());
            }
        } else if (ur4Var.call() instanceof rct) {
            String strM135175a = hiw.m135175a(this.f52059b, pe2.m171914b(yc60VarMo196644c.m215135a()), 1);
            if (!TextUtils.isEmpty(strM135175a)) {
                yc60VarMo196644c.m215138d(strM135175a.getBytes());
            }
        }
        ur4Var.mo196642a(yc60VarMo196644c);
    }

    @Override // p153l.bzm
    /* JADX INFO: renamed from: d */
    public void mo76666d() {
        super.mo76666d();
        this.f52059b = null;
    }

    /* JADX INFO: renamed from: f */
    public final void m76667f(yc60 yc60Var, vzv vzvVar) throws IOException, Auth.AuthException {
        String strString = ByteString.m222317of(yc60Var.m215135a()).string(Charset.forName("utf-8"));
        BLiveAuthRecivedData bLiveAuthRecivedData = BLiveAuthRecivedData.JSON_ADAPTER.parse(strString);
        vzvVar.mo204126a(xau.m209903m("CryptInterceptor checkConnectKey receive data:" + bLiveAuthRecivedData.toJson()));
        boolean zM135179b = hiw.m135176e().m135179b(bLiveAuthRecivedData.pubKey, bLiveAuthRecivedData.sign);
        vzvVar.mo204126a(xau.m209903m("CryptInterceptor checkConnectKey result:" + zM135179b));
        if (!zM135179b) {
            throw new Auth.AuthException("LiveAuthFactory checkConnectKey Failed");
        }
        yc60Var.m215138d(strString.getBytes());
    }

    /* JADX INFO: renamed from: g */
    public final void m76668g(yc60 yc60Var) throws Exception {
        byte[] bArrM215135a = yc60Var.m215135a();
        String strM135175a = hiw.m135175a(this.f52059b, new String(bArrM215135a, StandardCharsets.UTF_8), 2);
        if (!TextUtils.isEmpty(strM135175a)) {
            yc60Var.m215138d(pe2.m171913a(strM135175a.getBytes()));
            return;
        }
        throw new CryptoFailException("crypt data error: " + Arrays.toString(bArrM215135a));
    }

    /* JADX INFO: renamed from: h */
    public final String m76669h(yc60 yc60Var, vzv vzvVar) throws Exception {
        byte[] bArrM215135a = yc60Var.m215135a();
        hiw hiwVarM135176e = hiw.m135176e();
        Application application = zrv.f205803e;
        Charset charset = StandardCharsets.UTF_8;
        String strM135181d = hiwVarM135176e.m135181d(application, new String(bArrM215135a, charset));
        if (!TextUtils.isEmpty(strM135181d)) {
            byte[] bArrM171913a = pe2.m171913a(strM135181d.getBytes());
            liveAuthMessageNew.AuthKey authKey = (liveAuthMessageNew.AuthKey) qq60.m177481b(liveAuthMessageNew.AuthKey.class, new kbt().m149077a(bArrM171913a).getData());
            yc60Var.m215138d(bArrM171913a);
            vzvVar.mo204126a(xau.m209903m("CryptInterceptor parserRoomKey result:" + authKey.getRoomKey()));
            return authKey.getRoomKey();
        }
        try {
            String string = zrv.f205803e.getSharedPreferences("ssconfig", 0).getString("uuid", "error");
            vzvVar.mo204126a(xau.m209903m("CryptInterceptor key=" + string));
            vzvVar.mo204126a(xau.m209903m("CryptInterceptor cryptData =".concat(new String(bArrM215135a, charset))));
            throw new CryptoFailException("CryptInterceptor parser room key error, key = " + string + ", cryptData = " + new String(bArrM215135a, charset));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            throw new CryptoFailException("CryptInterceptor parser room key error, bytes:" + Arrays.toString(bArrM215135a), e);
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
