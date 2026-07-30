package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.sina.weibo.sdk.constant.WBConstants;
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

/* JADX INFO: loaded from: classes12.dex */
public class DialogShowInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "dialogshowinfo";

    @ProtobufIndex(index = 4)
    public int countByDay;

    @ProtobufIndex(index = 6)
    public int countByWeek;

    @ProtobufIndex(index = 2)
    public long lastShowTime;

    @ProtobufIndex(index = 5)
    public boolean noRemind;

    @NonNull
    @ProtobufIndex(index = 1)
    public String resourceId;

    @ProtobufIndex(index = 3)
    public int totalShownCount;

    @NonNull
    @ProtobufIndex(index = 7)
    public String version;
    public static ProtobufAdapter<DialogShowInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<DialogShowInfo>() { // from class: com.p1.mobile.putong.data.DialogShowInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DialogShowInfo dialogShowInfo) {
            String str = dialogShowInfo.resourceId;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17283j(2, dialogShowInfo.lastShowTime) + CodedOutputByteBufferNano.m17281h(3, dialogShowInfo.totalShownCount) + CodedOutputByteBufferNano.m17281h(4, dialogShowInfo.countByDay) + CodedOutputByteBufferNano.m17275b(5, dialogShowInfo.noRemind) + CodedOutputByteBufferNano.m17281h(6, dialogShowInfo.countByWeek);
            String str2 = dialogShowInfo.version;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str2);
            }
            dialogShowInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DialogShowInfo parse(nc5 nc5Var) throws IOException {
            DialogShowInfo dialogShowInfo = new DialogShowInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (dialogShowInfo.resourceId == null) {
                        dialogShowInfo.resourceId = "";
                    }
                    if (dialogShowInfo.version != null) {
                        break;
                    }
                    dialogShowInfo.version = "";
                    break;
                }
                if (iM162497u == 10) {
                    dialogShowInfo.resourceId = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    dialogShowInfo.lastShowTime = nc5Var.m162487k();
                } else if (iM162497u == 24) {
                    dialogShowInfo.totalShownCount = nc5Var.m162486j();
                } else if (iM162497u == 32) {
                    dialogShowInfo.countByDay = nc5Var.m162486j();
                } else if (iM162497u == 40) {
                    dialogShowInfo.noRemind = nc5Var.m162483g();
                } else if (iM162497u == 48) {
                    dialogShowInfo.countByWeek = nc5Var.m162486j();
                } else {
                    if (iM162497u != 58) {
                        if (dialogShowInfo.resourceId == null) {
                            dialogShowInfo.resourceId = "";
                        }
                        if (dialogShowInfo.version != null) {
                            break;
                        }
                        dialogShowInfo.version = "";
                        return dialogShowInfo;
                    }
                    dialogShowInfo.version = nc5Var.m162495s();
                }
            }
            return dialogShowInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DialogShowInfo dialogShowInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = dialogShowInfo.resourceId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17307I(2, dialogShowInfo.lastShowTime);
            codedOutputByteBufferNano.m17305G(3, dialogShowInfo.totalShownCount);
            codedOutputByteBufferNano.m17305G(4, dialogShowInfo.countByDay);
            codedOutputByteBufferNano.m17299A(5, dialogShowInfo.noRemind);
            codedOutputByteBufferNano.m17305G(6, dialogShowInfo.countByWeek);
            String str2 = dialogShowInfo.version;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(7, str2);
            }
        }
    };
    public static JsonAdapter<DialogShowInfo> JSON_ADAPTER = new ObjectJsonAdapter<DialogShowInfo>() { // from class: com.p1.mobile.putong.data.DialogShowInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DialogShowInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DialogShowInfo newInstance() {
            return new DialogShowInfo();
        }

        public boolean parseField(DialogShowInfo dialogShowInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "lastShowTime":
                    dialogShowInfo.lastShowTime = jsonParser.getValueAsLong();
                    return true;
                case "resourceId":
                    dialogShowInfo.resourceId = jsonParser.getValueAsString();
                    return true;
                case "countByDay":
                    dialogShowInfo.countByDay = jsonParser.getValueAsInt();
                    return true;
                case "version":
                    dialogShowInfo.version = jsonParser.getValueAsString();
                    return true;
                case "noRemind":
                    dialogShowInfo.noRemind = jsonParser.getValueAsBoolean();
                    return true;
                case "totalShownCount":
                    dialogShowInfo.totalShownCount = jsonParser.getValueAsInt();
                    return true;
                case "countByWeek":
                    dialogShowInfo.countByWeek = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DialogShowInfo dialogShowInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "lastShowTime":
                case "resourceId":
                case "countByDay":
                case "version":
                case "noRemind":
                case "totalShownCount":
                case "countByWeek":
                    return true;
                default:
                    return super.parseFieldCheck(dialogShowInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DialogShowInfo dialogShowInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = dialogShowInfo.resourceId;
            if (str != null) {
                jsonGenerator.writeStringField("resourceId", str);
            }
            jsonGenerator.writeNumberField("lastShowTime", dialogShowInfo.lastShowTime);
            jsonGenerator.writeNumberField("totalShownCount", dialogShowInfo.totalShownCount);
            jsonGenerator.writeNumberField("countByDay", dialogShowInfo.countByDay);
            jsonGenerator.writeBooleanField("noRemind", dialogShowInfo.noRemind);
            jsonGenerator.writeNumberField("countByWeek", dialogShowInfo.countByWeek);
            String str2 = dialogShowInfo.version;
            if (str2 != null) {
                jsonGenerator.writeStringField(WBConstants.AUTH_PARAMS_VERSION, str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DialogShowInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DialogShowInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DialogShowInfo new_() {
        DialogShowInfo dialogShowInfo = new DialogShowInfo();
        dialogShowInfo.nullCheck();
        return dialogShowInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DialogShowInfo mo225055clone() {
        DialogShowInfo dialogShowInfo = new DialogShowInfo();
        dialogShowInfo.resourceId = this.resourceId;
        dialogShowInfo.lastShowTime = this.lastShowTime;
        dialogShowInfo.totalShownCount = this.totalShownCount;
        dialogShowInfo.countByDay = this.countByDay;
        dialogShowInfo.noRemind = this.noRemind;
        dialogShowInfo.countByWeek = this.countByWeek;
        dialogShowInfo.version = this.version;
        return dialogShowInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DialogShowInfo)) {
            return false;
        }
        DialogShowInfo dialogShowInfo = (DialogShowInfo) obj;
        return ValueObject.util_equals(this.resourceId, dialogShowInfo.resourceId) && this.lastShowTime == dialogShowInfo.lastShowTime && this.totalShownCount == dialogShowInfo.totalShownCount && this.countByDay == dialogShowInfo.countByDay && this.noRemind == dialogShowInfo.noRemind && this.countByWeek == dialogShowInfo.countByWeek && ValueObject.util_equals(this.version, dialogShowInfo.version);
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
        String str = this.resourceId;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j = this.lastShowTime;
        int i3 = (((((((((((i2 + iHashCode) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.totalShownCount) * 41) + this.countByDay) * 41) + (this.noRemind ? 1231 : 1237)) * 41) + this.countByWeek) * 41;
        String str2 = this.version;
        int iHashCode2 = i3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.resourceId == null) {
            this.resourceId = "";
        }
        if (this.version == null) {
            this.version = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
