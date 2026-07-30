package com.p000p1.mobile.putong.live.livingroom.voice.intl.liveend;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import com.p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import java.io.Serializable;
import l.jo2;
import p009l.arn0;
import p009l.won0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceLiveEndAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public won0 f6859c;

    /* JADX INFO: renamed from: d */
    public jo2 f6860d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m8444V1(Context context, BLiveVoice bLiveVoice, BLiveVoiceRoom bLiveVoiceRoom, User user, String str) {
        Intent intent = new Intent(context, (Class<?>) VoiceLiveEndAct.class);
        intent.putExtra("live_extra", (Serializable) bLiveVoice);
        intent.putExtra("live_force_stop_content", str);
        intent.putExtra("live_anchor", (Serializable) user);
        intent.putExtra("live_room", (Serializable) bLiveVoiceRoom);
        return intent;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f6860d.inflateView(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        this.f6859c = new won0(this);
        arn0 arn0Var = new arn0();
        this.f6860d = arn0Var;
        this.f6859c.C(arn0Var);
        this.f6859c.m24442P0((User) getIntent().getSerializableExtra("live_anchor"), (BLiveVoice) getIntent().getSerializableExtra("live_extra"), (BLiveVoiceRoom) getIntent().getSerializableExtra("live_room"), getIntent().getStringExtra("live_force_stop_content"));
        super.initDataOnCreate();
    }

    public void initPageHelper() {
        ((PutongAct) this).pageHelper = this.f6859c.m24448y0();
    }

    public void initSubscription() {
        super.initSubscription();
        this.f6859c.m24444a0();
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }
}
