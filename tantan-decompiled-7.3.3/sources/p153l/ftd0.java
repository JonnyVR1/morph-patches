package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tantanapp.httpdns.model.DomainModel;

/* JADX INFO: loaded from: classes11.dex */
public class ftd0 {

    /* JADX INFO: renamed from: a */
    public SharedPreferences f100731a;

    public ftd0(Context context) {
        this.f100731a = context.getSharedPreferences("sp_dnscache", 0);
    }

    /* JADX INFO: renamed from: a */
    public DomainModel m127306a(String str) {
        String strM127308c = m127308c(str, "");
        if (TextUtils.isEmpty(strM127308c)) {
            return null;
        }
        DomainModel domainModelM108125b = c6c.m108125b(strM127308c);
        if (domainModelM108125b != null) {
            domainModelM108125b.queryTime = m127307b(str + "_queryTime", 0L);
        }
        return domainModelM108125b;
    }

    /* JADX INFO: renamed from: b */
    public final long m127307b(String str, long j) {
        return this.f100731a.getLong(str, j);
    }

    /* JADX INFO: renamed from: c */
    public final String m127308c(String str, String str2) {
        return this.f100731a.getString(str, str2);
    }

    /* JADX INFO: renamed from: d */
    public final void m127309d(String str, long j) {
        SharedPreferences.Editor editorEdit = this.f100731a.edit();
        editorEdit.putLong(str, j);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: e */
    public final void m127310e(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f100731a.edit();
        editorEdit.putString(str, str2);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: f */
    public void m127311f(DomainModel domainModel) {
        m127310e(domainModel.domain, domainModel.json);
        m127309d(domainModel.domain + "_queryTime", domainModel.queryTime);
    }
}
