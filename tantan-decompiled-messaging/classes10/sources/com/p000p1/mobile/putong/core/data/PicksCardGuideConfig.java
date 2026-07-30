package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class PicksCardGuideConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pickscardguideconfig";

    @ProtobufIndex(index = 6)
    public int insertPicksCardCreateDays;

    @ProtobufIndex(index = 1)
    public int newUserCreateDays;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int newUserSwipeCardNum;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int oldUserSwipeCardNum;

    @NonNull
    @ProtobufIndex(index = 4)
    public String targetGender;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String targetIdentity;
    public static ProtobufAdapter<PicksCardGuideConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<PicksCardGuideConfig>() { // from class: com.p1.mobile.putong.core.data.PicksCardGuideConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PicksCardGuideConfig picksCardGuideConfig) {
            int iH = CodedOutputByteBufferNano.h(1, picksCardGuideConfig.newUserCreateDays) + CodedOutputByteBufferNano.h(2, picksCardGuideConfig.oldUserSwipeCardNum) + CodedOutputByteBufferNano.h(3, picksCardGuideConfig.newUserSwipeCardNum);
            String str = picksCardGuideConfig.targetGender;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(4, str);
            }
            String str2 = picksCardGuideConfig.targetIdentity;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(5, str2);
            }
            int iH2 = iH + CodedOutputByteBufferNano.h(6, picksCardGuideConfig.insertPicksCardCreateDays);
            ((MessageNano) picksCardGuideConfig).cachedSize = iH2;
            return iH2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PicksCardGuideConfig m14779parse(nb5 nb5Var) throws IOException {
            PicksCardGuideConfig picksCardGuideConfig = new PicksCardGuideConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (picksCardGuideConfig.targetGender == null) {
                        picksCardGuideConfig.targetGender = "";
                    }
                    if (picksCardGuideConfig.targetIdentity != null) {
                        break;
                    }
                    picksCardGuideConfig.targetIdentity = "";
                    break;
                }
                if (iU == 8) {
                    picksCardGuideConfig.newUserCreateDays = nb5Var.j();
                } else if (iU == 16) {
                    picksCardGuideConfig.oldUserSwipeCardNum = nb5Var.j();
                } else if (iU == 24) {
                    picksCardGuideConfig.newUserSwipeCardNum = nb5Var.j();
                } else if (iU == 34) {
                    picksCardGuideConfig.targetGender = nb5Var.s();
                } else if (iU == 42) {
                    picksCardGuideConfig.targetIdentity = nb5Var.s();
                } else {
                    if (iU != 48) {
                        if (picksCardGuideConfig.targetGender == null) {
                            picksCardGuideConfig.targetGender = "";
                        }
                        if (picksCardGuideConfig.targetIdentity != null) {
                            break;
                        }
                        picksCardGuideConfig.targetIdentity = "";
                        return picksCardGuideConfig;
                    }
                    picksCardGuideConfig.insertPicksCardCreateDays = nb5Var.j();
                }
            }
            return picksCardGuideConfig;
        }

        public void serialize(PicksCardGuideConfig picksCardGuideConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, picksCardGuideConfig.newUserCreateDays);
            codedOutputByteBufferNano.G(2, picksCardGuideConfig.oldUserSwipeCardNum);
            codedOutputByteBufferNano.G(3, picksCardGuideConfig.newUserSwipeCardNum);
            String str = picksCardGuideConfig.targetGender;
            if (str != null) {
                codedOutputByteBufferNano.R(4, str);
            }
            String str2 = picksCardGuideConfig.targetIdentity;
            if (str2 != null) {
                codedOutputByteBufferNano.R(5, str2);
            }
            codedOutputByteBufferNano.G(6, picksCardGuideConfig.insertPicksCardCreateDays);
        }
    };
    public static JsonAdapter<PicksCardGuideConfig> JSON_ADAPTER = new ObjectJsonAdapter<PicksCardGuideConfig>() { // from class: com.p1.mobile.putong.core.data.PicksCardGuideConfig.2
        public Class getDataClass() {
            return PicksCardGuideConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PicksCardGuideConfig m14780newInstance() {
            return new PicksCardGuideConfig();
        }

        public boolean parseField(PicksCardGuideConfig picksCardGuideConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "targetIdentity":
                    picksCardGuideConfig.targetIdentity = jsonParser.getValueAsString();
                    return true;
                case "newUserCreateDays":
                    picksCardGuideConfig.newUserCreateDays = jsonParser.getValueAsInt();
                    return true;
                case "targetGender":
                    picksCardGuideConfig.targetGender = jsonParser.getValueAsString();
                    return true;
                case "insertPicksCardCreateDays":
                    picksCardGuideConfig.insertPicksCardCreateDays = jsonParser.getValueAsInt();
                    return true;
                case "newUserSwipeCardNum":
                    picksCardGuideConfig.newUserSwipeCardNum = jsonParser.getValueAsInt();
                    return true;
                case "oldUserSwipeCardNum":
                    picksCardGuideConfig.oldUserSwipeCardNum = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PicksCardGuideConfig picksCardGuideConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "targetIdentity":
                case "newUserCreateDays":
                case "targetGender":
                case "insertPicksCardCreateDays":
                case "newUserSwipeCardNum":
                case "oldUserSwipeCardNum":
                    return true;
                default:
                    return super.parseFieldCheck(picksCardGuideConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(PicksCardGuideConfig picksCardGuideConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("newUserCreateDays", picksCardGuideConfig.newUserCreateDays);
            jsonGenerator.writeNumberField("oldUserSwipeCardNum", picksCardGuideConfig.oldUserSwipeCardNum);
            jsonGenerator.writeNumberField("newUserSwipeCardNum", picksCardGuideConfig.newUserSwipeCardNum);
            String str = picksCardGuideConfig.targetGender;
            if (str != null) {
                jsonGenerator.writeStringField("targetGender", str);
            }
            String str2 = picksCardGuideConfig.targetIdentity;
            if (str2 != null) {
                jsonGenerator.writeStringField("targetIdentity", str2);
            }
            jsonGenerator.writeNumberField("insertPicksCardCreateDays", picksCardGuideConfig.insertPicksCardCreateDays);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PicksCardGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PicksCardGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PicksCardGuideConfig new_() {
        PicksCardGuideConfig picksCardGuideConfig = new PicksCardGuideConfig();
        picksCardGuideConfig.nullCheck();
        return picksCardGuideConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PicksCardGuideConfig m14778clone() {
        PicksCardGuideConfig picksCardGuideConfig = new PicksCardGuideConfig();
        picksCardGuideConfig.newUserCreateDays = this.newUserCreateDays;
        picksCardGuideConfig.oldUserSwipeCardNum = this.oldUserSwipeCardNum;
        picksCardGuideConfig.newUserSwipeCardNum = this.newUserSwipeCardNum;
        picksCardGuideConfig.targetGender = this.targetGender;
        picksCardGuideConfig.targetIdentity = this.targetIdentity;
        picksCardGuideConfig.insertPicksCardCreateDays = this.insertPicksCardCreateDays;
        return picksCardGuideConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PicksCardGuideConfig)) {
            return false;
        }
        PicksCardGuideConfig picksCardGuideConfig = (PicksCardGuideConfig) obj;
        return this.newUserCreateDays == picksCardGuideConfig.newUserCreateDays && this.oldUserSwipeCardNum == picksCardGuideConfig.oldUserSwipeCardNum && this.newUserSwipeCardNum == picksCardGuideConfig.newUserSwipeCardNum && ValueObject.util_equals(this.targetGender, picksCardGuideConfig.targetGender) && ValueObject.util_equals(this.targetIdentity, picksCardGuideConfig.targetIdentity) && this.insertPicksCardCreateDays == picksCardGuideConfig.insertPicksCardCreateDays;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((((i * 41) + this.newUserCreateDays) * 41) + this.oldUserSwipeCardNum) * 41) + this.newUserSwipeCardNum) * 41;
        String str = this.targetGender;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.targetIdentity;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.insertPicksCardCreateDays;
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.targetGender == null) {
            this.targetGender = "";
        }
        if (this.targetIdentity == null) {
            this.targetIdentity = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
