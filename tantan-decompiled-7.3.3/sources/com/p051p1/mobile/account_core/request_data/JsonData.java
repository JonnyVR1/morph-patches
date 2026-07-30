package com.p051p1.mobile.account_core.request_data;

import androidx.annotation.CallSuper;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.Serializable;
import java.util.Map;
import p153l.l01;

/* JADX INFO: loaded from: classes8.dex */
public class JsonData implements Serializable {
    private l01<String, String> extraData;

    public void addExtraData(String str, String str2) {
        if (this.extraData == null) {
            this.extraData = new l01<>();
        }
        this.extraData.put(str, str2);
    }

    @CallSuper
    public void checkNull() {
    }

    public String toJson() {
        checkNull();
        String json = new GsonBuilder().setLenient().create().toJson(this);
        l01<String, String> l01Var = this.extraData;
        if (l01Var == null || l01Var.size() <= 0) {
            return json;
        }
        JsonObject asJsonObject = new JsonParser().parse(json).getAsJsonObject();
        for (Map.Entry<String, String> entry : this.extraData.entrySet()) {
            try {
                asJsonObject.add(entry.getKey(), new JsonParser().parse(entry.getValue()).getAsJsonObject());
            } catch (Exception unused) {
                asJsonObject.addProperty(entry.getKey(), entry.getValue());
            }
        }
        asJsonObject.remove("extraData");
        return asJsonObject.toString();
    }
}
