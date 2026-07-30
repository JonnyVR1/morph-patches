package com.p051p1.mobile.putong.feed.data;

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

/* JADX INFO: loaded from: classes13.dex */
public class MomentsInteraction extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentsinteraction";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = 2)
    public int limitTime;
    public static ProtobufAdapter<MomentsInteraction> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentsInteraction>() { // from class: com.p1.mobile.putong.feed.data.MomentsInteraction.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MomentsInteraction momentsInteraction) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, momentsInteraction.enable) + CodedOutputByteBufferNano.m17281h(2, momentsInteraction.limitTime);
            momentsInteraction.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentsInteraction parse(nc5 nc5Var) throws IOException {
            MomentsInteraction momentsInteraction = new MomentsInteraction();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    momentsInteraction.enable = nc5Var.m162483g();
                } else {
                    if (iM162497u != 16) {
                        return momentsInteraction;
                    }
                    momentsInteraction.limitTime = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentsInteraction momentsInteraction, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, momentsInteraction.enable);
            codedOutputByteBufferNano.m17305G(2, momentsInteraction.limitTime);
        }
    };
    public static JsonAdapter<MomentsInteraction> JSON_ADAPTER = new ObjectJsonAdapter<MomentsInteraction>() { // from class: com.p1.mobile.putong.feed.data.MomentsInteraction.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentsInteraction.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MomentsInteraction newInstance() {
            return new MomentsInteraction();
        }

        public boolean parseField(MomentsInteraction momentsInteraction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("enable")) {
                momentsInteraction.enable = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("limitTime")) {
                return false;
            }
            momentsInteraction.limitTime = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(MomentsInteraction momentsInteraction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("enable") || str.equals("limitTime")) {
                return true;
            }
            return super.parseFieldCheck(momentsInteraction, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentsInteraction momentsInteraction, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", momentsInteraction.enable);
            jsonGenerator.writeNumberField("limitTime", momentsInteraction.limitTime);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentsInteraction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentsInteraction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentsInteraction new_() {
        MomentsInteraction momentsInteraction = new MomentsInteraction();
        momentsInteraction.nullCheck();
        return momentsInteraction;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MomentsInteraction mo225055clone() {
        MomentsInteraction momentsInteraction = new MomentsInteraction();
        momentsInteraction.enable = this.enable;
        momentsInteraction.limitTime = this.limitTime;
        return momentsInteraction;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentsInteraction)) {
            return false;
        }
        MomentsInteraction momentsInteraction = (MomentsInteraction) obj;
        return this.enable == momentsInteraction.enable && this.limitTime == momentsInteraction.limitTime;
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
        int i2 = (((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.limitTime;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
