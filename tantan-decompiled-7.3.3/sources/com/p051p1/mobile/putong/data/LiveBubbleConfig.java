package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.alibaba.fastjson.asm.Opcodes;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.LiveBubbleConfig;
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
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class LiveBubbleConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livebubbleconfig";

    @ProtobufIndex(index = 8)
    public int bubbleDisappear;

    @NonNull
    @ProtobufIndex(index = 6)
    public String bubbleEndColor;

    @ProtobufIndex(index = 9)
    public int bubbleEveryDayShowMaxCount;

    @ProtobufIndex(index = 7)
    public int bubbleShowAfterWatch;

    @ProtobufIndex(index = 16)
    public int bubbleShowDisappearDays;

    @ProtobufIndex(index = 15)
    public int bubbleShowNotMatchedTimes;

    @NonNull
    @ProtobufIndex(index = 5)
    public String bubbleStartColor;

    @NonNull
    @ProtobufIndex(index = 4)
    public String bubbleTextColor;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> bubbleTextList;

    @ProtobufIndex(index = 13)
    public long bubbleTimeInterval;

    @ProtobufIndex(index = 10)
    public int bubbleUserShowMaxCount;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39618id;

    @ProtobufIndex(index = 12)
    public boolean needCheckHasEnterLive;

    @ProtobufIndex(index = 11)
    public boolean needCheckHasEnterSquare;

    @NonNull
    @ProtobufIndex(index = 14)
    public String subType;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<LiveBubbleConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveBubbleConfig>() { // from class: com.p1.mobile.putong.data.LiveBubbleConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveBubbleConfig liveBubbleConfig) {
            String str = liveBubbleConfig.f39618id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = liveBubbleConfig.type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            List<String> list = liveBubbleConfig.bubbleTextList;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = liveBubbleConfig.bubbleTextColor;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            String str4 = liveBubbleConfig.bubbleStartColor;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str4);
            }
            String str5 = liveBubbleConfig.bubbleEndColor;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str5);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(7, liveBubbleConfig.bubbleShowAfterWatch) + CodedOutputByteBufferNano.m17281h(8, liveBubbleConfig.bubbleDisappear) + CodedOutputByteBufferNano.m17281h(9, liveBubbleConfig.bubbleEveryDayShowMaxCount) + CodedOutputByteBufferNano.m17281h(10, liveBubbleConfig.bubbleUserShowMaxCount) + CodedOutputByteBufferNano.m17275b(11, liveBubbleConfig.needCheckHasEnterSquare) + CodedOutputByteBufferNano.m17275b(12, liveBubbleConfig.needCheckHasEnterLive) + CodedOutputByteBufferNano.m17283j(13, liveBubbleConfig.bubbleTimeInterval);
            String str6 = liveBubbleConfig.subType;
            if (str6 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(14, str6);
            }
            int iM17281h2 = iM17281h + CodedOutputByteBufferNano.m17281h(15, liveBubbleConfig.bubbleShowNotMatchedTimes) + CodedOutputByteBufferNano.m17281h(16, liveBubbleConfig.bubbleShowDisappearDays);
            liveBubbleConfig.cachedSize = iM17281h2;
            return iM17281h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveBubbleConfig parse(nc5 nc5Var) throws IOException {
            LiveBubbleConfig liveBubbleConfig = new LiveBubbleConfig();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (liveBubbleConfig.f39618id == null) {
                            liveBubbleConfig.f39618id = "";
                        }
                        if (liveBubbleConfig.type == null) {
                            liveBubbleConfig.type = "";
                        }
                        if (liveBubbleConfig.bubbleTextList == null) {
                            liveBubbleConfig.bubbleTextList = new ArrayList();
                        }
                        if (liveBubbleConfig.bubbleTextColor == null) {
                            liveBubbleConfig.bubbleTextColor = "";
                        }
                        if (liveBubbleConfig.bubbleStartColor == null) {
                            liveBubbleConfig.bubbleStartColor = "";
                        }
                        if (liveBubbleConfig.bubbleEndColor == null) {
                            liveBubbleConfig.bubbleEndColor = "";
                        }
                        if (liveBubbleConfig.subType == null) {
                            liveBubbleConfig.subType = "";
                        }
                        break;
                    case 10:
                        liveBubbleConfig.f39618id = nc5Var.m162495s();
                        continue;
                    case 18:
                        liveBubbleConfig.type = nc5Var.m162495s();
                        continue;
                    case 26:
                        liveBubbleConfig.bubbleTextList = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 34:
                        liveBubbleConfig.bubbleTextColor = nc5Var.m162495s();
                        continue;
                    case 42:
                        liveBubbleConfig.bubbleStartColor = nc5Var.m162495s();
                        continue;
                    case 50:
                        liveBubbleConfig.bubbleEndColor = nc5Var.m162495s();
                        continue;
                    case 56:
                        liveBubbleConfig.bubbleShowAfterWatch = nc5Var.m162486j();
                        continue;
                    case 64:
                        liveBubbleConfig.bubbleDisappear = nc5Var.m162486j();
                        continue;
                    case 72:
                        liveBubbleConfig.bubbleEveryDayShowMaxCount = nc5Var.m162486j();
                        continue;
                    case 80:
                        liveBubbleConfig.bubbleUserShowMaxCount = nc5Var.m162486j();
                        continue;
                    case 88:
                        liveBubbleConfig.needCheckHasEnterSquare = nc5Var.m162483g();
                        continue;
                    case Opcodes.IADD /* 96 */:
                        liveBubbleConfig.needCheckHasEnterLive = nc5Var.m162483g();
                        continue;
                    case 104:
                        liveBubbleConfig.bubbleTimeInterval = nc5Var.m162487k();
                        continue;
                    case 114:
                        liveBubbleConfig.subType = nc5Var.m162495s();
                        continue;
                    case 120:
                        liveBubbleConfig.bubbleShowNotMatchedTimes = nc5Var.m162486j();
                        continue;
                    case 128:
                        liveBubbleConfig.bubbleShowDisappearDays = nc5Var.m162486j();
                        continue;
                    default:
                        if (liveBubbleConfig.f39618id == null) {
                            liveBubbleConfig.f39618id = "";
                        }
                        if (liveBubbleConfig.type == null) {
                            liveBubbleConfig.type = "";
                        }
                        if (liveBubbleConfig.bubbleTextList == null) {
                            liveBubbleConfig.bubbleTextList = new ArrayList();
                        }
                        if (liveBubbleConfig.bubbleTextColor == null) {
                            liveBubbleConfig.bubbleTextColor = "";
                        }
                        if (liveBubbleConfig.bubbleStartColor == null) {
                            liveBubbleConfig.bubbleStartColor = "";
                        }
                        if (liveBubbleConfig.bubbleEndColor == null) {
                            liveBubbleConfig.bubbleEndColor = "";
                        }
                        if (liveBubbleConfig.subType == null) {
                            liveBubbleConfig.subType = "";
                            return liveBubbleConfig;
                        }
                        break;
                }
            }
            return liveBubbleConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveBubbleConfig liveBubbleConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveBubbleConfig.f39618id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = liveBubbleConfig.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            List<String> list = liveBubbleConfig.bubbleTextList;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = liveBubbleConfig.bubbleTextColor;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            String str4 = liveBubbleConfig.bubbleStartColor;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(5, str4);
            }
            String str5 = liveBubbleConfig.bubbleEndColor;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(6, str5);
            }
            codedOutputByteBufferNano.m17305G(7, liveBubbleConfig.bubbleShowAfterWatch);
            codedOutputByteBufferNano.m17305G(8, liveBubbleConfig.bubbleDisappear);
            codedOutputByteBufferNano.m17305G(9, liveBubbleConfig.bubbleEveryDayShowMaxCount);
            codedOutputByteBufferNano.m17305G(10, liveBubbleConfig.bubbleUserShowMaxCount);
            codedOutputByteBufferNano.m17299A(11, liveBubbleConfig.needCheckHasEnterSquare);
            codedOutputByteBufferNano.m17299A(12, liveBubbleConfig.needCheckHasEnterLive);
            codedOutputByteBufferNano.m17307I(13, liveBubbleConfig.bubbleTimeInterval);
            String str6 = liveBubbleConfig.subType;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(14, str6);
            }
            codedOutputByteBufferNano.m17305G(15, liveBubbleConfig.bubbleShowNotMatchedTimes);
            codedOutputByteBufferNano.m17305G(16, liveBubbleConfig.bubbleShowDisappearDays);
        }
    };
    public static JsonAdapter<LiveBubbleConfig> JSON_ADAPTER = new ObjectJsonAdapter<LiveBubbleConfig>() { // from class: com.p1.mobile.putong.data.LiveBubbleConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveBubbleConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveBubbleConfig newInstance() {
            return new LiveBubbleConfig();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(LiveBubbleConfig liveBubbleConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2134239906:
                    if (str.equals("bubbleTimeInterval")) {
                        b = 0;
                    }
                    break;
                case -1937834596:
                    if (str.equals("needCheckHasEnterLive")) {
                        b = 1;
                    }
                    break;
                case -1868521062:
                    if (str.equals("subType")) {
                        b = 2;
                    }
                    break;
                case -1497910772:
                    if (str.equals("bubbleShowNotMatchedTimes")) {
                        b = 3;
                    }
                    break;
                case -1068050409:
                    if (str.equals("bubbleTextList")) {
                        b = 4;
                    }
                    break;
                case -410152228:
                    if (str.equals("bubbleShowAfterWatch")) {
                        b = 5;
                    }
                    break;
                case -327568321:
                    if (str.equals("bubbleUserShowMaxCount")) {
                        b = 6;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 7;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 8;
                    }
                    break;
                case 653537269:
                    if (str.equals("bubbleEveryDayShowMaxCount")) {
                        b = 9;
                    }
                    break;
                case 1091475313:
                    if (str.equals("bubbleShowDisappearDays")) {
                        b = 10;
                    }
                    break;
                case 1155217869:
                    if (str.equals("bubbleStartColor")) {
                        b = 11;
                    }
                    break;
                case 1242035978:
                    if (str.equals("bubbleTextColor")) {
                        b = 12;
                    }
                    break;
                case 1635374068:
                    if (str.equals("bubbleEndColor")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1964521933:
                    if (str.equals("needCheckHasEnterSquare")) {
                        b = 14;
                    }
                    break;
                case 2127886455:
                    if (str.equals("bubbleDisappear")) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    liveBubbleConfig.bubbleTimeInterval = jsonParser.getValueAsLong();
                    return true;
                case 1:
                    liveBubbleConfig.needCheckHasEnterLive = jsonParser.getValueAsBoolean();
                    return true;
                case 2:
                    liveBubbleConfig.subType = jsonParser.getValueAsString();
                    return true;
                case 3:
                    liveBubbleConfig.bubbleShowNotMatchedTimes = jsonParser.getValueAsInt();
                    return true;
                case 4:
                    liveBubbleConfig.bubbleTextList = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    liveBubbleConfig.bubbleShowAfterWatch = jsonParser.getValueAsInt();
                    return true;
                case 6:
                    liveBubbleConfig.bubbleUserShowMaxCount = jsonParser.getValueAsInt();
                    return true;
                case 7:
                    liveBubbleConfig.f39618id = jsonParser.getValueAsString();
                    return false;
                case 8:
                    liveBubbleConfig.type = jsonParser.getValueAsString();
                    return true;
                case 9:
                    liveBubbleConfig.bubbleEveryDayShowMaxCount = jsonParser.getValueAsInt();
                    return true;
                case 10:
                    liveBubbleConfig.bubbleShowDisappearDays = jsonParser.getValueAsInt();
                    return true;
                case 11:
                    liveBubbleConfig.bubbleStartColor = jsonParser.getValueAsString();
                    return true;
                case 12:
                    liveBubbleConfig.bubbleTextColor = jsonParser.getValueAsString();
                    return true;
                case 13:
                    liveBubbleConfig.bubbleEndColor = jsonParser.getValueAsString();
                    return true;
                case 14:
                    liveBubbleConfig.needCheckHasEnterSquare = jsonParser.getValueAsBoolean();
                    return true;
                case 15:
                    liveBubbleConfig.bubbleDisappear = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(LiveBubbleConfig liveBubbleConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2134239906:
                    if (str.equals("bubbleTimeInterval")) {
                        b = 0;
                    }
                    break;
                case -1937834596:
                    if (str.equals("needCheckHasEnterLive")) {
                        b = 1;
                    }
                    break;
                case -1868521062:
                    if (str.equals("subType")) {
                        b = 2;
                    }
                    break;
                case -1497910772:
                    if (str.equals("bubbleShowNotMatchedTimes")) {
                        b = 3;
                    }
                    break;
                case -1068050409:
                    if (str.equals("bubbleTextList")) {
                        b = 4;
                    }
                    break;
                case -410152228:
                    if (str.equals("bubbleShowAfterWatch")) {
                        b = 5;
                    }
                    break;
                case -327568321:
                    if (str.equals("bubbleUserShowMaxCount")) {
                        b = 6;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 7;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 8;
                    }
                    break;
                case 653537269:
                    if (str.equals("bubbleEveryDayShowMaxCount")) {
                        b = 9;
                    }
                    break;
                case 1091475313:
                    if (str.equals("bubbleShowDisappearDays")) {
                        b = 10;
                    }
                    break;
                case 1155217869:
                    if (str.equals("bubbleStartColor")) {
                        b = 11;
                    }
                    break;
                case 1242035978:
                    if (str.equals("bubbleTextColor")) {
                        b = 12;
                    }
                    break;
                case 1635374068:
                    if (str.equals("bubbleEndColor")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1964521933:
                    if (str.equals("needCheckHasEnterSquare")) {
                        b = 14;
                    }
                    break;
                case 2127886455:
                    if (str.equals("bubbleDisappear")) {
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
                case 5:
                case 6:
                    return true;
                case 7:
                    return false;
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
                    return super.parseFieldCheck(liveBubbleConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveBubbleConfig liveBubbleConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = liveBubbleConfig.f39618id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = liveBubbleConfig.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            if (liveBubbleConfig.bubbleTextList != null) {
                jsonGenerator.writeFieldName("bubbleTextList");
                JsonAdapter.serializeArray(liveBubbleConfig.bubbleTextList, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str3 = liveBubbleConfig.bubbleTextColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("bubbleTextColor", str3);
            }
            String str4 = liveBubbleConfig.bubbleStartColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("bubbleStartColor", str4);
            }
            String str5 = liveBubbleConfig.bubbleEndColor;
            if (str5 != null) {
                jsonGenerator.writeStringField("bubbleEndColor", str5);
            }
            jsonGenerator.writeNumberField("bubbleShowAfterWatch", liveBubbleConfig.bubbleShowAfterWatch);
            jsonGenerator.writeNumberField("bubbleDisappear", liveBubbleConfig.bubbleDisappear);
            jsonGenerator.writeNumberField("bubbleEveryDayShowMaxCount", liveBubbleConfig.bubbleEveryDayShowMaxCount);
            jsonGenerator.writeNumberField("bubbleUserShowMaxCount", liveBubbleConfig.bubbleUserShowMaxCount);
            jsonGenerator.writeBooleanField("needCheckHasEnterSquare", liveBubbleConfig.needCheckHasEnterSquare);
            jsonGenerator.writeBooleanField("needCheckHasEnterLive", liveBubbleConfig.needCheckHasEnterLive);
            jsonGenerator.writeNumberField("bubbleTimeInterval", liveBubbleConfig.bubbleTimeInterval);
            String str6 = liveBubbleConfig.subType;
            if (str6 != null) {
                jsonGenerator.writeStringField("subType", str6);
            }
            jsonGenerator.writeNumberField("bubbleShowNotMatchedTimes", liveBubbleConfig.bubbleShowNotMatchedTimes);
            jsonGenerator.writeNumberField("bubbleShowDisappearDays", liveBubbleConfig.bubbleShowDisappearDays);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveBubbleConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveBubbleConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61015a(String str) {
        return str;
    }

    public static LiveBubbleConfig new_() {
        LiveBubbleConfig liveBubbleConfig = new LiveBubbleConfig();
        liveBubbleConfig.nullCheck();
        return liveBubbleConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveBubbleConfig mo225055clone() {
        LiveBubbleConfig liveBubbleConfig = new LiveBubbleConfig();
        liveBubbleConfig.f39618id = this.f39618id;
        liveBubbleConfig.type = this.type;
        List<String> list = this.bubbleTextList;
        if (list != null) {
            liveBubbleConfig.bubbleTextList = ValueObject.util_map(list, new qcj() { // from class: l.d1s
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return LiveBubbleConfig.m61015a((String) obj);
                }
            });
        }
        liveBubbleConfig.bubbleTextColor = this.bubbleTextColor;
        liveBubbleConfig.bubbleStartColor = this.bubbleStartColor;
        liveBubbleConfig.bubbleEndColor = this.bubbleEndColor;
        liveBubbleConfig.bubbleShowAfterWatch = this.bubbleShowAfterWatch;
        liveBubbleConfig.bubbleDisappear = this.bubbleDisappear;
        liveBubbleConfig.bubbleEveryDayShowMaxCount = this.bubbleEveryDayShowMaxCount;
        liveBubbleConfig.bubbleUserShowMaxCount = this.bubbleUserShowMaxCount;
        liveBubbleConfig.needCheckHasEnterSquare = this.needCheckHasEnterSquare;
        liveBubbleConfig.needCheckHasEnterLive = this.needCheckHasEnterLive;
        liveBubbleConfig.bubbleTimeInterval = this.bubbleTimeInterval;
        liveBubbleConfig.subType = this.subType;
        liveBubbleConfig.bubbleShowNotMatchedTimes = this.bubbleShowNotMatchedTimes;
        liveBubbleConfig.bubbleShowDisappearDays = this.bubbleShowDisappearDays;
        return liveBubbleConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveBubbleConfig)) {
            return false;
        }
        LiveBubbleConfig liveBubbleConfig = (LiveBubbleConfig) obj;
        return ValueObject.util_equals(this.f39618id, liveBubbleConfig.f39618id) && ValueObject.util_equals(this.type, liveBubbleConfig.type) && ValueObject.util_equals(this.bubbleTextList, liveBubbleConfig.bubbleTextList) && ValueObject.util_equals(this.bubbleTextColor, liveBubbleConfig.bubbleTextColor) && ValueObject.util_equals(this.bubbleStartColor, liveBubbleConfig.bubbleStartColor) && ValueObject.util_equals(this.bubbleEndColor, liveBubbleConfig.bubbleEndColor) && this.bubbleShowAfterWatch == liveBubbleConfig.bubbleShowAfterWatch && this.bubbleDisappear == liveBubbleConfig.bubbleDisappear && this.bubbleEveryDayShowMaxCount == liveBubbleConfig.bubbleEveryDayShowMaxCount && this.bubbleUserShowMaxCount == liveBubbleConfig.bubbleUserShowMaxCount && this.needCheckHasEnterSquare == liveBubbleConfig.needCheckHasEnterSquare && this.needCheckHasEnterLive == liveBubbleConfig.needCheckHasEnterLive && this.bubbleTimeInterval == liveBubbleConfig.bubbleTimeInterval && ValueObject.util_equals(this.subType, liveBubbleConfig.subType) && this.bubbleShowNotMatchedTimes == liveBubbleConfig.bubbleShowNotMatchedTimes && this.bubbleShowDisappearDays == liveBubbleConfig.bubbleShowDisappearDays;
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
        String str = this.f39618id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.bubbleTextList;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.bubbleTextColor;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.bubbleStartColor;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.bubbleEndColor;
        int iHashCode6 = (((((((((((((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41) + this.bubbleShowAfterWatch) * 41) + this.bubbleDisappear) * 41) + this.bubbleEveryDayShowMaxCount) * 41) + this.bubbleUserShowMaxCount) * 41) + (this.needCheckHasEnterSquare ? 1231 : 1237)) * 41) + (this.needCheckHasEnterLive ? 1231 : 1237)) * 41;
        long j = this.bubbleTimeInterval;
        int i3 = (iHashCode6 + ((int) (j ^ (j >>> 32)))) * 41;
        String str6 = this.subType;
        int iHashCode7 = ((((i3 + (str6 != null ? str6.hashCode() : 0)) * 41) + this.bubbleShowNotMatchedTimes) * 41) + this.bubbleShowDisappearDays;
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39618id == null) {
            this.f39618id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.bubbleTextList == null) {
            this.bubbleTextList = new ArrayList();
        }
        if (this.bubbleTextColor == null) {
            this.bubbleTextColor = "";
        }
        if (this.bubbleStartColor == null) {
            this.bubbleStartColor = "";
        }
        if (this.bubbleEndColor == null) {
            this.bubbleEndColor = "";
        }
        if (this.subType == null) {
            this.subType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
