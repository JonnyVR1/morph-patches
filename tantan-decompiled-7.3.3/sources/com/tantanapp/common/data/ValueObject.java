package com.tantanapp.common.data;

import android.text.TextUtils;
import com.google.protobuf.nano.MessageNano;
import com.tantanapp.common.data.ValueObject;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.jyb;
import p153l.qcj;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ValueObject<D extends ValueObject> extends MessageNano implements Cloneable, Serializable {
    public static final double HACK_NULL = -231321.22322312d;
    protected int hashCode = 0;
    public HashMap<String, String> moduleTransFillValue = new HashMap<>();
    private ArrayList<ValueObject> parseList = null;

    public static boolean util_equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static <T, R> Map<String, R> util_map(Map<String, T> map, qcj<T, R> qcjVar) {
        if (map == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, T> entry : map.entrySet()) {
            map2.put(entry.getKey(), qcjVar.call(entry.getValue()));
        }
        return map2;
    }

    public void addExtraData(ValueObject valueObject) {
        if (this.parseList == null) {
            this.parseList = new ArrayList<>();
        }
        for (ValueObject valueObject2 : this.parseList) {
            if (TextUtils.equals(valueObject2.getClass().getName(), valueObject.getClass().getName())) {
                this.parseList.remove(valueObject2);
                break;
            }
        }
        this.parseList.add(valueObject);
    }

    public ValueObject beforeApiSerialize() {
        return this;
    }

    public void clearTransValue() {
        this.moduleTransFillValue.clear();
    }

    public void copyTransValue(ValueObject valueObject) {
        if (this.moduleTransFillValue.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : this.moduleTransFillValue.entrySet()) {
            valueObject.setFillTransValue(entry.getKey(), entry.getValue());
        }
    }

    @Deprecated
    public void createTransValue() {
    }

    public String getClassParseName() {
        return "";
    }

    public long getCopyId() {
        return -1L;
    }

    public ArrayList<ValueObject> getExtList() {
        return this.parseList;
    }

    public <T> T getExtTabData(Class<T> cls) {
        if (jyb.m147479J(this.parseList)) {
            return null;
        }
        Iterator<ValueObject> it = this.parseList.iterator();
        while (it.hasNext()) {
            T t = (T) ((ValueObject) it.next());
            if (cls.isInstance(t)) {
                return t;
            }
        }
        return null;
    }

    public String getFillTransValue(String str) {
        return this.moduleTransFillValue.get(str);
    }

    public boolean hasCopyId() {
        return false;
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

    public void removeExtTable(ValueObject valueObject) {
        ArrayList<ValueObject> arrayList = this.parseList;
        if (arrayList == null) {
            return;
        }
        for (ValueObject valueObject2 : arrayList) {
            if (TextUtils.equals(valueObject2.getClass().getName(), valueObject.getClass().getName())) {
                this.parseList.remove(valueObject2);
                return;
            }
        }
    }

    public void setCopyId(long j) {
    }

    public void setExtList(ArrayList<ValueObject> arrayList) {
        if (jyb.m147479J(arrayList)) {
            return;
        }
        ArrayList<ValueObject> arrayList2 = this.parseList;
        if (arrayList2 == null) {
            this.parseList = new ArrayList<>();
        } else {
            arrayList2.clear();
        }
        this.parseList.addAll(arrayList);
    }

    public void setExtTabList(ArrayList<ValueObject> arrayList) {
        this.parseList = arrayList;
    }

    public void setFillTransValue(String str, String str2) {
        this.moduleTransFillValue.put(str, str2);
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
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public MessageNano mo225055clone() throws CloneNotSupportedException {
        return super.mo225055clone();
    }

    public static <T, R> List<R> util_map(List<T> list, qcj<T, R> qcjVar) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(qcjVar.call(it.next()));
        }
        return arrayList;
    }
}
