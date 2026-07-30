package com.p000p1.mobile.putong.core.newui.group;

import com.p1.mobile.putong.core.PutongCoreMvpAct;
import p009l.igk;
import p009l.jgk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class GroupNotificationAct extends PutongCoreMvpAct<igk, jgk> {
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public igk m488X1() {
        return new igk(this);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public jgk m489Y1() {
        return new jgk(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        setResult(-1);
    }

    public String pageId() {
        return "p_group_notice";
    }
}
