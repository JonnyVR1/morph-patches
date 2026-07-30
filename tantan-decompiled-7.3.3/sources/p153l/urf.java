package p153l;

import android.content.Intent;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class urf extends trf {

    /* JADX INFO: renamed from: c */
    private List<trf> f180609c;

    public urf(hul hulVar) {
        super(hulVar);
    }

    @Override // p153l.trf, p153l.qpl
    /* JADX INFO: renamed from: f */
    public boolean mo18017f(int i, int i2, Intent intent) {
        if (!m197516r()) {
            return false;
        }
        for (trf trfVar : this.f180609c) {
            if (trfVar != null && trfVar.mo18017f(i, i2, intent)) {
                return true;
            }
        }
        return false;
    }

    @Override // p153l.trf, p153l.qpl
    /* JADX INFO: renamed from: l */
    public void mo121328l() {
        if (m197516r()) {
            for (trf trfVar : this.f180609c) {
                if (trfVar != null) {
                    trfVar.mo121328l();
                }
            }
        }
    }

    @Override // p153l.qpl
    /* JADX INFO: renamed from: m */
    public void mo177468m() {
        if (m197516r()) {
            for (trf trfVar : this.f180609c) {
                if (trfVar != null) {
                    trfVar.mo177468m();
                }
            }
        }
    }

    @Override // p153l.qpl
    /* JADX INFO: renamed from: n */
    public void mo177469n() {
        if (m197516r()) {
            for (trf trfVar : this.f180609c) {
                if (trfVar != null) {
                    trfVar.mo177469n();
                }
            }
        }
    }

    @Override // p153l.trf, p153l.qpl
    /* JADX INFO: renamed from: o */
    public void mo98811o(int i, String[] strArr, int[] iArr) {
        if (m197516r()) {
            for (trf trfVar : this.f180609c) {
                if (trfVar != null) {
                    trfVar.mo98811o(i, strArr, iArr);
                }
            }
        }
    }

    @Override // p153l.trf, p153l.qpl
    /* JADX INFO: renamed from: p */
    public boolean mo18018p(String str, String str2, JSONObject jSONObject) throws Exception {
        if (!m197516r()) {
            return false;
        }
        for (trf trfVar : this.f180609c) {
            if (trfVar != null && trfVar.mo18018p(str, str2, jSONObject)) {
                return true;
            }
        }
        return false;
    }

    @Override // p153l.trf
    /* JADX INFO: renamed from: q */
    public void mo192476q(int i, int i2, Intent intent) {
        if (m197516r()) {
            for (trf trfVar : this.f180609c) {
                if (trfVar != null) {
                    trfVar.mo192476q(i, i2, intent);
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m197516r() {
        List<trf> list = this.f180609c;
        return list != null && list.size() > 0;
    }
}
