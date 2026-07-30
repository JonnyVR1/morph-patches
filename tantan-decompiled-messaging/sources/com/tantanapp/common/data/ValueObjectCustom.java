package com.tantanapp.common.data;

import com.google.protobuf.nano.MessageNano;
import com.tantanapp.common.data.ValueObject;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ValueObjectCustom<D extends ValueObject> extends MessageNano implements Cloneable, Serializable {
    public static final double HACK_NULL = -231321.22322312d;
    protected int hashCode = 0;

    public static boolean util_equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static <T, R> Map<String, R> util_map(Map<String, T> map, w9j<T, R> w9jVar) {
        if (map == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, T> entry : map.entrySet()) {
            map2.put(entry.getKey(), w9jVar.call(entry.getValue()));
        }
        return map2;
    }

    public ValueObjectCustom beforeApiSerialize() {
        return this;
    }

    public boolean isFieldParsed(String str) {
        return true;
    }

    public void mergeData(D d) {
    }

    public void nullCheck() {
    }

    public void onApiParseComplete() {
    }

    public void putParsedField(String str) {
    }

    public void setParsedApiRequest(String str) {
    }

    public boolean shouldMergeData() {
        return false;
    }

    public String toJson() {
        return WeJson.EMPTY_MAP;
    }

    @Override // com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageNano mo223809clone() throws CloneNotSupportedException {
        return super.mo223809clone();
    }

    public static <T, R> List<R> util_map(List<T> list, w9j<T, R> w9jVar) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(w9jVar.call(it.next()));
        }
        return arrayList;
    }
}
