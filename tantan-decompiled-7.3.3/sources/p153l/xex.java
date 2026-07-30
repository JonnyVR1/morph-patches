package p153l;

import android.app.Activity;
import android.widget.PopupWindow;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class xex extends fqe0 {

    /* JADX INFO: renamed from: i */
    public Activity f193986i;

    /* JADX INFO: renamed from: j */
    public String f193987j;

    /* JADX INFO: renamed from: k */
    public Picture.ImageUri f193988k;

    public xex(Activity activity, String str, int i, Picture.ImageUri imageUri) {
        this.f193986i = activity;
        this.f193987j = str;
        this.f193988k = imageUri;
        m146059r(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m210734C() {
        if (NullChecker.m82486a(this.f121543b)) {
            this.f121543b.call();
        }
    }

    @Override // p153l.fqe0
    /* JADX INFO: renamed from: A */
    public int mo22133A() {
        pcj<Boolean> pcjVar = this.f100279d;
        if (pcjVar == null || pcjVar.call().booleanValue()) {
            Activity activity = this.f193986i;
            if ((activity instanceof NewMainAct) && !activity.isFinishing()) {
                bfx.m104084g(this.f193986i, this.f193987j, new x20() { // from class: l.wex
                    @Override // p153l.x20
                    public final void call() {
                        this.f188732a.m210734C();
                    }
                }, this.f193988k);
                return 3000;
            }
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
        PopupWindow popupWindowM104082e = bfx.m104082e();
        if (popupWindowM104082e == null || !popupWindowM104082e.isShowing()) {
            return;
        }
        if (z) {
            popupWindowM104082e.getContentView().setTranslationY(0.0f);
            popupWindowM104082e.getContentView().setAlpha(1.0f);
        } else {
            popupWindowM104082e.getContentView().setTranslationY(-4000.0f);
            popupWindowM104082e.getContentView().setAlpha(0.0f);
        }
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: j */
    public int mo22137j() {
        return this.f193986i.hashCode();
    }

    @Override // p153l.f3m
    /* JADX INFO: renamed from: m */
    public Act getAct() {
        return (Act) this.f193986i;
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: n */
    public void mo21871n(boolean z) {
        PopupWindow popupWindowM104082e = bfx.m104082e();
        if (popupWindowM104082e == null || !popupWindowM104082e.isShowing()) {
            return;
        }
        popupWindowM104082e.dismiss();
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: o */
    public String mo22139o() {
        return MagicBubble.MATCH_SEND_MESSAGE_FLOAT.getGroup();
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: p */
    public String getBubbleId() {
        return MagicBubble.MATCH_SEND_MESSAGE_FLOAT.getId();
    }
}
