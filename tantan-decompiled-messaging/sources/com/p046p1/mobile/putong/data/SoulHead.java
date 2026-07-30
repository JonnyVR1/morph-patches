package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class SoulHead extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "soulhead";

    @NonNull
    @ProtobufIndex(index = 3)
    public String gender;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38821id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;
    public static ProtobufAdapter<SoulHead> PROTOBUF_ADAPTER = new MessageNanoAdapter<SoulHead>() { // from class: com.p1.mobile.putong.data.SoulHead.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SoulHead soulHead) {
            String str = soulHead.f38821id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = soulHead.url;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = soulHead.gender;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            soulHead.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SoulHead parse(nb5 nb5Var) throws IOException {
            SoulHead soulHead = new SoulHead();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (soulHead.f38821id == null) {
                        soulHead.f38821id = "";
                    }
                    if (soulHead.url == null) {
                        soulHead.url = "";
                    }
                    if (soulHead.gender != null) {
                        break;
                    }
                    soulHead.gender = "";
                    break;
                }
                if (iM158752u == 10) {
                    soulHead.f38821id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    soulHead.url = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (soulHead.f38821id == null) {
                            soulHead.f38821id = "";
                        }
                        if (soulHead.url == null) {
                            soulHead.url = "";
                        }
                        if (soulHead.gender != null) {
                            break;
                        }
                        soulHead.gender = "";
                        return soulHead;
                    }
                    soulHead.gender = nb5Var.m158750s();
                }
            }
            return soulHead;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SoulHead soulHead, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = soulHead.f38821id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = soulHead.url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = soulHead.gender;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
        }
    };
    public static JsonAdapter<SoulHead> JSON_ADAPTER = new ObjectJsonAdapter<SoulHead>() { // from class: com.p1.mobile.putong.data.SoulHead.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SoulHead.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SoulHead newInstance() {
            return new SoulHead();
        }

        public boolean parseField(SoulHead soulHead, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "gender":
                    soulHead.gender = jsonParser.getValueAsString();
                    return true;
                case "id":
                    soulHead.f38821id = jsonParser.getValueAsString();
                    return false;
                case "url":
                    soulHead.url = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SoulHead soulHead, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "gender":
                    return true;
                case "id":
                    return false;
                case "url":
                    return true;
                default:
                    return super.parseFieldCheck(soulHead, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SoulHead soulHead, JsonGenerator jsonGenerator) throws IOException {
            String str = soulHead.f38821id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = soulHead.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            String str3 = soulHead.gender;
            if (str3 != null) {
                jsonGenerator.writeStringField("gender", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SoulHead) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SoulHead) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SoulHead new_() {
        SoulHead soulHead = new SoulHead();
        soulHead.nullCheck();
        return soulHead;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SoulHead mo223809clone() {
        SoulHead soulHead = new SoulHead();
        soulHead.f38821id = this.f38821id;
        soulHead.url = this.url;
        soulHead.gender = this.gender;
        return soulHead;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SoulHead)) {
            return false;
        }
        SoulHead soulHead = (SoulHead) obj;
        return ValueObject.util_equals(this.f38821id, soulHead.f38821id) && ValueObject.util_equals(this.url, soulHead.url) && ValueObject.util_equals(this.gender, soulHead.gender);
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
        String str = this.f38821id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.gender;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38821id == null) {
            this.f38821id = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.gender == null) {
            this.gender = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
