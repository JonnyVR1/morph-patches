package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveGamePanelButtons;
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
public class BLiveIntlGamePanelMenus extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveIntlGamePanelMenus> JSON_ADAPTER = new ObjectJsonAdapter<BLiveIntlGamePanelMenus>() { // from class: com.p1.mobile.putong.live.base.data.BLiveIntlGamePanelMenus.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveIntlGamePanelMenus.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveIntlGamePanelMenus newInstance() {
            return new BLiveIntlGamePanelMenus();
        }

        public boolean parseField(BLiveIntlGamePanelMenus bLiveIntlGamePanelMenus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(Constants.KEY_BUTTONS)) {
                return false;
            }
            bLiveIntlGamePanelMenus.buttons = JsonAdapter.parseArray(jsonParser, BLiveGamePanelButtons.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveIntlGamePanelMenus bLiveIntlGamePanelMenus, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveIntlGamePanelMenus.buttons != null) {
                jsonGenerator.writeFieldName(Constants.KEY_BUTTONS);
                JsonAdapter.serializeArray(bLiveIntlGamePanelMenus.buttons, jsonGenerator, BLiveGamePanelButtons.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveIntlGamePanelMenus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveintlgamepanelmenus";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveGamePanelButtons> buttons;

    public static BLiveIntlGamePanelMenus new_() {
        BLiveIntlGamePanelMenus bLiveIntlGamePanelMenus = new BLiveIntlGamePanelMenus();
        bLiveIntlGamePanelMenus.nullCheck();
        return bLiveIntlGamePanelMenus;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveIntlGamePanelMenus mo225055clone() {
        BLiveIntlGamePanelMenus bLiveIntlGamePanelMenus = new BLiveIntlGamePanelMenus();
        List<BLiveGamePanelButtons> list = this.buttons;
        if (list != null) {
            bLiveIntlGamePanelMenus.buttons = ValueObject.util_map(list, new qcj() { // from class: l.u12
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveGamePanelButtons) obj).mo225055clone();
                }
            });
        }
        return bLiveIntlGamePanelMenus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveIntlGamePanelMenus) {
            return ValueObject.util_equals(this.buttons, ((BLiveIntlGamePanelMenus) obj).buttons);
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
        List<BLiveGamePanelButtons> list = this.buttons;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.buttons == null) {
            this.buttons = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
