package com.p046p1.mobile.putong.api.push;

import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class PushTrackData implements Serializable {
    public boolean alreadyClicked;
    public double createdTime;
    public long currentTime;
    public long duration;
    public String gid;
    public String intent;
    public String pushName;
    public String reqId;

    public void alreadyClick() {
        this.alreadyClicked = true;
    }
}
