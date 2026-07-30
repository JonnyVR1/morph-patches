package com.tencent.could.huiyansdk.fragments;

import android.content.Context;
import android.graphics.Paint;
import android.widget.TextView;
import com.tencent.could.huiyansdk.api.C13880j;
import com.tencent.could.huiyansdk.callback.InterfaceC13883b;
import com.tencent.could.huiyansdk.common.C13887a;
import com.tencent.could.huiyansdk.enums.HuiYanAuthTipsEvent;
import com.tencent.could.huiyansdk.manager.C13905e;
import com.tencent.could.huiyansdk.view.LoadingFrontAnimatorView;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.fragments.f */
/* JADX INFO: loaded from: classes2.dex */
public class C13896f implements InterfaceC13883b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AuthingFragment f57398a;

    public C13896f(AuthingFragment authingFragment) {
        this.f57398a = authingFragment;
    }

    /* JADX INFO: renamed from: a */
    public void m82303a(Context context, int i, final HuiYanAuthTipsEvent huiYanAuthTipsEvent) {
        if (context == null) {
            C13905e.a.f57445a.m82337a(2, "AuthingFragment", "context is null!");
            return;
        }
        if (this.f57398a.f57386t) {
            return;
        }
        if (-1 == i) {
            AuthingFragment authingFragment = this.f57398a;
            int i2 = authingFragment.f57389w;
            if (i2 < 20) {
                authingFragment.f57389w = i2 + 1;
                return;
            }
            authingFragment.f57389w = 0;
        }
        final String string = i == -1 ? "" : this.f57398a.getContextResources().getString(i);
        this.f57398a.runOnUiThread(new Runnable() { // from class: l.zrq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f204536a.m82299a(huiYanAuthTipsEvent, string);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m82305b(final int i) {
        this.f57398a.runOnUiThread(new Runnable() { // from class: l.dsq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f87782a.m82297a(i);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m82304a(final String str, final int i) {
        this.f57398a.runOnUiThread(new Runnable() { // from class: l.fsq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f99096a.m82298a(i, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m82298a(int i, String str) {
        TextView textView = this.f57398a.f57369c;
        if (textView != null) {
            textView.setTextColor(i);
            C13887a.a.f57364a.f57359b = str;
            this.f57398a.f57369c.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m82299a(HuiYanAuthTipsEvent huiYanAuthTipsEvent, String str) {
        if (this.f57398a.f57370d == null) {
            return;
        }
        C13880j.a.f57352a.m82233a(huiYanAuthTipsEvent, true);
        this.f57398a.f57382p.m82407a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m82297a(int i) {
        Paint paint;
        AuthingFragment authingFragment = this.f57398a;
        if (authingFragment.f57375i == null || authingFragment.f57390x) {
            return;
        }
        LoadingFrontAnimatorView loadingFrontAnimatorView = this.f57398a.f57375i;
        if (i == loadingFrontAnimatorView.f57576g || (paint = loadingFrontAnimatorView.f57579j) == null) {
            return;
        }
        loadingFrontAnimatorView.f57576g = i;
        paint.setColor(i);
        loadingFrontAnimatorView.invalidate();
    }
}
