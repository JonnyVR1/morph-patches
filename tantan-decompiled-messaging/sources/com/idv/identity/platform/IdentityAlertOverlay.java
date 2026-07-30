package com.idv.identity.platform;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import p149l.l4c0;
import p149l.y5c0;

/* JADX INFO: loaded from: classes7.dex */
public class IdentityAlertOverlay extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private InterfaceC3705d f12708a;

    /* JADX INFO: renamed from: b */
    private boolean f12709b;

    /* JADX INFO: renamed from: com.idv.identity.platform.IdentityAlertOverlay$a */
    public class ViewOnClickListenerC3702a implements View.OnClickListener {
        public ViewOnClickListenerC3702a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (IdentityAlertOverlay.this.f12708a != null) {
                IdentityAlertOverlay.this.f12708a.onCancel();
                IdentityAlertOverlay.this.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.IdentityAlertOverlay$b */
    public class ViewOnClickListenerC3703b implements View.OnClickListener {
        public ViewOnClickListenerC3703b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (IdentityAlertOverlay.this.f12708a != null) {
                IdentityAlertOverlay.this.f12708a.mo17692a();
                IdentityAlertOverlay.this.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.IdentityAlertOverlay$c */
    public class ViewOnClickListenerC3704c implements View.OnClickListener {
        public ViewOnClickListenerC3704c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (IdentityAlertOverlay.this.f12708a != null) {
                IdentityAlertOverlay.this.f12708a.mo17692a();
                IdentityAlertOverlay.this.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.IdentityAlertOverlay$d */
    public interface InterfaceC3705d {
        /* JADX INFO: renamed from: a */
        void mo17692a();

        void onCancel();
    }

    public IdentityAlertOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12708a = null;
        this.f12709b = true;
        LayoutInflater.from(context).inflate(y5c0.f196410d, this);
        View viewFindViewById = findViewById(l4c0.f125997f);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC3702a());
        }
        View viewFindViewById2 = findViewById(l4c0.f125998g);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC3703b());
        }
        View viewFindViewById3 = findViewById(l4c0.f125999h);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(new ViewOnClickListenerC3704c());
        }
    }

    public void setButtonType(boolean z) {
        View viewFindViewById = findViewById(l4c0.f125995d);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(z ? 4 : 0);
        }
        View viewFindViewById2 = findViewById(l4c0.f125996e);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(z ? 0 : 4);
        }
        this.f12709b = z;
    }

    public void setCancelColor(int i) {
        TextView textView = (TextView) findViewById(l4c0.f125997f);
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setCancelText(String str) {
        TextView textView = (TextView) findViewById(l4c0.f125997f);
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setCommAlertOverlayListener(InterfaceC3705d interfaceC3705d) {
        this.f12708a = interfaceC3705d;
    }

    public void setConfirmColor(int i) {
        TextView textView = (TextView) findViewById(l4c0.f125998g);
        if (textView != null) {
            textView.setTextColor(i);
        }
        TextView textView2 = (TextView) findViewById(l4c0.f125999h);
        if (textView2 != null) {
            textView2.setTextColor(i);
        }
    }

    public void setConfirmText(String str) {
        if (this.f12709b) {
            TextView textView = (TextView) findViewById(l4c0.f125998g);
            if (textView != null) {
                textView.setText(str);
                return;
            }
            return;
        }
        TextView textView2 = (TextView) findViewById(l4c0.f125999h);
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    public void setMessageText(String str) {
        TextView textView = (TextView) findViewById(l4c0.f126000i);
        if (textView != null) {
            if (str == null || TextUtils.isEmpty(str)) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
                textView.setVisibility(0);
            }
        }
    }

    public void setMsgColor(int i) {
        TextView textView = (TextView) findViewById(l4c0.f126000i);
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setTitleColor(int i) {
        TextView textView = (TextView) findViewById(l4c0.f126001j);
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setTitleText(String str) {
        TextView textView = (TextView) findViewById(l4c0.f126001j);
        if (textView != null) {
            if (str == null || TextUtils.isEmpty(str)) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
                textView.setVisibility(0);
            }
        }
    }

    public IdentityAlertOverlay(Context context) {
        this(context, null);
    }
}
