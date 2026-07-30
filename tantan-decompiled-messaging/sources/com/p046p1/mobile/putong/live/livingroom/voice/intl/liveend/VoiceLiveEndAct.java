package com.p046p1.mobile.putong.live.livingroom.voice.intl.liveend;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import p149l.arn0;
import p149l.jo2;
import p149l.won0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceLiveEndAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public won0 f53253c;

    /* JADX INFO: renamed from: d */
    public jo2 f53254d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m78255V1(Context context, BLiveVoice bLiveVoice, BLiveVoiceRoom bLiveVoiceRoom, User user, String str) {
        Intent intent = new Intent(context, (Class<?>) VoiceLiveEndAct.class);
        intent.putExtra("live_extra", bLiveVoice);
        intent.putExtra("live_force_stop_content", str);
        intent.putExtra("live_anchor", user);
        intent.putExtra("live_room", bLiveVoiceRoom);
        return intent;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f53254d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f53253c = new won0(this);
        arn0 arn0Var = new arn0();
        this.f53254d = arn0Var;
        this.f53253c.mo51532C(arn0Var);
        this.f53253c.m204847P0((User) getIntent().getSerializableExtra("live_anchor"), (BLiveVoice) getIntent().getSerializableExtra("live_extra"), (BLiveVoiceRoom) getIntent().getSerializableExtra("live_room"), getIntent().getStringExtra("live_force_stop_content"));
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        this.pageHelper = this.f53253c.m204852y0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f53253c.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }
}
