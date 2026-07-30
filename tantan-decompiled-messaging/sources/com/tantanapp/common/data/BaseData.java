package com.tantanapp.common.data;

import com.tantanapp.android.injecter.routes.Injecter$$Intermediate$$b_account;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BaseData extends ValueObject {
    public ArrayList<ValueObject> extList = new ArrayList<>();

    public void addAll(BaseData baseData) {
    }

    public void addExtData(ValueObject valueObject) {
        this.extList.add(valueObject);
    }

    public <T extends ValueObject> ArrayList<T> getExtValueList(Class<T> cls) {
        Injecter$$Intermediate$$b_account.C135271 c135271 = (ArrayList<T>) new ArrayList();
        for (ValueObject valueObject : this.extList) {
            if (cls.isInstance(valueObject)) {
                c135271.add(valueObject);
            }
        }
        return c135271;
    }
}
