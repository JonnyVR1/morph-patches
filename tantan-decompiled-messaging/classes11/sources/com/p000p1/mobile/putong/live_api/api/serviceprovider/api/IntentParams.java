package com.p000p1.mobile.putong.live_api.api.serviceprovider.api;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p1.mobile.putong.data.Live;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import l.bqd0;
import l.fpd0;
import l.v050;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntentParams extends ValueObject implements Serializable {
    public static JsonAdapter<IntentParams> JSON_ADAPTER = new ObjectJsonAdapter<IntentParams>() { // from class: com.p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams.1
        public Class getDataClass() {
            return IntentParams.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntentParams m26153newInstance() {
            return new IntentParams();
        }

        public boolean parseField(IntentParams intentParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "liveId":
                    intentParams.liveId = jsonParser.getValueAsString();
                    return true;
                case "source":
                    intentParams.source = jsonParser.getValueAsString();
                    return true;
                case "open":
                    intentParams.open = jsonParser.getValueAsString();
                    return true;
                case "category":
                    intentParams.category = jsonParser.getValueAsString();
                    return true;
                case "showSignInDialog":
                    intentParams.showSignInDialog = jsonParser.getValueAsBoolean();
                    return true;
                case "requestExtra":
                    intentParams.requestExtra = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntentParams intentParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "liveId":
                case "source":
                case "open":
                case "category":
                case "showSignInDialog":
                case "requestExtra":
                    return true;
                default:
                    return super.parseFieldCheck(intentParams, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(IntentParams intentParams, JsonGenerator jsonGenerator) throws IOException {
            String str = intentParams.liveId;
            if (str != null) {
                jsonGenerator.writeStringField("liveId", str);
            }
            String str2 = intentParams.source;
            if (str2 != null) {
                jsonGenerator.writeStringField("source", str2);
            }
            String str3 = intentParams.category;
            if (str3 != null) {
                jsonGenerator.writeStringField("category", str3);
            }
            String str4 = intentParams.open;
            if (str4 != null) {
                jsonGenerator.writeStringField("open", str4);
            }
            String str5 = intentParams.requestExtra;
            if (str5 != null) {
                jsonGenerator.writeStringField("requestExtra", str5);
            }
            jsonGenerator.writeBooleanField("showSignInDialog", intentParams.showSignInDialog);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntentParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntentParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public String category;
    public Live live;
    public String liveId;
    public String liveSchema;
    public String open;
    public String requestExtra;
    public boolean showSignInDialog;
    public String source;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams$a */
    public static class C0456a {

        /* JADX INFO: renamed from: a */
        public String f7544a;

        /* JADX INFO: renamed from: b */
        public String f7545b;

        /* JADX INFO: renamed from: c */
        public String f7546c;

        /* JADX INFO: renamed from: d */
        public String f7547d;

        /* JADX INFO: renamed from: e */
        public String f7548e;

        /* JADX INFO: renamed from: f */
        public boolean f7549f;

        /* JADX INFO: renamed from: g */
        public Live f7550g;

        /* JADX INFO: renamed from: h */
        public String f7551h;

        /* JADX INFO: renamed from: a */
        public IntentParams m8989a() {
            return new IntentParams(this);
        }

        /* JADX INFO: renamed from: b */
        public C0456a m8990b(String str) {
            this.f7546c = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C0456a m8991c(Live live) {
            this.f7550g = live;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C0456a m8992d(String str) {
            this.f7544a = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C0456a m8993e(String str) {
            this.f7551h = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C0456a m8994f(String str) {
            this.f7547d = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C0456a m8995g(String str) {
            this.f7548e = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C0456a m8996h(boolean z) {
            this.f7549f = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C0456a m8997i(String str) {
            this.f7545b = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams$b */
    public static class C0457b extends bqd0<IntentParams> {
        public C0457b(String str, IntentParams intentParams) {
            super(str, intentParams);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull IntentParams intentParams, IntentParams intentParams2) {
            return NullChecker.a(intentParams) && intentParams.equals(intentParams2);
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntentParams copyed(IntentParams intentParams, @NonNull IntentParams intentParams2) {
            return intentParams2.m26152clone();
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public IntentParams retrieveValue() {
            String string = pref().getString(((fpd0) this).id, null);
            if (TextUtils.isEmpty(string)) {
                return (IntentParams) ((fpd0) this).defaultValue;
            }
            try {
                return (IntentParams) IntentParams.JSON_ADAPTER.parse(string);
            } catch (IOException unused) {
                return (IntentParams) ((fpd0) this).defaultValue;
            }
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(IntentParams intentParams) {
            return pref().edit().putString(((fpd0) this).id, intentParams.toJson());
        }
    }

    private IntentParams(C0456a c0456a) {
        this.liveId = c0456a.f7544a;
        this.source = c0456a.f7545b;
        this.category = c0456a.f7546c;
        this.open = c0456a.f7547d;
        this.requestExtra = c0456a.f7548e;
        this.showSignInDialog = c0456a.f7549f;
        this.live = c0456a.f7550g;
        this.liveSchema = c0456a.f7551h;
    }

    @NonNull
    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntentParams m26152clone() {
        IntentParams intentParams = new IntentParams();
        intentParams.liveId = this.liveId;
        intentParams.source = this.source;
        intentParams.category = this.category;
        intentParams.open = this.open;
        intentParams.requestExtra = this.requestExtra;
        intentParams.showSignInDialog = this.showSignInDialog;
        return intentParams;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            IntentParams intentParams = (IntentParams) obj;
            if (this.showSignInDialog == intentParams.showSignInDialog && v050.a(this.liveId, intentParams.liveId) && v050.a(this.source, intentParams.source) && v050.a(this.category, intentParams.category) && v050.a(this.open, intentParams.open) && v050.a(this.requestExtra, intentParams.requestExtra)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return v050.b(new Object[]{this.liveId, this.source, this.category, this.open, this.requestExtra, Boolean.valueOf(this.showSignInDialog)});
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    public String toString() {
        return "IntentParams{liveId='" + this.liveId + "', source='" + this.source + "', category='" + this.category + "', open='" + this.open + "', requestExtra='" + this.requestExtra + "', showSignInDialog=" + this.showSignInDialog + '}';
    }

    public IntentParams() {
    }
}
