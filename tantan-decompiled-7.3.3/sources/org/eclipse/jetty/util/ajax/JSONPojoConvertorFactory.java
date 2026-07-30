package org.eclipse.jetty.util.ajax;

import java.util.Map;
import org.eclipse.jetty.util.Loader;
import org.seamless.xhtml.XHTML;
import p153l.fig0;

/* JADX INFO: loaded from: classes2.dex */
public class JSONPojoConvertorFactory implements JSON.Convertor {
    private final boolean _fromJson;
    private final JSON _json;

    public JSONPojoConvertorFactory(JSON json) {
        if (json == null) {
            fig0.m125680a();
            throw null;
        }
        this._json = json;
        this._fromJson = true;
    }

    @Override // org.eclipse.jetty.util.ajax.JSON.Convertor
    public Object fromJSON(Map map) {
        String str = (String) map.get(XHTML.ATTR.CLASS);
        if (str != null) {
            JSON.Convertor convertorFor = this._json.getConvertorFor(str);
            if (convertorFor == null) {
                try {
                    JSONPojoConvertor jSONPojoConvertor = new JSONPojoConvertor((Class<?>) Loader.loadClass(JSON.class, str), this._fromJson);
                    try {
                        this._json.addConvertorFor(str, jSONPojoConvertor);
                        convertorFor = jSONPojoConvertor;
                    } catch (ClassNotFoundException e) {
                        e = e;
                        convertorFor = jSONPojoConvertor;
                        JSON.LOG.warn(e);
                    }
                } catch (ClassNotFoundException e2) {
                    e = e2;
                }
            }
            if (convertorFor != null) {
                return convertorFor.fromJSON(map);
            }
        }
        return map;
    }

    @Override // org.eclipse.jetty.util.ajax.JSON.Convertor
    public void toJSON(Object obj, JSON.Output output) {
        String name = obj.getClass().getName();
        JSON.Convertor convertorFor = this._json.getConvertorFor(name);
        if (convertorFor == null) {
            try {
                JSONPojoConvertor jSONPojoConvertor = new JSONPojoConvertor((Class<?>) Loader.loadClass(JSON.class, name), this._fromJson);
                try {
                    this._json.addConvertorFor(name, jSONPojoConvertor);
                    convertorFor = jSONPojoConvertor;
                } catch (ClassNotFoundException e) {
                    e = e;
                    convertorFor = jSONPojoConvertor;
                    JSON.LOG.warn(e);
                }
            } catch (ClassNotFoundException e2) {
                e = e2;
            }
        }
        if (convertorFor != null) {
            convertorFor.toJSON(obj, output);
        }
    }

    public JSONPojoConvertorFactory(JSON json, boolean z) {
        if (json != null) {
            this._json = json;
            this._fromJson = z;
        } else {
            fig0.m125680a();
            throw null;
        }
    }
}
