package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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

/* JADX INFO: loaded from: classes12.dex */
public class MomentSendFrom extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentsendfrom";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39234id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 3)
    public String sourceType;
    public static ProtobufAdapter<MomentSendFrom> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentSendFrom>() { // from class: com.p1.mobile.putong.feed.data.MomentSendFrom.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MomentSendFrom momentSendFrom) {
            String str = momentSendFrom.f39234id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = momentSendFrom.name;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = momentSendFrom.sourceType;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            momentSendFrom.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentSendFrom parse(nb5 nb5Var) throws IOException {
            MomentSendFrom momentSendFrom = new MomentSendFrom();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (momentSendFrom.f39234id == null) {
                        momentSendFrom.f39234id = "";
                    }
                    if (momentSendFrom.name == null) {
                        momentSendFrom.name = "";
                    }
                    if (momentSendFrom.sourceType != null) {
                        break;
                    }
                    momentSendFrom.sourceType = "";
                    break;
                }
                if (iM158752u == 10) {
                    momentSendFrom.f39234id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    momentSendFrom.name = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (momentSendFrom.f39234id == null) {
                            momentSendFrom.f39234id = "";
                        }
                        if (momentSendFrom.name == null) {
                            momentSendFrom.name = "";
                        }
                        if (momentSendFrom.sourceType != null) {
                            break;
                        }
                        momentSendFrom.sourceType = "";
                        return momentSendFrom;
                    }
                    momentSendFrom.sourceType = nb5Var.m158750s();
                }
            }
            return momentSendFrom;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentSendFrom momentSendFrom, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = momentSendFrom.f39234id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = momentSendFrom.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = momentSendFrom.sourceType;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
        }
    };
    public static JsonAdapter<MomentSendFrom> JSON_ADAPTER = new ObjectJsonAdapter<MomentSendFrom>() { // from class: com.p1.mobile.putong.feed.data.MomentSendFrom.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentSendFrom.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MomentSendFrom newInstance() {
            return new MomentSendFrom();
        }

        public boolean parseField(MomentSendFrom momentSendFrom, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "sourceType":
                    momentSendFrom.sourceType = jsonParser.getValueAsString();
                    return true;
                case "id":
                    momentSendFrom.f39234id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    momentSendFrom.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MomentSendFrom momentSendFrom, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "sourceType":
                    return true;
                case "id":
                    return false;
                case "name":
                    return true;
                default:
                    return super.parseFieldCheck(momentSendFrom, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentSendFrom momentSendFrom, JsonGenerator jsonGenerator) throws IOException {
            String str = momentSendFrom.f39234id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = momentSendFrom.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = momentSendFrom.sourceType;
            if (str3 != null) {
                jsonGenerator.writeStringField("sourceType", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentSendFrom) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentSendFrom) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentSendFrom new_() {
        MomentSendFrom momentSendFrom = new MomentSendFrom();
        momentSendFrom.nullCheck();
        return momentSendFrom;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MomentSendFrom mo223809clone() {
        MomentSendFrom momentSendFrom = new MomentSendFrom();
        momentSendFrom.f39234id = this.f39234id;
        momentSendFrom.name = this.name;
        momentSendFrom.sourceType = this.sourceType;
        return momentSendFrom;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentSendFrom)) {
            return false;
        }
        MomentSendFrom momentSendFrom = (MomentSendFrom) obj;
        return ValueObject.util_equals(this.f39234id, momentSendFrom.f39234id) && ValueObject.util_equals(this.name, momentSendFrom.name) && ValueObject.util_equals(this.sourceType, momentSendFrom.sourceType);
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
        String str = this.f39234id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.sourceType;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39234id == null) {
            this.f39234id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.sourceType == null) {
            this.sourceType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
