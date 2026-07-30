package com.p000p1.mobile.putong.core.data;

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
public class MomentCard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentcard";

    @ProtobufIndex(index = 1)
    public boolean fillUser;
    public static ProtobufAdapter<MomentCard> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentCard>() { // from class: com.p1.mobile.putong.core.data.MomentCard.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MomentCard momentCard) {
            int iB = CodedOutputByteBufferNano.b(1, momentCard.fillUser);
            ((MessageNano) momentCard).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentCard m14333parse(nb5 nb5Var) throws IOException {
            MomentCard momentCard = new MomentCard();
            while (nb5Var.u() == 8) {
                momentCard.fillUser = nb5Var.g();
            }
            return momentCard;
        }

        public void serialize(MomentCard momentCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, momentCard.fillUser);
        }
    };
    public static JsonAdapter<MomentCard> JSON_ADAPTER = new ObjectJsonAdapter<MomentCard>() { // from class: com.p1.mobile.putong.core.data.MomentCard.2
        public Class getDataClass() {
            return MomentCard.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MomentCard m14334newInstance() {
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

        public void serializeFields(MomentCard momentCard, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("fillUser", momentCard.fillUser);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentCard new_() {
        MomentCard momentCard = new MomentCard();
        momentCard.nullCheck();
        return momentCard;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentCard m14332clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.fillUser ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
