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
public class RelationshipExt extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "relationshipext";

    @NonNull
    @ProtobufIndex(index = 1)
    public String recvSuperLikedNum;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String sendSuperLikedNum;
    public static ProtobufAdapter<RelationshipExt> PROTOBUF_ADAPTER = new MessageNanoAdapter<RelationshipExt>() { // from class: com.p1.mobile.putong.core.data.RelationshipExt.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RelationshipExt relationshipExt) {
            String str = relationshipExt.recvSuperLikedNum;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = relationshipExt.sendSuperLikedNum;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) relationshipExt).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RelationshipExt m15379parse(nb5 nb5Var) throws IOException {
            RelationshipExt relationshipExt = new RelationshipExt();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (relationshipExt.recvSuperLikedNum == null) {
                        relationshipExt.recvSuperLikedNum = "";
                    }
                    if (relationshipExt.sendSuperLikedNum != null) {
                        break;
                    }
                    relationshipExt.sendSuperLikedNum = "";
                    break;
                }
                if (iU == 10) {
                    relationshipExt.recvSuperLikedNum = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (relationshipExt.recvSuperLikedNum == null) {
                            relationshipExt.recvSuperLikedNum = "";
                        }
                        if (relationshipExt.sendSuperLikedNum != null) {
                            break;
                        }
                        relationshipExt.sendSuperLikedNum = "";
                        return relationshipExt;
                    }
                    relationshipExt.sendSuperLikedNum = nb5Var.s();
                }
            }
            return relationshipExt;
        }

        public void serialize(RelationshipExt relationshipExt, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = relationshipExt.recvSuperLikedNum;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = relationshipExt.sendSuperLikedNum;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<RelationshipExt> JSON_ADAPTER = new ObjectJsonAdapter<RelationshipExt>() { // from class: com.p1.mobile.putong.core.data.RelationshipExt.2
        public Class getDataClass() {
            return RelationshipExt.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RelationshipExt m15380newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RelationshipExt) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RelationshipExt) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RelationshipExt new_() {
        RelationshipExt relationshipExt = new RelationshipExt();
        relationshipExt.nullCheck();
        return relationshipExt;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RelationshipExt m15378clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.recvSuperLikedNum;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.sendSuperLikedNum;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.recvSuperLikedNum == null) {
            this.recvSuperLikedNum = "";
        }
        if (this.sendSuperLikedNum == null) {
            this.sendSuperLikedNum = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
