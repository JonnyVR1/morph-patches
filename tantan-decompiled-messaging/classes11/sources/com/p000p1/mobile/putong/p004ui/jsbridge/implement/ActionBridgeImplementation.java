package com.p000p1.mobile.putong.p004ui.jsbridge.implement;

import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.ActionBridgeImplementation;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.c4g0;
import l.e30;
import l.mkd0;
import l.w9j;
import p009l.boq;
import p009l.ef2;
import p009l.liq;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ActionBridgeImplementation extends ef2 {

    /* JADX INFO: renamed from: a */
    public c4g0 f8142a;

    /* JADX INFO: renamed from: b */
    public c4g0 f8143b;

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m10036d(boq boqVar, String str, Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        boqVar.mo12185d().mo15129a(str);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m10038f(boq boqVar, String str, Boolean bool) {
        if (bool.booleanValue()) {
            boqVar.mo12185d().mo15129a(str);
        }
    }

    @Override // p009l.ef2
    /* JADX INFO: renamed from: a */
    public synchronized void mo10039a() {
        try {
            if (NullChecker.a(this.f8142a)) {
                this.f8142a.unsubscribe();
                this.f8142a = null;
            }
            if (NullChecker.a(this.f8143b)) {
                this.f8143b.unsubscribe();
                this.f8143b = null;
            }
            super.mo10039a();
        } catch (Throwable th) {
            throw th;
        }
    }

    @liq(key = "subscribe")
    public void subscribe(@NonNull final boq boqVar, String str, final String str2, String str3, String str4) {
        if (str.equals("onAppEnterBackground")) {
            if (this.f8143b == null) {
                this.f8143b = Act.foreground().map(new w9j() { // from class: l.m30
                    public final Object call(Object obj) {
                        return Boolean.valueOf(NullChecker.a((Act.r) obj));
                    }
                }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.n30
                    public final void call(Object obj) {
                        ActionBridgeImplementation.m10036d(boqVar, str2, (Boolean) obj);
                    }
                }));
                boqVar.mo12185d().mo15129a(str3);
                return;
            }
            return;
        }
        if (str.equals("onAppEnterForeground") && this.f8142a == null) {
            this.f8142a = Act.foreground().map(new w9j() { // from class: l.o30
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.a((Act.r) obj));
                }
            }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.p30
                public final void call(Object obj) {
                    ActionBridgeImplementation.m10038f(boqVar, str2, (Boolean) obj);
                }
            }));
            boqVar.mo12185d().mo15129a(str3);
        }
    }
}
