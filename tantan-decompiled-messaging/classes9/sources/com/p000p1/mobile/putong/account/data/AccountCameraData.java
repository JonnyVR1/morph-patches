package com.p000p1.mobile.putong.account.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.account.data.CameraCategory;
import com.p000p1.mobile.putong.account.data.CameraFilter;
import com.p000p1.mobile.putong.account.data.CameraSticker;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountCameraData extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "accountcameradata";

    @NonNull
    @ProtobufIndex(index = CameraSticker.STATE_COMPLETE)
    public List<CameraCategory> cameraCategories;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<CameraFilter> cameraFilters;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<CameraSticker> cameraStickers;
    public static ProtobufAdapter<AccountCameraData> PROTOBUF_ADAPTER = new MessageNanoAdapter<AccountCameraData>() { // from class: com.p1.mobile.putong.account.data.AccountCameraData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AccountCameraData accountCameraData) {
            List<CameraFilter> list = accountCameraData.cameraFilters;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, CameraFilter.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<CameraSticker> list2 = accountCameraData.cameraStickers;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, CameraSticker.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CameraCategory> list3 = accountCameraData.cameraCategories;
            if (list3 != null) {
                iL += CodedOutputByteBufferNano.l(3, list3, CameraCategory.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) accountCameraData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AccountCameraData m28875parse(nb5 nb5Var) throws IOException {
            AccountCameraData accountCameraData = new AccountCameraData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (accountCameraData.cameraFilters == null) {
                        accountCameraData.cameraFilters = new ArrayList();
                    }
                    if (accountCameraData.cameraStickers == null) {
                        accountCameraData.cameraStickers = new ArrayList();
                    }
                    if (accountCameraData.cameraCategories != null) {
                        break;
                    }
                    accountCameraData.cameraCategories = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    accountCameraData.cameraFilters = (List) nb5Var.l(CameraFilter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    accountCameraData.cameraStickers = (List) nb5Var.l(CameraSticker.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
                        if (accountCameraData.cameraFilters == null) {
                            accountCameraData.cameraFilters = new ArrayList();
                        }
                        if (accountCameraData.cameraStickers == null) {
                            accountCameraData.cameraStickers = new ArrayList();
                        }
                        if (accountCameraData.cameraCategories != null) {
                            break;
                        }
                        accountCameraData.cameraCategories = new ArrayList();
                        return accountCameraData;
                    }
                    accountCameraData.cameraCategories = (List) nb5Var.l(CameraCategory.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return accountCameraData;
        }

        public void serialize(AccountCameraData accountCameraData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<CameraFilter> list = accountCameraData.cameraFilters;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, CameraFilter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CameraSticker> list2 = accountCameraData.cameraStickers;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, CameraSticker.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CameraCategory> list3 = accountCameraData.cameraCategories;
            if (list3 != null) {
                codedOutputByteBufferNano.K(3, list3, CameraCategory.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AccountCameraData> JSON_ADAPTER = new ObjectJsonAdapter<AccountCameraData>() { // from class: com.p1.mobile.putong.account.data.AccountCameraData.2
        public Class getDataClass() {
            return AccountCameraData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AccountCameraData m28876newInstance() {
            return new AccountCameraData();
        }

        public boolean parseField(AccountCameraData accountCameraData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "cameraFilters":
                    accountCameraData.cameraFilters = JsonAdapter.parseArray(jsonParser, CameraFilter.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "cameraStickers":
                    accountCameraData.cameraStickers = JsonAdapter.parseArray(jsonParser, CameraSticker.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "cameraCategories":
                    accountCameraData.cameraCategories = JsonAdapter.parseArray(jsonParser, CameraCategory.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AccountCameraData accountCameraData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "cameraFilters":
                case "cameraStickers":
                case "cameraCategories":
                    return true;
                default:
                    return super.parseFieldCheck(accountCameraData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(AccountCameraData accountCameraData, JsonGenerator jsonGenerator) throws IOException {
            if (accountCameraData.cameraFilters != null) {
                jsonGenerator.writeFieldName("cameraFilters");
                JsonAdapter.serializeArray(accountCameraData.cameraFilters, jsonGenerator, CameraFilter.JSON_ADAPTER);
            }
            if (accountCameraData.cameraStickers != null) {
                jsonGenerator.writeFieldName("cameraStickers");
                JsonAdapter.serializeArray(accountCameraData.cameraStickers, jsonGenerator, CameraSticker.JSON_ADAPTER);
            }
            if (accountCameraData.cameraCategories != null) {
                jsonGenerator.writeFieldName("cameraCategories");
                JsonAdapter.serializeArray(accountCameraData.cameraCategories, jsonGenerator, CameraCategory.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AccountCameraData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AccountCameraData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AccountCameraData new_() {
        AccountCameraData accountCameraData = new AccountCameraData();
        accountCameraData.nullCheck();
        return accountCameraData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AccountCameraData m28874clone() {
        AccountCameraData accountCameraData = new AccountCameraData();
        List<CameraFilter> list = this.cameraFilters;
        if (list != null) {
            accountCameraData.cameraFilters = ValueObject.util_map(list, new w9j() { // from class: l.bi
                public final Object call(Object obj) {
                    return ((CameraFilter) obj).m28902clone();
                }
            });
        }
        List<CameraSticker> list2 = this.cameraStickers;
        if (list2 != null) {
            accountCameraData.cameraStickers = ValueObject.util_map(list2, new w9j() { // from class: l.ci
                public final Object call(Object obj) {
                    return ((CameraSticker) obj).m28906clone();
                }
            });
        }
        List<CameraCategory> list3 = this.cameraCategories;
        if (list3 != null) {
            accountCameraData.cameraCategories = ValueObject.util_map(list3, new w9j() { // from class: l.di
                public final Object call(Object obj) {
                    return ((CameraCategory) obj).m28898clone();
                }
            });
        }
        return accountCameraData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountCameraData)) {
            return false;
        }
        AccountCameraData accountCameraData = (AccountCameraData) obj;
        return this == obj && ValueObject.util_equals(this.cameraFilters, accountCameraData.cameraFilters) && ValueObject.util_equals(this.cameraStickers, accountCameraData.cameraStickers) && ValueObject.util_equals(this.cameraCategories, accountCameraData.cameraCategories);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        List<CameraFilter> list = this.cameraFilters;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<CameraSticker> list2 = this.cameraStickers;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<CameraCategory> list3 = this.cameraCategories;
        int iHashCode4 = iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.cameraFilters == null) {
            this.cameraFilters = new ArrayList();
        }
        if (this.cameraStickers == null) {
            this.cameraStickers = new ArrayList();
        }
        if (this.cameraCategories == null) {
            this.cameraCategories = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
