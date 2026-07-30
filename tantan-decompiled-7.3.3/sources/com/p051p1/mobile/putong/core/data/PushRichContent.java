package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.PushRicTextHighLight;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class PushRichContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pushrichcontent";

    @ProtobufIndex(index = 3)
    public int duration;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<PushRicTextHighLight> highlight;

    @ProtobufIndex(index = 5)
    public boolean newUI;

    @NonNull
    @ProtobufIndex(index = 4)
    public String rewardID;

    @NonNull
    @ProtobufIndex(index = 1)
    public String text;
    public static ProtobufAdapter<PushRichContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<PushRichContent>() { // from class: com.p1.mobile.putong.core.data.PushRichContent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PushRichContent pushRichContent) {
            String str = pushRichContent.text;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<PushRicTextHighLight> list = pushRichContent.highlight;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, PushRicTextHighLight.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(3, pushRichContent.duration);
            String str2 = pushRichContent.rewardID;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            int iM17275b = iM17281h + CodedOutputByteBufferNano.m17275b(5, pushRichContent.newUI);
            pushRichContent.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PushRichContent parse(nc5 nc5Var) throws IOException {
            PushRichContent pushRichContent = new PushRichContent();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (pushRichContent.text == null) {
                        pushRichContent.text = "";
                    }
                    if (pushRichContent.highlight == null) {
                        pushRichContent.highlight = new ArrayList();
                    }
                    if (pushRichContent.rewardID != null) {
                        break;
                    }
                    pushRichContent.rewardID = "";
                    break;
                }
                if (iM162497u == 10) {
                    pushRichContent.text = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    pushRichContent.highlight = (List) nc5Var.m162488l(PushRicTextHighLight.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 24) {
                    pushRichContent.duration = nc5Var.m162486j();
                } else if (iM162497u == 34) {
                    pushRichContent.rewardID = nc5Var.m162495s();
                } else {
                    if (iM162497u != 40) {
                        if (pushRichContent.text == null) {
                            pushRichContent.text = "";
                        }
                        if (pushRichContent.highlight == null) {
                            pushRichContent.highlight = new ArrayList();
                        }
                        if (pushRichContent.rewardID != null) {
                            break;
                        }
                        pushRichContent.rewardID = "";
                        return pushRichContent;
                    }
                    pushRichContent.newUI = nc5Var.m162483g();
                }
            }
            return pushRichContent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PushRichContent pushRichContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = pushRichContent.text;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<PushRicTextHighLight> list = pushRichContent.highlight;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, PushRicTextHighLight.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(3, pushRichContent.duration);
            String str2 = pushRichContent.rewardID;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
            codedOutputByteBufferNano.m17299A(5, pushRichContent.newUI);
        }
    };
    public static JsonAdapter<PushRichContent> JSON_ADAPTER = new ObjectJsonAdapter<PushRichContent>() { // from class: com.p1.mobile.putong.core.data.PushRichContent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PushRichContent.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PushRichContent newInstance() {
            return new PushRichContent();
        }

        public boolean parseField(PushRichContent pushRichContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    pushRichContent.duration = jsonParser.getValueAsInt();
                    return true;
                case "highlight":
                    pushRichContent.highlight = JsonAdapter.parseArray(jsonParser, PushRicTextHighLight.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "rewardID":
                    pushRichContent.rewardID = jsonParser.getValueAsString();
                    return true;
                case "text":
                    pushRichContent.text = jsonParser.getValueAsString();
                    return true;
                case "newUI":
                    pushRichContent.newUI = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PushRichContent pushRichContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "highlight":
                case "rewardID":
                case "text":
                case "newUI":
                    return true;
                default:
                    return super.parseFieldCheck(pushRichContent, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PushRichContent pushRichContent, JsonGenerator jsonGenerator) throws IOException {
            String str = pushRichContent.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
            if (pushRichContent.highlight != null) {
                jsonGenerator.writeFieldName("highlight");
                JsonAdapter.serializeArray(pushRichContent.highlight, jsonGenerator, PushRicTextHighLight.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, pushRichContent.duration);
            String str2 = pushRichContent.rewardID;
            if (str2 != null) {
                jsonGenerator.writeStringField("rewardID", str2);
            }
            jsonGenerator.writeBooleanField("newUI", pushRichContent.newUI);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PushRichContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PushRichContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PushRichContent new_() {
        PushRichContent pushRichContent = new PushRichContent();
        pushRichContent.nullCheck();
        return pushRichContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PushRichContent mo225055clone() {
        PushRichContent pushRichContent = new PushRichContent();
        pushRichContent.text = this.text;
        List<PushRicTextHighLight> list = this.highlight;
        if (list != null) {
            pushRichContent.highlight = ValueObject.util_map(list, new qcj() { // from class: l.job0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((PushRicTextHighLight) obj).mo225055clone();
                }
            });
        }
        pushRichContent.duration = this.duration;
        pushRichContent.rewardID = this.rewardID;
        pushRichContent.newUI = this.newUI;
        return pushRichContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PushRichContent)) {
            return false;
        }
        PushRichContent pushRichContent = (PushRichContent) obj;
        return ValueObject.util_equals(this.text, pushRichContent.text) && ValueObject.util_equals(this.highlight, pushRichContent.highlight) && this.duration == pushRichContent.duration && ValueObject.util_equals(this.rewardID, pushRichContent.rewardID) && this.newUI == pushRichContent.newUI;
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
        String str = this.text;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<PushRicTextHighLight> list = this.highlight;
        int iHashCode2 = (((iHashCode + (list != null ? list.hashCode() : 0)) * 41) + this.duration) * 41;
        String str2 = this.rewardID;
        int iHashCode3 = ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.newUI ? 1231 : 1237);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
        if (this.highlight == null) {
            this.highlight = new ArrayList();
        }
        if (this.rewardID == null) {
            this.rewardID = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
