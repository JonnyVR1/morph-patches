package com.p000p1.mobile.putong.live.livingroom.other.liveend;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.archi.act.LivingBaseAct;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLive;
import java.io.Serializable;
import p002l.c8s;
import p002l.eet;
import p002l.z7s;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveEndAct extends LivingBaseAct {

    /* JADX INFO: renamed from: c */
    public z7s f7248c;

    /* JADX INFO: renamed from: d */
    public c8s f7249d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m9113V1(Context context, BLive bLive, User user, String str, String str2, String str3) {
        Intent intent = new Intent(context, (Class<?>) LiveEndAct.class);
        intent.putExtra("live_extra", (Serializable) bLive);
        intent.putExtra("live_force_stop_content", str);
        intent.putExtra("live_anchor", (Serializable) user);
        intent.putExtra("live_anchor_source", str2);
        intent.putExtra("live_trace_id", str3);
        return intent;
    }

    /* JADX INFO: renamed from: X1 */
    private void m9114X1(BLive bLive, String str, String str2) {
        eet.m12447a("anchor_live_summary", true, str2, str, bLive, null);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f7249d.inflateView(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        this.f7248c = new z7s(this);
        c8s c8sVar = new c8s();
        this.f7249d = c8sVar;
        this.f7248c.C(c8sVar);
        this.f7248c.m27121n0((User) getIntent().getSerializableExtra("live_anchor"), (BLive) getIntent().getSerializableExtra("live_extra"), getIntent().getStringExtra("live_force_stop_content"));
        super.initDataOnCreate();
        m9114X1(getIntent().getSerializableExtra("live_extra"), getIntent().getStringExtra("live_anchor_source"), getIntent().getStringExtra("live_trace_id"));
    }

    public void initPageHelper() {
        ((PutongAct) this).pageHelper = this.f7248c.m27120j0();
    }

    public void initSubscription() {
        super.initSubscription();
        this.f7248c.m27119a0();
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }
}
