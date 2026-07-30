package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.TickleEnterUser;
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
public class TickleEnterInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tickleenterinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<TickleEnterUser> enterList;
    public static ProtobufAdapter<TickleEnterInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<TickleEnterInfo>() { // from class: com.p1.mobile.putong.core.data.TickleEnterInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TickleEnterInfo tickleEnterInfo) {
            List<TickleEnterUser> list = tickleEnterInfo.enterList;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, TickleEnterUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) tickleEnterInfo).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TickleEnterInfo m15994parse(nb5 nb5Var) throws IOException {
            TickleEnterInfo tickleEnterInfo = new TickleEnterInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (tickleEnterInfo.enterList != null) {
                        break;
                    }
                    tickleEnterInfo.enterList = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (tickleEnterInfo.enterList != null) {
                        break;
                    }
                    tickleEnterInfo.enterList = new ArrayList();
                    return tickleEnterInfo;
                }
                tickleEnterInfo.enterList = (List) nb5Var.l(TickleEnterUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return tickleEnterInfo;
        }

        public void serialize(TickleEnterInfo tickleEnterInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<TickleEnterUser> list = tickleEnterInfo.enterList;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, TickleEnterUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<TickleEnterInfo> JSON_ADAPTER = new ObjectJsonAdapter<TickleEnterInfo>() { // from class: com.p1.mobile.putong.core.data.TickleEnterInfo.2
        public Class getDataClass() {
            return TickleEnterInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TickleEnterInfo m15995newInstance() {
            return new TickleEnterInfo();
        }

        public boolean parseField(TickleEnterInfo tickleEnterInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("enterList")) {
                return false;
            }
            tickleEnterInfo.enterList = JsonAdapter.parseArray(jsonParser, TickleEnterUser.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(TickleEnterInfo tickleEnterInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("enterList")) {
                return true;
            }
            return super.parseFieldCheck(tickleEnterInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(TickleEnterInfo tickleEnterInfo, JsonGenerator jsonGenerator) throws IOException {
            if (tickleEnterInfo.enterList != null) {
                jsonGenerator.writeFieldName("enterList");
                JsonAdapter.serializeArray(tickleEnterInfo.enterList, jsonGenerator, TickleEnterUser.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TickleEnterInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TickleEnterInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TickleEnterInfo new_() {
        TickleEnterInfo tickleEnterInfo = new TickleEnterInfo();
        tickleEnterInfo.nullCheck();
        return tickleEnterInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TickleEnterInfo m15993clone() {
        TickleEnterInfo tickleEnterInfo = new TickleEnterInfo();
        List<TickleEnterUser> list = this.enterList;
        if (list != null) {
            tickleEnterInfo.enterList = ValueObject.util_map(list, new w9j() { // from class: l.jqi0
                public final Object call(Object obj) {
                    return ((TickleEnterUser) obj).m15997clone();
                }
            });
        }
        return tickleEnterInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TickleEnterInfo) {
            return ValueObject.util_equals(this.enterList, ((TickleEnterInfo) obj).enterList);
        }
        return false;
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
        List<TickleEnterUser> list = this.enterList;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.enterList == null) {
            this.enterList = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
