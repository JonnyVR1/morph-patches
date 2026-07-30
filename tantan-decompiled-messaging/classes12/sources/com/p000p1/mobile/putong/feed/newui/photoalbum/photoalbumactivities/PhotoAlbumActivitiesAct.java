package com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import l.vwb;
import p007l.bx60;
import p007l.flg;
import p007l.flh;
import p007l.klh;
import p007l.nkg;
import p007l.pjh;
import p007l.qv60;
import p007l.slh;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PhotoAlbumActivitiesAct extends PutongAct {

    /* JADX INFO: renamed from: h */
    public static int f3703h = 256;

    /* JADX INFO: renamed from: i */
    public static int f3704i = 512;

    /* JADX INFO: renamed from: j */
    public static String f3705j = "like";

    /* JADX INFO: renamed from: k */
    public static String f3706k = "interaction";

    /* JADX INFO: renamed from: l */
    public static String f3707l = "interested_users_front_part";

    /* JADX INFO: renamed from: m */
    public static String f3708m = "interested_users_removed";

    /* JADX INFO: renamed from: n */
    public static String f3709n = "interested_users_counter";

    /* JADX INFO: renamed from: o */
    public static String f3710o = "interested_users_counter_bundle";

    /* JADX INFO: renamed from: c */
    public flh f3711c;

    /* JADX INFO: renamed from: d */
    public pjh f3712d;

    /* JADX INFO: renamed from: e */
    public String f3713e;

    /* JADX INFO: renamed from: f */
    public boolean f3714f;

    /* JADX INFO: renamed from: g */
    public boolean f3715g = false;

    /* JADX INFO: renamed from: V1 */
    public static Intent m6071V1(Context context, String str, boolean z, boolean z2, boolean z3) {
        Intent intent = new Intent(context, (Class<?>) PhotoAlbumActivitiesAct.class);
        intent.putExtra("from", str);
        intent.putExtra("hasUnreadActivities", z);
        intent.putExtra("needRefreshData", z3);
        if (z2) {
            intent.addFlags(268435456);
            intent.addFlags(524288);
        }
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X1 */
    public boolean m6072X1() {
        return f3705j.equals(getIntent().getStringExtra("from"));
    }

    public void finish() {
        FeedModule.m1140H().pollUserCounters();
        if (flg.m10127i()) {
            this.f3711c.m10189R1();
        }
        super/*com.p1.mobile.android.app.Act*/.finish();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f3712d.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        if (!nkg.m12246j0() || m6072X1()) {
            this.f3712d = new bx60(this);
            this.f3711c = new qv60(this);
        } else {
            this.f3712d = new slh(this);
            this.f3711c = new klh(this);
        }
        this.f3711c.C(this.f3712d);
        super.initDataOnCreate();
    }

    public void initSubscription() {
        super.initSubscription();
        this.f3711c.mo8909a0();
    }

    public boolean isAnonymousMode() {
        return true;
    }

    @SuppressLint({"MissingSuperCall"})
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == f3704i && i2 == -1 && NullChecker.a(intent)) {
            int intExtra = intent.getIntExtra(f3709n, 0);
            Bundle bundleExtra = intent.getBundleExtra(f3710o);
            if (NullChecker.a(bundleExtra)) {
                ArrayList<String> stringArrayList = bundleExtra.getStringArrayList(f3707l);
                ArrayList<String> stringArrayList2 = bundleExtra.getStringArrayList(f3708m);
                ArrayList arrayList = new ArrayList();
                if (!vwb.J(stringArrayList)) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        User userM16628e8 = FeedModule.f316d.m16628e8(it.next());
                        if (NullChecker.a(userM16628e8)) {
                            arrayList.add(userM16628e8);
                        }
                    }
                }
                this.f3712d.mo9206y(arrayList, intExtra);
                this.f3712d.mo13062z(stringArrayList2);
            }
        }
        if (i == f3703h && i2 == -1 && NullChecker.a(intent) && intent.hasExtra("deletedMoment")) {
            this.f3711c.m10195b1(intent.getStringExtra("deletedMoment"));
        }
    }

    public void onPauseLifecycle() {
        super.onPauseLifecycle();
        this.f3712d.m13054m();
    }

    public String pageId() {
        return (nkg.m12225W() && f3705j.equals(this.f3713e)) ? "p_content_likes" : "p_activity";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("from");
        this.f3713e = NullChecker.a(stringExtra) ? stringExtra : "activities";
        this.f3714f = getIntent().getBooleanExtra("hasUnreadActivities", false);
        this.f3715g = getIntent().getBooleanExtra("needRefreshData", false);
        ((PutongAct) this).pageHelper.q(pageId());
        this.f3711c.m10198f1(stringExtra, this.f3714f, this.f3715g);
        super.preCreateView(bundle);
    }
}
