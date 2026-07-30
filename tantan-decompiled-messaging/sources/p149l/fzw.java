package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.weight.MarryEditProfileWeightFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.views.WheelPicker;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p147v.VFrame;

/* JADX INFO: loaded from: classes3.dex */
public class fzw extends iww<ezw> {

    /* JADX INFO: renamed from: c */
    public TextView f100004c;

    /* JADX INFO: renamed from: d */
    public VFrame f100005d;

    /* JADX INFO: renamed from: e */
    public WheelPicker f100006e;

    /* JADX INFO: renamed from: f */
    public ezw f100007f;

    /* JADX INFO: renamed from: g */
    public int f100008g;

    /* JADX INFO: renamed from: l.fzw$a */
    public static class C16967a {
        /* JADX INFO: renamed from: b */
        public static void m123934b(fzw fzwVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            fzwVar.f100004c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            fzwVar.f100005d = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            fzwVar.f100006e = (WheelPicker) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m123935c(fzw fzwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(n6c0.f137349e0, viewGroup, false);
            m123934b(fzwVar, viewInflate);
            return viewInflate;
        }
    }

    public fzw(Act act, MarryEditProfileWeightFrag marryEditProfileWeightFrag) {
        super(act, marryEditProfileWeightFrag);
        this.f100008g = -1;
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: c */
    public boolean mo104516c(MarrySeriesType marrySeriesType) {
        return !TextUtils.isEmpty(this.f100006e.getSelectItem().toString());
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: e */
    public void mo104517e(MarrySeriesType marrySeriesType, User user) {
        ArrayList arrayList = new ArrayList();
        String string = this.f100006e.getSelectItem().toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        arrayList.add(string.replace(m2x.f130953e, ""));
        user.profile.extensions.physical.weight = arrayList;
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: i */
    public void mo104518i(MarrySeriesType marrySeriesType, User user) {
        this.f100004c.setText(marrySeriesType.getTitleName());
        this.f100004c.setTypeface(eqh0.m117752c(3), 1);
        List<String> listM152740v = m2x.m152740v();
        List<String> list = user.profile.extensions.physical.weight;
        xdl0.m208345M0(this.f100005d, true);
        this.f100006e.setData(listM152740v);
        this.f100008g = 20;
        if (!vwb.m200296J(list) && !TextUtils.isEmpty(list.get(0))) {
            if (list.get(0).matches("\\d+")) {
                this.f100008g = Integer.valueOf(list.get(0)).intValue() - 30;
            } else if (TextUtils.equals(list.get(0), act().getString(R$string.f27884l2))) {
                this.f100008g = listM152740v.size() - 1;
            }
        }
        int i = this.f100008g;
        if (i < 0 || i >= listM152740v.size()) {
            this.f100008g = 0;
        }
        this.f100006e.setSelectedItemPosition(this.f100008g);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m123931m(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public View m123931m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C16967a.m123935c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ezw ezwVar) {
        this.f100007f = ezwVar;
    }
}
