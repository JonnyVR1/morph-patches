package com.p051p1.mobile.putong.core.p058ui.profile.loop.input;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopEditInfo;
import com.tantanapp.common.utils.NullChecker;
import p153l.lqa0;
import p153l.nqa0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopMultiSelectAct extends PutongMvpAct<lqa0, nqa0> {

    /* JADX INFO: renamed from: e */
    public LoopEditInfo f34364e;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m52836Z1(LoopEditInfo loopEditInfo, Context context) {
        Intent intent = new Intent(context, (Class<?>) ProfileLoopMultiSelectAct.class);
        intent.putExtra("loop_create_tag_info", loopEditInfo);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public lqa0 mo29671X1() {
        return new lqa0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public nqa0 mo29672Y1() {
        return new nqa0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return super.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f34364e = (LoopEditInfo) act().getIntent().getSerializableExtra("loop_create_tag_info");
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((lqa0) this.f17891c).m155343m0(i, i2, intent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        ((lqa0) this.f17891c).m155340g0();
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return (NullChecker.m82486a(this.f34364e) && NullChecker.m82486a(this.f34364e.loopInputType)) ? this.f34364e.loopInputType.pageId : super.pageId();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if (NullChecker.m82486a(this.act.getSupportActionBar())) {
            this.act.getSupportActionBar().mo102186m();
        }
    }
}
