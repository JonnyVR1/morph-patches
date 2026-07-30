package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class UnreadDetail extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "unreaddetail";

    @ProtobufIndex(index = 1)
    public int unread;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userID;
    public static ProtobufAdapter<UnreadDetail> PROTOBUF_ADAPTER = new MessageNanoAdapter<UnreadDetail>() { // from class: com.p1.mobile.putong.data.UnreadDetail.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UnreadDetail unreadDetail) {
            int iH = CodedOutputByteBufferNano.h(1, unreadDetail.unread);
            String str = unreadDetail.userID;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) unreadDetail).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UnreadDetail m19142parse(nb5 nb5Var) throws IOException {
            UnreadDetail unreadDetail = new UnreadDetail();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (unreadDetail.userID != null) {
                        break;
                    }
                    unreadDetail.userID = "";
                    break;
                }
                if (iU == 8) {
                    unreadDetail.unread = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (unreadDetail.userID != null) {
                            break;
                        }
                        unreadDetail.userID = "";
                        return unreadDetail;
                    }
                    unreadDetail.userID = nb5Var.s();
                }
            }
            return unreadDetail;
        }

        public void serialize(UnreadDetail unreadDetail, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, unreadDetail.unread);
            String str = unreadDetail.userID;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<UnreadDetail> JSON_ADAPTER = new ObjectJsonAdapter<UnreadDetail>() { // from class: com.p1.mobile.putong.data.UnreadDetail.2
        public Class getDataClass() {
            return UnreadDetail.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UnreadDetail mo17830newInstance() {
            return new UnreadDetail();
        }

        public boolean parseField(UnreadDetail unreadDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("unread")) {
                unreadDetail.unread = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("userID")) {
                return false;
            }
            unreadDetail.userID = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(UnreadDetail unreadDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("unread") || str.equals("userID")) {
                return true;
            }
            return super.parseFieldCheck(unreadDetail, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UnreadDetail unreadDetail, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("unread", unreadDetail.unread);
            String str = unreadDetail.userID;
            if (str != null) {
                jsonGenerator.writeStringField("userID", str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UnreadDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UnreadDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UnreadDetail new_() {
        UnreadDetail unreadDetail = new UnreadDetail();
        unreadDetail.nullCheck();
        return unreadDetail;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UnreadDetail m19141clone() {
        UnreadDetail unreadDetail = new UnreadDetail();
        unreadDetail.unread = this.unread;
        unreadDetail.userID = this.userID;
        return unreadDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UnreadDetail)) {
            return false;
        }
        UnreadDetail unreadDetail = (UnreadDetail) obj;
        return this.unread == unreadDetail.unread && ValueObject.util_equals(this.userID, unreadDetail.userID);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.unread) * 41;
        String str = this.userID;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.userID == null) {
            this.userID = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
