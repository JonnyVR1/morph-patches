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
public class SelectionUserInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "selectionuserinfo";

    @NonNull
    @ProtobufIndex(index = 3)
    public String auditStatus;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    @ProtobufIndex(index = 2)
    public double updateTime;
    public static ProtobufAdapter<SelectionUserInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<SelectionUserInfo>() { // from class: com.p1.mobile.putong.core.data.SelectionUserInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SelectionUserInfo selectionUserInfo) {
            String str = selectionUserInfo.title;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17277d(2, selectionUserInfo.updateTime);
            String str2 = selectionUserInfo.auditStatus;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            selectionUserInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SelectionUserInfo parse(nc5 nc5Var) throws IOException {
            SelectionUserInfo selectionUserInfo = new SelectionUserInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (selectionUserInfo.title == null) {
                        selectionUserInfo.title = "";
                    }
                    if (selectionUserInfo.auditStatus != null) {
                        break;
                    }
                    selectionUserInfo.auditStatus = "";
                    break;
                }
                if (iM162497u == 10) {
                    selectionUserInfo.title = nc5Var.m162495s();
                } else if (iM162497u == 17) {
                    selectionUserInfo.updateTime = nc5Var.m162484h();
                } else {
                    if (iM162497u != 26) {
                        if (selectionUserInfo.title == null) {
                            selectionUserInfo.title = "";
                        }
                        if (selectionUserInfo.auditStatus != null) {
                            break;
                        }
                        selectionUserInfo.auditStatus = "";
                        return selectionUserInfo;
                    }
                    selectionUserInfo.auditStatus = nc5Var.m162495s();
                }
            }
            return selectionUserInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SelectionUserInfo selectionUserInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = selectionUserInfo.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17301C(2, selectionUserInfo.updateTime);
            String str2 = selectionUserInfo.auditStatus;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
        }
    };
    public static JsonAdapter<SelectionUserInfo> JSON_ADAPTER = new ObjectJsonAdapter<SelectionUserInfo>() { // from class: com.p1.mobile.putong.core.data.SelectionUserInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SelectionUserInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SelectionUserInfo newInstance() {
            return new SelectionUserInfo();
        }

        public boolean parseField(SelectionUserInfo selectionUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "updateTime":
                    selectionUserInfo.updateTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SelectionUserInfo selectionUserInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = selectionUserInfo.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            jsonGenerator.writeFieldName("updateTime");
            Converter.API_TIME.serialize(Double.valueOf(selectionUserInfo.updateTime), jsonGenerator, true);
            String str2 = selectionUserInfo.auditStatus;
            if (str2 != null) {
                jsonGenerator.writeStringField("auditStatus", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SelectionUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SelectionUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SelectionUserInfo new_() {
        SelectionUserInfo selectionUserInfo = new SelectionUserInfo();
        selectionUserInfo.nullCheck();
        return selectionUserInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SelectionUserInfo mo225055clone() {
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
        String str = this.title;
        int iHashCode = str != null ? str.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.updateTime);
        int i3 = (((i2 + iHashCode) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str2 = this.auditStatus;
        int iHashCode2 = i3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.auditStatus == null) {
            this.auditStatus = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
