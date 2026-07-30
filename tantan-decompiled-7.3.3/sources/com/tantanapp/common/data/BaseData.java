package com.tantanapp.common.data;

import com.tantanapp.android.injecter.routes.Injecter$$Intermediate$$b_core;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class BaseData extends ValueObject {
    public ArrayList<ValueObject> extList = new ArrayList<>();

    public void addAll(BaseData baseData) {
    }

    public void addExtData(ValueObject valueObject) {
        this.extList.add(valueObject);
    }

    public <T extends ValueObject> ArrayList<T> getExtValueList(Class<T> cls) {
        Injecter$$Intermediate$$b_core.C136911 c136911 = (ArrayList<T>) new ArrayList();
        for (ValueObject valueObject : this.extList) {
            if (cls.isInstance(valueObject)) {
                c136911.add(valueObject);
            }
        }
        return c136911;
    }
}
