package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Meta;
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
public class VerificationCoreEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "verificationcoreenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public CoreData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<VerificationCoreEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<VerificationCoreEnvelope>() { // from class: com.p1.mobile.putong.core.data.VerificationCoreEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VerificationCoreEnvelope verificationCoreEnvelope) {
            Meta meta = verificationCoreEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            CoreData coreData = verificationCoreEnvelope.data;
            if (coreData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, coreData, CoreData.PROTOBUF_ADAPTER);
            }
            verificationCoreEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VerificationCoreEnvelope parse(nb5 nb5Var) throws IOException {
            VerificationCoreEnvelope verificationCoreEnvelope = new VerificationCoreEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (verificationCoreEnvelope.meta == null) {
                        verificationCoreEnvelope.meta = Meta.new_();
                    }
                    if (verificationCoreEnvelope.data != null) {
                        break;
                    }
                    verificationCoreEnvelope.data = CoreData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    verificationCoreEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (verificationCoreEnvelope.meta == null) {
                            verificationCoreEnvelope.meta = Meta.new_();
                        }
                        if (verificationCoreEnvelope.data != null) {
                            break;
                        }
                        verificationCoreEnvelope.data = CoreData.new_();
                        return verificationCoreEnvelope;
                    }
                    verificationCoreEnvelope.data = (CoreData) nb5Var.m158743l(CoreData.PROTOBUF_ADAPTER);
                }
            }
            return verificationCoreEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VerificationCoreEnvelope verificationCoreEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = verificationCoreEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            CoreData coreData = verificationCoreEnvelope.data;
            if (coreData != null) {
                codedOutputByteBufferNano.m17254K(2, coreData, CoreData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<VerificationCoreEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<VerificationCoreEnvelope>() { // from class: com.p1.mobile.putong.core.data.VerificationCoreEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VerificationCoreEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VerificationCoreEnvelope newInstance() {
            return new VerificationCoreEnvelope();
        }

        public boolean parseField(VerificationCoreEnvelope verificationCoreEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                verificationCoreEnvelope.data = CoreData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            verificationCoreEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(VerificationCoreEnvelope verificationCoreEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(verificationCoreEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VerificationCoreEnvelope verificationCoreEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (verificationCoreEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(verificationCoreEnvelope.meta, jsonGenerator, true);
            }
            if (verificationCoreEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                CoreData.JSON_ADAPTER.serialize(verificationCoreEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerificationCoreEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerificationCoreEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VerificationCoreEnvelope new_() {
        VerificationCoreEnvelope verificationCoreEnvelope = new VerificationCoreEnvelope();
        verificationCoreEnvelope.nullCheck();
        return verificationCoreEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VerificationCoreEnvelope mo223809clone() {
        VerificationCoreEnvelope verificationCoreEnvelope = new VerificationCoreEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            verificationCoreEnvelope.meta = meta.mo223809clone();
        }
        CoreData coreData = this.data;
        if (coreData != null) {
            verificationCoreEnvelope.data = coreData.mo223809clone();
        }
        return verificationCoreEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerificationCoreEnvelope)) {
            return false;
        }
        VerificationCoreEnvelope verificationCoreEnvelope = (VerificationCoreEnvelope) obj;
        return ValueObject.util_equals(this.meta, verificationCoreEnvelope.meta) && ValueObject.util_equals(this.data, verificationCoreEnvelope.data);
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
        CoreData coreData = this.data;
        int iHashCode2 = iHashCode + (coreData != null ? coreData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = CoreData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
