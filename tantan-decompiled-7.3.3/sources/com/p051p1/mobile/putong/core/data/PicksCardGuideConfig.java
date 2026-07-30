package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class PicksCardGuideConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pickscardguideconfig";

    @ProtobufIndex(index = 6)
    public int insertPicksCardCreateDays;

    @ProtobufIndex(index = 1)
    public int newUserCreateDays;

    @ProtobufIndex(index = 3)
    public int newUserSwipeCardNum;

    @ProtobufIndex(index = 2)
    public int oldUserSwipeCardNum;

    @NonNull
    @ProtobufIndex(index = 4)
    public String targetGender;

    @NonNull
    @ProtobufIndex(index = 5)
    public String targetIdentity;
    public static ProtobufAdapter<PicksCardGuideConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<PicksCardGuideConfig>() { // from class: com.p1.mobile.putong.core.data.PicksCardGuideConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PicksCardGuideConfig picksCardGuideConfig) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, picksCardGuideConfig.newUserCreateDays) + CodedOutputByteBufferNano.m17281h(2, picksCardGuideConfig.oldUserSwipeCardNum) + CodedOutputByteBufferNano.m17281h(3, picksCardGuideConfig.newUserSwipeCardNum);
            String str = picksCardGuideConfig.targetGender;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(4, str);
            }
            String str2 = picksCardGuideConfig.targetIdentity;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(5, str2);
            }
            int iM17281h2 = iM17281h + CodedOutputByteBufferNano.m17281h(6, picksCardGuideConfig.insertPicksCardCreateDays);
            picksCardGuideConfig.cachedSize = iM17281h2;
            return iM17281h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PicksCardGuideConfig parse(nc5 nc5Var) throws IOException {
            PicksCardGuideConfig picksCardGuideConfig = new PicksCardGuideConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (picksCardGuideConfig.targetGender == null) {
                        picksCardGuideConfig.targetGender = "";
                    }
                    if (picksCardGuideConfig.targetIdentity != null) {
                        break;
                    }
                    picksCardGuideConfig.targetIdentity = "";
                    break;
                }
                if (iM162497u == 8) {
                    picksCardGuideConfig.newUserCreateDays = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    picksCardGuideConfig.oldUserSwipeCardNum = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    picksCardGuideConfig.newUserSwipeCardNum = nc5Var.m162486j();
                } else if (iM162497u == 34) {
                    picksCardGuideConfig.targetGender = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    picksCardGuideConfig.targetIdentity = nc5Var.m162495s();
                } else {
                    if (iM162497u != 48) {
                        if (picksCardGuideConfig.targetGender == null) {
                            picksCardGuideConfig.targetGender = "";
                        }
                        if (picksCardGuideConfig.targetIdentity != null) {
                            break;
                        }
                        picksCardGuideConfig.targetIdentity = "";
                        return picksCardGuideConfig;
                    }
                    picksCardGuideConfig.insertPicksCardCreateDays = nc5Var.m162486j();
                }
            }
            return picksCardGuideConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PicksCardGuideConfig picksCardGuideConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, picksCardGuideConfig.newUserCreateDays);
            codedOutputByteBufferNano.m17305G(2, picksCardGuideConfig.oldUserSwipeCardNum);
            codedOutputByteBufferNano.m17305G(3, picksCardGuideConfig.newUserSwipeCardNum);
            String str = picksCardGuideConfig.targetGender;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(4, str);
            }
            String str2 = picksCardGuideConfig.targetIdentity;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(5, str2);
            }
            codedOutputByteBufferNano.m17305G(6, picksCardGuideConfig.insertPicksCardCreateDays);
        }
    };
    public static JsonAdapter<PicksCardGuideConfig> JSON_ADAPTER = new ObjectJsonAdapter<PicksCardGuideConfig>() { // from class: com.p1.mobile.putong.core.data.PicksCardGuideConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PicksCardGuideConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PicksCardGuideConfig newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PicksCardGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PicksCardGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PicksCardGuideConfig new_() {
        PicksCardGuideConfig picksCardGuideConfig = new PicksCardGuideConfig();
        picksCardGuideConfig.nullCheck();
        return picksCardGuideConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PicksCardGuideConfig mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((((i * 41) + this.newUserCreateDays) * 41) + this.oldUserSwipeCardNum) * 41) + this.newUserSwipeCardNum) * 41;
        String str = this.targetGender;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.targetIdentity;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.insertPicksCardCreateDays;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.targetGender == null) {
            this.targetGender = "";
        }
        if (this.targetIdentity == null) {
            this.targetIdentity = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
