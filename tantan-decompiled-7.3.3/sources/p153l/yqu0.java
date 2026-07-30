package p153l;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class yqu0 extends ams0 {

    /* JADX INFO: renamed from: a */
    public final Context f201256a;

    /* JADX INFO: renamed from: b */
    public final ulu0 f201257b;

    /* JADX INFO: renamed from: c */
    public anu0 f201258c;

    /* JADX INFO: renamed from: d */
    public ilu0 f201259d;

    public yqu0(Context context, ulu0 ulu0Var, anu0 anu0Var, ilu0 ilu0Var) {
        this.f201256a = context;
        this.f201257b = ulu0Var;
        this.f201258c = anu0Var;
        this.f201259d = ilu0Var;
    }

    @Override // p153l.bms0
    /* JADX INFO: renamed from: B */
    public final als0 mo105255B(String str) {
        return (als0) this.f201257b.m196585U().get(str);
    }

    @Override // p153l.bms0
    /* JADX INFO: renamed from: H */
    public final boolean mo105256H(p1m p1mVar) {
        anu0 anu0Var;
        Object objM134037P2 = h950.m134037P2(p1mVar);
        if (!(objM134037P2 instanceof ViewGroup) || (anu0Var = this.f201258c) == null || !anu0Var.m99035f((ViewGroup) objM134037P2)) {
            return false;
        }
        this.f201257b.m196598d0().mo13709F(m217135q8("_videoMediaView"));
        return true;
    }

    @Override // p153l.bms0
    /* JADX INFO: renamed from: a */
    public final boolean mo105257a() {
        ilu0 ilu0Var = this.f201259d;
        return (ilu0Var == null || ilu0Var.m140681D()) && this.f201257b.m196600e0() != null && this.f201257b.m196602f0() == null;
    }

    @Override // p153l.bms0
    /* JADX INFO: renamed from: c5 */
    public final void mo105258c5(p1m p1mVar) {
        ilu0 ilu0Var;
        Object objM134037P2 = h950.m134037P2(p1mVar);
        if (!(objM134037P2 instanceof View) || this.f201257b.m196605h0() == null || (ilu0Var = this.f201259d) == null) {
            return;
        }
        ilu0Var.m140712q((View) objM134037P2);
    }

    @Override // p153l.bms0
    /* JADX INFO: renamed from: d4 */
    public final String mo105259d4(String str) {
        return (String) this.f201257b.m196586V().get(str);
    }

    @Override // p153l.bms0
    /* JADX INFO: renamed from: o0 */
    public final boolean mo105260o0(p1m p1mVar) {
        anu0 anu0Var;
        Object objM134037P2 = h950.m134037P2(p1mVar);
        if (!(objM134037P2 instanceof ViewGroup) || (anu0Var = this.f201258c) == null || !anu0Var.m99036g((ViewGroup) objM134037P2)) {
            return false;
        }
        this.f201257b.m196602f0().mo13709F(m217135q8("_videoMediaView"));
        return true;
    }

    /* JADX INFO: renamed from: q8 */
    public final pks0 m217135q8(String str) {
        return new xqu0(this, "_videoMediaView");
    }

    @Override // p153l.bms0
    /* JADX INFO: renamed from: v */
    public final void mo105261v(String str) {
        ilu0 ilu0Var = this.f201259d;
        if (ilu0Var != null) {
            ilu0Var.m140708m(str);
        }
    }

    @Override // p153l.bms0
    public final lpu0 zze() {
        return this.f201257b.m196587W();
    }

    @Override // p153l.bms0
    public final xks0 zzf() throws RemoteException {
        try {
            return this.f201259d.m140691O().m150397a();
        } catch (NullPointerException e) {
            bxy0.m106933q().m120275w(e, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // p153l.bms0
    public final p1m zzh() {
        return h950.m134038Y2(this.f201256a);
    }

    @Override // p153l.bms0
    public final String zzi() {
        return this.f201257b.m196591a();
    }

    @Override // p153l.bms0
    public final List zzk() {
        try {
            oof0 oof0VarM196585U = this.f201257b.m196585U();
            oof0 oof0VarM196586V = this.f201257b.m196586V();
            String[] strArr = new String[oof0VarM196585U.size() + oof0VarM196586V.size()];
            int i = 0;
            for (int i2 = 0; i2 < oof0VarM196585U.size(); i2++) {
                strArr[i] = (String) oof0VarM196585U.m168582i(i2);
                i++;
            }
            for (int i3 = 0; i3 < oof0VarM196586V.size(); i3++) {
                strArr[i] = (String) oof0VarM196586V.m168582i(i3);
                i++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e) {
            bxy0.m106933q().m120275w(e, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // p153l.bms0
    public final void zzl() {
        ilu0 ilu0Var = this.f201259d;
        if (ilu0Var != null) {
            ilu0Var.mo127848b();
        }
        this.f201259d = null;
        this.f201258c = null;
    }

    @Override // p153l.bms0
    public final void zzm() {
        try {
            String strM196595c = this.f201257b.m196595c();
            if (Objects.equals(strM196595c, ThirdPushManager.VENDOR_TYPE_FCM)) {
                dct0.m115298g("Illegal argument specified for omid partner name.");
                return;
            }
            if (TextUtils.isEmpty(strM196595c)) {
                dct0.m115298g("Not starting OMID session. OM partner name has not been configured.");
                return;
            }
            ilu0 ilu0Var = this.f201259d;
            if (ilu0Var != null) {
                ilu0Var.m140692R(strM196595c, false);
            }
        } catch (NullPointerException e) {
            bxy0.m106933q().m120275w(e, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // p153l.bms0
    public final void zzo() {
        ilu0 ilu0Var = this.f201259d;
        if (ilu0Var != null) {
            ilu0Var.m140711p();
        }
    }

    @Override // p153l.bms0
    public final boolean zzt() {
        hfw0 hfw0VarM196605h0 = this.f201257b.m196605h0();
        if (hfw0VarM196605h0 == null) {
            dct0.m115298g("Trying to start OMID session before creation.");
            return false;
        }
        bxy0.m106917a().mo144394h(hfw0VarM196605h0);
        if (this.f201257b.m196600e0() == null) {
            return true;
        }
        this.f201257b.m196600e0().mo13728Z("onSdkLoaded", new l01());
        return true;
    }
}
