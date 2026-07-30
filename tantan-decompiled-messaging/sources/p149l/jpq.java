package p149l;

import android.text.TextUtils;
import com.immomo.mwc.sdk.MWCEngine;
import com.quickjs.JSContext;
import com.quickjs.QuickJSException;

/* JADX INFO: loaded from: classes7.dex */
public class jpq extends v600 {

    /* JADX INFO: renamed from: b */
    private final String f119218b = MWCEngine.m19387r();

    /* JADX INFO: renamed from: c */
    private final String f119219c = MWCEngine.m19388s();

    @Override // com.quickjs.Plugin
    public void close(JSContext jSContext) {
        MWCEngine.m19380k("JsfModule", null, "jsf module context is closed @version=%s, @path=%s", this.f119219c, this.f119218b);
    }

    @Override // com.quickjs.Plugin
    public void setup(JSContext jSContext) {
        String strLoad = MWCEngine.m19392w().load(this.f119218b);
        if (TextUtils.isEmpty(strLoad)) {
            MWCEngine.m19382m("JsfModule", null, "jsf module setup with empty script @version=%s, @path=%s", this.f119219c, this.f119218b);
            return;
        }
        try {
            jSContext.executeVoidScript(strLoad, this.f119218b);
            MWCEngine.m19380k("JsfModule", null, "jsf module setup success @version=%s, @path=%s", this.f119219c, this.f119218b);
        } catch (QuickJSException e) {
            MWCEngine.m19382m("JsfModule", null, "jsf module setup QuickJSException @version=%s, @path=%s, @error=%s", this.f119219c, this.f119218b, e);
        }
    }
}
