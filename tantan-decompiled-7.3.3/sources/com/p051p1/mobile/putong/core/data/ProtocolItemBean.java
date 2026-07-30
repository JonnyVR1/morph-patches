package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class ProtocolItemBean extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "protocolitembean";

    @ProtobufIndex(index = 3)
    public boolean isCheck;

    @ProtobufIndex(index = 4)
    public boolean isShow;

    @NonNull
    @ProtobufIndex(index = 2)
    public String tip;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<ProtocolItemBean> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProtocolItemBean>() { // from class: com.p1.mobile.putong.core.data.ProtocolItemBean.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProtocolItemBean protocolItemBean) {
            String str = protocolItemBean.title;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = protocolItemBean.tip;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(3, protocolItemBean.isCheck) + CodedOutputByteBufferNano.m17275b(4, protocolItemBean.isShow);
            protocolItemBean.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProtocolItemBean parse(nc5 nc5Var) throws IOException {
            ProtocolItemBean protocolItemBean = new ProtocolItemBean();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (protocolItemBean.title == null) {
                        protocolItemBean.title = "";
                    }
                    if (protocolItemBean.tip != null) {
                        break;
                    }
                    protocolItemBean.tip = "";
                    break;
                }
                if (iM162497u == 10) {
                    protocolItemBean.title = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    protocolItemBean.tip = nc5Var.m162495s();
                } else if (iM162497u == 24) {
                    protocolItemBean.isCheck = nc5Var.m162483g();
                } else {
                    if (iM162497u != 32) {
                        if (protocolItemBean.title == null) {
                            protocolItemBean.title = "";
                        }
                        if (protocolItemBean.tip != null) {
                            break;
                        }
                        protocolItemBean.tip = "";
                        return protocolItemBean;
                    }
                    protocolItemBean.isShow = nc5Var.m162483g();
                }
            }
            return protocolItemBean;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProtocolItemBean protocolItemBean, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = protocolItemBean.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = protocolItemBean.tip;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17299A(3, protocolItemBean.isCheck);
            codedOutputByteBufferNano.m17299A(4, protocolItemBean.isShow);
        }
    };
    public static JsonAdapter<ProtocolItemBean> JSON_ADAPTER = new ObjectJsonAdapter<ProtocolItemBean>() { // from class: com.p1.mobile.putong.core.data.ProtocolItemBean.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProtocolItemBean.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProtocolItemBean newInstance() {
            return new ProtocolItemBean();
        }

        public boolean parseField(ProtocolItemBean protocolItemBean, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isShow":
                    protocolItemBean.isShow = jsonParser.getValueAsBoolean();
                    return true;
                case "tip":
                    protocolItemBean.tip = jsonParser.getValueAsString();
                    return true;
                case "title":
                    protocolItemBean.title = jsonParser.getValueAsString();
                    return true;
                case "isCheck":
                    protocolItemBean.isCheck = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ProtocolItemBean protocolItemBean, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "isShow":
                case "tip":
                case "title":
                case "isCheck":
                    return true;
                default:
                    return super.parseFieldCheck(protocolItemBean, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProtocolItemBean protocolItemBean, JsonGenerator jsonGenerator) throws IOException {
            String str = protocolItemBean.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = protocolItemBean.tip;
            if (str2 != null) {
                jsonGenerator.writeStringField("tip", str2);
            }
            jsonGenerator.writeBooleanField("isCheck", protocolItemBean.isCheck);
            jsonGenerator.writeBooleanField("isShow", protocolItemBean.isShow);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProtocolItemBean) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProtocolItemBean) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProtocolItemBean new_() {
        ProtocolItemBean protocolItemBean = new ProtocolItemBean();
        protocolItemBean.nullCheck();
        return protocolItemBean;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProtocolItemBean mo225055clone() {
        ProtocolItemBean protocolItemBean = new ProtocolItemBean();
        protocolItemBean.title = this.title;
        protocolItemBean.tip = this.tip;
        protocolItemBean.isCheck = this.isCheck;
        protocolItemBean.isShow = this.isShow;
        return protocolItemBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtocolItemBean)) {
            return false;
        }
        ProtocolItemBean protocolItemBean = (ProtocolItemBean) obj;
        return ValueObject.util_equals(this.title, protocolItemBean.title) && ValueObject.util_equals(this.tip, protocolItemBean.tip) && this.isCheck == protocolItemBean.isCheck && this.isShow == protocolItemBean.isShow;
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
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.tip;
        int iHashCode2 = ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.isCheck ? 1231 : 1237)) * 41) + (this.isShow ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.tip == null) {
            this.tip = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
