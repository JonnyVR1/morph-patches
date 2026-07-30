package p009l;

import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.gift.layer.CoreGiftLayer;
import l.d30;
import l.f6c0;
import l.szd;
import l.v7c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ebw extends szd {

    /* JADX INFO: renamed from: j */
    public Act f12494j;

    /* JADX INFO: renamed from: k */
    public CoreGiftLayer f12495k;

    /* JADX INFO: renamed from: l */
    public d30 f12496l;

    /* JADX INFO: renamed from: m */
    public d30 f12497m;

    public ebw(Act act, d30 d30Var, d30 d30Var2) {
        super(act, false, v7c0.j);
        this.f12494j = act;
        this.f12496l = d30Var;
        this.f12497m = d30Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m13808H() {
        d30 d30Var = this.f12496l;
        if (d30Var != null) {
            d30Var.call();
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m13809I() {
        d30 d30Var = this.f12496l;
        if (d30Var != null) {
            d30Var.call();
        }
        this.f12495k.F();
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m13810J() {
        d30 d30Var = this.f12497m;
        if (d30Var != null) {
            d30Var.call();
        }
        dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        super/*androidx.appcompat.app.a*/.onCreate(bundle);
        CoreGiftLayer coreGiftLayerInflate = this.f12494j.inflater().inflate(f6c0.t3, (ViewGroup) null, false);
        this.f12495k = coreGiftLayerInflate;
        setContentView(coreGiftLayerInflate);
        setCancelable(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        super/*android.app.Dialog*/.onStart();
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
        window.clearFlags(67108864);
        window.clearFlags(131072);
        window.getDecorView().setSystemUiVisibility(1024);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    public void show() {
        super.show();
        this.f12495k.setErrorWhenFrameJank(true);
        this.f12495k.z(hbw.m15503e().m15507d(), new d30() { // from class: l.bbw
            public final void call() {
                this.f10004a.m13808H();
            }
        }, new d30() { // from class: l.cbw
            public final void call() {
                this.f10504a.m13809I();
            }
        }, new d30() { // from class: l.dbw
            public final void call() {
                this.f11720a.m13810J();
            }
        });
    }
}
