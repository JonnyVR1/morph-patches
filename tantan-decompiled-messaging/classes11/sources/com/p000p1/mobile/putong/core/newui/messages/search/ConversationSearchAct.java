package com.p000p1.mobile.putong.core.newui.messages.search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.PutongMvpAct;
import java.util.ArrayList;
import l.e30;
import l.jq2;
import l.mkd0;
import l.rzb0;
import l.t100;
import p009l.dk6;
import p009l.dyq;
import p009l.fyq;
import p009l.wj6;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationSearchAct extends PutongMvpAct<wj6, dk6> implements dyq {

    /* JADX INFO: renamed from: f */
    public static String f4722f = "all_pair_width";

    /* JADX INFO: renamed from: g */
    public static String f4723g = "search_type";

    /* JADX INFO: renamed from: h */
    public static String f4724h = "ext_key";

    /* JADX INFO: renamed from: i */
    public static String f4725i = "conversation_id";

    /* JADX INFO: renamed from: j */
    public static String f4726j = "is_only_message_search";

    /* JADX INFO: renamed from: k */
    public static String f4727k = "ext_cid_conv";

    /* JADX INFO: renamed from: l */
    public static String f4728l = "ext_cid_msg";

    /* JADX INFO: renamed from: m */
    public static int f4729m = 1;

    /* JADX INFO: renamed from: n */
    public static int f4730n = 2;

    /* JADX INFO: renamed from: o */
    public static int f4731o = 3;

    /* JADX INFO: renamed from: e */
    public fyq f4732e;

    /* JADX INFO: renamed from: b2 */
    public static Intent m6710b2(Context context, int i, String str, int i2, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        Intent intent = new Intent(context, (Class<?>) ConversationSearchAct.class);
        intent.putExtra(f4722f, i);
        intent.putExtra(f4723g, i2);
        intent.putExtra(f4726j, false);
        intent.putExtra(f4724h, str);
        intent.putStringArrayListExtra(f4727k, arrayList);
        intent.putStringArrayListExtra(f4728l, arrayList2);
        return intent;
    }

    /* JADX INFO: renamed from: c2 */
    public static Intent m6711c2(Context context, String str) {
        Intent intentM6710b2 = m6710b2(context, -t100.d(53.5f), "", f4730n, new ArrayList(), new ArrayList());
        intentM6710b2.putExtra(f4725i, str);
        intentM6710b2.putExtra(f4726j, true);
        return intentM6710b2;
    }

    /* JADX INFO: renamed from: d2 */
    private void m6712d2() {
        if (this.f4732e == null) {
            this.f4732e = new fyq(act());
        }
        act().getWindow().getDecorView().post(new Runnable() { // from class: l.nj6
            @Override // java.lang.Runnable
            public final void run() {
                this.f17499a.m6713h2();
            }
        });
        act().lifecycle().subscribe(mkd0.G(new e30() { // from class: l.oj6
            public final void call(Object obj) {
                this.f18101a.m6719i2((c) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m6713h2() {
        this.f4732e.m14668h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        setTransparentStatusBar();
        m6712d2();
    }

    /* JADX INFO: renamed from: e2, reason: merged with bridge method [inline-methods] */
    public wj6 m6714V1() {
        return new wj6(this);
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        jq2 jq2Var = ((PutongMvpAct) this).c;
        if (((wj6) jq2Var).f22147e != f4729m && ((wj6) jq2Var).f22147e != f4731o) {
            ((Act) this).act.overridePendingTransition(rzb0.z, rzb0.B);
        } else {
            int i = rzb0.e;
            overridePendingTransition(i, i);
        }
    }

    /* JADX INFO: renamed from: g2, reason: merged with bridge method [inline-methods] */
    public dk6 m6715X1() {
        return new dk6(this);
    }

    @Override // p009l.dyq
    /* JADX INFO: renamed from: h */
    public void mo6718h(int i, int i2) {
        ((dk6) ((PutongMvpAct) this).d).m13406h(i, i2);
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m6719i2(c cVar) {
        if (cVar == c.i) {
            this.f4732e.m14667g(this);
        } else if (cVar == c.j) {
            this.f4732e.m14667g(null);
        } else if (cVar == c.m) {
            this.f4732e.m14662b();
        }
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
    }

    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.mj6
            public final void call(Object obj) {
                this.f16967a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    public void onBackPressed() {
        ((dk6) ((PutongMvpAct) this).d).m13411m();
    }

    public String pageId() {
        return "p_chat_search";
    }

    public void setTransparentStatusBar() {
        super/*com.p1.mobile.putong.app.PutongAct*/.setTransparentStatusBar();
        PutongAct.setLightStatusBar(((Act) this).act.getWindow(), 1040);
    }
}
