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
public class HarassAlertInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "harassalertinfo";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String status;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String tips;

    @NonNull
    @ProtobufIndex(index = 1)
    public String triggeredMsgID;
    public static ProtobufAdapter<HarassAlertInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<HarassAlertInfo>() { // from class: com.p1.mobile.putong.core.data.HarassAlertInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(HarassAlertInfo harassAlertInfo) {
            String str = harassAlertInfo.triggeredMsgID;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = harassAlertInfo.status;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = harassAlertInfo.tips;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) harassAlertInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public HarassAlertInfo m13223parse(nb5 nb5Var) throws IOException {
            HarassAlertInfo harassAlertInfo = new HarassAlertInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (harassAlertInfo.triggeredMsgID == null) {
                        harassAlertInfo.triggeredMsgID = "";
                    }
                    if (harassAlertInfo.status == null) {
                        harassAlertInfo.status = "";
                    }
                    if (harassAlertInfo.tips != null) {
                        break;
                    }
                    harassAlertInfo.tips = "";
                    break;
                }
                if (iU == 10) {
                    harassAlertInfo.triggeredMsgID = nb5Var.s();
                } else if (iU == 18) {
                    harassAlertInfo.status = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (harassAlertInfo.triggeredMsgID == null) {
                            harassAlertInfo.triggeredMsgID = "";
                        }
                        if (harassAlertInfo.status == null) {
                            harassAlertInfo.status = "";
                        }
                        if (harassAlertInfo.tips != null) {
                            break;
                        }
                        harassAlertInfo.tips = "";
                        return harassAlertInfo;
                    }
                    harassAlertInfo.tips = nb5Var.s();
                }
            }
            return harassAlertInfo;
        }

        public void serialize(HarassAlertInfo harassAlertInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = harassAlertInfo.triggeredMsgID;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = harassAlertInfo.status;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = harassAlertInfo.tips;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<HarassAlertInfo> JSON_ADAPTER = new ObjectJsonAdapter<HarassAlertInfo>() { // from class: com.p1.mobile.putong.core.data.HarassAlertInfo.2
        public Class getDataClass() {
            return HarassAlertInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public HarassAlertInfo m13224newInstance() {
            return new HarassAlertInfo();
        }

        public boolean parseField(HarassAlertInfo harassAlertInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    harassAlertInfo.status = jsonParser.getValueAsString();
                    return true;
                case "tips":
                    harassAlertInfo.tips = jsonParser.getValueAsString();
                    return true;
                case "triggeredMsgID":
                    harassAlertInfo.triggeredMsgID = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(HarassAlertInfo harassAlertInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "status":
                case "tips":
                case "triggeredMsgID":
                    return true;
                default:
                    return super.parseFieldCheck(harassAlertInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(HarassAlertInfo harassAlertInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = harassAlertInfo.triggeredMsgID;
            if (str != null) {
                jsonGenerator.writeStringField("triggeredMsgID", str);
            }
            String str2 = harassAlertInfo.status;
            if (str2 != null) {
                jsonGenerator.writeStringField("status", str2);
            }
            String str3 = harassAlertInfo.tips;
            if (str3 != null) {
                jsonGenerator.writeStringField("tips", str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HarassAlertInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HarassAlertInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HarassAlertInfo new_() {
        HarassAlertInfo harassAlertInfo = new HarassAlertInfo();
        harassAlertInfo.nullCheck();
        return harassAlertInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HarassAlertInfo m13222clone() {
        HarassAlertInfo harassAlertInfo = new HarassAlertInfo();
        harassAlertInfo.triggeredMsgID = this.triggeredMsgID;
        harassAlertInfo.status = this.status;
        harassAlertInfo.tips = this.tips;
        return harassAlertInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HarassAlertInfo)) {
            return false;
        }
        HarassAlertInfo harassAlertInfo = (HarassAlertInfo) obj;
        return ValueObject.util_equals(this.triggeredMsgID, harassAlertInfo.triggeredMsgID) && ValueObject.util_equals(this.status, harassAlertInfo.status) && ValueObject.util_equals(this.tips, harassAlertInfo.tips);
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
        String str = this.triggeredMsgID;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.status;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.tips;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.triggeredMsgID == null) {
            this.triggeredMsgID = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.tips == null) {
            this.tips = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
