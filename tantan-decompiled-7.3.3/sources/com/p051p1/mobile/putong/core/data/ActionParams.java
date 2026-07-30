package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.ActionParams;
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
public class ActionParams extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "actionparams";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> businesses;

    @ProtobufIndex(index = 4)
    public int insertOffsetPosition;

    @ProtobufIndex(index = 3)
    public long insertPosition;

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;
    public static ProtobufAdapter<ActionParams> PROTOBUF_ADAPTER = new MessageNanoAdapter<ActionParams>() { // from class: com.p1.mobile.putong.core.data.ActionParams.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ActionParams actionParams) {
            String str = actionParams.url;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<String> list = actionParams.businesses;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17283j = iM17288o + CodedOutputByteBufferNano.m17283j(3, actionParams.insertPosition) + CodedOutputByteBufferNano.m17281h(4, actionParams.insertOffsetPosition);
            actionParams.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ActionParams parse(nc5 nc5Var) throws IOException {
            ActionParams actionParams = new ActionParams();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (actionParams.url == null) {
                        actionParams.url = "";
                    }
                    if (actionParams.businesses != null) {
                        break;
                    }
                    actionParams.businesses = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    actionParams.url = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    actionParams.businesses = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 24) {
                    actionParams.insertPosition = nc5Var.m162487k();
                } else {
                    if (iM162497u != 32) {
                        if (actionParams.url == null) {
                            actionParams.url = "";
                        }
                        if (actionParams.businesses != null) {
                            break;
                        }
                        actionParams.businesses = new ArrayList();
                        return actionParams;
                    }
                    actionParams.insertOffsetPosition = nc5Var.m162486j();
                }
            }
            return actionParams;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ActionParams actionParams, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = actionParams.url;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<String> list = actionParams.businesses;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17307I(3, actionParams.insertPosition);
            codedOutputByteBufferNano.m17305G(4, actionParams.insertOffsetPosition);
        }
    };
    public static JsonAdapter<ActionParams> JSON_ADAPTER = new ObjectJsonAdapter<ActionParams>() { // from class: com.p1.mobile.putong.core.data.ActionParams.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ActionParams.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ActionParams newInstance() {
            return new ActionParams();
        }

        public boolean parseField(ActionParams actionParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "url":
                    actionParams.url = jsonParser.getValueAsString();
                    return true;
                case "insertOffsetPosition":
                    actionParams.insertOffsetPosition = jsonParser.getValueAsInt();
                    return true;
                case "businesses":
                    actionParams.businesses = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "insertPosition":
                    actionParams.insertPosition = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ActionParams actionParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "url":
                case "insertOffsetPosition":
                case "businesses":
                case "insertPosition":
                    return true;
                default:
                    return super.parseFieldCheck(actionParams, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ActionParams actionParams, JsonGenerator jsonGenerator) throws IOException {
            String str = actionParams.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
            if (actionParams.businesses != null) {
                jsonGenerator.writeFieldName("businesses");
                JsonAdapter.serializeArray(actionParams.businesses, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("insertPosition", actionParams.insertPosition);
            jsonGenerator.writeNumberField("insertOffsetPosition", actionParams.insertOffsetPosition);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ActionParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ActionParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36208a(String str) {
        return str;
    }

    public static ActionParams new_() {
        ActionParams actionParams = new ActionParams();
        actionParams.nullCheck();
        return actionParams;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ActionParams mo225055clone() {
        ActionParams actionParams = new ActionParams();
        actionParams.url = this.url;
        List<String> list = this.businesses;
        if (list != null) {
            actionParams.businesses = ValueObject.util_map(list, new qcj() { // from class: l.s30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ActionParams.m36208a((String) obj);
                }
            });
        }
        actionParams.insertPosition = this.insertPosition;
        actionParams.insertOffsetPosition = this.insertOffsetPosition;
        return actionParams;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActionParams)) {
            return false;
        }
        ActionParams actionParams = (ActionParams) obj;
        return ValueObject.util_equals(this.url, actionParams.url) && ValueObject.util_equals(this.businesses, actionParams.businesses) && this.insertPosition == actionParams.insertPosition && this.insertOffsetPosition == actionParams.insertOffsetPosition;
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
        String str = this.url;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.businesses;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        long j = this.insertPosition;
        int i3 = ((((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.insertOffsetPosition;
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
        if (this.businesses == null) {
            this.businesses = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
