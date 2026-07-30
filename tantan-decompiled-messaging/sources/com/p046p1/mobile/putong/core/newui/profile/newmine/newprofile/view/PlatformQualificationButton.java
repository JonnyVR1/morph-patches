package com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;
import p147v.VButton;
import p147v.VFrame;
import p149l.e51;
import p149l.f6c0;
import p149l.o6j0;
import p149l.o7r;
import p149l.u4c0;
import p149l.upa;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class PlatformQualificationButton extends VFrame {

    /* JADX INFO: renamed from: a */
    public String f26699a;

    public PlatformQualificationButton(Context context) {
        super(context);
        m43474v(context);
    }

    /* JADX INFO: renamed from: v */
    private void m43474v(final Context context) {
        o7r.m163037a(context).inflate(f6c0.f95323D8, this);
        final VButton vButton = (VButton) findViewById(u4c0.f173904L0);
        e51.m114774y(new Runnable() { // from class: l.x480
            @Override // java.lang.Runnable
            public final void run() {
                this.f190949a.m43475B(vButton, context);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m43475B(final VButton vButton, final Context context) {
        final boolean zM194659K2 = upa.m194659K2();
        e51.m114748M(new Runnable() { // from class: l.y480
            @Override // java.lang.Runnable
            public final void run() {
                this.f195919a.m43477z(zM194659K2, vButton, context);
            }
        });
    }

    public void setPageId(String str) {
        this.f26699a = str;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m43476w(Context context, View view) {
        o6j0.m162859c("e_navigation_business_license_button", this.f26699a, new o6j0.C18854a[0]);
        context.startActivity(AccessTokenWebViewAct.m80150Z1(context, "平台资质", "http://m.tantanapp.com/middle-platform/bussiness_license?rid=5"));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m43477z(boolean z, VButton vButton, final Context context) {
        if (!z) {
            xdl0.m208344M(vButton, false);
        } else {
            xdl0.m208344M(vButton, true);
            xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.z480
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f201444a.m43476w(context, view);
                }
            });
        }
    }

    public PlatformQualificationButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m43474v(context);
    }

    public PlatformQualificationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m43474v(context);
    }
}
