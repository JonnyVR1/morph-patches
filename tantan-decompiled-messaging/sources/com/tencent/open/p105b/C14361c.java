package com.tencent.open.p105b;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.open.b.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14361c implements Serializable {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, String> f60211a;

    public C14361c(Bundle bundle) {
        this.f60211a = new HashMap<>();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                this.f60211a.put(str, bundle.getString(str));
            }
        }
    }

    public String toString() {
        return "BaseData{time=" + this.f60211a.get("time") + ", name=" + this.f60211a.get("interface_name") + '}';
    }

    public C14361c(HashMap<String, String> map) {
        this.f60211a = new HashMap<>(map);
    }
}
