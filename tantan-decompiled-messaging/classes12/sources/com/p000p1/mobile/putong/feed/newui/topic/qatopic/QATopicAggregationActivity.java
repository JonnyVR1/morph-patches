package com.p000p1.mobile.putong.feed.newui.topic.qatopic;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.NavigationIntent;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.app.PutongAct;
import org.json.JSONObject;
import p007l.bmb0;
import p007l.kjb0;
import p007l.lmb0;
import p007l.p6j0;
import p007l.w4i;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class QATopicAggregationActivity extends PutongAct {

    /* JADX INFO: renamed from: c */
    public bmb0 f4546c;

    /* JADX INFO: renamed from: d */
    public lmb0 f4547d;

    /* JADX INFO: renamed from: e */
    public JSONObject f4548e;

    /* JADX INFO: renamed from: V1 */
    public static Intent m7127V1(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) QATopicAggregationActivity.class);
        intent.putExtra("topic_id", str);
        intent.putExtra("from", str2);
        intent.addFlags(67108864);
        return intent;
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m7128X1(Context context, String str, String str2, String str3) {
        Intent intentM7127V1 = m7127V1(context, str, str2);
        intentM7127V1.putExtra("single_topic_moment", str3);
        return intentM7127V1;
    }

    /* JADX INFO: renamed from: Y1 */
    public JSONObject m7129Y1() {
        return this.f4548e;
    }

    public boolean disableAutoPV() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        if (!w4i.m15692c()) {
            startActivity(kjb0.m11455g(this, NavigationIntent.get("moment")));
        }
        super/*com.p1.mobile.android.app.Act*/.finish();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f4547d.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        this.f4547d = new lmb0(this);
        bmb0 bmb0Var = new bmb0(this);
        this.f4546c = bmb0Var;
        bmb0Var.C(this.f4547d);
        super.initDataOnCreate();
    }

    public void initSubscription() {
        super.initSubscription();
        this.f4546c.m8943a0();
    }

    public void onBackPressed() {
        QATopicPhotoAlbumFeedFrag qATopicPhotoAlbumFeedFrag = (Frag) fragmentManager().h0(R.id.content);
        if (qATopicPhotoAlbumFeedFrag instanceof QATopicPhotoAlbumFeedFrag) {
            qATopicPhotoAlbumFeedFrag.mo7058o();
        } else {
            super/*androidx.activity.ComponentActivity*/.onBackPressed();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPauseLifecycle() {
        PhotoAlbumPictureView.m4886u(getWindow().getDecorView(), false);
        super.onPauseLifecycle();
    }

    public String pageId() {
        return "p_topic_detail";
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        JSONObject jSONObjectM12911a = p6j0.m12911a(p6j0.C2456a.m12922g("topic_detail_source", this.f4546c.m8944g0()), p6j0.C2456a.m12922g("topic_type", "qa"), p6j0.C2456a.m12922g("topic_id", this.f4546c.f6373b));
        this.f4548e = jSONObjectM12911a;
        ((PutongAct) this).pageHelper.o(jSONObjectM12911a);
    }
}
