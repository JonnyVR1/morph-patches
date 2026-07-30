package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.CameraBeautyMode;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class CameraBeautySet extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "camerabeautyset";

    @NonNull
    @ProtobufIndex(index = 51)
    public List<CameraBeautyMode> title;
    public static ProtobufAdapter<CameraBeautySet> PROTOBUF_ADAPTER = new MessageNanoAdapter<CameraBeautySet>() { // from class: com.p1.mobile.putong.feed.data.CameraBeautySet.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CameraBeautySet cameraBeautySet) {
            List<CameraBeautyMode> list = cameraBeautySet.title;
            int iL = list != null ? CodedOutputByteBufferNano.l(51, list, CameraBeautyMode.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) cameraBeautySet).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CameraBeautySet m19443parse(nb5 nb5Var) throws IOException {
            CameraBeautySet cameraBeautySet = new CameraBeautySet();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (cameraBeautySet.title != null) {
                        break;
                    }
                    cameraBeautySet.title = new ArrayList();
                    break;
                }
                if (iU != 410) {
                    if (cameraBeautySet.title != null) {
                        break;
                    }
                    cameraBeautySet.title = new ArrayList();
                    return cameraBeautySet;
                }
                cameraBeautySet.title = (List) nb5Var.l(CameraBeautyMode.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return cameraBeautySet;
        }

        public void serialize(CameraBeautySet cameraBeautySet, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<CameraBeautyMode> list = cameraBeautySet.title;
            if (list != null) {
                codedOutputByteBufferNano.K(51, list, CameraBeautyMode.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<CameraBeautySet> JSON_ADAPTER = new ObjectJsonAdapter<CameraBeautySet>() { // from class: com.p1.mobile.putong.feed.data.CameraBeautySet.2
        public Class getDataClass() {
            return CameraBeautySet.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CameraBeautySet mo17830newInstance() {
            return new CameraBeautySet();
        }

        public boolean parseField(CameraBeautySet cameraBeautySet, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("title")) {
                return false;
            }
            cameraBeautySet.title = JsonAdapter.parseArray(jsonParser, CameraBeautyMode.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(CameraBeautySet cameraBeautySet, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("title")) {
                return true;
            }
            return super.parseFieldCheck(cameraBeautySet, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CameraBeautySet cameraBeautySet, JsonGenerator jsonGenerator) throws IOException {
            if (cameraBeautySet.title != null) {
                jsonGenerator.writeFieldName("title");
                JsonAdapter.serializeArray(cameraBeautySet.title, jsonGenerator, CameraBeautyMode.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CameraBeautySet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CameraBeautySet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CameraBeautySet new_() {
        CameraBeautySet cameraBeautySet = new CameraBeautySet();
        cameraBeautySet.nullCheck();
        return cameraBeautySet;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CameraBeautySet m19442clone() {
        CameraBeautySet cameraBeautySet = new CameraBeautySet();
        List<CameraBeautyMode> list = this.title;
        if (list != null) {
            cameraBeautySet.title = ValueObject.util_map(list, new w9j() { // from class: l.l84
                public final Object call(Object obj) {
                    return ((CameraBeautyMode) obj).m19439clone();
                }
            });
        }
        return cameraBeautySet;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CameraBeautySet) {
            return ValueObject.util_equals(this.title, ((CameraBeautySet) obj).title);
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
        List<CameraBeautyMode> list = this.title;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.title == null) {
            this.title = new ArrayList();
        }
    }

    public CameraBeautySet subtract(CameraBeautySet cameraBeautySet) {
        CameraBeautySet cameraBeautySet2 = new CameraBeautySet();
        if (!ValueObject.util_equals(this.title, cameraBeautySet.title)) {
            cameraBeautySet2.title = this.title;
        }
        if (cameraBeautySet2.equals(new CameraBeautySet())) {
            return null;
        }
        return cameraBeautySet2;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
