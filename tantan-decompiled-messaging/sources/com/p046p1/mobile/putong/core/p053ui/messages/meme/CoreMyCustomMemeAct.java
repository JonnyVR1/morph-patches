package com.p046p1.mobile.putong.core.p053ui.messages.meme;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import p149l.k0a;
import p149l.szb0;
import p149l.t0a;

/* JADX INFO: loaded from: classes3.dex */
public class CoreMyCustomMemeAct extends PutongCoreMvpAct<k0a, t0a> {
    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public k0a mo29951X1() {
        return new k0a(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public t0a mo29952Y1() {
        return new t0a(this);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        super.m66873d2();
        overridePendingTransition(0, szb0.f167032g);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (((t0a) this.f17565e).m186842o()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_stickers_list";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void setTheme() {
        super.setTheme();
    }
}
