package org.fourthline.cling.model.types.csv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.fourthline.cling.model.ModelUtil;
import org.fourthline.cling.model.types.Datatype;
import org.fourthline.cling.model.types.InvalidValueException;
import org.seamless.util.Reflections;
import p003l.f0c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class CSV<T> extends ArrayList<T> {
    protected final Datatype.Builtin datatype = getBuiltinDatatype();

    public CSV(String str) throws InvalidValueException {
        addAll(parseString(str));
    }

    public Datatype.Builtin getBuiltinDatatype() throws InvalidValueException {
        Class<?> cls = Reflections.getTypeArguments(ArrayList.class, getClass()).get(0);
        Datatype.Default byJavaType = Datatype.Default.getByJavaType(cls);
        if (byJavaType != null) {
            return byJavaType.getBuiltinType();
        }
        f0c.m3956a("No built-in UPnP datatype for Java type of CSV: ", cls);
        return null;
    }

    public List parseString(String str) throws InvalidValueException {
        String[] strArrFromCommaSeparatedList = ModelUtil.fromCommaSeparatedList(str);
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrFromCommaSeparatedList) {
            arrayList.add(this.datatype.getDatatype().valueOf(str2));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            arrayList.add(this.datatype.getDatatype().getString(it.next()));
        }
        return ModelUtil.toCommaSeparatedList(arrayList.toArray(new Object[arrayList.size()]));
    }

    public CSV() {
    }
}
