package com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.task;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.p1.mobile.putong.app.PutongMvpAct;
import p009l.qei0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class TaskCenterAct extends PutongMvpAct<qei0, C0394a> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m7673Y1(Context context) {
        return new Intent(context, (Class<?>) TaskCenterAct.class);
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public qei0 m7674V1() {
        return new qei0(this);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public C0394a m7675X1() {
        return new C0394a(this);
    }

    public String pageId() {
        return "p_task_list";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        super/*com.p1.mobile.putong.app.PutongAct*/.preCreateView(bundle);
        int color = Color.parseColor("#f7f7f7");
        setStatusBarColor(color);
        getWindow().setBackgroundDrawable(new ColorDrawable(color));
    }
}
