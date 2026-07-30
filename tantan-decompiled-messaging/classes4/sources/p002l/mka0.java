package p002l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.ProfileInfoLoopEditAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.height.ProfileLoopSelectHeightFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopActionLayout;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopEditUploadPhoto;
import com.p000p1.mobile.putong.core.p001ui.profile.views.WheelPicker;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.lqa;
import l.n6c0;
import l.pj90;
import l.s7m;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mka0 implements s7m<jka0> {

    /* JADX INFO: renamed from: a */
    public TextView f15422a;

    /* JADX INFO: renamed from: b */
    public TextView f15423b;

    /* JADX INFO: renamed from: c */
    public VFrame f15424c;

    /* JADX INFO: renamed from: d */
    public WheelPicker f15425d;

    /* JADX INFO: renamed from: e */
    public ProfileLoopEditUploadPhoto f15426e;

    /* JADX INFO: renamed from: f */
    public ProfileLoopActionLayout f15427f;

    /* JADX INFO: renamed from: g */
    public final Context f15428g;

    /* JADX INFO: renamed from: h */
    public final ProfileLoopSelectHeightFrag f15429h;

    /* JADX INFO: renamed from: i */
    public jka0 f15430i;

    /* JADX INFO: renamed from: j */
    public int f15431j = -1;

    /* JADX INFO: renamed from: l.mka0$a */
    public static class C0678a {
        /* JADX INFO: renamed from: b */
        public static void m17996b(mka0 mka0Var, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            mka0Var.f15422a = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            mka0Var.f15423b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            mka0Var.f15424c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            mka0Var.f15425d = (WheelPicker) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
            mka0Var.f15426e = (ProfileLoopEditUploadPhoto) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
            mka0Var.f15427f = (ProfileLoopActionLayout) viewGroup.getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m17997c(mka0 mka0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(n6c0.w0, viewGroup, false);
            m17996b(mka0Var, viewInflate);
            return viewInflate;
        }
    }

    public mka0(Context context, ProfileLoopSelectHeightFrag profileLoopSelectHeightFrag) {
        this.f15428g = context;
        this.f15429h = profileLoopSelectHeightFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m17982q(WheelPicker wheelPicker, Object obj, int i) {
        if (obj instanceof String) {
            m17991s((String) obj);
        }
    }

    /* JADX INFO: renamed from: A3 */
    public void m17983A3(String str) {
        if (NullChecker.a(str)) {
            this.f15422a.setText(str);
            this.f15422a.setTypeface(Typeface.DEFAULT_BOLD);
        }
        this.f15425d.setOnItemSelectedListener(new WheelPicker.InterfaceC0174a() { // from class: l.kka0
            @Override // com.p000p1.mobile.putong.core.p001ui.profile.views.WheelPicker.InterfaceC0174a
            /* JADX INFO: renamed from: a */
            public final void mo3621a(WheelPicker wheelPicker, Object obj, int i) {
                this.f14364a.m17982q(wheelPicker, obj, i);
            }
        });
        this.f15427f.m3527l(this.f15429h);
        m17990p().m1991a2().m2030W0(this.f15429h);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m17984C0() {
        return this.f15428g;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m17986k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m17986k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0678a.m17997c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m17985i1(jka0 jka0Var) {
        this.f15430i = jka0Var;
    }

    /* JADX INFO: renamed from: m */
    public void m17988m(User user) {
        ArrayList arrayList = new ArrayList();
        String string = this.f15425d.getSelectItem().toString();
        if (!TextUtils.isEmpty(string)) {
            arrayList.add(string.replace("cm", ""));
            user.profile.extensions.physical.height = arrayList;
        }
        this.f15426e.m3576W(user);
    }

    /* JADX INFO: renamed from: n */
    public Bundle m17989n() {
        return this.f15429h.getArguments();
    }

    /* JADX INFO: renamed from: p */
    public ProfileInfoLoopEditAct m17990p() {
        return (ProfileInfoLoopEditAct) this.f15428g;
    }

    /* JADX INFO: renamed from: s */
    public final void m17991s(String str) {
        this.f15426e.setVisible(!TextUtils.equals(str, this.f15428g.getString(R.string.l2)));
    }

    /* JADX INFO: renamed from: u */
    public void m17992u(List<Media> list, int i) {
        this.f15426e.m3580a0(list);
    }

    /* JADX INFO: renamed from: v */
    public void m17993v(LoopInputType loopInputType) {
        List listZg = CoreModule.o.d().Zg();
        List list = m17990p().m1991a2().m2043u0().profile.extensions.physical.height;
        xdl0.M0(this.f15424c, true);
        if (lqa.f() && this.f15429h.m2081U4() && !vwb.J(listZg)) {
            vwb.e0(listZg, new w9j() { // from class: l.lka0
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) obj).equals(CoreModule.b.getString(R.string.l2)));
                }
            });
        }
        this.f15425d.setData(listZg);
        this.f15431j = 20;
        if (!vwb.J(list) && !TextUtils.isEmpty((CharSequence) list.get(0))) {
            if (((String) list.get(0)).matches("\\d+")) {
                this.f15431j = Integer.valueOf((String) list.get(0)).intValue() - 140;
            } else if (TextUtils.equals((CharSequence) list.get(0), this.f15428g.getString(R.string.l2))) {
                this.f15431j = listZg.size() - 1;
            }
        }
        int i = this.f15431j;
        if (i < 0 || i >= listZg.size()) {
            this.f15431j = 0;
        }
        this.f15425d.setSelectedItemPosition(this.f15431j);
        m17994w(loopInputType, this.f15431j);
        if (lqa.f() && this.f15429h.m2081U4()) {
            String strM = pj90.m(this.f15429h.f1277z);
            xdl0.X(this.f15422a, 0);
            if (!TextUtils.isEmpty(strM)) {
                xdl0.M(this.f15423b, true);
                xdl0.X(this.f15423b, t100.d(12.0f));
                xdl0.X(this.f15424c, t100.d(27.0f));
                this.f15423b.setTextSize(15.0f);
                this.f15423b.setTextColor(Color.parseColor("#a9a9a9"));
                this.f15423b.setText(String.format("预计符合%s人的理想型", strM));
            }
        }
        this.f15429h.m2093f5();
    }

    /* JADX INFO: renamed from: w */
    public final void m17994w(LoopInputType loopInputType, int i) {
        this.f15426e.setVisible(i != CoreModule.o.d().Zg().size() - 1);
    }

    public void destroy() {
    }
}
