package com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item;

import android.view.View;
import androidx.annotation.DrawableRes;
import p149l.dv80;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.a */
/* JADX INFO: loaded from: classes9.dex */
public class C9003a implements dv80 {

    /* JADX INFO: renamed from: a */
    @DrawableRes
    public final int f37736a;

    /* JADX INFO: renamed from: b */
    public final String f37737b;

    /* JADX INFO: renamed from: c */
    public final String f37738c;

    /* JADX INFO: renamed from: d */
    public final String f37739d;

    /* JADX INFO: renamed from: e */
    public a f37740e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo57322a(View view);
    }

    public C9003a(@DrawableRes int i, String str, String str2, String str3) {
        this.f37736a = i;
        this.f37737b = str;
        this.f37738c = str2;
        this.f37739d = str3;
    }

    /* JADX INFO: renamed from: a */
    public String m57316a() {
        return this.f37738c;
    }

    /* JADX INFO: renamed from: b */
    public int m57317b() {
        return this.f37736a;
    }

    /* JADX INFO: renamed from: c */
    public a m57318c() {
        return this.f37740e;
    }

    /* JADX INFO: renamed from: d */
    public String m57319d() {
        return this.f37737b;
    }

    /* JADX INFO: renamed from: e */
    public String m57320e() {
        return this.f37739d;
    }

    /* JADX INFO: renamed from: f */
    public void m57321f(a aVar) {
        this.f37740e = aVar;
    }

    @Override // p149l.dv80
    public int getItemType() {
        return 4;
    }
}
