package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLivePKCardItem;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLivePKCardShowList extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePKCardShowList> JSON_ADAPTER = new ObjectJsonAdapter<BLivePKCardShowList>() { // from class: com.p1.mobile.putong.live.base.data.BLivePKCardShowList.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePKCardShowList.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePKCardShowList newInstance() {
            return new BLivePKCardShowList();
        }

        public boolean parseField(BLivePKCardShowList bLivePKCardShowList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("itemCardList")) {
                return false;
            }
            bLivePKCardShowList.itemCardList = JsonAdapter.parseArray(jsonParser, BLivePKCardItem.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePKCardShowList bLivePKCardShowList, JsonGenerator jsonGenerator) throws IOException {
            if (bLivePKCardShowList.itemCardList != null) {
                jsonGenerator.writeFieldName("itemCardList");
                JsonAdapter.serializeArray(bLivePKCardShowList.itemCardList, jsonGenerator, BLivePKCardItem.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePKCardShowList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepkcardshowlist";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLivePKCardItem> itemCardList;

    public static BLivePKCardShowList new_() {
        BLivePKCardShowList bLivePKCardShowList = new BLivePKCardShowList();
        bLivePKCardShowList.nullCheck();
        return bLivePKCardShowList;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePKCardShowList mo223809clone() {
        BLivePKCardShowList bLivePKCardShowList = new BLivePKCardShowList();
        List<BLivePKCardItem> list = this.itemCardList;
        if (list != null) {
            bLivePKCardShowList.itemCardList = ValueObject.util_map(list, new w9j() { // from class: l.w32
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLivePKCardItem) obj).mo223809clone();
                }
            });
        }
        return bLivePKCardShowList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLivePKCardShowList) {
            return ValueObject.util_equals(this.itemCardList, ((BLivePKCardShowList) obj).itemCardList);
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
        List<BLivePKCardItem> list = this.itemCardList;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.itemCardList == null) {
            this.itemCardList = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
