package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ActionParams;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ActionParams extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "actionparams";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> businesses;

    @ProtobufIndex(index = 4)
    public int insertOffsetPosition;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public long insertPosition;

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;
    public static ProtobufAdapter<ActionParams> PROTOBUF_ADAPTER = new MessageNanoAdapter<ActionParams>() { // from class: com.p1.mobile.putong.core.data.ActionParams.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ActionParams actionParams) {
            String str = actionParams.url;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<String> list = actionParams.businesses;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iJ = iO + CodedOutputByteBufferNano.j(3, actionParams.insertPosition) + CodedOutputByteBufferNano.h(4, actionParams.insertOffsetPosition);
            ((MessageNano) actionParams).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ActionParams m11509parse(nb5 nb5Var) throws IOException {
            ActionParams actionParams = new ActionParams();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (actionParams.url == null) {
                        actionParams.url = "";
                    }
                    if (actionParams.businesses != null) {
                        break;
                    }
                    actionParams.businesses = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    actionParams.url = nb5Var.s();
                } else if (iU == 18) {
                    actionParams.businesses = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 24) {
                    actionParams.insertPosition = nb5Var.k();
                } else {
                    if (iU != 32) {
                        if (actionParams.url == null) {
                            actionParams.url = "";
                        }
                        if (actionParams.businesses != null) {
                            break;
                        }
                        actionParams.businesses = new ArrayList();
                        return actionParams;
                    }
                    actionParams.insertOffsetPosition = nb5Var.j();
                }
            }
            return actionParams;
        }

        public void serialize(ActionParams actionParams, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = actionParams.url;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<String> list = actionParams.businesses;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.I(3, actionParams.insertPosition);
            codedOutputByteBufferNano.G(4, actionParams.insertOffsetPosition);
        }
    };
    public static JsonAdapter<ActionParams> JSON_ADAPTER = new ObjectJsonAdapter<ActionParams>() { // from class: com.p1.mobile.putong.core.data.ActionParams.2
        public Class getDataClass() {
            return ActionParams.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ActionParams m11510newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ActionParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ActionParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m7a(String str) {
        return str;
    }

    public static ActionParams new_() {
        ActionParams actionParams = new ActionParams();
        actionParams.nullCheck();
        return actionParams;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ActionParams m11508clone() {
        ActionParams actionParams = new ActionParams();
        actionParams.url = this.url;
        List<String> list = this.businesses;
        if (list != null) {
            actionParams.businesses = ValueObject.util_map(list, new w9j() { // from class: l.y30
                public final Object call(Object obj) {
                    return ActionParams.m7a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
        if (this.businesses == null) {
            this.businesses = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
