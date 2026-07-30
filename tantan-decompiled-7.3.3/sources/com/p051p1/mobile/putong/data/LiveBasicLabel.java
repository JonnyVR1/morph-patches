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
public class LiveBasicLabel extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livebasiclabel";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39617id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String templateId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String type;

    @NonNull
    @ProtobufIndex(index = 3)
    public String value;
    public static ProtobufAdapter<LiveBasicLabel> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveBasicLabel>() { // from class: com.p1.mobile.putong.data.LiveBasicLabel.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveBasicLabel liveBasicLabel) {
            String str = liveBasicLabel.f39617id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = liveBasicLabel.templateId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = liveBasicLabel.value;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = liveBasicLabel.type;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            liveBasicLabel.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveBasicLabel parse(nc5 nc5Var) throws IOException {
            LiveBasicLabel liveBasicLabel = new LiveBasicLabel();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (liveBasicLabel.f39617id == null) {
                        liveBasicLabel.f39617id = "";
                    }
                    if (liveBasicLabel.templateId == null) {
                        liveBasicLabel.templateId = "";
                    }
                    if (liveBasicLabel.value == null) {
                        liveBasicLabel.value = "";
                    }
                    if (liveBasicLabel.type != null) {
                        break;
                    }
                    liveBasicLabel.type = "";
                    break;
                }
                if (iM162497u == 10) {
                    liveBasicLabel.f39617id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    liveBasicLabel.templateId = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    liveBasicLabel.value = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (liveBasicLabel.f39617id == null) {
                            liveBasicLabel.f39617id = "";
                        }
                        if (liveBasicLabel.templateId == null) {
                            liveBasicLabel.templateId = "";
                        }
                        if (liveBasicLabel.value == null) {
                            liveBasicLabel.value = "";
                        }
                        if (liveBasicLabel.type != null) {
                            break;
                        }
                        liveBasicLabel.type = "";
                        return liveBasicLabel;
                    }
                    liveBasicLabel.type = nc5Var.m162495s();
                }
            }
            return liveBasicLabel;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveBasicLabel liveBasicLabel, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveBasicLabel.f39617id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = liveBasicLabel.templateId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = liveBasicLabel.value;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = liveBasicLabel.type;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
        }
    };
    public static JsonAdapter<LiveBasicLabel> JSON_ADAPTER = new ObjectJsonAdapter<LiveBasicLabel>() { // from class: com.p1.mobile.putong.data.LiveBasicLabel.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveBasicLabel.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveBasicLabel newInstance() {
            return new LiveBasicLabel();
        }

        public boolean parseField(LiveBasicLabel liveBasicLabel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    liveBasicLabel.f39617id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    liveBasicLabel.type = jsonParser.getValueAsString();
                    return true;
                case "value":
                    liveBasicLabel.value = jsonParser.getValueAsString();
                    return true;
                case "templateId":
                    liveBasicLabel.templateId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveBasicLabel liveBasicLabel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "type":
                case "value":
                case "templateId":
                    return true;
                default:
                    return super.parseFieldCheck(liveBasicLabel, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveBasicLabel liveBasicLabel, JsonGenerator jsonGenerator) throws IOException {
            String str = liveBasicLabel.f39617id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = liveBasicLabel.templateId;
            if (str2 != null) {
                jsonGenerator.writeStringField("templateId", str2);
            }
            String str3 = liveBasicLabel.value;
            if (str3 != null) {
                jsonGenerator.writeStringField("value", str3);
            }
            String str4 = liveBasicLabel.type;
            if (str4 != null) {
                jsonGenerator.writeStringField("type", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveBasicLabel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveBasicLabel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveBasicLabel new_() {
        LiveBasicLabel liveBasicLabel = new LiveBasicLabel();
        liveBasicLabel.nullCheck();
        return liveBasicLabel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveBasicLabel mo225055clone() {
        LiveBasicLabel liveBasicLabel = new LiveBasicLabel();
        liveBasicLabel.f39617id = this.f39617id;
        liveBasicLabel.templateId = this.templateId;
        liveBasicLabel.value = this.value;
        liveBasicLabel.type = this.type;
        return liveBasicLabel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveBasicLabel)) {
            return false;
        }
        LiveBasicLabel liveBasicLabel = (LiveBasicLabel) obj;
        return ValueObject.util_equals(this.f39617id, liveBasicLabel.f39617id) && ValueObject.util_equals(this.templateId, liveBasicLabel.templateId) && ValueObject.util_equals(this.value, liveBasicLabel.value) && ValueObject.util_equals(this.type, liveBasicLabel.type);
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
        String str = this.f39617id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.templateId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.value;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.type;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39617id == null) {
            this.f39617id = "";
        }
        if (this.templateId == null) {
            this.templateId = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
