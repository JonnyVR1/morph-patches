package com.p046p1.mobile.putong.core.newui.group;

import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import p149l.igk;
import p149l.jgk;

/* JADX INFO: loaded from: classes11.dex */
public class GroupNotificationAct extends PutongCoreMvpAct<igk, jgk> {
    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public igk mo29951X1() {
        return new igk(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public jgk mo29952Y1() {
        return new jgk(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        setResult(-1);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_group_notice";
    }
}
