package com.p000p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
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
public class SuggestedComplimentPicture extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "suggestedcomplimentpicture";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int height;

    @Nullable
    @ProtobufIndex(index = 1)
    public String identifier;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int width;
    public static ProtobufAdapter<SuggestedComplimentPicture> PROTOBUF_ADAPTER = new MessageNanoAdapter<SuggestedComplimentPicture>() { // from class: com.p1.mobile.putong.core.data.SuggestedComplimentPicture.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SuggestedComplimentPicture suggestedComplimentPicture) {
            String str = suggestedComplimentPicture.identifier;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, suggestedComplimentPicture.width) + CodedOutputByteBufferNano.h(3, suggestedComplimentPicture.height);
            ((MessageNano) suggestedComplimentPicture).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SuggestedComplimentPicture m15808parse(nb5 nb5Var) throws IOException {
            SuggestedComplimentPicture suggestedComplimentPicture = new SuggestedComplimentPicture();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 10) {
                    suggestedComplimentPicture.identifier = nb5Var.s();
                } else if (iU == 16) {
                    suggestedComplimentPicture.width = nb5Var.j();
                } else {
                    if (iU != 24) {
                        return suggestedComplimentPicture;
                    }
                    suggestedComplimentPicture.height = nb5Var.j();
                }
            }
        }

        public void serialize(SuggestedComplimentPicture suggestedComplimentPicture, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = suggestedComplimentPicture.identifier;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, suggestedComplimentPicture.width);
            codedOutputByteBufferNano.G(3, suggestedComplimentPicture.height);
        }
    };
    public static JsonAdapter<SuggestedComplimentPicture> JSON_ADAPTER = new ObjectJsonAdapter<SuggestedComplimentPicture>() { // from class: com.p1.mobile.putong.core.data.SuggestedComplimentPicture.2
        public Class getDataClass() {
            return SuggestedComplimentPicture.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SuggestedComplimentPicture m15809newInstance() {
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

        public void serializeFields(SuggestedComplimentPicture suggestedComplimentPicture, JsonGenerator jsonGenerator) throws IOException {
            String str = suggestedComplimentPicture.identifier;
            if (str != null) {
                jsonGenerator.writeStringField("identifier", str);
            }
            jsonGenerator.writeNumberField("width", suggestedComplimentPicture.width);
            jsonGenerator.writeNumberField(ProfileLikeCategoryType.height, suggestedComplimentPicture.height);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SuggestedComplimentPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SuggestedComplimentPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SuggestedComplimentPicture new_() {
        SuggestedComplimentPicture suggestedComplimentPicture = new SuggestedComplimentPicture();
        suggestedComplimentPicture.nullCheck();
        return suggestedComplimentPicture;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SuggestedComplimentPicture m15807clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.identifier;
        int iHashCode = ((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.width) * 41) + this.height;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
