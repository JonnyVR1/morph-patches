package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class LiveUserCardButtonContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveusercardbuttoncontent";

    @NonNull
    @ProtobufIndex(index = 2)
    public String color;

    @NonNull
    @ProtobufIndex(index = 1)
    public String text;
    public static ProtobufAdapter<LiveUserCardButtonContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveUserCardButtonContent>() { // from class: com.p1.mobile.putong.data.LiveUserCardButtonContent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveUserCardButtonContent liveUserCardButtonContent) {
            String str = liveUserCardButtonContent.text;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = liveUserCardButtonContent.color;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            liveUserCardButtonContent.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveUserCardButtonContent parse(nc5 nc5Var) throws IOException {
            LiveUserCardButtonContent liveUserCardButtonContent = new LiveUserCardButtonContent();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (liveUserCardButtonContent.text == null) {
                        liveUserCardButtonContent.text = "";
                    }
                    if (liveUserCardButtonContent.color != null) {
                        break;
                    }
                    liveUserCardButtonContent.color = "";
                    break;
                }
                if (iM162497u == 10) {
                    liveUserCardButtonContent.text = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (liveUserCardButtonContent.text == null) {
                            liveUserCardButtonContent.text = "";
                        }
                        if (liveUserCardButtonContent.color != null) {
                            break;
                        }
                        liveUserCardButtonContent.color = "";
                        return liveUserCardButtonContent;
                    }
                    liveUserCardButtonContent.color = nc5Var.m162495s();
                }
            }
            return liveUserCardButtonContent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveUserCardButtonContent liveUserCardButtonContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveUserCardButtonContent.text;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = liveUserCardButtonContent.color;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<LiveUserCardButtonContent> JSON_ADAPTER = new ObjectJsonAdapter<LiveUserCardButtonContent>() { // from class: com.p1.mobile.putong.data.LiveUserCardButtonContent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveUserCardButtonContent.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveUserCardButtonContent newInstance() {
            return new LiveUserCardButtonContent();
        }

        public boolean parseField(LiveUserCardButtonContent liveUserCardButtonContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("text")) {
                liveUserCardButtonContent.text = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("color")) {
                return false;
            }
            liveUserCardButtonContent.color = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LiveUserCardButtonContent liveUserCardButtonContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("text") || str.equals("color")) {
                return true;
            }
            return super.parseFieldCheck(liveUserCardButtonContent, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveUserCardButtonContent liveUserCardButtonContent, JsonGenerator jsonGenerator) throws IOException {
            String str = liveUserCardButtonContent.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
            String str2 = liveUserCardButtonContent.color;
            if (str2 != null) {
                jsonGenerator.writeStringField("color", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveUserCardButtonContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveUserCardButtonContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveUserCardButtonContent new_() {
        LiveUserCardButtonContent liveUserCardButtonContent = new LiveUserCardButtonContent();
        liveUserCardButtonContent.nullCheck();
        return liveUserCardButtonContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveUserCardButtonContent mo225055clone() {
        LiveUserCardButtonContent liveUserCardButtonContent = new LiveUserCardButtonContent();
        liveUserCardButtonContent.text = this.text;
        liveUserCardButtonContent.color = this.color;
        return liveUserCardButtonContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveUserCardButtonContent)) {
            return false;
        }
        LiveUserCardButtonContent liveUserCardButtonContent = (LiveUserCardButtonContent) obj;
        return ValueObject.util_equals(this.text, liveUserCardButtonContent.text) && ValueObject.util_equals(this.color, liveUserCardButtonContent.color);
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
        String str2 = this.color;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
        if (this.color == null) {
            this.color = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
