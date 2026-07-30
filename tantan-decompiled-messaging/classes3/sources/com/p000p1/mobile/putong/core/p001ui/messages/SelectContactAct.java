package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.h;
import com.p000p1.mobile.putong.core.p001ui.main.ConversationsPage;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.message.R;
import com.tantanapp.common.utils.NullChecker;
import l.c3c0;
import l.e51;
import l.l6c0;
import l.rol;
import p003l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SelectContactAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public ConversationsPage f1576c;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m2103Y1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SelectContactAct.class);
        intent.putExtra("to_user_id", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$initSubscription$1(Bundle bundle) {
        final Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("to_user_id");
        if (NullChecker.a(stringExtra)) {
            startActivity(MessagesAct.m2039n2(this, stringExtra, true, false, intent, -1));
            finish();
            return;
        }
        String action = intent.getAction();
        String type = intent.getType();
        if (("android.intent.action.SEND_MULTIPLE".equals(action) || "android.intent.action.SEND".equals(action)) && NullChecker.a(type)) {
            setTitle(R.string.S5);
            h hVar = new h(this.f1576c.getContext(), 1);
            hVar.h(drawable(c3c0.h7));
            this.f1576c.f212T.addItemDecoration(hVar);
            this.f1576c.m341Q(0, false, new e30() { // from class: l.ade0
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f2142a.m2104Z1(intent, (String) obj);
                }
            }, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m2104Z1(Intent intent, String str) {
        startActivity(MessagesAct.m2039n2(this, str, true, false, intent, -1));
        finish();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View, com.p1.mobile.putong.core.ui.main.ConversationsPage] */
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ?? r3 = (ConversationsPage) layoutInflater.inflate(l6c0.J4, viewGroup, false);
        this.f1576c = r3;
        return r3;
    }

    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.zce0
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f9306a.lambda$initSubscription$1((Bundle) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        if (CoreModule.H().signedIn_()) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("after_signin", 2);
        if (NullChecker.a(getIntent())) {
            e51.p(intent, getIntent());
        }
        CoreModule.H().startSignInAct(((Act) this).act, intent);
        finish();
    }
}
