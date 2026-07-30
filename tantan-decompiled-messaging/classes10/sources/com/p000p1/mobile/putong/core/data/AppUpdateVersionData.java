package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class AppUpdateVersionData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "appupdateversiondata";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String androidBaseVersion;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String androidReleaseVersion;

    @ProtobufIndex(index = 1)
    public boolean enable;
    public static ProtobufAdapter<AppUpdateVersionData> PROTOBUF_ADAPTER = new MessageNanoAdapter<AppUpdateVersionData>() { // from class: com.p1.mobile.putong.core.data.AppUpdateVersionData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AppUpdateVersionData appUpdateVersionData) {
            int iB = CodedOutputByteBufferNano.b(1, appUpdateVersionData.enable);
            String str = appUpdateVersionData.androidReleaseVersion;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = appUpdateVersionData.androidBaseVersion;
            if (str2 != null) {
                iB += CodedOutputByteBufferNano.o(3, str2);
            }
            ((MessageNano) appUpdateVersionData).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AppUpdateVersionData m11637parse(nb5 nb5Var) throws IOException {
            AppUpdateVersionData appUpdateVersionData = new AppUpdateVersionData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (appUpdateVersionData.androidReleaseVersion == null) {
                        appUpdateVersionData.androidReleaseVersion = "";
                    }
                    if (appUpdateVersionData.androidBaseVersion != null) {
                        break;
                    }
                    appUpdateVersionData.androidBaseVersion = "";
                    break;
                }
                if (iU == 8) {
                    appUpdateVersionData.enable = nb5Var.g();
                } else if (iU == 18) {
                    appUpdateVersionData.androidReleaseVersion = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (appUpdateVersionData.androidReleaseVersion == null) {
                            appUpdateVersionData.androidReleaseVersion = "";
                        }
                        if (appUpdateVersionData.androidBaseVersion != null) {
                            break;
                        }
                        appUpdateVersionData.androidBaseVersion = "";
                        return appUpdateVersionData;
                    }
                    appUpdateVersionData.androidBaseVersion = nb5Var.s();
                }
            }
            return appUpdateVersionData;
        }

        public void serialize(AppUpdateVersionData appUpdateVersionData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, appUpdateVersionData.enable);
            String str = appUpdateVersionData.androidReleaseVersion;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = appUpdateVersionData.androidBaseVersion;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
        }
    };
    public static JsonAdapter<AppUpdateVersionData> JSON_ADAPTER = new ObjectJsonAdapter<AppUpdateVersionData>() { // from class: com.p1.mobile.putong.core.data.AppUpdateVersionData.2
        public Class getDataClass() {
            return AppUpdateVersionData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AppUpdateVersionData m11638newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AppUpdateVersionData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AppUpdateVersionData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AppUpdateVersionData new_() {
        AppUpdateVersionData appUpdateVersionData = new AppUpdateVersionData();
        appUpdateVersionData.nullCheck();
        return appUpdateVersionData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AppUpdateVersionData m11636clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.enable ? 1231 : 1237)) * 41;
        String str = this.androidReleaseVersion;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.androidBaseVersion;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.androidReleaseVersion == null) {
            this.androidReleaseVersion = "";
        }
        if (this.androidBaseVersion == null) {
            this.androidBaseVersion = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
