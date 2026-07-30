package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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

/* JADX INFO: loaded from: classes10.dex */
public class CoreAiStoryShareStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "coreaistorysharestatus";

    @NonNull
    @ProtobufIndex(index = 1)
    public String shareStatus;
    public static ProtobufAdapter<CoreAiStoryShareStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreAiStoryShareStatus>() { // from class: com.p1.mobile.putong.core.data.CoreAiStoryShareStatus.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CoreAiStoryShareStatus coreAiStoryShareStatus) {
            String str = coreAiStoryShareStatus.shareStatus;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            coreAiStoryShareStatus.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CoreAiStoryShareStatus parse(nb5 nb5Var) throws IOException {
            CoreAiStoryShareStatus coreAiStoryShareStatus = new CoreAiStoryShareStatus();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (coreAiStoryShareStatus.shareStatus != null) {
                        break;
                    }
                    coreAiStoryShareStatus.shareStatus = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (coreAiStoryShareStatus.shareStatus != null) {
                        break;
                    }
                    coreAiStoryShareStatus.shareStatus = "";
                    return coreAiStoryShareStatus;
                }
                coreAiStoryShareStatus.shareStatus = nb5Var.m158750s();
            }
            return coreAiStoryShareStatus;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CoreAiStoryShareStatus coreAiStoryShareStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = coreAiStoryShareStatus.shareStatus;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<CoreAiStoryShareStatus> JSON_ADAPTER = new ObjectJsonAdapter<CoreAiStoryShareStatus>() { // from class: com.p1.mobile.putong.core.data.CoreAiStoryShareStatus.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CoreAiStoryShareStatus.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CoreAiStoryShareStatus newInstance() {
            return new CoreAiStoryShareStatus();
        }

        public boolean parseField(CoreAiStoryShareStatus coreAiStoryShareStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("shareStatus")) {
                return false;
            }
            coreAiStoryShareStatus.shareStatus = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(CoreAiStoryShareStatus coreAiStoryShareStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("shareStatus")) {
                return true;
            }
            return super.parseFieldCheck(coreAiStoryShareStatus, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CoreAiStoryShareStatus coreAiStoryShareStatus, JsonGenerator jsonGenerator) throws IOException {
            String str = coreAiStoryShareStatus.shareStatus;
            if (str != null) {
                jsonGenerator.writeStringField("shareStatus", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreAiStoryShareStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreAiStoryShareStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CoreAiStoryShareStatus new_() {
        CoreAiStoryShareStatus coreAiStoryShareStatus = new CoreAiStoryShareStatus();
        coreAiStoryShareStatus.nullCheck();
        return coreAiStoryShareStatus;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CoreAiStoryShareStatus mo223809clone() {
        CoreAiStoryShareStatus coreAiStoryShareStatus = new CoreAiStoryShareStatus();
        coreAiStoryShareStatus.shareStatus = this.shareStatus;
        return coreAiStoryShareStatus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CoreAiStoryShareStatus) {
            return ValueObject.util_equals(this.shareStatus, ((CoreAiStoryShareStatus) obj).shareStatus);
        }
        return false;
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
        int i2 = i * 41;
        String str = this.shareStatus;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.shareStatus == null) {
            this.shareStatus = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
