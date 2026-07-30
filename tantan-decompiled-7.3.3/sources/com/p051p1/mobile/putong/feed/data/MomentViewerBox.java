package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.ViewersBox;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class MomentViewerBox extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentviewerbox";
    public int count;

    @NonNull
    public List<ViewersBox> viewers;
    public static ProtobufAdapter<MomentViewerBox> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentViewerBox>() { // from class: com.p1.mobile.putong.feed.data.MomentViewerBox.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentViewerBox parse(nc5 nc5Var) throws IOException {
            MomentViewerBox momentViewerBox = new MomentViewerBox();
            int iM162497u = nc5Var.m162497u();
            List<ViewersBox> list = momentViewerBox.viewers;
            if (iM162497u != 0) {
                if (list == null) {
                    momentViewerBox.viewers = new ArrayList();
                    return momentViewerBox;
                }
            } else if (list == null) {
                momentViewerBox.viewers = new ArrayList();
            }
            return momentViewerBox;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentViewerBox momentViewerBox, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MomentViewerBox momentViewerBox) {
            momentViewerBox.cachedSize = 0;
            return 0;
        }
    };
    public static JsonAdapter<MomentViewerBox> JSON_ADAPTER = new ObjectJsonAdapter<MomentViewerBox>() { // from class: com.p1.mobile.putong.feed.data.MomentViewerBox.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentViewerBox.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MomentViewerBox newInstance() {
            return new MomentViewerBox();
        }

        public boolean parseField(MomentViewerBox momentViewerBox, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("count")) {
                momentViewerBox.count = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("viewers")) {
                return false;
            }
            momentViewerBox.viewers = JsonAdapter.parseArray(jsonParser, ViewersBox.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(MomentViewerBox momentViewerBox, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("count") || str.equals("viewers")) {
                return true;
            }
            return super.parseFieldCheck(momentViewerBox, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentViewerBox momentViewerBox, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("count", momentViewerBox.count);
            if (momentViewerBox.viewers != null) {
                jsonGenerator.writeFieldName("viewers");
                JsonAdapter.serializeArray(momentViewerBox.viewers, jsonGenerator, ViewersBox.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentViewerBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentViewerBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentViewerBox new_() {
        MomentViewerBox momentViewerBox = new MomentViewerBox();
        momentViewerBox.nullCheck();
        return momentViewerBox;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MomentViewerBox mo225055clone() {
        MomentViewerBox momentViewerBox = new MomentViewerBox();
        momentViewerBox.count = this.count;
        List<ViewersBox> list = this.viewers;
        if (list != null) {
            momentViewerBox.viewers = ValueObject.util_map(list, new qcj() { // from class: l.gt00
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ViewersBox) obj).mo225055clone();
                }
            });
        }
        return momentViewerBox;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentViewerBox)) {
            return false;
        }
        MomentViewerBox momentViewerBox = (MomentViewerBox) obj;
        return this.count == momentViewerBox.count && ValueObject.util_equals(this.viewers, momentViewerBox.viewers);
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
        int i2 = ((i * 41) + this.count) * 41;
        List<ViewersBox> list = this.viewers;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.viewers == null) {
            this.viewers = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
