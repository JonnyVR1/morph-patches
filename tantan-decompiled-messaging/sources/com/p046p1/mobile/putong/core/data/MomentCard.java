package com.p046p1.mobile.putong.core.data;

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
public class MomentCard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentcard";

    @ProtobufIndex(index = 1)
    public boolean fillUser;
    public static ProtobufAdapter<MomentCard> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentCard>() { // from class: com.p1.mobile.putong.core.data.MomentCard.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MomentCard momentCard) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, momentCard.fillUser);
            momentCard.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentCard parse(nb5 nb5Var) throws IOException {
            MomentCard momentCard = new MomentCard();
            while (nb5Var.m158752u() == 8) {
                momentCard.fillUser = nb5Var.m158738g();
            }
            return momentCard;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentCard momentCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, momentCard.fillUser);
        }
    };
    public static JsonAdapter<MomentCard> JSON_ADAPTER = new ObjectJsonAdapter<MomentCard>() { // from class: com.p1.mobile.putong.core.data.MomentCard.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentCard.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MomentCard newInstance() {
            return new MomentCard();
        }

        public boolean parseField(MomentCard momentCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("fillUser")) {
                return false;
            }
            momentCard.fillUser = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(MomentCard momentCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("fillUser")) {
                return true;
            }
            return super.parseFieldCheck(momentCard, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentCard momentCard, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("fillUser", momentCard.fillUser);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentCard new_() {
        MomentCard momentCard = new MomentCard();
        momentCard.nullCheck();
        return momentCard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MomentCard mo223809clone() {
        MomentCard momentCard = new MomentCard();
        momentCard.fillUser = this.fillUser;
        return momentCard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof MomentCard) && this.fillUser == ((MomentCard) obj).fillUser;
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
        int i2 = (i * 41) + (this.fillUser ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
