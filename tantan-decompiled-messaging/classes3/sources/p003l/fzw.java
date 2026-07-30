package p003l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.weight.MarryEditProfileWeightFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.core.ui.profile.views.WheelPicker;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import l.n6c0;
import l.vwb;
import l.xdl0;
import p028v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class fzw extends iww<ezw> {

    /* JADX INFO: renamed from: c */
    public TextView f3779c;

    /* JADX INFO: renamed from: d */
    public VFrame f3780d;

    /* JADX INFO: renamed from: e */
    public WheelPicker f3781e;

    /* JADX INFO: renamed from: f */
    public ezw f3782f;

    /* JADX INFO: renamed from: g */
    public int f3783g;

    /* JADX INFO: renamed from: l.fzw$a */
    public static class C0302a {
        /* JADX INFO: renamed from: b */
        public static void m4497b(fzw fzwVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            fzwVar.f3779c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            fzwVar.f3780d = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            fzwVar.f3781e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m4498c(fzw fzwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(n6c0.e0, viewGroup, false);
            m4497b(fzwVar, viewInflate);
            return viewInflate;
        }
    }

    public fzw(Act act, MarryEditProfileWeightFrag marryEditProfileWeightFrag) {
        super(act, marryEditProfileWeightFrag);
        this.f3783g = -1;
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: c */
    public boolean mo3208c(MarrySeriesType marrySeriesType) {
        return !TextUtils.isEmpty(this.f3781e.getSelectItem().toString());
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: e */
    public void mo3209e(MarrySeriesType marrySeriesType, User user) {
        ArrayList arrayList = new ArrayList();
        String string = this.f3781e.getSelectItem().toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        arrayList.add(string.replace(m2x.f5496e, ""));
        user.profile.extensions.physical.weight = arrayList;
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: i */
    public void mo3210i(MarrySeriesType marrySeriesType, User user) {
        this.f3779c.setText(marrySeriesType.getTitleName());
        this.f3779c.setTypeface(eqh0.m3924c(3), 1);
        List<String> listM6215v = m2x.m6215v();
        List list = user.profile.extensions.physical.weight;
        xdl0.M0(this.f3780d, true);
        this.f3781e.setData(listM6215v);
        this.f3783g = 20;
        if (!vwb.J(list) && !TextUtils.isEmpty((CharSequence) list.get(0))) {
            if (((String) list.get(0)).matches("\\d+")) {
                this.f3783g = Integer.valueOf((String) list.get(0)).intValue() - 30;
            } else if (TextUtils.equals((CharSequence) list.get(0), act().getString(R.string.l2))) {
                this.f3783g = listM6215v.size() - 1;
            }
        }
        int i = this.f3783g;
        if (i < 0 || i >= listM6215v.size()) {
            this.f3783g = 0;
        }
        this.f3781e.setSelectedItemPosition(this.f3783g);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m4494m(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public View m4494m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0302a.m4498c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void m4493i1(ezw ezwVar) {
        this.f3782f = ezwVar;
    }
}
