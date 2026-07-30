package com.tantanapp.common.data.orm;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.tantanapp.common.data.orm.SqlSegment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p153l.jyb;
import p153l.qcj;

/* JADX INFO: loaded from: classes11.dex */
public class SqlSegment {
    public final String[] args;
    public final String part;
    public static SqlSegment NULL = new SqlSegment(null, null);
    public static SqlSegment FALSE = new SqlSegment("1=0", null);
    public static SqlSegment TRUE = new SqlSegment("1=1", null);

    public SqlSegment(String str, String[] strArr) {
        this.part = str;
        this.args = strArr;
    }

    public static SqlSegment concat(@NonNull List<SqlSegment> list, String str) {
        ArrayList arrayListM147522n = jyb.m147522n(list, new qcj() { // from class: l.wzf0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((SqlSegment) obj).isEmpty());
            }
        });
        if (arrayListM147522n.size() == 0) {
            return NULL;
        }
        if (arrayListM147522n.size() == 1) {
            return (SqlSegment) arrayListM147522n.get(0);
        }
        Iterator it = arrayListM147522n.iterator();
        int length = 0;
        while (it.hasNext()) {
            String[] strArr = ((SqlSegment) it.next()).args;
            if (strArr != null) {
                length += strArr.length;
            }
        }
        String[] strArr2 = new String[length];
        Iterator it2 = arrayListM147522n.iterator();
        int i = 0;
        while (it2.hasNext()) {
            String[] strArr3 = ((SqlSegment) it2.next()).args;
            if (strArr3 != null) {
                int length2 = strArr3.length;
                int i2 = 0;
                while (i2 < length2) {
                    strArr2[i] = strArr3[i2];
                    i2++;
                    i++;
                }
            }
        }
        return new SqlSegment(jyb.m147490U(jyb.m147489T(arrayListM147522n, new qcj() { // from class: l.xzf0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((SqlSegment) obj).part;
            }
        }), str), strArr2);
    }

    public SqlSegment append(String str) {
        return new SqlSegment(this.part + str, this.args);
    }

    public boolean isEmpty() {
        if (!TextUtils.isEmpty(this.part)) {
            return false;
        }
        String[] strArr = this.args;
        return strArr == null || strArr.length == 0;
    }

    public SqlSegment prepend(String str) {
        return new SqlSegment(str + this.part, this.args);
    }
}
