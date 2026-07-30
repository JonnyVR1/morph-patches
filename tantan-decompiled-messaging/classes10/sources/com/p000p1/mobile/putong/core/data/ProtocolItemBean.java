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
public class ProtocolItemBean extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "protocolitembean";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean isCheck;

    @ProtobufIndex(index = 4)
    public boolean isShow;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String tip;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<ProtocolItemBean> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProtocolItemBean>() { // from class: com.p1.mobile.putong.core.data.ProtocolItemBean.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProtocolItemBean protocolItemBean) {
            String str = protocolItemBean.title;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = protocolItemBean.tip;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iB = iO + CodedOutputByteBufferNano.b(3, protocolItemBean.isCheck) + CodedOutputByteBufferNano.b(4, protocolItemBean.isShow);
            ((MessageNano) protocolItemBean).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProtocolItemBean m15067parse(nb5 nb5Var) throws IOException {
            ProtocolItemBean protocolItemBean = new ProtocolItemBean();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (protocolItemBean.title == null) {
                        protocolItemBean.title = "";
                    }
                    if (protocolItemBean.tip != null) {
                        break;
                    }
                    protocolItemBean.tip = "";
                    break;
                }
                if (iU == 10) {
                    protocolItemBean.title = nb5Var.s();
                } else if (iU == 18) {
                    protocolItemBean.tip = nb5Var.s();
                } else if (iU == 24) {
                    protocolItemBean.isCheck = nb5Var.g();
                } else {
                    if (iU != 32) {
                        if (protocolItemBean.title == null) {
                            protocolItemBean.title = "";
                        }
                        if (protocolItemBean.tip != null) {
                            break;
                        }
                        protocolItemBean.tip = "";
                        return protocolItemBean;
                    }
                    protocolItemBean.isShow = nb5Var.g();
                }
            }
            return protocolItemBean;
        }

        public void serialize(ProtocolItemBean protocolItemBean, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = protocolItemBean.title;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = protocolItemBean.tip;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.A(3, protocolItemBean.isCheck);
            codedOutputByteBufferNano.A(4, protocolItemBean.isShow);
        }
    };
    public static JsonAdapter<ProtocolItemBean> JSON_ADAPTER = new ObjectJsonAdapter<ProtocolItemBean>() { // from class: com.p1.mobile.putong.core.data.ProtocolItemBean.2
        public Class getDataClass() {
            return ProtocolItemBean.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProtocolItemBean m15068newInstance() {
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

        public void serializeFields(ProtocolItemBean protocolItemBean, JsonGenerator jsonGenerator) throws IOException {
            String str = protocolItemBean.title;
            if (str != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str);
            }
            String str2 = protocolItemBean.tip;
            if (str2 != null) {
                jsonGenerator.writeStringField("tip", str2);
            }
            jsonGenerator.writeBooleanField("isCheck", protocolItemBean.isCheck);
            jsonGenerator.writeBooleanField("isShow", protocolItemBean.isShow);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProtocolItemBean) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProtocolItemBean) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProtocolItemBean new_() {
        ProtocolItemBean protocolItemBean = new ProtocolItemBean();
        protocolItemBean.nullCheck();
        return protocolItemBean;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProtocolItemBean m15066clone() {
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
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.tip;
        int iHashCode2 = ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.isCheck ? 1231 : 1237)) * 41) + (this.isShow ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.tip == null) {
            this.tip = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
