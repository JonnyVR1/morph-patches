package com.p046p1.mobile.putong.core.newui.messages.marriage;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import p149l.bvw;
import p149l.cvw;

/* JADX INFO: loaded from: classes11.dex */
public class MarriageMsgAct extends PutongCoreMvpAct<bvw, cvw> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m42489Z1(Context context) {
        return new Intent(context, (Class<?>) MarriageMsgAct.class);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public bvw mo29951X1() {
        return new bvw(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public cvw mo29952Y1() {
        return new cvw(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return super.pageId();
    }
}
