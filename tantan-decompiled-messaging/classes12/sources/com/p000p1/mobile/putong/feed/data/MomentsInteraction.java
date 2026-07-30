package com.p000p1.mobile.putong.feed.data;

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
public class MomentsInteraction extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentsinteraction";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = 2)
    public int limitTime;
    public static ProtobufAdapter<MomentsInteraction> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentsInteraction>() { // from class: com.p1.mobile.putong.feed.data.MomentsInteraction.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MomentsInteraction momentsInteraction) {
            int iB = CodedOutputByteBufferNano.b(1, momentsInteraction.enable) + CodedOutputByteBufferNano.h(2, momentsInteraction.limitTime);
            ((MessageNano) momentsInteraction).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentsInteraction m19666parse(nb5 nb5Var) throws IOException {
            MomentsInteraction momentsInteraction = new MomentsInteraction();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    momentsInteraction.enable = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return momentsInteraction;
                    }
                    momentsInteraction.limitTime = nb5Var.j();
                }
            }
        }

        public void serialize(MomentsInteraction momentsInteraction, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, momentsInteraction.enable);
            codedOutputByteBufferNano.G(2, momentsInteraction.limitTime);
        }
    };
    public static JsonAdapter<MomentsInteraction> JSON_ADAPTER = new ObjectJsonAdapter<MomentsInteraction>() { // from class: com.p1.mobile.putong.feed.data.MomentsInteraction.2
        public Class getDataClass() {
            return MomentsInteraction.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MomentsInteraction mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentsInteraction momentsInteraction, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", momentsInteraction.enable);
            jsonGenerator.writeNumberField("limitTime", momentsInteraction.limitTime);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentsInteraction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentsInteraction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentsInteraction new_() {
        MomentsInteraction momentsInteraction = new MomentsInteraction();
        momentsInteraction.nullCheck();
        return momentsInteraction;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentsInteraction m19665clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.limitTime;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
