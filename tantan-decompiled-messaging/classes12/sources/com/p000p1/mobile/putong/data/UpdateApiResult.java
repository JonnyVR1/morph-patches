package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UpdateApiResult updateApiResult) {
            int iB = CodedOutputByteBufferNano.b(1, updateApiResult.hasUpdate);
            String str = updateApiResult.appVersion;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = updateApiResult.url;
            if (str2 != null) {
                iB += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = updateApiResult.md5;
            if (str3 != null) {
                iB += CodedOutputByteBufferNano.o(4, str3);
            }
            String str4 = updateApiResult.changelog;
            if (str4 != null) {
                iB += CodedOutputByteBufferNano.o(5, str4);
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(6, updateApiResult.forceGoToMarket) + CodedOutputByteBufferNano.b(7, updateApiResult.forceDownloadApk);
            ((MessageNano) updateApiResult).cachedSize = iB2;
            return iB2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UpdateApiResult m19145parse(nb5 nb5Var) throws IOException {
            UpdateApiResult updateApiResult = new UpdateApiResult();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 8) {
                    updateApiResult.hasUpdate = nb5Var.g();
                } else if (iU == 18) {
                    updateApiResult.appVersion = nb5Var.s();
                } else if (iU == 26) {
                    updateApiResult.url = nb5Var.s();
                } else if (iU == 34) {
                    updateApiResult.md5 = nb5Var.s();
                } else if (iU == 42) {
                    updateApiResult.changelog = nb5Var.s();
                } else if (iU == 48) {
                    updateApiResult.forceGoToMarket = nb5Var.g();
                } else {
                    if (iU != 56) {
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
                    updateApiResult.forceDownloadApk = nb5Var.g();
                }
            }
            return updateApiResult;
        }

        public void serialize(UpdateApiResult updateApiResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, updateApiResult.hasUpdate);
            String str = updateApiResult.appVersion;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = updateApiResult.url;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = updateApiResult.md5;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            String str4 = updateApiResult.changelog;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
            codedOutputByteBufferNano.A(6, updateApiResult.forceGoToMarket);
            codedOutputByteBufferNano.A(7, updateApiResult.forceDownloadApk);
        }
    };
    public static JsonAdapter<UpdateApiResult> JSON_ADAPTER = new ObjectJsonAdapter<UpdateApiResult>() { // from class: com.p1.mobile.putong.data.UpdateApiResult.2
        public Class getDataClass() {
            return UpdateApiResult.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UpdateApiResult mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UpdateApiResult updateApiResult, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("hasUpdate", updateApiResult.hasUpdate);
            String str = updateApiResult.appVersion;
            if (str != null) {
                jsonGenerator.writeStringField("appVersion", str);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UpdateApiResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UpdateApiResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UpdateApiResult new_() {
        UpdateApiResult updateApiResult = new UpdateApiResult();
        updateApiResult.nullCheck();
        return updateApiResult;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UpdateApiResult m19144clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
