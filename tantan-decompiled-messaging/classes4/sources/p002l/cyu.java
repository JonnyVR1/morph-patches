package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.tab.VoiceFunctionsTabView;
import l.jfd0;
import p002l.zi2;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cyu<P extends zi2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f8989e;

    /* JADX INFO: renamed from: f */
    public DialogTitleBar f8990f;

    /* JADX INFO: renamed from: g */
    public VoiceFunctionsTabView f8991g;

    /* JADX INFO: renamed from: h */
    public VPager f8992h;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19801c7, viewGroup, false);
        m11529u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m11529u(ViewGroup viewGroup) {
        this.f8989e = (ConstraintLayout) viewGroup;
        DialogTitleBar childAt = viewGroup.getChildAt(0);
        this.f8990f = childAt;
        String str = childAt == null ? "_title_bar" : null;
        VoiceFunctionsTabView childAt2 = viewGroup.getChildAt(1);
        this.f8991g = childAt2;
        if (childAt2 == null) {
            str = "_tabView";
        }
        VPager childAt3 = viewGroup.getChildAt(2);
        this.f8992h = childAt3;
        if (childAt3 == null) {
            str = "_viewPager";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: v */
    public ConstraintLayout m11530v() {
        return this.f8989e;
    }
}
