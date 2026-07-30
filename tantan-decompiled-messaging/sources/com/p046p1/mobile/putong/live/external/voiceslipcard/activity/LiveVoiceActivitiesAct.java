package com.p046p1.mobile.putong.live.external.voiceslipcard.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import p149l.e30;
import p149l.wzu;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceActivitiesAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public static boolean f46424e;

    /* JADX INFO: renamed from: c */
    public wzu f46425c;

    /* JADX INFO: renamed from: d */
    public C12596b f46426d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m70976X1(Context context, boolean z) {
        f46424e = z;
        return new Intent(context, (Class<?>) LiveVoiceActivitiesAct.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        this.f46425c.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f46426d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f46425c = new wzu(this);
        C12596b c12596b = new C12596b(this, f46424e);
        this.f46426d = c12596b;
        this.f46425c.mo51532C(c12596b);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.hyu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110148a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }
}
