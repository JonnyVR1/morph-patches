package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.TribeSubsetContent;
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
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class TribeSubsetContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tribesubsetcontent";

    @NonNull
    @ProtobufIndex(index = 10)
    public String action;

    @NonNull
    @ProtobufIndex(index = 4)
    public String coverUrl;

    @ProtobufIndex(index = 7)
    public int currentLikeMe;

    @NonNull
    @ProtobufIndex(index = 3)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 8)
    public String innerBackgroundUrl;

    @NonNull
    @ProtobufIndex(index = 9)
    public String jumpUrl;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<String> profilePhoto;

    @NonNull
    @ProtobufIndex(index = 2)
    public String subType;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    @ProtobufIndex(index = 6)
    public int totalCount;
    public static ProtobufAdapter<TribeSubsetContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<TribeSubsetContent>() { // from class: com.p1.mobile.putong.core.data.TribeSubsetContent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TribeSubsetContent tribeSubsetContent) {
            String str = tribeSubsetContent.title;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = tribeSubsetContent.subType;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = tribeSubsetContent.icon;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = tribeSubsetContent.coverUrl;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            List<String> list = tribeSubsetContent.profilePhoto;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(6, tribeSubsetContent.totalCount) + CodedOutputByteBufferNano.m17281h(7, tribeSubsetContent.currentLikeMe);
            String str5 = tribeSubsetContent.innerBackgroundUrl;
            if (str5 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(8, str5);
            }
            String str6 = tribeSubsetContent.jumpUrl;
            if (str6 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(9, str6);
            }
            String str7 = tribeSubsetContent.action;
            if (str7 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(10, str7);
            }
            tribeSubsetContent.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TribeSubsetContent parse(nc5 nc5Var) throws IOException {
            TribeSubsetContent tribeSubsetContent = new TribeSubsetContent();
            while (true) {
                switch (nc5Var.m162497u()) {
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
                    case 10:
                        tribeSubsetContent.title = nc5Var.m162495s();
                        continue;
                    case 18:
                        tribeSubsetContent.subType = nc5Var.m162495s();
                        continue;
                    case 26:
                        tribeSubsetContent.icon = nc5Var.m162495s();
                        continue;
                    case 34:
                        tribeSubsetContent.coverUrl = nc5Var.m162495s();
                        continue;
                    case 42:
                        tribeSubsetContent.profilePhoto = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 48:
                        tribeSubsetContent.totalCount = nc5Var.m162486j();
                        continue;
                    case 56:
                        tribeSubsetContent.currentLikeMe = nc5Var.m162486j();
                        continue;
                    case 66:
                        tribeSubsetContent.innerBackgroundUrl = nc5Var.m162495s();
                        continue;
                    case 74:
                        tribeSubsetContent.jumpUrl = nc5Var.m162495s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        tribeSubsetContent.action = nc5Var.m162495s();
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TribeSubsetContent tribeSubsetContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = tribeSubsetContent.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = tribeSubsetContent.subType;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = tribeSubsetContent.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = tribeSubsetContent.coverUrl;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            List<String> list = tribeSubsetContent.profilePhoto;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(6, tribeSubsetContent.totalCount);
            codedOutputByteBufferNano.m17305G(7, tribeSubsetContent.currentLikeMe);
            String str5 = tribeSubsetContent.innerBackgroundUrl;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(8, str5);
            }
            String str6 = tribeSubsetContent.jumpUrl;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(9, str6);
            }
            String str7 = tribeSubsetContent.action;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(10, str7);
            }
        }
    };
    public static JsonAdapter<TribeSubsetContent> JSON_ADAPTER = new ObjectJsonAdapter<TribeSubsetContent>() { // from class: com.p1.mobile.putong.core.data.TribeSubsetContent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TribeSubsetContent.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TribeSubsetContent newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TribeSubsetContent tribeSubsetContent, JsonGenerator jsonGenerator) throws IOException {
            String str = tribeSubsetContent.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = tribeSubsetContent.subType;
            if (str2 != null) {
                jsonGenerator.writeStringField("subType", str2);
            }
            String str3 = tribeSubsetContent.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TribeSubsetContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TribeSubsetContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36884a(String str) {
        return str;
    }

    public static TribeSubsetContent new_() {
        TribeSubsetContent tribeSubsetContent = new TribeSubsetContent();
        tribeSubsetContent.nullCheck();
        return tribeSubsetContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TribeSubsetContent mo225055clone() {
        TribeSubsetContent tribeSubsetContent = new TribeSubsetContent();
        tribeSubsetContent.title = this.title;
        tribeSubsetContent.subType = this.subType;
        tribeSubsetContent.icon = this.icon;
        tribeSubsetContent.coverUrl = this.coverUrl;
        List<String> list = this.profilePhoto;
        if (list != null) {
            tribeSubsetContent.profilePhoto = ValueObject.util_map(list, new qcj() { // from class: l.ojj0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return TribeSubsetContent.m36884a((String) obj);
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
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
