package com.p046p1.mobile.putong.core.p053ui.profile.loop.input;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopEditInfo;
import com.tantanapp.common.utils.NullChecker;
import p149l.hia0;
import p149l.jia0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopMultiSelectAct extends PutongMvpAct<hia0, jia0> {

    /* JADX INFO: renamed from: e */
    public LoopEditInfo f33516e;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m51653Y1(LoopEditInfo loopEditInfo, Context context) {
        Intent intent = new Intent(context, (Class<?>) ProfileLoopMultiSelectAct.class);
        intent.putExtra("loop_create_tag_info", loopEditInfo);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public hia0 mo28672V1() {
        return new hia0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public jia0 mo28673X1() {
        return new jia0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return super.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f33516e = (LoopEditInfo) act().getIntent().getSerializableExtra("loop_create_tag_info");
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((hia0) this.f17172c).m131247m0(i, i2, intent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        ((hia0) this.f17172c).m131244g0();
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return (NullChecker.m81303a(this.f33516e) && NullChecker.m81303a(this.f33516e.loopInputType)) ? this.f33516e.loopInputType.pageId : super.pageId();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if (NullChecker.m81303a(this.act.getSupportActionBar())) {
            this.act.getSupportActionBar().mo134126m();
        }
    }
}
