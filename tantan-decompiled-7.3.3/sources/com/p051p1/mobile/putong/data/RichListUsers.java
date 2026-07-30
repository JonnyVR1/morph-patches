package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class RichListUsers extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "richlistusers";

    @ProtobufIndex(index = 6)
    public int displays;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39657id;

    @ProtobufIndex(index = 5)
    public int likes;

    @NonNull
    @ProtobufIndex(index = 10)
    public String lookingForGender;

    @ProtobufIndex(index = 8)
    public int orderPosition;

    @ProtobufIndex(index = 9)
    public int price;

    @ProtobufIndex(index = 7)
    public int reserves;

    @ProtobufIndex(index = 3)
    public int richListPosition;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    @NonNull
    @ProtobufIndex(index = 4)
    public String userID;
    public static ProtobufAdapter<RichListUsers> PROTOBUF_ADAPTER = new MessageNanoAdapter<RichListUsers>() { // from class: com.p1.mobile.putong.data.RichListUsers.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RichListUsers richListUsers) {
            String str = richListUsers.f39657id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = richListUsers.type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(3, richListUsers.richListPosition);
            String str3 = richListUsers.userID;
            if (str3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            int iM17281h2 = iM17281h + CodedOutputByteBufferNano.m17281h(5, richListUsers.likes) + CodedOutputByteBufferNano.m17281h(6, richListUsers.displays) + CodedOutputByteBufferNano.m17281h(7, richListUsers.reserves) + CodedOutputByteBufferNano.m17281h(8, richListUsers.orderPosition) + CodedOutputByteBufferNano.m17281h(9, richListUsers.price);
            String str4 = richListUsers.lookingForGender;
            if (str4 != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17288o(10, str4);
            }
            richListUsers.cachedSize = iM17281h2;
            return iM17281h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RichListUsers parse(nc5 nc5Var) throws IOException {
            RichListUsers richListUsers = new RichListUsers();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (richListUsers.f39657id == null) {
                            richListUsers.f39657id = "";
                        }
                        if (richListUsers.type == null) {
                            richListUsers.type = "";
                        }
                        if (richListUsers.userID == null) {
                            richListUsers.userID = "";
                        }
                        if (richListUsers.lookingForGender == null) {
                            richListUsers.lookingForGender = "";
                        }
                        break;
                    case 10:
                        richListUsers.f39657id = nc5Var.m162495s();
                        continue;
                    case 18:
                        richListUsers.type = nc5Var.m162495s();
                        continue;
                    case 24:
                        richListUsers.richListPosition = nc5Var.m162486j();
                        continue;
                    case 34:
                        richListUsers.userID = nc5Var.m162495s();
                        continue;
                    case 40:
                        richListUsers.likes = nc5Var.m162486j();
                        continue;
                    case 48:
                        richListUsers.displays = nc5Var.m162486j();
                        continue;
                    case 56:
                        richListUsers.reserves = nc5Var.m162486j();
                        continue;
                    case 64:
                        richListUsers.orderPosition = nc5Var.m162486j();
                        continue;
                    case 72:
                        richListUsers.price = nc5Var.m162486j();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        richListUsers.lookingForGender = nc5Var.m162495s();
                        continue;
                    default:
                        if (richListUsers.f39657id == null) {
                            richListUsers.f39657id = "";
                        }
                        if (richListUsers.type == null) {
                            richListUsers.type = "";
                        }
                        if (richListUsers.userID == null) {
                            richListUsers.userID = "";
                        }
                        if (richListUsers.lookingForGender == null) {
                            richListUsers.lookingForGender = "";
                            return richListUsers;
                        }
                        break;
                }
            }
            return richListUsers;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RichListUsers richListUsers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = richListUsers.f39657id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = richListUsers.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17305G(3, richListUsers.richListPosition);
            String str3 = richListUsers.userID;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            codedOutputByteBufferNano.m17305G(5, richListUsers.likes);
            codedOutputByteBufferNano.m17305G(6, richListUsers.displays);
            codedOutputByteBufferNano.m17305G(7, richListUsers.reserves);
            codedOutputByteBufferNano.m17305G(8, richListUsers.orderPosition);
            codedOutputByteBufferNano.m17305G(9, richListUsers.price);
            String str4 = richListUsers.lookingForGender;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(10, str4);
            }
        }
    };
    public static JsonAdapter<RichListUsers> JSON_ADAPTER = new ObjectJsonAdapter<RichListUsers>() { // from class: com.p1.mobile.putong.data.RichListUsers.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RichListUsers.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RichListUsers newInstance() {
            return new RichListUsers();
        }

        public boolean parseField(RichListUsers richListUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "orderPosition":
                    richListUsers.orderPosition = jsonParser.getValueAsInt();
                    return true;
                case "lookingForGender":
                    richListUsers.lookingForGender = jsonParser.getValueAsString();
                    return true;
                case "userID":
                    richListUsers.userID = jsonParser.getValueAsString();
                    return true;
                case "reserves":
                    richListUsers.reserves = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    richListUsers.f39657id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    richListUsers.type = jsonParser.getValueAsString();
                    return true;
                case "richListPosition":
                    richListUsers.richListPosition = jsonParser.getValueAsInt();
                    return true;
                case "likes":
                    richListUsers.likes = jsonParser.getValueAsInt();
                    return true;
                case "price":
                    richListUsers.price = jsonParser.getValueAsInt();
                    return true;
                case "displays":
                    richListUsers.displays = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RichListUsers richListUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "orderPosition":
                case "lookingForGender":
                case "userID":
                case "reserves":
                    return true;
                case "id":
                    return false;
                case "type":
                case "richListPosition":
                case "likes":
                case "price":
                case "displays":
                    return true;
                default:
                    return super.parseFieldCheck(richListUsers, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RichListUsers richListUsers, JsonGenerator jsonGenerator) throws IOException {
            String str = richListUsers.f39657id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = richListUsers.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            jsonGenerator.writeNumberField("richListPosition", richListUsers.richListPosition);
            String str3 = richListUsers.userID;
            if (str3 != null) {
                jsonGenerator.writeStringField("userID", str3);
            }
            jsonGenerator.writeNumberField("likes", richListUsers.likes);
            jsonGenerator.writeNumberField("displays", richListUsers.displays);
            jsonGenerator.writeNumberField("reserves", richListUsers.reserves);
            jsonGenerator.writeNumberField("orderPosition", richListUsers.orderPosition);
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.PRICE, richListUsers.price);
            String str4 = richListUsers.lookingForGender;
            if (str4 != null) {
                jsonGenerator.writeStringField("lookingForGender", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RichListUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RichListUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RichListUsers new_() {
        RichListUsers richListUsers = new RichListUsers();
        richListUsers.nullCheck();
        return richListUsers;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RichListUsers mo225055clone() {
        RichListUsers richListUsers = new RichListUsers();
        richListUsers.f39657id = this.f39657id;
        richListUsers.type = this.type;
        richListUsers.richListPosition = this.richListPosition;
        richListUsers.userID = this.userID;
        richListUsers.likes = this.likes;
        richListUsers.displays = this.displays;
        richListUsers.reserves = this.reserves;
        richListUsers.orderPosition = this.orderPosition;
        richListUsers.price = this.price;
        richListUsers.lookingForGender = this.lookingForGender;
        return richListUsers;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RichListUsers)) {
            return false;
        }
        RichListUsers richListUsers = (RichListUsers) obj;
        return ValueObject.util_equals(this.f39657id, richListUsers.f39657id) && ValueObject.util_equals(this.type, richListUsers.type) && this.richListPosition == richListUsers.richListPosition && ValueObject.util_equals(this.userID, richListUsers.userID) && this.likes == richListUsers.likes && this.displays == richListUsers.displays && this.reserves == richListUsers.reserves && this.orderPosition == richListUsers.orderPosition && this.price == richListUsers.price && ValueObject.util_equals(this.lookingForGender, richListUsers.lookingForGender);
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
        String str = this.f39657id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.richListPosition) * 41;
        String str3 = this.userID;
        int iHashCode3 = (((((((((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.likes) * 41) + this.displays) * 41) + this.reserves) * 41) + this.orderPosition) * 41) + this.price) * 41;
        String str4 = this.lookingForGender;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39657id == null) {
            this.f39657id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.userID == null) {
            this.userID = "";
        }
        if (this.lookingForGender == null) {
            this.lookingForGender = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
