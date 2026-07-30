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
public class CreativePosition extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "creativeposition";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20382id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<CreativePosition> PROTOBUF_ADAPTER = new MessageNanoAdapter<CreativePosition>() { // from class: com.p1.mobile.putong.core.data.CreativePosition.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CreativePosition creativePosition) {
            String str = creativePosition.f20382id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = creativePosition.type;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            creativePosition.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CreativePosition parse(nb5 nb5Var) throws IOException {
            CreativePosition creativePosition = new CreativePosition();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (creativePosition.f20382id == null) {
                        creativePosition.f20382id = "";
                    }
                    if (creativePosition.type != null) {
                        break;
                    }
                    creativePosition.type = "";
                    break;
                }
                if (iM158752u == 10) {
                    creativePosition.f20382id = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (creativePosition.f20382id == null) {
                            creativePosition.f20382id = "";
                        }
                        if (creativePosition.type != null) {
                            break;
                        }
                        creativePosition.type = "";
                        return creativePosition;
                    }
                    creativePosition.type = nb5Var.m158750s();
                }
            }
            return creativePosition;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CreativePosition creativePosition, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = creativePosition.f20382id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = creativePosition.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<CreativePosition> JSON_ADAPTER = new ObjectJsonAdapter<CreativePosition>() { // from class: com.p1.mobile.putong.core.data.CreativePosition.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CreativePosition.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CreativePosition newInstance() {
            return new CreativePosition();
        }

        public boolean parseField(CreativePosition creativePosition, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                creativePosition.f20382id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CreativePosition creativePosition, JsonGenerator jsonGenerator) throws IOException {
            String str = creativePosition.f20382id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = creativePosition.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CreativePosition) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CreativePosition) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CreativePosition new_() {
        CreativePosition creativePosition = new CreativePosition();
        creativePosition.nullCheck();
        return creativePosition;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CreativePosition mo223809clone() {
        CreativePosition creativePosition = new CreativePosition();
        creativePosition.f20382id = this.f20382id;
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
        return ValueObject.util_equals(this.f20382id, creativePosition.f20382id) && ValueObject.util_equals(this.type, creativePosition.type);
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
        String str = this.f20382id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20382id == null) {
            this.f20382id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
