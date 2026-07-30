package org.eclipse.jetty.util.ajax;

import java.lang.reflect.Method;
import java.util.Map;
import org.eclipse.jetty.util.Loader;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.seamless.xhtml.XHTML;
import p149l.bz00;
import p149l.pkq0;

/* JADX INFO: loaded from: classes3.dex */
public class JSONEnumConvertor implements JSON.Convertor {
    private static final Logger LOG = Log.getLogger((Class<?>) JSONEnumConvertor.class);
    private boolean _fromJSON;
    private Method _valueOf;

    public JSONEnumConvertor(boolean z) {
        try {
            this._valueOf = Loader.loadClass(getClass(), "java.lang.Enum").getMethod("valueOf", Class.class, String.class);
            this._fromJSON = z;
        } catch (Exception e) {
            pkq0.m170054a("!Enums", e);
            throw null;
        }
    }

    @Override // org.eclipse.jetty.util.ajax.JSON.Convertor
    public Object fromJSON(Map map) {
        if (!this._fromJSON) {
            bz00.m104536a();
            return null;
        }
        try {
            return this._valueOf.invoke(null, Loader.loadClass(getClass(), (String) map.get(XHTML.ATTR.CLASS)), map.get("value"));
        } catch (Exception e) {
            LOG.warn(e);
            return null;
        }
    }

    @Override // org.eclipse.jetty.util.ajax.JSON.Convertor
    public void toJSON(Object obj, JSON.Output output) {
        if (!this._fromJSON) {
            output.add(obj.toString());
        } else {
            output.addClass(obj.getClass());
            output.add("value", obj.toString());
        }
    }

    public JSONEnumConvertor() {
        this(false);
    }
}
