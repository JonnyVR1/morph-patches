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
public class MomentUserStateMessageType extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentuserstatemessagetype";

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<MomentUserStateMessageType> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentUserStateMessageType>() { // from class: com.p1.mobile.putong.core.data.MomentUserStateMessageType.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MomentUserStateMessageType momentUserStateMessageType) {
            String str = momentUserStateMessageType.type;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) momentUserStateMessageType).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentUserStateMessageType m14349parse(nb5 nb5Var) throws IOException {
            MomentUserStateMessageType momentUserStateMessageType = new MomentUserStateMessageType();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (momentUserStateMessageType.type != null) {
                        break;
                    }
                    momentUserStateMessageType.type = "";
                    break;
                }
                if (iU != 10) {
                    if (momentUserStateMessageType.type != null) {
                        break;
                    }
                    momentUserStateMessageType.type = "";
                    return momentUserStateMessageType;
                }
                momentUserStateMessageType.type = nb5Var.s();
            }
            return momentUserStateMessageType;
        }

        public void serialize(MomentUserStateMessageType momentUserStateMessageType, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = momentUserStateMessageType.type;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<MomentUserStateMessageType> JSON_ADAPTER = new ObjectJsonAdapter<MomentUserStateMessageType>() { // from class: com.p1.mobile.putong.core.data.MomentUserStateMessageType.2
        public Class getDataClass() {
            return MomentUserStateMessageType.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MomentUserStateMessageType m14350newInstance() {
            return new MomentUserStateMessageType();
        }

        public boolean parseField(MomentUserStateMessageType momentUserStateMessageType, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("type")) {
                return false;
            }
            momentUserStateMessageType.type = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(MomentUserStateMessageType momentUserStateMessageType, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(momentUserStateMessageType, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(MomentUserStateMessageType momentUserStateMessageType, JsonGenerator jsonGenerator) throws IOException {
            String str = momentUserStateMessageType.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentUserStateMessageType) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentUserStateMessageType) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentUserStateMessageType new_() {
        MomentUserStateMessageType momentUserStateMessageType = new MomentUserStateMessageType();
        momentUserStateMessageType.nullCheck();
        return momentUserStateMessageType;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentUserStateMessageType m14348clone() {
        MomentUserStateMessageType momentUserStateMessageType = new MomentUserStateMessageType();
        momentUserStateMessageType.type = this.type;
        return momentUserStateMessageType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MomentUserStateMessageType) {
            return ValueObject.util_equals(this.type, ((MomentUserStateMessageType) obj).type);
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
        String str = this.type;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
