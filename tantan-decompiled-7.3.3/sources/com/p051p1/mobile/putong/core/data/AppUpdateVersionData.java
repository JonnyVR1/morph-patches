package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class AppUpdateVersionData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "appupdateversiondata";

    @NonNull
    @ProtobufIndex(index = 3)
    public String androidBaseVersion;

    @NonNull
    @ProtobufIndex(index = 2)
    public String androidReleaseVersion;

    @ProtobufIndex(index = 1)
    public boolean enable;
    public static ProtobufAdapter<AppUpdateVersionData> PROTOBUF_ADAPTER = new MessageNanoAdapter<AppUpdateVersionData>() { // from class: com.p1.mobile.putong.core.data.AppUpdateVersionData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AppUpdateVersionData appUpdateVersionData) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, appUpdateVersionData.enable);
            String str = appUpdateVersionData.androidReleaseVersion;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = appUpdateVersionData.androidBaseVersion;
            if (str2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            appUpdateVersionData.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AppUpdateVersionData parse(nc5 nc5Var) throws IOException {
            AppUpdateVersionData appUpdateVersionData = new AppUpdateVersionData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (appUpdateVersionData.androidReleaseVersion == null) {
                        appUpdateVersionData.androidReleaseVersion = "";
                    }
                    if (appUpdateVersionData.androidBaseVersion != null) {
                        break;
                    }
                    appUpdateVersionData.androidBaseVersion = "";
                    break;
                }
                if (iM162497u == 8) {
                    appUpdateVersionData.enable = nc5Var.m162483g();
                } else if (iM162497u == 18) {
                    appUpdateVersionData.androidReleaseVersion = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (appUpdateVersionData.androidReleaseVersion == null) {
                            appUpdateVersionData.androidReleaseVersion = "";
                        }
                        if (appUpdateVersionData.androidBaseVersion != null) {
                            break;
                        }
                        appUpdateVersionData.androidBaseVersion = "";
                        return appUpdateVersionData;
                    }
                    appUpdateVersionData.androidBaseVersion = nc5Var.m162495s();
                }
            }
            return appUpdateVersionData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AppUpdateVersionData appUpdateVersionData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, appUpdateVersionData.enable);
            String str = appUpdateVersionData.androidReleaseVersion;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = appUpdateVersionData.androidBaseVersion;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
        }
    };
    public static JsonAdapter<AppUpdateVersionData> JSON_ADAPTER = new ObjectJsonAdapter<AppUpdateVersionData>() { // from class: com.p1.mobile.putong.core.data.AppUpdateVersionData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AppUpdateVersionData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AppUpdateVersionData newInstance() {
            return new AppUpdateVersionData();
        }

        public boolean parseField(AppUpdateVersionData appUpdateVersionData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enable":
                    appUpdateVersionData.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "androidReleaseVersion":
                    appUpdateVersionData.androidReleaseVersion = jsonParser.getValueAsString();
                    return true;
                case "androidBaseVersion":
                    appUpdateVersionData.androidBaseVersion = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AppUpdateVersionData appUpdateVersionData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enable":
                case "androidReleaseVersion":
                case "androidBaseVersion":
                    return true;
                default:
                    return super.parseFieldCheck(appUpdateVersionData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AppUpdateVersionData appUpdateVersionData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", appUpdateVersionData.enable);
            String str = appUpdateVersionData.androidReleaseVersion;
            if (str != null) {
                jsonGenerator.writeStringField("androidReleaseVersion", str);
            }
            String str2 = appUpdateVersionData.androidBaseVersion;
            if (str2 != null) {
                jsonGenerator.writeStringField("androidBaseVersion", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AppUpdateVersionData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AppUpdateVersionData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AppUpdateVersionData new_() {
        AppUpdateVersionData appUpdateVersionData = new AppUpdateVersionData();
        appUpdateVersionData.nullCheck();
        return appUpdateVersionData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AppUpdateVersionData mo225055clone() {
        AppUpdateVersionData appUpdateVersionData = new AppUpdateVersionData();
        appUpdateVersionData.enable = this.enable;
        appUpdateVersionData.androidReleaseVersion = this.androidReleaseVersion;
        appUpdateVersionData.androidBaseVersion = this.androidBaseVersion;
        return appUpdateVersionData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppUpdateVersionData)) {
            return false;
        }
        AppUpdateVersionData appUpdateVersionData = (AppUpdateVersionData) obj;
        return this.enable == appUpdateVersionData.enable && ValueObject.util_equals(this.androidReleaseVersion, appUpdateVersionData.androidReleaseVersion) && ValueObject.util_equals(this.androidBaseVersion, appUpdateVersionData.androidBaseVersion);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.enable ? 1231 : 1237)) * 41;
        String str = this.androidReleaseVersion;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.androidBaseVersion;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.androidReleaseVersion == null) {
            this.androidReleaseVersion = "";
        }
        if (this.androidBaseVersion == null) {
            this.androidBaseVersion = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
