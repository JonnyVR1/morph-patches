package com.p051p1.mobile.putong.feed.p065ui.moments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.c110;
import p153l.crl;
import p153l.hdc0;
import p153l.ky00;
import p153l.lbc0;
import p153l.o1j0;
import p153l.oki;
import p153l.vel0;

/* JADX INFO: loaded from: classes13.dex */
public class MomentsInProfileAct extends PutongAct implements crl {

    /* JADX INFO: renamed from: c */
    public c110 f44759c;

    /* JADX INFO: renamed from: d */
    public ky00 f44760d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m68095X1(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) MomentsInProfileAct.class);
        intent.putExtra("USER", str);
        intent.putExtra("from", str2);
        return intent;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        this.f44760d.m151936u0();
        super.m68056e2();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f44759c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f44760d = new ky00(this);
        c110 c110Var = new c110(this);
        this.f44759c = c110Var;
        this.f44760d.mo52715C(c110Var);
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f44760d.m151938y0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 50) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.f44760d.m151933R0(intent);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        this.f44760d.m151937x0(menu);
        try {
            ((ActionMenuView) Act.TOOLBAR_MENU_VIEW_FILED.get(toolbar())).setOverflowIcon(getResources().getDrawable(lbc0.f131001b2));
            return true;
        } catch (IllegalAccessException e) {
            CrashHelper.m82479c(e);
            return true;
        }
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == hdc0.f108856N0) {
            startActivity(new Intent(act(), (Class<?>) MomentActivitiesAct.class));
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        if (!NullChecker.m82487b(list) || list.size() <= 0 || !(list.get(0) instanceof Video) || new vel0(oki.m168038z(list.get(0).url)).f183806b <= 15000) {
            startActivityForResult(CaptionAct.m67766Y1(this, list instanceof ArrayList ? (ArrayList) list : new ArrayList(list)), 50);
        } else {
            o1j0.m165634h(R$string.f40035z3);
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onStartLifecycle() {
        if (!this.f44760d.f129258c) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("moments_user_id", this.f44760d.f129256a);
                this.pageHelper.m152780o(jSONObject);
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
            }
        }
        super.onStartLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return this.f44760d.f129258c ? "p_my_posted_moments_view" : "p_user_moments_view";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f44760d.m151934S0(getIntent().getStringExtra("USER"), getIntent().getStringExtra("from"));
        super.preCreateView(bundle);
        this.pageHelper.m152782q(pageId());
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return this.f44760d.m151935U0();
    }
}
