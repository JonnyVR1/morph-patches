package p149l;

import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class nqf extends mqf {

    /* JADX INFO: renamed from: c */
    private List<mqf> f140060c;

    public nqf(MKWebView mKWebView) {
        super(mKWebView);
    }

    @Override // p149l.fnl
    /* JADX INFO: renamed from: f */
    public void mo122327f() {
        if (m160621j()) {
            for (mqf mqfVar : this.f140060c) {
                if (mqfVar != null) {
                    mqfVar.mo122327f();
                }
            }
        }
    }

    @Override // p149l.fnl
    /* JADX INFO: renamed from: g */
    public void mo122328g() {
        if (m160621j()) {
            for (mqf mqfVar : this.f140060c) {
                if (mqfVar != null) {
                    mqfVar.mo122328g();
                }
            }
        }
    }

    @Override // p149l.mqf, p149l.fnl
    /* JADX INFO: renamed from: h */
    public boolean mo104437h(String str, String str2, JSONObject jSONObject) throws Exception {
        if (!m160621j()) {
            return false;
        }
        for (mqf mqfVar : this.f140060c) {
            if (mqfVar != null && mqfVar.mo104437h(str, str2, jSONObject)) {
                return true;
            }
        }
        return false;
    }

    @Override // p149l.mqf
    /* JADX INFO: renamed from: i */
    public void mo155888i() {
        if (m160621j()) {
            for (mqf mqfVar : this.f140060c) {
                if (mqfVar != null) {
                    mqfVar.mo155888i();
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m160621j() {
        List<mqf> list = this.f140060c;
        return list != null && list.size() > 0;
    }
}
