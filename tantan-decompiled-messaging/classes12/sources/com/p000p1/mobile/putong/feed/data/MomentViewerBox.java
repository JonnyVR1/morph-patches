package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.ViewersBox;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentViewerBox extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentviewerbox";
    public int count;

    @NonNull
    public List<ViewersBox> viewers;
    public static ProtobufAdapter<MomentViewerBox> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentViewerBox>() { // from class: com.p1.mobile.putong.feed.data.MomentViewerBox.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentViewerBox m19657parse(nb5 nb5Var) throws IOException {
            MomentViewerBox momentViewerBox = new MomentViewerBox();
            int iU = nb5Var.u();
            List<ViewersBox> list = momentViewerBox.viewers;
            if (iU != 0) {
                if (list == null) {
                    momentViewerBox.viewers = new ArrayList();
                    return momentViewerBox;
                }
            } else if (list == null) {
                momentViewerBox.viewers = new ArrayList();
            }
            return momentViewerBox;
        }

        public void serialize(MomentViewerBox momentViewerBox, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        }

        public int computeAndCacheSize(MomentViewerBox momentViewerBox) {
            ((MessageNano) momentViewerBox).cachedSize = 0;
            return 0;
        }
    };
    public static JsonAdapter<MomentViewerBox> JSON_ADAPTER = new ObjectJsonAdapter<MomentViewerBox>() { // from class: com.p1.mobile.putong.feed.data.MomentViewerBox.2
        public Class getDataClass() {
            return MomentViewerBox.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MomentViewerBox mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentViewerBox momentViewerBox, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("count", momentViewerBox.count);
            if (momentViewerBox.viewers != null) {
                jsonGenerator.writeFieldName("viewers");
                JsonAdapter.serializeArray(momentViewerBox.viewers, jsonGenerator, ViewersBox.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentViewerBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentViewerBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentViewerBox new_() {
        MomentViewerBox momentViewerBox = new MomentViewerBox();
        momentViewerBox.nullCheck();
        return momentViewerBox;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentViewerBox m19656clone() {
        MomentViewerBox momentViewerBox = new MomentViewerBox();
        momentViewerBox.count = this.count;
        List<ViewersBox> list = this.viewers;
        if (list != null) {
            momentViewerBox.viewers = ValueObject.util_map(list, new w9j() { // from class: l.xk00
                public final Object call(Object obj) {
                    return ((ViewersBox) obj).m19818clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.count) * 41;
        List<ViewersBox> list = this.viewers;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.viewers == null) {
            this.viewers = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
