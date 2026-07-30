package p153l;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class fsg0 extends gpg0 {
    @Override // p153l.oxg0
    /* JADX INFO: renamed from: a */
    public final void mo112981a() {
        this.f149667b.getClass();
        m131257g();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p153l.oxg0
    /* JADX INFO: renamed from: c */
    public final boolean mo112982c(String str, JSONObject jSONObject) {
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

    @Override // p153l.oxg0
    /* JADX INFO: renamed from: d */
    public final void mo112983d() {
    }
}
