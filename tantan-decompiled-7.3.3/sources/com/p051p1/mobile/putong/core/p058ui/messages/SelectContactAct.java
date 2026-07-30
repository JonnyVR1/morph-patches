package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C0604h;
import com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.main.ConversationsPage;
import com.tantanapp.common.utils.NullChecker;
import p153l.crl;
import p153l.ibc0;
import p153l.l51;
import p153l.qec0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class SelectContactAct extends PutongAct implements crl {

    /* JADX INFO: renamed from: c */
    public ConversationsPage f32533c;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m50188Z1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SelectContactAct.class);
        intent.putExtra("to_user_id", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$1(Bundle bundle) {
        final Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("to_user_id");
        if (NullChecker.m82486a(stringExtra)) {
            startActivity(MessagesAct.m50130o2(this, stringExtra, true, false, intent, -1));
            m68056e2();
            return;
        }
        String action = intent.getAction();
        String type = intent.getType();
        if (("android.intent.action.SEND_MULTIPLE".equals(action) || "android.intent.action.SEND".equals(action)) && NullChecker.m82486a(type)) {
            setTitle(R$string.f21600S5);
            C0604h c0604h = new C0604h(this.f32533c.getContext(), 1);
            c0604h.m3706h(drawable(ibc0.f114038h7));
            this.f32533c.f31169T.addItemDecoration(c0604h);
            this.f32533c.m48494Q(0, false, new y20() { // from class: l.fle0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f99640a.m50189a2(intent, (String) obj);
                }
            }, false);
        }
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m50189a2(Intent intent, String str) {
        startActivity(MessagesAct.m50130o2(this, str, true, false, intent, -1));
        m68056e2();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ConversationsPage conversationsPage = (ConversationsPage) layoutInflater.inflate(qec0.f156879J4, viewGroup, false);
        this.f32533c = conversationsPage;
        return conversationsPage;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.ele0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94513a.lambda$initSubscription$1((Bundle) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        if (CoreModule.m30929H().signedIn_()) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(SignInBaseActMVP.AFTER_SIGNIN, 2);
        if (NullChecker.m82486a(getIntent())) {
            l51.m152910p(intent, getIntent());
        }
        CoreModule.m30929H().startSignInAct(this.act, intent);
        m68056e2();
    }
}
