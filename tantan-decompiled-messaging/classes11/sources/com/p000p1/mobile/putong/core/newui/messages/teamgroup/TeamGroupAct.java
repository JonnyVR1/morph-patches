package com.p000p1.mobile.putong.core.newui.messages.teamgroup;

import android.content.Context;
import android.content.Intent;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import p009l.dgi0;
import p009l.igi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class TeamGroupAct extends PutongCoreMvpAct<dgi0, igi0> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m6720Z1(Context context) {
        return new Intent(context, (Class<?>) TeamGroupAct.class);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public dgi0 m6721X1() {
        return new dgi0(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public igi0 m6722Y1() {
        return new igi0(this);
    }

    public String pageId() {
        return "p_subscription_content";
    }
}
