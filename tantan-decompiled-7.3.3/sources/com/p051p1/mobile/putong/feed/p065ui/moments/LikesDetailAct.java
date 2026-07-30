package com.p051p1.mobile.putong.feed.p065ui.moments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import java.util.List;
import p153l.xnr;
import p153l.ynr;

/* JADX INFO: loaded from: classes13.dex */
public class LikesDetailAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public static String f44505e = "momentId";

    /* JADX INFO: renamed from: f */
    public static String f44506f = "momentOwner";

    /* JADX INFO: renamed from: c */
    public xnr f44507c;

    /* JADX INFO: renamed from: d */
    public ynr f44508d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m67823X1(Act act, String str, String str2) {
        Intent intent = new Intent(act, (Class<?>) LikesDetailAct.class);
        intent.putExtra(f44505e, str);
        intent.putExtra(f44506f, str2);
        return intent;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f44508d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f44507c = new xnr(this);
        ynr ynrVar = new ynr(this);
        this.f44508d = ynrVar;
        this.f44507c.mo52715C(ynrVar);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f44507c.m212290h0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f44507c.m212293l0(getIntent().getStringExtra(f44505e), getIntent().getStringExtra(f44506f));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return this.f44507c.m212294m0();
    }
}
