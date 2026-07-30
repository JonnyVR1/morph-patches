package com.p046p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.feed.newui.photoalbum.MomentDetailExpandBottomView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VText;
import p149l.dh5;
import p149l.e30;
import p149l.hx60;
import p149l.j760;
import p149l.mkd0;
import p149l.u900;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class MomentDetailExpandBottomView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public MomentDetailExpandBottomView f40912a;

    /* JADX INFO: renamed from: b */
    public VText f40913b;

    /* JADX INFO: renamed from: c */
    public VText f40914c;

    /* JADX INFO: renamed from: d */
    public hx60 f40915d;

    /* JADX INFO: renamed from: e */
    public dh5 f40916e;

    /* JADX INFO: renamed from: f */
    public int f40917f;

    /* JADX INFO: renamed from: g */
    public String f40918g;

    /* JADX INFO: renamed from: h */
    public String f40919h;

    /* JADX INFO: renamed from: i */
    public String f40920i;

    /* JADX INFO: renamed from: j */
    public Links f40921j;

    /* JADX INFO: renamed from: k */
    public String f40922k;

    /* JADX INFO: renamed from: l */
    public String f40923l;

    /* JADX INFO: renamed from: m */
    public String f40924m;

    /* JADX INFO: renamed from: n */
    public boolean f40925n;

    public MomentDetailExpandBottomView(Context context) {
        super(context);
        this.f40925n = false;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m63138c(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m63140e(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public final void m63142g(View view) {
        u900.m192262a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m63143h(j760 j760Var) {
        boolean z;
        if (!NullChecker.m81303a(this.f40921j) || TextUtils.isEmpty(this.f40921j.next)) {
            z = true;
        } else {
            this.f40916e.m111807f0(this.f40920i, null);
            z = false;
        }
        this.f40916e.m111792P(this.f40917f, this.f40920i, (List) j760Var.f116565b, (Links) j760Var.f116564a, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m63144i(j760 j760Var) {
        boolean z;
        if (!NullChecker.m81303a(this.f40921j) || TextUtils.isEmpty(this.f40921j.next)) {
            z = true;
        } else {
            this.f40916e.m111807f0(this.f40920i, null);
            z = false;
        }
        this.f40916e.m111792P(this.f40917f, this.f40920i, (List) j760Var.f116565b, (Links) j760Var.f116564a, z);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m63145j(View view) {
        if (NullChecker.m81304b(this.f40916e)) {
            if (this.f40916e.m111800Y(this.f40920i)) {
                this.f40916e.m111792P(this.f40917f, this.f40920i, new ArrayList(), null, false);
                return;
            }
            boolean z = this.f40925n;
            hx60 hx60Var = this.f40915d;
            if (z) {
                String str = this.f40924m;
                String str2 = this.f40922k;
                String str3 = this.f40923l;
                String str4 = this.f40920i;
                Links links = this.f40921j;
                hx60Var.m133316x(str, str2, str3, str4, links != null ? links.next : "").subscribe(mkd0.m154956H(new e30() { // from class: l.q900
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f153352a.m63143h((j760) obj);
                    }
                }, new e30() { // from class: l.r900
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        MomentDetailExpandBottomView.m63140e((Throwable) obj);
                    }
                }));
                return;
            }
            String str5 = this.f40924m;
            String str6 = this.f40918g;
            String str7 = this.f40919h;
            String str8 = this.f40920i;
            Links links2 = this.f40921j;
            hx60Var.m133315w(str5, str6, str7, str8, links2 != null ? links2.next : "").subscribe(mkd0.m154956H(new e30() { // from class: l.s900
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f163130a.m63144i((j760) obj);
                }
            }, new e30() { // from class: l.t900
                @Override // p149l.e30
                public final void call(Object obj) {
                    MomentDetailExpandBottomView.m63138c((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m63146k(View view) {
        if (NullChecker.m81304b(this.f40916e)) {
            this.f40916e.m111804c0(this.f40917f, this.f40920i);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m63147l(hx60 hx60Var, dh5 dh5Var, String str, String str2, String str3, Links links, String str4, boolean z, int i) {
        this.f40916e = dh5Var;
        this.f40917f = i;
        this.f40915d = hx60Var;
        this.f40918g = str;
        this.f40919h = str2;
        this.f40920i = str3;
        this.f40921j = links;
        this.f40925n = false;
        this.f40924m = str4;
        xdl0.m208344M(this.f40914c, z);
        xdl0.m208344M(this.f40913b, !z);
    }

    /* JADX INFO: renamed from: m */
    public void m63148m(hx60 hx60Var, dh5 dh5Var, String str, String str2, String str3, Links links, String str4, boolean z, int i) {
        this.f40916e = dh5Var;
        this.f40917f = i;
        this.f40915d = hx60Var;
        this.f40922k = str;
        this.f40923l = str2;
        this.f40920i = str3;
        this.f40921j = links;
        this.f40925n = true;
        this.f40924m = str4;
        xdl0.m208344M(this.f40914c, z);
        xdl0.m208344M(this.f40913b, true ^ z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63142g(this);
        this.f40913b.setOnClickListener(new View.OnClickListener() { // from class: l.o900
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142688a.m63145j(view);
            }
        });
        this.f40914c.setOnClickListener(new View.OnClickListener() { // from class: l.p900
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147655a.m63146k(view);
            }
        });
    }

    public MomentDetailExpandBottomView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40925n = false;
    }

    public MomentDetailExpandBottomView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40925n = false;
    }
}
