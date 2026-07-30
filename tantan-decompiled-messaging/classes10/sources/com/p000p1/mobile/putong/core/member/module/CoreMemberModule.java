package com.p000p1.mobile.putong.core.member.module;

import android.content.Context;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.putong.module.Module;
import l.roj0;
import p003l.hr9;
import p003l.jr9;
import p003l.lr9;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Route(name = "CoreMemberModule", path = "/member_module/module")
public class CoreMemberModule implements Module {

    /* JADX INFO: renamed from: a */
    public static jr9 f367a;

    /* JADX INFO: renamed from: b */
    public static lr9 f368b = new lr9();

    /* JADX INFO: renamed from: c */
    public static hr9 f369c;

    /* JADX INFO: renamed from: F */
    public static hr9 m824F() {
        return f369c;
    }

    /* JADX INFO: renamed from: H */
    private void m825H() {
        CoreModule.m.a(f368b);
    }

    /* JADX INFO: renamed from: Jh */
    public c<roj0> m826Jh() {
        return c.just(roj0.a);
    }

    /* JADX INFO: renamed from: Qh */
    public void m827Qh() {
        m825H();
        jr9 jr9Var = new jr9();
        f367a = jr9Var;
        jr9Var.m7454a();
    }

    /* JADX INFO: renamed from: ft */
    public c<roj0> m828ft() {
        return c.just(roj0.a);
    }

    public Context getContext() {
        return CoreModule.b;
    }

    public void init(Context context) {
        f369c = hr9.m7065a();
    }

    /* JADX INFO: renamed from: ms */
    public void m829ms() {
    }

    /* JADX INFO: renamed from: tr */
    public void m830tr(boolean z) {
        if (z && CoreModule.P().a().f()) {
            CoreModule.c.n2.a4(CoreModule.H().userId(), "entry", "", false);
        }
    }
}
