package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.LimitTimePictureStatus;
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

/* JADX INFO: loaded from: classes12.dex */
public class UnreadDetail extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "unreaddetail";

    @ProtobufIndex(index = 1)
    public int unread;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userID;
    public static ProtobufAdapter<UnreadDetail> PROTOBUF_ADAPTER = new MessageNanoAdapter<UnreadDetail>() { // from class: com.p1.mobile.putong.data.UnreadDetail.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UnreadDetail unreadDetail) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, unreadDetail.unread);
            String str = unreadDetail.userID;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            unreadDetail.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UnreadDetail parse(nb5 nb5Var) throws IOException {
            UnreadDetail unreadDetail = new UnreadDetail();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (unreadDetail.userID != null) {
                        break;
                    }
                    unreadDetail.userID = "";
                    break;
                }
                if (iM158752u == 8) {
                    unreadDetail.unread = nb5Var.m158741j();
                } else {
                    if (iM158752u != 18) {
                        if (unreadDetail.userID != null) {
                            break;
                        }
                        unreadDetail.userID = "";
                        return unreadDetail;
                    }
                    unreadDetail.userID = nb5Var.m158750s();
                }
            }
            return unreadDetail;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UnreadDetail unreadDetail, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, unreadDetail.unread);
            String str = unreadDetail.userID;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
        }
    };
    public static JsonAdapter<UnreadDetail> JSON_ADAPTER = new ObjectJsonAdapter<UnreadDetail>() { // from class: com.p1.mobile.putong.data.UnreadDetail.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UnreadDetail.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UnreadDetail newInstance() {
            return new UnreadDetail();
        }

        public boolean parseField(UnreadDetail unreadDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(LimitTimePictureStatus.unread)) {
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
            if (str.equals(LimitTimePictureStatus.unread) || str.equals("userID")) {
                return true;
            }
            return super.parseFieldCheck(unreadDetail, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UnreadDetail unreadDetail, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(LimitTimePictureStatus.unread, unreadDetail.unread);
            String str = unreadDetail.userID;
            if (str != null) {
                jsonGenerator.writeStringField("userID", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UnreadDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UnreadDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UnreadDetail new_() {
        UnreadDetail unreadDetail = new UnreadDetail();
        unreadDetail.nullCheck();
        return unreadDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UnreadDetail mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.unread) * 41;
        String str = this.userID;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userID == null) {
            this.userID = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
