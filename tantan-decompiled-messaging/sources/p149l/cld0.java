package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tantanapp.httpdns.model.DomainModel;

/* JADX INFO: loaded from: classes13.dex */
public class cld0 {

    /* JADX INFO: renamed from: a */
    public SharedPreferences f81384a;

    public cld0(Context context) {
        this.f81384a = context.getSharedPreferences("sp_dnscache", 0);
    }

    /* JADX INFO: renamed from: a */
    public DomainModel m107452a(String str) {
        String strM107454c = m107454c(str, "");
        if (TextUtils.isEmpty(strM107454c)) {
            return null;
        }
        DomainModel domainModelM191723b = u4c.m191723b(strM107454c);
        if (domainModelM191723b != null) {
            domainModelM191723b.queryTime = m107453b(str + "_queryTime", 0L);
        }
        return domainModelM191723b;
    }

    /* JADX INFO: renamed from: b */
    public final long m107453b(String str, long j) {
        return this.f81384a.getLong(str, j);
    }

    /* JADX INFO: renamed from: c */
    public final String m107454c(String str, String str2) {
        return this.f81384a.getString(str, str2);
    }

    /* JADX INFO: renamed from: d */
    public final void m107455d(String str, long j) {
        SharedPreferences.Editor editorEdit = this.f81384a.edit();
        editorEdit.putLong(str, j);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: e */
    public final void m107456e(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f81384a.edit();
        editorEdit.putString(str, str2);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: f */
    public void m107457f(DomainModel domainModel) {
        m107456e(domainModel.domain, domainModel.json);
        m107455d(domainModel.domain + "_queryTime", domainModel.queryTime);
    }
}
