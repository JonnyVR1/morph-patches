package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class VerificationNetworkData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "verificationnetworkdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public VerificationData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<VerificationNetworkData> PROTOBUF_ADAPTER = new MessageNanoAdapter<VerificationNetworkData>() { // from class: com.p1.mobile.putong.data.VerificationNetworkData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VerificationNetworkData verificationNetworkData) {
            Meta meta = verificationNetworkData.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            VerificationData verificationData = verificationNetworkData.data;
            if (verificationData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, verificationData, VerificationData.PROTOBUF_ADAPTER);
            }
            verificationNetworkData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VerificationNetworkData parse(nb5 nb5Var) throws IOException {
            VerificationNetworkData verificationNetworkData = new VerificationNetworkData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (verificationNetworkData.meta == null) {
                        verificationNetworkData.meta = Meta.new_();
                    }
                    if (verificationNetworkData.data != null) {
                        break;
                    }
                    verificationNetworkData.data = VerificationData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    verificationNetworkData.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (verificationNetworkData.meta == null) {
                            verificationNetworkData.meta = Meta.new_();
                        }
                        if (verificationNetworkData.data != null) {
                            break;
                        }
                        verificationNetworkData.data = VerificationData.new_();
                        return verificationNetworkData;
                    }
                    verificationNetworkData.data = (VerificationData) nb5Var.m158743l(VerificationData.PROTOBUF_ADAPTER);
                }
            }
            return verificationNetworkData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VerificationNetworkData verificationNetworkData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = verificationNetworkData.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            VerificationData verificationData = verificationNetworkData.data;
            if (verificationData != null) {
                codedOutputByteBufferNano.m17254K(2, verificationData, VerificationData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<VerificationNetworkData> JSON_ADAPTER = new ObjectJsonAdapter<VerificationNetworkData>() { // from class: com.p1.mobile.putong.data.VerificationNetworkData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VerificationNetworkData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VerificationNetworkData newInstance() {
            return new VerificationNetworkData();
        }

        public boolean parseField(VerificationNetworkData verificationNetworkData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                verificationNetworkData.data = VerificationData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            verificationNetworkData.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(VerificationNetworkData verificationNetworkData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(verificationNetworkData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VerificationNetworkData verificationNetworkData, JsonGenerator jsonGenerator) throws IOException {
            if (verificationNetworkData.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(verificationNetworkData.meta, jsonGenerator, true);
            }
            if (verificationNetworkData.data != null) {
                jsonGenerator.writeFieldName("data");
                VerificationData.JSON_ADAPTER.serialize(verificationNetworkData.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerificationNetworkData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerificationNetworkData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VerificationNetworkData new_() {
        VerificationNetworkData verificationNetworkData = new VerificationNetworkData();
        verificationNetworkData.nullCheck();
        return verificationNetworkData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VerificationNetworkData mo223809clone() {
        VerificationNetworkData verificationNetworkData = new VerificationNetworkData();
        Meta meta = this.meta;
        if (meta != null) {
            verificationNetworkData.meta = meta.mo223809clone();
        }
        VerificationData verificationData = this.data;
        if (verificationData != null) {
            verificationNetworkData.data = verificationData.mo223809clone();
        }
        return verificationNetworkData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerificationNetworkData)) {
            return false;
        }
        VerificationNetworkData verificationNetworkData = (VerificationNetworkData) obj;
        return ValueObject.util_equals(this.meta, verificationNetworkData.meta) && ValueObject.util_equals(this.data, verificationNetworkData.data);
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
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        VerificationData verificationData = this.data;
        int iHashCode2 = iHashCode + (verificationData != null ? verificationData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = VerificationData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
