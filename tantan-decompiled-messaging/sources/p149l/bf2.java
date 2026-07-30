package p149l;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes7.dex */
public class bf2 extends Dialog {

    /* JADX INFO: renamed from: a */
    public Context f75268a;

    /* JADX INFO: renamed from: b */
    private final int f75269b;

    public bf2(Context context, int i) {
        super(context);
        this.f75268a = context;
        this.f75269b = i;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        setContentView(LayoutInflater.from(this.f75268a).inflate(this.f75269b, (ViewGroup) null));
        WindowManager.LayoutParams attributes = window.getAttributes();
        window.setGravity(80);
        window.setWindowAnimations(m8c0.f132561a);
        attributes.width = -1;
        setCancelable(true);
        window.setAttributes(attributes);
    }
}
