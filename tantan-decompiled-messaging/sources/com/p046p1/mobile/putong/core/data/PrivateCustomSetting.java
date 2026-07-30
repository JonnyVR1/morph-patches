package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.Dimensions;
import com.p046p1.mobile.putong.core.data.IdealTypes;
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
import java.util.Iterator;
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class PrivateCustomSetting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "privatecustomsetting";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Dimensions> dimensions;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<IdealTypes> idealTypes;
    public static ProtobufAdapter<PrivateCustomSetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrivateCustomSetting>() { // from class: com.p1.mobile.putong.core.data.PrivateCustomSetting.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PrivateCustomSetting privateCustomSetting) {
            List<IdealTypes> list = privateCustomSetting.idealTypes;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, IdealTypes.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<Dimensions> list2 = privateCustomSetting.dimensions;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, Dimensions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            privateCustomSetting.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PrivateCustomSetting parse(nb5 nb5Var) throws IOException {
            PrivateCustomSetting privateCustomSetting = new PrivateCustomSetting();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (privateCustomSetting.idealTypes == null) {
                        privateCustomSetting.idealTypes = new ArrayList();
                    }
                    if (privateCustomSetting.dimensions != null) {
                        break;
                    }
                    privateCustomSetting.dimensions = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    privateCustomSetting.idealTypes = (List) nb5Var.m158743l(IdealTypes.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (privateCustomSetting.idealTypes == null) {
                            privateCustomSetting.idealTypes = new ArrayList();
                        }
                        if (privateCustomSetting.dimensions != null) {
                            break;
                        }
                        privateCustomSetting.dimensions = new ArrayList();
                        return privateCustomSetting;
                    }
                    privateCustomSetting.dimensions = (List) nb5Var.m158743l(Dimensions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return privateCustomSetting;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PrivateCustomSetting privateCustomSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<IdealTypes> list = privateCustomSetting.idealTypes;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, IdealTypes.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Dimensions> list2 = privateCustomSetting.dimensions;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, Dimensions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<PrivateCustomSetting> JSON_ADAPTER = new ObjectJsonAdapter<PrivateCustomSetting>() { // from class: com.p1.mobile.putong.core.data.PrivateCustomSetting.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PrivateCustomSetting.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PrivateCustomSetting newInstance() {
            return new PrivateCustomSetting();
        }

        public boolean parseField(PrivateCustomSetting privateCustomSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("idealTypes")) {
                privateCustomSetting.idealTypes = JsonAdapter.parseArray(jsonParser, IdealTypes.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(Dimensions.TYPE)) {
                return false;
            }
            privateCustomSetting.dimensions = JsonAdapter.parseArray(jsonParser, Dimensions.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(PrivateCustomSetting privateCustomSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("idealTypes") || str.equals(Dimensions.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(privateCustomSetting, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PrivateCustomSetting privateCustomSetting, JsonGenerator jsonGenerator) throws IOException {
            if (privateCustomSetting.idealTypes != null) {
                jsonGenerator.writeFieldName("idealTypes");
                JsonAdapter.serializeArray(privateCustomSetting.idealTypes, jsonGenerator, IdealTypes.JSON_ADAPTER);
            }
            if (privateCustomSetting.dimensions != null) {
                jsonGenerator.writeFieldName(Dimensions.TYPE);
                JsonAdapter.serializeArray(privateCustomSetting.dimensions, jsonGenerator, Dimensions.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrivateCustomSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrivateCustomSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PrivateCustomSetting new_() {
        PrivateCustomSetting privateCustomSetting = new PrivateCustomSetting();
        privateCustomSetting.nullCheck();
        return privateCustomSetting;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PrivateCustomSetting mo223809clone() {
        PrivateCustomSetting privateCustomSetting = new PrivateCustomSetting();
        List<IdealTypes> list = this.idealTypes;
        if (list != null) {
            privateCustomSetting.idealTypes = ValueObject.util_map(list, new w9j() { // from class: l.is80
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((IdealTypes) obj).mo223809clone();
                }
            });
        }
        List<Dimensions> list2 = this.dimensions;
        if (list2 != null) {
            privateCustomSetting.dimensions = ValueObject.util_map(list2, new w9j() { // from class: l.js80
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Dimensions) obj).mo223809clone();
                }
            });
        }
        return privateCustomSetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrivateCustomSetting)) {
            return false;
        }
        PrivateCustomSetting privateCustomSetting = (PrivateCustomSetting) obj;
        return ValueObject.util_equals(this.idealTypes, privateCustomSetting.idealTypes) && ValueObject.util_equals(this.dimensions, privateCustomSetting.dimensions);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public boolean hasIdealTypesSelected() {
        Iterator<IdealTypes> it = this.idealTypes.iterator();
        while (it.hasNext()) {
            if (it.next().selected) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<IdealTypes> list = this.idealTypes;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<Dimensions> list2 = this.dimensions;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.idealTypes == null) {
            this.idealTypes = new ArrayList();
        }
        if (this.dimensions == null) {
            this.dimensions = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
