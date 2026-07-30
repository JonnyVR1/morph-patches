package com.p046p1.mobile.putong.core.p053ui.map;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.p046p1.mobile.putong.core.PutongCoreAct;
import java.util.Iterator;
import p149l.eqh0;
import p149l.ftw;
import p149l.ttw;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class MapAct extends PutongCoreAct {

    /* JADX INFO: renamed from: d */
    public ftw f30365d;

    /* JADX INFO: renamed from: e */
    public ttw f30366e;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m47370Z1(Context context, int i) {
        Intent intent = new Intent(context, (Class<?>) MapAct.class);
        intent.putExtra("placePickerType", i);
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ Boolean m47371a2() {
        Iterator it = vwb.m200339n(xdl0.m208399s(toolbar()), new w9j() { // from class: l.usw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) instanceof ActionMenuItemView);
            }
        }).iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) ((View) it.next());
            if (!TextUtils.isEmpty(textView.getText())) {
                textView.setTypeface(eqh0.m117752c(3));
            }
        }
        return Boolean.TRUE;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f30366e.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f30365d = new ftw(this);
        ttw ttwVar = new ttw(this);
        this.f30366e = ttwVar;
        this.f30365d.mo51532C(ttwVar);
        this.pageHelper.m109040p(vwb.m200311Y("map_type", "baidu"));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f30365d.mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f30366e.m190671o()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return this.f30365d.m123109I0(menu);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f30365d.m123110J0(intent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_browse_map_and_select_location_view";
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void pendChangeActionButtonTypeface() {
        xdl0.m208366b0(findViewById(R.id.content), new v9j() { // from class: l.tsw
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f171971a.m47371a2();
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        Intent intent = getIntent();
        this.f30365d.f99274a = intent.getIntExtra("placePickerType", 0);
        this.f30365d.f99277d = intent.getStringExtra("from");
        super.preCreateView(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public boolean shouldBlockOnCreate(Bundle bundle) {
        return super.shouldBlockOnCreate(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public boolean shouldBlockOnResume() {
        return super.shouldBlockOnResume();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public boolean shouldBlockOnStart() {
        return super.shouldBlockOnStart();
    }
}
