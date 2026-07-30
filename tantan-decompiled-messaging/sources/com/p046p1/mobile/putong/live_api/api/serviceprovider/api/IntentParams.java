package com.p046p1.mobile.putong.live_api.api.serviceprovider.api;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.bqd0;
import p149l.v050;

/* JADX INFO: loaded from: classes11.dex */
public class IntentParams extends ValueObject implements Serializable {
    public static JsonAdapter<IntentParams> JSON_ADAPTER = new ObjectJsonAdapter<IntentParams>() { // from class: com.p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntentParams.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntentParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public static class C13054a {

        /* JADX INFO: renamed from: a */
        public String f53938a;

        /* JADX INFO: renamed from: b */
        public String f53939b;

        /* JADX INFO: renamed from: c */
        public String f53940c;

        /* JADX INFO: renamed from: d */
        public String f53941d;

        /* JADX INFO: renamed from: e */
        public String f53942e;

        /* JADX INFO: renamed from: f */
        public boolean f53943f;

        /* JADX INFO: renamed from: g */
        public Live f53944g;

        /* JADX INFO: renamed from: h */
        public String f53945h;

        /* JADX INFO: renamed from: a */
        public IntentParams m78773a() {
            return new IntentParams(this);
        }

        /* JADX INFO: renamed from: b */
        public C13054a m78774b(String str) {
            this.f53940c = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C13054a m78775c(Live live) {
            this.f53944g = live;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C13054a m78776d(String str) {
            this.f53938a = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C13054a m78777e(String str) {
            this.f53945h = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C13054a m78778f(String str) {
            this.f53941d = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C13054a m78779g(String str) {
            this.f53942e = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C13054a m78780h(boolean z) {
            this.f53943f = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C13054a m78781i(String str) {
            this.f53939b = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams$b */
    public static class C13055b extends bqd0<IntentParams> {
        public C13055b(String str, IntentParams intentParams) {
            super(str, intentParams);
        }

        @Override // p149l.bqd0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull IntentParams intentParams, IntentParams intentParams2) {
            return NullChecker.m81303a(intentParams) && intentParams.equals(intentParams2);
        }

        @Override // p149l.bqd0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntentParams copyed(IntentParams intentParams, @NonNull IntentParams intentParams2) {
            return intentParams2.mo223809clone();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.fpd0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public IntentParams retrieveValue() {
            String string = pref().getString(this.f98687id, null);
            if (TextUtils.isEmpty(string)) {
                return (IntentParams) this.defaultValue;
            }
            try {
                return IntentParams.JSON_ADAPTER.parse(string);
            } catch (IOException unused) {
                return (IntentParams) this.defaultValue;
            }
        }

        @Override // p149l.fpd0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(IntentParams intentParams) {
            return pref().edit().putString(this.f98687id, intentParams.toJson());
        }
    }

    private IntentParams(C13054a c13054a) {
        this.liveId = c13054a.f53938a;
        this.source = c13054a.f53939b;
        this.category = c13054a.f53940c;
        this.open = c13054a.f53941d;
        this.requestExtra = c13054a.f53942e;
        this.showSignInDialog = c13054a.f53943f;
        this.live = c13054a.f53944g;
        this.liveSchema = c13054a.f53945h;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    @NonNull
    /* JADX INFO: renamed from: clone */
    public IntentParams mo223809clone() {
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
            if (this.showSignInDialog == intentParams.showSignInDialog && v050.m196470a(this.liveId, intentParams.liveId) && v050.m196470a(this.source, intentParams.source) && v050.m196470a(this.category, intentParams.category) && v050.m196470a(this.open, intentParams.open) && v050.m196470a(this.requestExtra, intentParams.requestExtra)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return v050.m196471b(this.liveId, this.source, this.category, this.open, this.requestExtra, Boolean.valueOf(this.showSignInDialog));
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
