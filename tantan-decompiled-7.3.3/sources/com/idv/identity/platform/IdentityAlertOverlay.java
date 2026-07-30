package com.idv.identity.platform;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import p153l.eec0;
import p153l.scc0;

/* JADX INFO: loaded from: classes7.dex */
public class IdentityAlertOverlay extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private InterfaceC3864d f13449a;

    /* JADX INFO: renamed from: b */
    private boolean f13450b;

    /* JADX INFO: renamed from: com.idv.identity.platform.IdentityAlertOverlay$a */
    public class ViewOnClickListenerC3861a implements View.OnClickListener {
        public ViewOnClickListenerC3861a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (IdentityAlertOverlay.this.f13449a != null) {
                IdentityAlertOverlay.this.f13449a.onCancel();
                IdentityAlertOverlay.this.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.IdentityAlertOverlay$b */
    public class ViewOnClickListenerC3862b implements View.OnClickListener {
        public ViewOnClickListenerC3862b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (IdentityAlertOverlay.this.f13449a != null) {
                IdentityAlertOverlay.this.f13449a.mo18769a();
                IdentityAlertOverlay.this.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.IdentityAlertOverlay$c */
    public class ViewOnClickListenerC3863c implements View.OnClickListener {
        public ViewOnClickListenerC3863c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (IdentityAlertOverlay.this.f13449a != null) {
                IdentityAlertOverlay.this.f13449a.mo18769a();
                IdentityAlertOverlay.this.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.IdentityAlertOverlay$d */
    public interface InterfaceC3864d {
        /* JADX INFO: renamed from: a */
        void mo18769a();

        void onCancel();
    }

    public IdentityAlertOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13449a = null;
        this.f13450b = true;
        LayoutInflater.from(context).inflate(eec0.f93635d, this);
        View viewFindViewById = findViewById(scc0.f167217f);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC3861a());
        }
        View viewFindViewById2 = findViewById(scc0.f167218g);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC3862b());
        }
        View viewFindViewById3 = findViewById(scc0.f167219h);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(new ViewOnClickListenerC3863c());
        }
    }

    public void setButtonType(boolean z) {
        View viewFindViewById = findViewById(scc0.f167215d);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(z ? 4 : 0);
        }
        View viewFindViewById2 = findViewById(scc0.f167216e);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(z ? 0 : 4);
        }
        this.f13450b = z;
    }

    public void setCancelColor(int i) {
        TextView textView = (TextView) findViewById(scc0.f167217f);
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setCancelText(String str) {
        TextView textView = (TextView) findViewById(scc0.f167217f);
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setCommAlertOverlayListener(InterfaceC3864d interfaceC3864d) {
        this.f13449a = interfaceC3864d;
    }

    public void setConfirmColor(int i) {
        TextView textView = (TextView) findViewById(scc0.f167218g);
        if (textView != null) {
            textView.setTextColor(i);
        }
        TextView textView2 = (TextView) findViewById(scc0.f167219h);
        if (textView2 != null) {
            textView2.setTextColor(i);
        }
    }

    public void setConfirmText(String str) {
        if (this.f13450b) {
            TextView textView = (TextView) findViewById(scc0.f167218g);
            if (textView != null) {
                textView.setText(str);
                return;
            }
            return;
        }
        TextView textView2 = (TextView) findViewById(scc0.f167219h);
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    public void setMessageText(String str) {
        TextView textView = (TextView) findViewById(scc0.f167220i);
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
        TextView textView = (TextView) findViewById(scc0.f167220i);
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setTitleColor(int i) {
        TextView textView = (TextView) findViewById(scc0.f167221j);
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setTitleText(String str) {
        TextView textView = (TextView) findViewById(scc0.f167221j);
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
