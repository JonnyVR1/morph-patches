package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C0602h;
import com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.main.ConversationsPage;
import com.tantanapp.common.utils.NullChecker;
import p149l.c3c0;
import p149l.e30;
import p149l.e51;
import p149l.l6c0;
import p149l.rol;

/* JADX INFO: loaded from: classes3.dex */
public class SelectContactAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public ConversationsPage f31685c;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m49005Y1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SelectContactAct.class);
        intent.putExtra("to_user_id", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$1(Bundle bundle) {
        final Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("to_user_id");
        if (NullChecker.m81303a(stringExtra)) {
            startActivity(MessagesAct.m48947n2(this, stringExtra, true, false, intent, -1));
            m66873d2();
            return;
        }
        String action = intent.getAction();
        String type = intent.getType();
        if (("android.intent.action.SEND_MULTIPLE".equals(action) || "android.intent.action.SEND".equals(action)) && NullChecker.m81303a(type)) {
            setTitle(R$string.f20858S5);
            C0602h c0602h = new C0602h(this.f31685c.getContext(), 1);
            c0602h.m3705h(drawable(c3c0.f78763h7));
            this.f31685c.f30321T.addItemDecoration(c0602h);
            this.f31685c.m47311Q(0, false, new e30() { // from class: l.ade0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f68929a.m49006Z1(intent, (String) obj);
                }
            }, false);
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m49006Z1(Intent intent, String str) {
        startActivity(MessagesAct.m48947n2(this, str, true, false, intent, -1));
        m66873d2();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ConversationsPage conversationsPage = (ConversationsPage) layoutInflater.inflate(l6c0.f126323J4, viewGroup, false);
        this.f31685c = conversationsPage;
        return conversationsPage;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.zce0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202528a.lambda$initSubscription$1((Bundle) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        if (CoreModule.m29931H().signedIn_()) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(SignInBaseActMVP.AFTER_SIGNIN, 2);
        if (NullChecker.m81303a(getIntent())) {
            e51.m114765p(intent, getIntent());
        }
        CoreModule.m29931H().startSignInAct(this.act, intent);
        m66873d2();
    }
}
