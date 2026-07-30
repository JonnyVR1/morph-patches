package com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item;

import android.view.View;
import androidx.annotation.DrawableRes;
import p006l.dv80;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0439a implements dv80 {

    /* JADX INFO: renamed from: a */
    @DrawableRes
    public final int f7517a;

    /* JADX INFO: renamed from: b */
    public final String f7518b;

    /* JADX INFO: renamed from: c */
    public final String f7519c;

    /* JADX INFO: renamed from: d */
    public final String f7520d;

    /* JADX INFO: renamed from: e */
    public a f7521e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo10805a(View view);
    }

    public C0439a(@DrawableRes int i, String str, String str2, String str3) {
        this.f7517a = i;
        this.f7518b = str;
        this.f7519c = str2;
        this.f7520d = str3;
    }

    /* JADX INFO: renamed from: a */
    public String m10799a() {
        return this.f7519c;
    }

    /* JADX INFO: renamed from: b */
    public int m10800b() {
        return this.f7517a;
    }

    /* JADX INFO: renamed from: c */
    public a m10801c() {
        return this.f7521e;
    }

    /* JADX INFO: renamed from: d */
    public String m10802d() {
        return this.f7518b;
    }

    /* JADX INFO: renamed from: e */
    public String m10803e() {
        return this.f7520d;
    }

    /* JADX INFO: renamed from: f */
    public void m10804f(a aVar) {
        this.f7521e = aVar;
    }

    @Override // p006l.dv80
    public int getItemType() {
        return 4;
    }
}
