package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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

/* JADX INFO: loaded from: classes13.dex */
public class BLiveFilterItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blivefilteritem";

    @ProtobufIndex(index = 6)
    public int defaultValue;

    @NonNull
    @ProtobufIndex(index = 3)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45216id;
    public boolean isFilterFileExist;

    @ProtobufIndex(index = 7)
    public boolean isSuggested;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 4)
    public String resource;

    @NonNull
    @ProtobufIndex(index = 5)
    public String type;
    public static ProtobufAdapter<BLiveFilterItem> PROTOBUF_ADAPTER = new C11814a();
    public static JsonAdapter<BLiveFilterItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFilterItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFilterItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFilterItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFilterItem newInstance() {
            return new BLiveFilterItem();
        }

        public boolean parseField(BLiveFilterItem bLiveFilterItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "defaultValue":
                    bLiveFilterItem.defaultValue = jsonParser.getValueAsInt();
                    return true;
                case "resource":
                    bLiveFilterItem.resource = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveFilterItem.f45216id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    bLiveFilterItem.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveFilterItem.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveFilterItem.type = jsonParser.getValueAsString();
                    return true;
                case "isSuggested":
                    bLiveFilterItem.isSuggested = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFilterItem bLiveFilterItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveFilterItem.f45216id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveFilterItem.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveFilterItem.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
            String str4 = bLiveFilterItem.resource;
            if (str4 != null) {
                jsonGenerator.writeStringField("resource", str4);
            }
            String str5 = bLiveFilterItem.type;
            if (str5 != null) {
                jsonGenerator.writeStringField("type", str5);
            }
            jsonGenerator.writeNumberField("defaultValue", bLiveFilterItem.defaultValue);
            jsonGenerator.writeBooleanField("isSuggested", bLiveFilterItem.isSuggested);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFilterItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveFilterItem$a */
    public class C11814a extends MessageNanoAdapter<BLiveFilterItem> {
        public C11814a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveFilterItem bLiveFilterItem) {
            String str = bLiveFilterItem.f45216id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = bLiveFilterItem.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = bLiveFilterItem.icon;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = bLiveFilterItem.resource;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = bLiveFilterItem.type;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(6, bLiveFilterItem.defaultValue) + CodedOutputByteBufferNano.m17275b(7, bLiveFilterItem.isSuggested);
            bLiveFilterItem.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveFilterItem parse(nc5 nc5Var) throws IOException {
            BLiveFilterItem bLiveFilterItem = new BLiveFilterItem();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (bLiveFilterItem.f45216id == null) {
                        bLiveFilterItem.f45216id = "";
                    }
                    if (bLiveFilterItem.name == null) {
                        bLiveFilterItem.name = "";
                    }
                    if (bLiveFilterItem.icon == null) {
                        bLiveFilterItem.icon = "";
                    }
                    if (bLiveFilterItem.resource == null) {
                        bLiveFilterItem.resource = "";
                    }
                    if (bLiveFilterItem.type != null) {
                        break;
                    }
                    bLiveFilterItem.type = "";
                    break;
                }
                if (iM162497u == 10) {
                    bLiveFilterItem.f45216id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    bLiveFilterItem.name = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    bLiveFilterItem.icon = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    bLiveFilterItem.resource = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    bLiveFilterItem.type = nc5Var.m162495s();
                } else if (iM162497u == 48) {
                    bLiveFilterItem.defaultValue = nc5Var.m162486j();
                } else {
                    if (iM162497u != 56) {
                        if (bLiveFilterItem.f45216id == null) {
                            bLiveFilterItem.f45216id = "";
                        }
                        if (bLiveFilterItem.name == null) {
                            bLiveFilterItem.name = "";
                        }
                        if (bLiveFilterItem.icon == null) {
                            bLiveFilterItem.icon = "";
                        }
                        if (bLiveFilterItem.resource == null) {
                            bLiveFilterItem.resource = "";
                        }
                        if (bLiveFilterItem.type != null) {
                            break;
                        }
                        bLiveFilterItem.type = "";
                        return bLiveFilterItem;
                    }
                    bLiveFilterItem.isSuggested = nc5Var.m162483g();
                }
            }
            return bLiveFilterItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveFilterItem bLiveFilterItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bLiveFilterItem.f45216id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = bLiveFilterItem.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = bLiveFilterItem.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = bLiveFilterItem.resource;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = bLiveFilterItem.type;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
            codedOutputByteBufferNano.m17305G(6, bLiveFilterItem.defaultValue);
            codedOutputByteBufferNano.m17299A(7, bLiveFilterItem.isSuggested);
        }
    }

    public static BLiveFilterItem new_() {
        BLiveFilterItem bLiveFilterItem = new BLiveFilterItem();
        bLiveFilterItem.nullCheck();
        return bLiveFilterItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFilterItem mo225055clone() {
        BLiveFilterItem bLiveFilterItem = new BLiveFilterItem();
        bLiveFilterItem.f45216id = this.f45216id;
        bLiveFilterItem.name = this.name;
        bLiveFilterItem.icon = this.icon;
        bLiveFilterItem.resource = this.resource;
        bLiveFilterItem.type = this.type;
        bLiveFilterItem.defaultValue = this.defaultValue;
        bLiveFilterItem.isSuggested = this.isSuggested;
        return bLiveFilterItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFilterItem)) {
            return false;
        }
        BLiveFilterItem bLiveFilterItem = (BLiveFilterItem) obj;
        return ValueObject.util_equals(this.f45216id, bLiveFilterItem.f45216id) && ValueObject.util_equals(this.name, bLiveFilterItem.name) && ValueObject.util_equals(this.icon, bLiveFilterItem.icon) && ValueObject.util_equals(this.resource, bLiveFilterItem.resource) && ValueObject.util_equals(this.type, bLiveFilterItem.type) && this.defaultValue == bLiveFilterItem.defaultValue && this.isSuggested == bLiveFilterItem.isSuggested;
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
        String str = this.f45216id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.resource;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.type;
        int iHashCode5 = ((((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + this.defaultValue) * 41) + (this.isSuggested ? 1231 : 1237);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45216id == null) {
            this.f45216id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.resource == null) {
            this.resource = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
