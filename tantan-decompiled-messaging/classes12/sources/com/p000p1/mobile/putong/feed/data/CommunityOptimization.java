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
public class CommunityOptimization extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "communityoptimization";

    @ProtobufIndex(index = 1)
    public boolean enable;
    public static ProtobufAdapter<CommunityOptimization> PROTOBUF_ADAPTER = new MessageNanoAdapter<CommunityOptimization>() { // from class: com.p1.mobile.putong.feed.data.CommunityOptimization.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CommunityOptimization communityOptimization) {
            int iB = CodedOutputByteBufferNano.b(1, communityOptimization.enable);
            ((MessageNano) communityOptimization).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CommunityOptimization m19467parse(nb5 nb5Var) throws IOException {
            CommunityOptimization communityOptimization = new CommunityOptimization();
            while (nb5Var.u() == 8) {
                communityOptimization.enable = nb5Var.g();
            }
            return communityOptimization;
        }

        public void serialize(CommunityOptimization communityOptimization, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, communityOptimization.enable);
        }
    };
    public static JsonAdapter<CommunityOptimization> JSON_ADAPTER = new ObjectJsonAdapter<CommunityOptimization>() { // from class: com.p1.mobile.putong.feed.data.CommunityOptimization.2
        public Class getDataClass() {
            return CommunityOptimization.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CommunityOptimization mo17830newInstance() {
            return new CommunityOptimization();
        }

        public boolean parseField(CommunityOptimization communityOptimization, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("enable")) {
                return false;
            }
            communityOptimization.enable = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(CommunityOptimization communityOptimization, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("enable")) {
                return true;
            }
            return super.parseFieldCheck(communityOptimization, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CommunityOptimization communityOptimization, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", communityOptimization.enable);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CommunityOptimization) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CommunityOptimization) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CommunityOptimization new_() {
        CommunityOptimization communityOptimization = new CommunityOptimization();
        communityOptimization.nullCheck();
        return communityOptimization;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CommunityOptimization m19466clone() {
        CommunityOptimization communityOptimization = new CommunityOptimization();
        communityOptimization.enable = this.enable;
        return communityOptimization;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof CommunityOptimization) && this.enable == ((CommunityOptimization) obj).enable;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.enable ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
