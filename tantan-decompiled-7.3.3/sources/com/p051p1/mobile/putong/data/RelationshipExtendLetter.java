package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class RelationshipExtendLetter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "relationshipextendletter";

    @NonNull
    @ProtobufIndex(index = 1)
    public String message;

    @NonNull
    @ProtobufIndex(index = 2)
    public String places;
    public static ProtobufAdapter<RelationshipExtendLetter> PROTOBUF_ADAPTER = new MessageNanoAdapter<RelationshipExtendLetter>() { // from class: com.p1.mobile.putong.data.RelationshipExtendLetter.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RelationshipExtendLetter relationshipExtendLetter) {
            String str = relationshipExtendLetter.message;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = relationshipExtendLetter.places;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            relationshipExtendLetter.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RelationshipExtendLetter parse(nc5 nc5Var) throws IOException {
            RelationshipExtendLetter relationshipExtendLetter = new RelationshipExtendLetter();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (relationshipExtendLetter.message == null) {
                        relationshipExtendLetter.message = "";
                    }
                    if (relationshipExtendLetter.places != null) {
                        break;
                    }
                    relationshipExtendLetter.places = "";
                    break;
                }
                if (iM162497u == 10) {
                    relationshipExtendLetter.message = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (relationshipExtendLetter.message == null) {
                            relationshipExtendLetter.message = "";
                        }
                        if (relationshipExtendLetter.places != null) {
                            break;
                        }
                        relationshipExtendLetter.places = "";
                        return relationshipExtendLetter;
                    }
                    relationshipExtendLetter.places = nc5Var.m162495s();
                }
            }
            return relationshipExtendLetter;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RelationshipExtendLetter relationshipExtendLetter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = relationshipExtendLetter.message;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = relationshipExtendLetter.places;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<RelationshipExtendLetter> JSON_ADAPTER = new ObjectJsonAdapter<RelationshipExtendLetter>() { // from class: com.p1.mobile.putong.data.RelationshipExtendLetter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RelationshipExtendLetter.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RelationshipExtendLetter newInstance() {
            return new RelationshipExtendLetter();
        }

        public boolean parseField(RelationshipExtendLetter relationshipExtendLetter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("places")) {
                relationshipExtendLetter.places = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("message")) {
                return false;
            }
            relationshipExtendLetter.message = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(RelationshipExtendLetter relationshipExtendLetter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("places") || str.equals("message")) {
                return true;
            }
            return super.parseFieldCheck(relationshipExtendLetter, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RelationshipExtendLetter relationshipExtendLetter, JsonGenerator jsonGenerator) throws IOException {
            String str = relationshipExtendLetter.message;
            if (str != null) {
                jsonGenerator.writeStringField("message", str);
            }
            String str2 = relationshipExtendLetter.places;
            if (str2 != null) {
                jsonGenerator.writeStringField("places", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RelationshipExtendLetter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RelationshipExtendLetter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RelationshipExtendLetter new_() {
        RelationshipExtendLetter relationshipExtendLetter = new RelationshipExtendLetter();
        relationshipExtendLetter.nullCheck();
        return relationshipExtendLetter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RelationshipExtendLetter mo225055clone() {
        RelationshipExtendLetter relationshipExtendLetter = new RelationshipExtendLetter();
        relationshipExtendLetter.message = this.message;
        relationshipExtendLetter.places = this.places;
        return relationshipExtendLetter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RelationshipExtendLetter)) {
            return false;
        }
        RelationshipExtendLetter relationshipExtendLetter = (RelationshipExtendLetter) obj;
        return ValueObject.util_equals(this.message, relationshipExtendLetter.message) && ValueObject.util_equals(this.places, relationshipExtendLetter.places);
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
        String str = this.message;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.places;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.message == null) {
            this.message = "";
        }
        if (this.places == null) {
            this.places = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
