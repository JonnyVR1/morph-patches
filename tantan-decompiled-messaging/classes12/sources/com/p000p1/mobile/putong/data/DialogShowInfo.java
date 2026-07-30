package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(DialogShowInfo dialogShowInfo) {
            String str = dialogShowInfo.resourceId;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.j(2, dialogShowInfo.lastShowTime) + CodedOutputByteBufferNano.h(3, dialogShowInfo.totalShownCount) + CodedOutputByteBufferNano.h(4, dialogShowInfo.countByDay) + CodedOutputByteBufferNano.b(5, dialogShowInfo.noRemind) + CodedOutputByteBufferNano.h(6, dialogShowInfo.countByWeek);
            String str2 = dialogShowInfo.version;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(7, str2);
            }
            ((MessageNano) dialogShowInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public DialogShowInfo m17980parse(nb5 nb5Var) throws IOException {
            DialogShowInfo dialogShowInfo = new DialogShowInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (dialogShowInfo.resourceId == null) {
                        dialogShowInfo.resourceId = "";
                    }
                    if (dialogShowInfo.version != null) {
                        break;
                    }
                    dialogShowInfo.version = "";
                    break;
                }
                if (iU == 10) {
                    dialogShowInfo.resourceId = nb5Var.s();
                } else if (iU == 16) {
                    dialogShowInfo.lastShowTime = nb5Var.k();
                } else if (iU == 24) {
                    dialogShowInfo.totalShownCount = nb5Var.j();
                } else if (iU == 32) {
                    dialogShowInfo.countByDay = nb5Var.j();
                } else if (iU == 40) {
                    dialogShowInfo.noRemind = nb5Var.g();
                } else if (iU == 48) {
                    dialogShowInfo.countByWeek = nb5Var.j();
                } else {
                    if (iU != 58) {
                        if (dialogShowInfo.resourceId == null) {
                            dialogShowInfo.resourceId = "";
                        }
                        if (dialogShowInfo.version != null) {
                            break;
                        }
                        dialogShowInfo.version = "";
                        return dialogShowInfo;
                    }
                    dialogShowInfo.version = nb5Var.s();
                }
            }
            return dialogShowInfo;
        }

        public void serialize(DialogShowInfo dialogShowInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = dialogShowInfo.resourceId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.I(2, dialogShowInfo.lastShowTime);
            codedOutputByteBufferNano.G(3, dialogShowInfo.totalShownCount);
            codedOutputByteBufferNano.G(4, dialogShowInfo.countByDay);
            codedOutputByteBufferNano.A(5, dialogShowInfo.noRemind);
            codedOutputByteBufferNano.G(6, dialogShowInfo.countByWeek);
            String str2 = dialogShowInfo.version;
            if (str2 != null) {
                codedOutputByteBufferNano.R(7, str2);
            }
        }
    };
    public static JsonAdapter<DialogShowInfo> JSON_ADAPTER = new ObjectJsonAdapter<DialogShowInfo>() { // from class: com.p1.mobile.putong.data.DialogShowInfo.2
        public Class getDataClass() {
            return DialogShowInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public DialogShowInfo mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                jsonGenerator.writeStringField("version", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DialogShowInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DialogShowInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DialogShowInfo new_() {
        DialogShowInfo dialogShowInfo = new DialogShowInfo();
        dialogShowInfo.nullCheck();
        return dialogShowInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public DialogShowInfo m17979clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.resourceId == null) {
            this.resourceId = "";
        }
        if (this.version == null) {
            this.version = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
