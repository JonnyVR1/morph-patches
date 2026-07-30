package com.p046p1.mobile.putong.live.external.page.fansgroup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import p149l.teg;
import p149l.ueg;

/* JADX INFO: loaded from: classes13.dex */
public class FansGroupNoticeActivity extends PutongAct {

    /* JADX INFO: renamed from: c */
    public ueg f45924c;

    /* JADX INFO: renamed from: d */
    public teg f45925d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m70497V1(Context context) {
        return new Intent(context, (Class<?>) FansGroupNoticeActivity.class);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f45924c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f45924c = new ueg(this);
        teg tegVar = new teg(this);
        this.f45925d = tegVar;
        tegVar.mo51532C(this.f45924c);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f45925d.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_live_fanbasegroup_notice";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
