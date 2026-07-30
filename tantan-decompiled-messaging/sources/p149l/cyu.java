package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.tab.VoiceFunctionsTabView;
import p147v.VPager;
import p149l.zi2;

/* JADX INFO: loaded from: classes4.dex */
public class cyu<P extends zi2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f83033e;

    /* JADX INFO: renamed from: f */
    public DialogTitleBar f83034f;

    /* JADX INFO: renamed from: g */
    public VoiceFunctionsTabView f83035g;

    /* JADX INFO: renamed from: h */
    public VPager f83036h;

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168305c7, viewGroup, false);
        m109389u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m109389u(ViewGroup viewGroup) {
        this.f83033e = (ConstraintLayout) viewGroup;
        DialogTitleBar dialogTitleBar = (DialogTitleBar) viewGroup.getChildAt(0);
        this.f83034f = dialogTitleBar;
        String str = dialogTitleBar == null ? "_title_bar" : null;
        VoiceFunctionsTabView voiceFunctionsTabView = (VoiceFunctionsTabView) viewGroup.getChildAt(1);
        this.f83035g = voiceFunctionsTabView;
        if (voiceFunctionsTabView == null) {
            str = "_tabView";
        }
        VPager vPager = (VPager) viewGroup.getChildAt(2);
        this.f83036h = vPager;
        if (vPager == null) {
            str = "_viewPager";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: v */
    public ConstraintLayout m109390v() {
        return this.f83033e;
    }
}
