package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.Dimensions;
import com.p000p1.mobile.putong.core.data.IdealTypes;
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
import java.util.Iterator;
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class PrivateCustomSetting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "privatecustomsetting";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<Dimensions> dimensions;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<IdealTypes> idealTypes;
    public static ProtobufAdapter<PrivateCustomSetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrivateCustomSetting>() { // from class: com.p1.mobile.putong.core.data.PrivateCustomSetting.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PrivateCustomSetting privateCustomSetting) {
            List<IdealTypes> list = privateCustomSetting.idealTypes;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, IdealTypes.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<Dimensions> list2 = privateCustomSetting.dimensions;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, Dimensions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) privateCustomSetting).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PrivateCustomSetting m14869parse(nb5 nb5Var) throws IOException {
            PrivateCustomSetting privateCustomSetting = new PrivateCustomSetting();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (privateCustomSetting.idealTypes == null) {
                        privateCustomSetting.idealTypes = new ArrayList();
                    }
                    if (privateCustomSetting.dimensions != null) {
                        break;
                    }
                    privateCustomSetting.dimensions = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    privateCustomSetting.idealTypes = (List) nb5Var.l(IdealTypes.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (privateCustomSetting.idealTypes == null) {
                            privateCustomSetting.idealTypes = new ArrayList();
                        }
                        if (privateCustomSetting.dimensions != null) {
                            break;
                        }
                        privateCustomSetting.dimensions = new ArrayList();
                        return privateCustomSetting;
                    }
                    privateCustomSetting.dimensions = (List) nb5Var.l(Dimensions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return privateCustomSetting;
        }

        public void serialize(PrivateCustomSetting privateCustomSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<IdealTypes> list = privateCustomSetting.idealTypes;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, IdealTypes.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Dimensions> list2 = privateCustomSetting.dimensions;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, Dimensions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<PrivateCustomSetting> JSON_ADAPTER = new ObjectJsonAdapter<PrivateCustomSetting>() { // from class: com.p1.mobile.putong.core.data.PrivateCustomSetting.2
        public Class getDataClass() {
            return PrivateCustomSetting.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PrivateCustomSetting m14870newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrivateCustomSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrivateCustomSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PrivateCustomSetting new_() {
        PrivateCustomSetting privateCustomSetting = new PrivateCustomSetting();
        privateCustomSetting.nullCheck();
        return privateCustomSetting;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PrivateCustomSetting m14868clone() {
        PrivateCustomSetting privateCustomSetting = new PrivateCustomSetting();
        List<IdealTypes> list = this.idealTypes;
        if (list != null) {
            privateCustomSetting.idealTypes = ValueObject.util_map(list, new w9j() { // from class: l.is80
                public final Object call(Object obj) {
                    return ((IdealTypes) obj).m13428clone();
                }
            });
        }
        List<Dimensions> list2 = this.dimensions;
        if (list2 != null) {
            privateCustomSetting.dimensions = ValueObject.util_map(list2, new w9j() { // from class: l.js80
                public final Object call(Object obj) {
                    return ((Dimensions) obj).m12612clone();
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
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<IdealTypes> list = this.idealTypes;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<Dimensions> list2 = this.dimensions;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.idealTypes == null) {
            this.idealTypes = new ArrayList();
        }
        if (this.dimensions == null) {
            this.dimensions = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
