package com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.task;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.qni0;

/* JADX INFO: loaded from: classes11.dex */
public class TaskCenterAct extends PutongMvpAct<qni0, C8393a> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m44620Z1(Context context) {
        return new Intent(context, (Class<?>) TaskCenterAct.class);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public qni0 mo29671X1() {
        return new qni0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public C8393a mo29672Y1() {
        return new C8393a(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_task_list";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        int color = Color.parseColor("#f7f7f7");
        setStatusBarColor(color);
        getWindow().setBackgroundDrawable(new ColorDrawable(color));
    }
}
