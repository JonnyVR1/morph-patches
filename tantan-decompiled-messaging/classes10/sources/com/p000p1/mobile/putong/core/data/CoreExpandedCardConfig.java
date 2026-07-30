package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.CoreExpandedCardConfig;
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
public class CoreExpandedCardConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "coreexpandedcardconfig";

    @ProtobufIndex(index = 14)
    public int checkPicIndex;

    @ProtobufIndex(index = 13)
    public int checkPicNum;

    @NonNull
    @ProtobufIndex(index = 12)
    public List<String> default_order;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int dislikeCountToTriggerGuide;

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean idNumShow;

    @ProtobufIndex(index = 17)
    public int lifePicIndex;

    @ProtobufIndex(index = 7)
    public int likeCountToTriggerGuide;

    @ProtobufIndex(index = 6)
    public int maxDislikeGuideShowCount;

    @ProtobufIndex(index = 8)
    public int maxLikeGuideShowCount;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
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

    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public boolean sendProfileLikeEnable;

    @ProtobufIndex(index = 9)
    public boolean showNaviOnlyWhenReachTop;
    public static ProtobufAdapter<CoreExpandedCardConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreExpandedCardConfig>() { // from class: com.p1.mobile.putong.core.data.CoreExpandedCardConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CoreExpandedCardConfig coreExpandedCardConfig) {
            int iB = CodedOutputByteBufferNano.b(1, coreExpandedCardConfig.enable) + CodedOutputByteBufferNano.b(2, coreExpandedCardConfig.idNumShow) + CodedOutputByteBufferNano.h(3, coreExpandedCardConfig.myTabFetchCoolTime);
            List<String> list = coreExpandedCardConfig.sections_order;
            if (list != null) {
                iB += CodedOutputByteBufferNano.l(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iH = iB + CodedOutputByteBufferNano.h(5, coreExpandedCardConfig.dislikeCountToTriggerGuide) + CodedOutputByteBufferNano.h(6, coreExpandedCardConfig.maxDislikeGuideShowCount) + CodedOutputByteBufferNano.h(7, coreExpandedCardConfig.likeCountToTriggerGuide) + CodedOutputByteBufferNano.h(8, coreExpandedCardConfig.maxLikeGuideShowCount) + CodedOutputByteBufferNano.b(9, coreExpandedCardConfig.showNaviOnlyWhenReachTop) + CodedOutputByteBufferNano.b(10, coreExpandedCardConfig.sendProfileLikeEnable) + CodedOutputByteBufferNano.b(11, coreExpandedCardConfig.receiveProfileLikeEnable);
            List<String> list2 = coreExpandedCardConfig.default_order;
            if (list2 != null) {
                iH += CodedOutputByteBufferNano.l(12, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iH2 = iH + CodedOutputByteBufferNano.h(13, coreExpandedCardConfig.checkPicNum) + CodedOutputByteBufferNano.h(14, coreExpandedCardConfig.checkPicIndex) + CodedOutputByteBufferNano.b(15, coreExpandedCardConfig.pic_label_op_enable) + CodedOutputByteBufferNano.h(16, coreExpandedCardConfig.nextInfoHeight) + CodedOutputByteBufferNano.h(17, coreExpandedCardConfig.lifePicIndex);
            ((MessageNano) coreExpandedCardConfig).cachedSize = iH2;
            return iH2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CoreExpandedCardConfig m12457parse(nb5 nb5Var) throws IOException {
            CoreExpandedCardConfig coreExpandedCardConfig = new CoreExpandedCardConfig();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (coreExpandedCardConfig.sections_order == null) {
                            coreExpandedCardConfig.sections_order = new ArrayList();
                        }
                        if (coreExpandedCardConfig.default_order == null) {
                            coreExpandedCardConfig.default_order = new ArrayList();
                        }
                        break;
                    case 8:
                        coreExpandedCardConfig.enable = nb5Var.g();
                        continue;
                    case 16:
                        coreExpandedCardConfig.idNumShow = nb5Var.g();
                        continue;
                    case 24:
                        coreExpandedCardConfig.myTabFetchCoolTime = nb5Var.j();
                        continue;
                    case 34:
                        coreExpandedCardConfig.sections_order = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 40:
                        coreExpandedCardConfig.dislikeCountToTriggerGuide = nb5Var.j();
                        continue;
                    case 48:
                        coreExpandedCardConfig.maxDislikeGuideShowCount = nb5Var.j();
                        continue;
                    case 56:
                        coreExpandedCardConfig.likeCountToTriggerGuide = nb5Var.j();
                        continue;
                    case 64:
                        coreExpandedCardConfig.maxLikeGuideShowCount = nb5Var.j();
                        continue;
                    case 72:
                        coreExpandedCardConfig.showNaviOnlyWhenReachTop = nb5Var.g();
                        continue;
                    case 80:
                        coreExpandedCardConfig.sendProfileLikeEnable = nb5Var.g();
                        continue;
                    case 88:
                        coreExpandedCardConfig.receiveProfileLikeEnable = nb5Var.g();
                        continue;
                    case 98:
                        coreExpandedCardConfig.default_order = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 104:
                        coreExpandedCardConfig.checkPicNum = nb5Var.j();
                        continue;
                    case 112:
                        coreExpandedCardConfig.checkPicIndex = nb5Var.j();
                        continue;
                    case 120:
                        coreExpandedCardConfig.pic_label_op_enable = nb5Var.g();
                        continue;
                    case 128:
                        coreExpandedCardConfig.nextInfoHeight = nb5Var.j();
                        continue;
                    case 136:
                        coreExpandedCardConfig.lifePicIndex = nb5Var.j();
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

        public void serialize(CoreExpandedCardConfig coreExpandedCardConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, coreExpandedCardConfig.enable);
            codedOutputByteBufferNano.A(2, coreExpandedCardConfig.idNumShow);
            codedOutputByteBufferNano.G(3, coreExpandedCardConfig.myTabFetchCoolTime);
            List<String> list = coreExpandedCardConfig.sections_order;
            if (list != null) {
                codedOutputByteBufferNano.K(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(5, coreExpandedCardConfig.dislikeCountToTriggerGuide);
            codedOutputByteBufferNano.G(6, coreExpandedCardConfig.maxDislikeGuideShowCount);
            codedOutputByteBufferNano.G(7, coreExpandedCardConfig.likeCountToTriggerGuide);
            codedOutputByteBufferNano.G(8, coreExpandedCardConfig.maxLikeGuideShowCount);
            codedOutputByteBufferNano.A(9, coreExpandedCardConfig.showNaviOnlyWhenReachTop);
            codedOutputByteBufferNano.A(10, coreExpandedCardConfig.sendProfileLikeEnable);
            codedOutputByteBufferNano.A(11, coreExpandedCardConfig.receiveProfileLikeEnable);
            List<String> list2 = coreExpandedCardConfig.default_order;
            if (list2 != null) {
                codedOutputByteBufferNano.K(12, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(13, coreExpandedCardConfig.checkPicNum);
            codedOutputByteBufferNano.G(14, coreExpandedCardConfig.checkPicIndex);
            codedOutputByteBufferNano.A(15, coreExpandedCardConfig.pic_label_op_enable);
            codedOutputByteBufferNano.G(16, coreExpandedCardConfig.nextInfoHeight);
            codedOutputByteBufferNano.G(17, coreExpandedCardConfig.lifePicIndex);
        }
    };
    public static JsonAdapter<CoreExpandedCardConfig> JSON_ADAPTER = new ObjectJsonAdapter<CoreExpandedCardConfig>() { // from class: com.p1.mobile.putong.core.data.CoreExpandedCardConfig.2
        public Class getDataClass() {
            return CoreExpandedCardConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CoreExpandedCardConfig m12458newInstance() {
            return new CoreExpandedCardConfig();
        }

        public boolean parseField(CoreExpandedCardConfig coreExpandedCardConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "sections_order":
                    coreExpandedCardConfig.sections_order = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "myTabFetchCoolTime":
                    coreExpandedCardConfig.myTabFetchCoolTime = jsonParser.getValueAsInt();
                    return true;
                case "enable":
                    coreExpandedCardConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "sendProfileLikeEnable":
                    coreExpandedCardConfig.sendProfileLikeEnable = jsonParser.getValueAsBoolean();
                    return true;
                case "pic_label_op_enable":
                    coreExpandedCardConfig.pic_label_op_enable = jsonParser.getValueAsBoolean();
                    return true;
                case "showNaviOnlyWhenReachTop":
                    coreExpandedCardConfig.showNaviOnlyWhenReachTop = jsonParser.getValueAsBoolean();
                    return true;
                case "lifePicIndex":
                    coreExpandedCardConfig.lifePicIndex = jsonParser.getValueAsInt();
                    return true;
                case "maxLikeGuideShowCount":
                    coreExpandedCardConfig.maxLikeGuideShowCount = jsonParser.getValueAsInt();
                    return true;
                case "checkPicNum":
                    coreExpandedCardConfig.checkPicNum = jsonParser.getValueAsInt();
                    return true;
                case "default_order":
                    coreExpandedCardConfig.default_order = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "idNumShow":
                    coreExpandedCardConfig.idNumShow = jsonParser.getValueAsBoolean();
                    return true;
                case "maxDislikeGuideShowCount":
                    coreExpandedCardConfig.maxDislikeGuideShowCount = jsonParser.getValueAsInt();
                    return true;
                case "likeCountToTriggerGuide":
                    coreExpandedCardConfig.likeCountToTriggerGuide = jsonParser.getValueAsInt();
                    return true;
                case "receiveProfileLikeEnable":
                    coreExpandedCardConfig.receiveProfileLikeEnable = jsonParser.getValueAsBoolean();
                    return true;
                case "checkPicIndex":
                    coreExpandedCardConfig.checkPicIndex = jsonParser.getValueAsInt();
                    return true;
                case "nextInfoHeight":
                    coreExpandedCardConfig.nextInfoHeight = jsonParser.getValueAsInt();
                    return true;
                case "dislikeCountToTriggerGuide":
                    coreExpandedCardConfig.dislikeCountToTriggerGuide = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CoreExpandedCardConfig coreExpandedCardConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "sections_order":
                case "myTabFetchCoolTime":
                case "enable":
                case "sendProfileLikeEnable":
                case "pic_label_op_enable":
                case "showNaviOnlyWhenReachTop":
                case "lifePicIndex":
                case "maxLikeGuideShowCount":
                case "checkPicNum":
                case "default_order":
                case "idNumShow":
                case "maxDislikeGuideShowCount":
                case "likeCountToTriggerGuide":
                case "receiveProfileLikeEnable":
                case "checkPicIndex":
                case "nextInfoHeight":
                case "dislikeCountToTriggerGuide":
                    return true;
                default:
                    return super.parseFieldCheck(coreExpandedCardConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreExpandedCardConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreExpandedCardConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m278a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m279b(String str) {
        return str;
    }

    public static CoreExpandedCardConfig new_() {
        CoreExpandedCardConfig coreExpandedCardConfig = new CoreExpandedCardConfig();
        coreExpandedCardConfig.nullCheck();
        return coreExpandedCardConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CoreExpandedCardConfig m12456clone() {
        CoreExpandedCardConfig coreExpandedCardConfig = new CoreExpandedCardConfig();
        coreExpandedCardConfig.enable = this.enable;
        coreExpandedCardConfig.idNumShow = this.idNumShow;
        coreExpandedCardConfig.myTabFetchCoolTime = this.myTabFetchCoolTime;
        List<String> list = this.sections_order;
        if (list != null) {
            coreExpandedCardConfig.sections_order = ValueObject.util_map(list, new w9j() { // from class: l.yo8
                public final Object call(Object obj) {
                    return CoreExpandedCardConfig.m278a((String) obj);
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
            coreExpandedCardConfig.default_order = ValueObject.util_map(list2, new w9j() { // from class: l.zo8
                public final Object call(Object obj) {
                    return CoreExpandedCardConfig.m279b((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + (this.idNumShow ? 1231 : 1237)) * 41) + this.myTabFetchCoolTime) * 41;
        List<String> list = this.sections_order;
        int iHashCode = (((((((((((((((i2 + (list != null ? list.hashCode() : 0)) * 41) + this.dislikeCountToTriggerGuide) * 41) + this.maxDislikeGuideShowCount) * 41) + this.likeCountToTriggerGuide) * 41) + this.maxLikeGuideShowCount) * 41) + (this.showNaviOnlyWhenReachTop ? 1231 : 1237)) * 41) + (this.sendProfileLikeEnable ? 1231 : 1237)) * 41) + (this.receiveProfileLikeEnable ? 1231 : 1237)) * 41;
        List<String> list2 = this.default_order;
        int iHashCode2 = ((((((((((iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41) + this.checkPicNum) * 41) + this.checkPicIndex) * 41) + (this.pic_label_op_enable ? 1231 : 1237)) * 41) + this.nextInfoHeight) * 41) + this.lifePicIndex;
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.sections_order == null) {
            this.sections_order = new ArrayList();
        }
        if (this.default_order == null) {
            this.default_order = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
