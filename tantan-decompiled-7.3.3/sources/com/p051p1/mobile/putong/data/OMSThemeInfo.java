package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.OMSThemeInfo;
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

/* JADX INFO: loaded from: classes12.dex */
public class OMSThemeInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsthemeinfo";

    @NonNull
    @ProtobufIndex(index = 6)
    public List<String> bgColors;

    @NonNull
    @ProtobufIndex(index = 11)
    public OMSThemeBubbleInfo bubble;

    @NonNull
    @ProtobufIndex(index = 14)
    public OMSThemeBubbleOpenInfo bubbleOpen;

    @NonNull
    @ProtobufIndex(index = 5)
    public String color;

    @NonNull
    @ProtobufIndex(index = 2)
    public OMSThemeCountdownInfo countdownView;

    @NonNull
    @ProtobufIndex(index = 7)
    public String h5URL;

    @ProtobufIndex(index = 10)
    public int h5popLimit;

    @NonNull
    @ProtobufIndex(index = 15)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39644id;

    @ProtobufIndex(index = 9)
    public boolean questionnaireFinished;

    @NonNull
    @ProtobufIndex(index = 13)
    public String settingTxt;

    @NonNull
    @ProtobufIndex(index = 4)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 12)
    public OMSThemeSuggestStrageryInfo suggestStrategy;

    @ProtobufIndex(index = 8)
    public boolean suggestSwitch;

    @NonNull
    @ProtobufIndex(index = 3)
    public String title;
    public static ProtobufAdapter<OMSThemeInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSThemeInfo>() { // from class: com.p1.mobile.putong.data.OMSThemeInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSThemeInfo oMSThemeInfo) {
            String str = oMSThemeInfo.f39644id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            OMSThemeCountdownInfo oMSThemeCountdownInfo = oMSThemeInfo.countdownView;
            if (oMSThemeCountdownInfo != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, oMSThemeCountdownInfo, OMSThemeCountdownInfo.PROTOBUF_ADAPTER);
            }
            String str2 = oMSThemeInfo.title;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = oMSThemeInfo.subTitle;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            String str4 = oMSThemeInfo.color;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str4);
            }
            List<String> list = oMSThemeInfo.bgColors;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(6, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = oMSThemeInfo.h5URL;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str5);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(8, oMSThemeInfo.suggestSwitch) + CodedOutputByteBufferNano.m17275b(9, oMSThemeInfo.questionnaireFinished) + CodedOutputByteBufferNano.m17281h(10, oMSThemeInfo.h5popLimit);
            OMSThemeBubbleInfo oMSThemeBubbleInfo = oMSThemeInfo.bubble;
            if (oMSThemeBubbleInfo != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(11, oMSThemeBubbleInfo, OMSThemeBubbleInfo.PROTOBUF_ADAPTER);
            }
            OMSThemeSuggestStrageryInfo oMSThemeSuggestStrageryInfo = oMSThemeInfo.suggestStrategy;
            if (oMSThemeSuggestStrageryInfo != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(12, oMSThemeSuggestStrageryInfo, OMSThemeSuggestStrageryInfo.PROTOBUF_ADAPTER);
            }
            String str6 = oMSThemeInfo.settingTxt;
            if (str6 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(13, str6);
            }
            OMSThemeBubbleOpenInfo oMSThemeBubbleOpenInfo = oMSThemeInfo.bubbleOpen;
            if (oMSThemeBubbleOpenInfo != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(14, oMSThemeBubbleOpenInfo, OMSThemeBubbleOpenInfo.PROTOBUF_ADAPTER);
            }
            String str7 = oMSThemeInfo.icon;
            if (str7 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(15, str7);
            }
            oMSThemeInfo.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSThemeInfo parse(nc5 nc5Var) throws IOException {
            OMSThemeInfo oMSThemeInfo = new OMSThemeInfo();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (oMSThemeInfo.f39644id == null) {
                            oMSThemeInfo.f39644id = "";
                        }
                        if (oMSThemeInfo.countdownView == null) {
                            oMSThemeInfo.countdownView = OMSThemeCountdownInfo.new_();
                        }
                        if (oMSThemeInfo.title == null) {
                            oMSThemeInfo.title = "";
                        }
                        if (oMSThemeInfo.subTitle == null) {
                            oMSThemeInfo.subTitle = "";
                        }
                        if (oMSThemeInfo.settingTxt == null) {
                            oMSThemeInfo.settingTxt = "";
                        }
                        if (oMSThemeInfo.color == null) {
                            oMSThemeInfo.color = "";
                        }
                        if (oMSThemeInfo.bgColors == null) {
                            oMSThemeInfo.bgColors = new ArrayList();
                        }
                        if (oMSThemeInfo.h5URL == null) {
                            oMSThemeInfo.h5URL = "";
                        }
                        if (oMSThemeInfo.bubble == null) {
                            oMSThemeInfo.bubble = OMSThemeBubbleInfo.new_();
                        }
                        if (oMSThemeInfo.suggestStrategy == null) {
                            oMSThemeInfo.suggestStrategy = OMSThemeSuggestStrageryInfo.new_();
                        }
                        if (oMSThemeInfo.bubbleOpen == null) {
                            oMSThemeInfo.bubbleOpen = OMSThemeBubbleOpenInfo.new_();
                        }
                        if (oMSThemeInfo.icon == null) {
                            oMSThemeInfo.icon = "";
                        }
                        break;
                    case 10:
                        oMSThemeInfo.f39644id = nc5Var.m162495s();
                        continue;
                    case 18:
                        oMSThemeInfo.countdownView = (OMSThemeCountdownInfo) nc5Var.m162488l(OMSThemeCountdownInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        oMSThemeInfo.title = nc5Var.m162495s();
                        continue;
                    case 34:
                        oMSThemeInfo.subTitle = nc5Var.m162495s();
                        continue;
                    case 42:
                        oMSThemeInfo.color = nc5Var.m162495s();
                        continue;
                    case 50:
                        oMSThemeInfo.bgColors = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 58:
                        oMSThemeInfo.h5URL = nc5Var.m162495s();
                        continue;
                    case 64:
                        oMSThemeInfo.suggestSwitch = nc5Var.m162483g();
                        continue;
                    case 72:
                        oMSThemeInfo.questionnaireFinished = nc5Var.m162483g();
                        continue;
                    case 80:
                        oMSThemeInfo.h5popLimit = nc5Var.m162486j();
                        continue;
                    case 90:
                        oMSThemeInfo.bubble = (OMSThemeBubbleInfo) nc5Var.m162488l(OMSThemeBubbleInfo.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        oMSThemeInfo.suggestStrategy = (OMSThemeSuggestStrageryInfo) nc5Var.m162488l(OMSThemeSuggestStrageryInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        oMSThemeInfo.settingTxt = nc5Var.m162495s();
                        continue;
                    case 114:
                        oMSThemeInfo.bubbleOpen = (OMSThemeBubbleOpenInfo) nc5Var.m162488l(OMSThemeBubbleOpenInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        oMSThemeInfo.icon = nc5Var.m162495s();
                        continue;
                    default:
                        if (oMSThemeInfo.f39644id == null) {
                            oMSThemeInfo.f39644id = "";
                        }
                        if (oMSThemeInfo.countdownView == null) {
                            oMSThemeInfo.countdownView = OMSThemeCountdownInfo.new_();
                        }
                        if (oMSThemeInfo.title == null) {
                            oMSThemeInfo.title = "";
                        }
                        if (oMSThemeInfo.subTitle == null) {
                            oMSThemeInfo.subTitle = "";
                        }
                        if (oMSThemeInfo.settingTxt == null) {
                            oMSThemeInfo.settingTxt = "";
                        }
                        if (oMSThemeInfo.color == null) {
                            oMSThemeInfo.color = "";
                        }
                        if (oMSThemeInfo.bgColors == null) {
                            oMSThemeInfo.bgColors = new ArrayList();
                        }
                        if (oMSThemeInfo.h5URL == null) {
                            oMSThemeInfo.h5URL = "";
                        }
                        if (oMSThemeInfo.bubble == null) {
                            oMSThemeInfo.bubble = OMSThemeBubbleInfo.new_();
                        }
                        if (oMSThemeInfo.suggestStrategy == null) {
                            oMSThemeInfo.suggestStrategy = OMSThemeSuggestStrageryInfo.new_();
                        }
                        if (oMSThemeInfo.bubbleOpen == null) {
                            oMSThemeInfo.bubbleOpen = OMSThemeBubbleOpenInfo.new_();
                        }
                        if (oMSThemeInfo.icon == null) {
                            oMSThemeInfo.icon = "";
                            return oMSThemeInfo;
                        }
                        break;
                }
            }
            return oMSThemeInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSThemeInfo oMSThemeInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSThemeInfo.f39644id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            OMSThemeCountdownInfo oMSThemeCountdownInfo = oMSThemeInfo.countdownView;
            if (oMSThemeCountdownInfo != null) {
                codedOutputByteBufferNano.m17309K(2, oMSThemeCountdownInfo, OMSThemeCountdownInfo.PROTOBUF_ADAPTER);
            }
            String str2 = oMSThemeInfo.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = oMSThemeInfo.subTitle;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            String str4 = oMSThemeInfo.color;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(5, str4);
            }
            List<String> list = oMSThemeInfo.bgColors;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(6, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = oMSThemeInfo.h5URL;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(7, str5);
            }
            codedOutputByteBufferNano.m17299A(8, oMSThemeInfo.suggestSwitch);
            codedOutputByteBufferNano.m17299A(9, oMSThemeInfo.questionnaireFinished);
            codedOutputByteBufferNano.m17305G(10, oMSThemeInfo.h5popLimit);
            OMSThemeBubbleInfo oMSThemeBubbleInfo = oMSThemeInfo.bubble;
            if (oMSThemeBubbleInfo != null) {
                codedOutputByteBufferNano.m17309K(11, oMSThemeBubbleInfo, OMSThemeBubbleInfo.PROTOBUF_ADAPTER);
            }
            OMSThemeSuggestStrageryInfo oMSThemeSuggestStrageryInfo = oMSThemeInfo.suggestStrategy;
            if (oMSThemeSuggestStrageryInfo != null) {
                codedOutputByteBufferNano.m17309K(12, oMSThemeSuggestStrageryInfo, OMSThemeSuggestStrageryInfo.PROTOBUF_ADAPTER);
            }
            String str6 = oMSThemeInfo.settingTxt;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(13, str6);
            }
            OMSThemeBubbleOpenInfo oMSThemeBubbleOpenInfo = oMSThemeInfo.bubbleOpen;
            if (oMSThemeBubbleOpenInfo != null) {
                codedOutputByteBufferNano.m17309K(14, oMSThemeBubbleOpenInfo, OMSThemeBubbleOpenInfo.PROTOBUF_ADAPTER);
            }
            String str7 = oMSThemeInfo.icon;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(15, str7);
            }
        }
    };
    public static JsonAdapter<OMSThemeInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSThemeInfo>() { // from class: com.p1.mobile.putong.data.OMSThemeInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSThemeInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSThemeInfo newInstance() {
            return new OMSThemeInfo();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(OMSThemeInfo oMSThemeInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2090050568:
                    if (str.equals("subTitle")) {
                        b = 0;
                    }
                    break;
                case -2055688683:
                    if (str.equals("bgColors")) {
                        b = 1;
                    }
                    break;
                case -1890984139:
                    if (str.equals("questionnaireFinished")) {
                        b = 2;
                    }
                    break;
                case -1871224872:
                    if (str.equals("suggestSwitch")) {
                        b = 3;
                    }
                    break;
                case -1378241396:
                    if (str.equals("bubble")) {
                        b = 4;
                    }
                    break;
                case -1077693673:
                    if (str.equals("suggestStrategy")) {
                        b = 5;
                    }
                    break;
                case -3941888:
                    if (str.equals("settingTxt")) {
                        b = 6;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 7;
                    }
                    break;
                case 3226745:
                    if (str.equals("icon")) {
                        b = 8;
                    }
                    break;
                case 94842723:
                    if (str.equals("color")) {
                        b = 9;
                    }
                    break;
                case 97709410:
                    if (str.equals("h5URL")) {
                        b = 10;
                    }
                    break;
                case 110371416:
                    if (str.equals("title")) {
                        b = 11;
                    }
                    break;
                case 163195126:
                    if (str.equals("bubbleOpen")) {
                        b = 12;
                    }
                    break;
                case 366437303:
                    if (str.equals("h5popLimit")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 450462838:
                    if (str.equals("countdownView")) {
                        b = 14;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    oMSThemeInfo.subTitle = jsonParser.getValueAsString();
                    return true;
                case 1:
                    oMSThemeInfo.bgColors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    oMSThemeInfo.questionnaireFinished = jsonParser.getValueAsBoolean();
                    return true;
                case 3:
                    oMSThemeInfo.suggestSwitch = jsonParser.getValueAsBoolean();
                    return true;
                case 4:
                    oMSThemeInfo.bubble = OMSThemeBubbleInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    oMSThemeInfo.suggestStrategy = OMSThemeSuggestStrageryInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    oMSThemeInfo.settingTxt = jsonParser.getValueAsString();
                    return true;
                case 7:
                    oMSThemeInfo.f39644id = jsonParser.getValueAsString();
                    return false;
                case 8:
                    oMSThemeInfo.icon = jsonParser.getValueAsString();
                    return true;
                case 9:
                    oMSThemeInfo.color = jsonParser.getValueAsString();
                    return true;
                case 10:
                    oMSThemeInfo.h5URL = jsonParser.getValueAsString();
                    return true;
                case 11:
                    oMSThemeInfo.title = jsonParser.getValueAsString();
                    return true;
                case 12:
                    oMSThemeInfo.bubbleOpen = OMSThemeBubbleOpenInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    oMSThemeInfo.h5popLimit = jsonParser.getValueAsInt();
                    return true;
                case 14:
                    oMSThemeInfo.countdownView = OMSThemeCountdownInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(OMSThemeInfo oMSThemeInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2090050568:
                    if (str.equals("subTitle")) {
                        b = 0;
                    }
                    break;
                case -2055688683:
                    if (str.equals("bgColors")) {
                        b = 1;
                    }
                    break;
                case -1890984139:
                    if (str.equals("questionnaireFinished")) {
                        b = 2;
                    }
                    break;
                case -1871224872:
                    if (str.equals("suggestSwitch")) {
                        b = 3;
                    }
                    break;
                case -1378241396:
                    if (str.equals("bubble")) {
                        b = 4;
                    }
                    break;
                case -1077693673:
                    if (str.equals("suggestStrategy")) {
                        b = 5;
                    }
                    break;
                case -3941888:
                    if (str.equals("settingTxt")) {
                        b = 6;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 7;
                    }
                    break;
                case 3226745:
                    if (str.equals("icon")) {
                        b = 8;
                    }
                    break;
                case 94842723:
                    if (str.equals("color")) {
                        b = 9;
                    }
                    break;
                case 97709410:
                    if (str.equals("h5URL")) {
                        b = 10;
                    }
                    break;
                case 110371416:
                    if (str.equals("title")) {
                        b = 11;
                    }
                    break;
                case 163195126:
                    if (str.equals("bubbleOpen")) {
                        b = 12;
                    }
                    break;
                case 366437303:
                    if (str.equals("h5popLimit")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 450462838:
                    if (str.equals("countdownView")) {
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
                    return true;
                default:
                    return super.parseFieldCheck(oMSThemeInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSThemeInfo oMSThemeInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSThemeInfo.f39644id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (oMSThemeInfo.countdownView != null) {
                jsonGenerator.writeFieldName("countdownView");
                OMSThemeCountdownInfo.JSON_ADAPTER.serialize(oMSThemeInfo.countdownView, jsonGenerator, true);
            }
            String str2 = oMSThemeInfo.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = oMSThemeInfo.subTitle;
            if (str3 != null) {
                jsonGenerator.writeStringField("subTitle", str3);
            }
            String str4 = oMSThemeInfo.settingTxt;
            if (str4 != null) {
                jsonGenerator.writeStringField("settingTxt", str4);
            }
            String str5 = oMSThemeInfo.color;
            if (str5 != null) {
                jsonGenerator.writeStringField("color", str5);
            }
            if (oMSThemeInfo.bgColors != null) {
                jsonGenerator.writeFieldName("bgColors");
                JsonAdapter.serializeArray(oMSThemeInfo.bgColors, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str6 = oMSThemeInfo.h5URL;
            if (str6 != null) {
                jsonGenerator.writeStringField("h5URL", str6);
            }
            jsonGenerator.writeBooleanField("suggestSwitch", oMSThemeInfo.suggestSwitch);
            jsonGenerator.writeBooleanField("questionnaireFinished", oMSThemeInfo.questionnaireFinished);
            jsonGenerator.writeNumberField("h5popLimit", oMSThemeInfo.h5popLimit);
            if (oMSThemeInfo.bubble != null) {
                jsonGenerator.writeFieldName("bubble");
                OMSThemeBubbleInfo.JSON_ADAPTER.serialize(oMSThemeInfo.bubble, jsonGenerator, true);
            }
            if (oMSThemeInfo.suggestStrategy != null) {
                jsonGenerator.writeFieldName("suggestStrategy");
                OMSThemeSuggestStrageryInfo.JSON_ADAPTER.serialize(oMSThemeInfo.suggestStrategy, jsonGenerator, true);
            }
            if (oMSThemeInfo.bubbleOpen != null) {
                jsonGenerator.writeFieldName("bubbleOpen");
                OMSThemeBubbleOpenInfo.JSON_ADAPTER.serialize(oMSThemeInfo.bubbleOpen, jsonGenerator, true);
            }
            String str7 = oMSThemeInfo.icon;
            if (str7 != null) {
                jsonGenerator.writeStringField("icon", str7);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSThemeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSThemeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61124a(String str) {
        return str;
    }

    public static OMSThemeInfo new_() {
        OMSThemeInfo oMSThemeInfo = new OMSThemeInfo();
        oMSThemeInfo.nullCheck();
        return oMSThemeInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSThemeInfo mo225055clone() {
        OMSThemeInfo oMSThemeInfo = new OMSThemeInfo();
        oMSThemeInfo.f39644id = this.f39644id;
        OMSThemeCountdownInfo oMSThemeCountdownInfo = this.countdownView;
        if (oMSThemeCountdownInfo != null) {
            oMSThemeInfo.countdownView = oMSThemeCountdownInfo.mo225055clone();
        }
        oMSThemeInfo.title = this.title;
        oMSThemeInfo.subTitle = this.subTitle;
        oMSThemeInfo.settingTxt = this.settingTxt;
        oMSThemeInfo.color = this.color;
        List<String> list = this.bgColors;
        if (list != null) {
            oMSThemeInfo.bgColors = ValueObject.util_map(list, new qcj() { // from class: l.c850
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return OMSThemeInfo.m61124a((String) obj);
                }
            });
        }
        oMSThemeInfo.h5URL = this.h5URL;
        oMSThemeInfo.suggestSwitch = this.suggestSwitch;
        oMSThemeInfo.questionnaireFinished = this.questionnaireFinished;
        oMSThemeInfo.h5popLimit = this.h5popLimit;
        OMSThemeBubbleInfo oMSThemeBubbleInfo = this.bubble;
        if (oMSThemeBubbleInfo != null) {
            oMSThemeInfo.bubble = oMSThemeBubbleInfo.mo225055clone();
        }
        OMSThemeSuggestStrageryInfo oMSThemeSuggestStrageryInfo = this.suggestStrategy;
        if (oMSThemeSuggestStrageryInfo != null) {
            oMSThemeInfo.suggestStrategy = oMSThemeSuggestStrageryInfo.mo225055clone();
        }
        OMSThemeBubbleOpenInfo oMSThemeBubbleOpenInfo = this.bubbleOpen;
        if (oMSThemeBubbleOpenInfo != null) {
            oMSThemeInfo.bubbleOpen = oMSThemeBubbleOpenInfo.mo225055clone();
        }
        oMSThemeInfo.icon = this.icon;
        return oMSThemeInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSThemeInfo)) {
            return false;
        }
        OMSThemeInfo oMSThemeInfo = (OMSThemeInfo) obj;
        return ValueObject.util_equals(this.f39644id, oMSThemeInfo.f39644id) && ValueObject.util_equals(this.countdownView, oMSThemeInfo.countdownView) && ValueObject.util_equals(this.title, oMSThemeInfo.title) && ValueObject.util_equals(this.subTitle, oMSThemeInfo.subTitle) && ValueObject.util_equals(this.settingTxt, oMSThemeInfo.settingTxt) && ValueObject.util_equals(this.color, oMSThemeInfo.color) && ValueObject.util_equals(this.bgColors, oMSThemeInfo.bgColors) && ValueObject.util_equals(this.h5URL, oMSThemeInfo.h5URL) && this.suggestSwitch == oMSThemeInfo.suggestSwitch && this.questionnaireFinished == oMSThemeInfo.questionnaireFinished && this.h5popLimit == oMSThemeInfo.h5popLimit && ValueObject.util_equals(this.bubble, oMSThemeInfo.bubble) && ValueObject.util_equals(this.suggestStrategy, oMSThemeInfo.suggestStrategy) && ValueObject.util_equals(this.bubbleOpen, oMSThemeInfo.bubbleOpen) && ValueObject.util_equals(this.icon, oMSThemeInfo.icon);
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
        String str = this.f39644id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        OMSThemeCountdownInfo oMSThemeCountdownInfo = this.countdownView;
        int iHashCode2 = (iHashCode + (oMSThemeCountdownInfo != null ? oMSThemeCountdownInfo.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.subTitle;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.settingTxt;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.color;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        List<String> list = this.bgColors;
        int iHashCode7 = (iHashCode6 + (list != null ? list.hashCode() : 0)) * 41;
        String str6 = this.h5URL;
        int iHashCode8 = (((((((iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 41) + (this.suggestSwitch ? 1231 : 1237)) * 41) + (this.questionnaireFinished ? 1231 : 1237)) * 41) + this.h5popLimit) * 41;
        OMSThemeBubbleInfo oMSThemeBubbleInfo = this.bubble;
        int iHashCode9 = (iHashCode8 + (oMSThemeBubbleInfo != null ? oMSThemeBubbleInfo.hashCode() : 0)) * 41;
        OMSThemeSuggestStrageryInfo oMSThemeSuggestStrageryInfo = this.suggestStrategy;
        int iHashCode10 = (iHashCode9 + (oMSThemeSuggestStrageryInfo != null ? oMSThemeSuggestStrageryInfo.hashCode() : 0)) * 41;
        OMSThemeBubbleOpenInfo oMSThemeBubbleOpenInfo = this.bubbleOpen;
        int iHashCode11 = (iHashCode10 + (oMSThemeBubbleOpenInfo != null ? oMSThemeBubbleOpenInfo.hashCode() : 0)) * 41;
        String str7 = this.icon;
        int iHashCode12 = iHashCode11 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39644id == null) {
            this.f39644id = "";
        }
        if (this.countdownView == null) {
            this.countdownView = OMSThemeCountdownInfo.new_();
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.settingTxt == null) {
            this.settingTxt = "";
        }
        if (this.color == null) {
            this.color = "";
        }
        if (this.bgColors == null) {
            this.bgColors = new ArrayList();
        }
        if (this.h5URL == null) {
            this.h5URL = "";
        }
        if (this.bubble == null) {
            this.bubble = OMSThemeBubbleInfo.new_();
        }
        if (this.suggestStrategy == null) {
            this.suggestStrategy = OMSThemeSuggestStrageryInfo.new_();
        }
        if (this.bubbleOpen == null) {
            this.bubbleOpen = OMSThemeBubbleOpenInfo.new_();
        }
        if (this.icon == null) {
            this.icon = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
