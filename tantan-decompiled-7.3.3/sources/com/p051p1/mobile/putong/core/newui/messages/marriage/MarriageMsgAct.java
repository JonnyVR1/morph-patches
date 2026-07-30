package com.p051p1.mobile.putong.core.newui.messages.marriage;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import p153l.ayw;
import p153l.byw;

/* JADX INFO: loaded from: classes11.dex */
public class MarriageMsgAct extends PutongCoreMvpAct<ayw, byw> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m43500a2(Context context) {
        return new Intent(context, (Class<?>) MarriageMsgAct.class);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public ayw mo30949Y1() {
        return new ayw(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public byw mo30950Z1() {
        return new byw(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return super.pageId();
    }
}
