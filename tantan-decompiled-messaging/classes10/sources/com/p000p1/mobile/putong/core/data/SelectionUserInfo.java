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
public class SelectionUserInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "selectionuserinfo";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String auditStatus;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public double updateTime;
    public static ProtobufAdapter<SelectionUserInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<SelectionUserInfo>() { // from class: com.p1.mobile.putong.core.data.SelectionUserInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SelectionUserInfo selectionUserInfo) {
            String str = selectionUserInfo.title;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.d(2, selectionUserInfo.updateTime);
            String str2 = selectionUserInfo.auditStatus;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            ((MessageNano) selectionUserInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SelectionUserInfo m15577parse(nb5 nb5Var) throws IOException {
            SelectionUserInfo selectionUserInfo = new SelectionUserInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (selectionUserInfo.title == null) {
                        selectionUserInfo.title = "";
                    }
                    if (selectionUserInfo.auditStatus != null) {
                        break;
                    }
                    selectionUserInfo.auditStatus = "";
                    break;
                }
                if (iU == 10) {
                    selectionUserInfo.title = nb5Var.s();
                } else if (iU == 17) {
                    selectionUserInfo.updateTime = nb5Var.h();
                } else {
                    if (iU != 26) {
                        if (selectionUserInfo.title == null) {
                            selectionUserInfo.title = "";
                        }
                        if (selectionUserInfo.auditStatus != null) {
                            break;
                        }
                        selectionUserInfo.auditStatus = "";
                        return selectionUserInfo;
                    }
                    selectionUserInfo.auditStatus = nb5Var.s();
                }
            }
            return selectionUserInfo;
        }

        public void serialize(SelectionUserInfo selectionUserInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = selectionUserInfo.title;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.C(2, selectionUserInfo.updateTime);
            String str2 = selectionUserInfo.auditStatus;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
        }
    };
    public static JsonAdapter<SelectionUserInfo> JSON_ADAPTER = new ObjectJsonAdapter<SelectionUserInfo>() { // from class: com.p1.mobile.putong.core.data.SelectionUserInfo.2
        public Class getDataClass() {
            return SelectionUserInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SelectionUserInfo m15578newInstance() {
            return new SelectionUserInfo();
        }

        public boolean parseField(SelectionUserInfo selectionUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "updateTime":
                    selectionUserInfo.updateTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "title":
                    selectionUserInfo.title = jsonParser.getValueAsString();
                    return true;
                case "auditStatus":
                    selectionUserInfo.auditStatus = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SelectionUserInfo selectionUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "updateTime":
                case "title":
                case "auditStatus":
                    return true;
                default:
                    return super.parseFieldCheck(selectionUserInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(SelectionUserInfo selectionUserInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = selectionUserInfo.title;
            if (str != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str);
            }
            jsonGenerator.writeFieldName("updateTime");
            Converter.API_TIME.serialize(Double.valueOf(selectionUserInfo.updateTime), jsonGenerator, true);
            String str2 = selectionUserInfo.auditStatus;
            if (str2 != null) {
                jsonGenerator.writeStringField("auditStatus", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SelectionUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SelectionUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SelectionUserInfo new_() {
        SelectionUserInfo selectionUserInfo = new SelectionUserInfo();
        selectionUserInfo.nullCheck();
        return selectionUserInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SelectionUserInfo m15576clone() {
        SelectionUserInfo selectionUserInfo = new SelectionUserInfo();
        selectionUserInfo.title = this.title;
        selectionUserInfo.updateTime = this.updateTime;
        selectionUserInfo.auditStatus = this.auditStatus;
        return selectionUserInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SelectionUserInfo)) {
            return false;
        }
        SelectionUserInfo selectionUserInfo = (SelectionUserInfo) obj;
        return ValueObject.util_equals(this.title, selectionUserInfo.title) && this.updateTime == selectionUserInfo.updateTime && ValueObject.util_equals(this.auditStatus, selectionUserInfo.auditStatus);
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
        String str = this.title;
        int iHashCode = str != null ? str.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.updateTime);
        int i3 = (((i2 + iHashCode) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str2 = this.auditStatus;
        int iHashCode2 = i3 + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.auditStatus == null) {
            this.auditStatus = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
