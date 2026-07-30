package com.immomo.moment.mediautils;

import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.n */
/* JADX INFO: loaded from: classes7.dex */
public class C3857n {

    /* JADX INFO: renamed from: c */
    Object f13556c = new Object();

    /* JADX INFO: renamed from: b */
    private List<a> f13555b = new ArrayList();

    /* JADX INFO: renamed from: a */
    private Map<String, AbstractC3856m> f13554a = new HashMap();

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.n$a */
    public class a {

        /* JADX INFO: renamed from: a */
        public long f13557a;

        /* JADX INFO: renamed from: b */
        public long f13558b;

        /* JADX INFO: renamed from: c */
        public String f13559c;

        /* JADX INFO: renamed from: d */
        public Boolean f13560d;

        public a(String str, long j, long j2, boolean z) {
            this.f13559c = str;
            this.f13557a = j;
            this.f13558b = j2;
            this.f13560d = Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m18950a(String str, long j, long j2) {
        synchronized (this.f13556c) {
            this.f13555b.add(new a(str, j, j2, false));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m18951b(String str, long j, long j2, boolean z) {
        synchronized (this.f13556c) {
            this.f13555b.add(new a(str, j, j2, z));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m18952c(String str, AbstractC3856m abstractC3856m) {
        synchronized (this.f13556c) {
            this.f13554a.put(str, abstractC3856m);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m18953d() {
        synchronized (this.f13556c) {
            try {
                List<a> list = this.f13555b;
                if (list != null) {
                    list.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public List<a> m18954e() {
        List<a> list;
        synchronized (this.f13556c) {
            list = this.f13555b;
        }
        return list;
    }

    /* JADX INFO: renamed from: f */
    public Map<String, AbstractC3856m> m18955f() {
        Map<String, AbstractC3856m> map;
        synchronized (this.f13556c) {
            map = this.f13554a;
        }
        return map;
    }

    /* JADX INFO: renamed from: g */
    public void m18956g() {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MediaSourceConfig released !!!");
        synchronized (this.f13556c) {
            try {
                Map<String, AbstractC3856m> map = this.f13554a;
                if (map != null && this.f13555b != null) {
                    Iterator<AbstractC3856m> it = map.values().iterator();
                    while (it.hasNext()) {
                        it.next().mo18791q();
                    }
                    this.f13554a.clear();
                }
                List<a> list = this.f13555b;
                if (list != null) {
                    list.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
