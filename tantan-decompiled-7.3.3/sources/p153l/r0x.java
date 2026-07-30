package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.core.p058ui.profile.views.WheelPicker;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class r0x extends hzw<n0x> {

    /* JADX INFO: renamed from: c */
    public VLinear f160704c;

    /* JADX INFO: renamed from: d */
    public VText f160705d;

    /* JADX INFO: renamed from: e */
    public VFrame f160706e;

    /* JADX INFO: renamed from: f */
    public WheelPicker f160707f;

    /* JADX INFO: renamed from: g */
    public WheelPicker f160708g;

    /* JADX INFO: renamed from: h */
    public n0x f160709h;

    /* JADX INFO: renamed from: l.r0x$a */
    public static /* synthetic */ class C19719a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f160710a;

        static {
            int[] iArr = new int[MarrySeriesType.values().length];
            f160710a = iArr;
            try {
                iArr[MarrySeriesType.MATE_AGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f160710a[MarrySeriesType.MATE_HEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public r0x(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: c */
    public boolean mo95576c(MarrySeriesType marrySeriesType) {
        return true;
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: e */
    public void mo95577e(MarrySeriesType marrySeriesType, User user) {
        ArrayList arrayListM147507f0 = jyb.m147507f0(l5x.m153020q(this.f160709h.f139686a), l5x.m153020q(this.f160709h.f139687b));
        if (marrySeriesType == MarrySeriesType.MATE_AGE) {
            user.profile.extensions.marriage.mateAge = arrayListM147507f0;
        } else if (marrySeriesType == MarrySeriesType.MATE_HEIGHT) {
            user.profile.extensions.marriage.mateHeight = arrayListM147507f0;
        }
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: i */
    public void mo95578i(final MarrySeriesType marrySeriesType, User user) {
        List<String> listM153019p;
        List<String> listM153019p2;
        this.f160705d.setTypeface(lyh0.m156283c(3), 1);
        this.f160705d.setText(marrySeriesType.getTitleName());
        if (marrySeriesType == MarrySeriesType.MATE_AGE) {
            listM153019p = l5x.m153017n(String.valueOf(18), false);
            listM153019p2 = l5x.m153017n(this.f160709h.f139686a, true);
        } else if (marrySeriesType == MarrySeriesType.MATE_HEIGHT) {
            listM153019p = l5x.m153019p(String.valueOf(140), true);
            listM153019p2 = l5x.m153019p(this.f160709h.f139686a, true);
        } else {
            listM153019p = null;
            listM153019p2 = null;
        }
        this.f160707f.setData(listM153019p);
        this.f160708g.setData(listM153019p2);
        this.f160707f.setSelectedItemPosition(listM153019p.indexOf(this.f160709h.f139686a));
        this.f160708g.setSelectedItemPosition(listM153019p2.indexOf(this.f160709h.f139687b));
        this.f160707f.setOnItemSelectedListener(new WheelPicker.InterfaceC8912a() { // from class: l.o0x
            @Override // com.p051p1.mobile.putong.core.p058ui.profile.views.WheelPicker.InterfaceC8912a
            /* JADX INFO: renamed from: a */
            public final void mo54246a(WheelPicker wheelPicker, Object obj, int i) {
                this.f144592a.m179278s(marrySeriesType, wheelPicker, obj, i);
            }
        });
        this.f160708g.setOnItemSelectedListener(new WheelPicker.InterfaceC8912a() { // from class: l.p0x
            @Override // com.p051p1.mobile.putong.core.p058ui.profile.views.WheelPicker.InterfaceC8912a
            /* JADX INFO: renamed from: a */
            public final void mo54246a(WheelPicker wheelPicker, Object obj, int i) {
                this.f150104a.m179279u(wheelPicker, obj, i);
            }
        });
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m179274m(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public View m179274m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return s0x.m183986b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(n0x n0xVar) {
        this.f160709h = n0xVar;
    }

    /* JADX INFO: renamed from: p */
    public final List<String> m179276p(MarrySeriesType marrySeriesType, String str, boolean z) {
        int i = C19719a.f160710a[marrySeriesType.ordinal()];
        if (i == 1) {
            return l5x.m153017n(str, z);
        }
        if (i != 2) {
            return null;
        }
        return l5x.m153019p(str, z);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Boolean m179277q(String str) {
        return Boolean.valueOf(TextUtils.equals(str, this.f160709h.f139687b));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m179278s(MarrySeriesType marrySeriesType, WheelPicker wheelPicker, Object obj, int i) {
        String str = (String) obj;
        this.f160709h.f139686a = str;
        try {
            List<String> listM179276p = m179276p(marrySeriesType, str, true);
            if (jyb.m147479J(listM179276p)) {
                return;
            }
            this.f160708g.setData(listM179276p);
            int iM147476G = Integer.parseInt(this.f160709h.f139686a) <= Integer.parseInt(this.f160709h.f139687b) ? jyb.m147476G(listM179276p, new qcj() { // from class: l.q0x
                @Override // p153l.qcj
                public final Object call(Object obj2) {
                    return this.f155119a.m179277q((String) obj2);
                }
            }) : 0;
            this.f160708g.m54243m(iM147476G, false);
            this.f160709h.f139687b = listM179276p.get(iM147476G);
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m179279u(WheelPicker wheelPicker, Object obj, int i) {
        this.f160709h.f139687b = (String) obj;
    }
}
