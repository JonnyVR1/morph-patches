package com.p000p1.mobile.putong.core.newui.messages.marriage;

import android.content.Context;
import android.content.Intent;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import p009l.bvw;
import p009l.cvw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MarriageMsgAct extends PutongCoreMvpAct<bvw, cvw> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m6644Z1(Context context) {
        return new Intent(context, (Class<?>) MarriageMsgAct.class);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public bvw m6645X1() {
        return new bvw(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public cvw m6646Y1() {
        return new cvw(this);
    }

    public String pageId() {
        return super/*com.p1.mobile.putong.app.PutongAct*/.pageId();
    }
}
