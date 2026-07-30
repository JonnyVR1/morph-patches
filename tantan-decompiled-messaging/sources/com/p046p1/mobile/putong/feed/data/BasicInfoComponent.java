package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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

/* JADX INFO: loaded from: classes12.dex */
public class BasicInfoComponent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "basicinfocomponent";

    @ProtobufIndex(index = 5)
    public long expireTime;

    @NonNull
    @ProtobufIndex(index = 6)
    public String name;

    @NonNull
    @ProtobufIndex(index = 1)
    public String pageId;

    @NonNull
    @ProtobufIndex(index = 2)
    public BuryingPointParam param;

    @ProtobufIndex(index = 4)
    public int priority;

    @NonNull
    @ProtobufIndex(index = 3)
    public String type;
    public static ProtobufAdapter<BasicInfoComponent> PROTOBUF_ADAPTER = new MessageNanoAdapter<BasicInfoComponent>() { // from class: com.p1.mobile.putong.feed.data.BasicInfoComponent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BasicInfoComponent basicInfoComponent) {
            String str = basicInfoComponent.pageId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            BuryingPointParam buryingPointParam = basicInfoComponent.param;
            if (buryingPointParam != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, buryingPointParam, BuryingPointParam.PROTOBUF_ADAPTER);
            }
            String str2 = basicInfoComponent.type;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(4, basicInfoComponent.priority) + CodedOutputByteBufferNano.m17228j(5, basicInfoComponent.expireTime);
            String str3 = basicInfoComponent.name;
            if (str3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(6, str3);
            }
            basicInfoComponent.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BasicInfoComponent parse(nb5 nb5Var) throws IOException {
            BasicInfoComponent basicInfoComponent = new BasicInfoComponent();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (basicInfoComponent.pageId == null) {
                        basicInfoComponent.pageId = "";
                    }
                    if (basicInfoComponent.param == null) {
                        basicInfoComponent.param = BuryingPointParam.new_();
                    }
                    if (basicInfoComponent.type == null) {
                        basicInfoComponent.type = "";
                    }
                    if (basicInfoComponent.name != null) {
                        break;
                    }
                    basicInfoComponent.name = "";
                    break;
                }
                if (iM158752u == 10) {
                    basicInfoComponent.pageId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    basicInfoComponent.param = (BuryingPointParam) nb5Var.m158743l(BuryingPointParam.PROTOBUF_ADAPTER);
                } else if (iM158752u == 26) {
                    basicInfoComponent.type = nb5Var.m158750s();
                } else if (iM158752u == 32) {
                    basicInfoComponent.priority = nb5Var.m158741j();
                } else if (iM158752u == 40) {
                    basicInfoComponent.expireTime = nb5Var.m158742k();
                } else {
                    if (iM158752u != 50) {
                        if (basicInfoComponent.pageId == null) {
                            basicInfoComponent.pageId = "";
                        }
                        if (basicInfoComponent.param == null) {
                            basicInfoComponent.param = BuryingPointParam.new_();
                        }
                        if (basicInfoComponent.type == null) {
                            basicInfoComponent.type = "";
                        }
                        if (basicInfoComponent.name != null) {
                            break;
                        }
                        basicInfoComponent.name = "";
                        return basicInfoComponent;
                    }
                    basicInfoComponent.name = nb5Var.m158750s();
                }
            }
            return basicInfoComponent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BasicInfoComponent basicInfoComponent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = basicInfoComponent.pageId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            BuryingPointParam buryingPointParam = basicInfoComponent.param;
            if (buryingPointParam != null) {
                codedOutputByteBufferNano.m17254K(2, buryingPointParam, BuryingPointParam.PROTOBUF_ADAPTER);
            }
            String str2 = basicInfoComponent.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            codedOutputByteBufferNano.m17250G(4, basicInfoComponent.priority);
            codedOutputByteBufferNano.m17252I(5, basicInfoComponent.expireTime);
            String str3 = basicInfoComponent.name;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(6, str3);
            }
        }
    };
    public static JsonAdapter<BasicInfoComponent> JSON_ADAPTER = new ObjectJsonAdapter<BasicInfoComponent>() { // from class: com.p1.mobile.putong.feed.data.BasicInfoComponent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BasicInfoComponent.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BasicInfoComponent newInstance() {
            return new BasicInfoComponent();
        }

        public boolean parseField(BasicInfoComponent basicInfoComponent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "priority":
                    basicInfoComponent.priority = jsonParser.getValueAsInt();
                    return true;
                case "pageId":
                    basicInfoComponent.pageId = jsonParser.getValueAsString();
                    return true;
                case "expireTime":
                    basicInfoComponent.expireTime = jsonParser.getValueAsLong();
                    return true;
                case "name":
                    basicInfoComponent.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    basicInfoComponent.type = jsonParser.getValueAsString();
                    return true;
                case "param":
                    basicInfoComponent.param = BuryingPointParam.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(BasicInfoComponent basicInfoComponent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "priority":
                case "pageId":
                case "expireTime":
                case "name":
                case "type":
                case "param":
                    return true;
                default:
                    return super.parseFieldCheck(basicInfoComponent, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BasicInfoComponent basicInfoComponent, JsonGenerator jsonGenerator) throws IOException {
            String str = basicInfoComponent.pageId;
            if (str != null) {
                jsonGenerator.writeStringField("pageId", str);
            }
            if (basicInfoComponent.param != null) {
                jsonGenerator.writeFieldName("param");
                BuryingPointParam.JSON_ADAPTER.serialize(basicInfoComponent.param, jsonGenerator, true);
            }
            String str2 = basicInfoComponent.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            jsonGenerator.writeNumberField("priority", basicInfoComponent.priority);
            jsonGenerator.writeNumberField("expireTime", basicInfoComponent.expireTime);
            String str3 = basicInfoComponent.name;
            if (str3 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BasicInfoComponent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BasicInfoComponent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BasicInfoComponent new_() {
        BasicInfoComponent basicInfoComponent = new BasicInfoComponent();
        basicInfoComponent.nullCheck();
        return basicInfoComponent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BasicInfoComponent mo223809clone() {
        BasicInfoComponent basicInfoComponent = new BasicInfoComponent();
        basicInfoComponent.pageId = this.pageId;
        BuryingPointParam buryingPointParam = this.param;
        if (buryingPointParam != null) {
            basicInfoComponent.param = buryingPointParam.mo223809clone();
        }
        basicInfoComponent.type = this.type;
        basicInfoComponent.priority = this.priority;
        basicInfoComponent.expireTime = this.expireTime;
        basicInfoComponent.name = this.name;
        return basicInfoComponent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BasicInfoComponent)) {
            return false;
        }
        BasicInfoComponent basicInfoComponent = (BasicInfoComponent) obj;
        return ValueObject.util_equals(this.pageId, basicInfoComponent.pageId) && ValueObject.util_equals(this.param, basicInfoComponent.param) && ValueObject.util_equals(this.type, basicInfoComponent.type) && this.priority == basicInfoComponent.priority && this.expireTime == basicInfoComponent.expireTime && ValueObject.util_equals(this.name, basicInfoComponent.name);
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
        String str = this.pageId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BuryingPointParam buryingPointParam = this.param;
        int iHashCode2 = (iHashCode + (buryingPointParam != null ? buryingPointParam.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41) + this.priority) * 41;
        long j = this.expireTime;
        int i3 = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 41;
        String str3 = this.name;
        int iHashCode4 = i3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.pageId == null) {
            this.pageId = "";
        }
        if (this.param == null) {
            this.param = BuryingPointParam.new_();
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
