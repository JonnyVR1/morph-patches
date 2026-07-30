package com.p051p1.mobile.putong.feed.p065ui.moments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import java.util.List;
import p153l.jn00;
import p153l.zm00;

/* JADX INFO: loaded from: classes13.dex */
public class MomentDetailAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public static String f44523e = "momentId";

    /* JADX INFO: renamed from: f */
    public static String f44524f = "ownerId";

    /* JADX INFO: renamed from: g */
    public static String f44525g = "showFullText";

    /* JADX INFO: renamed from: c */
    public zm00 f44526c;

    /* JADX INFO: renamed from: d */
    public jn00 f44527d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m67843X1(Activity activity, String str, String str2, boolean z, boolean z2) {
        Intent intent = new Intent(activity, (Class<?>) MomentDetailAct.class);
        intent.putExtra(f44523e, str);
        intent.putExtra(f44524f, str2);
        intent.putExtra(f44525g, z);
        intent.putExtra("load_more", z2);
        return intent;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = this.f44527d.inflateView(layoutInflater, viewGroup);
        this.f44527d.m146198n(viewInflateView, viewGroup);
        return viewInflateView;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f44526c = new zm00(this);
        jn00 jn00Var = new jn00(this);
        this.f44527d = jn00Var;
        this.f44526c.mo52715C(jn00Var);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f44526c.m220346z0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_user_moment_interactions_details_view";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f44526c.m220343U0(getIntent().getStringExtra(f44523e), getIntent().getStringExtra(f44524f), getIntent().getBooleanExtra(f44525g, false), getIntent().getBooleanExtra("load_more", false));
        super.preCreateView(bundle);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return this.f44526c.m220345X0();
    }
}
