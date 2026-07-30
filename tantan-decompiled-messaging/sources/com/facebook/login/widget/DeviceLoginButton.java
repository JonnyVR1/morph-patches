package com.facebook.login.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.login.C1697a;
import com.facebook.login.LoginBehavior;
import p149l.bzv;
import p149l.lsb;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceLoginButton extends LoginButton {

    /* JADX INFO: renamed from: A */
    public Uri f6775A;

    /* JADX INFO: renamed from: com.facebook.login.widget.DeviceLoginButton$b */
    public class C1699b extends LoginButton.ViewOnClickListenerC1705f {
        public C1699b() {
            super();
        }

        @Override // com.facebook.login.widget.LoginButton.ViewOnClickListenerC1705f
        /* JADX INFO: renamed from: a */
        public bzv mo9153a() {
            if (lsb.m151554d(this)) {
                return null;
            }
            try {
                C1697a c1697aM9151O = C1697a.m9151O();
                c1697aM9151O.m104660C(DeviceLoginButton.this.getDefaultAudience());
                c1697aM9151O.m104663F(LoginBehavior.DEVICE_AUTH);
                c1697aM9151O.m9152P(DeviceLoginButton.this.getDeviceRedirectUri());
                return c1697aM9151O;
            } catch (Throwable th) {
                lsb.m151552b(th, this);
                return null;
            }
        }
    }

    public DeviceLoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public Uri getDeviceRedirectUri() {
        return this.f6775A;
    }

    @Override // com.facebook.login.widget.LoginButton
    public LoginButton.ViewOnClickListenerC1705f getNewLoginClickListener() {
        return new C1699b();
    }

    public void setDeviceRedirectUri(Uri uri) {
        this.f6775A = uri;
    }

    public DeviceLoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DeviceLoginButton(Context context) {
        super(context);
    }
}
