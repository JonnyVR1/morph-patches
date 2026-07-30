package com.p051p1.mobile.putong.core.newui.group;

import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import p153l.yik;
import p153l.zik;

/* JADX INFO: loaded from: classes11.dex */
public class GroupNotificationAct extends PutongCoreMvpAct<yik, zik> {
    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public yik mo30949Y1() {
        return new yik(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public zik mo30950Z1() {
        return new zik(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        setResult(-1);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_group_notice";
    }
}
