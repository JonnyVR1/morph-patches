package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ConvAdditionalLoveLetterTag;
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
public class ConvAdditionalLoveLetter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "convadditionalloveletter";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String owner;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public LoveLetterMessageState state;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<ConvAdditionalLoveLetterTag> suggestTags;
    public static ProtobufAdapter<ConvAdditionalLoveLetter> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConvAdditionalLoveLetter>() { // from class: com.p1.mobile.putong.core.data.ConvAdditionalLoveLetter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConvAdditionalLoveLetter convAdditionalLoveLetter) {
            List<ConvAdditionalLoveLetterTag> list = convAdditionalLoveLetter.suggestTags;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ConvAdditionalLoveLetterTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            LoveLetterMessageState loveLetterMessageState = convAdditionalLoveLetter.state;
            if (loveLetterMessageState != null) {
                iL += CodedOutputByteBufferNano.l(2, loveLetterMessageState, LoveLetterMessageState.PROTOBUF_ADAPTER);
            }
            String str = convAdditionalLoveLetter.owner;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(3, str);
            }
            ((MessageNano) convAdditionalLoveLetter).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConvAdditionalLoveLetter m12293parse(nb5 nb5Var) throws IOException {
            ConvAdditionalLoveLetter convAdditionalLoveLetter = new ConvAdditionalLoveLetter();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (convAdditionalLoveLetter.suggestTags == null) {
                        convAdditionalLoveLetter.suggestTags = new ArrayList();
                    }
                    if (convAdditionalLoveLetter.state == null) {
                        convAdditionalLoveLetter.state = (LoveLetterMessageState) LoveLetterMessageState.JSON_ADAPTER.defaultEnum();
                    }
                    if (convAdditionalLoveLetter.owner != null) {
                        break;
                    }
                    convAdditionalLoveLetter.owner = "";
                    break;
                }
                if (iU == 10) {
                    convAdditionalLoveLetter.suggestTags = (List) nb5Var.l(ConvAdditionalLoveLetterTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    convAdditionalLoveLetter.state = (LoveLetterMessageState) nb5Var.l(LoveLetterMessageState.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 26) {
                        if (convAdditionalLoveLetter.suggestTags == null) {
                            convAdditionalLoveLetter.suggestTags = new ArrayList();
                        }
                        if (convAdditionalLoveLetter.state == null) {
                            convAdditionalLoveLetter.state = (LoveLetterMessageState) LoveLetterMessageState.JSON_ADAPTER.defaultEnum();
                        }
                        if (convAdditionalLoveLetter.owner != null) {
                            break;
                        }
                        convAdditionalLoveLetter.owner = "";
                        return convAdditionalLoveLetter;
                    }
                    convAdditionalLoveLetter.owner = nb5Var.s();
                }
            }
            return convAdditionalLoveLetter;
        }

        public void serialize(ConvAdditionalLoveLetter convAdditionalLoveLetter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<ConvAdditionalLoveLetterTag> list = convAdditionalLoveLetter.suggestTags;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ConvAdditionalLoveLetterTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LoveLetterMessageState loveLetterMessageState = convAdditionalLoveLetter.state;
            if (loveLetterMessageState != null) {
                codedOutputByteBufferNano.K(2, loveLetterMessageState, LoveLetterMessageState.PROTOBUF_ADAPTER);
            }
            String str = convAdditionalLoveLetter.owner;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
        }
    };
    public static JsonAdapter<ConvAdditionalLoveLetter> JSON_ADAPTER = new ObjectJsonAdapter<ConvAdditionalLoveLetter>() { // from class: com.p1.mobile.putong.core.data.ConvAdditionalLoveLetter.2
        public Class getDataClass() {
            return ConvAdditionalLoveLetter.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ConvAdditionalLoveLetter m12294newInstance() {
            return new ConvAdditionalLoveLetter();
        }

        public boolean parseField(ConvAdditionalLoveLetter convAdditionalLoveLetter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "suggestTags":
                    convAdditionalLoveLetter.suggestTags = JsonAdapter.parseArray(jsonParser, ConvAdditionalLoveLetterTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "owner":
                    convAdditionalLoveLetter.owner = jsonParser.getValueAsString();
                    return true;
                case "state":
                    convAdditionalLoveLetter.state = (LoveLetterMessageState) LoveLetterMessageState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ConvAdditionalLoveLetter convAdditionalLoveLetter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "suggestTags":
                case "owner":
                case "state":
                    return true;
                default:
                    return super.parseFieldCheck(convAdditionalLoveLetter, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ConvAdditionalLoveLetter convAdditionalLoveLetter, JsonGenerator jsonGenerator) throws IOException {
            if (convAdditionalLoveLetter.suggestTags != null) {
                jsonGenerator.writeFieldName("suggestTags");
                JsonAdapter.serializeArray(convAdditionalLoveLetter.suggestTags, jsonGenerator, ConvAdditionalLoveLetterTag.JSON_ADAPTER);
            }
            if (convAdditionalLoveLetter.state != null) {
                jsonGenerator.writeFieldName(MessageChannel.state);
                LoveLetterMessageState.JSON_ADAPTER.serialize(convAdditionalLoveLetter.state, jsonGenerator, true);
            }
            String str = convAdditionalLoveLetter.owner;
            if (str != null) {
                jsonGenerator.writeStringField("owner", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConvAdditionalLoveLetter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConvAdditionalLoveLetter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConvAdditionalLoveLetter new_() {
        ConvAdditionalLoveLetter convAdditionalLoveLetter = new ConvAdditionalLoveLetter();
        convAdditionalLoveLetter.nullCheck();
        return convAdditionalLoveLetter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConvAdditionalLoveLetter m12292clone() {
        ConvAdditionalLoveLetter convAdditionalLoveLetter = new ConvAdditionalLoveLetter();
        List<ConvAdditionalLoveLetterTag> list = this.suggestTags;
        if (list != null) {
            convAdditionalLoveLetter.suggestTags = ValueObject.util_map(list, new w9j() { // from class: l.t26
                public final Object call(Object obj) {
                    return ((ConvAdditionalLoveLetterTag) obj).m12296clone();
                }
            });
        }
        convAdditionalLoveLetter.state = this.state;
        convAdditionalLoveLetter.owner = this.owner;
        return convAdditionalLoveLetter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConvAdditionalLoveLetter)) {
            return false;
        }
        ConvAdditionalLoveLetter convAdditionalLoveLetter = (ConvAdditionalLoveLetter) obj;
        return ValueObject.util_equals(this.suggestTags, convAdditionalLoveLetter.suggestTags) && ValueObject.util_equals(this.state, convAdditionalLoveLetter.state) && ValueObject.util_equals(this.owner, convAdditionalLoveLetter.owner);
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
        List<ConvAdditionalLoveLetterTag> list = this.suggestTags;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        LoveLetterMessageState loveLetterMessageState = this.state;
        int iHashCode2 = (iHashCode + (loveLetterMessageState != null ? loveLetterMessageState.hashCode() : 0)) * 41;
        String str = this.owner;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.suggestTags == null) {
            this.suggestTags = new ArrayList();
        }
        if (this.state == null) {
            this.state = (LoveLetterMessageState) LoveLetterMessageState.JSON_ADAPTER.defaultEnum();
        }
        if (this.owner == null) {
            this.owner = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
