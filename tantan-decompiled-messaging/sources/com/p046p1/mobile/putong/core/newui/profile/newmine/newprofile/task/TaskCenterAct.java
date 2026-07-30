package com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.task;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.qei0;

/* JADX INFO: loaded from: classes11.dex */
public class TaskCenterAct extends PutongMvpAct<qei0, C8230a> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m43434Y1(Context context) {
        return new Intent(context, (Class<?>) TaskCenterAct.class);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public qei0 mo28672V1() {
        return new qei0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public C8230a mo28673X1() {
        return new C8230a(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_task_list";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        int color = Color.parseColor("#f7f7f7");
        setStatusBarColor(color);
        getWindow().setBackgroundDrawable(new ColorDrawable(color));
    }
}
