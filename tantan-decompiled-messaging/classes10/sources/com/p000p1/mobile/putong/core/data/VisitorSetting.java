package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
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
public class VisitorSetting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "visitorsetting";

    @ProtobufIndex(index = 4)
    public boolean closePickSuggestButton;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String userId;

    @ProtobufIndex(index = 1)
    public boolean visitorPermission;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public double visitorPermissionUpdatedTime;
    public static ProtobufAdapter<VisitorSetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<VisitorSetting>() { // from class: com.p1.mobile.putong.core.data.VisitorSetting.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VisitorSetting visitorSetting) {
            int iB = CodedOutputByteBufferNano.b(1, visitorSetting.visitorPermission);
            String str = visitorSetting.userId;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(2, str);
            }
            int iD = iB + CodedOutputByteBufferNano.d(3, visitorSetting.visitorPermissionUpdatedTime) + CodedOutputByteBufferNano.b(4, visitorSetting.closePickSuggestButton);
            ((MessageNano) visitorSetting).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VisitorSetting m16252parse(nb5 nb5Var) throws IOException {
            VisitorSetting visitorSetting = new VisitorSetting();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (visitorSetting.userId != null) {
                        break;
                    }
                    visitorSetting.userId = "";
                    break;
                }
                if (iU == 8) {
                    visitorSetting.visitorPermission = nb5Var.g();
                } else if (iU == 18) {
                    visitorSetting.userId = nb5Var.s();
                } else if (iU == 25) {
                    visitorSetting.visitorPermissionUpdatedTime = nb5Var.h();
                } else {
                    if (iU != 32) {
                        if (visitorSetting.userId != null) {
                            break;
                        }
                        visitorSetting.userId = "";
                        return visitorSetting;
                    }
                    visitorSetting.closePickSuggestButton = nb5Var.g();
                }
            }
            return visitorSetting;
        }

        public void serialize(VisitorSetting visitorSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, visitorSetting.visitorPermission);
            String str = visitorSetting.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            codedOutputByteBufferNano.C(3, visitorSetting.visitorPermissionUpdatedTime);
            codedOutputByteBufferNano.A(4, visitorSetting.closePickSuggestButton);
        }
    };
    public static JsonAdapter<VisitorSetting> JSON_ADAPTER = new ObjectJsonAdapter<VisitorSetting>() { // from class: com.p1.mobile.putong.core.data.VisitorSetting.2
        public Class getDataClass() {
            return VisitorSetting.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public VisitorSetting m16253newInstance() {
            return new VisitorSetting();
        }

        public boolean parseField(VisitorSetting visitorSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "visitorPermission":
                    visitorSetting.visitorPermission = jsonParser.getValueAsBoolean();
                    return true;
                case "userId":
                    visitorSetting.userId = jsonParser.getValueAsString();
                    return true;
                case "visitorPermissionUpdatedTime":
                    visitorSetting.visitorPermissionUpdatedTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "closePickSuggestButton":
                    visitorSetting.closePickSuggestButton = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VisitorSetting visitorSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "visitorPermission":
                case "userId":
                case "visitorPermissionUpdatedTime":
                case "closePickSuggestButton":
                    return true;
                default:
                    return super.parseFieldCheck(visitorSetting, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(VisitorSetting visitorSetting, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("visitorPermission", visitorSetting.visitorPermission);
            String str = visitorSetting.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeFieldName("visitorPermissionUpdatedTime");
            Converter.API_TIME.serialize(Double.valueOf(visitorSetting.visitorPermissionUpdatedTime), jsonGenerator, true);
            jsonGenerator.writeBooleanField("closePickSuggestButton", visitorSetting.closePickSuggestButton);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VisitorSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VisitorSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VisitorSetting new_() {
        VisitorSetting visitorSetting = new VisitorSetting();
        visitorSetting.nullCheck();
        return visitorSetting;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VisitorSetting m16251clone() {
        VisitorSetting visitorSetting = new VisitorSetting();
        visitorSetting.visitorPermission = this.visitorPermission;
        visitorSetting.userId = this.userId;
        visitorSetting.visitorPermissionUpdatedTime = this.visitorPermissionUpdatedTime;
        visitorSetting.closePickSuggestButton = this.closePickSuggestButton;
        return visitorSetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VisitorSetting)) {
            return false;
        }
        VisitorSetting visitorSetting = (VisitorSetting) obj;
        return this.visitorPermission == visitorSetting.visitorPermission && ValueObject.util_equals(this.userId, visitorSetting.userId) && this.visitorPermissionUpdatedTime == visitorSetting.visitorPermissionUpdatedTime && this.closePickSuggestButton == visitorSetting.closePickSuggestButton;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.visitorPermission ? 1231 : 1237)) * 41;
        String str = this.userId;
        int iHashCode = str != null ? str.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.visitorPermissionUpdatedTime);
        int i3 = ((((i2 + iHashCode) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + (this.closePickSuggestButton ? 1231 : 1237);
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
