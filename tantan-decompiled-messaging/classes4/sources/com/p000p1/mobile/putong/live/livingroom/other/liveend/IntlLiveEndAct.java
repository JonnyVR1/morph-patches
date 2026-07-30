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
import p002l.eet;
import p002l.kun;
import p002l.mun;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class IntlLiveEndAct extends LivingBaseAct {

    /* JADX INFO: renamed from: c */
    public kun f7246c;

    /* JADX INFO: renamed from: d */
    public mun f7247d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m9111V1(Context context, BLive bLive, User user, String str, String str2, String str3) {
        Intent intent = new Intent(context, (Class<?>) IntlLiveEndAct.class);
        intent.putExtra("live_extra", (Serializable) bLive);
        intent.putExtra("live_force_stop_content", str);
        intent.putExtra("live_anchor", (Serializable) user);
        intent.putExtra("live_anchor_source", str2);
        intent.putExtra("live_trace_id", str3);
        return intent;
    }

    /* JADX INFO: renamed from: X1 */
    public final void m9112X1(BLive bLive, String str, String str2) {
        eet.m12447a("anchor_live_summary", true, str2, str, bLive, null);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f7247d.inflateView(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        this.f7246c = new kun(this);
        mun munVar = new mun();
        this.f7247d = munVar;
        this.f7246c.C(munVar);
        this.f7246c.m16825s0((User) getIntent().getSerializableExtra("live_anchor"), (BLive) getIntent().getSerializableExtra("live_extra"), getIntent().getStringExtra("live_force_stop_content"));
        super.initDataOnCreate();
        m9112X1(getIntent().getSerializableExtra("live_extra"), getIntent().getStringExtra("live_anchor_source"), getIntent().getStringExtra("live_trace_id"));
    }

    public void initPageHelper() {
        ((PutongAct) this).pageHelper = this.f7246c.m16818l0();
    }

    public void initSubscription() {
        super.initSubscription();
        this.f7246c.m16817a0();
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }
}
