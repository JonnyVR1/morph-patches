package com.p000p1.mobile.putong.feed.p005ui.moments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.lsi0;
import l.r5l0;
import l.rhi;
import l.rol;
import org.json.JSONException;
import org.json.JSONObject;
import p007l.b5c0;
import p007l.bq00;
import p007l.f3c0;
import p007l.ts00;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentsInProfileAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public ts00 f5372c;

    /* JADX INFO: renamed from: d */
    public bq00 f5373d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m8110V1(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) MomentsInProfileAct.class);
        intent.putExtra("USER", str);
        intent.putExtra("from", str2);
        return intent;
    }

    public void finish() {
        this.f5373d.m9005u0();
        super/*com.p1.mobile.android.app.Act*/.finish();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f5372c.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        this.f5373d = new bq00(this);
        ts00 ts00Var = new ts00(this);
        this.f5372c = ts00Var;
        this.f5373d.C(ts00Var);
        super.initDataOnCreate();
    }

    public void initSubscription() {
        super.initSubscription();
        this.f5373d.m9007y0();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 50) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.f5373d.m9002R0(intent);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.f5373d.m9006x0(menu);
        try {
            ((ActionMenuView) Act.TOOLBAR_MENU_VIEW_FILED.get(toolbar())).setOverflowIcon(getResources().getDrawable(f3c0.f7766b2));
            return true;
        } catch (IllegalAccessException e) {
            CrashHelper.c(e);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == b5c0.f5984N0) {
            startActivity(new Intent((Context) act(), (Class<?>) MomentActivitiesAct.class));
        }
        return super/*com.p1.mobile.android.app.Act*/.onOptionsItemSelected(menuItem);
    }

    public void onPickImagesResult(List<Media> list) {
        if (!NullChecker.b(list) || list.size() <= 0 || !(list.get(0) instanceof Video) || new r5l0(rhi.z(list.get(0).url)).b <= 15000) {
            startActivityForResult(CaptionAct.m7774X1(this, list instanceof ArrayList ? (ArrayList) list : new ArrayList(list)), 50);
        } else {
            lsi0.h(R$string.f648z3);
        }
    }

    public void onStartLifecycle() {
        if (!this.f5373d.f6404c) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("moments_user_id", this.f5373d.f6402a);
                ((PutongAct) this).pageHelper.o(jSONObject);
            } catch (JSONException e) {
                CrashHelper.c(e);
            }
        }
        super/*com.p1.mobile.android.app.Act*/.onStartLifecycle();
    }

    public String pageId() {
        return this.f5373d.f6404c ? "p_my_posted_moments_view" : "p_user_moments_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        this.f5373d.m9003S0(getIntent().getStringExtra("USER"), getIntent().getStringExtra("from"));
        super.preCreateView(bundle);
        ((PutongAct) this).pageHelper.q(pageId());
    }

    public List<Object> trackedArgs() {
        return this.f5373d.m9004U0();
    }
}
