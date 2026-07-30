package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean;

import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.PkView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.internal.PkViewInternal;
import p153l.g0m;
import p153l.n180;

/* JADX INFO: loaded from: classes5.dex */
public class PkLaunchData implements g0m {
    public LivePkMessage message;
    public String pkId;
    public PkView pkView;
    public PkViewInternal pkViewInternal;

    public PkLaunchData(PkView pkView, String str) {
        this.pkView = pkView;
        this.pkId = str;
        n180.m161093j("create PkLaunchData from onGoingId,id:" + str);
    }

    public PkLaunchData(PkViewInternal pkViewInternal, String str) {
        this.pkViewInternal = pkViewInternal;
        this.pkId = str;
        n180.m161093j("create PkLaunchData from onGoingId,id:" + str);
    }

    public PkLaunchData(PkView pkView, LivePkMessage livePkMessage) {
        this.pkView = pkView;
        this.message = livePkMessage;
        n180.m161093j("create PkLaunchData from LivePkMessage,message:" + livePkMessage);
    }

    public PkLaunchData(PkViewInternal pkViewInternal, LivePkMessage livePkMessage) {
        this.pkViewInternal = pkViewInternal;
        this.message = livePkMessage;
        n180.m161093j("create PkLaunchData from LivePkMessage,message:" + livePkMessage);
    }
}
