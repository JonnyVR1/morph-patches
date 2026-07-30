package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class PicksUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "picksuser";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20468id;

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
            String str = picksUser.f20468id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            PicksTagType picksTagType = picksUser.picksTagType;
            if (picksTagType != null) {
                iM17233o += CodedOutputByteBufferNano.m17226h(2, picksTagType.ordinal());
            }
            String str2 = picksUser.picksTracker;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            PicksTagType picksTagType2 = picksUser.picksTagType;
            if (picksTagType2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, picksTagType2, PicksTagType.PROTOBUF_ADAPTER);
            }
            picksUser.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PicksUser parse(nb5 nb5Var) throws IOException {
            PicksUser picksUser = new PicksUser();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (picksUser.picksTagType == null && numValueOf != null) {
                        picksUser.picksTagType = (PicksTagType) PicksTagType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (picksUser.f20468id == null) {
                        picksUser.f20468id = "";
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
                if (iM158752u == 10) {
                    picksUser.f20468id = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 26) {
                    picksUser.picksTracker = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (picksUser.picksTagType == null && numValueOf != null) {
                            picksUser.picksTagType = (PicksTagType) PicksTagType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (picksUser.f20468id == null) {
                            picksUser.f20468id = "";
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
                    picksUser.picksTagType = (PicksTagType) nb5Var.m158743l(PicksTagType.PROTOBUF_ADAPTER);
                }
            }
            return picksUser;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PicksUser picksUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = picksUser.f20468id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            PicksTagType picksTagType = picksUser.picksTagType;
            if (picksTagType != null) {
                codedOutputByteBufferNano.m17250G(2, picksTagType.ordinal());
            }
            String str2 = picksUser.picksTracker;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            PicksTagType picksTagType2 = picksUser.picksTagType;
            if (picksTagType2 != null) {
                codedOutputByteBufferNano.m17254K(4, picksTagType2, PicksTagType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PicksUser> JSON_ADAPTER = new ObjectJsonAdapter<PicksUser>() { // from class: com.p1.mobile.putong.core.data.PicksUser.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PicksUser.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    picksUser.f20468id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PicksUser picksUser, JsonGenerator jsonGenerator) throws IOException {
            String str = picksUser.f20468id;
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PicksUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public PicksUser mo223809clone() {
        PicksUser picksUser = new PicksUser();
        picksUser.f20468id = this.f20468id;
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
        return ValueObject.util_equals(this.f20468id, picksUser.f20468id) && ValueObject.util_equals(this.picksTagType, picksUser.picksTagType) && ValueObject.util_equals(this.picksTracker, picksUser.picksTracker);
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
        String str = this.f20468id;
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
        if (this.f20468id == null) {
            this.f20468id = "";
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
