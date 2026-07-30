package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.BreakIce;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class IceBreakingContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "icebreakingcontent";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<BreakIce> tips;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<IceBreakingContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<IceBreakingContent>() { // from class: com.p1.mobile.putong.core.data.IceBreakingContent.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IceBreakingContent iceBreakingContent) {
            String str = iceBreakingContent.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<BreakIce> list = iceBreakingContent.tips;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, BreakIce.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) iceBreakingContent).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IceBreakingContent m13393parse(nb5 nb5Var) throws IOException {
            IceBreakingContent iceBreakingContent = new IceBreakingContent();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (iceBreakingContent.userId == null) {
                        iceBreakingContent.userId = "";
                    }
                    if (iceBreakingContent.tips != null) {
                        break;
                    }
                    iceBreakingContent.tips = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    iceBreakingContent.userId = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (iceBreakingContent.userId == null) {
                            iceBreakingContent.userId = "";
                        }
                        if (iceBreakingContent.tips != null) {
                            break;
                        }
                        iceBreakingContent.tips = new ArrayList();
                        return iceBreakingContent;
                    }
                    iceBreakingContent.tips = (List) nb5Var.l(BreakIce.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return iceBreakingContent;
        }

        public void serialize(IceBreakingContent iceBreakingContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = iceBreakingContent.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<BreakIce> list = iceBreakingContent.tips;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, BreakIce.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IceBreakingContent> JSON_ADAPTER = new ObjectJsonAdapter<IceBreakingContent>() { // from class: com.p1.mobile.putong.core.data.IceBreakingContent.2
        public Class getDataClass() {
            return IceBreakingContent.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IceBreakingContent m13394newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IceBreakingContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IceBreakingContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IceBreakingContent new_() {
        IceBreakingContent iceBreakingContent = new IceBreakingContent();
        iceBreakingContent.nullCheck();
        return iceBreakingContent;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IceBreakingContent m13392clone() {
        IceBreakingContent iceBreakingContent = new IceBreakingContent();
        iceBreakingContent.userId = this.userId;
        List<BreakIce> list = this.tips;
        if (list != null) {
            iceBreakingContent.tips = ValueObject.util_map(list, new w9j() { // from class: l.b9m
                public final Object call(Object obj) {
                    return ((BreakIce) obj).m11814clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<BreakIce> list = this.tips;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.tips == null) {
            this.tips = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
