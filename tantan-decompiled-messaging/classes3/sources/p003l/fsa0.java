package p003l;

import android.app.Activity;
import android.widget.PopupWindow;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import l.aie0;
import l.fdb0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class fsa0 extends aie0 {

    /* JADX INFO: renamed from: i */
    public Activity f3696i;

    /* JADX INFO: renamed from: j */
    public String f3697j;

    /* JADX INFO: renamed from: k */
    public Picture.ImageUri f3698k;

    /* JADX INFO: renamed from: l */
    public boolean f3699l;

    public fsa0(Activity activity, String str, int i, Picture.ImageUri imageUri, boolean z) {
        this.f3696i = activity;
        this.f3697j = str;
        this.f3698k = imageUri;
        this.f3699l = z;
        r(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m4400C() {
        if (NullChecker.a(((fdb0) this).b)) {
            ((fdb0) this).b.call();
        }
    }

    /* JADX INFO: renamed from: A */
    public int m4401A() {
        v9j v9jVar = ((aie0) this).d;
        if ((v9jVar == null || ((Boolean) v9jVar.call()).booleanValue()) && !this.f3696i.isFinishing()) {
            ksa0.m5777j(this.f3696i, this.f3697j, new d30() { // from class: l.esa0
                @Override // p003l.d30
                public final void call() {
                    this.f3371a.m4400C();
                }
            }, this.f3698k, this.f3699l);
            return 3000;
        }
        if (!NullChecker.a(((fdb0) this).b)) {
            return 0;
        }
        ((fdb0) this).b.call();
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public void m4402f(boolean z) {
        PopupWindow popupWindowM5773f = ksa0.m5773f();
        if (popupWindowM5773f == null || !popupWindowM5773f.isShowing()) {
            return;
        }
        if (z) {
            popupWindowM5773f.getContentView().setTranslationY(0.0f);
            popupWindowM5773f.getContentView().setAlpha(1.0f);
        } else {
            popupWindowM5773f.getContentView().setTranslationY(-4000.0f);
            popupWindowM5773f.getContentView().setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: j */
    public int m4403j() {
        return this.f3696i.hashCode();
    }

    /* JADX INFO: renamed from: m */
    public Act m4404m() {
        return this.f3696i;
    }

    /* JADX INFO: renamed from: n */
    public void m4405n(boolean z) {
        PopupWindow popupWindowM5773f = ksa0.m5773f();
        if (popupWindowM5773f == null || !popupWindowM5773f.isShowing()) {
            return;
        }
        popupWindowM5773f.dismiss();
    }

    /* JADX INFO: renamed from: o */
    public String m4406o() {
        return MagicBubble.PROFILE_MOMENT_SEND_MESSAGE_FLOAT.getGroup();
    }

    /* JADX INFO: renamed from: p */
    public String m4407p() {
        return MagicBubble.PROFILE_MOMENT_SEND_MESSAGE_FLOAT.getId();
    }
}
