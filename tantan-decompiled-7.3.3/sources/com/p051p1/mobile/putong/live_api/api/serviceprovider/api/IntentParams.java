package com.p051p1.mobile.putong.live_api.api.serviceprovider.api;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.dyd0;
import p153l.k950;

/* JADX INFO: loaded from: classes10.dex */
public class IntentParams extends ValueObject implements Serializable {
    public static JsonAdapter<IntentParams> JSON_ADAPTER = new ObjectJsonAdapter<IntentParams>() { // from class: com.p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntentParams.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntentParams newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntentParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public static class C13217a {

        /* JADX INFO: renamed from: a */
        public String f54786a;

        /* JADX INFO: renamed from: b */
        public String f54787b;

        /* JADX INFO: renamed from: c */
        public String f54788c;

        /* JADX INFO: renamed from: d */
        public String f54789d;

        /* JADX INFO: renamed from: e */
        public String f54790e;

        /* JADX INFO: renamed from: f */
        public boolean f54791f;

        /* JADX INFO: renamed from: g */
        public Live f54792g;

        /* JADX INFO: renamed from: h */
        public String f54793h;

        /* JADX INFO: renamed from: a */
        public IntentParams m79956a() {
            return new IntentParams(this);
        }

        /* JADX INFO: renamed from: b */
        public C13217a m79957b(String str) {
            this.f54788c = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C13217a m79958c(Live live) {
            this.f54792g = live;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C13217a m79959d(String str) {
            this.f54786a = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C13217a m79960e(String str) {
            this.f54793h = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C13217a m79961f(String str) {
            this.f54789d = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C13217a m79962g(String str) {
            this.f54790e = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C13217a m79963h(boolean z) {
            this.f54791f = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C13217a m79964i(String str) {
            this.f54787b = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams$b */
    public static class C13218b extends dyd0<IntentParams> {
        public C13218b(String str, IntentParams intentParams) {
            super(str, intentParams);
        }

        @Override // p153l.dyd0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull IntentParams intentParams, IntentParams intentParams2) {
            return NullChecker.m82486a(intentParams) && intentParams.equals(intentParams2);
        }

        @Override // p153l.dyd0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntentParams copyed(IntentParams intentParams, @NonNull IntentParams intentParams2) {
            return intentParams2.mo225055clone();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.hxd0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public IntentParams retrieveValue() {
            String string = pref().getString(this.f111993id, null);
            if (TextUtils.isEmpty(string)) {
                return (IntentParams) this.defaultValue;
            }
            try {
                return IntentParams.JSON_ADAPTER.parse(string);
            } catch (IOException unused) {
                return (IntentParams) this.defaultValue;
            }
        }

        @Override // p153l.hxd0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(IntentParams intentParams) {
            return pref().edit().putString(this.f111993id, intentParams.toJson());
        }
    }

    private IntentParams(C13217a c13217a) {
        this.liveId = c13217a.f54786a;
        this.source = c13217a.f54787b;
        this.category = c13217a.f54788c;
        this.open = c13217a.f54789d;
        this.requestExtra = c13217a.f54790e;
        this.showSignInDialog = c13217a.f54791f;
        this.live = c13217a.f54792g;
        this.liveSchema = c13217a.f54793h;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    @NonNull
    /* JADX INFO: renamed from: clone */
    public IntentParams mo225055clone() {
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
            if (this.showSignInDialog == intentParams.showSignInDialog && k950.m148863a(this.liveId, intentParams.liveId) && k950.m148863a(this.source, intentParams.source) && k950.m148863a(this.category, intentParams.category) && k950.m148863a(this.open, intentParams.open) && k950.m148863a(this.requestExtra, intentParams.requestExtra)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return k950.m148864b(this.liveId, this.source, this.category, this.open, this.requestExtra, Boolean.valueOf(this.showSignInDialog));
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    @Override // com.google.protobuf.nano.MessageNano
    public String toString() {
        return "IntentParams{liveId='" + this.liveId + "', source='" + this.source + "', category='" + this.category + "', open='" + this.open + "', requestExtra='" + this.requestExtra + "', showSignInDialog=" + this.showSignInDialog + '}';
    }

    public IntentParams() {
    }
}
