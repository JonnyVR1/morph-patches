package com.p046p1.mobile.putong.p065ui.jsbridge.implement;

import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.ActionBridgeImplementation;
import com.tantanapp.common.utils.NullChecker;
import p149l.boq;
import p149l.c4g0;
import p149l.e30;
import p149l.ef2;
import p149l.liq;
import p149l.mkd0;
import p149l.w9j;

/* JADX INFO: loaded from: classes11.dex */
public class ActionBridgeImplementation extends ef2 {

    /* JADX INFO: renamed from: a */
    public c4g0 f54536a;

    /* JADX INFO: renamed from: b */
    public c4g0 f54537b;

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m79715d(boq boqVar, String str, Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        boqVar.mo102962d().mo127284a(str);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m79717f(boq boqVar, String str, Boolean bool) {
        if (bool.booleanValue()) {
            boqVar.mo102962d().mo127284a(str);
        }
    }

    @Override // p149l.ef2
    /* JADX INFO: renamed from: a */
    public synchronized void mo46528a() {
        try {
            if (NullChecker.m81303a(this.f54536a)) {
                this.f54536a.unsubscribe();
                this.f54536a = null;
            }
            if (NullChecker.m81303a(this.f54537b)) {
                this.f54537b.unsubscribe();
                this.f54537b = null;
            }
            super.mo46528a();
        } catch (Throwable th) {
            throw th;
        }
    }

    @liq(key = "subscribe")
    public void subscribe(@NonNull final boq boqVar, String str, final String str2, String str3, String str4) {
        if (str.equals("onAppEnterBackground")) {
            if (this.f54537b == null) {
                this.f54537b = Act.foreground().map(new w9j() { // from class: l.m30
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(NullChecker.m81303a((Act.C4299r) obj));
                    }
                }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.n30
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ActionBridgeImplementation.m79715d(boqVar, str2, (Boolean) obj);
                    }
                }));
                boqVar.mo102962d().mo127284a(str3);
                return;
            }
            return;
        }
        if (str.equals("onAppEnterForeground") && this.f54536a == null) {
            this.f54536a = Act.foreground().map(new w9j() { // from class: l.o30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m81303a((Act.C4299r) obj));
                }
            }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.p30
                @Override // p149l.e30
                public final void call(Object obj) {
                    ActionBridgeImplementation.m79717f(boqVar, str2, (Boolean) obj);
                }
            }));
            boqVar.mo102962d().mo127284a(str3);
        }
    }
}
