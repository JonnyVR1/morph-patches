package p153l;

import android.app.Activity;
import android.widget.PopupWindow;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p051p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class j0b0 extends fqe0 {

    /* JADX INFO: renamed from: i */
    public Activity f117805i;

    /* JADX INFO: renamed from: j */
    public String f117806j;

    /* JADX INFO: renamed from: k */
    public Picture.ImageUri f117807k;

    /* JADX INFO: renamed from: l */
    public boolean f117808l;

    public j0b0(Activity activity, String str, int i, Picture.ImageUri imageUri, boolean z) {
        this.f117805i = activity;
        this.f117806j = str;
        this.f117807k = imageUri;
        this.f117808l = z;
        m146059r(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m142962C() {
        if (NullChecker.m82486a(this.f121543b)) {
            this.f121543b.call();
        }
    }

    @Override // p153l.fqe0
    /* JADX INFO: renamed from: A */
    public int mo22133A() {
        pcj<Boolean> pcjVar = this.f100279d;
        if ((pcjVar == null || pcjVar.call().booleanValue()) && !this.f117805i.isFinishing()) {
            o0b0.m165434j(this.f117805i, this.f117806j, new x20() { // from class: l.i0b0
                @Override // p153l.x20
                public final void call() {
                    this.f112345a.m142962C();
                }
            }, this.f117807k, this.f117808l);
            return 3000;
        }
        if (!NullChecker.m82486a(this.f121543b)) {
            return 0;
        }
        this.f121543b.call();
        return 0;
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: f */
    public void mo21864f(boolean z) {
        PopupWindow popupWindowM165430f = o0b0.m165430f();
        if (popupWindowM165430f == null || !popupWindowM165430f.isShowing()) {
            return;
        }
        if (z) {
            popupWindowM165430f.getContentView().setTranslationY(0.0f);
            popupWindowM165430f.getContentView().setAlpha(1.0f);
        } else {
            popupWindowM165430f.getContentView().setTranslationY(-4000.0f);
            popupWindowM165430f.getContentView().setAlpha(0.0f);
        }
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: j */
    public int mo22137j() {
        return this.f117805i.hashCode();
    }

    @Override // p153l.f3m
    /* JADX INFO: renamed from: m */
    public Act getAct() {
        return (Act) this.f117805i;
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: n */
    public void mo21871n(boolean z) {
        PopupWindow popupWindowM165430f = o0b0.m165430f();
        if (popupWindowM165430f == null || !popupWindowM165430f.isShowing()) {
            return;
        }
        popupWindowM165430f.dismiss();
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: o */
    public String mo22139o() {
        return MagicBubble.PROFILE_MOMENT_SEND_MESSAGE_FLOAT.getGroup();
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: p */
    public String getBubbleId() {
        return MagicBubble.PROFILE_MOMENT_SEND_MESSAGE_FLOAT.getId();
    }
}
