package p153l;

import android.webkit.JavascriptInterface;
import com.immomo.mwc.sdk.MWCEngine;
import com.quickjs.JSContext;
import com.quickjs.JSObject;

/* JADX INFO: loaded from: classes7.dex */
public class xx5 extends ef00 {

    /* JADX INFO: renamed from: b */
    private JSObject f196605b;

    @JavascriptInterface
    public final void debug(String str, String str2) {
        MWCEngine.m20359j("ConsoleModule", str, str2);
    }

    @JavascriptInterface
    public final void error(String str, String str2) {
        MWCEngine.m20348K(5, "ConsoleModule", str, str2);
    }

    @JavascriptInterface
    public final void info(String str, String str2) {
        MWCEngine.m20340C("ConsoleModule", str, str2);
    }

    @JavascriptInterface
    public final void log(String str, String str2) {
        MWCEngine.m20340C("ConsoleModule", str, str2);
    }

    @Override // com.quickjs.Plugin
    public void setup(JSContext jSContext) {
        this.f196605b = jSContext.addJavascriptInterface(this, "native_console");
    }

    @JavascriptInterface
    public final void warn(String str, String str2) {
        MWCEngine.m20353P("ConsoleModule", str, str2);
    }

    @Override // com.quickjs.Plugin
    public void close(JSContext jSContext) {
    }
}
