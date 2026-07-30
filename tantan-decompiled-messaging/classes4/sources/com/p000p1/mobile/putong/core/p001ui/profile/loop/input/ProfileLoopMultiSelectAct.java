package com.p000p1.mobile.putong.core.p001ui.profile.loop.input;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopEditInfo;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.tantanapp.common.utils.NullChecker;
import p002l.hia0;
import p002l.jia0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopMultiSelectAct extends PutongMvpAct<hia0, jia0> {

    /* JADX INFO: renamed from: e */
    public LoopEditInfo f1338e;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m2156Y1(LoopEditInfo loopEditInfo, Context context) {
        Intent intent = new Intent(context, (Class<?>) ProfileLoopMultiSelectAct.class);
        intent.putExtra("loop_create_tag_info", loopEditInfo);
        return intent;
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public hia0 m2157V1() {
        return new hia0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public jia0 m2158X1() {
        return new jia0(this);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return super.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        this.f1338e = (LoopEditInfo) act().getIntent().getSerializableExtra("loop_create_tag_info");
        super.initDataOnCreate();
    }

    public void initSubscription() {
        super.initSubscription();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.putong.app.PutongAct*/.onActivityResult(i, i2, intent);
        ((hia0) ((PutongMvpAct) this).c).m14383m0(i, i2, intent);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super/*androidx.appcompat.app.AppCompatActivity*/.onKeyDown(i, keyEvent);
        }
        ((hia0) ((PutongMvpAct) this).c).m14380g0();
        return true;
    }

    public String pageId() {
        return (NullChecker.a(this.f1338e) && NullChecker.a(this.f1338e.loopInputType)) ? this.f1338e.loopInputType.pageId : super/*com.p1.mobile.putong.app.PutongAct*/.pageId();
    }

    public void preCreateView(Bundle bundle) {
        super/*com.p1.mobile.putong.app.PutongAct*/.preCreateView(bundle);
        if (NullChecker.a(((Act) this).act.getSupportActionBar())) {
            ((Act) this).act.getSupportActionBar().m();
        }
    }
}
