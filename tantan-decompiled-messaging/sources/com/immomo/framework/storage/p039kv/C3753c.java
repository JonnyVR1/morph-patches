package com.immomo.framework.storage.p039kv;

import android.content.ContentValues;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.cosmos.mdlog.MDLog;
import com.tencent.mmkv.MMKV;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.immomo.framework.storage.kv.c */
/* JADX INFO: loaded from: classes7.dex */
class C3753c implements InterfaceC3751a {

    /* JADX INFO: renamed from: a */
    @Nullable
    private MMKV f12930a;

    public C3753c(String str) {
        this.f12930a = null;
        try {
            this.f12930a = MMKV.mmkvWithID(str, 2);
        } catch (Throwable th) {
            C3750KV.m18341h("MMKV_ERROR_INIT", null, th);
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: f */
    private boolean m18360f(String str, Object obj) {
        boolean zEncode;
        System.currentTimeMillis();
        if (obj == null) {
            this.f12930a.removeValueForKey(str);
            zEncode = true;
        } else if (obj instanceof Integer) {
            zEncode = this.f12930a.encode(str, ((Integer) obj).intValue());
        } else if (obj instanceof Float) {
            zEncode = this.f12930a.encode(str, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            zEncode = this.f12930a.encode(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            zEncode = this.f12930a.encode(str, ((Long) obj).longValue());
        } else if (obj instanceof Boolean) {
            zEncode = this.f12930a.encode(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            zEncode = this.f12930a.encode(str, (String) obj);
        } else {
            boolean z = obj instanceof Set;
            MMKV mmkv = this.f12930a;
            if (!z) {
                MDLog.m7392e("KV", "MMKVStorage.save(String key,Object value) error: wrong value type  mmapID=%s, key=%s", mmkv.mmapID(), str);
                return false;
            }
            zEncode = mmkv.encode(str, (Set<String>) obj);
        }
        System.currentTimeMillis();
        return zEncode;
    }

    /* JADX INFO: renamed from: g */
    private void m18361g(String str, String str2, long j) {
    }

    @Override // com.immomo.framework.storage.p039kv.InterfaceC3751a
    /* JADX INFO: renamed from: a */
    public long mo18345a(String str, Long l2) {
        if (this.f12930a == null) {
            C3750KV.m18341h("MMKV_READ_ERROR_NULL", str, null);
            return l2.longValue();
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jDecodeLong = this.f12930a.decodeLong(str, l2.longValue());
            m18361g("getLong", str, System.currentTimeMillis() - jCurrentTimeMillis);
            return jDecodeLong;
        } catch (Throwable th) {
            C3750KV.m18341h("MMKV_READ_ERROR_OTHER", str, th);
            th.printStackTrace();
            return l2.longValue();
        }
    }

    @Override // com.immomo.framework.storage.p039kv.InterfaceC3751a
    /* JADX INFO: renamed from: b */
    public boolean mo18346b(ContentValues contentValues) {
        if (contentValues != null && contentValues.size() != 0) {
            int i = 0;
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                String key = entry.getKey();
                if (TextUtils.isEmpty(key)) {
                    MDLog.m7391e("KV", "MMKVStorage.save(ContentValues) error:empty key!!!");
                } else if (mo18347c(key, entry.getValue())) {
                    i++;
                }
            }
            if (i == contentValues.size()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.immomo.framework.storage.p039kv.InterfaceC3751a
    /* JADX INFO: renamed from: c */
    public boolean mo18347c(String str, Object obj) {
        if (this.f12930a == null) {
            C3750KV.m18341h("MMKV_WRITE_ERROR_NULL", str, null);
            return false;
        }
        try {
            return m18360f(str, obj);
        } catch (Throwable th) {
            C3750KV.m18341h("MMKV_WRITE_ERROR_OTHER", str, th);
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.immomo.framework.storage.p039kv.InterfaceC3751a
    /* JADX INFO: renamed from: d */
    public boolean mo18348d(String str, boolean z) {
        if (this.f12930a == null) {
            C3750KV.m18341h("MMKV_READ_ERROR_NULL", str, null);
            return z;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean zDecodeBool = this.f12930a.decodeBool(str, z);
            m18361g("getBool", str, System.currentTimeMillis() - jCurrentTimeMillis);
            return zDecodeBool;
        } catch (Throwable th) {
            C3750KV.m18341h("MMKV_READ_ERROR_OTHER", str, th);
            th.printStackTrace();
            return z;
        }
    }

    @Override // com.immomo.framework.storage.p039kv.InterfaceC3751a
    /* JADX INFO: renamed from: e */
    public boolean mo18349e(String str) {
        MMKV mmkv = this.f12930a;
        if (mmkv == null) {
            C3750KV.m18341h("MMKV_ERROR_CONTAINS_NULL", str, null);
            return false;
        }
        try {
            return mmkv.containsKey(str);
        } catch (Throwable th) {
            C3750KV.m18341h("MMKV_ERROR_CONTAINS_OTHER", str, th);
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.immomo.framework.storage.p039kv.InterfaceC3751a
    public int getInt(String str, int i) {
        if (this.f12930a == null) {
            C3750KV.m18341h("MMKV_READ_ERROR_NULL", str, null);
            return i;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int iDecodeInt = this.f12930a.decodeInt(str, i);
            m18361g("getInt", str, System.currentTimeMillis() - jCurrentTimeMillis);
            return iDecodeInt;
        } catch (Throwable th) {
            C3750KV.m18341h("MMKV_READ_ERROR_OTHER", str, th);
            th.printStackTrace();
            return i;
        }
    }

    @Override // com.immomo.framework.storage.p039kv.InterfaceC3751a
    public String getString(String str, @Nullable String str2) {
        if (this.f12930a == null) {
            C3750KV.m18341h("MMKV_READ_ERROR_NULL", str, null);
            return str2;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strDecodeString = this.f12930a.decodeString(str, str2);
            m18361g("getString", str, System.currentTimeMillis() - jCurrentTimeMillis);
            return strDecodeString;
        } catch (Throwable th) {
            C3750KV.m18341h("MMKV_READ_ERROR_OTHER", str, th);
            th.printStackTrace();
            return str2;
        }
    }

    @Override // com.immomo.framework.storage.p039kv.InterfaceC3751a
    public void remove(String str) {
        MMKV mmkv = this.f12930a;
        if (mmkv == null) {
            C3750KV.m18341h("MMKV_ERROR_REMOVE_NULL", str, null);
            return;
        }
        try {
            mmkv.removeValueForKey(str);
        } catch (Throwable th) {
            C3750KV.m18341h("MMKV_ERROR_REMOVE_OTHER", str, th);
            th.printStackTrace();
        }
    }
}
