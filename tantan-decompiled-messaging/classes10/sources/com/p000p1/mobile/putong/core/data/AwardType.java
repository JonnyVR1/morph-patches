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
public class AwardType extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "awardtype";

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;
    public static ProtobufAdapter<AwardType> PROTOBUF_ADAPTER = new MessageNanoAdapter<AwardType>() { // from class: com.p1.mobile.putong.core.data.AwardType.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AwardType awardType) {
            String str = awardType.name;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) awardType).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AwardType m11705parse(nb5 nb5Var) throws IOException {
            AwardType awardType = new AwardType();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (awardType.name != null) {
                        break;
                    }
                    awardType.name = "";
                    break;
                }
                if (iU != 10) {
                    if (awardType.name != null) {
                        break;
                    }
                    awardType.name = "";
                    return awardType;
                }
                awardType.name = nb5Var.s();
            }
            return awardType;
        }

        public void serialize(AwardType awardType, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = awardType.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<AwardType> JSON_ADAPTER = new ObjectJsonAdapter<AwardType>() { // from class: com.p1.mobile.putong.core.data.AwardType.2
        public Class getDataClass() {
            return AwardType.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AwardType m11706newInstance() {
            return new AwardType();
        }

        public boolean parseField(AwardType awardType, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("name")) {
                return false;
            }
            awardType.name = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AwardType awardType, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("name")) {
                return true;
            }
            return super.parseFieldCheck(awardType, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(AwardType awardType, JsonGenerator jsonGenerator) throws IOException {
            String str = awardType.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AwardType) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AwardType) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AwardType new_() {
        AwardType awardType = new AwardType();
        awardType.nullCheck();
        return awardType;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AwardType m11704clone() {
        AwardType awardType = new AwardType();
        awardType.name = this.name;
        return awardType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AwardType) {
            return ValueObject.util_equals(this.name, ((AwardType) obj).name);
        }
        return false;
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
        String str = this.name;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
