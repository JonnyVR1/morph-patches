package com.p000p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.newui.photoalbum.MomentDetailExpandBottomView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.j760;
import l.mkd0;
import l.xdl0;
import p007l.dh5;
import p007l.hx60;
import p007l.u900;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentDetailExpandBottomView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public MomentDetailExpandBottomView f2373a;

    /* JADX INFO: renamed from: b */
    public VText f2374b;

    /* JADX INFO: renamed from: c */
    public VText f2375c;

    /* JADX INFO: renamed from: d */
    public hx60 f2376d;

    /* JADX INFO: renamed from: e */
    public dh5 f2377e;

    /* JADX INFO: renamed from: f */
    public int f2378f;

    /* JADX INFO: renamed from: g */
    public String f2379g;

    /* JADX INFO: renamed from: h */
    public String f2380h;

    /* JADX INFO: renamed from: i */
    public String f2381i;

    /* JADX INFO: renamed from: j */
    public Links f2382j;

    /* JADX INFO: renamed from: k */
    public String f2383k;

    /* JADX INFO: renamed from: l */
    public String f2384l;

    /* JADX INFO: renamed from: m */
    public String f2385m;

    /* JADX INFO: renamed from: n */
    public boolean f2386n;

    public MomentDetailExpandBottomView(Context context) {
        super(context);
        this.f2386n = false;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m4154c(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m4156e(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public final void m4158g(View view) {
        u900.m14789a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m4159h(j760 j760Var) {
        boolean z;
        if (!NullChecker.a(this.f2382j) || TextUtils.isEmpty(this.f2382j.next)) {
            z = true;
        } else {
            this.f2377e.m9402f0(this.f2381i, null);
            z = false;
        }
        this.f2377e.m9387P(this.f2378f, this.f2381i, (List) j760Var.b, (Links) j760Var.a, z);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m4160i(j760 j760Var) {
        boolean z;
        if (!NullChecker.a(this.f2382j) || TextUtils.isEmpty(this.f2382j.next)) {
            z = true;
        } else {
            this.f2377e.m9402f0(this.f2381i, null);
            z = false;
        }
        this.f2377e.m9387P(this.f2378f, this.f2381i, (List) j760Var.b, (Links) j760Var.a, z);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m4161j(View view) {
        if (NullChecker.b(this.f2377e)) {
            if (this.f2377e.m9395Y(this.f2381i)) {
                this.f2377e.m9387P(this.f2378f, this.f2381i, new ArrayList(), null, false);
                return;
            }
            boolean z = this.f2386n;
            hx60 hx60Var = this.f2376d;
            if (z) {
                String str = this.f2385m;
                String str2 = this.f2383k;
                String str3 = this.f2384l;
                String str4 = this.f2381i;
                Links links = this.f2382j;
                hx60Var.m10751x(str, str2, str3, str4, links != null ? links.next : "").subscribe(mkd0.H(new e30() { // from class: l.q900
                    public final void call(Object obj) {
                        this.f12156a.m4159h((j760) obj);
                    }
                }, new e30() { // from class: l.r900
                    public final void call(Object obj) {
                        MomentDetailExpandBottomView.m4156e((Throwable) obj);
                    }
                }));
                return;
            }
            String str5 = this.f2385m;
            String str6 = this.f2379g;
            String str7 = this.f2380h;
            String str8 = this.f2381i;
            Links links2 = this.f2382j;
            hx60Var.m10750w(str5, str6, str7, str8, links2 != null ? links2.next : "").subscribe(mkd0.H(new e30() { // from class: l.s900
                public final void call(Object obj) {
                    this.f12840a.m4160i((j760) obj);
                }
            }, new e30() { // from class: l.t900
                public final void call(Object obj) {
                    MomentDetailExpandBottomView.m4154c((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m4162k(View view) {
        if (NullChecker.b(this.f2377e)) {
            this.f2377e.m9399c0(this.f2378f, this.f2381i);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m4163l(hx60 hx60Var, dh5 dh5Var, String str, String str2, String str3, Links links, String str4, boolean z, int i) {
        this.f2377e = dh5Var;
        this.f2378f = i;
        this.f2376d = hx60Var;
        this.f2379g = str;
        this.f2380h = str2;
        this.f2381i = str3;
        this.f2382j = links;
        this.f2386n = false;
        this.f2385m = str4;
        xdl0.M(this.f2375c, z);
        xdl0.M(this.f2374b, !z);
    }

    /* JADX INFO: renamed from: m */
    public void m4164m(hx60 hx60Var, dh5 dh5Var, String str, String str2, String str3, Links links, String str4, boolean z, int i) {
        this.f2377e = dh5Var;
        this.f2378f = i;
        this.f2376d = hx60Var;
        this.f2383k = str;
        this.f2384l = str2;
        this.f2381i = str3;
        this.f2382j = links;
        this.f2386n = true;
        this.f2385m = str4;
        xdl0.M(this.f2375c, z);
        xdl0.M(this.f2374b, true ^ z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4158g(this);
        this.f2374b.setOnClickListener(new View.OnClickListener() { // from class: l.o900
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11390a.m4161j(view);
            }
        });
        this.f2375c.setOnClickListener(new View.OnClickListener() { // from class: l.p900
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11734a.m4162k(view);
            }
        });
    }

    public MomentDetailExpandBottomView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2386n = false;
    }

    public MomentDetailExpandBottomView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2386n = false;
    }
}
