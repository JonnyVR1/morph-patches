package p003l;

import android.app.Activity;
import android.widget.PopupWindow;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import l.aie0;
import l.fdb0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ybx extends aie0 {

    /* JADX INFO: renamed from: i */
    public Activity f9052i;

    /* JADX INFO: renamed from: j */
    public String f9053j;

    /* JADX INFO: renamed from: k */
    public Picture.ImageUri f9054k;

    public ybx(Activity activity, String str, int i, Picture.ImageUri imageUri) {
        this.f9052i = activity;
        this.f9053j = str;
        this.f9054k = imageUri;
        r(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m9179C() {
        if (NullChecker.a(((fdb0) this).b)) {
            ((fdb0) this).b.call();
        }
    }

    /* JADX INFO: renamed from: A */
    public int m9180A() {
        v9j v9jVar = ((aie0) this).d;
        if (v9jVar == null || ((Boolean) v9jVar.call()).booleanValue()) {
            Activity activity = this.f9052i;
            if ((activity instanceof NewMainAct) && !activity.isFinishing()) {
                ccx.m3249g(this.f9052i, this.f9053j, new d30() { // from class: l.xbx
                    @Override // p003l.d30
                    public final void call() {
                        this.f8763a.m9179C();
                    }
                }, this.f9054k);
                return 3000;
            }
        }
        if (!NullChecker.a(((fdb0) this).b)) {
            return 0;
        }
        ((fdb0) this).b.call();
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public void m9181f(boolean z) {
        PopupWindow popupWindowM3247e = ccx.m3247e();
        if (popupWindowM3247e == null || !popupWindowM3247e.isShowing()) {
            return;
        }
        if (z) {
            popupWindowM3247e.getContentView().setTranslationY(0.0f);
            popupWindowM3247e.getContentView().setAlpha(1.0f);
        } else {
            popupWindowM3247e.getContentView().setTranslationY(-4000.0f);
            popupWindowM3247e.getContentView().setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: j */
    public int m9182j() {
        return this.f9052i.hashCode();
    }

    /* JADX INFO: renamed from: m */
    public Act m9183m() {
        return this.f9052i;
    }

    /* JADX INFO: renamed from: n */
    public void m9184n(boolean z) {
        PopupWindow popupWindowM3247e = ccx.m3247e();
        if (popupWindowM3247e == null || !popupWindowM3247e.isShowing()) {
            return;
        }
        popupWindowM3247e.dismiss();
    }

    /* JADX INFO: renamed from: o */
    public String m9185o() {
        return MagicBubble.MATCH_SEND_MESSAGE_FLOAT.getGroup();
    }

    /* JADX INFO: renamed from: p */
    public String m9186p() {
        return MagicBubble.MATCH_SEND_MESSAGE_FLOAT.getId();
    }
}
