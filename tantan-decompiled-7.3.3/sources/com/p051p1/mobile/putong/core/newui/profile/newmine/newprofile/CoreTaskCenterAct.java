package com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.p8b;
import p153l.r8b;

/* JADX INFO: loaded from: classes11.dex */
public class CoreTaskCenterAct extends PutongMvpAct<p8b, r8b> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m44481Z1(Context context) {
        return new Intent(context, (Class<?>) CoreTaskCenterAct.class);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public p8b mo29671X1() {
        return new p8b(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public r8b mo29672Y1() {
        return new r8b(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_task_center";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
