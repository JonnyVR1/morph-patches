package com.idv.identity.face.p043ui.overlay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import p153l.cec0;
import p153l.qcc0;

/* JADX INFO: loaded from: classes7.dex */
public class CommAlertOverlay extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private boolean f12924a;

    /* JADX INFO: renamed from: com.idv.identity.face.ui.overlay.CommAlertOverlay$a */
    public class ViewOnClickListenerC3729a implements View.OnClickListener {
        public ViewOnClickListenerC3729a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommAlertOverlay.m18777a(CommAlertOverlay.this);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.overlay.CommAlertOverlay$b */
    public class ViewOnClickListenerC3730b implements View.OnClickListener {
        public ViewOnClickListenerC3730b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommAlertOverlay.m18777a(CommAlertOverlay.this);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.overlay.CommAlertOverlay$c */
    public class ViewOnClickListenerC3731c implements View.OnClickListener {
        public ViewOnClickListenerC3731c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommAlertOverlay.m18777a(CommAlertOverlay.this);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.overlay.CommAlertOverlay$d */
    public interface InterfaceC3732d {
    }

    public CommAlertOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12924a = true;
        LayoutInflater.from(context).inflate(cec0.f81337b, this);
        View viewFindViewById = findViewById(qcc0.f156578f);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC3729a());
        }
        View viewFindViewById2 = findViewById(qcc0.f156579g);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC3730b());
        }
        View viewFindViewById3 = findViewById(qcc0.f156580h);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(new ViewOnClickListenerC3731c());
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC3732d m18777a(CommAlertOverlay commAlertOverlay) {
        commAlertOverlay.getClass();
        return null;
    }

    public void setButtonType(boolean z) {
        View viewFindViewById = findViewById(qcc0.f156576d);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(z ? 4 : 0);
        }
        View viewFindViewById2 = findViewById(qcc0.f156577e);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(z ? 0 : 4);
        }
        this.f12924a = z;
    }

    public void setCancelText(String str) {
        TextView textView = (TextView) findViewById(qcc0.f156578f);
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setCommAlertOverlayListener(InterfaceC3732d interfaceC3732d) {
    }

    public void setConfirmText(String str) {
        if (this.f12924a) {
            TextView textView = (TextView) findViewById(qcc0.f156579g);
            if (textView != null) {
                textView.setText(str);
                return;
            }
            return;
        }
        TextView textView2 = (TextView) findViewById(qcc0.f156580h);
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    public void setMessageText(String str) {
        TextView textView = (TextView) findViewById(qcc0.f156581i);
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTitleText(String str) {
        TextView textView = (TextView) findViewById(qcc0.f156582j);
        if (textView != null) {
            textView.setText(str);
        }
    }
}
