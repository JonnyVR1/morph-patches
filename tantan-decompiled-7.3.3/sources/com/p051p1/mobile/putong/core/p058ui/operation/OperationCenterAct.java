package com.p051p1.mobile.putong.core.p058ui.operation;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.iz50;
import p153l.jz50;

/* JADX INFO: loaded from: classes4.dex */
public class OperationCenterAct extends PutongMvpAct<iz50, jz50> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m51596Z1(Context context) {
        return new Intent(context, (Class<?>) OperationCenterAct.class);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public iz50 mo29671X1() {
        return new iz50(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public jz50 mo29672Y1() {
        return new jz50(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_community_page";
    }
}
