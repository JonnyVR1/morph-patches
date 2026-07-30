package com.p051p1.mobile.putong.live.livingroom.voice.intl.liveend;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import p153l.ayn0;
import p153l.e0o0;
import p153l.qo2;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceLiveEndAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public ayn0 f54101c;

    /* JADX INFO: renamed from: d */
    public qo2 f54102d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m79438X1(Context context, BLiveVoice bLiveVoice, BLiveVoiceRoom bLiveVoiceRoom, User user, String str) {
        Intent intent = new Intent(context, (Class<?>) VoiceLiveEndAct.class);
        intent.putExtra("live_extra", bLiveVoice);
        intent.putExtra("live_force_stop_content", str);
        intent.putExtra("live_anchor", user);
        intent.putExtra("live_room", bLiveVoiceRoom);
        return intent;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f54102d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f54101c = new ayn0(this);
        e0o0 e0o0Var = new e0o0();
        this.f54102d = e0o0Var;
        this.f54101c.mo52715C(e0o0Var);
        this.f54101c.m100905P0((User) getIntent().getSerializableExtra("live_anchor"), (BLiveVoice) getIntent().getSerializableExtra("live_extra"), (BLiveVoiceRoom) getIntent().getSerializableExtra("live_room"), getIntent().getStringExtra("live_force_stop_content"));
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        this.pageHelper = this.f54101c.m100910y0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f54101c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }
}
