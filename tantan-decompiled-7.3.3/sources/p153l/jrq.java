package p153l;

import android.text.TextUtils;
import com.immomo.mwc.sdk.MWCEngine;
import com.quickjs.JSContext;
import com.quickjs.QuickJSException;

/* JADX INFO: loaded from: classes7.dex */
public class jrq extends ef00 {

    /* JADX INFO: renamed from: b */
    private final String f122397b = MWCEngine.m20367r();

    /* JADX INFO: renamed from: c */
    private final String f122398c = MWCEngine.m20368s();

    @Override // com.quickjs.Plugin
    public void close(JSContext jSContext) {
        MWCEngine.m20360k("JsfModule", null, "jsf module context is closed @version=%s, @path=%s", this.f122398c, this.f122397b);
    }

    @Override // com.quickjs.Plugin
    public void setup(JSContext jSContext) {
        String strLoad = MWCEngine.m20372w().load(this.f122397b);
        if (TextUtils.isEmpty(strLoad)) {
            MWCEngine.m20362m("JsfModule", null, "jsf module setup with empty script @version=%s, @path=%s", this.f122398c, this.f122397b);
            return;
        }
        try {
            jSContext.executeVoidScript(strLoad, this.f122397b);
            MWCEngine.m20360k("JsfModule", null, "jsf module setup success @version=%s, @path=%s", this.f122398c, this.f122397b);
        } catch (QuickJSException e) {
            MWCEngine.m20362m("JsfModule", null, "jsf module setup QuickJSException @version=%s, @path=%s, @error=%s", this.f122398c, this.f122397b, e);
        }
    }
}
