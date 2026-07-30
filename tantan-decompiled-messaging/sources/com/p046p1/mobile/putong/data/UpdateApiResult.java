package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class UpdateApiResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "updateapiresult";

    @NonNull
    @ProtobufIndex(index = 2)
    public String appVersion;

    @NonNull
    @ProtobufIndex(index = 5)
    public String changelog;

    @ProtobufIndex(index = 7)
    public boolean forceDownloadApk;

    @ProtobufIndex(index = 6)
    public boolean forceGoToMarket;

    @ProtobufIndex(index = 1)
    public boolean hasUpdate;

    @NonNull
    @ProtobufIndex(index = 4)
    public String md5;

    @NonNull
    @ProtobufIndex(index = 3)
    public String url;
    public static ProtobufAdapter<UpdateApiResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<UpdateApiResult>() { // from class: com.p1.mobile.putong.data.UpdateApiResult.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UpdateApiResult updateApiResult) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, updateApiResult.hasUpdate);
            String str = updateApiResult.appVersion;
            if (str != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = updateApiResult.url;
            if (str2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = updateApiResult.md5;
            if (str3 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            String str4 = updateApiResult.changelog;
            if (str4 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(5, str4);
            }
            int iM17220b2 = iM17220b + CodedOutputByteBufferNano.m17220b(6, updateApiResult.forceGoToMarket) + CodedOutputByteBufferNano.m17220b(7, updateApiResult.forceDownloadApk);
            updateApiResult.cachedSize = iM17220b2;
            return iM17220b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UpdateApiResult parse(nb5 nb5Var) throws IOException {
            UpdateApiResult updateApiResult = new UpdateApiResult();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (updateApiResult.appVersion == null) {
                        updateApiResult.appVersion = "";
                    }
                    if (updateApiResult.url == null) {
                        updateApiResult.url = "";
                    }
                    if (updateApiResult.md5 == null) {
                        updateApiResult.md5 = "";
                    }
                    if (updateApiResult.changelog != null) {
                        break;
                    }
                    updateApiResult.changelog = "";
                    break;
                }
                if (iM158752u == 8) {
                    updateApiResult.hasUpdate = nb5Var.m158738g();
                } else if (iM158752u == 18) {
                    updateApiResult.appVersion = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    updateApiResult.url = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    updateApiResult.md5 = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    updateApiResult.changelog = nb5Var.m158750s();
                } else if (iM158752u == 48) {
                    updateApiResult.forceGoToMarket = nb5Var.m158738g();
                } else {
                    if (iM158752u != 56) {
                        if (updateApiResult.appVersion == null) {
                            updateApiResult.appVersion = "";
                        }
                        if (updateApiResult.url == null) {
                            updateApiResult.url = "";
                        }
                        if (updateApiResult.md5 == null) {
                            updateApiResult.md5 = "";
                        }
                        if (updateApiResult.changelog != null) {
                            break;
                        }
                        updateApiResult.changelog = "";
                        return updateApiResult;
                    }
                    updateApiResult.forceDownloadApk = nb5Var.m158738g();
                }
            }
            return updateApiResult;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UpdateApiResult updateApiResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, updateApiResult.hasUpdate);
            String str = updateApiResult.appVersion;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = updateApiResult.url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = updateApiResult.md5;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            String str4 = updateApiResult.changelog;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(5, str4);
            }
            codedOutputByteBufferNano.m17244A(6, updateApiResult.forceGoToMarket);
            codedOutputByteBufferNano.m17244A(7, updateApiResult.forceDownloadApk);
        }
    };
    public static JsonAdapter<UpdateApiResult> JSON_ADAPTER = new ObjectJsonAdapter<UpdateApiResult>() { // from class: com.p1.mobile.putong.data.UpdateApiResult.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UpdateApiResult.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UpdateApiResult newInstance() {
            return new UpdateApiResult();
        }

        public boolean parseField(UpdateApiResult updateApiResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "forceDownloadApk":
                    updateApiResult.forceDownloadApk = jsonParser.getValueAsBoolean();
                    return true;
                case "hasUpdate":
                    updateApiResult.hasUpdate = jsonParser.getValueAsBoolean();
                    return true;
                case "md5":
                    updateApiResult.md5 = jsonParser.getValueAsString();
                    return true;
                case "url":
                    updateApiResult.url = jsonParser.getValueAsString();
                    return true;
                case "goToMarket":
                    updateApiResult.forceGoToMarket = jsonParser.getValueAsBoolean();
                    return true;
                case "changelog":
                    updateApiResult.changelog = jsonParser.getValueAsString();
                    return true;
                case "appVersion":
                    updateApiResult.appVersion = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UpdateApiResult updateApiResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "forceDownloadApk":
                case "hasUpdate":
                case "md5":
                case "url":
                case "goToMarket":
                case "changelog":
                case "appVersion":
                    return true;
                default:
                    return super.parseFieldCheck(updateApiResult, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UpdateApiResult updateApiResult, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("hasUpdate", updateApiResult.hasUpdate);
            String str = updateApiResult.appVersion;
            if (str != null) {
                jsonGenerator.writeStringField(RemoteConfigConstants.RequestFieldKey.APP_VERSION, str);
            }
            String str2 = updateApiResult.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            String str3 = updateApiResult.md5;
            if (str3 != null) {
                jsonGenerator.writeStringField("md5", str3);
            }
            String str4 = updateApiResult.changelog;
            if (str4 != null) {
                jsonGenerator.writeStringField("changelog", str4);
            }
            jsonGenerator.writeBooleanField("goToMarket", updateApiResult.forceGoToMarket);
            jsonGenerator.writeBooleanField("forceDownloadApk", updateApiResult.forceDownloadApk);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UpdateApiResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UpdateApiResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UpdateApiResult new_() {
        UpdateApiResult updateApiResult = new UpdateApiResult();
        updateApiResult.nullCheck();
        return updateApiResult;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UpdateApiResult mo223809clone() {
        UpdateApiResult updateApiResult = new UpdateApiResult();
        updateApiResult.hasUpdate = this.hasUpdate;
        updateApiResult.appVersion = this.appVersion;
        updateApiResult.url = this.url;
        updateApiResult.md5 = this.md5;
        updateApiResult.changelog = this.changelog;
        updateApiResult.forceGoToMarket = this.forceGoToMarket;
        updateApiResult.forceDownloadApk = this.forceDownloadApk;
        return updateApiResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateApiResult)) {
            return false;
        }
        UpdateApiResult updateApiResult = (UpdateApiResult) obj;
        return this.hasUpdate == updateApiResult.hasUpdate && ValueObject.util_equals(this.appVersion, updateApiResult.appVersion) && ValueObject.util_equals(this.url, updateApiResult.url) && ValueObject.util_equals(this.md5, updateApiResult.md5) && ValueObject.util_equals(this.changelog, updateApiResult.changelog) && this.forceGoToMarket == updateApiResult.forceGoToMarket && this.forceDownloadApk == updateApiResult.forceDownloadApk;
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
        int i2 = ((i * 41) + (this.hasUpdate ? 1231 : 1237)) * 41;
        String str = this.appVersion;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.md5;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.changelog;
        int iHashCode4 = ((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.forceGoToMarket ? 1231 : 1237)) * 41) + (this.forceDownloadApk ? 1231 : 1237);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.appVersion == null) {
            this.appVersion = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.md5 == null) {
            this.md5 = "";
        }
        if (this.changelog == null) {
            this.changelog = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
