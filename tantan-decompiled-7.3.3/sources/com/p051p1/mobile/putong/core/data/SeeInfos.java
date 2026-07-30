package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class SeeInfos extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "seeinfos";

    @NonNull
    @ProtobufIndex(index = 3)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<SeeInfos> PROTOBUF_ADAPTER = new MessageNanoAdapter<SeeInfos>() { // from class: com.p1.mobile.putong.core.data.SeeInfos.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SeeInfos seeInfos) {
            String str = seeInfos.userId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = seeInfos.type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = seeInfos.icon;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            seeInfos.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SeeInfos parse(nc5 nc5Var) throws IOException {
            SeeInfos seeInfos = new SeeInfos();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (seeInfos.userId == null) {
                        seeInfos.userId = "";
                    }
                    if (seeInfos.type == null) {
                        seeInfos.type = "";
                    }
                    if (seeInfos.icon != null) {
                        break;
                    }
                    seeInfos.icon = "";
                    break;
                }
                if (iM162497u == 10) {
                    seeInfos.userId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    seeInfos.type = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (seeInfos.userId == null) {
                            seeInfos.userId = "";
                        }
                        if (seeInfos.type == null) {
                            seeInfos.type = "";
                        }
                        if (seeInfos.icon != null) {
                            break;
                        }
                        seeInfos.icon = "";
                        return seeInfos;
                    }
                    seeInfos.icon = nc5Var.m162495s();
                }
            }
            return seeInfos;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SeeInfos seeInfos, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = seeInfos.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = seeInfos.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = seeInfos.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<SeeInfos> JSON_ADAPTER = new ObjectJsonAdapter<SeeInfos>() { // from class: com.p1.mobile.putong.core.data.SeeInfos.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SeeInfos.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SeeInfos newInstance() {
            return new SeeInfos();
        }

        public boolean parseField(SeeInfos seeInfos, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    seeInfos.userId = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    seeInfos.icon = jsonParser.getValueAsString();
                    return true;
                case "type":
                    seeInfos.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SeeInfos seeInfos, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userId":
                case "icon":
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(seeInfos, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SeeInfos seeInfos, JsonGenerator jsonGenerator) throws IOException {
            String str = seeInfos.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = seeInfos.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = seeInfos.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeeInfos) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeeInfos) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SeeInfos new_() {
        SeeInfos seeInfos = new SeeInfos();
        seeInfos.nullCheck();
        return seeInfos;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SeeInfos mo225055clone() {
        SeeInfos seeInfos = new SeeInfos();
        seeInfos.userId = this.userId;
        seeInfos.type = this.type;
        seeInfos.icon = this.icon;
        return seeInfos;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SeeInfos)) {
            return false;
        }
        SeeInfos seeInfos = (SeeInfos) obj;
        return ValueObject.util_equals(this.userId, seeInfos.userId) && ValueObject.util_equals(this.type, seeInfos.type) && ValueObject.util_equals(this.icon, seeInfos.icon);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
