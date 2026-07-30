package p153l;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.appcompat.app.DialogInterfaceC0075a;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: loaded from: classes13.dex */
public class jbt extends DialogInterfaceC0075a {

    /* JADX INFO: renamed from: b */
    public int f119990b;

    /* JADX INFO: renamed from: c */
    public View f119991c;

    public jbt(@NonNull Context context, int i, View view) {
        super(context, i);
        this.f119990b = ggc0.f104005c;
        setOwnerActivity((Activity) context);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.fitsSystemWindows});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        view.setFitsSystemWindows(z);
        this.f119991c = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m144328v() {
        super.onBackPressed();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().mo303g(jdc0.f120135F0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        l51.m152888H(getContext(), new Runnable() { // from class: l.ibt
            @Override // java.lang.Runnable
            public final void run() {
                this.f114246a.m144328v();
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
        window.setWindowAnimations(this.f119990b);
        window.setAttributes(attributes);
        window.clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        window.clearFlags(131072);
        window.getDecorView().setSystemUiVisibility(1024);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        setContentView(this.f119991c);
    }

    /* JADX INFO: renamed from: u */
    public View m144329u() {
        return this.f119991c;
    }

    public jbt(@NonNull Context context, View view) {
        this(context, ggc0.f104006d, view);
    }
}
