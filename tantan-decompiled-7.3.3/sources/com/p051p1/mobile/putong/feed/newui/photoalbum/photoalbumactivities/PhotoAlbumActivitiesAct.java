package com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import p153l.cmg;
import p153l.elh;
import p153l.h570;
import p153l.hnh;
import p153l.jyb;
import p153l.umg;
import p153l.umh;
import p153l.w370;
import p153l.zmh;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoAlbumActivitiesAct extends PutongAct {

    /* JADX INFO: renamed from: h */
    public static int f43090h = 256;

    /* JADX INFO: renamed from: i */
    public static int f43091i = 512;

    /* JADX INFO: renamed from: j */
    public static String f43092j = "like";

    /* JADX INFO: renamed from: k */
    public static String f43093k = "interaction";

    /* JADX INFO: renamed from: l */
    public static String f43094l = "interested_users_front_part";

    /* JADX INFO: renamed from: m */
    public static String f43095m = "interested_users_removed";

    /* JADX INFO: renamed from: n */
    public static String f43096n = "interested_users_counter";

    /* JADX INFO: renamed from: o */
    public static String f43097o = "interested_users_counter_bundle";

    /* JADX INFO: renamed from: c */
    public umh f43098c;

    /* JADX INFO: renamed from: d */
    public elh f43099d;

    /* JADX INFO: renamed from: e */
    public String f43100e;

    /* JADX INFO: renamed from: f */
    public boolean f43101f;

    /* JADX INFO: renamed from: g */
    public boolean f43102g = false;

    /* JADX INFO: renamed from: X1 */
    public static Intent m66154X1(Context context, String str, boolean z, boolean z2, boolean z3) {
        Intent intent = new Intent(context, (Class<?>) PhotoAlbumActivitiesAct.class);
        intent.putExtra("from", str);
        intent.putExtra("hasUnreadActivities", z);
        intent.putExtra("needRefreshData", z3);
        if (z2) {
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            intent.addFlags(524288);
        }
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public boolean m66155Y1() {
        return f43092j.equals(getIntent().getStringExtra("from"));
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        FeedModule.m61406H().pollUserCounters();
        if (umg.m196672i()) {
            this.f43098c.m196734R1();
        }
        super.lambda$debugItems$19();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f43099d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        if (!cmg.m111216j0() || m66155Y1()) {
            this.f43099d = new h570(this);
            this.f43098c = new w370(this);
        } else {
            this.f43099d = new hnh(this);
            this.f43098c = new zmh(this);
        }
        this.f43098c.mo52715C(this.f43099d);
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f43098c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean isAnonymousMode() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == f43091i && i2 == -1 && NullChecker.m82486a(intent)) {
            int intExtra = intent.getIntExtra(f43096n, 0);
            Bundle bundleExtra = intent.getBundleExtra(f43097o);
            if (NullChecker.m82486a(bundleExtra)) {
                ArrayList<String> stringArrayList = bundleExtra.getStringArrayList(f43094l);
                ArrayList<String> stringArrayList2 = bundleExtra.getStringArrayList(f43095m);
                ArrayList arrayList = new ArrayList();
                if (!jyb.m147479J(stringArrayList)) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        User userM145688e8 = FeedModule.f39703d.m145688e8(it.next());
                        if (NullChecker.m82486a(userM145688e8)) {
                            arrayList.add(userM145688e8);
                        }
                    }
                }
                this.f43099d.mo121174y(arrayList, intExtra);
                this.f43099d.mo121175z(stringArrayList2);
            }
        }
        if (i == f43090h && i2 == -1 && NullChecker.m82486a(intent) && intent.hasExtra("deletedMoment")) {
            this.f43098c.m196740b1(intent.getStringExtra("deletedMoment"));
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onPauseLifecycle() {
        super.onPauseLifecycle();
        this.f43099d.m121165m();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return (cmg.m111195W() && f43092j.equals(this.f43100e)) ? "p_content_likes" : "p_activity";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("from");
        this.f43100e = NullChecker.m82486a(stringExtra) ? stringExtra : "activities";
        this.f43101f = getIntent().getBooleanExtra("hasUnreadActivities", false);
        this.f43102g = getIntent().getBooleanExtra("needRefreshData", false);
        this.pageHelper.m152782q(pageId());
        this.f43098c.m196743f1(stringExtra, this.f43101f, this.f43102g);
        super.preCreateView(bundle);
    }
}
