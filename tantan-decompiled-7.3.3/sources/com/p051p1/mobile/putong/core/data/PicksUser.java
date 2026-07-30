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
public class PicksUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "picksuser";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21210id;

    @NonNull
    @ProtobufIndex(index = 2)
    public PicksTagType picksTagType;

    @NonNull
    @ProtobufIndex(index = 3)
    public String picksTracker;
    public static ProtobufAdapter<PicksUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<PicksUser>() { // from class: com.p1.mobile.putong.core.data.PicksUser.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PicksUser picksUser) {
            String str = picksUser.f21210id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            PicksTagType picksTagType = picksUser.picksTagType;
            if (picksTagType != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(2, picksTagType.ordinal());
            }
            String str2 = picksUser.picksTracker;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            PicksTagType picksTagType2 = picksUser.picksTagType;
            if (picksTagType2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, picksTagType2, PicksTagType.PROTOBUF_ADAPTER);
            }
            picksUser.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PicksUser parse(nc5 nc5Var) throws IOException {
            PicksUser picksUser = new PicksUser();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (picksUser.picksTagType == null && numValueOf != null) {
                        picksUser.picksTagType = (PicksTagType) PicksTagType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (picksUser.f21210id == null) {
                        picksUser.f21210id = "";
                    }
                    if (picksUser.picksTagType == null) {
                        picksUser.picksTagType = (PicksTagType) PicksTagType.JSON_ADAPTER.defaultEnum();
                    }
                    if (picksUser.picksTracker != null) {
                        break;
                    }
                    picksUser.picksTracker = "";
                    break;
                }
                if (iM162497u == 10) {
                    picksUser.f21210id = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else if (iM162497u == 26) {
                    picksUser.picksTracker = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (picksUser.picksTagType == null && numValueOf != null) {
                            picksUser.picksTagType = (PicksTagType) PicksTagType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (picksUser.f21210id == null) {
                            picksUser.f21210id = "";
                        }
                        if (picksUser.picksTagType == null) {
                            picksUser.picksTagType = (PicksTagType) PicksTagType.JSON_ADAPTER.defaultEnum();
                        }
                        if (picksUser.picksTracker != null) {
                            break;
                        }
                        picksUser.picksTracker = "";
                        return picksUser;
                    }
                    picksUser.picksTagType = (PicksTagType) nc5Var.m162488l(PicksTagType.PROTOBUF_ADAPTER);
                }
            }
            return picksUser;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PicksUser picksUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = picksUser.f21210id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            PicksTagType picksTagType = picksUser.picksTagType;
            if (picksTagType != null) {
                codedOutputByteBufferNano.m17305G(2, picksTagType.ordinal());
            }
            String str2 = picksUser.picksTracker;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            PicksTagType picksTagType2 = picksUser.picksTagType;
            if (picksTagType2 != null) {
                codedOutputByteBufferNano.m17309K(4, picksTagType2, PicksTagType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PicksUser> JSON_ADAPTER = new ObjectJsonAdapter<PicksUser>() { // from class: com.p1.mobile.putong.core.data.PicksUser.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PicksUser.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PicksUser newInstance() {
            return new PicksUser();
        }

        public boolean parseField(PicksUser picksUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "picksTagType":
                    picksUser.picksTagType = PicksTagType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "picksTracker":
                    picksUser.picksTracker = jsonParser.getValueAsString();
                    return true;
                case "id":
                    picksUser.f21210id = jsonParser.getValueAsString();
                    return false;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PicksUser picksUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "picksTagType":
                case "picksTracker":
                    return true;
                case "id":
                    return false;
                default:
                    return super.parseFieldCheck(picksUser, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PicksUser picksUser, JsonGenerator jsonGenerator) throws IOException {
            String str = picksUser.f21210id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (picksUser.picksTagType != null) {
                jsonGenerator.writeFieldName("picksTagType");
                PicksTagType.JSON_ADAPTER.serialize(picksUser.picksTagType, jsonGenerator, true);
            }
            String str2 = picksUser.picksTracker;
            if (str2 != null) {
                jsonGenerator.writeStringField("picksTracker", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PicksUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PicksUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PicksUser new_() {
        PicksUser picksUser = new PicksUser();
        picksUser.nullCheck();
        return picksUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PicksUser mo225055clone() {
        PicksUser picksUser = new PicksUser();
        picksUser.f21210id = this.f21210id;
        picksUser.picksTagType = this.picksTagType;
        picksUser.picksTracker = this.picksTracker;
        return picksUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PicksUser)) {
            return false;
        }
        PicksUser picksUser = (PicksUser) obj;
        return ValueObject.util_equals(this.f21210id, picksUser.f21210id) && ValueObject.util_equals(this.picksTagType, picksUser.picksTagType) && ValueObject.util_equals(this.picksTracker, picksUser.picksTracker);
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
        String str = this.f21210id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        PicksTagType picksTagType = this.picksTagType;
        int iHashCode2 = (iHashCode + (picksTagType != null ? picksTagType.hashCode() : 0)) * 41;
        String str2 = this.picksTracker;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21210id == null) {
            this.f21210id = "";
        }
        if (this.picksTagType == null) {
            this.picksTagType = (PicksTagType) PicksTagType.JSON_ADAPTER.defaultEnum();
        }
        if (this.picksTracker == null) {
            this.picksTracker = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
