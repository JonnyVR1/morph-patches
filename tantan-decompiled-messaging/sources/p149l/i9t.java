package p149l;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.appcompat.app.DialogInterfaceC0074a;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: loaded from: classes13.dex */
public class i9t extends DialogInterfaceC0074a {

    /* JADX INFO: renamed from: b */
    public int f112255b;

    /* JADX INFO: renamed from: c */
    public View f112256c;

    public i9t(@NonNull Context context, int i, View view) {
        super(context, i);
        this.f112255b = b8c0.f74086c;
        setOwnerActivity((Activity) context);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.fitsSystemWindows});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        view.setFitsSystemWindows(z);
        this.f112256c = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m135088v() {
        super.onBackPressed();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().mo302g(d5c0.f84417F0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        e51.m114743H(getContext(), new Runnable() { // from class: l.h9t
            @Override // java.lang.Runnable
            public final void run() {
                this.f106635a.m135088v();
            }
        }, 50L);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.width = -1;
        attributes.height = -1;
        window.setWindowAnimations(this.f112255b);
        window.setAttributes(attributes);
        window.clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        window.clearFlags(131072);
        window.getDecorView().setSystemUiVisibility(1024);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        setContentView(this.f112256c);
    }

    /* JADX INFO: renamed from: u */
    public View m135089u() {
        return this.f112256c;
    }

    public i9t(@NonNull Context context, View view) {
        this(context, b8c0.f74087d, view);
    }
}
