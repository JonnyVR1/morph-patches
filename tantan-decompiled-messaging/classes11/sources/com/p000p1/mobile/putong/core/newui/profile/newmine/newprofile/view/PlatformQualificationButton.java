package com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.p004ui.webview.AccessTokenWebViewAct;
import l.e51;
import l.f6c0;
import l.o6j0;
import l.u4c0;
import l.upa;
import l.xdl0;
import p009l.o7r;
import v.VButton;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class PlatformQualificationButton extends VFrame {

    /* JADX INFO: renamed from: a */
    public String f5477a;

    public PlatformQualificationButton(Context context) {
        super(context);
        m7720v(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    private void m7720v(final Context context) {
        o7r.m19649a(context).inflate(f6c0.D8, (ViewGroup) this);
        final VButton vButtonFindViewById = findViewById(u4c0.L0);
        e51.y(new Runnable() { // from class: l.x480
            @Override // java.lang.Runnable
            public final void run() {
                this.f22427a.m7721B(vButtonFindViewById, context);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m7721B(final VButton vButton, final Context context) {
        final boolean zK2 = upa.K2();
        e51.M(new Runnable() { // from class: l.y480
            @Override // java.lang.Runnable
            public final void run() {
                this.f22889a.m7723z(zK2, vButton, context);
            }
        });
    }

    public void setPageId(String str) {
        this.f5477a = str;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m7722w(Context context, View view) {
        o6j0.c("e_navigation_business_license_button", this.f5477a, new o6j0.a[0]);
        context.startActivity(AccessTokenWebViewAct.m10482Z1(context, "平台资质", "http://m.tantanapp.com/middle-platform/bussiness_license?rid=5"));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m7723z(boolean z, VButton vButton, final Context context) {
        if (!z) {
            xdl0.M(vButton, false);
        } else {
            xdl0.M(vButton, true);
            xdl0.E0(vButton, new View.OnClickListener() { // from class: l.z480
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f23342a.m7722w(context, view);
                }
            });
        }
    }

    public PlatformQualificationButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7720v(context);
    }

    public PlatformQualificationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7720v(context);
    }
}
