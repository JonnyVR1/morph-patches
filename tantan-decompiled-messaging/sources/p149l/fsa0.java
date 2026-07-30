package p149l;

import android.app.Activity;
import android.widget.PopupWindow;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p046p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class fsa0 extends aie0 {

    /* JADX INFO: renamed from: i */
    public Activity f99055i;

    /* JADX INFO: renamed from: j */
    public String f99056j;

    /* JADX INFO: renamed from: k */
    public Picture.ImageUri f99057k;

    /* JADX INFO: renamed from: l */
    public boolean f99058l;

    public fsa0(Activity activity, String str, int i, Picture.ImageUri imageUri, boolean z) {
        this.f99055i = activity;
        this.f99056j = str;
        this.f99057k = imageUri;
        this.f99058l = z;
        m120964r(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m122924C() {
        if (NullChecker.m81303a(this.f97025b)) {
            this.f97025b.call();
        }
    }

    @Override // p149l.aie0
    /* JADX INFO: renamed from: A */
    public int mo21134A() {
        v9j<Boolean> v9jVar = this.f69975d;
        if ((v9jVar == null || v9jVar.call().booleanValue()) && !this.f99055i.isFinishing()) {
            ksa0.m147046j(this.f99055i, this.f99056j, new d30() { // from class: l.esa0
                @Override // p149l.d30
                public final void call() {
                    this.f92999a.m122924C();
                }
            }, this.f99057k, this.f99058l);
            return 3000;
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
        PopupWindow popupWindowM147042f = ksa0.m147042f();
        if (popupWindowM147042f == null || !popupWindowM147042f.isShowing()) {
            return;
        }
        if (z) {
            popupWindowM147042f.getContentView().setTranslationY(0.0f);
            popupWindowM147042f.getContentView().setAlpha(1.0f);
        } else {
            popupWindowM147042f.getContentView().setTranslationY(-4000.0f);
            popupWindowM147042f.getContentView().setAlpha(0.0f);
        }
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: j */
    public int mo21138j() {
        return this.f99055i.hashCode();
    }

    @Override // p149l.l0m
    /* JADX INFO: renamed from: m */
    public Act getAct() {
        return (Act) this.f99055i;
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: n */
    public void mo20872n(boolean z) {
        PopupWindow popupWindowM147042f = ksa0.m147042f();
        if (popupWindowM147042f == null || !popupWindowM147042f.isShowing()) {
            return;
        }
        popupWindowM147042f.dismiss();
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: o */
    public String mo21140o() {
        return MagicBubble.PROFILE_MOMENT_SEND_MESSAGE_FLOAT.getGroup();
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: p */
    public String getBubbleId() {
        return MagicBubble.PROFILE_MOMENT_SEND_MESSAGE_FLOAT.getId();
    }
}
