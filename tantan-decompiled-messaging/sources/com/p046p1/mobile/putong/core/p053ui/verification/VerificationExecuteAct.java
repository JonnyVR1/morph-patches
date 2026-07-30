package com.p046p1.mobile.putong.core.p053ui.verification;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.facertification.C10732a;
import p149l.d30;
import p149l.e30;
import p149l.lsi0;
import p149l.mkd0;
import p149l.qp4;
import p149l.w9j;

/* JADX INFO: loaded from: classes9.dex */
public class VerificationExecuteAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public boolean f36652c;

    /* JADX INFO: renamed from: d */
    public boolean f36653d;

    /* JADX INFO: renamed from: a2 */
    public static Intent m56015a2(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) VerificationExecuteAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public /* synthetic */ void m56016b2(C4319c c4319c) {
        if (C10732a.f38848a && c4319c == C4319c.f15549j) {
            this.f36652c = true;
            return;
        }
        if (c4319c != C4319c.f15548i || !this.f36652c || this.f36653d || !C10732a.f38848a || isFinishing() || isDestroyed()) {
            return;
        }
        m66873d2();
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m56017c2() {
        lsi0.m151595y("已提交审核");
        setResult(-1);
        m66873d2();
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m56018d2() {
        lsi0.m151595y("请稍后再试");
        setResult(0);
        m66873d2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        C10732a.f38848a = false;
        String stringExtra = getIntent().getStringExtra("from");
        if (!CoreModule.m29931H().signedIn_() || TextUtils.isEmpty(CoreModule.m29931H().userId())) {
            m66873d2();
        } else {
            Act act = this.act;
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = "";
            }
            qp4.m175807m(act, stringExtra, null, new d30() { // from class: l.juk0
                @Override // p149l.d30
                public final void call() {
                    this.f119792a.m66873d2();
                }
            });
        }
        lifecycle().filter(new w9j() { // from class: l.kuk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                C4319c c4319c = (C4319c) obj;
                return Boolean.valueOf(c4319c == C4319c.f15549j || c4319c == C4319c.f15548i);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.luk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130073a.m56016b2((C4319c) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f36653d = true;
        if (C10732a.m60218e(intent)) {
            C10732a.m60219f(this, intent, new Runnable() { // from class: l.muk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f135799a.m56017c2();
                }
            }, new Runnable() { // from class: l.nuk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f140638a.m56018d2();
                }
            });
        } else {
            m66873d2();
        }
    }
}
