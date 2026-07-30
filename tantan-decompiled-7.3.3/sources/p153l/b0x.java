package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.height.MarryEditProfileHeightFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.views.WheelPicker;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p151v.VFrame;

/* JADX INFO: loaded from: classes3.dex */
public class b0x extends hzw<a0x> {

    /* JADX INFO: renamed from: c */
    public TextView f74297c;

    /* JADX INFO: renamed from: d */
    public TextView f74298d;

    /* JADX INFO: renamed from: e */
    public VFrame f74299e;

    /* JADX INFO: renamed from: f */
    public WheelPicker f74300f;

    /* JADX INFO: renamed from: g */
    public a0x f74301g;

    /* JADX INFO: renamed from: h */
    public int f74302h;

    /* JADX INFO: renamed from: l.b0x$a */
    public static class C15884a {
        /* JADX INFO: renamed from: b */
        public static void m101375b(b0x b0xVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            b0xVar.f74297c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            b0xVar.f74298d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            b0xVar.f74299e = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            b0xVar.f74300f = (WheelPicker) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m101376c(b0x b0xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(sec0.f167525N, viewGroup, false);
            m101375b(b0xVar, viewInflate);
            return viewInflate;
        }
    }

    public b0x(Act act, MarryEditProfileHeightFrag marryEditProfileHeightFrag) {
        super(act, marryEditProfileHeightFrag);
        this.f74302h = -1;
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: c */
    public boolean mo95576c(MarrySeriesType marrySeriesType) {
        return !TextUtils.isEmpty(this.f74300f.getSelectItem().toString());
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: e */
    public void mo95577e(MarrySeriesType marrySeriesType, User user) {
        ArrayList arrayList = new ArrayList();
        String string = this.f74300f.getSelectItem().toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        arrayList.add(string.replace(l5x.f130196c, ""));
        user.profile.extensions.physical.height = arrayList;
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: i */
    public void mo95578i(MarrySeriesType marrySeriesType, User user) {
        this.f74297c.setText(marrySeriesType.getTitleName());
        this.f74297c.setTypeface(lyh0.m156283c(3), 1);
        List<String> listM153011h = l5x.m153011h();
        List<String> list = user.profile.extensions.physical.height;
        bnl0.m105525M0(this.f74299e, true);
        this.f74300f.setData(listM153011h);
        this.f74302h = 20;
        if (!jyb.m147479J(list) && !TextUtils.isEmpty(list.get(0))) {
            if (list.get(0).matches("\\d+")) {
                this.f74302h = Integer.valueOf(list.get(0)).intValue() - 140;
            } else if (TextUtils.equals(list.get(0), act().getString(R$string.f28732l2))) {
                this.f74302h = listM153011h.size() - 1;
            }
        }
        int i = this.f74302h;
        if (i < 0 || i >= listM153011h.size()) {
            this.f74302h = 0;
        }
        this.f74300f.setSelectedItemPosition(this.f74302h);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m101372n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m101372n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C15884a.m101376c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(a0x a0xVar) {
        this.f74301g = a0xVar;
    }
}
