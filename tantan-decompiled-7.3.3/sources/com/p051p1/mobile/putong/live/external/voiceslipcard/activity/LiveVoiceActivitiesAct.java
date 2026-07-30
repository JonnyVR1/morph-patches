package com.p051p1.mobile.putong.live.external.voiceslipcard.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import p153l.x1v;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVoiceActivitiesAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public static boolean f47272e;

    /* JADX INFO: renamed from: c */
    public x1v f47273c;

    /* JADX INFO: renamed from: d */
    public C12759b f47274d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m72159Y1(Context context, boolean z) {
        f47272e = z;
        return new Intent(context, (Class<?>) LiveVoiceActivitiesAct.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        this.f47273c.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f47274d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f47273c = new x1v(this);
        C12759b c12759b = new C12759b(this, f47272e);
        this.f47274d = c12759b;
        this.f47273c.mo52715C(c12759b);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.i0v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112455a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }
}
