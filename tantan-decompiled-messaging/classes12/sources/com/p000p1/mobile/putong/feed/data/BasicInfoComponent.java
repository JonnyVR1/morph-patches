package com.p000p1.mobile.putong.feed.data;

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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BasicInfoComponent basicInfoComponent) {
            String str = basicInfoComponent.pageId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            BuryingPointParam buryingPointParam = basicInfoComponent.param;
            if (buryingPointParam != null) {
                iO += CodedOutputByteBufferNano.l(2, buryingPointParam, BuryingPointParam.PROTOBUF_ADAPTER);
            }
            String str2 = basicInfoComponent.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            int iH = iO + CodedOutputByteBufferNano.h(4, basicInfoComponent.priority) + CodedOutputByteBufferNano.j(5, basicInfoComponent.expireTime);
            String str3 = basicInfoComponent.name;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(6, str3);
            }
            ((MessageNano) basicInfoComponent).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BasicInfoComponent m19428parse(nb5 nb5Var) throws IOException {
            BasicInfoComponent basicInfoComponent = new BasicInfoComponent();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    basicInfoComponent.pageId = nb5Var.s();
                } else if (iU == 18) {
                    basicInfoComponent.param = (BuryingPointParam) nb5Var.l(BuryingPointParam.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    basicInfoComponent.type = nb5Var.s();
                } else if (iU == 32) {
                    basicInfoComponent.priority = nb5Var.j();
                } else if (iU == 40) {
                    basicInfoComponent.expireTime = nb5Var.k();
                } else {
                    if (iU != 50) {
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
                    basicInfoComponent.name = nb5Var.s();
                }
            }
            return basicInfoComponent;
        }

        public void serialize(BasicInfoComponent basicInfoComponent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = basicInfoComponent.pageId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            BuryingPointParam buryingPointParam = basicInfoComponent.param;
            if (buryingPointParam != null) {
                codedOutputByteBufferNano.K(2, buryingPointParam, BuryingPointParam.PROTOBUF_ADAPTER);
            }
            String str2 = basicInfoComponent.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            codedOutputByteBufferNano.G(4, basicInfoComponent.priority);
            codedOutputByteBufferNano.I(5, basicInfoComponent.expireTime);
            String str3 = basicInfoComponent.name;
            if (str3 != null) {
                codedOutputByteBufferNano.R(6, str3);
            }
        }
    };
    public static JsonAdapter<BasicInfoComponent> JSON_ADAPTER = new ObjectJsonAdapter<BasicInfoComponent>() { // from class: com.p1.mobile.putong.feed.data.BasicInfoComponent.2
        public Class getDataClass() {
            return BasicInfoComponent.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public BasicInfoComponent mo17830newInstance() {
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
                    basicInfoComponent.param = (BuryingPointParam) BuryingPointParam.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                jsonGenerator.writeStringField("name", str3);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BasicInfoComponent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BasicInfoComponent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BasicInfoComponent new_() {
        BasicInfoComponent basicInfoComponent = new BasicInfoComponent();
        basicInfoComponent.nullCheck();
        return basicInfoComponent;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BasicInfoComponent m19427clone() {
        BasicInfoComponent basicInfoComponent = new BasicInfoComponent();
        basicInfoComponent.pageId = this.pageId;
        BuryingPointParam buryingPointParam = this.param;
        if (buryingPointParam != null) {
            basicInfoComponent.param = buryingPointParam.m19433clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
