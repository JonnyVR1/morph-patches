package com.p003p1.mobile.account_core.request_data;

import androidx.annotation.CallSuper;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.Serializable;
import java.util.Map;
import l.e01;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class JsonData implements Serializable {
    private e01<String, String> extraData;

    public void addExtraData(String str, String str2) {
        if (this.extraData == null) {
            this.extraData = new e01<>();
        }
        this.extraData.put(str, str2);
    }

    @CallSuper
    public void checkNull() {
    }

    public String toJson() {
        checkNull();
        String json = new GsonBuilder().setLenient().create().toJson(this);
        e01<String, String> e01Var = this.extraData;
        if (e01Var == null || e01Var.size() <= 0) {
            return json;
        }
        JsonObject asJsonObject = new JsonParser().parse(json).getAsJsonObject();
        for (Map.Entry entry : this.extraData.entrySet()) {
            try {
                asJsonObject.add((String) entry.getKey(), new JsonParser().parse((String) entry.getValue()).getAsJsonObject());
            } catch (Exception unused) {
                asJsonObject.addProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        asJsonObject.remove("extraData");
        return asJsonObject.toString();
    }
}
