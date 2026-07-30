package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.TribeSubsetContent;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class TribeSubsetContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tribesubsetcontent";

    @NonNull
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public String action;

    @NonNull
    @ProtobufIndex(index = 4)
    public String coverUrl;

    @ProtobufIndex(index = 7)
    public int currentLikeMe;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 8)
    public String innerBackgroundUrl;

    @NonNull
    @ProtobufIndex(index = 9)
    public String jumpUrl;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public List<String> profilePhoto;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String subType;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    @ProtobufIndex(index = 6)
    public int totalCount;
    public static ProtobufAdapter<TribeSubsetContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<TribeSubsetContent>() { // from class: com.p1.mobile.putong.core.data.TribeSubsetContent.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TribeSubsetContent tribeSubsetContent) {
            String str = tribeSubsetContent.title;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = tribeSubsetContent.subType;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = tribeSubsetContent.icon;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = tribeSubsetContent.coverUrl;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            List<String> list = tribeSubsetContent.profilePhoto;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iH = iO + CodedOutputByteBufferNano.h(6, tribeSubsetContent.totalCount) + CodedOutputByteBufferNano.h(7, tribeSubsetContent.currentLikeMe);
            String str5 = tribeSubsetContent.innerBackgroundUrl;
            if (str5 != null) {
                iH += CodedOutputByteBufferNano.o(8, str5);
            }
            String str6 = tribeSubsetContent.jumpUrl;
            if (str6 != null) {
                iH += CodedOutputByteBufferNano.o(9, str6);
            }
            String str7 = tribeSubsetContent.action;
            if (str7 != null) {
                iH += CodedOutputByteBufferNano.o(10, str7);
            }
            ((MessageNano) tribeSubsetContent).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TribeSubsetContent m16036parse(nb5 nb5Var) throws IOException {
            TribeSubsetContent tribeSubsetContent = new TribeSubsetContent();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (tribeSubsetContent.title == null) {
                            tribeSubsetContent.title = "";
                        }
                        if (tribeSubsetContent.subType == null) {
                            tribeSubsetContent.subType = "";
                        }
                        if (tribeSubsetContent.icon == null) {
                            tribeSubsetContent.icon = "";
                        }
                        if (tribeSubsetContent.coverUrl == null) {
                            tribeSubsetContent.coverUrl = "";
                        }
                        if (tribeSubsetContent.profilePhoto == null) {
                            tribeSubsetContent.profilePhoto = new ArrayList();
                        }
                        if (tribeSubsetContent.innerBackgroundUrl == null) {
                            tribeSubsetContent.innerBackgroundUrl = "";
                        }
                        if (tribeSubsetContent.jumpUrl == null) {
                            tribeSubsetContent.jumpUrl = "";
                        }
                        if (tribeSubsetContent.action == null) {
                            tribeSubsetContent.action = "";
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        tribeSubsetContent.title = nb5Var.s();
                        continue;
                    case 18:
                        tribeSubsetContent.subType = nb5Var.s();
                        continue;
                    case 26:
                        tribeSubsetContent.icon = nb5Var.s();
                        continue;
                    case 34:
                        tribeSubsetContent.coverUrl = nb5Var.s();
                        continue;
                    case 42:
                        tribeSubsetContent.profilePhoto = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 48:
                        tribeSubsetContent.totalCount = nb5Var.j();
                        continue;
                    case 56:
                        tribeSubsetContent.currentLikeMe = nb5Var.j();
                        continue;
                    case 66:
                        tribeSubsetContent.innerBackgroundUrl = nb5Var.s();
                        continue;
                    case 74:
                        tribeSubsetContent.jumpUrl = nb5Var.s();
                        continue;
                    case 82:
                        tribeSubsetContent.action = nb5Var.s();
                        continue;
                    default:
                        if (tribeSubsetContent.title == null) {
                            tribeSubsetContent.title = "";
                        }
                        if (tribeSubsetContent.subType == null) {
                            tribeSubsetContent.subType = "";
                        }
                        if (tribeSubsetContent.icon == null) {
                            tribeSubsetContent.icon = "";
                        }
                        if (tribeSubsetContent.coverUrl == null) {
                            tribeSubsetContent.coverUrl = "";
                        }
                        if (tribeSubsetContent.profilePhoto == null) {
                            tribeSubsetContent.profilePhoto = new ArrayList();
                        }
                        if (tribeSubsetContent.innerBackgroundUrl == null) {
                            tribeSubsetContent.innerBackgroundUrl = "";
                        }
                        if (tribeSubsetContent.jumpUrl == null) {
                            tribeSubsetContent.jumpUrl = "";
                        }
                        if (tribeSubsetContent.action == null) {
                            tribeSubsetContent.action = "";
                            return tribeSubsetContent;
                        }
                        break;
                }
            }
            return tribeSubsetContent;
        }

        public void serialize(TribeSubsetContent tribeSubsetContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = tribeSubsetContent.title;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = tribeSubsetContent.subType;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = tribeSubsetContent.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = tribeSubsetContent.coverUrl;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            List<String> list = tribeSubsetContent.profilePhoto;
            if (list != null) {
                codedOutputByteBufferNano.K(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(6, tribeSubsetContent.totalCount);
            codedOutputByteBufferNano.G(7, tribeSubsetContent.currentLikeMe);
            String str5 = tribeSubsetContent.innerBackgroundUrl;
            if (str5 != null) {
                codedOutputByteBufferNano.R(8, str5);
            }
            String str6 = tribeSubsetContent.jumpUrl;
            if (str6 != null) {
                codedOutputByteBufferNano.R(9, str6);
            }
            String str7 = tribeSubsetContent.action;
            if (str7 != null) {
                codedOutputByteBufferNano.R(10, str7);
            }
        }
    };
    public static JsonAdapter<TribeSubsetContent> JSON_ADAPTER = new ObjectJsonAdapter<TribeSubsetContent>() { // from class: com.p1.mobile.putong.core.data.TribeSubsetContent.2
        public Class getDataClass() {
            return TribeSubsetContent.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TribeSubsetContent m16037newInstance() {
            return new TribeSubsetContent();
        }

        public boolean parseField(TribeSubsetContent tribeSubsetContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subType":
                    tribeSubsetContent.subType = jsonParser.getValueAsString();
                    return true;
                case "action":
                    tribeSubsetContent.action = jsonParser.getValueAsString();
                    return true;
                case "jumpUrl":
                    tribeSubsetContent.jumpUrl = jsonParser.getValueAsString();
                    return true;
                case "totalCount":
                    tribeSubsetContent.totalCount = jsonParser.getValueAsInt();
                    return true;
                case "coverUrl":
                    tribeSubsetContent.coverUrl = jsonParser.getValueAsString();
                    return true;
                case "innerBackgroundUrl":
                    tribeSubsetContent.innerBackgroundUrl = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    tribeSubsetContent.icon = jsonParser.getValueAsString();
                    return true;
                case "title":
                    tribeSubsetContent.title = jsonParser.getValueAsString();
                    return true;
                case "profilePhoto":
                    tribeSubsetContent.profilePhoto = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "currentLikeMe":
                    tribeSubsetContent.currentLikeMe = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TribeSubsetContent tribeSubsetContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subType":
                case "action":
                case "jumpUrl":
                case "totalCount":
                case "coverUrl":
                case "innerBackgroundUrl":
                case "icon":
                case "title":
                case "profilePhoto":
                case "currentLikeMe":
                    return true;
                default:
                    return super.parseFieldCheck(tribeSubsetContent, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(TribeSubsetContent tribeSubsetContent, JsonGenerator jsonGenerator) throws IOException {
            String str = tribeSubsetContent.title;
            if (str != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str);
            }
            String str2 = tribeSubsetContent.subType;
            if (str2 != null) {
                jsonGenerator.writeStringField("subType", str2);
            }
            String str3 = tribeSubsetContent.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField(HomeTabModuleTopicShowType.icon, str3);
            }
            String str4 = tribeSubsetContent.coverUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("coverUrl", str4);
            }
            if (tribeSubsetContent.profilePhoto != null) {
                jsonGenerator.writeFieldName("profilePhoto");
                JsonAdapter.serializeArray(tribeSubsetContent.profilePhoto, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("totalCount", tribeSubsetContent.totalCount);
            jsonGenerator.writeNumberField("currentLikeMe", tribeSubsetContent.currentLikeMe);
            String str5 = tribeSubsetContent.innerBackgroundUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("innerBackgroundUrl", str5);
            }
            String str6 = tribeSubsetContent.jumpUrl;
            if (str6 != null) {
                jsonGenerator.writeStringField("jumpUrl", str6);
            }
            String str7 = tribeSubsetContent.action;
            if (str7 != null) {
                jsonGenerator.writeStringField("action", str7);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TribeSubsetContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TribeSubsetContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m683a(String str) {
        return str;
    }

    public static TribeSubsetContent new_() {
        TribeSubsetContent tribeSubsetContent = new TribeSubsetContent();
        tribeSubsetContent.nullCheck();
        return tribeSubsetContent;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TribeSubsetContent m16035clone() {
        TribeSubsetContent tribeSubsetContent = new TribeSubsetContent();
        tribeSubsetContent.title = this.title;
        tribeSubsetContent.subType = this.subType;
        tribeSubsetContent.icon = this.icon;
        tribeSubsetContent.coverUrl = this.coverUrl;
        List<String> list = this.profilePhoto;
        if (list != null) {
            tribeSubsetContent.profilePhoto = ValueObject.util_map(list, new w9j() { // from class: l.kaj0
                public final Object call(Object obj) {
                    return TribeSubsetContent.m683a((String) obj);
                }
            });
        }
        tribeSubsetContent.totalCount = this.totalCount;
        tribeSubsetContent.currentLikeMe = this.currentLikeMe;
        tribeSubsetContent.innerBackgroundUrl = this.innerBackgroundUrl;
        tribeSubsetContent.jumpUrl = this.jumpUrl;
        tribeSubsetContent.action = this.action;
        return tribeSubsetContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TribeSubsetContent)) {
            return false;
        }
        TribeSubsetContent tribeSubsetContent = (TribeSubsetContent) obj;
        return ValueObject.util_equals(this.title, tribeSubsetContent.title) && ValueObject.util_equals(this.subType, tribeSubsetContent.subType) && ValueObject.util_equals(this.icon, tribeSubsetContent.icon) && ValueObject.util_equals(this.coverUrl, tribeSubsetContent.coverUrl) && ValueObject.util_equals(this.profilePhoto, tribeSubsetContent.profilePhoto) && this.totalCount == tribeSubsetContent.totalCount && this.currentLikeMe == tribeSubsetContent.currentLikeMe && ValueObject.util_equals(this.innerBackgroundUrl, tribeSubsetContent.innerBackgroundUrl) && ValueObject.util_equals(this.jumpUrl, tribeSubsetContent.jumpUrl) && ValueObject.util_equals(this.action, tribeSubsetContent.action);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subType;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.coverUrl;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<String> list = this.profilePhoto;
        int iHashCode5 = (((((iHashCode4 + (list != null ? list.hashCode() : 0)) * 41) + this.totalCount) * 41) + this.currentLikeMe) * 41;
        String str5 = this.innerBackgroundUrl;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.jumpUrl;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.action;
        int iHashCode8 = iHashCode7 + (str7 != null ? str7.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode8;
        return iHashCode8;
    }

    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subType == null) {
            this.subType = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.coverUrl == null) {
            this.coverUrl = "";
        }
        if (this.profilePhoto == null) {
            this.profilePhoto = new ArrayList();
        }
        if (this.innerBackgroundUrl == null) {
            this.innerBackgroundUrl = "";
        }
        if (this.jumpUrl == null) {
            this.jumpUrl = "";
        }
        if (this.action == null) {
            this.action = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
