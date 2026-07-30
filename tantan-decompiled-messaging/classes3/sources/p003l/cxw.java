package p003l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.height.MarryEditProfileHeightFrag;
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
public class cxw extends iww<bxw> {

    /* JADX INFO: renamed from: c */
    public TextView f2866c;

    /* JADX INFO: renamed from: d */
    public TextView f2867d;

    /* JADX INFO: renamed from: e */
    public VFrame f2868e;

    /* JADX INFO: renamed from: f */
    public WheelPicker f2869f;

    /* JADX INFO: renamed from: g */
    public bxw f2870g;

    /* JADX INFO: renamed from: h */
    public int f2871h;

    /* JADX INFO: renamed from: l.cxw$a */
    public static class C0219a {
        /* JADX INFO: renamed from: b */
        public static void m3504b(cxw cxwVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            cxwVar.f2866c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            cxwVar.f2867d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            cxwVar.f2868e = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            cxwVar.f2869f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m3505c(cxw cxwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(n6c0.N, viewGroup, false);
            m3504b(cxwVar, viewInflate);
            return viewInflate;
        }
    }

    public cxw(Act act, MarryEditProfileHeightFrag marryEditProfileHeightFrag) {
        super(act, marryEditProfileHeightFrag);
        this.f2871h = -1;
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: c */
    public boolean mo3208c(MarrySeriesType marrySeriesType) {
        return !TextUtils.isEmpty(this.f2869f.getSelectItem().toString());
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: e */
    public void mo3209e(MarrySeriesType marrySeriesType, User user) {
        ArrayList arrayList = new ArrayList();
        String string = this.f2869f.getSelectItem().toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        arrayList.add(string.replace(m2x.f5494c, ""));
        user.profile.extensions.physical.height = arrayList;
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: i */
    public void mo3210i(MarrySeriesType marrySeriesType, User user) {
        this.f2866c.setText(marrySeriesType.getTitleName());
        this.f2866c.setTypeface(eqh0.m3924c(3), 1);
        List<String> listM6201h = m2x.m6201h();
        List list = user.profile.extensions.physical.height;
        xdl0.M0(this.f2868e, true);
        this.f2869f.setData(listM6201h);
        this.f2871h = 20;
        if (!vwb.J(list) && !TextUtils.isEmpty((CharSequence) list.get(0))) {
            if (((String) list.get(0)).matches("\\d+")) {
                this.f2871h = Integer.valueOf((String) list.get(0)).intValue() - 140;
            } else if (TextUtils.equals((CharSequence) list.get(0), act().getString(R.string.l2))) {
                this.f2871h = listM6201h.size() - 1;
            }
        }
        int i = this.f2871h;
        if (i < 0 || i >= listM6201h.size()) {
            this.f2871h = 0;
        }
        this.f2869f.setSelectedItemPosition(this.f2871h);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m3501n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m3501n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0219a.m3505c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m3500i1(bxw bxwVar) {
        this.f2870g = bxwVar;
    }
}
