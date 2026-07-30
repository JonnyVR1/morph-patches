package com.p046p1.mobile.putong.feed.p060ui.moments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.b5c0;
import p149l.bq00;
import p149l.f3c0;
import p149l.lsi0;
import p149l.r5l0;
import p149l.rhi;
import p149l.rol;
import p149l.ts00;

/* JADX INFO: loaded from: classes12.dex */
public class MomentsInProfileAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public ts00 f43911c;

    /* JADX INFO: renamed from: d */
    public bq00 f43912d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m66912V1(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) MomentsInProfileAct.class);
        intent.putExtra("USER", str);
        intent.putExtra("from", str2);
        return intent;
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        this.f43912d.m103345u0();
        super.m66873d2();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f43911c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f43912d = new bq00(this);
        ts00 ts00Var = new ts00(this);
        this.f43911c = ts00Var;
        this.f43912d.mo51532C(ts00Var);
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f43912d.m103347y0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 50) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.f43912d.m103342R0(intent);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        this.f43912d.m103346x0(menu);
        try {
            ((ActionMenuView) Act.TOOLBAR_MENU_VIEW_FILED.get(toolbar())).setOverflowIcon(getResources().getDrawable(f3c0.f94483b2));
            return true;
        } catch (IllegalAccessException e) {
            CrashHelper.m81296c(e);
            return true;
        }
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == b5c0.f73503N0) {
            startActivity(new Intent(act(), (Class<?>) MomentActivitiesAct.class));
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        if (!NullChecker.m81304b(list) || list.size() <= 0 || !(list.get(0) instanceof Video) || new r5l0(rhi.m179382z(list.get(0).url)).f157831b <= 15000) {
            startActivityForResult(CaptionAct.m66583X1(this, list instanceof ArrayList ? (ArrayList) list : new ArrayList(list)), 50);
        } else {
            lsi0.m151578h(R$string.f39187z3);
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onStartLifecycle() {
        if (!this.f43912d.f76745c) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("moments_user_id", this.f43912d.f76743a);
                this.pageHelper.m109039o(jSONObject);
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
            }
        }
        super.onStartLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return this.f43912d.f76745c ? "p_my_posted_moments_view" : "p_user_moments_view";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f43912d.m103343S0(getIntent().getStringExtra("USER"), getIntent().getStringExtra("from"));
        super.preCreateView(bundle);
        this.pageHelper.m109041q(pageId());
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return this.f43912d.m103344U0();
    }
}
