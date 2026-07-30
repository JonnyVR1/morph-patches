package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.PushRicTextHighLight;
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
public class PushRichContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pushrichcontent";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int duration;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<PushRicTextHighLight> highlight;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public boolean newUI;

    @NonNull
    @ProtobufIndex(index = 4)
    public String rewardID;

    @NonNull
    @ProtobufIndex(index = 1)
    public String text;
    public static ProtobufAdapter<PushRichContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<PushRichContent>() { // from class: com.p1.mobile.putong.core.data.PushRichContent.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PushRichContent pushRichContent) {
            String str = pushRichContent.text;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<PushRicTextHighLight> list = pushRichContent.highlight;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, PushRicTextHighLight.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iH = iO + CodedOutputByteBufferNano.h(3, pushRichContent.duration);
            String str2 = pushRichContent.rewardID;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(4, str2);
            }
            int iB = iH + CodedOutputByteBufferNano.b(5, pushRichContent.newUI);
            ((MessageNano) pushRichContent).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PushRichContent m15109parse(nb5 nb5Var) throws IOException {
            PushRichContent pushRichContent = new PushRichContent();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    pushRichContent.text = nb5Var.s();
                } else if (iU == 18) {
                    pushRichContent.highlight = (List) nb5Var.l(PushRicTextHighLight.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 24) {
                    pushRichContent.duration = nb5Var.j();
                } else if (iU == 34) {
                    pushRichContent.rewardID = nb5Var.s();
                } else {
                    if (iU != 40) {
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
                    pushRichContent.newUI = nb5Var.g();
                }
            }
            return pushRichContent;
        }

        public void serialize(PushRichContent pushRichContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = pushRichContent.text;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<PushRicTextHighLight> list = pushRichContent.highlight;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, PushRicTextHighLight.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(3, pushRichContent.duration);
            String str2 = pushRichContent.rewardID;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
            codedOutputByteBufferNano.A(5, pushRichContent.newUI);
        }
    };
    public static JsonAdapter<PushRichContent> JSON_ADAPTER = new ObjectJsonAdapter<PushRichContent>() { // from class: com.p1.mobile.putong.core.data.PushRichContent.2
        public Class getDataClass() {
            return PushRichContent.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PushRichContent m15110newInstance() {
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

        public void serializeFields(PushRichContent pushRichContent, JsonGenerator jsonGenerator) throws IOException {
            String str = pushRichContent.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
            if (pushRichContent.highlight != null) {
                jsonGenerator.writeFieldName("highlight");
                JsonAdapter.serializeArray(pushRichContent.highlight, jsonGenerator, PushRicTextHighLight.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("duration", pushRichContent.duration);
            String str2 = pushRichContent.rewardID;
            if (str2 != null) {
                jsonGenerator.writeStringField("rewardID", str2);
            }
            jsonGenerator.writeBooleanField("newUI", pushRichContent.newUI);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PushRichContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PushRichContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PushRichContent new_() {
        PushRichContent pushRichContent = new PushRichContent();
        pushRichContent.nullCheck();
        return pushRichContent;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PushRichContent m15108clone() {
        PushRichContent pushRichContent = new PushRichContent();
        pushRichContent.text = this.text;
        List<PushRicTextHighLight> list = this.highlight;
        if (list != null) {
            pushRichContent.highlight = ValueObject.util_map(list, new w9j() { // from class: l.fgb0
                public final Object call(Object obj) {
                    return ((PushRicTextHighLight) obj).m15104clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
