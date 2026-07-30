package p009l;

import com.p000p1.mobile.putong.oms.OmsBaseRender;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.OMSAction;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class zuj0 {

    /* JADX INFO: renamed from: a */
    public OmsBaseRender f23916a;

    /* JADX INFO: renamed from: a */
    public boolean m25981a(OMSAction oMSAction, OmsBaseRender omsBaseRender) {
        if (!mo11785d().equals(oMSAction.type)) {
            return false;
        }
        m25983e(omsBaseRender);
        mo11784c(oMSAction);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m25982b() {
        OmsBaseRender omsBaseRender = this.f23916a;
        if (omsBaseRender.f7836j) {
            nc50 nc50VarM18839f = nc50.m18839f();
            if (nc50VarM18839f.m18843d(this.f23916a.f7828b.identifier)) {
                PutongAct putongActM18840a = nc50VarM18839f.m18840a(this.f23916a.f7828b.identifier);
                if (NullChecker.a(putongActM18840a)) {
                    putongActM18840a.finish();
                }
            }
        } else {
            Dialog.e eVar = omsBaseRender.f7829c;
            if (NullChecker.a(eVar) && NullChecker.a(eVar.Y())) {
                eVar.Y().dismiss();
            }
        }
        this.f23916a = null;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo11784c(OMSAction oMSAction);

    /* JADX INFO: renamed from: d */
    public abstract String mo11785d();

    /* JADX INFO: renamed from: e */
    public zuj0 m25983e(OmsBaseRender omsBaseRender) {
        this.f23916a = omsBaseRender;
        return this;
    }
}
