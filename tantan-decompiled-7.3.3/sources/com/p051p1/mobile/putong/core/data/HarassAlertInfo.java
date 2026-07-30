package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
public class HarassAlertInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "harassalertinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public String status;

    @NonNull
    @ProtobufIndex(index = 3)
    public String tips;

    @NonNull
    @ProtobufIndex(index = 1)
    public String triggeredMsgID;
    public static ProtobufAdapter<HarassAlertInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<HarassAlertInfo>() { // from class: com.p1.mobile.putong.core.data.HarassAlertInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HarassAlertInfo harassAlertInfo) {
            String str = harassAlertInfo.triggeredMsgID;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = harassAlertInfo.status;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = harassAlertInfo.tips;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            harassAlertInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HarassAlertInfo parse(nc5 nc5Var) throws IOException {
            HarassAlertInfo harassAlertInfo = new HarassAlertInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    harassAlertInfo.triggeredMsgID = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    harassAlertInfo.status = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
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
                    harassAlertInfo.tips = nc5Var.m162495s();
                }
            }
            return harassAlertInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HarassAlertInfo harassAlertInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = harassAlertInfo.triggeredMsgID;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = harassAlertInfo.status;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = harassAlertInfo.tips;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<HarassAlertInfo> JSON_ADAPTER = new ObjectJsonAdapter<HarassAlertInfo>() { // from class: com.p1.mobile.putong.core.data.HarassAlertInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HarassAlertInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HarassAlertInfo newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HarassAlertInfo harassAlertInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = harassAlertInfo.triggeredMsgID;
            if (str != null) {
                jsonGenerator.writeStringField("triggeredMsgID", str);
            }
            String str2 = harassAlertInfo.status;
            if (str2 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str2);
            }
            String str3 = harassAlertInfo.tips;
            if (str3 != null) {
                jsonGenerator.writeStringField("tips", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HarassAlertInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HarassAlertInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HarassAlertInfo new_() {
        HarassAlertInfo harassAlertInfo = new HarassAlertInfo();
        harassAlertInfo.nullCheck();
        return harassAlertInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HarassAlertInfo mo225055clone() {
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
        String str = this.triggeredMsgID;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.status;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.tips;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
