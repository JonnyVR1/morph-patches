package com.p046p1.mobile.putong.core.newui.messages.search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import java.util.ArrayList;
import p149l.dk6;
import p149l.dyq;
import p149l.e30;
import p149l.fyq;
import p149l.mkd0;
import p149l.rzb0;
import p149l.t100;
import p149l.wj6;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationSearchAct extends PutongMvpAct<wj6, dk6> implements dyq {

    /* JADX INFO: renamed from: f */
    public static String f25944f = "all_pair_width";

    /* JADX INFO: renamed from: g */
    public static String f25945g = "search_type";

    /* JADX INFO: renamed from: h */
    public static String f25946h = "ext_key";

    /* JADX INFO: renamed from: i */
    public static String f25947i = "conversation_id";

    /* JADX INFO: renamed from: j */
    public static String f25948j = "is_only_message_search";

    /* JADX INFO: renamed from: k */
    public static String f25949k = "ext_cid_conv";

    /* JADX INFO: renamed from: l */
    public static String f25950l = "ext_cid_msg";

    /* JADX INFO: renamed from: m */
    public static int f25951m = 1;

    /* JADX INFO: renamed from: n */
    public static int f25952n = 2;

    /* JADX INFO: renamed from: o */
    public static int f25953o = 3;

    /* JADX INFO: renamed from: e */
    public fyq f25954e;

    /* JADX INFO: renamed from: b2 */
    public static Intent m42551b2(Context context, int i, String str, int i2, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        Intent intent = new Intent(context, (Class<?>) ConversationSearchAct.class);
        intent.putExtra(f25944f, i);
        intent.putExtra(f25945g, i2);
        intent.putExtra(f25948j, false);
        intent.putExtra(f25946h, str);
        intent.putStringArrayListExtra(f25949k, arrayList);
        intent.putStringArrayListExtra(f25950l, arrayList2);
        return intent;
    }

    /* JADX INFO: renamed from: c2 */
    public static Intent m42552c2(Context context, String str) {
        Intent intentM42551b2 = m42551b2(context, -t100.m186890d(53.5f), "", f25952n, new ArrayList(), new ArrayList());
        intentM42551b2.putExtra(f25947i, str);
        intentM42551b2.putExtra(f25948j, true);
        return intentM42551b2;
    }

    /* JADX INFO: renamed from: d2 */
    private void m42553d2() {
        if (this.f25954e == null) {
            this.f25954e = new fyq(act());
        }
        act().getWindow().getDecorView().post(new Runnable() { // from class: l.nj6
            @Override // java.lang.Runnable
            public final void run() {
                this.f139213a.m42554h2();
            }
        });
        act().lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.oj6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144251a.m42558i2((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m42554h2() {
        this.f25954e.m123795h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        setTransparentStatusBar();
        m42553d2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: e2, reason: merged with bridge method [inline-methods] */
    public wj6 mo28672V1() {
        return new wj6(this);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        super.m66873d2();
        p p = this.f17172c;
        if (((wj6) p).f186603e != f25951m && ((wj6) p).f186603e != f25953o) {
            this.act.overridePendingTransition(rzb0.f161654z, rzb0.f161628B);
        } else {
            int i = rzb0.f161633e;
            overridePendingTransition(i, i);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: g2, reason: merged with bridge method [inline-methods] */
    public dk6 mo28673X1() {
        return new dk6(this);
    }

    @Override // p149l.dyq
    /* JADX INFO: renamed from: h */
    public void mo42557h(int i, int i2) {
        ((dk6) this.f17173d).m112171h(i, i2);
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m42558i2(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            this.f25954e.m123794g(this);
        } else if (c4319c == C4319c.f15549j) {
            this.f25954e.m123794g(null);
        } else if (c4319c == C4319c.f15552m) {
            this.f25954e.m123789b();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.mj6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134105a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((dk6) this.f17173d).m112175m();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_chat_search";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        super.setTransparentStatusBar();
        PutongAct.setLightStatusBar(this.act.getWindow(), 1040);
    }
}
