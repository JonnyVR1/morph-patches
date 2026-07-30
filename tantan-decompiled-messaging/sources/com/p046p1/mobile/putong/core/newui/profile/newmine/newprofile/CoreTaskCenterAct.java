package com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.c7b;
import p149l.e7b;

/* JADX INFO: loaded from: classes11.dex */
public class CoreTaskCenterAct extends PutongMvpAct<c7b, e7b> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m43295Y1(Context context) {
        return new Intent(context, (Class<?>) CoreTaskCenterAct.class);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public c7b mo28672V1() {
        return new c7b(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public e7b mo28673X1() {
        return new e7b(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_task_center";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
