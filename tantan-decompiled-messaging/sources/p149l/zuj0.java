package p149l;

import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.OMSAction;
import com.p046p1.mobile.putong.oms.OmsBaseRender;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public abstract class zuj0 {

    /* JADX INFO: renamed from: a */
    public OmsBaseRender f204856a;

    /* JADX INFO: renamed from: a */
    public boolean m220230a(OMSAction oMSAction, OmsBaseRender omsBaseRender) {
        if (!mo99646d().equals(oMSAction.type)) {
            return false;
        }
        m220232e(omsBaseRender);
        mo99645c(oMSAction);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m220231b() {
        OmsBaseRender omsBaseRender = this.f204856a;
        if (omsBaseRender.f54230j) {
            nc50 nc50VarM158912f = nc50.m158912f();
            if (nc50VarM158912f.m158916d(this.f204856a.f54222b.identifier)) {
                PutongAct putongActM158913a = nc50VarM158912f.m158913a(this.f204856a.f54222b.identifier);
                if (NullChecker.m81303a(putongActM158913a)) {
                    putongActM158913a.lambda$debugItems$19();
                }
            }
        } else {
            Dialog.C4309e c4309e = omsBaseRender.f54223c;
            if (NullChecker.m81303a(c4309e) && NullChecker.m81303a(c4309e.m20529Y())) {
                c4309e.m20529Y().dismiss();
            }
        }
        this.f204856a = null;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo99645c(OMSAction oMSAction);

    /* JADX INFO: renamed from: d */
    public abstract String mo99646d();

    /* JADX INFO: renamed from: e */
    public zuj0 m220232e(OmsBaseRender omsBaseRender) {
        this.f204856a = omsBaseRender;
        return this;
    }
}
