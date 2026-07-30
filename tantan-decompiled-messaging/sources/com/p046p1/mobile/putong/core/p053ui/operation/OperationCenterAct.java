package com.p046p1.mobile.putong.core.p053ui.operation;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.cr50;
import p149l.dr50;

/* JADX INFO: loaded from: classes4.dex */
public class OperationCenterAct extends PutongMvpAct<cr50, dr50> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m50413Y1(Context context) {
        return new Intent(context, (Class<?>) OperationCenterAct.class);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public cr50 mo28672V1() {
        return new cr50(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public dr50 mo28673X1() {
        return new dr50(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_community_page";
    }
}
