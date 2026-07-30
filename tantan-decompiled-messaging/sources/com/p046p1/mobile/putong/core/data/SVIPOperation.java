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
public class SVIPOperation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "svipoperation";

    @ProtobufIndex(index = 3)
    public boolean freeBoost;

    @NonNull
    @ProtobufIndex(index = 1)
    public String lockUserId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String showType;
    public static ProtobufAdapter<SVIPOperation> PROTOBUF_ADAPTER = new MessageNanoAdapter<SVIPOperation>() { // from class: com.p1.mobile.putong.core.data.SVIPOperation.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SVIPOperation sVIPOperation) {
            String str = sVIPOperation.lockUserId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = sVIPOperation.showType;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(3, sVIPOperation.freeBoost);
            sVIPOperation.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SVIPOperation parse(nb5 nb5Var) throws IOException {
            SVIPOperation sVIPOperation = new SVIPOperation();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (sVIPOperation.lockUserId == null) {
                        sVIPOperation.lockUserId = "";
                    }
                    if (sVIPOperation.showType != null) {
                        break;
                    }
                    sVIPOperation.showType = "";
                    break;
                }
                if (iM158752u == 10) {
                    sVIPOperation.lockUserId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    sVIPOperation.showType = nb5Var.m158750s();
                } else {
                    if (iM158752u != 24) {
                        if (sVIPOperation.lockUserId == null) {
                            sVIPOperation.lockUserId = "";
                        }
                        if (sVIPOperation.showType != null) {
                            break;
                        }
                        sVIPOperation.showType = "";
                        return sVIPOperation;
                    }
                    sVIPOperation.freeBoost = nb5Var.m158738g();
                }
            }
            return sVIPOperation;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SVIPOperation sVIPOperation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = sVIPOperation.lockUserId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = sVIPOperation.showType;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17244A(3, sVIPOperation.freeBoost);
        }
    };
    public static JsonAdapter<SVIPOperation> JSON_ADAPTER = new ObjectJsonAdapter<SVIPOperation>() { // from class: com.p1.mobile.putong.core.data.SVIPOperation.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SVIPOperation.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SVIPOperation newInstance() {
            return new SVIPOperation();
        }

        public boolean parseField(SVIPOperation sVIPOperation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "freeBoost":
                    sVIPOperation.freeBoost = jsonParser.getValueAsBoolean();
                    return true;
                case "showType":
                    sVIPOperation.showType = jsonParser.getValueAsString();
                    return true;
                case "lockUserId":
                    sVIPOperation.lockUserId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SVIPOperation sVIPOperation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "freeBoost":
                case "showType":
                case "lockUserId":
                    return true;
                default:
                    return super.parseFieldCheck(sVIPOperation, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SVIPOperation sVIPOperation, JsonGenerator jsonGenerator) throws IOException {
            String str = sVIPOperation.lockUserId;
            if (str != null) {
                jsonGenerator.writeStringField("lockUserId", str);
            }
            String str2 = sVIPOperation.showType;
            if (str2 != null) {
                jsonGenerator.writeStringField("showType", str2);
            }
            jsonGenerator.writeBooleanField("freeBoost", sVIPOperation.freeBoost);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SVIPOperation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SVIPOperation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SVIPOperation new_() {
        SVIPOperation sVIPOperation = new SVIPOperation();
        sVIPOperation.nullCheck();
        return sVIPOperation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SVIPOperation mo223809clone() {
        SVIPOperation sVIPOperation = new SVIPOperation();
        sVIPOperation.lockUserId = this.lockUserId;
        sVIPOperation.showType = this.showType;
        sVIPOperation.freeBoost = this.freeBoost;
        return sVIPOperation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SVIPOperation)) {
            return false;
        }
        SVIPOperation sVIPOperation = (SVIPOperation) obj;
        return ValueObject.util_equals(this.lockUserId, sVIPOperation.lockUserId) && ValueObject.util_equals(this.showType, sVIPOperation.showType) && this.freeBoost == sVIPOperation.freeBoost;
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
        String str = this.lockUserId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.showType;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.freeBoost ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.lockUserId == null) {
            this.lockUserId = "";
        }
        if (this.showType == null) {
            this.showType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
