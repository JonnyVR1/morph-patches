package com.tencent.could.huiyansdk.fragments;

import android.content.Context;
import android.graphics.Paint;
import android.widget.TextView;
import com.tencent.could.huiyansdk.api.C14043j;
import com.tencent.could.huiyansdk.callback.InterfaceC14046b;
import com.tencent.could.huiyansdk.common.C14050a;
import com.tencent.could.huiyansdk.enums.HuiYanAuthTipsEvent;
import com.tencent.could.huiyansdk.manager.C14068e;
import com.tencent.could.huiyansdk.view.LoadingFrontAnimatorView;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.fragments.f */
/* JADX INFO: loaded from: classes12.dex */
public class C14059f implements InterfaceC14046b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AuthingFragment f58246a;

    public C14059f(AuthingFragment authingFragment) {
        this.f58246a = authingFragment;
    }

    /* JADX INFO: renamed from: a */
    public void m83486a(Context context, int i, final HuiYanAuthTipsEvent huiYanAuthTipsEvent) {
        if (context == null) {
            C14068e.a.f58293a.m83520a(2, "AuthingFragment", "context is null!");
            return;
        }
        if (this.f58246a.f58234t) {
            return;
        }
        if (-1 == i) {
            AuthingFragment authingFragment = this.f58246a;
            int i2 = authingFragment.f58237w;
            if (i2 < 20) {
                authingFragment.f58237w = i2 + 1;
                return;
            }
            authingFragment.f58237w = 0;
        }
        final String string = i == -1 ? "" : this.f58246a.getContextResources().getString(i);
        this.f58246a.runOnUiThread(new Runnable() { // from class: l.f1r0
            @Override // java.lang.Runnable
            public final void run() {
                this.f96822a.m83482a(huiYanAuthTipsEvent, string);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m83488b(final int i) {
        this.f58246a.runOnUiThread(new Runnable() { // from class: l.j1r0
            @Override // java.lang.Runnable
            public final void run() {
                this.f117990a.m83480a(i);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m83487a(final String str, final int i) {
        this.f58246a.runOnUiThread(new Runnable() { // from class: l.l1r0
            @Override // java.lang.Runnable
            public final void run() {
                this.f129714a.m83481a(i, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m83481a(int i, String str) {
        TextView textView = this.f58246a.f58217c;
        if (textView != null) {
            textView.setTextColor(i);
            C14050a.a.f58212a.f58207b = str;
            this.f58246a.f58217c.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m83482a(HuiYanAuthTipsEvent huiYanAuthTipsEvent, String str) {
        if (this.f58246a.f58218d == null) {
            return;
        }
        C14043j.a.f58200a.m83416a(huiYanAuthTipsEvent, true);
        this.f58246a.f58230p.m83590a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m83480a(int i) {
        Paint paint;
        AuthingFragment authingFragment = this.f58246a;
        if (authingFragment.f58223i == null || authingFragment.f58238x) {
            return;
        }
        LoadingFrontAnimatorView loadingFrontAnimatorView = this.f58246a.f58223i;
        if (i == loadingFrontAnimatorView.f58424g || (paint = loadingFrontAnimatorView.f58427j) == null) {
            return;
        }
        loadingFrontAnimatorView.f58424g = i;
        paint.setColor(i);
        loadingFrontAnimatorView.invalidate();
    }
}
