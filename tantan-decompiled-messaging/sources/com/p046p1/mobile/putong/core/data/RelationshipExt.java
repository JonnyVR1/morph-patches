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
public class RelationshipExt extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "relationshipext";

    @NonNull
    @ProtobufIndex(index = 1)
    public String recvSuperLikedNum;

    @NonNull
    @ProtobufIndex(index = 2)
    public String sendSuperLikedNum;
    public static ProtobufAdapter<RelationshipExt> PROTOBUF_ADAPTER = new MessageNanoAdapter<RelationshipExt>() { // from class: com.p1.mobile.putong.core.data.RelationshipExt.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RelationshipExt relationshipExt) {
            String str = relationshipExt.recvSuperLikedNum;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = relationshipExt.sendSuperLikedNum;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            relationshipExt.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RelationshipExt parse(nb5 nb5Var) throws IOException {
            RelationshipExt relationshipExt = new RelationshipExt();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (relationshipExt.recvSuperLikedNum == null) {
                        relationshipExt.recvSuperLikedNum = "";
                    }
                    if (relationshipExt.sendSuperLikedNum != null) {
                        break;
                    }
                    relationshipExt.sendSuperLikedNum = "";
                    break;
                }
                if (iM158752u == 10) {
                    relationshipExt.recvSuperLikedNum = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (relationshipExt.recvSuperLikedNum == null) {
                            relationshipExt.recvSuperLikedNum = "";
                        }
                        if (relationshipExt.sendSuperLikedNum != null) {
                            break;
                        }
                        relationshipExt.sendSuperLikedNum = "";
                        return relationshipExt;
                    }
                    relationshipExt.sendSuperLikedNum = nb5Var.m158750s();
                }
            }
            return relationshipExt;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RelationshipExt relationshipExt, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = relationshipExt.recvSuperLikedNum;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = relationshipExt.sendSuperLikedNum;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<RelationshipExt> JSON_ADAPTER = new ObjectJsonAdapter<RelationshipExt>() { // from class: com.p1.mobile.putong.core.data.RelationshipExt.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RelationshipExt.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RelationshipExt newInstance() {
            return new RelationshipExt();
        }

        public boolean parseField(RelationshipExt relationshipExt, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("sendSuperLikedNum")) {
                relationshipExt.sendSuperLikedNum = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("recvSuperLikedNum")) {
                return false;
            }
            relationshipExt.recvSuperLikedNum = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(RelationshipExt relationshipExt, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("sendSuperLikedNum") || str.equals("recvSuperLikedNum")) {
                return true;
            }
            return super.parseFieldCheck(relationshipExt, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RelationshipExt relationshipExt, JsonGenerator jsonGenerator) throws IOException {
            String str = relationshipExt.recvSuperLikedNum;
            if (str != null) {
                jsonGenerator.writeStringField("recvSuperLikedNum", str);
            }
            String str2 = relationshipExt.sendSuperLikedNum;
            if (str2 != null) {
                jsonGenerator.writeStringField("sendSuperLikedNum", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RelationshipExt) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RelationshipExt) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RelationshipExt new_() {
        RelationshipExt relationshipExt = new RelationshipExt();
        relationshipExt.nullCheck();
        return relationshipExt;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RelationshipExt mo223809clone() {
        RelationshipExt relationshipExt = new RelationshipExt();
        relationshipExt.recvSuperLikedNum = this.recvSuperLikedNum;
        relationshipExt.sendSuperLikedNum = this.sendSuperLikedNum;
        return relationshipExt;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RelationshipExt)) {
            return false;
        }
        RelationshipExt relationshipExt = (RelationshipExt) obj;
        return ValueObject.util_equals(this.recvSuperLikedNum, relationshipExt.recvSuperLikedNum) && ValueObject.util_equals(this.sendSuperLikedNum, relationshipExt.sendSuperLikedNum);
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
        String str = this.recvSuperLikedNum;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.sendSuperLikedNum;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.recvSuperLikedNum == null) {
            this.recvSuperLikedNum = "";
        }
        if (this.sendSuperLikedNum == null) {
            this.sendSuperLikedNum = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
