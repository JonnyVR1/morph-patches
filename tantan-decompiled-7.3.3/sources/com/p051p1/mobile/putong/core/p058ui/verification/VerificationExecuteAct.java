package com.p051p1.mobile.putong.core.p058ui.verification;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.facertification.C10895a;
import p153l.o1j0;
import p153l.pq4;
import p153l.psd0;
import p153l.qcj;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class VerificationExecuteAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public boolean f37500c;

    /* JADX INFO: renamed from: d */
    public boolean f37501d;

    /* JADX INFO: renamed from: b2 */
    public static Intent m57198b2(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) VerificationExecuteAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public /* synthetic */ void m57199c2(C4470c c4470c) {
        if (C10895a.f39696a && c4470c == C4470c.f16268j) {
            this.f37500c = true;
            return;
        }
        if (c4470c != C4470c.f16267i || !this.f37500c || this.f37501d || !C10895a.f39696a || isFinishing() || isDestroyed()) {
            return;
        }
        m68056e2();
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m57200d2() {
        o1j0.m165651y("已提交审核");
        setResult(-1);
        m68056e2();
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m57201e2() {
        o1j0.m165651y("请稍后再试");
        setResult(0);
        m68056e2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        C10895a.f39696a = false;
        String stringExtra = getIntent().getStringExtra("from");
        if (!CoreModule.m30929H().signedIn_() || TextUtils.isEmpty(CoreModule.m30929H().userId())) {
            m68056e2();
        } else {
            Act act = this.act;
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = "";
            }
            pq4.m173305m(act, stringExtra, null, new x20() { // from class: l.p3l0
                @Override // p153l.x20
                public final void call() {
                    this.f150418a.m68056e2();
                }
            });
        }
        lifecycle().filter(new qcj() { // from class: l.q3l0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                C4470c c4470c = (C4470c) obj;
                return Boolean.valueOf(c4470c == C4470c.f16268j || c4470c == C4470c.f16267i);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.r3l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161047a.m57199c2((C4470c) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f37501d = true;
        if (C10895a.m61402e(intent)) {
            C10895a.m61403f(this, intent, new Runnable() { // from class: l.s3l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f166020a.m57200d2();
                }
            }, new Runnable() { // from class: l.t3l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f171933a.m57201e2();
                }
            });
        } else {
            m68056e2();
        }
    }
}
