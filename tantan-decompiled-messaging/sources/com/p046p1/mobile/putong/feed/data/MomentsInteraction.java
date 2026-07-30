package com.p046p1.mobile.putong.feed.data;

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
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, momentsInteraction.enable) + CodedOutputByteBufferNano.m17226h(2, momentsInteraction.limitTime);
            momentsInteraction.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentsInteraction parse(nb5 nb5Var) throws IOException {
            MomentsInteraction momentsInteraction = new MomentsInteraction();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    momentsInteraction.enable = nb5Var.m158738g();
                } else {
                    if (iM158752u != 16) {
                        return momentsInteraction;
                    }
                    momentsInteraction.limitTime = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentsInteraction momentsInteraction, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, momentsInteraction.enable);
            codedOutputByteBufferNano.m17250G(2, momentsInteraction.limitTime);
        }
    };
    public static JsonAdapter<MomentsInteraction> JSON_ADAPTER = new ObjectJsonAdapter<MomentsInteraction>() { // from class: com.p1.mobile.putong.feed.data.MomentsInteraction.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentsInteraction.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentsInteraction momentsInteraction, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", momentsInteraction.enable);
            jsonGenerator.writeNumberField("limitTime", momentsInteraction.limitTime);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentsInteraction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public MomentsInteraction mo223809clone() {
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
