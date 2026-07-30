package com.idv.identity.face.p036ui.overlay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import p149l.j4c0;
import p149l.w5c0;

/* JADX INFO: loaded from: classes7.dex */
public class CommAlertOverlay extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private boolean f12183a;

    /* JADX INFO: renamed from: com.idv.identity.face.ui.overlay.CommAlertOverlay$a */
    public class ViewOnClickListenerC3570a implements View.OnClickListener {
        public ViewOnClickListenerC3570a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommAlertOverlay.m17700a(CommAlertOverlay.this);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.overlay.CommAlertOverlay$b */
    public class ViewOnClickListenerC3571b implements View.OnClickListener {
        public ViewOnClickListenerC3571b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommAlertOverlay.m17700a(CommAlertOverlay.this);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.overlay.CommAlertOverlay$c */
    public class ViewOnClickListenerC3572c implements View.OnClickListener {
        public ViewOnClickListenerC3572c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommAlertOverlay.m17700a(CommAlertOverlay.this);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.overlay.CommAlertOverlay$d */
    public interface InterfaceC3573d {
    }

    public CommAlertOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12183a = true;
        LayoutInflater.from(context).inflate(w5c0.f184669b, this);
        View viewFindViewById = findViewById(j4c0.f116159f);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC3570a());
        }
        View viewFindViewById2 = findViewById(j4c0.f116160g);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC3571b());
        }
        View viewFindViewById3 = findViewById(j4c0.f116161h);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(new ViewOnClickListenerC3572c());
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC3573d m17700a(CommAlertOverlay commAlertOverlay) {
        commAlertOverlay.getClass();
        return null;
    }

    public void setButtonType(boolean z) {
        View viewFindViewById = findViewById(j4c0.f116157d);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(z ? 4 : 0);
        }
        View viewFindViewById2 = findViewById(j4c0.f116158e);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(z ? 0 : 4);
        }
        this.f12183a = z;
    }

    public void setCancelText(String str) {
        TextView textView = (TextView) findViewById(j4c0.f116159f);
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setCommAlertOverlayListener(InterfaceC3573d interfaceC3573d) {
    }

    public void setConfirmText(String str) {
        if (this.f12183a) {
            TextView textView = (TextView) findViewById(j4c0.f116160g);
            if (textView != null) {
                textView.setText(str);
                return;
            }
            return;
        }
        TextView textView2 = (TextView) findViewById(j4c0.f116161h);
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    public void setMessageText(String str) {
        TextView textView = (TextView) findViewById(j4c0.f116162i);
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTitleText(String str) {
        TextView textView = (TextView) findViewById(j4c0.f116163j);
        if (textView != null) {
            textView.setText(str);
        }
    }
}
