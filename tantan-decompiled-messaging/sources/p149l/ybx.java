package p149l;

import android.app.Activity;
import android.widget.PopupWindow;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class ybx extends aie0 {

    /* JADX INFO: renamed from: i */
    public Activity f197373i;

    /* JADX INFO: renamed from: j */
    public String f197374j;

    /* JADX INFO: renamed from: k */
    public Picture.ImageUri f197375k;

    public ybx(Activity activity, String str, int i, Picture.ImageUri imageUri) {
        this.f197373i = activity;
        this.f197374j = str;
        this.f197375k = imageUri;
        m120964r(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m213983C() {
        if (NullChecker.m81303a(this.f97025b)) {
            this.f97025b.call();
        }
    }

    @Override // p149l.aie0
    /* JADX INFO: renamed from: A */
    public int mo21134A() {
        v9j<Boolean> v9jVar = this.f69975d;
        if (v9jVar == null || v9jVar.call().booleanValue()) {
            Activity activity = this.f197373i;
            if ((activity instanceof NewMainAct) && !activity.isFinishing()) {
                ccx.m106210g(this.f197373i, this.f197374j, new d30() { // from class: l.xbx
                    @Override // p149l.d30
                    public final void call() {
                        this.f191971a.m213983C();
                    }
                }, this.f197375k);
                return 3000;
            }
        }
        if (!NullChecker.m81303a(this.f97025b)) {
            return 0;
        }
        this.f97025b.call();
        return 0;
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: f */
    public void mo20865f(boolean z) {
        PopupWindow popupWindowM106208e = ccx.m106208e();
        if (popupWindowM106208e == null || !popupWindowM106208e.isShowing()) {
            return;
        }
        if (z) {
            popupWindowM106208e.getContentView().setTranslationY(0.0f);
            popupWindowM106208e.getContentView().setAlpha(1.0f);
        } else {
            popupWindowM106208e.getContentView().setTranslationY(-4000.0f);
            popupWindowM106208e.getContentView().setAlpha(0.0f);
        }
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: j */
    public int mo21138j() {
        return this.f197373i.hashCode();
    }

    @Override // p149l.l0m
    /* JADX INFO: renamed from: m */
    public Act getAct() {
        return (Act) this.f197373i;
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: n */
    public void mo20872n(boolean z) {
        PopupWindow popupWindowM106208e = ccx.m106208e();
        if (popupWindowM106208e == null || !popupWindowM106208e.isShowing()) {
            return;
        }
        popupWindowM106208e.dismiss();
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: o */
    public String mo21140o() {
        return MagicBubble.MATCH_SEND_MESSAGE_FLOAT.getGroup();
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: p */
    public String getBubbleId() {
        return MagicBubble.MATCH_SEND_MESSAGE_FLOAT.getId();
    }
}
