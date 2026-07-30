package com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item;

import android.view.View;
import androidx.annotation.DrawableRes;
import p153l.h390;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.a */
/* JADX INFO: loaded from: classes12.dex */
public class C9166a implements h390 {

    /* JADX INFO: renamed from: a */
    @DrawableRes
    public final int f38584a;

    /* JADX INFO: renamed from: b */
    public final String f38585b;

    /* JADX INFO: renamed from: c */
    public final String f38586c;

    /* JADX INFO: renamed from: d */
    public final String f38587d;

    /* JADX INFO: renamed from: e */
    public a f38588e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo58505a(View view);
    }

    public C9166a(@DrawableRes int i, String str, String str2, String str3) {
        this.f38584a = i;
        this.f38585b = str;
        this.f38586c = str2;
        this.f38587d = str3;
    }

    /* JADX INFO: renamed from: a */
    public String m58499a() {
        return this.f38586c;
    }

    /* JADX INFO: renamed from: b */
    public int m58500b() {
        return this.f38584a;
    }

    /* JADX INFO: renamed from: c */
    public a m58501c() {
        return this.f38588e;
    }

    /* JADX INFO: renamed from: d */
    public String m58502d() {
        return this.f38585b;
    }

    /* JADX INFO: renamed from: e */
    public String m58503e() {
        return this.f38587d;
    }

    /* JADX INFO: renamed from: f */
    public void m58504f(a aVar) {
        this.f38588e = aVar;
    }

    @Override // p153l.h390
    public int getItemType() {
        return 4;
    }
}
