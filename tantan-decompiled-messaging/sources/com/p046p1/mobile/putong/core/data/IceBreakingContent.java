package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.BreakIce;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class IceBreakingContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "icebreakingcontent";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BreakIce> tips;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<IceBreakingContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<IceBreakingContent>() { // from class: com.p1.mobile.putong.core.data.IceBreakingContent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IceBreakingContent iceBreakingContent) {
            String str = iceBreakingContent.userId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<BreakIce> list = iceBreakingContent.tips;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, BreakIce.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            iceBreakingContent.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IceBreakingContent parse(nb5 nb5Var) throws IOException {
            IceBreakingContent iceBreakingContent = new IceBreakingContent();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (iceBreakingContent.userId == null) {
                        iceBreakingContent.userId = "";
                    }
                    if (iceBreakingContent.tips != null) {
                        break;
                    }
                    iceBreakingContent.tips = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    iceBreakingContent.userId = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (iceBreakingContent.userId == null) {
                            iceBreakingContent.userId = "";
                        }
                        if (iceBreakingContent.tips != null) {
                            break;
                        }
                        iceBreakingContent.tips = new ArrayList();
                        return iceBreakingContent;
                    }
                    iceBreakingContent.tips = (List) nb5Var.m158743l(BreakIce.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return iceBreakingContent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IceBreakingContent iceBreakingContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = iceBreakingContent.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<BreakIce> list = iceBreakingContent.tips;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, BreakIce.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IceBreakingContent> JSON_ADAPTER = new ObjectJsonAdapter<IceBreakingContent>() { // from class: com.p1.mobile.putong.core.data.IceBreakingContent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IceBreakingContent.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IceBreakingContent newInstance() {
            return new IceBreakingContent();
        }

        public boolean parseField(IceBreakingContent iceBreakingContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userId")) {
                iceBreakingContent.userId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("tips")) {
                return false;
            }
            iceBreakingContent.tips = JsonAdapter.parseArray(jsonParser, BreakIce.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IceBreakingContent iceBreakingContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userId") || str.equals("tips")) {
                return true;
            }
            return super.parseFieldCheck(iceBreakingContent, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IceBreakingContent iceBreakingContent, JsonGenerator jsonGenerator) throws IOException {
            String str = iceBreakingContent.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            if (iceBreakingContent.tips != null) {
                jsonGenerator.writeFieldName("tips");
                JsonAdapter.serializeArray(iceBreakingContent.tips, jsonGenerator, BreakIce.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IceBreakingContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IceBreakingContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IceBreakingContent new_() {
        IceBreakingContent iceBreakingContent = new IceBreakingContent();
        iceBreakingContent.nullCheck();
        return iceBreakingContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IceBreakingContent mo223809clone() {
        IceBreakingContent iceBreakingContent = new IceBreakingContent();
        iceBreakingContent.userId = this.userId;
        List<BreakIce> list = this.tips;
        if (list != null) {
            iceBreakingContent.tips = ValueObject.util_map(list, new w9j() { // from class: l.b9m
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BreakIce) obj).mo223809clone();
                }
            });
        }
        return iceBreakingContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IceBreakingContent)) {
            return false;
        }
        IceBreakingContent iceBreakingContent = (IceBreakingContent) obj;
        return ValueObject.util_equals(this.userId, iceBreakingContent.userId) && ValueObject.util_equals(this.tips, iceBreakingContent.tips);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<BreakIce> list = this.tips;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.tips == null) {
            this.tips = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
