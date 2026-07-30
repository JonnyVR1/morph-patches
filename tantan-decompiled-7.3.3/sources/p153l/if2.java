package p153l;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes7.dex */
public class if2 extends Dialog {

    /* JADX INFO: renamed from: a */
    public Context f114642a;

    /* JADX INFO: renamed from: b */
    private final int f114643b;

    public if2(Context context, int i) {
        super(context);
        this.f114642a = context;
        this.f114643b = i;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        setContentView(LayoutInflater.from(this.f114642a).inflate(this.f114643b, (ViewGroup) null));
        WindowManager.LayoutParams attributes = window.getAttributes();
        window.setGravity(80);
        window.setWindowAnimations(sgc0.f167844a);
        attributes.width = -1;
        setCancelable(true);
        window.setAttributes(attributes);
    }
}
