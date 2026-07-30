package com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p1.mobile.putong.app.PutongMvpAct;
import p009l.c7b;
import p009l.e7b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CoreTaskCenterAct extends PutongMvpAct<c7b, e7b> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m7518Y1(Context context) {
        return new Intent(context, (Class<?>) CoreTaskCenterAct.class);
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public c7b m7519V1() {
        return new c7b(this);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public e7b m7520X1() {
        return new e7b(this);
    }

    public String pageId() {
        return "p_task_center";
    }

    public void preCreateView(Bundle bundle) {
        super/*com.p1.mobile.putong.app.PutongAct*/.preCreateView(bundle);
    }
}
