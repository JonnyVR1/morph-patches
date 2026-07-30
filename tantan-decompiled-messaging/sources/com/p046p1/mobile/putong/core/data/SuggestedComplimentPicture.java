package com.p046p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class SuggestedComplimentPicture extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "suggestedcomplimentpicture";

    @ProtobufIndex(index = 3)
    public int height;

    @Nullable
    @ProtobufIndex(index = 1)
    public String identifier;

    @ProtobufIndex(index = 2)
    public int width;
    public static ProtobufAdapter<SuggestedComplimentPicture> PROTOBUF_ADAPTER = new MessageNanoAdapter<SuggestedComplimentPicture>() { // from class: com.p1.mobile.putong.core.data.SuggestedComplimentPicture.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SuggestedComplimentPicture suggestedComplimentPicture) {
            String str = suggestedComplimentPicture.identifier;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, suggestedComplimentPicture.width) + CodedOutputByteBufferNano.m17226h(3, suggestedComplimentPicture.height);
            suggestedComplimentPicture.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SuggestedComplimentPicture parse(nb5 nb5Var) throws IOException {
            SuggestedComplimentPicture suggestedComplimentPicture = new SuggestedComplimentPicture();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 10) {
                    suggestedComplimentPicture.identifier = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    suggestedComplimentPicture.width = nb5Var.m158741j();
                } else {
                    if (iM158752u != 24) {
                        return suggestedComplimentPicture;
                    }
                    suggestedComplimentPicture.height = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SuggestedComplimentPicture suggestedComplimentPicture, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = suggestedComplimentPicture.identifier;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, suggestedComplimentPicture.width);
            codedOutputByteBufferNano.m17250G(3, suggestedComplimentPicture.height);
        }
    };
    public static JsonAdapter<SuggestedComplimentPicture> JSON_ADAPTER = new ObjectJsonAdapter<SuggestedComplimentPicture>() { // from class: com.p1.mobile.putong.core.data.SuggestedComplimentPicture.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SuggestedComplimentPicture.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SuggestedComplimentPicture newInstance() {
            return new SuggestedComplimentPicture();
        }

        public boolean parseField(SuggestedComplimentPicture suggestedComplimentPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "identifier":
                    suggestedComplimentPicture.identifier = jsonParser.getValueAsString();
                    return true;
                case "height":
                    suggestedComplimentPicture.height = jsonParser.getValueAsInt();
                    return true;
                case "width":
                    suggestedComplimentPicture.width = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SuggestedComplimentPicture suggestedComplimentPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "identifier":
                case "height":
                case "width":
                    return true;
                default:
                    return super.parseFieldCheck(suggestedComplimentPicture, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SuggestedComplimentPicture suggestedComplimentPicture, JsonGenerator jsonGenerator) throws IOException {
            String str = suggestedComplimentPicture.identifier;
            if (str != null) {
                jsonGenerator.writeStringField("identifier", str);
            }
            jsonGenerator.writeNumberField("width", suggestedComplimentPicture.width);
            jsonGenerator.writeNumberField("height", suggestedComplimentPicture.height);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SuggestedComplimentPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SuggestedComplimentPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SuggestedComplimentPicture new_() {
        SuggestedComplimentPicture suggestedComplimentPicture = new SuggestedComplimentPicture();
        suggestedComplimentPicture.nullCheck();
        return suggestedComplimentPicture;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SuggestedComplimentPicture mo223809clone() {
        SuggestedComplimentPicture suggestedComplimentPicture = new SuggestedComplimentPicture();
        suggestedComplimentPicture.identifier = this.identifier;
        suggestedComplimentPicture.width = this.width;
        suggestedComplimentPicture.height = this.height;
        return suggestedComplimentPicture;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SuggestedComplimentPicture)) {
            return false;
        }
        SuggestedComplimentPicture suggestedComplimentPicture = (SuggestedComplimentPicture) obj;
        return ValueObject.util_equals(this.identifier, suggestedComplimentPicture.identifier) && this.width == suggestedComplimentPicture.width && this.height == suggestedComplimentPicture.height;
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
        String str = this.identifier;
        int iHashCode = ((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.width) * 41) + this.height;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
