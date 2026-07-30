package com.p000p1.mobile.putong.core.p001ui.map;

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
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.PutongCoreAct;
import java.util.Iterator;
import l.j760;
import l.vwb;
import l.xdl0;
import p003l.eqh0;
import p003l.ftw;
import p003l.ttw;
import p003l.v9j;
import p003l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MapAct extends PutongCoreAct {

    /* JADX INFO: renamed from: d */
    public ftw f256d;

    /* JADX INFO: renamed from: e */
    public ttw f257e;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m403Z1(Context context, int i) {
        Intent intent = new Intent(context, (Class<?>) MapAct.class);
        intent.putExtra("placePickerType", i);
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ Boolean m404a2() {
        Iterator it = vwb.n(xdl0.s(toolbar()), new w9j() { // from class: l.usw
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) instanceof ActionMenuItemView);
            }
        }).iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) ((View) it.next());
            if (!TextUtils.isEmpty(textView.getText())) {
                textView.setTypeface(eqh0.m3924c(3));
            }
        }
        return Boolean.TRUE;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f257e.inflateView(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initDataOnCreate();
        this.f256d = new ftw(this);
        ttw ttwVar = new ttw(this);
        this.f257e = ttwVar;
        this.f256d.C(ttwVar);
        ((PutongAct) this).pageHelper.p(new j760[]{vwb.Y("map_type", "baidu")});
    }

    public void initSubscription() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initSubscription();
        this.f256d.m4449a0();
    }

    public void onBackPressed() {
        if (this.f257e.m8022o()) {
            return;
        }
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return this.f256d.m4443I0(menu);
    }

    public void onNewIntent(Intent intent) {
        super/*com.p1.mobile.putong.app.PutongAct*/.onNewIntent(intent);
        this.f256d.m4444J0(intent);
    }

    public String pageId() {
        return "p_browse_map_and_select_location_view";
    }

    public void pendChangeActionButtonTypeface() {
        xdl0.b0(findViewById(R.id.content), new v9j() { // from class: l.tsw
            @Override // p003l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f7717a.m404a2();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        Intent intent = getIntent();
        this.f256d.f3713a = intent.getIntExtra("placePickerType", 0);
        this.f256d.f3716d = intent.getStringExtra("from");
        super/*com.p1.mobile.putong.app.PutongAct*/.preCreateView(bundle);
    }

    public boolean shouldBlockOnCreate(Bundle bundle) {
        return super/*com.p1.mobile.putong.app.PutongAct*/.shouldBlockOnCreate(bundle);
    }

    public boolean shouldBlockOnResume() {
        return super/*com.p1.mobile.putong.app.PutongAct*/.shouldBlockOnResume();
    }

    public boolean shouldBlockOnStart() {
        return super/*com.p1.mobile.putong.app.PutongAct*/.shouldBlockOnStart();
    }
}
