package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class LiveGiftItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livegiftitem";

    @NonNull
    @ProtobufIndex(index = 14)
    public String animationType;

    @NonNull
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
    public String animationUrl;

    @ProtobufIndex(index = 12)
    public long combosDuration;
    public List<Double> detailInset;
    public String detailUrl;

    @NonNull
    @ProtobufIndex(index = 18)
    public String endTagColor;

    @ProtobufIndex(index = 23)
    public long expiredTime;

    @ProtobufIndex(index = 13)
    public int fastGiftNum;

    @ProtobufIndex(index = 11)
    public int giftLevel;

    @ProtobufIndex(index = 21)
    public int giftSource;

    @NonNull
    @ProtobufIndex(index = 2)
    public String giftType;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f233id;

    @NonNull
    @ProtobufIndex(index = 4)
    public LangModel localName;

    @Nullable
    @ProtobufIndex(index = 10)
    public LangModel localTag;

    @ProtobufIndex(index = 24)
    public boolean mobileVibration;

    @NonNull
    @ProtobufIndex(index = 3)
    public String name;
    public String packageId;
    public int position;

    @ProtobufIndex(index = 7)
    public double purchasePrice;

    @ProtobufIndex(index = 22)
    public int remain;

    @NonNull
    @ProtobufIndex(index = 17)
    public String startTagColor;

    @NonNull
    @ProtobufIndex(index = 8)
    public String status;
    public String subtitle;

    @Nullable
    @ProtobufIndex(index = 9)
    public String tag;

    @NonNull
    @ProtobufIndex(index = 19)
    public String tagTextColor;
    public String title;

    @ProtobufIndex(index = 20)
    public long trayDuration;

    @ProtobufIndex(index = 6)
    public double unitPrice;

    @NonNull
    @ProtobufIndex(index = 5)
    public String url;

    @ProtobufIndex(index = 15)
    public long version;
    public static ProtobufAdapter<LiveGiftItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveGiftItem>() { // from class: com.p1.mobile.putong.data.LiveGiftItem.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveGiftItem liveGiftItem) {
            int iH = CodedOutputByteBufferNano.h(1, liveGiftItem.f233id);
            String str = liveGiftItem.giftType;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = liveGiftItem.name;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(3, str2);
            }
            LangModel langModel = liveGiftItem.localName;
            if (langModel != null) {
                iH += CodedOutputByteBufferNano.l(4, langModel, LangModel.PROTOBUF_ADAPTER);
            }
            String str3 = liveGiftItem.url;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(5, str3);
            }
            int iD = iH + CodedOutputByteBufferNano.d(6, liveGiftItem.unitPrice) + CodedOutputByteBufferNano.d(7, liveGiftItem.purchasePrice);
            String str4 = liveGiftItem.status;
            if (str4 != null) {
                iD += CodedOutputByteBufferNano.o(8, str4);
            }
            String str5 = liveGiftItem.tag;
            if (str5 != null) {
                iD += CodedOutputByteBufferNano.o(9, str5);
            }
            LangModel langModel2 = liveGiftItem.localTag;
            if (langModel2 != null) {
                iD += CodedOutputByteBufferNano.l(10, langModel2, LangModel.PROTOBUF_ADAPTER);
            }
            int iH2 = iD + CodedOutputByteBufferNano.h(11, liveGiftItem.giftLevel) + CodedOutputByteBufferNano.j(12, liveGiftItem.combosDuration) + CodedOutputByteBufferNano.h(13, liveGiftItem.fastGiftNum);
            String str6 = liveGiftItem.animationType;
            if (str6 != null) {
                iH2 += CodedOutputByteBufferNano.o(14, str6);
            }
            int iJ = iH2 + CodedOutputByteBufferNano.j(15, liveGiftItem.version);
            String str7 = liveGiftItem.animationUrl;
            if (str7 != null) {
                iJ += CodedOutputByteBufferNano.o(16, str7);
            }
            String str8 = liveGiftItem.startTagColor;
            if (str8 != null) {
                iJ += CodedOutputByteBufferNano.o(17, str8);
            }
            String str9 = liveGiftItem.endTagColor;
            if (str9 != null) {
                iJ += CodedOutputByteBufferNano.o(18, str9);
            }
            String str10 = liveGiftItem.tagTextColor;
            if (str10 != null) {
                iJ += CodedOutputByteBufferNano.o(19, str10);
            }
            int iJ2 = iJ + CodedOutputByteBufferNano.j(20, liveGiftItem.trayDuration) + CodedOutputByteBufferNano.h(21, liveGiftItem.giftSource) + CodedOutputByteBufferNano.h(22, liveGiftItem.remain) + CodedOutputByteBufferNano.j(23, liveGiftItem.expiredTime) + CodedOutputByteBufferNano.b(24, liveGiftItem.mobileVibration);
            ((MessageNano) liveGiftItem).cachedSize = iJ2;
            return iJ2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveGiftItem m18346parse(nb5 nb5Var) throws IOException {
            LiveGiftItem liveGiftItem = new LiveGiftItem();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (liveGiftItem.giftType == null) {
                            liveGiftItem.giftType = "";
                        }
                        if (liveGiftItem.name == null) {
                            liveGiftItem.name = "";
                        }
                        if (liveGiftItem.localName == null) {
                            liveGiftItem.localName = LangModel.new_();
                        }
                        if (liveGiftItem.url == null) {
                            liveGiftItem.url = "";
                        }
                        if (liveGiftItem.status == null) {
                            liveGiftItem.status = "";
                        }
                        if (liveGiftItem.animationType == null) {
                            liveGiftItem.animationType = "";
                        }
                        if (liveGiftItem.animationUrl == null) {
                            liveGiftItem.animationUrl = "";
                        }
                        if (liveGiftItem.startTagColor == null) {
                            liveGiftItem.startTagColor = "";
                        }
                        if (liveGiftItem.endTagColor == null) {
                            liveGiftItem.endTagColor = "";
                        }
                        if (liveGiftItem.tagTextColor == null) {
                            liveGiftItem.tagTextColor = "";
                        }
                        break;
                    case 8:
                        liveGiftItem.f233id = nb5Var.j();
                        continue;
                    case 18:
                        liveGiftItem.giftType = nb5Var.s();
                        continue;
                    case 26:
                        liveGiftItem.name = nb5Var.s();
                        continue;
                    case 34:
                        liveGiftItem.localName = (LangModel) nb5Var.l(LangModel.PROTOBUF_ADAPTER);
                        continue;
                    case 42:
                        liveGiftItem.url = nb5Var.s();
                        continue;
                    case 49:
                        liveGiftItem.unitPrice = nb5Var.h();
                        continue;
                    case 57:
                        liveGiftItem.purchasePrice = nb5Var.h();
                        continue;
                    case 66:
                        liveGiftItem.status = nb5Var.s();
                        continue;
                    case 74:
                        liveGiftItem.tag = nb5Var.s();
                        continue;
                    case 82:
                        liveGiftItem.localTag = (LangModel) nb5Var.l(LangModel.PROTOBUF_ADAPTER);
                        continue;
                    case 88:
                        liveGiftItem.giftLevel = nb5Var.j();
                        continue;
                    case 96:
                        liveGiftItem.combosDuration = nb5Var.k();
                        continue;
                    case 104:
                        liveGiftItem.fastGiftNum = nb5Var.j();
                        continue;
                    case 114:
                        liveGiftItem.animationType = nb5Var.s();
                        continue;
                    case 120:
                        liveGiftItem.version = nb5Var.k();
                        continue;
                    case 130:
                        liveGiftItem.animationUrl = nb5Var.s();
                        continue;
                    case 138:
                        liveGiftItem.startTagColor = nb5Var.s();
                        continue;
                    case 146:
                        liveGiftItem.endTagColor = nb5Var.s();
                        continue;
                    case 154:
                        liveGiftItem.tagTextColor = nb5Var.s();
                        continue;
                    case 160:
                        liveGiftItem.trayDuration = nb5Var.k();
                        continue;
                    case 168:
                        liveGiftItem.giftSource = nb5Var.j();
                        continue;
                    case 176:
                        liveGiftItem.remain = nb5Var.j();
                        continue;
                    case 184:
                        liveGiftItem.expiredTime = nb5Var.k();
                        continue;
                    case 192:
                        liveGiftItem.mobileVibration = nb5Var.g();
                        continue;
                    default:
                        if (liveGiftItem.giftType == null) {
                            liveGiftItem.giftType = "";
                        }
                        if (liveGiftItem.name == null) {
                            liveGiftItem.name = "";
                        }
                        if (liveGiftItem.localName == null) {
                            liveGiftItem.localName = LangModel.new_();
                        }
                        if (liveGiftItem.url == null) {
                            liveGiftItem.url = "";
                        }
                        if (liveGiftItem.status == null) {
                            liveGiftItem.status = "";
                        }
                        if (liveGiftItem.animationType == null) {
                            liveGiftItem.animationType = "";
                        }
                        if (liveGiftItem.animationUrl == null) {
                            liveGiftItem.animationUrl = "";
                        }
                        if (liveGiftItem.startTagColor == null) {
                            liveGiftItem.startTagColor = "";
                        }
                        if (liveGiftItem.endTagColor == null) {
                            liveGiftItem.endTagColor = "";
                        }
                        if (liveGiftItem.tagTextColor == null) {
                            liveGiftItem.tagTextColor = "";
                            return liveGiftItem;
                        }
                        break;
                }
            }
            return liveGiftItem;
        }

        public void serialize(LiveGiftItem liveGiftItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, liveGiftItem.f233id);
            String str = liveGiftItem.giftType;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = liveGiftItem.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            LangModel langModel = liveGiftItem.localName;
            if (langModel != null) {
                codedOutputByteBufferNano.K(4, langModel, LangModel.PROTOBUF_ADAPTER);
            }
            String str3 = liveGiftItem.url;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
            codedOutputByteBufferNano.C(6, liveGiftItem.unitPrice);
            codedOutputByteBufferNano.C(7, liveGiftItem.purchasePrice);
            String str4 = liveGiftItem.status;
            if (str4 != null) {
                codedOutputByteBufferNano.R(8, str4);
            }
            String str5 = liveGiftItem.tag;
            if (str5 != null) {
                codedOutputByteBufferNano.R(9, str5);
            }
            LangModel langModel2 = liveGiftItem.localTag;
            if (langModel2 != null) {
                codedOutputByteBufferNano.K(10, langModel2, LangModel.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.G(11, liveGiftItem.giftLevel);
            codedOutputByteBufferNano.I(12, liveGiftItem.combosDuration);
            codedOutputByteBufferNano.G(13, liveGiftItem.fastGiftNum);
            String str6 = liveGiftItem.animationType;
            if (str6 != null) {
                codedOutputByteBufferNano.R(14, str6);
            }
            codedOutputByteBufferNano.I(15, liveGiftItem.version);
            String str7 = liveGiftItem.animationUrl;
            if (str7 != null) {
                codedOutputByteBufferNano.R(16, str7);
            }
            String str8 = liveGiftItem.startTagColor;
            if (str8 != null) {
                codedOutputByteBufferNano.R(17, str8);
            }
            String str9 = liveGiftItem.endTagColor;
            if (str9 != null) {
                codedOutputByteBufferNano.R(18, str9);
            }
            String str10 = liveGiftItem.tagTextColor;
            if (str10 != null) {
                codedOutputByteBufferNano.R(19, str10);
            }
            codedOutputByteBufferNano.I(20, liveGiftItem.trayDuration);
            codedOutputByteBufferNano.G(21, liveGiftItem.giftSource);
            codedOutputByteBufferNano.G(22, liveGiftItem.remain);
            codedOutputByteBufferNano.I(23, liveGiftItem.expiredTime);
            codedOutputByteBufferNano.A(24, liveGiftItem.mobileVibration);
        }
    };
    public static JsonAdapter<LiveGiftItem> JSON_ADAPTER = new ObjectJsonAdapter<LiveGiftItem>() { // from class: com.p1.mobile.putong.data.LiveGiftItem.2
        public Class getDataClass() {
            return LiveGiftItem.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveGiftItem mo17830newInstance() {
            return new LiveGiftItem();
        }

        public boolean parseField(LiveGiftItem liveGiftItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "purchasePrice":
                    liveGiftItem.purchasePrice = jsonParser.getValueAsDouble();
                    return true;
                case "localName":
                    liveGiftItem.localName = (LangModel) LangModel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "remain":
                    liveGiftItem.remain = jsonParser.getValueAsInt();
                    return true;
                case "status":
                    liveGiftItem.status = jsonParser.getValueAsString();
                    return true;
                case "startTagColor":
                    liveGiftItem.startTagColor = jsonParser.getValueAsString();
                    return true;
                case "unitPrice":
                    liveGiftItem.unitPrice = jsonParser.getValueAsDouble();
                    return true;
                case "fastGiftNum":
                    liveGiftItem.fastGiftNum = jsonParser.getValueAsInt();
                    return true;
                case "expiredTime":
                    liveGiftItem.expiredTime = jsonParser.getValueAsLong();
                    return true;
                case "trayDuration":
                    liveGiftItem.trayDuration = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    liveGiftItem.f233id = jsonParser.getValueAsInt();
                    return false;
                case "tag":
                    liveGiftItem.tag = jsonParser.getValueAsString();
                    return true;
                case "url":
                    liveGiftItem.url = jsonParser.getValueAsString();
                    return true;
                case "name":
                    liveGiftItem.name = jsonParser.getValueAsString();
                    return true;
                case "giftSource":
                    liveGiftItem.giftSource = jsonParser.getValueAsInt();
                    return true;
                case "version":
                    liveGiftItem.version = jsonParser.getValueAsLong();
                    return true;
                case "combosDuration":
                    liveGiftItem.combosDuration = jsonParser.getValueAsLong();
                    return true;
                case "giftLevel":
                    liveGiftItem.giftLevel = jsonParser.getValueAsInt();
                    return true;
                case "giftType":
                    liveGiftItem.giftType = jsonParser.getValueAsString();
                    return true;
                case "animationUrl":
                    liveGiftItem.animationUrl = jsonParser.getValueAsString();
                    return true;
                case "mobileVibration":
                    liveGiftItem.mobileVibration = jsonParser.getValueAsBoolean();
                    return true;
                case "tagTextColor":
                    liveGiftItem.tagTextColor = jsonParser.getValueAsString();
                    return true;
                case "localTag":
                    liveGiftItem.localTag = (LangModel) LangModel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "endTagColor":
                    liveGiftItem.endTagColor = jsonParser.getValueAsString();
                    return true;
                case "animationType":
                    liveGiftItem.animationType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveGiftItem liveGiftItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "purchasePrice":
                case "localName":
                case "remain":
                case "status":
                case "startTagColor":
                case "unitPrice":
                case "fastGiftNum":
                case "expiredTime":
                case "trayDuration":
                    return true;
                case "id":
                    return false;
                case "tag":
                case "url":
                case "name":
                case "giftSource":
                case "version":
                case "combosDuration":
                case "giftLevel":
                case "giftType":
                case "animationUrl":
                case "mobileVibration":
                case "tagTextColor":
                case "localTag":
                case "endTagColor":
                case "animationType":
                    return true;
                default:
                    return super.parseFieldCheck(liveGiftItem, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveGiftItem liveGiftItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", liveGiftItem.f233id);
            String str = liveGiftItem.giftType;
            if (str != null) {
                jsonGenerator.writeStringField("giftType", str);
            }
            String str2 = liveGiftItem.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            if (liveGiftItem.localName != null) {
                jsonGenerator.writeFieldName("localName");
                LangModel.JSON_ADAPTER.serialize(liveGiftItem.localName, jsonGenerator, true);
            }
            String str3 = liveGiftItem.url;
            if (str3 != null) {
                jsonGenerator.writeStringField("url", str3);
            }
            jsonGenerator.writeNumberField("unitPrice", liveGiftItem.unitPrice);
            jsonGenerator.writeNumberField("purchasePrice", liveGiftItem.purchasePrice);
            String str4 = liveGiftItem.status;
            if (str4 != null) {
                jsonGenerator.writeStringField("status", str4);
            }
            String str5 = liveGiftItem.tag;
            if (str5 != null) {
                jsonGenerator.writeStringField(Tag.TYPE, str5);
            }
            if (liveGiftItem.localTag != null) {
                jsonGenerator.writeFieldName("localTag");
                LangModel.JSON_ADAPTER.serialize(liveGiftItem.localTag, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("giftLevel", liveGiftItem.giftLevel);
            jsonGenerator.writeNumberField("combosDuration", liveGiftItem.combosDuration);
            jsonGenerator.writeNumberField("fastGiftNum", liveGiftItem.fastGiftNum);
            String str6 = liveGiftItem.animationType;
            if (str6 != null) {
                jsonGenerator.writeStringField("animationType", str6);
            }
            jsonGenerator.writeNumberField("version", liveGiftItem.version);
            String str7 = liveGiftItem.animationUrl;
            if (str7 != null) {
                jsonGenerator.writeStringField("animationUrl", str7);
            }
            String str8 = liveGiftItem.startTagColor;
            if (str8 != null) {
                jsonGenerator.writeStringField("startTagColor", str8);
            }
            String str9 = liveGiftItem.endTagColor;
            if (str9 != null) {
                jsonGenerator.writeStringField("endTagColor", str9);
            }
            String str10 = liveGiftItem.tagTextColor;
            if (str10 != null) {
                jsonGenerator.writeStringField("tagTextColor", str10);
            }
            jsonGenerator.writeNumberField("trayDuration", liveGiftItem.trayDuration);
            jsonGenerator.writeNumberField("giftSource", liveGiftItem.giftSource);
            jsonGenerator.writeNumberField("remain", liveGiftItem.remain);
            jsonGenerator.writeNumberField("expiredTime", liveGiftItem.expiredTime);
            jsonGenerator.writeBooleanField("mobileVibration", liveGiftItem.mobileVibration);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveGiftItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveGiftItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveGiftItem new_() {
        LiveGiftItem liveGiftItem = new LiveGiftItem();
        liveGiftItem.nullCheck();
        return liveGiftItem;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveGiftItem m18345clone() {
        LiveGiftItem liveGiftItem = new LiveGiftItem();
        liveGiftItem.f233id = this.f233id;
        liveGiftItem.giftType = this.giftType;
        liveGiftItem.name = this.name;
        LangModel langModel = this.localName;
        if (langModel != null) {
            liveGiftItem.localName = langModel.m18276clone();
        }
        liveGiftItem.url = this.url;
        liveGiftItem.unitPrice = this.unitPrice;
        liveGiftItem.purchasePrice = this.purchasePrice;
        liveGiftItem.status = this.status;
        liveGiftItem.tag = this.tag;
        LangModel langModel2 = this.localTag;
        if (langModel2 != null) {
            liveGiftItem.localTag = langModel2.m18276clone();
        }
        liveGiftItem.giftLevel = this.giftLevel;
        liveGiftItem.combosDuration = this.combosDuration;
        liveGiftItem.fastGiftNum = this.fastGiftNum;
        liveGiftItem.animationType = this.animationType;
        liveGiftItem.version = this.version;
        liveGiftItem.animationUrl = this.animationUrl;
        liveGiftItem.startTagColor = this.startTagColor;
        liveGiftItem.endTagColor = this.endTagColor;
        liveGiftItem.tagTextColor = this.tagTextColor;
        liveGiftItem.trayDuration = this.trayDuration;
        liveGiftItem.giftSource = this.giftSource;
        liveGiftItem.remain = this.remain;
        liveGiftItem.expiredTime = this.expiredTime;
        liveGiftItem.mobileVibration = this.mobileVibration;
        return liveGiftItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveGiftItem)) {
            return false;
        }
        LiveGiftItem liveGiftItem = (LiveGiftItem) obj;
        return this.f233id == liveGiftItem.f233id && ValueObject.util_equals(this.giftType, liveGiftItem.giftType) && ValueObject.util_equals(this.name, liveGiftItem.name) && ValueObject.util_equals(this.localName, liveGiftItem.localName) && ValueObject.util_equals(this.url, liveGiftItem.url) && this.unitPrice == liveGiftItem.unitPrice && this.purchasePrice == liveGiftItem.purchasePrice && ValueObject.util_equals(this.status, liveGiftItem.status) && ValueObject.util_equals(this.tag, liveGiftItem.tag) && ValueObject.util_equals(this.localTag, liveGiftItem.localTag) && this.giftLevel == liveGiftItem.giftLevel && this.combosDuration == liveGiftItem.combosDuration && this.fastGiftNum == liveGiftItem.fastGiftNum && ValueObject.util_equals(this.animationType, liveGiftItem.animationType) && this.version == liveGiftItem.version && ValueObject.util_equals(this.animationUrl, liveGiftItem.animationUrl) && ValueObject.util_equals(this.startTagColor, liveGiftItem.startTagColor) && ValueObject.util_equals(this.endTagColor, liveGiftItem.endTagColor) && ValueObject.util_equals(this.tagTextColor, liveGiftItem.tagTextColor) && this.trayDuration == liveGiftItem.trayDuration && this.giftSource == liveGiftItem.giftSource && this.remain == liveGiftItem.remain && this.expiredTime == liveGiftItem.expiredTime && this.mobileVibration == liveGiftItem.mobileVibration;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.f233id) * 41;
        String str = this.giftType;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        LangModel langModel = this.localName;
        int iHashCode3 = (iHashCode2 + (langModel != null ? langModel.hashCode() : 0)) * 41;
        String str3 = this.url;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.unitPrice);
        int i3 = ((iHashCode3 + iHashCode4) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.purchasePrice);
        int i4 = ((i3 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        String str4 = this.status;
        int iHashCode5 = (i4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.tag;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        LangModel langModel2 = this.localTag;
        int iHashCode7 = (((iHashCode6 + (langModel2 != null ? langModel2.hashCode() : 0)) * 41) + this.giftLevel) * 41;
        long j = this.combosDuration;
        int i5 = (((iHashCode7 + ((int) (j ^ (j >>> 32)))) * 41) + this.fastGiftNum) * 41;
        String str6 = this.animationType;
        int iHashCode8 = (i5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        long j2 = this.version;
        int i6 = (iHashCode8 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str7 = this.animationUrl;
        int iHashCode9 = (i6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.startTagColor;
        int iHashCode10 = (iHashCode9 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.endTagColor;
        int iHashCode11 = (iHashCode10 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.tagTextColor;
        int iHashCode12 = (iHashCode11 + (str10 != null ? str10.hashCode() : 0)) * 41;
        long j3 = this.trayDuration;
        int i7 = (((((iHashCode12 + ((int) (j3 ^ (j3 >>> 32)))) * 41) + this.giftSource) * 41) + this.remain) * 41;
        long j4 = this.expiredTime;
        int i8 = ((i7 + ((int) (j4 ^ (j4 >>> 32)))) * 41) + (this.mobileVibration ? 1231 : 1237);
        ((ValueObject) this).hashCode = i8;
        return i8;
    }

    public void nullCheck() {
        if (this.giftType == null) {
            this.giftType = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.localName == null) {
            this.localName = LangModel.new_();
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.animationType == null) {
            this.animationType = "";
        }
        if (this.animationUrl == null) {
            this.animationUrl = "";
        }
        if (this.startTagColor == null) {
            this.startTagColor = "";
        }
        if (this.endTagColor == null) {
            this.endTagColor = "";
        }
        if (this.tagTextColor == null) {
            this.tagTextColor = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
