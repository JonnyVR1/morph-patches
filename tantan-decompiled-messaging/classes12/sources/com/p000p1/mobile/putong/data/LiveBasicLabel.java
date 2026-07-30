package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class LiveBasicLabel extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livebasiclabel";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f230id;

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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveBasicLabel liveBasicLabel) {
            String str = liveBasicLabel.f230id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = liveBasicLabel.templateId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = liveBasicLabel.value;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = liveBasicLabel.type;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) liveBasicLabel).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveBasicLabel m18331parse(nb5 nb5Var) throws IOException {
            LiveBasicLabel liveBasicLabel = new LiveBasicLabel();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (liveBasicLabel.f230id == null) {
                        liveBasicLabel.f230id = "";
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
                if (iU == 10) {
                    liveBasicLabel.f230id = nb5Var.s();
                } else if (iU == 18) {
                    liveBasicLabel.templateId = nb5Var.s();
                } else if (iU == 26) {
                    liveBasicLabel.value = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (liveBasicLabel.f230id == null) {
                            liveBasicLabel.f230id = "";
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
                    liveBasicLabel.type = nb5Var.s();
                }
            }
            return liveBasicLabel;
        }

        public void serialize(LiveBasicLabel liveBasicLabel, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveBasicLabel.f230id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = liveBasicLabel.templateId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = liveBasicLabel.value;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = liveBasicLabel.type;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<LiveBasicLabel> JSON_ADAPTER = new ObjectJsonAdapter<LiveBasicLabel>() { // from class: com.p1.mobile.putong.data.LiveBasicLabel.2
        public Class getDataClass() {
            return LiveBasicLabel.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveBasicLabel mo17830newInstance() {
            return new LiveBasicLabel();
        }

        public boolean parseField(LiveBasicLabel liveBasicLabel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    liveBasicLabel.f230id = jsonParser.getValueAsString();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveBasicLabel liveBasicLabel, JsonGenerator jsonGenerator) throws IOException {
            String str = liveBasicLabel.f230id;
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveBasicLabel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveBasicLabel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveBasicLabel new_() {
        LiveBasicLabel liveBasicLabel = new LiveBasicLabel();
        liveBasicLabel.nullCheck();
        return liveBasicLabel;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveBasicLabel m18330clone() {
        LiveBasicLabel liveBasicLabel = new LiveBasicLabel();
        liveBasicLabel.f230id = this.f230id;
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
        return ValueObject.util_equals(this.f230id, liveBasicLabel.f230id) && ValueObject.util_equals(this.templateId, liveBasicLabel.templateId) && ValueObject.util_equals(this.value, liveBasicLabel.value) && ValueObject.util_equals(this.type, liveBasicLabel.type);
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
        String str = this.f230id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.templateId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.value;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.type;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f230id == null) {
            this.f230id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
