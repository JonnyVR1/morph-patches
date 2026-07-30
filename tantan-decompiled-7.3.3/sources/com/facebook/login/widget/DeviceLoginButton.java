package com.facebook.login.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.login.C1720a;
import com.facebook.login.LoginBehavior;
import p153l.z0w;
import p153l.ztb;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceLoginButton extends LoginButton {

    /* JADX INFO: renamed from: A */
    public Uri f6812A;

    /* JADX INFO: renamed from: com.facebook.login.widget.DeviceLoginButton$b */
    public class C1722b extends LoginButton.ViewOnClickListenerC1728f {
        public C1722b() {
            super();
        }

        @Override // com.facebook.login.widget.LoginButton.ViewOnClickListenerC1728f
        /* JADX INFO: renamed from: a */
        public z0w mo9207a() {
            if (ztb.m221490d(this)) {
                return null;
            }
            try {
                C1720a c1720aM9205O = C1720a.m9205O();
                c1720aM9205O.m218191C(DeviceLoginButton.this.getDefaultAudience());
                c1720aM9205O.m218194F(LoginBehavior.DEVICE_AUTH);
                c1720aM9205O.m9206P(DeviceLoginButton.this.getDeviceRedirectUri());
                return c1720aM9205O;
            } catch (Throwable th) {
                ztb.m221488b(th, this);
                return null;
            }
        }
    }

    public DeviceLoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public Uri getDeviceRedirectUri() {
        return this.f6812A;
    }

    @Override // com.facebook.login.widget.LoginButton
    public LoginButton.ViewOnClickListenerC1728f getNewLoginClickListener() {
        return new C1722b();
    }

    public void setDeviceRedirectUri(Uri uri) {
        this.f6812A = uri;
    }

    public DeviceLoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DeviceLoginButton(Context context) {
        super(context);
    }
}
