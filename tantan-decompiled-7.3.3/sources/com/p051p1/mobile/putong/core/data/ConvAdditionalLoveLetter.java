package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.ConvAdditionalLoveLetterTag;
import com.p051p1.mobile.putong.data.Owner;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class ConvAdditionalLoveLetter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "convadditionalloveletter";

    @NonNull
    @ProtobufIndex(index = 3)
    public String owner;

    @NonNull
    @ProtobufIndex(index = 2)
    public LoveLetterMessageState state;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<ConvAdditionalLoveLetterTag> suggestTags;
    public static ProtobufAdapter<ConvAdditionalLoveLetter> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConvAdditionalLoveLetter>() { // from class: com.p1.mobile.putong.core.data.ConvAdditionalLoveLetter.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConvAdditionalLoveLetter convAdditionalLoveLetter) {
            List<ConvAdditionalLoveLetterTag> list = convAdditionalLoveLetter.suggestTags;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ConvAdditionalLoveLetterTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            LoveLetterMessageState loveLetterMessageState = convAdditionalLoveLetter.state;
            if (loveLetterMessageState != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, loveLetterMessageState, LoveLetterMessageState.PROTOBUF_ADAPTER);
            }
            String str = convAdditionalLoveLetter.owner;
            if (str != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(3, str);
            }
            convAdditionalLoveLetter.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConvAdditionalLoveLetter parse(nc5 nc5Var) throws IOException {
            ConvAdditionalLoveLetter convAdditionalLoveLetter = new ConvAdditionalLoveLetter();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    convAdditionalLoveLetter.suggestTags = (List) nc5Var.m162488l(ConvAdditionalLoveLetterTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 18) {
                    convAdditionalLoveLetter.state = (LoveLetterMessageState) nc5Var.m162488l(LoveLetterMessageState.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 26) {
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
                    convAdditionalLoveLetter.owner = nc5Var.m162495s();
                }
            }
            return convAdditionalLoveLetter;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConvAdditionalLoveLetter convAdditionalLoveLetter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<ConvAdditionalLoveLetterTag> list = convAdditionalLoveLetter.suggestTags;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ConvAdditionalLoveLetterTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LoveLetterMessageState loveLetterMessageState = convAdditionalLoveLetter.state;
            if (loveLetterMessageState != null) {
                codedOutputByteBufferNano.m17309K(2, loveLetterMessageState, LoveLetterMessageState.PROTOBUF_ADAPTER);
            }
            String str = convAdditionalLoveLetter.owner;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
        }
    };
    public static JsonAdapter<ConvAdditionalLoveLetter> JSON_ADAPTER = new ObjectJsonAdapter<ConvAdditionalLoveLetter>() { // from class: com.p1.mobile.putong.core.data.ConvAdditionalLoveLetter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConvAdditionalLoveLetter.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConvAdditionalLoveLetter newInstance() {
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
                    convAdditionalLoveLetter.state = LoveLetterMessageState.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConvAdditionalLoveLetter convAdditionalLoveLetter, JsonGenerator jsonGenerator) throws IOException {
            if (convAdditionalLoveLetter.suggestTags != null) {
                jsonGenerator.writeFieldName("suggestTags");
                JsonAdapter.serializeArray(convAdditionalLoveLetter.suggestTags, jsonGenerator, ConvAdditionalLoveLetterTag.JSON_ADAPTER);
            }
            if (convAdditionalLoveLetter.state != null) {
                jsonGenerator.writeFieldName("state");
                LoveLetterMessageState.JSON_ADAPTER.serialize(convAdditionalLoveLetter.state, jsonGenerator, true);
            }
            String str = convAdditionalLoveLetter.owner;
            if (str != null) {
                jsonGenerator.writeStringField(Owner.TYPE, str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConvAdditionalLoveLetter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConvAdditionalLoveLetter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConvAdditionalLoveLetter new_() {
        ConvAdditionalLoveLetter convAdditionalLoveLetter = new ConvAdditionalLoveLetter();
        convAdditionalLoveLetter.nullCheck();
        return convAdditionalLoveLetter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConvAdditionalLoveLetter mo225055clone() {
        ConvAdditionalLoveLetter convAdditionalLoveLetter = new ConvAdditionalLoveLetter();
        List<ConvAdditionalLoveLetterTag> list = this.suggestTags;
        if (list != null) {
            convAdditionalLoveLetter.suggestTags = ValueObject.util_map(list, new qcj() { // from class: l.y36
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ConvAdditionalLoveLetterTag) obj).mo225055clone();
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
        List<ConvAdditionalLoveLetterTag> list = this.suggestTags;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        LoveLetterMessageState loveLetterMessageState = this.state;
        int iHashCode2 = (iHashCode + (loveLetterMessageState != null ? loveLetterMessageState.hashCode() : 0)) * 41;
        String str = this.owner;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
