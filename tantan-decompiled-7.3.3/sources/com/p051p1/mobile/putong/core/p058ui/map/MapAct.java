package com.p051p1.mobile.putong.core.p058ui.map;

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
import com.p051p1.mobile.putong.core.PutongCoreAct;
import java.util.Iterator;
import p153l.bnl0;
import p153l.eww;
import p153l.jyb;
import p153l.lyh0;
import p153l.pcj;
import p153l.qcj;
import p153l.sww;

/* JADX INFO: loaded from: classes3.dex */
public class MapAct extends PutongCoreAct {

    /* JADX INFO: renamed from: d */
    public eww f31213d;

    /* JADX INFO: renamed from: e */
    public sww f31214e;

    /* JADX INFO: renamed from: a2 */
    public static Intent m48553a2(Context context, int i) {
        Intent intent = new Intent(context, (Class<?>) MapAct.class);
        intent.putExtra("placePickerType", i);
        return intent;
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ Boolean m48554b2() {
        Iterator it = jyb.m147522n(bnl0.m105579s(toolbar()), new qcj() { // from class: l.tvw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) instanceof ActionMenuItemView);
            }
        }).iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) ((View) it.next());
            if (!TextUtils.isEmpty(textView.getText())) {
                textView.setTypeface(lyh0.m156283c(3));
            }
        }
        return Boolean.TRUE;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f31214e.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f31213d = new eww(this);
        sww swwVar = new sww(this);
        this.f31214e = swwVar;
        this.f31213d.mo52715C(swwVar);
        this.pageHelper.m152781p(jyb.m147494Y("map_type", "baidu"));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f31213d.mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f31214e.m188413o()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return this.f31213d.m122980I0(menu);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f31213d.m122981J0(intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_browse_map_and_select_location_view";
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void pendChangeActionButtonTypeface() {
        bnl0.m105546b0(findViewById(R.id.content), new pcj() { // from class: l.svw
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f170874a.m48554b2();
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        Intent intent = getIntent();
        this.f31213d.f96203a = intent.getIntExtra("placePickerType", 0);
        this.f31213d.f96206d = intent.getStringExtra("from");
        super.preCreateView(bundle);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public boolean shouldBlockOnCreate(Bundle bundle) {
        return super.shouldBlockOnCreate(bundle);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public boolean shouldBlockOnResume() {
        return super.shouldBlockOnResume();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public boolean shouldBlockOnStart() {
        return super.shouldBlockOnStart();
    }
}
