package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiPkPanelUser;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveMultiPkPanel extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMultiPkPanel> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMultiPkPanel>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMultiPkPanel.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMultiPkPanel.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMultiPkPanel newInstance() {
            return new BLiveMultiPkPanel();
        }

        public boolean parseField(BLiveMultiPkPanel bLiveMultiPkPanel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("users")) {
                return false;
            }
            bLiveMultiPkPanel.users = JsonAdapter.parseArray(jsonParser, BLiveMultiPkPanelUser.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMultiPkPanel bLiveMultiPkPanel, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveMultiPkPanel.users != null) {
                jsonGenerator.writeFieldName("users");
                JsonAdapter.serializeArray(bLiveMultiPkPanel.users, jsonGenerator, BLiveMultiPkPanelUser.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMultiPkPanel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemultipkpanel";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveMultiPkPanelUser> users;

    public static BLiveMultiPkPanel new_() {
        BLiveMultiPkPanel bLiveMultiPkPanel = new BLiveMultiPkPanel();
        bLiveMultiPkPanel.nullCheck();
        return bLiveMultiPkPanel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMultiPkPanel mo225055clone() {
        BLiveMultiPkPanel bLiveMultiPkPanel = new BLiveMultiPkPanel();
        List<BLiveMultiPkPanelUser> list = this.users;
        if (list != null) {
            bLiveMultiPkPanel.users = ValueObject.util_map(list, new qcj() { // from class: l.i32
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveMultiPkPanelUser) obj).mo225055clone();
                }
            });
        }
        return bLiveMultiPkPanel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveMultiPkPanel) {
            return ValueObject.util_equals(this.users, ((BLiveMultiPkPanel) obj).users);
        }
        return false;
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
        List<BLiveMultiPkPanelUser> list = this.users;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.users == null) {
            this.users = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
