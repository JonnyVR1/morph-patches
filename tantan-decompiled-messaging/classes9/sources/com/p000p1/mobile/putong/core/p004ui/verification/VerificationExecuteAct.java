package com.p000p1.mobile.putong.core.p004ui.verification;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.facertification.a;
import l.d30;
import l.e30;
import l.lsi0;
import l.mkd0;
import l.w9j;
import p006l.qp4;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VerificationExecuteAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public boolean f6433c;

    /* JADX INFO: renamed from: d */
    public boolean f6434d;

    /* JADX INFO: renamed from: a2 */
    public static Intent m9438a2(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) VerificationExecuteAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b2 */
    public /* synthetic */ void m9439b2(c cVar) {
        if (a.a && cVar == c.j) {
            this.f6433c = true;
            return;
        }
        if (cVar != c.i || !this.f6433c || this.f6434d || !a.a || isFinishing() || isDestroyed()) {
            return;
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m9440c2() {
        lsi0.y("已提交审核");
        setResult(-1);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m9441d2() {
        lsi0.y("请稍后再试");
        setResult(0);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        a.a = false;
        String stringExtra = getIntent().getStringExtra("from");
        if (!CoreModule.m1850H().signedIn_() || TextUtils.isEmpty(CoreModule.m1850H().userId())) {
            finish();
        } else {
            Act act = ((Act) this).act;
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = "";
            }
            qp4.m22310m(act, stringExtra, null, new d30() { // from class: l.juk0
                public final void call() {
                    this.f15433a.finish();
                }
            });
        }
        lifecycle().filter(new w9j() { // from class: l.kuk0
            public final Object call(Object obj) {
                c cVar = (c) obj;
                return Boolean.valueOf(cVar == c.j || cVar == c.i);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.luk0
            public final void call(Object obj) {
                this.f16662a.m9439b2((c) obj);
            }
        }));
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f6434d = true;
        if (a.e(intent)) {
            a.f(this, intent, new Runnable() { // from class: l.muk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17295a.m9440c2();
                }
            }, new Runnable() { // from class: l.nuk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17874a.m9441d2();
                }
            });
        } else {
            finish();
        }
    }
}
