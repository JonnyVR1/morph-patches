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
public class TreasurePrizeAd extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "treasureprizead";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String prizeName;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String prizeType;

    @NonNull
    @ProtobufIndex(index = 4)
    public String textTemplate;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userName;
    public static ProtobufAdapter<TreasurePrizeAd> PROTOBUF_ADAPTER = new MessageNanoAdapter<TreasurePrizeAd>() { // from class: com.p1.mobile.putong.core.data.TreasurePrizeAd.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TreasurePrizeAd treasurePrizeAd) {
            String str = treasurePrizeAd.userName;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = treasurePrizeAd.prizeName;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = treasurePrizeAd.prizeType;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = treasurePrizeAd.textTemplate;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) treasurePrizeAd).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TreasurePrizeAd m16016parse(nb5 nb5Var) throws IOException {
            TreasurePrizeAd treasurePrizeAd = new TreasurePrizeAd();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (treasurePrizeAd.userName == null) {
                        treasurePrizeAd.userName = "";
                    }
                    if (treasurePrizeAd.prizeName == null) {
                        treasurePrizeAd.prizeName = "";
                    }
                    if (treasurePrizeAd.prizeType == null) {
                        treasurePrizeAd.prizeType = "";
                    }
                    if (treasurePrizeAd.textTemplate != null) {
                        break;
                    }
                    treasurePrizeAd.textTemplate = "";
                    break;
                }
                if (iU == 10) {
                    treasurePrizeAd.userName = nb5Var.s();
                } else if (iU == 18) {
                    treasurePrizeAd.prizeName = nb5Var.s();
                } else if (iU == 26) {
                    treasurePrizeAd.prizeType = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (treasurePrizeAd.userName == null) {
                            treasurePrizeAd.userName = "";
                        }
                        if (treasurePrizeAd.prizeName == null) {
                            treasurePrizeAd.prizeName = "";
                        }
                        if (treasurePrizeAd.prizeType == null) {
                            treasurePrizeAd.prizeType = "";
                        }
                        if (treasurePrizeAd.textTemplate != null) {
                            break;
                        }
                        treasurePrizeAd.textTemplate = "";
                        return treasurePrizeAd;
                    }
                    treasurePrizeAd.textTemplate = nb5Var.s();
                }
            }
            return treasurePrizeAd;
        }

        public void serialize(TreasurePrizeAd treasurePrizeAd, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = treasurePrizeAd.userName;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = treasurePrizeAd.prizeName;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = treasurePrizeAd.prizeType;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = treasurePrizeAd.textTemplate;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<TreasurePrizeAd> JSON_ADAPTER = new ObjectJsonAdapter<TreasurePrizeAd>() { // from class: com.p1.mobile.putong.core.data.TreasurePrizeAd.2
        public Class getDataClass() {
            return TreasurePrizeAd.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TreasurePrizeAd m16017newInstance() {
            return new TreasurePrizeAd();
        }

        public boolean parseField(TreasurePrizeAd treasurePrizeAd, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "textTemplate":
                    treasurePrizeAd.textTemplate = jsonParser.getValueAsString();
                    return true;
                case "prizeName":
                    treasurePrizeAd.prizeName = jsonParser.getValueAsString();
                    return true;
                case "prizeType":
                    treasurePrizeAd.prizeType = jsonParser.getValueAsString();
                    return true;
                case "userName":
                    treasurePrizeAd.userName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TreasurePrizeAd treasurePrizeAd, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "textTemplate":
                case "prizeName":
                case "prizeType":
                case "userName":
                    return true;
                default:
                    return super.parseFieldCheck(treasurePrizeAd, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(TreasurePrizeAd treasurePrizeAd, JsonGenerator jsonGenerator) throws IOException {
            String str = treasurePrizeAd.userName;
            if (str != null) {
                jsonGenerator.writeStringField("userName", str);
            }
            String str2 = treasurePrizeAd.prizeName;
            if (str2 != null) {
                jsonGenerator.writeStringField("prizeName", str2);
            }
            String str3 = treasurePrizeAd.prizeType;
            if (str3 != null) {
                jsonGenerator.writeStringField("prizeType", str3);
            }
            String str4 = treasurePrizeAd.textTemplate;
            if (str4 != null) {
                jsonGenerator.writeStringField("textTemplate", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TreasurePrizeAd) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TreasurePrizeAd) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TreasurePrizeAd new_() {
        TreasurePrizeAd treasurePrizeAd = new TreasurePrizeAd();
        treasurePrizeAd.nullCheck();
        return treasurePrizeAd;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TreasurePrizeAd m16015clone() {
        TreasurePrizeAd treasurePrizeAd = new TreasurePrizeAd();
        treasurePrizeAd.userName = this.userName;
        treasurePrizeAd.prizeName = this.prizeName;
        treasurePrizeAd.prizeType = this.prizeType;
        treasurePrizeAd.textTemplate = this.textTemplate;
        return treasurePrizeAd;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TreasurePrizeAd)) {
            return false;
        }
        TreasurePrizeAd treasurePrizeAd = (TreasurePrizeAd) obj;
        return ValueObject.util_equals(this.userName, treasurePrizeAd.userName) && ValueObject.util_equals(this.prizeName, treasurePrizeAd.prizeName) && ValueObject.util_equals(this.prizeType, treasurePrizeAd.prizeType) && ValueObject.util_equals(this.textTemplate, treasurePrizeAd.textTemplate);
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
        String str = this.userName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.prizeName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.prizeType;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.textTemplate;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.prizeName == null) {
            this.prizeName = "";
        }
        if (this.prizeType == null) {
            this.prizeType = "";
        }
        if (this.textTemplate == null) {
            this.textTemplate = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
