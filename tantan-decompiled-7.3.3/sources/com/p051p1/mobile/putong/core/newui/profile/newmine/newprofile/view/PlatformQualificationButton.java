package com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import p151v.VButton;
import p151v.VFrame;
import p153l.adc0;
import p153l.bnl0;
import p153l.gra;
import p153l.kec0;
import p153l.l51;
import p153l.p9r;
import p153l.sfj0;

/* JADX INFO: loaded from: classes11.dex */
public class PlatformQualificationButton extends VFrame {

    /* JADX INFO: renamed from: a */
    public String f27547a;

    public PlatformQualificationButton(Context context) {
        super(context);
        m44660v(context);
    }

    /* JADX INFO: renamed from: v */
    private void m44660v(final Context context) {
        p9r.m171370a(context).inflate(kec0.f125489K8, this);
        final VButton vButton = (VButton) findViewById(adc0.f69992L0);
        l51.m152919y(new Runnable() { // from class: l.dd80
            @Override // java.lang.Runnable
            public final void run() {
                this.f87863a.m44661B(vButton, context);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m44661B(final VButton vButton, final Context context) {
        final boolean zM131590K2 = gra.m131590K2();
        l51.m152893M(new Runnable() { // from class: l.ed80
            @Override // java.lang.Runnable
            public final void run() {
                this.f93149a.m44663z(zM131590K2, vButton, context);
            }
        });
    }

    public void setPageId(String str) {
        this.f27547a = str;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m44662w(Context context, View view) {
        sfj0.m185596c("e_navigation_business_license_button", this.f27547a, new sfj0.C20032a[0]);
        context.startActivity(AccessTokenWebViewAct.m81333a2(context, "平台资质", "http://m.tantanapp.com/middle-platform/bussiness_license?rid=5"));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m44663z(boolean z, VButton vButton, final Context context) {
        if (!z) {
            bnl0.m105524M(vButton, false);
        } else {
            bnl0.m105524M(vButton, true);
            bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.fd80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f98325a.m44662w(context, view);
                }
            });
        }
    }

    public PlatformQualificationButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m44660v(context);
    }

    public PlatformQualificationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m44660v(context);
    }
}
