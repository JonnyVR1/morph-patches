package com.p051p1.mobile.putong.core.p058ui.messages.meme;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import p153l.e2a;
import p153l.v1a;
import p153l.y7c0;

/* JADX INFO: loaded from: classes3.dex */
public class CoreMyCustomMemeAct extends PutongCoreMvpAct<v1a, e2a> {
    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public v1a mo30949Y1() {
        return new v1a(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public e2a mo30950Z1() {
        return new e2a(this);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        super.m68056e2();
        overridePendingTransition(0, y7c0.f197769g);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (((e2a) this.f18284e).m119067o()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_stickers_list";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void setTheme() {
        super.setTheme();
    }
}
