package com.p051p1.mobile.putong.core.newui.messages.search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import java.util.ArrayList;
import p153l.d0r;
import p153l.f0r;
import p153l.gl6;
import p153l.psd0;
import p153l.qa00;
import p153l.x7c0;
import p153l.y20;
import p153l.zk6;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationSearchAct extends PutongMvpAct<zk6, gl6> implements d0r {

    /* JADX INFO: renamed from: f */
    public static String f26686f = "all_pair_width";

    /* JADX INFO: renamed from: g */
    public static String f26687g = "search_type";

    /* JADX INFO: renamed from: h */
    public static String f26688h = "ext_key";

    /* JADX INFO: renamed from: i */
    public static String f26689i = "conversation_id";

    /* JADX INFO: renamed from: j */
    public static String f26690j = "is_only_message_search";

    /* JADX INFO: renamed from: k */
    public static String f26691k = "ext_cid_conv";

    /* JADX INFO: renamed from: l */
    public static String f26692l = "ext_cid_msg";

    /* JADX INFO: renamed from: m */
    public static int f26693m = 1;

    /* JADX INFO: renamed from: n */
    public static int f26694n = 2;

    /* JADX INFO: renamed from: o */
    public static int f26695o = 3;

    /* JADX INFO: renamed from: e */
    public f0r f26696e;

    /* JADX INFO: renamed from: c2 */
    public static Intent m43562c2(Context context, int i, String str, int i2, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        Intent intent = new Intent(context, (Class<?>) ConversationSearchAct.class);
        intent.putExtra(f26686f, i);
        intent.putExtra(f26687g, i2);
        intent.putExtra(f26690j, false);
        intent.putExtra(f26688h, str);
        intent.putStringArrayListExtra(f26691k, arrayList);
        intent.putStringArrayListExtra(f26692l, arrayList2);
        return intent;
    }

    /* JADX INFO: renamed from: d2 */
    public static Intent m43563d2(Context context, String str) {
        Intent intentM43562c2 = m43562c2(context, -qa00.m175859d(53.5f), "", f26694n, new ArrayList(), new ArrayList());
        intentM43562c2.putExtra(f26689i, str);
        intentM43562c2.putExtra(f26690j, true);
        return intentM43562c2;
    }

    /* JADX INFO: renamed from: e2 */
    private void m43564e2() {
        if (this.f26696e == null) {
            this.f26696e = new f0r(act());
        }
        act().getWindow().getDecorView().post(new Runnable() { // from class: l.qk6
            @Override // java.lang.Runnable
            public final void run() {
                this.f158098a.m43565i2();
            }
        });
        act().lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.rk6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163543a.m43569k2((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public /* synthetic */ void m43565i2() {
        this.f26696e.m123510h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        setTransparentStatusBar();
        m43564e2();
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        super.m68056e2();
        p p = this.f17891c;
        if (((zk6) p).f204736e != f26693m && ((zk6) p).f204736e != f26695o) {
            this.act.overridePendingTransition(x7c0.f192711z, x7c0.f192685B);
        } else {
            int i = x7c0.f192690e;
            overridePendingTransition(i, i);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: g2, reason: merged with bridge method [inline-methods] */
    public zk6 mo29671X1() {
        return new zk6(this);
    }

    @Override // p153l.d0r
    /* JADX INFO: renamed from: h */
    public void mo43567h(int i, int i2) {
        ((gl6) this.f17892d).m130626h(i, i2);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: h2, reason: merged with bridge method [inline-methods] */
    public gl6 mo29672Y1() {
        return new gl6(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.pk6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152799a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m43569k2(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            this.f26696e.m123509g(this);
        } else if (c4470c == C4470c.f16268j) {
            this.f26696e.m123509g(null);
        } else if (c4470c == C4470c.f16271m) {
            this.f26696e.m123504b();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((gl6) this.f17892d).m130630m();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_chat_search";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        super.setTransparentStatusBar();
        PutongAct.setLightStatusBar(this.act.getWindow(), 1040);
    }
}
