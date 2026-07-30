package com.p046p1.mobile.putong.feed.p060ui.moments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import java.util.List;
import p149l.af00;
import p149l.qe00;

/* JADX INFO: loaded from: classes12.dex */
public class MomentDetailAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public static String f43675e = "momentId";

    /* JADX INFO: renamed from: f */
    public static String f43676f = "ownerId";

    /* JADX INFO: renamed from: g */
    public static String f43677g = "showFullText";

    /* JADX INFO: renamed from: c */
    public qe00 f43678c;

    /* JADX INFO: renamed from: d */
    public af00 f43679d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m66660V1(Activity activity, String str, String str2, boolean z, boolean z2) {
        Intent intent = new Intent(activity, (Class<?>) MomentDetailAct.class);
        intent.putExtra(f43675e, str);
        intent.putExtra(f43676f, str2);
        intent.putExtra(f43677g, z);
        intent.putExtra("load_more", z2);
        return intent;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = this.f43679d.inflateView(layoutInflater, viewGroup);
        this.f43679d.m96175n(viewInflateView, viewGroup);
        return viewInflateView;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f43678c = new qe00(this);
        af00 af00Var = new af00(this);
        this.f43679d = af00Var;
        this.f43678c.mo51532C(af00Var);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f43678c.m174173z0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_user_moment_interactions_details_view";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f43678c.m174170U0(getIntent().getStringExtra(f43675e), getIntent().getStringExtra(f43676f), getIntent().getBooleanExtra(f43677g, false), getIntent().getBooleanExtra("load_more", false));
        super.preCreateView(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return this.f43678c.m174172X0();
    }
}
