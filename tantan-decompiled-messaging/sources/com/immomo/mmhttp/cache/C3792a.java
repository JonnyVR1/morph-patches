package com.immomo.mmhttp.cache;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.List;
import p149l.d4c;

/* JADX INFO: renamed from: com.immomo.mmhttp.cache.a */
/* JADX INFO: loaded from: classes7.dex */
class C3792a<T> extends d4c<CacheEntity<T>> {
    public C3792a() {
        super(new C3793b());
    }

    @Override // p149l.d4c
    /* JADX INFO: renamed from: h */
    public String mo18398h() {
        return "cache_table";
    }

    /* JADX INFO: renamed from: m */
    public CacheEntity<T> m18400m(String str) {
        List<T> listM109974d = m109974d("key=?", new String[]{str});
        if (listM109974d.size() > 0) {
            return (CacheEntity) listM109974d.get(0);
        }
        return null;
    }

    @Override // p149l.d4c
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ContentValues mo18397g(CacheEntity<T> cacheEntity) {
        return CacheEntity.getContentValues(cacheEntity);
    }

    @Override // p149l.d4c
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public CacheEntity<T> mo18399k(Cursor cursor) {
        return CacheEntity.parseCursorToBean(cursor);
    }

    /* JADX INFO: renamed from: p */
    public boolean m18403p(String str) {
        return m109972b("key=?", new String[]{str}) > 0;
    }
}
