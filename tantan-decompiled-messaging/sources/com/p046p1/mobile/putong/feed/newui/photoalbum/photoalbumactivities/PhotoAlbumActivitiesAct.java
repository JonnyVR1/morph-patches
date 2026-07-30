package com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import p149l.bx60;
import p149l.flg;
import p149l.flh;
import p149l.klh;
import p149l.nkg;
import p149l.pjh;
import p149l.qv60;
import p149l.slh;
import p149l.vwb;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoAlbumActivitiesAct extends PutongAct {

    /* JADX INFO: renamed from: h */
    public static int f42242h = 256;

    /* JADX INFO: renamed from: i */
    public static int f42243i = 512;

    /* JADX INFO: renamed from: j */
    public static String f42244j = "like";

    /* JADX INFO: renamed from: k */
    public static String f42245k = "interaction";

    /* JADX INFO: renamed from: l */
    public static String f42246l = "interested_users_front_part";

    /* JADX INFO: renamed from: m */
    public static String f42247m = "interested_users_removed";

    /* JADX INFO: renamed from: n */
    public static String f42248n = "interested_users_counter";

    /* JADX INFO: renamed from: o */
    public static String f42249o = "interested_users_counter_bundle";

    /* JADX INFO: renamed from: c */
    public flh f42250c;

    /* JADX INFO: renamed from: d */
    public pjh f42251d;

    /* JADX INFO: renamed from: e */
    public String f42252e;

    /* JADX INFO: renamed from: f */
    public boolean f42253f;

    /* JADX INFO: renamed from: g */
    public boolean f42254g = false;

    /* JADX INFO: renamed from: V1 */
    public static Intent m64971V1(Context context, String str, boolean z, boolean z2, boolean z3) {
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

    /* JADX INFO: renamed from: X1 */
    public boolean m64972X1() {
        return f42244j.equals(getIntent().getStringExtra("from"));
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        FeedModule.m60222H().pollUserCounters();
        if (flg.m121984i()) {
            this.f42250c.m122046R1();
        }
        super.lambda$debugItems$19();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f42251d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        if (!nkg.m159887j0() || m64972X1()) {
            this.f42251d = new bx60(this);
            this.f42250c = new qv60(this);
        } else {
            this.f42251d = new slh(this);
            this.f42250c = new klh(this);
        }
        this.f42250c.mo51532C(this.f42251d);
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f42250c.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean isAnonymousMode() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == f42243i && i2 == -1 && NullChecker.m81303a(intent)) {
            int intExtra = intent.getIntExtra(f42248n, 0);
            Bundle bundleExtra = intent.getBundleExtra(f42249o);
            if (NullChecker.m81303a(bundleExtra)) {
                ArrayList<String> stringArrayList = bundleExtra.getStringArrayList(f42246l);
                ArrayList<String> stringArrayList2 = bundleExtra.getStringArrayList(f42247m);
                ArrayList arrayList = new ArrayList();
                if (!vwb.m200296J(stringArrayList)) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        User userM209447e8 = FeedModule.f38855d.m209447e8(it.next());
                        if (NullChecker.m81303a(userM209447e8)) {
                            arrayList.add(userM209447e8);
                        }
                    }
                }
                this.f42251d.mo107468y(arrayList, intExtra);
                this.f42251d.mo169865z(stringArrayList2);
            }
        }
        if (i == f42242h && i2 == -1 && NullChecker.m81303a(intent) && intent.hasExtra("deletedMoment")) {
            this.f42250c.m122052b1(intent.getStringExtra("deletedMoment"));
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onPauseLifecycle() {
        super.onPauseLifecycle();
        this.f42251d.m169857m();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return (nkg.m159866W() && f42244j.equals(this.f42252e)) ? "p_content_likes" : "p_activity";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("from");
        this.f42252e = NullChecker.m81303a(stringExtra) ? stringExtra : "activities";
        this.f42253f = getIntent().getBooleanExtra("hasUnreadActivities", false);
        this.f42254g = getIntent().getBooleanExtra("needRefreshData", false);
        this.pageHelper.m109041q(pageId());
        this.f42250c.m122055f1(stringExtra, this.f42253f, this.f42254g);
        super.preCreateView(bundle);
    }
}
