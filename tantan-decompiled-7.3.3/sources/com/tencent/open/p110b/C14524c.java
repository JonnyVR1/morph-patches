package com.tencent.open.p110b;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.open.b.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14524c implements Serializable {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, String> f61059a;

    public C14524c(Bundle bundle) {
        this.f61059a = new HashMap<>();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                this.f61059a.put(str, bundle.getString(str));
            }
        }
    }

    public String toString() {
        return "BaseData{time=" + this.f61059a.get("time") + ", name=" + this.f61059a.get("interface_name") + '}';
    }

    public C14524c(HashMap<String, String> map) {
        this.f61059a = new HashMap<>(map);
    }
}
