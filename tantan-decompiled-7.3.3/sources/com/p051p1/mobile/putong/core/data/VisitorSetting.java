package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Converter;
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
public class VisitorSetting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "visitorsetting";

    @ProtobufIndex(index = 4)
    public boolean closePickSuggestButton;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;

    @ProtobufIndex(index = 1)
    public boolean visitorPermission;

    @ProtobufIndex(index = 3)
    public double visitorPermissionUpdatedTime;
    public static ProtobufAdapter<VisitorSetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<VisitorSetting>() { // from class: com.p1.mobile.putong.core.data.VisitorSetting.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VisitorSetting visitorSetting) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, visitorSetting.visitorPermission);
            String str = visitorSetting.userId;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(2, str);
            }
            int iM17277d = iM17275b + CodedOutputByteBufferNano.m17277d(3, visitorSetting.visitorPermissionUpdatedTime) + CodedOutputByteBufferNano.m17275b(4, visitorSetting.closePickSuggestButton);
            visitorSetting.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VisitorSetting parse(nc5 nc5Var) throws IOException {
            VisitorSetting visitorSetting = new VisitorSetting();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (visitorSetting.userId != null) {
                        break;
                    }
                    visitorSetting.userId = "";
                    break;
                }
                if (iM162497u == 8) {
                    visitorSetting.visitorPermission = nc5Var.m162483g();
                } else if (iM162497u == 18) {
                    visitorSetting.userId = nc5Var.m162495s();
                } else if (iM162497u == 25) {
                    visitorSetting.visitorPermissionUpdatedTime = nc5Var.m162484h();
                } else {
                    if (iM162497u != 32) {
                        if (visitorSetting.userId != null) {
                            break;
                        }
                        visitorSetting.userId = "";
                        return visitorSetting;
                    }
                    visitorSetting.closePickSuggestButton = nc5Var.m162483g();
                }
            }
            return visitorSetting;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VisitorSetting visitorSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, visitorSetting.visitorPermission);
            String str = visitorSetting.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            codedOutputByteBufferNano.m17301C(3, visitorSetting.visitorPermissionUpdatedTime);
            codedOutputByteBufferNano.m17299A(4, visitorSetting.closePickSuggestButton);
        }
    };
    public static JsonAdapter<VisitorSetting> JSON_ADAPTER = new ObjectJsonAdapter<VisitorSetting>() { // from class: com.p1.mobile.putong.core.data.VisitorSetting.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VisitorSetting.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VisitorSetting newInstance() {
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
                    visitorSetting.visitorPermissionUpdatedTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VisitorSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VisitorSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VisitorSetting new_() {
        VisitorSetting visitorSetting = new VisitorSetting();
        visitorSetting.nullCheck();
        return visitorSetting;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VisitorSetting mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.visitorPermission ? 1231 : 1237)) * 41;
        String str = this.userId;
        int iHashCode = str != null ? str.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.visitorPermissionUpdatedTime);
        int i3 = ((((i2 + iHashCode) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + (this.closePickSuggestButton ? 1231 : 1237);
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
