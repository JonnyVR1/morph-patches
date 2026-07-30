package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.tab.VoiceFunctionsTabView;
import p151v.VPager;
import p153l.hj2;

/* JADX INFO: loaded from: classes4.dex */
public class d0v<P extends hj2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f84613e;

    /* JADX INFO: renamed from: f */
    public DialogTitleBar f84614f;

    /* JADX INFO: renamed from: g */
    public VoiceFunctionsTabView f84615g;

    /* JADX INFO: renamed from: h */
    public VPager f84616h;

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199037c7, viewGroup, false);
        m113470u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m113470u(ViewGroup viewGroup) {
        this.f84613e = (ConstraintLayout) viewGroup;
        DialogTitleBar dialogTitleBar = (DialogTitleBar) viewGroup.getChildAt(0);
        this.f84614f = dialogTitleBar;
        String str = dialogTitleBar == null ? "_title_bar" : null;
        VoiceFunctionsTabView voiceFunctionsTabView = (VoiceFunctionsTabView) viewGroup.getChildAt(1);
        this.f84615g = voiceFunctionsTabView;
        if (voiceFunctionsTabView == null) {
            str = "_tabView";
        }
        VPager vPager = (VPager) viewGroup.getChildAt(2);
        this.f84616h = vPager;
        if (vPager == null) {
            str = "_viewPager";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: v */
    public ConstraintLayout m113471v() {
        return this.f84613e;
    }
}
