package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.ReceiveRecords;
import com.p051p1.mobile.putong.data.Owner;
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
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class RedPacket extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "redpacket";

    @NonNull
    @ProtobufIndex(index = 7)
    public String assignAmount;

    @ProtobufIndex(index = 5)
    public int assignQuantity;

    @ProtobufIndex(index = 11)
    public long createTime;

    @ProtobufIndex(index = 10)
    public long expireTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21231id;

    @NonNull
    @ProtobufIndex(index = 13)
    public RedPacketMyInfo myInfo;

    @NonNull
    @ProtobufIndex(index = 2)
    public RedPacketOwner owner;

    @ProtobufIndex(index = 9)
    public long payExpireTime;

    @Nullable
    @ProtobufIndex(index = 14)
    public String paySign;

    @ProtobufIndex(index = 4)
    public int quantity;

    @NonNull
    @ProtobufIndex(index = 12)
    public List<ReceiveRecords> receiveRecords;

    @NonNull
    @ProtobufIndex(index = 3)
    public RedPacketInfo showInfo;

    @NonNull
    @ProtobufIndex(index = 8)
    public String splitType;

    @Nullable
    @ProtobufIndex(index = 15)
    public String status;

    @NonNull
    @ProtobufIndex(index = 6)
    public String totalAmount;
    public static ProtobufAdapter<RedPacket> PROTOBUF_ADAPTER = new MessageNanoAdapter<RedPacket>() { // from class: com.p1.mobile.putong.core.data.RedPacket.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RedPacket redPacket) {
            String str = redPacket.f21231id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            RedPacketOwner redPacketOwner = redPacket.owner;
            if (redPacketOwner != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, redPacketOwner, RedPacketOwner.PROTOBUF_ADAPTER);
            }
            RedPacketInfo redPacketInfo = redPacket.showInfo;
            if (redPacketInfo != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, redPacketInfo, RedPacketInfo.PROTOBUF_ADAPTER);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(4, redPacket.quantity) + CodedOutputByteBufferNano.m17281h(5, redPacket.assignQuantity);
            String str2 = redPacket.totalAmount;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(6, str2);
            }
            String str3 = redPacket.assignAmount;
            if (str3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(7, str3);
            }
            String str4 = redPacket.splitType;
            if (str4 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(8, str4);
            }
            int iM17283j = iM17281h + CodedOutputByteBufferNano.m17283j(9, redPacket.payExpireTime) + CodedOutputByteBufferNano.m17283j(10, redPacket.expireTime) + CodedOutputByteBufferNano.m17283j(11, redPacket.createTime);
            List<ReceiveRecords> list = redPacket.receiveRecords;
            if (list != null) {
                iM17283j += CodedOutputByteBufferNano.m17285l(12, list, ReceiveRecords.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            RedPacketMyInfo redPacketMyInfo = redPacket.myInfo;
            if (redPacketMyInfo != null) {
                iM17283j += CodedOutputByteBufferNano.m17285l(13, redPacketMyInfo, RedPacketMyInfo.PROTOBUF_ADAPTER);
            }
            String str5 = redPacket.paySign;
            if (str5 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(14, str5);
            }
            String str6 = redPacket.status;
            if (str6 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(15, str6);
            }
            redPacket.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RedPacket parse(nc5 nc5Var) throws IOException {
            RedPacket redPacket = new RedPacket();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (redPacket.f21231id == null) {
                            redPacket.f21231id = "";
                        }
                        if (redPacket.owner == null) {
                            redPacket.owner = RedPacketOwner.new_();
                        }
                        if (redPacket.showInfo == null) {
                            redPacket.showInfo = RedPacketInfo.new_();
                        }
                        if (redPacket.totalAmount == null) {
                            redPacket.totalAmount = "";
                        }
                        if (redPacket.assignAmount == null) {
                            redPacket.assignAmount = "";
                        }
                        if (redPacket.splitType == null) {
                            redPacket.splitType = "";
                        }
                        if (redPacket.receiveRecords == null) {
                            redPacket.receiveRecords = new ArrayList();
                        }
                        if (redPacket.myInfo == null) {
                            redPacket.myInfo = RedPacketMyInfo.new_();
                        }
                        break;
                    case 10:
                        redPacket.f21231id = nc5Var.m162495s();
                        continue;
                    case 18:
                        redPacket.owner = (RedPacketOwner) nc5Var.m162488l(RedPacketOwner.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        redPacket.showInfo = (RedPacketInfo) nc5Var.m162488l(RedPacketInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 32:
                        redPacket.quantity = nc5Var.m162486j();
                        continue;
                    case 40:
                        redPacket.assignQuantity = nc5Var.m162486j();
                        continue;
                    case 50:
                        redPacket.totalAmount = nc5Var.m162495s();
                        continue;
                    case 58:
                        redPacket.assignAmount = nc5Var.m162495s();
                        continue;
                    case 66:
                        redPacket.splitType = nc5Var.m162495s();
                        continue;
                    case 72:
                        redPacket.payExpireTime = nc5Var.m162487k();
                        continue;
                    case 80:
                        redPacket.expireTime = nc5Var.m162487k();
                        continue;
                    case 88:
                        redPacket.createTime = nc5Var.m162487k();
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        redPacket.receiveRecords = (List) nc5Var.m162488l(ReceiveRecords.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 106:
                        redPacket.myInfo = (RedPacketMyInfo) nc5Var.m162488l(RedPacketMyInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 114:
                        redPacket.paySign = nc5Var.m162495s();
                        continue;
                    case 122:
                        redPacket.status = nc5Var.m162495s();
                        continue;
                    default:
                        if (redPacket.f21231id == null) {
                            redPacket.f21231id = "";
                        }
                        if (redPacket.owner == null) {
                            redPacket.owner = RedPacketOwner.new_();
                        }
                        if (redPacket.showInfo == null) {
                            redPacket.showInfo = RedPacketInfo.new_();
                        }
                        if (redPacket.totalAmount == null) {
                            redPacket.totalAmount = "";
                        }
                        if (redPacket.assignAmount == null) {
                            redPacket.assignAmount = "";
                        }
                        if (redPacket.splitType == null) {
                            redPacket.splitType = "";
                        }
                        if (redPacket.receiveRecords == null) {
                            redPacket.receiveRecords = new ArrayList();
                        }
                        if (redPacket.myInfo == null) {
                            redPacket.myInfo = RedPacketMyInfo.new_();
                            return redPacket;
                        }
                        break;
                }
            }
            return redPacket;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RedPacket redPacket, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = redPacket.f21231id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            RedPacketOwner redPacketOwner = redPacket.owner;
            if (redPacketOwner != null) {
                codedOutputByteBufferNano.m17309K(2, redPacketOwner, RedPacketOwner.PROTOBUF_ADAPTER);
            }
            RedPacketInfo redPacketInfo = redPacket.showInfo;
            if (redPacketInfo != null) {
                codedOutputByteBufferNano.m17309K(3, redPacketInfo, RedPacketInfo.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17305G(4, redPacket.quantity);
            codedOutputByteBufferNano.m17305G(5, redPacket.assignQuantity);
            String str2 = redPacket.totalAmount;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(6, str2);
            }
            String str3 = redPacket.assignAmount;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(7, str3);
            }
            String str4 = redPacket.splitType;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(8, str4);
            }
            codedOutputByteBufferNano.m17307I(9, redPacket.payExpireTime);
            codedOutputByteBufferNano.m17307I(10, redPacket.expireTime);
            codedOutputByteBufferNano.m17307I(11, redPacket.createTime);
            List<ReceiveRecords> list = redPacket.receiveRecords;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(12, list, ReceiveRecords.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            RedPacketMyInfo redPacketMyInfo = redPacket.myInfo;
            if (redPacketMyInfo != null) {
                codedOutputByteBufferNano.m17309K(13, redPacketMyInfo, RedPacketMyInfo.PROTOBUF_ADAPTER);
            }
            String str5 = redPacket.paySign;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(14, str5);
            }
            String str6 = redPacket.status;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(15, str6);
            }
        }
    };
    public static JsonAdapter<RedPacket> JSON_ADAPTER = new ObjectJsonAdapter<RedPacket>() { // from class: com.p1.mobile.putong.core.data.RedPacket.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RedPacket.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RedPacket newInstance() {
            return new RedPacket();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(RedPacket redPacket, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1885090337:
                    if (str.equals("receiveRecords")) {
                        b = 0;
                    }
                    break;
                case -1285004149:
                    if (str.equals(FirebaseAnalytics.Param.QUANTITY)) {
                        b = 1;
                    }
                    break;
                case -1257401156:
                    if (str.equals("totalAmount")) {
                        b = 2;
                    }
                    break;
                case -1060360070:
                    if (str.equals("myInfo")) {
                        b = 3;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 4;
                    }
                    break;
                case -834724724:
                    if (str.equals("expireTime")) {
                        b = 5;
                    }
                    break;
                case -787452283:
                    if (str.equals("paySign")) {
                        b = 6;
                    }
                    break;
                case -389286060:
                    if (str.equals("payExpireTime")) {
                        b = 7;
                    }
                    break;
                case -339153589:
                    if (str.equals("showInfo")) {
                        b = 8;
                    }
                    break;
                case -155784550:
                    if (str.equals("assignQuantity")) {
                        b = 9;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 10;
                    }
                    break;
                case 106164915:
                    if (str.equals(Owner.TYPE)) {
                        b = 11;
                    }
                    break;
                case 404357492:
                    if (str.equals("splitType")) {
                        b = 12;
                    }
                    break;
                case 1369213417:
                    if (str.equals("createTime")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1438715431:
                    if (str.equals("assignAmount")) {
                        b = 14;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    redPacket.receiveRecords = JsonAdapter.parseArray(jsonParser, ReceiveRecords.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    redPacket.quantity = jsonParser.getValueAsInt();
                    return true;
                case 2:
                    redPacket.totalAmount = jsonParser.getValueAsString();
                    return true;
                case 3:
                    redPacket.myInfo = RedPacketMyInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    redPacket.status = jsonParser.getValueAsString();
                    return true;
                case 5:
                    redPacket.expireTime = jsonParser.getValueAsLong();
                    return true;
                case 6:
                    redPacket.paySign = jsonParser.getValueAsString();
                    return true;
                case 7:
                    redPacket.payExpireTime = jsonParser.getValueAsLong();
                    return true;
                case 8:
                    redPacket.showInfo = RedPacketInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    redPacket.assignQuantity = jsonParser.getValueAsInt();
                    return true;
                case 10:
                    redPacket.f21231id = jsonParser.getValueAsString();
                    return false;
                case 11:
                    redPacket.owner = RedPacketOwner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    redPacket.splitType = jsonParser.getValueAsString();
                    return true;
                case 13:
                    redPacket.createTime = jsonParser.getValueAsLong();
                    return true;
                case 14:
                    redPacket.assignAmount = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(RedPacket redPacket, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1885090337:
                    if (str.equals("receiveRecords")) {
                        b = 0;
                    }
                    break;
                case -1285004149:
                    if (str.equals(FirebaseAnalytics.Param.QUANTITY)) {
                        b = 1;
                    }
                    break;
                case -1257401156:
                    if (str.equals("totalAmount")) {
                        b = 2;
                    }
                    break;
                case -1060360070:
                    if (str.equals("myInfo")) {
                        b = 3;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 4;
                    }
                    break;
                case -834724724:
                    if (str.equals("expireTime")) {
                        b = 5;
                    }
                    break;
                case -787452283:
                    if (str.equals("paySign")) {
                        b = 6;
                    }
                    break;
                case -389286060:
                    if (str.equals("payExpireTime")) {
                        b = 7;
                    }
                    break;
                case -339153589:
                    if (str.equals("showInfo")) {
                        b = 8;
                    }
                    break;
                case -155784550:
                    if (str.equals("assignQuantity")) {
                        b = 9;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 10;
                    }
                    break;
                case 106164915:
                    if (str.equals(Owner.TYPE)) {
                        b = 11;
                    }
                    break;
                case 404357492:
                    if (str.equals("splitType")) {
                        b = 12;
                    }
                    break;
                case 1369213417:
                    if (str.equals("createTime")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1438715431:
                    if (str.equals("assignAmount")) {
                        b = 14;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return true;
                case 10:
                    return false;
                case 11:
                case 12:
                case 13:
                case 14:
                    return true;
                default:
                    return super.parseFieldCheck(redPacket, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RedPacket redPacket, JsonGenerator jsonGenerator) throws IOException {
            String str = redPacket.f21231id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (redPacket.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                RedPacketOwner.JSON_ADAPTER.serialize(redPacket.owner, jsonGenerator, true);
            }
            if (redPacket.showInfo != null) {
                jsonGenerator.writeFieldName("showInfo");
                RedPacketInfo.JSON_ADAPTER.serialize(redPacket.showInfo, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.QUANTITY, redPacket.quantity);
            jsonGenerator.writeNumberField("assignQuantity", redPacket.assignQuantity);
            String str2 = redPacket.totalAmount;
            if (str2 != null) {
                jsonGenerator.writeStringField("totalAmount", str2);
            }
            String str3 = redPacket.assignAmount;
            if (str3 != null) {
                jsonGenerator.writeStringField("assignAmount", str3);
            }
            String str4 = redPacket.splitType;
            if (str4 != null) {
                jsonGenerator.writeStringField("splitType", str4);
            }
            jsonGenerator.writeNumberField("payExpireTime", redPacket.payExpireTime);
            jsonGenerator.writeNumberField("expireTime", redPacket.expireTime);
            jsonGenerator.writeNumberField("createTime", redPacket.createTime);
            if (redPacket.receiveRecords != null) {
                jsonGenerator.writeFieldName("receiveRecords");
                JsonAdapter.serializeArray(redPacket.receiveRecords, jsonGenerator, ReceiveRecords.JSON_ADAPTER);
            }
            if (redPacket.myInfo != null) {
                jsonGenerator.writeFieldName("myInfo");
                RedPacketMyInfo.JSON_ADAPTER.serialize(redPacket.myInfo, jsonGenerator, true);
            }
            String str5 = redPacket.paySign;
            if (str5 != null) {
                jsonGenerator.writeStringField("paySign", str5);
            }
            String str6 = redPacket.status;
            if (str6 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str6);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RedPacket) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RedPacket) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RedPacket new_() {
        RedPacket redPacket = new RedPacket();
        redPacket.nullCheck();
        return redPacket;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RedPacket mo225055clone() {
        RedPacket redPacket = new RedPacket();
        redPacket.f21231id = this.f21231id;
        RedPacketOwner redPacketOwner = this.owner;
        if (redPacketOwner != null) {
            redPacket.owner = redPacketOwner.mo225055clone();
        }
        RedPacketInfo redPacketInfo = this.showInfo;
        if (redPacketInfo != null) {
            redPacket.showInfo = redPacketInfo.mo225055clone();
        }
        redPacket.quantity = this.quantity;
        redPacket.assignQuantity = this.assignQuantity;
        redPacket.totalAmount = this.totalAmount;
        redPacket.assignAmount = this.assignAmount;
        redPacket.splitType = this.splitType;
        redPacket.payExpireTime = this.payExpireTime;
        redPacket.expireTime = this.expireTime;
        redPacket.createTime = this.createTime;
        List<ReceiveRecords> list = this.receiveRecords;
        if (list != null) {
            redPacket.receiveRecords = ValueObject.util_map(list, new qcj() { // from class: l.psc0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ReceiveRecords) obj).mo225055clone();
                }
            });
        }
        RedPacketMyInfo redPacketMyInfo = this.myInfo;
        if (redPacketMyInfo != null) {
            redPacket.myInfo = redPacketMyInfo.mo225055clone();
        }
        redPacket.paySign = this.paySign;
        redPacket.status = this.status;
        return redPacket;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RedPacket)) {
            return false;
        }
        RedPacket redPacket = (RedPacket) obj;
        return ValueObject.util_equals(this.f21231id, redPacket.f21231id) && ValueObject.util_equals(this.owner, redPacket.owner) && ValueObject.util_equals(this.showInfo, redPacket.showInfo) && this.quantity == redPacket.quantity && this.assignQuantity == redPacket.assignQuantity && ValueObject.util_equals(this.totalAmount, redPacket.totalAmount) && ValueObject.util_equals(this.assignAmount, redPacket.assignAmount) && ValueObject.util_equals(this.splitType, redPacket.splitType) && this.payExpireTime == redPacket.payExpireTime && this.expireTime == redPacket.expireTime && this.createTime == redPacket.createTime && ValueObject.util_equals(this.receiveRecords, redPacket.receiveRecords) && ValueObject.util_equals(this.myInfo, redPacket.myInfo) && ValueObject.util_equals(this.paySign, redPacket.paySign) && ValueObject.util_equals(this.status, redPacket.status);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "redpacket";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f21231id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        RedPacketOwner redPacketOwner = this.owner;
        int iHashCode2 = (iHashCode + (redPacketOwner != null ? redPacketOwner.hashCode() : 0)) * 41;
        RedPacketInfo redPacketInfo = this.showInfo;
        int iHashCode3 = (((((iHashCode2 + (redPacketInfo != null ? redPacketInfo.hashCode() : 0)) * 41) + this.quantity) * 41) + this.assignQuantity) * 41;
        String str2 = this.totalAmount;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.assignAmount;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.splitType;
        int iHashCode6 = str4 != null ? str4.hashCode() : 0;
        long j = this.payExpireTime;
        int i3 = (((iHashCode5 + iHashCode6) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.expireTime;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.createTime;
        int i5 = (i4 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        List<ReceiveRecords> list = this.receiveRecords;
        int iHashCode7 = (i5 + (list != null ? list.hashCode() : 0)) * 41;
        RedPacketMyInfo redPacketMyInfo = this.myInfo;
        int iHashCode8 = (iHashCode7 + (redPacketMyInfo != null ? redPacketMyInfo.hashCode() : 0)) * 41;
        String str5 = this.paySign;
        int iHashCode9 = (iHashCode8 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.status;
        int iHashCode10 = iHashCode9 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21231id == null) {
            this.f21231id = "";
        }
        if (this.owner == null) {
            this.owner = RedPacketOwner.new_();
        }
        if (this.showInfo == null) {
            this.showInfo = RedPacketInfo.new_();
        }
        if (this.totalAmount == null) {
            this.totalAmount = "";
        }
        if (this.assignAmount == null) {
            this.assignAmount = "";
        }
        if (this.splitType == null) {
            this.splitType = "";
        }
        if (this.receiveRecords == null) {
            this.receiveRecords = new ArrayList();
        }
        if (this.myInfo == null) {
            this.myInfo = RedPacketMyInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
