package p153l;

import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.OMSAction;
import com.p051p1.mobile.putong.oms.OmsBaseRender;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c4k0 {

    /* JADX INFO: renamed from: a */
    public OmsBaseRender f79710a;

    /* JADX INFO: renamed from: a */
    public boolean m107885a(OMSAction oMSAction, OmsBaseRender omsBaseRender) {
        if (!mo106292d().equals(oMSAction.type)) {
            return false;
        }
        m107887e(omsBaseRender);
        mo106291c(oMSAction);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m107886b() {
        OmsBaseRender omsBaseRender = this.f79710a;
        if (omsBaseRender.f55078j) {
            uk50 uk50VarM196472f = uk50.m196472f();
            if (uk50VarM196472f.m196476d(this.f79710a.f55070b.identifier)) {
                PutongAct putongActM196473a = uk50VarM196472f.m196473a(this.f79710a.f55070b.identifier);
                if (NullChecker.m82486a(putongActM196473a)) {
                    putongActM196473a.lambda$debugItems$19();
                }
            }
        } else {
            Dialog.C4460e c4460e = omsBaseRender.f55071c;
            if (NullChecker.m82486a(c4460e) && NullChecker.m82486a(c4460e.m21528Y())) {
                c4460e.m21528Y().dismiss();
            }
        }
        this.f79710a = null;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo106291c(OMSAction oMSAction);

    /* JADX INFO: renamed from: d */
    public abstract String mo106292d();

    /* JADX INFO: renamed from: e */
    public c4k0 m107887e(OmsBaseRender omsBaseRender) {
        this.f79710a = omsBaseRender;
        return this;
    }
}
