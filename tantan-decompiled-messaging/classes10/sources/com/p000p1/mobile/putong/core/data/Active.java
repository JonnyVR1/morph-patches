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
public class Active extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "active";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String cardBackgroundUrl;

    @NonNull
    @ProtobufIndex(index = 7)
    public String cardBtnSubTitle;

    @NonNull
    @ProtobufIndex(index = 6)
    public String cardBtnTitle;

    @NonNull
    @ProtobufIndex(index = 4)
    public String cardDesc;

    @NonNull
    @ProtobufIndex(index = 8)
    public String cardLandPageUrl;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String cardLogo;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String cardTitle;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f3id;

    @NonNull
    @ProtobufIndex(index = 9)
    public String skuId;
    public static ProtobufAdapter<Active> PROTOBUF_ADAPTER = new MessageNanoAdapter<Active>() { // from class: com.p1.mobile.putong.core.data.Active.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Active active) {
            String str = active.f3id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = active.cardBackgroundUrl;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = active.cardTitle;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = active.cardDesc;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = active.cardLogo;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = active.cardBtnTitle;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            String str7 = active.cardBtnSubTitle;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(7, str7);
            }
            String str8 = active.cardLandPageUrl;
            if (str8 != null) {
                iO += CodedOutputByteBufferNano.o(8, str8);
            }
            String str9 = active.skuId;
            if (str9 != null) {
                iO += CodedOutputByteBufferNano.o(9, str9);
            }
            ((MessageNano) active).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Active m11529parse(nb5 nb5Var) throws IOException {
            Active active = new Active();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (active.f3id == null) {
                        active.f3id = "";
                    }
                    if (active.cardBackgroundUrl == null) {
                        active.cardBackgroundUrl = "";
                    }
                    if (active.cardLandPageUrl == null) {
                        active.cardLandPageUrl = "";
                    }
                    if (active.cardTitle == null) {
                        active.cardTitle = "";
                    }
                    if (active.cardDesc == null) {
                        active.cardDesc = "";
                    }
                    if (active.cardLogo == null) {
                        active.cardLogo = "";
                    }
                    if (active.cardBtnTitle == null) {
                        active.cardBtnTitle = "";
                    }
                    if (active.cardBtnSubTitle == null) {
                        active.cardBtnSubTitle = "";
                    }
                    if (active.skuId != null) {
                        break;
                    }
                    active.skuId = "";
                    break;
                }
                if (iU == 10) {
                    active.f3id = nb5Var.s();
                } else if (iU == 18) {
                    active.cardBackgroundUrl = nb5Var.s();
                } else if (iU == 26) {
                    active.cardTitle = nb5Var.s();
                } else if (iU == 34) {
                    active.cardDesc = nb5Var.s();
                } else if (iU == 42) {
                    active.cardLogo = nb5Var.s();
                } else if (iU == 50) {
                    active.cardBtnTitle = nb5Var.s();
                } else if (iU == 58) {
                    active.cardBtnSubTitle = nb5Var.s();
                } else if (iU == 66) {
                    active.cardLandPageUrl = nb5Var.s();
                } else {
                    if (iU != 74) {
                        if (active.f3id == null) {
                            active.f3id = "";
                        }
                        if (active.cardBackgroundUrl == null) {
                            active.cardBackgroundUrl = "";
                        }
                        if (active.cardLandPageUrl == null) {
                            active.cardLandPageUrl = "";
                        }
                        if (active.cardTitle == null) {
                            active.cardTitle = "";
                        }
                        if (active.cardDesc == null) {
                            active.cardDesc = "";
                        }
                        if (active.cardLogo == null) {
                            active.cardLogo = "";
                        }
                        if (active.cardBtnTitle == null) {
                            active.cardBtnTitle = "";
                        }
                        if (active.cardBtnSubTitle == null) {
                            active.cardBtnSubTitle = "";
                        }
                        if (active.skuId != null) {
                            break;
                        }
                        active.skuId = "";
                        return active;
                    }
                    active.skuId = nb5Var.s();
                }
            }
            return active;
        }

        public void serialize(Active active, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = active.f3id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = active.cardBackgroundUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = active.cardTitle;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = active.cardDesc;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = active.cardLogo;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = active.cardBtnTitle;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
            String str7 = active.cardBtnSubTitle;
            if (str7 != null) {
                codedOutputByteBufferNano.R(7, str7);
            }
            String str8 = active.cardLandPageUrl;
            if (str8 != null) {
                codedOutputByteBufferNano.R(8, str8);
            }
            String str9 = active.skuId;
            if (str9 != null) {
                codedOutputByteBufferNano.R(9, str9);
            }
        }
    };
    public static JsonAdapter<Active> JSON_ADAPTER = new ObjectJsonAdapter<Active>() { // from class: com.p1.mobile.putong.core.data.Active.2
        public Class getDataClass() {
            return Active.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Active m11530newInstance() {
            return new Active();
        }

        public boolean parseField(Active active, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "cardBtnTitle":
                    active.cardBtnTitle = jsonParser.getValueAsString();
                    return true;
                case "cardBackgroundUrl":
                    active.cardBackgroundUrl = jsonParser.getValueAsString();
                    return true;
                case "cardLandPageUrl":
                    active.cardLandPageUrl = jsonParser.getValueAsString();
                    return true;
                case "cardBtnSubTitle":
                    active.cardBtnSubTitle = jsonParser.getValueAsString();
                    return true;
                case "cardTitle":
                    active.cardTitle = jsonParser.getValueAsString();
                    return true;
                case "cardDesc":
                    active.cardDesc = jsonParser.getValueAsString();
                    return true;
                case "cardLogo":
                    active.cardLogo = jsonParser.getValueAsString();
                    return true;
                case "id":
                    active.f3id = jsonParser.getValueAsString();
                    return false;
                case "skuId":
                    active.skuId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Active active, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "cardBtnTitle":
                case "cardBackgroundUrl":
                case "cardLandPageUrl":
                case "cardBtnSubTitle":
                case "cardTitle":
                case "cardDesc":
                case "cardLogo":
                    return true;
                case "id":
                    return false;
                case "skuId":
                    return true;
                default:
                    return super.parseFieldCheck(active, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(Active active, JsonGenerator jsonGenerator) throws IOException {
            String str = active.f3id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = active.cardBackgroundUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("cardBackgroundUrl", str2);
            }
            String str3 = active.cardLandPageUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("cardLandPageUrl", str3);
            }
            String str4 = active.cardTitle;
            if (str4 != null) {
                jsonGenerator.writeStringField("cardTitle", str4);
            }
            String str5 = active.cardDesc;
            if (str5 != null) {
                jsonGenerator.writeStringField("cardDesc", str5);
            }
            String str6 = active.cardLogo;
            if (str6 != null) {
                jsonGenerator.writeStringField("cardLogo", str6);
            }
            String str7 = active.cardBtnTitle;
            if (str7 != null) {
                jsonGenerator.writeStringField("cardBtnTitle", str7);
            }
            String str8 = active.cardBtnSubTitle;
            if (str8 != null) {
                jsonGenerator.writeStringField("cardBtnSubTitle", str8);
            }
            String str9 = active.skuId;
            if (str9 != null) {
                jsonGenerator.writeStringField("skuId", str9);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Active) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Active) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Active new_() {
        Active active = new Active();
        active.nullCheck();
        return active;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Active m11528clone() {
        Active active = new Active();
        active.f3id = this.f3id;
        active.cardBackgroundUrl = this.cardBackgroundUrl;
        active.cardLandPageUrl = this.cardLandPageUrl;
        active.cardTitle = this.cardTitle;
        active.cardDesc = this.cardDesc;
        active.cardLogo = this.cardLogo;
        active.cardBtnTitle = this.cardBtnTitle;
        active.cardBtnSubTitle = this.cardBtnSubTitle;
        active.skuId = this.skuId;
        return active;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Active)) {
            return false;
        }
        Active active = (Active) obj;
        return ValueObject.util_equals(this.f3id, active.f3id) && ValueObject.util_equals(this.cardBackgroundUrl, active.cardBackgroundUrl) && ValueObject.util_equals(this.cardLandPageUrl, active.cardLandPageUrl) && ValueObject.util_equals(this.cardTitle, active.cardTitle) && ValueObject.util_equals(this.cardDesc, active.cardDesc) && ValueObject.util_equals(this.cardLogo, active.cardLogo) && ValueObject.util_equals(this.cardBtnTitle, active.cardBtnTitle) && ValueObject.util_equals(this.cardBtnSubTitle, active.cardBtnSubTitle) && ValueObject.util_equals(this.skuId, active.skuId);
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
        String str = this.f3id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.cardBackgroundUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.cardLandPageUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.cardTitle;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.cardDesc;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.cardLogo;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.cardBtnTitle;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.cardBtnSubTitle;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.skuId;
        int iHashCode9 = iHashCode8 + (str9 != null ? str9.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode9;
        return iHashCode9;
    }

    public void nullCheck() {
        if (this.f3id == null) {
            this.f3id = "";
        }
        if (this.cardBackgroundUrl == null) {
            this.cardBackgroundUrl = "";
        }
        if (this.cardLandPageUrl == null) {
            this.cardLandPageUrl = "";
        }
        if (this.cardTitle == null) {
            this.cardTitle = "";
        }
        if (this.cardDesc == null) {
            this.cardDesc = "";
        }
        if (this.cardLogo == null) {
            this.cardLogo = "";
        }
        if (this.cardBtnTitle == null) {
            this.cardBtnTitle = "";
        }
        if (this.cardBtnSubTitle == null) {
            this.cardBtnSubTitle = "";
        }
        if (this.skuId == null) {
            this.skuId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
