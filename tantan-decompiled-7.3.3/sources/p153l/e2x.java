package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.weight.MarryEditProfileWeightFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.views.WheelPicker;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p151v.VFrame;

/* JADX INFO: loaded from: classes3.dex */
public class e2x extends hzw<d2x> {

    /* JADX INFO: renamed from: c */
    public TextView f91870c;

    /* JADX INFO: renamed from: d */
    public VFrame f91871d;

    /* JADX INFO: renamed from: e */
    public WheelPicker f91872e;

    /* JADX INFO: renamed from: f */
    public d2x f91873f;

    /* JADX INFO: renamed from: g */
    public int f91874g;

    /* JADX INFO: renamed from: l.e2x$a */
    public static class C16690a {
        /* JADX INFO: renamed from: b */
        public static void m119197b(e2x e2xVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            e2xVar.f91870c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            e2xVar.f91871d = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            e2xVar.f91872e = (WheelPicker) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m119198c(e2x e2xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(sec0.f167563e0, viewGroup, false);
            m119197b(e2xVar, viewInflate);
            return viewInflate;
        }
    }

    public e2x(Act act, MarryEditProfileWeightFrag marryEditProfileWeightFrag) {
        super(act, marryEditProfileWeightFrag);
        this.f91874g = -1;
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: c */
    public boolean mo95576c(MarrySeriesType marrySeriesType) {
        return !TextUtils.isEmpty(this.f91872e.getSelectItem().toString());
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: e */
    public void mo95577e(MarrySeriesType marrySeriesType, User user) {
        ArrayList arrayList = new ArrayList();
        String string = this.f91872e.getSelectItem().toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        arrayList.add(string.replace(l5x.f130198e, ""));
        user.profile.extensions.physical.weight = arrayList;
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: i */
    public void mo95578i(MarrySeriesType marrySeriesType, User user) {
        this.f91870c.setText(marrySeriesType.getTitleName());
        this.f91870c.setTypeface(lyh0.m156283c(3), 1);
        List<String> listM153025v = l5x.m153025v();
        List<String> list = user.profile.extensions.physical.weight;
        bnl0.m105525M0(this.f91871d, true);
        this.f91872e.setData(listM153025v);
        this.f91874g = 20;
        if (!jyb.m147479J(list) && !TextUtils.isEmpty(list.get(0))) {
            if (list.get(0).matches("\\d+")) {
                this.f91874g = Integer.valueOf(list.get(0)).intValue() - 30;
            } else if (TextUtils.equals(list.get(0), act().getString(R$string.f28732l2))) {
                this.f91874g = listM153025v.size() - 1;
            }
        }
        int i = this.f91874g;
        if (i < 0 || i >= listM153025v.size()) {
            this.f91874g = 0;
        }
        this.f91872e.setSelectedItemPosition(this.f91874g);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m119194m(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public View m119194m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C16690a.m119198c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(d2x d2xVar) {
        this.f91873f = d2xVar;
    }
}
