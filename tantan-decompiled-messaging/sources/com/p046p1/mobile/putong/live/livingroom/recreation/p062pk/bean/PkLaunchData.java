package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean;

import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.PkView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.internal.PkViewInternal;
import p149l.ht70;
import p149l.nxl;

/* JADX INFO: loaded from: classes5.dex */
public class PkLaunchData implements nxl {
    public LivePkMessage message;
    public String pkId;
    public PkView pkView;
    public PkViewInternal pkViewInternal;

    public PkLaunchData(PkView pkView, String str) {
        this.pkView = pkView;
        this.pkId = str;
        ht70.m132853j("create PkLaunchData from onGoingId,id:" + str);
    }

    public PkLaunchData(PkViewInternal pkViewInternal, String str) {
        this.pkViewInternal = pkViewInternal;
        this.pkId = str;
        ht70.m132853j("create PkLaunchData from onGoingId,id:" + str);
    }

    public PkLaunchData(PkView pkView, LivePkMessage livePkMessage) {
        this.pkView = pkView;
        this.message = livePkMessage;
        ht70.m132853j("create PkLaunchData from LivePkMessage,message:" + livePkMessage);
    }

    public PkLaunchData(PkViewInternal pkViewInternal, LivePkMessage livePkMessage) {
        this.pkViewInternal = pkViewInternal;
        this.message = livePkMessage;
        ht70.m132853j("create PkLaunchData from LivePkMessage,message:" + livePkMessage);
    }
}
