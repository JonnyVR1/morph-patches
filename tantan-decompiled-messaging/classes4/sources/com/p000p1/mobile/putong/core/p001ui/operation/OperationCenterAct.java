package com.p000p1.mobile.putong.core.p001ui.operation;

import android.content.Context;
import android.content.Intent;
import com.p1.mobile.putong.app.PutongMvpAct;
import p002l.cr50;
import p002l.dr50;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OperationCenterAct extends PutongMvpAct<cr50, dr50> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m846Y1(Context context) {
        return new Intent(context, (Class<?>) OperationCenterAct.class);
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public cr50 m847V1() {
        return new cr50(this);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public dr50 m848X1() {
        return new dr50(this);
    }

    public String pageId() {
        return "p_community_page";
    }
}
