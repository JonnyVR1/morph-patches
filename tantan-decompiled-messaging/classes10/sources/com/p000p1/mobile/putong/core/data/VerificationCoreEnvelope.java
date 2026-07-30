package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Meta;
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
public class VerificationCoreEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "verificationcoreenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public CoreData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<VerificationCoreEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<VerificationCoreEnvelope>() { // from class: com.p1.mobile.putong.core.data.VerificationCoreEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VerificationCoreEnvelope verificationCoreEnvelope) {
            Meta meta = verificationCoreEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            CoreData coreData = verificationCoreEnvelope.data;
            if (coreData != null) {
                iL += CodedOutputByteBufferNano.l(2, coreData, CoreData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) verificationCoreEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VerificationCoreEnvelope m16210parse(nb5 nb5Var) throws IOException {
            VerificationCoreEnvelope verificationCoreEnvelope = new VerificationCoreEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (verificationCoreEnvelope.meta == null) {
                        verificationCoreEnvelope.meta = Meta.new_();
                    }
                    if (verificationCoreEnvelope.data != null) {
                        break;
                    }
                    verificationCoreEnvelope.data = CoreData.new_();
                    break;
                }
                if (iU == 10) {
                    verificationCoreEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (verificationCoreEnvelope.meta == null) {
                            verificationCoreEnvelope.meta = Meta.new_();
                        }
                        if (verificationCoreEnvelope.data != null) {
                            break;
                        }
                        verificationCoreEnvelope.data = CoreData.new_();
                        return verificationCoreEnvelope;
                    }
                    verificationCoreEnvelope.data = (CoreData) nb5Var.l(CoreData.PROTOBUF_ADAPTER);
                }
            }
            return verificationCoreEnvelope;
        }

        public void serialize(VerificationCoreEnvelope verificationCoreEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = verificationCoreEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            CoreData coreData = verificationCoreEnvelope.data;
            if (coreData != null) {
                codedOutputByteBufferNano.K(2, coreData, CoreData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<VerificationCoreEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<VerificationCoreEnvelope>() { // from class: com.p1.mobile.putong.core.data.VerificationCoreEnvelope.2
        public Class getDataClass() {
            return VerificationCoreEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public VerificationCoreEnvelope m16211newInstance() {
            return new VerificationCoreEnvelope();
        }

        public boolean parseField(VerificationCoreEnvelope verificationCoreEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                verificationCoreEnvelope.data = (CoreData) CoreData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            verificationCoreEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(VerificationCoreEnvelope verificationCoreEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(verificationCoreEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerificationCoreEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerificationCoreEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VerificationCoreEnvelope new_() {
        VerificationCoreEnvelope verificationCoreEnvelope = new VerificationCoreEnvelope();
        verificationCoreEnvelope.nullCheck();
        return verificationCoreEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VerificationCoreEnvelope m16209clone() {
        VerificationCoreEnvelope verificationCoreEnvelope = new VerificationCoreEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            verificationCoreEnvelope.meta = meta.clone();
        }
        CoreData coreData = this.data;
        if (coreData != null) {
            verificationCoreEnvelope.data = coreData.m12452clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        CoreData coreData = this.data;
        int iHashCode2 = iHashCode + (coreData != null ? coreData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = CoreData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
