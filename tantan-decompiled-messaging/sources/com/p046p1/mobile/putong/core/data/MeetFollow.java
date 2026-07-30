package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
public class MeetFollow extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "meetfollow";

    @NonNull
    @ProtobufIndex(index = 1)
    public String status;
    public static ProtobufAdapter<MeetFollow> PROTOBUF_ADAPTER = new MessageNanoAdapter<MeetFollow>() { // from class: com.p1.mobile.putong.core.data.MeetFollow.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MeetFollow meetFollow) {
            String str = meetFollow.status;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            meetFollow.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MeetFollow parse(nb5 nb5Var) throws IOException {
            MeetFollow meetFollow = new MeetFollow();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (meetFollow.status != null) {
                        break;
                    }
                    meetFollow.status = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (meetFollow.status != null) {
                        break;
                    }
                    meetFollow.status = "";
                    return meetFollow;
                }
                meetFollow.status = nb5Var.m158750s();
            }
            return meetFollow;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MeetFollow meetFollow, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = meetFollow.status;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<MeetFollow> JSON_ADAPTER = new ObjectJsonAdapter<MeetFollow>() { // from class: com.p1.mobile.putong.core.data.MeetFollow.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MeetFollow.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MeetFollow newInstance() {
            return new MeetFollow();
        }

        public boolean parseField(MeetFollow meetFollow, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return false;
            }
            meetFollow.status = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(MeetFollow meetFollow, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return true;
            }
            return super.parseFieldCheck(meetFollow, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MeetFollow meetFollow, JsonGenerator jsonGenerator) throws IOException {
            String str = meetFollow.status;
            if (str != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MeetFollow) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MeetFollow) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MeetFollow new_() {
        MeetFollow meetFollow = new MeetFollow();
        meetFollow.nullCheck();
        return meetFollow;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MeetFollow mo223809clone() {
        MeetFollow meetFollow = new MeetFollow();
        meetFollow.status = this.status;
        return meetFollow;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MeetFollow) {
            return ValueObject.util_equals(this.status, ((MeetFollow) obj).status);
        }
        return false;
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
        String str = this.status;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.status == null) {
            this.status = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
