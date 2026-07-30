package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.asm.Opcodes;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.data.TagCategories;
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
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class NewTags extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newtags";

    @NonNull
    @ProtobufIndex(index = 16)
    public String bgColor;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> categories;

    @NonNull
    @ProtobufIndex(index = 11)
    public String gender;

    @NonNull
    @ProtobufIndex(index = 4)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21199id;

    @ProtobufIndex(index = 13)
    public int index;

    @ProtobufIndex(index = 12)
    public boolean isPictureTag;

    @ProtobufIndex(index = 14)
    public int loadIcon;

    @Nullable
    @ProtobufIndex(index = 18)
    public String localCreditScore;

    @ProtobufIndex(index = 8)
    public boolean localIsCommonLabel;

    @ProtobufIndex(index = 17)
    public boolean localShowCreditScore;

    @NonNull
    @ProtobufIndex(index = 10)
    public String localShowName;

    @NonNull
    @ProtobufIndex(index = 9)
    public List<TagCategories> localTagCategories;

    @ProtobufIndex(index = 7)
    public long localTagUserCounts;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 15)
    public String nameColor;

    @NonNull
    @ProtobufIndex(index = 5)
    public String operation;

    @NonNull
    @ProtobufIndex(index = 6)
    public String status;
    public static ProtobufAdapter<NewTags> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewTags>() { // from class: com.p1.mobile.putong.core.data.NewTags.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NewTags newTags) {
            String str = newTags.f21199id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = newTags.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            List<String> list = newTags.categories;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = newTags.icon;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            String str4 = newTags.operation;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str4);
            }
            String str5 = newTags.status;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str5);
            }
            int iM17283j = iM17288o + CodedOutputByteBufferNano.m17283j(7, newTags.localTagUserCounts) + CodedOutputByteBufferNano.m17275b(8, newTags.localIsCommonLabel);
            List<TagCategories> list2 = newTags.localTagCategories;
            if (list2 != null) {
                iM17283j += CodedOutputByteBufferNano.m17285l(9, list2, TagCategories.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str6 = newTags.localShowName;
            if (str6 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(10, str6);
            }
            String str7 = newTags.gender;
            if (str7 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(11, str7);
            }
            int iM17275b = iM17283j + CodedOutputByteBufferNano.m17275b(12, newTags.isPictureTag) + CodedOutputByteBufferNano.m17281h(13, newTags.index) + CodedOutputByteBufferNano.m17281h(14, newTags.loadIcon);
            String str8 = newTags.nameColor;
            if (str8 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(15, str8);
            }
            String str9 = newTags.bgColor;
            if (str9 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(16, str9);
            }
            int iM17275b2 = iM17275b + CodedOutputByteBufferNano.m17275b(17, newTags.localShowCreditScore);
            String str10 = newTags.localCreditScore;
            if (str10 != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17288o(18, str10);
            }
            newTags.cachedSize = iM17275b2;
            return iM17275b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NewTags parse(nc5 nc5Var) throws IOException {
            NewTags newTags = new NewTags();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (newTags.f21199id == null) {
                            newTags.f21199id = "";
                        }
                        if (newTags.name == null) {
                            newTags.name = "";
                        }
                        if (newTags.categories == null) {
                            newTags.categories = new ArrayList();
                        }
                        if (newTags.icon == null) {
                            newTags.icon = "";
                        }
                        if (newTags.operation == null) {
                            newTags.operation = "";
                        }
                        if (newTags.status == null) {
                            newTags.status = "";
                        }
                        if (newTags.localTagCategories == null) {
                            newTags.localTagCategories = new ArrayList();
                        }
                        if (newTags.localShowName == null) {
                            newTags.localShowName = "";
                        }
                        if (newTags.gender == null) {
                            newTags.gender = "";
                        }
                        if (newTags.nameColor == null) {
                            newTags.nameColor = "";
                        }
                        if (newTags.bgColor == null) {
                            newTags.bgColor = "";
                        }
                        break;
                    case 10:
                        newTags.f21199id = nc5Var.m162495s();
                        continue;
                    case 18:
                        newTags.name = nc5Var.m162495s();
                        continue;
                    case 26:
                        newTags.categories = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 34:
                        newTags.icon = nc5Var.m162495s();
                        continue;
                    case 42:
                        newTags.operation = nc5Var.m162495s();
                        continue;
                    case 50:
                        newTags.status = nc5Var.m162495s();
                        continue;
                    case 56:
                        newTags.localTagUserCounts = nc5Var.m162487k();
                        continue;
                    case 64:
                        newTags.localIsCommonLabel = nc5Var.m162483g();
                        continue;
                    case 74:
                        newTags.localTagCategories = (List) nc5Var.m162488l(TagCategories.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        newTags.localShowName = nc5Var.m162495s();
                        continue;
                    case 90:
                        newTags.gender = nc5Var.m162495s();
                        continue;
                    case Opcodes.IADD /* 96 */:
                        newTags.isPictureTag = nc5Var.m162483g();
                        continue;
                    case 104:
                        newTags.index = nc5Var.m162486j();
                        continue;
                    case 112:
                        newTags.loadIcon = nc5Var.m162486j();
                        continue;
                    case 122:
                        newTags.nameColor = nc5Var.m162495s();
                        continue;
                    case 130:
                        newTags.bgColor = nc5Var.m162495s();
                        continue;
                    case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                        newTags.localShowCreditScore = nc5Var.m162483g();
                        continue;
                    case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                        newTags.localCreditScore = nc5Var.m162495s();
                        continue;
                    default:
                        if (newTags.f21199id == null) {
                            newTags.f21199id = "";
                        }
                        if (newTags.name == null) {
                            newTags.name = "";
                        }
                        if (newTags.categories == null) {
                            newTags.categories = new ArrayList();
                        }
                        if (newTags.icon == null) {
                            newTags.icon = "";
                        }
                        if (newTags.operation == null) {
                            newTags.operation = "";
                        }
                        if (newTags.status == null) {
                            newTags.status = "";
                        }
                        if (newTags.localTagCategories == null) {
                            newTags.localTagCategories = new ArrayList();
                        }
                        if (newTags.localShowName == null) {
                            newTags.localShowName = "";
                        }
                        if (newTags.gender == null) {
                            newTags.gender = "";
                        }
                        if (newTags.nameColor == null) {
                            newTags.nameColor = "";
                        }
                        if (newTags.bgColor == null) {
                            newTags.bgColor = "";
                            return newTags;
                        }
                        break;
                }
            }
            return newTags;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NewTags newTags, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = newTags.f21199id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = newTags.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            List<String> list = newTags.categories;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = newTags.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            String str4 = newTags.operation;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(5, str4);
            }
            String str5 = newTags.status;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(6, str5);
            }
            codedOutputByteBufferNano.m17307I(7, newTags.localTagUserCounts);
            codedOutputByteBufferNano.m17299A(8, newTags.localIsCommonLabel);
            List<TagCategories> list2 = newTags.localTagCategories;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(9, list2, TagCategories.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str6 = newTags.localShowName;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(10, str6);
            }
            String str7 = newTags.gender;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(11, str7);
            }
            codedOutputByteBufferNano.m17299A(12, newTags.isPictureTag);
            codedOutputByteBufferNano.m17305G(13, newTags.index);
            codedOutputByteBufferNano.m17305G(14, newTags.loadIcon);
            String str8 = newTags.nameColor;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(15, str8);
            }
            String str9 = newTags.bgColor;
            if (str9 != null) {
                codedOutputByteBufferNano.m17316R(16, str9);
            }
            codedOutputByteBufferNano.m17299A(17, newTags.localShowCreditScore);
            String str10 = newTags.localCreditScore;
            if (str10 != null) {
                codedOutputByteBufferNano.m17316R(18, str10);
            }
        }
    };
    public static JsonAdapter<NewTags> JSON_ADAPTER = new ObjectJsonAdapter<NewTags>() { // from class: com.p1.mobile.putong.core.data.NewTags.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NewTags.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NewTags newInstance() {
            return new NewTags();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(NewTags newTags, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1776899149:
                    if (str.equals("localShowName")) {
                        b = 0;
                    }
                    break;
                case -1249512767:
                    if (str.equals("gender")) {
                        b = 1;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 2;
                    }
                    break;
                case -535465324:
                    if (str.equals("localIsCommonLabel")) {
                        b = 3;
                    }
                    break;
                case -204859874:
                    if (str.equals("bgColor")) {
                        b = 4;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 5;
                    }
                    break;
                case 3226745:
                    if (str.equals("icon")) {
                        b = 6;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 7;
                    }
                    break;
                case 100346066:
                    if (str.equals(FirebaseAnalytics.Param.INDEX)) {
                        b = 8;
                    }
                    break;
                case 606199430:
                    if (str.equals("isPictureTag")) {
                        b = 9;
                    }
                    break;
                case 1204207230:
                    if (str.equals("localTagUserCounts")) {
                        b = 10;
                    }
                    break;
                case 1207870360:
                    if (str.equals("nameColor")) {
                        b = 11;
                    }
                    break;
                case 1296516636:
                    if (str.equals("categories")) {
                        b = 12;
                    }
                    break;
                case 1371185067:
                    if (str.equals("localTagCategories")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1662702951:
                    if (str.equals(MessageType.operation)) {
                        b = 14;
                    }
                    break;
                case 1845269119:
                    if (str.equals("loadIcon")) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    newTags.localShowName = jsonParser.getValueAsString();
                    return true;
                case 1:
                    newTags.gender = jsonParser.getValueAsString();
                    return true;
                case 2:
                    newTags.status = jsonParser.getValueAsString();
                    return true;
                case 3:
                    newTags.localIsCommonLabel = jsonParser.getValueAsBoolean();
                    return true;
                case 4:
                    newTags.bgColor = jsonParser.getValueAsString();
                    return true;
                case 5:
                    newTags.f21199id = jsonParser.getValueAsString();
                    return false;
                case 6:
                    newTags.icon = jsonParser.getValueAsString();
                    return true;
                case 7:
                    newTags.name = jsonParser.getValueAsString();
                    return true;
                case 8:
                    newTags.index = jsonParser.getValueAsInt();
                    return true;
                case 9:
                    newTags.isPictureTag = jsonParser.getValueAsBoolean();
                    return true;
                case 10:
                    newTags.localTagUserCounts = jsonParser.getValueAsLong();
                    return true;
                case 11:
                    newTags.nameColor = jsonParser.getValueAsString();
                    return true;
                case 12:
                    newTags.categories = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    newTags.localTagCategories = JsonAdapter.parseArray(jsonParser, TagCategories.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    newTags.operation = jsonParser.getValueAsString();
                    return true;
                case 15:
                    newTags.loadIcon = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(NewTags newTags, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1776899149:
                    if (str.equals("localShowName")) {
                        b = 0;
                    }
                    break;
                case -1249512767:
                    if (str.equals("gender")) {
                        b = 1;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 2;
                    }
                    break;
                case -535465324:
                    if (str.equals("localIsCommonLabel")) {
                        b = 3;
                    }
                    break;
                case -204859874:
                    if (str.equals("bgColor")) {
                        b = 4;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 5;
                    }
                    break;
                case 3226745:
                    if (str.equals("icon")) {
                        b = 6;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 7;
                    }
                    break;
                case 100346066:
                    if (str.equals(FirebaseAnalytics.Param.INDEX)) {
                        b = 8;
                    }
                    break;
                case 606199430:
                    if (str.equals("isPictureTag")) {
                        b = 9;
                    }
                    break;
                case 1204207230:
                    if (str.equals("localTagUserCounts")) {
                        b = 10;
                    }
                    break;
                case 1207870360:
                    if (str.equals("nameColor")) {
                        b = 11;
                    }
                    break;
                case 1296516636:
                    if (str.equals("categories")) {
                        b = 12;
                    }
                    break;
                case 1371185067:
                    if (str.equals("localTagCategories")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1662702951:
                    if (str.equals(MessageType.operation)) {
                        b = 14;
                    }
                    break;
                case 1845269119:
                    if (str.equals("loadIcon")) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    return true;
                case 5:
                    return false;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    return true;
                default:
                    return super.parseFieldCheck(newTags, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NewTags newTags, JsonGenerator jsonGenerator) throws IOException {
            String str = newTags.f21199id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = newTags.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            if (newTags.categories != null) {
                jsonGenerator.writeFieldName("categories");
                JsonAdapter.serializeArray(newTags.categories, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str3 = newTags.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
            String str4 = newTags.operation;
            if (str4 != null) {
                jsonGenerator.writeStringField(MessageType.operation, str4);
            }
            String str5 = newTags.status;
            if (str5 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str5);
            }
            jsonGenerator.writeNumberField("localTagUserCounts", newTags.localTagUserCounts);
            jsonGenerator.writeBooleanField("localIsCommonLabel", newTags.localIsCommonLabel);
            if (newTags.localTagCategories != null) {
                jsonGenerator.writeFieldName("localTagCategories");
                JsonAdapter.serializeArray(newTags.localTagCategories, jsonGenerator, TagCategories.JSON_ADAPTER);
            }
            String str6 = newTags.localShowName;
            if (str6 != null) {
                jsonGenerator.writeStringField("localShowName", str6);
            }
            String str7 = newTags.gender;
            if (str7 != null) {
                jsonGenerator.writeStringField("gender", str7);
            }
            jsonGenerator.writeBooleanField("isPictureTag", newTags.isPictureTag);
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.INDEX, newTags.index);
            jsonGenerator.writeNumberField("loadIcon", newTags.loadIcon);
            String str8 = newTags.nameColor;
            if (str8 != null) {
                jsonGenerator.writeStringField("nameColor", str8);
            }
            String str9 = newTags.bgColor;
            if (str9 != null) {
                jsonGenerator.writeStringField("bgColor", str9);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewTags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewTags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m36723b(String str) {
        return str;
    }

    public static NewTags new_() {
        NewTags newTags = new NewTags();
        newTags.nullCheck();
        return newTags;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NewTags mo225055clone() {
        NewTags newTags = new NewTags();
        newTags.f21199id = this.f21199id;
        newTags.name = this.name;
        List<String> list = this.categories;
        if (list != null) {
            newTags.categories = ValueObject.util_map(list, new qcj() { // from class: l.vi40
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return NewTags.m36723b((String) obj);
                }
            });
        }
        newTags.icon = this.icon;
        newTags.operation = this.operation;
        newTags.status = this.status;
        newTags.localTagUserCounts = this.localTagUserCounts;
        newTags.localIsCommonLabel = this.localIsCommonLabel;
        List<TagCategories> list2 = this.localTagCategories;
        if (list2 != null) {
            newTags.localTagCategories = ValueObject.util_map(list2, new qcj() { // from class: l.wi40
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((TagCategories) obj).mo225055clone();
                }
            });
        }
        newTags.localShowName = this.localShowName;
        newTags.gender = this.gender;
        newTags.isPictureTag = this.isPictureTag;
        newTags.index = this.index;
        newTags.loadIcon = this.loadIcon;
        newTags.nameColor = this.nameColor;
        newTags.bgColor = this.bgColor;
        newTags.localShowCreditScore = this.localShowCreditScore;
        newTags.localCreditScore = this.localCreditScore;
        return newTags;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewTags)) {
            return false;
        }
        NewTags newTags = (NewTags) obj;
        return ValueObject.util_equals(this.f21199id, newTags.f21199id) && ValueObject.util_equals(this.name, newTags.name) && ValueObject.util_equals(this.categories, newTags.categories) && ValueObject.util_equals(this.icon, newTags.icon) && ValueObject.util_equals(this.operation, newTags.operation) && ValueObject.util_equals(this.status, newTags.status) && this.localTagUserCounts == newTags.localTagUserCounts && this.localIsCommonLabel == newTags.localIsCommonLabel && ValueObject.util_equals(this.localTagCategories, newTags.localTagCategories) && ValueObject.util_equals(this.localShowName, newTags.localShowName) && ValueObject.util_equals(this.gender, newTags.gender) && this.isPictureTag == newTags.isPictureTag && this.index == newTags.index && this.loadIcon == newTags.loadIcon && ValueObject.util_equals(this.nameColor, newTags.nameColor) && ValueObject.util_equals(this.bgColor, newTags.bgColor) && this.localShowCreditScore == newTags.localShowCreditScore && ValueObject.util_equals(this.localCreditScore, newTags.localCreditScore);
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
        String str = this.f21199id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.categories;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.operation;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.status;
        int iHashCode6 = str5 != null ? str5.hashCode() : 0;
        long j = this.localTagUserCounts;
        int i3 = (((((iHashCode5 + iHashCode6) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + (this.localIsCommonLabel ? 1231 : 1237)) * 41;
        List<TagCategories> list2 = this.localTagCategories;
        int iHashCode7 = (i3 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str6 = this.localShowName;
        int iHashCode8 = (iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.gender;
        int iHashCode9 = (((((((iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 41) + (this.isPictureTag ? 1231 : 1237)) * 41) + this.index) * 41) + this.loadIcon) * 41;
        String str8 = this.nameColor;
        int iHashCode10 = (iHashCode9 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.bgColor;
        int iHashCode11 = (((iHashCode10 + (str9 != null ? str9.hashCode() : 0)) * 41) + (this.localShowCreditScore ? 1231 : 1237)) * 41;
        String str10 = this.localCreditScore;
        int iHashCode12 = iHashCode11 + (str10 != null ? str10.hashCode() : 0);
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21199id == null) {
            this.f21199id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.categories == null) {
            this.categories = new ArrayList();
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.operation == null) {
            this.operation = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.localTagCategories == null) {
            this.localTagCategories = new ArrayList();
        }
        if (this.localShowName == null) {
            this.localShowName = "";
        }
        if (this.gender == null) {
            this.gender = "";
        }
        if (this.nameColor == null) {
            this.nameColor = "";
        }
        if (this.bgColor == null) {
            this.bgColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
