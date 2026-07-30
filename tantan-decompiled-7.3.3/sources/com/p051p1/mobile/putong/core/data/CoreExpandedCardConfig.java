package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.CoreExpandedCardConfig;
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
import org.spongycastle.math.p135ec.Tnaf;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class CoreExpandedCardConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "coreexpandedcardconfig";

    @ProtobufIndex(index = 14)
    public int checkPicIndex;

    @ProtobufIndex(index = 13)
    public int checkPicNum;

    @NonNull
    @ProtobufIndex(index = 12)
    public List<String> default_order;

    @ProtobufIndex(index = 5)
    public int dislikeCountToTriggerGuide;

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = 2)
    public boolean idNumShow;

    @ProtobufIndex(index = 17)
    public int lifePicIndex;

    @ProtobufIndex(index = 7)
    public int likeCountToTriggerGuide;

    @ProtobufIndex(index = 6)
    public int maxDislikeGuideShowCount;

    @ProtobufIndex(index = 8)
    public int maxLikeGuideShowCount;

    @ProtobufIndex(index = 3)
    public int myTabFetchCoolTime;

    @ProtobufIndex(index = 16)
    public int nextInfoHeight;

    @ProtobufIndex(index = 15)
    public boolean pic_label_op_enable;

    @ProtobufIndex(index = 11)
    public boolean receiveProfileLikeEnable;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> sections_order;

    @ProtobufIndex(index = 10)
    public boolean sendProfileLikeEnable;

    @ProtobufIndex(index = 9)
    public boolean showNaviOnlyWhenReachTop;
    public static ProtobufAdapter<CoreExpandedCardConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreExpandedCardConfig>() { // from class: com.p1.mobile.putong.core.data.CoreExpandedCardConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CoreExpandedCardConfig coreExpandedCardConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, coreExpandedCardConfig.enable) + CodedOutputByteBufferNano.m17275b(2, coreExpandedCardConfig.idNumShow) + CodedOutputByteBufferNano.m17281h(3, coreExpandedCardConfig.myTabFetchCoolTime);
            List<String> list = coreExpandedCardConfig.sections_order;
            if (list != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17281h = iM17275b + CodedOutputByteBufferNano.m17281h(5, coreExpandedCardConfig.dislikeCountToTriggerGuide) + CodedOutputByteBufferNano.m17281h(6, coreExpandedCardConfig.maxDislikeGuideShowCount) + CodedOutputByteBufferNano.m17281h(7, coreExpandedCardConfig.likeCountToTriggerGuide) + CodedOutputByteBufferNano.m17281h(8, coreExpandedCardConfig.maxLikeGuideShowCount) + CodedOutputByteBufferNano.m17275b(9, coreExpandedCardConfig.showNaviOnlyWhenReachTop) + CodedOutputByteBufferNano.m17275b(10, coreExpandedCardConfig.sendProfileLikeEnable) + CodedOutputByteBufferNano.m17275b(11, coreExpandedCardConfig.receiveProfileLikeEnable);
            List<String> list2 = coreExpandedCardConfig.default_order;
            if (list2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(12, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17281h2 = iM17281h + CodedOutputByteBufferNano.m17281h(13, coreExpandedCardConfig.checkPicNum) + CodedOutputByteBufferNano.m17281h(14, coreExpandedCardConfig.checkPicIndex) + CodedOutputByteBufferNano.m17275b(15, coreExpandedCardConfig.pic_label_op_enable) + CodedOutputByteBufferNano.m17281h(16, coreExpandedCardConfig.nextInfoHeight) + CodedOutputByteBufferNano.m17281h(17, coreExpandedCardConfig.lifePicIndex);
            coreExpandedCardConfig.cachedSize = iM17281h2;
            return iM17281h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CoreExpandedCardConfig parse(nc5 nc5Var) throws IOException {
            CoreExpandedCardConfig coreExpandedCardConfig = new CoreExpandedCardConfig();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (coreExpandedCardConfig.sections_order == null) {
                            coreExpandedCardConfig.sections_order = new ArrayList();
                        }
                        if (coreExpandedCardConfig.default_order == null) {
                            coreExpandedCardConfig.default_order = new ArrayList();
                        }
                        break;
                    case 8:
                        coreExpandedCardConfig.enable = nc5Var.m162483g();
                        continue;
                    case 16:
                        coreExpandedCardConfig.idNumShow = nc5Var.m162483g();
                        continue;
                    case 24:
                        coreExpandedCardConfig.myTabFetchCoolTime = nc5Var.m162486j();
                        continue;
                    case 34:
                        coreExpandedCardConfig.sections_order = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 40:
                        coreExpandedCardConfig.dislikeCountToTriggerGuide = nc5Var.m162486j();
                        continue;
                    case 48:
                        coreExpandedCardConfig.maxDislikeGuideShowCount = nc5Var.m162486j();
                        continue;
                    case 56:
                        coreExpandedCardConfig.likeCountToTriggerGuide = nc5Var.m162486j();
                        continue;
                    case 64:
                        coreExpandedCardConfig.maxLikeGuideShowCount = nc5Var.m162486j();
                        continue;
                    case 72:
                        coreExpandedCardConfig.showNaviOnlyWhenReachTop = nc5Var.m162483g();
                        continue;
                    case 80:
                        coreExpandedCardConfig.sendProfileLikeEnable = nc5Var.m162483g();
                        continue;
                    case 88:
                        coreExpandedCardConfig.receiveProfileLikeEnable = nc5Var.m162483g();
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        coreExpandedCardConfig.default_order = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 104:
                        coreExpandedCardConfig.checkPicNum = nc5Var.m162486j();
                        continue;
                    case 112:
                        coreExpandedCardConfig.checkPicIndex = nc5Var.m162486j();
                        continue;
                    case 120:
                        coreExpandedCardConfig.pic_label_op_enable = nc5Var.m162483g();
                        continue;
                    case 128:
                        coreExpandedCardConfig.nextInfoHeight = nc5Var.m162486j();
                        continue;
                    case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                        coreExpandedCardConfig.lifePicIndex = nc5Var.m162486j();
                        continue;
                    default:
                        if (coreExpandedCardConfig.sections_order == null) {
                            coreExpandedCardConfig.sections_order = new ArrayList();
                        }
                        if (coreExpandedCardConfig.default_order == null) {
                            coreExpandedCardConfig.default_order = new ArrayList();
                            return coreExpandedCardConfig;
                        }
                        break;
                }
            }
            return coreExpandedCardConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CoreExpandedCardConfig coreExpandedCardConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, coreExpandedCardConfig.enable);
            codedOutputByteBufferNano.m17299A(2, coreExpandedCardConfig.idNumShow);
            codedOutputByteBufferNano.m17305G(3, coreExpandedCardConfig.myTabFetchCoolTime);
            List<String> list = coreExpandedCardConfig.sections_order;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(5, coreExpandedCardConfig.dislikeCountToTriggerGuide);
            codedOutputByteBufferNano.m17305G(6, coreExpandedCardConfig.maxDislikeGuideShowCount);
            codedOutputByteBufferNano.m17305G(7, coreExpandedCardConfig.likeCountToTriggerGuide);
            codedOutputByteBufferNano.m17305G(8, coreExpandedCardConfig.maxLikeGuideShowCount);
            codedOutputByteBufferNano.m17299A(9, coreExpandedCardConfig.showNaviOnlyWhenReachTop);
            codedOutputByteBufferNano.m17299A(10, coreExpandedCardConfig.sendProfileLikeEnable);
            codedOutputByteBufferNano.m17299A(11, coreExpandedCardConfig.receiveProfileLikeEnable);
            List<String> list2 = coreExpandedCardConfig.default_order;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(12, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(13, coreExpandedCardConfig.checkPicNum);
            codedOutputByteBufferNano.m17305G(14, coreExpandedCardConfig.checkPicIndex);
            codedOutputByteBufferNano.m17299A(15, coreExpandedCardConfig.pic_label_op_enable);
            codedOutputByteBufferNano.m17305G(16, coreExpandedCardConfig.nextInfoHeight);
            codedOutputByteBufferNano.m17305G(17, coreExpandedCardConfig.lifePicIndex);
        }
    };
    public static JsonAdapter<CoreExpandedCardConfig> JSON_ADAPTER = new ObjectJsonAdapter<CoreExpandedCardConfig>() { // from class: com.p1.mobile.putong.core.data.CoreExpandedCardConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CoreExpandedCardConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CoreExpandedCardConfig newInstance() {
            return new CoreExpandedCardConfig();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(CoreExpandedCardConfig coreExpandedCardConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1945211395:
                    if (str.equals("sections_order")) {
                        b = 0;
                    }
                    break;
                case -1454154041:
                    if (str.equals("myTabFetchCoolTime")) {
                        b = 1;
                    }
                    break;
                case -1298848381:
                    if (str.equals("enable")) {
                        b = 2;
                    }
                    break;
                case -1123808293:
                    if (str.equals("sendProfileLikeEnable")) {
                        b = 3;
                    }
                    break;
                case -570625695:
                    if (str.equals("pic_label_op_enable")) {
                        b = 4;
                    }
                    break;
                case -129302421:
                    if (str.equals("showNaviOnlyWhenReachTop")) {
                        b = 5;
                    }
                    break;
                case -84523900:
                    if (str.equals("lifePicIndex")) {
                        b = 6;
                    }
                    break;
                case 316183665:
                    if (str.equals("maxLikeGuideShowCount")) {
                        b = 7;
                    }
                    break;
                case 672106692:
                    if (str.equals("checkPicNum")) {
                        b = 8;
                    }
                    break;
                case 1312705488:
                    if (str.equals("default_order")) {
                        b = 9;
                    }
                    break;
                case 1341877768:
                    if (str.equals("idNumShow")) {
                        b = 10;
                    }
                    break;
                case 1366602231:
                    if (str.equals("maxDislikeGuideShowCount")) {
                        b = 11;
                    }
                    break;
                case 1469647895:
                    if (str.equals("likeCountToTriggerGuide")) {
                        b = 12;
                    }
                    break;
                case 1628252640:
                    if (str.equals("receiveProfileLikeEnable")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1644605072:
                    if (str.equals("checkPicIndex")) {
                        b = 14;
                    }
                    break;
                case 1818671816:
                    if (str.equals("nextInfoHeight")) {
                        b = 15;
                    }
                    break;
                case 2097170377:
                    if (str.equals("dislikeCountToTriggerGuide")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    coreExpandedCardConfig.sections_order = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    coreExpandedCardConfig.myTabFetchCoolTime = jsonParser.getValueAsInt();
                    return true;
                case 2:
                    coreExpandedCardConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case 3:
                    coreExpandedCardConfig.sendProfileLikeEnable = jsonParser.getValueAsBoolean();
                    return true;
                case 4:
                    coreExpandedCardConfig.pic_label_op_enable = jsonParser.getValueAsBoolean();
                    return true;
                case 5:
                    coreExpandedCardConfig.showNaviOnlyWhenReachTop = jsonParser.getValueAsBoolean();
                    return true;
                case 6:
                    coreExpandedCardConfig.lifePicIndex = jsonParser.getValueAsInt();
                    return true;
                case 7:
                    coreExpandedCardConfig.maxLikeGuideShowCount = jsonParser.getValueAsInt();
                    return true;
                case 8:
                    coreExpandedCardConfig.checkPicNum = jsonParser.getValueAsInt();
                    return true;
                case 9:
                    coreExpandedCardConfig.default_order = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    coreExpandedCardConfig.idNumShow = jsonParser.getValueAsBoolean();
                    return true;
                case 11:
                    coreExpandedCardConfig.maxDislikeGuideShowCount = jsonParser.getValueAsInt();
                    return true;
                case 12:
                    coreExpandedCardConfig.likeCountToTriggerGuide = jsonParser.getValueAsInt();
                    return true;
                case 13:
                    coreExpandedCardConfig.receiveProfileLikeEnable = jsonParser.getValueAsBoolean();
                    return true;
                case 14:
                    coreExpandedCardConfig.checkPicIndex = jsonParser.getValueAsInt();
                    return true;
                case 15:
                    coreExpandedCardConfig.nextInfoHeight = jsonParser.getValueAsInt();
                    return true;
                case 16:
                    coreExpandedCardConfig.dislikeCountToTriggerGuide = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(CoreExpandedCardConfig coreExpandedCardConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1945211395:
                    if (str.equals("sections_order")) {
                        b = 0;
                    }
                    break;
                case -1454154041:
                    if (str.equals("myTabFetchCoolTime")) {
                        b = 1;
                    }
                    break;
                case -1298848381:
                    if (str.equals("enable")) {
                        b = 2;
                    }
                    break;
                case -1123808293:
                    if (str.equals("sendProfileLikeEnable")) {
                        b = 3;
                    }
                    break;
                case -570625695:
                    if (str.equals("pic_label_op_enable")) {
                        b = 4;
                    }
                    break;
                case -129302421:
                    if (str.equals("showNaviOnlyWhenReachTop")) {
                        b = 5;
                    }
                    break;
                case -84523900:
                    if (str.equals("lifePicIndex")) {
                        b = 6;
                    }
                    break;
                case 316183665:
                    if (str.equals("maxLikeGuideShowCount")) {
                        b = 7;
                    }
                    break;
                case 672106692:
                    if (str.equals("checkPicNum")) {
                        b = 8;
                    }
                    break;
                case 1312705488:
                    if (str.equals("default_order")) {
                        b = 9;
                    }
                    break;
                case 1341877768:
                    if (str.equals("idNumShow")) {
                        b = 10;
                    }
                    break;
                case 1366602231:
                    if (str.equals("maxDislikeGuideShowCount")) {
                        b = 11;
                    }
                    break;
                case 1469647895:
                    if (str.equals("likeCountToTriggerGuide")) {
                        b = 12;
                    }
                    break;
                case 1628252640:
                    if (str.equals("receiveProfileLikeEnable")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1644605072:
                    if (str.equals("checkPicIndex")) {
                        b = 14;
                    }
                    break;
                case 1818671816:
                    if (str.equals("nextInfoHeight")) {
                        b = 15;
                    }
                    break;
                case 2097170377:
                    if (str.equals("dislikeCountToTriggerGuide")) {
                        b = Tnaf.POW_2_WIDTH;
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
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    return true;
                default:
                    return super.parseFieldCheck(coreExpandedCardConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CoreExpandedCardConfig coreExpandedCardConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", coreExpandedCardConfig.enable);
            jsonGenerator.writeBooleanField("idNumShow", coreExpandedCardConfig.idNumShow);
            jsonGenerator.writeNumberField("myTabFetchCoolTime", coreExpandedCardConfig.myTabFetchCoolTime);
            if (coreExpandedCardConfig.sections_order != null) {
                jsonGenerator.writeFieldName("sections_order");
                JsonAdapter.serializeArray(coreExpandedCardConfig.sections_order, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("dislikeCountToTriggerGuide", coreExpandedCardConfig.dislikeCountToTriggerGuide);
            jsonGenerator.writeNumberField("maxDislikeGuideShowCount", coreExpandedCardConfig.maxDislikeGuideShowCount);
            jsonGenerator.writeNumberField("likeCountToTriggerGuide", coreExpandedCardConfig.likeCountToTriggerGuide);
            jsonGenerator.writeNumberField("maxLikeGuideShowCount", coreExpandedCardConfig.maxLikeGuideShowCount);
            jsonGenerator.writeBooleanField("showNaviOnlyWhenReachTop", coreExpandedCardConfig.showNaviOnlyWhenReachTop);
            jsonGenerator.writeBooleanField("sendProfileLikeEnable", coreExpandedCardConfig.sendProfileLikeEnable);
            jsonGenerator.writeBooleanField("receiveProfileLikeEnable", coreExpandedCardConfig.receiveProfileLikeEnable);
            if (coreExpandedCardConfig.default_order != null) {
                jsonGenerator.writeFieldName("default_order");
                JsonAdapter.serializeArray(coreExpandedCardConfig.default_order, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("checkPicNum", coreExpandedCardConfig.checkPicNum);
            jsonGenerator.writeNumberField("checkPicIndex", coreExpandedCardConfig.checkPicIndex);
            jsonGenerator.writeBooleanField("pic_label_op_enable", coreExpandedCardConfig.pic_label_op_enable);
            jsonGenerator.writeNumberField("nextInfoHeight", coreExpandedCardConfig.nextInfoHeight);
            jsonGenerator.writeNumberField("lifePicIndex", coreExpandedCardConfig.lifePicIndex);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreExpandedCardConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreExpandedCardConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36479a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m36480b(String str) {
        return str;
    }

    public static CoreExpandedCardConfig new_() {
        CoreExpandedCardConfig coreExpandedCardConfig = new CoreExpandedCardConfig();
        coreExpandedCardConfig.nullCheck();
        return coreExpandedCardConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CoreExpandedCardConfig mo225055clone() {
        CoreExpandedCardConfig coreExpandedCardConfig = new CoreExpandedCardConfig();
        coreExpandedCardConfig.enable = this.enable;
        coreExpandedCardConfig.idNumShow = this.idNumShow;
        coreExpandedCardConfig.myTabFetchCoolTime = this.myTabFetchCoolTime;
        List<String> list = this.sections_order;
        if (list != null) {
            coreExpandedCardConfig.sections_order = ValueObject.util_map(list, new qcj() { // from class: l.dq8
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreExpandedCardConfig.m36479a((String) obj);
                }
            });
        }
        coreExpandedCardConfig.dislikeCountToTriggerGuide = this.dislikeCountToTriggerGuide;
        coreExpandedCardConfig.maxDislikeGuideShowCount = this.maxDislikeGuideShowCount;
        coreExpandedCardConfig.likeCountToTriggerGuide = this.likeCountToTriggerGuide;
        coreExpandedCardConfig.maxLikeGuideShowCount = this.maxLikeGuideShowCount;
        coreExpandedCardConfig.showNaviOnlyWhenReachTop = this.showNaviOnlyWhenReachTop;
        coreExpandedCardConfig.sendProfileLikeEnable = this.sendProfileLikeEnable;
        coreExpandedCardConfig.receiveProfileLikeEnable = this.receiveProfileLikeEnable;
        List<String> list2 = this.default_order;
        if (list2 != null) {
            coreExpandedCardConfig.default_order = ValueObject.util_map(list2, new qcj() { // from class: l.eq8
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreExpandedCardConfig.m36480b((String) obj);
                }
            });
        }
        coreExpandedCardConfig.checkPicNum = this.checkPicNum;
        coreExpandedCardConfig.checkPicIndex = this.checkPicIndex;
        coreExpandedCardConfig.pic_label_op_enable = this.pic_label_op_enable;
        coreExpandedCardConfig.nextInfoHeight = this.nextInfoHeight;
        coreExpandedCardConfig.lifePicIndex = this.lifePicIndex;
        return coreExpandedCardConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CoreExpandedCardConfig)) {
            return false;
        }
        CoreExpandedCardConfig coreExpandedCardConfig = (CoreExpandedCardConfig) obj;
        return this.enable == coreExpandedCardConfig.enable && this.idNumShow == coreExpandedCardConfig.idNumShow && this.myTabFetchCoolTime == coreExpandedCardConfig.myTabFetchCoolTime && ValueObject.util_equals(this.sections_order, coreExpandedCardConfig.sections_order) && this.dislikeCountToTriggerGuide == coreExpandedCardConfig.dislikeCountToTriggerGuide && this.maxDislikeGuideShowCount == coreExpandedCardConfig.maxDislikeGuideShowCount && this.likeCountToTriggerGuide == coreExpandedCardConfig.likeCountToTriggerGuide && this.maxLikeGuideShowCount == coreExpandedCardConfig.maxLikeGuideShowCount && this.showNaviOnlyWhenReachTop == coreExpandedCardConfig.showNaviOnlyWhenReachTop && this.sendProfileLikeEnable == coreExpandedCardConfig.sendProfileLikeEnable && this.receiveProfileLikeEnable == coreExpandedCardConfig.receiveProfileLikeEnable && ValueObject.util_equals(this.default_order, coreExpandedCardConfig.default_order) && this.checkPicNum == coreExpandedCardConfig.checkPicNum && this.checkPicIndex == coreExpandedCardConfig.checkPicIndex && this.pic_label_op_enable == coreExpandedCardConfig.pic_label_op_enable && this.nextInfoHeight == coreExpandedCardConfig.nextInfoHeight && this.lifePicIndex == coreExpandedCardConfig.lifePicIndex;
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
        int i2 = ((((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + (this.idNumShow ? 1231 : 1237)) * 41) + this.myTabFetchCoolTime) * 41;
        List<String> list = this.sections_order;
        int iHashCode = (((((((((((((((i2 + (list != null ? list.hashCode() : 0)) * 41) + this.dislikeCountToTriggerGuide) * 41) + this.maxDislikeGuideShowCount) * 41) + this.likeCountToTriggerGuide) * 41) + this.maxLikeGuideShowCount) * 41) + (this.showNaviOnlyWhenReachTop ? 1231 : 1237)) * 41) + (this.sendProfileLikeEnable ? 1231 : 1237)) * 41) + (this.receiveProfileLikeEnable ? 1231 : 1237)) * 41;
        List<String> list2 = this.default_order;
        int iHashCode2 = ((((((((((iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41) + this.checkPicNum) * 41) + this.checkPicIndex) * 41) + (this.pic_label_op_enable ? 1231 : 1237)) * 41) + this.nextInfoHeight) * 41) + this.lifePicIndex;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.sections_order == null) {
            this.sections_order = new ArrayList();
        }
        if (this.default_order == null) {
            this.default_order = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
