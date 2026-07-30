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
public class CreativePosition extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "creativeposition";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;
    public static ProtobufAdapter<CreativePosition> PROTOBUF_ADAPTER = new MessageNanoAdapter<CreativePosition>() { // from class: com.p1.mobile.putong.core.data.CreativePosition.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CreativePosition creativePosition) {
            String str = creativePosition.f44id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = creativePosition.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) creativePosition).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CreativePosition m12555parse(nb5 nb5Var) throws IOException {
            CreativePosition creativePosition = new CreativePosition();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (creativePosition.f44id == null) {
                        creativePosition.f44id = "";
                    }
                    if (creativePosition.type != null) {
                        break;
                    }
                    creativePosition.type = "";
                    break;
                }
                if (iU == 10) {
                    creativePosition.f44id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (creativePosition.f44id == null) {
                            creativePosition.f44id = "";
                        }
                        if (creativePosition.type != null) {
                            break;
                        }
                        creativePosition.type = "";
                        return creativePosition;
                    }
                    creativePosition.type = nb5Var.s();
                }
            }
            return creativePosition;
        }

        public void serialize(CreativePosition creativePosition, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = creativePosition.f44id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = creativePosition.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<CreativePosition> JSON_ADAPTER = new ObjectJsonAdapter<CreativePosition>() { // from class: com.p1.mobile.putong.core.data.CreativePosition.2
        public Class getDataClass() {
            return CreativePosition.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CreativePosition m12556newInstance() {
            return new CreativePosition();
        }

        public boolean parseField(CreativePosition creativePosition, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                creativePosition.f44id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("type")) {
                return false;
            }
            creativePosition.type = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(CreativePosition creativePosition, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(creativePosition, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(CreativePosition creativePosition, JsonGenerator jsonGenerator) throws IOException {
            String str = creativePosition.f44id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = creativePosition.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CreativePosition) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CreativePosition) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CreativePosition new_() {
        CreativePosition creativePosition = new CreativePosition();
        creativePosition.nullCheck();
        return creativePosition;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CreativePosition m12554clone() {
        CreativePosition creativePosition = new CreativePosition();
        creativePosition.f44id = this.f44id;
        creativePosition.type = this.type;
        return creativePosition;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreativePosition)) {
            return false;
        }
        CreativePosition creativePosition = (CreativePosition) obj;
        return ValueObject.util_equals(this.f44id, creativePosition.f44id) && ValueObject.util_equals(this.type, creativePosition.type);
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
        String str = this.f44id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f44id == null) {
            this.f44id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
