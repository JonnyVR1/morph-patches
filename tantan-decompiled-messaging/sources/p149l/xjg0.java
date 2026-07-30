package p149l;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class xjg0 extends ygg0 {
    @Override // p149l.gpg0
    /* JADX INFO: renamed from: a */
    public final void mo110226a() {
        this.f103801b.getClass();
        m214641g();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p149l.gpg0
    /* JADX INFO: renamed from: c */
    public final boolean mo110227c(String str, JSONObject jSONObject) {
        str.getClass();
        switch (str) {
            case "style":
                String strOptString = jSONObject.optString("prop");
                strOptString.getClass();
                switch (strOptString) {
                    case "height":
                        jSONObject.optInt("value");
                        break;
                    case "top":
                        jSONObject.optInt("value");
                        break;
                    case "left":
                        jSONObject.optInt("value");
                        break;
                    case "width":
                        jSONObject.optInt("value");
                        break;
                }
            case "hide":
            case "show":
                return true;
            default:
                return false;
        }
    }

    @Override // p149l.gpg0
    /* JADX INFO: renamed from: d */
    public final void mo110228d() {
    }
}
