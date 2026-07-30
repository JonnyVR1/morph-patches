package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.height.MarryEditProfileHeightFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.views.WheelPicker;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p147v.VFrame;

/* JADX INFO: loaded from: classes3.dex */
public class cxw extends iww<bxw> {

    /* JADX INFO: renamed from: c */
    public TextView f82899c;

    /* JADX INFO: renamed from: d */
    public TextView f82900d;

    /* JADX INFO: renamed from: e */
    public VFrame f82901e;

    /* JADX INFO: renamed from: f */
    public WheelPicker f82902f;

    /* JADX INFO: renamed from: g */
    public bxw f82903g;

    /* JADX INFO: renamed from: h */
    public int f82904h;

    /* JADX INFO: renamed from: l.cxw$a */
    public static class C16270a {
        /* JADX INFO: renamed from: b */
        public static void m109117b(cxw cxwVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            cxwVar.f82899c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            cxwVar.f82900d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            cxwVar.f82901e = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            cxwVar.f82902f = (WheelPicker) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m109118c(cxw cxwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(n6c0.f137311N, viewGroup, false);
            m109117b(cxwVar, viewInflate);
            return viewInflate;
        }
    }

    public cxw(Act act, MarryEditProfileHeightFrag marryEditProfileHeightFrag) {
        super(act, marryEditProfileHeightFrag);
        this.f82904h = -1;
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: c */
    public boolean mo104516c(MarrySeriesType marrySeriesType) {
        return !TextUtils.isEmpty(this.f82902f.getSelectItem().toString());
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: e */
    public void mo104517e(MarrySeriesType marrySeriesType, User user) {
        ArrayList arrayList = new ArrayList();
        String string = this.f82902f.getSelectItem().toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        arrayList.add(string.replace(m2x.f130951c, ""));
        user.profile.extensions.physical.height = arrayList;
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: i */
    public void mo104518i(MarrySeriesType marrySeriesType, User user) {
        this.f82899c.setText(marrySeriesType.getTitleName());
        this.f82899c.setTypeface(eqh0.m117752c(3), 1);
        List<String> listM152726h = m2x.m152726h();
        List<String> list = user.profile.extensions.physical.height;
        xdl0.m208345M0(this.f82901e, true);
        this.f82902f.setData(listM152726h);
        this.f82904h = 20;
        if (!vwb.m200296J(list) && !TextUtils.isEmpty(list.get(0))) {
            if (list.get(0).matches("\\d+")) {
                this.f82904h = Integer.valueOf(list.get(0)).intValue() - 140;
            } else if (TextUtils.equals(list.get(0), act().getString(R$string.f27884l2))) {
                this.f82904h = listM152726h.size() - 1;
            }
        }
        int i = this.f82904h;
        if (i < 0 || i >= listM152726h.size()) {
            this.f82904h = 0;
        }
        this.f82902f.setSelectedItemPosition(this.f82904h);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m109114n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m109114n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C16270a.m109118c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(bxw bxwVar) {
        this.f82903g = bxwVar;
    }
}
