package com.p000p1.mobile.putong.feed.p005ui.moments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongAct;
import java.util.List;
import p007l.af00;
import p007l.qe00;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentDetailAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public static String f5136e = "momentId";

    /* JADX INFO: renamed from: f */
    public static String f5137f = "ownerId";

    /* JADX INFO: renamed from: g */
    public static String f5138g = "showFullText";

    /* JADX INFO: renamed from: c */
    public qe00 f5139c;

    /* JADX INFO: renamed from: d */
    public af00 f5140d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m7851V1(Activity activity, String str, String str2, boolean z, boolean z2) {
        Intent intent = new Intent(activity, (Class<?>) MomentDetailAct.class);
        intent.putExtra(f5136e, str);
        intent.putExtra(f5137f, str2);
        intent.putExtra(f5138g, z);
        intent.putExtra("load_more", z2);
        return intent;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = this.f5140d.inflateView(layoutInflater, viewGroup);
        this.f5140d.m8529n(viewInflateView, viewGroup);
        return viewInflateView;
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f5139c = new qe00(this);
        af00 af00Var = new af00(this);
        this.f5140d = af00Var;
        this.f5139c.C(af00Var);
    }

    public void initSubscription() {
        super.initSubscription();
        this.f5139c.m13545z0();
    }

    public String pageId() {
        return "p_user_moment_interactions_details_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        this.f5139c.m13542U0(getIntent().getStringExtra(f5136e), getIntent().getStringExtra(f5137f), getIntent().getBooleanExtra(f5138g, false), getIntent().getBooleanExtra("load_more", false));
        super.preCreateView(bundle);
    }

    public List<Object> trackedArgs() {
        return this.f5139c.m13544X0();
    }
}
