package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.InvitationInfo;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class InvitationInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "invitationinfo";

    @ProtobufIndex(index = 1)
    public int invitationCount;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> inviterAvatars;
    public static ProtobufAdapter<InvitationInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<InvitationInfo>() { // from class: com.p1.mobile.putong.core.data.InvitationInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(InvitationInfo invitationInfo) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, invitationInfo.invitationCount);
            List<String> list = invitationInfo.inviterAvatars;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            invitationInfo.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public InvitationInfo parse(nc5 nc5Var) throws IOException {
            InvitationInfo invitationInfo = new InvitationInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (invitationInfo.inviterAvatars != null) {
                        break;
                    }
                    invitationInfo.inviterAvatars = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    invitationInfo.invitationCount = nc5Var.m162486j();
                } else {
                    if (iM162497u != 18) {
                        if (invitationInfo.inviterAvatars != null) {
                            break;
                        }
                        invitationInfo.inviterAvatars = new ArrayList();
                        return invitationInfo;
                    }
                    invitationInfo.inviterAvatars = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return invitationInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(InvitationInfo invitationInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, invitationInfo.invitationCount);
            List<String> list = invitationInfo.inviterAvatars;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<InvitationInfo> JSON_ADAPTER = new ObjectJsonAdapter<InvitationInfo>() { // from class: com.p1.mobile.putong.core.data.InvitationInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return InvitationInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public InvitationInfo newInstance() {
            return new InvitationInfo();
        }

        public boolean parseField(InvitationInfo invitationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("invitationCount")) {
                invitationInfo.invitationCount = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("inviterAvatars")) {
                return false;
            }
            invitationInfo.inviterAvatars = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(InvitationInfo invitationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("invitationCount") || str.equals("inviterAvatars")) {
                return true;
            }
            return super.parseFieldCheck(invitationInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(InvitationInfo invitationInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("invitationCount", invitationInfo.invitationCount);
            if (invitationInfo.inviterAvatars != null) {
                jsonGenerator.writeFieldName("inviterAvatars");
                JsonAdapter.serializeArray(invitationInfo.inviterAvatars, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((InvitationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((InvitationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36635a(String str) {
        return str;
    }

    public static InvitationInfo new_() {
        InvitationInfo invitationInfo = new InvitationInfo();
        invitationInfo.nullCheck();
        return invitationInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public InvitationInfo mo225055clone() {
        InvitationInfo invitationInfo = new InvitationInfo();
        invitationInfo.invitationCount = this.invitationCount;
        List<String> list = this.inviterAvatars;
        if (list != null) {
            invitationInfo.inviterAvatars = ValueObject.util_map(list, new qcj() { // from class: l.ezp
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return InvitationInfo.m36635a((String) obj);
                }
            });
        }
        return invitationInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InvitationInfo)) {
            return false;
        }
        InvitationInfo invitationInfo = (InvitationInfo) obj;
        return this.invitationCount == invitationInfo.invitationCount && ValueObject.util_equals(this.inviterAvatars, invitationInfo.inviterAvatars);
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
        int i2 = ((i * 41) + this.invitationCount) * 41;
        List<String> list = this.inviterAvatars;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.inviterAvatars == null) {
            this.inviterAvatars = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
