package org.eclipse.jetty.util.ajax;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import l.bz00;
import l.fg3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class JSONObjectConvertor implements JSON.Convertor {
    private Set _excluded;
    private boolean _fromJSON;

    public JSONObjectConvertor(boolean z, String[] strArr) {
        this._excluded = null;
        this._fromJSON = z;
        if (strArr != null) {
            this._excluded = new HashSet(Arrays.asList(strArr));
        }
    }

    @Override // org.eclipse.jetty.util.ajax.JSON.Convertor
    public Object fromJSON(Map map) {
        if (!this._fromJSON) {
            return map;
        }
        bz00.a();
        return null;
    }

    public boolean includeField(String str, Object obj, Method method) {
        Set set = this._excluded;
        return set == null || !set.contains(str);
    }

    @Override // org.eclipse.jetty.util.ajax.JSON.Convertor
    public void toJSON(Object obj, JSON.Output output) {
        String str;
        try {
            obj.getClass();
            if (this._fromJSON) {
                output.addClass(obj.getClass());
            }
            for (Method method : obj.getClass().getMethods()) {
                if (!Modifier.isStatic(method.getModifiers()) && method.getParameterTypes().length == 0 && method.getReturnType() != null && method.getDeclaringClass() != Object.class) {
                    String name = method.getName();
                    if (name.startsWith("is")) {
                        str = name.substring(2, 3).toLowerCase(Locale.ENGLISH) + name.substring(3);
                    } else if (name.startsWith("get")) {
                        str = name.substring(3, 4).toLowerCase(Locale.ENGLISH) + name.substring(4);
                    }
                    if (includeField(str, obj, method)) {
                        output.add(str, method.invoke(obj, null));
                    }
                }
            }
        } catch (Throwable th) {
            fg3.a(th);
        }
    }

    public JSONObjectConvertor(boolean z) {
        this._excluded = null;
        this._fromJSON = z;
    }

    public JSONObjectConvertor() {
        this._excluded = null;
        this._fromJSON = false;
    }
}
